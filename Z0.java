package com.unity3d.player;

final class z0 implements Runnable
{
    final A0 a;
    
    z0(final A0 a) {
        this.a = a;
    }
    
    public final void run() {
        A0.-$$Nest$fgeta(this.a).getView().releasePointerCapture();
    }
}
