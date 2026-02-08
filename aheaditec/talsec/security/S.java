package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class s extends f
{
    public static final String m;
    public final E1 l;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[15];
        array2[0] = 97;
        array2[1] = -124;
        array2[2] = 19;
        array2[3] = 39;
        array2[4] = 5;
        array2[5] = -26;
        array2[6] = -65;
        array2[7] = -45;
        array2[8] = 120;
        array2[9] = -2;
        array2[10] = -15;
        array2[11] = 107;
        array2[12] = -33;
        array2[13] = 88;
        array2[14] = -20;
        b(array, new byte[] { 118, 17, -9, -20, -52, -67, 99, 83, 127, -125, 17, -86, -74, 54, -117 });
        m = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public s(final R0 r0, final E1 l) {
        super(r0);
        this.l = l;
    }
    
    private static void b(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = -1003175592;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] array4 = null;
    Label_0322:
        while (true) {
            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
            final int n6 = n >>> 8;
            final int n7 = ~((~n6 | 0xBEB383EC | n5) - ((n6 & 0xBEB383EC) | n5));
            final int n8 = -1171264002 - ((n7 & 0x2) | -130029571 - n7);
            Label_0977: {
                Label_0371: {
                    switch (0xBDD888E4 ^ ~n8 + (n8 | 0x1) * 2) {
                        default: {
                            break Label_0977;
                        }
                        case 1879000533: {
                            final int length = array4.length;
                            final int n9 = 0 - n3;
                            final int n10 = 0 - n9;
                            final int n11 = n10 | length;
                            final int length2 = array4.length;
                            final byte b = array4[(n10 ^ length2) - (~length2 & n10) * 2];
                            final int length3 = array4.length;
                            final byte b2 = array3[(n9 | length3) * 2 - (length3 ^ n9)];
                            array4[n11 - n10 * 2 + (length ^ n10 ^ n11)] = (byte)((byte)~b2 + (byte)((byte)2 * (byte)(b2 | 0x1)) ^ b ^ 0x1);
                            final int n12 = ~n3 + n3 * 2;
                            final long n13 = lcmp((long)n3, (long)2) >>> 31 & 0x1;
                            if (n13 != 0) {
                                n = -1216566512;
                            }
                            else {
                                n = 935800592;
                            }
                            n2 = n12;
                            if (n13 != 0) {
                                n2 = n12;
                                continue;
                            }
                            break Label_0371;
                        }
                        case 1870596681: {
                            break Label_0322;
                        }
                        case 1429728656: {
                            final int n14 = array4.length % 4;
                            final long n15 = lcmp((long)n14, (long)1) >>> 31 & 0x1;
                            if (n15 != 0) {
                                n = -1216566512;
                            }
                            else {
                                n = 935800592;
                            }
                            n2 = n14;
                            if (n15 != 0) {
                                n2 = n14;
                                continue;
                            }
                            break Label_0371;
                        }
                        case 256719606: {
                            final int n16 = n4 - 1 - (n4 | 0xFFFFFFFC);
                            final byte b3 = array3[n16];
                            final int n17 = (b3 & 0x1000000) * (b3 | 0x1000000) + (b3 & 0xFEFFFFFF) * (~b3 & 0x1000000);
                            final int n18 = n4 + 2;
                            final int n19 = n18 - (n4 & 0x2);
                            final int n20 = array3[n19] & 0xFF;
                            final int n21 = n20 * (~n20 & 0x10000);
                            final int a = J.a(n21, n17, 1, -1 - n21 | -1 - n17);
                            final int n22 = n18 + (-1 - n4 | 0xFFFFFFFE);
                            final int n23 = array3[n22] & 0xFF;
                            final int n24 = n23 * (~n23 & 0x100);
                            final int n25 = n24 - 1 - (~a | n24);
                            final int n26 = array3[n4] & 0xFF;
                            final int n27 = ~((n26 | (~n25 | 0xD2FAA664)) - ((n25 & 0xD2FAA664) | n26));
                            final byte b4 = array4[n16];
                            final int n28 = (b4 & 0x1000000) * (b4 | 0x1000000) + (0xFEFFFFFF & b4) * (~b4 & 0x1000000);
                            final int n29 = array4[n19] & 0xFF;
                            final int n30 = n29 * (~n29 & 0x10000);
                            final int n31 = array4[n22] & 0xFF;
                            final int n32 = n31 * (~n31 & 0x100);
                            final int n33 = array4[n4] & 0xFF;
                            final int n34 = n27 << (dcmpg((double)n27, Double.NaN) >>> 31);
                            final int n35 = -659933419 - ((n28 & 0x2) | 1983400305 - n28);
                            final int n36 = (n35 ^ ~n30) + (n35 | n30) * 2 + 1;
                            final int n37 = (n36 ^ n33) + (n36 & n33) * 2;
                            final int n38 = (n37 | n32) - (0x8249843B & ~n32 & n37) + ((n32 | 0x8249843B) & n37);
                            final int a2 = y1.a(n34 | n38, 2, n34, n38);
                            array4[n4] = (byte)a2;
                            array4[n22] = (byte)(a2 >>> 8);
                            array4[n19] = (byte)(a2 >>> 16);
                            array4[n16] = (byte)(a2 >>> 24);
                            n4 = (n4 ^ 0x4) + (n4 & 0x4) * 2;
                            final int length4 = array4.length;
                            final int n39 = 0 - array4.length % 4;
                            final long n40 = lcmp((long)n4, (long)((length4 | n39) * 2 - (length4 ^ n39))) >>> 31 & 0x1;
                            if (n40 != 0) {
                                n = -1515449616;
                            }
                            else {
                                n = 935800592;
                            }
                            if (n40 != 0) {
                                continue;
                            }
                            n = -10521562;
                            continue;
                        }
                        case -497756741: {
                            final int length5 = array4.length;
                            final int n41 = 0 - n3;
                            final int n42 = (length5 | n41) * 2 - (length5 ^ n41);
                            final byte b5 = array3[n42];
                            final int length6 = array4.length;
                            final byte b6 = array3[(n41 | length6) - (0x45569591 & ~n41 & length6) + ((n41 | 0x45569591) & length6)];
                            array3[n42] = (byte)((byte)((byte)(b6 ^ ~b5) + (byte)((byte)2 * (byte)(b6 | b5))) + (byte)1);
                            break Label_0977;
                        }
                        case -1486048729: {
                            final int length7 = array.length;
                            final int n43 = 0 - (0 - array.length % 4);
                            final boolean b7 = (length7 & ~n43) - (~length7 & n43) > 0;
                            if (b7) {
                                n = -1515449616;
                            }
                            else {
                                n = 935800592;
                            }
                            if (!b7) {
                                n = -10521562;
                            }
                            array3 = array2;
                            array4 = array;
                            n4 = 0;
                            continue;
                        }
                        case -1922532006: {
                            final int length8 = array4.length;
                            final int n44 = 0 - n2;
                            if (dcmpg((double)array3[L.a(0, (length8 & 0x2) | N.a(n44, -4, 1, length8), n44 * 3, 1)], Double.NaN) > -1) {
                                n = 935800592;
                            }
                            else {
                                n = -1671996003;
                            }
                            n3 = n2;
                            continue;
                        }
                    }
                    continue;
                }
                n = -1058029970;
                continue;
            }
            n = 935800592;
        }
    }
    
    public void a(final X x) {
        this.l.a().p();
        final byte[] array2;
        final byte[] array = array2 = new byte[15];
        array2[0] = 62;
        array2[1] = 58;
        array2[2] = 44;
        array2[3] = 38;
        array2[4] = -37;
        array2[5] = -41;
        array2[6] = -16;
        array2[7] = 93;
        array2[8] = 91;
        array2[9] = -51;
        array2[10] = -7;
        array2[11] = 83;
        array2[12] = 6;
        array2[13] = 98;
        array2[14] = -7;
        b(array, new byte[] { -111, 68, -20, -19, 26, -85, 48, -91, -100, -43, 25, -46, 111, 12, -98 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        this.a(new String(array, utf_8).intern(), x);
        if (x.c()) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[15];
            array4[0] = -29;
            array4[1] = 123;
            array4[2] = -49;
            array4[3] = 66;
            array4[4] = 7;
            array4[5] = 104;
            array4[6] = -125;
            array4[7] = 3;
            array4[8] = -53;
            array4[9] = 36;
            array4[10] = -92;
            array4[11] = 98;
            array4[12] = -6;
            array4[13] = 108;
            array4[14] = -89;
            b(array3, new byte[] { -12, 10, 51, -64, -50, 59, -89, 0, 12, 125, 100, -95, -109, 2, -64 });
            this.b(new String(array3, utf_8).intern(), this.l.a().p());
        }
        if (x.b()) {
            final E1 l = this.l;
            final Integer p = l.a().p();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[15];
            array6[0] = -49;
            array6[1] = -125;
            array6[2] = 43;
            array6[3] = 85;
            array6[4] = 126;
            array6[5] = -125;
            array6[6] = 73;
            array6[7] = 127;
            array6[8] = -63;
            array6[9] = -78;
            array6[10] = -48;
            array6[11] = -56;
            array6[12] = 106;
            array6[13] = 38;
            array6[14] = -35;
            b(array5, new byte[] { 0, 18, -17, -46, 71, 31, -23, -124, 6, -49, 48, 79, 3, 72, -70 });
            l.a(p, new String(array5, utf_8).intern());
        }
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return false;
    }
}
