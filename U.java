package com.unity3d.player;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

final class u implements SurfaceTexture$OnFrameAvailableListener
{
    final w a;
    
    u(final w a) {
        this.a = a;
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper)w.-$$Nest$fgeta(this.a)).a((Object)surfaceTexture);
    }
}
