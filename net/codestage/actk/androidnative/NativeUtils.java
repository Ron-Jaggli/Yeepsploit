package net.codestage.actk.androidnative;

import java.lang.reflect.Field;
import android.app.Activity;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.content.Context;

class NativeUtils
{
    static String LogTag = "ACTk";
    private static Context cachedApplicationContext;
    private static final char[] hexArray;
    
    static {
        hexArray = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    static String BytesToHex(final byte[] array) {
        final char[] array2 = new char[array.length * 2];
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i] ^ 0x90;
            final int n2 = i * 2;
            final char[] hexArray = NativeUtils.hexArray;
            array2[n2] = hexArray[(n & 0xFF) >>> 4];
            array2[n2 + 1] = hexArray[n & 0xF];
        }
        return new String(array2);
    }
    
    static boolean ContainsIgnoreCase(final String s, final String s2) {
        return s != null && s2 != null && s.toLowerCase().contains((CharSequence)s2.toLowerCase());
    }
    
    static String GetApkPath() throws PackageManager$NameNotFoundException, IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        GetApplicationContext();
        final Context cachedApplicationContext = NativeUtils.cachedApplicationContext;
        if (cachedApplicationContext == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get Unity context!");
            return null;
        }
        final String packageName = cachedApplicationContext.getPackageName();
        if (packageName == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get package name!");
            return null;
        }
        final PackageManager packageManager = NativeUtils.cachedApplicationContext.getPackageManager();
        if (packageManager == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get package manager!");
            return null;
        }
        final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
        if (applicationInfo == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get ApplicationInfo!");
            return null;
        }
        return applicationInfo.publicSourceDir;
    }
    
    static Context GetApplicationContext() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        final Context cachedApplicationContext = NativeUtils.cachedApplicationContext;
        if (cachedApplicationContext != null) {
            return cachedApplicationContext;
        }
        final Class<?> forName = Class.forName("com.unity3d.player.UnityPlayer");
        if (forName == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get com.unity3d.player.UnityPlayer class!");
            return null;
        }
        final Field declaredField = forName.getDeclaredField("currentActivity");
        if (declaredField == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get com.unity3d.player.UnityPlayer:currentActivity field!");
            return null;
        }
        final Activity activity = (Activity)declaredField.get((Object)null);
        if (activity == null) {
            Log.e(NativeUtils.LogTag, "[CodeHashGenerator ERROR] Couldn't get Activity from com.unity3d.player.UnityPlayer:currentActivity field!");
            return null;
        }
        return NativeUtils.cachedApplicationContext = activity.getApplicationContext();
    }
}
