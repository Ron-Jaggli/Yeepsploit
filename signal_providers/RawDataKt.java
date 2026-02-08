package com.fingerprintjs.android.fingerprint.signal_providers;

import kotlin.Deprecated;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a(\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a(\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b" }, d2 = { "filterByStabilityLevel", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "filterByVersion", "version", "", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class RawDataKt
{
    @Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
    public static final List<IdentificationSignal<?>> filterByStabilityLevel(final List<? extends IdentificationSignal<?>> list, final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final Iterable iterable = (Iterable)list;
        final Collection collection = (Collection)new ArrayList();
        for (final Object next : iterable) {
            final IdentificationSignal identificationSignal = (IdentificationSignal)next;
            final int n = WhenMappings.$EnumSwitchMapping$0[stabilityLevel.ordinal()];
            int n2 = 0;
            boolean b = false;
            Label_0161: {
                if (n != 1) {
                    if (n == 2) {
                        final boolean b2 = identificationSignal.getStabilityLevel() == StabilityLevel.STABLE;
                        if (identificationSignal.getStabilityLevel() == StabilityLevel.OPTIMAL) {
                            b = true;
                        }
                        n2 = ((b | b2) ? 1 : 0);
                        break Label_0161;
                    }
                    if (n != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                else if (identificationSignal.getStabilityLevel() != StabilityLevel.STABLE) {
                    break Label_0161;
                }
                n2 = 1;
            }
            if (n2 != 0) {
                collection.add(next);
            }
        }
        return (List<IdentificationSignal<?>>)collection;
    }
    
    @Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
    public static final List<IdentificationSignal<?>> filterByVersion(final List<? extends IdentificationSignal<?>> list, final int n) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        final Iterable iterable = (Iterable)list;
        final Collection collection = (Collection)new ArrayList();
        for (final Object next : iterable) {
            final IdentificationSignal identificationSignal = (IdentificationSignal)next;
            final Integer removedInVersion = identificationSignal.getRemovedInVersion();
            final int n2 = 0;
            final boolean b = removedInVersion == null || identificationSignal.getRemovedInVersion() > n;
            final int addedInVersion = identificationSignal.getAddedInVersion();
            int n3 = n2;
            if (1 <= addedInVersion) {
                n3 = n2;
                if (addedInVersion <= n) {
                    n3 = 1;
                }
            }
            if (b && n3 != 0) {
                collection.add(next);
            }
        }
        return (List<IdentificationSignal<?>>)collection;
    }
}
