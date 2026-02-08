package com.unity3d.player;

public abstract class NativeLoader
{
    static final native boolean load(final String p0);
    
    static final native boolean unload();
}
