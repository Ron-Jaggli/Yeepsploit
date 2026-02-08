package com.unity3d.player;

import android.content.IntentFilter;
import android.content.Intent;
import android.media.AudioManager;
import android.content.BroadcastReceiver;
import android.content.Context;

public class HFPStatus
{
    private Context a;
    private BroadcastReceiver b;
    private boolean c;
    private AudioManager d;
    private boolean e;
    private int f;
    
    public HFPStatus(final Context a) {
        this.b = null;
        this.c = false;
        this.d = null;
        this.e = false;
        this.f = 1;
        this.a = a;
        this.d = (AudioManager)a.getSystemService("audio");
        this.initHFPStatusJni();
    }
    
    private void a() {
        if (this.e) {
            this.e = false;
            this.d.stopBluetoothSco();
        }
    }
    
    private final native void deinitHFPStatusJni();
    
    private final native void initHFPStatusJni();
    
    public final void b() {
        this.clearHFPStat();
        this.deinitHFPStatusJni();
    }
    
    protected void clearHFPStat() {
        final BroadcastReceiver b = this.b;
        if (b != null) {
            this.a.unregisterReceiver(b);
            this.b = null;
        }
        this.f = 1;
        this.a();
    }
    
    protected boolean getHFPStat() {
        return this.f == 2;
    }
    
    protected void requestHFPStat() {
        this.clearHFPStat();
        final BroadcastReceiver b = new BroadcastReceiver(this) {
            final HFPStatus a;
            
            public final void onReceive(final Context context, final Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1) {
                    final HFPStatus a = this.a;
                    HFPStatus.-$$Nest$fputf(a, 2);
                    a.a();
                    final HFPStatus a2 = this.a;
                    if (a2.c) {
                        a2.d.setMode(3);
                    }
                }
            }
        };
        this.b = b;
        this.a.registerReceiver((BroadcastReceiver)b, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.e = true;
            this.d.startBluetoothSco();
        }
        catch (final NullPointerException ex) {
            D.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }
    
    protected void setHFPRecordingStat(final boolean c) {
        if (!(this.c = c)) {
            this.d.setMode(0);
        }
    }
}
