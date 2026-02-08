package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.collections.SetsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Set;
import kotlin.Metadata;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "value", "(Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;)V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getValue", "()Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getHashableString", "", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class ProcCpuInfoV2Signal extends FingerprintingSignal<CpuInfo>
{
    private static final Set<String> CPUINFO_IGNORED_COMMON_PROPS;
    private static final Set<String> CPUINFO_IGNORED_PER_PROC_PROPS;
    public static final Companion Companion;
    private static final FingerprintingSignal$Info info;
    private final CpuInfo value;
    
    static {
        Companion = new Companion(null);
        info = new FingerprintingSignal$Info(Fingerprinter$Version.V_4, (Fingerprinter$Version)null, StabilityLevel.STABLE);
        CPUINFO_IGNORED_COMMON_PROPS = SetsKt.setOf((Object)"processor");
        CPUINFO_IGNORED_PER_PROC_PROPS = SetsKt.setOf((Object[])new String[] { "bogomips", "cpu mhz" });
    }
    
    public ProcCpuInfoV2Signal(final CpuInfo cpuInfo) {
        Intrinsics.checkNotNullParameter((Object)cpuInfo, "value");
        super((DefaultConstructorMarker)null);
        final Iterable iterable = (Iterable)cpuInfo.getCommonInfo();
        final Collection collection = (Collection)new ArrayList();
        for (final Object next : iterable) {
            final Pair pair = (Pair)next;
            final Set<String> cpuinfo_IGNORED_COMMON_PROPS = ProcCpuInfoV2Signal.CPUINFO_IGNORED_COMMON_PROPS;
            final String lowerCase = ((String)pair.getFirst()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "toLowerCase(...)");
            if (!cpuinfo_IGNORED_COMMON_PROPS.contains((Object)lowerCase)) {
                collection.add(next);
            }
        }
        final List list = (List)collection;
        final Iterable iterable2 = (Iterable)cpuInfo.getPerProcessorInfo();
        final Collection collection2 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (final Iterable iterable3 : iterable2) {
            final Collection collection3 = (Collection)new ArrayList();
            for (final Object next2 : iterable3) {
                final Pair pair2 = (Pair)next2;
                final Set<String> cpuinfo_IGNORED_PER_PROC_PROPS = ProcCpuInfoV2Signal.CPUINFO_IGNORED_PER_PROC_PROPS;
                final String lowerCase2 = ((String)pair2.getFirst()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue((Object)lowerCase2, "toLowerCase(...)");
                if (!cpuinfo_IGNORED_PER_PROC_PROPS.contains((Object)lowerCase2)) {
                    collection3.add(next2);
                }
            }
            collection2.add((Object)collection3);
        }
        this.value = cpuInfo.copy((List<Pair<String, String>>)list, (List<? extends List<Pair<String, String>>>)collection2);
    }
    
    public static final /* synthetic */ FingerprintingSignal$Info access$getInfo$cp() {
        return ProcCpuInfoV2Signal.info;
    }
    
    public String getHashableString() {
        return new StringBuilder().append((Object)this.getValue().getCommonInfo()).append((Object)this.getValue().getPerProcessorInfo()).toString();
    }
    
    public FingerprintingSignal$Info getInfo() {
        return ProcCpuInfoV2Signal.info;
    }
    
    public CpuInfo getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal$Companion;", "", "()V", "CPUINFO_IGNORED_COMMON_PROPS", "", "", "CPUINFO_IGNORED_PER_PROC_PROPS", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final FingerprintingSignal$Info getInfo() {
            return ProcCpuInfoV2Signal.access$getInfo$cp();
        }
    }
}
