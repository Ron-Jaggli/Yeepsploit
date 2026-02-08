package com.fingerprintjs.android.fingerprint.signal_providers;

import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H&J \u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "", "()V", "signals", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "version", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public abstract class RawData
{
    public abstract List<IdentificationSignal<?>> signals();
    
    public final List<IdentificationSignal<?>> signals(final int n, final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        return RawDataKt.filterByVersion(RawDataKt.filterByStabilityLevel(this.signals(), stabilityLevel), n);
    }
}
