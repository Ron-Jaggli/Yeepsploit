package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class h extends f
{
    public static final String m;
    public static final int n = 128;
    public final E1 l;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[13];
        array2[0] = -71;
        array2[1] = 51;
        array2[2] = 75;
        array2[3] = 19;
        array2[4] = 109;
        array2[5] = 79;
        array2[6] = 21;
        array2[7] = 48;
        array2[8] = 31;
        array2[9] = -97;
        array2[10] = 16;
        array2[11] = 72;
        array2[12] = 38;
        b(array, new byte[] { -79, 96, -93, -40, 106, 28, -95, -5, 13, -51, -53, -104, 65 });
        m = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public h(final R0 r0, final E1 l) {
        super(r0);
        this.l = l;
    }
    
    private static void b(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n3 = 0;
        int n2 = n3 = 0;
        int n4 = -894652659;
        byte[] array4 = null;
    Label_0515:
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
                    break Label_0515;
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
    
    public void a(final X x) {
        final i1.c b = this.l.b();
        if (b != null) {
            b.a(128);
        }
        this.l.a().i();
        final byte[] array2;
        final byte[] array = array2 = new byte[13];
        array2[0] = 13;
        array2[1] = -121;
        array2[2] = 30;
        array2[3] = 44;
        array2[4] = -102;
        array2[5] = -41;
        array2[6] = 88;
        array2[7] = 58;
        array2[8] = 123;
        array2[9] = 111;
        array2[10] = -121;
        array2[11] = 90;
        array2[12] = 62;
        b(array, new byte[] { 5, -44, -10, -25, -99, -124, -20, -15, 105, 61, 92, -118, 89 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        this.a(new String(array, utf_8).intern(), x);
        if (x.c()) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[13];
            array4[0] = 67;
            array4[1] = 54;
            array4[2] = -77;
            array4[3] = 52;
            array4[4] = 84;
            array4[5] = 124;
            array4[6] = -18;
            array4[7] = 112;
            array4[8] = 53;
            array4[9] = -16;
            array4[10] = 91;
            array4[11] = -51;
            array4[12] = -88;
            b(array3, new byte[] { 75, 101, 91, -1, 83, 47, 90, -69, 39, -94, -128, 29, -49 });
            this.b(new String(array3, utf_8).intern(), this.l.a().i());
        }
        if (x.b()) {
            final E1 l = this.l;
            final Integer i = l.a().i();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[13];
            array6[0] = 120;
            array6[1] = 42;
            array6[2] = -101;
            array6[3] = 5;
            array6[4] = 29;
            array6[5] = 118;
            array6[6] = -105;
            array6[7] = -54;
            array6[8] = 124;
            array6[9] = 104;
            array6[11] = (array6[10] = 123);
            array6[12] = -19;
            b(array5, new byte[] { 112, 121, 115, -50, 26, 37, 35, 1, 110, 58, -96, -85, -118 });
            l.a(i, new String(array5, utf_8).intern());
        }
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return false;
    }
}
