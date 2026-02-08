package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.StandardCharsets;

public final class U0
{
    public final String a;
    public final String[] b;
    
    public U0(final String a, final String[] b) {
        final byte[] array2;
        final byte[] array = array2 = new byte[4];
        array2[0] = -58;
        array2[1] = -44;
        array2[2] = -70;
        array2[3] = -105;
        a(array, new byte[] { -44, -101, 101, 80, -2, 60, 123, 89 });
        Intrinsics.checkNotNullParameter((Object)a, new String(array, StandardCharsets.UTF_8).intern());
        this.a = a;
        this.b = b;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n3 = 0;
        int n2 = n3 = 0;
        int n4 = -894652659;
        byte[] array4 = null;
    Label_0519:
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
                    break Label_0519;
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
    
    public final U0 a(final String s, final String[] array) {
        final byte[] array3;
        final byte[] array2 = array3 = new byte[4];
        array3[0] = -118;
        array3[1] = 28;
        array3[2] = 96;
        array3[3] = -34;
        a(array2, new byte[] { -104, 83, -65, 25, 18, 22, 39, 16 });
        Intrinsics.checkNotNullParameter((Object)s, new String(array2, StandardCharsets.UTF_8).intern());
        return new U0(s, array);
    }
    
    public final String a() {
        return this.a;
    }
    
    public final String[] b() {
        return this.b;
    }
    
    public final String c() {
        return this.a;
    }
    
    public final String[] d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!Intrinsics.areEqual((Object)U0.class, (Object)class1)) {
            return false;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[93];
        array2[0] = -9;
        array2[1] = 71;
        array2[2] = 123;
        array2[3] = -81;
        array2[4] = -1;
        array2[5] = -50;
        array2[6] = 119;
        array2[7] = 117;
        array2[8] = 82;
        array2[9] = 123;
        array2[10] = 18;
        array2[11] = 32;
        array2[12] = 79;
        array2[13] = 62;
        array2[14] = 123;
        array2[15] = 4;
        array2[16] = 100;
        array2[17] = -4;
        array2[18] = -71;
        array2[19] = -24;
        array2[20] = -101;
        array2[21] = 117;
        array2[22] = 75;
        array2[23] = -94;
        array2[24] = -107;
        array2[25] = -12;
        array2[26] = 3;
        array2[27] = -93;
        array2[28] = -120;
        array2[29] = -93;
        array2[30] = -62;
        array2[31] = -75;
        array2[32] = 39;
        array2[33] = -86;
        array2[34] = -126;
        array2[35] = 52;
        array2[36] = 101;
        array2[37] = 63;
        array2[38] = -6;
        array2[39] = 119;
        array2[40] = -5;
        array2[41] = -25;
        array2[42] = 94;
        array2[43] = 34;
        array2[44] = 96;
        array2[45] = 37;
        array2[46] = 1;
        array2[47] = -6;
        array2[48] = -116;
        array2[49] = -30;
        array2[50] = -47;
        array2[51] = 78;
        array2[52] = 40;
        array2[53] = 85;
        array2[54] = 95;
        array2[55] = -65;
        array2[56] = 116;
        array2[57] = -58;
        array2[58] = 7;
        array2[59] = -58;
        array2[60] = 69;
        array2[61] = 120;
        array2[62] = 41;
        array2[63] = 33;
        array2[64] = -59;
        array2[65] = 0;
        array2[66] = 125;
        array2[67] = 116;
        array2[68] = -17;
        array2[69] = -81;
        array2[70] = 72;
        array2[71] = 3;
        array2[72] = 95;
        array2[73] = 123;
        array2[74] = 92;
        array2[75] = -43;
        array2[76] = -93;
        array2[77] = 35;
        array2[78] = -28;
        array2[79] = -128;
        array2[80] = 97;
        array2[81] = 25;
        array2[82] = -52;
        array2[83] = -48;
        array2[84] = 37;
        array2[85] = 121;
        array2[86] = -84;
        array2[87] = -124;
        array2[88] = 92;
        array2[89] = -47;
        array2[90] = -67;
        array2[91] = -105;
        array2[92] = 123;
        a(array, new byte[] { -27, 36, -91, 97, 59, -98, -92, -91, 64, 38, -12, -94, 73, 109, -23, -63, 97, -99, 95, 106, -125, 40, -39, 114, -122, -88, -100, 115, -111, -7, 28, 55, 63, -51, 96, -13, -95, 111, 27, -72, 41, -87, -124, -27, 101, 119, -38, 44, -123, -77, 113, -104, 45, 15, -70, 120, 115, -117, -30, 1, 66, 27, -51, -22, -35, 103, -35, -95, -26, -2, -81, -41, 82, 25, -73, 69, -86, 120, 3, 78, 100, 123, 45, 4, -9, 68, 72, 85, 72, -126, 89, 65, 2 });
        Intrinsics.checkNotNull(o, new String(array, StandardCharsets.UTF_8).intern());
        final U0 u0 = (U0)o;
        if (!Intrinsics.areEqual((Object)this.a, (Object)u0.a)) {
            return false;
        }
        final String[] b = this.b;
        if (b != null) {
            final String[] b2 = u0.b;
            if (b2 == null) {
                return false;
            }
            if (!Arrays.equals((Object[])b, (Object[])b2)) {
                return false;
            }
        }
        else if (u0.b != null) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String[] b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = Arrays.hashCode((Object[])b);
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final String a = this.a;
        final String string = Arrays.toString((Object[])this.b);
        final byte[] array2;
        final byte[] array = array2 = new byte[14];
        array2[0] = 66;
        array2[1] = 58;
        array2[2] = -21;
        array2[3] = -112;
        array2[4] = 39;
        array2[5] = -61;
        array2[6] = 84;
        array2[7] = -118;
        array2[8] = 20;
        array2[9] = -30;
        array2[10] = -113;
        array2[11] = -27;
        array2[12] = 108;
        array2[13] = 115;
        a(array, new byte[] { -74, 101, 10, 66, 46, -93, -78, 81, -40, -71, 92, 42, 9, 78 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[8];
        array4[0] = 94;
        array4[1] = 120;
        array4[2] = 44;
        array4[3] = 126;
        array4[4] = -125;
        array4[5] = 84;
        array4[6] = 18;
        array4[7] = -57;
        a(array3, new byte[] { -114, 117, -60, -67, -109, 55, -59, 88 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array5 = { -91 };
        a(array5, new byte[] { -116, 32, 121, 74, -67, -53, 42, -55 });
        return intern + a + intern2 + string + new String(array5, utf_8).intern();
    }
}
