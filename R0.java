package com.unity3d.player;

final class r0 extends Z0
{
    final int b;
    
    r0(final UnityPlayer unityPlayer, final int b) {
        this.b = b;
        super(unityPlayer);
    }
    
    public final void a() {
        UnityAccessibilityDelegate.-$$Nest$smonNodeDismissed(this.b);
    }
}
