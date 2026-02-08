package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\f\b\u0000\u0010\u0007*\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&¢\u0006\u0002\u0010\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "", "fingerprint", "", "getFingerprint", "()Ljava/lang/String;", "getSignalProvider", "T", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public interface FingerprintResult
{
    String getFingerprint();
    
     <T extends SignalGroupProvider<?>> T getSignalProvider(final Class<T> p0);
}
