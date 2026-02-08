package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import java.util.List;
import android.hardware.SensorManager;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;", "sensorManager", "Landroid/hardware/SensorManager;", "(Landroid/hardware/SensorManager;)V", "sensors", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class SensorDataSourceImpl implements SensorDataSource
{
    private final SensorManager sensorManager;
    
    public SensorDataSourceImpl(final SensorManager sensorManager) {
        this.sensorManager = sensorManager;
    }
    
    @Override
    public List<SensorData> sensors() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new SensorDataSourceImpl$sensors.SensorDataSourceImpl$sensors$1(this), 1, (Object)null);
        final List emptyList = CollectionsKt.emptyList();
        List list = (List)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            list = emptyList;
        }
        return (List<SensorData>)list;
    }
}
