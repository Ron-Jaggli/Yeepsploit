package com.gameanalytics.sdk.utilities;

import java.util.concurrent.Callable;
import android.os.Looper;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class TaskRunner
{
    private static final Executor executor;
    private static final Handler handler;
    
    static {
        executor = (Executor)Executors.newSingleThreadExecutor();
        handler = new Handler(Looper.getMainLooper());
    }
    
    public static <R> void executeAsync(final Callable<R> callable, final Callback<R> callback) {
        TaskRunner.executor.execute((Runnable)new TaskRunner$$ExternalSyntheticLambda0(callable, (Callback)callback));
    }
    
    public interface Callback<R>
    {
        void onComplete(final R p0);
    }
}
