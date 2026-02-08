package com.fingerprintjs.android.fingerprint;

import kotlin.Deprecated;
import kotlin.Unit;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSourceImpl;
import android.hardware.SensorManager;
import com.fingerprintjs.android.fingerprint.info_providers.SensorDataSourceImpl;
import android.content.pm.PackageManager;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSourceImpl;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProviderImpl;
import android.os.StatFs;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider;
import android.hardware.input.InputManager;
import com.fingerprintjs.android.fingerprint.info_providers.InputDevicesDataSourceImpl;
import com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider;
import android.app.ActivityManager;
import com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.SensorDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProviderImpl;
import android.content.res.AssetManager;
import android.media.RingtoneManager;
import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProviderImpl;
import android.media.MediaCodecList;
import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProviderImpl;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProviderImpl;
import android.content.ContentResolver;
import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider;
import android.content.Context;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010/\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u0002072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010>\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/FingerprinterFactory;", "", "()V", "configuration", "Lcom/fingerprintjs/android/fingerprint/Configuration;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "instance", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter;", "create", "context", "Landroid/content/Context;", "createAndroidIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "createBatteryInfoDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProviderImpl;", "createCameraInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "createCodecInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProviderImpl;", "createCpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProviderImpl;", "createDeviceIdProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "createDeviceIdSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;", "createDevicePersonalizationDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProviderImpl;", "createDeviceSecurityProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProviderImpl;", "createDeviceStateSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "createFingerprintSensorStatusProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProviderImpl;", "createFingerprinter", "createFingerprintingSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "createGpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProviderImpl;", "createGsfIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "createHardwareSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "createInputDevicesDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDevicesDataSourceImpl;", "createInstalledApplicationsSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "createLegacyFingerprinter", "createMediaDrmProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "createMemoryInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "createOsBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProviderImpl;", "createOsBuildInfoSignalGroupProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "createPackageManagerDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSourceImpl;", "createSensorDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSourceImpl;", "createSettingsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSourceImpl;", "getInstance", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class FingerprinterFactory
{
    public static final FingerprinterFactory INSTANCE;
    private static Configuration configuration;
    private static Hasher hasher;
    private static Fingerprinter instance;
    
    static {
        INSTANCE = new FingerprinterFactory();
        FingerprinterFactory.configuration = new Configuration(Fingerprinter$Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release().getIntValue$fingerprint_release(), (Hasher)null, 2, (DefaultConstructorMarker)null);
        FingerprinterFactory.hasher = (Hasher)new MurMur3x64x128Hasher();
    }
    
    private FingerprinterFactory() {
    }
    
    @JvmStatic
    public static final Fingerprinter create(final Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return FingerprinterFactory.INSTANCE.createFingerprinter(context);
    }
    
    private final AndroidIdProvider createAndroidIdProvider(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createAndroidIdProvider$1(context);
        ContentResolver contentResolver = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            contentResolver = (ContentResolver)safeWithTimeout$default;
        }
        return new AndroidIdProvider(contentResolver);
    }
    
    private final BatteryInfoProviderImpl createBatteryInfoDataSource(final Context context) {
        return new BatteryInfoProviderImpl(context);
    }
    
    private final CameraInfoProvider createCameraInfoProvider() {
        return (CameraInfoProvider)new CameraInfoProviderImpl();
    }
    
    private final CodecInfoProviderImpl createCodecInfoProvider() {
        final Function0 function0 = (Function0)FingerprinterFactory$createCodecInfoProvider$1.INSTANCE;
        MediaCodecList list = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            list = (MediaCodecList)safeWithTimeout$default;
        }
        return new CodecInfoProviderImpl((MediaCodecList)list);
    }
    
    private final CpuInfoProviderImpl createCpuInfoProvider() {
        return new CpuInfoProviderImpl();
    }
    
    private final DeviceIdProvider createDeviceIdProvider(final Context context) {
        return new DeviceIdProvider(this.createGsfIdProvider(context), this.createAndroidIdProvider(context), this.createMediaDrmProvider(), FingerprinterFactory.configuration.getVersion());
    }
    
    private final DeviceIdSignalsProvider createDeviceIdSignalsProvider(final Context context) {
        return new DeviceIdSignalsProvider(this.createGsfIdProvider(context), this.createAndroidIdProvider(context), this.createMediaDrmProvider());
    }
    
    private final DevicePersonalizationInfoProviderImpl createDevicePersonalizationDataSource(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createDevicePersonalizationDataSource$1(context);
        final android.content.res.Configuration configuration = null;
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null))) {
            safeWithTimeout$default = null;
        }
        final RingtoneManager ringtoneManager = (RingtoneManager)safeWithTimeout$default;
        Object safeWithTimeout$default2;
        if (Result.isFailure-impl(safeWithTimeout$default2 = SafeKt.safeWithTimeout$default(0L, (Function0)new FingerprinterFactory$createDevicePersonalizationDataSource$2(context), 1, (Object)null))) {
            safeWithTimeout$default2 = null;
        }
        final AssetManager assetManager = (AssetManager)safeWithTimeout$default2;
        Object safeWithTimeout$default3 = SafeKt.safeWithTimeout$default(0L, (Function0)new FingerprinterFactory$createDevicePersonalizationDataSource$3(context), 1, (Object)null);
        if (Result.isFailure-impl(safeWithTimeout$default3)) {
            safeWithTimeout$default3 = configuration;
        }
        return new DevicePersonalizationInfoProviderImpl(ringtoneManager, assetManager, (android.content.res.Configuration)safeWithTimeout$default3);
    }
    
    private final DeviceSecurityInfoProviderImpl createDeviceSecurityProvider(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createDeviceSecurityProvider$1(context);
        final KeyguardManager keyguardManager = null;
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null))) {
            safeWithTimeout$default = null;
        }
        final DevicePolicyManager devicePolicyManager = (DevicePolicyManager)safeWithTimeout$default;
        Object safeWithTimeout$default2 = SafeKt.safeWithTimeout$default(0L, (Function0)new FingerprinterFactory$createDeviceSecurityProvider$2(context), 1, (Object)null);
        if (Result.isFailure-impl(safeWithTimeout$default2)) {
            safeWithTimeout$default2 = keyguardManager;
        }
        return new DeviceSecurityInfoProviderImpl(devicePolicyManager, (KeyguardManager)safeWithTimeout$default2);
    }
    
    private final DeviceStateSignalGroupProvider createDeviceStateSignalGroupProvider(final Context context) {
        return new DeviceStateSignalGroupProvider((SettingsDataSource)this.createSettingsDataSource(context), (DevicePersonalizationInfoProvider)this.createDevicePersonalizationDataSource(context), (DeviceSecurityInfoProvider)this.createDeviceSecurityProvider(context), (FingerprintSensorInfoProvider)this.createFingerprintSensorStatusProvider(context), FingerprinterFactory.hasher, FingerprinterFactory.configuration.getVersion());
    }
    
    private final FingerprintSensorInfoProviderImpl createFingerprintSensorStatusProvider(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createFingerprintSensorStatusProvider$1(context);
        FingerprintManagerCompat fingerprintManagerCompat = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            fingerprintManagerCompat = (FingerprintManagerCompat)safeWithTimeout$default;
        }
        return new FingerprintSensorInfoProviderImpl((FingerprintManagerCompat)fingerprintManagerCompat);
    }
    
    private final Fingerprinter createFingerprinter(final Context context) {
        return new Fingerprinter((Function0)new FingerprinterFactory$createFingerprinter$1(context), false);
    }
    
    private final FingerprintingSignalsProvider createFingerprintingSignalsProvider(final Context context) {
        return new FingerprintingSignalsProvider((CpuInfoProvider)this.createCpuInfoProvider(), this.createMemoryInfoProvider(context), (SensorDataSource)this.createSensorDataSource(context), (InputDeviceDataSource)this.createInputDevicesDataSource(context), (BatteryInfoProvider)this.createBatteryInfoDataSource(context), this.createCameraInfoProvider(), (GpuInfoProvider)this.createGpuInfoProvider(context), (OsBuildInfoProvider)this.createOsBuildInfoProvider(), (CodecInfoProvider)this.createCodecInfoProvider(), (DeviceSecurityInfoProvider)this.createDeviceSecurityProvider(context), (PackageManagerDataSource)this.createPackageManagerDataSource(context), (SettingsDataSource)this.createSettingsDataSource(context), (DevicePersonalizationInfoProvider)this.createDevicePersonalizationDataSource(context), (FingerprintSensorInfoProvider)this.createFingerprintSensorStatusProvider(context));
    }
    
    private final GpuInfoProviderImpl createGpuInfoProvider(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createGpuInfoProvider$1(context);
        ActivityManager activityManager = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            activityManager = (ActivityManager)safeWithTimeout$default;
        }
        return new GpuInfoProviderImpl((ActivityManager)activityManager);
    }
    
    private final GsfIdProvider createGsfIdProvider(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createGsfIdProvider.FingerprinterFactory$createGsfIdProvider$1(context);
        ContentResolver contentResolver = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            contentResolver = (ContentResolver)safeWithTimeout$default;
        }
        return new GsfIdProvider(contentResolver);
    }
    
    private final HardwareSignalGroupProvider createHardwareSignalGroupProvider(final Context context) {
        return new HardwareSignalGroupProvider((CpuInfoProvider)this.createCpuInfoProvider(), this.createMemoryInfoProvider(context), (OsBuildInfoProvider)this.createOsBuildInfoProvider(), (SensorDataSource)this.createSensorDataSource(context), (InputDeviceDataSource)this.createInputDevicesDataSource(context), (BatteryInfoProvider)this.createBatteryInfoDataSource(context), this.createCameraInfoProvider(), (GpuInfoProvider)this.createGpuInfoProvider(context), FingerprinterFactory.hasher, FingerprinterFactory.configuration.getVersion());
    }
    
    private final InputDevicesDataSourceImpl createInputDevicesDataSource(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createInputDevicesDataSource.FingerprinterFactory$createInputDevicesDataSource$1(context);
        InputManager inputManager = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            inputManager = (InputManager)safeWithTimeout$default;
        }
        return new InputDevicesDataSourceImpl((InputManager)inputManager);
    }
    
    private final InstalledAppsSignalGroupProvider createInstalledApplicationsSignalGroupProvider(final Context context) {
        return new InstalledAppsSignalGroupProvider((PackageManagerDataSource)this.createPackageManagerDataSource(context), FingerprinterFactory.hasher, FingerprinterFactory.configuration.getVersion());
    }
    
    private final Fingerprinter createLegacyFingerprinter(final Context context, final Configuration configuration) {
        FingerprinterFactory.configuration = configuration;
        FingerprinterFactory.hasher = configuration.getHasher();
        return new Fingerprinter((Function0)new FingerprinterFactory$createLegacyFingerprinter.FingerprinterFactory$createLegacyFingerprinter$1(context, configuration), true);
    }
    
    private final MediaDrmIdProvider createMediaDrmProvider() {
        return new MediaDrmIdProvider();
    }
    
    private final MemInfoProvider createMemoryInfoProvider(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createMemoryInfoProvider.FingerprinterFactory$createMemoryInfoProvider$1(context);
        final StatFs statFs = null;
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null))) {
            safeWithTimeout$default = null;
        }
        final ActivityManager activityManager = (ActivityManager)safeWithTimeout$default;
        Object safeWithTimeout$default2;
        if (Result.isFailure-impl(safeWithTimeout$default2 = SafeKt.safeWithTimeout$default(0L, (Function0)FingerprinterFactory$createMemoryInfoProvider.FingerprinterFactory$createMemoryInfoProvider$2.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default2 = null;
        }
        final StatFs statFs2 = (StatFs)safeWithTimeout$default2;
        Object safeWithTimeout$default3 = SafeKt.safeWithTimeout$default(0L, (Function0)new FingerprinterFactory$createMemoryInfoProvider.FingerprinterFactory$createMemoryInfoProvider$3(context), 1, (Object)null);
        if (Result.isFailure-impl(safeWithTimeout$default3)) {
            safeWithTimeout$default3 = statFs;
        }
        return (MemInfoProvider)new MemInfoProviderImpl(activityManager, statFs2, (StatFs)safeWithTimeout$default3);
    }
    
    private final OsBuildInfoProviderImpl createOsBuildInfoProvider() {
        return new OsBuildInfoProviderImpl();
    }
    
    private final OsBuildSignalGroupProvider createOsBuildInfoSignalGroupProvider(final Context context) {
        return new OsBuildSignalGroupProvider((OsBuildInfoProvider)this.createOsBuildInfoProvider(), (CodecInfoProvider)this.createCodecInfoProvider(), (DeviceSecurityInfoProvider)this.createDeviceSecurityProvider(context), FingerprinterFactory.hasher, FingerprinterFactory.configuration.getVersion());
    }
    
    private final PackageManagerDataSourceImpl createPackageManagerDataSource(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createPackageManagerDataSource.FingerprinterFactory$createPackageManagerDataSource$1(context);
        PackageManager packageManager = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            packageManager = (PackageManager)safeWithTimeout$default;
        }
        return new PackageManagerDataSourceImpl((PackageManager)packageManager);
    }
    
    private final SensorDataSourceImpl createSensorDataSource(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createSensorDataSource.FingerprinterFactory$createSensorDataSource$1(context);
        SensorManager sensorManager = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            sensorManager = (SensorManager)safeWithTimeout$default;
        }
        return new SensorDataSourceImpl((SensorManager)sensorManager);
    }
    
    private final SettingsDataSourceImpl createSettingsDataSource(final Context context) {
        final Function0 function0 = (Function0)new FingerprinterFactory$createSettingsDataSource.FingerprinterFactory$createSettingsDataSource$1(context);
        ContentResolver contentResolver = null;
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, function0, 1, (Object)null);
        if (!Result.isFailure-impl(safeWithTimeout$default)) {
            contentResolver = (ContentResolver)safeWithTimeout$default;
        }
        return new SettingsDataSourceImpl((ContentResolver)contentResolver);
    }
    
    @Deprecated(message = "\n        This method has been deprecated in favor of create(context) method. Check out method doc for details.\n    ")
    @JvmStatic
    public static final Fingerprinter getInstance(final Context context, final Configuration configuration) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter((Object)configuration, "configuration");
        if (configuration.getVersion() <= Fingerprinter$Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release().getIntValue$fingerprint_release()) {
            if (!Intrinsics.areEqual((Object)FingerprinterFactory.configuration, (Object)configuration)) {
                FingerprinterFactory.instance = null;
            }
            if (FingerprinterFactory.instance == null) {
                synchronized (FingerprinterFactory.class) {
                    if (FingerprinterFactory.instance == null) {
                        FingerprinterFactory.instance = FingerprinterFactory.INSTANCE.createLegacyFingerprinter(context, configuration);
                    }
                    final Unit instance = Unit.INSTANCE;
                }
            }
            final Fingerprinter instance2 = FingerprinterFactory.instance;
            Intrinsics.checkNotNull((Object)instance2);
            return instance2;
        }
        throw new IllegalArgumentException("Version must be in " + Fingerprinter$Version.V_1.getIntValue$fingerprint_release() + " .. " + Fingerprinter$Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release().getIntValue$fingerprint_release() + " range");
    }
}
