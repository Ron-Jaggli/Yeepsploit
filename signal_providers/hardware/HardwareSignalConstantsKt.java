package com.fingerprintjs.android.fingerprint.signal_providers.hardware;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0016\u0010\f\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u0016\u0010\u000e\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003\"\u0016\u0010\u0010\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003\"\u0016\u0010\u0012\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003\"\u0016\u0010\u0014\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0003\"\u0016\u0010\u0016\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0003\"\u0016\u0010\u0018\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0003\"\u0016\u0010\u001a\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0003\"\u0016\u0010\u001c\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0003\"\u0016\u0010\u001e\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u0003\"\u0016\u0010 \u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u0003\"\u0016\u0010\"\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b#\u0010\u0003\"\u0016\u0010$\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010\u0003\"\u0016\u0010&\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b'\u0010\u0003\"\u0016\u0010(\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b)\u0010\u0003\"\u0016\u0010*\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b+\u0010\u0003\"\u0016\u0010,\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b-\u0010\u0003\"\u0016\u0010.\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b/\u0010\u0003\"\u0016\u00100\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b1\u0010\u0003\"\u0016\u00102\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b3\u0010\u0003\"\u0016\u00104\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b5\u0010\u0003¨\u00066" }, d2 = { "ABI_TYPE_DISPLAY_NAME", "", "getABI_TYPE_DISPLAY_NAME$annotations", "()V", "ABI_TYPE_KEY", "getABI_TYPE_KEY$annotations", "BATTERY_FULL_CAPACITY_DISPLAY_NAME", "getBATTERY_FULL_CAPACITY_DISPLAY_NAME$annotations", "BATTERY_FULL_CAPACITY_KEY", "getBATTERY_FULL_CAPACITY_KEY$annotations", "BATTERY_HEALTH_DISPLAY_NAME", "getBATTERY_HEALTH_DISPLAY_NAME$annotations", "BATTERY_HEALTH_KEY", "getBATTERY_HEALTH_KEY$annotations", "CAMERAS_DISPLAY_VALUE", "getCAMERAS_DISPLAY_VALUE$annotations", "CAMERAS_KEY", "getCAMERAS_KEY$annotations", "CORES_COUNT_DISPLAY_NAME", "getCORES_COUNT_DISPLAY_NAME$annotations", "CORES_COUNT_KEY", "getCORES_COUNT_KEY$annotations", "CPU_INFO_DISPLAY_NAME", "getCPU_INFO_DISPLAY_NAME$annotations", "CPU_INFO_KEY", "getCPU_INFO_KEY$annotations", "GLES_VERSION_DISPLAY_NAME", "getGLES_VERSION_DISPLAY_NAME$annotations", "GLES_VERSION_KEY", "getGLES_VERSION_KEY$annotations", "INPUT_DEVICES_DISPLAY_NAME", "getINPUT_DEVICES_DISPLAY_NAME$annotations", "INPUT_DEVICES_KEY", "getINPUT_DEVICES_KEY$annotations", "MANUFACTURER_DISPLAY_NAME", "getMANUFACTURER_DISPLAY_NAME$annotations", "MANUFACTURER_NAME_KEY", "getMANUFACTURER_NAME_KEY$annotations", "MODEL_DISPLAY_NAME", "getMODEL_DISPLAY_NAME$annotations", "MODEL_NAME_KEY", "getMODEL_NAME_KEY$annotations", "SENSORS_DISPLAY_NAME", "getSENSORS_DISPLAY_NAME$annotations", "SENSORS_INFO_KEY", "getSENSORS_INFO_KEY$annotations", "TOTAL_INTERNAL_STORAGE_SPACE_DISPLAY_NAME", "getTOTAL_INTERNAL_STORAGE_SPACE_DISPLAY_NAME$annotations", "TOTAL_INTERNAL_STORAGE_SPACE_KEY", "getTOTAL_INTERNAL_STORAGE_SPACE_KEY$annotations", "TOTAL_RAM_DISPLAY_NAME", "getTOTAL_RAM_DISPLAY_NAME$annotations", "TOTAL_RAM_KEY", "getTOTAL_RAM_KEY$annotations", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class HardwareSignalConstantsKt
{
    public static final String ABI_TYPE_DISPLAY_NAME = "ABI type";
    public static final String ABI_TYPE_KEY = "abiType";
    public static final String BATTERY_FULL_CAPACITY_DISPLAY_NAME = "Battery full capacity";
    public static final String BATTERY_FULL_CAPACITY_KEY = "batteryFullCapacity";
    public static final String BATTERY_HEALTH_DISPLAY_NAME = "Battery health";
    public static final String BATTERY_HEALTH_KEY = "batteryHealth";
    public static final String CAMERAS_DISPLAY_VALUE = "Cameras";
    public static final String CAMERAS_KEY = "cameras";
    public static final String CORES_COUNT_DISPLAY_NAME = "Cores count";
    public static final String CORES_COUNT_KEY = "coresCount";
    public static final String CPU_INFO_DISPLAY_NAME = "CPU Info";
    public static final String CPU_INFO_KEY = "cpuInfo";
    public static final String GLES_VERSION_DISPLAY_NAME = "GLES version";
    public static final String GLES_VERSION_KEY = "glesVersion";
    public static final String INPUT_DEVICES_DISPLAY_NAME = "Input devices";
    public static final String INPUT_DEVICES_KEY = "inputDevices";
    public static final String MANUFACTURER_DISPLAY_NAME = "Manufacturer name";
    public static final String MANUFACTURER_NAME_KEY = "manufacturerName";
    public static final String MODEL_DISPLAY_NAME = "Model name";
    public static final String MODEL_NAME_KEY = "modelName";
    public static final String SENSORS_DISPLAY_NAME = "Sensors";
    public static final String SENSORS_INFO_KEY = "sensors";
    public static final String TOTAL_INTERNAL_STORAGE_SPACE_DISPLAY_NAME = "Total internal storage space";
    public static final String TOTAL_INTERNAL_STORAGE_SPACE_KEY = "totalInternalStorageSpace";
    public static final String TOTAL_RAM_DISPLAY_NAME = "Total RAM";
    public static final String TOTAL_RAM_KEY = "totalRAM";
}
