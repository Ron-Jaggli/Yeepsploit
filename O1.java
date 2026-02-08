package com.unity3d.player;

import java.util.concurrent.Semaphore;

final class o1 implements Runnable
{
    final Semaphore a;
    final UnityPlayerForActivityOrService b;
    
    o1(final UnityPlayerForActivityOrService b, final Semaphore a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        this.b.shutdown();
        this.a.release();
    }
}
