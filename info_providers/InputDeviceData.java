package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceData;", "", "name", "", "vendor", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVendor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class InputDeviceData
{
    private final String name;
    private final String vendor;
    
    public InputDeviceData(final String name, final String vendor) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)vendor, "vendor");
        this.name = name;
        this.vendor = vendor;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final String component2() {
        return this.vendor;
    }
    
    public final InputDeviceData copy(final String s, final String s2) {
        Intrinsics.checkNotNullParameter((Object)s, "name");
        Intrinsics.checkNotNullParameter((Object)s2, "vendor");
        return new InputDeviceData(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InputDeviceData)) {
            return false;
        }
        final InputDeviceData inputDeviceData = (InputDeviceData)o;
        return Intrinsics.areEqual((Object)this.name, (Object)inputDeviceData.name) && Intrinsics.areEqual((Object)this.vendor, (Object)inputDeviceData.vendor);
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getVendor() {
        return this.vendor;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode() * 31 + this.vendor.hashCode();
    }
    
    @Override
    public String toString() {
        return "InputDeviceData(name=" + this.name + ", vendor=" + this.vendor + ')';
    }
}
