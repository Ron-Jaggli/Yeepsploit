package com.fingerprintjs.android.fingerprint.signal_providers.hardware;

import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.SensorDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider;
import kotlin.Lazy;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0016\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020$0#0\"H\u0002J\u0016\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020$0#0\"H\u0002R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006&" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareFingerprintRawData;", "cpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;", "memInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "osBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "sensorsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;", "inputDeviceDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;", "batteryInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;", "cameraInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "gpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareFingerprintRawData;", "rawData$delegate", "Lkotlin/Lazy;", "fingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "", "v2", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class HardwareSignalGroupProvider extends SignalGroupProvider<HardwareFingerprintRawData>
{
    private final Hasher hasher;
    private final Lazy rawData$delegate;
    
    public HardwareSignalGroupProvider(final CpuInfoProvider cpuInfoProvider, final MemInfoProvider memInfoProvider, final OsBuildInfoProvider osBuildInfoProvider, final SensorDataSource sensorDataSource, final InputDeviceDataSource inputDeviceDataSource, final BatteryInfoProvider batteryInfoProvider, final CameraInfoProvider cameraInfoProvider, final GpuInfoProvider gpuInfoProvider, final Hasher hasher, final int n) {
        Intrinsics.checkNotNullParameter((Object)cpuInfoProvider, "cpuInfoProvider");
        Intrinsics.checkNotNullParameter((Object)memInfoProvider, "memInfoProvider");
        Intrinsics.checkNotNullParameter((Object)osBuildInfoProvider, "osBuildInfoProvider");
        Intrinsics.checkNotNullParameter((Object)sensorDataSource, "sensorsDataSource");
        Intrinsics.checkNotNullParameter((Object)inputDeviceDataSource, "inputDeviceDataSource");
        Intrinsics.checkNotNullParameter((Object)batteryInfoProvider, "batteryInfoProvider");
        Intrinsics.checkNotNullParameter((Object)cameraInfoProvider, "cameraInfoProvider");
        Intrinsics.checkNotNullParameter((Object)gpuInfoProvider, "gpuInfoProvider");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        super(n);
        this.hasher = hasher;
        this.rawData$delegate = LazyKt.lazy((Function0)new HardwareSignalGroupProvider$rawData.HardwareSignalGroupProvider$rawData$2(osBuildInfoProvider, memInfoProvider, cpuInfoProvider, sensorDataSource, inputDeviceDataSource, batteryInfoProvider, cameraInfoProvider, gpuInfoProvider));
    }
    
    private final HardwareFingerprintRawData getRawData() {
        return (HardwareFingerprintRawData)this.rawData$delegate.getValue();
    }
    
    private final List<IdentificationSignal<?>> v1() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.getRawData().manufacturerName(), this.getRawData().modelName(), this.getRawData().totalRAM(), this.getRawData().totalInternalStorageSpace(), this.getRawData().procCpuInfo(), this.getRawData().sensors(), this.getRawData().inputDevices() });
    }
    
    private final List<IdentificationSignal<?>> v2() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.getRawData().manufacturerName(), this.getRawData().modelName(), this.getRawData().totalRAM(), this.getRawData().totalInternalStorageSpace(), this.getRawData().procCpuInfo(), this.getRawData().sensors(), this.getRawData().inputDevices(), this.getRawData().batteryFullCapacity(), this.getRawData().batteryHealth(), this.getRawData().glesVersion(), this.getRawData().abiType(), this.getRawData().coresCount(), this.getRawData().cameraList() });
    }
    
    @Override
    public String fingerprint(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final Hasher hasher = this.hasher;
        final int version = this.getVersion();
        List<IdentificationSignal<?>> list;
        if (version != 1) {
            if (version != 2 && version != 3) {
                list = this.getRawData().signals(this.getVersion(), stabilityLevel);
            }
            else {
                list = this.v2();
            }
        }
        else {
            list = this.v1();
        }
        return hasher.hash(this.combineSignals(list, stabilityLevel));
    }
    
    @Override
    public HardwareFingerprintRawData rawData() {
        return this.getRawData();
    }
}
