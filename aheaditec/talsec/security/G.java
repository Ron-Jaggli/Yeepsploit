package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class g extends f
{
    public static final String m;
    public final E1 l;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 97;
        array2[1] = -66;
        array2[2] = 126;
        array2[3] = -64;
        array2[4] = 115;
        array2[5] = 84;
        array2[6] = 89;
        b(array, new byte[] { -18, 10, -13, -91, 28, 48, 60, 20 });
        m = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public g(final R0 r0, final E1 l) {
        super(r0);
        this.l = l;
    }
    
    private static void b(final byte[] array, final byte[] array2) {
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
    
    public void a(final X x) {
        this.l.a().c();
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = -19;
        array2[1] = 25;
        array2[2] = 56;
        array2[3] = 71;
        array2[4] = -2;
        array2[5] = -7;
        array2[6] = 48;
        b(array, new byte[] { 114, -84, 56, 35, -111, -99, 85, -50 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        this.a(new String(array, utf_8).intern(), x);
        if (x.c()) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[7];
            array4[0] = -30;
            array4[1] = 101;
            array4[2] = -128;
            array4[3] = 75;
            array4[4] = -5;
            array4[5] = 81;
            array4[6] = 92;
            b(array3, new byte[] { 111, 48, -32, 31, -108, 53, 57, -1 });
            this.a(new String(array3, utf_8).intern(), this.l.a().c());
        }
        if (x.b()) {
            final E1 l = this.l;
            final Integer c = l.a().c();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[7];
            array6[0] = 44;
            array6[1] = -72;
            array6[2] = -111;
            array6[3] = -127;
            array6[4] = 100;
            array6[5] = -47;
            array6[6] = -35;
            b(array5, new byte[] { 49, 13, -46, -27, 11, -75, -72, -61 });
            l.a(c, new String(array5, utf_8).intern());
        }
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return false;
    }
}
