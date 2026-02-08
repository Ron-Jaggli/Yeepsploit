package com.fingerprintjs.android.fingerprint.device_id_signals;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/device_id_signals/AndroidIdSignal;", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignal;", "", "value", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getIdString", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class AndroidIdSignal extends DeviceIdSignal<String>
{
    private final String value;
    
    public AndroidIdSignal(final String value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        super(null);
        this.value = value;
    }
    
    @Override
    public String getIdString() {
        return this.getValue();
    }
    
    @Override
    public String getValue() {
        return this.value;
    }
}
