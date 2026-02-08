package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "fingerprintManager", "Landroidx/core/hardware/fingerprint/FingerprintManagerCompat;", "(Landroidx/core/hardware/fingerprint/FingerprintManagerCompat;)V", "getStatus", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class FingerprintSensorInfoProviderImpl implements FingerprintSensorInfoProvider
{
    private final FingerprintManagerCompat fingerprintManager;
    
    public FingerprintSensorInfoProviderImpl(final FingerprintManagerCompat fingerprintManager) {
        this.fingerprintManager = fingerprintManager;
    }
    
    @Override
    public FingerprintSensorStatus getStatus() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new FingerprintSensorInfoProviderImpl$getStatus.FingerprintSensorInfoProviderImpl$getStatus$1(this), 1, (Object)null);
        final FingerprintSensorStatus unknown = FingerprintSensorStatus.UNKNOWN;
        FingerprintSensorStatus fingerprintSensorStatus = (FingerprintSensorStatus)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            fingerprintSensorStatus = unknown;
        }
        return fingerprintSensorStatus;
    }
}
