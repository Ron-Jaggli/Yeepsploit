package com.fingerprintjs.android.fingerprint.device_id_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import android.content.ContentResolver;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getAndroidId", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class AndroidIdProvider
{
    private final ContentResolver contentResolver;
    
    public AndroidIdProvider(final ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }
    
    public final String getAndroidId() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new AndroidIdProvider$getAndroidId.AndroidIdProvider$getAndroidId$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
}
