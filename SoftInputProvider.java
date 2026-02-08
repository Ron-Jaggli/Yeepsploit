package com.unity3d.player;

import com.unity3d.player.a.f;
import com.unity3d.player.a.a;

abstract class SoftInputProvider
{
    public static int a() {
        final int nativeGetSoftInputType = nativeGetSoftInputType();
        for (final int n : a.b(3)) {
            if (f.a(n) == nativeGetSoftInputType) {
                return n;
            }
        }
        return 1;
    }
    
    private static final native int nativeGetSoftInputType();
}
