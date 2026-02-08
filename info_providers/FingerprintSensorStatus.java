package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.enums.EnumEntriesKt;
import kotlin.enums.EnumEntries;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol has historically (and unintentionally) been public, even though Fingerprint API does not provide any way to reach to it. We will remove public visibility for this symbol in future versions.")
@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorStatus;", "", "stringDescription", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStringDescription", "()Ljava/lang/String;", "NOT_SUPPORTED", "SUPPORTED", "ENABLED", "UNKNOWN", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public enum FingerprintSensorStatus
{
    private static final EnumEntries $ENTRIES;
    private static final FingerprintSensorStatus[] $VALUES;
    
    ENABLED("enabled"), 
    NOT_SUPPORTED("not_supported"), 
    SUPPORTED("supported"), 
    UNKNOWN("unknown");
    
    private final String stringDescription;
    
    private static final /* synthetic */ FingerprintSensorStatus[] $values() {
        return new FingerprintSensorStatus[] { FingerprintSensorStatus.NOT_SUPPORTED, FingerprintSensorStatus.SUPPORTED, FingerprintSensorStatus.ENABLED, FingerprintSensorStatus.UNKNOWN };
    }
    
    static {
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])($VALUES = $values()));
    }
    
    private FingerprintSensorStatus(final String stringDescription) {
        this.stringDescription = stringDescription;
    }
    
    public static EnumEntries<FingerprintSensorStatus> getEntries() {
        return (EnumEntries<FingerprintSensorStatus>)FingerprintSensorStatus.$ENTRIES;
    }
    
    public final String getStringDescription() {
        return this.stringDescription;
    }
}
