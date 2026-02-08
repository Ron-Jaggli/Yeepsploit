package com.fingerprintjs.android.fingerprint;

import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "", "deviceId", "", "gsfId", "androidId", "mediaDrmId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidId", "()Ljava/lang/String;", "getDeviceId", "getGsfId", "getMediaDrmId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceIdResult
{
    private final String androidId;
    private final String deviceId;
    private final String gsfId;
    private final String mediaDrmId;
    
    public DeviceIdResult(final String deviceId, final String gsfId, final String androidId, final String mediaDrmId) {
        Intrinsics.checkNotNullParameter((Object)deviceId, "deviceId");
        Intrinsics.checkNotNullParameter((Object)gsfId, "gsfId");
        Intrinsics.checkNotNullParameter((Object)androidId, "androidId");
        Intrinsics.checkNotNullParameter((Object)mediaDrmId, "mediaDrmId");
        this.deviceId = deviceId;
        this.gsfId = gsfId;
        this.androidId = androidId;
        this.mediaDrmId = mediaDrmId;
    }
    
    public final String component1() {
        return this.deviceId;
    }
    
    public final String component2() {
        return this.gsfId;
    }
    
    public final String component3() {
        return this.androidId;
    }
    
    public final String component4() {
        return this.mediaDrmId;
    }
    
    public final DeviceIdResult copy(final String s, final String s2, final String s3, final String s4) {
        Intrinsics.checkNotNullParameter((Object)s, "deviceId");
        Intrinsics.checkNotNullParameter((Object)s2, "gsfId");
        Intrinsics.checkNotNullParameter((Object)s3, "androidId");
        Intrinsics.checkNotNullParameter((Object)s4, "mediaDrmId");
        return new DeviceIdResult(s, s2, s3, s4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceIdResult)) {
            return false;
        }
        final DeviceIdResult deviceIdResult = (DeviceIdResult)o;
        return Intrinsics.areEqual((Object)this.deviceId, (Object)deviceIdResult.deviceId) && Intrinsics.areEqual((Object)this.gsfId, (Object)deviceIdResult.gsfId) && Intrinsics.areEqual((Object)this.androidId, (Object)deviceIdResult.androidId) && Intrinsics.areEqual((Object)this.mediaDrmId, (Object)deviceIdResult.mediaDrmId);
    }
    
    public final String getAndroidId() {
        return this.androidId;
    }
    
    public final String getDeviceId() {
        return this.deviceId;
    }
    
    public final String getGsfId() {
        return this.gsfId;
    }
    
    public final String getMediaDrmId() {
        return this.mediaDrmId;
    }
    
    @Override
    public int hashCode() {
        return ((this.deviceId.hashCode() * 31 + this.gsfId.hashCode()) * 31 + this.androidId.hashCode()) * 31 + this.mediaDrmId.hashCode();
    }
    
    @Override
    public String toString() {
        return "DeviceIdResult(deviceId=" + this.deviceId + ", gsfId=" + this.gsfId + ", androidId=" + this.androidId + ", mediaDrmId=" + this.mediaDrmId + ')';
    }
}
