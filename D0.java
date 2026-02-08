package com.unity3d.player;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

final class d0 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final g0 a;
    
    d0(final g0 a) {
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        this.a.reportSoftInputArea();
        this.a.h.b();
    }
}
