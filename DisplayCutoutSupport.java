package com.unity3d.player;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.app.Activity;

class DisplayCutoutSupport
{
    private static final String CMD_ARG_FORCE_RENDER_OUTSIDE_SAFEAREA = "-force-render-outside-safearea=";
    private static final String RENDER_OUTSIDE_SAFEAREA = "unity.render-outside-safearea";
    private static int s_DisplayCutoutSupport = -1;
    
    static boolean getDisplayCutoutSupport(final Activity activity) {
        final int s_DisplayCutoutSupport = DisplayCutoutSupport.s_DisplayCutoutSupport;
        final boolean b = false;
        boolean b2 = false;
        if (s_DisplayCutoutSupport != -1) {
            if (s_DisplayCutoutSupport == 1) {
                b2 = true;
            }
            return b2;
        }
        try {
            final String stringExtra = activity.getIntent().getStringExtra("unity");
            if (stringExtra != null) {
                if (stringExtra.contains((CharSequence)"-force-render-outside-safearea=true")) {
                    DisplayCutoutSupport.s_DisplayCutoutSupport = 1;
                }
                else if (stringExtra.contains((CharSequence)"-force-render-outside-safearea=false")) {
                    DisplayCutoutSupport.s_DisplayCutoutSupport = 0;
                }
            }
            if (DisplayCutoutSupport.s_DisplayCutoutSupport == -1) {
                final ApplicationInfo applicationInfo = ((Context)activity).getPackageManager().getApplicationInfo(((Context)activity).getPackageName(), 128);
                if (applicationInfo != null) {
                    DisplayCutoutSupport.s_DisplayCutoutSupport = (applicationInfo.metaData.getBoolean("unity.render-outside-safearea") ? 1 : 0);
                }
            }
        }
        catch (final Exception ex) {
            DisplayCutoutSupport.s_DisplayCutoutSupport = 0;
        }
        boolean b3 = b;
        if (DisplayCutoutSupport.s_DisplayCutoutSupport == 1) {
            b3 = true;
        }
        return b3;
    }
    
    public static void setLayoutCutoutMode(final Activity activity) {
        if (activity != null && activity.getWindow() != null && PlatformSupport.PIE_SUPPORT) {
            int displayCutoutSupport = 0;
            Label_0054: {
                if (!PlatformSupport.VANILLA_ICE_CREAM_SUPPORT) {
                    if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
                        displayCutoutSupport = (getDisplayCutoutSupport(activity) ? 1 : 0);
                        break Label_0054;
                    }
                    if (!getDisplayCutoutSupport(activity)) {
                        displayCutoutSupport = 0;
                        break Label_0054;
                    }
                }
                displayCutoutSupport = 3;
            }
            activity.getWindow().getAttributes().layoutInDisplayCutoutMode = displayCutoutSupport;
        }
    }
}
