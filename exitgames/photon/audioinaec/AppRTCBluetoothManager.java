package com.exitgames.photon.audioinaec;

import android.content.Intent;
import android.bluetooth.BluetoothProfile;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.Set;
import android.os.Process;
import java.util.List;
import android.os.Looper;
import android.util.Log;
import android.os.Handler;
import android.bluetooth.BluetoothProfile$ServiceListener;
import android.content.BroadcastReceiver;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothAdapter;
import android.media.AudioManager;
import android.content.Context;

public class AppRTCBluetoothManager
{
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 4000;
    private static final int MAX_SCO_CONNECTION_ATTEMPTS = 2;
    private static final String TAG = "[PV] [AI] AppRTCBluetoothManager";
    private final AppRTCAudioManager apprtcAudioManager;
    private final Context apprtcContext;
    private final AudioManager audioManager;
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothDevice bluetoothDevice;
    private BluetoothHeadset bluetoothHeadset;
    private final BroadcastReceiver bluetoothHeadsetReceiver;
    private final BluetoothProfile$ServiceListener bluetoothServiceListener;
    private State bluetoothState;
    private final Runnable bluetoothTimeoutRunnable;
    private final Handler handler;
    int scoConnectionAttempts;
    
    protected AppRTCBluetoothManager(final Context apprtcContext, final AppRTCAudioManager apprtcAudioManager) {
        this.bluetoothTimeoutRunnable = (Runnable)new Runnable() {
            final AppRTCBluetoothManager this$0;
            
            public void run() {
                this.this$0.bluetoothTimeout();
            }
        };
        Log.d("[PV] [AI] AppRTCBluetoothManager", "ctor");
        ThreadUtils.checkIsOnMainThread();
        this.apprtcContext = apprtcContext;
        this.apprtcAudioManager = apprtcAudioManager;
        this.audioManager = this.getAudioManager(apprtcContext);
        this.bluetoothState = State.UNINITIALIZED;
        this.bluetoothServiceListener = (BluetoothProfile$ServiceListener)new BluetoothServiceListener();
        this.bluetoothHeadsetReceiver = new BluetoothHeadsetBroadcastReceiver();
        this.handler = new Handler(Looper.getMainLooper());
    }
    
    private void bluetoothTimeout() {
        ThreadUtils.checkIsOnMainThread();
        if (this.bluetoothState != State.UNINITIALIZED) {
            if (this.bluetoothHeadset != null) {
                Log.d("[PV] [AI] AppRTCBluetoothManager", "bluetoothTimeout: BT state=" + (Object)this.bluetoothState + ", attempts: " + this.scoConnectionAttempts + ", SCO is on: " + this.isScoOn());
                if (this.bluetoothState != State.SCO_CONNECTING) {
                    return;
                }
                final List connectedDevices = this.bluetoothHeadset.getConnectedDevices();
                Label_0210: {
                    if (connectedDevices.size() > 0) {
                        final BluetoothDevice bluetoothDevice = (BluetoothDevice)connectedDevices.get(0);
                        this.bluetoothDevice = bluetoothDevice;
                        if (this.bluetoothHeadset.isAudioConnected(bluetoothDevice)) {
                            Log.d("[PV] [AI] AppRTCBluetoothManager", "SCO connected with " + this.bluetoothDevice.getName());
                            this.bluetoothState = State.SCO_CONNECTED;
                            this.scoConnectionAttempts = 0;
                            break Label_0210;
                        }
                        Log.d("[PV] [AI] AppRTCBluetoothManager", "SCO is not connected with " + this.bluetoothDevice.getName());
                    }
                    Log.w("[PV] [AI] AppRTCBluetoothManager", "BT failed to connect after timeout");
                    this.stopScoAudio();
                }
                this.updateAudioDeviceState();
                Log.d("[PV] [AI] AppRTCBluetoothManager", "bluetoothTimeout done: BT state=" + (Object)this.bluetoothState);
            }
        }
    }
    
    private void cancelTimer() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "cancelTimer");
        this.handler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }
    
    static AppRTCBluetoothManager create(final Context context, final AppRTCAudioManager appRTCAudioManager) {
        Log.d("[PV] [AI] AppRTCBluetoothManager", "create" + AppRTCUtils.getThreadInfo());
        return new AppRTCBluetoothManager(context, appRTCAudioManager);
    }
    
    private boolean isScoOn() {
        return this.audioManager.isBluetoothScoOn();
    }
    
    private void startTimer() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "startTimer");
        this.handler.postDelayed(this.bluetoothTimeoutRunnable, 4000L);
    }
    
    private String stateToString(final int n) {
        if (n == 0) {
            return "DISCONNECTED";
        }
        if (n == 1) {
            return "CONNECTING";
        }
        if (n == 2) {
            return "CONNECTED";
        }
        if (n == 3) {
            return "DISCONNECTING";
        }
        switch (n) {
            default: {
                return "INVALID";
            }
            case 13: {
                return "TURNING_OFF";
            }
            case 12: {
                return "ON";
            }
            case 11: {
                return "TURNING_ON";
            }
            case 10: {
                return "OFF";
            }
        }
    }
    
    private void updateAudioDeviceState() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "updateAudioDeviceState");
        this.apprtcAudioManager.updateAudioDeviceState();
    }
    
    protected AudioManager getAudioManager(final Context context) {
        return (AudioManager)context.getSystemService("audio");
    }
    
    protected boolean getBluetoothProfileProxy(final Context context, final BluetoothProfile$ServiceListener bluetoothProfile$ServiceListener, final int n) {
        return this.bluetoothAdapter.getProfileProxy(context, bluetoothProfile$ServiceListener, n);
    }
    
    public State getState() {
        ThreadUtils.checkIsOnMainThread();
        return this.bluetoothState;
    }
    
    protected boolean hasPermission(final Context context, final String s) {
        return this.apprtcContext.checkPermission(s, Process.myPid(), Process.myUid()) == 0;
    }
    
    protected void logBluetoothAdapterInfo(final BluetoothAdapter bluetoothAdapter) {
        Log.d("[PV] [AI] AppRTCBluetoothManager", "BluetoothAdapter: enabled=" + bluetoothAdapter.isEnabled() + ", state=" + this.stateToString(bluetoothAdapter.getState()) + ", name=" + bluetoothAdapter.getName() + ", address=" + bluetoothAdapter.getAddress());
        final Set bondedDevices = bluetoothAdapter.getBondedDevices();
        if (!bondedDevices.isEmpty()) {
            Log.d("[PV] [AI] AppRTCBluetoothManager", "paired devices:");
            for (final BluetoothDevice bluetoothDevice : bondedDevices) {
                Log.d("[PV] [AI] AppRTCBluetoothManager", " name=" + bluetoothDevice.getName() + ", address=" + bluetoothDevice.getAddress());
            }
        }
    }
    
    protected void registerReceiver(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        this.apprtcContext.registerReceiver(broadcastReceiver, intentFilter);
    }
    
    public void start() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "start");
        if (!this.hasPermission(this.apprtcContext, "android.permission.BLUETOOTH")) {
            Log.w("[PV] [AI] AppRTCBluetoothManager", "Process (pid=" + Process.myPid() + ") lacks BLUETOOTH permission");
            return;
        }
        if (this.bluetoothState != State.UNINITIALIZED) {
            Log.w("[PV] [AI] AppRTCBluetoothManager", "Invalid BT state");
            return;
        }
        this.bluetoothHeadset = null;
        this.bluetoothDevice = null;
        this.scoConnectionAttempts = 0;
        if ((this.bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            Log.w("[PV] [AI] AppRTCBluetoothManager", "Device does not support Bluetooth");
            return;
        }
        if (!this.audioManager.isBluetoothScoAvailableOffCall()) {
            Log.e("[PV] [AI] AppRTCBluetoothManager", "Bluetooth SCO audio is not available off call");
            return;
        }
        this.logBluetoothAdapterInfo(this.bluetoothAdapter);
        if (!this.getBluetoothProfileProxy(this.apprtcContext, this.bluetoothServiceListener, 1)) {
            Log.e("[PV] [AI] AppRTCBluetoothManager", "BluetoothAdapter.getProfileProxy(HEADSET) failed");
            return;
        }
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        this.registerReceiver(this.bluetoothHeadsetReceiver, intentFilter);
        Log.d("[PV] [AI] AppRTCBluetoothManager", "HEADSET profile state: " + this.stateToString(this.bluetoothAdapter.getProfileConnectionState(1)));
        Log.d("[PV] [AI] AppRTCBluetoothManager", "Bluetooth proxy for headset profile has started");
        this.bluetoothState = State.HEADSET_UNAVAILABLE;
        Log.d("[PV] [AI] AppRTCBluetoothManager", "start done: BT state=" + (Object)this.bluetoothState);
    }
    
    public boolean startScoAudio() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "startSco: BT state=" + (Object)this.bluetoothState + ", attempts: " + this.scoConnectionAttempts + ", SCO is on: " + this.isScoOn());
        if (this.scoConnectionAttempts >= 2) {
            Log.e("[PV] [AI] AppRTCBluetoothManager", "BT SCO connection fails - no more attempts");
            return false;
        }
        if (this.bluetoothState != State.HEADSET_AVAILABLE) {
            Log.e("[PV] [AI] AppRTCBluetoothManager", "BT SCO connection fails - no headset available");
            return false;
        }
        Log.d("[PV] [AI] AppRTCBluetoothManager", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
        this.bluetoothState = State.SCO_CONNECTING;
        this.audioManager.startBluetoothSco();
        this.audioManager.setBluetoothScoOn(true);
        ++this.scoConnectionAttempts;
        this.startTimer();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "startScoAudio done: BT state=" + (Object)this.bluetoothState + ", SCO is on: " + this.isScoOn());
        return true;
    }
    
    public void stop() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "stop: BT state=" + (Object)this.bluetoothState);
        if (this.bluetoothAdapter == null) {
            return;
        }
        this.stopScoAudio();
        if (this.bluetoothState == State.UNINITIALIZED) {
            return;
        }
        this.unregisterReceiver(this.bluetoothHeadsetReceiver);
        this.cancelTimer();
        final BluetoothHeadset bluetoothHeadset = this.bluetoothHeadset;
        if (bluetoothHeadset != null) {
            this.bluetoothAdapter.closeProfileProxy(1, (BluetoothProfile)bluetoothHeadset);
            this.bluetoothHeadset = null;
        }
        this.bluetoothAdapter = null;
        this.bluetoothDevice = null;
        this.bluetoothState = State.UNINITIALIZED;
        Log.d("[PV] [AI] AppRTCBluetoothManager", "stop done: BT state=" + (Object)this.bluetoothState);
    }
    
    public void stopScoAudio() {
        ThreadUtils.checkIsOnMainThread();
        Log.d("[PV] [AI] AppRTCBluetoothManager", "stopScoAudio: BT state=" + (Object)this.bluetoothState + ", SCO is on: " + this.isScoOn());
        if (this.bluetoothState != State.SCO_CONNECTING && this.bluetoothState != State.SCO_CONNECTED) {
            return;
        }
        this.cancelTimer();
        this.audioManager.stopBluetoothSco();
        this.audioManager.setBluetoothScoOn(false);
        this.bluetoothState = State.SCO_DISCONNECTING;
        Log.d("[PV] [AI] AppRTCBluetoothManager", "stopScoAudio done: BT state=" + (Object)this.bluetoothState + ", SCO is on: " + this.isScoOn());
    }
    
    protected void unregisterReceiver(final BroadcastReceiver broadcastReceiver) {
        this.apprtcContext.unregisterReceiver(broadcastReceiver);
    }
    
    public void updateDevice() {
        if (this.bluetoothState != State.UNINITIALIZED) {
            if (this.bluetoothHeadset != null) {
                Log.d("[PV] [AI] AppRTCBluetoothManager", "updateDevice");
                final List connectedDevices = this.bluetoothHeadset.getConnectedDevices();
                if (connectedDevices.isEmpty()) {
                    this.bluetoothDevice = null;
                    this.bluetoothState = State.HEADSET_UNAVAILABLE;
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "No connected bluetooth headset");
                }
                else {
                    this.bluetoothDevice = (BluetoothDevice)connectedDevices.get(0);
                    this.bluetoothState = State.HEADSET_AVAILABLE;
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "Connected bluetooth headset: name=" + this.bluetoothDevice.getName() + ", state=" + this.stateToString(this.bluetoothHeadset.getConnectionState(this.bluetoothDevice)) + ", SCO audio=" + this.bluetoothHeadset.isAudioConnected(this.bluetoothDevice));
                }
                Log.d("[PV] [AI] AppRTCBluetoothManager", "updateDevice done: BT state=" + (Object)this.bluetoothState);
            }
        }
    }
    
    private class BluetoothHeadsetBroadcastReceiver extends BroadcastReceiver
    {
        final AppRTCBluetoothManager this$0;
        
        private BluetoothHeadsetBroadcastReceiver(final AppRTCBluetoothManager this$0) {
            this.this$0 = this$0;
        }
        
        public void onReceive(final Context context, final Intent intent) {
            if (this.this$0.bluetoothState == State.UNINITIALIZED) {
                return;
            }
            final String action = intent.getAction();
            if (action.equals((Object)"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                final int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                Log.d("[PV] [AI] AppRTCBluetoothManager", "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_CONNECTION_STATE_CHANGED, s=" + this.this$0.stateToString(intExtra) + ", sb=" + this.isInitialStickyBroadcast() + ", BT state: " + (Object)this.this$0.bluetoothState);
                if (intExtra == 2) {
                    this.this$0.scoConnectionAttempts = 0;
                    this.this$0.updateAudioDeviceState();
                }
                else if (intExtra != 1) {
                    if (intExtra != 3) {
                        if (intExtra == 0) {
                            this.this$0.stopScoAudio();
                            this.this$0.updateAudioDeviceState();
                        }
                    }
                }
            }
            else if (action.equals((Object)"android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                final int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                Log.d("[PV] [AI] AppRTCBluetoothManager", "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_AUDIO_STATE_CHANGED, s=" + this.this$0.stateToString(intExtra2) + ", sb=" + this.isInitialStickyBroadcast() + ", BT state: " + (Object)this.this$0.bluetoothState);
                if (intExtra2 == 12) {
                    this.this$0.cancelTimer();
                    if (this.this$0.bluetoothState == State.SCO_CONNECTING) {
                        Log.d("[PV] [AI] AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now connected");
                        this.this$0.bluetoothState = State.SCO_CONNECTED;
                        this.this$0.scoConnectionAttempts = 0;
                        this.this$0.updateAudioDeviceState();
                    }
                    else {
                        Log.w("[PV] [AI] AppRTCBluetoothManager", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
                    }
                }
                else if (intExtra2 == 11) {
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now connecting...");
                }
                else if (intExtra2 == 10) {
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now disconnected");
                    if (this.isInitialStickyBroadcast()) {
                        Log.d("[PV] [AI] AppRTCBluetoothManager", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                        return;
                    }
                    this.this$0.updateAudioDeviceState();
                }
            }
            Log.d("[PV] [AI] AppRTCBluetoothManager", "onReceive done: BT state=" + (Object)this.this$0.bluetoothState);
        }
    }
    
    private class BluetoothServiceListener implements BluetoothProfile$ServiceListener
    {
        final AppRTCBluetoothManager this$0;
        
        private BluetoothServiceListener(final AppRTCBluetoothManager this$0) {
            this.this$0 = this$0;
        }
        
        public void onServiceConnected(final int n, final BluetoothProfile bluetoothProfile) {
            if (n == 1) {
                if (this.this$0.bluetoothState != State.UNINITIALIZED) {
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "BluetoothServiceListener.onServiceConnected: BT state=" + (Object)this.this$0.bluetoothState);
                    this.this$0.bluetoothHeadset = (BluetoothHeadset)bluetoothProfile;
                    this.this$0.updateAudioDeviceState();
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "onServiceConnected done: BT state=" + (Object)this.this$0.bluetoothState);
                }
            }
        }
        
        public void onServiceDisconnected(final int n) {
            if (n == 1) {
                if (this.this$0.bluetoothState != State.UNINITIALIZED) {
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "BluetoothServiceListener.onServiceDisconnected: BT state=" + (Object)this.this$0.bluetoothState);
                    this.this$0.stopScoAudio();
                    this.this$0.bluetoothHeadset = null;
                    this.this$0.bluetoothDevice = null;
                    this.this$0.bluetoothState = State.HEADSET_UNAVAILABLE;
                    this.this$0.updateAudioDeviceState();
                    Log.d("[PV] [AI] AppRTCBluetoothManager", "onServiceDisconnected done: BT state=" + (Object)this.this$0.bluetoothState);
                }
            }
        }
    }
    
    public enum State
    {
        private static final State[] $VALUES;
        
        ERROR, 
        HEADSET_AVAILABLE, 
        HEADSET_UNAVAILABLE, 
        SCO_CONNECTED, 
        SCO_CONNECTING, 
        SCO_DISCONNECTING, 
        UNINITIALIZED;
    }
}
