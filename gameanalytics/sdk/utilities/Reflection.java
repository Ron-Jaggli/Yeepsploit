package com.gameanalytics.sdk.utilities;

import com.gameanalytics.sdk.logging.GALogger;
import java.lang.reflect.Method;
import com.gameanalytics.sdk.device.GADevice;
import android.content.Context;

public class Reflection
{
    public static String getAdId(String s, final Context context) {
        if (GADevice.doTrackGAID) {
            try {
                s = (String)invokeInstanceMethod(getAdvertisingInfoObject(s, context), "getId", null, new Object[0]);
                return s;
            }
            finally {
                final Throwable t;
                t.printStackTrace();
            }
        }
        return null;
    }
    
    private static Object getAdvertisingInfoObject(final String s, final Context context) throws Exception {
        return invokeStaticMethod(s + ".AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class }, context);
    }
    
    public static Object invokeInstanceMethod(final Object o, final String s, final Class[] array, final Object... array2) throws Exception {
        return invokeMethod(o.getClass(), s, o, array, array2);
    }
    
    public static Object invokeMethod(final Class clazz, final String name, final Object o, final Class[] parameterTypes, final Object... array) throws Exception {
        final Method method = clazz.getMethod(name, (Class[])parameterTypes);
        if (method == null) {
            return null;
        }
        return method.invoke(o, array);
    }
    
    public static Object invokeStaticMethod(final String className, final String s, final Class[] array, final Object... array2) throws Exception {
        return invokeMethod(Class.forName(className), s, null, array, array2);
    }
    
    public static Boolean isInstantApp(final Context context) {
        try {
            return (Boolean)invokeStaticMethod("com.google.android.instantapps.InstantApps", "isInstantApp", new Class[] { Context.class }, context);
        }
        finally {
            final Throwable t;
            GALogger.d("Could not find 'com.google.android.instantapps.InstantApps' class with 'isInstantApp' method: " + t.toString());
            return null;
        }
    }
    
    public static Boolean isLimitAdTrackingEnabled(final String s, final Context context) {
        try {
            return (Boolean)invokeInstanceMethod(getAdvertisingInfoObject(s, context), "isLimitAdTrackingEnabled", null, new Object[0]);
        }
        finally {
            return null;
        }
    }
}
