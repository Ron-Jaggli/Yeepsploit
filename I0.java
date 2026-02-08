package com.unity3d.player;

import android.os.Handler;
import android.database.ContentObserver;

final class i0 extends ContentObserver
{
    private h0 a;
    
    public i0(final Handler handler, final h0 a) {
        super(handler);
        this.a = a;
    }
    
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }
    
    public final void onChange(final boolean b) {
        final h0 a = this.a;
        if (a != null) {
            ((OrientationLockListener)a).b();
        }
    }
}
