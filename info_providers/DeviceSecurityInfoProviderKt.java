package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "ACTIVATING", "", "ACTIVE", "ACTIVE_PER_USER", "INACTIVE", "UNSUPPORTED", "stringDescriptionForEncryptionStatus", "status", "", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceSecurityInfoProviderKt
{
    private static final String ACTIVATING = "activating";
    private static final String ACTIVE = "active";
    private static final String ACTIVE_PER_USER = "active_per_user";
    private static final String INACTIVE = "inactive";
    private static final String UNSUPPORTED = "unsupported";
    
    private static final String stringDescriptionForEncryptionStatus(final int n) {
        String s;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 5) {
                            s = "";
                        }
                        else {
                            s = "active_per_user";
                        }
                    }
                    else {
                        s = "active";
                    }
                }
                else {
                    s = "activating";
                }
            }
            else {
                s = "inactive";
            }
        }
        else {
            s = "unsupported";
        }
        return s;
    }
}
