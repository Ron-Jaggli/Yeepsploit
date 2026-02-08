package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import java.util.Map;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "", "", "value", "(Ljava/util/Map;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Ljava/util/Map;", "getHashableString", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class ProcCpuInfoSignal extends FingerprintingSignal<Map<String, ? extends String>>
{
    public static final ProcCpuInfoSignal.ProcCpuInfoSignal$Companion Companion;
    private static final FingerprintingSignal$Info info;
    private final Map<String, String> value;
    
    static {
        Companion = new ProcCpuInfoSignal.ProcCpuInfoSignal$Companion((DefaultConstructorMarker)null);
        info = new FingerprintingSignal$Info(Fingerprinter$Version.V_1, Fingerprinter$Version.V_4, StabilityLevel.STABLE);
    }
    
    public ProcCpuInfoSignal(final Map<String, String> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super((DefaultConstructorMarker)null);
        this.value = value;
    }
    
    public String getHashableString() {
        final StringBuilder sb = new StringBuilder();
        for (final Map$Entry map$Entry : (Iterable)this.getValue().entrySet()) {
            sb.append((String)map$Entry.getKey()).append((String)map$Entry.getValue());
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "toString(...)");
        return string;
    }
    
    public FingerprintingSignal$Info getInfo() {
        return ProcCpuInfoSignal.info;
    }
    
    public Map<String, String> getValue() {
        return this.value;
    }
}
