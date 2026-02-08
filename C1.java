package com.unity3d.player;

final class c1 implements K
{
    final d1 a;
    
    c1(final d1 a) {
        this.a = a;
    }
    
    public final void a() {
        final d1 a = this.a;
        a.a = true;
        if (a.b) {
            a.c.release();
        }
    }
}
