package com.unity3d.player;

import android.provider.Settings$System;
import android.content.Context;

public class OrientationLockListener implements h0
{
    private j0 a;
    private Context b;
    
    OrientationLockListener(final Context b) {
        this.b = b;
        this.a = new j0(b);
        this.nativeUpdateOrientationLockState(Settings$System.getInt(b.getContentResolver(), "accelerometer_rotation", 0));
        this.a.a((h0)this);
    }
    
    public final void a() {
        this.a.a();
        this.a = null;
    }
    
    public final void b() {
        this.nativeUpdateOrientationLockState(Settings$System.getInt(this.b.getContentResolver(), "accelerometer_rotation", 0));
    }
    
    public final native void nativeUpdateOrientationLockState(final int p0);
}
