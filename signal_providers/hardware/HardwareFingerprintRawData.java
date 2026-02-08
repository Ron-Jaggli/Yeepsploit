package com.fingerprintjs.android.fingerprint.signal_providers.hardware;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import java.util.Locale;
import kotlin.Pair;
import java.util.ArrayList;
import java.util.Collection;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.fingerprintjs.android.fingerprint.info_providers.SensorData;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import java.util.Map;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceData;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfo;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030.J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030.J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030.J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\r0.J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\rH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0018H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J³\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u00c6\u0001J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180.J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u00d6\u0003J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030.J\t\u0010B\u001a\u00020\u0018H\u00d6\u0001J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0.J\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0.J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030.J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030.J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t0.J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0.J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0.J\u0016\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020A0.0\rH\u0016J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060.J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060.R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,¨\u0006G" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareFingerprintRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "manufacturerName", "", "modelName", "totalRAM", "", "totalInternalStorageSpace", "procCpuInfo", "", "procCpuInfoV2", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "sensors", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorData;", "inputDevices", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceData;", "batteryHealth", "batteryFullCapacity", "cameraList", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfo;", "glesVersion", "abiType", "coresCount", "", "(Ljava/lang/String;Ljava/lang/String;JJLjava/util/Map;Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "getAbiType", "()Ljava/lang/String;", "getBatteryFullCapacity", "getBatteryHealth", "getCameraList", "()Ljava/util/List;", "getCoresCount", "()I", "getGlesVersion", "getInputDevices", "getManufacturerName", "getModelName", "getProcCpuInfo", "()Ljava/util/Map;", "getProcCpuInfoV2", "()Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getSensors", "getTotalInternalStorageSpace", "()J", "getTotalRAM", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "inputDevicesV2", "signals", "toString", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class HardwareFingerprintRawData extends RawData
{
    private static final Set<String> CPUINFO_IGNORED_COMMON_PROPS;
    private static final Set<String> CPUINFO_IGNORED_PER_PROC_PROPS;
    private static final Companion Companion;
    private final String abiType;
    private final String batteryFullCapacity;
    private final String batteryHealth;
    private final List<CameraInfo> cameraList;
    private final int coresCount;
    private final String glesVersion;
    private final List<InputDeviceData> inputDevices;
    private final String manufacturerName;
    private final String modelName;
    private final Map<String, String> procCpuInfo;
    private final CpuInfo procCpuInfoV2;
    private final List<SensorData> sensors;
    private final long totalInternalStorageSpace;
    private final long totalRAM;
    
    static {
        Companion = new Companion(null);
        CPUINFO_IGNORED_COMMON_PROPS = SetsKt.setOf((Object)"processor");
        CPUINFO_IGNORED_PER_PROC_PROPS = SetsKt.setOf((Object[])new String[] { "bogomips", "cpu mhz" });
    }
    
    public HardwareFingerprintRawData(final String manufacturerName, final String modelName, final long totalRAM, final long totalInternalStorageSpace, final Map<String, String> procCpuInfo, final CpuInfo procCpuInfoV2, final List<SensorData> sensors, final List<InputDeviceData> inputDevices, final String batteryHealth, final String batteryFullCapacity, final List<CameraInfo> cameraList, final String glesVersion, final String abiType, final int coresCount) {
        Intrinsics.checkNotNullParameter((Object)manufacturerName, "manufacturerName");
        Intrinsics.checkNotNullParameter((Object)modelName, "modelName");
        Intrinsics.checkNotNullParameter((Object)procCpuInfo, "procCpuInfo");
        Intrinsics.checkNotNullParameter((Object)procCpuInfoV2, "procCpuInfoV2");
        Intrinsics.checkNotNullParameter((Object)sensors, "sensors");
        Intrinsics.checkNotNullParameter((Object)inputDevices, "inputDevices");
        Intrinsics.checkNotNullParameter((Object)batteryHealth, "batteryHealth");
        Intrinsics.checkNotNullParameter((Object)batteryFullCapacity, "batteryFullCapacity");
        Intrinsics.checkNotNullParameter((Object)cameraList, "cameraList");
        Intrinsics.checkNotNullParameter((Object)glesVersion, "glesVersion");
        Intrinsics.checkNotNullParameter((Object)abiType, "abiType");
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.totalRAM = totalRAM;
        this.totalInternalStorageSpace = totalInternalStorageSpace;
        this.procCpuInfo = procCpuInfo;
        this.procCpuInfoV2 = procCpuInfoV2;
        this.sensors = sensors;
        this.inputDevices = inputDevices;
        this.batteryHealth = batteryHealth;
        this.batteryFullCapacity = batteryFullCapacity;
        this.cameraList = cameraList;
        this.glesVersion = glesVersion;
        this.abiType = abiType;
        this.coresCount = coresCount;
    }
    
    public final IdentificationSignal<String> abiType() {
        return (IdentificationSignal<String>)new HardwareFingerprintRawData$abiType.HardwareFingerprintRawData$abiType$1(this, StabilityLevel.STABLE, this.abiType);
    }
    
    public final IdentificationSignal<String> batteryFullCapacity() {
        return (IdentificationSignal<String>)new HardwareFingerprintRawData$batteryFullCapacity.HardwareFingerprintRawData$batteryFullCapacity$1(this, StabilityLevel.STABLE, this.batteryFullCapacity);
    }
    
    public final IdentificationSignal<String> batteryHealth() {
        return (IdentificationSignal<String>)new HardwareFingerprintRawData$batteryHealth.HardwareFingerprintRawData$batteryHealth$1(this, StabilityLevel.OPTIMAL, this.batteryHealth);
    }
    
    public final IdentificationSignal<List<CameraInfo>> cameraList() {
        return (IdentificationSignal<List<CameraInfo>>)new HardwareFingerprintRawData$cameraList.HardwareFingerprintRawData$cameraList$1(this, StabilityLevel.STABLE, (List)this.cameraList);
    }
    
    public final String component1() {
        return this.manufacturerName;
    }
    
    public final String component10() {
        return this.batteryFullCapacity;
    }
    
    public final List<CameraInfo> component11() {
        return this.cameraList;
    }
    
    public final String component12() {
        return this.glesVersion;
    }
    
    public final String component13() {
        return this.abiType;
    }
    
    public final int component14() {
        return this.coresCount;
    }
    
    public final String component2() {
        return this.modelName;
    }
    
    public final long component3() {
        return this.totalRAM;
    }
    
    public final long component4() {
        return this.totalInternalStorageSpace;
    }
    
    public final Map<String, String> component5() {
        return this.procCpuInfo;
    }
    
    public final CpuInfo component6() {
        return this.procCpuInfoV2;
    }
    
    public final List<SensorData> component7() {
        return this.sensors;
    }
    
    public final List<InputDeviceData> component8() {
        return this.inputDevices;
    }
    
    public final String component9() {
        return this.batteryHealth;
    }
    
    public final HardwareFingerprintRawData copy(final String s, final String s2, final long n, final long n2, final Map<String, String> map, final CpuInfo cpuInfo, final List<SensorData> list, final List<InputDeviceData> list2, final String s3, final String s4, final List<CameraInfo> list3, final String s5, final String s6, final int n3) {
        Intrinsics.checkNotNullParameter((Object)s, "manufacturerName");
        Intrinsics.checkNotNullParameter((Object)s2, "modelName");
        Intrinsics.checkNotNullParameter((Object)map, "procCpuInfo");
        Intrinsics.checkNotNullParameter((Object)cpuInfo, "procCpuInfoV2");
        Intrinsics.checkNotNullParameter((Object)list, "sensors");
        Intrinsics.checkNotNullParameter((Object)list2, "inputDevices");
        Intrinsics.checkNotNullParameter((Object)s3, "batteryHealth");
        Intrinsics.checkNotNullParameter((Object)s4, "batteryFullCapacity");
        Intrinsics.checkNotNullParameter((Object)list3, "cameraList");
        Intrinsics.checkNotNullParameter((Object)s5, "glesVersion");
        Intrinsics.checkNotNullParameter((Object)s6, "abiType");
        return new HardwareFingerprintRawData(s, s2, n, n2, map, cpuInfo, list, list2, s3, s4, list3, s5, s6, n3);
    }
    
    public final IdentificationSignal<Integer> coresCount() {
        return (IdentificationSignal<Integer>)new HardwareFingerprintRawData$coresCount.HardwareFingerprintRawData$coresCount$1(this, StabilityLevel.STABLE, this.coresCount);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HardwareFingerprintRawData)) {
            return false;
        }
        final HardwareFingerprintRawData hardwareFingerprintRawData = (HardwareFingerprintRawData)o;
        return Intrinsics.areEqual((Object)this.manufacturerName, (Object)hardwareFingerprintRawData.manufacturerName) && Intrinsics.areEqual((Object)this.modelName, (Object)hardwareFingerprintRawData.modelName) && this.totalRAM == hardwareFingerprintRawData.totalRAM && this.totalInternalStorageSpace == hardwareFingerprintRawData.totalInternalStorageSpace && Intrinsics.areEqual((Object)this.procCpuInfo, (Object)hardwareFingerprintRawData.procCpuInfo) && Intrinsics.areEqual((Object)this.procCpuInfoV2, (Object)hardwareFingerprintRawData.procCpuInfoV2) && Intrinsics.areEqual((Object)this.sensors, (Object)hardwareFingerprintRawData.sensors) && Intrinsics.areEqual((Object)this.inputDevices, (Object)hardwareFingerprintRawData.inputDevices) && Intrinsics.areEqual((Object)this.batteryHealth, (Object)hardwareFingerprintRawData.batteryHealth) && Intrinsics.areEqual((Object)this.batteryFullCapacity, (Object)hardwareFingerprintRawData.batteryFullCapacity) && Intrinsics.areEqual((Object)this.cameraList, (Object)hardwareFingerprintRawData.cameraList) && Intrinsics.areEqual((Object)this.glesVersion, (Object)hardwareFingerprintRawData.glesVersion) && Intrinsics.areEqual((Object)this.abiType, (Object)hardwareFingerprintRawData.abiType) && this.coresCount == hardwareFingerprintRawData.coresCount;
    }
    
    public final String getAbiType() {
        return this.abiType;
    }
    
    public final String getBatteryFullCapacity() {
        return this.batteryFullCapacity;
    }
    
    public final String getBatteryHealth() {
        return this.batteryHealth;
    }
    
    public final List<CameraInfo> getCameraList() {
        return this.cameraList;
    }
    
    public final int getCoresCount() {
        return this.coresCount;
    }
    
    public final String getGlesVersion() {
        return this.glesVersion;
    }
    
    public final List<InputDeviceData> getInputDevices() {
        return this.inputDevices;
    }
    
    public final String getManufacturerName() {
        return this.manufacturerName;
    }
    
    public final String getModelName() {
        return this.modelName;
    }
    
    public final Map<String, String> getProcCpuInfo() {
        return this.procCpuInfo;
    }
    
    public final CpuInfo getProcCpuInfoV2() {
        return this.procCpuInfoV2;
    }
    
    public final List<SensorData> getSensors() {
        return this.sensors;
    }
    
    public final long getTotalInternalStorageSpace() {
        return this.totalInternalStorageSpace;
    }
    
    public final long getTotalRAM() {
        return this.totalRAM;
    }
    
    public final IdentificationSignal<String> glesVersion() {
        return (IdentificationSignal<String>)new HardwareFingerprintRawData$glesVersion.HardwareFingerprintRawData$glesVersion$1(this, StabilityLevel.STABLE, this.glesVersion);
    }
    
    @Override
    public int hashCode() {
        return ((((((((((((this.manufacturerName.hashCode() * 31 + this.modelName.hashCode()) * 31 + Long.hashCode(this.totalRAM)) * 31 + Long.hashCode(this.totalInternalStorageSpace)) * 31 + this.procCpuInfo.hashCode()) * 31 + this.procCpuInfoV2.hashCode()) * 31 + this.sensors.hashCode()) * 31 + this.inputDevices.hashCode()) * 31 + this.batteryHealth.hashCode()) * 31 + this.batteryFullCapacity.hashCode()) * 31 + this.cameraList.hashCode()) * 31 + this.glesVersion.hashCode()) * 31 + this.abiType.hashCode()) * 31 + Integer.hashCode(this.coresCount);
    }
    
    public final IdentificationSignal<List<InputDeviceData>> inputDevices() {
        return (IdentificationSignal<List<InputDeviceData>>)new HardwareFingerprintRawData$inputDevices.HardwareFingerprintRawData$inputDevices$1(StabilityLevel.STABLE, (List)this.inputDevices);
    }
    
    public final IdentificationSignal<List<InputDeviceData>> inputDevicesV2() {
        return (IdentificationSignal<List<InputDeviceData>>)new HardwareFingerprintRawData$inputDevicesV2.HardwareFingerprintRawData$inputDevicesV2$1(StabilityLevel.STABLE, (List)this.inputDevices);
    }
    
    public final IdentificationSignal<String> manufacturerName() {
        return (IdentificationSignal<String>)new HardwareFingerprintRawData$manufacturerName.HardwareFingerprintRawData$manufacturerName$1(this, StabilityLevel.STABLE, this.manufacturerName);
    }
    
    public final IdentificationSignal<String> modelName() {
        return (IdentificationSignal<String>)new HardwareFingerprintRawData$modelName.HardwareFingerprintRawData$modelName$1(this, StabilityLevel.STABLE, this.modelName);
    }
    
    public final IdentificationSignal<Map<String, String>> procCpuInfo() {
        return (IdentificationSignal<Map<String, String>>)new HardwareFingerprintRawData$procCpuInfo.HardwareFingerprintRawData$procCpuInfo$1(this, StabilityLevel.STABLE, (Map)this.procCpuInfo);
    }
    
    public final IdentificationSignal<CpuInfo> procCpuInfoV2() {
        final StabilityLevel stable = StabilityLevel.STABLE;
        final CpuInfo procCpuInfoV2 = this.procCpuInfoV2;
        final Iterable iterable = (Iterable)procCpuInfoV2.getCommonInfo();
        final Collection collection = (Collection)new ArrayList();
        for (final Object next : iterable) {
            final Pair pair = (Pair)next;
            final Set<String> cpuinfo_IGNORED_COMMON_PROPS = HardwareFingerprintRawData.CPUINFO_IGNORED_COMMON_PROPS;
            final String lowerCase = ((String)pair.getFirst()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "toLowerCase(...)");
            if (!cpuinfo_IGNORED_COMMON_PROPS.contains((Object)lowerCase)) {
                collection.add(next);
            }
        }
        final List list = (List)collection;
        final Iterable iterable2 = (Iterable)this.procCpuInfoV2.getPerProcessorInfo();
        final Collection collection2 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (final Iterable iterable3 : iterable2) {
            final Collection collection3 = (Collection)new ArrayList();
            for (final Object next2 : iterable3) {
                final Pair pair2 = (Pair)next2;
                final Set<String> cpuinfo_IGNORED_PER_PROC_PROPS = HardwareFingerprintRawData.CPUINFO_IGNORED_PER_PROC_PROPS;
                final String lowerCase2 = ((String)pair2.getFirst()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue((Object)lowerCase2, "toLowerCase(...)");
                if (!cpuinfo_IGNORED_PER_PROC_PROPS.contains((Object)lowerCase2)) {
                    collection3.add(next2);
                }
            }
            collection2.add((Object)collection3);
        }
        return (IdentificationSignal<CpuInfo>)new HardwareFingerprintRawData$procCpuInfoV2.HardwareFingerprintRawData$procCpuInfoV2$1(stable, procCpuInfoV2.copy(list, (List)collection2));
    }
    
    public final IdentificationSignal<List<SensorData>> sensors() {
        return (IdentificationSignal<List<SensorData>>)new HardwareFingerprintRawData$sensors.HardwareFingerprintRawData$sensors$1(this, StabilityLevel.STABLE, (List)this.sensors);
    }
    
    @Override
    public List<IdentificationSignal<?>> signals() {
        return (List<IdentificationSignal<?>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.manufacturerName(), this.modelName(), this.totalRAM(), this.totalInternalStorageSpace(), this.procCpuInfo(), this.procCpuInfoV2(), this.sensors(), this.inputDevices(), this.inputDevicesV2(), this.batteryHealth(), this.batteryFullCapacity(), this.cameraList(), this.glesVersion(), this.abiType(), this.coresCount() });
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HardwareFingerprintRawData(manufacturerName=");
        sb.append(this.manufacturerName).append(", modelName=").append(this.modelName).append(", totalRAM=").append(this.totalRAM).append(", totalInternalStorageSpace=").append(this.totalInternalStorageSpace).append(", procCpuInfo=").append((Object)this.procCpuInfo).append(", procCpuInfoV2=").append((Object)this.procCpuInfoV2).append(", sensors=").append((Object)this.sensors).append(", inputDevices=").append((Object)this.inputDevices).append(", batteryHealth=").append(this.batteryHealth).append(", batteryFullCapacity=").append(this.batteryFullCapacity).append(", cameraList=").append((Object)this.cameraList).append(", glesVersion=");
        sb.append(this.glesVersion).append(", abiType=").append(this.abiType).append(", coresCount=").append(this.coresCount).append(')');
        return sb.toString();
    }
    
    public final IdentificationSignal<Long> totalInternalStorageSpace() {
        return (IdentificationSignal<Long>)new HardwareFingerprintRawData$totalInternalStorageSpace.HardwareFingerprintRawData$totalInternalStorageSpace$1(this, StabilityLevel.STABLE, this.totalInternalStorageSpace);
    }
    
    public final IdentificationSignal<Long> totalRAM() {
        return (IdentificationSignal<Long>)new HardwareFingerprintRawData$totalRAM.HardwareFingerprintRawData$totalRAM$1(this, StabilityLevel.STABLE, this.totalRAM);
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareFingerprintRawData$Companion;", "", "()V", "CPUINFO_IGNORED_COMMON_PROPS", "", "", "CPUINFO_IGNORED_PER_PROC_PROPS", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    private static final class Companion
    {
    }
}
