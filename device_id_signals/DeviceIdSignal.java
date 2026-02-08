package com.fingerprintjs.android.fingerprint.device_id_signals;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b¨\u0006\f" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignal;", "T", "", "()V", "value", "getValue", "()Ljava/lang/Object;", "getIdString", "", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/AndroidIdSignal;", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/GsfIdSignal;", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/MediaDrmIdSignal;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public abstract class DeviceIdSignal<T>
{
    private DeviceIdSignal() {
    }
    
    public abstract String getIdString();
    
    public abstract T getValue();
}
