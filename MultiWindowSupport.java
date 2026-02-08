package com.unity3d.player;

import android.app.Activity;

public class MultiWindowSupport
{
    private static boolean s_LastMultiWindowMode;
    
    public static boolean isInMultiWindowMode(final Activity activity) {
        return activity != null && PlatformSupport.NOUGAT_SUPPORT && activity.isInMultiWindowMode();
    }
    
    public static boolean isMultiWindowModeChangedToTrue(final Activity activity) {
        return !MultiWindowSupport.s_LastMultiWindowMode && isInMultiWindowMode(activity);
    }
    
    public static void saveMultiWindowMode(final Activity activity) {
        MultiWindowSupport.s_LastMultiWindowMode = isInMultiWindowMode(activity);
    }
}
