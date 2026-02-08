package net.codestage.actk.androidnative;

import java.util.concurrent.TimeUnit;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.Context;
import android.os.Build$VERSION;

public class ACTkAndroidRoutines
{
    public static String GetPackageInstallerName() throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, PackageManager$NameNotFoundException {
        final Context getApplicationContext = NativeUtils.GetApplicationContext();
        if (getApplicationContext == null) {
            return null;
        }
        final PackageManager packageManager = getApplicationContext.getPackageManager();
        final String packageName = getApplicationContext.getPackageName();
        String s;
        if (Build$VERSION.SDK_INT >= 30) {
            s = packageManager.getInstallSourceInfo(packageName).getInstallingPackageName();
        }
        else {
            s = packageManager.getInstallerPackageName(packageName);
        }
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        return s2;
    }
    
    public static long GetSystemCurrentTimeMs() {
        return System.currentTimeMillis();
    }
    
    public static long GetSystemNanoTime() {
        return System.nanoTime();
    }
    
    public static long GetSystemNanoTimeMs() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }
}
