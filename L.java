package com.unity3d.player;

final class l implements Runnable
{
    private IAssetPackManagerStatusQueryCallback a;
    private long b;
    private String[] c;
    private int[] d;
    private int[] e;
    
    l(final IAssetPackManagerStatusQueryCallback a, final long b, final String[] c, final int[] d, final int[] e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void run() {
        this.a.onStatusResult(this.b, this.c, this.d, this.e);
    }
}
