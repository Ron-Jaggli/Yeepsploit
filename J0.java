package com.unity3d.player;

import android.provider.Settings$System;
import android.os.Handler;
import android.os.Looper;
import android.database.ContentObserver;
import android.content.Context;

final class j0
{
    private Context a;
    private i0 b;
    
    public j0(final Context a) {
        this.a = a;
    }
    
    public final void a() {
        if (this.b != null) {
            this.a.getContentResolver().unregisterContentObserver((ContentObserver)this.b);
            this.b = null;
        }
    }
    
    public final void a(final h0 h0) {
        this.b = new i0(new Handler(Looper.getMainLooper()), h0);
        this.a.getContentResolver().registerContentObserver(Settings$System.getUriFor("accelerometer_rotation"), true, (ContentObserver)this.b);
    }
}
