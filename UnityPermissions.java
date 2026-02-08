package com.unity3d.player;

import android.content.pm.ApplicationInfo;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageItemInfo;

public class UnityPermissions
{
    private static final String SKIP_DIALOG_METADATA_NAME = "unityplayer.SkipPermissionsDialog";
    
    private static boolean checkInfoForMetadata(final PackageItemInfo packageItemInfo) {
        try {
            return packageItemInfo.metaData.getBoolean("unityplayer.SkipPermissionsDialog");
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static boolean hasUserAuthorizedPermission(final Context context, final String s) {
        return context.checkCallingOrSelfPermission(s) == 0;
    }
    
    public static void requestUserPermissions(final Activity activity, final String[] array, final IPermissionRequestCallbacks permissionRequestCallbacks) {
        if (activity != null && array != null) {
            if (array.length != 0) {
                if (activity instanceof IUnityPermissionRequestSupport) {
                    ((IUnityPermissionRequestSupport)activity).requestPermissions(new PermissionRequest(array, permissionRequestCallbacks));
                }
                else {
                    activity.requestPermissions(array, 96489);
                }
            }
        }
    }
    
    static boolean shouldShowRequestPermissionRationale(final Activity activity, final String s) {
        return activity.shouldShowRequestPermissionRationale(s);
    }
    
    public static boolean skipPermissionsDialog(final Activity activity) {
        try {
            final PackageManager packageManager = ((Context)activity).getPackageManager();
            final ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), 128);
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(((Context)activity).getPackageName(), 128);
            if (checkInfoForMetadata((PackageItemInfo)activityInfo) || checkInfoForMetadata((PackageItemInfo)applicationInfo)) {
                return true;
            }
            return false;
        }
        catch (final Exception ex) {
            return false;
        }
    }
}
