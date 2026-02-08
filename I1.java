package com.unity3d.player;

final class i1 extends Z0
{
    final boolean b;
    final String c;
    final int d;
    final UnityPlayerForActivityOrService e;
    
    i1(final UnityPlayerForActivityOrService e, final boolean b, final String c, final int d) {
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
        super((UnityPlayer)e);
    }
    
    public final void a() {
        if (this.b) {
            UnityPlayerForActivityOrService.-$$Nest$mnativeSoftInputCanceled(this.e);
        }
        else {
            final String c = this.c;
            if (c != null) {
                UnityPlayerForActivityOrService.-$$Nest$mnativeSetInputString(this.e, c);
            }
        }
        if (this.d == 1) {
            UnityPlayerForActivityOrService.-$$Nest$mnativeSoftInputClosed(this.e);
        }
    }
}
