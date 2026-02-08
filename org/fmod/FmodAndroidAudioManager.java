package org.fmod;

import android.content.IntentFilter;
import android.content.Intent;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.content.BroadcastReceiver;
import android.media.AudioManager;
import android.app.Activity;

public class FmodAndroidAudioManager
{
    private static FmodAndroidAudioManager f;
    private volatile Activity a;
    private volatile AudioManager b;
    private BroadcastReceiver c;
    private boolean d;
    private boolean e;
    
    private FmodAndroidAudioManager() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
    }
    
    public static FmodAndroidAudioManager getInstance() {
        if (FmodAndroidAudioManager.f == null) {
            FmodAndroidAudioManager.f = new FmodAndroidAudioManager();
        }
        return FmodAndroidAudioManager.f;
    }
    
    public int getBluetoothInputDeviceId() {
        for (final AudioDeviceInfo audioDeviceInfo : this.b.getDevices(1)) {
            if (audioDeviceInfo.getType() == 7) {
                return audioDeviceInfo.getId();
            }
        }
        return -1;
    }
    
    public boolean isBluetoothInputDeviceAvailable() {
        final AudioDeviceInfo[] devices = this.b.getDevices(1);
        for (int length = devices.length, i = 0; i < length; ++i) {
            if (devices[i].getType() == 7) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isBluetoothScoConnected() {
        return this.e;
    }
    
    public boolean isBuiltinInputDeviceAvailable() {
        final AudioDeviceInfo[] devices = this.b.getDevices(1);
        for (int length = devices.length, i = 0; i < length; ++i) {
            if (devices[i].getType() == 15) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isBuiltinSpeakerDevice(final int n) {
        for (final AudioDeviceInfo audioDeviceInfo : this.b.getDevices(2)) {
            if (audioDeviceInfo.getId() == n && audioDeviceInfo.getType() == 2) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isInputSampleRateAvailable(final int n) {
        for (final AudioDeviceInfo audioDeviceInfo : this.b.getDevices(1)) {
            Label_0102: {
                if (!this.d || audioDeviceInfo.getType() != 7) {
                    if (this.d || audioDeviceInfo.getType() != 15) {
                        break Label_0102;
                    }
                }
                final int[] sampleRates = audioDeviceInfo.getSampleRates();
                for (int length2 = sampleRates.length, j = 0; j < length2; ++j) {
                    if (sampleRates[j] == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void setActivity(final Activity a) {
        if (this.a != a) {
            final BroadcastReceiver c = this.c;
            final AudioManager audioManager = null;
            if (c != null) {
                ((Context)this.a).unregisterReceiver(this.c);
                this.c = null;
                this.e = false;
            }
            this.a = a;
            AudioManager b = audioManager;
            if (this.a != null) {
                b = (AudioManager)this.a.getSystemService("audio");
            }
            this.b = b;
        }
    }
    
    public void setUseBluetooth(final boolean d) {
        this.d = d;
    }
    
    public void startBluetoothSco() {
        if (this.c == null) {
            this.c = new BroadcastReceiver(this) {
                final FmodAndroidAudioManager a;
                
                public final void onReceive(final Context context, final Intent intent) {
                    final int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            this.a.e = true;
                        }
                    }
                    else {
                        this.a.e = false;
                    }
                }
            };
            ((Context)this.a).registerReceiver(this.c, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        }
        this.b.startBluetoothSco();
    }
    
    public void stopBluetoothSco() {
        this.b.stopBluetoothSco();
    }
}
