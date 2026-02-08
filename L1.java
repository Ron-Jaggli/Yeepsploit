package com.unity3d.player;

final class l1 extends Z0
{
    final boolean b;
    final UnityPlayerForActivityOrService c;
    
    l1(final UnityPlayerForActivityOrService c, final boolean b) {
        this.c = c;
        this.b = b;
        super((UnityPlayer)c);
    }
    
    public final void a() {
        UnityPlayerForActivityOrService.-$$Nest$mnativeSetKeyboardIsVisible(this.c, this.b);
    }
}
