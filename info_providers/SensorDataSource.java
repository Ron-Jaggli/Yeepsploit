package com.fingerprintjs.android.fingerprint.info_providers;

import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;", "", "sensors", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public interface SensorDataSource
{
    List<SensorData> sensors();
}
