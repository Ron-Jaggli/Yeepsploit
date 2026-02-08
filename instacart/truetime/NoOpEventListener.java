package com.instacart.truetime;

import java.util.Date;
import java.util.List;
import java.net.InetAddress;
import kotlin.jvm.internal.Intrinsics;
import com.instacart.truetime.time.TrueTimeParameters;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u001c\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00102\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0014\u0010\u001f\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0016¨\u0006%" }, d2 = { "Lcom/instacart/truetime/NoOpEventListener;", "Lcom/instacart/truetime/TrueTimeEventListener;", "()V", "initialize", "", "params", "Lcom/instacart/truetime/time/TrueTimeParameters;", "initializeFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initializeSuccess", "ntpResult", "", "lastSntpRequestAttempt", "ipHost", "Ljava/net/InetAddress;", "nextInitializeIn", "delayInMillis", "", "resolvedNtpHostToIPs", "ntpHost", "", "ipList", "", "returningDeviceTime", "returningTrueTime", "trueTime", "Ljava/util/Date;", "sntpRequest", "address", "sntpRequestFailed", "sntpRequestSuccessful", "storingTrueTime", "syncDispatcherException", "t", "", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public final class NoOpEventListener implements TrueTimeEventListener
{
    public static final NoOpEventListener INSTANCE;
    
    static {
        INSTANCE = new NoOpEventListener();
    }
    
    private NoOpEventListener() {
    }
    
    @Override
    public void initialize(final TrueTimeParameters trueTimeParameters) {
        Intrinsics.checkNotNullParameter((Object)trueTimeParameters, "params");
    }
    
    @Override
    public void initializeFailed(final Exception ex) {
        Intrinsics.checkNotNullParameter((Object)ex, "e");
    }
    
    @Override
    public void initializeSuccess(final long[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "ntpResult");
    }
    
    @Override
    public void lastSntpRequestAttempt(final InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter((Object)inetAddress, "ipHost");
    }
    
    @Override
    public void nextInitializeIn(final long n) {
    }
    
    @Override
    public void resolvedNtpHostToIPs(final String s, final List<? extends InetAddress> list) {
        Intrinsics.checkNotNullParameter((Object)s, "ntpHost");
        Intrinsics.checkNotNullParameter((Object)list, "ipList");
    }
    
    @Override
    public void returningDeviceTime() {
    }
    
    @Override
    public void returningTrueTime(final Date date) {
        Intrinsics.checkNotNullParameter((Object)date, "trueTime");
    }
    
    @Override
    public void sntpRequest(final InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter((Object)inetAddress, "address");
    }
    
    @Override
    public void sntpRequestFailed(final Exception ex) {
        Intrinsics.checkNotNullParameter((Object)ex, "e");
    }
    
    @Override
    public void sntpRequestFailed(final InetAddress inetAddress, final Exception ex) {
        Intrinsics.checkNotNullParameter((Object)inetAddress, "address");
        Intrinsics.checkNotNullParameter((Object)ex, "e");
    }
    
    @Override
    public void sntpRequestSuccessful(final InetAddress inetAddress) {
        Intrinsics.checkNotNullParameter((Object)inetAddress, "address");
    }
    
    @Override
    public void storingTrueTime(final long[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "ntpResult");
    }
    
    @Override
    public void syncDispatcherException(final Throwable t) {
        Intrinsics.checkNotNullParameter((Object)t, "t");
    }
}
