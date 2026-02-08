package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "", "accessibilityEnabled", "", "adbEnabled", "alarmAlertPath", "dataRoamingEnabled", "dateFormat", "defaultInputMethod", "developmentSettingsEnabled", "endButtonBehaviour", "fontScale", "httpProxy", "rttCallingMode", "screenOffTimeout", "textAutoPunctuate", "textAutoReplaceEnable", "time12Or24", "touchExplorationEnabled", "transitionAnimationScale", "windowAnimationScale", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public interface SettingsDataSource
{
    String accessibilityEnabled();
    
    String adbEnabled();
    
    String alarmAlertPath();
    
    String dataRoamingEnabled();
    
    String dateFormat();
    
    String defaultInputMethod();
    
    String developmentSettingsEnabled();
    
    String endButtonBehaviour();
    
    String fontScale();
    
    String httpProxy();
    
    String rttCallingMode();
    
    String screenOffTimeout();
    
    String textAutoPunctuate();
    
    String textAutoReplaceEnable();
    
    String time12Or24();
    
    String touchExplorationEnabled();
    
    String transitionAnimationScale();
    
    String windowAnimationScale();
}
