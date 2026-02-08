package com.fingerprintjs.android.fingerprint.signal_providers.device_id;

import com.fingerprintjs.android.fingerprint.signal_providers.RawData;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/SignalGroupProvider;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdRawData;", "gsfIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "androidIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "mediaDrmIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "version", "", "(Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;I)V", "rawData", "getRawData", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdRawData;", "rawData$delegate", "Lkotlin/Lazy;", "fingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "v1", "v3", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceIdProvider extends SignalGroupProvider<DeviceIdRawData>
{
    private final Lazy rawData$delegate;
    
    public DeviceIdProvider(final GsfIdProvider gsfIdProvider, final AndroidIdProvider androidIdProvider, final MediaDrmIdProvider mediaDrmIdProvider, final int n) {
        Intrinsics.checkNotNullParameter((Object)gsfIdProvider, "gsfIdProvider");
        Intrinsics.checkNotNullParameter((Object)androidIdProvider, "androidIdProvider");
        Intrinsics.checkNotNullParameter((Object)mediaDrmIdProvider, "mediaDrmIdProvider");
        super(n);
        this.rawData$delegate = LazyKt.lazy((Function0)new DeviceIdProvider$rawData.DeviceIdProvider$rawData$2(androidIdProvider, gsfIdProvider, mediaDrmIdProvider));
    }
    
    private final DeviceIdRawData getRawData() {
        return (DeviceIdRawData)this.rawData$delegate.getValue();
    }
    
    private final String v1() {
        IdentificationSignal<String> identificationSignal;
        if (this.getRawData().gsfId().getValue().length() == 0) {
            identificationSignal = this.getRawData().androidId();
        }
        else {
            identificationSignal = this.getRawData().gsfId();
        }
        return identificationSignal.getValue();
    }
    
    private final String v3() {
        final int length = this.getRawData().gsfId().getValue().length();
        String s = null;
        String s2;
        if (length == 0) {
            s2 = null;
        }
        else {
            s2 = this.getRawData().gsfId().getValue();
        }
        if (this.getRawData().mediaDrmId().getValue().length() != 0) {
            s = this.getRawData().mediaDrmId().getValue();
        }
        String s3 = s2;
        if (s2 == null) {
            if (s == null) {
                s3 = this.getRawData().androidId().getValue();
            }
            else {
                s3 = s;
            }
        }
        return s3;
    }
    
    @Override
    public String fingerprint(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final int version = this.getVersion();
        String s;
        if (version != 1) {
            if (version != 2) {
                if (version != 3) {
                    s = this.v3();
                }
                else {
                    s = this.v3();
                }
            }
            else {
                s = this.v1();
            }
        }
        else {
            s = this.v1();
        }
        return s;
    }
    
    @Override
    public DeviceIdRawData rawData() {
        return this.getRawData();
    }
}
