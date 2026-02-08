package com.unity3d.player;

final class p0 extends Z0
{
    final int b;
    final s0 c;
    
    p0(final s0 c, final UnityPlayer unityPlayer, final int b) {
        this.c = c;
        this.b = b;
        super(unityPlayer);
    }
    
    public final void a() {
        if (UnityAccessibilityDelegate.-$$Nest$smonNodeSelected(this.b)) {
            this.c.a.sendEventForVirtualViewId(this.b, 1);
        }
    }
}
