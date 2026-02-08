package com.fingerprintjs.android.fingerprint.device_id_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import kotlin.io.CloseableKt;
import android.database.Cursor;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import android.net.Uri;
import android.content.ContentResolver;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "getGsfAndroidId", "", "getGsfId", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class GsfIdProvider
{
    private final ContentResolver contentResolver;
    
    public GsfIdProvider(final ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }
    
    private final String getGsfId() {
        final Uri parse = Uri.parse("content://com.google.android.gsf.gservices");
        String s = null;
        try {
            final ContentResolver contentResolver = this.contentResolver;
            Intrinsics.checkNotNull((Object)contentResolver);
            final Cursor query = contentResolver.query(parse, (String[])null, (String)null, new String[] { "android_id" }, (String)null);
            Intrinsics.checkNotNull((Object)query);
            final Closeable closeable = (Closeable)query;
            try {
                final Cursor cursor = (Cursor)closeable;
                if (!cursor.moveToFirst() || cursor.getColumnCount() < 2) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                final String string = cursor.getString(1);
                Intrinsics.checkNotNullExpressionValue((Object)string, "getString(...)");
                final String hexString = Long.toHexString(Long.parseLong(string));
                CloseableKt.closeFinally(closeable, (Throwable)null);
                s = hexString;
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    CloseableKt.closeFinally(closeable, t);
                }
            }
            return s;
        }
        catch (final Exception ex) {
            return s;
        }
    }
    
    public final String getGsfAndroidId() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new GsfIdProvider$getGsfAndroidId.GsfIdProvider$getGsfAndroidId$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
}
