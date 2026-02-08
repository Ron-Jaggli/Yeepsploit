package com.aheaditec.talsec.security;

import java.util.concurrent.Future;
import com.aheaditec.talsec_security.security.api.Talsec;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import kotlinx.coroutines.Dispatchers;
import java.nio.charset.Charset;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import com.aheaditec.talsec_security.security.api.TalsecConfig;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.concurrent.ScheduledFuture;
import kotlinx.coroutines.CoroutineScope;

public final class s1 implements Z
{
    public static final b h;
    public final CoroutineScope a;
    public i1 b;
    public R0 c;
    public E1 d;
    public l1 e;
    public G1 f;
    public ScheduledFuture<?> g;
    
    static {
        h = new b(null);
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = 81;
        array2[1] = -54;
        array2[2] = 91;
        array2[3] = -67;
        array2[4] = 126;
        array2[5] = 2;
        array2[6] = 97;
        array2[7] = 67;
        a(array, new byte[] { 16, -103, -66, -34, -60, 90, 33, 100 });
        System.loadLibrary(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public s1(final Context context, final u1 u1, final String s, final w0 w0, final r0 r0, final TalsecConfig talsecConfig, final CoroutineScope a) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = -32;
        array2[1] = -76;
        array2[2] = -29;
        array2[3] = -112;
        array2[4] = -123;
        array2[5] = 109;
        array2[6] = 2;
        a(array, new byte[] { 72, 118, 21, -32, 32, 120, -77, -52 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)context, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = 126;
        array4[1] = -93;
        array4[2] = 87;
        array4[3] = -78;
        array4[4] = -90;
        array4[5] = -77;
        a(array3, new byte[] { 96, -63, -55, -3, -58, -107, 15, -118 });
        Intrinsics.checkNotNullParameter((Object)u1, new String(array3, utf_8).intern());
        final byte[] array6;
        final byte[] array5 = array6 = new byte[11];
        array6[0] = -27;
        array6[1] = 36;
        array6[2] = -57;
        array6[3] = -10;
        array6[4] = -16;
        array6[5] = 124;
        array6[6] = -31;
        array6[7] = -100;
        array6[8] = -14;
        array6[9] = 126;
        array6[10] = -108;
        a(array5, new byte[] { 93, -25, 12, -105, 110, -23, 14, -97, 25, 122, -17 });
        Intrinsics.checkNotNullParameter((Object)w0, new String(array5, utf_8).intern());
        final byte[] array8;
        final byte[] array7 = array8 = new byte[11];
        array8[0] = -45;
        array8[1] = 125;
        array8[2] = 105;
        array8[3] = 100;
        array8[4] = 26;
        array8[5] = -7;
        array8[6] = 86;
        array8[7] = -44;
        array8[8] = 117;
        array8[9] = -6;
        array8[10] = -84;
        a(array7, new byte[] { -115, -53, -109, 19, -114, 18, -7, 124, -19, -70, -58 });
        Intrinsics.checkNotNullParameter((Object)r0, new String(array7, utf_8).intern());
        final byte[] array10;
        final byte[] array9 = array10 = new byte[12];
        array10[0] = -46;
        array10[1] = 28;
        array10[2] = 86;
        array10[3] = -15;
        array10[4] = -89;
        array10[5] = -47;
        array10[6] = -105;
        array10[7] = -63;
        array10[8] = 79;
        array10[9] = -85;
        array10[10] = -61;
        array10[11] = -119;
        a(array9, new byte[] { 30, 31, 109, 51, -69, 0, -107, 37, 27, -74, -24, 58 });
        Intrinsics.checkNotNullParameter((Object)talsecConfig, new String(array9, utf_8).intern());
        final byte[] array12;
        final byte[] array11 = array12 = new byte[5];
        array12[0] = -70;
        array12[1] = 10;
        array12[2] = -101;
        array12[3] = -28;
        array12[4] = 56;
        a(array11, new byte[] { 125, 93, 4, -32, -19, -70, 47, -58 });
        Intrinsics.checkNotNullParameter((Object)a, new String(array11, utf_8).intern());
        BuildersKt.launch$default(this.a = a, (CoroutineContext)null, (CoroutineStart)null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, context, w0, s, r0, talsecConfig, u1, null) {
            public int a;
            public final s1 b;
            public final Context c;
            public final w0 d;
            public final String e;
            public final r0 f;
            public final TalsecConfig g;
            public final u1 h;
            
            public static void a(final byte[] array, final byte[] array2) {
                final int n = ~"com.aheaditec.talsec.security.s1$a".length();
                int n2 = (~(("com.aheaditec.talsec.security.s1$a".length() | 0x42FDD19 | n) - (n | ("com.aheaditec.talsec.security.s1$a".length() & 0xFBD022E6))) & 0x8A042208) + (("com.aheaditec.talsec.security.s1$a".length() & 0x400C0008) | 0x41280820) ^ 0xCB2C2A28;
                final int a = B1.a((Class)s1$a.class, -1);
                int n3 = (a | 0x954FECC5) - ((0x14DECC5 | a) ^ 0x9402A001) + (("com.aheaditec.talsec.security.s1$a".length() | 0x6BFDFFFD) - 1811808253 | 0x20081002) ^ 0xB40AB003;
                int n4 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xDDA24923) & 0x10824042) + (("com.aheaditec.talsec.security.s1$a".length() & 0x9040) | 0x40019001) ^ 0x5083D043;
                int n5 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xBAFDFD77) & 0x68A830CC) + (("com.aheaditec.talsec.security.s1$a".length() & 0x4003889A) | 0x80138C12) ^ 0xE8BBBCDE;
                final int length = "com.aheaditec.talsec.security.s1$a".length();
                final int length2 = "com.aheaditec.talsec.security.s1$a".length();
                int n6 = 0x9B7D9791 ^ ((0x1B101411 & length2) ^ 0x80400590) + (length2 & 0x410) + ((~length | 0xE06FE760) & 0x1B3D9201);
                int n7 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xFFEFBFFF) + 689325073 + (("com.aheaditec.talsec.security.s1$a".length() & 0x82104800) | 0x824008A8) ^ 0xAB564CB8;
                final int length3 = "com.aheaditec.talsec.security.s1$a".length();
                final int length4 = "com.aheaditec.talsec.security.s1$a".length();
                int n8 = ((~length3 | 0x5776618) & 0xC02C8254) + (0x905020 | (length4 | 0xC088C064) - (length4 ^ 0xC088C064)) ^ 0x58FD1772;
                short[] array3 = null;
            Label_1119:
                while (true) {
                    int a2 = 0;
                    int n11 = 0;
                    Label_3405: {
                        int n12 = 0;
                        int n13 = 0;
                        int n14 = 0;
                        Label_2805: {
                            int n27 = 0;
                            int n28 = 0;
                            Label_2053: {
                                int n16 = 0;
                                int n17 = 0;
                                switch (n8) {
                                    default: {
                                        final int n9 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int n10 = (0xED53ECFC | n9) + 45165696 - (n9 | 0xEFF3ECFC);
                                        a2 = O.a(n10, 3, -N.a(n10, -4, 1, ("com.aheaditec.talsec.security.s1$a".length() & 0x2A00020) | 0x94020220), 1);
                                        n11 = -361272203;
                                        break Label_3405;
                                    }
                                    case 2093236949: {
                                        if (n7 < (((~"com.aheaditec.talsec.security.s1$a".length() | 0xDB3AB245) & 0x4DB02E10) + (("com.aheaditec.talsec.security.s1$a".length() & 0x4800D19) | 0x2005010D) ^ 0x6DB52F3D)) {
                                            n12 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0x4D5991B8) & 0x21320709) + (("com.aheaditec.talsec.security.s1$a".length() & 0x34222601) | 0x14002004);
                                            n13 = -1287294623 - n12;
                                            n14 = 1287294622;
                                            break Label_2805;
                                        }
                                        final int n15 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        n16 = (0x4411012E & -1207265904 + n15 + (-n15 - 1 | 0x47F56A70)) + (("com.aheaditec.talsec.security.s1$a".length() & 0x4D110460) | 0x9000440);
                                        n17 = 612868558;
                                        break;
                                    }
                                    case 1771480224: {
                                        array[(((~"com.aheaditec.talsec.security.s1$a".length() | 0x422FD499) & 0x4A01800A) + (("com.aheaditec.talsec.security.s1$a".length() & 0x9000502) | 0x5082500) ^ 0x4F09A50A) + n2] = (byte)((((~"com.aheaditec.talsec.security.s1$a".length() | 0x5F9A85FE) & 0x1808350) + (("com.aheaditec.talsec.security.s1$a".length() | 0xFFEBFDFD) + 1311235 | 0x801400A2) ^ 0x8194830D) & n4);
                                        final int length5 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length6 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length7 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length8 = "com.aheaditec.talsec.security.s1$a".length();
                                        array[(((~length5 | 0xAD39FB88) & 0x2A212880) + ((length6 & 0x43020008) | 0x51428008) ^ 0x7B63A889) + n2] = (byte)(n4 >> (((~length7 | 0x15E46274) & 0x20B53110) + (length8 + 558960896 - (length8 | 0x21511100) | 0x1428004) ^ 0x21F7B11C) & (((~"com.aheaditec.talsec.security.s1$a".length() | 0x7DF43DE4) & 0x3D300832) + (("com.aheaditec.talsec.security.s1$a".length() & 0x80101A) | 0x82174D) ^ 0x3DB21F80));
                                        final int n18 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0x2AA0B538) & 0x8230514) + (("com.aheaditec.talsec.security.s1$a".length() & 0x30024) | 0x801010E0);
                                        final int a3 = A1.a(~n18 | 0x883315F6, 2, -2009917962 - n18, 2, n2);
                                        final int length9 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length10 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n19 = ~((length10 & 0x38B80309) + 276825601 - (length10 & 0x10800201));
                                        final int n20 = -((~length9 | 0xC3C2F477) & 0x2878811C);
                                        array[a3] = (byte)((w1.a(~n20, n19, 2, n19 + n20 + 1) ^ 0x38F887E2) & n5);
                                        final int length11 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length12 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n21 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int a4 = B1.a((Class)s1$a.class, 0x4763FDFC | n21);
                                        final int length13 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length14 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length15 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length16 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n22 = ("com.aheaditec.talsec.security.s1$a".length() & 0x20884062) | 0xAA028042;
                                        final int n23 = -((~length16 | 0x5F73B59C) & 0x55C844A4);
                                        array[(((~length11 | 0xBF552BF4) & 0x1A230910) + ((length12 & 0x4228004) | 0x84048405) ^ 0x9E278D16) + n2] = (byte)(n5 >> (0x7CBDC0FA ^ (length14 | 0x2831C0E0) - (n21 | 0x6F73FDFC) + (a4 + (length13 & 0x2831C0E0)) + ((length15 & 0x68940010) | 0x548C0012)) & (0xFFCAC419 ^ (~n23 & n22) - (n23 & ~n22)));
                                        n2 += 4;
                                        n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xF5BFD72F) & 0x13002210) + (("com.aheaditec.talsec.security.s1$a".length() & 0x2002010) | 0x21402);
                                        n17 = -1824662634;
                                        break;
                                    }
                                    case 1734050766: {
                                        final int n24 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        if (n2 > 0) {
                                            final int length17 = "com.aheaditec.talsec.security.s1$a".length();
                                            n16 = ((n24 | 0xEFFADC8E) & 0x10D1006A) + (0xA086800 | length17 + 402735200 - (length17 | 0x18014060));
                                            n17 = -115901203;
                                            break;
                                        }
                                        final int n25 = ("com.aheaditec.talsec.security.s1$a".length() & 0x1120000) | 0x21004004;
                                        final int n26 = -((n24 | 0x5A0DDFDD) & 0x18120300);
                                        n27 = (~n26 & n25) - (n26 & ~n25);
                                        n28 = 2001041846;
                                        break Label_2053;
                                    }
                                    case 1314339506: {
                                        break Label_1119;
                                    }
                                    case 998066383: {
                                        n2 = (((B1.a((Class)s1$a.class, -1) | 0x12B95885) & 0x16208A48) + (("com.aheaditec.talsec.security.s1$a".length() | 0xFBFF7DA7) + 67142233 | 0x89000110) ^ 0x9F208B58);
                                        n3 = array.length - array.length % (((~"com.aheaditec.talsec.security.s1$a".length() | 0x15DACEF5) & 0x501E1A02) + (("com.aheaditec.talsec.security.s1$a".length() & 0xC4049063) | 0x84008061) ^ 0xD41E9A67);
                                        n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xAEF59C61) & 0x2EC1453) + (("com.aheaditec.talsec.security.s1$a".length() & 0x91180012) | 0xB9102A00);
                                        n17 = 1002689495;
                                        break;
                                    }
                                    case 974072829: {
                                        final int length18 = array.length;
                                        final int length19 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n29 = ("com.aheaditec.talsec.security.s1$a".length() & 0xF006550) | 0x65003700;
                                        final int n30 = -((~length19 | 0x65FE9CA7) & 0xA2648F6);
                                        n2 = length18 % (0x6F267FF2 ^ (~n30 & n29) - (n30 & ~n29));
                                        n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0x3B134AC3) & 0x820C1403) + (("com.aheaditec.talsec.security.s1$a".length() & 0x900C5408) | 0x11004008);
                                        n17 = -195569723;
                                        break;
                                    }
                                    case 766056152: {
                                        final int length20 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length21 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n31 = length21 + 84675108 - (length21 | 0x50C0A24);
                                        if (n2 < (0x6DCD8F6B ^ (~n31 & 0x24440D24) + n31 + ((~length20 | 0xCAF5A54F) & 0x4989824B))) {
                                            final int n32 = (~"com.aheaditec.talsec.security.s1$a".length() | 0x6FFB14D6) & 0x72014033;
                                            final int n33 = ("com.aheaditec.talsec.security.s1$a".length() & 0x10025821) | 0xA1888;
                                            n16 = M.a(n32 | n33, 2, ~n32 ^ n33, 1);
                                            n17 = -717449014;
                                            break;
                                        }
                                        n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xA7E82FDE) & 0xA0612419) + (("com.aheaditec.talsec.security.s1$a".length() & 0x40094861) | 0x50084862);
                                        n17 = -887872332;
                                        break;
                                    }
                                    case -473033593: {
                                        final int length22 = array.length;
                                        final int n34 = -n2;
                                        final int n35 = -length22;
                                        final int n36 = n35 | n34;
                                        final byte b = array[array.length - n2];
                                        final int length23 = "com.aheaditec.talsec.security.s1$a".length();
                                        array[n36 - n35 * 2 + (n35 ^ n34 ^ n36)] = (byte)(b ^ array2[n2 % (((0xCB9E47BD | length23 - 1 - length23 * 2) & 0x58D38068) + (("com.aheaditec.talsec.security.s1$a".length() & 0x10618843) | 0x21242803) ^ 0x79F7A863)]);
                                        --n2;
                                        final int a5 = B1.a((Class)s1$a.class, -1);
                                        final int n37 = "com.aheaditec.talsec.security.s1$a".length() & 0x400C4082;
                                        n16 = J.a(n37, -n37 - 1 | 0xEFFDFB7C, 268567684, (a5 | 0x6D1BD13) & 0x468D5000);
                                        n17 = 836032333;
                                        break;
                                    }
                                    case -1489518479: {
                                        final int length24 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n38 = (0x85A08468 & 516782023 - length24 + (-(-1 - length24) - 1 | 0xE1328838)) + (("com.aheaditec.talsec.security.s1$a".length() & 0xC121C028) | 0x40014001) ^ 0xC5A1C46B;
                                        final int n39 = array2[(~n2 & n38) * (~n38 & n2) + (n38 & n2) * (n38 | n2)] & (((~"com.aheaditec.talsec.security.s1$a".length() | 0x8FB561CA) & 0xD4011A85) + (("com.aheaditec.talsec.security.s1$a".length() & 0x50101A05) | 0x20900108) ^ 0xF4911B72);
                                        final int n40 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int n41 = ("com.aheaditec.talsec.security.s1$a".length() & 0x2203110) | 0x200D300;
                                        final int n42 = -(0x4622098 & (~n40 & 0x965780AA) + n40);
                                        final byte b2 = array2[(0x662F39A ^ (~n42 & n41) * 2 - (n42 ^ n41)) * n2 + ((B1.a((Class)s1$a.class, -1) | 0xFFF7DFFF) + 67641369 + (("com.aheaditec.talsec.security.s1$a".length() & 0x82042) | 0x642) ^ 0x408265B)];
                                        final int n43 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int n44 = (b2 & ((0x279022C0 & n43 + 1314070430 - (n43 & 0x4E531F9E)) + (("com.aheaditec.talsec.security.s1$a".length() & 0x31C02044) | 0x1040040C) ^ 0x37D02633)) << ((B1.a((Class)s1$a.class, -1) | 0xFDFFFFFE) + 1107366402 + (("com.aheaditec.talsec.security.s1$a".length() & 0x82000041) | 0x80002140) ^ 0xC2013349);
                                        array3[n2] = (short)((n44 ^ n39) + (n39 & n44));
                                        ++n2;
                                        n16 = ((B1.a((Class)s1$a.class, -1) | 0xF60B90CE) & 0x4505AC40) + (("com.aheaditec.talsec.security.s1$a".length() & 0x9843D10) | 0x88801110);
                                        n17 = -533943416;
                                        break;
                                    }
                                    case -1740520186: {
                                        array3 = new short[((~"com.aheaditec.talsec.security.s1$a".length() | 0xE92FC1C9) & 0x61C8445) + (("com.aheaditec.talsec.security.s1$a".length() & 0x6500624) | 0x401230) ^ 0x65C9671];
                                        n2 = (((~"com.aheaditec.talsec.security.s1$a".length() | 0xFFA3E21F) & 0x49804EA1) + (("com.aheaditec.talsec.security.s1$a".length() & 0x30401CA0) | 0x30419100) ^ 0x79C1DFA1);
                                        final int length25 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n45 = "com.aheaditec.talsec.security.s1$a".length() & 0x10006009;
                                        n27 = ("com.aheaditec.talsec.security.s1$a".length() & ~n45 & 0x406008) + 4218888 + n45 - ((n45 | "com.aheaditec.talsec.security.s1$a".length()) & 0x406008) + ((~length25 | 0x649DBA54) & 0x34011001);
                                        n28 = 434661073;
                                        break Label_2053;
                                    }
                                    case -1809249287: {
                                        final byte b3 = array[(((~"com.aheaditec.talsec.security.s1$a".length() | 0x49851A55) & 0x7816F4A) + (("com.aheaditec.talsec.security.s1$a".length() & 0x2E24650A) | 0x28340001) ^ 0x2FB56F4B) + n2];
                                        final int n46 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xFF938BDA) & 0x18044242) + (("com.aheaditec.talsec.security.s1$a".length() & 0x20944030) | 0x20908030) ^ 0x3894C28D;
                                        final int a6 = B1.a((Class)s1$a.class, (int)b3);
                                        final int length26 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length27 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n47 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xFB29D7B9) & 0x1A244080) + (("com.aheaditec.talsec.security.s1$a".length() & 0xC0003) | 0x882203) ^ 0x1AAC6282;
                                        final byte b4 = array[(n47 & n2) * 2 + (n47 ^ n2)];
                                        final int n48 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        n4 = (short)((b4 & (0x8B85418E ^ ("com.aheaditec.talsec.security.s1$a".length() | 0x82840061) - (n48 | 0xA3E66AE5) + (B1.a((Class)s1$a.class, 0x21E66AE5 | n48) + ("com.aheaditec.talsec.security.s1$a".length() & 0x82840061)) + (("com.aheaditec.talsec.security.s1$a".length() & 0x83004100) | 0x9014110))) << (((~"com.aheaditec.talsec.security.s1$a".length() | 0xA11ABDE7) & 0x8626115) + (("com.aheaditec.talsec.security.s1$a".length() & 0x8785410) | 0x189C00) ^ 0x87AFD1D) | (length27 | n46) - (b3 | n46) + (a6 + (length26 & n46)));
                                        final int n49 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int n50 = 0x8EA7BB41 ^ ((~n49 & 0xDE072D27) + n49 | 0x797D4FBC) - 2038255548 + (("com.aheaditec.talsec.security.s1$a".length() & 0x8A19240) | 0x8250B00);
                                        final int n51 = -n2;
                                        final int n52 = n51 | n50;
                                        final byte b5 = array[n52 - n51 * 2 + (n50 ^ n51 ^ n52)];
                                        final int n53 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int n54 = (0xF41909D4 | n53) - 1591672428 - (n53 | 0xF53909D4);
                                        final int n55 = ("com.aheaditec.talsec.security.s1$a".length() & 0x1601008) | 0x10401868;
                                        final int length28 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length29 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n56 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xC3DB662F) & 0x20844001;
                                        final int n57 = ("com.aheaditec.talsec.security.s1$a".length() & 0x20042840) | 0x2940;
                                        final byte b6 = array[(0x20846942 ^ (n57 & n56) + (n56 | n57)) + n2];
                                        final int length30 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length31 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length32 = "com.aheaditec.talsec.security.s1$a".length();
                                        n5 = (short)((b5 & (0xB1611903 ^ (n55 | n54) - (length28 & ~n54 & n55) + (n55 & (n54 | length29)))) | (b6 & (((~length30 | 0x47DF7D9) & 0x4A0C04A9) + ((length31 & 0x4A801160) | 0xA0801940) ^ 0xEA8C1D16)) << (((0x6A0F8294 | ~length32 - length32 + length32) & 0x1AB35A6E) + (("com.aheaditec.talsec.security.s1$a".length() & 0xB1B458FA) | 0xE1040090) ^ 0xFBB75AF6));
                                        final int n58 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        n6 = (0x2D2FD8AD ^ (0xAFE615E4 | n58) + 311432716 - (n58 | 0xBFF617EC) + (("com.aheaditec.talsec.security.s1$a".length() & 0x10500249) | 0xC0400841));
                                        final int n59 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int length33 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length34 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n60 = ("com.aheaditec.talsec.security.s1$a".length() & 0xD0100010) | 0x833000A0;
                                        final int n61 = -(0x540A0512 & (length33 & ~n59 & 0x56E9DAF) + 91135407 + n59 - ((n59 | length34) & 0x56E9DAF));
                                        n7 = (0xD73A05B2 ^ (~n61 & n60) - (n61 & ~n60));
                                        n12 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xDFEFFFFF) + 806798471 + (("com.aheaditec.talsec.security.s1$a".length() & 0x28382801) | 0x9282829);
                                        n13 = 1174056570 - n12;
                                        n14 = -1174056571;
                                        break Label_2805;
                                    }
                                    case -2038999444: {
                                        final int n62 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int n63 = (("com.aheaditec.talsec.security.s1$a".length() & ~n62 & 0x2F85C3D8) + 797295576 + n62 - (("com.aheaditec.talsec.security.s1$a".length() | n62) & 0x2F85C3D8) & 0x9A04001) + (("com.aheaditec.talsec.security.s1$a".length() & 0x80200029) | 0x800000AC);
                                        final int n64 = (short)((n4 << y1.a(n63 | 0x89A040A9, 2, -1985986391, n63)) + array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0xBF452A29) & 0x4045F890) + (("com.aheaditec.talsec.security.s1$a".length() & 0x6020D290) | 0x28300240) ^ 0x6875FAD2]) ^ n4 + n6;
                                        final int n65 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        final int length35 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length36 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int length37 = "com.aheaditec.talsec.security.s1$a".length();
                                        final short n66 = array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0x4A6DD9E9) & 0x31422178) + (("com.aheaditec.talsec.security.s1$a".length() & 0x31032210) | 0x80894200) ^ 0xB1CB637B];
                                        final int n67 = -(n4 >>> ((~((length35 | 0x255D135A | n65) - ((length36 & 0xDAA2ECA5) | n65)) & 0x3910D911) + ((length37 & 0x23183110) | 0x2282480) ^ 0x3B38FD94));
                                        final int n68 = n67 | n66;
                                        final int n69 = n68 - n67 * 2 + (n67 ^ n66 ^ n68);
                                        final int n70 = -z1.a(n69 | ~n64, 2, n69 - n64, 2);
                                        n5 = (short)O.a(n5, 3, -(N.a(n5, -4, 1, n70) | (n70 & 0x2)), 1);
                                        final int n71 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xDF39FDFE) + 1624126210;
                                        final int n72 = ("com.aheaditec.talsec.security.s1$a".length() & 0x20C60649) | 0x401044A;
                                        n4 = (short)(n4 - ((short)((n5 << (0x64CF374F ^ (n72 & n71) + (n71 | n72))) + array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0xC40A2F76) & 0x9220045) + (("com.aheaditec.talsec.security.s1$a".length() & 0xD200031) | 0x14000030) ^ 0x1D220075]) ^ (n6 | n5) - ("com.aheaditec.talsec.security.s1$a".length() & ~n5 & n6) + (("com.aheaditec.talsec.security.s1$a".length() | n5) & n6) ^ (n5 >>> (((~"com.aheaditec.talsec.security.s1$a".length() | 0xFE323FD5) & 0xA4910442) + (("com.aheaditec.talsec.security.s1$a".length() & 0x836016) | 0x22E014) ^ 0xA4B3E453)) + array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0xFE9977DC) & 0x314C5004) + (("com.aheaditec.talsec.security.s1$a".length() & 0x81C52010) | 0x808120D0) ^ 0xB1CD70D5]));
                                        final int length38 = "com.aheaditec.talsec.security.s1$a".length();
                                        final int n73 = ("com.aheaditec.talsec.security.s1$a".length() & 0x1812164E) | 0x10024046;
                                        final int n74 = -((~length38 | 0xE76C8087) & 0x8B301688);
                                        final int n75 = (~n74 & n73) * 2 - (n74 ^ n73);
                                        n6 = (short)x1.a(0x64CD3706 & n75, 2, -1691170567 - n75, n6);
                                        ++n7;
                                        a2 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xC6AE4E15) & 0x18048CC) + (("com.aheaditec.talsec.security.s1$a".length() & 0x90000C9) | 0x8640001);
                                        n11 = 1965034008;
                                        break Label_3405;
                                    }
                                    case -2143294076: {
                                        final int n76 = ~"com.aheaditec.talsec.security.s1$a".length();
                                        if (n2 < n3) {
                                            final int n77 = ("com.aheaditec.talsec.security.s1$a".length() & 0x10001102) | 0x11001200;
                                            final int n78 = -((n76 | 0xA365F19A) - ((0xA365F098 | n76) ^ 0x20004192));
                                            n8 = ((~n78 & n77) * 2 - (n78 ^ n77) ^ 0xA529586B);
                                            continue;
                                        }
                                        a2 = ((n76 | 0xD3761F18) & 0x91010410) + (("com.aheaditec.talsec.security.s1$a".length() & 0x40010002) | 0x42900022);
                                        n11 = -375509041;
                                        break Label_3405;
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
            
            public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                return ((s1$a)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Continuation<Unit> create(final Object o, final Continuation<?> continuation) {
                return (Continuation<Unit>)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation) {
                    public int a;
                    public final s1 b;
                    public final Context c;
                    public final w0 d;
                    public final String e;
                    public final r0 f;
                    public final TalsecConfig g;
                    public final u1 h;
                    
                    public static void a(final byte[] array, final byte[] array2) {
                        final int n = ~"com.aheaditec.talsec.security.s1$a".length();
                        int n2 = (~(("com.aheaditec.talsec.security.s1$a".length() | 0x42FDD19 | n) - (n | ("com.aheaditec.talsec.security.s1$a".length() & 0xFBD022E6))) & 0x8A042208) + (("com.aheaditec.talsec.security.s1$a".length() & 0x400C0008) | 0x41280820) ^ 0xCB2C2A28;
                        final int a = B1.a((Class)s1$a.class, -1);
                        int n3 = (a | 0x954FECC5) - ((0x14DECC5 | a) ^ 0x9402A001) + (("com.aheaditec.talsec.security.s1$a".length() | 0x6BFDFFFD) - 1811808253 | 0x20081002) ^ 0xB40AB003;
                        int n4 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xDDA24923) & 0x10824042) + (("com.aheaditec.talsec.security.s1$a".length() & 0x9040) | 0x40019001) ^ 0x5083D043;
                        int n5 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xBAFDFD77) & 0x68A830CC) + (("com.aheaditec.talsec.security.s1$a".length() & 0x4003889A) | 0x80138C12) ^ 0xE8BBBCDE;
                        final int length = "com.aheaditec.talsec.security.s1$a".length();
                        final int length2 = "com.aheaditec.talsec.security.s1$a".length();
                        int n6 = 0x9B7D9791 ^ ((0x1B101411 & length2) ^ 0x80400590) + (length2 & 0x410) + ((~length | 0xE06FE760) & 0x1B3D9201);
                        int n7 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xFFEFBFFF) + 689325073 + (("com.aheaditec.talsec.security.s1$a".length() & 0x82104800) | 0x824008A8) ^ 0xAB564CB8;
                        final int length3 = "com.aheaditec.talsec.security.s1$a".length();
                        final int length4 = "com.aheaditec.talsec.security.s1$a".length();
                        int n8 = ((~length3 | 0x5776618) & 0xC02C8254) + (0x905020 | (length4 | 0xC088C064) - (length4 ^ 0xC088C064)) ^ 0x58FD1772;
                        short[] array3 = null;
                    Label_1119:
                        while (true) {
                            int a2 = 0;
                            int n11 = 0;
                            Label_3405: {
                                int n12 = 0;
                                int n13 = 0;
                                int n14 = 0;
                                Label_2805: {
                                    int n27 = 0;
                                    int n28 = 0;
                                    Label_2053: {
                                        int n16 = 0;
                                        int n17 = 0;
                                        switch (n8) {
                                            default: {
                                                final int n9 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int n10 = (0xED53ECFC | n9) + 45165696 - (n9 | 0xEFF3ECFC);
                                                a2 = O.a(n10, 3, -N.a(n10, -4, 1, ("com.aheaditec.talsec.security.s1$a".length() & 0x2A00020) | 0x94020220), 1);
                                                n11 = -361272203;
                                                break Label_3405;
                                            }
                                            case 2093236949: {
                                                if (n7 < (((~"com.aheaditec.talsec.security.s1$a".length() | 0xDB3AB245) & 0x4DB02E10) + (("com.aheaditec.talsec.security.s1$a".length() & 0x4800D19) | 0x2005010D) ^ 0x6DB52F3D)) {
                                                    n12 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0x4D5991B8) & 0x21320709) + (("com.aheaditec.talsec.security.s1$a".length() & 0x34222601) | 0x14002004);
                                                    n13 = -1287294623 - n12;
                                                    n14 = 1287294622;
                                                    break Label_2805;
                                                }
                                                final int n15 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                n16 = (0x4411012E & -1207265904 + n15 + (-n15 - 1 | 0x47F56A70)) + (("com.aheaditec.talsec.security.s1$a".length() & 0x4D110460) | 0x9000440);
                                                n17 = 612868558;
                                                break;
                                            }
                                            case 1771480224: {
                                                array[(((~"com.aheaditec.talsec.security.s1$a".length() | 0x422FD499) & 0x4A01800A) + (("com.aheaditec.talsec.security.s1$a".length() & 0x9000502) | 0x5082500) ^ 0x4F09A50A) + n2] = (byte)((((~"com.aheaditec.talsec.security.s1$a".length() | 0x5F9A85FE) & 0x1808350) + (("com.aheaditec.talsec.security.s1$a".length() | 0xFFEBFDFD) + 1311235 | 0x801400A2) ^ 0x8194830D) & n4);
                                                final int length5 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length6 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length7 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length8 = "com.aheaditec.talsec.security.s1$a".length();
                                                array[(((~length5 | 0xAD39FB88) & 0x2A212880) + ((length6 & 0x43020008) | 0x51428008) ^ 0x7B63A889) + n2] = (byte)(n4 >> (((~length7 | 0x15E46274) & 0x20B53110) + (length8 + 558960896 - (length8 | 0x21511100) | 0x1428004) ^ 0x21F7B11C) & (((~"com.aheaditec.talsec.security.s1$a".length() | 0x7DF43DE4) & 0x3D300832) + (("com.aheaditec.talsec.security.s1$a".length() & 0x80101A) | 0x82174D) ^ 0x3DB21F80));
                                                final int n18 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0x2AA0B538) & 0x8230514) + (("com.aheaditec.talsec.security.s1$a".length() & 0x30024) | 0x801010E0);
                                                final int a3 = A1.a(~n18 | 0x883315F6, 2, -2009917962 - n18, 2, n2);
                                                final int length9 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length10 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n19 = ~((length10 & 0x38B80309) + 276825601 - (length10 & 0x10800201));
                                                final int n20 = -((~length9 | 0xC3C2F477) & 0x2878811C);
                                                array[a3] = (byte)((w1.a(~n20, n19, 2, n19 + n20 + 1) ^ 0x38F887E2) & n5);
                                                final int length11 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length12 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n21 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int a4 = B1.a((Class)s1$a.class, 0x4763FDFC | n21);
                                                final int length13 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length14 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length15 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length16 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n22 = ("com.aheaditec.talsec.security.s1$a".length() & 0x20884062) | 0xAA028042;
                                                final int n23 = -((~length16 | 0x5F73B59C) & 0x55C844A4);
                                                array[(((~length11 | 0xBF552BF4) & 0x1A230910) + ((length12 & 0x4228004) | 0x84048405) ^ 0x9E278D16) + n2] = (byte)(n5 >> (0x7CBDC0FA ^ (length14 | 0x2831C0E0) - (n21 | 0x6F73FDFC) + (a4 + (length13 & 0x2831C0E0)) + ((length15 & 0x68940010) | 0x548C0012)) & (0xFFCAC419 ^ (~n23 & n22) - (n23 & ~n22)));
                                                n2 += 4;
                                                n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xF5BFD72F) & 0x13002210) + (("com.aheaditec.talsec.security.s1$a".length() & 0x2002010) | 0x21402);
                                                n17 = -1824662634;
                                                break;
                                            }
                                            case 1734050766: {
                                                final int n24 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                if (n2 > 0) {
                                                    final int length17 = "com.aheaditec.talsec.security.s1$a".length();
                                                    n16 = ((n24 | 0xEFFADC8E) & 0x10D1006A) + (0xA086800 | length17 + 402735200 - (length17 | 0x18014060));
                                                    n17 = -115901203;
                                                    break;
                                                }
                                                final int n25 = ("com.aheaditec.talsec.security.s1$a".length() & 0x1120000) | 0x21004004;
                                                final int n26 = -((n24 | 0x5A0DDFDD) & 0x18120300);
                                                n27 = (~n26 & n25) - (n26 & ~n25);
                                                n28 = 2001041846;
                                                break Label_2053;
                                            }
                                            case 1314339506: {
                                                break Label_1119;
                                            }
                                            case 998066383: {
                                                n2 = (((B1.a((Class)s1$a.class, -1) | 0x12B95885) & 0x16208A48) + (("com.aheaditec.talsec.security.s1$a".length() | 0xFBFF7DA7) + 67142233 | 0x89000110) ^ 0x9F208B58);
                                                n3 = array.length - array.length % (((~"com.aheaditec.talsec.security.s1$a".length() | 0x15DACEF5) & 0x501E1A02) + (("com.aheaditec.talsec.security.s1$a".length() & 0xC4049063) | 0x84008061) ^ 0xD41E9A67);
                                                n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xAEF59C61) & 0x2EC1453) + (("com.aheaditec.talsec.security.s1$a".length() & 0x91180012) | 0xB9102A00);
                                                n17 = 1002689495;
                                                break;
                                            }
                                            case 974072829: {
                                                final int length18 = array.length;
                                                final int length19 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n29 = ("com.aheaditec.talsec.security.s1$a".length() & 0xF006550) | 0x65003700;
                                                final int n30 = -((~length19 | 0x65FE9CA7) & 0xA2648F6);
                                                n2 = length18 % (0x6F267FF2 ^ (~n30 & n29) - (n30 & ~n29));
                                                n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0x3B134AC3) & 0x820C1403) + (("com.aheaditec.talsec.security.s1$a".length() & 0x900C5408) | 0x11004008);
                                                n17 = -195569723;
                                                break;
                                            }
                                            case 766056152: {
                                                final int length20 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length21 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n31 = length21 + 84675108 - (length21 | 0x50C0A24);
                                                if (n2 < (0x6DCD8F6B ^ (~n31 & 0x24440D24) + n31 + ((~length20 | 0xCAF5A54F) & 0x4989824B))) {
                                                    final int n32 = (~"com.aheaditec.talsec.security.s1$a".length() | 0x6FFB14D6) & 0x72014033;
                                                    final int n33 = ("com.aheaditec.talsec.security.s1$a".length() & 0x10025821) | 0xA1888;
                                                    n16 = M.a(n32 | n33, 2, ~n32 ^ n33, 1);
                                                    n17 = -717449014;
                                                    break;
                                                }
                                                n16 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xA7E82FDE) & 0xA0612419) + (("com.aheaditec.talsec.security.s1$a".length() & 0x40094861) | 0x50084862);
                                                n17 = -887872332;
                                                break;
                                            }
                                            case -473033593: {
                                                final int length22 = array.length;
                                                final int n34 = -n2;
                                                final int n35 = -length22;
                                                final int n36 = n35 | n34;
                                                final byte b = array[array.length - n2];
                                                final int length23 = "com.aheaditec.talsec.security.s1$a".length();
                                                array[n36 - n35 * 2 + (n35 ^ n34 ^ n36)] = (byte)(b ^ array2[n2 % (((0xCB9E47BD | length23 - 1 - length23 * 2) & 0x58D38068) + (("com.aheaditec.talsec.security.s1$a".length() & 0x10618843) | 0x21242803) ^ 0x79F7A863)]);
                                                --n2;
                                                final int a5 = B1.a((Class)s1$a.class, -1);
                                                final int n37 = "com.aheaditec.talsec.security.s1$a".length() & 0x400C4082;
                                                n16 = J.a(n37, -n37 - 1 | 0xEFFDFB7C, 268567684, (a5 | 0x6D1BD13) & 0x468D5000);
                                                n17 = 836032333;
                                                break;
                                            }
                                            case -1489518479: {
                                                final int length24 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n38 = (0x85A08468 & 516782023 - length24 + (-(-1 - length24) - 1 | 0xE1328838)) + (("com.aheaditec.talsec.security.s1$a".length() & 0xC121C028) | 0x40014001) ^ 0xC5A1C46B;
                                                final int n39 = array2[(~n2 & n38) * (~n38 & n2) + (n38 & n2) * (n38 | n2)] & (((~"com.aheaditec.talsec.security.s1$a".length() | 0x8FB561CA) & 0xD4011A85) + (("com.aheaditec.talsec.security.s1$a".length() & 0x50101A05) | 0x20900108) ^ 0xF4911B72);
                                                final int n40 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int n41 = ("com.aheaditec.talsec.security.s1$a".length() & 0x2203110) | 0x200D300;
                                                final int n42 = -(0x4622098 & (~n40 & 0x965780AA) + n40);
                                                final byte b2 = array2[(0x662F39A ^ (~n42 & n41) * 2 - (n42 ^ n41)) * n2 + ((B1.a((Class)s1$a.class, -1) | 0xFFF7DFFF) + 67641369 + (("com.aheaditec.talsec.security.s1$a".length() & 0x82042) | 0x642) ^ 0x408265B)];
                                                final int n43 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int n44 = (b2 & ((0x279022C0 & n43 + 1314070430 - (n43 & 0x4E531F9E)) + (("com.aheaditec.talsec.security.s1$a".length() & 0x31C02044) | 0x1040040C) ^ 0x37D02633)) << ((B1.a((Class)s1$a.class, -1) | 0xFDFFFFFE) + 1107366402 + (("com.aheaditec.talsec.security.s1$a".length() & 0x82000041) | 0x80002140) ^ 0xC2013349);
                                                array3[n2] = (short)((n44 ^ n39) + (n39 & n44));
                                                ++n2;
                                                n16 = ((B1.a((Class)s1$a.class, -1) | 0xF60B90CE) & 0x4505AC40) + (("com.aheaditec.talsec.security.s1$a".length() & 0x9843D10) | 0x88801110);
                                                n17 = -533943416;
                                                break;
                                            }
                                            case -1740520186: {
                                                array3 = new short[((~"com.aheaditec.talsec.security.s1$a".length() | 0xE92FC1C9) & 0x61C8445) + (("com.aheaditec.talsec.security.s1$a".length() & 0x6500624) | 0x401230) ^ 0x65C9671];
                                                n2 = (((~"com.aheaditec.talsec.security.s1$a".length() | 0xFFA3E21F) & 0x49804EA1) + (("com.aheaditec.talsec.security.s1$a".length() & 0x30401CA0) | 0x30419100) ^ 0x79C1DFA1);
                                                final int length25 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n45 = "com.aheaditec.talsec.security.s1$a".length() & 0x10006009;
                                                n27 = ("com.aheaditec.talsec.security.s1$a".length() & ~n45 & 0x406008) + 4218888 + n45 - ((n45 | "com.aheaditec.talsec.security.s1$a".length()) & 0x406008) + ((~length25 | 0x649DBA54) & 0x34011001);
                                                n28 = 434661073;
                                                break Label_2053;
                                            }
                                            case -1809249287: {
                                                final byte b3 = array[(((~"com.aheaditec.talsec.security.s1$a".length() | 0x49851A55) & 0x7816F4A) + (("com.aheaditec.talsec.security.s1$a".length() & 0x2E24650A) | 0x28340001) ^ 0x2FB56F4B) + n2];
                                                final int n46 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xFF938BDA) & 0x18044242) + (("com.aheaditec.talsec.security.s1$a".length() & 0x20944030) | 0x20908030) ^ 0x3894C28D;
                                                final int a6 = B1.a((Class)s1$a.class, (int)b3);
                                                final int length26 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length27 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n47 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xFB29D7B9) & 0x1A244080) + (("com.aheaditec.talsec.security.s1$a".length() & 0xC0003) | 0x882203) ^ 0x1AAC6282;
                                                final byte b4 = array[(n47 & n2) * 2 + (n47 ^ n2)];
                                                final int n48 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                n4 = (short)((b4 & (0x8B85418E ^ ("com.aheaditec.talsec.security.s1$a".length() | 0x82840061) - (n48 | 0xA3E66AE5) + (B1.a((Class)s1$a.class, 0x21E66AE5 | n48) + ("com.aheaditec.talsec.security.s1$a".length() & 0x82840061)) + (("com.aheaditec.talsec.security.s1$a".length() & 0x83004100) | 0x9014110))) << (((~"com.aheaditec.talsec.security.s1$a".length() | 0xA11ABDE7) & 0x8626115) + (("com.aheaditec.talsec.security.s1$a".length() & 0x8785410) | 0x189C00) ^ 0x87AFD1D) | (length27 | n46) - (b3 | n46) + (a6 + (length26 & n46)));
                                                final int n49 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int n50 = 0x8EA7BB41 ^ ((~n49 & 0xDE072D27) + n49 | 0x797D4FBC) - 2038255548 + (("com.aheaditec.talsec.security.s1$a".length() & 0x8A19240) | 0x8250B00);
                                                final int n51 = -n2;
                                                final int n52 = n51 | n50;
                                                final byte b5 = array[n52 - n51 * 2 + (n50 ^ n51 ^ n52)];
                                                final int n53 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int n54 = (0xF41909D4 | n53) - 1591672428 - (n53 | 0xF53909D4);
                                                final int n55 = ("com.aheaditec.talsec.security.s1$a".length() & 0x1601008) | 0x10401868;
                                                final int length28 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length29 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n56 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xC3DB662F) & 0x20844001;
                                                final int n57 = ("com.aheaditec.talsec.security.s1$a".length() & 0x20042840) | 0x2940;
                                                final byte b6 = array[(0x20846942 ^ (n57 & n56) + (n56 | n57)) + n2];
                                                final int length30 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length31 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length32 = "com.aheaditec.talsec.security.s1$a".length();
                                                n5 = (short)((b5 & (0xB1611903 ^ (n55 | n54) - (length28 & ~n54 & n55) + (n55 & (n54 | length29)))) | (b6 & (((~length30 | 0x47DF7D9) & 0x4A0C04A9) + ((length31 & 0x4A801160) | 0xA0801940) ^ 0xEA8C1D16)) << (((0x6A0F8294 | ~length32 - length32 + length32) & 0x1AB35A6E) + (("com.aheaditec.talsec.security.s1$a".length() & 0xB1B458FA) | 0xE1040090) ^ 0xFBB75AF6));
                                                final int n58 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                n6 = (0x2D2FD8AD ^ (0xAFE615E4 | n58) + 311432716 - (n58 | 0xBFF617EC) + (("com.aheaditec.talsec.security.s1$a".length() & 0x10500249) | 0xC0400841));
                                                final int n59 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int length33 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length34 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n60 = ("com.aheaditec.talsec.security.s1$a".length() & 0xD0100010) | 0x833000A0;
                                                final int n61 = -(0x540A0512 & (length33 & ~n59 & 0x56E9DAF) + 91135407 + n59 - ((n59 | length34) & 0x56E9DAF));
                                                n7 = (0xD73A05B2 ^ (~n61 & n60) - (n61 & ~n60));
                                                n12 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xDFEFFFFF) + 806798471 + (("com.aheaditec.talsec.security.s1$a".length() & 0x28382801) | 0x9282829);
                                                n13 = 1174056570 - n12;
                                                n14 = -1174056571;
                                                break Label_2805;
                                            }
                                            case -2038999444: {
                                                final int n62 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int n63 = (("com.aheaditec.talsec.security.s1$a".length() & ~n62 & 0x2F85C3D8) + 797295576 + n62 - (("com.aheaditec.talsec.security.s1$a".length() | n62) & 0x2F85C3D8) & 0x9A04001) + (("com.aheaditec.talsec.security.s1$a".length() & 0x80200029) | 0x800000AC);
                                                final int n64 = (short)((n4 << y1.a(n63 | 0x89A040A9, 2, -1985986391, n63)) + array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0xBF452A29) & 0x4045F890) + (("com.aheaditec.talsec.security.s1$a".length() & 0x6020D290) | 0x28300240) ^ 0x6875FAD2]) ^ n4 + n6;
                                                final int n65 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                final int length35 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length36 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int length37 = "com.aheaditec.talsec.security.s1$a".length();
                                                final short n66 = array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0x4A6DD9E9) & 0x31422178) + (("com.aheaditec.talsec.security.s1$a".length() & 0x31032210) | 0x80894200) ^ 0xB1CB637B];
                                                final int n67 = -(n4 >>> ((~((length35 | 0x255D135A | n65) - ((length36 & 0xDAA2ECA5) | n65)) & 0x3910D911) + ((length37 & 0x23183110) | 0x2282480) ^ 0x3B38FD94));
                                                final int n68 = n67 | n66;
                                                final int n69 = n68 - n67 * 2 + (n67 ^ n66 ^ n68);
                                                final int n70 = -z1.a(n69 | ~n64, 2, n69 - n64, 2);
                                                n5 = (short)O.a(n5, 3, -(N.a(n5, -4, 1, n70) | (n70 & 0x2)), 1);
                                                final int n71 = (~"com.aheaditec.talsec.security.s1$a".length() | 0xDF39FDFE) + 1624126210;
                                                final int n72 = ("com.aheaditec.talsec.security.s1$a".length() & 0x20C60649) | 0x401044A;
                                                n4 = (short)(n4 - ((short)((n5 << (0x64CF374F ^ (n72 & n71) + (n71 | n72))) + array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0xC40A2F76) & 0x9220045) + (("com.aheaditec.talsec.security.s1$a".length() & 0xD200031) | 0x14000030) ^ 0x1D220075]) ^ (n6 | n5) - ("com.aheaditec.talsec.security.s1$a".length() & ~n5 & n6) + (("com.aheaditec.talsec.security.s1$a".length() | n5) & n6) ^ (n5 >>> (((~"com.aheaditec.talsec.security.s1$a".length() | 0xFE323FD5) & 0xA4910442) + (("com.aheaditec.talsec.security.s1$a".length() & 0x836016) | 0x22E014) ^ 0xA4B3E453)) + array3[((~"com.aheaditec.talsec.security.s1$a".length() | 0xFE9977DC) & 0x314C5004) + (("com.aheaditec.talsec.security.s1$a".length() & 0x81C52010) | 0x808120D0) ^ 0xB1CD70D5]));
                                                final int length38 = "com.aheaditec.talsec.security.s1$a".length();
                                                final int n73 = ("com.aheaditec.talsec.security.s1$a".length() & 0x1812164E) | 0x10024046;
                                                final int n74 = -((~length38 | 0xE76C8087) & 0x8B301688);
                                                final int n75 = (~n74 & n73) * 2 - (n74 ^ n73);
                                                n6 = (short)x1.a(0x64CD3706 & n75, 2, -1691170567 - n75, n6);
                                                ++n7;
                                                a2 = ((~"com.aheaditec.talsec.security.s1$a".length() | 0xC6AE4E15) & 0x18048CC) + (("com.aheaditec.talsec.security.s1$a".length() & 0x90000C9) | 0x8640001);
                                                n11 = 1965034008;
                                                break Label_3405;
                                            }
                                            case -2143294076: {
                                                final int n76 = ~"com.aheaditec.talsec.security.s1$a".length();
                                                if (n2 < n3) {
                                                    final int n77 = ("com.aheaditec.talsec.security.s1$a".length() & 0x10001102) | 0x11001200;
                                                    final int n78 = -((n76 | 0xA365F19A) - ((0xA365F098 | n76) ^ 0x20004192));
                                                    n8 = ((~n78 & n77) * 2 - (n78 ^ n77) ^ 0xA529586B);
                                                    continue;
                                                }
                                                a2 = ((n76 | 0xD3761F18) & 0x91010410) + (("com.aheaditec.talsec.security.s1$a".length() & 0x40010002) | 0x42900022);
                                                n11 = -375509041;
                                                break Label_3405;
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
                    
                    public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                        return ((s1$a)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                };
            }
            
            public Object invoke(final Object o, final Object o2) {
                return ((s1$a)this.create(o, (Continuation<?>)o2)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Object invokeSuspend(final Object o) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(o);
                    s1.a(this.b, new i1(new l0(this.c), (i1$c)null));
                    final s1 b = this.b;
                    final w0 d = this.d;
                    i1 b2 = b.b;
                    if (b2 == null) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[7];
                        array2[0] = 46;
                        array2[1] = 48;
                        array2[2] = -97;
                        array2[3] = 44;
                        array2[4] = 9;
                        array2[5] = -120;
                        array2[6] = -5;
                        a(array, new byte[] { -116, -119, -19, 110, -30, 55, 94, 101 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
                        b2 = null;
                    }
                    b.c = new R0(d, b2, this.e, this.f, (Z)this.b);
                    this.b.f = new G1(this.g.getKillOnBypass(), this.c);
                    final s1 b3 = this.b;
                    final Context c = this.c;
                    final r0$f a = this.f.a();
                    G1 f;
                    if ((f = this.b.f) == null) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[11];
                        array4[0] = 70;
                        array4[1] = 35;
                        array4[2] = 20;
                        array4[3] = 117;
                        array4[4] = -3;
                        array4[5] = 18;
                        array4[6] = -16;
                        array4[7] = -21;
                        array4[8] = 76;
                        array4[9] = -87;
                        array4[10] = 22;
                        a(array3, new byte[] { 4, 125, -54, 45, -103, -3, -104, 74, -9, -54, 9 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array3, StandardCharsets.UTF_8).intern());
                        f = null;
                    }
                    b3.d = (E1)new F1(c, a, (i1$c)null, f);
                    final s1 b4 = this.b;
                    final Context c2 = this.c;
                    final u1 h = this.h;
                    R0 c3 = b4.c;
                    if (c3 == null) {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[6];
                        array6[0] = 51;
                        array6[1] = -58;
                        array6[2] = 117;
                        array6[3] = 22;
                        array6[4] = 96;
                        array6[5] = -5;
                        a(array5, new byte[] { -94, -119, 5, 58, -73, 19, -34, 121 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array5, StandardCharsets.UTF_8).intern());
                        c3 = null;
                    }
                    final w0 d2 = this.d;
                    final r0 f2 = this.f;
                    E1 d3 = this.b.d;
                    if (d3 == null) {
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[8];
                        array8[0] = -116;
                        array8[1] = -9;
                        array8[2] = 0;
                        array8[3] = 43;
                        array8[4] = -75;
                        array8[5] = 95;
                        array8[6] = 53;
                        array8[7] = -48;
                        a(array7, new byte[] { -84, -58, -21, -1, 115, 69, 33, 85 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array7, StandardCharsets.UTF_8).intern());
                        d3 = null;
                    }
                    b4.e = new l1(c2, h, c3, d2, f2, d3);
                    this.b.a(this.c, this.g);
                    final s1 b5 = this.b;
                    final Context c4 = this.c;
                    this.f.getClass();
                    b5.a(c4, 60L);
                    return Unit.INSTANCE;
                }
                final byte[] array10;
                final byte[] array9 = array10 = new byte[47];
                array10[0] = -20;
                array10[1] = 61;
                array10[2] = -52;
                array10[3] = -93;
                array10[4] = 90;
                array10[5] = 34;
                array10[6] = 23;
                array10[7] = 114;
                array10[8] = -123;
                array10[9] = 62;
                array10[10] = -57;
                array10[11] = 53;
                array10[12] = -54;
                array10[13] = -12;
                array10[14] = -97;
                array10[15] = -11;
                array10[16] = 80;
                array10[17] = 55;
                array10[18] = -116;
                array10[19] = -23;
                array10[20] = -13;
                array10[21] = -3;
                array10[22] = -87;
                array10[23] = 28;
                array10[24] = -111;
                array10[25] = -97;
                array10[26] = 29;
                array10[27] = -24;
                array10[28] = 114;
                array10[29] = -30;
                array10[30] = 48;
                array10[31] = 64;
                array10[32] = -13;
                array10[33] = 14;
                array10[34] = -103;
                array10[35] = 73;
                array10[36] = 8;
                array10[37] = -78;
                array10[38] = -91;
                array10[39] = -109;
                array10[40] = 101;
                array10[41] = -94;
                array10[42] = 126;
                array10[43] = 42;
                array10[44] = -85;
                array10[45] = 90;
                array10[46] = 10;
                a(array9, new byte[] { 30, 111, 52, -62, -112, 89, 124, 37, -77, -52, -55, 27, -55, 100, 69, -1, -99, 39, -61, -100, 90, 59, 2, 12, 24, 2, -24, -112, -101, 73, 4, 90, 69, 58, -32, 11, 22, -26, -103, 55, 38, -11, -85, 72, 127, -29, -56 });
                throw new IllegalStateException(new String(array9, StandardCharsets.UTF_8).intern());
            }
        }, 3, (Object)null);
    }
    
    public static final /* synthetic */ void a(final s1 s1, final i1 b) {
        s1.b = b;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        final int n = ~"com.aheaditec.talsec.security.s1".length();
        int n2 = (~(("com.aheaditec.talsec.security.s1".length() | 0x42FDD19 | n) - (n | ("com.aheaditec.talsec.security.s1".length() & 0xFBD022E6))) & 0x8A042208) + (("com.aheaditec.talsec.security.s1".length() & 0x400C0008) | 0x41280820) ^ 0xCB2C2A28;
        final int a = B1.a((Class)s1.class, -1);
        int n3 = (a | 0x954FECC5) - ((0x14DECC5 | a) ^ 0x9402A001) + (("com.aheaditec.talsec.security.s1".length() | 0x6BFDFFFD) - 1811808253 | 0x20081002) ^ 0xB40AB003;
        int n4 = ((~"com.aheaditec.talsec.security.s1".length() | 0xDDA24923) & 0x10824042) + (("com.aheaditec.talsec.security.s1".length() & 0x9040) | 0x40019001) ^ 0x5083D043;
        int n5 = ((~"com.aheaditec.talsec.security.s1".length() | 0xBAFDFD77) & 0x68A830CC) + (("com.aheaditec.talsec.security.s1".length() & 0x4003889A) | 0x80138C12) ^ 0xE8BBBCDE;
        final int length = "com.aheaditec.talsec.security.s1".length();
        final int length2 = "com.aheaditec.talsec.security.s1".length();
        int n6 = 0x9B7D9791 ^ ((0x1B101411 & length2) ^ 0x80400590) + (length2 & 0x410) + ((~length | 0xE06FE760) & 0x1B3D9201);
        int n7 = (~"com.aheaditec.talsec.security.s1".length() | 0xFFEFBFFF) + 689325073 + (("com.aheaditec.talsec.security.s1".length() & 0x82104800) | 0x824008A8) ^ 0xAB564CB8;
        final int length3 = "com.aheaditec.talsec.security.s1".length();
        final int length4 = "com.aheaditec.talsec.security.s1".length();
        int n8 = ((~length3 | 0x5776618) & 0xC02C8254) + (0x905020 | (length4 | 0xC088C064) - (length4 ^ 0xC088C064)) ^ 0x58FD1772;
        short[] array3 = null;
    Label_1238:
        while (true) {
            int a2 = 0;
            int n11 = 0;
            Label_3564: {
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                Label_2964: {
                    int n27 = 0;
                    int n28 = 0;
                    Label_2212: {
                        int n16 = 0;
                        int n17 = 0;
                        switch (n8) {
                            default: {
                                final int n9 = ~"com.aheaditec.talsec.security.s1".length();
                                final int n10 = (0xED53ECFC | n9) + 45165696 - (n9 | 0xEFF3ECFC);
                                a2 = O.a(n10, 3, -N.a(n10, -4, 1, ("com.aheaditec.talsec.security.s1".length() & 0x2A00020) | 0x94020220), 1);
                                n11 = -361272203;
                                break Label_3564;
                            }
                            case 2093236949: {
                                if (n7 < (((~"com.aheaditec.talsec.security.s1".length() | 0xDB3AB245) & 0x4DB02E10) + (("com.aheaditec.talsec.security.s1".length() & 0x4800D19) | 0x2005010D) ^ 0x6DB52F3D)) {
                                    n12 = ((~"com.aheaditec.talsec.security.s1".length() | 0x4D5991B8) & 0x21320709) + (("com.aheaditec.talsec.security.s1".length() & 0x34222601) | 0x14002004);
                                    n13 = -1287294623 - n12;
                                    n14 = 1287294622;
                                    break Label_2964;
                                }
                                final int n15 = ~"com.aheaditec.talsec.security.s1".length();
                                n16 = (0x4411012E & -1207265904 + n15 + (-n15 - 1 | 0x47F56A70)) + (("com.aheaditec.talsec.security.s1".length() & 0x4D110460) | 0x9000440);
                                n17 = 612868558;
                                break;
                            }
                            case 1771480224: {
                                array[(((~"com.aheaditec.talsec.security.s1".length() | 0x422FD499) & 0x4A01800A) + (("com.aheaditec.talsec.security.s1".length() & 0x9000502) | 0x5082500) ^ 0x4F09A50A) + n2] = (byte)((((~"com.aheaditec.talsec.security.s1".length() | 0x5F9A85FE) & 0x1808350) + (("com.aheaditec.talsec.security.s1".length() | 0xFFEBFDFD) + 1311235 | 0x801400A2) ^ 0x8194830D) & n4);
                                final int length5 = "com.aheaditec.talsec.security.s1".length();
                                final int length6 = "com.aheaditec.talsec.security.s1".length();
                                final int length7 = "com.aheaditec.talsec.security.s1".length();
                                final int length8 = "com.aheaditec.talsec.security.s1".length();
                                array[(((~length5 | 0xAD39FB88) & 0x2A212880) + ((length6 & 0x43020008) | 0x51428008) ^ 0x7B63A889) + n2] = (byte)(n4 >> (((~length7 | 0x15E46274) & 0x20B53110) + (length8 + 558960896 - (length8 | 0x21511100) | 0x1428004) ^ 0x21F7B11C) & (((~"com.aheaditec.talsec.security.s1".length() | 0x7DF43DE4) & 0x3D300832) + (("com.aheaditec.talsec.security.s1".length() & 0x80101A) | 0x82174D) ^ 0x3DB21F80));
                                final int n18 = ((~"com.aheaditec.talsec.security.s1".length() | 0x2AA0B538) & 0x8230514) + (("com.aheaditec.talsec.security.s1".length() & 0x30024) | 0x801010E0);
                                final int a3 = A1.a(~n18 | 0x883315F6, 2, -2009917962 - n18, 2, n2);
                                final int length9 = "com.aheaditec.talsec.security.s1".length();
                                final int length10 = "com.aheaditec.talsec.security.s1".length();
                                final int n19 = ~((length10 & 0x38B80309) + 276825601 - (length10 & 0x10800201));
                                final int n20 = -((~length9 | 0xC3C2F477) & 0x2878811C);
                                array[a3] = (byte)((w1.a(~n20, n19, 2, n19 + n20 + 1) ^ 0x38F887E2) & n5);
                                final int length11 = "com.aheaditec.talsec.security.s1".length();
                                final int length12 = "com.aheaditec.talsec.security.s1".length();
                                final int n21 = ~"com.aheaditec.talsec.security.s1".length();
                                final int a4 = B1.a((Class)s1.class, 0x4763FDFC | n21);
                                final int length13 = "com.aheaditec.talsec.security.s1".length();
                                final int length14 = "com.aheaditec.talsec.security.s1".length();
                                final int length15 = "com.aheaditec.talsec.security.s1".length();
                                final int length16 = "com.aheaditec.talsec.security.s1".length();
                                final int n22 = ("com.aheaditec.talsec.security.s1".length() & 0x20884062) | 0xAA028042;
                                final int n23 = -((~length16 | 0x5F73B59C) & 0x55C844A4);
                                array[(((~length11 | 0xBF552BF4) & 0x1A230910) + ((length12 & 0x4228004) | 0x84048405) ^ 0x9E278D16) + n2] = (byte)(n5 >> (0x7CBDC0FA ^ (length14 | 0x2831C0E0) - (n21 | 0x6F73FDFC) + (a4 + (length13 & 0x2831C0E0)) + ((length15 & 0x68940010) | 0x548C0012)) & (0xFFCAC419 ^ (~n23 & n22) - (n23 & ~n22)));
                                n2 += 4;
                                n16 = ((~"com.aheaditec.talsec.security.s1".length() | 0xF5BFD72F) & 0x13002210) + (("com.aheaditec.talsec.security.s1".length() & 0x2002010) | 0x21402);
                                n17 = -1824662634;
                                break;
                            }
                            case 1734050766: {
                                final int n24 = ~"com.aheaditec.talsec.security.s1".length();
                                if (n2 > 0) {
                                    final int length17 = "com.aheaditec.talsec.security.s1".length();
                                    n16 = ((n24 | 0xEFFADC8E) & 0x10D1006A) + (0xA086800 | length17 + 402735200 - (length17 | 0x18014060));
                                    n17 = -115901203;
                                    break;
                                }
                                final int n25 = ("com.aheaditec.talsec.security.s1".length() & 0x1120000) | 0x21004004;
                                final int n26 = -((n24 | 0x5A0DDFDD) & 0x18120300);
                                n27 = (~n26 & n25) - (n26 & ~n25);
                                n28 = 2001041846;
                                break Label_2212;
                            }
                            case 1314339506: {
                                break Label_1238;
                            }
                            case 998066383: {
                                n2 = (((B1.a((Class)s1.class, -1) | 0x12B95885) & 0x16208A48) + (("com.aheaditec.talsec.security.s1".length() | 0xFBFF7DA7) + 67142233 | 0x89000110) ^ 0x9F208B58);
                                n3 = array.length - array.length % (((~"com.aheaditec.talsec.security.s1".length() | 0x15DACEF5) & 0x501E1A02) + (("com.aheaditec.talsec.security.s1".length() & 0xC4049063) | 0x84008061) ^ 0xD41E9A67);
                                n16 = ((~"com.aheaditec.talsec.security.s1".length() | 0xAEF59C61) & 0x2EC1453) + (("com.aheaditec.talsec.security.s1".length() & 0x91180012) | 0xB9102A00);
                                n17 = 1002689495;
                                break;
                            }
                            case 974072829: {
                                final int length18 = array.length;
                                final int length19 = "com.aheaditec.talsec.security.s1".length();
                                final int n29 = ("com.aheaditec.talsec.security.s1".length() & 0xF006550) | 0x65003700;
                                final int n30 = -((~length19 | 0x65FE9CA7) & 0xA2648F6);
                                n2 = length18 % (0x6F267FF2 ^ (~n30 & n29) - (n30 & ~n29));
                                n16 = ((~"com.aheaditec.talsec.security.s1".length() | 0x3B134AC3) & 0x820C1403) + (("com.aheaditec.talsec.security.s1".length() & 0x900C5408) | 0x11004008);
                                n17 = -195569723;
                                break;
                            }
                            case 766056152: {
                                final int length20 = "com.aheaditec.talsec.security.s1".length();
                                final int length21 = "com.aheaditec.talsec.security.s1".length();
                                final int n31 = length21 + 84675108 - (length21 | 0x50C0A24);
                                if (n2 < (0x6DCD8F6B ^ (~n31 & 0x24440D24) + n31 + ((~length20 | 0xCAF5A54F) & 0x4989824B))) {
                                    final int n32 = (~"com.aheaditec.talsec.security.s1".length() | 0x6FFB14D6) & 0x72014033;
                                    final int n33 = ("com.aheaditec.talsec.security.s1".length() & 0x10025821) | 0xA1888;
                                    n16 = M.a(n32 | n33, 2, ~n32 ^ n33, 1);
                                    n17 = -717449014;
                                    break;
                                }
                                n16 = ((~"com.aheaditec.talsec.security.s1".length() | 0xA7E82FDE) & 0xA0612419) + (("com.aheaditec.talsec.security.s1".length() & 0x40094861) | 0x50084862);
                                n17 = -887872332;
                                break;
                            }
                            case -473033593: {
                                final int length22 = array.length;
                                final int n34 = -n2;
                                final int n35 = -length22;
                                final int n36 = n35 | n34;
                                final byte b = array[array.length - n2];
                                final int length23 = "com.aheaditec.talsec.security.s1".length();
                                array[n36 - n35 * 2 + (n35 ^ n34 ^ n36)] = (byte)(b ^ array2[n2 % (((0xCB9E47BD | length23 - 1 - length23 * 2) & 0x58D38068) + (("com.aheaditec.talsec.security.s1".length() & 0x10618843) | 0x21242803) ^ 0x79F7A863)]);
                                --n2;
                                final int a5 = B1.a((Class)s1.class, -1);
                                final int n37 = "com.aheaditec.talsec.security.s1".length() & 0x400C4082;
                                n16 = J.a(n37, -n37 - 1 | 0xEFFDFB7C, 268567684, (a5 | 0x6D1BD13) & 0x468D5000);
                                n17 = 836032333;
                                break;
                            }
                            case -1489518479: {
                                final int length24 = "com.aheaditec.talsec.security.s1".length();
                                final int n38 = (0x85A08468 & 516782023 - length24 + (-(-1 - length24) - 1 | 0xE1328838)) + (("com.aheaditec.talsec.security.s1".length() & 0xC121C028) | 0x40014001) ^ 0xC5A1C46B;
                                final int n39 = array2[(~n2 & n38) * (~n38 & n2) + (n38 & n2) * (n38 | n2)] & (((~"com.aheaditec.talsec.security.s1".length() | 0x8FB561CA) & 0xD4011A85) + (("com.aheaditec.talsec.security.s1".length() & 0x50101A05) | 0x20900108) ^ 0xF4911B72);
                                final int n40 = ~"com.aheaditec.talsec.security.s1".length();
                                final int n41 = ("com.aheaditec.talsec.security.s1".length() & 0x2203110) | 0x200D300;
                                final int n42 = -(0x4622098 & (~n40 & 0x965780AA) + n40);
                                final byte b2 = array2[(0x662F39A ^ (~n42 & n41) * 2 - (n42 ^ n41)) * n2 + ((B1.a((Class)s1.class, -1) | 0xFFF7DFFF) + 67641369 + (("com.aheaditec.talsec.security.s1".length() & 0x82042) | 0x642) ^ 0x408265B)];
                                final int n43 = ~"com.aheaditec.talsec.security.s1".length();
                                final int n44 = (b2 & ((0x279022C0 & n43 + 1314070430 - (n43 & 0x4E531F9E)) + (("com.aheaditec.talsec.security.s1".length() & 0x31C02044) | 0x1040040C) ^ 0x37D02633)) << ((B1.a((Class)s1.class, -1) | 0xFDFFFFFE) + 1107366402 + (("com.aheaditec.talsec.security.s1".length() & 0x82000041) | 0x80002140) ^ 0xC2013349);
                                array3[n2] = (short)((n44 ^ n39) + (n39 & n44));
                                ++n2;
                                n16 = ((B1.a((Class)s1.class, -1) | 0xF60B90CE) & 0x4505AC40) + (("com.aheaditec.talsec.security.s1".length() & 0x9843D10) | 0x88801110);
                                n17 = -533943416;
                                break;
                            }
                            case -1740520186: {
                                array3 = new short[((~"com.aheaditec.talsec.security.s1".length() | 0xE92FC1C9) & 0x61C8445) + (("com.aheaditec.talsec.security.s1".length() & 0x6500624) | 0x401230) ^ 0x65C9671];
                                n2 = (((~"com.aheaditec.talsec.security.s1".length() | 0xFFA3E21F) & 0x49804EA1) + (("com.aheaditec.talsec.security.s1".length() & 0x30401CA0) | 0x30419100) ^ 0x79C1DFA1);
                                final int length25 = "com.aheaditec.talsec.security.s1".length();
                                final int n45 = "com.aheaditec.talsec.security.s1".length() & 0x10006009;
                                n27 = ("com.aheaditec.talsec.security.s1".length() & ~n45 & 0x406008) + 4218888 + n45 - ((n45 | "com.aheaditec.talsec.security.s1".length()) & 0x406008) + ((~length25 | 0x649DBA54) & 0x34011001);
                                n28 = 434661073;
                                break Label_2212;
                            }
                            case -1809249287: {
                                final byte b3 = array[(((~"com.aheaditec.talsec.security.s1".length() | 0x49851A55) & 0x7816F4A) + (("com.aheaditec.talsec.security.s1".length() & 0x2E24650A) | 0x28340001) ^ 0x2FB56F4B) + n2];
                                final int n46 = ((~"com.aheaditec.talsec.security.s1".length() | 0xFF938BDA) & 0x18044242) + (("com.aheaditec.talsec.security.s1".length() & 0x20944030) | 0x20908030) ^ 0x3894C28D;
                                final int a6 = B1.a((Class)s1.class, (int)b3);
                                final int length26 = "com.aheaditec.talsec.security.s1".length();
                                final int length27 = "com.aheaditec.talsec.security.s1".length();
                                final int n47 = ((~"com.aheaditec.talsec.security.s1".length() | 0xFB29D7B9) & 0x1A244080) + (("com.aheaditec.talsec.security.s1".length() & 0xC0003) | 0x882203) ^ 0x1AAC6282;
                                final byte b4 = array[(n47 & n2) * 2 + (n47 ^ n2)];
                                final int n48 = ~"com.aheaditec.talsec.security.s1".length();
                                n4 = (short)((b4 & (0x8B85418E ^ ("com.aheaditec.talsec.security.s1".length() | 0x82840061) - (n48 | 0xA3E66AE5) + (B1.a((Class)s1.class, 0x21E66AE5 | n48) + ("com.aheaditec.talsec.security.s1".length() & 0x82840061)) + (("com.aheaditec.talsec.security.s1".length() & 0x83004100) | 0x9014110))) << (((~"com.aheaditec.talsec.security.s1".length() | 0xA11ABDE7) & 0x8626115) + (("com.aheaditec.talsec.security.s1".length() & 0x8785410) | 0x189C00) ^ 0x87AFD1D) | (length27 | n46) - (b3 | n46) + (a6 + (length26 & n46)));
                                final int n49 = ~"com.aheaditec.talsec.security.s1".length();
                                final int n50 = 0x8EA7BB41 ^ ((~n49 & 0xDE072D27) + n49 | 0x797D4FBC) - 2038255548 + (("com.aheaditec.talsec.security.s1".length() & 0x8A19240) | 0x8250B00);
                                final int n51 = -n2;
                                final int n52 = n51 | n50;
                                final byte b5 = array[n52 - n51 * 2 + (n50 ^ n51 ^ n52)];
                                final int n53 = ~"com.aheaditec.talsec.security.s1".length();
                                final int n54 = (0xF41909D4 | n53) - 1591672428 - (n53 | 0xF53909D4);
                                final int n55 = ("com.aheaditec.talsec.security.s1".length() & 0x1601008) | 0x10401868;
                                final int length28 = "com.aheaditec.talsec.security.s1".length();
                                final int length29 = "com.aheaditec.talsec.security.s1".length();
                                final int n56 = (~"com.aheaditec.talsec.security.s1".length() | 0xC3DB662F) & 0x20844001;
                                final int n57 = ("com.aheaditec.talsec.security.s1".length() & 0x20042840) | 0x2940;
                                final byte b6 = array[(0x20846942 ^ (n57 & n56) + (n56 | n57)) + n2];
                                final int length30 = "com.aheaditec.talsec.security.s1".length();
                                final int length31 = "com.aheaditec.talsec.security.s1".length();
                                final int length32 = "com.aheaditec.talsec.security.s1".length();
                                n5 = (short)((b5 & (0xB1611903 ^ (n55 | n54) - (length28 & ~n54 & n55) + (n55 & (n54 | length29)))) | (b6 & (((~length30 | 0x47DF7D9) & 0x4A0C04A9) + ((length31 & 0x4A801160) | 0xA0801940) ^ 0xEA8C1D16)) << (((0x6A0F8294 | ~length32 - length32 + length32) & 0x1AB35A6E) + (("com.aheaditec.talsec.security.s1".length() & 0xB1B458FA) | 0xE1040090) ^ 0xFBB75AF6));
                                final int n58 = ~"com.aheaditec.talsec.security.s1".length();
                                n6 = (0x2D2FD8AD ^ (0xAFE615E4 | n58) + 311432716 - (n58 | 0xBFF617EC) + (("com.aheaditec.talsec.security.s1".length() & 0x10500249) | 0xC0400841));
                                final int n59 = ~"com.aheaditec.talsec.security.s1".length();
                                final int length33 = "com.aheaditec.talsec.security.s1".length();
                                final int length34 = "com.aheaditec.talsec.security.s1".length();
                                final int n60 = ("com.aheaditec.talsec.security.s1".length() & 0xD0100010) | 0x833000A0;
                                final int n61 = -(0x540A0512 & (length33 & ~n59 & 0x56E9DAF) + 91135407 + n59 - ((n59 | length34) & 0x56E9DAF));
                                n7 = (0xD73A05B2 ^ (~n61 & n60) - (n61 & ~n60));
                                n12 = (~"com.aheaditec.talsec.security.s1".length() | 0xDFEFFFFF) + 806798471 + (("com.aheaditec.talsec.security.s1".length() & 0x28382801) | 0x9282829);
                                n13 = 1174056570 - n12;
                                n14 = -1174056571;
                                break Label_2964;
                            }
                            case -2038999444: {
                                final int n62 = ~"com.aheaditec.talsec.security.s1".length();
                                final int n63 = (("com.aheaditec.talsec.security.s1".length() & ~n62 & 0x2F85C3D8) + 797295576 + n62 - (("com.aheaditec.talsec.security.s1".length() | n62) & 0x2F85C3D8) & 0x9A04001) + (("com.aheaditec.talsec.security.s1".length() & 0x80200029) | 0x800000AC);
                                final int n64 = (short)((n4 << y1.a(n63 | 0x89A040A9, 2, -1985986391, n63)) + array3[((~"com.aheaditec.talsec.security.s1".length() | 0xBF452A29) & 0x4045F890) + (("com.aheaditec.talsec.security.s1".length() & 0x6020D290) | 0x28300240) ^ 0x6875FAD2]) ^ n4 + n6;
                                final int n65 = ~"com.aheaditec.talsec.security.s1".length();
                                final int length35 = "com.aheaditec.talsec.security.s1".length();
                                final int length36 = "com.aheaditec.talsec.security.s1".length();
                                final int length37 = "com.aheaditec.talsec.security.s1".length();
                                final short n66 = array3[((~"com.aheaditec.talsec.security.s1".length() | 0x4A6DD9E9) & 0x31422178) + (("com.aheaditec.talsec.security.s1".length() & 0x31032210) | 0x80894200) ^ 0xB1CB637B];
                                final int n67 = -(n4 >>> ((~((length35 | 0x255D135A | n65) - ((length36 & 0xDAA2ECA5) | n65)) & 0x3910D911) + ((length37 & 0x23183110) | 0x2282480) ^ 0x3B38FD94));
                                final int n68 = n67 | n66;
                                final int n69 = n68 - n67 * 2 + (n67 ^ n66 ^ n68);
                                final int n70 = -z1.a(n69 | ~n64, 2, n69 - n64, 2);
                                n5 = (short)O.a(n5, 3, -(N.a(n5, -4, 1, n70) | (n70 & 0x2)), 1);
                                final int n71 = (~"com.aheaditec.talsec.security.s1".length() | 0xDF39FDFE) + 1624126210;
                                final int n72 = ("com.aheaditec.talsec.security.s1".length() & 0x20C60649) | 0x401044A;
                                n4 = (short)(n4 - ((short)((n5 << (0x64CF374F ^ (n72 & n71) + (n71 | n72))) + array3[((~"com.aheaditec.talsec.security.s1".length() | 0xC40A2F76) & 0x9220045) + (("com.aheaditec.talsec.security.s1".length() & 0xD200031) | 0x14000030) ^ 0x1D220075]) ^ (n6 | n5) - ("com.aheaditec.talsec.security.s1".length() & ~n5 & n6) + (("com.aheaditec.talsec.security.s1".length() | n5) & n6) ^ (n5 >>> (((~"com.aheaditec.talsec.security.s1".length() | 0xFE323FD5) & 0xA4910442) + (("com.aheaditec.talsec.security.s1".length() & 0x836016) | 0x22E014) ^ 0xA4B3E453)) + array3[((~"com.aheaditec.talsec.security.s1".length() | 0xFE9977DC) & 0x314C5004) + (("com.aheaditec.talsec.security.s1".length() & 0x81C52010) | 0x808120D0) ^ 0xB1CD70D5]));
                                final int length38 = "com.aheaditec.talsec.security.s1".length();
                                final int n73 = ("com.aheaditec.talsec.security.s1".length() & 0x1812164E) | 0x10024046;
                                final int n74 = -((~length38 | 0xE76C8087) & 0x8B301688);
                                final int n75 = (~n74 & n73) * 2 - (n74 ^ n73);
                                n6 = (short)x1.a(0x64CD3706 & n75, 2, -1691170567 - n75, n6);
                                ++n7;
                                a2 = ((~"com.aheaditec.talsec.security.s1".length() | 0xC6AE4E15) & 0x18048CC) + (("com.aheaditec.talsec.security.s1".length() & 0x90000C9) | 0x8640001);
                                n11 = 1965034008;
                                break Label_3564;
                            }
                            case -2143294076: {
                                final int n76 = ~"com.aheaditec.talsec.security.s1".length();
                                if (n2 < n3) {
                                    final int n77 = ("com.aheaditec.talsec.security.s1".length() & 0x10001102) | 0x11001200;
                                    final int n78 = -((n76 | 0xA365F19A) - ((0xA365F098 | n76) ^ 0x20004192));
                                    n8 = ((~n78 & n77) * 2 - (n78 ^ n77) ^ 0xA529586B);
                                    continue;
                                }
                                a2 = ((n76 | 0xD3761F18) & 0x91010410) + (("com.aheaditec.talsec.security.s1".length() & 0x40010002) | 0x42900022);
                                n11 = -375509041;
                                break Label_3564;
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
    
    public static final /* synthetic */ l1 b(final s1 s1) {
        return s1.e;
    }
    
    public static final /* synthetic */ R0 c(final s1 s1) {
        return s1.c;
    }
    
    public final Object a(final Context context, final long n, final Continuation<? super Unit> continuation) {
        final Object withContext = BuildersKt.withContext((CoroutineContext)Dispatchers.getMain(), (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, context, n, null) {
            public int a;
            public final s1 b;
            public final Context c;
            public final long d;
            
            public static void a(final byte[] array, final byte[] array2) {
                int n = 0;
                byte[] array3 = null;
                int n2 = 0;
                int n4;
                int n3 = n4 = 0;
                int n5 = 1180709023;
                byte[] array4 = null;
            Label_0401:
                while (true) {
                    final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
                    final int n7 = n5 >>> 8;
                    final int n8 = 1;
                    final int n9 = 1;
                    final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
                    final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
                    Label_1032: {
                        Label_0566: {
                            switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                                default: {
                                    break Label_1032;
                                }
                                case 1548321255: {
                                    final int length = array.length;
                                    final int n11 = 0 - (0 - array.length % 4);
                                    int n12 = n9;
                                    if ((length & ~n11) - (~length & n11) <= 0) {
                                        n12 = n;
                                    }
                                    if (n12 != 0) {
                                        n5 = 1910359311;
                                    }
                                    else {
                                        n5 = 1621215041;
                                    }
                                    array3 = array2;
                                    array4 = array;
                                    n3 = n;
                                    continue;
                                }
                                case 975213712: {
                                    final int length2 = array4.length;
                                    final int n13 = 0 - n4;
                                    final int length3 = array4.length;
                                    final int n14 = ~n13;
                                    final byte b = array4[(length3 | n13) - (0xD8E528C6 & n14 & length3) + ((0xD8E528C6 | n13) & length3)];
                                    final int length4 = array4.length;
                                    final byte b2 = array3[(length4 ^ n14) + (length4 | n13) * 2 + 1];
                                    array4[(length2 | n13) * 2 - (length2 ^ n13)] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                                    final int n15 = ~n4 + n4 * 2;
                                    final long n16 = lcmp((long)n4, (long)2) >>> 31 & 0x1;
                                    if (n16 != 0) {
                                        n5 = 986083301;
                                    }
                                    else {
                                        n5 = 1621215041;
                                    }
                                    n2 = n15;
                                    if (n16 != 0) {
                                        n2 = n15;
                                        continue;
                                    }
                                    break Label_0566;
                                }
                                case 373627814: {
                                    break Label_0401;
                                }
                                case 298177592: {
                                    final int length5 = array4.length;
                                    final int n17 = 0 - n4;
                                    final int a2 = L.a(n, (length5 & 0x2) | N.a(n17, -4, 1, length5), n17 * 3, 1);
                                    final byte b3 = array3[a2];
                                    final int length6 = array4.length;
                                    final int n18 = 0 - n17;
                                    final int n19 = n18 | length6;
                                    final byte b4 = array3[O.a(n18, 2, n19, length6 ^ n18 ^ n19)];
                                    array3[a2] = (byte)((byte)(b4 ^ b3) + (byte)((byte)2 * (byte)(b4 & b3)));
                                    n5 = 1565752577;
                                    continue;
                                }
                                case -97532338: {
                                    final int n20 = array4.length % 4;
                                    final long n21 = lcmp((long)n20, (long)1) >>> 31 & 0x1;
                                    if (n21 != 0) {
                                        n5 = 986083301;
                                    }
                                    else {
                                        n5 = 1621215041;
                                    }
                                    n2 = n20;
                                    if (n21 != 0) {
                                        n2 = n20;
                                        continue;
                                    }
                                    break Label_0566;
                                }
                                case -870579640: {
                                    final int n22 = n3 - 1 - (n3 | 0xFFFFFFFC);
                                    final byte b5 = array3[n22];
                                    final int n23 = (b5 & 0x1000000) * (b5 | 0x1000000) + (b5 & 0xFEFFFFFF) * (~b5 & 0x1000000);
                                    final int n24 = n3 + 3 + (-1 - n3 | 0xFFFFFFFD);
                                    final int n25 = array3[n24] & 0xFF;
                                    final int n26 = n25 * (~n25 & 0x10000);
                                    final int n27 = ~((0xB46B5CF6 | ~n26 | n23) - ((n26 & 0xB46B5CF6) | n23));
                                    final int a3 = K.a(0xF821C5CC & n3, n3, 1, 0xF821C5CD & n3);
                                    final int n28 = array3[a3] & 0xFF;
                                    final int n29 = n28 * (~n28 & 0x100);
                                    final int n30 = array3[n3] & 0xFF;
                                    final int n31 = (n29 + n27 - (n29 & n27) & ~n30) + n30;
                                    final byte b6 = array4[n22];
                                    final int n32 = (b6 & 0x1000000) * (b6 | 0x1000000) + (0xFEFFFFFF & b6) * (~b6 & 0x1000000);
                                    final int n33 = array4[n24] & 0xFF;
                                    final int n34 = n33 * (~n33 & 0x10000);
                                    final int n35 = ~((n32 | (~n34 | 0xAF2F3113)) - ((n34 & 0xAF2F3113) | n32));
                                    final int n36 = array4[a3] & 0xFF;
                                    final int n37 = n36 * (~n36 & 0x100);
                                    final int a4 = J.a(n37, n35, 1, -1 - n37 | -1 - n35);
                                    final int n38 = a4 - 1 - (~(array4[n3] & 0xFF) | a4);
                                    final int n39 = n31 << (dcmpg((double)n31, Double.NaN) >>> 31);
                                    final int n40 = (n39 ^ 0xE715D017) + (n39 & 0xE715D017) * 2;
                                    final int n41 = n40 + n38 - (n40 & n38) * 2;
                                    array4[n3] = (byte)n41;
                                    array4[a3] = (byte)(n41 >>> 8);
                                    array4[n24] = (byte)(n41 >>> 16);
                                    array4[n22] = (byte)(n41 >>> 24);
                                    n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                                    final int length7 = array4.length;
                                    final int a5 = com.aheaditec.talsec.security.a.a(array4.length, 4, 0, 0);
                                    if ((lcmp((long)n3, (long)((length7 & ~a5) * 2 - (length7 ^ a5))) >>> 31 & 0x1) != 0x0) {
                                        n5 = 1910359311;
                                        n = 0;
                                        continue;
                                    }
                                    n = 0;
                                    break Label_1032;
                                }
                                case -2000520841: {
                                    final int length8 = array4.length;
                                    final int n42 = 0 - (0 - n2);
                                    int n43 = n8;
                                    if (dcmpg((double)array3[(length8 & ~n42) * 2 - (length8 ^ n42)], Double.NaN) <= -1) {
                                        n43 = 0;
                                    }
                                    if (n43 != 0) {
                                        n5 = 1565752577;
                                    }
                                    else {
                                        n5 = 1621215041;
                                    }
                                    if (n43 == 0) {
                                        n5 = -1164716566;
                                    }
                                    n4 = n2;
                                    n = 0;
                                    continue;
                                }
                            }
                            continue;
                        }
                        n5 = -1138188205;
                        continue;
                    }
                    n5 = 1621215041;
                }
            }
            
            public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                return ((s1$e)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Continuation<Unit> create(final Object o, final Continuation<?> continuation) {
                return (Continuation<Unit>)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.b, this.c, this.d, continuation) {
                    public int a;
                    public final s1 b;
                    public final Context c;
                    public final long d;
                    
                    public static void a(final byte[] array, final byte[] array2) {
                        int n = 0;
                        byte[] array3 = null;
                        int n2 = 0;
                        int n4;
                        int n3 = n4 = 0;
                        int n5 = 1180709023;
                        byte[] array4 = null;
                    Label_0401:
                        while (true) {
                            final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
                            final int n7 = n5 >>> 8;
                            final int n8 = 1;
                            final int n9 = 1;
                            final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
                            final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
                            Label_1032: {
                                Label_0566: {
                                    switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                                        default: {
                                            break Label_1032;
                                        }
                                        case 1548321255: {
                                            final int length = array.length;
                                            final int n11 = 0 - (0 - array.length % 4);
                                            int n12 = n9;
                                            if ((length & ~n11) - (~length & n11) <= 0) {
                                                n12 = n;
                                            }
                                            if (n12 != 0) {
                                                n5 = 1910359311;
                                            }
                                            else {
                                                n5 = 1621215041;
                                            }
                                            array3 = array2;
                                            array4 = array;
                                            n3 = n;
                                            continue;
                                        }
                                        case 975213712: {
                                            final int length2 = array4.length;
                                            final int n13 = 0 - n4;
                                            final int length3 = array4.length;
                                            final int n14 = ~n13;
                                            final byte b = array4[(length3 | n13) - (0xD8E528C6 & n14 & length3) + ((0xD8E528C6 | n13) & length3)];
                                            final int length4 = array4.length;
                                            final byte b2 = array3[(length4 ^ n14) + (length4 | n13) * 2 + 1];
                                            array4[(length2 | n13) * 2 - (length2 ^ n13)] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                                            final int n15 = ~n4 + n4 * 2;
                                            final long n16 = lcmp((long)n4, (long)2) >>> 31 & 0x1;
                                            if (n16 != 0) {
                                                n5 = 986083301;
                                            }
                                            else {
                                                n5 = 1621215041;
                                            }
                                            n2 = n15;
                                            if (n16 != 0) {
                                                n2 = n15;
                                                continue;
                                            }
                                            break Label_0566;
                                        }
                                        case 373627814: {
                                            break Label_0401;
                                        }
                                        case 298177592: {
                                            final int length5 = array4.length;
                                            final int n17 = 0 - n4;
                                            final int a2 = L.a(n, (length5 & 0x2) | N.a(n17, -4, 1, length5), n17 * 3, 1);
                                            final byte b3 = array3[a2];
                                            final int length6 = array4.length;
                                            final int n18 = 0 - n17;
                                            final int n19 = n18 | length6;
                                            final byte b4 = array3[O.a(n18, 2, n19, length6 ^ n18 ^ n19)];
                                            array3[a2] = (byte)((byte)(b4 ^ b3) + (byte)((byte)2 * (byte)(b4 & b3)));
                                            n5 = 1565752577;
                                            continue;
                                        }
                                        case -97532338: {
                                            final int n20 = array4.length % 4;
                                            final long n21 = lcmp((long)n20, (long)1) >>> 31 & 0x1;
                                            if (n21 != 0) {
                                                n5 = 986083301;
                                            }
                                            else {
                                                n5 = 1621215041;
                                            }
                                            n2 = n20;
                                            if (n21 != 0) {
                                                n2 = n20;
                                                continue;
                                            }
                                            break Label_0566;
                                        }
                                        case -870579640: {
                                            final int n22 = n3 - 1 - (n3 | 0xFFFFFFFC);
                                            final byte b5 = array3[n22];
                                            final int n23 = (b5 & 0x1000000) * (b5 | 0x1000000) + (b5 & 0xFEFFFFFF) * (~b5 & 0x1000000);
                                            final int n24 = n3 + 3 + (-1 - n3 | 0xFFFFFFFD);
                                            final int n25 = array3[n24] & 0xFF;
                                            final int n26 = n25 * (~n25 & 0x10000);
                                            final int n27 = ~((0xB46B5CF6 | ~n26 | n23) - ((n26 & 0xB46B5CF6) | n23));
                                            final int a3 = K.a(0xF821C5CC & n3, n3, 1, 0xF821C5CD & n3);
                                            final int n28 = array3[a3] & 0xFF;
                                            final int n29 = n28 * (~n28 & 0x100);
                                            final int n30 = array3[n3] & 0xFF;
                                            final int n31 = (n29 + n27 - (n29 & n27) & ~n30) + n30;
                                            final byte b6 = array4[n22];
                                            final int n32 = (b6 & 0x1000000) * (b6 | 0x1000000) + (0xFEFFFFFF & b6) * (~b6 & 0x1000000);
                                            final int n33 = array4[n24] & 0xFF;
                                            final int n34 = n33 * (~n33 & 0x10000);
                                            final int n35 = ~((n32 | (~n34 | 0xAF2F3113)) - ((n34 & 0xAF2F3113) | n32));
                                            final int n36 = array4[a3] & 0xFF;
                                            final int n37 = n36 * (~n36 & 0x100);
                                            final int a4 = J.a(n37, n35, 1, -1 - n37 | -1 - n35);
                                            final int n38 = a4 - 1 - (~(array4[n3] & 0xFF) | a4);
                                            final int n39 = n31 << (dcmpg((double)n31, Double.NaN) >>> 31);
                                            final int n40 = (n39 ^ 0xE715D017) + (n39 & 0xE715D017) * 2;
                                            final int n41 = n40 + n38 - (n40 & n38) * 2;
                                            array4[n3] = (byte)n41;
                                            array4[a3] = (byte)(n41 >>> 8);
                                            array4[n24] = (byte)(n41 >>> 16);
                                            array4[n22] = (byte)(n41 >>> 24);
                                            n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                                            final int length7 = array4.length;
                                            final int a5 = com.aheaditec.talsec.security.a.a(array4.length, 4, 0, 0);
                                            if ((lcmp((long)n3, (long)((length7 & ~a5) * 2 - (length7 ^ a5))) >>> 31 & 0x1) != 0x0) {
                                                n5 = 1910359311;
                                                n = 0;
                                                continue;
                                            }
                                            n = 0;
                                            break Label_1032;
                                        }
                                        case -2000520841: {
                                            final int length8 = array4.length;
                                            final int n42 = 0 - (0 - n2);
                                            int n43 = n8;
                                            if (dcmpg((double)array3[(length8 & ~n42) * 2 - (length8 ^ n42)], Double.NaN) <= -1) {
                                                n43 = 0;
                                            }
                                            if (n43 != 0) {
                                                n5 = 1565752577;
                                            }
                                            else {
                                                n5 = 1621215041;
                                            }
                                            if (n43 == 0) {
                                                n5 = -1164716566;
                                            }
                                            n4 = n2;
                                            n = 0;
                                            continue;
                                        }
                                    }
                                    continue;
                                }
                                n5 = -1138188205;
                                continue;
                            }
                            n5 = 1621215041;
                        }
                    }
                    
                    public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                        return ((s1$e)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                };
            }
            
            public Object invoke(final Object o, final Object o2) {
                return ((s1$e)this.create(o, (Continuation<?>)o2)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Object invokeSuspend(final Object o) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(o);
                    final Runnable a = this.b.a(this.c);
                    final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);
                    final s1 b = this.b;
                    final long d = this.d;
                    b.g = (ScheduledFuture<?>)scheduledThreadPool.scheduleWithFixedDelay(a, d, d, TimeUnit.SECONDS);
                    return Unit.INSTANCE;
                }
                final byte[] array2;
                final byte[] array = array2 = new byte[47];
                array2[0] = -23;
                array2[1] = 9;
                array2[2] = -78;
                array2[3] = 64;
                array2[4] = 121;
                array2[5] = 22;
                array2[6] = 119;
                array2[7] = -85;
                array2[8] = 114;
                array2[9] = 45;
                array2[10] = -15;
                array2[11] = 80;
                array2[12] = 96;
                array2[13] = -65;
                array2[14] = 103;
                array2[15] = -33;
                array2[16] = -3;
                array2[17] = 37;
                array2[18] = -109;
                array2[19] = -20;
                array2[20] = -66;
                array2[21] = -5;
                array2[22] = -73;
                array2[23] = -47;
                array2[24] = 66;
                array2[25] = 1;
                array2[26] = 8;
                array2[27] = -105;
                array2[28] = -117;
                array2[29] = 22;
                array2[30] = 32;
                array2[31] = -91;
                array2[32] = -26;
                array2[33] = -7;
                array2[34] = -56;
                array2[35] = 19;
                array2[36] = -5;
                array2[37] = -53;
                array2[38] = 65;
                array2[39] = -69;
                array2[40] = 10;
                array2[41] = -16;
                array2[42] = 2;
                array2[43] = 12;
                array2[44] = -34;
                array2[45] = 123;
                array2[46] = 89;
                a(array, new byte[] { 115, -104, -56, 69, 66, -110, 2, -92, 62, -113, 126, 60, -2, 1, -19, 16, -58, 119, -32, -93, -70, -71, -68, 10, 78, -104, 80, -6, -51, -83, 47, -101, -81, -66, -117, -128, 124, 27, 13, -19, 97, -49, 97, -111, -73, 21, 60 });
                throw new IllegalStateException(new String(array, StandardCharsets.UTF_8).intern());
            }
        }, (Continuation)continuation);
        if (withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return withContext;
        }
        return Unit.INSTANCE;
    }
    
    public final Runnable a(final Context context) {
        l1 e;
        if ((e = this.e) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = -28;
            array2[1] = -102;
            array2[2] = 48;
            array2[3] = 80;
            array2[4] = 27;
            array2[5] = 102;
            array2[6] = 76;
            array2[7] = -9;
            array2[8] = -43;
            a(array, new byte[] { -29, -90, 72, -2, -11, 64, -113, 48, 22 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            e = null;
        }
        return (Runnable)new q1(e, context);
    }
    
    public String a(final String s) {
        final byte[] array2;
        final byte[] array = array2 = new byte[5];
        array2[0] = -41;
        array2[1] = 10;
        array2[2] = -21;
        array2[3] = 65;
        array2[4] = 121;
        a(array, new byte[] { 109, 28, -38, 90, 31, -82, -8, 116 });
        Intrinsics.checkNotNullParameter((Object)s, new String(array, StandardCharsets.UTF_8).intern());
        return null;
    }
    
    public final void a() {
        l1 e;
        if ((e = this.e) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 120;
            array2[1] = 14;
            array2[2] = -62;
            array2[3] = 53;
            array2[4] = -35;
            array2[5] = 116;
            array2[6] = -93;
            array2[7] = -34;
            array2[8] = 15;
            a(array, new byte[] { -76, 124, 11, -39, -26, 60, -29, 44, -93 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            e = null;
        }
        e.n.e();
    }
    
    public final void a(final Context context, final long n) {
        BuildersKt.launch$default(this.a, (CoroutineContext)Dispatchers.getDefault(), (CoroutineStart)null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, context, n, null) {
            public int a;
            public final s1 b;
            public final Context c;
            public final long d;
            
            public static void a(final byte[] array, final byte[] array2) {
                byte[] array3 = null;
                int n = -585497720;
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                byte[] array4 = null;
            Label_0804:
                while (true) {
                    final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
                    final int n6 = n >>> 8;
                    final int n7 = ~((~n6 | 0xF1CB17FB | n5) - ((n6 & 0xF1CB17FB) | n5));
                    final int n8 = -1081514022 - ((n7 & 0x2) | -10362931 - n7);
                    final int a = y1.a(n8 | 0xE67A7917, 2, n8, -428181225);
                    n = -1057239115;
                    final int n9 = 1;
                    final int n10 = 1;
                    byte[] array5 = null;
                    byte[] array6 = null;
                    Label_1183: {
                        int n12 = 0;
                        Label_1166: {
                            switch (a) {
                                default: {
                                    n = -897645243;
                                    continue;
                                }
                                case 2013813686: {
                                    n4 = array3.length % 4;
                                    final long n11 = lcmp((long)n4, (long)1) >>> 31 & 0x1;
                                    if (n11 != 0) {
                                        n = 2100390411;
                                    }
                                    else {
                                        n = -897645243;
                                    }
                                    if (n11 != 0) {
                                        continue;
                                    }
                                    n12 = n4;
                                    break Label_1166;
                                }
                                case 1758587480: {
                                    final int length = array3.length;
                                    final int n13 = 0 - n4;
                                    int n14 = n10;
                                    if (dcmpg((double)array4[(length | n13) - (~n13 & 0x310B7971 & length) + ((0x310B7971 | n13) & length)], Double.NaN) <= -1) {
                                        n14 = 0;
                                    }
                                    if (n14 != 0) {
                                        n = -1057239115;
                                    }
                                    else {
                                        n = -897645243;
                                    }
                                    n2 = n4;
                                    continue;
                                }
                                case 783648904: {
                                    final int n15 = n3 + 4 + (-1 - n3 | 0xFFFFFFFC);
                                    final byte b = array4[n15];
                                    final int n16 = (b & 0x1000000) * (b | 0x1000000) + (b & 0xFEFFFFFF) * (~b & 0x1000000);
                                    final int n17 = n3 & 0x2;
                                    final int n18 = n3 + 2 - n17;
                                    final int n19 = array4[n18] & 0xFF;
                                    final int n20 = n19 * (~n19 & 0x10000);
                                    final int n21 = ~((0x1BDAA809 | ~n20 | n16) - ((n20 & 0x1BDAA809) | n16));
                                    final int n22 = n3 + 1 - (n3 & 0x1);
                                    final int n23 = array4[n22] & 0xFF;
                                    final int n24 = n23 * (~n23 & 0x100);
                                    final int n25 = ~((n21 | (~n24 | 0x4F34C9EF)) - ((n24 & 0x4F34C9EF) | n21));
                                    final int n26 = array4[n3] & 0xFF;
                                    final int a2 = J.a(n25, n26, 1, -1 - n25 | -1 - n26);
                                    final byte b2 = array3[n15];
                                    final int n27 = (b2 & 0x1000000) * (b2 | 0x1000000) + (0xFEFFFFFF & b2) * (~b2 & 0x1000000);
                                    final int n28 = array3[n18] & 0xFF;
                                    final int n29 = n28 * (~n28 & 0x10000);
                                    final int a3 = K.a(~n27 & 0x622BED86 & n29, n29, n27, (0x622BED86 | n27) & n29);
                                    final int n30 = array3[n22] & 0xFF;
                                    final int n31 = n30 * (~n30 & 0x100);
                                    final int n32 = ~((a3 | (~n31 | 0x853F6546)) - ((0x853F6546 & n31) | a3));
                                    final int n33 = array3[n3] & 0xFF;
                                    final int a4 = J.a(n32, n33, 1, -1 - n32 | -1 - n33);
                                    final int n34 = a2 << (dcmpg((double)a2, Double.NaN) >>> 31);
                                    final int n35 = n34 + a4 - (n34 & a4) * 2;
                                    array3[n3] = (byte)n35;
                                    array3[n22] = (byte)(n35 >>> 8);
                                    array3[n18] = (byte)(n35 >>> 16);
                                    array3[n15] = (byte)(n35 >>> 24);
                                    final int n36 = -11 - (-15 - n3 | n17);
                                    final int length2 = array3.length;
                                    final int a5 = com.aheaditec.talsec.security.a.a(array3.length, 4, 0, 0);
                                    final long n37 = lcmp((long)n36, (long)((length2 & ~a5) * 2 - (length2 ^ a5))) >>> 31 & 0x1;
                                    if (n37 != 0) {
                                        n = -897645243;
                                    }
                                    else {
                                        n = 1251644638;
                                    }
                                    n3 = n36;
                                    if (n37 != 0) {
                                        n = -1469476344;
                                        n3 = n36;
                                        continue;
                                    }
                                    continue;
                                }
                                case 769572960: {
                                    break Label_0804;
                                }
                                case -477594107: {
                                    final int length3 = array3.length;
                                    final int n38 = 0 - n2;
                                    final int n39 = (length3 | n38) - (0xE14783F0 & ~n38 & length3) + ((n38 | 0xE14783F0) & length3);
                                    final byte b3 = array4[n39];
                                    final int length4 = array3.length;
                                    final byte b4 = array4[(n38 | length4) * 2 - (length4 ^ n38)];
                                    final int n40 = (byte)0 - (byte)b3;
                                    final int n41 = n40 | b4;
                                    array4[n39] = (byte)((byte)((byte)n41 - (byte)((byte)2 * (byte)n40)) + (byte)(b4 ^ n40 ^ n41));
                                    continue;
                                }
                                case -1350640889: {
                                    final int length5 = array.length;
                                    final int n42 = 0 - array.length % 4;
                                    int n43 = n9;
                                    if ((length5 | n42) - (0x3831AA16 & ~n42 & length5) + ((n42 | 0x3831AA16) & length5) <= 0) {
                                        n43 = 0;
                                    }
                                    if (n43 != 0) {
                                        n = -897645243;
                                    }
                                    else {
                                        n = 1251644638;
                                    }
                                    if (n43 != 0) {
                                        n = -1469476344;
                                    }
                                    array5 = array2;
                                    array6 = array;
                                    n3 = 0;
                                    break Label_1183;
                                }
                                case -1819084085: {
                                    final int length6 = array3.length;
                                    final int n44 = 0 - n2;
                                    final int length7 = array3.length;
                                    final int n45 = 0 - n44;
                                    final byte b5 = array3[(length7 & ~n45) - (~length7 & n45)];
                                    final int length8 = array3.length;
                                    final byte b6 = array4[(length8 | n44) - (0x9BFB9859 & ~n44 & length8) + ((n44 | 0x9BFB9859) & length8)];
                                    array3[(length6 | n44) * 2 - (length6 ^ n44)] = (byte)((byte)((byte)((byte)2 * (byte)(b6 | b5)) - (byte)b6) - (byte)b5);
                                    final int n46 = 4 - (5 - n2 | (n2 & 0x2));
                                    final long n47 = lcmp((long)n2, (long)2) >>> 31 & 0x1;
                                    int n48;
                                    if (n47 != 0) {
                                        n48 = 2100390411;
                                    }
                                    else {
                                        n48 = -897645243;
                                    }
                                    n12 = n46;
                                    if (n47 != 0) {
                                        n = n48;
                                        n4 = n46;
                                        continue;
                                    }
                                    break Label_1166;
                                }
                            }
                            continue;
                        }
                        final int n49 = -2079636786;
                        n4 = n12;
                        array5 = array4;
                        array6 = array3;
                        n = n49;
                    }
                    array3 = array6;
                    array4 = array5;
                }
            }
            
            public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                return ((s1$d)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Continuation<Unit> create(final Object o, final Continuation<?> continuation) {
                return (Continuation<Unit>)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.b, this.c, this.d, continuation) {
                    public int a;
                    public final s1 b;
                    public final Context c;
                    public final long d;
                    
                    public static void a(final byte[] array, final byte[] array2) {
                        byte[] array3 = null;
                        int n = -585497720;
                        int n2 = 0;
                        int n3 = 0;
                        int n4 = 0;
                        byte[] array4 = null;
                    Label_0804:
                        while (true) {
                            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
                            final int n6 = n >>> 8;
                            final int n7 = ~((~n6 | 0xF1CB17FB | n5) - ((n6 & 0xF1CB17FB) | n5));
                            final int n8 = -1081514022 - ((n7 & 0x2) | -10362931 - n7);
                            final int a = y1.a(n8 | 0xE67A7917, 2, n8, -428181225);
                            n = -1057239115;
                            final int n9 = 1;
                            final int n10 = 1;
                            byte[] array5 = null;
                            byte[] array6 = null;
                            Label_1183: {
                                int n12 = 0;
                                Label_1166: {
                                    switch (a) {
                                        default: {
                                            n = -897645243;
                                            continue;
                                        }
                                        case 2013813686: {
                                            n4 = array3.length % 4;
                                            final long n11 = lcmp((long)n4, (long)1) >>> 31 & 0x1;
                                            if (n11 != 0) {
                                                n = 2100390411;
                                            }
                                            else {
                                                n = -897645243;
                                            }
                                            if (n11 != 0) {
                                                continue;
                                            }
                                            n12 = n4;
                                            break Label_1166;
                                        }
                                        case 1758587480: {
                                            final int length = array3.length;
                                            final int n13 = 0 - n4;
                                            int n14 = n10;
                                            if (dcmpg((double)array4[(length | n13) - (~n13 & 0x310B7971 & length) + ((0x310B7971 | n13) & length)], Double.NaN) <= -1) {
                                                n14 = 0;
                                            }
                                            if (n14 != 0) {
                                                n = -1057239115;
                                            }
                                            else {
                                                n = -897645243;
                                            }
                                            n2 = n4;
                                            continue;
                                        }
                                        case 783648904: {
                                            final int n15 = n3 + 4 + (-1 - n3 | 0xFFFFFFFC);
                                            final byte b = array4[n15];
                                            final int n16 = (b & 0x1000000) * (b | 0x1000000) + (b & 0xFEFFFFFF) * (~b & 0x1000000);
                                            final int n17 = n3 & 0x2;
                                            final int n18 = n3 + 2 - n17;
                                            final int n19 = array4[n18] & 0xFF;
                                            final int n20 = n19 * (~n19 & 0x10000);
                                            final int n21 = ~((0x1BDAA809 | ~n20 | n16) - ((n20 & 0x1BDAA809) | n16));
                                            final int n22 = n3 + 1 - (n3 & 0x1);
                                            final int n23 = array4[n22] & 0xFF;
                                            final int n24 = n23 * (~n23 & 0x100);
                                            final int n25 = ~((n21 | (~n24 | 0x4F34C9EF)) - ((n24 & 0x4F34C9EF) | n21));
                                            final int n26 = array4[n3] & 0xFF;
                                            final int a2 = J.a(n25, n26, 1, -1 - n25 | -1 - n26);
                                            final byte b2 = array3[n15];
                                            final int n27 = (b2 & 0x1000000) * (b2 | 0x1000000) + (0xFEFFFFFF & b2) * (~b2 & 0x1000000);
                                            final int n28 = array3[n18] & 0xFF;
                                            final int n29 = n28 * (~n28 & 0x10000);
                                            final int a3 = K.a(~n27 & 0x622BED86 & n29, n29, n27, (0x622BED86 | n27) & n29);
                                            final int n30 = array3[n22] & 0xFF;
                                            final int n31 = n30 * (~n30 & 0x100);
                                            final int n32 = ~((a3 | (~n31 | 0x853F6546)) - ((0x853F6546 & n31) | a3));
                                            final int n33 = array3[n3] & 0xFF;
                                            final int a4 = J.a(n32, n33, 1, -1 - n32 | -1 - n33);
                                            final int n34 = a2 << (dcmpg((double)a2, Double.NaN) >>> 31);
                                            final int n35 = n34 + a4 - (n34 & a4) * 2;
                                            array3[n3] = (byte)n35;
                                            array3[n22] = (byte)(n35 >>> 8);
                                            array3[n18] = (byte)(n35 >>> 16);
                                            array3[n15] = (byte)(n35 >>> 24);
                                            final int n36 = -11 - (-15 - n3 | n17);
                                            final int length2 = array3.length;
                                            final int a5 = com.aheaditec.talsec.security.a.a(array3.length, 4, 0, 0);
                                            final long n37 = lcmp((long)n36, (long)((length2 & ~a5) * 2 - (length2 ^ a5))) >>> 31 & 0x1;
                                            if (n37 != 0) {
                                                n = -897645243;
                                            }
                                            else {
                                                n = 1251644638;
                                            }
                                            n3 = n36;
                                            if (n37 != 0) {
                                                n = -1469476344;
                                                n3 = n36;
                                                continue;
                                            }
                                            continue;
                                        }
                                        case 769572960: {
                                            break Label_0804;
                                        }
                                        case -477594107: {
                                            final int length3 = array3.length;
                                            final int n38 = 0 - n2;
                                            final int n39 = (length3 | n38) - (0xE14783F0 & ~n38 & length3) + ((n38 | 0xE14783F0) & length3);
                                            final byte b3 = array4[n39];
                                            final int length4 = array3.length;
                                            final byte b4 = array4[(n38 | length4) * 2 - (length4 ^ n38)];
                                            final int n40 = (byte)0 - (byte)b3;
                                            final int n41 = n40 | b4;
                                            array4[n39] = (byte)((byte)((byte)n41 - (byte)((byte)2 * (byte)n40)) + (byte)(b4 ^ n40 ^ n41));
                                            continue;
                                        }
                                        case -1350640889: {
                                            final int length5 = array.length;
                                            final int n42 = 0 - array.length % 4;
                                            int n43 = n9;
                                            if ((length5 | n42) - (0x3831AA16 & ~n42 & length5) + ((n42 | 0x3831AA16) & length5) <= 0) {
                                                n43 = 0;
                                            }
                                            if (n43 != 0) {
                                                n = -897645243;
                                            }
                                            else {
                                                n = 1251644638;
                                            }
                                            if (n43 != 0) {
                                                n = -1469476344;
                                            }
                                            array5 = array2;
                                            array6 = array;
                                            n3 = 0;
                                            break Label_1183;
                                        }
                                        case -1819084085: {
                                            final int length6 = array3.length;
                                            final int n44 = 0 - n2;
                                            final int length7 = array3.length;
                                            final int n45 = 0 - n44;
                                            final byte b5 = array3[(length7 & ~n45) - (~length7 & n45)];
                                            final int length8 = array3.length;
                                            final byte b6 = array4[(length8 | n44) - (0x9BFB9859 & ~n44 & length8) + ((n44 | 0x9BFB9859) & length8)];
                                            array3[(length6 | n44) * 2 - (length6 ^ n44)] = (byte)((byte)((byte)((byte)2 * (byte)(b6 | b5)) - (byte)b6) - (byte)b5);
                                            final int n46 = 4 - (5 - n2 | (n2 & 0x2));
                                            final long n47 = lcmp((long)n2, (long)2) >>> 31 & 0x1;
                                            int n48;
                                            if (n47 != 0) {
                                                n48 = 2100390411;
                                            }
                                            else {
                                                n48 = -897645243;
                                            }
                                            n12 = n46;
                                            if (n47 != 0) {
                                                n = n48;
                                                n4 = n46;
                                                continue;
                                            }
                                            break Label_1166;
                                        }
                                    }
                                    continue;
                                }
                                final int n49 = -2079636786;
                                n4 = n12;
                                array5 = array4;
                                array6 = array3;
                                n = n49;
                            }
                            array3 = array6;
                            array4 = array5;
                        }
                    }
                    
                    public final Object a(final CoroutineScope coroutineScope, final Continuation<? super Unit> continuation) {
                        return ((s1$d)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                };
            }
            
            public Object invoke(final Object o, final Object o2) {
                return ((s1$d)this.create(o, (Continuation<?>)o2)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Object invokeSuspend(final Object o) {
                final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                final int a = this.a;
                final R0 r0 = null;
                if (a != 0) {
                    if (a != 1) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[47];
                        array2[0] = -16;
                        array2[1] = -55;
                        array2[2] = 10;
                        array2[3] = 83;
                        array2[4] = 124;
                        array2[5] = -65;
                        array2[6] = -38;
                        array2[7] = -11;
                        array2[8] = -27;
                        array2[9] = 107;
                        array2[10] = 0;
                        array2[11] = 64;
                        array2[12] = 3;
                        array2[13] = 56;
                        array2[14] = -105;
                        array2[15] = 28;
                        array2[16] = -84;
                        array2[17] = -30;
                        array2[18] = 73;
                        array2[19] = 41;
                        array2[20] = -64;
                        array2[21] = 85;
                        array2[22] = -29;
                        array2[23] = -63;
                        array2[24] = 122;
                        array2[25] = 82;
                        array2[26] = -88;
                        array2[27] = 2;
                        array2[28] = 112;
                        array2[29] = -56;
                        array2[30] = 97;
                        array2[31] = -30;
                        array2[32] = -112;
                        array2[33] = 51;
                        array2[34] = 114;
                        array2[35] = -9;
                        array2[36] = -103;
                        array2[37] = -101;
                        array2[38] = -14;
                        array2[39] = 109;
                        array2[40] = 6;
                        array2[41] = -17;
                        array2[42] = -48;
                        array2[43] = 65;
                        array2[44] = -92;
                        array2[45] = -128;
                        array2[46] = -38;
                        a(array, new byte[] { -109, -88, 102, 63, 92, -53, -75, -43, -62, 25, 101, 51, 118, 85, -14, 59, -116, -128, 44, 79, -81, 39, -122, -31, 93, 59, -58, 116, 31, -93, 4, -59, -80, 68, 27, -125, -15, -69, -111, 2, 116, -128, -91, 53, -51, -18, -65 });
                        throw new IllegalStateException(new String(array, StandardCharsets.UTF_8).intern());
                    }
                    ResultKt.throwOnFailure(o);
                }
                else {
                    ResultKt.throwOnFailure(o);
                    l1 b;
                    if ((b = s1.b(this.b)) == null) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[9];
                        array4[0] = -36;
                        array4[1] = 114;
                        array4[2] = 43;
                        array4[3] = -51;
                        array4[4] = -82;
                        array4[5] = -30;
                        array4[6] = 91;
                        array4[7] = -74;
                        array4[8] = 23;
                        a(array3, new byte[] { -72, 23, 95, -88, -51, -106, 52, -60, 100 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array3, StandardCharsets.UTF_8).intern());
                        b = null;
                    }
                    final List c = b.c();
                    final byte[] array6;
                    final byte[] array5 = array6 = new byte[17];
                    array6[0] = 92;
                    array6[1] = 30;
                    array6[2] = 53;
                    array6[3] = 28;
                    array6[4] = -39;
                    array6[5] = -20;
                    array6[6] = 8;
                    array6[7] = 11;
                    array6[8] = -66;
                    array6[9] = -42;
                    array6[10] = 92;
                    array6[11] = 108;
                    array6[12] = 37;
                    array6[13] = -128;
                    array6[14] = 59;
                    array6[15] = 83;
                    array6[16] = -37;
                    a(array5, new byte[] { 59, 123, 65, 88, -68, -104, 109, 104, -54, -71, 46, 31, 13, -82, 21, 125, -14 });
                    Intrinsics.checkNotNullExpressionValue((Object)c, new String(array5, StandardCharsets.UTF_8).intern());
                    final Context c2 = this.c;
                    for (final b0 b2 : (ArrayList)c) {
                        if (b2 != null) {
                            b2.a(c2);
                        }
                    }
                    this.b.d();
                    l1 e;
                    if ((e = this.b.e) == null) {
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[9];
                        array8[0] = -21;
                        array8[1] = -15;
                        array8[2] = 44;
                        array8[3] = -1;
                        array8[4] = 45;
                        array8[5] = -105;
                        array8[6] = 87;
                        array8[7] = 47;
                        array8[8] = 82;
                        a(array7, new byte[] { -113, -108, 88, -102, 78, -29, 56, 93, 33 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array7, StandardCharsets.UTF_8).intern());
                        e = null;
                    }
                    e.a.e(this.c);
                    E1 d;
                    if ((d = this.b.d) == null) {
                        final byte[] array10;
                        final byte[] array9 = array10 = new byte[8];
                        array10[0] = -7;
                        array10[1] = -31;
                        array10[2] = 109;
                        array10[3] = -20;
                        array10[4] = 21;
                        array10[5] = 57;
                        array10[6] = -66;
                        array10[7] = -72;
                        a(array9, new byte[] { -117, -124, 12, -113, 97, 80, -47, -42 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array9, StandardCharsets.UTF_8).intern());
                        d = null;
                    }
                    d.c();
                    final s1 b3 = this.b;
                    final Context c3 = this.c;
                    final long d2 = this.d;
                    this.a = 1;
                    if (b3.a(c3, d2, (Continuation<? super Unit>)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                R0 c4 = s1.c(this.b);
                if (c4 == null) {
                    final byte[] array12;
                    final byte[] array11 = array12 = new byte[6];
                    array12[0] = 104;
                    array12[1] = 7;
                    array12[2] = -64;
                    array12[3] = -50;
                    array12[4] = -23;
                    array12[5] = 66;
                    a(array11, new byte[] { 4, 104, -89, -87, -116, 48, -42, 99 });
                    Intrinsics.throwUninitializedPropertyAccessException(new String(array11, StandardCharsets.UTF_8).intern());
                    c4 = r0;
                }
                c4.a(this.c);
                return Unit.INSTANCE;
            }
        }, 2, (Object)null);
    }
    
    public final void a(final Context context, final TalsecConfig talsecConfig) {
        BuildersKt.launch$default(this.a, (CoroutineContext)Dispatchers.getDefault(), (CoroutineStart)null, (Function2)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(context, this, talsecConfig, null) {
            public int a;
            public final Context b;
            public final s1 c;
            public final TalsecConfig d;
            
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
                return ((s1$c)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Continuation<Unit> create(final Object o, final Continuation<?> continuation) {
                return (Continuation<Unit>)new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.b, this.c, this.d, continuation) {
                    public int a;
                    public final Context b;
                    public final s1 c;
                    public final TalsecConfig d;
                    
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
                        return ((s1$c)this.create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                };
            }
            
            public Object invoke(final Object o, final Object o2) {
                return ((s1$c)this.create(o, (Continuation<?>)o2)).invokeSuspend(Unit.INSTANCE);
            }
            
            public final Object invokeSuspend(final Object o) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(o);
                    a1.a.a(this.b);
                    final l1 b = s1.b(this.c);
                    final l1 l1 = null;
                    l1 l2;
                    if ((l2 = b) == null) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[9];
                        array2[0] = 105;
                        array2[1] = 114;
                        array2[2] = 35;
                        array2[3] = 25;
                        array2[4] = -110;
                        array2[5] = 73;
                        array2[6] = -28;
                        array2[7] = 80;
                        array2[8] = -36;
                        a(array, new byte[] { 13, 23, 87, 124, -15, 61, -117, 34, -81 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
                        l2 = null;
                    }
                    l2.a((L0)K0.b.a(this.d), (V0)null);
                    l1 e = this.c.e;
                    if (e == null) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[9];
                        array4[0] = 5;
                        array4[1] = -104;
                        array4[2] = -10;
                        array4[3] = -120;
                        array4[4] = 98;
                        array4[5] = 113;
                        array4[6] = -20;
                        array4[7] = 87;
                        array4[8] = 32;
                        a(array3, new byte[] { 97, -3, -126, -19, 1, 5, -125, 37, 83 });
                        Intrinsics.throwUninitializedPropertyAccessException(new String(array3, StandardCharsets.UTF_8).intern());
                        e = l1;
                    }
                    final M0 u = e.u;
                    if (u != null) {
                        u.a(this.b);
                    }
                    return Unit.INSTANCE;
                }
                final byte[] array6;
                final byte[] array5 = array6 = new byte[47];
                array6[0] = 49;
                array6[1] = 92;
                array6[2] = 102;
                array6[3] = 15;
                array6[4] = 26;
                array6[5] = 117;
                array6[6] = -10;
                array6[7] = 67;
                array6[8] = 29;
                array6[9] = -120;
                array6[10] = -23;
                array6[11] = 94;
                array6[12] = 115;
                array6[13] = 74;
                array6[14] = 47;
                array6[15] = 93;
                array6[16] = -107;
                array6[17] = 48;
                array6[18] = 23;
                array6[19] = 36;
                array6[20] = -120;
                array6[21] = 119;
                array6[22] = 3;
                array6[23] = -17;
                array6[24] = 10;
                array6[25] = -29;
                array6[26] = -105;
                array6[27] = -122;
                array6[28] = -15;
                array6[29] = -70;
                array6[30] = -58;
                array6[31] = 99;
                array6[32] = -64;
                array6[33] = 103;
                array6[34] = 42;
                array6[35] = 21;
                array6[36] = -73;
                array6[37] = 103;
                array6[38] = -92;
                array6[39] = 72;
                array6[40] = 7;
                array6[41] = -16;
                array6[42] = 95;
                array6[43] = -83;
                array6[44] = -28;
                array6[45] = -14;
                array6[46] = 96;
                a(array5, new byte[] { 82, 61, 10, 99, 58, 1, -103, 99, 58, -6, -116, 45, 6, 39, 74, 122, -75, 82, 114, 66, -25, 5, 102, -49, 45, -118, -7, -16, -98, -47, -93, 68, -32, 16, 67, 97, -33, 71, -57, 39, 117, -97, 42, -39, -115, -100, 5 });
                throw new IllegalStateException(new String(array5, StandardCharsets.UTF_8).intern());
            }
        }, 2, (Object)null);
    }
    
    public final void b() {
        l1 e;
        if ((e = this.e) == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 65;
            array2[1] = 47;
            array2[2] = 2;
            array2[3] = -58;
            array2[4] = -112;
            array2[5] = -123;
            array2[6] = 30;
            array2[7] = -23;
            array2[8] = 92;
            a(array, new byte[] { -10, 47, 4, 110, -80, -64, -85, 77, -96 });
            Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
            e = null;
        }
        e.m.e();
    }
    
    public final void c() {
        final ScheduledFuture<?> g = this.g;
        if (g != null) {
            ((Future)g).cancel(true);
        }
        final G1 f = this.f;
        if (f != null) {
            G1 g2;
            if ((g2 = f) == null) {
                final byte[] array2;
                final byte[] array = array2 = new byte[11];
                array2[0] = 103;
                array2[1] = -51;
                array2[2] = -4;
                array2[3] = -89;
                array2[4] = -82;
                array2[5] = -57;
                array2[6] = -24;
                array2[7] = 104;
                array2[8] = -69;
                array2[9] = -105;
                array2[10] = -60;
                a(array, new byte[] { -98, -81, -12, -38, 49, -104, -78, -125, -74, 118, 4 });
                Intrinsics.throwUninitializedPropertyAccessException(new String(array, StandardCharsets.UTF_8).intern());
                g2 = null;
            }
            g2.c();
        }
    }
    
    public final void d() {
        if (Talsec.isScreenshotIncidentCached()) {
            this.b();
        }
        if (Talsec.isScreenRecordingIncidentCached()) {
            this.a();
        }
    }
    
    public static final class b
    {
        public b() {
        }
        
        public b(final DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
