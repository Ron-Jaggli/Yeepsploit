package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import android.os.StatFs;
import android.app.ActivityManager;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "activityManager", "Landroid/app/ActivityManager;", "internalStorageStats", "Landroid/os/StatFs;", "externalStorageStats", "(Landroid/app/ActivityManager;Landroid/os/StatFs;Landroid/os/StatFs;)V", "totalExternalStorageSpace", "", "totalInternalStorageSpace", "totalRAM", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class MemInfoProviderImpl implements MemInfoProvider
{
    private final ActivityManager activityManager;
    private final StatFs externalStorageStats;
    private final StatFs internalStorageStats;
    
    public MemInfoProviderImpl(final ActivityManager activityManager, final StatFs internalStorageStats, final StatFs externalStorageStats) {
        this.activityManager = activityManager;
        this.internalStorageStats = internalStorageStats;
        this.externalStorageStats = externalStorageStats;
    }
    
    @Override
    public long totalExternalStorageSpace() {
        Object o;
        if (Result.isFailure-impl(o = SafeKt.safeWithTimeout$default(0L, (Function0)new MemInfoProviderImpl$totalExternalStorageSpace.MemInfoProviderImpl$totalExternalStorageSpace$1(this), 1, (Object)null))) {
            o = 0L;
        }
        return ((Number)o).longValue();
    }
    
    @Override
    public long totalInternalStorageSpace() {
        Object o;
        if (Result.isFailure-impl(o = SafeKt.safeWithTimeout$default(0L, (Function0)new MemInfoProviderImpl$totalInternalStorageSpace.MemInfoProviderImpl$totalInternalStorageSpace$1(this), 1, (Object)null))) {
            o = 0L;
        }
        return ((Number)o).longValue();
    }
    
    @Override
    public long totalRAM() {
        Object o;
        if (Result.isFailure-impl(o = SafeKt.safeWithTimeout$default(0L, (Function0)new MemInfoProviderImpl$totalRAM.MemInfoProviderImpl$totalRAM$1(this), 1, (Object)null))) {
            o = 0L;
        }
        return ((Number)o).longValue();
    }
}
