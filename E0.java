package com.unity3d.player;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

final class e0 implements DialogInterface$OnCancelListener
{
    final g0 a;
    
    e0(final g0 a) {
        this.a = a;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final J f = this.a.f;
        if (f != null) {
            ((x1)f).a();
        }
    }
}
