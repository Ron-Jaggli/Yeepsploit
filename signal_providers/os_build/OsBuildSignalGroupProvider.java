package com.fingerprintjs.android.fingerprint.signal_providers.os_build;

import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider;
import kotlin.Lazy;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\u0018H\u0002J\u0016\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00190\u0018H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildRawData;", "osBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "codecInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;", "deviceSecurityInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildRawData;", "rawData$delegate", "Lkotlin/Lazy;", "fingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "v2", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class OsBuildSignalGroupProvider extends SignalGroupProvider<OsBuildRawData>
{
    private final Hasher hasher;
    private final Lazy rawData$delegate;
    
    public OsBuildSignalGroupProvider(final OsBuildInfoProvider osBuildInfoProvider, final CodecInfoProvider codecInfoProvider, final DeviceSecurityInfoProvider deviceSecurityInfoProvider, final Hasher hasher, final int n) {
        Intrinsics.checkNotNullParameter((Object)osBuildInfoProvider, "osBuildInfoProvider");
        Intrinsics.checkNotNullParameter((Object)deviceSecurityInfoProvider, "deviceSecurityInfoProvider");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        super(n);
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy((Function0)new OsBuildSignalGroupProvider$rawData.OsBuildSignalGroupProvider$rawData$2(osBuildInfoProvider, codecInfoProvider, deviceSecurityInfoProvider));
    }
    
    private final OsBuildRawData getRawData() {
        return (OsBuildRawData)this.rawData$delegate.getValue();
    }
    
    private final List<IdentificationSignal<String>> v1() {
        return (List<IdentificationSignal<String>>)CollectionsKt.listOf((Object)this.getRawData().fingerprint());
    }
    
    private final List<IdentificationSignal<?>> v2() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.getRawData().androidVersion(), this.getRawData().sdkVersion(), this.getRawData().kernelVersion(), this.getRawData().encryptionStatus(), this.getRawData().securityProviders(), this.getRawData().codecList() });
    }
    
    @Override
    public String fingerprint(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final Hasher hasher = this.hasher;
        final int version = this.getVersion();
        Object o;
        if (version != 1) {
            if (version != 2) {
                o = this.v2();
            }
            else {
                o = this.v2();
            }
        }
        else {
            o = this.v1();
        }
        return hasher.hash(this.combineSignals((List<? extends IdentificationSignal<?>>)o, stabilityLevel));
    }
    
    @Override
    public OsBuildRawData rawData() {
        return this.getRawData();
    }
}
