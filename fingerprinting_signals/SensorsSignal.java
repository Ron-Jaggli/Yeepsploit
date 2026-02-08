package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.fingerprintjs.android.fingerprint.info_providers.SensorData;
import java.util.List;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", "value", "(Ljava/util/List;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Ljava/util/List;", "getHashableString", "", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class SensorsSignal extends FingerprintingSignal<List<? extends SensorData>>
{
    public static final Companion Companion;
    private static final FingerprintingSignal$Info info;
    private final List<SensorData> value;
    
    static {
        Companion = new Companion(null);
        info = new FingerprintingSignal$Info(Fingerprinter$Version.V_1, (Fingerprinter$Version)null, StabilityLevel.STABLE);
    }
    
    public SensorsSignal(final List<SensorData> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super((DefaultConstructorMarker)null);
        this.value = value;
    }
    
    public static final /* synthetic */ FingerprintingSignal$Info access$getInfo$cp() {
        return SensorsSignal.info;
    }
    
    public String getHashableString() {
        final StringBuilder sb = new StringBuilder();
        for (final SensorData sensorData : (Iterable)this.getValue()) {
            sb.append(sensorData.getSensorName()).append(sensorData.getVendorName());
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "toString(...)");
        return string;
    }
    
    public FingerprintingSignal$Info getInfo() {
        return SensorsSignal.info;
    }
    
    public List<SensorData> getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal$Companion;", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final FingerprintingSignal$Info getInfo() {
            return SensorsSignal.access$getInfo$cp();
        }
    }
}
