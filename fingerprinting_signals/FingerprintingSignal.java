package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u00012\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?¨\u0006@" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "T", "", "()V", "info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "getInfo", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "value", "getValue", "()Ljava/lang/Object;", "getHashableString", "", "Info", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AbiTypeSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AccessibilityEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AdbEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AlarmAlertPathSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AndroidVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ApplicationsListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacitySignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacityV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryHealthSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CameraListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CodecListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CoresCountSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DataRoamingEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DateFormatSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultInputMethodSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultLanguageSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DevelopmentSettingsEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EncryptionStatusSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EndButtonBehaviourSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSensorStatusSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/GlesVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/HttpProxySignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/IsPinSecurityEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/KernelVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ManufacturerNameSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ModelNameSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RegionCountrySignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RingtoneSourceSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ScreenOffTimeoutSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SdkVersionSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SecurityProvidersSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoPunctuateSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoReplaceEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/Time12Or24Signal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TimezoneSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalInternalStorageSpaceSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalRamSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TouchExplorationEnabledSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TransitionAnimationScaleSignal;", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/WindowAnimationScaleSignal;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public abstract class FingerprintingSignal<T>
{
    private FingerprintingSignal() {
    }
    
    public abstract String getHashableString();
    
    public abstract Info getInfo();
    
    public abstract T getValue();
    
    @Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal$Info;", "", "addedInVersion", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "removedInVersion", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "(Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;)V", "getAddedInVersion", "()Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "getRemovedInVersion", "getStabilityLevel", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
    public static final class Info
    {
        private final Fingerprinter$Version addedInVersion;
        private final Fingerprinter$Version removedInVersion;
        private final StabilityLevel stabilityLevel;
        
        public Info(final Fingerprinter$Version addedInVersion, final Fingerprinter$Version removedInVersion, final StabilityLevel stabilityLevel) {
            Intrinsics.checkNotNullParameter((Object)addedInVersion, "addedInVersion");
            Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
            this.addedInVersion = addedInVersion;
            this.removedInVersion = removedInVersion;
            this.stabilityLevel = stabilityLevel;
        }
        
        public final Fingerprinter$Version component1() {
            return this.addedInVersion;
        }
        
        public final Fingerprinter$Version component2() {
            return this.removedInVersion;
        }
        
        public final StabilityLevel component3() {
            return this.stabilityLevel;
        }
        
        public final Info copy(final Fingerprinter$Version fingerprinter$Version, final Fingerprinter$Version fingerprinter$Version2, final StabilityLevel stabilityLevel) {
            Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "addedInVersion");
            Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
            return new Info(fingerprinter$Version, fingerprinter$Version2, stabilityLevel);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Info)) {
                return false;
            }
            final Info info = (Info)o;
            return this.addedInVersion == info.addedInVersion && this.removedInVersion == info.removedInVersion && this.stabilityLevel == info.stabilityLevel;
        }
        
        public final Fingerprinter$Version getAddedInVersion() {
            return this.addedInVersion;
        }
        
        public final Fingerprinter$Version getRemovedInVersion() {
            return this.removedInVersion;
        }
        
        public final StabilityLevel getStabilityLevel() {
            return this.stabilityLevel;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.addedInVersion.hashCode();
            final Fingerprinter$Version removedInVersion = this.removedInVersion;
            int hashCode2;
            if (removedInVersion == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = removedInVersion.hashCode();
            }
            return (hashCode * 31 + hashCode2) * 31 + this.stabilityLevel.hashCode();
        }
        
        @Override
        public String toString() {
            return "Info(addedInVersion=" + (Object)this.addedInVersion + ", removedInVersion=" + (Object)this.removedInVersion + ", stabilityLevel=" + (Object)this.stabilityLevel + ')';
        }
    }
}
