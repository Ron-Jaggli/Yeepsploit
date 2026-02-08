package com.fingerprintjs.android.fingerprint.tools;

import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0001¨\u0006\u0005" }, d2 = { "inRange", "", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "added", "removed", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class IdentificationVersionExtensionsKt
{
    public static final boolean inRange(final Fingerprinter$Version fingerprinter$Version, final Fingerprinter$Version fingerprinter$Version2, final Fingerprinter$Version fingerprinter$Version3) {
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "<this>");
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version2, "added");
        return fingerprinter$Version.getIntValue$fingerprint_release() >= fingerprinter$Version2.getIntValue$fingerprint_release() && (fingerprinter$Version3 == null || fingerprinter$Version.getIntValue$fingerprint_release() < fingerprinter$Version3.getIntValue$fingerprint_release());
    }
}
