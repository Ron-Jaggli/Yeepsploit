package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import java.nio.charset.StandardCharsets;
import android.content.Context;

public class c0 extends g
{
    public c0(final R0 r0, final E1 e1) {
        super(r0, e1);
    }
    
    private static void c(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n3 = 0;
        int n2 = n3 = 0;
        int n4 = -894652659;
        byte[] array4 = null;
    Label_0516:
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
                    break Label_0516;
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
    
    public void a(final Context context) {
        this.b(context);
    }
    
    public void b(final Context context) {
        super.a(this.a((f$a)new c0$$ExternalSyntheticLambda0(this, context)));
    }
    
    public final boolean c(final Context context) {
        int int1;
        try {
            final ContentResolver contentResolver = context.getContentResolver();
            final byte[] array2;
            final byte[] array = array2 = new byte[28];
            array2[0] = 5;
            array2[1] = 57;
            array2[2] = -70;
            array2[3] = 15;
            array2[4] = -75;
            array2[5] = 17;
            array2[6] = 102;
            array2[7] = -45;
            array2[8] = 117;
            array2[9] = 51;
            array2[10] = -100;
            array2[11] = -71;
            array2[12] = -41;
            array2[13] = -19;
            array2[14] = -100;
            array2[15] = -15;
            array2[16] = 98;
            array2[17] = 126;
            array2[18] = -105;
            array2[19] = -56;
            array2[20] = 124;
            array2[21] = -74;
            array2[22] = -30;
            array2[23] = -40;
            array2[24] = 110;
            array2[25] = -110;
            array2[26] = -93;
            array2[27] = -53;
            c(array, new byte[] { 13, 106, 82, -56, -91, 76, -124, 28, 124, 111, 122, 120, -64, -66, 122, 39, 111, 34, 78, 29, 127, -27, 2, 27, 104, -56, 116, 13 });
            int1 = Settings$Secure.getInt(contentResolver, new String(array, StandardCharsets.UTF_8).intern(), 0);
        }
        catch (final Exception ex) {
            int1 = 0;
        }
        if (int1 == 1) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[22];
            array4[0] = 21;
            array4[1] = 70;
            array4[2] = -93;
            array4[3] = -99;
            array4[4] = 1;
            array4[6] = (array4[5] = -81);
            array4[7] = -69;
            array4[8] = 116;
            array4[9] = -71;
            array4[10] = 82;
            array4[11] = 90;
            array4[12] = -61;
            array4[13] = 48;
            array4[14] = 67;
            array4[15] = -116;
            array4[16] = 23;
            array4[17] = -55;
            array4[18] = 73;
            array4[19] = -79;
            array4[20] = 59;
            array4[21] = -4;
            c(array3, new byte[] { 24, 39, 21, 90, 27, -4, 113, 106, 96, -22, -74, -11, -48, 98, -108, 43, 5, -122, -99, 127, 94, -104 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = 56;
            array6[1] = 64;
            array6[2] = 92;
            array6[3] = -22;
            c(array5, new byte[] { 32, 32, -69, 45, -73, -124, 93, -111 });
            this.c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
}
