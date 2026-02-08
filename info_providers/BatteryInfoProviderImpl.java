package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "batteryHealth", "", "batteryHealthStringDescription", "", "batteryTotalCapacity", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class BatteryInfoProviderImpl implements BatteryInfoProvider
{
    private final Context applicationContext;
    
    public BatteryInfoProviderImpl(final Context applicationContext) {
        Intrinsics.checkNotNullParameter((Object)applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }
    
    private final String batteryHealthStringDescription(final int n) {
        String s = null;
        switch (n) {
            default: {
                s = "unknown";
                break;
            }
            case 7: {
                s = "cold";
                break;
            }
            case 6: {
                s = "unspecified failure";
                break;
            }
            case 5: {
                s = "over voltage";
                break;
            }
            case 4: {
                s = "dead";
                break;
            }
            case 3: {
                s = "overheat";
                break;
            }
            case 2: {
                s = "good";
                break;
            }
        }
        return s;
    }
    
    @Override
    public String batteryHealth() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new BatteryInfoProviderImpl$batteryHealth.BatteryInfoProviderImpl$batteryHealth$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String batteryTotalCapacity() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new BatteryInfoProviderImpl$batteryTotalCapacity.BatteryInfoProviderImpl$batteryTotalCapacity$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
}
