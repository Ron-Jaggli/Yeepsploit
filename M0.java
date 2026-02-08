package com.unity3d.player;

final class m0 implements Runnable
{
    final int a;
    final int b;
    final UnityAccessibilityDelegate c;
    
    m0(final UnityAccessibilityDelegate c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.c.sendEventForVirtualViewId(this.a, this.b);
    }
}
