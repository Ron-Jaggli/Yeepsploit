package com.fingerprintjs.android.fingerprint.tools.threading;

import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0001\"$\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0001@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b" }, d2 = { "<set-?>", "Ljava/util/concurrent/ThreadPoolExecutor;", "sharedExecutor", "getSharedExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setSharedExecutor", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "createSharedExecutor", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class SharedExecutorKt
{
    private static ThreadPoolExecutor sharedExecutor;
    
    static {
        SharedExecutorKt.sharedExecutor = createSharedExecutor();
    }
    
    public static final ThreadPoolExecutor createSharedExecutor() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, (BlockingQueue)new SynchronousQueue());
    }
    
    public static final ThreadPoolExecutor getSharedExecutor() {
        return SharedExecutorKt.sharedExecutor;
    }
    
    public static final void setSharedExecutor(final ThreadPoolExecutor sharedExecutor) {
        Intrinsics.checkNotNullParameter((Object)sharedExecutor, "<set-?>");
        SharedExecutorKt.sharedExecutor = sharedExecutor;
    }
}
