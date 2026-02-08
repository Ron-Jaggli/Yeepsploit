package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "()V", "androidVersion", "", "fingerprint", "kernelVersion", "manufacturerName", "modelName", "sdkVersion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class OsBuildInfoProviderImpl implements OsBuildInfoProvider
{
    @Override
    public String androidVersion() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)OsBuildInfoProviderImpl$androidVersion.OsBuildInfoProviderImpl$androidVersion$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String fingerprint() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)OsBuildInfoProviderImpl$fingerprint.OsBuildInfoProviderImpl$fingerprint$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String kernelVersion() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)OsBuildInfoProviderImpl$kernelVersion.OsBuildInfoProviderImpl$kernelVersion$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String manufacturerName() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)OsBuildInfoProviderImpl$manufacturerName.OsBuildInfoProviderImpl$manufacturerName$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String modelName() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)OsBuildInfoProviderImpl$modelName.OsBuildInfoProviderImpl$modelName$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String sdkVersion() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)OsBuildInfoProviderImpl$sdkVersion.OsBuildInfoProviderImpl$sdkVersion$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
}
