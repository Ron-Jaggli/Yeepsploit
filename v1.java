package com.unity3d.player;

final class v1 implements Runnable
{
    final UnityPlayerForActivityOrService a;
    
    v1(final UnityPlayerForActivityOrService a) {
        this.a = a;
    }
    
    public final void run() {
        final D0 view = this.a.getView();
        if (view != null) {
            view.b();
        }
    }
}
