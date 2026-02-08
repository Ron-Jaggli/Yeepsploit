package com.unity3d.player;

import android.view.ViewGroup;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.view.View;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder$Callback;

final class z1 implements SurfaceHolder$Callback
{
    final UnityPlayerForGameActivity a;
    
    z1(final UnityPlayerForGameActivity a) {
        this.a = a;
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        final UnityPlayerForGameActivity a = this.a;
        final O -$$Nest$fgetm_PersistentUnitySurface = UnityPlayerForGameActivity.-$$Nest$fgetm_PersistentUnitySurface(a);
        final FrameLayout frameLayout = ((UnityPlayer)a).getFrameLayout();
        final N b = -$$Nest$fgetm_PersistentUnitySurface.b;
        if (b != null && ((View)b).getParent() == null) {
            ((ViewGroup)frameLayout).addView((View)-$$Nest$fgetm_PersistentUnitySurface.b);
            ((ViewGroup)frameLayout).bringChildToFront((View)-$$Nest$fgetm_PersistentUnitySurface.b);
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        final UnityPlayerForGameActivity a = this.a;
        final O -$$Nest$fgetm_PersistentUnitySurface = UnityPlayerForGameActivity.-$$Nest$fgetm_PersistentUnitySurface(a);
        final SurfaceView surfaceView = a.m_SurfaceView;
        -$$Nest$fgetm_PersistentUnitySurface.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && -$$Nest$fgetm_PersistentUnitySurface.a != null) {
            if (-$$Nest$fgetm_PersistentUnitySurface.b == null) {
                -$$Nest$fgetm_PersistentUnitySurface.b = new N(-$$Nest$fgetm_PersistentUnitySurface, -$$Nest$fgetm_PersistentUnitySurface.a);
            }
            -$$Nest$fgetm_PersistentUnitySurface.b.a(surfaceView);
        }
    }
}
