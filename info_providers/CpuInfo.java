package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Pair;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B?\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00c6\u0003J!\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003H\u00c6\u0003JG\u0010\r\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "", "commonInfo", "", "Lkotlin/Pair;", "", "perProcessorInfo", "(Ljava/util/List;Ljava/util/List;)V", "getCommonInfo", "()Ljava/util/List;", "getPerProcessorInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class CpuInfo
{
    public static final Companion Companion;
    private static final CpuInfo EMPTY;
    private final List<Pair<String, String>> commonInfo;
    private final List<List<Pair<String, String>>> perProcessorInfo;
    
    static {
        Companion = new Companion(null);
        EMPTY = new CpuInfo((List<Pair<String, String>>)CollectionsKt.emptyList(), (List<? extends List<Pair<String, String>>>)CollectionsKt.emptyList());
    }
    
    public CpuInfo(final List<Pair<String, String>> commonInfo, final List<? extends List<Pair<String, String>>> perProcessorInfo) {
        Intrinsics.checkNotNullParameter((Object)commonInfo, "commonInfo");
        Intrinsics.checkNotNullParameter((Object)perProcessorInfo, "perProcessorInfo");
        this.commonInfo = commonInfo;
        this.perProcessorInfo = (List<List<Pair<String, String>>>)perProcessorInfo;
    }
    
    public static final /* synthetic */ CpuInfo access$getEMPTY$cp() {
        return CpuInfo.EMPTY;
    }
    
    public final List<Pair<String, String>> component1() {
        return this.commonInfo;
    }
    
    public final List<List<Pair<String, String>>> component2() {
        return this.perProcessorInfo;
    }
    
    public final CpuInfo copy(final List<Pair<String, String>> list, final List<? extends List<Pair<String, String>>> list2) {
        Intrinsics.checkNotNullParameter((Object)list, "commonInfo");
        Intrinsics.checkNotNullParameter((Object)list2, "perProcessorInfo");
        return new CpuInfo(list, list2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CpuInfo)) {
            return false;
        }
        final CpuInfo cpuInfo = (CpuInfo)o;
        return Intrinsics.areEqual((Object)this.commonInfo, (Object)cpuInfo.commonInfo) && Intrinsics.areEqual((Object)this.perProcessorInfo, (Object)cpuInfo.perProcessorInfo);
    }
    
    public final List<Pair<String, String>> getCommonInfo() {
        return this.commonInfo;
    }
    
    public final List<List<Pair<String, String>>> getPerProcessorInfo() {
        return this.perProcessorInfo;
    }
    
    @Override
    public int hashCode() {
        return this.commonInfo.hashCode() * 31 + this.perProcessorInfo.hashCode();
    }
    
    @Override
    public String toString() {
        return "CpuInfo(commonInfo=" + (Object)this.commonInfo + ", perProcessorInfo=" + (Object)this.perProcessorInfo + ')';
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo$Companion;", "", "()V", "EMPTY", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getEMPTY", "()Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final CpuInfo getEMPTY() {
            return CpuInfo.access$getEMPTY$cp();
        }
    }
}
