package com.fingerprintjs.android.fingerprint.signal_providers.device_id;

import kotlin.collections.CollectionsKt;
import java.util.List;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.IdentificationSignal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.RawData;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdRawData;", "Lcom/fingerprintjs/android/fingerprint/signal_providers/RawData;", "androidId", "", "gsfId", "mediaDrmId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "signals", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceIdRawData extends RawData
{
    private final String androidId;
    private final String gsfId;
    private final String mediaDrmId;
    
    public DeviceIdRawData(final String androidId, final String gsfId, final String mediaDrmId) {
        Intrinsics.checkNotNullParameter((Object)androidId, "androidId");
        this.androidId = androidId;
        this.gsfId = gsfId;
        this.mediaDrmId = mediaDrmId;
    }
    
    public final IdentificationSignal<String> androidId() {
        return (IdentificationSignal<String>)new DeviceIdRawData$androidId.DeviceIdRawData$androidId$1(this, StabilityLevel.STABLE, this.androidId);
    }
    
    public final IdentificationSignal<String> gsfId() {
        final StabilityLevel stable = StabilityLevel.STABLE;
        String gsfId;
        if ((gsfId = this.gsfId) == null) {
            gsfId = "";
        }
        return (IdentificationSignal<String>)new DeviceIdRawData$gsfId.DeviceIdRawData$gsfId$1(this, stable, gsfId);
    }
    
    public final IdentificationSignal<String> mediaDrmId() {
        final StabilityLevel stable = StabilityLevel.STABLE;
        String mediaDrmId;
        if ((mediaDrmId = this.mediaDrmId) == null) {
            mediaDrmId = "";
        }
        return (IdentificationSignal<String>)new DeviceIdRawData$mediaDrmId.DeviceIdRawData$mediaDrmId$1(this, stable, mediaDrmId);
    }
    
    @Override
    public List<IdentificationSignal<String>> signals() {
        return (List<IdentificationSignal<String>>)CollectionsKt.listOf((Object[])new IdentificationSignal[] { this.gsfId(), this.androidId(), this.mediaDrmId() });
    }
}
