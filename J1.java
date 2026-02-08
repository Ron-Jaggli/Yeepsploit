package com.unity3d.player;

final class j1 extends Z0
{
    final int b;
    final int c;
    final UnityPlayerForActivityOrService d;
    
    j1(final UnityPlayerForActivityOrService d, final int b, final int c) {
        this.d = d;
        this.b = b;
        this.c = c;
        super((UnityPlayer)d);
    }
    
    public final void a() {
        UnityPlayerForActivityOrService.-$$Nest$mnativeSetInputSelection(this.d, this.b, this.c);
    }
}
