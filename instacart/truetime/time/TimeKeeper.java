package com.instacart.truetime.time;

import android.os.SystemClock;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.atomic.AtomicReference;
import com.instacart.truetime.sntp.Sntp;
import com.instacart.truetime.TimeKeeperListener;
import kotlin.Metadata;

@Metadata(d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011" }, d2 = { "Lcom/instacart/truetime/time/TimeKeeper;", "", "sntp", "Lcom/instacart/truetime/sntp/Sntp;", "listener", "Lcom/instacart/truetime/TimeKeeperListener;", "(Lcom/instacart/truetime/sntp/Sntp;Lcom/instacart/truetime/TimeKeeperListener;)V", "ttResult", "Ljava/util/concurrent/atomic/AtomicReference;", "", "hasTheTime", "", "now", "Ljava/util/Date;", "save", "", "ntpResult", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public final class TimeKeeper
{
    private final TimeKeeperListener listener;
    private final Sntp sntp;
    private AtomicReference<long[]> ttResult;
    
    public TimeKeeper(final Sntp sntp, final TimeKeeperListener listener) {
        Intrinsics.checkNotNullParameter((Object)sntp, "sntp");
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.sntp = sntp;
        this.listener = listener;
        this.ttResult = (AtomicReference<long[]>)new AtomicReference();
    }
    
    public final boolean hasTheTime() {
        return this.ttResult.get() != null;
    }
    
    public final Date now() {
        final long[] array = (long[])this.ttResult.get();
        final Sntp sntp = this.sntp;
        Intrinsics.checkNotNullExpressionValue((Object)array, "ntpResult");
        final Date date = new Date(sntp.trueTime(array) + (SystemClock.elapsedRealtime() - this.sntp.timeSinceBoot(array)));
        this.listener.returningTrueTime(date);
        return date;
    }
    
    public final void save(final long[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "ntpResult");
        this.listener.storingTrueTime(array);
        this.ttResult.set((Object)array);
    }
}
