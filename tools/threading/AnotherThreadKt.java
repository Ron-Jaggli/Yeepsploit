package com.fingerprintjs.android.fingerprint.tools.threading;

import kotlin.Result$Companion;
import kotlin.ResultKt;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "runOnAnotherThread", "Lkotlin/Result;", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class AnotherThreadKt
{
    public static final Object runOnAnotherThread(final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter((Object)function0, "block");
        Object constructor-impl;
        try {
            final Result$Companion companion = Result.Companion;
            SharedExecutorKt.getSharedExecutor().submit((Runnable)new AnotherThreadKt$$ExternalSyntheticLambda0(function0));
            Result.constructor-impl((Object)Unit.INSTANCE);
        }
        finally {
            final Result$Companion companion2 = Result.Companion;
            final Throwable t;
            constructor-impl = Result.constructor-impl(ResultKt.createFailure(t));
        }
        return constructor-impl;
    }
    
    private static final void runOnAnotherThread$lambda$1$lambda$0(final Function0 function0) {
        Intrinsics.checkNotNullParameter((Object)function0, "$block");
        function0.invoke();
    }
}
