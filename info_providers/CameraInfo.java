package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfo;", "", "cameraName", "", "cameraType", "cameraOrientation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraName", "()Ljava/lang/String;", "getCameraOrientation", "getCameraType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class CameraInfo
{
    private final String cameraName;
    private final String cameraOrientation;
    private final String cameraType;
    
    public CameraInfo(final String cameraName, final String cameraType, final String cameraOrientation) {
        Intrinsics.checkNotNullParameter((Object)cameraName, "cameraName");
        Intrinsics.checkNotNullParameter((Object)cameraType, "cameraType");
        Intrinsics.checkNotNullParameter((Object)cameraOrientation, "cameraOrientation");
        this.cameraName = cameraName;
        this.cameraType = cameraType;
        this.cameraOrientation = cameraOrientation;
    }
    
    public final String component1() {
        return this.cameraName;
    }
    
    public final String component2() {
        return this.cameraType;
    }
    
    public final String component3() {
        return this.cameraOrientation;
    }
    
    public final CameraInfo copy(final String s, final String s2, final String s3) {
        Intrinsics.checkNotNullParameter((Object)s, "cameraName");
        Intrinsics.checkNotNullParameter((Object)s2, "cameraType");
        Intrinsics.checkNotNullParameter((Object)s3, "cameraOrientation");
        return new CameraInfo(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CameraInfo)) {
            return false;
        }
        final CameraInfo cameraInfo = (CameraInfo)o;
        return Intrinsics.areEqual((Object)this.cameraName, (Object)cameraInfo.cameraName) && Intrinsics.areEqual((Object)this.cameraType, (Object)cameraInfo.cameraType) && Intrinsics.areEqual((Object)this.cameraOrientation, (Object)cameraInfo.cameraOrientation);
    }
    
    public final String getCameraName() {
        return this.cameraName;
    }
    
    public final String getCameraOrientation() {
        return this.cameraOrientation;
    }
    
    public final String getCameraType() {
        return this.cameraType;
    }
    
    @Override
    public int hashCode() {
        return (this.cameraName.hashCode() * 31 + this.cameraType.hashCode()) * 31 + this.cameraOrientation.hashCode();
    }
    
    @Override
    public String toString() {
        return "CameraInfo(cameraName=" + this.cameraName + ", cameraType=" + this.cameraType + ", cameraOrientation=" + this.cameraOrientation + ')';
    }
}
