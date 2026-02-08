package com.gameanalytics.sdk.errorreporter;

import com.gameanalytics.sdk.logging.GALogger;
import android.content.Context;
import com.gameanalytics.sdk.state.GAState;
import androidx.core.app.JobIntentService;

public abstract class ReportingIntentService extends JobIntentService
{
    private ExceptionReporter exceptionReporter;
    
    protected ExceptionReporter getExceptionReporter() {
        return this.exceptionReporter;
    }
    
    public void onCreate() {
        if (GAState.useErrorReporting()) {
            this.exceptionReporter = ExceptionReporter.register((Context)this);
        }
        GALogger.d("ReportingIntentService: onCreate");
        super.onCreate();
    }
    
    public void onDestroy() {
        super.onDestroy();
        GALogger.d("ReportingIntentService: onDestroy");
    }
}
