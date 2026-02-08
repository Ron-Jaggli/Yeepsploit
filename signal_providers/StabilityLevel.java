package com.fingerprintjs.android.fingerprint.signal_providers;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.EnumEntries;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "", "(Ljava/lang/String;I)V", "atLeastAsStableAs", "", "other", "atLeastAsStableAs$fingerprint_release", "STABLE", "OPTIMAL", "UNIQUE", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public enum StabilityLevel
{
    private static final EnumEntries $ENTRIES;
    private static final StabilityLevel[] $VALUES;
    
    OPTIMAL, 
    STABLE, 
    UNIQUE;
    
    private static final /* synthetic */ StabilityLevel[] $values() {
        return new StabilityLevel[] { StabilityLevel.STABLE, StabilityLevel.OPTIMAL, StabilityLevel.UNIQUE };
    }
    
    static {
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])($VALUES = $values()));
    }
    
    public static EnumEntries<StabilityLevel> getEntries() {
        return (EnumEntries<StabilityLevel>)StabilityLevel.$ENTRIES;
    }
    
    public final boolean atLeastAsStableAs$fingerprint_release(final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "other");
        final int n = WhenMappings.$EnumSwitchMapping$0[this.ordinal()];
        boolean b2;
        final boolean b = b2 = true;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                final int n2 = WhenMappings.$EnumSwitchMapping$0[stabilityLevel.ordinal()];
                if (n2 != 1 && n2 != 2) {
                    if (n2 == 3) {
                        b2 = b;
                        return b2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            else {
                final int n3 = WhenMappings.$EnumSwitchMapping$0[stabilityLevel.ordinal()];
                if (n3 != 1) {
                    b2 = b;
                    if (n3 == 2) {
                        return b2;
                    }
                    if (n3 == 3) {
                        b2 = b;
                        return b2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            b2 = false;
        }
        return b2;
    }
}
