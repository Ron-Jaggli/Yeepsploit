package net.codestage.actk.androidnative;

public interface CodeHashCallback
{
    void OnError(final String p0);
    
    void OnSuccess(final String p0, final String[] p1, final String[] p2, final String p3);
}
