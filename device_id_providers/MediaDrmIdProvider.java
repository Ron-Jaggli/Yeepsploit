package com.fingerprintjs.android.fingerprint.device_id_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import android.media.MediaDrm;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "", "()V", "getMediaDrmId", "", "mediaDrmId", "releaseMediaDRM", "", "drmObject", "Landroid/media/MediaDrm;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class MediaDrmIdProvider
{
    private final String mediaDrmId() {
        final MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
        final byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
        Intrinsics.checkNotNullExpressionValue((Object)propertyByteArray, "getPropertyByteArray(...)");
        this.releaseMediaDRM(mediaDrm);
        final MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance(...)");
        instance.update(propertyByteArray);
        final byte[] digest = instance.digest();
        Intrinsics.checkNotNullExpressionValue((Object)digest, "digest(...)");
        return MediaDrmIdProviderKt.access$toHexString(digest);
    }
    
    private final void releaseMediaDRM(final MediaDrm mediaDrm) {
        mediaDrm.close();
    }
    
    public final String getMediaDrmId() {
        Object safeWithTimeout;
        if (Result.isFailure-impl(safeWithTimeout = SafeKt.safeWithTimeout(MediaDrmIdProviderKt.access$getMEDIA_DRM_ID_TIMEOUT_MS$p(), (Function0)new MediaDrmIdProvider$getMediaDrmId.MediaDrmIdProvider$getMediaDrmId$1(this)))) {
            safeWithTimeout = null;
        }
        return (String)safeWithTimeout;
    }
}
