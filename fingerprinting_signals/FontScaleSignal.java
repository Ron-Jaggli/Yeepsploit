package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "", "value", "(Ljava/lang/String;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Ljava/lang/String;", "getHashableString", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class FontScaleSignal extends FingerprintingSignal<String>
{
    public static final Companion Companion;
    private static final FingerprintingSignal$Info info;
    private final String value;
    
    static {
        Companion = new Companion(null);
        info = new FingerprintingSignal$Info(Fingerprinter$Version.V_1, (Fingerprinter$Version)null, StabilityLevel.OPTIMAL);
    }
    
    public FontScaleSignal(final String value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super((DefaultConstructorMarker)null);
        this.value = value;
    }
    
    public static final /* synthetic */ FingerprintingSignal$Info access$getInfo$cp() {
        return FontScaleSignal.info;
    }
    
    public String getHashableString() {
        return this.getValue();
    }
    
    public FingerprintingSignal$Info getInfo() {
        return FontScaleSignal.info;
    }
    
    public String getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal$Companion;", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final FingerprintingSignal$Info getInfo() {
            return FontScaleSignal.access$getInfo$cp();
        }
    }
}
