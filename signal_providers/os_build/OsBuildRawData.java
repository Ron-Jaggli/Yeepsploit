package com.fingerprintjs.android.fingerprint.signal_providers.os_build;

import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Pair;
import com.fingerprintjs.android.fingerprint.info_providers.MediaCodecInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\b¢\u0006\u0002\u0010\rJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0017J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\bH\u00c6\u0003Jg\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\bH\u00c6\u0001J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\t\u0010$\u001a\u00020%H\u00d6\u0001J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017J\u001e\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\b0\u0017J\u0016\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0\u00170\bH\u0016J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006)" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "fingerprint", "", "androidVersion", "sdkVersion", "kernelVersion", "codecList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/MediaCodecInfo;", "encryptionStatus", "securityProvidersData", "Lkotlin/Pair;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getAndroidVersion", "()Ljava/lang/String;", "getCodecList", "()Ljava/util/List;", "getEncryptionStatus", "getFingerprint", "getKernelVersion", "getSdkVersion", "getSecurityProvidersData", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "securityProviders", "signals", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class OsBuildRawData extends RawData
{
    private final String androidVersion;
    private final List<MediaCodecInfo> codecList;
    private final String encryptionStatus;
    private final String fingerprint;
    private final String kernelVersion;
    private final String sdkVersion;
    private final List<Pair<String, String>> securityProvidersData;
    
    public OsBuildRawData(final String fingerprint, final String androidVersion, final String sdkVersion, final String kernelVersion, final List<MediaCodecInfo> codecList, final String encryptionStatus, final List<Pair<String, String>> securityProvidersData) {
        Intrinsics.checkNotNullParameter((Object)fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter((Object)androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter((Object)sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter((Object)kernelVersion, "kernelVersion");
        Intrinsics.checkNotNullParameter((Object)codecList, "codecList");
        Intrinsics.checkNotNullParameter((Object)encryptionStatus, "encryptionStatus");
        Intrinsics.checkNotNullParameter((Object)securityProvidersData, "securityProvidersData");
        this.fingerprint = fingerprint;
        this.androidVersion = androidVersion;
        this.sdkVersion = sdkVersion;
        this.kernelVersion = kernelVersion;
        this.codecList = codecList;
        this.encryptionStatus = encryptionStatus;
        this.securityProvidersData = securityProvidersData;
    }
    
    public final IdentificationSignal<String> androidVersion() {
        return (IdentificationSignal<String>)new OsBuildRawData$androidVersion.OsBuildRawData$androidVersion$1(this, StabilityLevel.OPTIMAL, this.androidVersion);
    }
    
    public final IdentificationSignal<List<MediaCodecInfo>> codecList() {
        return (IdentificationSignal<List<MediaCodecInfo>>)new OsBuildRawData$codecList.OsBuildRawData$codecList$1(this, StabilityLevel.OPTIMAL, (List)this.codecList);
    }
    
    public final String component1() {
        return this.fingerprint;
    }
    
    public final String component2() {
        return this.androidVersion;
    }
    
    public final String component3() {
        return this.sdkVersion;
    }
    
    public final String component4() {
        return this.kernelVersion;
    }
    
    public final List<MediaCodecInfo> component5() {
        return this.codecList;
    }
    
    public final String component6() {
        return this.encryptionStatus;
    }
    
    public final List<Pair<String, String>> component7() {
        return this.securityProvidersData;
    }
    
    public final OsBuildRawData copy(final String s, final String s2, final String s3, final String s4, final List<MediaCodecInfo> list, final String s5, final List<Pair<String, String>> list2) {
        Intrinsics.checkNotNullParameter((Object)s, "fingerprint");
        Intrinsics.checkNotNullParameter((Object)s2, "androidVersion");
        Intrinsics.checkNotNullParameter((Object)s3, "sdkVersion");
        Intrinsics.checkNotNullParameter((Object)s4, "kernelVersion");
        Intrinsics.checkNotNullParameter((Object)list, "codecList");
        Intrinsics.checkNotNullParameter((Object)s5, "encryptionStatus");
        Intrinsics.checkNotNullParameter((Object)list2, "securityProvidersData");
        return new OsBuildRawData(s, s2, s3, s4, list, s5, list2);
    }
    
    public final IdentificationSignal<String> encryptionStatus() {
        return (IdentificationSignal<String>)new OsBuildRawData$encryptionStatus.OsBuildRawData$encryptionStatus$1(this, StabilityLevel.OPTIMAL, this.encryptionStatus);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsBuildRawData)) {
            return false;
        }
        final OsBuildRawData osBuildRawData = (OsBuildRawData)o;
        return Intrinsics.areEqual((Object)this.fingerprint, (Object)osBuildRawData.fingerprint) && Intrinsics.areEqual((Object)this.androidVersion, (Object)osBuildRawData.androidVersion) && Intrinsics.areEqual((Object)this.sdkVersion, (Object)osBuildRawData.sdkVersion) && Intrinsics.areEqual((Object)this.kernelVersion, (Object)osBuildRawData.kernelVersion) && Intrinsics.areEqual((Object)this.codecList, (Object)osBuildRawData.codecList) && Intrinsics.areEqual((Object)this.encryptionStatus, (Object)osBuildRawData.encryptionStatus) && Intrinsics.areEqual((Object)this.securityProvidersData, (Object)osBuildRawData.securityProvidersData);
    }
    
    public final IdentificationSignal<String> fingerprint() {
        return (IdentificationSignal<String>)new OsBuildRawData$fingerprint.OsBuildRawData$fingerprint$1(this, StabilityLevel.OPTIMAL, this.fingerprint);
    }
    
    public final String getAndroidVersion() {
        return this.androidVersion;
    }
    
    public final List<MediaCodecInfo> getCodecList() {
        return this.codecList;
    }
    
    public final String getEncryptionStatus() {
        return this.encryptionStatus;
    }
    
    public final String getFingerprint() {
        return this.fingerprint;
    }
    
    public final String getKernelVersion() {
        return this.kernelVersion;
    }
    
    public final String getSdkVersion() {
        return this.sdkVersion;
    }
    
    public final List<Pair<String, String>> getSecurityProvidersData() {
        return this.securityProvidersData;
    }
    
    @Override
    public int hashCode() {
        return (((((this.fingerprint.hashCode() * 31 + this.androidVersion.hashCode()) * 31 + this.sdkVersion.hashCode()) * 31 + this.kernelVersion.hashCode()) * 31 + this.codecList.hashCode()) * 31 + this.encryptionStatus.hashCode()) * 31 + this.securityProvidersData.hashCode();
    }
    
    public final IdentificationSignal<String> kernelVersion() {
        return (IdentificationSignal<String>)new OsBuildRawData$kernelVersion.OsBuildRawData$kernelVersion$1(this, StabilityLevel.OPTIMAL, this.kernelVersion);
    }
    
    public final IdentificationSignal<String> sdkVersion() {
        return (IdentificationSignal<String>)new OsBuildRawData$sdkVersion.OsBuildRawData$sdkVersion$1(this, StabilityLevel.OPTIMAL, this.sdkVersion);
    }
    
    public final IdentificationSignal<List<Pair<String, String>>> securityProviders() {
        return (IdentificationSignal<List<Pair<String, String>>>)new OsBuildRawData$securityProviders.OsBuildRawData$securityProviders$1(this, StabilityLevel.OPTIMAL, (List)this.securityProvidersData);
    }
    
    @Override
    public List<IdentificationSignal<?>> signals() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.fingerprint(), this.androidVersion(), this.sdkVersion(), this.kernelVersion(), this.codecList(), this.encryptionStatus(), this.securityProviders() });
    }
    
    @Override
    public String toString() {
        return "OsBuildRawData(fingerprint=" + this.fingerprint + ", androidVersion=" + this.androidVersion + ", sdkVersion=" + this.sdkVersion + ", kernelVersion=" + this.kernelVersion + ", codecList=" + (Object)this.codecList + ", encryptionStatus=" + this.encryptionStatus + ", securityProvidersData=" + (Object)this.securityProvidersData + ')';
    }
}
