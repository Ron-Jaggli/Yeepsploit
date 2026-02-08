package com.fingerprintjs.android.fingerprint.signal_providers.installed_apps;

import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.info_providers.PackageInfo;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource;
import kotlin.Lazy;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00140\u00150\u0014H\u0002J\u001a\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00140\u00150\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsRawData;", "packageManagerDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsRawData;", "rawData$delegate", "Lkotlin/Lazy;", "fingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "v2", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class InstalledAppsSignalGroupProvider extends SignalGroupProvider<InstalledAppsRawData>
{
    private final Hasher hasher;
    private final Lazy rawData$delegate;
    
    public InstalledAppsSignalGroupProvider(final PackageManagerDataSource packageManagerDataSource, final Hasher hasher, final int n) {
        Intrinsics.checkNotNullParameter((Object)packageManagerDataSource, "packageManagerDataSource");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        super(n);
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy((Function0)new InstalledAppsSignalGroupProvider$rawData.InstalledAppsSignalGroupProvider$rawData$2(packageManagerDataSource));
    }
    
    private final InstalledAppsRawData getRawData() {
        return (InstalledAppsRawData)this.rawData$delegate.getValue();
    }
    
    private final List<IdentificationSignal<List<PackageInfo>>> v1() {
        return (List<IdentificationSignal<List<PackageInfo>>>)CollectionsKt.listOf((Object)this.getRawData().applicationsList());
    }
    
    private final List<IdentificationSignal<List<PackageInfo>>> v2() {
        return (List<IdentificationSignal<List<PackageInfo>>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.getRawData().applicationsList(), this.getRawData().systemApplicationsList() });
    }
    
    @Override
    public String fingerprint(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final Hasher hasher = this.hasher;
        final int version = this.getVersion();
        String s;
        if (version != 1) {
            if (version != 2) {
                s = this.combineSignals(this.v2(), stabilityLevel);
            }
            else {
                s = this.combineSignals(this.v2(), stabilityLevel);
            }
        }
        else {
            s = this.combineSignals(this.v1(), StabilityLevel.UNIQUE);
        }
        return hasher.hash(s);
    }
    
    @Override
    public InstalledAppsRawData rawData() {
        return this.getRawData();
    }
}
