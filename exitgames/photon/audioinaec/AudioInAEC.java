package com.exitgames.photon.audioinaec;

import java.util.TimerTask;
import java.util.Timer;
import android.content.Intent;
import android.content.Context;
import android.os.Process;
import android.media.AudioRecord$Builder;
import android.media.AudioFormat$Builder;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.List;
import android.media.AudioDeviceInfo;
import android.util.Log;
import java.util.Set;
import android.media.audiofx.NoiseSuppressor;
import android.media.AudioRecord;
import android.media.AudioManager;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.AcousticEchoCanceler;
import android.app.Activity;

public class AudioInAEC
{
    public static final int format = 2;
    private final String TAG;
    private Activity activity;
    private AcousticEchoCanceler aec;
    private AutomaticGainControl agc;
    private AppRTCAudioManager appRTCAudioManager;
    private AudioChangeReceiver audioChangeReceiver;
    private int[] audioDvicePriority;
    private AudioManager audioManager;
    private AudioRecord audioRecord;
    volatile short[] buf;
    private volatile boolean exit;
    private NoiseSuppressor ns;
    
    public AudioInAEC() {
        this.TAG = "[PV] [AI]";
        this.audioDvicePriority = new int[] { 0, 14, 16, 17, 18, 20, 21, 25, 19, 5, 6, 9, 10, 1, 15, 24, 2, 13, 3, 4, 11, 12, 22, 23, 7, 8, 26, 27 };
    }
    
    private void onAudioManagerDevicesChanged(final AppRTCAudioManager.AudioDevice audioDevice, final Set<AppRTCAudioManager.AudioDevice> set) {
        Log.d("[PV] [AI]", "onAudioManagerDevicesChanged: " + (Object)set + ", selected: " + (Object)audioDevice);
    }
    
    private void updateAudioDevice() {
        final List availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        Log.i("[PV] [AI]", "updateAudioDevice: devices:");
        final Iterator iterator = availableCommunicationDevices.iterator();
        AudioDeviceInfo communicationDevice = null;
        int n = -1;
        while (iterator.hasNext()) {
            final AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo)iterator.next();
            Log.i("[PV] [AI]", "updateAudioDevice:     " + (Object)audioDeviceInfo.getProductName() + ", addr: " + audioDeviceInfo.getAddress() + ", type: " + audioDeviceInfo.getType());
            for (int i = 0; i < this.audioDvicePriority.length; ++i) {
                if (audioDeviceInfo.getType() == this.audioDvicePriority[i] && n < i) {
                    communicationDevice = audioDeviceInfo;
                    n = i;
                    break;
                }
            }
        }
        if (communicationDevice != null) {
            Log.i("[PV] [AI]", "updateAudioDevice: setting audio device to " + (Object)communicationDevice.getProductName() + ", addr: " + communicationDevice.getAddress() + ", type: " + communicationDevice.getType());
            try {
                this.audioManager.setCommunicationDevice(communicationDevice);
            }
            catch (final IllegalArgumentException ex) {
                Log.e("[PV] [AI]", "updateAudioDevice: invalid device: " + (Object)ex);
            }
        }
    }
    
    public boolean AECIsAvailable() {
        return AcousticEchoCanceler.isAvailable();
    }
    
    public boolean AGCIsAvailable() {
        return AutomaticGainControl.isAvailable();
    }
    
    public int GetMinBufferSize(final int n, int n2) {
        if (n2 == 1) {
            n2 = 16;
        }
        else {
            n2 = 12;
        }
        return AudioRecord.getMinBufferSize(n, n2, 2);
    }
    
    public int GetSampleRate() {
        return this.audioRecord.getSampleRate();
    }
    
    public boolean NSIsAvailable() {
        return NoiseSuppressor.isAvailable();
    }
    
    public void Reset() {
    }
    
    public boolean SetBuffer(final short[] buf) {
        synchronized (this) {
            Log.i("[PV] [AI]", "AudioRecord buffer set, size: " + buf.length);
            this.buf = buf;
            return true;
        }
    }
    
    public boolean Start(final Activity activity, final DataCallback dataCallback, int sampleRate, final int n, final int bufferSizeInBytes, final boolean enabled, final boolean enabled2, final boolean enabled3) {
        this.activity = activity;
        this.audioManager = (AudioManager)activity.getSystemService("audio");
        if (Build$VERSION.SDK_INT >= 31) {
            Log.d("[PV] [AI]", "Start: SDK >= 31, using BroadcastReceiver");
            this.audioChangeReceiver = new AudioChangeReceiver();
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            activity.getApplicationContext().registerReceiver((BroadcastReceiver)this.audioChangeReceiver, intentFilter);
            this.audioManager.setMode(3);
            this.updateAudioDevice();
        }
        else {
            Log.d("[PV] [AI]", "Start: SDK < 31, using AudioManager");
            this.appRTCAudioManager = AppRTCAudioManager.create(activity.getApplicationContext());
            Log.d("[PV] [AI]", "Starting the audio manager...");
            this.appRTCAudioManager.start((AppRTCAudioManager.AudioManagerEvents)new AppRTCAudioManager.AudioManagerEvents(this) {
                final AudioInAEC this$0;
                
                @Override
                public void onAudioDeviceChanged(final AudioDevice audioDevice, final Set<AudioDevice> set) {
                    this.this$0.onAudioManagerDevicesChanged(audioDevice, set);
                }
            });
        }
        int channelMask;
        if (n == 1) {
            channelMask = 16;
        }
        else {
            channelMask = 12;
        }
        final AudioFormat$Builder setChannelMask = new AudioFormat$Builder().setEncoding(2).setChannelMask(channelMask);
        if (sampleRate != 0) {
            setChannelMask.setSampleRate(sampleRate);
        }
        this.audioRecord = new AudioRecord$Builder().setAudioSource(7).setAudioFormat(setChannelMask.build()).setBufferSizeInBytes(bufferSizeInBytes).build();
        Log.i("[PV] [AI]", "AudioRecord created: " + (Object)this.audioRecord + ": samplingRate: " + this.audioRecord.getSampleRate() + "/" + sampleRate + ", channels: " + n + ", recordBufSizeBytes: " + bufferSizeInBytes + ", enableAEC: " + enabled + "/" + AcousticEchoCanceler.isAvailable() + ", enableAGC: " + enabled2 + "/" + AutomaticGainControl.isAvailable() + ", enableNS: " + enabled3 + "/" + NoiseSuppressor.isAvailable());
        if (AcousticEchoCanceler.isAvailable()) {
            if (enabled) {
                final AcousticEchoCanceler create = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
                this.aec = create;
                final boolean enabled4 = create.getEnabled();
                sampleRate = this.aec.setEnabled(enabled);
                Log.i("[PV] [AI]", "AcousticEchoCanceler created: " + (Object)this.aec + ", setEnabled res: " + sampleRate + ": " + enabled4 + " -> " + this.aec.getEnabled());
            }
            else {
                Log.i("[PV] [AI]", "AcousticEchoCanceler is available but not created");
            }
        }
        else {
            Log.i("[PV] [AI]", "AcousticEchoCanceler is not available");
        }
        if (AutomaticGainControl.isAvailable()) {
            if (enabled2) {
                final AutomaticGainControl create2 = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
                this.agc = create2;
                final boolean enabled5 = create2.getEnabled();
                sampleRate = this.agc.setEnabled(enabled2);
                Log.i("[PV] [AI]", "AutomaticGainControl created: " + (Object)this.agc + ", setEnabled res: " + sampleRate + ": " + enabled5 + " -> " + this.agc.getEnabled());
            }
            else {
                Log.i("[PV] [AI]", "AutomaticGainControl is available but not created");
            }
        }
        else {
            Log.i("[PV] [AI]", "AutomaticGainControl is not available");
        }
        if (NoiseSuppressor.isAvailable()) {
            if (enabled3) {
                final NoiseSuppressor create3 = NoiseSuppressor.create(this.audioRecord.getAudioSessionId());
                this.ns = create3;
                final boolean enabled6 = create3.getEnabled();
                sampleRate = this.ns.setEnabled(enabled3);
                Log.i("[PV] [AI]", "NoiseSuppressor created: " + (Object)this.ns + ", setEnabled res: " + sampleRate + ": " + enabled6 + " -> " + this.ns.getEnabled());
            }
            else {
                Log.i("[PV] [AI]", "NoiseSuppressor is available but not created");
            }
        }
        else {
            Log.i("[PV] [AI]", "NoiseSuppressor is not available");
        }
        this.audioRecord.startRecording();
        new Thread((Runnable)new Runnable(this, dataCallback) {
            final AudioInAEC this$0;
            final DataCallback val$pushCallback;
            
            public void run() {
                Process.setThreadPriority(-19);
                Log.i("[PV] [AI]", "thread start");
                while (!this.this$0.exit) {
                    synchronized (this) {
                        if (this.this$0.buf == null) {
                            continue;
                        }
                        this.this$0.audioRecord.read(this.this$0.buf, 0, this.this$0.buf.length);
                        this.val$pushCallback.OnData();
                        continue;
                    }
                    break;
                }
                this.this$0.audioRecord.stop();
                if (this.this$0.aec != null) {
                    this.this$0.aec.release();
                    this.this$0.aec = null;
                }
                if (this.this$0.agc != null) {
                    this.this$0.agc.release();
                    this.this$0.agc = null;
                }
                if (this.this$0.ns != null) {
                    this.this$0.ns.release();
                    this.this$0.ns = null;
                }
                this.this$0.audioRecord.release();
                this.this$0.audioRecord = null;
                this.val$pushCallback.OnStop();
                Log.i("[PV] [AI]", "thread stop");
            }
        }).start();
        return true;
    }
    
    public boolean Stop() throws InterruptedException {
        this.exit = true;
        while (this.audioRecord != null) {
            Thread.sleep(1L);
        }
        if (this.audioChangeReceiver != null) {
            this.activity.getApplicationContext().unregisterReceiver((BroadcastReceiver)this.audioChangeReceiver);
        }
        final AppRTCAudioManager appRTCAudioManager = this.appRTCAudioManager;
        if (appRTCAudioManager != null) {
            appRTCAudioManager.stop();
        }
        return true;
    }
    
    private class AudioChangeReceiver extends BroadcastReceiver
    {
        final AudioInAEC this$0;
        
        private AudioChangeReceiver(final AudioInAEC this$0) {
            this.this$0 = this$0;
        }
        
        public void onReceive(final Context context, final Intent intent) {
            Log.i("[PV] [AI]", "updateAudioDevice: AudioChangeReceiver action: " + intent.getAction());
            new Timer().schedule((TimerTask)new TimerTask(this) {
                final AudioChangeReceiver this$1;
                
                public void run() {
                    this.this$1.this$0.updateAudioDevice();
                }
            }, 500L);
        }
    }
    
    interface DataCallback
    {
        void OnData();
        
        void OnStop();
    }
}
