package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import java.util.List;
import kotlin.collections.ArraysKt;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import com.fingerprintjs.android.fingerprint.tools.threading.SharedExecutorKt;
import kotlin.Result$Companion;
import kotlin.ResultKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.functions.Function0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0080\b\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n" }, d2 = { "safe", "Lkotlin/Result;", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "safeWithTimeout", "timeoutMs", "", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class SafeKt
{
    public static final <T> Object safe(final Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter((Object)function0, "block");
        Object constructor-impl = null;
        try {
            final Result$Companion companion = Result.Companion;
            Result.constructor-impl(function0.invoke());
        }
        finally {
            final Result$Companion companion2 = Result.Companion;
            final Throwable t;
            constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
        }
        return constructor-impl;
    }
    
    public static final <T> Object safeWithTimeout(final long n, Function0<? extends T> o) {
        Intrinsics.checkNotNullParameter(o, "block");
        final List<StackTraceElement> list = null;
        final AtomicReference atomicReference = new AtomicReference((Object)null);
        if (Safe.INSTANCE.getInsideSafeWithTimeout$fingerprint_release()) {
            Safe.INSTANCE.logIllegalSafeWithTimeoutUsage$fingerprint_release();
        }
        Object constructor-impl = null;
        try {
            final Result$Companion companion = Result.Companion;
            final Future submit = SharedExecutorKt.getSharedExecutor().submit((Callable)new SafeKt$$ExternalSyntheticLambda0(atomicReference, (Function0)o));
            Intrinsics.checkNotNull((Object)submit);
            Result.constructor-impl((Object)submit);
        }
        finally {
            final Result$Companion companion2 = Result.Companion;
            final Throwable t;
            constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
        }
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(constructor-impl);
        if (exceptionOrNull-impl == null) {
            final Future future = (Future)constructor-impl;
            try {
                final Result$Companion companion3 = Result.Companion;
                Result.constructor-impl(future.get(n, TimeUnit.MILLISECONDS));
            }
            finally {
                final Result$Companion companion4 = Result.Companion;
                final Throwable t2;
                o = Result.constructor-impl(ResultKt.createFailure(t2));
            }
            final Throwable exceptionOrNull-impl2 = Result.exceptionOrNull-impl(o);
            if (exceptionOrNull-impl2 != null) {
                try {
                    final Result$Companion companion5 = Result.Companion;
                    if (exceptionOrNull-impl2 instanceof TimeoutException) {
                        final TimeoutException ex = (TimeoutException)exceptionOrNull-impl2;
                        final Thread thread = (Thread)atomicReference.get();
                        List filterNotNull = list;
                        if (thread != null) {
                            final StackTraceElement[] stackTrace = thread.getStackTrace();
                            filterNotNull = list;
                            if (stackTrace != null) {
                                Intrinsics.checkNotNull((Object)stackTrace);
                                filterNotNull = ArraysKt.filterNotNull((Object[])stackTrace);
                            }
                        }
                        throw new ExecutionTimeoutException(ex, (List<StackTraceElement>)filterNotNull);
                    }
                    throw exceptionOrNull-impl2;
                }
                finally {
                    final Result$Companion companion6 = Result.Companion;
                    final Throwable t3;
                    o = Result.constructor-impl(ResultKt.createFailure(t3));
                }
            }
            if (Result.exceptionOrNull-impl(o) != null) {
                try {
                    final Result$Companion companion7 = Result.Companion;
                    Result.constructor-impl((Object)future.cancel(true));
                }
                finally {
                    final Result$Companion companion8 = Result.Companion;
                    final Throwable t4;
                    Result.constructor-impl(ResultKt.createFailure(t4));
                }
            }
            return o;
        }
        final Result$Companion companion9 = Result.Companion;
        return Result.constructor-impl(ResultKt.createFailure(exceptionOrNull-impl));
    }
    
    private static final Object safeWithTimeout$lambda$1$lambda$0(final AtomicReference atomicReference, final Function0 function0) {
        Intrinsics.checkNotNullParameter((Object)atomicReference, "$executionThread");
        Intrinsics.checkNotNullParameter((Object)function0, "$block");
        Safe.INSTANCE.markInsideSafeWithTimeout$fingerprint_release();
        atomicReference.set((Object)Thread.currentThread());
        try {
            return function0.invoke();
        }
        finally {
            Safe.INSTANCE.clearInsideSafeWithTimeout$fingerprint_release();
        }
    }
}
