package com.fingerprintjs.android.fingerprint.signal_providers.installed_apps;

import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.PackageInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b0\u0003H\u0016J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000bJ\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "applicationsNamesList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "systemApplicationsList", "(Ljava/util/List;Ljava/util/List;)V", "getApplicationsNamesList", "()Ljava/util/List;", "getSystemApplicationsList", "applicationsList", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "signals", "toString", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class InstalledAppsRawData extends RawData
{
    private final List<PackageInfo> applicationsNamesList;
    private final List<PackageInfo> systemApplicationsList;
    
    public InstalledAppsRawData(final List<PackageInfo> applicationsNamesList, final List<PackageInfo> systemApplicationsList) {
        Intrinsics.checkNotNullParameter((Object)applicationsNamesList, "applicationsNamesList");
        Intrinsics.checkNotNullParameter((Object)systemApplicationsList, "systemApplicationsList");
        this.applicationsNamesList = applicationsNamesList;
        this.systemApplicationsList = systemApplicationsList;
    }
    
    public final IdentificationSignal<List<PackageInfo>> applicationsList() {
        return (IdentificationSignal<List<PackageInfo>>)new InstalledAppsRawData$applicationsList.InstalledAppsRawData$applicationsList$1(this, StabilityLevel.UNIQUE, (List)this.applicationsNamesList);
    }
    
    public final List<PackageInfo> component1() {
        return this.applicationsNamesList;
    }
    
    public final List<PackageInfo> component2() {
        return this.systemApplicationsList;
    }
    
    public final InstalledAppsRawData copy(final List<PackageInfo> list, final List<PackageInfo> list2) {
        Intrinsics.checkNotNullParameter((Object)list, "applicationsNamesList");
        Intrinsics.checkNotNullParameter((Object)list2, "systemApplicationsList");
        return new InstalledAppsRawData(list, list2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstalledAppsRawData)) {
            return false;
        }
        final InstalledAppsRawData installedAppsRawData = (InstalledAppsRawData)o;
        return Intrinsics.areEqual((Object)this.applicationsNamesList, (Object)installedAppsRawData.applicationsNamesList) && Intrinsics.areEqual((Object)this.systemApplicationsList, (Object)installedAppsRawData.systemApplicationsList);
    }
    
    public final List<PackageInfo> getApplicationsNamesList() {
        return this.applicationsNamesList;
    }
    
    public final List<PackageInfo> getSystemApplicationsList() {
        return this.systemApplicationsList;
    }
    
    @Override
    public int hashCode() {
        return this.applicationsNamesList.hashCode() * 31 + this.systemApplicationsList.hashCode();
    }
    
    @Override
    public List<IdentificationSignal<List<PackageInfo>>> signals() {
        return (List<IdentificationSignal<List<PackageInfo>>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.applicationsList(), this.systemApplicationsList() });
    }
    
    public final IdentificationSignal<List<PackageInfo>> systemApplicationsList() {
        return (IdentificationSignal<List<PackageInfo>>)new InstalledAppsRawData$systemApplicationsList.InstalledAppsRawData$systemApplicationsList$1(this, StabilityLevel.OPTIMAL, (List)this.systemApplicationsList);
    }
    
    @Override
    public String toString() {
        return "InstalledAppsRawData(applicationsNamesList=" + (Object)this.applicationsNamesList + ", systemApplicationsList=" + (Object)this.systemApplicationsList + ')';
    }
}
