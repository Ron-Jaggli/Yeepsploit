package com.fingerprintjs.android.fingerprint.tools.logs;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/logs/Logger;", "", "()V", "LOG_TAG", "", "e", "", "msg", "throwable", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class Logger
{
    public static final Logger INSTANCE;
    private static final String LOG_TAG = "FingerprintJS";
    
    static {
        INSTANCE = new Logger();
    }
    
    private Logger() {
    }
    
    public final void e(final String s, final Throwable t) {
        Intrinsics.checkNotNullParameter((Object)s, "msg");
        if (t == null) {
            Log.e("FingerprintJS", s);
        }
        else {
            Log.e("FingerprintJS", s, t);
        }
    }
}
