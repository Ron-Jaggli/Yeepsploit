package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import java.util.List;
import android.content.pm.PackageManager;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;", "packageManager", "Landroid/content/pm/PackageManager;", "(Landroid/content/pm/PackageManager;)V", "getApplicationsList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "getSystemApplicationsList", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class PackageManagerDataSourceImpl implements PackageManagerDataSource
{
    private final PackageManager packageManager;
    
    public PackageManagerDataSourceImpl(final PackageManager packageManager) {
        this.packageManager = packageManager;
    }
    
    public List<PackageInfo> getApplicationsList() {
        final Object safeWithTimeout = SafeKt.safeWithTimeout(3000L, (Function0)new PackageManagerDataSourceImpl$getApplicationsList$1(this));
        final List emptyList = CollectionsKt.emptyList();
        List list = (List)safeWithTimeout;
        if (Result.isFailure-impl(safeWithTimeout)) {
            list = emptyList;
        }
        return (List<PackageInfo>)list;
    }
    
    public List<PackageInfo> getSystemApplicationsList() {
        final Object safeWithTimeout = SafeKt.safeWithTimeout(3000L, (Function0)new PackageManagerDataSourceImpl$getSystemApplicationsList.PackageManagerDataSourceImpl$getSystemApplicationsList$1(this));
        final List emptyList = CollectionsKt.emptyList();
        List list = (List)safeWithTimeout;
        if (Result.isFailure-impl(safeWithTimeout)) {
            list = emptyList;
        }
        return (List<PackageInfo>)list;
    }
}
