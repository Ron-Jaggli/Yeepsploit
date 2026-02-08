package com.unity3d.player;

import android.graphics.Rect;

final class k1 extends Z0
{
    final Rect b;
    final UnityPlayerForActivityOrService c;
    
    k1(final UnityPlayerForActivityOrService c, final Rect b) {
        this.c = c;
        this.b = b;
        super((UnityPlayer)c);
    }
    
    public final void a() {
        final UnityPlayerForActivityOrService c = this.c;
        final Rect b = this.b;
        UnityPlayerForActivityOrService.-$$Nest$mnativeSetInputArea(c, b.left, b.top, b.right, b.bottom);
    }
}
