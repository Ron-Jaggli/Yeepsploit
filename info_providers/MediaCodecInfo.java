package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/MediaCodecInfo;", "", "name", "", "capabilities", "", "(Ljava/lang/String;Ljava/util/List;)V", "getCapabilities", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class MediaCodecInfo
{
    private final List<String> capabilities;
    private final String name;
    
    public MediaCodecInfo(final String name, final List<String> capabilities) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)capabilities, "capabilities");
        this.name = name;
        this.capabilities = capabilities;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final List<String> component2() {
        return this.capabilities;
    }
    
    public final MediaCodecInfo copy(final String s, final List<String> list) {
        Intrinsics.checkNotNullParameter((Object)s, "name");
        Intrinsics.checkNotNullParameter((Object)list, "capabilities");
        return new MediaCodecInfo(s, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaCodecInfo)) {
            return false;
        }
        final MediaCodecInfo mediaCodecInfo = (MediaCodecInfo)o;
        return Intrinsics.areEqual((Object)this.name, (Object)mediaCodecInfo.name) && Intrinsics.areEqual((Object)this.capabilities, (Object)mediaCodecInfo.capabilities);
    }
    
    public final List<String> getCapabilities() {
        return this.capabilities;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode() * 31 + this.capabilities.hashCode();
    }
    
    @Override
    public String toString() {
        return "MediaCodecInfo(name=" + this.name + ", capabilities=" + (Object)this.capabilities + ')';
    }
}
