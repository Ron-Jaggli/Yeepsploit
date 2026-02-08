package com.unity3d.player;

import android.content.res.Configuration;

final class q1 implements Runnable
{
    final Configuration a;
    final UnityPlayerForActivityOrService b;
    
    q1(final UnityPlayerForActivityOrService b, final Configuration a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        this.b.nativeConfigurationChanged(this.a);
    }
}
