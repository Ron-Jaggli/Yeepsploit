package com.instacart.truetime.time;

import kotlinx.coroutines.Job;
import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n" }, d2 = { "Lcom/instacart/truetime/time/TrueTime;", "", "hasTheTime", "", "now", "Ljava/util/Date;", "nowSafely", "nowTrueOnly", "sync", "Lkotlinx/coroutines/Job;", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public interface TrueTime
{
    boolean hasTheTime();
    
    Date now();
    
    Date nowSafely();
    
    Date nowTrueOnly() throws IllegalStateException;
    
    Job sync();
    
    @Metadata(k = 3, mv = { 1, 8, 0 }, xi = 48)
    public static final class DefaultImpls
    {
        public static Date nowSafely(final TrueTime trueTime) {
            Date nowTrueOnly;
            if (trueTime.hasTheTime()) {
                nowTrueOnly = trueTime.nowTrueOnly();
            }
            else {
                nowTrueOnly = new Date();
            }
            return nowTrueOnly;
        }
    }
}
