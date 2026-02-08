package com.fingerprintjs.android.fingerprint;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.EnumEntries;
import com.fingerprintjs.android.fingerprint.signal_providers.os_build.OsBuildSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.installed_apps.InstalledAppsSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.hardware.HardwareSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_state.DeviceStateSignalGroupProvider;
import com.fingerprintjs.android.fingerprint.signal_providers.device_id.DeviceIdProvider;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import kotlin.Result$Companion;
import com.fingerprintjs.android.fingerprint.tools.ResultExtensionsKt;
import kotlin.Deprecated;
import com.fingerprintjs.android.fingerprint.tools.logs.MessagesKt;
import com.fingerprintjs.android.fingerprint.tools.logs.Logger;
import com.fingerprintjs.android.fingerprint.tools.DummyResults;
import com.fingerprintjs.android.fingerprint.tools.threading.AnotherThreadKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.tools.hashers.MurMur3x64x128Hasher;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.functions.Function0;
import kotlin.Lazy;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002)*B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0082\bJ\u001c\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012J8\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J&\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007J$\u0010\u0016\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007J\n\u0010 \u001a\u0004\u0018\u00010!H\u0007J\\\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010#2\u0014\b\u0004\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0\u00122\u0014\b\u0004\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u00020\u000f0\u00122\u001f\b\u0004\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H#0\t0\u0012¢\u0006\u0002\b(H\u0082\bR'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8BX\u0082\u0084\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/Fingerprinter;", "", "implFactory", "Lkotlin/Function0;", "Lcom/fingerprintjs/android/fingerprint/FingerprinterImpl;", "isLegacyFactory", "", "(Lkotlin/jvm/functions/Function0;Z)V", "impl", "Lkotlin/Result;", "getImpl-d1pmJ48", "()Ljava/lang/Object;", "impl$delegate", "Lkotlin/Lazy;", "checkThisLegacyMethodSupported", "", "getDeviceId", "listener", "Lkotlin/Function1;", "Lcom/fingerprintjs/android/fingerprint/DeviceIdResult;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getFingerprint", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "hasher", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "", "Lcom/fingerprintjs/android/fingerprint/FingerprintResult;", "fingerprintingSignals", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "getFingerprintingSignalsProvider", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "runFingerprinterImplOnAnotherThread", "T", "onError", "", "onSuccess", "call", "Lkotlin/ExtensionFunctionType;", "LegacyArgs", "Version", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class Fingerprinter
{
    private final Lazy impl$delegate;
    private final Function0<FingerprinterImpl> implFactory;
    private final boolean isLegacyFactory;
    
    public Fingerprinter(final Function0<FingerprinterImpl> implFactory, final boolean isLegacyFactory) {
        Intrinsics.checkNotNullParameter((Object)implFactory, "implFactory");
        this.implFactory = implFactory;
        this.isLegacyFactory = isLegacyFactory;
        this.impl$delegate = LazyKt.lazy((Function0)new Fingerprinter$impl.Fingerprinter$impl$2(this));
    }
    
    private final void checkThisLegacyMethodSupported() {
        if (this.isLegacyFactory) {
            return;
        }
        throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
    }
    
    public static /* synthetic */ String getFingerprint$default(final Fingerprinter fingerprinter, final List list, Hasher hasher, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            hasher = (Hasher)new MurMur3x64x128Hasher();
        }
        return fingerprinter.getFingerprint((List<? extends FingerprintingSignal<?>>)list, hasher);
    }
    
    public static /* synthetic */ void getFingerprint$default(final Fingerprinter fingerprinter, final Version version, StabilityLevel optimal, Hasher hasher, final Function1 function1, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            optimal = StabilityLevel.OPTIMAL;
        }
        if ((n & 0x4) != 0x0) {
            hasher = (Hasher)new MurMur3x64x128Hasher();
        }
        fingerprinter.getFingerprint(version, optimal, hasher, (Function1<? super String, Unit>)function1);
    }
    
    public static /* synthetic */ void getFingerprint$default(final Fingerprinter fingerprinter, StabilityLevel optimal, final Function1 function1, final int n, final Object o) throws IllegalStateException {
        if ((n & 0x1) != 0x0) {
            optimal = StabilityLevel.OPTIMAL;
        }
        fingerprinter.getFingerprint(optimal, (Function1<? super FingerprintResult, Unit>)function1);
    }
    
    private final Object getImpl-d1pmJ48() {
        return ((Result)this.impl$delegate.getValue()).unbox-impl();
    }
    
    private final <T> void runFingerprinterImplOnAnotherThread(final Function1<? super Throwable, Unit> function1, final Function1<? super T, Unit> function2, final Function1<? super FingerprinterImpl, ? extends Result<? extends T>> function3) {
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread((Function0)new Fingerprinter$runFingerprinterImplOnAnotherThread.Fingerprinter$runFingerprinterImplOnAnotherThread$1(this, (Function1)function1, (Function1)function3, (Function1)function2)));
        if (exceptionOrNull-impl != null) {
            function1.invoke((Object)exceptionOrNull-impl);
        }
    }
    
    public final void getDeviceId(final Version version, final Function1<? super DeviceIdResult, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread((Function0)new Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread.Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread$2(this, (Function1)function1, (Function1)function1, version)));
        if (exceptionOrNull-impl != null) {
            function1.invoke((Object)DummyResults.INSTANCE.getDeviceIdResult());
            MessagesKt.ePleaseReport(Logger.INSTANCE, exceptionOrNull-impl);
        }
    }
    
    @Deprecated(message = "\n        This method has been deprecated in favor of getDeviceId(version, listener) overload. Check out method doc for details.\n    ")
    public final void getDeviceId(final Function1<? super DeviceIdResult, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        if (this.isLegacyFactory) {
            final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread((Function0)new Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread.Fingerprinter$getDeviceId$$inlined$runFingerprinterImplOnAnotherThread$1(this, (Function1)function1, (Function1)function1)));
            if (exceptionOrNull-impl != null) {
                function1.invoke((Object)DummyResults.INSTANCE.getDeviceIdResult());
                MessagesKt.ePleaseReport(Logger.INSTANCE, exceptionOrNull-impl);
            }
            return;
        }
        throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
    }
    
    public final String getFingerprint(final List<? extends FingerprintingSignal<?>> list) {
        Intrinsics.checkNotNullParameter((Object)list, "fingerprintingSignals");
        return getFingerprint$default(this, list, null, 2, null);
    }
    
    public final String getFingerprint(final List<? extends FingerprintingSignal<?>> list, final Hasher hasher) {
        Intrinsics.checkNotNullParameter((Object)list, "fingerprintingSignals");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        Object o2;
        final Object o = o2 = this.getImpl-d1pmJ48();
        if (Result.isSuccess-impl(o)) {
            final Result$Companion companion = Result.Companion;
            o2 = Result.box-impl(((FingerprinterImpl)o).getFingerprint-gIAlu-s((List)list, hasher));
        }
        final Object flatten = ResultExtensionsKt.flatten(Result.constructor-impl(o2));
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(flatten);
        if (exceptionOrNull-impl != null) {
            MessagesKt.ePleaseReport(Logger.INSTANCE, exceptionOrNull-impl);
        }
        Object o3 = flatten;
        if (Result.isFailure-impl(flatten)) {
            o3 = "";
        }
        return (String)o3;
    }
    
    public final void getFingerprint(final Version version, final StabilityLevel stabilityLevel, final Hasher hasher, final Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter((Object)hasher, "hasher");
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread((Function0)new Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread.Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread$2(this, (Function1)function1, (Function1)function1, version, stabilityLevel, hasher)));
        if (exceptionOrNull-impl != null) {
            function1.invoke((Object)"");
            MessagesKt.ePleaseReport(Logger.INSTANCE, exceptionOrNull-impl);
        }
    }
    
    public final void getFingerprint(final Version version, final StabilityLevel stabilityLevel, final Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        getFingerprint$default(this, version, stabilityLevel, null, function1, 4, null);
    }
    
    public final void getFingerprint(final Version version, final Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        getFingerprint$default(this, version, null, null, function1, 6, null);
    }
    
    @Deprecated(message = "\n        This method is deprecated in favor of getFingerprint(version,stabilityLevel, hasher, listener)\n        overload. Check out method doc for details.\n        ")
    public final void getFingerprint(final StabilityLevel stabilityLevel, final Function1<? super FingerprintResult, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        if (this.isLegacyFactory) {
            final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(AnotherThreadKt.runOnAnotherThread((Function0)new Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread.Fingerprinter$getFingerprint$$inlined$runFingerprinterImplOnAnotherThread$1(this, (Function1)function1, (Function1)function1, stabilityLevel)));
            if (exceptionOrNull-impl != null) {
                function1.invoke((Object)DummyResults.INSTANCE.getFingerprintResult());
                MessagesKt.ePleaseReport(Logger.INSTANCE, exceptionOrNull-impl);
            }
            return;
        }
        throw new IllegalStateException("To call this deprecated method, the instance must be retrieved using deprecated factory method.");
    }
    
    @Deprecated(message = "\n        This method is deprecated in favor of getFingerprint(version,stabilityLevel, hasher, listener)\n        overload. Check out method doc for details.\n        ")
    public final void getFingerprint(final Function1<? super FingerprintResult, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter((Object)function1, "listener");
        getFingerprint$default(this, null, function1, 1, null);
    }
    
    public final FingerprintingSignalsProvider getFingerprintingSignalsProvider() {
        Object o2;
        final Object o = o2 = this.getImpl-d1pmJ48();
        if (Result.isSuccess-impl(o)) {
            final Result$Companion companion = Result.Companion;
            o2 = ((FingerprinterImpl)o).getFingerprintingSignalsProvider$fingerprint_release();
        }
        final Object constructor-impl = Result.constructor-impl(o2);
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(constructor-impl);
        if (exceptionOrNull-impl != null) {
            MessagesKt.ePleaseReport(Logger.INSTANCE, exceptionOrNull-impl);
        }
        Object o3 = constructor-impl;
        if (Result.isFailure-impl(constructor-impl)) {
            o3 = null;
        }
        return (FingerprintingSignalsProvider)o3;
    }
    
    @Metadata(d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$LegacyArgs;", "", "hardwareSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "osBuildSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "deviceIdProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "installedAppsSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "deviceStateSignalProvider", "Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "configuration", "Lcom/fingerprintjs/android/fingerprint/Configuration;", "(Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;Lcom/fingerprintjs/android/fingerprint/Configuration;)V", "getConfiguration", "()Lcom/fingerprintjs/android/fingerprint/Configuration;", "getDeviceIdProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_id/DeviceIdProvider;", "getDeviceStateSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/device_state/DeviceStateSignalGroupProvider;", "getHardwareSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/hardware/HardwareSignalGroupProvider;", "getInstalledAppsSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/installed_apps/InstalledAppsSignalGroupProvider;", "getOsBuildSignalProvider", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/os_build/OsBuildSignalGroupProvider;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class LegacyArgs
    {
        private final Configuration configuration;
        private final DeviceIdProvider deviceIdProvider;
        private final DeviceStateSignalGroupProvider deviceStateSignalProvider;
        private final HardwareSignalGroupProvider hardwareSignalProvider;
        private final InstalledAppsSignalGroupProvider installedAppsSignalProvider;
        private final OsBuildSignalGroupProvider osBuildSignalProvider;
        
        public LegacyArgs(final HardwareSignalGroupProvider hardwareSignalProvider, final OsBuildSignalGroupProvider osBuildSignalProvider, final DeviceIdProvider deviceIdProvider, final InstalledAppsSignalGroupProvider installedAppsSignalProvider, final DeviceStateSignalGroupProvider deviceStateSignalProvider, final Configuration configuration) {
            Intrinsics.checkNotNullParameter((Object)hardwareSignalProvider, "hardwareSignalProvider");
            Intrinsics.checkNotNullParameter((Object)osBuildSignalProvider, "osBuildSignalProvider");
            Intrinsics.checkNotNullParameter((Object)deviceIdProvider, "deviceIdProvider");
            Intrinsics.checkNotNullParameter((Object)installedAppsSignalProvider, "installedAppsSignalProvider");
            Intrinsics.checkNotNullParameter((Object)deviceStateSignalProvider, "deviceStateSignalProvider");
            Intrinsics.checkNotNullParameter((Object)configuration, "configuration");
            this.hardwareSignalProvider = hardwareSignalProvider;
            this.osBuildSignalProvider = osBuildSignalProvider;
            this.deviceIdProvider = deviceIdProvider;
            this.installedAppsSignalProvider = installedAppsSignalProvider;
            this.deviceStateSignalProvider = deviceStateSignalProvider;
            this.configuration = configuration;
        }
        
        public final HardwareSignalGroupProvider component1() {
            return this.hardwareSignalProvider;
        }
        
        public final OsBuildSignalGroupProvider component2() {
            return this.osBuildSignalProvider;
        }
        
        public final DeviceIdProvider component3() {
            return this.deviceIdProvider;
        }
        
        public final InstalledAppsSignalGroupProvider component4() {
            return this.installedAppsSignalProvider;
        }
        
        public final DeviceStateSignalGroupProvider component5() {
            return this.deviceStateSignalProvider;
        }
        
        public final Configuration component6() {
            return this.configuration;
        }
        
        public final LegacyArgs copy(final HardwareSignalGroupProvider hardwareSignalGroupProvider, final OsBuildSignalGroupProvider osBuildSignalGroupProvider, final DeviceIdProvider deviceIdProvider, final InstalledAppsSignalGroupProvider installedAppsSignalGroupProvider, final DeviceStateSignalGroupProvider deviceStateSignalGroupProvider, final Configuration configuration) {
            Intrinsics.checkNotNullParameter((Object)hardwareSignalGroupProvider, "hardwareSignalProvider");
            Intrinsics.checkNotNullParameter((Object)osBuildSignalGroupProvider, "osBuildSignalProvider");
            Intrinsics.checkNotNullParameter((Object)deviceIdProvider, "deviceIdProvider");
            Intrinsics.checkNotNullParameter((Object)installedAppsSignalGroupProvider, "installedAppsSignalProvider");
            Intrinsics.checkNotNullParameter((Object)deviceStateSignalGroupProvider, "deviceStateSignalProvider");
            Intrinsics.checkNotNullParameter((Object)configuration, "configuration");
            return new LegacyArgs(hardwareSignalGroupProvider, osBuildSignalGroupProvider, deviceIdProvider, installedAppsSignalGroupProvider, deviceStateSignalGroupProvider, configuration);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof LegacyArgs)) {
                return false;
            }
            final LegacyArgs legacyArgs = (LegacyArgs)o;
            return Intrinsics.areEqual((Object)this.hardwareSignalProvider, (Object)legacyArgs.hardwareSignalProvider) && Intrinsics.areEqual((Object)this.osBuildSignalProvider, (Object)legacyArgs.osBuildSignalProvider) && Intrinsics.areEqual((Object)this.deviceIdProvider, (Object)legacyArgs.deviceIdProvider) && Intrinsics.areEqual((Object)this.installedAppsSignalProvider, (Object)legacyArgs.installedAppsSignalProvider) && Intrinsics.areEqual((Object)this.deviceStateSignalProvider, (Object)legacyArgs.deviceStateSignalProvider) && Intrinsics.areEqual((Object)this.configuration, (Object)legacyArgs.configuration);
        }
        
        public final Configuration getConfiguration() {
            return this.configuration;
        }
        
        public final DeviceIdProvider getDeviceIdProvider() {
            return this.deviceIdProvider;
        }
        
        public final DeviceStateSignalGroupProvider getDeviceStateSignalProvider() {
            return this.deviceStateSignalProvider;
        }
        
        public final HardwareSignalGroupProvider getHardwareSignalProvider() {
            return this.hardwareSignalProvider;
        }
        
        public final InstalledAppsSignalGroupProvider getInstalledAppsSignalProvider() {
            return this.installedAppsSignalProvider;
        }
        
        public final OsBuildSignalGroupProvider getOsBuildSignalProvider() {
            return this.osBuildSignalProvider;
        }
        
        @Override
        public int hashCode() {
            return ((((this.hardwareSignalProvider.hashCode() * 31 + this.osBuildSignalProvider.hashCode()) * 31 + this.deviceIdProvider.hashCode()) * 31 + this.installedAppsSignalProvider.hashCode()) * 31 + this.deviceStateSignalProvider.hashCode()) * 31 + this.configuration.hashCode();
        }
        
        @Override
        public String toString() {
            return "LegacyArgs(hardwareSignalProvider=" + (Object)this.hardwareSignalProvider + ", osBuildSignalProvider=" + (Object)this.osBuildSignalProvider + ", deviceIdProvider=" + (Object)this.deviceIdProvider + ", installedAppsSignalProvider=" + (Object)this.installedAppsSignalProvider + ", deviceStateSignalProvider=" + (Object)this.deviceStateSignalProvider + ", configuration=" + (Object)this.configuration + ')';
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "", "intValue", "", "(Ljava/lang/String;II)V", "getIntValue$fingerprint_release", "()I", "V_1", "V_2", "V_3", "V_4", "V_5", "V_6", "Companion", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public enum Version
    {
        private static final EnumEntries $ENTRIES;
        private static final Version[] $VALUES;
        public static final Companion Companion;
        
        V_1(1), 
        V_2(2), 
        V_3(3), 
        V_4(4), 
        V_5(5), 
        V_6(6);
        
        private final int intValue;
        
        private static final /* synthetic */ Version[] $values() {
            return new Version[] { Version.V_1, Version.V_2, Version.V_3, Version.V_4, Version.V_5, Version.V_6 };
        }
        
        static {
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])($VALUES = $values()));
            Companion = new Companion(null);
        }
        
        private Version(final int intValue) {
            this.intValue = intValue;
        }
        
        public static EnumEntries<Version> getEntries() {
            return (EnumEntries<Version>)Version.$ENTRIES;
        }
        
        public final int getIntValue$fingerprint_release() {
            return this.intValue;
        }
        
        @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version$Companion;", "", "()V", "fingerprintingFlattenedSignalsFirstVersion", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release", "()Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "fingerprintingGroupedSignalsLastVersion", "getFingerprintingGroupedSignalsLastVersion$fingerprint_release", "latest", "getLatest", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
        public static final class Companion
        {
            private Companion() {
            }
            
            public final Version getFingerprintingFlattenedSignalsFirstVersion$fingerprint_release() {
                return Version.V_5;
            }
            
            public final Version getFingerprintingGroupedSignalsLastVersion$fingerprint_release() {
                return Version.V_4;
            }
            
            public final Version getLatest() {
                return (Version)ArraysKt.last((Object[])Version.values());
            }
        }
    }
}
