package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import java.util.List;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "", "", "value", "(Ljava/util/List;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Ljava/util/List;", "getHashableString", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class AvailableLocalesSignal extends FingerprintingSignal<List<? extends String>>
{
    public static final Companion Companion;
    private static final Info info;
    private final List<String> value;
    
    static {
        Companion = new Companion(null);
        info = new Info(Fingerprinter$Version.V_1, null, StabilityLevel.OPTIMAL);
    }
    
    public AvailableLocalesSignal(final List<String> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super(null);
        this.value = value;
    }
    
    public static final /* synthetic */ Info access$getInfo$cp() {
        return AvailableLocalesSignal.info;
    }
    
    @Override
    public String getHashableString() {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = ((Iterable)this.getValue()).iterator();
        while (iterator.hasNext()) {
            sb.append((String)iterator.next());
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "toString(...)");
        return string;
    }
    
    @Override
    public Info getInfo() {
        return AvailableLocalesSignal.info;
    }
    
    @Override
    public List<String> getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal$Companion;", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final Info getInfo() {
            return AvailableLocalesSignal.access$getInfo$cp();
        }
    }
}
