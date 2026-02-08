package com.instacart.truetime.sntp;

import java.io.IOException;
import com.instacart.truetime.SntpEventListener;
import java.net.InetAddress;
import kotlin.Metadata;

@Metadata(d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J8\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0014" }, d2 = { "Lcom/instacart/truetime/sntp/Sntp;", "", "clockOffset", "", "ntpResult", "", "requestTime", "ntpHostAddress", "Ljava/net/InetAddress;", "rootDelayMax", "", "rootDispersionMax", "serverResponseDelayMax", "", "timeoutInMillis", "listener", "Lcom/instacart/truetime/SntpEventListener;", "roundTripDelay", "timeSinceBoot", "trueTime", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public interface Sntp
{
    long clockOffset(final long[] p0);
    
    long[] requestTime(final InetAddress p0, final float p1, final float p2, final int p3, final int p4, final SntpEventListener p5) throws IOException;
    
    long roundTripDelay(final long[] p0);
    
    long timeSinceBoot(final long[] p0);
    
    long trueTime(final long[] p0);
}
