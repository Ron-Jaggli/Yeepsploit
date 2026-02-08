package com.fingerprintjs.android.fingerprint.tools;

import com.fingerprintjs.android.fingerprint.FingerprintResult;
import com.fingerprintjs.android.fingerprint.DeviceIdResult;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/DummyResults;", "", "()V", "deviceIdResult", "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "getDeviceIdResult", "()Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "dummyString", "", "fingerprint", "fingerprintResult", "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "getFingerprintResult", "()Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DummyResults
{
    public static final DummyResults INSTANCE;
    private static final DeviceIdResult deviceIdResult;
    private static final String dummyString = "";
    public static final String fingerprint = "";
    private static final FingerprintResult fingerprintResult;
    
    static {
        INSTANCE = new DummyResults();
        fingerprintResult = (FingerprintResult)new DummyResults$fingerprintResult.DummyResults$fingerprintResult$1();
        deviceIdResult = new DeviceIdResult("", "", "", "");
    }
    
    private DummyResults() {
    }
    
    public final DeviceIdResult getDeviceIdResult() {
        return DummyResults.deviceIdResult;
    }
    
    public final FingerprintResult getFingerprintResult() {
        return DummyResults.fingerprintResult;
    }
}
