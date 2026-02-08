package com.unity3d.player;

import java.util.concurrent.Semaphore;

final class d1 implements Runnable
{
    boolean a;
    boolean b;
    final Semaphore c;
    final UnityPlayerForActivityOrService d;
    final UnityPlayerForActivityOrService e;
    
    d1(final UnityPlayerForActivityOrService e, final Semaphore c, final UnityPlayerForActivityOrService d) {
        this.e = e;
        this.c = c;
        this.d = d;
        this.a = false;
        this.b = false;
    }
    
    public final void run() {
        if (UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.e) != null) {
            this.d.setOnHandleFocusListener((I)new b1(this));
            final UnityPlayerForActivityOrService e = this.e;
            UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(e).g = (K)new c1(this);
            UnityPlayerForActivityOrService.-$$Nest$mdismissSoftInput(e);
        }
    }
}
