package com.fingerprintjs.android.fingerprint.signal_providers.device_state;

import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource;
import kotlin.Lazy;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b0\u001aH\u0002J\u0016\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001b0\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateRawData;", "settingsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "devicePersonalizationInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "deviceSecurityInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "fingerprintSensorInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateRawData;", "rawData$delegate", "Lkotlin/Lazy;", "fingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "", "v2", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceStateSignalGroupProvider extends SignalGroupProvider<DeviceStateRawData>
{
    private final Hasher hasher;
    private final Lazy rawData$delegate;
    
    public DeviceStateSignalGroupProvider(final SettingsDataSource settingsDataSource, final DevicePersonalizationInfoProvider devicePersonalizationInfoProvider, final DeviceSecurityInfoProvider deviceSecurityInfoProvider, final FingerprintSensorInfoProvider fingerprintSensorInfoProvider, final Hasher hasher, final int n) {
        Intrinsics.checkNotNullParameter((Object)settingsDataSource, "settingsDataSource");
        Intrinsics.checkNotNullParameter((Object)devicePersonalizationInfoProvider, "devicePersonalizationInfoProvider");
        Intrinsics.checkNotNullParameter((Object)deviceSecurityInfoProvider, "deviceSecurityInfoProvider");
        Intrinsics.checkNotNullParameter((Object)fingerprintSensorInfoProvider, "fingerprintSensorInfoProvider");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        super(n);
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy((Function0)new DeviceStateSignalGroupProvider$rawData.DeviceStateSignalGroupProvider$rawData$2(settingsDataSource, deviceSecurityInfoProvider, fingerprintSensorInfoProvider, devicePersonalizationInfoProvider));
    }
    
    private final DeviceStateRawData getRawData() {
        return (DeviceStateRawData)this.rawData$delegate.getValue();
    }
    
    private final List<IdentificationSignal<?>> v1() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.getRawData().adbEnabled(), this.getRawData().developmentSettingsEnabled(), this.getRawData().httpProxy(), this.getRawData().transitionAnimationScale(), this.getRawData().windowAnimationScale(), this.getRawData().dataRoamingEnabled(), this.getRawData().accessibilityEnabled(), this.getRawData().defaultInputMethod(), this.getRawData().rttCallingMode(), this.getRawData().touchExplorationEnabled(), this.getRawData().alarmAlertPath(), this.getRawData().dateFormat(), this.getRawData().endButtonBehaviour(), this.getRawData().fontScale(), this.getRawData().screenOffTimeout(), this.getRawData().textAutoReplaceEnable(), this.getRawData().textAutoPunctuate(), this.getRawData().time12Or24(), this.getRawData().isPinSecurityEnabled(), this.getRawData().fingerprintSensorStatus(), this.getRawData().ringtoneSource(), this.getRawData().availableLocales() });
    }
    
    private final List<IdentificationSignal<?>> v2() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.getRawData().adbEnabled(), this.getRawData().developmentSettingsEnabled(), this.getRawData().httpProxy(), this.getRawData().transitionAnimationScale(), this.getRawData().windowAnimationScale(), this.getRawData().dataRoamingEnabled(), this.getRawData().accessibilityEnabled(), this.getRawData().defaultInputMethod(), this.getRawData().touchExplorationEnabled(), this.getRawData().alarmAlertPath(), this.getRawData().dateFormat(), this.getRawData().endButtonBehaviour(), this.getRawData().fontScale(), this.getRawData().screenOffTimeout(), this.getRawData().time12Or24(), this.getRawData().isPinSecurityEnabled(), this.getRawData().fingerprintSensorStatus(), this.getRawData().ringtoneSource(), this.getRawData().availableLocales(), this.getRawData().regionCountry(), this.getRawData().timezone(), this.getRawData().defaultLanguage() });
    }
    
    @Override
    public String fingerprint(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final Hasher hasher = this.hasher;
        final int version = this.getVersion();
        String s;
        if (version != 1) {
            if (version != 2) {
                s = this.combineSignals(this.v2(), stabilityLevel);
            }
            else {
                s = this.combineSignals(this.v2(), stabilityLevel);
            }
        }
        else {
            s = this.combineSignals(this.v1(), StabilityLevel.UNIQUE);
        }
        return hasher.hash(s);
    }
    
    @Override
    public DeviceStateRawData rawData() {
        return this.getRawData();
    }
}
