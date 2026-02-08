package com.exitgames.photon.audioinaec;

import android.content.Intent;
import java.util.Collections;
import java.util.Collection;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.HashSet;
import android.content.BroadcastReceiver;
import android.media.AudioManager;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.util.Set;
import android.content.Context;

public class AppRTCAudioManager
{
    private static final String SPEAKERPHONE_AUTO = "auto";
    private static final String SPEAKERPHONE_FALSE = "false";
    private static final String SPEAKERPHONE_TRUE = "true";
    private static final String TAG = "[PV] [AI] AppRTCAudioManager";
    private AudioManagerState amState;
    private final Context apprtcContext;
    private Set<AudioDevice> audioDevices;
    private AudioManager$OnAudioFocusChangeListener audioFocusChangeListener;
    private AudioManager audioManager;
    private AudioManagerEvents audioManagerEvents;
    private final AppRTCBluetoothManager bluetoothManager;
    private AudioDevice defaultAudioDevice;
    private boolean hasWiredHeadset;
    private AppRTCProximitySensor proximitySensor;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private AudioDevice selectedAudioDevice;
    private final String useSpeakerphone;
    private AudioDevice userSelectedAudioDevice;
    private BroadcastReceiver wiredHeadsetReceiver;
    
    private AppRTCAudioManager(final Context apprtcContext) {
        this.savedAudioMode = -2;
        this.audioDevices = (Set<AudioDevice>)new HashSet();
        Log.d("[PV] [AI] AppRTCAudioManager", "ctor");
        ThreadUtils.checkIsOnMainThread();
        this.apprtcContext = apprtcContext;
        this.audioManager = (AudioManager)apprtcContext.getSystemService("audio");
        this.bluetoothManager = AppRTCBluetoothManager.create(apprtcContext, this);
        this.wiredHeadsetReceiver = new WiredHeadsetReceiver();
        this.amState = AudioManagerState.UNINITIALIZED;
        PreferenceManager.getDefaultSharedPreferences(apprtcContext);
        this.useSpeakerphone = "auto";
        Log.d("[PV] [AI] AppRTCAudioManager", "useSpeakerphone: " + "auto");
        if ("auto".equals((Object)"false")) {
            this.defaultAudioDevice = AudioDevice.EARPIECE;
        }
        else {
            this.defaultAudioDevice = AudioDevice.SPEAKER_PHONE;
        }
        this.proximitySensor = AppRTCProximitySensor.create(apprtcContext, (Runnable)new Runnable(this) {
            final AppRTCAudioManager this$0;
            
            public void run() {
                this.this$0.onProximitySensorChangedState();
            }
        });
        Log.d("[PV] [AI] AppRTCAudioManager", "defaultAudioDevice: " + (Object)this.defaultAudioDevice);
        AppRTCUtils.logDeviceInfo("[PV] [AI] AppRTCAudioManager");
    }
    
    static AppRTCAudioManager create(final Context context) {
        return new AppRTCAudioManager(context);
    }
    
    private boolean hasEarpiece() {
        return this.apprtcContext.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
    
    @Deprecated
    private boolean hasWiredHeadset() {
        final AudioDeviceInfo[] devices = this.audioManager.getDevices(3);
        for (int length = devices.length, i = 0; i < length; ++i) {
            final int type = devices[i].getType();
            if (type == 3) {
                Log.d("[PV] [AI] AppRTCAudioManager", "hasWiredHeadset: found wired headset");
                return true;
            }
            if (type == 11) {
                Log.d("[PV] [AI] AppRTCAudioManager", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }
    
    private void onProximitySensorChangedState() {
        if (!this.useSpeakerphone.equals((Object)"auto")) {
            return;
        }
        if (this.audioDevices.size() == 2 && this.audioDevices.contains((Object)AudioDevice.EARPIECE) && this.audioDevices.contains((Object)AudioDevice.SPEAKER_PHONE)) {
            if (this.proximitySensor.sensorReportsNearState()) {
                this.setAudioDeviceInternal(AudioDevice.EARPIECE);
            }
            else {
                this.setAudioDeviceInternal(AudioDevice.SPEAKER_PHONE);
            }
        }
    }
    
    private void registerReceiver(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        this.apprtcContext.registerReceiver(broadcastReceiver, intentFilter);
    }
    
    private void setAudioDeviceInternal(final AudioDevice selectedAudioDevice) {
        Log.d("[PV] [AI] AppRTCAudioManager", "setAudioDeviceInternal(device=" + (Object)selectedAudioDevice + ")");
        AppRTCUtils.assertIsTrue(this.audioDevices.contains((Object)selectedAudioDevice));
        final int n = AppRTCAudioManager$3.$SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[selectedAudioDevice.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        Log.e("[PV] [AI] AppRTCAudioManager", "Invalid audio device selection");
                    }
                    else {
                        this.audioManager.setMode(3);
                        this.setSpeakerphoneOn(false);
                    }
                }
                else {
                    this.audioManager.setMode(0);
                    this.setSpeakerphoneOn(false);
                }
            }
            else {
                this.audioManager.setMode(3);
                this.setSpeakerphoneOn(false);
            }
        }
        else {
            this.audioManager.setMode(3);
            this.setSpeakerphoneOn(true);
        }
        this.selectedAudioDevice = selectedAudioDevice;
    }
    
    private void setMicrophoneMute(final boolean microphoneMute) {
        if (this.audioManager.isMicrophoneMute() == microphoneMute) {
            return;
        }
        this.audioManager.setMicrophoneMute(microphoneMute);
    }
    
    private void setSpeakerphoneOn(final boolean speakerphoneOn) {
        if (this.audioManager.isSpeakerphoneOn() == speakerphoneOn) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(speakerphoneOn);
    }
    
    private void unregisterReceiver(final BroadcastReceiver broadcastReceiver) {
        this.apprtcContext.unregisterReceiver(broadcastReceiver);
    }
    
    public Set<AudioDevice> getAudioDevices() {
        ThreadUtils.checkIsOnMainThread();
        return (Set<AudioDevice>)Collections.unmodifiableSet((Set)new HashSet((Collection)this.audioDevices));
    }
    
    public AudioDevice getSelectedAudioDevice() {
        ThreadUtils.checkIsOnMainThread();
        return this.selectedAudioDevice;
    }
    
    public void selectAudioDevice(final AudioDevice userSelectedAudioDevice) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.audioDevices.contains((Object)userSelectedAudioDevice)) {
            Log.e("[PV] [AI] AppRTCAudioManager", "Can not select " + (Object)userSelectedAudioDevice + " from available " + (Object)this.audioDevices);
        }
        this.userSelectedAudioDevice = userSelectedAudioDevice;
        this.updateAudioDeviceState();
    }
    
    public void setDefaultAudioDevice(final AudioDevice audioDevice) {
        ThreadUtils.checkIsOnMainThread();
        final int n = AppRTCAudioManager$3.$SwitchMap$com$exitgames$photon$audioinaec$AppRTCAudioManager$AudioDevice[audioDevice.ordinal()];
        if (n != 1) {
            if (n != 2) {
                Log.e("[PV] [AI] AppRTCAudioManager", "Invalid default audio device selection");
            }
            else if (this.hasEarpiece()) {
                this.defaultAudioDevice = audioDevice;
            }
            else {
                this.defaultAudioDevice = AudioDevice.SPEAKER_PHONE;
            }
        }
        else {
            this.defaultAudioDevice = audioDevice;
        }
        Log.d("[PV] [AI] AppRTCAudioManager", "setDefaultAudioDevice(device=" + (Object)this.defaultAudioDevice + ")");
        this.updateAudioDeviceState();
    }
    
    public void start(final AudioManagerEvents audioManagerEvents) {
        Log.d("[PV] [AI] AppRTCAudioManager", "start");
        ThreadUtils.checkIsOnMainThread();
        if (this.amState == AudioManagerState.RUNNING) {
            Log.e("[PV] [AI] AppRTCAudioManager", "AudioManager is already active");
            return;
        }
        Log.d("[PV] [AI] AppRTCAudioManager", "AudioManager starts...");
        this.audioManagerEvents = audioManagerEvents;
        this.amState = AudioManagerState.RUNNING;
        this.savedAudioMode = this.audioManager.getMode();
        this.savedIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
        this.hasWiredHeadset = this.hasWiredHeadset();
        final AudioManager$OnAudioFocusChangeListener audioFocusChangeListener = (AudioManager$OnAudioFocusChangeListener)new AudioManager$OnAudioFocusChangeListener(this) {
            final AppRTCAudioManager this$0;
            
            public void onAudioFocusChange(final int n) {
                String s;
                if (n != -3) {
                    if (n != -2) {
                        if (n != -1) {
                            if (n != 1) {
                                if (n != 2) {
                                    if (n != 3) {
                                        if (n != 4) {
                                            s = "AUDIOFOCUS_INVALID";
                                        }
                                        else {
                                            s = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
                                        }
                                    }
                                    else {
                                        s = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
                                    }
                                }
                                else {
                                    s = "AUDIOFOCUS_GAIN_TRANSIENT";
                                }
                            }
                            else {
                                s = "AUDIOFOCUS_GAIN";
                            }
                        }
                        else {
                            s = "AUDIOFOCUS_LOSS";
                        }
                    }
                    else {
                        s = "AUDIOFOCUS_LOSS_TRANSIENT";
                    }
                }
                else {
                    s = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
                }
                Log.d("[PV] [AI] AppRTCAudioManager", "onAudioFocusChange: ".concat(s));
            }
        };
        this.audioFocusChangeListener = (AudioManager$OnAudioFocusChangeListener)audioFocusChangeListener;
        if (this.audioManager.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)audioFocusChangeListener, 0, 2) == 1) {
            Log.d("[PV] [AI] AppRTCAudioManager", "Audio focus request granted for VOICE_CALL streams");
        }
        else {
            Log.e("[PV] [AI] AppRTCAudioManager", "Audio focus request failed");
        }
        this.setMicrophoneMute(false);
        this.userSelectedAudioDevice = AudioDevice.NONE;
        this.selectedAudioDevice = AudioDevice.NONE;
        this.audioDevices.clear();
        this.bluetoothManager.start();
        this.updateAudioDeviceState();
        this.registerReceiver(this.wiredHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        Log.d("[PV] [AI] AppRTCAudioManager", "AudioManager started");
    }
    
    public void stop() {
        Log.d("[PV] [AI] AppRTCAudioManager", "stop");
        ThreadUtils.checkIsOnMainThread();
        if (this.amState != AudioManagerState.RUNNING) {
            Log.e("[PV] [AI] AppRTCAudioManager", "Trying to stop AudioManager in incorrect state: " + (Object)this.amState);
            return;
        }
        this.amState = AudioManagerState.UNINITIALIZED;
        this.unregisterReceiver(this.wiredHeadsetReceiver);
        this.bluetoothManager.stop();
        this.setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
        this.setMicrophoneMute(this.savedIsMicrophoneMute);
        this.audioManager.setMode(this.savedAudioMode);
        this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
        this.audioFocusChangeListener = null;
        Log.d("[PV] [AI] AppRTCAudioManager", "Abandoned audio focus for VOICE_CALL streams");
        final AppRTCProximitySensor proximitySensor = this.proximitySensor;
        if (proximitySensor != null) {
            proximitySensor.stop();
            this.proximitySensor = null;
        }
        this.audioManagerEvents = null;
        Log.d("[PV] [AI] AppRTCAudioManager", "AudioManager stopped");
    }
    
    public void updateAudioDeviceState() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCAudioManager", "--- updateAudioDeviceState: wired headset=" + this.hasWiredHeadset + ", BT state=" + (Object)this.bluetoothManager.getState());
        Log.d("[PV] [AI] AppRTCAudioManager", "Device status: available=" + (Object)this.audioDevices + ", selected=" + (Object)this.selectedAudioDevice + ", user selected=" + (Object)this.userSelectedAudioDevice);
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_UNAVAILABLE || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_DISCONNECTING) {
            this.bluetoothManager.updateDevice();
        }
        final HashSet set = new HashSet();
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTING || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE) {
            ((Set)set).add((Object)AudioDevice.BLUETOOTH);
        }
        if (this.hasWiredHeadset) {
            ((Set)set).add((Object)AudioDevice.WIRED_HEADSET);
        }
        else {
            ((Set)set).add((Object)AudioDevice.SPEAKER_PHONE);
            if (this.hasEarpiece()) {
                ((Set)set).add((Object)AudioDevice.EARPIECE);
            }
        }
        final boolean equals = this.audioDevices.equals(set);
        boolean b = true;
        this.audioDevices = (Set<AudioDevice>)set;
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_UNAVAILABLE && this.userSelectedAudioDevice == AudioDevice.BLUETOOTH) {
            this.userSelectedAudioDevice = AudioDevice.NONE;
        }
        if (this.hasWiredHeadset && this.userSelectedAudioDevice == AudioDevice.SPEAKER_PHONE) {
            this.userSelectedAudioDevice = AudioDevice.WIRED_HEADSET;
        }
        if (!this.hasWiredHeadset && this.userSelectedAudioDevice == AudioDevice.WIRED_HEADSET) {
            this.userSelectedAudioDevice = AudioDevice.SPEAKER_PHONE;
        }
        final AppRTCBluetoothManager.State state = this.bluetoothManager.getState();
        final AppRTCBluetoothManager.State headset_AVAILABLE = AppRTCBluetoothManager.State.HEADSET_AVAILABLE;
        final boolean b2 = false;
        final boolean b3 = state == headset_AVAILABLE && (this.userSelectedAudioDevice == AudioDevice.NONE || this.userSelectedAudioDevice == AudioDevice.BLUETOOTH);
        boolean b4 = false;
        Label_0457: {
            if (this.bluetoothManager.getState() != AppRTCBluetoothManager.State.SCO_CONNECTED) {
                b4 = b2;
                if (this.bluetoothManager.getState() != AppRTCBluetoothManager.State.SCO_CONNECTING) {
                    break Label_0457;
                }
            }
            b4 = b2;
            if (this.userSelectedAudioDevice != AudioDevice.NONE) {
                b4 = b2;
                if (this.userSelectedAudioDevice != AudioDevice.BLUETOOTH) {
                    b4 = true;
                }
            }
        }
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.HEADSET_AVAILABLE || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTING || this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED) {
            Log.d("[PV] [AI] AppRTCAudioManager", "Need BT audio: start=" + b3 + ", stop=" + b4 + ", BT state=" + (Object)this.bluetoothManager.getState());
        }
        if (b4) {
            this.bluetoothManager.stopScoAudio();
            this.bluetoothManager.updateDevice();
        }
        if (b3 && !b4 && !this.bluetoothManager.startScoAudio()) {
            this.audioDevices.remove((Object)AudioDevice.BLUETOOTH);
        }
        else {
            b = (equals ^ true);
        }
        AudioDevice audioDeviceInternal;
        if (this.bluetoothManager.getState() == AppRTCBluetoothManager.State.SCO_CONNECTED) {
            audioDeviceInternal = AudioDevice.BLUETOOTH;
        }
        else if (this.hasWiredHeadset) {
            audioDeviceInternal = AudioDevice.WIRED_HEADSET;
        }
        else {
            audioDeviceInternal = this.defaultAudioDevice;
        }
        if (audioDeviceInternal != this.selectedAudioDevice || b) {
            this.setAudioDeviceInternal(audioDeviceInternal);
            Log.d("[PV] [AI] AppRTCAudioManager", "New device status: available=" + (Object)this.audioDevices + ", selected=" + (Object)audioDeviceInternal);
            final AudioManagerEvents audioManagerEvents = this.audioManagerEvents;
            if (audioManagerEvents != null) {
                audioManagerEvents.onAudioDeviceChanged(this.selectedAudioDevice, this.audioDevices);
            }
        }
        Log.d("[PV] [AI] AppRTCAudioManager", "--- updateAudioDeviceState done");
    }
    
    public enum AudioDevice
    {
        private static final AudioDevice[] $VALUES;
        
        BLUETOOTH, 
        EARPIECE, 
        NONE, 
        SPEAKER_PHONE, 
        WIRED_HEADSET;
    }
    
    public interface AudioManagerEvents
    {
        void onAudioDeviceChanged(final AudioDevice p0, final Set<AudioDevice> p1);
    }
    
    public enum AudioManagerState
    {
        private static final AudioManagerState[] $VALUES;
        
        PREINITIALIZED, 
        RUNNING, 
        UNINITIALIZED;
    }
    
    private class WiredHeadsetReceiver extends BroadcastReceiver
    {
        private static final int HAS_MIC = 1;
        private static final int HAS_NO_MIC = 0;
        private static final int STATE_PLUGGED = 1;
        private static final int STATE_UNPLUGGED = 0;
        final AppRTCAudioManager this$0;
        
        private WiredHeadsetReceiver(final AppRTCAudioManager this$0) {
            this.this$0 = this$0;
        }
        
        public void onReceive(final Context context, final Intent intent) {
            boolean b = false;
            final int intExtra = intent.getIntExtra("state", 0);
            final int intExtra2 = intent.getIntExtra("microphone", 0);
            final String stringExtra = intent.getStringExtra("name");
            final StringBuilder append = new StringBuilder("WiredHeadsetReceiver.onReceive").append(AppRTCUtils.getThreadInfo()).append(": a=").append(intent.getAction()).append(", s=");
            String s;
            if (intExtra == 0) {
                s = "unplugged";
            }
            else {
                s = "plugged";
            }
            final StringBuilder append2 = append.append(s).append(", m=");
            String s2;
            if (intExtra2 == 1) {
                s2 = "mic";
            }
            else {
                s2 = "no mic";
            }
            Log.d("[PV] [AI] AppRTCAudioManager", append2.append(s2).append(", n=").append(stringExtra).append(", sb=").append(this.isInitialStickyBroadcast()).toString());
            final AppRTCAudioManager this$0 = this.this$0;
            if (intExtra == 1) {
                b = true;
            }
            this$0.hasWiredHeadset = b;
            this.this$0.updateAudioDeviceState();
        }
    }
}
