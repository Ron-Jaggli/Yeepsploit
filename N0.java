package com.unity3d.player;

final class n0 extends Z0
{
    final int b;
    
    n0(final UnityPlayer unityPlayer, final int b) {
        this.b = b;
        super(unityPlayer);
    }
    
    public final void a() {
        UnityAccessibilityDelegate.-$$Nest$smonNodeFocusChanged(this.b, true);
    }
}
