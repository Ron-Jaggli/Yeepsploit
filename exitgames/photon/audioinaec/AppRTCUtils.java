package com.exitgames.photon.audioinaec;

import android.util.Log;
import android.os.Build;
import android.os.Build$VERSION;

public final class AppRTCUtils
{
    private AppRTCUtils() {
    }
    
    public static void assertIsTrue(final boolean b) {
        if (b) {
            return;
        }
        throw new AssertionError((Object)"Expected condition to be true");
    }
    
    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }
    
    public static void logDeviceInfo(final String s) {
        Log.d(s, "Android SDK: " + Build$VERSION.SDK_INT + ", Release: " + Build$VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }
}
