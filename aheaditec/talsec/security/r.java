package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class r extends f
{
    public static final String n;
    public static final String o;
    public static final int p = 1;
    public final u1 l;
    public final E1 m;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[16];
        array2[0] = 42;
        array2[1] = 14;
        array2[2] = -126;
        array2[3] = 49;
        array2[4] = 60;
        array2[5] = -43;
        array2[6] = -21;
        array2[7] = 126;
        array2[8] = 56;
        array2[9] = 117;
        array2[10] = 66;
        array2[11] = -57;
        array2[12] = -87;
        array2[13] = 45;
        array2[14] = -104;
        array2[15] = 119;
        b(array, new byte[] { 62, 110, 89, -23, 49, -113, 60, -73, 49, 39, -15, 2, -82, 126, 125, -94 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        o = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[4];
        array4[0] = -63;
        array4[1] = -46;
        array4[2] = 77;
        array4[3] = 38;
        b(array3, new byte[] { -41, -113, -84, -16, -109, -17, -108, 124 });
        n = new String(array3, utf_8).intern();
    }
    
    public r(final R0 r0, final u1 l, final E1 m) {
        super(r0);
        this.l = l;
        this.m = m;
    }
    
    private static void b(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n3 = 0;
        int n2 = n3 = 0;
        int n4 = -894652659;
        byte[] array4 = null;
    Label_0520:
        while (true) {
            final int n5 = (n4 & 0x1000000) * (n4 | 0x1000000) + (n4 & 0xFEFFFFFF) * (~n4 & 0x1000000);
            final int n6 = n4 >>> 8;
            final int n7 = n6 + n5 - (n6 & n5);
            final int n8 = (n7 ^ 0x56E7650F) + (n7 & 0x56E7650F) * 2;
            final int n9 = 1;
            final int n10 = 1;
            switch (n8 - 1434379843 + (~n8 & 0x557EE643) * 2) {
                default: {
                    n4 = 196573321;
                    continue;
                }
                case 1888416065: {
                    final int n11 = array4.length % 4;
                    final long n12 = lcmp((long)n11, (long)1) >>> 31 & 0x1;
                    if (n12 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 1298988808;
                    }
                    n3 = n11;
                    if (n12 != 0) {
                        n3 = n11;
                        break;
                    }
                    continue;
                }
                case 835516413: {
                    final int length = array.length;
                    final int n13 = 0 - (0 - array.length % 4);
                    int n14 = n10;
                    if ((length ^ n13) - (~length & n13) * 2 <= 0) {
                        n14 = 0;
                    }
                    if (n14 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 145880015;
                    }
                    if (n14 != 0) {
                        n4 = -826922365;
                    }
                    array3 = array2;
                    array4 = array;
                    n2 = 0;
                    continue;
                }
                case 614184219: {
                    final int length2 = array4.length;
                    final int n15 = 0 - n;
                    final int a = N.a(n15, -4, 1, length2);
                    final int length3 = array4.length;
                    final byte b = array4[(length3 ^ n15) + (length3 & n15) * 2];
                    final int length4 = array4.length;
                    final int n16 = 0 - n15;
                    final byte b2 = array3[(~n16 & length4) * 2 - (length4 ^ n16)];
                    array4[L.a(0, (length2 & 0x2) | a, n15 * 3, 1)] = (byte)((byte)((byte)b2 + (byte)b) - (byte)((byte)2 * (byte)(b2 & b)));
                    final int n17 = (0xEBDA5001 | n) + (0x1425AFFE | n);
                    final long n18 = lcmp((long)n, (long)2) >>> 31 & 0x1;
                    if (n18 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 1298988808;
                    }
                    n3 = n17;
                    if (n18 != 0) {
                        n3 = n17;
                        break;
                    }
                    continue;
                }
                case 172635213: {
                    final int length5 = array4.length;
                    final int n19 = 0 - n3;
                    int n20 = n9;
                    if (dcmpg((double)array3[(length5 ^ n19) + (length5 & n19) * 2], Double.NaN) <= -1) {
                        n20 = 0;
                    }
                    if (n20 != 0) {
                        n4 = -34715366;
                    }
                    else {
                        n4 = 196573321;
                    }
                    n = n3;
                    continue;
                }
                case -625567707: {
                    break Label_0520;
                }
                case -1882653318: {
                    final int n21 = n2 - 1 - (n2 | 0xFFFFFFFC);
                    final byte b3 = array3[n21];
                    final int n22 = (b3 & 0x1000000) * (b3 | 0x1000000) + (b3 & 0xFEFFFFFF) * (~b3 & 0x1000000);
                    final int n23 = n2 + 3 + (-1 - n2 | 0xFFFFFFFD);
                    final int n24 = array3[n23] & 0xFF;
                    final int n25 = n24 * (~n24 & 0x10000);
                    final int n26 = ~((n22 | (0x45BCA602 | ~n25)) - ((n25 & 0x45BCA602) | n22));
                    final int a2 = K.a(0x29123D34 & n2, n2, 1, 0x29123D35 & n2);
                    final int n27 = array3[a2] & 0xFF;
                    final int n28 = (~n26 & n27 * (~n27 & 0x100)) + n26;
                    final int n29 = n28 - 1 - (~(array3[n2] & 0xFF) | n28);
                    final byte b4 = array4[n21];
                    final int n30 = (b4 & 0x1000000) * (b4 | 0x1000000) + (0xFEFFFFFF & b4) * (~b4 & 0x1000000);
                    final int n31 = array4[n23] & 0xFF;
                    final int n32 = n31 * (~n31 & 0x10000);
                    final int n33 = ~((n30 | (~n32 | 0xE56F6087)) - ((n32 & 0xE56F6087) | n30));
                    final int n34 = array4[a2] & 0xFF;
                    final int n35 = n34 * (~n34 & 0x100);
                    final int n36 = array4[n2] & 0xFF;
                    final int n37 = (n35 + n33 - (n35 & n33) & ~n36) + n36;
                    final int n38 = n29 << (dcmpg((double)n29, Double.NaN) >>> 31);
                    final int n39 = n38 + n37 - (n38 & n37) * 2;
                    final int n40 = 659933421 - ((n39 & 0x2) | -1983400303 - n39);
                    array4[n2] = (byte)n40;
                    array4[a2] = (byte)(n40 >>> 8);
                    array4[n23] = (byte)(n40 >>> 16);
                    array4[n21] = (byte)(n40 >>> 24);
                    n2 = (n2 ^ 0x4) + (n2 & 0x4) * 2;
                    final int length6 = array4.length;
                    final int n41 = 0 - array4.length % 4;
                    final long n42 = lcmp((long)n2, (long)((length6 ^ n41) + (length6 & n41) * 2)) >>> 31 & 0x1;
                    if (n42 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 145880015;
                    }
                    if (n42 == 0) {
                        continue;
                    }
                    n4 = -826922365;
                    continue;
                }
                case -1970406716: {
                    final int length7 = array4.length;
                    final int n43 = 0 - n;
                    final int n44 = ~n43;
                    final int n45 = (length7 | n43) - (0x23ED3929 & n44 & length7) + ((n43 | 0x23ED3929) & length7);
                    final byte b5 = array3[n45];
                    final int length8 = array4.length;
                    final byte b6 = array3[(length8 ^ n44) + (n43 | length8) * 2 + 1];
                    final int n46 = (byte)0 - (byte)b5;
                    array3[n45] = (byte)((byte)((byte)2 * (byte)(b6 & ~n46)) - (byte)(b6 ^ n46));
                    n4 = -34715366;
                    continue;
                }
            }
            n4 = -518432968;
        }
    }
    
    public void a(final X x) {
        final i1.c b = this.m.b();
        if (b != null) {
            b.a(1);
        }
        this.m.a().b();
        this.l.a(t1$a.c, x.b());
        final byte[] array2;
        final byte[] array = array2 = new byte[16];
        array2[0] = -19;
        array2[1] = -51;
        array2[2] = 89;
        array2[3] = 36;
        array2[4] = 84;
        array2[5] = -30;
        array2[6] = 1;
        array2[7] = -65;
        array2[8] = -32;
        array2[9] = 121;
        array2[10] = 66;
        array2[11] = -40;
        array2[12] = -31;
        array2[13] = -116;
        array2[14] = 39;
        array2[15] = 76;
        b(array, new byte[] { -7, -83, -126, -4, 89, -72, -42, 118, -23, 43, -15, 29, -26, -33, -62, -103 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        this.a(new String(array, utf_8).intern(), x);
        if (x.c()) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[16];
            array4[0] = 78;
            array4[1] = -17;
            array4[2] = -77;
            array4[3] = -25;
            array4[4] = -88;
            array4[5] = -44;
            array4[6] = -94;
            array4[7] = -82;
            array4[8] = 95;
            array4[9] = -87;
            array4[10] = -41;
            array4[11] = -46;
            array4[12] = -119;
            array4[13] = 18;
            array4[14] = 4;
            array4[15] = -97;
            b(array3, new byte[] { 90, -113, 104, 63, -91, -114, 117, 103, 86, -5, 100, 23, -114, 65, -31, 74 });
            this.a(new String(array3, utf_8).intern(), this.m.a().b());
        }
        if (x.b()) {
            final E1 m = this.m;
            final Integer b2 = m.a().b();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = 24;
            array6[1] = 103;
            array6[2] = 62;
            array6[3] = -25;
            b(array5, new byte[] { 14, 58, -33, 49, 37, -127, 55, -76 });
            m.a(b2, new String(array5, utf_8).intern());
        }
    }
    
    public final void a(final boolean b) {
        this.l.a(t1$a.c, b);
    }
    
    public boolean b() {
        return true;
    }
    
    public boolean c() {
        this.m.a().b();
        return false;
    }
}
