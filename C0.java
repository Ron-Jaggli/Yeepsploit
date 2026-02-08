package com.unity3d.player;

import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

final class c0 implements DialogInterface$OnDismissListener
{
    final g0 a;
    
    c0(final g0 a) {
        this.a = a;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        ((W)this.a).invokeOnClose();
    }
}
