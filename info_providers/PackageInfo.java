package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageInfo;", "", "packageName", "", "(Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class PackageInfo
{
    private final String packageName;
    
    public PackageInfo(final String packageName) {
        Intrinsics.checkNotNullParameter((Object)packageName, "packageName");
        this.packageName = packageName;
    }
    
    public final String component1() {
        return this.packageName;
    }
    
    public final PackageInfo copy(final String s) {
        Intrinsics.checkNotNullParameter((Object)s, "packageName");
        return new PackageInfo(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof PackageInfo && Intrinsics.areEqual((Object)this.packageName, (Object)((PackageInfo)o).packageName));
    }
    
    public final String getPackageName() {
        return this.packageName;
    }
    
    @Override
    public int hashCode() {
        return this.packageName.hashCode();
    }
    
    @Override
    public String toString() {
        return this.packageName;
    }
}
