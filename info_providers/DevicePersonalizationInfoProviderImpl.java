package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import android.media.RingtoneManager;
import android.content.res.Configuration;
import android.content.res.AssetManager;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "ringtoneManager", "Landroid/media/RingtoneManager;", "assetManager", "Landroid/content/res/AssetManager;", "configuration", "Landroid/content/res/Configuration;", "(Landroid/media/RingtoneManager;Landroid/content/res/AssetManager;Landroid/content/res/Configuration;)V", "availableLocales", "", "", "()[Ljava/lang/String;", "defaultLanguage", "regionCountry", "ringtoneSource", "timezone", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DevicePersonalizationInfoProviderImpl implements DevicePersonalizationInfoProvider
{
    private final AssetManager assetManager;
    private final Configuration configuration;
    private final RingtoneManager ringtoneManager;
    
    public DevicePersonalizationInfoProviderImpl(final RingtoneManager ringtoneManager, final AssetManager assetManager, final Configuration configuration) {
        this.ringtoneManager = ringtoneManager;
        this.assetManager = assetManager;
        this.configuration = configuration;
    }
    
    @Override
    public String[] availableLocales() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new DevicePersonalizationInfoProviderImpl$availableLocales.DevicePersonalizationInfoProviderImpl$availableLocales$1(this), 1, (Object)null))) {
            safeWithTimeout$default = new String[0];
        }
        return (String[])safeWithTimeout$default;
    }
    
    @Override
    public String defaultLanguage() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)DevicePersonalizationInfoProviderImpl$defaultLanguage.DevicePersonalizationInfoProviderImpl$defaultLanguage$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String regionCountry() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new DevicePersonalizationInfoProviderImpl$regionCountry.DevicePersonalizationInfoProviderImpl$regionCountry$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String ringtoneSource() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new DevicePersonalizationInfoProviderImpl$ringtoneSource.DevicePersonalizationInfoProviderImpl$ringtoneSource$1(this), 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public String timezone() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)DevicePersonalizationInfoProviderImpl$timezone.DevicePersonalizationInfoProviderImpl$timezone$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
}
