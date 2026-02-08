package com.fingerprintjs.android.fingerprint.tools;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.functions.Function0;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "executeSafe", "T", "code", "Lkotlin/Function0;", "defaultValue", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Ljava/lang/Object;", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class ExceptionSafeExecutorKt
{
    @Deprecated(message = "This symbol has historically been public but is intended for internal use only. We will remove public visibility for this symbol in future versions.")
    public static final <T> T executeSafe(final Function0<? extends T> function0, T invoke) {
        Intrinsics.checkNotNullParameter((Object)function0, "code");
        try {
            invoke = (T)function0.invoke();
            return invoke;
        }
        finally {
            return invoke;
        }
    }
}
