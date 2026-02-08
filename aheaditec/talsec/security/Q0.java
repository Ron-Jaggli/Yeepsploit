package com.aheaditec.talsec.security;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.StandardCharsets;

public final class q0 implements y0
{
    public final int[] a;
    
    public q0(final int[] a) {
        final byte[] array2;
        final byte[] array = array2 = new byte[23];
        array2[0] = 66;
        array2[1] = -10;
        array2[2] = -54;
        array2[3] = -64;
        array2[4] = -54;
        array2[5] = 116;
        array2[6] = -100;
        array2[7] = -114;
        array2[8] = 57;
        array2[9] = 74;
        array2[10] = 111;
        array2[11] = 104;
        array2[12] = -7;
        array2[13] = 116;
        array2[14] = 33;
        array2[15] = 11;
        array2[16] = 114;
        array2[17] = -12;
        array2[18] = -44;
        array2[19] = -77;
        array2[20] = -99;
        array2[21] = 97;
        array2[22] = 117;
        a(array, new byte[] { 72, -91, 25, 22, -45, 20, 75, 56, 48, 43, -119, -93, -21, 33, -102, -37, 117, -93, 2, 116, -13, 21, 6 });
        Intrinsics.checkNotNullParameter((Object)a, new String(array, StandardCharsets.UTF_8).intern());
        this.a = a;
    }
    
    private static void a(final byte[] array, final byte[] array2) {
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
    
    public void a(final JSONObject jsonObject) throws JSONException {
        final byte[] array2;
        final byte[] array = array2 = new byte[4];
        array2[0] = -25;
        array2[1] = 40;
        array2[2] = -22;
        array2[3] = 81;
        a(array, new byte[] { -23, 73, 11, -127, -91, 2, 7, -58 });
        Intrinsics.checkNotNullParameter((Object)jsonObject, new String(array, StandardCharsets.UTF_8).intern());
        final JSONArray jsonArray = new JSONArray();
        final int[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            jsonArray.put(a[i]);
        }
        final byte[] array4;
        final byte[] array3 = array4 = new byte[21];
        array4[0] = -38;
        array4[1] = -33;
        array4[2] = -37;
        array4[3] = 50;
        array4[4] = 124;
        array4[5] = 44;
        array4[6] = -9;
        array4[7] = 64;
        array4[8] = -110;
        array4[9] = 68;
        array4[10] = 42;
        array4[11] = 11;
        array4[12] = -45;
        array4[13] = -84;
        array4[14] = 87;
        array4[15] = -72;
        array4[16] = -33;
        array4[17] = 64;
        array4[18] = 69;
        array4[19] = 85;
        array4[20] = 78;
        a(array3, new byte[] { -42, -112, 62, -102, 117, 99, 17, -105, -124, 23, -20, -52, -60, -50, -116, 104, -44, 114, -106, -125, 47 });
        jsonObject.put(new String(array3, StandardCharsets.UTF_8).intern(), (Object)jsonArray);
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
        if (!Intrinsics.areEqual((Object)q0.class, (Object)class1)) {
            return false;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[116];
        array2[0] = -41;
        array2[1] = -34;
        array2[2] = 108;
        array2[3] = -123;
        array2[4] = 46;
        array2[5] = -120;
        array2[6] = 17;
        array2[7] = 104;
        array2[8] = -94;
        array2[9] = 10;
        array2[10] = -60;
        array2[11] = -1;
        array2[12] = 64;
        array2[13] = -106;
        array2[14] = -73;
        array2[15] = 31;
        array2[16] = -122;
        array2[17] = -93;
        array2[18] = 13;
        array2[19] = -48;
        array2[20] = -105;
        array2[21] = -68;
        array2[22] = 51;
        array2[23] = -60;
        array2[24] = -22;
        array2[25] = -84;
        array2[26] = 107;
        array2[27] = -124;
        array2[28] = 115;
        array2[29] = 79;
        array2[30] = 27;
        array2[31] = -122;
        array2[32] = -40;
        array2[33] = -124;
        array2[34] = 22;
        array2[35] = -70;
        array2[36] = 59;
        array2[37] = 108;
        array2[38] = -14;
        array2[39] = -59;
        array2[40] = 85;
        array2[41] = 40;
        array2[42] = -126;
        array2[43] = -59;
        array2[44] = 114;
        array2[45] = 119;
        array2[46] = -97;
        array2[47] = -46;
        array2[48] = -57;
        array2[49] = 89;
        array2[50] = -126;
        array2[51] = 92;
        array2[52] = 93;
        array2[53] = -96;
        array2[54] = 45;
        array2[55] = 107;
        array2[56] = -121;
        array2[57] = 1;
        array2[58] = -18;
        array2[59] = -107;
        array2[60] = 42;
        array2[61] = -86;
        array2[62] = -125;
        array2[63] = -105;
        array2[64] = -79;
        array2[65] = -128;
        array2[66] = -2;
        array2[67] = -42;
        array2[68] = 22;
        array2[69] = 82;
        array2[70] = -62;
        array2[71] = 102;
        array2[72] = -56;
        array2[73] = -55;
        array2[74] = -79;
        array2[75] = 52;
        array2[76] = 115;
        array2[77] = -51;
        array2[78] = -84;
        array2[79] = -108;
        array2[80] = 102;
        array2[81] = 28;
        array2[82] = 44;
        array2[83] = -77;
        array2[84] = -91;
        array2[85] = 77;
        array2[86] = -82;
        array2[87] = -83;
        array2[88] = -100;
        array2[89] = -47;
        array2[90] = 2;
        array2[91] = 100;
        array2[92] = 14;
        array2[93] = 67;
        array2[94] = -96;
        array2[95] = -8;
        array2[96] = 25;
        array2[97] = 87;
        array2[98] = 60;
        array2[99] = -115;
        array2[100] = -47;
        array2[101] = -33;
        array2[102] = 102;
        array2[103] = -36;
        array2[104] = 35;
        array2[105] = -1;
        array2[106] = -32;
        array2[107] = 94;
        array2[108] = -114;
        array2[109] = -124;
        array2[110] = 18;
        array2[111] = -58;
        array2[112] = 73;
        array2[113] = 61;
        array2[114] = -122;
        array2[115] = 62;
        a(array, new byte[] { -59, -67, -78, 75, -22, -40, -62, -72, -80, 87, 34, 125, 70, -59, 37, -38, -125, -62, -21, 82, -113, -31, -95, 20, -7, -16, -12, 84, 106, 21, -59, 4, -64, -29, -12, 125, -1, 60, 19, 10, -121, 102, 88, 2, 119, 37, 68, 4, -50, 8, 34, -118, 88, -6, -56, -84, -128, 76, 11, 82, 45, -55, 103, 92, -87, -25, 94, 3, 31, 3, 37, -78, -59, -85, 90, -92, 99, -112, 117, 93, 111, 124, -116, 99, -84, 47, 71, 124, -118, -120, -94, -52, 7, 12, 70, 47, 15, 4, -6, 74, -58, -67, -67, 12, 40, -66, 55, -120, 99, -33, -57, 13, 65, 110, 102, -24 });
        Intrinsics.checkNotNull(o, new String(array, StandardCharsets.UTF_8).intern());
        return Arrays.equals(this.a, ((q0)o).a);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
