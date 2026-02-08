package com.unity3d.player;

import android.content.res.Configuration;

final class l0 extends Z0
{
    final Configuration b;
    
    l0(final UnityPlayer unityPlayer, final Configuration b) {
        this.b = b;
        super(unityPlayer);
    }
    
    public final void a() {
        UnityAccessibilityDelegate.-$$Nest$smsendFontScaleChangedNotification(this.b.fontScale);
    }
}
