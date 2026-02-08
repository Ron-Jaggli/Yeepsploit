package com.fingerprintjs.android.fingerprint.signal_providers.device_state;

import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00d3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030:J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0:J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0016H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\u0089\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u00c6\u0001J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030:J\u0013\u0010U\u001a\u00020\u00162\b\u0010V\u001a\u0004\u0018\u00010WH\u00d6\u0003J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030:J\t\u0010X\u001a\u00020YH\u00d6\u0001J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160:J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030:J\u0016\u0010Z\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020W0:0\u001aH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030:J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030:J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030:R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010.R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 ¨\u0006\\" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "adbEnabled", "", "developmentSettingsEnabled", "httpProxy", "transitionAnimationScale", "windowAnimationScale", "dataRoamingEnabled", "accessibilityEnabled", "defaultInputMethod", "rttCallingMode", "touchExplorationEnabled", "alarmAlertPath", "dateFormat", "endButtonBehaviour", "fontScale", "screenOffTimeout", "textAutoReplaceEnable", "textAutoPunctuate", "time12Or24", "isPinSecurityEnabled", "", "fingerprintSensorStatus", "ringtoneSource", "availableLocales", "", "regionCountry", "defaultLanguage", "timezone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessibilityEnabled", "()Ljava/lang/String;", "getAdbEnabled", "getAlarmAlertPath", "getAvailableLocales", "()Ljava/util/List;", "getDataRoamingEnabled", "getDateFormat", "getDefaultInputMethod", "getDefaultLanguage", "getDevelopmentSettingsEnabled", "getEndButtonBehaviour", "getFingerprintSensorStatus", "getFontScale", "getHttpProxy", "()Z", "getRegionCountry", "getRingtoneSource", "getRttCallingMode", "getScreenOffTimeout", "getTextAutoPunctuate", "getTextAutoReplaceEnable", "getTime12Or24", "getTimezone", "getTouchExplorationEnabled", "getTransitionAnimationScale", "getWindowAnimationScale", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "signals", "toString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceStateRawData extends RawData
{
    private final String accessibilityEnabled;
    private final String adbEnabled;
    private final String alarmAlertPath;
    private final List<String> availableLocales;
    private final String dataRoamingEnabled;
    private final String dateFormat;
    private final String defaultInputMethod;
    private final String defaultLanguage;
    private final String developmentSettingsEnabled;
    private final String endButtonBehaviour;
    private final String fingerprintSensorStatus;
    private final String fontScale;
    private final String httpProxy;
    private final boolean isPinSecurityEnabled;
    private final String regionCountry;
    private final String ringtoneSource;
    private final String rttCallingMode;
    private final String screenOffTimeout;
    private final String textAutoPunctuate;
    private final String textAutoReplaceEnable;
    private final String time12Or24;
    private final String timezone;
    private final String touchExplorationEnabled;
    private final String transitionAnimationScale;
    private final String windowAnimationScale;
    
    public DeviceStateRawData(final String adbEnabled, final String developmentSettingsEnabled, final String httpProxy, final String transitionAnimationScale, final String windowAnimationScale, final String dataRoamingEnabled, final String accessibilityEnabled, final String defaultInputMethod, final String rttCallingMode, final String touchExplorationEnabled, final String alarmAlertPath, final String dateFormat, final String endButtonBehaviour, final String fontScale, final String screenOffTimeout, final String textAutoReplaceEnable, final String textAutoPunctuate, final String time12Or24, final boolean isPinSecurityEnabled, final String fingerprintSensorStatus, final String ringtoneSource, final List<String> availableLocales, final String regionCountry, final String defaultLanguage, final String timezone) {
        Intrinsics.checkNotNullParameter((Object)adbEnabled, "adbEnabled");
        Intrinsics.checkNotNullParameter((Object)developmentSettingsEnabled, "developmentSettingsEnabled");
        Intrinsics.checkNotNullParameter((Object)httpProxy, "httpProxy");
        Intrinsics.checkNotNullParameter((Object)transitionAnimationScale, "transitionAnimationScale");
        Intrinsics.checkNotNullParameter((Object)windowAnimationScale, "windowAnimationScale");
        Intrinsics.checkNotNullParameter((Object)dataRoamingEnabled, "dataRoamingEnabled");
        Intrinsics.checkNotNullParameter((Object)accessibilityEnabled, "accessibilityEnabled");
        Intrinsics.checkNotNullParameter((Object)defaultInputMethod, "defaultInputMethod");
        Intrinsics.checkNotNullParameter((Object)rttCallingMode, "rttCallingMode");
        Intrinsics.checkNotNullParameter((Object)touchExplorationEnabled, "touchExplorationEnabled");
        Intrinsics.checkNotNullParameter((Object)alarmAlertPath, "alarmAlertPath");
        Intrinsics.checkNotNullParameter((Object)dateFormat, "dateFormat");
        Intrinsics.checkNotNullParameter((Object)endButtonBehaviour, "endButtonBehaviour");
        Intrinsics.checkNotNullParameter((Object)fontScale, "fontScale");
        Intrinsics.checkNotNullParameter((Object)screenOffTimeout, "screenOffTimeout");
        Intrinsics.checkNotNullParameter((Object)textAutoReplaceEnable, "textAutoReplaceEnable");
        Intrinsics.checkNotNullParameter((Object)textAutoPunctuate, "textAutoPunctuate");
        Intrinsics.checkNotNullParameter((Object)time12Or24, "time12Or24");
        Intrinsics.checkNotNullParameter((Object)fingerprintSensorStatus, "fingerprintSensorStatus");
        Intrinsics.checkNotNullParameter((Object)ringtoneSource, "ringtoneSource");
        Intrinsics.checkNotNullParameter((Object)availableLocales, "availableLocales");
        Intrinsics.checkNotNullParameter((Object)regionCountry, "regionCountry");
        Intrinsics.checkNotNullParameter((Object)defaultLanguage, "defaultLanguage");
        Intrinsics.checkNotNullParameter((Object)timezone, "timezone");
        this.adbEnabled = adbEnabled;
        this.developmentSettingsEnabled = developmentSettingsEnabled;
        this.httpProxy = httpProxy;
        this.transitionAnimationScale = transitionAnimationScale;
        this.windowAnimationScale = windowAnimationScale;
        this.dataRoamingEnabled = dataRoamingEnabled;
        this.accessibilityEnabled = accessibilityEnabled;
        this.defaultInputMethod = defaultInputMethod;
        this.rttCallingMode = rttCallingMode;
        this.touchExplorationEnabled = touchExplorationEnabled;
        this.alarmAlertPath = alarmAlertPath;
        this.dateFormat = dateFormat;
        this.endButtonBehaviour = endButtonBehaviour;
        this.fontScale = fontScale;
        this.screenOffTimeout = screenOffTimeout;
        this.textAutoReplaceEnable = textAutoReplaceEnable;
        this.textAutoPunctuate = textAutoPunctuate;
        this.time12Or24 = time12Or24;
        this.isPinSecurityEnabled = isPinSecurityEnabled;
        this.fingerprintSensorStatus = fingerprintSensorStatus;
        this.ringtoneSource = ringtoneSource;
        this.availableLocales = availableLocales;
        this.regionCountry = regionCountry;
        this.defaultLanguage = defaultLanguage;
        this.timezone = timezone;
    }
    
    public final IdentificationSignal<String> accessibilityEnabled() {
        return (IdentificationSignal<String>)new DeviceStateRawData$accessibilityEnabled.DeviceStateRawData$accessibilityEnabled$1(this, StabilityLevel.OPTIMAL, this.accessibilityEnabled);
    }
    
    public final IdentificationSignal<String> adbEnabled() {
        return (IdentificationSignal<String>)new DeviceStateRawData$adbEnabled.DeviceStateRawData$adbEnabled$1(this, StabilityLevel.OPTIMAL, this.adbEnabled);
    }
    
    public final IdentificationSignal<String> alarmAlertPath() {
        return (IdentificationSignal<String>)new DeviceStateRawData$alarmAlertPath.DeviceStateRawData$alarmAlertPath$1(this, StabilityLevel.OPTIMAL, this.alarmAlertPath);
    }
    
    public final IdentificationSignal<List<String>> availableLocales() {
        return (IdentificationSignal<List<String>>)new DeviceStateRawData$availableLocales.DeviceStateRawData$availableLocales$1(this, StabilityLevel.OPTIMAL, (List)this.availableLocales);
    }
    
    public final String component1() {
        return this.adbEnabled;
    }
    
    public final String component10() {
        return this.touchExplorationEnabled;
    }
    
    public final String component11() {
        return this.alarmAlertPath;
    }
    
    public final String component12() {
        return this.dateFormat;
    }
    
    public final String component13() {
        return this.endButtonBehaviour;
    }
    
    public final String component14() {
        return this.fontScale;
    }
    
    public final String component15() {
        return this.screenOffTimeout;
    }
    
    public final String component16() {
        return this.textAutoReplaceEnable;
    }
    
    public final String component17() {
        return this.textAutoPunctuate;
    }
    
    public final String component18() {
        return this.time12Or24;
    }
    
    public final boolean component19() {
        return this.isPinSecurityEnabled;
    }
    
    public final String component2() {
        return this.developmentSettingsEnabled;
    }
    
    public final String component20() {
        return this.fingerprintSensorStatus;
    }
    
    public final String component21() {
        return this.ringtoneSource;
    }
    
    public final List<String> component22() {
        return this.availableLocales;
    }
    
    public final String component23() {
        return this.regionCountry;
    }
    
    public final String component24() {
        return this.defaultLanguage;
    }
    
    public final String component25() {
        return this.timezone;
    }
    
    public final String component3() {
        return this.httpProxy;
    }
    
    public final String component4() {
        return this.transitionAnimationScale;
    }
    
    public final String component5() {
        return this.windowAnimationScale;
    }
    
    public final String component6() {
        return this.dataRoamingEnabled;
    }
    
    public final String component7() {
        return this.accessibilityEnabled;
    }
    
    public final String component8() {
        return this.defaultInputMethod;
    }
    
    public final String component9() {
        return this.rttCallingMode;
    }
    
    public final DeviceStateRawData copy(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9, final String s10, final String s11, final String s12, final String s13, final String s14, final String s15, final String s16, final String s17, final String s18, final boolean b, final String s19, final String s20, final List<String> list, final String s21, final String s22, final String s23) {
        Intrinsics.checkNotNullParameter((Object)s, "adbEnabled");
        Intrinsics.checkNotNullParameter((Object)s2, "developmentSettingsEnabled");
        Intrinsics.checkNotNullParameter((Object)s3, "httpProxy");
        Intrinsics.checkNotNullParameter((Object)s4, "transitionAnimationScale");
        Intrinsics.checkNotNullParameter((Object)s5, "windowAnimationScale");
        Intrinsics.checkNotNullParameter((Object)s6, "dataRoamingEnabled");
        Intrinsics.checkNotNullParameter((Object)s7, "accessibilityEnabled");
        Intrinsics.checkNotNullParameter((Object)s8, "defaultInputMethod");
        Intrinsics.checkNotNullParameter((Object)s9, "rttCallingMode");
        Intrinsics.checkNotNullParameter((Object)s10, "touchExplorationEnabled");
        Intrinsics.checkNotNullParameter((Object)s11, "alarmAlertPath");
        Intrinsics.checkNotNullParameter((Object)s12, "dateFormat");
        Intrinsics.checkNotNullParameter((Object)s13, "endButtonBehaviour");
        Intrinsics.checkNotNullParameter((Object)s14, "fontScale");
        Intrinsics.checkNotNullParameter((Object)s15, "screenOffTimeout");
        Intrinsics.checkNotNullParameter((Object)s16, "textAutoReplaceEnable");
        Intrinsics.checkNotNullParameter((Object)s17, "textAutoPunctuate");
        Intrinsics.checkNotNullParameter((Object)s18, "time12Or24");
        Intrinsics.checkNotNullParameter((Object)s19, "fingerprintSensorStatus");
        Intrinsics.checkNotNullParameter((Object)s20, "ringtoneSource");
        Intrinsics.checkNotNullParameter((Object)list, "availableLocales");
        Intrinsics.checkNotNullParameter((Object)s21, "regionCountry");
        Intrinsics.checkNotNullParameter((Object)s22, "defaultLanguage");
        Intrinsics.checkNotNullParameter((Object)s23, "timezone");
        return new DeviceStateRawData(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, b, s19, s20, list, s21, s22, s23);
    }
    
    public final IdentificationSignal<String> dataRoamingEnabled() {
        return (IdentificationSignal<String>)new DeviceStateRawData$dataRoamingEnabled.DeviceStateRawData$dataRoamingEnabled$1(this, StabilityLevel.UNIQUE, this.dataRoamingEnabled);
    }
    
    public final IdentificationSignal<String> dateFormat() {
        return (IdentificationSignal<String>)new DeviceStateRawData$dateFormat.DeviceStateRawData$dateFormat$1(this, StabilityLevel.OPTIMAL, this.dateFormat);
    }
    
    public final IdentificationSignal<String> defaultInputMethod() {
        return (IdentificationSignal<String>)new DeviceStateRawData$defaultInputMethod.DeviceStateRawData$defaultInputMethod$1(this, StabilityLevel.OPTIMAL, this.defaultInputMethod);
    }
    
    public final IdentificationSignal<String> defaultLanguage() {
        return (IdentificationSignal<String>)new DeviceStateRawData$defaultLanguage.DeviceStateRawData$defaultLanguage$1(this, StabilityLevel.OPTIMAL, this.defaultLanguage);
    }
    
    public final IdentificationSignal<String> developmentSettingsEnabled() {
        return (IdentificationSignal<String>)new DeviceStateRawData$developmentSettingsEnabled.DeviceStateRawData$developmentSettingsEnabled$1(this, StabilityLevel.OPTIMAL, this.developmentSettingsEnabled);
    }
    
    public final IdentificationSignal<String> endButtonBehaviour() {
        return (IdentificationSignal<String>)new DeviceStateRawData$endButtonBehaviour.DeviceStateRawData$endButtonBehaviour$1(this, StabilityLevel.OPTIMAL, this.endButtonBehaviour);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceStateRawData)) {
            return false;
        }
        final DeviceStateRawData deviceStateRawData = (DeviceStateRawData)o;
        return Intrinsics.areEqual((Object)this.adbEnabled, (Object)deviceStateRawData.adbEnabled) && Intrinsics.areEqual((Object)this.developmentSettingsEnabled, (Object)deviceStateRawData.developmentSettingsEnabled) && Intrinsics.areEqual((Object)this.httpProxy, (Object)deviceStateRawData.httpProxy) && Intrinsics.areEqual((Object)this.transitionAnimationScale, (Object)deviceStateRawData.transitionAnimationScale) && Intrinsics.areEqual((Object)this.windowAnimationScale, (Object)deviceStateRawData.windowAnimationScale) && Intrinsics.areEqual((Object)this.dataRoamingEnabled, (Object)deviceStateRawData.dataRoamingEnabled) && Intrinsics.areEqual((Object)this.accessibilityEnabled, (Object)deviceStateRawData.accessibilityEnabled) && Intrinsics.areEqual((Object)this.defaultInputMethod, (Object)deviceStateRawData.defaultInputMethod) && Intrinsics.areEqual((Object)this.rttCallingMode, (Object)deviceStateRawData.rttCallingMode) && Intrinsics.areEqual((Object)this.touchExplorationEnabled, (Object)deviceStateRawData.touchExplorationEnabled) && Intrinsics.areEqual((Object)this.alarmAlertPath, (Object)deviceStateRawData.alarmAlertPath) && Intrinsics.areEqual((Object)this.dateFormat, (Object)deviceStateRawData.dateFormat) && Intrinsics.areEqual((Object)this.endButtonBehaviour, (Object)deviceStateRawData.endButtonBehaviour) && Intrinsics.areEqual((Object)this.fontScale, (Object)deviceStateRawData.fontScale) && Intrinsics.areEqual((Object)this.screenOffTimeout, (Object)deviceStateRawData.screenOffTimeout) && Intrinsics.areEqual((Object)this.textAutoReplaceEnable, (Object)deviceStateRawData.textAutoReplaceEnable) && Intrinsics.areEqual((Object)this.textAutoPunctuate, (Object)deviceStateRawData.textAutoPunctuate) && Intrinsics.areEqual((Object)this.time12Or24, (Object)deviceStateRawData.time12Or24) && this.isPinSecurityEnabled == deviceStateRawData.isPinSecurityEnabled && Intrinsics.areEqual((Object)this.fingerprintSensorStatus, (Object)deviceStateRawData.fingerprintSensorStatus) && Intrinsics.areEqual((Object)this.ringtoneSource, (Object)deviceStateRawData.ringtoneSource) && Intrinsics.areEqual((Object)this.availableLocales, (Object)deviceStateRawData.availableLocales) && Intrinsics.areEqual((Object)this.regionCountry, (Object)deviceStateRawData.regionCountry) && Intrinsics.areEqual((Object)this.defaultLanguage, (Object)deviceStateRawData.defaultLanguage) && Intrinsics.areEqual((Object)this.timezone, (Object)deviceStateRawData.timezone);
    }
    
    public final IdentificationSignal<String> fingerprintSensorStatus() {
        return (IdentificationSignal<String>)new DeviceStateRawData$fingerprintSensorStatus.DeviceStateRawData$fingerprintSensorStatus$1(this, StabilityLevel.OPTIMAL, this.fingerprintSensorStatus);
    }
    
    public final IdentificationSignal<String> fontScale() {
        return (IdentificationSignal<String>)new DeviceStateRawData$fontScale.DeviceStateRawData$fontScale$1(this, StabilityLevel.OPTIMAL, this.fontScale);
    }
    
    public final String getAccessibilityEnabled() {
        return this.accessibilityEnabled;
    }
    
    public final String getAdbEnabled() {
        return this.adbEnabled;
    }
    
    public final String getAlarmAlertPath() {
        return this.alarmAlertPath;
    }
    
    public final List<String> getAvailableLocales() {
        return this.availableLocales;
    }
    
    public final String getDataRoamingEnabled() {
        return this.dataRoamingEnabled;
    }
    
    public final String getDateFormat() {
        return this.dateFormat;
    }
    
    public final String getDefaultInputMethod() {
        return this.defaultInputMethod;
    }
    
    public final String getDefaultLanguage() {
        return this.defaultLanguage;
    }
    
    public final String getDevelopmentSettingsEnabled() {
        return this.developmentSettingsEnabled;
    }
    
    public final String getEndButtonBehaviour() {
        return this.endButtonBehaviour;
    }
    
    public final String getFingerprintSensorStatus() {
        return this.fingerprintSensorStatus;
    }
    
    public final String getFontScale() {
        return this.fontScale;
    }
    
    public final String getHttpProxy() {
        return this.httpProxy;
    }
    
    public final String getRegionCountry() {
        return this.regionCountry;
    }
    
    public final String getRingtoneSource() {
        return this.ringtoneSource;
    }
    
    public final String getRttCallingMode() {
        return this.rttCallingMode;
    }
    
    public final String getScreenOffTimeout() {
        return this.screenOffTimeout;
    }
    
    public final String getTextAutoPunctuate() {
        return this.textAutoPunctuate;
    }
    
    public final String getTextAutoReplaceEnable() {
        return this.textAutoReplaceEnable;
    }
    
    public final String getTime12Or24() {
        return this.time12Or24;
    }
    
    public final String getTimezone() {
        return this.timezone;
    }
    
    public final String getTouchExplorationEnabled() {
        return this.touchExplorationEnabled;
    }
    
    public final String getTransitionAnimationScale() {
        return this.transitionAnimationScale;
    }
    
    public final String getWindowAnimationScale() {
        return this.windowAnimationScale;
    }
    
    @Override
    public int hashCode() {
        return (((((((((((((((((((((((this.adbEnabled.hashCode() * 31 + this.developmentSettingsEnabled.hashCode()) * 31 + this.httpProxy.hashCode()) * 31 + this.transitionAnimationScale.hashCode()) * 31 + this.windowAnimationScale.hashCode()) * 31 + this.dataRoamingEnabled.hashCode()) * 31 + this.accessibilityEnabled.hashCode()) * 31 + this.defaultInputMethod.hashCode()) * 31 + this.rttCallingMode.hashCode()) * 31 + this.touchExplorationEnabled.hashCode()) * 31 + this.alarmAlertPath.hashCode()) * 31 + this.dateFormat.hashCode()) * 31 + this.endButtonBehaviour.hashCode()) * 31 + this.fontScale.hashCode()) * 31 + this.screenOffTimeout.hashCode()) * 31 + this.textAutoReplaceEnable.hashCode()) * 31 + this.textAutoPunctuate.hashCode()) * 31 + this.time12Or24.hashCode()) * 31 + Boolean.hashCode(this.isPinSecurityEnabled)) * 31 + this.fingerprintSensorStatus.hashCode()) * 31 + this.ringtoneSource.hashCode()) * 31 + this.availableLocales.hashCode()) * 31 + this.regionCountry.hashCode()) * 31 + this.defaultLanguage.hashCode()) * 31 + this.timezone.hashCode();
    }
    
    public final IdentificationSignal<String> httpProxy() {
        return (IdentificationSignal<String>)new DeviceStateRawData$httpProxy.DeviceStateRawData$httpProxy$1(this, StabilityLevel.UNIQUE, this.httpProxy);
    }
    
    public final IdentificationSignal<Boolean> isPinSecurityEnabled() {
        return (IdentificationSignal<Boolean>)new DeviceStateRawData$isPinSecurityEnabled.DeviceStateRawData$isPinSecurityEnabled$1(this, StabilityLevel.OPTIMAL, this.isPinSecurityEnabled);
    }
    
    public final boolean isPinSecurityEnabled() {
        return this.isPinSecurityEnabled;
    }
    
    public final IdentificationSignal<String> regionCountry() {
        return (IdentificationSignal<String>)new DeviceStateRawData$regionCountry.DeviceStateRawData$regionCountry$1(this, StabilityLevel.OPTIMAL, this.regionCountry);
    }
    
    public final IdentificationSignal<String> ringtoneSource() {
        return (IdentificationSignal<String>)new DeviceStateRawData$ringtoneSource.DeviceStateRawData$ringtoneSource$1(this, StabilityLevel.OPTIMAL, this.ringtoneSource);
    }
    
    public final IdentificationSignal<String> rttCallingMode() {
        return (IdentificationSignal<String>)new DeviceStateRawData$rttCallingMode.DeviceStateRawData$rttCallingMode$1(this, StabilityLevel.OPTIMAL, this.rttCallingMode);
    }
    
    public final IdentificationSignal<String> screenOffTimeout() {
        return (IdentificationSignal<String>)new DeviceStateRawData$screenOffTimeout.DeviceStateRawData$screenOffTimeout$1(this, StabilityLevel.OPTIMAL, this.screenOffTimeout);
    }
    
    @Override
    public List<IdentificationSignal<?>> signals() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.adbEnabled(), this.developmentSettingsEnabled(), this.httpProxy(), this.transitionAnimationScale(), this.windowAnimationScale(), this.dataRoamingEnabled(), this.accessibilityEnabled(), this.defaultInputMethod(), this.rttCallingMode(), this.touchExplorationEnabled(), this.alarmAlertPath(), this.dateFormat(), this.endButtonBehaviour(), this.fontScale(), this.screenOffTimeout(), this.textAutoReplaceEnable(), this.textAutoPunctuate(), this.time12Or24(), this.isPinSecurityEnabled(), this.fingerprintSensorStatus(), this.ringtoneSource(), this.availableLocales(), this.regionCountry(), this.defaultLanguage(), this.timezone() });
    }
    
    public final IdentificationSignal<String> textAutoPunctuate() {
        return (IdentificationSignal<String>)new DeviceStateRawData$textAutoPunctuate.DeviceStateRawData$textAutoPunctuate$1(this, StabilityLevel.OPTIMAL, this.textAutoPunctuate);
    }
    
    public final IdentificationSignal<String> textAutoReplaceEnable() {
        return (IdentificationSignal<String>)new DeviceStateRawData$textAutoReplaceEnable.DeviceStateRawData$textAutoReplaceEnable$1(this, StabilityLevel.OPTIMAL, this.textAutoReplaceEnable);
    }
    
    public final IdentificationSignal<String> time12Or24() {
        return (IdentificationSignal<String>)new DeviceStateRawData$time12Or24.DeviceStateRawData$time12Or24$1(this, StabilityLevel.OPTIMAL, this.time12Or24);
    }
    
    public final IdentificationSignal<String> timezone() {
        return (IdentificationSignal<String>)new DeviceStateRawData$timezone.DeviceStateRawData$timezone$1(this, StabilityLevel.OPTIMAL, this.timezone);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeviceStateRawData(adbEnabled=");
        sb.append(this.adbEnabled).append(", developmentSettingsEnabled=").append(this.developmentSettingsEnabled).append(", httpProxy=").append(this.httpProxy).append(", transitionAnimationScale=").append(this.transitionAnimationScale).append(", windowAnimationScale=").append(this.windowAnimationScale).append(", dataRoamingEnabled=").append(this.dataRoamingEnabled).append(", accessibilityEnabled=").append(this.accessibilityEnabled).append(", defaultInputMethod=").append(this.defaultInputMethod).append(", rttCallingMode=").append(this.rttCallingMode).append(", touchExplorationEnabled=").append(this.touchExplorationEnabled).append(", alarmAlertPath=").append(this.alarmAlertPath).append(", dateFormat=");
        sb.append(this.dateFormat).append(", endButtonBehaviour=").append(this.endButtonBehaviour).append(", fontScale=").append(this.fontScale).append(", screenOffTimeout=").append(this.screenOffTimeout).append(", textAutoReplaceEnable=").append(this.textAutoReplaceEnable).append(", textAutoPunctuate=").append(this.textAutoPunctuate).append(", time12Or24=").append(this.time12Or24).append(", isPinSecurityEnabled=").append(this.isPinSecurityEnabled).append(", fingerprintSensorStatus=").append(this.fingerprintSensorStatus).append(", ringtoneSource=").append(this.ringtoneSource).append(", availableLocales=").append((Object)this.availableLocales).append(", regionCountry=").append(this.regionCountry);
        sb.append(", defaultLanguage=").append(this.defaultLanguage).append(", timezone=").append(this.timezone).append(')');
        return sb.toString();
    }
    
    public final IdentificationSignal<String> touchExplorationEnabled() {
        return (IdentificationSignal<String>)new DeviceStateRawData$touchExplorationEnabled.DeviceStateRawData$touchExplorationEnabled$1(this, StabilityLevel.OPTIMAL, this.touchExplorationEnabled);
    }
    
    public final IdentificationSignal<String> transitionAnimationScale() {
        return (IdentificationSignal<String>)new DeviceStateRawData$transitionAnimationScale.DeviceStateRawData$transitionAnimationScale$1(this, StabilityLevel.OPTIMAL, this.transitionAnimationScale);
    }
    
    public final IdentificationSignal<String> windowAnimationScale() {
        return (IdentificationSignal<String>)new DeviceStateRawData$windowAnimationScale.DeviceStateRawData$windowAnimationScale$1(this, StabilityLevel.OPTIMAL, this.windowAnimationScale);
    }
}
