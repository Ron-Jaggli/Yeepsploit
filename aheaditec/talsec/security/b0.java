package com.aheaditec.talsec.security;

import android.util.Base64;
import java.util.UUID;
import android.content.Context;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class B0 extends u0
{
    public static final String i;
    public static final String j;
    public final String g;
    public final Q h;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[5];
        array2[0] = 64;
        array2[1] = -14;
        array2[2] = -13;
        array2[3] = -58;
        array2[4] = -73;
        c(array, new byte[] { 15, -50, 124, -70, -60, -33, -34, 59 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        j = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[10];
        array4[0] = -29;
        array4[1] = 80;
        array4[2] = 121;
        array4[3] = -117;
        array4[4] = -41;
        array4[5] = 4;
        array4[6] = 101;
        array4[7] = -12;
        array4[8] = 42;
        array4[9] = 9;
        c(array3, new byte[] { 115, 110, -12, 23, -97, -102, -16, -87, 99, 109 });
        i = new String(array3, utf_8).intern();
    }
    
    public B0(final Context context) {
        super(context);
        final byte[] array2;
        final byte[] array = array2 = new byte[10];
        array2[0] = 42;
        array2[1] = 7;
        array2[2] = 76;
        array2[3] = 53;
        array2[4] = 121;
        array2[5] = -60;
        array2[6] = -120;
        array2[7] = 14;
        array2[8] = 99;
        array2[9] = 22;
        c(array, new byte[] { 44, -103, 41, 90, 1, -38, -43, -124, 42, 114 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String a = this.a(new String(array, utf_8).intern());
        if (a == null) {
            final String string = UUID.randomUUID().toString();
            this.g = string;
            final byte[] array4;
            final byte[] array3 = array4 = new byte[10];
            array4[0] = -124;
            array4[1] = 105;
            array4[2] = 63;
            array4[3] = -79;
            array4[4] = 50;
            array4[6] = (array4[5] = 23);
            array4[7] = -64;
            array4[8] = -123;
            array4[9] = 105;
            c(array3, new byte[] { -42, 55, 54, -34, 60, -87, 94, -66, -52, 13 });
            this.a(new String(array3, utf_8).intern(), string);
        }
        else {
            this.g = a;
        }
        this.h = new Q(context);
    }
    
    public static void c(final byte[] array, final byte[] array2) {
        int n = 0;
        byte[] array3 = null;
        int n2 = 0;
        int n4;
        int n3 = n4 = 0;
        int n5 = 1180709023;
        byte[] array4 = null;
    Label_0398:
        while (true) {
            final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
            final int n7 = n5 >>> 8;
            final int n8 = 1;
            int n9 = 1;
            final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
            final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
            Label_1029: {
                Label_0563: {
                    switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                        default: {
                            break Label_1029;
                        }
                        case 1548321255: {
                            final int length = array.length;
                            final int n11 = 0 - (0 - array.length % 4);
                            if ((length & ~n11) - (~length & n11) <= 0) {
                                n9 = n;
                            }
                            if (n9 != 0) {
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
                            final int n12 = 0 - n4;
                            final int length3 = array4.length;
                            final int n13 = ~n12;
                            final byte b = array4[(length3 | n12) - (0xD8E528C6 & n13 & length3) + ((0xD8E528C6 | n12) & length3)];
                            final int length4 = array4.length;
                            final byte b2 = array3[(length4 ^ n13) + (length4 | n12) * 2 + 1];
                            array4[(length2 | n12) * 2 - (length2 ^ n12)] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                            final int n14 = ~n4 + n4 * 2;
                            final long n15 = lcmp((long)n4, (long)2) >>> 31 & 0x1;
                            if (n15 != 0) {
                                n5 = 986083301;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            n2 = n14;
                            if (n15 != 0) {
                                n2 = n14;
                                continue;
                            }
                            break Label_0563;
                        }
                        case 373627814: {
                            break Label_0398;
                        }
                        case 298177592: {
                            final int length5 = array4.length;
                            final int n16 = 0 - n4;
                            final int a2 = L.a(n, (length5 & 0x2) | N.a(n16, -4, 1, length5), n16 * 3, 1);
                            final byte b3 = array3[a2];
                            final int length6 = array4.length;
                            final int n17 = 0 - n16;
                            final int n18 = n17 | length6;
                            final byte b4 = array3[O.a(n17, 2, n18, length6 ^ n17 ^ n18)];
                            array3[a2] = (byte)((byte)(b4 ^ b3) + (byte)((byte)2 * (byte)(b4 & b3)));
                            n5 = 1565752577;
                            continue;
                        }
                        case -97532338: {
                            final int n19 = array4.length % 4;
                            final long n20 = lcmp((long)n19, (long)1) >>> 31 & 0x1;
                            if (n20 != 0) {
                                n5 = 986083301;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            n2 = n19;
                            if (n20 != 0) {
                                n2 = n19;
                                continue;
                            }
                            break Label_0563;
                        }
                        case -870579640: {
                            final int n21 = n3 - 1 - (n3 | 0xFFFFFFFC);
                            final byte b5 = array3[n21];
                            final int n22 = (b5 & 0x1000000) * (b5 | 0x1000000) + (b5 & 0xFEFFFFFF) * (~b5 & 0x1000000);
                            final int n23 = n3 + 3 + (-1 - n3 | 0xFFFFFFFD);
                            final int n24 = array3[n23] & 0xFF;
                            final int n25 = n24 * (~n24 & 0x10000);
                            final int n26 = ~((0xB46B5CF6 | ~n25 | n22) - ((n25 & 0xB46B5CF6) | n22));
                            final int a3 = K.a(0xF821C5CC & n3, n3, 1, 0xF821C5CD & n3);
                            final int n27 = array3[a3] & 0xFF;
                            final int n28 = n27 * (~n27 & 0x100);
                            final int n29 = array3[n3] & 0xFF;
                            final int n30 = (n28 + n26 - (n28 & n26) & ~n29) + n29;
                            final byte b6 = array4[n21];
                            final int n31 = (b6 & 0x1000000) * (b6 | 0x1000000) + (0xFEFFFFFF & b6) * (~b6 & 0x1000000);
                            final int n32 = array4[n23] & 0xFF;
                            final int n33 = n32 * (~n32 & 0x10000);
                            final int n34 = ~((n31 | (~n33 | 0xAF2F3113)) - ((n33 & 0xAF2F3113) | n31));
                            final int n35 = array4[a3] & 0xFF;
                            final int n36 = n35 * (~n35 & 0x100);
                            final int a4 = J.a(n36, n34, 1, -1 - n36 | -1 - n34);
                            final int n37 = a4 - 1 - (~(array4[n3] & 0xFF) | a4);
                            final int n38 = n30 << (dcmpg((double)n30, Double.NaN) >>> 31);
                            final int n39 = (n38 ^ 0xE715D017) + (n38 & 0xE715D017) * 2;
                            final int n40 = n39 + n37 - (n39 & n37) * 2;
                            array4[n3] = (byte)n40;
                            array4[a3] = (byte)(n40 >>> 8);
                            array4[n23] = (byte)(n40 >>> 16);
                            array4[n21] = (byte)(n40 >>> 24);
                            n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                            final int length7 = array4.length;
                            final int a5 = com.aheaditec.talsec.security.a.a(array4.length, 4, 0, 0);
                            if ((lcmp((long)n3, (long)((length7 & ~a5) * 2 - (length7 ^ a5))) >>> 31 & 0x1) != 0x0) {
                                n5 = 1910359311;
                                n = 0;
                                continue;
                            }
                            n = 0;
                            break Label_1029;
                        }
                        case -2000520841: {
                            final int length8 = array4.length;
                            final int n41 = 0 - (0 - n2);
                            int n42 = n8;
                            if (dcmpg((double)array3[(length8 & ~n41) * 2 - (length8 ^ n41)], Double.NaN) <= -1) {
                                n42 = 0;
                            }
                            if (n42 != 0) {
                                n5 = 1565752577;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            if (n42 == 0) {
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
    
    public void a(final byte[] array) {
        final byte[] array3;
        final byte[] array2 = array3 = new byte[5];
        array3[0] = -34;
        array3[1] = -98;
        array3[2] = -112;
        array3[3] = 18;
        array3[4] = 42;
        c(array2, new byte[] { -95, 34, -36, -114, 89, -41, -4, -103 });
        this.a(new String(array2, StandardCharsets.UTF_8).intern(), Base64.encodeToString(array, 2));
    }
    
    public String b() {
        return this.h.a();
    }
    
    public String c() {
        return this.g;
    }
    
    public byte[] d() {
        final byte[] array2;
        final byte[] array = array2 = new byte[5];
        array2[0] = 120;
        array2[1] = -5;
        array2[2] = -13;
        array2[3] = -14;
        array2[4] = 4;
        c(array, new byte[] { 7, -57, 124, -82, 119, 15, -33, -118 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (!this.b(new String(array, utf_8).intern())) {
            return new byte[2];
        }
        final byte[] array4;
        final byte[] array3 = array4 = new byte[5];
        array4[0] = 35;
        array4[1] = 91;
        array4[2] = -16;
        array4[3] = -102;
        array4[4] = 113;
        c(array3, new byte[] { 46, 103, 123, 22, 2, -13, -111, -109 });
        return Base64.decode(this.a(new String(array3, utf_8).intern()), 2);
    }
}
