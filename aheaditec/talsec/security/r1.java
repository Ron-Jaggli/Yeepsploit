package com.aheaditec.talsec.security;

import java.util.concurrent.CancellationException;
import java.nio.ByteBuffer;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.BuildersKt;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.StandardCharsets;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import com.aheaditec.talsec_security.security.api.TalsecMode;
import com.aheaditec.talsec_security.security.api.TalsecConfig;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

public final class r1
{
    public static final b g;
    public static r1 h;
    public v1 a;
    public s0 b;
    public t1 c;
    public x0 d;
    public s1 e;
    public final CoroutineScope f;
    
    static {
        g = new b(null);
    }
    
    public r1(final Context context, final TalsecConfig talsecConfig, final TalsecMode talsecMode) {
        final CompletableJob supervisorJob$default = SupervisorKt.SupervisorJob$default((Job)null, 1, (Object)null);
        final int n = r1.c.a[((Enum)talsecMode).ordinal()];
        Object o;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            o = Dispatchers.getDefault();
        }
        else {
            o = Dispatchers.getMain();
        }
        BuildersKt.launch$default(this.f = CoroutineScopeKt.CoroutineScope(supervisorJob$default.plus((CoroutineContext)o)), (CoroutineContext)null, (CoroutineStart)null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, context, talsecConfig, null) {
            public int a;
            public Object b;
            public final r1 c;
            public final Context d;
            public final TalsecConfig e;
            
            public static void a(final byte[] array, final byte[] array2) {
                byte[] array3 = null;
                int n = 0;
                int n2 = 0;
                int n3 = -1850458006;
                byte[] array4 = null;
            Label_0266:
                while (true) {
                    final int n4 = n3 >>> 8;
                    final int n5 = 1;
                    final int n6 = 1;
                    final int n7 = n4 - 1 - (~((0x1000000 & n3) * (n3 | 0x1000000) + (0xFEFFFFFF & n3) * (~n3 & 0x1000000)) | n4);
                    final int n8 = -1700147435 - ((n7 & 0x2) | 2028104049 - n7);
                    n3 = -1396193641;
                    switch (0xAEBB822B ^ ~n8 + (n8 | 0x1) * 2) {
                        case 1733787683: {
                            final byte b = array4[n];
                            final byte b2 = array3[n];
                            array4[n] = (byte)((byte)((byte)b2 + (byte)b) - (byte)((byte)2 * (byte)(b2 & b)));
                            final int n9 = n2 = (n ^ 0x1) + (n & 0x1) * 2;
                            if ((lcmp((long)n9, (long)array4.length) >>> 31 & 0x1) != 0x0) {
                                n3 = 1985663266;
                                n2 = n9;
                                continue;
                            }
                            break;
                        }
                        case 585276366: {
                            int n10 = n6;
                            if (array.length <= 0) {
                                n10 = 0;
                            }
                            if (n10 != 0) {
                                n3 = 1985663266;
                            }
                            else {
                                n3 = -1396193641;
                            }
                            array4 = array;
                            array3 = array2;
                            n2 = 0;
                            continue;
                        }
                        case 399486784: {
                            break Label_0266;
                        }
                        case -360299937: {
                            int n11 = n5;
                            if (dcmpg((double)array3[n2], Double.NaN) <= -1) {
                                n11 = 0;
                            }
                            if (n11 == 0) {
                                n3 = 427928065;
                            }
                            if (n11 != 0) {
                                n3 = 614229416;
                            }
                            n = n2;
                            continue;
                        }
                        case -1940167324: {
                            final byte b3 = array3[n];
                            final int n12 = (byte)0 - (byte)b3;
                            array3[n] = (byte)((byte)(b3 & ~n12) - (byte)(~b3 & n12));
                            n3 = 614229416;
                            continue;
                        }
                    }
                    n3 = -1396193641;
                }
            }
            
            public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                return ((r1$a)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Continuation<Unit> create(final Object b, final Continuation<?> continuation) {
                final Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = (Function2<CoroutineScope, Continuation<? super Unit>, Object>)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.c, this.d, this.e, continuation) {
                    public int a;
                    public Object b;
                    public final r1 c;
                    public final Context d;
                    public final TalsecConfig e;
                    
                    public static void a(final byte[] array, final byte[] array2) {
                        byte[] array3 = null;
                        int n = 0;
                        int n2 = 0;
                        int n3 = -1850458006;
                        byte[] array4 = null;
                    Label_0266:
                        while (true) {
                            final int n4 = n3 >>> 8;
                            final int n5 = 1;
                            final int n6 = 1;
                            final int n7 = n4 - 1 - (~((0x1000000 & n3) * (n3 | 0x1000000) + (0xFEFFFFFF & n3) * (~n3 & 0x1000000)) | n4);
                            final int n8 = -1700147435 - ((n7 & 0x2) | 2028104049 - n7);
                            n3 = -1396193641;
                            switch (0xAEBB822B ^ ~n8 + (n8 | 0x1) * 2) {
                                case 1733787683: {
                                    final byte b = array4[n];
                                    final byte b2 = array3[n];
                                    array4[n] = (byte)((byte)((byte)b2 + (byte)b) - (byte)((byte)2 * (byte)(b2 & b)));
                                    final int n9 = n2 = (n ^ 0x1) + (n & 0x1) * 2;
                                    if ((lcmp((long)n9, (long)array4.length) >>> 31 & 0x1) != 0x0) {
                                        n3 = 1985663266;
                                        n2 = n9;
                                        continue;
                                    }
                                    break;
                                }
                                case 585276366: {
                                    int n10 = n6;
                                    if (array.length <= 0) {
                                        n10 = 0;
                                    }
                                    if (n10 != 0) {
                                        n3 = 1985663266;
                                    }
                                    else {
                                        n3 = -1396193641;
                                    }
                                    array4 = array;
                                    array3 = array2;
                                    n2 = 0;
                                    continue;
                                }
                                case 399486784: {
                                    break Label_0266;
                                }
                                case -360299937: {
                                    int n11 = n5;
                                    if (dcmpg((double)array3[n2], Double.NaN) <= -1) {
                                        n11 = 0;
                                    }
                                    if (n11 == 0) {
                                        n3 = 427928065;
                                    }
                                    if (n11 != 0) {
                                        n3 = 614229416;
                                    }
                                    n = n2;
                                    continue;
                                }
                                case -1940167324: {
                                    final byte b3 = array3[n];
                                    final int n12 = (byte)0 - (byte)b3;
                                    array3[n] = (byte)((byte)(b3 & ~n12) - (byte)(~b3 & n12));
                                    n3 = 614229416;
                                    continue;
                                }
                            }
                            n3 = -1396193641;
                        }
                    }
                    
                    public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                        return ((r1$a)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                };
                function2.b = b;
                return (Continuation<Unit>)function2;
            }
            
            public Object invoke(final Object o, final Object o2) {
                return ((r1$a)this.create(o, (Continuation<?>)o2)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Object invokeSuspend(final Object o) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(o);
                    final CoroutineScope coroutineScope = (CoroutineScope)this.b;
                    this.c.a = new v1(this.d);
                    this.c.b = s0.g.a(this.e);
                    final r1 c = this.c;
                    v1 a;
                    if ((a = c.a) == null) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[7];
                        array2[0] = 19;
                        array2[1] = 65;
                        array2[2] = 75;
                        array2[3] = -8;
                        array2[4] = 103;
                        array2[5] = -112;
                        array2[6] = 51;
                        a(array, new byte[] { 96, 53, 36, -118, 6, -9, 86, 121 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
                        a = null;
                    }
                    c.c = new t1(a.b());
                    final r1 c2 = this.c;
                    v1 a2;
                    if ((a2 = c2.a) == null) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[7];
                        array4[0] = -62;
                        array4[1] = -104;
                        array4[2] = -121;
                        array4[3] = -57;
                        array4[4] = 120;
                        array4[5] = 53;
                        array4[6] = 75;
                        a(array3, new byte[] { -79, -20, -24, -75, 25, 82, 46, -51 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array3, StandardCharsets.UTF_8).intern());
                        a2 = null;
                    }
                    final TalsecConfig e = this.e;
                    final Context d = this.d;
                    s0 b;
                    if ((b = this.c.b) == null) {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[11];
                        array6[0] = 104;
                        array6[1] = -86;
                        array6[2] = -23;
                        array6[3] = -89;
                        array6[4] = -52;
                        array6[5] = 77;
                        array6[6] = -88;
                        array6[7] = 97;
                        array6[8] = -83;
                        array6[9] = -110;
                        array6[10] = 28;
                        a(array5, new byte[] { 15, -58, -100, -62, -88, 14, -57, 15, -53, -5, 123 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array5, StandardCharsets.UTF_8).intern());
                        b = null;
                    }
                    c2.d = x0.a(a2, e, d, (r0.a)b.e);
                    final r1 c3 = this.c;
                    final Context d2 = this.d;
                    t1 c4;
                    if ((c4 = this.c.c) == null) {
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[11];
                        array8[0] = 21;
                        array8[1] = 124;
                        array8[2] = -83;
                        array8[3] = 4;
                        array8[4] = -17;
                        array8[5] = 22;
                        array8[6] = 29;
                        array8[7] = -72;
                        array8[8] = -6;
                        array8[9] = -77;
                        array8[10] = -94;
                        a(array7, new byte[] { 97, 29, -63, 119, -118, 117, 91, -44, -101, -44, -47 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array7, StandardCharsets.UTF_8).intern());
                        c4 = null;
                    }
                    final u1 b2 = c4.b();
                    final byte[] array10;
                    final byte[] array9 = array10 = new byte[14];
                    array10[0] = -112;
                    array10[1] = -115;
                    array10[2] = -40;
                    array10[3] = -27;
                    array10[4] = -41;
                    array10[5] = 86;
                    array10[6] = -79;
                    array10[7] = 33;
                    array10[8] = -43;
                    array10[9] = -109;
                    array10[10] = 100;
                    array10[11] = 120;
                    array10[12] = 123;
                    array10[13] = -24;
                    a(array9, new byte[] { -9, -24, -84, -96, -77, 63, -59, 78, -89, -69, 74, 86, 85, -63 });
                    final Charset utf_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue((Object)b2, new String(array9, utf_8).intern());
                    v1 a3;
                    if ((a3 = this.c.a) == null) {
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[7];
                        array12[0] = -60;
                        array12[1] = -120;
                        array12[2] = -88;
                        array12[3] = 38;
                        array12[4] = 56;
                        array12[5] = 124;
                        array12[6] = -106;
                        a(array11, new byte[] { -73, -4, -57, 84, 89, 27, -13, -55 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array11, utf_8).intern());
                        a3 = null;
                    }
                    final String a4 = a3.b().h.a();
                    Object d3 = this.c.d;
                    if (d3 == null) {
                        final byte[] array14;
                        final byte[] array13 = array14 = new byte[11];
                        array14[0] = -1;
                        array14[1] = -96;
                        array14[2] = -61;
                        array14[3] = 114;
                        array14[4] = -77;
                        array14[5] = 55;
                        array14[6] = -68;
                        array14[7] = 41;
                        array14[8] = 101;
                        array14[9] = 59;
                        array14[10] = -23;
                        a(array13, new byte[] { -106, -60, -90, 28, -57, 94, -38, 64, 0, 73, -102 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array13, utf_8).intern());
                        d3 = null;
                    }
                    Object b3 = this.c.b;
                    if (b3 == null) {
                        final byte[] array16;
                        final byte[] array15 = array16 = new byte[11];
                        array16[0] = 121;
                        array16[1] = -54;
                        array16[2] = 31;
                        array16[3] = 98;
                        array16[4] = 60;
                        array16[5] = 93;
                        array16[6] = 75;
                        array16[7] = -108;
                        array16[8] = -6;
                        array16[9] = -96;
                        array16[10] = -58;
                        a(array15, new byte[] { 30, -90, 106, 7, 88, 30, 36, -6, -100, -55, -95 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array15, utf_8).intern());
                        b3 = null;
                    }
                    c3.e = new s1(d2, b2, a4, (w0)d3, (r0)b3, this.e, CoroutineScopeKt.CoroutineScope(coroutineScope.getCoroutineContext()));
                    return Unit.INSTANCE;
                }
                final byte[] array18;
                final byte[] array17 = array18 = new byte[47];
                array18[0] = -18;
                array18[1] = 124;
                array18[2] = -35;
                array18[3] = 8;
                array18[4] = 37;
                array18[5] = -128;
                array18[6] = 108;
                array18[7] = 48;
                array18[8] = -33;
                array18[9] = -3;
                array18[10] = -34;
                array18[11] = 91;
                array18[12] = -49;
                array18[13] = -99;
                array18[14] = 15;
                array18[15] = 67;
                array18[16] = -39;
                array18[17] = 76;
                array18[18] = 79;
                array18[19] = 110;
                array18[20] = -37;
                array18[21] = -66;
                array18[22] = -123;
                array18[23] = 20;
                array18[24] = -39;
                array18[25] = -18;
                array18[26] = 107;
                array18[27] = -91;
                array18[28] = 34;
                array18[29] = 41;
                array18[30] = 125;
                array18[31] = 67;
                array18[32] = -46;
                array18[33] = 88;
                array18[34] = -21;
                array18[35] = -38;
                array18[36] = -112;
                array18[37] = -69;
                array18[38] = -12;
                array18[39] = -43;
                array18[40] = 52;
                array18[41] = 108;
                array18[42] = 119;
                array18[43] = -25;
                array18[44] = 56;
                array18[45] = -80;
                array18[46] = 60;
                a(array17, new byte[] { -115, 29, -79, 100, 5, -12, 3, 16, -8, -113, -69, 40, -70, -16, 106, 100, -7, 46, 42, 8, -76, -52, -32, 52, -2, -121, 5, -45, 77, 66, 24, 100, -14, 47, -126, -82, -8, -101, -105, -70, 70, 3, 2, -109, 81, -34, 89 });
                throw new IllegalStateException(new String(array17, StandardCharsets.UTF_8).intern());
            }
        }, 3, (Object)null);
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        final int n = ~"com.aheaditec.talsec.security.r1".length();
        int n2 = (~(("com.aheaditec.talsec.security.r1".length() | 0x42FDD19 | n) - (n | ("com.aheaditec.talsec.security.r1".length() & 0xFBD022E6))) & 0x8A042208) + (("com.aheaditec.talsec.security.r1".length() & 0x400C0008) | 0x41280820) ^ 0xCB2C2A28;
        final int a = B1.a((Class)r1.class, -1);
        int n3 = (a | 0x954FECC5) - ((0x14DECC5 | a) ^ 0x9402A001) + (("com.aheaditec.talsec.security.r1".length() | 0x6BFDFFFD) - 1811808253 | 0x20081002) ^ 0xB40AB003;
        int n4 = ((~"com.aheaditec.talsec.security.r1".length() | 0xDDA24923) & 0x10824042) + (("com.aheaditec.talsec.security.r1".length() & 0x9040) | 0x40019001) ^ 0x5083D043;
        int n5 = ((~"com.aheaditec.talsec.security.r1".length() | 0xBAFDFD77) & 0x68A830CC) + (("com.aheaditec.talsec.security.r1".length() & 0x4003889A) | 0x80138C12) ^ 0xE8BBBCDE;
        final int length = "com.aheaditec.talsec.security.r1".length();
        final int length2 = "com.aheaditec.talsec.security.r1".length();
        int n6 = 0x9B7D9791 ^ ((0x1B101411 & length2) ^ 0x80400590) + (length2 & 0x410) + ((~length | 0xE06FE760) & 0x1B3D9201);
        int n7 = (~"com.aheaditec.talsec.security.r1".length() | 0xFFEFBFFF) + 689325073 + (("com.aheaditec.talsec.security.r1".length() & 0x82104800) | 0x824008A8) ^ 0xAB564CB8;
        final int length3 = "com.aheaditec.talsec.security.r1".length();
        final int length4 = "com.aheaditec.talsec.security.r1".length();
        int n8 = ((~length3 | 0x5776618) & 0xC02C8254) + (0x905020 | (length4 | 0xC088C064) - (length4 ^ 0xC088C064)) ^ 0x58FD1772;
        short[] array3 = null;
    Label_1132:
        while (true) {
            int a2 = 0;
            int n11 = 0;
            Label_3458: {
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                Label_2858: {
                    int n27 = 0;
                    int n28 = 0;
                    Label_2106: {
                        int n16 = 0;
                        int n17 = 0;
                        switch (n8) {
                            default: {
                                final int n9 = ~"com.aheaditec.talsec.security.r1".length();
                                final int n10 = (0xED53ECFC | n9) + 45165696 - (n9 | 0xEFF3ECFC);
                                a2 = O.a(n10, 3, -N.a(n10, -4, 1, ("com.aheaditec.talsec.security.r1".length() & 0x2A00020) | 0x94020220), 1);
                                n11 = -361272203;
                                break Label_3458;
                            }
                            case 2093236949: {
                                if (n7 < (((~"com.aheaditec.talsec.security.r1".length() | 0xDB3AB245) & 0x4DB02E10) + (("com.aheaditec.talsec.security.r1".length() & 0x4800D19) | 0x2005010D) ^ 0x6DB52F3D)) {
                                    n12 = ((~"com.aheaditec.talsec.security.r1".length() | 0x4D5991B8) & 0x21320709) + (("com.aheaditec.talsec.security.r1".length() & 0x34222601) | 0x14002004);
                                    n13 = -1287294623 - n12;
                                    n14 = 1287294622;
                                    break Label_2858;
                                }
                                final int n15 = ~"com.aheaditec.talsec.security.r1".length();
                                n16 = (0x4411012E & -1207265904 + n15 + (-n15 - 1 | 0x47F56A70)) + (("com.aheaditec.talsec.security.r1".length() & 0x4D110460) | 0x9000440);
                                n17 = 612868558;
                                break;
                            }
                            case 1771480224: {
                                array[(((~"com.aheaditec.talsec.security.r1".length() | 0x422FD499) & 0x4A01800A) + (("com.aheaditec.talsec.security.r1".length() & 0x9000502) | 0x5082500) ^ 0x4F09A50A) + n2] = (byte)((((~"com.aheaditec.talsec.security.r1".length() | 0x5F9A85FE) & 0x1808350) + (("com.aheaditec.talsec.security.r1".length() | 0xFFEBFDFD) + 1311235 | 0x801400A2) ^ 0x8194830D) & n4);
                                final int length5 = "com.aheaditec.talsec.security.r1".length();
                                final int length6 = "com.aheaditec.talsec.security.r1".length();
                                final int length7 = "com.aheaditec.talsec.security.r1".length();
                                final int length8 = "com.aheaditec.talsec.security.r1".length();
                                array[(((~length5 | 0xAD39FB88) & 0x2A212880) + ((length6 & 0x43020008) | 0x51428008) ^ 0x7B63A889) + n2] = (byte)(n4 >> (((~length7 | 0x15E46274) & 0x20B53110) + (length8 + 558960896 - (length8 | 0x21511100) | 0x1428004) ^ 0x21F7B11C) & (((~"com.aheaditec.talsec.security.r1".length() | 0x7DF43DE4) & 0x3D300832) + (("com.aheaditec.talsec.security.r1".length() & 0x80101A) | 0x82174D) ^ 0x3DB21F80));
                                final int n18 = ((~"com.aheaditec.talsec.security.r1".length() | 0x2AA0B538) & 0x8230514) + (("com.aheaditec.talsec.security.r1".length() & 0x30024) | 0x801010E0);
                                final int a3 = A1.a(~n18 | 0x883315F6, 2, -2009917962 - n18, 2, n2);
                                final int length9 = "com.aheaditec.talsec.security.r1".length();
                                final int length10 = "com.aheaditec.talsec.security.r1".length();
                                final int n19 = ~((length10 & 0x38B80309) + 276825601 - (length10 & 0x10800201));
                                final int n20 = -((~length9 | 0xC3C2F477) & 0x2878811C);
                                array[a3] = (byte)((w1.a(~n20, n19, 2, n19 + n20 + 1) ^ 0x38F887E2) & n5);
                                final int length11 = "com.aheaditec.talsec.security.r1".length();
                                final int length12 = "com.aheaditec.talsec.security.r1".length();
                                final int n21 = ~"com.aheaditec.talsec.security.r1".length();
                                final int a4 = B1.a((Class)r1.class, 0x4763FDFC | n21);
                                final int length13 = "com.aheaditec.talsec.security.r1".length();
                                final int length14 = "com.aheaditec.talsec.security.r1".length();
                                final int length15 = "com.aheaditec.talsec.security.r1".length();
                                final int length16 = "com.aheaditec.talsec.security.r1".length();
                                final int n22 = ("com.aheaditec.talsec.security.r1".length() & 0x20884062) | 0xAA028042;
                                final int n23 = -((~length16 | 0x5F73B59C) & 0x55C844A4);
                                array[(((~length11 | 0xBF552BF4) & 0x1A230910) + ((length12 & 0x4228004) | 0x84048405) ^ 0x9E278D16) + n2] = (byte)(n5 >> (0x7CBDC0FA ^ (length14 | 0x2831C0E0) - (n21 | 0x6F73FDFC) + (a4 + (length13 & 0x2831C0E0)) + ((length15 & 0x68940010) | 0x548C0012)) & (0xFFCAC419 ^ (~n23 & n22) - (n23 & ~n22)));
                                n2 += 4;
                                n16 = ((~"com.aheaditec.talsec.security.r1".length() | 0xF5BFD72F) & 0x13002210) + (("com.aheaditec.talsec.security.r1".length() & 0x2002010) | 0x21402);
                                n17 = -1824662634;
                                break;
                            }
                            case 1734050766: {
                                final int n24 = ~"com.aheaditec.talsec.security.r1".length();
                                if (n2 > 0) {
                                    final int length17 = "com.aheaditec.talsec.security.r1".length();
                                    n16 = ((n24 | 0xEFFADC8E) & 0x10D1006A) + (0xA086800 | length17 + 402735200 - (length17 | 0x18014060));
                                    n17 = -115901203;
                                    break;
                                }
                                final int n25 = ("com.aheaditec.talsec.security.r1".length() & 0x1120000) | 0x21004004;
                                final int n26 = -((n24 | 0x5A0DDFDD) & 0x18120300);
                                n27 = (~n26 & n25) - (n26 & ~n25);
                                n28 = 2001041846;
                                break Label_2106;
                            }
                            case 1314339506: {
                                break Label_1132;
                            }
                            case 998066383: {
                                n2 = (((B1.a((Class)r1.class, -1) | 0x12B95885) & 0x16208A48) + (("com.aheaditec.talsec.security.r1".length() | 0xFBFF7DA7) + 67142233 | 0x89000110) ^ 0x9F208B58);
                                n3 = array.length - array.length % (((~"com.aheaditec.talsec.security.r1".length() | 0x15DACEF5) & 0x501E1A02) + (("com.aheaditec.talsec.security.r1".length() & 0xC4049063) | 0x84008061) ^ 0xD41E9A67);
                                n16 = ((~"com.aheaditec.talsec.security.r1".length() | 0xAEF59C61) & 0x2EC1453) + (("com.aheaditec.talsec.security.r1".length() & 0x91180012) | 0xB9102A00);
                                n17 = 1002689495;
                                break;
                            }
                            case 974072829: {
                                final int length18 = array.length;
                                final int length19 = "com.aheaditec.talsec.security.r1".length();
                                final int n29 = ("com.aheaditec.talsec.security.r1".length() & 0xF006550) | 0x65003700;
                                final int n30 = -((~length19 | 0x65FE9CA7) & 0xA2648F6);
                                n2 = length18 % (0x6F267FF2 ^ (~n30 & n29) - (n30 & ~n29));
                                n16 = ((~"com.aheaditec.talsec.security.r1".length() | 0x3B134AC3) & 0x820C1403) + (("com.aheaditec.talsec.security.r1".length() & 0x900C5408) | 0x11004008);
                                n17 = -195569723;
                                break;
                            }
                            case 766056152: {
                                final int length20 = "com.aheaditec.talsec.security.r1".length();
                                final int length21 = "com.aheaditec.talsec.security.r1".length();
                                final int n31 = length21 + 84675108 - (length21 | 0x50C0A24);
                                if (n2 < (0x6DCD8F6B ^ (~n31 & 0x24440D24) + n31 + ((~length20 | 0xCAF5A54F) & 0x4989824B))) {
                                    final int n32 = (~"com.aheaditec.talsec.security.r1".length() | 0x6FFB14D6) & 0x72014033;
                                    final int n33 = ("com.aheaditec.talsec.security.r1".length() & 0x10025821) | 0xA1888;
                                    n16 = M.a(n32 | n33, 2, ~n32 ^ n33, 1);
                                    n17 = -717449014;
                                    break;
                                }
                                n16 = ((~"com.aheaditec.talsec.security.r1".length() | 0xA7E82FDE) & 0xA0612419) + (("com.aheaditec.talsec.security.r1".length() & 0x40094861) | 0x50084862);
                                n17 = -887872332;
                                break;
                            }
                            case -473033593: {
                                final int length22 = array.length;
                                final int n34 = -n2;
                                final int n35 = -length22;
                                final int n36 = n35 | n34;
                                final byte b = array[array.length - n2];
                                final int length23 = "com.aheaditec.talsec.security.r1".length();
                                array[n36 - n35 * 2 + (n35 ^ n34 ^ n36)] = (byte)(b ^ array2[n2 % (((0xCB9E47BD | length23 - 1 - length23 * 2) & 0x58D38068) + (("com.aheaditec.talsec.security.r1".length() & 0x10618843) | 0x21242803) ^ 0x79F7A863)]);
                                --n2;
                                final int a5 = B1.a((Class)r1.class, -1);
                                final int n37 = "com.aheaditec.talsec.security.r1".length() & 0x400C4082;
                                n16 = J.a(n37, -n37 - 1 | 0xEFFDFB7C, 268567684, (a5 | 0x6D1BD13) & 0x468D5000);
                                n17 = 836032333;
                                break;
                            }
                            case -1489518479: {
                                final int length24 = "com.aheaditec.talsec.security.r1".length();
                                final int n38 = (0x85A08468 & 516782023 - length24 + (-(-1 - length24) - 1 | 0xE1328838)) + (("com.aheaditec.talsec.security.r1".length() & 0xC121C028) | 0x40014001) ^ 0xC5A1C46B;
                                final int n39 = array2[(~n2 & n38) * (~n38 & n2) + (n38 & n2) * (n38 | n2)] & (((~"com.aheaditec.talsec.security.r1".length() | 0x8FB561CA) & 0xD4011A85) + (("com.aheaditec.talsec.security.r1".length() & 0x50101A05) | 0x20900108) ^ 0xF4911B72);
                                final int n40 = ~"com.aheaditec.talsec.security.r1".length();
                                final int n41 = ("com.aheaditec.talsec.security.r1".length() & 0x2203110) | 0x200D300;
                                final int n42 = -(0x4622098 & (~n40 & 0x965780AA) + n40);
                                final byte b2 = array2[(0x662F39A ^ (~n42 & n41) * 2 - (n42 ^ n41)) * n2 + ((B1.a((Class)r1.class, -1) | 0xFFF7DFFF) + 67641369 + (("com.aheaditec.talsec.security.r1".length() & 0x82042) | 0x642) ^ 0x408265B)];
                                final int n43 = ~"com.aheaditec.talsec.security.r1".length();
                                final int n44 = (b2 & ((0x279022C0 & n43 + 1314070430 - (n43 & 0x4E531F9E)) + (("com.aheaditec.talsec.security.r1".length() & 0x31C02044) | 0x1040040C) ^ 0x37D02633)) << ((B1.a((Class)r1.class, -1) | 0xFDFFFFFE) + 1107366402 + (("com.aheaditec.talsec.security.r1".length() & 0x82000041) | 0x80002140) ^ 0xC2013349);
                                array3[n2] = (short)((n44 ^ n39) + (n39 & n44));
                                ++n2;
                                n16 = ((B1.a((Class)r1.class, -1) | 0xF60B90CE) & 0x4505AC40) + (("com.aheaditec.talsec.security.r1".length() & 0x9843D10) | 0x88801110);
                                n17 = -533943416;
                                break;
                            }
                            case -1740520186: {
                                array3 = new short[((~"com.aheaditec.talsec.security.r1".length() | 0xE92FC1C9) & 0x61C8445) + (("com.aheaditec.talsec.security.r1".length() & 0x6500624) | 0x401230) ^ 0x65C9671];
                                n2 = (((~"com.aheaditec.talsec.security.r1".length() | 0xFFA3E21F) & 0x49804EA1) + (("com.aheaditec.talsec.security.r1".length() & 0x30401CA0) | 0x30419100) ^ 0x79C1DFA1);
                                final int length25 = "com.aheaditec.talsec.security.r1".length();
                                final int n45 = "com.aheaditec.talsec.security.r1".length() & 0x10006009;
                                n27 = ("com.aheaditec.talsec.security.r1".length() & ~n45 & 0x406008) + 4218888 + n45 - ((n45 | "com.aheaditec.talsec.security.r1".length()) & 0x406008) + ((~length25 | 0x649DBA54) & 0x34011001);
                                n28 = 434661073;
                                break Label_2106;
                            }
                            case -1809249287: {
                                final byte b3 = array[(((~"com.aheaditec.talsec.security.r1".length() | 0x49851A55) & 0x7816F4A) + (("com.aheaditec.talsec.security.r1".length() & 0x2E24650A) | 0x28340001) ^ 0x2FB56F4B) + n2];
                                final int n46 = ((~"com.aheaditec.talsec.security.r1".length() | 0xFF938BDA) & 0x18044242) + (("com.aheaditec.talsec.security.r1".length() & 0x20944030) | 0x20908030) ^ 0x3894C28D;
                                final int a6 = B1.a((Class)r1.class, (int)b3);
                                final int length26 = "com.aheaditec.talsec.security.r1".length();
                                final int length27 = "com.aheaditec.talsec.security.r1".length();
                                final int n47 = ((~"com.aheaditec.talsec.security.r1".length() | 0xFB29D7B9) & 0x1A244080) + (("com.aheaditec.talsec.security.r1".length() & 0xC0003) | 0x882203) ^ 0x1AAC6282;
                                final byte b4 = array[(n47 & n2) * 2 + (n47 ^ n2)];
                                final int n48 = ~"com.aheaditec.talsec.security.r1".length();
                                n4 = (short)((b4 & (0x8B85418E ^ ("com.aheaditec.talsec.security.r1".length() | 0x82840061) - (n48 | 0xA3E66AE5) + (B1.a((Class)r1.class, 0x21E66AE5 | n48) + ("com.aheaditec.talsec.security.r1".length() & 0x82840061)) + (("com.aheaditec.talsec.security.r1".length() & 0x83004100) | 0x9014110))) << (((~"com.aheaditec.talsec.security.r1".length() | 0xA11ABDE7) & 0x8626115) + (("com.aheaditec.talsec.security.r1".length() & 0x8785410) | 0x189C00) ^ 0x87AFD1D) | (length27 | n46) - (b3 | n46) + (a6 + (length26 & n46)));
                                final int n49 = ~"com.aheaditec.talsec.security.r1".length();
                                final int n50 = 0x8EA7BB41 ^ ((~n49 & 0xDE072D27) + n49 | 0x797D4FBC) - 2038255548 + (("com.aheaditec.talsec.security.r1".length() & 0x8A19240) | 0x8250B00);
                                final int n51 = -n2;
                                final int n52 = n51 | n50;
                                final byte b5 = array[n52 - n51 * 2 + (n50 ^ n51 ^ n52)];
                                final int n53 = ~"com.aheaditec.talsec.security.r1".length();
                                final int n54 = (0xF41909D4 | n53) - 1591672428 - (n53 | 0xF53909D4);
                                final int n55 = ("com.aheaditec.talsec.security.r1".length() & 0x1601008) | 0x10401868;
                                final int length28 = "com.aheaditec.talsec.security.r1".length();
                                final int length29 = "com.aheaditec.talsec.security.r1".length();
                                final int n56 = (~"com.aheaditec.talsec.security.r1".length() | 0xC3DB662F) & 0x20844001;
                                final int n57 = ("com.aheaditec.talsec.security.r1".length() & 0x20042840) | 0x2940;
                                final byte b6 = array[(0x20846942 ^ (n57 & n56) + (n56 | n57)) + n2];
                                final int length30 = "com.aheaditec.talsec.security.r1".length();
                                final int length31 = "com.aheaditec.talsec.security.r1".length();
                                final int length32 = "com.aheaditec.talsec.security.r1".length();
                                n5 = (short)((b5 & (0xB1611903 ^ (n55 | n54) - (length28 & ~n54 & n55) + (n55 & (n54 | length29)))) | (b6 & (((~length30 | 0x47DF7D9) & 0x4A0C04A9) + ((length31 & 0x4A801160) | 0xA0801940) ^ 0xEA8C1D16)) << (((0x6A0F8294 | ~length32 - length32 + length32) & 0x1AB35A6E) + (("com.aheaditec.talsec.security.r1".length() & 0xB1B458FA) | 0xE1040090) ^ 0xFBB75AF6));
                                final int n58 = ~"com.aheaditec.talsec.security.r1".length();
                                n6 = (0x2D2FD8AD ^ (0xAFE615E4 | n58) + 311432716 - (n58 | 0xBFF617EC) + (("com.aheaditec.talsec.security.r1".length() & 0x10500249) | 0xC0400841));
                                final int n59 = ~"com.aheaditec.talsec.security.r1".length();
                                final int length33 = "com.aheaditec.talsec.security.r1".length();
                                final int length34 = "com.aheaditec.talsec.security.r1".length();
                                final int n60 = ("com.aheaditec.talsec.security.r1".length() & 0xD0100010) | 0x833000A0;
                                final int n61 = -(0x540A0512 & (length33 & ~n59 & 0x56E9DAF) + 91135407 + n59 - ((n59 | length34) & 0x56E9DAF));
                                n7 = (0xD73A05B2 ^ (~n61 & n60) - (n61 & ~n60));
                                n12 = (~"com.aheaditec.talsec.security.r1".length() | 0xDFEFFFFF) + 806798471 + (("com.aheaditec.talsec.security.r1".length() & 0x28382801) | 0x9282829);
                                n13 = 1174056570 - n12;
                                n14 = -1174056571;
                                break Label_2858;
                            }
                            case -2038999444: {
                                final int n62 = ~"com.aheaditec.talsec.security.r1".length();
                                final int n63 = (("com.aheaditec.talsec.security.r1".length() & ~n62 & 0x2F85C3D8) + 797295576 + n62 - (("com.aheaditec.talsec.security.r1".length() | n62) & 0x2F85C3D8) & 0x9A04001) + (("com.aheaditec.talsec.security.r1".length() & 0x80200029) | 0x800000AC);
                                final int n64 = (short)((n4 << y1.a(n63 | 0x89A040A9, 2, -1985986391, n63)) + array3[((~"com.aheaditec.talsec.security.r1".length() | 0xBF452A29) & 0x4045F890) + (("com.aheaditec.talsec.security.r1".length() & 0x6020D290) | 0x28300240) ^ 0x6875FAD2]) ^ n4 + n6;
                                final int n65 = ~"com.aheaditec.talsec.security.r1".length();
                                final int length35 = "com.aheaditec.talsec.security.r1".length();
                                final int length36 = "com.aheaditec.talsec.security.r1".length();
                                final int length37 = "com.aheaditec.talsec.security.r1".length();
                                final short n66 = array3[((~"com.aheaditec.talsec.security.r1".length() | 0x4A6DD9E9) & 0x31422178) + (("com.aheaditec.talsec.security.r1".length() & 0x31032210) | 0x80894200) ^ 0xB1CB637B];
                                final int n67 = -(n4 >>> ((~((length35 | 0x255D135A | n65) - ((length36 & 0xDAA2ECA5) | n65)) & 0x3910D911) + ((length37 & 0x23183110) | 0x2282480) ^ 0x3B38FD94));
                                final int n68 = n67 | n66;
                                final int n69 = n68 - n67 * 2 + (n67 ^ n66 ^ n68);
                                final int n70 = -z1.a(n69 | ~n64, 2, n69 - n64, 2);
                                n5 = (short)O.a(n5, 3, -(N.a(n5, -4, 1, n70) | (n70 & 0x2)), 1);
                                final int n71 = (~"com.aheaditec.talsec.security.r1".length() | 0xDF39FDFE) + 1624126210;
                                final int n72 = ("com.aheaditec.talsec.security.r1".length() & 0x20C60649) | 0x401044A;
                                n4 = (short)(n4 - ((short)((n5 << (0x64CF374F ^ (n72 & n71) + (n71 | n72))) + array3[((~"com.aheaditec.talsec.security.r1".length() | 0xC40A2F76) & 0x9220045) + (("com.aheaditec.talsec.security.r1".length() & 0xD200031) | 0x14000030) ^ 0x1D220075]) ^ (n6 | n5) - ("com.aheaditec.talsec.security.r1".length() & ~n5 & n6) + (("com.aheaditec.talsec.security.r1".length() | n5) & n6) ^ (n5 >>> (((~"com.aheaditec.talsec.security.r1".length() | 0xFE323FD5) & 0xA4910442) + (("com.aheaditec.talsec.security.r1".length() & 0x836016) | 0x22E014) ^ 0xA4B3E453)) + array3[((~"com.aheaditec.talsec.security.r1".length() | 0xFE9977DC) & 0x314C5004) + (("com.aheaditec.talsec.security.r1".length() & 0x81C52010) | 0x808120D0) ^ 0xB1CD70D5]));
                                final int length38 = "com.aheaditec.talsec.security.r1".length();
                                final int n73 = ("com.aheaditec.talsec.security.r1".length() & 0x1812164E) | 0x10024046;
                                final int n74 = -((~length38 | 0xE76C8087) & 0x8B301688);
                                final int n75 = (~n74 & n73) * 2 - (n74 ^ n73);
                                n6 = (short)x1.a(0x64CD3706 & n75, 2, -1691170567 - n75, n6);
                                ++n7;
                                a2 = ((~"com.aheaditec.talsec.security.r1".length() | 0xC6AE4E15) & 0x18048CC) + (("com.aheaditec.talsec.security.r1".length() & 0x90000C9) | 0x8640001);
                                n11 = 1965034008;
                                break Label_3458;
                            }
                            case -2143294076: {
                                final int n76 = ~"com.aheaditec.talsec.security.r1".length();
                                if (n2 < n3) {
                                    final int n77 = ("com.aheaditec.talsec.security.r1".length() & 0x10001102) | 0x11001200;
                                    final int n78 = -((n76 | 0xA365F19A) - ((0xA365F098 | n76) ^ 0x20004192));
                                    n8 = ((~n78 & n77) * 2 - (n78 ^ n77) ^ 0xA529586B);
                                    continue;
                                }
                                a2 = ((n76 | 0xD3761F18) & 0x91010410) + (("com.aheaditec.talsec.security.r1".length() & 0x40010002) | 0x42900022);
                                n11 = -375509041;
                                break Label_3458;
                            }
                        }
                        n8 = (n16 ^ n17);
                        continue;
                    }
                    n8 = (n28 ^ n27);
                    continue;
                }
                n8 = (n12 & n14) * 2 + n13;
                continue;
            }
            n8 = (n11 ^ a2);
        }
    }
    
    public final void b() {
        s1 e;
        if ((e = this.e) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 74;
            array2[1] = -65;
            array2[2] = 38;
            array2[3] = -90;
            array2[4] = -47;
            array2[5] = -15;
            array2[6] = -66;
            array2[7] = -95;
            array2[8] = 64;
            a(array, new byte[] { 110, 50, 107, -16, -41, -14, -99, -70, 90 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            e = null;
        }
        e.a();
    }
    
    public final void c() {
        s1 e;
        if ((e = this.e) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 44;
            array2[1] = 26;
            array2[2] = -35;
            array2[3] = -102;
            array2[4] = -85;
            array2[5] = -125;
            array2[6] = 126;
            array2[7] = -25;
            array2[8] = -127;
            a(array, new byte[] { -16, -13, -7, -80, 118, 113, -1, -101, -6 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            e = null;
        }
        e.b();
    }
    
    public final ByteBuffer d() {
        t1 c;
        if ((c = this.c) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[11];
            array2[0] = -29;
            array2[1] = 56;
            array2[2] = 36;
            array2[3] = 89;
            array2[4] = -12;
            array2[5] = -102;
            array2[6] = 116;
            array2[7] = 25;
            array2[8] = 86;
            array2[9] = 56;
            array2[10] = -82;
            a(array, new byte[] { -21, -35, 95, 55, 40, 104, -48, -6, -62, -55, 123 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            c = null;
        }
        final ByteBuffer a = c.a();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[16];
        array4[0] = 117;
        array4[1] = -66;
        array4[2] = 38;
        array4[3] = -36;
        array4[4] = 64;
        array4[5] = -34;
        array4[6] = -88;
        array4[7] = -5;
        array4[8] = 56;
        array4[9] = 111;
        array4[10] = 120;
        array4[11] = 17;
        array4[12] = -122;
        array4[13] = 80;
        array4[14] = 81;
        array4[15] = 95;
        a(array3, new byte[] { 113, -114, -61, -75, -43, 47, 111, -82, 33, 53, 46, -52, 57, 84, 65, 123 });
        Intrinsics.checkNotNullExpressionValue((Object)a, new String(array3, StandardCharsets.UTF_8).intern());
        return a;
    }
    
    public final void e() {
        s1 e;
        if ((e = this.e) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 3;
            array2[1] = -13;
            array2[2] = 32;
            array2[3] = 2;
            array2[4] = -65;
            array2[5] = -107;
            array2[6] = -16;
            array2[7] = -50;
            array2[8] = 65;
            a(array, new byte[] { 42, 51, 13, 71, -38, 78, 9, 99, -67 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            e = null;
        }
        e.c();
        CoroutineScopeKt.cancel$default(this.f, (CancellationException)null, 1, (Object)null);
    }
    
    public static final class b
    {
        public b() {
        }
        
        public b(final DefaultConstructorMarker defaultConstructorMarker) {
        }
        
        public static void a(final byte[] array, final byte[] array2) {
            byte[] array3 = null;
            int n = 0;
            int n3 = 0;
            int n2 = n3 = 0;
            int n4 = -894652659;
            byte[] array4 = null;
        Label_0519:
            while (true) {
                final int n5 = (n4 & 0x1000000) * (n4 | 0x1000000) + (n4 & 0xFEFFFFFF) * (~n4 & 0x1000000);
                final int n6 = n4 >>> 8;
                final int n7 = n6 + n5 - (n6 & n5);
                final int n8 = (n7 ^ 0x56E7650F) + (n7 & 0x56E7650F) * 2;
                boolean b = true;
                final int n9 = 1;
                switch (n8 - 1434379843 + (~n8 & 0x557EE643) * 2) {
                    default: {
                        n4 = 196573321;
                        continue;
                    }
                    case 1888416065: {
                        final int n10 = array4.length % 4;
                        final long n11 = lcmp((long)n10, (long)1) >>> 31 & 0x1;
                        if (n11 != 0) {
                            n4 = 196573321;
                        }
                        else {
                            n4 = 1298988808;
                        }
                        n3 = n10;
                        if (n11 != 0) {
                            n3 = n10;
                            break;
                        }
                        continue;
                    }
                    case 835516413: {
                        final int length = array.length;
                        final int n12 = 0 - (0 - array.length % 4);
                        int n13 = n9;
                        if ((length ^ n12) - (~length & n12) * 2 <= 0) {
                            n13 = 0;
                        }
                        if (n13 != 0) {
                            n4 = 196573321;
                        }
                        else {
                            n4 = 145880015;
                        }
                        if (n13 != 0) {
                            n4 = -826922365;
                        }
                        array3 = array2;
                        array4 = array;
                        n2 = 0;
                        continue;
                    }
                    case 614184219: {
                        final int length2 = array4.length;
                        final int n14 = 0 - n;
                        final int a = N.a(n14, -4, 1, length2);
                        final int length3 = array4.length;
                        final byte b2 = array4[(length3 ^ n14) + (length3 & n14) * 2];
                        final int length4 = array4.length;
                        final int n15 = 0 - n14;
                        final byte b3 = array3[(~n15 & length4) * 2 - (length4 ^ n15)];
                        array4[L.a(0, (length2 & 0x2) | a, n14 * 3, 1)] = (byte)((byte)((byte)b3 + (byte)b2) - (byte)((byte)2 * (byte)(b3 & b2)));
                        final int n16 = (0xEBDA5001 | n) + (0x1425AFFE | n);
                        final long n17 = lcmp((long)n, (long)2) >>> 31 & 0x1;
                        if (n17 != 0) {
                            n4 = 196573321;
                        }
                        else {
                            n4 = 1298988808;
                        }
                        n3 = n16;
                        if (n17 != 0) {
                            n3 = n16;
                            break;
                        }
                        continue;
                    }
                    case 172635213: {
                        final int length5 = array4.length;
                        final int n18 = 0 - n3;
                        if (dcmpg((double)array3[(length5 ^ n18) + (length5 & n18) * 2], Double.NaN) <= -1) {
                            b = false;
                        }
                        if (b) {
                            n4 = -34715366;
                        }
                        else {
                            n4 = 196573321;
                        }
                        n = n3;
                        continue;
                    }
                    case -625567707: {
                        break Label_0519;
                    }
                    case -1882653318: {
                        final int n19 = n2 - 1 - (n2 | 0xFFFFFFFC);
                        final byte b4 = array3[n19];
                        final int n20 = (b4 & 0x1000000) * (b4 | 0x1000000) + (b4 & 0xFEFFFFFF) * (~b4 & 0x1000000);
                        final int n21 = n2 + 3 + (-1 - n2 | 0xFFFFFFFD);
                        final int n22 = array3[n21] & 0xFF;
                        final int n23 = n22 * (~n22 & 0x10000);
                        final int n24 = ~((n20 | (0x45BCA602 | ~n23)) - ((n23 & 0x45BCA602) | n20));
                        final int a2 = K.a(0x29123D34 & n2, n2, 1, 0x29123D35 & n2);
                        final int n25 = array3[a2] & 0xFF;
                        final int n26 = (~n24 & n25 * (~n25 & 0x100)) + n24;
                        final int n27 = n26 - 1 - (~(array3[n2] & 0xFF) | n26);
                        final byte b5 = array4[n19];
                        final int n28 = (b5 & 0x1000000) * (b5 | 0x1000000) + (0xFEFFFFFF & b5) * (~b5 & 0x1000000);
                        final int n29 = array4[n21] & 0xFF;
                        final int n30 = n29 * (~n29 & 0x10000);
                        final int n31 = ~((n28 | (~n30 | 0xE56F6087)) - ((n30 & 0xE56F6087) | n28));
                        final int n32 = array4[a2] & 0xFF;
                        final int n33 = n32 * (~n32 & 0x100);
                        final int n34 = array4[n2] & 0xFF;
                        final int n35 = (n33 + n31 - (n33 & n31) & ~n34) + n34;
                        final int n36 = n27 << (dcmpg((double)n27, Double.NaN) >>> 31);
                        final int n37 = n36 + n35 - (n36 & n35) * 2;
                        final int n38 = 659933421 - ((n37 & 0x2) | -1983400303 - n37);
                        array4[n2] = (byte)n38;
                        array4[a2] = (byte)(n38 >>> 8);
                        array4[n21] = (byte)(n38 >>> 16);
                        array4[n19] = (byte)(n38 >>> 24);
                        n2 = (n2 ^ 0x4) + (n2 & 0x4) * 2;
                        final int length6 = array4.length;
                        final int n39 = 0 - array4.length % 4;
                        final long n40 = lcmp((long)n2, (long)((length6 ^ n39) + (length6 & n39) * 2)) >>> 31 & 0x1;
                        if (n40 != 0) {
                            n4 = 196573321;
                        }
                        else {
                            n4 = 145880015;
                        }
                        if (n40 == 0) {
                            continue;
                        }
                        n4 = -826922365;
                        continue;
                    }
                    case -1970406716: {
                        final int length7 = array4.length;
                        final int n41 = 0 - n;
                        final int n42 = ~n41;
                        final int n43 = (length7 | n41) - (0x23ED3929 & n42 & length7) + ((n41 | 0x23ED3929) & length7);
                        final byte b6 = array3[n43];
                        final int length8 = array4.length;
                        final byte b7 = array3[(length8 ^ n42) + (n41 | length8) * 2 + 1];
                        final int n44 = (byte)0 - (byte)b6;
                        array3[n43] = (byte)((byte)((byte)2 * (byte)(b7 & ~n44)) - (byte)(b7 ^ n44));
                        n4 = -34715366;
                        continue;
                    }
                }
                n4 = -518432968;
            }
        }
        
        public final r1 a(final Context context, final TalsecConfig talsecConfig, final TalsecMode talsecMode) {
            synchronized (this) {
                final byte[] array2;
                final byte[] array = array2 = new byte[7];
                array2[0] = 52;
                array2[1] = 3;
                array2[2] = 87;
                array2[3] = -118;
                array2[4] = 21;
                array2[5] = 82;
                array2[6] = 93;
                a(array, new byte[] { 51, 94, -73, 92, 112, 42, 41, 110 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullParameter((Object)context, new String(array, utf_8).intern());
                final byte[] array4;
                final byte[] array3 = array4 = new byte[6];
                array4[0] = 84;
                array4[1] = -70;
                array4[2] = 14;
                array4[3] = 97;
                array4[4] = 85;
                array4[5] = -9;
                a(array3, new byte[] { 83, -25, -18, -87, 60, -112, -44, 25 });
                Intrinsics.checkNotNullParameter((Object)talsecConfig, new String(array3, utf_8).intern());
                final byte[] array6;
                final byte[] array5 = array6 = new byte[4];
                array6[0] = -64;
                array6[1] = 110;
                array6[2] = 18;
                array6[3] = -46;
                a(array5, new byte[] { -47, 51, -60, 21, -32, -54, -100, 79 });
                Intrinsics.checkNotNullParameter((Object)talsecMode, new String(array5, utf_8).intern());
                if (r1.h == null) {
                    r1.h = new r1(context, talsecConfig, talsecMode);
                }
                r1 h;
                if ((h = r1.h) == null) {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[8];
                    array8[0] = -17;
                    array8[1] = 125;
                    array8[2] = -101;
                    array8[3] = -121;
                    array8[4] = 31;
                    array8[5] = -77;
                    array8[6] = 103;
                    array8[7] = -101;
                    a(array7, new byte[] { -30, 33, 126, 81, 26, -17, -78, 92 });
                    Intrinsics.throwUninitializedPropertyAccessException(new String(array7, utf_8).intern());
                    h = null;
                }
                return h;
            }
        }
    }
}
