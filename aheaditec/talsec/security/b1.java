package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class b1
{
    public static volatile b1 b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public final t0 a;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = -116;
        array2[1] = -127;
        array2[2] = 102;
        array2[3] = 48;
        array2[4] = -23;
        array2[5] = -100;
        array2[6] = 107;
        array2[7] = 115;
        array2[8] = -78;
        array2[9] = -125;
        array2[10] = 113;
        array2[11] = -15;
        array2[12] = 36;
        array2[13] = 80;
        array2[14] = 89;
        array2[15] = -35;
        array2[16] = -75;
        a(array, new byte[] { -2, -28, 5, 95, -101, -8, 2, 29, -43, -36, 18, -98, 81, 62, 45, -72, -57 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        f = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[18];
        array4[0] = -28;
        array4[1] = -57;
        array4[2] = 7;
        array4[3] = 108;
        array4[4] = 71;
        array4[5] = -93;
        array4[6] = 0;
        array4[7] = -8;
        array4[8] = -10;
        array4[9] = 51;
        array4[10] = 49;
        array4[11] = -60;
        array4[12] = 63;
        array4[13] = -69;
        array4[14] = -52;
        array4[15] = 70;
        array4[16] = -115;
        array4[17] = -37;
        a(array3, new byte[] { -105, -92, 117, 9, 34, -51, 115, -112, -103, 71, 110, -89, 80, -50, -94, 50, -24, -87 });
        e = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[19];
        array6[0] = 47;
        array6[1] = -77;
        array6[2] = 78;
        array6[3] = -66;
        array6[4] = 46;
        array6[5] = -47;
        array6[6] = -96;
        array6[7] = 15;
        array6[8] = -6;
        array6[9] = -38;
        array6[10] = 66;
        array6[11] = -96;
        array6[12] = 20;
        array6[13] = -122;
        array6[14] = 35;
        array6[15] = -55;
        array6[16] = 20;
        array6[17] = -60;
        array6[18] = -123;
        a(array5, new byte[] { 67, -46, 61, -54, 113, -93, -59, 108, -107, -88, 38, -55, 122, -31, 124, -83, 117, -80, -32 });
        d = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[20];
        array8[0] = 76;
        array8[1] = 21;
        array8[2] = 1;
        array8[3] = -115;
        array8[4] = -118;
        array8[5] = -49;
        array8[6] = 14;
        array8[7] = -4;
        array8[8] = -35;
        array8[9] = 81;
        array8[10] = -23;
        array8[11] = 47;
        array8[12] = -128;
        array8[13] = -1;
        array8[14] = -4;
        array8[15] = -1;
        array8[16] = -73;
        array8[17] = -44;
        array8[18] = 21;
        array8[19] = -27;
        a(array7, new byte[] { 32, 116, 114, -7, -43, -68, 109, -114, -72, 52, -121, 92, -24, -112, -120, -96, -45, -75, 97, -128 });
        c = new String(array7, utf_8).intern();
    }
    
    public b1(final t0 a) {
        this.a = a;
    }
    
    public static b1 a(final t0 t0) {
        if (b1.b == null) {
            synchronized (b1.class) {
                if (b1.b == null) {
                    b1.b = new b1(t0);
                }
            }
        }
        return b1.b;
    }
    
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
                        array4 = array2;
                        array3 = array;
                        n3 = 0;
                        continue;
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
            n = n49;
        }
    }
    
    public Long a() {
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[19];
        array2[0] = -8;
        array2[1] = -107;
        array2[2] = -72;
        array2[3] = 7;
        array2[4] = 0;
        array2[5] = -63;
        array2[6] = 37;
        array2[7] = 64;
        array2[8] = -75;
        array2[9] = -11;
        array2[10] = 32;
        array2[11] = 121;
        array2[12] = -54;
        array2[13] = 39;
        array2[14] = 61;
        array2[15] = 7;
        array2[16] = -87;
        array2[17] = 10;
        array2[18] = 12;
        a(array, new byte[] { -108, -12, -53, 115, 95, -77, 64, 35, -38, -121, 68, 16, -92, 64, 98, 99, -56, 126, 105 });
        final String a2 = a.a(new String(array, StandardCharsets.UTF_8).intern());
        Long value;
        if (a2 != null) {
            value = Long.parseLong(a2);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public Long b() {
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = 54;
        array2[1] = 125;
        array2[2] = 43;
        array2[3] = -27;
        array2[4] = -36;
        array2[5] = -79;
        array2[6] = 16;
        array2[7] = 101;
        array2[8] = -77;
        array2[9] = -34;
        array2[10] = -107;
        array2[11] = 22;
        array2[12] = -56;
        array2[13] = -18;
        array2[14] = -54;
        array2[15] = 121;
        array2[16] = -1;
        array2[17] = 71;
        array2[18] = 83;
        array2[19] = 89;
        a(array, new byte[] { 90, 28, 88, -111, -125, -62, 115, 23, -42, -69, -5, 101, -96, -127, -66, 38, -101, 38, 39, 60 });
        final String a2 = a.a(new String(array, StandardCharsets.UTF_8).intern());
        Long value;
        if (a2 != null) {
            value = Long.parseLong(a2);
        }
        else {
            value = null;
        }
        return value;
    }
    
    public int c() {
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = 88;
        array2[1] = -46;
        array2[2] = 14;
        array2[3] = 87;
        array2[4] = 77;
        array2[5] = -85;
        array2[6] = 70;
        array2[7] = -55;
        array2[8] = -35;
        array2[9] = 45;
        array2[10] = 127;
        array2[11] = 88;
        array2[12] = 120;
        array2[13] = -128;
        array2[14] = 94;
        array2[15] = -12;
        array2[16] = -30;
        a(array, new byte[] { 42, -73, 109, 56, 63, -49, 47, -89, -70, 114, 28, 55, 13, -18, 42, -111, -112 });
        final String a2 = a.a(new String(array, StandardCharsets.UTF_8).intern());
        int int1;
        if (a2 != null) {
            int1 = Integer.parseInt(a2);
        }
        else {
            int1 = 0;
        }
        return int1;
    }
    
    public int d() {
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = 50;
        array2[1] = 41;
        array2[2] = 101;
        array2[3] = -9;
        array2[4] = -94;
        array2[5] = 98;
        array2[6] = -83;
        array2[7] = 125;
        array2[8] = -6;
        array2[9] = -48;
        array2[10] = -114;
        array2[11] = 114;
        array2[12] = 101;
        array2[13] = -72;
        array2[14] = 58;
        array2[15] = -128;
        array2[16] = 100;
        array2[17] = 26;
        a(array, new byte[] { 65, 74, 23, -110, -57, 12, -34, 21, -107, -92, -47, 17, 10, -51, 84, -12, 1, 104 });
        final String a2 = a.a(new String(array, StandardCharsets.UTF_8).intern());
        int int1;
        if (a2 != null) {
            int1 = Integer.parseInt(a2);
        }
        else {
            int1 = 0;
        }
        return int1;
    }
    
    public int e() {
        this.i();
        final int n = this.c() + 1;
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = 103;
        array2[1] = 68;
        array2[2] = 1;
        array2[3] = -42;
        array2[4] = -72;
        array2[5] = 66;
        array2[6] = 101;
        array2[7] = -18;
        array2[8] = 57;
        array2[9] = 93;
        array2[10] = -48;
        array2[11] = -70;
        array2[12] = 78;
        array2[13] = -7;
        array2[14] = -126;
        array2[15] = 75;
        array2[16] = 78;
        a(array, new byte[] { 21, 33, 98, -71, -54, 38, 12, -128, 94, 2, -77, -43, 59, -105, -10, 46, 60 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), String.valueOf(n));
        return n;
    }
    
    public int f() {
        this.j();
        final int n = this.d() + 1;
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = -75;
        array2[1] = -76;
        array2[2] = -65;
        array2[3] = -8;
        array2[4] = -34;
        array2[5] = 107;
        array2[6] = -6;
        array2[7] = -28;
        array2[8] = 95;
        array2[9] = -46;
        array2[10] = 122;
        array2[11] = 121;
        array2[12] = 84;
        array2[13] = -60;
        array2[15] = (array2[14] = -4);
        array2[16] = 115;
        array2[17] = -72;
        a(array, new byte[] { -58, -41, -51, -99, -69, 5, -119, -116, 48, -90, 37, 26, 59, -79, -110, -120, 22, -54 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), String.valueOf(n));
        return n;
    }
    
    public void g() {
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = -116;
        array2[1] = 103;
        array2[2] = 24;
        array2[3] = 80;
        array2[4] = 34;
        array2[5] = 49;
        array2[6] = -79;
        array2[7] = 122;
        array2[8] = 78;
        array2[9] = 52;
        array2[10] = -70;
        array2[11] = -98;
        array2[12] = 121;
        array2[13] = 48;
        array2[14] = -11;
        array2[15] = 0;
        array2[16] = -55;
        a(array, new byte[] { -2, 2, 123, 63, 80, 85, -40, 20, 41, 107, -39, -15, 12, 94, -127, 101, -69 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array3 = { 47 };
        a(array3, new byte[] { 31, 12, -113, -27, 93, 73, -120, -79 });
        a.a(intern, new String(array3, utf_8).intern());
    }
    
    public void h() {
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = -9;
        array2[1] = 2;
        array2[2] = 60;
        array2[3] = -3;
        array2[4] = 89;
        array2[5] = 125;
        array2[6] = -59;
        array2[7] = 48;
        array2[8] = 79;
        array2[9] = 1;
        array2[10] = 94;
        array2[11] = -113;
        array2[12] = -57;
        array2[13] = -46;
        array2[14] = 30;
        array2[15] = -100;
        array2[16] = 106;
        array2[17] = 29;
        a(array, new byte[] { -124, 97, 78, -104, 60, 19, -74, 88, 32, 117, 1, -20, -88, -89, 112, -24, 15, 111 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array3 = { 101 };
        a(array3, new byte[] { 85, 114, 111, 2, 87, -54, -102, 43 });
        a.a(intern, new String(array3, utf_8).intern());
    }
    
    public long i() {
        final long currentTimeMillis = System.currentTimeMillis();
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[19];
        array2[0] = -15;
        array2[1] = 26;
        array2[2] = 48;
        array2[3] = 16;
        array2[4] = 12;
        array2[5] = -30;
        array2[6] = 82;
        array2[7] = 107;
        array2[8] = -23;
        array2[9] = -110;
        array2[10] = -107;
        array2[11] = 98;
        array2[12] = -113;
        array2[13] = 91;
        array2[14] = -19;
        array2[15] = 40;
        array2[16] = -121;
        array2[17] = 35;
        array2[18] = -101;
        a(array, new byte[] { -99, 123, 67, 100, 83, -112, 55, 8, -122, -32, -15, 11, -31, 60, -78, 76, -26, 87, -2 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), String.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }
    
    public long j() {
        final long currentTimeMillis = System.currentTimeMillis();
        final t0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = 89;
        array2[1] = 14;
        array2[2] = 123;
        array2[3] = -64;
        array2[4] = -57;
        array2[5] = -104;
        array2[6] = -80;
        array2[7] = 86;
        array2[8] = -91;
        array2[9] = 40;
        array2[10] = -14;
        array2[11] = -28;
        array2[12] = 125;
        array2[13] = 1;
        array2[14] = -16;
        array2[15] = -18;
        array2[16] = -42;
        array2[17] = -33;
        array2[18] = -14;
        array2[19] = 45;
        a(array, new byte[] { 53, 111, 8, -76, -104, -21, -45, 36, -64, 77, -100, -105, 21, 110, -124, -79, -78, -66, -122, 72 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), String.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }
}
