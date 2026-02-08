package com.fingerprintjs.android.fingerprint.signal_providers;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0012\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\r\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "T", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "", "version", "", "(I)V", "getVersion", "()I", "combineSignals", "", "signals", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "fingerprint", "rawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public abstract class SignalGroupProvider<T extends RawData>
{
    private final int version;
    
    public SignalGroupProvider(final int version) {
        this.version = version;
    }
    
    protected final String combineSignals(final List<? extends IdentificationSignal<?>> list, final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)list, "signals");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = ((Iterable)RawDataKt.filterByStabilityLevel(list, stabilityLevel)).iterator();
        while (iterator.hasNext()) {
            sb.append(((IdentificationSignal)iterator.next()).toString());
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "toString(...)");
        return string;
    }
    
    public abstract String fingerprint(final StabilityLevel p0);
    
    public final int getVersion() {
        return this.version;
    }
    
    public abstract T rawData();
}
