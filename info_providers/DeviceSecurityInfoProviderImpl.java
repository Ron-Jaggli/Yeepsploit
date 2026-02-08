package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.collections.CollectionsKt;
import kotlin.Pair;
import java.util.List;
import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r0\fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "devicePolicyManager", "Landroid/app/admin/DevicePolicyManager;", "keyguardManager", "Landroid/app/KeyguardManager;", "(Landroid/app/admin/DevicePolicyManager;Landroid/app/KeyguardManager;)V", "encryptionStatus", "", "isPinSecurityEnabled", "", "securityProvidersData", "", "Lkotlin/Pair;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceSecurityInfoProviderImpl implements DeviceSecurityInfoProvider
{
    private final DevicePolicyManager devicePolicyManager;
    private final KeyguardManager keyguardManager;
    
    public DeviceSecurityInfoProviderImpl(final DevicePolicyManager devicePolicyManager, final KeyguardManager keyguardManager) {
        this.devicePolicyManager = devicePolicyManager;
        this.keyguardManager = keyguardManager;
    }
    
    @Override
    public String encryptionStatus() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new DeviceSecurityInfoProviderImpl$encryptionStatus.DeviceSecurityInfoProviderImpl$encryptionStatus$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public boolean isPinSecurityEnabled() {
        Object o;
        if (Result.isFailure-impl(o = SafeKt.safeWithTimeout$default(0L, (Function0)new DeviceSecurityInfoProviderImpl$isPinSecurityEnabled.DeviceSecurityInfoProviderImpl$isPinSecurityEnabled$1(this), 1, (Object)null))) {
            o = false;
        }
        return (boolean)o;
    }
    
    @Override
    public List<Pair<String, String>> securityProvidersData() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)DeviceSecurityInfoProviderImpl$securityProvidersData.DeviceSecurityInfoProviderImpl$securityProvidersData$1.INSTANCE, 1, (Object)null);
        final List emptyList = CollectionsKt.emptyList();
        List list = (List)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            list = emptyList;
        }
        return (List<Pair<String, String>>)list;
    }
}
