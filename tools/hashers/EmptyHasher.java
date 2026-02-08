package com.fingerprintjs.android.fingerprint.tools.hashers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically been public but is intended for internal use only. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/hashers/EmptyHasher;", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "()V", "hash", "", "data", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class EmptyHasher implements Hasher
{
    @Override
    public String hash(final String s) {
        Intrinsics.checkNotNullParameter((Object)s, "data");
        return s;
    }
}
