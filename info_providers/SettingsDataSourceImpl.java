package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import android.content.ContentResolver;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSourceImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "accessibilityEnabled", "", "adbEnabled", "alarmAlertPath", "dataRoamingEnabled", "dateFormat", "defaultInputMethod", "developmentSettingsEnabled", "endButtonBehaviour", "extractGlobalSettingsParam", "key", "extractSecureSettingsParam", "extractSystemSettingsParam", "fontScale", "httpProxy", "rttCallingMode", "screenOffTimeout", "textAutoPunctuate", "textAutoReplaceEnable", "time12Or24", "touchExplorationEnabled", "transitionAnimationScale", "windowAnimationScale", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class SettingsDataSourceImpl implements SettingsDataSource
{
    private final ContentResolver contentResolver;
    
    public SettingsDataSourceImpl(final ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }
    
    private final String extractGlobalSettingsParam(String safeWithTimeout$default) {
        if (Result.isFailure-impl((Object)(safeWithTimeout$default = (String)SafeKt.safeWithTimeout$default(0L, (Function0)new SettingsDataSourceImpl$extractGlobalSettingsParam.SettingsDataSourceImpl$extractGlobalSettingsParam$1(this, safeWithTimeout$default), 1, (Object)null)))) {
            safeWithTimeout$default = "";
        }
        return safeWithTimeout$default;
    }
    
    private final String extractSecureSettingsParam(String safeWithTimeout$default) {
        if (Result.isFailure-impl((Object)(safeWithTimeout$default = (String)SafeKt.safeWithTimeout$default(0L, (Function0)new SettingsDataSourceImpl$extractSecureSettingsParam.SettingsDataSourceImpl$extractSecureSettingsParam$1(this, safeWithTimeout$default), 1, (Object)null)))) {
            safeWithTimeout$default = "";
        }
        return safeWithTimeout$default;
    }
    
    private final String extractSystemSettingsParam(String safeWithTimeout$default) {
        if (Result.isFailure-impl((Object)(safeWithTimeout$default = (String)SafeKt.safeWithTimeout$default(0L, (Function0)new SettingsDataSourceImpl$extractSystemSettingsParam.SettingsDataSourceImpl$extractSystemSettingsParam$1(this, safeWithTimeout$default), 1, (Object)null)))) {
            safeWithTimeout$default = "";
        }
        return safeWithTimeout$default;
    }
    
    @Override
    public String accessibilityEnabled() {
        return this.extractSecureSettingsParam("accessibility_enabled");
    }
    
    @Override
    public String adbEnabled() {
        return this.extractGlobalSettingsParam("adb_enabled");
    }
    
    @Override
    public String alarmAlertPath() {
        return this.extractSystemSettingsParam("alarm_alert");
    }
    
    @Override
    public String dataRoamingEnabled() {
        return this.extractGlobalSettingsParam("data_roaming");
    }
    
    @Override
    public String dateFormat() {
        return this.extractSystemSettingsParam("date_format");
    }
    
    @Override
    public String defaultInputMethod() {
        return this.extractSecureSettingsParam("default_input_method");
    }
    
    @Override
    public String developmentSettingsEnabled() {
        return this.extractGlobalSettingsParam("development_settings_enabled");
    }
    
    @Override
    public String endButtonBehaviour() {
        return this.extractSystemSettingsParam("end_button_behavior");
    }
    
    @Override
    public String fontScale() {
        return this.extractSystemSettingsParam("font_scale");
    }
    
    @Override
    public String httpProxy() {
        return this.extractGlobalSettingsParam("http_proxy");
    }
    
    @Override
    public String rttCallingMode() {
        return this.extractSecureSettingsParam("rtt_calling_mode");
    }
    
    @Override
    public String screenOffTimeout() {
        return this.extractSystemSettingsParam("screen_off_timeout");
    }
    
    @Override
    public String textAutoPunctuate() {
        return this.extractSystemSettingsParam("auto_punctuate");
    }
    
    @Override
    public String textAutoReplaceEnable() {
        return this.extractSystemSettingsParam("auto_replace");
    }
    
    @Override
    public String time12Or24() {
        return this.extractSystemSettingsParam("time_12_24");
    }
    
    @Override
    public String touchExplorationEnabled() {
        return this.extractSecureSettingsParam("touch_exploration_enabled");
    }
    
    @Override
    public String transitionAnimationScale() {
        return this.extractGlobalSettingsParam("transition_animation_scale");
    }
    
    @Override
    public String windowAnimationScale() {
        return this.extractGlobalSettingsParam("window_animation_scale");
    }
}
