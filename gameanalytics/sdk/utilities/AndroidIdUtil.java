package com.gameanalytics.sdk.utilities;

import android.provider.Settings$Secure;
import android.content.Context;

public class AndroidIdUtil
{
    public static String getAndroidId(final Context context) {
        try {
            return Settings$Secure.getString(context.getContentResolver(), "android_id");
        }
        catch (final SecurityException ex) {
            return null;
        }
    }
}
