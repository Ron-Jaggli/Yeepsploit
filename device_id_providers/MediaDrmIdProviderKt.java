package com.fingerprintjs.android.fingerprint.device_id_providers;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "MEDIA_DRM_ID_TIMEOUT_MS", "", "WIDEWINE_UUID_LEAST_SIG_BITS", "WIDEWINE_UUID_MOST_SIG_BITS", "toHexString", "", "", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class MediaDrmIdProviderKt
{
    private static final long MEDIA_DRM_ID_TIMEOUT_MS = 3000L;
    private static final long WIDEWINE_UUID_LEAST_SIG_BITS = -6645017420763422227L;
    private static final long WIDEWINE_UUID_MOST_SIG_BITS = -1301668207276963122L;
    
    private static final String toHexString(final byte[] array) {
        return ArraysKt.joinToString$default(array, (CharSequence)"", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)MediaDrmIdProviderKt$toHexString.MediaDrmIdProviderKt$toHexString$1.INSTANCE, 30, (Object)null);
    }
}
