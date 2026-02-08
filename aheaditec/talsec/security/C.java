package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class c extends f
{
    public static final String m;
    public final E1 l;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[10];
        array2[0] = 32;
        array2[1] = -77;
        array2[2] = -56;
        array2[3] = 66;
        array2[4] = 71;
        array2[5] = 109;
        array2[6] = -81;
        array2[7] = 104;
        array2[8] = -82;
        array2[9] = 99;
        b(array, new byte[] { 88, -89, -64, -18, 64, -36, -30, -21, -53, 7 });
        m = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public c(final R0 r0, final E1 l) {
        super(r0);
        this.l = l;
    }
    
    public static void b(final byte[] array, final byte[] array2) {
        int n = 0;
        byte[] array3 = null;
        int n2 = 0;
        int a = 0;
        int n3 = a = 0;
        int n4 = 1516727821;
        byte[] array4 = null;
    Label_0481:
        while (true) {
            final int n5 = (n4 & 0x1000000) * (n4 | 0x1000000) + (n4 & 0xFEFFFFFF) * (~n4 & 0x1000000);
            final int n6 = n4 >>> 8;
            final int a2 = K.a(0x26CC2060 & ~n5 & n6, n6, n5, (n5 | 0x26CC2060) & n6);
            final int n7 = (a2 ^ 0x264C5215) + (a2 & 0x264C5215) * 2;
            final int n8 = 1;
            final int n9 = 1;
            Label_1023: {
                Label_1011: {
                    int n15 = 0;
                    switch (~n7 + (n7 | 0x1) * 2 ^ 0x3962F1EF) {
                        default: {
                            n4 = -365117735;
                            continue;
                        }
                        case 961838909: {
                            final int length = array4.length;
                            final int n10 = 0 - a;
                            int n11 = n9;
                            if (dcmpg((double)array3[(length | n10) - (0x9DAB291 & ~n10 & length) + ((n10 | 0x9DAB291) & length)], Double.NaN) <= -1) {
                                n11 = n;
                            }
                            if (n11 != 0) {
                                n4 = -365117735;
                            }
                            else {
                                n4 = 1093626513;
                            }
                            if (n11 != 0) {
                                n4 = -746753280;
                            }
                            n2 = a;
                            continue;
                        }
                        case 511524454: {
                            final int length2 = array4.length;
                            final int n12 = 0 - n2;
                            final int n13 = 0 - n12;
                            final int length3 = array4.length;
                            final byte b = array4[(length3 | n12) * 2 - (length3 ^ n12)];
                            final int length4 = array4.length;
                            final byte b2 = array3[(n12 ^ length4) + (length4 & n12) * 2];
                            array4[(length2 ^ n13) - (~length2 & n13) * 2] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                            final int n14 = a = M.a(n2, 3, ~n2 * 2, 1);
                            if ((lcmp((long)n2, (long)2) >>> 31 & 0x1) != 0x0) {
                                n15 = n14;
                                break;
                            }
                            break Label_1023;
                        }
                        case 180635757: {
                            final int length5 = array.length;
                            final int n16 = 0 - array.length % 4;
                            int n17 = n8;
                            if ((length5 ^ ~n16) + (length5 | n16) * 2 + 1 <= 0) {
                                n17 = n;
                            }
                            if (n17 != 0) {
                                n4 = -1605440657;
                            }
                            else {
                                n4 = -365117735;
                            }
                            if (n17 == 0) {
                                n4 = -169475207;
                            }
                            array3 = array2;
                            array4 = array;
                            n3 = n;
                            continue;
                        }
                        case -1135475043: {
                            break Label_0481;
                        }
                        case -1399959314: {
                            final int a3 = K.a(0xB82B9FA4 & n3, n3, 3, 0xB82B9FA7 & n3);
                            final byte b3 = array3[a3];
                            final int n18 = (b3 & 0x1000000) * (b3 | 0x1000000) + (b3 & 0xFEFFFFFF) * (~b3 & 0x1000000);
                            final int n19 = n3 - 1;
                            final int n20 = n19 - (n3 | 0xFFFFFFFD);
                            final int n21 = array3[n20] & 0xFF;
                            final int n22 = n21 * (~n21 & 0x10000);
                            final int a4 = J.a(n22, n18, 1, -1 - n22 | -1 - n18);
                            final int n23 = n19 - (n3 | 0xFFFFFFFE);
                            final int n24 = array3[n23] & 0xFF;
                            final int n25 = n24 * (~n24 & 0x100);
                            final int n26 = n25 - 1 - (~a4 | n25);
                            final int n27 = array3[n3] & 0xFF;
                            final int a5 = J.a(n26, n27, 1, -1 - n26 | -1 - n27);
                            final byte b4 = array4[a3];
                            final int n28 = (0x1000000 & b4) * (b4 | 0x1000000) + (0xFEFFFFFF & b4) * (~b4 & 0x1000000);
                            final int n29 = array4[n20] & 0xFF;
                            final int n30 = (n29 * (~n29 & 0x10000) & ~n28) + n28;
                            final int n31 = array4[n23] & 0xFF;
                            final int n32 = n31 * (~n31 & 0x100);
                            final int n33 = ~((~n32 | 0x3652D953 | n30) - ((n32 & 0x3652D953) | n30));
                            final int n34 = array4[n3] & 0xFF;
                            final int n35 = ~((~n33 | 0x557285B4 | n34) - ((n33 & 0x557285B4) | n34));
                            final int n36 = a5 << (dcmpg((double)a5, Double.NaN) >>> 31);
                            final int n37 = -1254002618 - ((n36 & 0x2) | -1672003491 - n36);
                            final int n38 = n37 + n35 - (n37 & n35) * 2;
                            array4[n3] = (byte)n38;
                            array4[n23] = (byte)(n38 >>> 8);
                            array4[n20] = (byte)(n38 >>> 16);
                            array4[a3] = (byte)(n38 >>> 24);
                            n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                            final int length6 = array4.length;
                            final int n39 = 0 - array4.length % 4;
                            final long n40 = lcmp((long)n3, (long)L.a(0, (length6 & 0x2) | N.a(n39, -4, 1, length6), n39 * 3, 1)) >>> 31 & 0x1;
                            int n41;
                            if (n40 != 0) {
                                n41 = -1605440657;
                            }
                            else {
                                n41 = -365117735;
                            }
                            if (n40 != 0) {
                                final int n42 = 0;
                                n4 = n41;
                                n = n42;
                                continue;
                            }
                            n4 = -169475207;
                            break Label_1011;
                        }
                        case -1725904394: {
                            n15 = array4.length % 4;
                            if ((lcmp((long)n15, (long)1) >>> 31 & 0x1) != 0x0) {
                                break;
                            }
                            final int n43 = 0;
                            a = n15;
                            n = n43;
                            break Label_1023;
                        }
                        case -1896910703: {
                            final int length7 = array4.length;
                            final int n44 = 0 - n2;
                            final int n45 = (length7 ^ n44) + (length7 & n44) * 2;
                            final byte b5 = array3[n45];
                            final int length8 = array4.length;
                            final int n46 = 0 - n44;
                            final int n47 = n46 | length8;
                            final byte b6 = array3[O.a(n46, 2, n47, length8 ^ n46 ^ n47)];
                            array3[n45] = (byte)((byte)((byte)2 * (byte)(b6 | b5)) - (byte)(b6 ^ b5));
                            n = 0;
                            n4 = -746753280;
                            continue;
                        }
                    }
                    n4 = -458924450;
                    a = n15;
                }
                n = 0;
                continue;
            }
            n4 = -365117735;
        }
    }
    
    public void a(final X x) {
        this.l.a().a();
        final byte[] array2;
        final byte[] array = array2 = new byte[10];
        array2[0] = -30;
        array2[1] = 53;
        array2[2] = 123;
        array2[3] = -110;
        array2[4] = -125;
        array2[5] = -97;
        array2[6] = -16;
        array2[7] = -61;
        array2[8] = -52;
        array2[9] = 47;
        b(array, new byte[] { -102, 33, 47, -66, 4, -49, -88, -106, -87, 75 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        this.a(new String(array, utf_8).intern(), x);
        if (x.c()) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[10];
            array4[0] = 82;
            array4[1] = -48;
            array4[2] = 127;
            array4[3] = 50;
            array4[4] = -3;
            array4[5] = 72;
            array4[6] = -27;
            array4[7] = -53;
            array4[8] = 15;
            array4[9] = -97;
            b(array3, new byte[] { 74, -124, 51, 94, -86, -7, -100, -114, 106, -5 });
            this.a(new String(array3, utf_8).intern(), this.l.a().a());
        }
        if (x.b()) {
            final E1 l = this.l;
            final Integer a = l.a().a();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[10];
            array6[0] = -42;
            array6[1] = -89;
            array6[2] = -32;
            array6[3] = 1;
            array6[4] = -20;
            array6[5] = 81;
            array6[6] = -2;
            array6[7] = 6;
            array6[8] = 59;
            array6[9] = 15;
            b(array5, new byte[] { -50, -109, -104, 43, -103, 0, -78, 81, 94, 107 });
            l.a(a, new String(array5, utf_8).intern());
        }
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return false;
    }
}
