package com.aheaditec.talsec.security;

import java.util.concurrent.Executor;
import android.os.Build;
import java.util.ArrayList;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider;
import com.fingerprintjs.android.fingerprint.tools.hashers.Hasher;
import java.util.List;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import kotlin.jvm.functions.Function1;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.FingerprinterFactory;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.StandardCharsets;
import kotlin.Unit;
import java.util.concurrent.Executors;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.CountDownLatch;
import com.fingerprintjs.android.fingerprint.DeviceIdResult;

public final class h0 implements g0
{
    public static final a e;
    public static volatile h0 f;
    public DeviceIdResult a;
    public String b;
    public final CountDownLatch c;
    public final ExecutorService d;
    
    static {
        e = new a(null);
    }
    
    public h0(final Context context) {
        this.c = new CountDownLatch(2);
        ((Executor)(this.d = Executors.newSingleThreadExecutor())).execute((Runnable)new h0$$ExternalSyntheticLambda1(context, this));
    }
    
    public static final Unit a(final h0 h0, final DeviceIdResult a) {
        final byte[] array2;
        final byte[] array = array2 = new byte[6];
        array2[0] = -110;
        array2[1] = -78;
        array2[2] = 101;
        array2[3] = 37;
        array2[4] = 89;
        array2[5] = 5;
        a(array, new byte[] { -47, 53, 125, -32, 84, 41, -61, 116 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)h0, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = -46;
        array4[1] = -74;
        array4[2] = -5;
        array4[3] = -71;
        array4[4] = 66;
        array4[5] = -12;
        a(array3, new byte[] { 117, -128, 46, 10, -39, -126, 36, -41 });
        Intrinsics.checkNotNullParameter((Object)a, new String(array3, utf_8).intern());
        h0.a = a;
        h0.c.countDown();
        return Unit.INSTANCE;
    }
    
    public static final void a(final Context context, final h0 h0) {
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = -44;
        array2[1] = 49;
        array2[2] = 20;
        array2[3] = -102;
        array2[4] = 127;
        array2[5] = -23;
        array2[6] = 20;
        array2[7] = -15;
        a(array, new byte[] { 30, 111, -118, 42, 125, -48, 122, 109 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)context, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = 67;
        array4[1] = -106;
        array4[2] = 93;
        array4[3] = 16;
        array4[4] = 3;
        array4[5] = -99;
        a(array3, new byte[] { 34, -83, 39, -109, 61, -30, -67, -110 });
        Intrinsics.checkNotNullParameter((Object)h0, new String(array3, utf_8).intern());
    Label_0248:
        while (true) {
            try {
                try {
                    final Fingerprinter create = FingerprinterFactory.create(context);
                    h0.a(create);
                    h0.b(create);
                    h0.d.shutdown();
                }
                finally {}
            }
            catch (final Exception ex) {
                final byte[] array6;
                final byte[] array5 = array6 = new byte[17];
                array6[0] = -4;
                array6[1] = -8;
                array6[2] = -32;
                array6[3] = -24;
                array6[4] = -35;
                array6[5] = -97;
                array6[6] = -55;
                array6[7] = -28;
                array6[8] = 6;
                array6[9] = -87;
                array6[10] = 49;
                array6[11] = -17;
                array6[12] = -60;
                array6[13] = 68;
                array6[14] = -101;
                array6[15] = -3;
                array6[16] = 85;
                a(array5, new byte[] { -61, 38, -74, 79, 9, -80, 94, -102, -33, -29, -96, -73, -80, -125, -120, 95, 89 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                new String(array5, utf_9).intern();
                final byte[] array8;
                final byte[] array7 = array8 = new byte[37];
                array8[0] = -88;
                array8[1] = 109;
                array8[2] = 108;
                array8[3] = 84;
                array8[4] = 119;
                array8[5] = -29;
                array8[6] = -74;
                array8[7] = 85;
                array8[8] = -75;
                array8[9] = -108;
                array8[10] = -73;
                array8[11] = -36;
                array8[12] = -62;
                array8[13] = 59;
                array8[14] = -4;
                array8[15] = 79;
                array8[16] = 51;
                array8[17] = -40;
                array8[18] = 11;
                array8[19] = 98;
                array8[20] = -71;
                array8[21] = 127;
                array8[22] = 55;
                array8[23] = -9;
                array8[24] = -86;
                array8[25] = 11;
                array8[26] = -80;
                array8[27] = 64;
                array8[28] = -54;
                array8[29] = 14;
                array8[30] = -29;
                array8[31] = 109;
                array8[32] = 96;
                array8[33] = 40;
                array8[34] = 82;
                array8[35] = -99;
                array8[36] = 56;
                a(array7, new byte[] { 68, 22, -33, -46, 3, -119, -125, 39, 13, -4, -108, 69, -33, -108, 122, -124, 44, -42, -113, -23, 57, -105, -60, -33, 55, 16, 60, 63, 1, 93, 59, 88, 102, 93, 109, -125, -85 });
                new String(array7, utf_9).intern();
                final long count = h0.c.getCount();
                long n = 0L;
                if (0L > count) {
                    continue Label_0248;
                }
                while (true) {
                    h0.c.countDown();
                    if (n == count) {
                        continue Label_0248;
                    }
                    ++n;
                }
            }
            break;
        }
        return;
        h0.d.shutdown();
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        final int n = ~"com.aheaditec.talsec.security.h0".length();
        int n2 = (~(("com.aheaditec.talsec.security.h0".length() | 0x42FDD19 | n) - (n | ("com.aheaditec.talsec.security.h0".length() & 0xFBD022E6))) & 0x8A042208) + (("com.aheaditec.talsec.security.h0".length() & 0x400C0008) | 0x41280820) ^ 0xCB2C2A28;
        final int a = B1.a((Class)h0.class, -1);
        int n3 = (a | 0x954FECC5) - ((0x14DECC5 | a) ^ 0x9402A001) + (("com.aheaditec.talsec.security.h0".length() | 0x6BFDFFFD) - 1811808253 | 0x20081002) ^ 0xB40AB003;
        int n4 = ((~"com.aheaditec.talsec.security.h0".length() | 0xDDA24923) & 0x10824042) + (("com.aheaditec.talsec.security.h0".length() & 0x9040) | 0x40019001) ^ 0x5083D043;
        int n5 = ((~"com.aheaditec.talsec.security.h0".length() | 0xBAFDFD77) & 0x68A830CC) + (("com.aheaditec.talsec.security.h0".length() & 0x4003889A) | 0x80138C12) ^ 0xE8BBBCDE;
        final int length = "com.aheaditec.talsec.security.h0".length();
        final int length2 = "com.aheaditec.talsec.security.h0".length();
        int n6 = 0x9B7D9791 ^ ((0x1B101411 & length2) ^ 0x80400590) + (length2 & 0x410) + ((~length | 0xE06FE760) & 0x1B3D9201);
        int n7 = (~"com.aheaditec.talsec.security.h0".length() | 0xFFEFBFFF) + 689325073 + (("com.aheaditec.talsec.security.h0".length() & 0x82104800) | 0x824008A8) ^ 0xAB564CB8;
        final int length3 = "com.aheaditec.talsec.security.h0".length();
        final int length4 = "com.aheaditec.talsec.security.h0".length();
        int n8 = ((~length3 | 0x5776618) & 0xC02C8254) + (0x905020 | (length4 | 0xC088C064) - (length4 ^ 0xC088C064)) ^ 0x58FD1772;
        short[] array3 = null;
    Label_1245:
        while (true) {
            int a2 = 0;
            int n11 = 0;
            Label_3569: {
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                Label_2969: {
                    int n27 = 0;
                    int n28 = 0;
                    Label_2216: {
                        int n16 = 0;
                        int n17 = 0;
                        switch (n8) {
                            default: {
                                final int n9 = ~"com.aheaditec.talsec.security.h0".length();
                                final int n10 = (0xED53ECFC | n9) + 45165696 - (n9 | 0xEFF3ECFC);
                                a2 = O.a(n10, 3, -N.a(n10, -4, 1, ("com.aheaditec.talsec.security.h0".length() & 0x2A00020) | 0x94020220), 1);
                                n11 = -361272203;
                                break Label_3569;
                            }
                            case 2093236949: {
                                if (n7 < (((~"com.aheaditec.talsec.security.h0".length() | 0xDB3AB245) & 0x4DB02E10) + (("com.aheaditec.talsec.security.h0".length() & 0x4800D19) | 0x2005010D) ^ 0x6DB52F3D)) {
                                    n12 = ((~"com.aheaditec.talsec.security.h0".length() | 0x4D5991B8) & 0x21320709) + (("com.aheaditec.talsec.security.h0".length() & 0x34222601) | 0x14002004);
                                    n13 = -1287294623 - n12;
                                    n14 = 1287294622;
                                    break Label_2969;
                                }
                                final int n15 = ~"com.aheaditec.talsec.security.h0".length();
                                n16 = (0x4411012E & -1207265904 + n15 + (-n15 - 1 | 0x47F56A70)) + (("com.aheaditec.talsec.security.h0".length() & 0x4D110460) | 0x9000440);
                                n17 = 612868558;
                                break;
                            }
                            case 1771480224: {
                                array[(((~"com.aheaditec.talsec.security.h0".length() | 0x422FD499) & 0x4A01800A) + (("com.aheaditec.talsec.security.h0".length() & 0x9000502) | 0x5082500) ^ 0x4F09A50A) + n2] = (byte)((((~"com.aheaditec.talsec.security.h0".length() | 0x5F9A85FE) & 0x1808350) + (("com.aheaditec.talsec.security.h0".length() | 0xFFEBFDFD) + 1311235 | 0x801400A2) ^ 0x8194830D) & n4);
                                final int length5 = "com.aheaditec.talsec.security.h0".length();
                                final int length6 = "com.aheaditec.talsec.security.h0".length();
                                final int length7 = "com.aheaditec.talsec.security.h0".length();
                                final int length8 = "com.aheaditec.talsec.security.h0".length();
                                array[(((~length5 | 0xAD39FB88) & 0x2A212880) + ((length6 & 0x43020008) | 0x51428008) ^ 0x7B63A889) + n2] = (byte)(n4 >> (((~length7 | 0x15E46274) & 0x20B53110) + (length8 + 558960896 - (length8 | 0x21511100) | 0x1428004) ^ 0x21F7B11C) & (((~"com.aheaditec.talsec.security.h0".length() | 0x7DF43DE4) & 0x3D300832) + (("com.aheaditec.talsec.security.h0".length() & 0x80101A) | 0x82174D) ^ 0x3DB21F80));
                                final int n18 = ((~"com.aheaditec.talsec.security.h0".length() | 0x2AA0B538) & 0x8230514) + (("com.aheaditec.talsec.security.h0".length() & 0x30024) | 0x801010E0);
                                final int a3 = A1.a(~n18 | 0x883315F6, 2, -2009917962 - n18, 2, n2);
                                final int length9 = "com.aheaditec.talsec.security.h0".length();
                                final int length10 = "com.aheaditec.talsec.security.h0".length();
                                final int n19 = ~((length10 & 0x38B80309) + 276825601 - (length10 & 0x10800201));
                                final int n20 = -((~length9 | 0xC3C2F477) & 0x2878811C);
                                array[a3] = (byte)((w1.a(~n20, n19, 2, n19 + n20 + 1) ^ 0x38F887E2) & n5);
                                final int length11 = "com.aheaditec.talsec.security.h0".length();
                                final int length12 = "com.aheaditec.talsec.security.h0".length();
                                final int n21 = ~"com.aheaditec.talsec.security.h0".length();
                                final int a4 = B1.a((Class)h0.class, 0x4763FDFC | n21);
                                final int length13 = "com.aheaditec.talsec.security.h0".length();
                                final int length14 = "com.aheaditec.talsec.security.h0".length();
                                final int length15 = "com.aheaditec.talsec.security.h0".length();
                                final int length16 = "com.aheaditec.talsec.security.h0".length();
                                final int n22 = ("com.aheaditec.talsec.security.h0".length() & 0x20884062) | 0xAA028042;
                                final int n23 = -((~length16 | 0x5F73B59C) & 0x55C844A4);
                                array[(((~length11 | 0xBF552BF4) & 0x1A230910) + ((length12 & 0x4228004) | 0x84048405) ^ 0x9E278D16) + n2] = (byte)(n5 >> (0x7CBDC0FA ^ (length14 | 0x2831C0E0) - (n21 | 0x6F73FDFC) + (a4 + (length13 & 0x2831C0E0)) + ((length15 & 0x68940010) | 0x548C0012)) & (0xFFCAC419 ^ (~n23 & n22) - (n23 & ~n22)));
                                n2 += 4;
                                n16 = ((~"com.aheaditec.talsec.security.h0".length() | 0xF5BFD72F) & 0x13002210) + (("com.aheaditec.talsec.security.h0".length() & 0x2002010) | 0x21402);
                                n17 = -1824662634;
                                break;
                            }
                            case 1734050766: {
                                final int n24 = ~"com.aheaditec.talsec.security.h0".length();
                                if (n2 > 0) {
                                    final int length17 = "com.aheaditec.talsec.security.h0".length();
                                    n16 = ((n24 | 0xEFFADC8E) & 0x10D1006A) + (0xA086800 | length17 + 402735200 - (length17 | 0x18014060));
                                    n17 = -115901203;
                                    break;
                                }
                                final int n25 = ("com.aheaditec.talsec.security.h0".length() & 0x1120000) | 0x21004004;
                                final int n26 = -((n24 | 0x5A0DDFDD) & 0x18120300);
                                n27 = (~n26 & n25) - (n26 & ~n25);
                                n28 = 2001041846;
                                break Label_2216;
                            }
                            case 1314339506: {
                                break Label_1245;
                            }
                            case 998066383: {
                                n2 = (((B1.a((Class)h0.class, -1) | 0x12B95885) & 0x16208A48) + (("com.aheaditec.talsec.security.h0".length() | 0xFBFF7DA7) + 67142233 | 0x89000110) ^ 0x9F208B58);
                                n3 = array.length - array.length % (((~"com.aheaditec.talsec.security.h0".length() | 0x15DACEF5) & 0x501E1A02) + (("com.aheaditec.talsec.security.h0".length() & 0xC4049063) | 0x84008061) ^ 0xD41E9A67);
                                n16 = ((~"com.aheaditec.talsec.security.h0".length() | 0xAEF59C61) & 0x2EC1453) + (("com.aheaditec.talsec.security.h0".length() & 0x91180012) | 0xB9102A00);
                                n17 = 1002689495;
                                break;
                            }
                            case 974072829: {
                                final int length18 = array.length;
                                final int length19 = "com.aheaditec.talsec.security.h0".length();
                                final int n29 = ("com.aheaditec.talsec.security.h0".length() & 0xF006550) | 0x65003700;
                                final int n30 = -((~length19 | 0x65FE9CA7) & 0xA2648F6);
                                n2 = length18 % (0x6F267FF2 ^ (~n30 & n29) - (n30 & ~n29));
                                n16 = ((~"com.aheaditec.talsec.security.h0".length() | 0x3B134AC3) & 0x820C1403) + (("com.aheaditec.talsec.security.h0".length() & 0x900C5408) | 0x11004008);
                                n17 = -195569723;
                                break;
                            }
                            case 766056152: {
                                final int length20 = "com.aheaditec.talsec.security.h0".length();
                                final int length21 = "com.aheaditec.talsec.security.h0".length();
                                final int n31 = length21 + 84675108 - (length21 | 0x50C0A24);
                                if (n2 < (0x6DCD8F6B ^ (~n31 & 0x24440D24) + n31 + ((~length20 | 0xCAF5A54F) & 0x4989824B))) {
                                    final int n32 = (~"com.aheaditec.talsec.security.h0".length() | 0x6FFB14D6) & 0x72014033;
                                    final int n33 = ("com.aheaditec.talsec.security.h0".length() & 0x10025821) | 0xA1888;
                                    n16 = M.a(n32 | n33, 2, ~n32 ^ n33, 1);
                                    n17 = -717449014;
                                    break;
                                }
                                n16 = ((~"com.aheaditec.talsec.security.h0".length() | 0xA7E82FDE) & 0xA0612419) + (("com.aheaditec.talsec.security.h0".length() & 0x40094861) | 0x50084862);
                                n17 = -887872332;
                                break;
                            }
                            case -473033593: {
                                final int length22 = array.length;
                                final int n34 = -n2;
                                final int n35 = -length22;
                                final int n36 = n35 | n34;
                                final byte b = array[array.length - n2];
                                final int length23 = "com.aheaditec.talsec.security.h0".length();
                                array[n36 - n35 * 2 + (n35 ^ n34 ^ n36)] = (byte)(b ^ array2[n2 % (((0xCB9E47BD | length23 - 1 - length23 * 2) & 0x58D38068) + (("com.aheaditec.talsec.security.h0".length() & 0x10618843) | 0x21242803) ^ 0x79F7A863)]);
                                --n2;
                                final int a5 = B1.a((Class)h0.class, -1);
                                final int n37 = "com.aheaditec.talsec.security.h0".length() & 0x400C4082;
                                n16 = J.a(n37, -n37 - 1 | 0xEFFDFB7C, 268567684, (a5 | 0x6D1BD13) & 0x468D5000);
                                n17 = 836032333;
                                break;
                            }
                            case -1489518479: {
                                final int length24 = "com.aheaditec.talsec.security.h0".length();
                                final int n38 = (0x85A08468 & 516782023 - length24 + (-(-1 - length24) - 1 | 0xE1328838)) + (("com.aheaditec.talsec.security.h0".length() & 0xC121C028) | 0x40014001) ^ 0xC5A1C46B;
                                final int n39 = array2[(~n2 & n38) * (~n38 & n2) + (n38 & n2) * (n38 | n2)] & (((~"com.aheaditec.talsec.security.h0".length() | 0x8FB561CA) & 0xD4011A85) + (("com.aheaditec.talsec.security.h0".length() & 0x50101A05) | 0x20900108) ^ 0xF4911B72);
                                final int n40 = ~"com.aheaditec.talsec.security.h0".length();
                                final int n41 = ("com.aheaditec.talsec.security.h0".length() & 0x2203110) | 0x200D300;
                                final int n42 = -(0x4622098 & (~n40 & 0x965780AA) + n40);
                                final byte b2 = array2[(0x662F39A ^ (~n42 & n41) * 2 - (n42 ^ n41)) * n2 + ((B1.a((Class)h0.class, -1) | 0xFFF7DFFF) + 67641369 + (("com.aheaditec.talsec.security.h0".length() & 0x82042) | 0x642) ^ 0x408265B)];
                                final int n43 = ~"com.aheaditec.talsec.security.h0".length();
                                final int n44 = (b2 & ((0x279022C0 & n43 + 1314070430 - (n43 & 0x4E531F9E)) + (("com.aheaditec.talsec.security.h0".length() & 0x31C02044) | 0x1040040C) ^ 0x37D02633)) << ((B1.a((Class)h0.class, -1) | 0xFDFFFFFE) + 1107366402 + (("com.aheaditec.talsec.security.h0".length() & 0x82000041) | 0x80002140) ^ 0xC2013349);
                                array3[n2] = (short)((n44 ^ n39) + (n39 & n44));
                                ++n2;
                                n16 = ((B1.a((Class)h0.class, -1) | 0xF60B90CE) & 0x4505AC40) + (("com.aheaditec.talsec.security.h0".length() & 0x9843D10) | 0x88801110);
                                n17 = -533943416;
                                break;
                            }
                            case -1740520186: {
                                array3 = new short[((~"com.aheaditec.talsec.security.h0".length() | 0xE92FC1C9) & 0x61C8445) + (("com.aheaditec.talsec.security.h0".length() & 0x6500624) | 0x401230) ^ 0x65C9671];
                                n2 = (((~"com.aheaditec.talsec.security.h0".length() | 0xFFA3E21F) & 0x49804EA1) + (("com.aheaditec.talsec.security.h0".length() & 0x30401CA0) | 0x30419100) ^ 0x79C1DFA1);
                                final int length25 = "com.aheaditec.talsec.security.h0".length();
                                final int n45 = "com.aheaditec.talsec.security.h0".length() & 0x10006009;
                                n27 = ("com.aheaditec.talsec.security.h0".length() & ~n45 & 0x406008) + 4218888 + n45 - ((n45 | "com.aheaditec.talsec.security.h0".length()) & 0x406008) + ((~length25 | 0x649DBA54) & 0x34011001);
                                n28 = 434661073;
                                break Label_2216;
                            }
                            case -1809249287: {
                                final byte b3 = array[(((~"com.aheaditec.talsec.security.h0".length() | 0x49851A55) & 0x7816F4A) + (("com.aheaditec.talsec.security.h0".length() & 0x2E24650A) | 0x28340001) ^ 0x2FB56F4B) + n2];
                                final int n46 = ((~"com.aheaditec.talsec.security.h0".length() | 0xFF938BDA) & 0x18044242) + (("com.aheaditec.talsec.security.h0".length() & 0x20944030) | 0x20908030) ^ 0x3894C28D;
                                final int a6 = B1.a((Class)h0.class, (int)b3);
                                final int length26 = "com.aheaditec.talsec.security.h0".length();
                                final int length27 = "com.aheaditec.talsec.security.h0".length();
                                final int n47 = ((~"com.aheaditec.talsec.security.h0".length() | 0xFB29D7B9) & 0x1A244080) + (("com.aheaditec.talsec.security.h0".length() & 0xC0003) | 0x882203) ^ 0x1AAC6282;
                                final byte b4 = array[(n47 & n2) * 2 + (n47 ^ n2)];
                                final int n48 = ~"com.aheaditec.talsec.security.h0".length();
                                n4 = (short)((b4 & (0x8B85418E ^ ("com.aheaditec.talsec.security.h0".length() | 0x82840061) - (n48 | 0xA3E66AE5) + (B1.a((Class)h0.class, 0x21E66AE5 | n48) + ("com.aheaditec.talsec.security.h0".length() & 0x82840061)) + (("com.aheaditec.talsec.security.h0".length() & 0x83004100) | 0x9014110))) << (((~"com.aheaditec.talsec.security.h0".length() | 0xA11ABDE7) & 0x8626115) + (("com.aheaditec.talsec.security.h0".length() & 0x8785410) | 0x189C00) ^ 0x87AFD1D) | (length27 | n46) - (b3 | n46) + (a6 + (length26 & n46)));
                                final int n49 = ~"com.aheaditec.talsec.security.h0".length();
                                final int n50 = 0x8EA7BB41 ^ ((~n49 & 0xDE072D27) + n49 | 0x797D4FBC) - 2038255548 + (("com.aheaditec.talsec.security.h0".length() & 0x8A19240) | 0x8250B00);
                                final int n51 = -n2;
                                final int n52 = n51 | n50;
                                final byte b5 = array[n52 - n51 * 2 + (n50 ^ n51 ^ n52)];
                                final int n53 = ~"com.aheaditec.talsec.security.h0".length();
                                final int n54 = (0xF41909D4 | n53) - 1591672428 - (n53 | 0xF53909D4);
                                final int n55 = ("com.aheaditec.talsec.security.h0".length() & 0x1601008) | 0x10401868;
                                final int length28 = "com.aheaditec.talsec.security.h0".length();
                                final int length29 = "com.aheaditec.talsec.security.h0".length();
                                final int n56 = (~"com.aheaditec.talsec.security.h0".length() | 0xC3DB662F) & 0x20844001;
                                final int n57 = ("com.aheaditec.talsec.security.h0".length() & 0x20042840) | 0x2940;
                                final byte b6 = array[(0x20846942 ^ (n57 & n56) + (n56 | n57)) + n2];
                                final int length30 = "com.aheaditec.talsec.security.h0".length();
                                final int length31 = "com.aheaditec.talsec.security.h0".length();
                                final int length32 = "com.aheaditec.talsec.security.h0".length();
                                n5 = (short)((b5 & (0xB1611903 ^ (n55 | n54) - (length28 & ~n54 & n55) + (n55 & (n54 | length29)))) | (b6 & (((~length30 | 0x47DF7D9) & 0x4A0C04A9) + ((length31 & 0x4A801160) | 0xA0801940) ^ 0xEA8C1D16)) << (((0x6A0F8294 | ~length32 - length32 + length32) & 0x1AB35A6E) + (("com.aheaditec.talsec.security.h0".length() & 0xB1B458FA) | 0xE1040090) ^ 0xFBB75AF6));
                                final int n58 = ~"com.aheaditec.talsec.security.h0".length();
                                n6 = (0x2D2FD8AD ^ (0xAFE615E4 | n58) + 311432716 - (n58 | 0xBFF617EC) + (("com.aheaditec.talsec.security.h0".length() & 0x10500249) | 0xC0400841));
                                final int n59 = ~"com.aheaditec.talsec.security.h0".length();
                                final int length33 = "com.aheaditec.talsec.security.h0".length();
                                final int length34 = "com.aheaditec.talsec.security.h0".length();
                                final int n60 = ("com.aheaditec.talsec.security.h0".length() & 0xD0100010) | 0x833000A0;
                                final int n61 = -(0x540A0512 & (length33 & ~n59 & 0x56E9DAF) + 91135407 + n59 - ((n59 | length34) & 0x56E9DAF));
                                n7 = (0xD73A05B2 ^ (~n61 & n60) - (n61 & ~n60));
                                n12 = (~"com.aheaditec.talsec.security.h0".length() | 0xDFEFFFFF) + 806798471 + (("com.aheaditec.talsec.security.h0".length() & 0x28382801) | 0x9282829);
                                n13 = 1174056570 - n12;
                                n14 = -1174056571;
                                break Label_2969;
                            }
                            case -2038999444: {
                                final int n62 = ~"com.aheaditec.talsec.security.h0".length();
                                final int n63 = (("com.aheaditec.talsec.security.h0".length() & ~n62 & 0x2F85C3D8) + 797295576 + n62 - (("com.aheaditec.talsec.security.h0".length() | n62) & 0x2F85C3D8) & 0x9A04001) + (("com.aheaditec.talsec.security.h0".length() & 0x80200029) | 0x800000AC);
                                final int n64 = (short)((n4 << y1.a(n63 | 0x89A040A9, 2, -1985986391, n63)) + array3[((~"com.aheaditec.talsec.security.h0".length() | 0xBF452A29) & 0x4045F890) + (("com.aheaditec.talsec.security.h0".length() & 0x6020D290) | 0x28300240) ^ 0x6875FAD2]) ^ n4 + n6;
                                final int n65 = ~"com.aheaditec.talsec.security.h0".length();
                                final int length35 = "com.aheaditec.talsec.security.h0".length();
                                final int length36 = "com.aheaditec.talsec.security.h0".length();
                                final int length37 = "com.aheaditec.talsec.security.h0".length();
                                final short n66 = array3[((~"com.aheaditec.talsec.security.h0".length() | 0x4A6DD9E9) & 0x31422178) + (("com.aheaditec.talsec.security.h0".length() & 0x31032210) | 0x80894200) ^ 0xB1CB637B];
                                final int n67 = -(n4 >>> ((~((length35 | 0x255D135A | n65) - ((length36 & 0xDAA2ECA5) | n65)) & 0x3910D911) + ((length37 & 0x23183110) | 0x2282480) ^ 0x3B38FD94));
                                final int n68 = n67 | n66;
                                final int n69 = n68 - n67 * 2 + (n67 ^ n66 ^ n68);
                                final int n70 = -z1.a(n69 | ~n64, 2, n69 - n64, 2);
                                n5 = (short)O.a(n5, 3, -(N.a(n5, -4, 1, n70) | (n70 & 0x2)), 1);
                                final int n71 = (~"com.aheaditec.talsec.security.h0".length() | 0xDF39FDFE) + 1624126210;
                                final int n72 = ("com.aheaditec.talsec.security.h0".length() & 0x20C60649) | 0x401044A;
                                n4 = (short)(n4 - ((short)((n5 << (0x64CF374F ^ (n72 & n71) + (n71 | n72))) + array3[((~"com.aheaditec.talsec.security.h0".length() | 0xC40A2F76) & 0x9220045) + (("com.aheaditec.talsec.security.h0".length() & 0xD200031) | 0x14000030) ^ 0x1D220075]) ^ (n6 | n5) - ("com.aheaditec.talsec.security.h0".length() & ~n5 & n6) + (("com.aheaditec.talsec.security.h0".length() | n5) & n6) ^ (n5 >>> (((~"com.aheaditec.talsec.security.h0".length() | 0xFE323FD5) & 0xA4910442) + (("com.aheaditec.talsec.security.h0".length() & 0x836016) | 0x22E014) ^ 0xA4B3E453)) + array3[((~"com.aheaditec.talsec.security.h0".length() | 0xFE9977DC) & 0x314C5004) + (("com.aheaditec.talsec.security.h0".length() & 0x81C52010) | 0x808120D0) ^ 0xB1CD70D5]));
                                final int length38 = "com.aheaditec.talsec.security.h0".length();
                                final int n73 = ("com.aheaditec.talsec.security.h0".length() & 0x1812164E) | 0x10024046;
                                final int n74 = -((~length38 | 0xE76C8087) & 0x8B301688);
                                final int n75 = (~n74 & n73) * 2 - (n74 ^ n73);
                                n6 = (short)x1.a(0x64CD3706 & n75, 2, -1691170567 - n75, n6);
                                ++n7;
                                a2 = ((~"com.aheaditec.talsec.security.h0".length() | 0xC6AE4E15) & 0x18048CC) + (("com.aheaditec.talsec.security.h0".length() & 0x90000C9) | 0x8640001);
                                n11 = 1965034008;
                                break Label_3569;
                            }
                            case -2143294076: {
                                final int n76 = ~"com.aheaditec.talsec.security.h0".length();
                                if (n2 < n3) {
                                    final int n77 = ("com.aheaditec.talsec.security.h0".length() & 0x10001102) | 0x11001200;
                                    final int n78 = -((n76 | 0xA365F19A) - ((0xA365F098 | n76) ^ 0x20004192));
                                    n8 = ((~n78 & n77) * 2 - (n78 ^ n77) ^ 0xA529586B);
                                    continue;
                                }
                                a2 = ((n76 | 0xD3761F18) & 0x91010410) + (("com.aheaditec.talsec.security.h0".length() & 0x40010002) | 0x42900022);
                                n11 = -375509041;
                                break Label_3569;
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
    
    @Override
    public String a() {
        if (this.a == null) {
            this.c.await();
        }
        final DeviceIdResult a = this.a;
        String androidId;
        if (a != null) {
            androidId = a.getAndroidId();
        }
        else {
            androidId = null;
        }
        return androidId;
    }
    
    public final void a(final Fingerprinter fingerprinter) {
        fingerprinter.getDeviceId(Fingerprinter$Version.V_3, (Function1)new h0$$ExternalSyntheticLambda0(this));
    }
    
    @Override
    public String b() {
        if (this.a == null) {
            this.c.await();
        }
        final DeviceIdResult a = this.a;
        String mediaDrmId;
        if (a != null) {
            mediaDrmId = a.getMediaDrmId();
        }
        else {
            mediaDrmId = null;
        }
        return mediaDrmId;
    }
    
    public final void b(final Fingerprinter fingerprinter) {
        final FingerprintingSignalsProvider fingerprintingSignalsProvider = fingerprinter.getFingerprintingSignalsProvider();
        if (fingerprintingSignalsProvider != null) {
            final ArrayList arrayList = CollectionsKt.arrayListOf((Object[])new FingerprintingSignal[] { (FingerprintingSignal)fingerprintingSignalsProvider.getManufacturerNameSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getModelNameSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getTotalRamSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getTotalInternalStorageSpaceSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getProcCpuInfoSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getSensorsSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getInputDevicesSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getBatteryHealthSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getGlesVersionSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getAbiTypeSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getCoresCountSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getCameraListSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getAndroidVersionSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getSdkVersionSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getKernelVersionSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getEncryptionStatusSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getSecurityProvidersSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getCodecListSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getAdbEnabledSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getDevelopmentSettingsEnabledSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getTransitionAnimationScaleSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getWindowAnimationScaleSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getAccessibilityEnabledSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getDefaultInputMethodSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getTouchExplorationEnabledSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getAlarmAlertPathSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getDateFormatSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getEndButtonBehaviourSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getFontScaleSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getScreenOffTimeoutSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getTime12Or24Signal(), (FingerprintingSignal)fingerprintingSignalsProvider.isPinSecurityEnabledSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getFingerprintSensorStatusSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getRingtoneSourceSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getAvailableLocalesSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getRegionCountrySignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getTimezoneSignal(), (FingerprintingSignal)fingerprintingSignalsProvider.getDefaultLanguageSignal() });
            arrayList.add((Object)fingerprintingSignalsProvider.getSystemApplicationsListSignal());
            this.b = Fingerprinter.getFingerprint$default(fingerprinter, (List)arrayList, (Hasher)null, 2, (Object)null);
            this.c.countDown();
            return;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[29];
        array2[0] = -95;
        array2[1] = -6;
        array2[2] = 88;
        array2[3] = 83;
        array2[4] = 54;
        array2[5] = -115;
        array2[6] = 112;
        array2[7] = 120;
        array2[8] = -106;
        array2[9] = 59;
        array2[10] = 52;
        array2[11] = 102;
        array2[12] = 119;
        array2[13] = -121;
        array2[14] = 82;
        array2[15] = 61;
        array2[16] = 42;
        array2[17] = -82;
        array2[18] = 116;
        array2[19] = 31;
        array2[20] = 123;
        array2[21] = -38;
        array2[22] = 30;
        array2[23] = 10;
        array2[24] = 13;
        array2[25] = -47;
        array2[26] = -121;
        array2[27] = 108;
        array2[28] = -91;
        a(array, new byte[] { 42, -55, 63, -96, 105, 105, -82, 49, 74, 75, -90, 71, -97, -66, -36, 91, 113, 32, -15, 126, 47, 4, -113, -32, 8, 88, -67, 45, -53 });
        throw new IllegalArgumentException(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    @Override
    public String c() {
        final String board = Build.BOARD;
        final String brand = Build.BRAND;
        final String model = Build.MODEL;
        final String device = Build.DEVICE;
        final String b = this.b();
        if (b == null) {
            return null;
        }
        final byte[] array = { -37 };
        a(array, new byte[] { -44, -89, 100, -98, 19, -44, -15, 12 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array2 = { -20 };
        a(array2, new byte[] { 114, -112, -122, 38, -123, -67, 48, -39 });
        final String intern2 = new String(array2, utf_8).intern();
        final byte[] array3 = { 65 };
        a(array3, new byte[] { -77, 61, 74, -106, -116, -115, 58, 104 });
        final String intern3 = new String(array3, utf_8).intern();
        final byte[] array4 = { -63 };
        a(array4, new byte[] { 0, -98, 39, 60, -128, -1, 80, 53 });
        return brand + intern + model + intern2 + device + intern3 + board + new String(array4, utf_8).intern() + b;
    }
    
    @Override
    public String d() {
        if (this.b == null) {
            this.c.await();
        }
        return this.b;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final byte[] array2;
        final byte[] array = array2 = new byte[32];
        array2[0] = -43;
        array2[1] = -53;
        array2[2] = 96;
        array2[3] = -100;
        array2[4] = -13;
        array2[5] = -33;
        array2[6] = -126;
        array2[7] = 4;
        array2[8] = 58;
        array2[9] = 120;
        array2[10] = -82;
        array2[11] = -86;
        array2[12] = 45;
        array2[13] = -73;
        array2[14] = -49;
        array2[15] = 1;
        array2[16] = -106;
        array2[17] = -95;
        array2[18] = 116;
        array2[19] = -88;
        array2[20] = -113;
        array2[21] = 100;
        array2[22] = 78;
        array2[23] = 57;
        array2[24] = -66;
        array2[25] = 28;
        array2[26] = -38;
        array2[27] = 127;
        array2[28] = -99;
        array2[29] = -23;
        array2[30] = -8;
        array2[31] = -51;
        a(array, new byte[] { -58, 0, 25, 51, 49, -65, 62, 65, 34, -32, 36, 77, 90, 113, 64, 6, -68, 121, -43, 10, -56, -55, 53, 63, -54, -83, 11, 92, -16, -61, 26, -20 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        sb.append(new String(array, utf_8).intern());
        String s;
        if ((s = this.a()) == null) {
            final byte[] array3 = { -43 };
            a(array3, new byte[] { 56, -8, -23, 104, -32, 16, -26, -38 });
            s = new String(array3, utf_8).intern();
        }
        sb.append(s);
        final byte[] array5;
        final byte[] array4 = array5 = new byte[21];
        array5[0] = -10;
        array5[1] = -57;
        array5[2] = -93;
        array5[3] = 55;
        array5[4] = -106;
        array5[5] = 56;
        array5[6] = 39;
        array5[7] = 104;
        array5[8] = -126;
        array5[9] = -57;
        array5[10] = 72;
        array5[11] = -65;
        array5[12] = -76;
        array5[13] = 124;
        array5[14] = 86;
        array5[15] = -97;
        array5[16] = 73;
        array5[17] = -43;
        array5[18] = 51;
        array5[19] = 17;
        array5[20] = -13;
        a(array4, new byte[] { -57, -47, -43, 7, -27, 84, 41, -89, 44, 59, 43, -30, -74, -15, -23, 34, 106, -20, -105, -38, -75 });
        sb.append(new String(array4, utf_8).intern());
        String s2;
        if ((s2 = this.b()) == null) {
            final byte[] array6 = { 79 };
            a(array6, new byte[] { -111, 98, -107, 88, 19, -86, 62, 32 });
            s2 = new String(array6, utf_8).intern();
        }
        sb.append(s2);
        final byte[] array8;
        final byte[] array7 = array8 = new byte[26];
        array8[0] = 70;
        array8[1] = -13;
        array8[2] = 99;
        array8[3] = 45;
        array8[4] = 63;
        array8[5] = -41;
        array8[6] = -12;
        array8[7] = -3;
        array8[8] = -51;
        array8[9] = 70;
        array8[10] = 105;
        array8[11] = 104;
        array8[12] = 79;
        array8[13] = -112;
        array8[14] = 54;
        array8[15] = 115;
        array8[16] = -1;
        array8[17] = 93;
        array8[18] = -128;
        array8[19] = 22;
        array8[20] = 34;
        array8[21] = -109;
        array8[22] = -93;
        array8[23] = -28;
        array8[24] = -39;
        array8[25] = -12;
        a(array7, new byte[] { -122, -42, -29, -56, 104, 51, 114, 93, -90, -22, -87, 98, -91, -85, 92, -119, -65, -13, -48, -119, -67, -16, 80, -6, 25, 17 });
        sb.append(new String(array7, utf_8).intern());
        String s3;
        if ((s3 = this.d()) == null) {
            final byte[] array9 = { 54 };
            a(array9, new byte[] { 42, 27, 50, 123, 25, -102, -33, 85 });
            s3 = new String(array9, utf_8).intern();
        }
        sb.append(s3);
        final byte[] array11;
        final byte[] array10 = array11 = new byte[2];
        array11[0] = -21;
        array11[1] = 110;
        a(array10, new byte[] { -118, 100, -55, -124, 33, -81, 94, -103 });
        sb.append(new String(array10, utf_8).intern());
        final String string = sb.toString();
        final byte[] array13;
        final byte[] array12 = array13 = new byte[13];
        array13[0] = -42;
        array13[1] = 5;
        array13[2] = 101;
        array13[3] = -108;
        array13[4] = -94;
        array13[5] = 17;
        array13[6] = -49;
        array13[7] = -86;
        array13[8] = 60;
        array13[9] = -44;
        array13[10] = 33;
        array13[11] = 80;
        array13[12] = 121;
        a(array12, new byte[] { -91, 80, 26, 19, -120, -62, -8, -113, -36, 65, 36, 46, 65 });
        Intrinsics.checkNotNullExpressionValue((Object)string, new String(array12, utf_8).intern());
        return string;
    }
    
    public static final class a
    {
        public a() {
        }
        
        public a(final DefaultConstructorMarker defaultConstructorMarker) {
        }
        
        public static void a(final byte[] array, final byte[] array2) {
            byte[] array3 = null;
            int n = 0;
            int n2 = 0;
            int n3 = -1850458006;
            byte[] array4 = null;
        Label_0267:
            while (true) {
                final int n4 = n3 >>> 8;
                final int n5 = 1;
                final int n6 = 1;
                final int n7 = n4 - 1 - (~((0x1000000 & n3) * (n3 | 0x1000000) + (0xFEFFFFFF & n3) * (~n3 & 0x1000000)) | n4);
                final int n8 = -1700147435 - ((n7 & 0x2) | 2028104049 - n7);
                n3 = -1396193641;
                int n9 = 0;
                switch (0xAEBB822B ^ ~n8 + (n8 | 0x1) * 2) {
                    default: {
                        n9 = n2;
                        break;
                    }
                    case 1733787683: {
                        final byte b = array4[n];
                        final byte b2 = array3[n];
                        array4[n] = (byte)((byte)((byte)b2 + (byte)b) - (byte)((byte)2 * (byte)(b2 & b)));
                        n2 = (n9 = (n ^ 0x1) + (n & 0x1) * 2);
                        if ((lcmp((long)n2, (long)array4.length) >>> 31 & 0x1) != 0x0) {
                            n3 = 1985663266;
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
                        break Label_0267;
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
                n2 = n9;
            }
        }
        
        public final h0 a(final Context context) {
            final byte[] array2;
            final byte[] array = array2 = new byte[7];
            array2[0] = 18;
            array2[1] = -88;
            array2[2] = 41;
            array2[3] = 103;
            array2[4] = -2;
            array2[5] = 38;
            array2[6] = -117;
            a(array, new byte[] { 113, -57, 71, 19, -101, 94, -1, -115 });
            Intrinsics.checkNotNullParameter((Object)context, new String(array, StandardCharsets.UTF_8).intern());
            h0 h0;
            if ((h0 = com.aheaditec.talsec.security.h0.f) == null) {
                synchronized (this) {
                    if ((h0 = com.aheaditec.talsec.security.h0.f) == null) {
                        h0 = (com.aheaditec.talsec.security.h0.f = new h0(context));
                    }
                }
            }
            return h0;
        }
    }
}
