package com.unity3d.player;

final class y0 implements Runnable
{
    final A0 a;
    
    y0(final A0 a) {
        this.a = a;
    }
    
    public final void run() {
        A0.-$$Nest$fgeta(this.a).getView().requestPointerCapture();
    }
}
