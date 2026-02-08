package com.unity3d.player;

import android.view.WindowInsets;

final class a1 extends Z0
{
    final WindowInsets b;
    final n1 c;
    
    a1(final n1 c, final WindowInsets b) {
        this.c = c;
        this.b = b;
        super((UnityPlayer)c.a);
    }
    
    public final void a() {
        UnityPlayerForActivityOrService.-$$Nest$mnativeOnApplyWindowInsets(this.c.a, this.b);
    }
}
