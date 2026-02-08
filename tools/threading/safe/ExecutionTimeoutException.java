package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.TimeoutException;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/threading/safe/ExecutionTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "timeoutException", "Ljava/util/concurrent/TimeoutException;", "executionThreadStackTrace", "", "Ljava/lang/StackTraceElement;", "(Ljava/util/concurrent/TimeoutException;Ljava/util/List;)V", "getExecutionThreadStackTrace", "()Ljava/util/List;", "message", "", "getMessage", "()Ljava/lang/String;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class ExecutionTimeoutException extends Exception
{
    private final List<StackTraceElement> executionThreadStackTrace;
    
    public ExecutionTimeoutException(final TimeoutException ex, final List<StackTraceElement> executionThreadStackTrace) {
        Intrinsics.checkNotNullParameter((Object)ex, "timeoutException");
        super((Throwable)ex);
        this.executionThreadStackTrace = executionThreadStackTrace;
    }
    
    public final List<StackTraceElement> getExecutionThreadStackTrace() {
        return this.executionThreadStackTrace;
    }
    
    public String getMessage() {
        final StringBuilder append = new StringBuilder("The execution took too long to complete. Original exception: ").append((Object)this.getCause()).append(", execution thread stacktrace: ");
        final List<StackTraceElement> executionThreadStackTrace = this.executionThreadStackTrace;
        String joinToString$default;
        if (executionThreadStackTrace != null) {
            joinToString$default = CollectionsKt.joinToString$default((Iterable)executionThreadStackTrace, (CharSequence)null, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)ExecutionTimeoutException$message.ExecutionTimeoutException$message$1.INSTANCE, 31, (Object)null);
        }
        else {
            joinToString$default = null;
        }
        return append.append(joinToString$default).append('.').toString();
    }
}
