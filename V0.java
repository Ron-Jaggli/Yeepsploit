package com.unity3d.player;

final class v0 extends Z0
{
    final boolean b;
    
    v0(final UnityPlayer unityPlayer, final boolean b) {
        this.b = b;
        super(unityPlayer);
    }
    
    public final void a() {
        UnityAccessibilityDelegate.-$$Nest$smsendClosedCaptioningChangedNotification(this.b);
    }
}
