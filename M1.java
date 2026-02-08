package com.unity3d.player;

final class m1 implements Runnable
{
    final UnityPlayerForActivityOrService a;
    
    m1(final UnityPlayerForActivityOrService a) {
        this.a = a;
    }
    
    public final void run() {
        ((UnityPlayer)this.a).destroy();
    }
}
