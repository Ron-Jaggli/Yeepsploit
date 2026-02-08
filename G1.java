package com.unity3d.player;

final class g1 implements Runnable
{
    final boolean a;
    final UnityPlayerForActivityOrService b;
    
    g1(final UnityPlayerForActivityOrService b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        final W -$$Nest$fgetmSoftInput = UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.b);
        if (-$$Nest$fgetmSoftInput != null) {
            -$$Nest$fgetmSoftInput.a(this.a);
        }
    }
}
