package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.StandardCharsets;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.aheaditec.talsec_security.security.api.TalsecConfig;

public final class s0 implements r0
{
    public static final b g;
    public static s0 h;
    public final TalsecConfig c;
    public final c d;
    public final a e;
    public final d f;
    
    static {
        g = new b(null);
    }
    
    public s0(final TalsecConfig c) {
        this.c = c;
        this.d = new c();
        this.e = new a();
        this.f = new d();
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n2 = 0;
        int n3 = -1850458006;
        byte[] array4 = null;
    Label_0268:
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
                    break Label_0268;
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
    
    public r0$f a() {
        return (r0$f)this.f;
    }
    
    public void a(final String s, final String s2, final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[4];
        array2[0] = -64;
        array2[1] = -1;
        array2[2] = -41;
        array2[3] = -53;
        a(array, new byte[] { -92, -98, -93, -86, -92, 77, -114, -41 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)s, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[7];
        array4[0] = 101;
        array4[1] = -26;
        array4[2] = -75;
        array4[3] = -20;
        array4[4] = -54;
        array4[5] = 30;
        array4[6] = -102;
        a(array3, new byte[] { 19, -125, -57, -97, -93, 113, -12, 34 });
        Intrinsics.checkNotNullParameter((Object)s2, new String(array3, utf_8).intern());
        final byte[] array6;
        final byte[] array5 = array6 = new byte[7];
        array6[0] = -5;
        array6[1] = 69;
        array6[2] = 57;
        array6[3] = 52;
        array6[4] = -118;
        array6[5] = 67;
        array6[6] = 77;
        a(array5, new byte[] { -104, 42, 87, 64, -17, 59, 57, 127 });
        Intrinsics.checkNotNullParameter((Object)context, new String(array5, utf_8).intern());
    }
    
    public r0$h b() {
        return null;
    }
    
    public r0$g c() {
        return null;
    }
    
    public r0$e d() {
        return null;
    }
    
    public r0$d e() {
        return (r0$d)this.d;
    }
    
    public r0$a f() {
        return (r0$a)this.e;
    }
    
    public r0$b g() {
        return null;
    }
    
    public String h() {
        return null;
    }
    
    public String i() {
        return null;
    }
    
    public long j() {
        return 60L;
    }
    
    public final boolean l() {
        return this.c.isProd();
    }
    
    public final TalsecConfig m() {
        return this.c;
    }
    
    public final class a implements r0$a
    {
        public final s0 a;
        
        public a(final s0 a) {
            this.a = a;
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
        
        public String[] a() {
            final String[] expectedSigningCertificateHashes = this.a.c.getExpectedSigningCertificateHashes();
            final byte[] array2;
            final byte[] array = array2 = new byte[40];
            array2[0] = -52;
            array2[1] = 82;
            array2[2] = -17;
            array2[3] = -84;
            array2[4] = 79;
            array2[6] = (array2[5] = 95);
            array2[7] = 76;
            array2[8] = 71;
            array2[9] = 114;
            array2[10] = 81;
            array2[11] = -58;
            array2[12] = 23;
            array2[13] = 109;
            array2[14] = 116;
            array2[15] = 61;
            array2[16] = -113;
            array2[17] = 95;
            array2[18] = -44;
            array2[19] = 95;
            array2[20] = 104;
            array2[21] = -80;
            array2[22] = 119;
            array2[23] = 99;
            array2[24] = -79;
            array2[25] = 94;
            array2[26] = 52;
            array2[27] = 63;
            array2[28] = 78;
            array2[29] = 41;
            array2[30] = 70;
            array2[31] = 9;
            array2[32] = 11;
            array2[33] = -92;
            array2[34] = 119;
            array2[35] = 36;
            array2[36] = 109;
            array2[37] = -100;
            array2[38] = -93;
            array2[39] = 86;
            a(array, new byte[] { -85, 55, -101, -23, 55, 47, 58, 47, 51, 23, 53, -107, 126, 10, 26, 84, -31, 56, -105, 58, 26, -60, 30, 5, -40, 61, 85, 75, 43, 97, 39, 122, 99, -63, 4, 12, 67, -78, -115, 127 });
            Intrinsics.checkNotNullExpressionValue((Object)expectedSigningCertificateHashes, new String(array, StandardCharsets.UTF_8).intern());
            return expectedSigningCertificateHashes;
        }
        
        public String[] b() {
            return this.a.c.getSupportedAlternativeStores();
        }
        
        public String[] c() {
            return new String[] { this.a.c.getExpectedPackageName() };
        }
    }
    
    public static final class b
    {
        public b() {
        }
        
        public b(final DefaultConstructorMarker defaultConstructorMarker) {
        }
        
        public static void a(final byte[] array, final byte[] array2) {
            final int n = ~"com.aheaditec.talsec.security.s0$b".length();
            int n2 = (~(("com.aheaditec.talsec.security.s0$b".length() | 0x42FDD19 | n) - (n | ("com.aheaditec.talsec.security.s0$b".length() & 0xFBD022E6))) & 0x8A042208) + (("com.aheaditec.talsec.security.s0$b".length() & 0x400C0008) | 0x41280820) ^ 0xCB2C2A28;
            final int a = B1.a((Class)b.class, -1);
            int n3 = (a | 0x954FECC5) - ((0x14DECC5 | a) ^ 0x9402A001) + (("com.aheaditec.talsec.security.s0$b".length() | 0x6BFDFFFD) - 1811808253 | 0x20081002) ^ 0xB40AB003;
            int n4 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xDDA24923) & 0x10824042) + (("com.aheaditec.talsec.security.s0$b".length() & 0x9040) | 0x40019001) ^ 0x5083D043;
            int n5 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xBAFDFD77) & 0x68A830CC) + (("com.aheaditec.talsec.security.s0$b".length() & 0x4003889A) | 0x80138C12) ^ 0xE8BBBCDE;
            final int length = "com.aheaditec.talsec.security.s0$b".length();
            final int length2 = "com.aheaditec.talsec.security.s0$b".length();
            int n6 = 0x9B7D9791 ^ ((0x1B101411 & length2) ^ 0x80400590) + (length2 & 0x410) + ((~length | 0xE06FE760) & 0x1B3D9201);
            int n7 = (~"com.aheaditec.talsec.security.s0$b".length() | 0xFFEFBFFF) + 689325073 + (("com.aheaditec.talsec.security.s0$b".length() & 0x82104800) | 0x824008A8) ^ 0xAB564CB8;
            final int length3 = "com.aheaditec.talsec.security.s0$b".length();
            final int length4 = "com.aheaditec.talsec.security.s0$b".length();
            int n8 = ((~length3 | 0x5776618) & 0xC02C8254) + (0x905020 | (length4 | 0xC088C064) - (length4 ^ 0xC088C064)) ^ 0x58FD1772;
            short[] array3 = null;
        Label_1119:
            while (true) {
                int a2 = 0;
                int n11 = 0;
                Label_3368: {
                    int n12 = 0;
                    int n13 = 0;
                    int n14 = 0;
                    Label_2768: {
                        int n27 = 0;
                        int n28 = 0;
                        Label_2013: {
                            int n16 = 0;
                            int n17 = 0;
                            switch (n8) {
                                default: {
                                    final int n9 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int n10 = (0xED53ECFC | n9) + 45165696 - (n9 | 0xEFF3ECFC);
                                    a2 = O.a(n10, 3, -N.a(n10, -4, 1, ("com.aheaditec.talsec.security.s0$b".length() & 0x2A00020) | 0x94020220), 1);
                                    n11 = -361272203;
                                    break Label_3368;
                                }
                                case 2093236949: {
                                    if (n7 < (((~"com.aheaditec.talsec.security.s0$b".length() | 0xDB3AB245) & 0x4DB02E10) + (("com.aheaditec.talsec.security.s0$b".length() & 0x4800D19) | 0x2005010D) ^ 0x6DB52F3D)) {
                                        n12 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0x4D5991B8) & 0x21320709) + (("com.aheaditec.talsec.security.s0$b".length() & 0x34222601) | 0x14002004);
                                        n13 = -1287294623 - n12;
                                        n14 = 1287294622;
                                        break Label_2768;
                                    }
                                    final int n15 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    n16 = (0x4411012E & -1207265904 + n15 + (-n15 - 1 | 0x47F56A70)) + (("com.aheaditec.talsec.security.s0$b".length() & 0x4D110460) | 0x9000440);
                                    n17 = 612868558;
                                    break;
                                }
                                case 1771480224: {
                                    array[(((~"com.aheaditec.talsec.security.s0$b".length() | 0x422FD499) & 0x4A01800A) + (("com.aheaditec.talsec.security.s0$b".length() & 0x9000502) | 0x5082500) ^ 0x4F09A50A) + n2] = (byte)((((~"com.aheaditec.talsec.security.s0$b".length() | 0x5F9A85FE) & 0x1808350) + (("com.aheaditec.talsec.security.s0$b".length() | 0xFFEBFDFD) + 1311235 | 0x801400A2) ^ 0x8194830D) & n4);
                                    final int length5 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length6 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length7 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length8 = "com.aheaditec.talsec.security.s0$b".length();
                                    array[(((~length5 | 0xAD39FB88) & 0x2A212880) + ((length6 & 0x43020008) | 0x51428008) ^ 0x7B63A889) + n2] = (byte)(n4 >> (((~length7 | 0x15E46274) & 0x20B53110) + (length8 + 558960896 - (length8 | 0x21511100) | 0x1428004) ^ 0x21F7B11C) & (((~"com.aheaditec.talsec.security.s0$b".length() | 0x7DF43DE4) & 0x3D300832) + (("com.aheaditec.talsec.security.s0$b".length() & 0x80101A) | 0x82174D) ^ 0x3DB21F80));
                                    final int n18 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0x2AA0B538) & 0x8230514) + (("com.aheaditec.talsec.security.s0$b".length() & 0x30024) | 0x801010E0);
                                    final int a3 = A1.a(~n18 | 0x883315F6, 2, -2009917962 - n18, 2, n2);
                                    final int length9 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length10 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n19 = ~((length10 & 0x38B80309) + 276825601 - (length10 & 0x10800201));
                                    final int n20 = -((~length9 | 0xC3C2F477) & 0x2878811C);
                                    array[a3] = (byte)((w1.a(~n20, n19, 2, n19 + n20 + 1) ^ 0x38F887E2) & n5);
                                    final int length11 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length12 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n21 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int a4 = B1.a((Class)b.class, 0x4763FDFC | n21);
                                    final int length13 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length14 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length15 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length16 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n22 = ("com.aheaditec.talsec.security.s0$b".length() & 0x20884062) | 0xAA028042;
                                    final int n23 = -((~length16 | 0x5F73B59C) & 0x55C844A4);
                                    array[(((~length11 | 0xBF552BF4) & 0x1A230910) + ((length12 & 0x4228004) | 0x84048405) ^ 0x9E278D16) + n2] = (byte)(n5 >> (0x7CBDC0FA ^ (length14 | 0x2831C0E0) - (n21 | 0x6F73FDFC) + (a4 + (length13 & 0x2831C0E0)) + ((length15 & 0x68940010) | 0x548C0012)) & (0xFFCAC419 ^ (~n23 & n22) - (n23 & ~n22)));
                                    n2 += 4;
                                    n16 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xF5BFD72F) & 0x13002210) + (("com.aheaditec.talsec.security.s0$b".length() & 0x2002010) | 0x21402);
                                    n17 = -1824662634;
                                    break;
                                }
                                case 1734050766: {
                                    final int n24 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    if (n2 > 0) {
                                        final int length17 = "com.aheaditec.talsec.security.s0$b".length();
                                        n16 = ((n24 | 0xEFFADC8E) & 0x10D1006A) + (0xA086800 | length17 + 402735200 - (length17 | 0x18014060));
                                        n17 = -115901203;
                                        break;
                                    }
                                    final int n25 = ("com.aheaditec.talsec.security.s0$b".length() & 0x1120000) | 0x21004004;
                                    final int n26 = -((n24 | 0x5A0DDFDD) & 0x18120300);
                                    n27 = (~n26 & n25) - (n26 & ~n25);
                                    n28 = 2001041846;
                                    break Label_2013;
                                }
                                case 1314339506: {
                                    break Label_1119;
                                }
                                case 998066383: {
                                    n2 = (((B1.a((Class)b.class, -1) | 0x12B95885) & 0x16208A48) + (("com.aheaditec.talsec.security.s0$b".length() | 0xFBFF7DA7) + 67142233 | 0x89000110) ^ 0x9F208B58);
                                    n3 = array.length - array.length % (((~"com.aheaditec.talsec.security.s0$b".length() | 0x15DACEF5) & 0x501E1A02) + (("com.aheaditec.talsec.security.s0$b".length() & 0xC4049063) | 0x84008061) ^ 0xD41E9A67);
                                    n16 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xAEF59C61) & 0x2EC1453) + (("com.aheaditec.talsec.security.s0$b".length() & 0x91180012) | 0xB9102A00);
                                    n17 = 1002689495;
                                    break;
                                }
                                case 974072829: {
                                    final int length18 = array.length;
                                    final int length19 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n29 = ("com.aheaditec.talsec.security.s0$b".length() & 0xF006550) | 0x65003700;
                                    final int n30 = -((~length19 | 0x65FE9CA7) & 0xA2648F6);
                                    n2 = length18 % (0x6F267FF2 ^ (~n30 & n29) - (n30 & ~n29));
                                    n16 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0x3B134AC3) & 0x820C1403) + (("com.aheaditec.talsec.security.s0$b".length() & 0x900C5408) | 0x11004008);
                                    n17 = -195569723;
                                    break;
                                }
                                case 766056152: {
                                    final int length20 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length21 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n31 = length21 + 84675108 - (length21 | 0x50C0A24);
                                    if (n2 < (0x6DCD8F6B ^ (~n31 & 0x24440D24) + n31 + ((~length20 | 0xCAF5A54F) & 0x4989824B))) {
                                        final int n32 = (~"com.aheaditec.talsec.security.s0$b".length() | 0x6FFB14D6) & 0x72014033;
                                        final int n33 = ("com.aheaditec.talsec.security.s0$b".length() & 0x10025821) | 0xA1888;
                                        n16 = M.a(n32 | n33, 2, ~n32 ^ n33, 1);
                                        n17 = -717449014;
                                        break;
                                    }
                                    n16 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xA7E82FDE) & 0xA0612419) + (("com.aheaditec.talsec.security.s0$b".length() & 0x40094861) | 0x50084862);
                                    n17 = -887872332;
                                    break;
                                }
                                case -473033593: {
                                    final int length22 = array.length;
                                    final int n34 = -n2;
                                    final int n35 = -length22;
                                    final int n36 = n35 | n34;
                                    final byte b = array[array.length - n2];
                                    final int length23 = "com.aheaditec.talsec.security.s0$b".length();
                                    array[n36 - n35 * 2 + (n35 ^ n34 ^ n36)] = (byte)(b ^ array2[n2 % (((0xCB9E47BD | length23 - 1 - length23 * 2) & 0x58D38068) + (("com.aheaditec.talsec.security.s0$b".length() & 0x10618843) | 0x21242803) ^ 0x79F7A863)]);
                                    --n2;
                                    final int a5 = B1.a((Class)b.class, -1);
                                    final int n37 = "com.aheaditec.talsec.security.s0$b".length() & 0x400C4082;
                                    n16 = J.a(n37, -n37 - 1 | 0xEFFDFB7C, 268567684, (a5 | 0x6D1BD13) & 0x468D5000);
                                    n17 = 836032333;
                                    break;
                                }
                                case -1489518479: {
                                    final int length24 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n38 = (0x85A08468 & 516782023 - length24 + (-(-1 - length24) - 1 | 0xE1328838)) + (("com.aheaditec.talsec.security.s0$b".length() & 0xC121C028) | 0x40014001) ^ 0xC5A1C46B;
                                    final int n39 = array2[(~n2 & n38) * (~n38 & n2) + (n38 & n2) * (n38 | n2)] & (((~"com.aheaditec.talsec.security.s0$b".length() | 0x8FB561CA) & 0xD4011A85) + (("com.aheaditec.talsec.security.s0$b".length() & 0x50101A05) | 0x20900108) ^ 0xF4911B72);
                                    final int n40 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int n41 = ("com.aheaditec.talsec.security.s0$b".length() & 0x2203110) | 0x200D300;
                                    final int n42 = -(0x4622098 & (~n40 & 0x965780AA) + n40);
                                    final byte b2 = array2[(0x662F39A ^ (~n42 & n41) * 2 - (n42 ^ n41)) * n2 + ((B1.a((Class)b.class, -1) | 0xFFF7DFFF) + 67641369 + (("com.aheaditec.talsec.security.s0$b".length() & 0x82042) | 0x642) ^ 0x408265B)];
                                    final int n43 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int n44 = (b2 & ((0x279022C0 & n43 + 1314070430 - (n43 & 0x4E531F9E)) + (("com.aheaditec.talsec.security.s0$b".length() & 0x31C02044) | 0x1040040C) ^ 0x37D02633)) << ((B1.a((Class)b.class, -1) | 0xFDFFFFFE) + 1107366402 + (("com.aheaditec.talsec.security.s0$b".length() & 0x82000041) | 0x80002140) ^ 0xC2013349);
                                    array3[n2] = (short)((n44 ^ n39) + (n39 & n44));
                                    ++n2;
                                    n16 = ((B1.a((Class)b.class, -1) | 0xF60B90CE) & 0x4505AC40) + (("com.aheaditec.talsec.security.s0$b".length() & 0x9843D10) | 0x88801110);
                                    n17 = -533943416;
                                    break;
                                }
                                case -1740520186: {
                                    array3 = new short[((~"com.aheaditec.talsec.security.s0$b".length() | 0xE92FC1C9) & 0x61C8445) + (("com.aheaditec.talsec.security.s0$b".length() & 0x6500624) | 0x401230) ^ 0x65C9671];
                                    n2 = (((~"com.aheaditec.talsec.security.s0$b".length() | 0xFFA3E21F) & 0x49804EA1) + (("com.aheaditec.talsec.security.s0$b".length() & 0x30401CA0) | 0x30419100) ^ 0x79C1DFA1);
                                    final int length25 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n45 = "com.aheaditec.talsec.security.s0$b".length() & 0x10006009;
                                    n27 = ("com.aheaditec.talsec.security.s0$b".length() & ~n45 & 0x406008) + 4218888 + n45 - ((n45 | "com.aheaditec.talsec.security.s0$b".length()) & 0x406008) + ((~length25 | 0x649DBA54) & 0x34011001);
                                    n28 = 434661073;
                                    break Label_2013;
                                }
                                case -1809249287: {
                                    final byte b3 = array[(((~"com.aheaditec.talsec.security.s0$b".length() | 0x49851A55) & 0x7816F4A) + (("com.aheaditec.talsec.security.s0$b".length() & 0x2E24650A) | 0x28340001) ^ 0x2FB56F4B) + n2];
                                    final int n46 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xFF938BDA) & 0x18044242) + (("com.aheaditec.talsec.security.s0$b".length() & 0x20944030) | 0x20908030) ^ 0x3894C28D;
                                    final int a6 = B1.a((Class)b.class, (int)b3);
                                    final int length26 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length27 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n47 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xFB29D7B9) & 0x1A244080) + (("com.aheaditec.talsec.security.s0$b".length() & 0xC0003) | 0x882203) ^ 0x1AAC6282;
                                    final byte b4 = array[(n47 & n2) * 2 + (n47 ^ n2)];
                                    final int n48 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    n4 = (short)((b4 & (0x8B85418E ^ ("com.aheaditec.talsec.security.s0$b".length() | 0x82840061) - (n48 | 0xA3E66AE5) + (B1.a((Class)b.class, 0x21E66AE5 | n48) + ("com.aheaditec.talsec.security.s0$b".length() & 0x82840061)) + (("com.aheaditec.talsec.security.s0$b".length() & 0x83004100) | 0x9014110))) << (((~"com.aheaditec.talsec.security.s0$b".length() | 0xA11ABDE7) & 0x8626115) + (("com.aheaditec.talsec.security.s0$b".length() & 0x8785410) | 0x189C00) ^ 0x87AFD1D) | (length27 | n46) - (b3 | n46) + (a6 + (length26 & n46)));
                                    final int n49 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int n50 = 0x8EA7BB41 ^ ((~n49 & 0xDE072D27) + n49 | 0x797D4FBC) - 2038255548 + (("com.aheaditec.talsec.security.s0$b".length() & 0x8A19240) | 0x8250B00);
                                    final int n51 = -n2;
                                    final int n52 = n51 | n50;
                                    final byte b5 = array[n52 - n51 * 2 + (n50 ^ n51 ^ n52)];
                                    final int n53 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int n54 = (0xF41909D4 | n53) - 1591672428 - (n53 | 0xF53909D4);
                                    final int n55 = ("com.aheaditec.talsec.security.s0$b".length() & 0x1601008) | 0x10401868;
                                    final int length28 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length29 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n56 = (~"com.aheaditec.talsec.security.s0$b".length() | 0xC3DB662F) & 0x20844001;
                                    final int n57 = ("com.aheaditec.talsec.security.s0$b".length() & 0x20042840) | 0x2940;
                                    final byte b6 = array[(0x20846942 ^ (n57 & n56) + (n56 | n57)) + n2];
                                    final int length30 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length31 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length32 = "com.aheaditec.talsec.security.s0$b".length();
                                    n5 = (short)((b5 & (0xB1611903 ^ (n55 | n54) - (length28 & ~n54 & n55) + (n55 & (n54 | length29)))) | (b6 & (((~length30 | 0x47DF7D9) & 0x4A0C04A9) + ((length31 & 0x4A801160) | 0xA0801940) ^ 0xEA8C1D16)) << (((0x6A0F8294 | ~length32 - length32 + length32) & 0x1AB35A6E) + (("com.aheaditec.talsec.security.s0$b".length() & 0xB1B458FA) | 0xE1040090) ^ 0xFBB75AF6));
                                    final int n58 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    n6 = (0x2D2FD8AD ^ (0xAFE615E4 | n58) + 311432716 - (n58 | 0xBFF617EC) + (("com.aheaditec.talsec.security.s0$b".length() & 0x10500249) | 0xC0400841));
                                    final int n59 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int length33 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length34 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n60 = ("com.aheaditec.talsec.security.s0$b".length() & 0xD0100010) | 0x833000A0;
                                    final int n61 = -(0x540A0512 & (length33 & ~n59 & 0x56E9DAF) + 91135407 + n59 - ((n59 | length34) & 0x56E9DAF));
                                    n7 = (0xD73A05B2 ^ (~n61 & n60) - (n61 & ~n60));
                                    n12 = (~"com.aheaditec.talsec.security.s0$b".length() | 0xDFEFFFFF) + 806798471 + (("com.aheaditec.talsec.security.s0$b".length() & 0x28382801) | 0x9282829);
                                    n13 = 1174056570 - n12;
                                    n14 = -1174056571;
                                    break Label_2768;
                                }
                                case -2038999444: {
                                    final int n62 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int n63 = (("com.aheaditec.talsec.security.s0$b".length() & ~n62 & 0x2F85C3D8) + 797295576 + n62 - (("com.aheaditec.talsec.security.s0$b".length() | n62) & 0x2F85C3D8) & 0x9A04001) + (("com.aheaditec.talsec.security.s0$b".length() & 0x80200029) | 0x800000AC);
                                    final int n64 = (short)((n4 << y1.a(n63 | 0x89A040A9, 2, -1985986391, n63)) + array3[((~"com.aheaditec.talsec.security.s0$b".length() | 0xBF452A29) & 0x4045F890) + (("com.aheaditec.talsec.security.s0$b".length() & 0x6020D290) | 0x28300240) ^ 0x6875FAD2]) ^ n4 + n6;
                                    final int n65 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    final int length35 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length36 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int length37 = "com.aheaditec.talsec.security.s0$b".length();
                                    final short n66 = array3[((~"com.aheaditec.talsec.security.s0$b".length() | 0x4A6DD9E9) & 0x31422178) + (("com.aheaditec.talsec.security.s0$b".length() & 0x31032210) | 0x80894200) ^ 0xB1CB637B];
                                    final int n67 = -(n4 >>> ((~((length35 | 0x255D135A | n65) - ((length36 & 0xDAA2ECA5) | n65)) & 0x3910D911) + ((length37 & 0x23183110) | 0x2282480) ^ 0x3B38FD94));
                                    final int n68 = n67 | n66;
                                    final int n69 = n68 - n67 * 2 + (n67 ^ n66 ^ n68);
                                    final int n70 = -z1.a(n69 | ~n64, 2, n69 - n64, 2);
                                    n5 = (short)O.a(n5, 3, -(N.a(n5, -4, 1, n70) | (n70 & 0x2)), 1);
                                    final int n71 = (~"com.aheaditec.talsec.security.s0$b".length() | 0xDF39FDFE) + 1624126210;
                                    final int n72 = ("com.aheaditec.talsec.security.s0$b".length() & 0x20C60649) | 0x401044A;
                                    n4 = (short)(n4 - ((short)((n5 << (0x64CF374F ^ (n72 & n71) + (n71 | n72))) + array3[((~"com.aheaditec.talsec.security.s0$b".length() | 0xC40A2F76) & 0x9220045) + (("com.aheaditec.talsec.security.s0$b".length() & 0xD200031) | 0x14000030) ^ 0x1D220075]) ^ (n6 | n5) - ("com.aheaditec.talsec.security.s0$b".length() & ~n5 & n6) + (("com.aheaditec.talsec.security.s0$b".length() | n5) & n6) ^ (n5 >>> (((~"com.aheaditec.talsec.security.s0$b".length() | 0xFE323FD5) & 0xA4910442) + (("com.aheaditec.talsec.security.s0$b".length() & 0x836016) | 0x22E014) ^ 0xA4B3E453)) + array3[((~"com.aheaditec.talsec.security.s0$b".length() | 0xFE9977DC) & 0x314C5004) + (("com.aheaditec.talsec.security.s0$b".length() & 0x81C52010) | 0x808120D0) ^ 0xB1CD70D5]));
                                    final int length38 = "com.aheaditec.talsec.security.s0$b".length();
                                    final int n73 = ("com.aheaditec.talsec.security.s0$b".length() & 0x1812164E) | 0x10024046;
                                    final int n74 = -((~length38 | 0xE76C8087) & 0x8B301688);
                                    final int n75 = (~n74 & n73) * 2 - (n74 ^ n73);
                                    n6 = (short)x1.a(0x64CD3706 & n75, 2, -1691170567 - n75, n6);
                                    ++n7;
                                    a2 = ((~"com.aheaditec.talsec.security.s0$b".length() | 0xC6AE4E15) & 0x18048CC) + (("com.aheaditec.talsec.security.s0$b".length() & 0x90000C9) | 0x8640001);
                                    n11 = 1965034008;
                                    break Label_3368;
                                }
                                case -2143294076: {
                                    final int n76 = ~"com.aheaditec.talsec.security.s0$b".length();
                                    if (n2 < n3) {
                                        final int n77 = ("com.aheaditec.talsec.security.s0$b".length() & 0x10001102) | 0x11001200;
                                        final int n78 = -((n76 | 0xA365F19A) - ((0xA365F098 | n76) ^ 0x20004192));
                                        n8 = ((~n78 & n77) * 2 - (n78 ^ n77) ^ 0xA529586B);
                                        continue;
                                    }
                                    a2 = ((n76 | 0xD3761F18) & 0x91010410) + (("com.aheaditec.talsec.security.s0$b".length() & 0x40010002) | 0x42900022);
                                    n11 = -375509041;
                                    break Label_3368;
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
        
        public final s0 a(final TalsecConfig talsecConfig) {
            synchronized (this) {
                final byte[] array2;
                final byte[] array = array2 = new byte[6];
                array2[0] = -62;
                array2[1] = -73;
                array2[2] = -2;
                array2[3] = -6;
                array2[4] = -40;
                array2[5] = 34;
                a(array, new byte[] { -127, 69, -79, 42, 73, 122, 1, 74 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullParameter((Object)talsecConfig, new String(array, utf_8).intern());
                if (s0.h == null) {
                    s0.h = new s0(talsecConfig);
                }
                s0 h;
                if ((h = s0.h) == null) {
                    final byte[] array4;
                    final byte[] array3 = array4 = new byte[8];
                    array4[0] = -99;
                    array4[1] = 34;
                    array4[2] = -118;
                    array4[3] = -31;
                    array4[4] = -80;
                    array4[5] = 68;
                    array4[6] = -54;
                    array4[7] = -105;
                    a(array3, new byte[] { 51, -110, 4, 6, -11, 54, 42, -47 });
                    Intrinsics.throwUninitializedPropertyAccessException(new String(array3, utf_8).intern());
                    h = null;
                }
                return h;
            }
        }
    }
    
    public final class c implements r0$d
    {
        public final s0 a;
        
        public c(final s0 a) {
            this.a = a;
        }
        
        public static void a(final byte[] array, final byte[] array2) {
            byte[] array3 = null;
            int n = 0;
            int n2 = 0;
            int n3 = -1850458006;
            byte[] array4 = null;
        Label_0265:
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
                        break Label_0265;
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
        
        public boolean a() {
            return true;
        }
        
        public boolean b() {
            return false;
        }
        
        public String c() {
            String s;
            if (this.a.c.isProd()) {
                final byte[] array2;
                final byte[] array = array2 = new byte[32];
                array2[0] = 51;
                array2[1] = -75;
                array2[2] = 40;
                array2[3] = -70;
                array2[4] = 99;
                array2[5] = 101;
                array2[6] = -16;
                array2[7] = 60;
                array2[8] = -54;
                array2[9] = -49;
                array2[10] = 45;
                array2[11] = 10;
                array2[12] = 53;
                array2[13] = 110;
                array2[14] = -118;
                array2[15] = 45;
                array2[16] = -110;
                array2[17] = -11;
                array2[18] = 92;
                array2[19] = -30;
                array2[20] = 79;
                array2[21] = 82;
                array2[22] = 7;
                array2[23] = 56;
                array2[24] = -6;
                array2[25] = -120;
                array2[26] = -105;
                array2[27] = -23;
                array2[28] = -100;
                array2[29] = -1;
                array2[30] = 105;
                array2[31] = -26;
                a(array, new byte[] { 91, -63, 92, -54, 16, 95, -33, 19, -69, -70, 72, 120, 76, 64, -21, 89, -5, -111, 57, -108, 60, 124, 100, 87, -105, -89, -29, -123, -20, -98, 15, -111 });
                s = new String(array, StandardCharsets.UTF_8);
            }
            else {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[32];
                array4[0] = 45;
                array4[1] = -117;
                array4[2] = -43;
                array4[3] = 58;
                array4[4] = 115;
                array4[5] = -57;
                array4[6] = 75;
                array4[7] = -91;
                array4[8] = -61;
                array4[9] = 60;
                array4[10] = -61;
                array4[11] = 17;
                array4[12] = 22;
                array4[13] = -34;
                array4[14] = -105;
                array4[15] = -47;
                array4[16] = -118;
                array4[17] = -81;
                array4[18] = -70;
                array4[19] = -22;
                array4[20] = 77;
                array4[21] = 100;
                array4[22] = 7;
                array4[23] = -74;
                array4[24] = 114;
                array4[25] = 110;
                array4[26] = -30;
                array4[27] = 33;
                array4[28] = 120;
                array4[29] = -86;
                array4[30] = -102;
                array4[31] = -35;
                a(array3, new byte[] { 69, -1, -95, 74, 0, -3, 100, -118, -78, 73, -90, 99, 111, -16, -10, -91, -29, -53, -33, -100, 62, 74, 100, -39, 31, 65, -106, 77, 28, -53, -4, -86 });
                s = new String(array3, StandardCharsets.UTF_8);
            }
            return s.intern();
        }
        
        public boolean d() {
            return false;
        }
        
        public String e() {
            return null;
        }
    }
    
    public final class d implements r0$f
    {
        public final s0 a;
        
        public d(final s0 a) {
            this.a = a;
        }
        
        public Integer a() {
            int n;
            if (this.a.c.isProd()) {
                n = 1;
            }
            else {
                n = 0;
            }
            return n;
        }
        
        public Integer b() {
            return P.z;
        }
        
        public Integer c() {
            int n;
            if (this.a.c.isProd()) {
                n = 1;
            }
            else {
                n = 0;
            }
            return n;
        }
        
        public Integer d() {
            Integer n;
            if (this.a.c.isProd()) {
                n = P.r;
            }
            else {
                n = 0;
            }
            return n;
        }
        
        public Integer e() {
            return P.x;
        }
        
        public Integer f() {
            Integer n;
            if (this.a.c.isProd()) {
                n = P.G;
            }
            else {
                n = 0;
            }
            return n;
        }
        
        public Integer g() {
            return 0;
        }
        
        public Integer h() {
            return 1;
        }
        
        public Integer i() {
            return P.t;
        }
        
        public Integer j() {
            return 1;
        }
        
        public Integer k() {
            return P.v;
        }
        
        public Integer l() {
            return P.E;
        }
        
        public Integer m() {
            return P.F;
        }
        
        public Integer n() {
            return P.B;
        }
        
        public Integer o() {
            return P.w;
        }
        
        public Integer p() {
            return P.A;
        }
        
        public Integer q() {
            return 1;
        }
        
        public Integer r() {
            Integer n;
            if (this.a.c.isProd()) {
                n = P.D;
            }
            else {
                n = 0;
            }
            return n;
        }
        
        public Integer s() {
            Integer n;
            if (this.a.c.isProd()) {
                n = P.y;
            }
            else {
                n = 0;
            }
            return n;
        }
        
        public Integer t() {
            Integer n;
            if (this.a.c.isProd()) {
                n = P.u;
            }
            else {
                n = 0;
            }
            return n;
        }
    }
}
