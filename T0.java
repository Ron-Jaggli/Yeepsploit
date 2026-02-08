package com.unity3d.player;

final class t0 extends Z0
{
    final boolean b;
    
    t0(final UnityPlayer unityPlayer, final boolean b) {
        this.b = b;
        super(unityPlayer);
    }
    
    public final void a() {
        UnityAccessibilityDelegate.-$$Nest$smsendScreenReaderStatusChangedNotification(this.b);
    }
}
