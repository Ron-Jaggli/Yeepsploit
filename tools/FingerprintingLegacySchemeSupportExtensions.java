package com.fingerprintjs.android.fingerprint.tools;

import com.fingerprintjs.android.fingerprint.fingerprinting_signals.CodecListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SecurityProvidersSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.EncryptionStatusSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.KernelVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SdkVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AndroidVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SystemApplicationsListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ApplicationsListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.InputDevicesV2Signal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ProcCpuInfoV2Signal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.CameraListSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.CoresCountSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AbiTypeSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.GlesVersionSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.BatteryHealthSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.BatteryFullCapacitySignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.InputDevicesSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.SensorsSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ProcCpuInfoSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TotalInternalStorageSpaceSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TotalRamSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ModelNameSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ManufacturerNameSignal;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal$Info;
import java.util.ArrayList;
import java.util.Collection;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DefaultLanguageSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TimezoneSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.RegionCountrySignal;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AvailableLocalesSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.RingtoneSourceSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintSensorStatusSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.IsPinSecurityEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.Time12Or24Signal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TextAutoPunctuateSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TextAutoReplaceEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.ScreenOffTimeoutSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FontScaleSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.EndButtonBehaviourSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DateFormatSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AlarmAlertPathSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TouchExplorationEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.RttCallingModeSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DefaultInputMethodSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AccessibilityEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DataRoamingEnabledSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.WindowAnimationScaleSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.TransitionAnimationScaleSignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.HttpProxySignal;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.DevelopmentSettingsEnabledSignal;
import kotlin.TuplesKt;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.AdbEnabledSignal;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import java.util.List;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/tools/FingerprintingLegacySchemeSupportExtensions;", "", "()V", "getDeviceStateSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "getHardwareSignals", "getInstalledAppsSignals", "getOsBuildSignals", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class FingerprintingLegacySchemeSupportExtensions
{
    public static final FingerprintingLegacySchemeSupportExtensions INSTANCE;
    
    static {
        INSTANCE = new FingerprintingLegacySchemeSupportExtensions();
    }
    
    private FingerprintingLegacySchemeSupportExtensions() {
    }
    
    public final List<FingerprintingSignal<?>> getDeviceStateSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, final Fingerprinter$Version fingerprinter$Version, StabilityLevel unique) {
        Intrinsics.checkNotNullParameter((Object)fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Intrinsics.checkNotNullParameter((Object)unique, "stabilityLevel");
        if (fingerprinter$Version.compareTo((Enum)Fingerprinter$Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) < 0) {
            if (WhenMappings.$EnumSwitchMapping$0[fingerprinter$Version.ordinal()] == 1) {
                unique = StabilityLevel.UNIQUE;
            }
            List list;
            if (WhenMappings.$EnumSwitchMapping$0[fingerprinter$Version.ordinal()] == 1) {
                list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)AdbEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$1(fingerprintingSignalsProvider)), TuplesKt.to((Object)DevelopmentSettingsEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$2(fingerprintingSignalsProvider)), TuplesKt.to((Object)HttpProxySignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$3(fingerprintingSignalsProvider)), TuplesKt.to((Object)TransitionAnimationScaleSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$4(fingerprintingSignalsProvider)), TuplesKt.to((Object)WindowAnimationScaleSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$5(fingerprintingSignalsProvider)), TuplesKt.to((Object)DataRoamingEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$6(fingerprintingSignalsProvider)), TuplesKt.to((Object)AccessibilityEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$7(fingerprintingSignalsProvider)), TuplesKt.to((Object)DefaultInputMethodSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$8(fingerprintingSignalsProvider)), TuplesKt.to((Object)RttCallingModeSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$9(fingerprintingSignalsProvider)), TuplesKt.to((Object)TouchExplorationEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$10(fingerprintingSignalsProvider)), TuplesKt.to((Object)AlarmAlertPathSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$11(fingerprintingSignalsProvider)), TuplesKt.to((Object)DateFormatSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$12(fingerprintingSignalsProvider)), TuplesKt.to((Object)EndButtonBehaviourSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$13(fingerprintingSignalsProvider)), TuplesKt.to((Object)FontScaleSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$14(fingerprintingSignalsProvider)), TuplesKt.to((Object)ScreenOffTimeoutSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$15(fingerprintingSignalsProvider)), TuplesKt.to((Object)TextAutoReplaceEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$16(fingerprintingSignalsProvider)), TuplesKt.to((Object)TextAutoPunctuateSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$17(fingerprintingSignalsProvider)), TuplesKt.to((Object)Time12Or24Signal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$18(fingerprintingSignalsProvider)), TuplesKt.to((Object)IsPinSecurityEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$19(fingerprintingSignalsProvider)), TuplesKt.to((Object)FingerprintSensorStatusSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$20(fingerprintingSignalsProvider)), TuplesKt.to((Object)RingtoneSourceSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$21(fingerprintingSignalsProvider)), TuplesKt.to((Object)AvailableLocalesSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$22(fingerprintingSignalsProvider)) });
            }
            else {
                list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)AdbEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$23(fingerprintingSignalsProvider)), TuplesKt.to((Object)DevelopmentSettingsEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$24(fingerprintingSignalsProvider)), TuplesKt.to((Object)HttpProxySignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$25(fingerprintingSignalsProvider)), TuplesKt.to((Object)TransitionAnimationScaleSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$26(fingerprintingSignalsProvider)), TuplesKt.to((Object)WindowAnimationScaleSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$27(fingerprintingSignalsProvider)), TuplesKt.to((Object)DataRoamingEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$28(fingerprintingSignalsProvider)), TuplesKt.to((Object)AccessibilityEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$29(fingerprintingSignalsProvider)), TuplesKt.to((Object)DefaultInputMethodSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$30(fingerprintingSignalsProvider)), TuplesKt.to((Object)TouchExplorationEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$31(fingerprintingSignalsProvider)), TuplesKt.to((Object)AlarmAlertPathSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$32(fingerprintingSignalsProvider)), TuplesKt.to((Object)DateFormatSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$33(fingerprintingSignalsProvider)), TuplesKt.to((Object)EndButtonBehaviourSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$34(fingerprintingSignalsProvider)), TuplesKt.to((Object)FontScaleSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$35(fingerprintingSignalsProvider)), TuplesKt.to((Object)ScreenOffTimeoutSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$36(fingerprintingSignalsProvider)), TuplesKt.to((Object)Time12Or24Signal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$37(fingerprintingSignalsProvider)), TuplesKt.to((Object)IsPinSecurityEnabledSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$38(fingerprintingSignalsProvider)), TuplesKt.to((Object)FingerprintSensorStatusSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$39(fingerprintingSignalsProvider)), TuplesKt.to((Object)RingtoneSourceSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$40(fingerprintingSignalsProvider)), TuplesKt.to((Object)AvailableLocalesSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$41(fingerprintingSignalsProvider)), TuplesKt.to((Object)RegionCountrySignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$42(fingerprintingSignalsProvider)), TuplesKt.to((Object)TimezoneSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$43(fingerprintingSignalsProvider)), TuplesKt.to((Object)DefaultLanguageSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals.FingerprintingLegacySchemeSupportExtensions$getDeviceStateSignals$44(fingerprintingSignalsProvider)) });
            }
            final Iterable iterable = (Iterable)list;
            final Collection collection = (Collection)new ArrayList();
            for (final Pair pair : iterable) {
                final FingerprintingSignal signalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(fingerprinter$Version, unique, (FingerprintingSignal$Info)pair.getFirst(), (kotlin.jvm.functions.Function0<? extends FingerprintingSignal>)pair.getSecond());
                if (signalIfNeeded != null) {
                    collection.add((Object)signalIfNeeded);
                }
            }
            return (List<FingerprintingSignal<?>>)collection;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final List<FingerprintingSignal<?>> getHardwareSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, final Fingerprinter$Version fingerprinter$Version, final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        if (fingerprinter$Version.compareTo((Enum)Fingerprinter$Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) < 0) {
            List list;
            if (WhenMappings.$EnumSwitchMapping$0[fingerprinter$Version.ordinal()] == 1) {
                list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)ManufacturerNameSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$1(fingerprintingSignalsProvider)), TuplesKt.to((Object)ModelNameSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$2(fingerprintingSignalsProvider)), TuplesKt.to((Object)TotalRamSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$3(fingerprintingSignalsProvider)), TuplesKt.to((Object)TotalInternalStorageSpaceSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$4(fingerprintingSignalsProvider)), TuplesKt.to((Object)ProcCpuInfoSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$5(fingerprintingSignalsProvider)), TuplesKt.to((Object)SensorsSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$6(fingerprintingSignalsProvider)), TuplesKt.to((Object)InputDevicesSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$7(fingerprintingSignalsProvider)) });
            }
            else {
                final Fingerprinter$Version v_2 = Fingerprinter$Version.V_2;
                if (fingerprinter$Version.compareTo((Object)Fingerprinter$Version.V_3) <= 0 && fingerprinter$Version.compareTo((Object)v_2) >= 0) {
                    list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)ManufacturerNameSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$8(fingerprintingSignalsProvider)), TuplesKt.to((Object)ModelNameSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$9(fingerprintingSignalsProvider)), TuplesKt.to((Object)TotalRamSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$10(fingerprintingSignalsProvider)), TuplesKt.to((Object)TotalInternalStorageSpaceSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$11(fingerprintingSignalsProvider)), TuplesKt.to((Object)ProcCpuInfoSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$12(fingerprintingSignalsProvider)), TuplesKt.to((Object)SensorsSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$13(fingerprintingSignalsProvider)), TuplesKt.to((Object)InputDevicesSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$14(fingerprintingSignalsProvider)), TuplesKt.to((Object)BatteryFullCapacitySignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$15(fingerprintingSignalsProvider)), TuplesKt.to((Object)BatteryHealthSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$16(fingerprintingSignalsProvider)), TuplesKt.to((Object)GlesVersionSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$17(fingerprintingSignalsProvider)), TuplesKt.to((Object)AbiTypeSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$18(fingerprintingSignalsProvider)), TuplesKt.to((Object)CoresCountSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$19(fingerprintingSignalsProvider)), TuplesKt.to((Object)CameraListSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$20(fingerprintingSignalsProvider)) });
                }
                else {
                    list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)ManufacturerNameSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$21(fingerprintingSignalsProvider)), TuplesKt.to((Object)ModelNameSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$22(fingerprintingSignalsProvider)), TuplesKt.to((Object)TotalRamSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$23(fingerprintingSignalsProvider)), TuplesKt.to((Object)TotalInternalStorageSpaceSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$24(fingerprintingSignalsProvider)), TuplesKt.to((Object)ProcCpuInfoSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$25(fingerprintingSignalsProvider)), TuplesKt.to((Object)ProcCpuInfoV2Signal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$26(fingerprintingSignalsProvider)), TuplesKt.to((Object)SensorsSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$27(fingerprintingSignalsProvider)), TuplesKt.to((Object)InputDevicesSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$28(fingerprintingSignalsProvider)), TuplesKt.to((Object)InputDevicesV2Signal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$29(fingerprintingSignalsProvider)), TuplesKt.to((Object)BatteryHealthSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$30(fingerprintingSignalsProvider)), TuplesKt.to((Object)BatteryFullCapacitySignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$31(fingerprintingSignalsProvider)), TuplesKt.to((Object)CameraListSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$32(fingerprintingSignalsProvider)), TuplesKt.to((Object)GlesVersionSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$33(fingerprintingSignalsProvider)), TuplesKt.to((Object)AbiTypeSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$34(fingerprintingSignalsProvider)), TuplesKt.to((Object)CoresCountSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getHardwareSignals.FingerprintingLegacySchemeSupportExtensions$getHardwareSignals$35(fingerprintingSignalsProvider)) });
                }
            }
            final Iterable iterable = (Iterable)list;
            final Collection collection = (Collection)new ArrayList();
            for (final Pair pair : iterable) {
                final FingerprintingSignal signalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(fingerprinter$Version, stabilityLevel, (FingerprintingSignal$Info)pair.getFirst(), (kotlin.jvm.functions.Function0<? extends FingerprintingSignal>)pair.getSecond());
                if (signalIfNeeded != null) {
                    collection.add((Object)signalIfNeeded);
                }
            }
            return (List<FingerprintingSignal<?>>)collection;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final List<FingerprintingSignal<?>> getInstalledAppsSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, final Fingerprinter$Version fingerprinter$Version, StabilityLevel unique) {
        Intrinsics.checkNotNullParameter((Object)fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Intrinsics.checkNotNullParameter((Object)unique, "stabilityLevel");
        if (fingerprinter$Version.compareTo((Enum)Fingerprinter$Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) < 0) {
            if (WhenMappings.$EnumSwitchMapping$0[fingerprinter$Version.ordinal()] == 1) {
                unique = StabilityLevel.UNIQUE;
            }
            List list;
            if (WhenMappings.$EnumSwitchMapping$0[fingerprinter$Version.ordinal()] == 1) {
                list = CollectionsKt.listOf((Object)TuplesKt.to((Object)ApplicationsListSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getInstalledAppsSignals.FingerprintingLegacySchemeSupportExtensions$getInstalledAppsSignals$1(fingerprintingSignalsProvider)));
            }
            else {
                list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)ApplicationsListSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getInstalledAppsSignals.FingerprintingLegacySchemeSupportExtensions$getInstalledAppsSignals$2(fingerprintingSignalsProvider)), TuplesKt.to((Object)SystemApplicationsListSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getInstalledAppsSignals.FingerprintingLegacySchemeSupportExtensions$getInstalledAppsSignals$3(fingerprintingSignalsProvider)) });
            }
            final Iterable iterable = (Iterable)list;
            final Collection collection = (Collection)new ArrayList();
            for (final Pair pair : iterable) {
                final FingerprintingSignal signalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(fingerprinter$Version, unique, (FingerprintingSignal$Info)pair.getFirst(), (kotlin.jvm.functions.Function0<? extends FingerprintingSignal>)pair.getSecond());
                if (signalIfNeeded != null) {
                    collection.add((Object)signalIfNeeded);
                }
            }
            return (List<FingerprintingSignal<?>>)collection;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final List<FingerprintingSignal<?>> getOsBuildSignals(final FingerprintingSignalsProvider fingerprintingSignalsProvider, final Fingerprinter$Version fingerprinter$Version, final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)fingerprintingSignalsProvider, "<this>");
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        if (fingerprinter$Version.compareTo((Enum)Fingerprinter$Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) < 0) {
            List list;
            if (WhenMappings.$EnumSwitchMapping$0[fingerprinter$Version.ordinal()] == 1) {
                list = CollectionsKt.listOf((Object)TuplesKt.to((Object)FingerprintSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$1(fingerprintingSignalsProvider)));
            }
            else {
                list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)AndroidVersionSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$2(fingerprintingSignalsProvider)), TuplesKt.to((Object)SdkVersionSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$3(fingerprintingSignalsProvider)), TuplesKt.to((Object)KernelVersionSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$4(fingerprintingSignalsProvider)), TuplesKt.to((Object)EncryptionStatusSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$5(fingerprintingSignalsProvider)), TuplesKt.to((Object)SecurityProvidersSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$6(fingerprintingSignalsProvider)), TuplesKt.to((Object)CodecListSignal.Companion.getInfo(), (Object)new FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals.FingerprintingLegacySchemeSupportExtensions$getOsBuildSignals$7(fingerprintingSignalsProvider)) });
            }
            final Iterable iterable = (Iterable)list;
            final Collection collection = (Collection)new ArrayList();
            for (final Pair pair : iterable) {
                final FingerprintingSignal signalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(fingerprinter$Version, stabilityLevel, (FingerprintingSignal$Info)pair.getFirst(), (kotlin.jvm.functions.Function0<? extends FingerprintingSignal>)pair.getSecond());
                if (signalIfNeeded != null) {
                    collection.add((Object)signalIfNeeded);
                }
            }
            return (List<FingerprintingSignal<?>>)collection;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
