package com.gameanalytics.sdk.errorreporter;

import android.util.Log;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.store.GAStore;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.logging.GALogger;
import android.content.Intent;

public class GameAnalyticsExceptionReportService extends ReportingIntentService
{
    static final String ACTION_SAVE_REPORT;
    static final String EXTRA_GAME_KEY;
    static final String EXTRA_INFO_LOG_ENABLED;
    static final String EXTRA_SECRET_KEY;
    static final String EXTRA_VERBOSE_LOG_ENABLED;
    static final String EXTRA_WRITABLE_PATH;
    private static final String TAG;
    
    static {
        ACTION_SAVE_REPORT = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".actionSaveReport");
        EXTRA_GAME_KEY = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraGameKey");
        EXTRA_SECRET_KEY = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraSecretKey");
        EXTRA_WRITABLE_PATH = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraWritablePath");
        EXTRA_INFO_LOG_ENABLED = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraInfoLogEnabled");
        EXTRA_VERBOSE_LOG_ENABLED = GameAnalyticsExceptionReportService.class.getPackage().getName().concat(".extraVerboseLogEnabled");
        TAG = "GameAnalyticsExceptionReportService";
    }
    
    private void saveReport(final Intent intent) {
        final String stringExtra = intent.getStringExtra(GameAnalyticsExceptionReportService.EXTRA_GAME_KEY);
        final String stringExtra2 = intent.getStringExtra(GameAnalyticsExceptionReportService.EXTRA_SECRET_KEY);
        final String stringExtra3 = intent.getStringExtra(GameAnalyticsExceptionReportService.EXTRA_WRITABLE_PATH);
        final boolean booleanExtra = intent.getBooleanExtra(GameAnalyticsExceptionReportService.EXTRA_INFO_LOG_ENABLED, false);
        final boolean booleanExtra2 = intent.getBooleanExtra(GameAnalyticsExceptionReportService.EXTRA_VERBOSE_LOG_ENABLED, false);
        GALogger.setInfoLog(booleanExtra);
        GALogger.setAdvancedInfoLog(booleanExtra2);
        GALogger.ii("Got request to report error: " + intent.toString());
        GADevice.setWritableFilePath(stringExtra3);
        if (GAStore.ensureDatabase(false)) {
            GAState.setKeys(stringExtra, stringExtra2);
            GAState.setInitialized(true);
            GAEvents.processEvents("", false);
        }
    }
    
    protected void onHandleWork(final Intent intent) {
        try {
            if (intent.getAction().equals((Object)GameAnalyticsExceptionReportService.ACTION_SAVE_REPORT)) {
                this.saveReport(intent);
            }
        }
        catch (final Exception ex) {
            Log.e(GameAnalyticsExceptionReportService.TAG, "Error while sending an error report: ", (Throwable)ex);
        }
    }
}
