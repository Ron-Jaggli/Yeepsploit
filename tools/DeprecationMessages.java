package com.fingerprintjs.android.fingerprint.tools;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/DeprecationMessages;", "", "()V", "DEPRECATED_SYMBOL", "", "UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API", "UTIL_UNINTENDED_PUBLIC_API", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeprecationMessages
{
    public static final String DEPRECATED_SYMBOL = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.";
    public static final DeprecationMessages INSTANCE;
    public static final String UNREACHABLE_SYMBOL_UNINTENDED_PUBLIC_API = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.";
    public static final String UTIL_UNINTENDED_PUBLIC_API = "This symbol has historically been public but is intended for internal use only. We will remove public visibility for this symbol in future versions.";
    
    static {
        INSTANCE = new DeprecationMessages();
    }
    
    private DeprecationMessages() {
    }
}
