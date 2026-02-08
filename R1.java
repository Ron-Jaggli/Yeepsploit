package com.unity3d.player;

final class r1 implements Runnable
{
    final UnityPlayerForActivityOrService a;
    
    r1(final UnityPlayerForActivityOrService a) {
        this.a = a;
    }
    
    public final void run() {
        UnityPlayerForActivityOrService.-$$Nest$mnativeSendSurfaceChangedEvent(this.a);
    }
}
