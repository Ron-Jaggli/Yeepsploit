package com.unity.oculus;

import android.view.SurfaceHolder;
import android.view.Surface;
import android.util.Log;
import com.unity3d.player.UnityPlayer;
import java.util.Locale;
import android.os.Build;
import android.view.SurfaceView;
import android.app.Activity;
import android.view.SurfaceHolder$Callback;

public class OculusUnity implements SurfaceHolder$Callback
{
    Activity activity;
    SurfaceView glView;
    
    public static boolean getIsOnOculusHardware() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).contains((CharSequence)"oculus");
    }
    
    public static boolean getLateLatching() {
        return getManifestSetting("com.unity.xr.oculus.LateLatching");
    }
    
    public static boolean getLateLatchingDebug() {
        return getManifestSetting("com.unity.xr.oculus.LateLatchingDebug");
    }
    
    public static boolean getLowOverheadMode() {
        return getManifestSetting("com.unity.xr.oculus.LowOverheadMode");
    }
    
    public static boolean getManifestSetting(final String s) {
        boolean boolean1;
        try {
            final Activity currentActivity = UnityPlayer.currentActivity;
            boolean1 = currentActivity.getPackageManager().getApplicationInfo(currentActivity.getPackageName(), 128).metaData.getBoolean(s);
        }
        catch (final Exception ex) {
            Log.d("Unity", "Oculus XR Plugin init error");
            boolean1 = false;
        }
        return boolean1;
    }
    
    public static void loadLibrary(final String s) {
        Log.d("Unity", "loading library " + s);
        System.loadLibrary(s);
    }
    
    private native void surfaceCreated(final Surface p0);
    
    public void destroyOculus() {
        final SurfaceView glView = this.glView;
        if (glView != null) {
            glView.getHolder().removeCallback((SurfaceHolder$Callback)this);
        }
    }
    
    public void initOculus() {
        Log.d("Unity", "initOculus Java!");
        (this.activity = UnityPlayer.currentActivity).runOnUiThread((Runnable)new OculusUnity$$ExternalSyntheticLambda0(this));
    }
    
    public void pauseOculus() {
    }
    
    public void resumeOculus() {
    }
    
    public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.surfaceCreated(surfaceHolder.getSurface());
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
    }
}
