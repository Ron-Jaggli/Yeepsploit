package com.fingerprintjs.android.fingerprint;

import com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.signal_providers.SignalGroupProvider;
import kotlin.Result$Companion;
import kotlin.ResultKt;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import java.util.List;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.device_id_signals.DeviceIdSignalsProvider;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0005H\u0000¢\u0006\u0002\b%J\u001e\u0010&\u001a\u00020\u0016*\u00020\u001a2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/FingerprinterImpl;", "", "legacyArgs", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;", "fpSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "deviceIdSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;Lcom/fingerprintjs/android/fingerprint/device_id_signals/DeviceIdSignalsProvider;)V", "deviceIdResult", "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "fingerprintResult", "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "getDeviceId", "Lkotlin/Result;", "getDeviceId-d1pmJ48", "()Ljava/lang/Object;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getDeviceId-IoAF18A", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;)Ljava/lang/Object;", "getFingerprint", "", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "getFingerprint-0E7RQCE", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)Ljava/lang/Object;", "getFingerprint-IoAF18A", "(Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;)Ljava/lang/Object;", "fingerprintingSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "getFingerprint-gIAlu-s", "(Ljava/util/List;Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;)Ljava/lang/Object;", "getFingerprintingSignalsProvider", "getFingerprintingSignalsProvider$fingerprint_release", "hash", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class FingerprinterImpl
{
    private volatile DeviceIdResult deviceIdResult;
    private final DeviceIdSignalsProvider deviceIdSignalsProvider;
    private volatile FingerprintResult fingerprintResult;
    private final FingerprintingSignalsProvider fpSignalsProvider;
    private final Fingerprinter$LegacyArgs legacyArgs;
    
    public FingerprinterImpl(final Fingerprinter$LegacyArgs legacyArgs, final FingerprintingSignalsProvider fpSignalsProvider, final DeviceIdSignalsProvider deviceIdSignalsProvider) {
        Intrinsics.checkNotNullParameter((Object)fpSignalsProvider, "fpSignalsProvider");
        Intrinsics.checkNotNullParameter((Object)deviceIdSignalsProvider, "deviceIdSignalsProvider");
        this.legacyArgs = legacyArgs;
        this.fpSignalsProvider = fpSignalsProvider;
        this.deviceIdSignalsProvider = deviceIdSignalsProvider;
    }
    
    private final String hash(final Hasher hasher, final List<? extends FingerprintingSignal<?>> list) {
        return hasher.hash(CollectionsKt.joinToString$default((Iterable)list, (CharSequence)"", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)FingerprinterImpl$hash$joinedString.FingerprinterImpl$hash$joinedString$1.INSTANCE, 30, (Object)null));
    }
    
    public final Object getDeviceId-IoAF18A(final Fingerprinter$Version fingerprinter$Version) {
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Object constructor-impl = null;
        try {
            final Result$Companion companion = Result.Companion;
            Result.constructor-impl((Object)new DeviceIdResult(this.deviceIdSignalsProvider.getSignalMatching(fingerprinter$Version).getIdString(), this.deviceIdSignalsProvider.getGsfIdSignal().getIdString(), this.deviceIdSignalsProvider.getAndroidIdSignal().getIdString(), this.deviceIdSignalsProvider.getMediaDrmIdSignal().getIdString()));
        }
        finally {
            final Result$Companion companion2 = Result.Companion;
            final Throwable t;
            constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
        }
        return constructor-impl;
    }
    
    @Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
    public final Object getDeviceId-d1pmJ48() {
        if (this.legacyArgs != null) {
            Object constructor-impl = null;
            try {
                final Result$Companion companion = Result.Companion;
                DeviceIdResult deviceIdResult = this.deviceIdResult;
                if (deviceIdResult == null) {
                    deviceIdResult = new DeviceIdResult(SignalGroupProvider.fingerprint$default((SignalGroupProvider)this.legacyArgs.getDeviceIdProvider(), (StabilityLevel)null, 1, (Object)null), (String)this.legacyArgs.getDeviceIdProvider().rawData().gsfId().getValue(), (String)this.legacyArgs.getDeviceIdProvider().rawData().androidId().getValue(), (String)this.legacyArgs.getDeviceIdProvider().rawData().mediaDrmId().getValue());
                    this.deviceIdResult = deviceIdResult;
                }
                Result.constructor-impl((Object)deviceIdResult);
            }
            finally {
                final Result$Companion companion2 = Result.Companion;
                final Throwable t;
                constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
            }
            return constructor-impl;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final Object getFingerprint-0E7RQCE(final Fingerprinter$Version fingerprinter$Version, final StabilityLevel stabilityLevel, final Hasher hasher) {
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        Object o;
        if (fingerprinter$Version.compareTo((Enum)Fingerprinter$Version.Companion.getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release()) < 0) {
            try {
                final Result$Companion companion = Result.Companion;
                final FingerprintingLegacySchemeSupportExtensions instance = FingerprintingLegacySchemeSupportExtensions.INSTANCE;
                Result.constructor-impl((Object)hasher.hash(CollectionsKt.joinToString$default((Iterable)CollectionsKt.listOf((Object[])new String[] { this.hash(hasher, (List<? extends FingerprintingSignal<?>>)instance.getHardwareSignals(this.fpSignalsProvider, fingerprinter$Version, stabilityLevel)), this.hash(hasher, (List<? extends FingerprintingSignal<?>>)instance.getOsBuildSignals(this.fpSignalsProvider, fingerprinter$Version, stabilityLevel)), this.hash(hasher, (List<? extends FingerprintingSignal<?>>)instance.getDeviceStateSignals(this.fpSignalsProvider, fingerprinter$Version, stabilityLevel)), this.hash(hasher, (List<? extends FingerprintingSignal<?>>)instance.getInstalledAppsSignals(this.fpSignalsProvider, fingerprinter$Version, stabilityLevel)) }), (CharSequence)"", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null)));
            }
            finally {
                final Result$Companion companion2 = Result.Companion;
                final Throwable t;
                o = Result.constructor-impl(ResultKt.createFailure(t));
            }
        }
        else {
            o = this.getFingerprint-gIAlu-s((List<? extends FingerprintingSignal<?>>)this.fpSignalsProvider.getSignalsMatching(fingerprinter$Version, stabilityLevel), hasher);
        }
        return o;
    }
    
    @Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
    public final Object getFingerprint-IoAF18A(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        if (this.legacyArgs != null) {
            Object constructor-impl = null;
            try {
                final Result$Companion companion = Result.Companion;
                final FingerprintResult fingerprintResult = this.fingerprintResult;
                FingerprintResult fingerprintResult2;
                if (fingerprintResult != null) {
                    fingerprintResult2 = fingerprintResult;
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.legacyArgs.getHardwareSignalProvider().fingerprint(stabilityLevel));
                    sb.append(this.legacyArgs.getOsBuildSignalProvider().fingerprint(stabilityLevel));
                    sb.append(this.legacyArgs.getDeviceStateSignalProvider().fingerprint(stabilityLevel));
                    sb.append(this.legacyArgs.getInstalledAppsSignalProvider().fingerprint(stabilityLevel));
                    fingerprintResult2 = (FingerprintResult)new FingerprinterImpl$getFingerprint$1.FingerprinterImpl$getFingerprint$1$3(this, sb);
                }
                Result.constructor-impl((Object)fingerprintResult2);
            }
            finally {
                final Result$Companion companion2 = Result.Companion;
                final Throwable t;
                constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
            }
            return constructor-impl;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final Object getFingerprint-gIAlu-s(final List<? extends FingerprintingSignal<?>> list, final Hasher hasher) {
        Intrinsics.checkNotNullParameter((Object)list, "fingerprintingSignals");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        Object constructor-impl = null;
        try {
            final Result$Companion companion = Result.Companion;
            Result.constructor-impl((Object)this.hash(hasher, list));
        }
        finally {
            final Result$Companion companion2 = Result.Companion;
            final Throwable t;
            constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
        }
        return constructor-impl;
    }
    
    public final FingerprintingSignalsProvider getFingerprintingSignalsProvider$fingerprint_release() {
        return this.fpSignalsProvider;
    }
}
