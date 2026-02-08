package com.unity3d.player;

import android.view.Surface;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import android.content.Context;
import com.unity3d.player.a.b;

public class Camera2Wrapper implements b
{
    private Context a;
    private w b;
    
    public Camera2Wrapper(final Context a) {
        this.b = null;
        this.a = a;
        this.initCamera2Jni();
    }
    
    private final native void initCamera2Jni();
    
    private final native void nativeFrameReady(final Object p0, final Object p1, final Object p2, final int p3, final int p4, final int p5);
    
    private final native void nativeSurfaceTextureReady(final Object p0);
    
    public final void a(final Object o) {
        this.nativeSurfaceTextureReady(o);
    }
    
    public final void a(final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2, final ByteBuffer byteBuffer3, final int n, final int n2, final int n3) {
        this.nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, n, n2, n3);
    }
    
    protected void closeCamera2() {
        final w b = this.b;
        if (b != null) {
            b.a();
        }
        this.b = null;
    }
    
    protected int getCamera2Count() {
        return w.getCameraIds(this.a).length;
    }
    
    protected int getCamera2FocalLengthEquivalent(final int n) {
        return w.a(this.a, n);
    }
    
    protected int[] getCamera2Resolutions(final int n) {
        return w.b(this.a, n);
    }
    
    protected int getCamera2SensorOrientation(final int n) {
        return w.c(this.a, n);
    }
    
    protected Rect getFrameSizeCamera2() {
        final w b = this.b;
        Rect c;
        if (b != null) {
            c = b.c();
        }
        else {
            c = new Rect();
        }
        return c;
    }
    
    protected boolean initializeCamera2(final int n, final int n2, final int n3, final int n4, final int n5, final Surface surface) {
        if (this.b == null && UnityPlayer.currentActivity != null) {
            final int e = w.E;
            Object b;
            if (PlatformSupport.QUINCE_TART_SUPPORT) {
                b = new z((b)this);
            }
            else {
                b = new w((b)this);
            }
            this.b = (w)b;
            return ((w)b).a(this.a, n, n2, n3, n4, n5, surface);
        }
        return false;
    }
    
    protected boolean isCamera2AutoFocusPointSupported(final int n) {
        return w.d(this.a, n);
    }
    
    protected boolean isCamera2FrontFacing(final int n) {
        return w.e(this.a, n);
    }
    
    protected void pauseCamera2() {
        final w b = this.b;
        if (b != null) {
            b.d();
        }
    }
    
    protected boolean setAutoFocusPoint(final float n, final float n2) {
        final w b = this.b;
        return b != null && b.a(n, n2);
    }
    
    protected void startCamera2() {
        final w b = this.b;
        if (b != null) {
            b.h();
        }
    }
    
    protected void stopCamera2() {
        final w b = this.b;
        if (b != null) {
            b.i();
        }
    }
}
