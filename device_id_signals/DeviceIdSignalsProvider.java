package com.fingerprintjs.android.fingerprint.device_id_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.device_id_providers.MediaDrmIdProvider;
import com.fingerprintjs.android.fingerprint.device_id_providers.GsfIdProvider;
import kotlin.Lazy;
import com.fingerprintjs.android.fingerprint.device_id_providers.AndroidIdProvider;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;", "", "gsfIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;", "androidIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;", "mediaDrmIdProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;", "(Lcom/fingerprintjs/android/fingerprint/device_id_providers/GsfIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/AndroidIdProvider;Lcom/fingerprintjs/android/fingerprint/device_id_providers/MediaDrmIdProvider;)V", "androidIdSignal", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/AndroidIdSignal;", "getAndroidIdSignal", "()Lcom/fingerprintjs/android/fingerprint/device_id_signals/AndroidIdSignal;", "androidIdSignal$delegate", "Lkotlin/Lazy;", "gsfIdSignal", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/GsfIdSignal;", "getGsfIdSignal", "()Lcom/fingerprintjs/android/fingerprint/device_id_signals/GsfIdSignal;", "gsfIdSignal$delegate", "mediaDrmIdSignal", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/MediaDrmIdSignal;", "getMediaDrmIdSignal", "()Lcom/fingerprintjs/android/fingerprint/device_id_signals/MediaDrmIdSignal;", "mediaDrmIdSignal$delegate", "getSignalMatching", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignal;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class DeviceIdSignalsProvider
{
    private final AndroidIdProvider androidIdProvider;
    private final Lazy androidIdSignal$delegate;
    private final GsfIdProvider gsfIdProvider;
    private final Lazy gsfIdSignal$delegate;
    private final MediaDrmIdProvider mediaDrmIdProvider;
    private final Lazy mediaDrmIdSignal$delegate;
    
    public DeviceIdSignalsProvider(final GsfIdProvider gsfIdProvider, final AndroidIdProvider androidIdProvider, final MediaDrmIdProvider mediaDrmIdProvider) {
        Intrinsics.checkNotNullParameter((Object)gsfIdProvider, "gsfIdProvider");
        Intrinsics.checkNotNullParameter((Object)androidIdProvider, "androidIdProvider");
        Intrinsics.checkNotNullParameter((Object)mediaDrmIdProvider, "mediaDrmIdProvider");
        this.gsfIdProvider = gsfIdProvider;
        this.androidIdProvider = androidIdProvider;
        this.mediaDrmIdProvider = mediaDrmIdProvider;
        this.gsfIdSignal$delegate = LazyKt.lazy((Function0)new DeviceIdSignalsProvider$gsfIdSignal.DeviceIdSignalsProvider$gsfIdSignal$2(this));
        this.androidIdSignal$delegate = LazyKt.lazy((Function0)new DeviceIdSignalsProvider$androidIdSignal.DeviceIdSignalsProvider$androidIdSignal$2(this));
        this.mediaDrmIdSignal$delegate = LazyKt.lazy((Function0)new DeviceIdSignalsProvider$mediaDrmIdSignal.DeviceIdSignalsProvider$mediaDrmIdSignal$2(this));
    }
    
    public final AndroidIdSignal getAndroidIdSignal() {
        return (AndroidIdSignal)this.androidIdSignal$delegate.getValue();
    }
    
    public final GsfIdSignal getGsfIdSignal() {
        return (GsfIdSignal)this.gsfIdSignal$delegate.getValue();
    }
    
    public final MediaDrmIdSignal getMediaDrmIdSignal() {
        return (MediaDrmIdSignal)this.mediaDrmIdSignal$delegate.getValue();
    }
    
    public final DeviceIdSignal<?> getSignalMatching(final Fingerprinter$Version fingerprinter$Version) {
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        final Fingerprinter$Version v_1 = Fingerprinter$Version.V_1;
        final int compareTo = fingerprinter$Version.compareTo((Object)Fingerprinter$Version.V_2);
        final MediaDrmIdSignal mediaDrmIdSignal = null;
        final GsfIdSignal gsfIdSignal = null;
        DeviceIdSignal deviceIdSignal;
        if (compareTo <= 0 && fingerprinter$Version.compareTo((Object)v_1) >= 0) {
            final GsfIdSignal gsfIdSignal2 = this.getGsfIdSignal();
            GsfIdSignal gsfIdSignal3 = gsfIdSignal;
            if (((CharSequence)gsfIdSignal2.getValue()).length() > 0) {
                gsfIdSignal3 = gsfIdSignal2;
            }
            if (gsfIdSignal3 != null) {
                deviceIdSignal = gsfIdSignal3;
            }
            else {
                deviceIdSignal = this.getAndroidIdSignal();
            }
        }
        else {
            GsfIdSignal gsfIdSignal4 = this.getGsfIdSignal();
            if (((CharSequence)gsfIdSignal4.getValue()).length() <= 0) {
                gsfIdSignal4 = null;
            }
            if (gsfIdSignal4 != null) {
                deviceIdSignal = gsfIdSignal4;
            }
            else {
                final MediaDrmIdSignal mediaDrmIdSignal2 = this.getMediaDrmIdSignal();
                MediaDrmIdSignal mediaDrmIdSignal3 = mediaDrmIdSignal;
                if (((CharSequence)mediaDrmIdSignal2.getValue()).length() > 0) {
                    mediaDrmIdSignal3 = mediaDrmIdSignal2;
                }
                if (mediaDrmIdSignal3 != null) {
                    deviceIdSignal = mediaDrmIdSignal3;
                }
                else {
                    deviceIdSignal = this.getAndroidIdSignal();
                }
            }
        }
        return deviceIdSignal;
    }
}
