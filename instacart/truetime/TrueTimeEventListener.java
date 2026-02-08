package com.instacart.truetime;

import java.util.List;
import java.net.InetAddress;
import com.instacart.truetime.time.TrueTimeParameters;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&J\u001e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H&J\u0014\u0010\u0019\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH&¨\u0006\u001d" }, d2 = { "Lcom/instacart/truetime/TrueTimeEventListener;", "Lcom/instacart/truetime/SntpEventListener;", "Lcom/instacart/truetime/TimeKeeperListener;", "initialize", "", "params", "Lcom/instacart/truetime/time/TrueTimeParameters;", "initializeFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initializeSuccess", "ntpResult", "", "lastSntpRequestAttempt", "ipHost", "Ljava/net/InetAddress;", "nextInitializeIn", "delayInMillis", "", "resolvedNtpHostToIPs", "ntpHost", "", "ipList", "", "sntpRequestFailed", "syncDispatcherException", "t", "", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public interface TrueTimeEventListener extends SntpEventListener, TimeKeeperListener
{
    void initialize(final TrueTimeParameters p0);
    
    void initializeFailed(final Exception p0);
    
    void initializeSuccess(final long[] p0);
    
    void lastSntpRequestAttempt(final InetAddress p0);
    
    void nextInitializeIn(final long p0);
    
    void resolvedNtpHostToIPs(final String p0, final List<? extends InetAddress> p1);
    
    void sntpRequestFailed(final Exception p0);
    
    void syncDispatcherException(final Throwable p0);
}
