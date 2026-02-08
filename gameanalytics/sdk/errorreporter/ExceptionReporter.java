package com.gameanalytics.sdk.errorreporter;

import org.json.JSONException;
import java.util.Map;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.GAErrorSeverity;
import com.gameanalytics.sdk.GAPlatform$FunctionInfo;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.state.GAState;
import android.net.Uri;
import android.os.SystemClock;
import android.content.Intent;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.gameanalytics.sdk.logging.GALogger;
import android.os.StatFs;
import android.content.Context;
import java.util.HashMap;

public final class ExceptionReporter
{
    private static HashMap<String, Integer> ErrorTypeCountMap;
    private static final int FIXED_JOB_ID = 12345;
    private static final int MAX_ERROR_TYPE_COUNT = 20;
    private Context context;
    private ExceptionReporter.ExceptionReporter$Handler handler;
    
    static {
        ExceptionReporter.ErrorTypeCountMap = (HashMap<String, Integer>)new HashMap();
    }
    
    private ExceptionReporter(final Thread$UncaughtExceptionHandler thread$UncaughtExceptionHandler, final Context context) {
        this.handler = new ExceptionReporter.ExceptionReporter$Handler(this, thread$UncaughtExceptionHandler, (ExceptionReporter$1)null);
        this.setContext(context);
    }
    
    private static long getAvailableBlocks(final StatFs statFs) {
        return getAvailableBlocks18AndAbove(statFs);
    }
    
    private static long getAvailableBlocks17AndBelow(final StatFs statFs) {
        return statFs.getAvailableBlocks();
    }
    
    private static long getAvailableBlocks18AndAbove(final StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }
    
    private static long getBlockCount(final StatFs statFs) {
        return getBlockCount18AndAbove(statFs);
    }
    
    private static long getBlockCount17AndBelow(final StatFs statFs) {
        return statFs.getBlockCount();
    }
    
    private static long getBlockCount18AndAbove(final StatFs statFs) {
        return statFs.getBlockCountLong();
    }
    
    private static long getBlockSize(final StatFs statFs) {
        return getBlockSize18AndAbove(statFs);
    }
    
    private static long getBlockSize17AndBelow(final StatFs statFs) {
        return statFs.getBlockSize();
    }
    
    private static long getBlockSize18AndAbove(final StatFs statFs) {
        return statFs.getBlockSizeLong();
    }
    
    public static ExceptionReporter register(final Context context) {
        GALogger.d("Registering ExceptionReporter");
        final Thread$UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof ExceptionReporter.ExceptionReporter$Handler) {
            final ExceptionReporter.ExceptionReporter$Handler exceptionReporter$Handler = (ExceptionReporter.ExceptionReporter$Handler)defaultUncaughtExceptionHandler;
            ExceptionReporter.ExceptionReporter$Handler.access$000(exceptionReporter$Handler).setContext(context);
            return ExceptionReporter.ExceptionReporter$Handler.access$000(exceptionReporter$Handler);
        }
        final ExceptionReporter exceptionReporter = new ExceptionReporter(defaultUncaughtExceptionHandler, context);
        Thread.setDefaultUncaughtExceptionHandler((Thread$UncaughtExceptionHandler)exceptionReporter.handler);
        return exceptionReporter;
    }
    
    private void setContext(final Context context) {
        if (context.getApplicationContext() != null) {
            this.context = context.getApplicationContext();
        }
        else {
            this.context = context;
        }
    }
    
    public void reportException(final Thread thread, final Throwable t) {
        this.reportException(thread, t, null);
    }
    
    public void reportException(final Thread thread, final Throwable t, final String s) {
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter((Writer)stringWriter));
        final String string = stringWriter.toString();
        final Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + SystemClock.elapsedRealtime()));
        intent.setAction(GameAnalyticsExceptionReportService.ACTION_SAVE_REPORT);
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_GAME_KEY, GAState.getGameKey());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_SECRET_KEY, GAState.getSecretKey());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_WRITABLE_PATH, GADevice.getWritableFilePath());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_INFO_LOG_ENABLED, GALogger.getInfoLog());
        intent.putExtra(GameAnalyticsExceptionReportService.EXTRA_VERBOSE_LOG_ENABLED, GALogger.getAdvancedInfoLog());
        final String name = t.getClass().getName();
        String s2 = "# Type of exception: " + name + "\n" + "# Exception message: " + t.getMessage() + "\n" + "# Thread name: " + thread.getName() + "\n";
        if (s != null) {
            s2 = s2 + "# Extra message: " + s + "\n";
        }
        String s4;
        final String s3 = s4 = s2 + "# Stacktrace: " + string;
        if (s3.length() > 8192) {
            s4 = s3.substring(0, 8192);
        }
        if (!ExceptionReporter.ErrorTypeCountMap.containsKey((Object)name)) {
            ExceptionReporter.ErrorTypeCountMap.put((Object)name, (Object)0);
        }
        final Integer n = (Integer)ExceptionReporter.ErrorTypeCountMap.get((Object)name);
        if (n != null && n > 20) {
            return;
        }
        ExceptionReporter.ErrorTypeCountMap.put((Object)name, (Object)(n + 1));
        final GAPlatform$FunctionInfo gaPlatform$FunctionInfo = new GAPlatform$FunctionInfo();
        GAEvents.addErrorEvent(GAErrorSeverity.Critical, s4, null, false, gaPlatform$FunctionInfo.method, gaPlatform$FunctionInfo.line, gaPlatform$FunctionInfo.module);
        GAEvents.cleanupEvents();
        while (true) {
            try {
                GAEvents.fixMissingSessionEndEvents();
                intent.setClass(this.context, (Class)GameAnalyticsExceptionReportService.class);
                GameAnalyticsExceptionReportService.enqueueWork(this.context, (Class)GameAnalyticsExceptionReportService.class, 12345, intent);
            }
            catch (final JSONException ex) {
                continue;
            }
            break;
        }
    }
}
