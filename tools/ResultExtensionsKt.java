package com.fingerprintjs.android.fingerprint.tools;

import kotlin.Result$Companion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Result;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "flatten", "Lkotlin/Result;", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class ResultExtensionsKt
{
    public static final <V> Object flatten(Object o) {
        final boolean success-impl = Result.isSuccess-impl(o);
        if (success-impl) {
            ResultKt.throwOnFailure(o);
            o = ((Result)o).unbox-impl();
        }
        else {
            if (success-impl) {
                throw new NoWhenBranchMatchedException();
            }
            final Result$Companion companion = Result.Companion;
            final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(o);
            Intrinsics.checkNotNull((Object)exceptionOrNull-impl);
            o = Result.constructor-impl(ResultKt.createFailure(exceptionOrNull-impl));
        }
        return o;
    }
}
