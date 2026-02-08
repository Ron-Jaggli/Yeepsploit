package com.unity3d.player;

import java.util.Iterator;
import java.util.Set;

final class g implements Runnable
{
    private Set a;
    private String b;
    private int c;
    private long d;
    private long e;
    private int f;
    private int g;
    
    g(final Set a, final String b, final int c, final long d, final long e, final int f, final int g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void run() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((IAssetPackManagerDownloadStatusCallback)iterator.next()).onStatusUpdate(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
