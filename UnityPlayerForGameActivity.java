package com.unity3d.player;

import android.view.View;
import android.view.SurfaceHolder$Callback;
import android.content.Context;
import android.widget.FrameLayout;
import android.app.Activity;
import android.view.SurfaceView;

public class UnityPlayerForGameActivity extends UnityPlayer
{
    Thread m_MainThread;
    private O m_PersistentUnitySurface;
    SurfaceView m_SurfaceView;
    
    public UnityPlayerForGameActivity(final Activity activity, final FrameLayout frameLayout, final SurfaceView surfaceView) {
        this(activity, frameLayout, surfaceView, null);
    }
    
    public UnityPlayerForGameActivity(final Activity activity, final FrameLayout frameLayout, final SurfaceView surfaceView, final IUnityPlayerLifecycleEvents unityPlayerLifecycleEvents) {
        super((Context)activity, A.c, unityPlayerLifecycleEvents);
        this.m_SurfaceView = surfaceView;
        this.initialize(frameLayout);
        this.m_MainThread = null;
        this.nativeUnityPlayerForGameActivityInitialized((E1.d() ^ true) ? 1 : 0);
        this.applySurfaceViewSettings(this.m_SurfaceView);
        this.m_PersistentUnitySurface = new O((Context)activity);
        this.m_SurfaceView.getHolder().addCallback((SurfaceHolder$Callback)new z1(this));
    }
    
    public static int getUnityViewIdentifier(final Context context) {
        return context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName());
    }
    
    private final native void nativeOrientationChanged(final int p0, final int p1);
    
    private final native void nativeUnityPlayerForGameActivityInitialized(final int p0);
    
    private final native void nativeUnityPlayerSetRunning(final boolean p0);
    
    protected void cleanupResourcesForDestroy() {
    }
    
    @Override
    public SurfaceView getSurfaceView() {
        return this.m_SurfaceView;
    }
    
    public SurfaceView getView() {
        return this.getSurfaceView();
    }
    
    @Override
    boolean handleFocus(final boolean b) {
        return true;
    }
    
    @Override
    void hidePreservedContent() {
        this.runOnUiThread((Runnable)new D1(this));
    }
    
    @Override
    void onOrientationChanged(final int n, final int n2) {
        this.invokeOnMainThread((Runnable)new A1(this, n, n2));
    }
    
    @Override
    void pauseUnity() {
        super.pauseUnity();
        this.invokeOnMainThread((Runnable)new B1(this));
    }
    
    @Override
    void resumeUnity() {
        super.resumeUnity();
        this.invokeOnMainThread((Runnable)new C1(this));
    }
    
    @Override
    public boolean runningOnMainThread() {
        if (this.m_MainThread != null) {
            return Thread.currentThread() == this.m_MainThread;
        }
        throw new RuntimeException("Main Thread was not yet set.");
    }
    
    @Override
    public void setMainSurfaceViewAspectRatio(final float n) {
        D.Log(6, "setMainSurfaceViewAspectRatio is not supported for GameActivity");
    }
    
    protected void setMainThread() {
        if (this.m_MainThread == null) {
            this.m_MainThread = Thread.currentThread();
            return;
        }
        throw new RuntimeException("Main Thread was already set.");
    }
}
