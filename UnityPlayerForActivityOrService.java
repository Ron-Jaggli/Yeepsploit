package com.unity3d.player;

import android.view.ViewGroup;
import android.telephony.PhoneStateListener;
import android.os.Looper;
import android.graphics.Rect;
import android.view.View;
import android.view.SurfaceView;
import android.content.res.Configuration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Semaphore;
import android.provider.Settings$System;
import android.widget.FrameLayout;
import android.view.View$OnApplyWindowInsetsListener;
import android.content.Context;
import android.view.Surface;
import android.view.WindowInsets;

public class UnityPlayerForActivityOrService extends UnityPlayer
{
    private boolean mMainDisplayOverride;
    private I mOnHandleFocusListener;
    private boolean mProcessKillRequested;
    private W mSoftInput;
    private long mSoftInputTimeoutMilliSeconds;
    private int m_IsNoWindowMode;
    private G0 m_MainThread;
    
    public UnityPlayerForActivityOrService(final Context context) {
        this(context, null);
    }
    
    public UnityPlayerForActivityOrService(final Context context, final IUnityPlayerLifecycleEvents unityPlayerLifecycleEvents) {
        super(context, A.b, unityPlayerLifecycleEvents);
        this.m_MainThread = new G0(this);
        this.mMainDisplayOverride = false;
        this.mSoftInput = null;
        this.m_IsNoWindowMode = -1;
        this.mProcessKillRequested = true;
        this.mSoftInputTimeoutMilliSeconds = 1000L;
        final B b = new B(context, this);
        ((FrameLayout)b).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new n1(this));
        this.initialize((FrameLayout)b);
        ((Thread)this.m_MainThread).start();
    }
    
    private void dismissSoftInput() {
        final W mSoftInput = this.mSoftInput;
        if (mSoftInput != null) {
            mSoftInput.b();
            this.nativeReportKeyboardConfigChanged();
        }
    }
    
    private long getSoftInputTimeout() {
        return Math.round(this.mSoftInputTimeoutMilliSeconds * (double)Math.max(1.0f, Settings$System.getFloat(super.mContext.getContentResolver(), "animator_duration_scale", 0.0f)));
    }
    
    private final native boolean nativeDone();
    
    private final native boolean nativeGetNoWindowMode();
    
    private final native void nativeMemoryUsageChanged(final int p0);
    
    private final native void nativeOnApplyWindowInsets(final WindowInsets p0);
    
    private final native boolean nativePause();
    
    private final native void nativeRecreateGfxState(final int p0, final Surface p1);
    
    private final native void nativeReportKeyboardConfigChanged();
    
    private final native void nativeResume();
    
    private final native void nativeSendSurfaceChangedEvent();
    
    private final native void nativeSetInputArea(final int p0, final int p1, final int p2, final int p3);
    
    private final native void nativeSetInputSelection(final int p0, final int p1);
    
    private final native void nativeSetInputString(final String p0);
    
    private final native void nativeSetKeyboardIsVisible(final boolean p0);
    
    private final native void nativeSoftInputCanceled();
    
    private final native void nativeSoftInputClosed();
    
    private final native void nativeSoftInputLostFocus();
    
    private void queueDestroy() {
        D.Log(4, "Queue Destroy");
        this.runOnUiThread((Runnable)new m1(this));
    }
    
    private void raiseFocusListener(final boolean b) {
        final I mOnHandleFocusListener = this.mOnHandleFocusListener;
        if (mOnHandleFocusListener != null) {
            final d1 a = ((b1)mOnHandleFocusListener).a;
            a.b = true;
            if (a.a) {
                a.c.release();
            }
        }
    }
    
    private boolean updateDisplayInternal(final int n, final Surface surface) {
        if (!this.isNativeInitialized()) {
            return false;
        }
        final Semaphore semaphore = new Semaphore(0);
        final s1 s1 = new s1(this, n, surface, semaphore);
        if (n == 0) {
            final G0 mainThread = this.m_MainThread;
            if (surface == null) {
                mainThread.d((Runnable)s1);
            }
            else {
                mainThread.b((Runnable)s1);
            }
        }
        else {
            s1.run();
        }
        if (surface == null && n == 0) {
            try {
                final SynchronizationTimeout surfaceDetach = SynchronizationTimeout.SurfaceDetach;
                if (!semaphore.tryAcquire((long)surfaceDetach.getTimeout(), TimeUnit.MILLISECONDS)) {
                    D.Log(5, "Timeout (" + surfaceDetach.getTimeout() + " ms) while trying detaching primary window.");
                }
            }
            catch (final InterruptedException ex) {
                D.Log(5, "UI thread got interrupted while trying to detach the primary window from the Unity Engine.");
            }
        }
        return true;
    }
    
    @Override
    void cleanupResourcesForDestroy() {
        this.m_MainThread.c();
        try {
            ((Thread)this.m_MainThread).join((long)SynchronizationTimeout.Destroy.getTimeout());
        }
        catch (final InterruptedException ex) {
            ((Thread)this.m_MainThread).interrupt();
        }
        if (E1.d()) {
            ((ViewGroup)this.getFrameLayout()).removeAllViews();
        }
        if (this.mProcessKillRequested) {
            super.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
            this.kill();
        }
    }
    
    @Override
    public void configurationChanged(final Configuration configuration) {
        super.configurationChanged(configuration);
        if (!this.isNativeInitialized()) {
            return;
        }
        this.invokeOnMainThread((Runnable)new q1(this, new Configuration(configuration)));
    }
    
    public boolean displayChanged(final int n, final Surface surface) {
        if (n == 0) {
            this.mMainDisplayOverride = (surface != null);
            this.runOnUiThread((Runnable)new t1(this));
        }
        return this.updateDisplayInternal(n, surface);
    }
    
    boolean getHaveAndroidWindowSupport() {
        if (this.m_IsNoWindowMode == -1) {
            this.m_IsNoWindowMode = (this.nativeGetNoWindowMode() ? 1 : 0);
        }
        final int isNoWindowMode = this.m_IsNoWindowMode;
        boolean b = true;
        if (isNoWindowMode != 1) {
            b = false;
        }
        return b;
    }
    
    public f getSurfaceView() {
        return this.getView().a();
    }
    
    public D0 getView() {
        return ((B)this.getFrameLayout()).a();
    }
    
    @Override
    boolean handleFocus(final boolean b) {
        if (super.mState.a()) {
            final W mSoftInput = this.mSoftInput;
            if (mSoftInput == null || mSoftInput.c()) {
                final G0 mainThread = this.m_MainThread;
                if (b) {
                    mainThread.a();
                }
                else {
                    mainThread.b();
                }
                this.raiseFocusListener(b);
                return true;
            }
        }
        this.raiseFocusListener(b);
        return false;
    }
    
    @Override
    void hidePreservedContent() {
        this.runOnUiThread((Runnable)new v1(this));
    }
    
    protected void hideSoftInput() {
        if (this.mSoftInput == null) {
            return;
        }
        this.reportSoftInputArea(new Rect());
        this.reportSoftInputIsVisible(false);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            this.dismissSoftInput();
            this.mSoftInput = null;
            return;
        }
        final Semaphore semaphore = new Semaphore(0);
        this.postOnUiThread((Runnable)new d1(this, semaphore, this));
        while (true) {
            try {
                try {
                    if (!semaphore.tryAcquire(this.getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                        D.Log(6, "Timeout (" + this.getSoftInputTimeout() + " ms) while waiting softinput hiding operation.");
                    }
                    this.mSoftInput = null;
                }
                finally {}
            }
            catch (final InterruptedException ex) {
                D.Log(6, "UI thread got interrupted while waiting softinput hiding operation.");
                continue;
            }
            break;
        }
        return;
        this.mSoftInput = null;
    }
    
    final native void nativeConfigurationChanged(final Configuration p0);
    
    final native void nativeFocusChanged(final boolean p0);
    
    final native void nativeOrientationChanged(final int p0, final int p1);
    
    final native boolean nativeRender();
    
    @Override
    void onOrientationChanged(final int n, final int n2) {
        this.m_MainThread.a(super.mNaturalOrientation, n2);
    }
    
    public void onTrimMemory(final MemoryUsage memoryUsage) {
        if (!E1.d()) {
            return;
        }
        this.nativeMemoryUsageChanged(memoryUsage.value);
    }
    
    @Override
    void pauseUnity() {
        super.pauseUnity();
        this.reportSoftInputStr(null, 1, true);
        super.mState.c(false);
        super.mState.e(true);
        if (E1.d()) {
            final Semaphore semaphore = new Semaphore(0);
            Object o;
            if (this.isFinishing()) {
                o = new o1(this, semaphore);
            }
            else {
                o = new p1(this, semaphore);
            }
            this.m_MainThread.a((Runnable)o);
            try {
                final SynchronizationTimeout pause = SynchronizationTimeout.Pause;
                if (!semaphore.tryAcquire((long)pause.getTimeout(), TimeUnit.MILLISECONDS)) {
                    D.Log(5, "Timeout (" + pause.getTimeout() + " ms) while trying to pause the Unity Engine.");
                }
            }
            catch (final InterruptedException ex) {
                D.Log(5, "UI thread got interrupted while trying to pause the Unity Engine.");
            }
        }
        if (super.m_AddPhoneCallListener) {
            super.m_TelephonyManager.listen((PhoneStateListener)super.m_PhoneCallListener, 0);
        }
    }
    
    protected void reportSoftInputArea(final Rect rect) {
        this.invokeOnMainThread((Runnable)new k1(this, rect));
    }
    
    protected void reportSoftInputIsVisible(final boolean b) {
        this.invokeOnMainThread((Runnable)new l1(this, b));
    }
    
    protected void reportSoftInputSelection(final int n, final int n2) {
        this.invokeOnMainThread((Runnable)new j1(this, n, n2));
    }
    
    protected void reportSoftInputStr(final String s, final int n, final boolean b) {
        if (n == 1) {
            this.hideSoftInput();
        }
        this.invokeOnMainThread((Runnable)new i1(this, b, s, n));
    }
    
    @Override
    void resumeUnity() {
        super.resumeUnity();
        this.invokeOnMainThread((Runnable)new u1(this));
        this.m_MainThread.d();
    }
    
    @Override
    public boolean runningOnMainThread() {
        return Thread.currentThread() == this.m_MainThread;
    }
    
    void sendSurfaceChangedEvent() {
        if (!this.isNativeInitialized()) {
            return;
        }
        this.m_MainThread.c((Runnable)new r1(this));
    }
    
    protected void setCharacterLimit(final int n) {
        this.runOnUiThread((Runnable)new f1(this, n));
    }
    
    protected void setHideInputField(final boolean b) {
        this.runOnUiThread((Runnable)new g1(this, b));
    }
    
    @Override
    public void setMainSurfaceViewAspectRatio(final float n) {
        this.runOnUiThread((Runnable)new w1(this, n));
    }
    
    public void setOnHandleFocusListener(final I mOnHandleFocusListener) {
        this.mOnHandleFocusListener = mOnHandleFocusListener;
    }
    
    protected void setSelection(final int n, final int n2) {
        this.runOnUiThread((Runnable)new h1(this, n, n2));
    }
    
    protected void setSoftInputStr(final String s) {
        this.runOnUiThread((Runnable)new e1(this, s));
    }
    
    protected void showSoftInput(final String s, final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final String s2, final int n2, final boolean b5, final boolean b6) {
        final Semaphore semaphore = new Semaphore(0);
        this.postOnUiThread((Runnable)new y1(this, this, s, n, b, b2, b3, b4, s2, n2, b5, b6, semaphore));
        try {
            if (!semaphore.tryAcquire(this.getSoftInputTimeout(), TimeUnit.MILLISECONDS)) {
                D.Log(6, "Timeout (" + this.getSoftInputTimeout() + " ms) while waiting softinput showing operation.");
            }
        }
        catch (final InterruptedException ex) {
            D.Log(6, "UI thread got interrupted while waiting softinput showing operation.");
        }
    }
    
    @Override
    void shutdown() {
        this.mProcessKillRequested = this.nativeDone();
        super.shutdown();
    }
    
    void updateGLDisplay(final int n, final Surface surface) {
        if (this.mMainDisplayOverride) {
            return;
        }
        this.updateDisplayInternal(n, surface);
    }
    
    public enum MemoryUsage
    {
        private static final MemoryUsage[] $VALUES;
        
        Critical("Critical", 3, 4), 
        High("High", 2, 3), 
        Low("Low", 0, 1), 
        Medium("Medium", 1, 2);
        
        public final int value;
        
        private static /* synthetic */ MemoryUsage[] $values() {
            return new MemoryUsage[] { MemoryUsage.Low, MemoryUsage.Medium, MemoryUsage.High, MemoryUsage.Critical };
        }
        
        static {
            $VALUES = $values();
        }
        
        private MemoryUsage(final String s, final int n, final int value) {
            this.value = value;
        }
    }
    
    public enum SynchronizationTimeout
    {
        private static final SynchronizationTimeout[] $VALUES;
        
        Destroy("Destroy", 2, 2), 
        Pause("Pause", 0, 0), 
        SurfaceDetach("SurfaceDetach", 1, 1);
        
        private int m_TimeoutMilliseconds;
        final int value;
        
        private static /* synthetic */ SynchronizationTimeout[] $values() {
            return new SynchronizationTimeout[] { SynchronizationTimeout.Pause, SynchronizationTimeout.SurfaceDetach, SynchronizationTimeout.Destroy };
        }
        
        static {
            $VALUES = $values();
        }
        
        private SynchronizationTimeout(final String s, final int n, final int value) {
            this.value = value;
            this.m_TimeoutMilliseconds = 2000;
        }
        
        public static void setTimeoutForAll(final int timeout) {
            final SynchronizationTimeout[] array = SynchronizationTimeout.class.getEnumConstants();
            for (int length = array.length, i = 0; i < length; ++i) {
                array[i].setTimeout(timeout);
            }
        }
        
        public int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }
        
        public void setTimeout(final int timeoutMilliseconds) {
            this.m_TimeoutMilliseconds = timeoutMilliseconds;
        }
    }
}
