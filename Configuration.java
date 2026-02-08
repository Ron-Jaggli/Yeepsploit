package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/Configuration;", "", "version", "", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "(ILcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)V", "getHasher", "()Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "getVersion", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class Configuration
{
    private final Hasher hasher;
    private final int version;
    
    public Configuration(final int n) {
        this(n, null, 2, null);
    }
    
    public Configuration(final int version, final Hasher hasher) {
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        this.version = version;
        this.hasher = hasher;
    }
    
    public final int component1() {
        return this.version;
    }
    
    public final Hasher component2() {
        return this.hasher;
    }
    
    public final Configuration copy(final int n, final Hasher hasher) {
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        return new Configuration(n, hasher);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Configuration)) {
            return false;
        }
        final Configuration configuration = (Configuration)o;
        return this.version == configuration.version && Intrinsics.areEqual((Object)this.hasher, (Object)configuration.hasher);
    }
    
    public final Hasher getHasher() {
        return this.hasher;
    }
    
    public final int getVersion() {
        return this.version;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.version) * 31 + this.hasher.hashCode();
    }
    
    @Override
    public String toString() {
        return "Configuration(version=" + this.version + ", hasher=" + (Object)this.hasher + ')';
    }
}
