package com.gameanalytics.sdk.device;

import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import android.app.ActivityManager;
import android.util.Pair;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import androidx.core.content.ContextCompat;
import java.io.File;
import android.os.StatFs;
import android.os.Environment;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.os.Process;
import com.gameanalytics.sdk.events.GAEvents;
import android.app.ActivityManager$MemoryInfo;
import com.gameanalytics.sdk.utilities.GAUtilities;
import android.os.Looper;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import com.gameanalytics.sdk.logging.GALogger;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.appset.AppSet;
import com.gameanalytics.sdk.GAPlatform;
import com.google.android.gms.appset.AppSetIdInfo;
import android.text.TextUtils;
import java.util.regex.Pattern;
import android.os.Build;
import android.os.Build$VERSION;

public class GADevice
{
    private static String _adIdSource;
    private static int _appBuild = 0;
    private static String _appSetId;
    private static String _appSignature;
    private static String _appVersion;
    private static final String _buildPlatform = "android";
    private static String _bundleIdentifier;
    private static String _channelId;
    private static String _connectionType;
    private static final String _deviceManufacturer;
    private static final String _deviceModel;
    private static String _gaid;
    private static String _gameEngineVersion = "";
    private static boolean _isHacked = false;
    private static boolean _isLimitedAdTracking = false;
    private static boolean _lazySetAppSetId = false;
    private static boolean _lazySetGAID = false;
    private static boolean _lazySetOAID = false;
    private static String _oaid;
    private static final String _osVersion;
    private static String _sdkGameEngineVersion = "";
    private static final String _sdkWrapperVersion = "android 6.6.0";
    private static String _writablepath;
    public static boolean doTrackGAID;
    
    static {
        _osVersion = fixOSVersion(Build$VERSION.RELEASE);
        _deviceModel = fixDeviceModel(Build.MODEL);
        _deviceManufacturer = Build.MANUFACTURER;
        GADevice._gaid = "";
        GADevice._oaid = "";
        GADevice._lazySetGAID = true;
        GADevice._lazySetOAID = true;
        GADevice._writablepath = "";
        GADevice._connectionType = "";
        GADevice._bundleIdentifier = "";
        GADevice._appVersion = "";
        GADevice._appBuild = 0;
        GADevice._appSignature = "";
        GADevice._channelId = "";
        GADevice._adIdSource = "";
        GADevice._appSetId = "";
        GADevice._lazySetAppSetId = true;
        GADevice.doTrackGAID = true;
    }
    
    public static DeviceInfo ReadDeviceInfo() {
        final DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.ReadInfo();
        return deviceInfo;
    }
    
    private static String fixDeviceModel(final String s) {
        String substring = s;
        if (s.length() > 32) {
            substring = s.substring(0, 32);
        }
        return substring;
    }
    
    private static String fixOSVersion(String s) {
        int n = 0;
        Object substring;
        while (true) {
            substring = s;
            if (n >= s.length()) {
                break;
            }
            final char char1 = s.charAt(n);
            if (!Character.isDigit(char1)) {
                if (char1 != '.') {
                    substring = s.substring(0, n);
                    break;
                }
            }
            ++n;
        }
        s = (String)substring;
        if (!Pattern.matches("^(\\d){0,5}(\\.(\\d){0,5}){0,2}$", (CharSequence)substring)) {
            s = "0.0.0";
        }
        return s;
    }
    
    public static String getAdIdSource() {
        return GADevice._adIdSource;
    }
    
    public static int getAppBuild() {
        return GADevice._appBuild;
    }
    
    public static String getAppSetId() {
        if (TextUtils.isEmpty((CharSequence)GADevice._appSetId) && GADevice._lazySetAppSetId) {
            try {
                GADevice._appSetId = ((AppSetIdInfo)Tasks.await(AppSet.getClient(GAPlatform.getApplicationContext()).getAppSetIdInfo())).getId();
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {
                GALogger.w((Object)noClassDefFoundError + "");
                noClassDefFoundError.printStackTrace();
            }
            catch (final InterruptedException ex) {
                GALogger.w((Object)ex + "");
                ex.printStackTrace();
            }
            catch (final ExecutionException ex2) {
                GALogger.w((Object)ex2 + "");
                ex2.printStackTrace();
            }
            GADevice._lazySetAppSetId = false;
        }
        return GADevice._appSetId;
    }
    
    public static String getAppSignature() {
        return GADevice._appSignature;
    }
    
    public static String getAppVersion() {
        return GADevice._appVersion;
    }
    
    public static String getBuildPlatform() {
        return "android";
    }
    
    public static String getBundleIdentifier() {
        return GADevice._bundleIdentifier;
    }
    
    public static String getChannelId() {
        return GADevice._channelId;
    }
    
    public static String getConnectionType() {
        return GADevice._connectionType;
    }
    
    public static String getDeviceManufacturer() {
        return GADevice._deviceManufacturer;
    }
    
    public static String getDeviceModel() {
        return GADevice._deviceModel;
    }
    
    public static String getGAID() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            9
        //     6: ldc             "00000000-0000-0000-0000-000000000000"
        //     8: areturn        
        //     9: getstatic       com/gameanalytics/sdk/device/GADevice._gaid:Ljava/lang/String;
        //    12: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    15: ifeq            184
        //    18: getstatic       com/gameanalytics/sdk/device/GADevice._lazySetGAID:Z
        //    21: ifeq            184
        //    24: ldc             "00000000-0000-0000-0000-000000000000"
        //    26: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    29: astore_1       
        //    30: iconst_0       
        //    31: istore_0       
        //    32: iload_0        
        //    33: iconst_3       
        //    34: if_icmpge       114
        //    37: invokestatic    com/gameanalytics/sdk/GAPlatform.getApplicationContext:()Landroid/content/Context;
        //    40: invokestatic    com/gameanalytics/sdk/GooglePlayServicesClient.getGooglePlayServicesInfo:(Landroid/content/Context;)Lcom/gameanalytics/sdk/GooglePlayServicesClient$GooglePlayServicesInfo;
        //    43: invokevirtual   com/gameanalytics/sdk/GooglePlayServicesClient$GooglePlayServicesInfo.getGpsAdid:()Ljava/lang/String;
        //    46: astore_2       
        //    47: aload_2        
        //    48: putstatic       com/gameanalytics/sdk/device/GADevice._gaid:Ljava/lang/String;
        //    51: aload_2        
        //    52: ifnull          74
        //    55: aload_2        
        //    56: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    59: aload_1        
        //    60: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //    63: ifne            74
        //    66: ldc             "service"
        //    68: invokestatic    com/gameanalytics/sdk/device/GADevice.setAdIdSource:(Ljava/lang/String;)V
        //    71: goto            114
        //    74: invokestatic    com/gameanalytics/sdk/GAPlatform.getApplicationContext:()Landroid/content/Context;
        //    77: invokestatic    com/gameanalytics/sdk/utilities/GAUtilities.getGAID:(Landroid/content/Context;)Ljava/lang/String;
        //    80: astore_2       
        //    81: aload_2        
        //    82: putstatic       com/gameanalytics/sdk/device/GADevice._gaid:Ljava/lang/String;
        //    85: aload_2        
        //    86: ifnull          108
        //    89: aload_2        
        //    90: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    93: aload_1        
        //    94: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //    97: ifne            108
        //   100: ldc             "library"
        //   102: invokestatic    com/gameanalytics/sdk/device/GADevice.setAdIdSource:(Ljava/lang/String;)V
        //   105: goto            114
        //   108: iinc            0, 1
        //   111: goto            32
        //   114: iconst_0       
        //   115: istore_0       
        //   116: iload_0        
        //   117: iconst_3       
        //   118: if_icmpge       180
        //   121: invokestatic    com/gameanalytics/sdk/GAPlatform.getApplicationContext:()Landroid/content/Context;
        //   124: invokestatic    com/gameanalytics/sdk/GooglePlayServicesClient.getGooglePlayServicesInfo:(Landroid/content/Context;)Lcom/gameanalytics/sdk/GooglePlayServicesClient$GooglePlayServicesInfo;
        //   127: astore_2       
        //   128: aload_2        
        //   129: invokevirtual   com/gameanalytics/sdk/GooglePlayServicesClient$GooglePlayServicesInfo.isLimitAdTrackingEnabled:()Ljava/lang/Boolean;
        //   132: astore_1       
        //   133: aload_2        
        //   134: invokevirtual   com/gameanalytics/sdk/GooglePlayServicesClient$GooglePlayServicesInfo.isLimitAdTrackingEnabled:()Ljava/lang/Boolean;
        //   137: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   140: invokestatic    com/gameanalytics/sdk/device/GADevice.setIsLimitedAdTracking:(Z)V
        //   143: aload_1        
        //   144: ifnull          150
        //   147: goto            180
        //   150: ldc_w           "com.google.android.gms.ads.identifier"
        //   153: invokestatic    com/gameanalytics/sdk/GAPlatform.getApplicationContext:()Landroid/content/Context;
        //   156: invokestatic    com/gameanalytics/sdk/utilities/GAUtilities.isLimitAdTrackingEnabled:(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/Boolean;
        //   159: astore_1       
        //   160: aload_1        
        //   161: ifnull          174
        //   164: aload_1        
        //   165: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   168: invokestatic    com/gameanalytics/sdk/device/GADevice.setIsLimitedAdTracking:(Z)V
        //   171: goto            180
        //   174: iinc            0, 1
        //   177: goto            116
        //   180: iconst_0       
        //   181: putstatic       com/gameanalytics/sdk/device/GADevice._lazySetGAID:Z
        //   184: getstatic       com/gameanalytics/sdk/device/GADevice._gaid:Ljava/lang/String;
        //   187: areturn        
        //   188: astore_2       
        //   189: goto            74
        //   192: astore_1       
        //   193: goto            150
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  37     51     188    192    Ljava/lang/Exception;
        //  55     71     188    192    Ljava/lang/Exception;
        //  121    143    192    196    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0150:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1154)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:652)
        //     at java.lang.Thread.run(Thread.java:1563)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String getGameEngineVersion() {
        return GADevice._gameEngineVersion;
    }
    
    public static boolean getIsHacked() {
        return GADevice._isHacked;
    }
    
    public static boolean getIsLimitedAdTracking() {
        return GADevice._isLimitedAdTracking;
    }
    
    public static String getOAID() {
        if (TextUtils.isEmpty((CharSequence)GADevice._oaid) && GADevice._lazySetOAID) {
            final UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
            if (Looper.myLooper() == Looper.getMainLooper()) {
                GADevice._oaid = "00000000-0000-0000-0000-000000000000";
            }
            else {
                for (int i = 0; i < 3; ++i) {
                    final String s = GADevice._oaid = GAUtilities.getOAID(GAPlatform.getApplicationContext());
                    if (s != null && !UUID.fromString(s).equals((Object)fromString)) {
                        break;
                    }
                }
                for (int j = 0; j < 3; ++j) {
                    final Boolean limitAdTrackingEnabled = GAUtilities.isLimitAdTrackingEnabled("com.huawei.hms.ads.identifier", GAPlatform.getApplicationContext());
                    if (limitAdTrackingEnabled != null) {
                        setIsLimitedAdTracking(limitAdTrackingEnabled);
                        break;
                    }
                }
            }
            GADevice._lazySetOAID = false;
        }
        return GADevice._oaid;
    }
    
    public static String getOSVersion() {
        return GADevice._osVersion;
    }
    
    public static String getRelevantSdkVersion() {
        if (GADevice._sdkGameEngineVersion.length() != 0) {
            return GADevice._sdkGameEngineVersion;
        }
        return "android 6.6.0";
    }
    
    public static String getWritableFilePath() {
        return GADevice._writablepath;
    }
    
    public static void reloadAdId() {
        GADevice._lazySetGAID = true;
        GADevice._gaid = "";
        GADevice._lazySetOAID = true;
        GADevice._oaid = "";
    }
    
    public static void setAdIdSource(final String adIdSource) {
        GADevice._adIdSource = adIdSource;
    }
    
    public static void setAppBuild(final int appBuild) {
        GADevice._appBuild = appBuild;
    }
    
    public static void setAppSignature(final String appSignature) {
        GADevice._appSignature = appSignature;
    }
    
    public static void setAppVersion(final String appVersion) {
        GADevice._appVersion = appVersion;
    }
    
    public static void setBundleId(final String bundleIdentifier) {
        GADevice._bundleIdentifier = bundleIdentifier;
    }
    
    public static void setChannelId(final String channelId) {
        GALogger.d("Setting channel id: " + channelId);
        GADevice._channelId = channelId;
    }
    
    public static void setConnectionType(final String connectionType) {
        GADevice._connectionType = connectionType;
    }
    
    public static void setGameEngineVersion(final String gameEngineVersion) {
        GADevice._gameEngineVersion = gameEngineVersion;
    }
    
    public static void setIsHacked(final boolean isHacked) {
        GADevice._isHacked = isHacked;
    }
    
    public static void setIsLimitedAdTracking(final boolean isLimitedAdTracking) {
        GADevice._isLimitedAdTracking = isLimitedAdTracking;
    }
    
    public static void setSdkGameEngineVersion(final String sdkGameEngineVersion) {
        GADevice._sdkGameEngineVersion = sdkGameEngineVersion;
    }
    
    public static void setWritableFilePath(final String writablepath) {
        GALogger.d("Writable path set to: " + writablepath);
        GADevice._writablepath = writablepath;
    }
    
    public static class DeviceInfo
    {
        private static final long INVALID_BOOT_TIME_VALUE = -1L;
        private static int[] appMemoryReadings;
        private static long appUptime = -1L;
        private static final String cpuFreq = "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq";
        private static final String cpuinfo = "/proc/cpuinfo";
        public static boolean enableExternalStorageTracking = false;
        public static boolean enableFPSTracking = false;
        public static boolean enableGpuTracking = false;
        public static boolean enableHardwareTracking = false;
        public static boolean enableMemoryHistograms = false;
        public static boolean enableMemoryTracking = false;
        public static boolean enableStorageTracking = false;
        private static final String maliGpu = "/sys/class/misc/mali0/device/utilization";
        private static double maxAppMemoryReading = 0.0;
        private static double maxSysMemoryReading = 0.0;
        private static ActivityManager$MemoryInfo memInfo;
        private static final String meminfo = "/proc/meminfo";
        private static DeviceInfo memorySampler;
        private static final int percentTableSize = 101;
        private static final String qualcommClock = "/sys/class/kgsl/kgsl-3d0/max_gpuclk";
        private static final String qualcommGpu = "/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage";
        private static final String qualcommGpuModel = "/sys/class/kgsl/kgsl-3d0/gpu_model";
        private static final String stat = "/proc/stat";
        private static int[] sysMemoryReadings;
        public long appCpuUsage;
        public double appMemoryUsage;
        public double availableDeviceStorage;
        public double availableExternalStorage;
        public long cpuLoad;
        public String cpuName;
        public long gpuClockMhz;
        public long gpuLoad;
        public String gpuModel;
        public String hardware;
        public boolean isLowMemory;
        public double memAvailable;
        private double memFree;
        public double memTotal;
        public int numCores;
        public int screenHeight;
        public int screenWidth;
        public double systemMemoryUsage;
        public double totalDeviceStorage;
        public double totalExternalStorage;
        
        static {
            DeviceInfo.appMemoryReadings = new int[101];
            DeviceInfo.sysMemoryReadings = new int[101];
            DeviceInfo.memInfo = new ActivityManager$MemoryInfo();
            DeviceInfo.memorySampler = new DeviceInfo();
        }
        
        public DeviceInfo() {
            this.cpuName = null;
            this.hardware = null;
            this.gpuModel = null;
            this.numCores = 0;
            this.cpuLoad = 0L;
            this.gpuLoad = 0L;
            this.gpuClockMhz = 0L;
            this.appCpuUsage = 0L;
            this.memFree = 0.0;
            this.memTotal = 0.0;
            this.memAvailable = 0.0;
            this.isLowMemory = false;
            this.appMemoryUsage = 0.0;
            this.systemMemoryUsage = 0.0;
            this.totalDeviceStorage = 0.0;
            this.availableDeviceStorage = 0.0;
            this.totalExternalStorage = 0.0;
            this.availableExternalStorage = 0.0;
            this.screenWidth = 0;
            this.screenHeight = 0;
        }
        
        public static double ConvertBytesToGB(final double n) {
            return (double)Math.round(n / Math.pow(1024.0, 3.0));
        }
        
        public static double ConvertBytesToKB(final double n) {
            return (double)Math.round(n / 1024.0);
        }
        
        public static double ConvertBytesToMB(final double n) {
            return (double)Math.round(n / Math.pow(1024.0, 2.0));
        }
        
        public static double ConvertKbToGB(final double n) {
            return (double)Math.round(n / Math.pow(1024.0, 2.0));
        }
        
        public static int[] GetAppMemoryPercentage() {
            return DeviceInfo.appMemoryReadings;
        }
        
        public static long GetAppUptime() {
            if (GAEvents.isSdkInitEventEnabled && DeviceInfo.appUptime == -1L) {
                DeviceInfo.appUptime = Process.getElapsedCpuTime();
            }
            return DeviceInfo.appUptime;
        }
        
        private void GetDeviceResolution() {
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            final WindowManager windowManager = (WindowManager)GAPlatform.getApplicationContext().getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                this.screenWidth = displayMetrics.widthPixels;
                this.screenHeight = displayMetrics.heightPixels;
            }
        }
        
        public static int[] GetSysMemoryPercentage() {
            return DeviceInfo.sysMemoryReadings;
        }
        
        private void GetTotalDeviceStorage() {
            try {
                final File dataDirectory = Environment.getDataDirectory();
                final File externalStorageDirectory = Environment.getExternalStorageDirectory();
                Environment.getRootDirectory();
                final StatFs statFs = new StatFs(dataDirectory.getAbsolutePath());
                final StatFs statFs2 = new StatFs(externalStorageDirectory.getAbsolutePath());
                if (IsSdcardPresent()) {
                    final long totalBytes = statFs2.getTotalBytes();
                    final long availableBytes = statFs2.getAvailableBytes();
                    this.totalExternalStorage = (double)(long)ConvertBytesToGB((double)totalBytes);
                    this.availableExternalStorage = (double)(long)ConvertBytesToGB((double)availableBytes);
                }
                final long totalBytes2 = statFs.getTotalBytes();
                final long availableBytes2 = statFs.getAvailableBytes();
                this.totalDeviceStorage = (double)(long)ConvertBytesToGB((double)totalBytes2);
                this.availableDeviceStorage = (double)(long)ConvertBytesToGB((double)availableBytes2);
            }
            finally {
                final Throwable t;
                t.printStackTrace();
            }
        }
        
        public static boolean IsHealthEventEnabled() {
            return DeviceInfo.enableMemoryHistograms | DeviceInfo.enableFPSTracking;
        }
        
        private static boolean IsSdcardPresent() {
            final File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(GAPlatform.getApplicationContext(), (String)null);
            final int length = externalFilesDirs.length;
            boolean b2;
            final boolean b = b2 = false;
            if (length > 1) {
                b2 = b;
                if (externalFilesDirs[0] != null) {
                    b2 = b;
                    if (externalFilesDirs[1] != null) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        private void ReadSystemMemoryFromMemInfo() {
            try {
                if (this.memTotal == 0.0 || this.memAvailable == 0.0) {
                    final BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader("/proc/meminfo"));
                    while (true) {
                        final String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.startsWith("MemTotal")) {
                            this.memTotal = (double)Long.parseLong(line.split("\\s+")[1]);
                        }
                        if (line.startsWith("MemFree")) {
                            this.memFree = (double)Long.parseLong(line.split("\\s+")[1]);
                        }
                        if (!line.startsWith("MemAvailable")) {
                            continue;
                        }
                        this.memAvailable = (double)Long.parseLong(line.split("\\s+")[1]);
                    }
                }
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
            finally {
                final Throwable t;
                t.printStackTrace();
            }
        }
        
        public static Pair<Double, Double> SampleMemoryUsage() {
            if (DeviceInfo.enableMemoryTracking) {
                final double getAppMemoryUsage = DeviceInfo.memorySampler.GetAppMemoryUsage();
                final double getSystemMemoryUsage = DeviceInfo.memorySampler.GetSystemMemoryUsage();
                DeviceInfo.maxAppMemoryReading = Math.max(getAppMemoryUsage, DeviceInfo.maxAppMemoryReading);
                DeviceInfo.maxSysMemoryReading = Math.max(getSystemMemoryUsage, DeviceInfo.maxSysMemoryReading);
                if (DeviceInfo.enableMemoryHistograms) {
                    final double convertBytesToMB = ConvertBytesToMB((double)DeviceInfo.memInfo.totalMem);
                    final int n = (int)(getAppMemoryUsage / convertBytesToMB * 100.0);
                    final int n2 = (int)(getSystemMemoryUsage / convertBytesToMB * 100.0);
                    if (n >= 0 && n <= 100) {
                        final int[] appMemoryReadings = DeviceInfo.appMemoryReadings;
                        ++appMemoryReadings[n];
                    }
                    if (n2 >= 0 && n2 <= 100) {
                        final int[] sysMemoryReadings = DeviceInfo.sysMemoryReadings;
                        ++sysMemoryReadings[n2];
                    }
                }
                return (Pair<Double, Double>)new Pair((Object)getAppMemoryUsage, (Object)getSystemMemoryUsage);
            }
            return null;
        }
        
        public double GetAppMemoryUsage() {
            try {
                final Runtime runtime = Runtime.getRuntime();
                return ConvertBytesToMB((double)(runtime.totalMemory() - runtime.freeMemory()));
            }
            finally {
                return 0.0;
            }
        }
        
        public double GetSystemMemoryUsage() {
            ((ActivityManager)GAPlatform.getApplicationContext().getSystemService("activity")).getMemoryInfo(DeviceInfo.memInfo);
            this.memTotal = ConvertBytesToMB((double)DeviceInfo.memInfo.totalMem);
            this.memAvailable = ConvertBytesToMB((double)DeviceInfo.memInfo.availMem);
            this.isLowMemory = DeviceInfo.memInfo.lowMemory;
            return this.memTotal - this.memAvailable;
        }
        
        public void ReadHardwareInfo() {
            try {
                final BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader("/proc/cpuinfo"));
                while (true) {
                    final String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (this.cpuName == null && line.startsWith("Processor")) {
                        this.cpuName = line.split("\\s+")[2];
                    }
                    else if (this.hardware == null && line.startsWith("Hardware")) {
                        this.hardware = line.split("\\s+")[2];
                    }
                    else {
                        if (!line.startsWith("processor")) {
                            continue;
                        }
                        ++this.numCores;
                    }
                }
                this.cpuLoad = 0L;
                int n = 0;
                try {
                    int numCores;
                    while (true) {
                        numCores = this.numCores;
                        if (n >= numCores) {
                            break;
                        }
                        this.cpuLoad += Long.parseLong(new BufferedReader((Reader)new FileReader(String.format("/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq", new Object[] { n }))).readLine());
                        ++n;
                    }
                    final long cpuLoad = this.cpuLoad;
                    if (cpuLoad > 0L) {
                        this.cpuLoad = cpuLoad / numCores;
                    }
                }
                finally {
                    final Throwable t;
                    t.printStackTrace();
                }
                try {
                    final String packageName = GAPlatform.getApplicationContext().getPackageName();
                    final java.lang.Process start = new ProcessBuilder(new String[] { "top", "-n", "1" }).redirectErrorStream(true).start();
                    final java.lang.Process process;
                    monitorenter(process = start);
                    try {
                        start.waitFor(100L, TimeUnit.MILLISECONDS);
                        monitorexit(process);
                        final BufferedReader bufferedReader2 = new BufferedReader((Reader)new InputStreamReader(start.getInputStream()));
                        final StringBuilder sb = new StringBuilder();
                        String line2;
                        do {
                            line2 = bufferedReader2.readLine();
                            if (line2 == null) {}
                            sb.append(line2);
                        } while (!line2.contains((CharSequence)packageName));
                        this.appCpuUsage = (long)Double.parseDouble(line2.trim().replaceAll("\\s+", " ").split("\\s")[9]);
                        monitorexit(process);
                        throw;
                    }
                    finally {}
                }
                catch (final IOException ex) {
                    ex.printStackTrace();
                }
                finally {
                    final Throwable t3;
                    t3.printStackTrace();
                }
                final File file = new File("/sys/class/misc/mali0/device/utilization");
                if (file.exists()) {
                    this.gpuLoad = Long.parseLong(new BufferedReader((Reader)new FileReader(file)).readLine());
                }
                else {
                    final File file2 = new File("/sys/class/kgsl/kgsl-3d0/gpu_busy_percentage");
                    if (file2.exists()) {
                        this.gpuLoad = Long.parseLong(new BufferedReader((Reader)new FileReader(file2)).readLine().replace('%', ' ').trim());
                        this.gpuClockMhz = Long.parseLong(new BufferedReader((Reader)new FileReader("/sys/class/kgsl/kgsl-3d0/max_gpuclk")).readLine());
                        this.gpuModel = new BufferedReader((Reader)new FileReader("/sys/class/kgsl/kgsl-3d0/gpu_model")).readLine();
                    }
                }
            }
            catch (final IOException ex2) {
                ex2.printStackTrace();
            }
            finally {
                final Throwable t4;
                t4.printStackTrace();
            }
        }
        
        public boolean ReadInfo() {
            try {
                if (DeviceInfo.enableHardwareTracking) {
                    this.ReadHardwareInfo();
                }
                if (DeviceInfo.enableMemoryTracking) {
                    this.appMemoryUsage = this.GetAppMemoryUsage();
                    this.systemMemoryUsage = this.GetSystemMemoryUsage();
                    if (DeviceInfo.enableMemoryHistograms) {
                        SampleMemoryUsage();
                    }
                }
                if (DeviceInfo.enableStorageTracking) {
                    this.GetTotalDeviceStorage();
                }
                this.GetDeviceResolution();
                return true;
            }
            finally {
                final Throwable t;
                t.printStackTrace();
                return false;
            }
        }
        
        public double UsedSysMemory() {
            return this.memTotal - this.memAvailable;
        }
    }
}
