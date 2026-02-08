package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import com.fingerprintjs.android.fingerprint.tools.logs.MessagesKt;
import com.fingerprintjs.android.fingerprint.tools.logs.Logger;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\nH\u0001¢\u0006\u0002\b\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/threading/safe/Safe;", "", "()V", "runningInsideSafeWithTimeout", "Ljava/lang/ThreadLocal;", "", "timeoutLong", "", "timeoutShort", "clearInsideSafeWithTimeout", "", "clearInsideSafeWithTimeout$fingerprint_release", "getInsideSafeWithTimeout", "getInsideSafeWithTimeout$fingerprint_release", "logIllegalSafeWithTimeoutUsage", "logIllegalSafeWithTimeoutUsage$fingerprint_release", "markInsideSafeWithTimeout", "markInsideSafeWithTimeout$fingerprint_release", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class Safe
{
    public static final Safe INSTANCE;
    private static final ThreadLocal<Boolean> runningInsideSafeWithTimeout;
    public static final long timeoutLong = 3000L;
    public static final long timeoutShort = 1000L;
    
    static {
        INSTANCE = new Safe();
        runningInsideSafeWithTimeout = new ThreadLocal();
    }
    
    private Safe() {
    }
    
    public final void clearInsideSafeWithTimeout$fingerprint_release() {
        Safe.runningInsideSafeWithTimeout.remove();
    }
    
    public final boolean getInsideSafeWithTimeout$fingerprint_release() {
        final Boolean b = (Boolean)Safe.runningInsideSafeWithTimeout.get();
        return b != null && b;
    }
    
    public final void logIllegalSafeWithTimeoutUsage$fingerprint_release() {
        MessagesKt.ePleaseReport(Logger.INSTANCE, (Throwable)new IllegalStateException());
    }
    
    public final void markInsideSafeWithTimeout$fingerprint_release() {
        Safe.runningInsideSafeWithTimeout.set((Object)true);
    }
}
