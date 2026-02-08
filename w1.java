package com.unity3d.player;

final class w1 implements Runnable
{
    final float a;
    final UnityPlayerForActivityOrService b;
    
    w1(final UnityPlayerForActivityOrService b, final float a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        final D0 view = this.b.getView();
        if (view != null) {
            view.a(this.a);
        }
    }
}
