package com.gameanalytics.sdk;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.NoSuchAlgorithmException;
import com.gameanalytics.sdk.device.GADevice;
import java.security.MessageDigest;
import android.content.pm.PackageManager$NameNotFoundException;
import com.gameanalytics.sdk.utilities.Reflection;
import com.gameanalytics.sdk.errorreporter.ExceptionReporter;
import com.gameanalytics.sdk.state.GAState;
import android.os.Bundle;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.IntentFilter;
import android.content.Intent;
import android.content.BroadcastReceiver;
import com.gameanalytics.sdk.logging.GALogger;
import android.content.pm.PackageInfo;
import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import android.os.Build;
import android.content.Context;
import android.app.Activity;
import java.lang.ref.WeakReference;

public class GAPlatform
{
    private static String activityId = "";
    private static WeakReference<Activity> activityRef;
    private static Context appContext;
    private static boolean initialized;
    private static boolean registered;
    private static boolean usedResumed;
    private static boolean usedStopped;
    
    private static String bytesToHex(final byte[] array) {
        if (array.length == 0) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(String.format("%02x", new Object[] { array[0] }));
        for (int i = 1; i < array.length; ++i) {
            sb.append(String.format("%02x", new Object[] { array[i] }));
        }
        return sb.toString();
    }
    
    public static boolean checkReadAndWriteExternalPermission(final Context context) {
        final int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
        final int checkCallingOrSelfPermission2 = context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        return checkCallingOrSelfPermission == 0 && checkCallingOrSelfPermission2 == 0;
    }
    
    private static boolean checkReadPhoneStatePermission() {
        return GAPlatform.appContext.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }
    
    private static boolean checkRootMethod1() {
        final String tags = Build.TAGS;
        return tags != null && tags.contains((CharSequence)"test-keys");
    }
    
    private static boolean checkRootMethod2() {
        return new File("/system/app/Superuser.apk").exists();
    }
    
    private static boolean checkRootMethod3() {
        for (int i = 0; i < 8; ++i) {
            if (new File((new String[] { "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su" })[i]).exists()) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean checkRootMethod4() {
        Process exec = null;
        try {
            final Process process = exec = (exec = (exec = Runtime.getRuntime().exec(new String[] { "/system/xbin/which", "su" })));
            final InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            exec = process;
            final BufferedReader bufferedReader = new BufferedReader((Reader)inputStreamReader);
            exec = process;
            if (bufferedReader.readLine() != null) {
                if (process != null) {
                    process.destroy();
                }
                return true;
            }
        }
        finally {
            if (exec != null) {
                exec.destroy();
            }
            return false;
        }
    }
    
    private static int getAppBuild() {
        try {
            return getVersionCode(GAPlatform.appContext.getPackageManager().getPackageInfo(GAPlatform.appContext.getPackageName(), 0));
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    private static String getAppVersion() {
        try {
            return GAPlatform.appContext.getPackageManager().getPackageInfo(GAPlatform.appContext.getPackageName(), 0).versionName;
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static Context getApplicationContext() {
        return GAPlatform.appContext;
    }
    
    private static String getBundleIdentifier() {
        final String packageName = GAPlatform.appContext.getPackageName();
        if (packageName != null && !packageName.isEmpty()) {
            return packageName;
        }
        return "unassigned";
    }
    
    private static String getConnectionType() {
        return getConnectionType28AndAbove();
    }
    
    private static String getConnectionType22AndBelow() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)GAPlatform.appContext.getSystemService("connectivity");
        String s2;
        final String s = s2 = "offline";
        if (connectivityManager != null) {
            final NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            final NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null && networkInfo.isConnected()) {
                s2 = "wifi";
            }
            else {
                s2 = s;
                if (networkInfo2 != null) {
                    s2 = s;
                    if (networkInfo2.isConnected()) {
                        s2 = "wwan";
                    }
                }
            }
        }
        return s2;
    }
    
    private static String getConnectionType23AndAbove() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)GAPlatform.appContext.getSystemService("connectivity");
        if (connectivityManager != null) {
            final Network[] allNetworks = connectivityManager.getAllNetworks();
            for (int length = allNetworks.length, i = 0; i < length; ++i) {
                final NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    return "wwan";
                }
            }
        }
        return "offline";
    }
    
    private static String getConnectionType28AndAbove() {
        final ConnectivityManager connectivityManager = (ConnectivityManager)GAPlatform.appContext.getSystemService("connectivity");
        if (connectivityManager != null) {
            final Network[] allNetworks = connectivityManager.getAllNetworks();
            for (int length = allNetworks.length, i = 0; i < length; ++i) {
                final NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                    return "wwan";
                }
            }
        }
        return "offline";
    }
    
    private static int getVersionCode(final PackageInfo packageInfo) {
        return getVersionCode28AndAbove(packageInfo);
    }
    
    private static int getVersionCode27AndBelow(final PackageInfo packageInfo) {
        return packageInfo.versionCode;
    }
    
    private static int getVersionCode28AndAbove(final PackageInfo packageInfo) {
        return (int)packageInfo.getLongVersionCode();
    }
    
    public static void initialize(final Activity activity) {
        if (GAPlatform.initialized) {
            return;
        }
        if (activity == null) {
            GALogger.w("Cannot initialize as activity is null");
            return;
        }
        GAPlatform.initialized = true;
        GAPlatform.activityId = activity.getClass().getCanonicalName();
        checkReadAndWriteExternalPermission(GAPlatform.appContext = activity.getApplicationContext());
        String s;
        if (GAPlatform.appContext.getExternalCacheDir() != null && !isInstantApp(GAPlatform.appContext)) {
            GALogger.d("Using getExternalCacheDir()");
            s = GAPlatform.appContext.getExternalCacheDir().getPath();
        }
        else if (GAPlatform.appContext.getCacheDir() != null) {
            GALogger.d("Using getCacheDir()");
            s = GAPlatform.appContext.getCacheDir().getPath();
        }
        else {
            GALogger.d("Using getFilesDir()");
            s = GAPlatform.appContext.getFilesDir().getPath();
        }
        GameAnalytics.configureWritableFilePath(s);
        GameAnalytics.configureIsHacked(isDeviceRooted());
        updateAppSignature();
        updateChannelId();
        GameAnalytics.setConnectionType(getConnectionType());
        final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            public void onReceive(final Context context, final Intent intent) {
                GameAnalytics.setConnectionType(getConnectionType());
            }
        };
        if (!GAPlatform.registered) {
            GAPlatform.appContext.registerReceiver((BroadcastReceiver)broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            GAPlatform.registered = true;
        }
        activity.getApplication().registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new Application$ActivityLifecycleCallbacks(broadcastReceiver) {
            final BroadcastReceiver val$networkConnectionReceiver;
            
            public void onActivityCreated(final Activity activity, final Bundle bundle) {
            }
            
            public void onActivityDestroyed(final Activity activity) {
                final String canonicalName = activity.getClass().getCanonicalName();
                GALogger.d("onActivityDestroyed: " + canonicalName + " -- " + GAPlatform.activityId);
                if (canonicalName.equals((Object)GAPlatform.activityId)) {
                    if (GAPlatform.registered) {
                        GAPlatform.appContext.unregisterReceiver(this.val$networkConnectionReceiver);
                        GAPlatform.registered = false;
                    }
                    GALogger.d("onActivityDestroyed: " + (Object)activity);
                    onActivityStopped(activity);
                }
            }
            
            public void onActivityPaused(final Activity activity) {
                GALogger.d("onActivityPaused: " + activity.getClass().getCanonicalName());
                GAPlatform.usedResumed = false;
                GAPlatform.usedStopped = false;
            }
            
            public void onActivityResumed(final Activity activity) {
                final String canonicalName = activity.getClass().getCanonicalName();
                GAPlatform.usedResumed = true;
                GALogger.d("onActivityResumed: " + canonicalName + ", usedResumed=" + GAPlatform.usedResumed + ", usedStopped=" + GAPlatform.usedStopped);
                if (GAPlatform.usedStopped) {
                    onActivityResumed(activity);
                }
                GAPlatform.usedStopped = false;
            }
            
            public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
            }
            
            public void onActivityStarted(final Activity activity) {
            }
            
            public void onActivityStopped(final Activity activity) {
                final String canonicalName = activity.getClass().getCanonicalName();
                GAPlatform.usedStopped = true;
                GALogger.d("onActivityStopped: " + canonicalName + ", usedResumed=" + GAPlatform.usedResumed + ", usedStopped=" + GAPlatform.usedStopped);
                if (!GAPlatform.usedResumed) {
                    onActivityStopped(activity);
                }
            }
        });
        GameAnalytics.setBundleIdentifier(getBundleIdentifier());
        GameAnalytics.setAppVersion(getAppVersion());
        GameAnalytics.setAppBuild(getAppBuild());
        if (GAState.useErrorReporting()) {
            ExceptionReporter.register(GAPlatform.appContext);
        }
        GAPlatform.activityRef = (WeakReference<Activity>)new WeakReference((Object)activity);
    }
    
    private static boolean isDeviceRooted() {
        return checkRootMethod1() || checkRootMethod2() || checkRootMethod3() || checkRootMethod4();
    }
    
    static boolean isInitialized() {
        return GAPlatform.initialized;
    }
    
    private static boolean isInstantApp(final Context context) {
        final Boolean instantApp = Reflection.isInstantApp(context);
        return instantApp != null && instantApp;
    }
    
    public static boolean isReadPhoneStatePermissionPresentInManifest(final Context context) {
        final boolean b = false;
        boolean b2;
        try {
            final PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            String[] requestedPermissions;
            if (packageInfo != null) {
                requestedPermissions = packageInfo.requestedPermissions;
            }
            else {
                requestedPermissions = null;
            }
            b2 = b;
            if (requestedPermissions != null) {
                b2 = b;
                if (requestedPermissions.length > 0) {
                    final int length = requestedPermissions.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (requestedPermissions[n].equals((Object)"android.permission.READ_PHONE_STATE")) {
                            break;
                        }
                        ++n;
                    }
                    b2 = true;
                }
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {
            ex.printStackTrace();
            b2 = b;
        }
        return b2;
    }
    
    private static void onActivityResumed(final Activity activity) {
        if (!GAState.useManualSessionHandling()) {
            GameAnalytics.onResume();
        }
        else {
            GALogger.i("onActivityResumed: Not calling GameAnalytics.onResume() as using manual session handling");
        }
        GAState.setInForeground(true);
    }
    
    private static void onActivityStopped(final Activity activity) {
        if (!GAState.useManualSessionHandling()) {
            GameAnalytics.onStop();
        }
        else {
            GALogger.i("onActivityStopped: Not calling GameAnalytics.onStop() as using manual session handling");
        }
        GAState.setInForeground(false);
    }
    
    static void setLimitAdTrackingEnabled(final boolean b) {
        GameAnalytics.configureIsLimitedAdTracking(b);
    }
    
    private static void updateAppSignature() {
        updateAppSignature28AndAbove();
    }
    
    private static void updateAppSignature27AndBelow() {
        try {
            final PackageInfo packageInfo = GAPlatform.appContext.getPackageManager().getPackageInfo(GAPlatform.appContext.getPackageName(), 64);
            final MessageDigest instance = MessageDigest.getInstance("SHA");
            final Signature[] signatures = packageInfo.signatures;
            if (signatures.length > 0) {
                instance.update(signatures[0].toByteArray());
                GADevice.setAppSignature(new String(bytesToHex(instance.digest())));
            }
        }
        catch (final PackageManager$NameNotFoundException | NoSuchAlgorithmException | Exception ex) {}
    }
    
    private static void updateAppSignature28AndAbove() {
        try {
            final Signature[] apkContentsSigners = GAPlatform.appContext.getPackageManager().getPackageInfo(GAPlatform.appContext.getPackageName(), 134217728).signingInfo.getApkContentsSigners();
            final MessageDigest instance = MessageDigest.getInstance("SHA");
            if (apkContentsSigners.length > 0) {
                instance.update(apkContentsSigners[0].toByteArray());
                GADevice.setAppSignature(new String(bytesToHex(instance.digest())));
            }
        }
        catch (final PackageManager$NameNotFoundException | NoSuchAlgorithmException | Exception ex) {}
    }
    
    private static void updateChannelId() {
        final PackageManager packageManager = GAPlatform.appContext.getPackageManager();
        try {
            GADevice.setChannelId(packageManager.getInstallerPackageName(packageManager.getApplicationInfo(GAPlatform.appContext.getPackageName(), 0).packageName));
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static class FunctionInfo
    {
        static final int UNKNOWN_LINE = -1;
        public boolean appendModuleClassToMethodName;
        public String javaClass;
        public int line;
        public String method;
        public String module;
        
        public FunctionInfo() {
            this.module = "";
            this.method = "";
            this.javaClass = "";
            this.line = -1;
            this.appendModuleClassToMethodName = true;
            try {
                StackTraceElement[] stackTrace;
                int n;
                for (stackTrace = Thread.currentThread().getStackTrace(), n = 3; n < stackTrace.length && stackTrace[n].toString().contains((CharSequence)"com.gameanalytics.sdk"); ++n) {}
                this.method = stackTrace[n].getMethodName();
                this.line = stackTrace[n].getLineNumber();
                this.javaClass = stackTrace[n].getClassName();
                this.module = Class.forName(stackTrace[n].getClassName()).getPackage().getName();
                if (this.appendModuleClassToMethodName && this.method != null && this.javaClass != null) {
                    this.method = this.javaClass + '.' + this.method;
                }
            }
            catch (final ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            finally {
                final Throwable t;
                t.printStackTrace();
            }
        }
    }
}
