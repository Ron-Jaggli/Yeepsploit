package com.unity3d.player;

final class q0 extends Z0
{
    final int b;
    final int c;
    final s0 d;
    
    q0(final s0 d, final UnityPlayer unityPlayer, final int b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
        super(unityPlayer);
    }
    
    public final void a() {
        if (this.b == 4096) {
            UnityAccessibilityDelegate.-$$Nest$smonNodeIncremented(this.c);
        }
        else {
            UnityAccessibilityDelegate.-$$Nest$smonNodeDecremented(this.c);
        }
        this.d.a.sendEventForVirtualViewId(this.c, 4);
    }
}
