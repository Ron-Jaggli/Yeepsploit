package com.unity3d.player;

import java.util.concurrent.Semaphore;

final class p1 implements Runnable
{
    final Semaphore a;
    final UnityPlayerForActivityOrService b;
    
    p1(final UnityPlayerForActivityOrService b, final Semaphore a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        if (UnityPlayerForActivityOrService.-$$Nest$mnativePause(this.b)) {
            final UnityPlayerForActivityOrService b = this.b;
            ((UnityPlayer)b).mQuitting = true;
            b.shutdown();
            UnityPlayerForActivityOrService.-$$Nest$mqueueDestroy(this.b);
        }
        this.a.release();
    }
}
