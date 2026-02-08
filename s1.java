package com.unity3d.player;

import java.util.concurrent.Semaphore;
import android.view.Surface;

final class s1 implements Runnable
{
    final int a;
    final Surface b;
    final Semaphore c;
    final UnityPlayerForActivityOrService d;
    
    s1(final UnityPlayerForActivityOrService d, final int a, final Surface b, final Semaphore c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void run() {
        UnityPlayerForActivityOrService.-$$Nest$mnativeRecreateGfxState(this.d, this.a, this.b);
        this.c.release();
    }
}
