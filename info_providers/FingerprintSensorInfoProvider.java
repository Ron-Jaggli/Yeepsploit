package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "", "getStatus", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public interface FingerprintSensorInfoProvider
{
    FingerprintSensorStatus getStatus();
}
