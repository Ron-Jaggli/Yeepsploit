package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", "", "sensorName", "", "vendorName", "(Ljava/lang/String;Ljava/lang/String;)V", "getSensorName", "()Ljava/lang/String;", "getVendorName", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class SensorData
{
    private final String sensorName;
    private final String vendorName;
    
    public SensorData(final String sensorName, final String vendorName) {
        Intrinsics.checkNotNullParameter((Object)sensorName, "sensorName");
        Intrinsics.checkNotNullParameter((Object)vendorName, "vendorName");
        this.sensorName = sensorName;
        this.vendorName = vendorName;
    }
    
    public final String getSensorName() {
        return this.sensorName;
    }
    
    public final String getVendorName() {
        return this.vendorName;
    }
}
