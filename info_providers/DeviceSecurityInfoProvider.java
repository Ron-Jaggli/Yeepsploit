package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Pair;
import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b0\u0007H&¨\u0006\t" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "", "encryptionStatus", "", "isPinSecurityEnabled", "", "securityProvidersData", "", "Lkotlin/Pair;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public interface DeviceSecurityInfoProvider
{
    String encryptionStatus();
    
    boolean isPinSecurityEnabled();
    
    List<Pair<String, String>> securityProvidersData();
}
