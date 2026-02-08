package com.unity3d.player;

import android.app.Dialog;
import java.util.Map$Entry;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Looper;
import android.os.Build$VERSION;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.unity3d.player.a.a;
import com.unity3d.player.a.d;
import android.net.Uri;
import android.view.inputmethod.InputMethodSubtype;
import android.view.inputmethod.InputMethodManager;
import android.content.ClipData;
import android.content.pm.ApplicationInfo;
import android.view.SurfaceView;
import android.telephony.PhoneStateListener;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import android.view.InputEvent;
import android.content.res.TypedArray;
import android.provider.Settings$System;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Process;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;
import java.io.UnsupportedEncodingException;
import android.content.res.Configuration;
import android.view.Window;
import android.telephony.TelephonyManager;
import com.unity3d.player.a.g;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.widget.FrameLayout;
import org.fmod.FmodAndroidAudioManager;
import android.content.ClipboardManager;
import android.view.OrientationEventListener;
import android.os.Handler;
import android.content.Context;
import android.app.Activity;

public abstract class UnityPlayer implements IUnityPlayerLifecycleEvents
{
    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String AUTO_SET_GAME_STATE_ENABLE_METADATA_NAME = "unity.auto-set-game-state";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    public static Context currentContext;
    Activity mActivity;
    Context mContext;
    private A mContextType;
    Handler mHandler;
    private int mInitialScreenOrientation;
    private boolean mIsFullscreen;
    int mNaturalOrientation;
    private OrientationEventListener mOrientationListener;
    boolean mQuitting;
    E1 mState;
    private Q1 mVideoPlayerProxy;
    private GoogleARCoreApi m_ARCoreApi;
    private UnityAccessibilityDelegate m_AccessibilityDelegate;
    boolean m_AddPhoneCallListener;
    private AudioVolumeHandler m_AudioVolumeHandler;
    private Camera2Wrapper m_Camera2Wrapper;
    private ClipboardManager m_ClipboardManager;
    private A0 m_Cursor;
    private V0 m_FakeListener;
    private FmodAndroidAudioManager m_FmodAndroidAudioManager;
    private FrameLayout m_FrameLayout;
    private HFPStatus m_HFPStatus;
    private final ConcurrentLinkedQueue m_MainThreadJobs;
    private E m_NetworkConnectivity;
    private G m_OnBackPressedDispatcher;
    private OrientationLockListener m_OrientationLockListener;
    private HashMap m_PermissionRequests;
    Y0 m_PhoneCallListener;
    private g m_SplashScreen;
    TelephonyManager m_TelephonyManager;
    private Thread m_UIThread;
    protected IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Configuration prevConfig;
    
    static {
        new B0().a();
    }
    
    protected UnityPlayer(final Context context, final A mContextType, final IUnityPlayerLifecycleEvents unityPlayerLifecycleEvents) {
        this.mHandler = new Handler();
        this.mInitialScreenOrientation = -1;
        this.mIsFullscreen = true;
        this.mState = new E1();
        this.mOrientationListener = null;
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new Y0(this, null);
        this.m_ARCoreApi = null;
        this.m_FakeListener = new V0();
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_OrientationLockListener = null;
        this.m_FmodAndroidAudioManager = null;
        this.m_NetworkConnectivity = null;
        this.m_OnBackPressedDispatcher = null;
        this.m_Cursor = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.m_AccessibilityDelegate = null;
        this.m_MainThreadJobs = new ConcurrentLinkedQueue();
        this.m_UIThread = Thread.currentThread();
        this.mContext = context;
        this.mContextType = mContextType;
        IUnityPlayerLifecycleEvents unityPlayerLifecycleEvents2;
        if (unityPlayerLifecycleEvents != null) {
            unityPlayerLifecycleEvents2 = unityPlayerLifecycleEvents;
        }
        else {
            unityPlayerLifecycleEvents2 = this;
        }
        this.m_UnityPlayerLifecycleEvents = unityPlayerLifecycleEvents2;
        B0.a(getUnityNativeLibraryPath(context));
        UnityPlayer.currentContext = context;
        if (context instanceof Activity) {
            final Activity activity = (Activity)context;
            this.mActivity = activity;
            UnityPlayer.currentActivity = activity;
            this.mInitialScreenOrientation = activity.getRequestedOrientation();
        }
    }
    
    private void EarlyEnableFullScreenIfEnabled() {
        final Activity mActivity = this.mActivity;
        if (mActivity != null && mActivity.getWindow() != null && (this.getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false))) {
            this.applyWindowUIChanges(true);
        }
        DisplayCutoutSupport.setLayoutCutoutMode(this.mActivity);
    }
    
    private String GetGlViewContentDescription(final Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }
    
    public static void UnitySendMessage(final String s, final String s2, final String s3) {
        if (!E1.d()) {
            D.Log(5, "Native libraries not loaded - dropping message for " + s + "." + s2);
            return;
        }
        Label_0055: {
            if (s3 == null) {
                final byte[] bytes = null;
                break Label_0055;
            }
            try {
                final byte[] bytes = s3.getBytes("UTF-8");
                nativeUnitySendMessage(s, s2, bytes);
            }
            catch (final UnsupportedEncodingException ex) {}
        }
    }
    
    private void applyWindowInsets() {
        final Activity mActivity = this.mActivity;
        if (mActivity != null) {
            if (mActivity.getWindow() != null) {
                this.runOnUiThread((Runnable)new J0(this));
            }
        }
    }
    
    private void applyWindowUIChanges(final boolean b) {
        final Activity mActivity = this.mActivity;
        if (mActivity != null) {
            if (mActivity.getWindow() != null) {
                this.runOnUiThread((Runnable)new I0(this, b));
            }
        }
    }
    
    private void developmentPlayerInitialize() {
    }
    
    private void dispatchFrameLayoutPadding() {
        if (!E1.d()) {
            return;
        }
        final FrameLayout frameLayout = this.getFrameLayout();
        this.nativeViewPaddingChanged(0, ((View)frameLayout).getPaddingLeft(), ((View)frameLayout).getPaddingTop(), ((View)frameLayout).getPaddingRight(), ((View)frameLayout).getPaddingBottom());
    }
    
    private boolean getARCoreEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.arcore-enable");
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    private ActivityInfo getActivityInfo() {
        return ((Context)this.mActivity).getPackageManager().getActivityInfo(this.mActivity.getComponentName(), 128);
    }
    
    private boolean getLaunchFullscreen() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.launch-fullscreen");
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    private int getNaturalOrientation(final int n) {
        final int rotation = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (((rotation != 0 && rotation != 2) || n != 2) && ((rotation != 1 && rotation != 3) || n != 1)) {
            return 1;
        }
        return 0;
    }
    
    private String getProcessName() {
        final int myPid = Process.myPid();
        final List runningAppProcesses = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
            if (activityManager$RunningAppProcessInfo.pid == myPid) {
                return activityManager$RunningAppProcessInfo.processName;
            }
        }
        return null;
    }
    
    private float getScreenBrightness() {
        final Window window = this.m_Window;
        if (window == null) {
            return 1.0f;
        }
        final float screenBrightness = window.getAttributes().screenBrightness;
        if (screenBrightness >= 0.0f) {
            return screenBrightness;
        }
        final int int1 = Settings$System.getInt(this.getContext().getContentResolver(), "screen_brightness", 255);
        if (PlatformSupport.PIE_SUPPORT) {
            return (float)Math.max(0.0, Math.min(1.0, (Math.log((double)int1) * 19.811 - 9.411) / 100.0));
        }
        return int1 / 255.0f;
    }
    
    private static String getUnityNativeLibraryPath(final Context context) {
        return context.getApplicationInfo().nativeLibraryDir;
    }
    
    private void hideStatusBar() {
        final Activity mActivity = this.mActivity;
        if (mActivity != null) {
            mActivity.getWindow().setFlags(1024, 1024);
        }
    }
    
    private final native void initJni(final Context p0, final int p1);
    
    private void invokeOnMainThread(final Z0 z0) {
        if (this.isFinishing()) {
            return;
        }
        this.invokeOnMainThread((Runnable)z0);
    }
    
    private boolean isWindowTranslucent() {
        final Activity mActivity = this.mActivity;
        if (mActivity == null) {
            return false;
        }
        final TypedArray obtainStyledAttributes = ((Context)mActivity).getTheme().obtainStyledAttributes(new int[] { 16842840 });
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return boolean1;
    }
    
    private static String loadNative(final String ex) {
        final String string = (String)ex + "/libmain.so";
        try {
            try {
                System.load(string);
            }
            catch (final SecurityException ex) {}
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            final String s = "main";
            System.loadLibrary(s);
        }
        try {
            final String s = "main";
            System.loadLibrary(s);
            if (NativeLoader.load((String)ex)) {
                E1.e();
                return "";
            }
            D.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
            return "NativeLoader.load failure, Unity libraries were not loaded.";
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError2) {
            return logLoadLibMainError(string, unsatisfiedLinkError2.toString());
        }
    }
    
    private static String logLoadLibMainError(String string, final String s) {
        string = "Failed to load 'libmain.so'\n\n" + s;
        D.Log(6, string);
        return string;
    }
    
    private final native void nativeApplicationUnload();
    
    private final native void nativeHidePreservedContent();
    
    private final native boolean nativeInjectEvent(final InputEvent p0, final int p1);
    
    private final native boolean nativeIsAutorotationOn();
    
    private final native void nativeMuteMasterAudio(final boolean p0);
    
    private static native void nativeSetLaunchURL(final String p0);
    
    private static native void nativeUnitySendMessage(final String p0, final String p1, final byte[] p2);
    
    private final native void nativeViewPaddingChanged(final int p0, final int p1, final int p2, final int p3, final int p4);
    
    private void pauseJavaAndCallUnloadCallback() {
        this.runOnUiThread((Runnable)new H0(this));
    }
    
    static native void permissionResponseToNative(final long p0, final boolean p1);
    
    private static void preloadJavaPlugins() {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
            goto Label_0036;
        }
        catch (final LinkageError linkageError) {
            D.Log(6, "Java class preloading failed: " + ((Throwable)linkageError).getMessage());
        }
        catch (final ClassNotFoundException ex) {
            goto Label_0036;
        }
    }
    
    private void releasePointerCapture() {
        this.m_Cursor.a();
    }
    
    private void requestPointerCapture() {
        this.m_Cursor.b();
    }
    
    private void requestUserAuthorization(final String s, final long n) {
        if (s != null && !s.isEmpty()) {
            final Activity mActivity = this.mActivity;
            if (mActivity != null) {
                X0 x0;
                if (n != 0L) {
                    x0 = new X0(this, n);
                }
                else {
                    x0 = null;
                }
                UnityPermissions.requestUserPermissions(mActivity, new String[] { s }, x0);
            }
        }
    }
    
    private boolean runningOnUIThread() {
        return Thread.currentThread() == this.m_UIThread;
    }
    
    private void setBackButtonLeavesApp(final boolean b) {
        final G onBackPressedDispatcher = this.m_OnBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            if (!b) {
                onBackPressedDispatcher.registerOnBackPressedCallback();
            }
            else {
                onBackPressedDispatcher.unregisterOnBackPressedCallback();
            }
        }
    }
    
    private void setScreenBrightness(float max) {
        max = Math.max(0.04f, max);
        if (this.m_Window != null) {
            if (this.getScreenBrightness() != max) {
                this.runOnUiThread((Runnable)new U0(this, max));
            }
        }
    }
    
    private void startActivityIndicator(final int n) {
        this.postOnUiThread((Runnable)new K0(this, n));
    }
    
    private void stopActivityIndicator() {
        this.postOnUiThread((Runnable)new L0());
    }
    
    private boolean supportsWindowInsetController() {
        return PlatformSupport.RED_VELVET_CAKE_SUPPORT;
    }
    
    private void swapViews(final View view, final View view2) {
        boolean b;
        if (!this.mState.b()) {
            this.setupUnityToBePaused();
            b = true;
        }
        else {
            b = false;
        }
        final FrameLayout frameLayout = this.getFrameLayout();
        if (view != null) {
            final ViewParent parent = view.getParent();
            if (parent != frameLayout) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup)parent).removeView(view);
                }
                ((ViewGroup)frameLayout).addView(view);
                ((ViewGroup)frameLayout).bringChildToFront(view);
                view.setVisibility(0);
            }
        }
        if (view2 != null && view2.getParent() == frameLayout) {
            view2.setVisibility(8);
            ((ViewGroup)frameLayout).removeView(view2);
        }
        if (b) {
            this.setupUnityToBeResumed();
        }
    }
    
    private static void unloadNative() {
        if (!E1.d()) {
            return;
        }
        if (NativeLoader.unload()) {
            E1.f();
            return;
        }
        throw new UnsatisfiedLinkError("Unable to unload libraries from libmain.so");
    }
    
    public void addPermissionRequest(final PermissionRequest permissionRequest) {
        synchronized (this) {
            if (this.m_PermissionRequests == null) {
                this.m_PermissionRequests = new HashMap();
            }
            int n = 1;
            Integer value;
            while (true) {
                value = n;
                if (!this.m_PermissionRequests.containsKey((Object)value)) {
                    break;
                }
                ++n;
            }
            this.m_PermissionRequests.put((Object)value, (Object)permissionRequest);
            if (this.m_PermissionRequests.size() == 1) {
                this.requestPermissionsFromActivity(permissionRequest.getPermissionNames(), value);
            }
        }
    }
    
    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen((PhoneStateListener)this.m_PhoneCallListener, 32);
    }
    
    public boolean addViewToPlayer(final View view, final boolean b) {
        final View view2 = this.getView();
        View view3;
        if (b) {
            view3 = view2;
        }
        else {
            view3 = null;
        }
        this.swapViews(view, view3);
        final FrameLayout frameLayout = this.getFrameLayout();
        final ViewParent parent = view.getParent();
        final boolean b2 = true;
        final boolean b3 = parent == frameLayout;
        final boolean b4 = b && view2.getParent() == null;
        final boolean b5 = view2.getParent() == frameLayout;
        boolean b6 = false;
        Label_0119: {
            if (b3) {
                b6 = b2;
                if (b4) {
                    break Label_0119;
                }
                if (b5) {
                    b6 = b2;
                    break Label_0119;
                }
            }
            b6 = false;
        }
        if (!b6) {
            if (!b3) {
                D.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if (!b4 && !b5) {
                D.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return b6;
    }
    
    protected void applySurfaceViewSettings(final SurfaceView surfaceView) {
        if (this.isWindowTranslucent()) {
            surfaceView.getHolder().setFormat(-3);
            surfaceView.setZOrderOnTop(true);
        }
        else {
            surfaceView.getHolder().setFormat(-1);
        }
    }
    
    protected boolean canPauseUnity() {
        return this.mState.c() || !this.mState.b();
    }
    
    protected boolean canResumeUnity() {
        final Activity mActivity = this.mActivity;
        return this.mState.a(mActivity != null && MultiWindowSupport.isInMultiWindowMode(mActivity));
    }
    
    abstract void cleanupResourcesForDestroy();
    
    public void configurationChanged(final Configuration configuration) {
        final int diff = this.prevConfig.diff(configuration);
        if ((diff & 0x100) != 0x0 || (diff & 0x400) != 0x0 || (diff & 0x800) != 0x0 || (diff & 0x80) != 0x0) {
            this.nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration);
        final Q1 mVideoPlayerProxy = this.mVideoPlayerProxy;
        if (mVideoPlayerProxy != null) {
            mVideoPlayerProxy.a();
        }
        final UnityAccessibilityDelegate accessibilityDelegate = this.m_AccessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.a(configuration);
        }
    }
    
    public void destroy() {
        final Camera2Wrapper camera2Wrapper = this.m_Camera2Wrapper;
        if (camera2Wrapper != null) {
            camera2Wrapper.closeCamera2();
            this.m_Camera2Wrapper = null;
        }
        final HFPStatus hfpStatus = this.m_HFPStatus;
        if (hfpStatus != null) {
            hfpStatus.b();
            this.m_HFPStatus = null;
        }
        final FmodAndroidAudioManager fmodAndroidAudioManager = this.m_FmodAndroidAudioManager;
        if (fmodAndroidAudioManager != null) {
            fmodAndroidAudioManager.setActivity((Activity)null);
        }
        final E networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            networkConnectivity.a();
            this.m_NetworkConnectivity = null;
        }
        final G onBackPressedDispatcher = this.m_OnBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.unregisterOnBackPressedCallback();
            this.m_OnBackPressedDispatcher = null;
        }
        this.mQuitting = true;
        if (!this.mState.b()) {
            this.setupUnityToBePaused();
        }
        this.cleanupResourcesForDestroy();
        unloadNative();
    }
    
    protected void disableLogger() {
        D.a = true;
    }
    
    void disableStaticSplashScreen() {
        this.runOnUiThread((Runnable)new O0(this));
    }
    
    protected void executeMainThreadJobs() {
        while (true) {
            final Runnable runnable = (Runnable)this.m_MainThreadJobs.poll();
            if (runnable == null) {
                break;
            }
            runnable.run();
        }
    }
    
    void finish() {
        final Activity mActivity = this.mActivity;
        if (mActivity != null && !mActivity.isFinishing()) {
            this.mActivity.finish();
        }
    }
    
    Activity getActivity() {
        return this.mActivity;
    }
    
    ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128);
    }
    
    boolean getAutoReportFullyDrawnEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.auto-report-fully-drawn");
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    boolean getAutoSetGameStateEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.auto-set-game-state");
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    protected String getClipboardText() {
        final ClipData primaryClip = this.m_ClipboardManager.getPrimaryClip();
        String string;
        if (primaryClip != null) {
            string = primaryClip.getItemAt(0).coerceToText(this.mContext).toString();
        }
        else {
            string = "";
        }
        return string;
    }
    
    public Context getContext() {
        return this.mContext;
    }
    
    A getContextType() {
        return this.mContextType;
    }
    
    public FrameLayout getFrameLayout() {
        return this.m_FrameLayout;
    }
    
    protected String getKeyboardLayout() {
        final InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager)this.mContext.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        final String a = C.a(currentInputMethodSubtype);
        if (a != null && !a.equals((Object)"")) {
            return a;
        }
        return currentInputMethodSubtype.getMode() + " " + currentInputMethodSubtype.getExtraValue();
    }
    
    protected String getLaunchURL() {
        final Activity mActivity = this.mActivity;
        String string = null;
        if (mActivity == null) {
            return null;
        }
        final Uri data = mActivity.getIntent().getData();
        if (data != null) {
            string = data.toString();
        }
        return string;
    }
    
    protected int getNetworkConnectivity() {
        final E networkConnectivity = this.m_NetworkConnectivity;
        if (networkConnectivity != null) {
            return networkConnectivity.b();
        }
        E networkConnectivity2;
        if (PlatformSupport.NOUGAT_SUPPORT) {
            networkConnectivity2 = new d(this.mContext);
        }
        else {
            networkConnectivity2 = new E(this.mContext);
        }
        this.m_NetworkConnectivity = networkConnectivity2;
        return this.m_NetworkConnectivity.b();
    }
    
    public String getNetworkProxySettings(String s) {
        String s2;
        if (s.startsWith("http:")) {
            s2 = "http.proxyHost";
            s = "http.proxyPort";
        }
        else {
            if (!s.startsWith("https:")) {
                return null;
            }
            s2 = "https.proxyHost";
            s = "https.proxyPort";
        }
        final String property = System.getProperties().getProperty(s2);
        if (property != null) {
            if (!"".equals((Object)property)) {
                final StringBuilder sb = new StringBuilder(property);
                s = System.getProperties().getProperty(s);
                if (s != null && !"".equals((Object)s)) {
                    sb.append(":").append(s);
                }
                s = System.getProperties().getProperty("http.nonProxyHosts");
                if (s != null && !"".equals((Object)s)) {
                    sb.append('\n').append(s);
                }
                return sb.toString();
            }
        }
        return null;
    }
    
    boolean getSplashEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.splash-enable");
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    protected int getSplashMode() {
        try {
            return this.getApplicationInfo().metaData.getInt("unity.splash-mode");
        }
        catch (final Exception ex) {
            return 0;
        }
    }
    
    String getState() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.mState.toString() + "\n");
        sb.append(String.format("m_AudioVolumeHandler = %b", new Object[] { this.m_AudioVolumeHandler }) + "\n");
        sb.append(String.format("m_OrientationLockListener = %b", new Object[] { this.m_OrientationLockListener }) + "\n");
        return sb.toString();
    }
    
    public abstract SurfaceView getSurfaceView();
    
    protected int getUaaLLaunchProcessType() {
        final String processName = this.getProcessName();
        return (processName != null && !processName.equals((Object)this.mContext.getPackageName())) ? 1 : 0;
    }
    
    public abstract View getView();
    
    abstract boolean handleFocus(final boolean p0);
    
    abstract void hidePreservedContent();
    
    protected void initialize(final FrameLayout frameLayout) {
        this.m_FrameLayout = frameLayout;
        this.EarlyEnableFullScreenIfEnabled();
        final Configuration configuration = ((View)this.getFrameLayout()).getResources().getConfiguration();
        this.prevConfig = configuration;
        this.mNaturalOrientation = this.getNaturalOrientation(configuration.orientation);
        if (this.mActivity != null && this.getSplashEnabled()) {
            final g splashScreen = new g(this.mContext, a.b(3)[this.getSplashMode()]);
            this.m_SplashScreen = splashScreen;
            ((ViewGroup)this.m_FrameLayout).addView((View)splashScreen);
            ((ViewGroup)this.m_FrameLayout).bringChildToFront((View)this.m_SplashScreen);
        }
        preloadJavaPlugins();
        final String loadNative = loadNative(getUnityNativeLibraryPath(this.mContext));
        if (!E1.d()) {
            D.Log(6, "Your hardware does not support this application.");
            final AlertDialog create = new AlertDialog$Builder(this.mContext).setTitle((CharSequence)"Failure to initialize!").setPositiveButton((CharSequence)"OK", (DialogInterface$OnClickListener)new M0(this)).setMessage((CharSequence)("Your hardware does not support this application.\n\n" + loadNative + "\n\n Press OK to quit.")).create();
            ((Dialog)create).setCancelable(false);
            ((Dialog)create).show();
            return;
        }
        this.initJni(this.mContext, this.mContextType.a);
        this.mState.d(true);
        this.mQuitting = false;
        this.developmentPlayerInitialize();
        this.hideStatusBar();
        this.m_TelephonyManager = (TelephonyManager)this.mContext.getSystemService("phone");
        this.m_ClipboardManager = (ClipboardManager)this.mContext.getSystemService("clipboard");
        this.m_Camera2Wrapper = new Camera2Wrapper(this.mContext);
        this.m_HFPStatus = new HFPStatus(this.mContext);
        this.m_Cursor = new A0(this);
        (this.m_FmodAndroidAudioManager = FmodAndroidAudioManager.getInstance()).setActivity(this.mActivity);
        this.m_OnBackPressedDispatcher = H.a(this.getContext(), 1, (Runnable)new N0(this));
        final Activity mActivity = this.mActivity;
        if (mActivity != null) {
            this.m_Window = mActivity.getWindow();
        }
    }
    
    protected boolean initializeGoogleAr() {
        if (this.m_ARCoreApi == null && this.mActivity != null && this.getARCoreEnabled()) {
            (this.m_ARCoreApi = new GoogleARCoreApi()).initializeARCore(this.mActivity);
            if (!this.mState.b()) {
                this.m_ARCoreApi.resumeARCore();
            }
        }
        return false;
    }
    
    public boolean injectEvent(final InputEvent inputEvent) {
        return this.injectEvent(inputEvent, 0);
    }
    
    public boolean injectEvent(final InputEvent inputEvent, final int n) {
        return E1.d() && this.nativeInjectEvent(inputEvent, n);
    }
    
    public void invokeOnMainThread(final Runnable runnable) {
        if (!E1.d()) {
            return;
        }
        if (!this.runningOnUIThread() && this.runningOnMainThread()) {
            runnable.run();
        }
        else {
            this.m_MainThreadJobs.add((Object)runnable);
        }
    }
    
    protected boolean isFinishing() {
        if (this.mQuitting) {
            return true;
        }
        final Activity mActivity = this.mActivity;
        if (mActivity != null) {
            this.mQuitting = mActivity.isFinishing();
        }
        return this.mQuitting;
    }
    
    boolean isNativeInitialized() {
        return E1.d() && this.mState.a();
    }
    
    protected boolean isUaaLUseCase() {
        final Activity mActivity = this.mActivity;
        boolean b2;
        final boolean b = b2 = false;
        if (mActivity != null) {
            final String callingPackage = mActivity.getCallingPackage();
            b2 = b;
            if (callingPackage != null) {
                b2 = b;
                if (callingPackage.equals((Object)this.mContext.getPackageName())) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    protected void kill() {
        D.Log(4, "Quitting process");
        Process.killProcess(Process.myPid());
    }
    
    protected boolean loadLibrary(final String s) {
        boolean b = false;
        try {
            System.loadLibrary(s);
            b = true;
            return b;
        }
        catch (final UnsatisfiedLinkError | Exception ex) {
            return b;
        }
    }
    
    public void newIntent(final Intent intent) {
        this.setLaunchURL(intent.getData());
    }
    
    abstract void onOrientationChanged(final int p0, final int p1);
    
    public void onPause() {
        MultiWindowSupport.saveMultiWindowMode(this.mActivity);
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        this.setupUnityToBePaused();
    }
    
    public void onResume() {
        if (MultiWindowSupport.isInMultiWindowMode(this.mActivity) && !MultiWindowSupport.isMultiWindowModeChangedToTrue(this.mActivity)) {
            return;
        }
        this.setupUnityToBeResumed();
    }
    
    public void onStart() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        this.setupUnityToBeResumed();
    }
    
    public void onStop() {
        if (!MultiWindowSupport.isInMultiWindowMode(this.mActivity)) {
            return;
        }
        this.setupUnityToBePaused();
    }
    
    @Override
    public void onUnityPlayerQuitted() {
    }
    
    @Override
    public void onUnityPlayerUnloaded() {
    }
    
    public void pause() {
        this.setupUnityToBePaused();
    }
    
    void pauseUnity() {
        this.mState.c(false);
        this.mState.e(true);
    }
    
    public void permissionResponse(final Activity activity, int i, final String[] array, final int[] array2) {
        synchronized (this) {
            if (this.m_PermissionRequests == null) {
                return;
            }
            final Integer value = i;
            final PermissionRequest permissionRequest = (PermissionRequest)this.m_PermissionRequests.get((Object)value);
            if (permissionRequest == null) {
                return;
            }
            this.m_PermissionRequests.remove((Object)value);
            final String[] permissionNames = permissionRequest.getPermissionNames();
            final int[] array3 = new int[permissionNames.length];
            int j = 0;
        Label_0076:
            while (j < array.length) {
                final String s = array[j];
                while (true) {
                    int n;
                    for (i = 0; i < permissionNames.length; ++i) {
                        if (s.equals((Object)permissionNames[i])) {
                            n = i;
                            if (n < 0) {
                                D.Log(6, "Permission not found in request: " + s);
                            }
                            else {
                                Label_0201: {
                                    if (array2[j] == 0) {
                                        i = 1;
                                    }
                                    else {
                                        if (Build$VERSION.SDK_INT < 30) {
                                            if (!UnityPermissions.shouldShowRequestPermissionRationale(activity, s)) {
                                                i = 3;
                                                break Label_0201;
                                            }
                                        }
                                        i = 2;
                                    }
                                }
                                array3[n] = i;
                            }
                            ++j;
                            continue Label_0076;
                        }
                    }
                    n = -1;
                    continue;
                }
            }
            this.invokeOnMainThread((Runnable)new P0(permissionRequest, permissionNames, array3));
            this.triggerNextPermissionRequest();
        }
    }
    
    void postOnUiThread(final Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
    
    public void removeViewFromPlayer(final View view) {
        final View view2 = this.getView();
        this.swapViews(view2, view);
        final ViewParent parent = view.getParent();
        boolean b = true;
        final boolean b2 = parent == null;
        if (view2.getParent() != this.getFrameLayout()) {
            b = false;
        }
        if (!b2 || !b) {
            if (!b2) {
                D.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
            }
            if (!b) {
                D.Log(6, "removeViewFromPlayer: Failure adding old view to hierarchy");
            }
        }
    }
    
    public void reportError(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(": ");
        sb.append(s2);
        D.Log(6, sb.toString());
    }
    
    void reportFullyDrawn() {
        this.mActivity.reportFullyDrawn();
    }
    
    public void requestPermissionsFromActivity(final String[] array, final int n) {
        this.mActivity.requestPermissions(array, n);
    }
    
    public void resume() {
        this.setupUnityToBeResumed();
    }
    
    void resumeUnity() {
        this.mState.c(true);
    }
    
    void runOnAnonymousThread(final Runnable runnable) {
        new Thread(runnable).start();
    }
    
    void runOnUiThread(final Runnable runnable) {
        final Activity mActivity = this.mActivity;
        if (mActivity != null) {
            mActivity.runOnUiThread(runnable);
        }
        else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable);
        }
        else {
            runnable.run();
        }
    }
    
    public abstract boolean runningOnMainThread();
    
    protected void setAccessibilityDelegate(final UnityAccessibilityDelegate accessibilityDelegate) {
        this.m_AccessibilityDelegate = accessibilityDelegate;
    }
    
    protected void setClipboardText(final String s) {
        this.m_ClipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"Text", (CharSequence)s));
    }
    
    void setLaunchURL(final Uri uri) {
        String string;
        if (uri != null) {
            string = uri.toString();
        }
        else {
            string = null;
        }
        this.invokeOnMainThread((Runnable)new Q0(string));
    }
    
    public abstract void setMainSurfaceViewAspectRatio(final float p0);
    
    protected void setupUnityToBePaused() {
        final GoogleARCoreApi arCoreApi = this.m_ARCoreApi;
        if (arCoreApi != null) {
            arCoreApi.pauseARCore();
        }
        final Q1 mVideoPlayerProxy = this.mVideoPlayerProxy;
        if (mVideoPlayerProxy != null) {
            mVideoPlayerProxy.b();
        }
        final AudioVolumeHandler audioVolumeHandler = this.m_AudioVolumeHandler;
        if (audioVolumeHandler != null) {
            audioVolumeHandler.a();
            this.m_AudioVolumeHandler = null;
        }
        final OrientationLockListener orientationLockListener = this.m_OrientationLockListener;
        if (orientationLockListener != null) {
            orientationLockListener.a();
            this.m_OrientationLockListener = null;
        }
        final G onBackPressedDispatcher = this.m_OnBackPressedDispatcher;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.c = (onBackPressedDispatcher.a != null);
            onBackPressedDispatcher.unregisterOnBackPressedCallback();
        }
        if (this.canPauseUnity()) {
            this.pauseUnity();
        }
    }
    
    protected void setupUnityToBeResumed() {
        final GoogleARCoreApi arCoreApi = this.m_ARCoreApi;
        if (arCoreApi != null) {
            arCoreApi.resumeARCore();
        }
        this.mState.e(false);
        final Q1 mVideoPlayerProxy = this.mVideoPlayerProxy;
        if (mVideoPlayerProxy != null) {
            mVideoPlayerProxy.c();
        }
        if (this.canResumeUnity()) {
            this.resumeUnity();
        }
        if (this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
        if (this.m_OrientationLockListener == null && E1.d()) {
            this.m_OrientationLockListener = new OrientationLockListener(this.mContext);
        }
        final G onBackPressedDispatcher = this.m_OnBackPressedDispatcher;
        if (onBackPressedDispatcher != null && onBackPressedDispatcher.c) {
            onBackPressedDispatcher.registerOnBackPressedCallback();
        }
    }
    
    boolean shouldReportFullyDrawn() {
        return this.mActivity != null && this.getAutoReportFullyDrawnEnabled();
    }
    
    boolean shouldSetGameState() {
        final boolean tiramisu_SUPPORT = PlatformSupport.TIRAMISU_SUPPORT;
        final boolean b = false;
        if (!tiramisu_SUPPORT) {
            return false;
        }
        if (this.mActivity == null) {
            return false;
        }
        boolean b2 = b;
        if (!this.isUaaLUseCase()) {
            b2 = b;
            if (this.getAutoSetGameStateEnabled()) {
                b2 = b;
                if (UnityGameManager.getGameManager(UnityPlayer.currentContext) != null) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    protected boolean showVideoPlayer(final String s, final int n, final int n2, final int n3, final boolean b, final int n4, final int n5) {
        if (this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new Q1(this);
        }
        final boolean a = this.mVideoPlayerProxy.a(this.mContext, s, n, n2, n3, b, n4, n5, new R0(this));
        if (a) {
            this.runOnUiThread((Runnable)new S0(this));
        }
        return a;
    }
    
    void shutdown() {
        this.mState.d(false);
    }
    
    protected boolean skipPermissionsDialog() {
        final Activity mActivity = this.mActivity;
        return mActivity != null && UnityPermissions.skipPermissionsDialog(mActivity);
    }
    
    public boolean startOrientationListener(final int n) {
        String s;
        if (this.mOrientationListener != null) {
            s = "Orientation Listener already started.";
        }
        else {
            final T0 mOrientationListener = new T0(this, this.mContext, n);
            this.mOrientationListener = mOrientationListener;
            if (mOrientationListener.canDetectOrientation()) {
                this.mOrientationListener.enable();
                return true;
            }
            s = "Orientation Listener cannot detect orientation.";
        }
        D.Log(5, s);
        return false;
    }
    
    public boolean stopOrientationListener() {
        final OrientationEventListener mOrientationListener = this.mOrientationListener;
        if (mOrientationListener == null) {
            D.Log(5, "Orientation Listener was not started.");
            return false;
        }
        mOrientationListener.disable();
        this.mOrientationListener = null;
        return true;
    }
    
    protected void toggleGyroscopeSensor(final boolean b) {
        final SensorManager sensorManager = (SensorManager)this.mContext.getSystemService("sensor");
        final Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        final V0 fakeListener = this.m_FakeListener;
        if (b) {
            sensorManager.registerListener((SensorEventListener)fakeListener, defaultSensor, 1);
        }
        else {
            sensorManager.unregisterListener((SensorEventListener)fakeListener);
        }
    }
    
    public void triggerNextPermissionRequest() {
        synchronized (this) {
            final HashMap permissionRequests = this.m_PermissionRequests;
            if (permissionRequests != null) {
                final Iterator iterator = permissionRequests.entrySet().iterator();
                if (iterator != null && iterator.hasNext()) {
                    final Map$Entry map$Entry = (Map$Entry)iterator.next();
                    this.requestPermissionsFromActivity(((PermissionRequest)map$Entry.getValue()).getPermissionNames(), (int)map$Entry.getKey());
                }
            }
        }
    }
    
    public void unload() {
        this.nativeApplicationUnload();
    }
    
    public void windowFocusChanged(final boolean b) {
        this.mState.b(b);
        if (!this.handleFocus(b)) {
            return;
        }
        if (this.canResumeUnity()) {
            this.resumeUnity();
        }
    }
}
