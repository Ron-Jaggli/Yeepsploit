package com.unity3d.player;

import java.util.List;
import android.app.ApplicationExitInfo;
import android.app.ActivityManager;
import android.app.Activity;

class ApplicationExitInfoProvider
{
    public static ApplicationExitInfoBase[] getHistoricalProcessExitReasons(final Activity activity, final String s, int n, int size) {
        final ActivityManager activityManager = (ActivityManager)activity.getSystemService((Class)ActivityManager.class);
        ApplicationExitInfoBase[] array2;
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            final List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(s, n, size);
            size = historicalProcessExitReasons.size();
            final ApplicationExitInfoBase[] array = new ApplicationExitInfoBase[size];
            n = 0;
            while (true) {
                array2 = array;
                if (n >= size) {
                    break;
                }
                array[n] = new ApplicationExitInfoWrapper((ApplicationExitInfo)historicalProcessExitReasons.get(n));
                ++n;
            }
        }
        else {
            D.Log(5, "ApplicationExitInfoProvider: ApplicationExitInfo is only available from api 30 (Android 11)");
            array2 = null;
        }
        return array2;
    }
    
    public static void setProcessStateSummary(final Activity activity, final byte[] processStateSummary) {
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            ((ActivityManager)activity.getSystemService((Class)ActivityManager.class)).setProcessStateSummary(processStateSummary);
        }
    }
}
