package com.aheaditec.talsec.security;

import org.json.JSONException;
import org.json.JSONObject;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import org.json.JSONArray;
import java.util.List;
import java.util.Collection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class d implements y0
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[9];
        array2[0] = 104;
        array2[1] = -95;
        array2[2] = 82;
        array2[3] = 3;
        array2[4] = 111;
        array2[5] = -119;
        array2[6] = 127;
        array2[7] = 8;
        array2[8] = 94;
        a(array, new byte[] { 127, -62, -122, -49, 102, -40, -103, -93, 58 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        g = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[23];
        array4[0] = -111;
        array4[1] = 65;
        array4[2] = -34;
        array4[3] = -18;
        array4[4] = -33;
        array4[5] = -93;
        array4[6] = -119;
        array4[7] = -86;
        array4[8] = -51;
        array4[9] = -123;
        array4[10] = 89;
        array4[11] = 104;
        array4[12] = -50;
        array4[13] = -21;
        array4[14] = -62;
        array4[15] = -51;
        array4[16] = 18;
        array4[17] = 108;
        array4[18] = 55;
        array4[19] = -82;
        array4[20] = 38;
        array4[21] = 8;
        array4[22] = -26;
        a(array3, new byte[] { -122, 34, 10, 34, -42, -14, 111, 9, -35, -25, -114, -68, -36, -92, 36, 6, 8, 63, -9, 109, 75, 109, -107 });
        f = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[7];
        array6[0] = -4;
        array6[1] = 3;
        array6[2] = -109;
        array6[3] = -25;
        array6[4] = 102;
        array6[5] = -93;
        array6[6] = 30;
        a(array5, new byte[] { -21, 96, 71, 43, 3, -64, 106, -128 });
        e = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[6];
        array8[0] = 113;
        array8[1] = 115;
        array8[2] = 35;
        array8[3] = -49;
        array8[4] = -36;
        array8[5] = 86;
        a(array7, new byte[] { 102, 32, -57, 4, -67, 58, -14, -82 });
        d = new String(array7, utf_8).intern();
        final byte[] array10;
        final byte[] array9 = array10 = new byte[8];
        array10[0] = 104;
        array10[1] = -121;
        array10[2] = 71;
        array10[3] = -71;
        array10[4] = -127;
        array10[5] = -22;
        array10[6] = 17;
        array10[7] = 49;
        a(array9, new byte[] { 101, -26, -94, 110, -120, -118, -86, -9 });
        c = new String(array9, utf_8).intern();
        final byte[] array12;
        final byte[] array11 = array12 = new byte[22];
        array12[0] = 98;
        array12[1] = 85;
        array12[2] = 12;
        array12[3] = 23;
        array12[4] = -107;
        array12[5] = 113;
        array12[6] = -96;
        array12[7] = 40;
        array12[8] = 125;
        array12[9] = 103;
        array12[10] = 58;
        array12[11] = 30;
        array12[12] = 53;
        array12[13] = 127;
        array12[14] = -29;
        array12[15] = -119;
        array12[16] = 117;
        array12[17] = -125;
        array12[18] = -64;
        array12[19] = -51;
        array12[20] = 70;
        array12[21] = 19;
        a(array11, new byte[] { 111, 52, -23, -64, -100, 17, 19, -26, 101, 52, -34, -50, 48, 29, 56, 81, 124, -65, 19, 2, 35, 96 });
        b = new String(array11, utf_8).intern();
        final byte[] array14;
        final byte[] array13 = array14 = new byte[6];
        array14[0] = 27;
        array14[1] = 13;
        array14[2] = 31;
        array14[3] = 4;
        array14[4] = -28;
        array14[5] = -2;
        a(array13, new byte[] { 22, 108, -6, -45, -127, -116, 31, 82 });
        a = new String(array13, utf_8).intern();
    }
    
    public static void a(final byte[] array, final byte[] array2) {
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
    
    public final String a(final boolean[] array) {
        if (array == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            String s;
            if (array[i]) {
                final byte[] array2 = { -114 };
                a(array2, new byte[] { -65, -123, 40, -76, 26, -93, 108, 77 });
                s = new String(array2, StandardCharsets.UTF_8);
            }
            else {
                final byte[] array3 = { 87 };
                a(array3, new byte[] { 103, -79, -12, -3, 110, -51, -19, -112 });
                s = new String(array3, StandardCharsets.UTF_8);
            }
            sb.append(s.intern());
        }
        return sb.toString();
    }
    
    public final JSONArray a(final Collection<List<?>> collection) {
        final JSONArray jsonArray = new JSONArray();
        if (collection == null) {
            return jsonArray;
        }
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)iterator.next().toString());
        }
        return jsonArray;
    }
    
    public JSONObject a(final X509Certificate x509Certificate) throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        if (x509Certificate.getIssuerDN() != null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[6];
            array2[0] = 32;
            array2[1] = 19;
            array2[2] = -31;
            array2[3] = -91;
            array2[4] = -17;
            array2[5] = -40;
            a(array, new byte[] { 45, 114, 4, 114, -118, -86, -36, -27 });
            jsonObject.put(new String(array, StandardCharsets.UTF_8).intern(), (Object)x509Certificate.getIssuerDN().getName());
        }
        final byte[] array4;
        final byte[] array3 = array4 = new byte[22];
        array4[0] = 60;
        array4[1] = -34;
        array4[2] = -16;
        array4[3] = 35;
        array4[4] = 0;
        array4[5] = 10;
        array4[6] = 39;
        array4[7] = 54;
        array4[8] = -81;
        array4[9] = 55;
        array4[10] = -39;
        array4[11] = 40;
        array4[12] = -65;
        array4[13] = 74;
        array4[14] = -113;
        array4[15] = -125;
        array4[16] = 126;
        array4[17] = -71;
        array4[18] = -82;
        array4[19] = 69;
        array4[20] = 28;
        array4[21] = 75;
        a(array3, new byte[] { 49, -65, 21, -12, 9, 106, -108, -8, -73, 100, 61, -8, -70, 40, 84, 91, 119, -123, 125, -118, 121, 56 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        jsonObject.put(new String(array3, utf_8).intern(), (Object)this.b(x509Certificate));
        final byte[] array6;
        final byte[] array5 = array6 = new byte[8];
        array6[0] = -30;
        array6[1] = 84;
        array6[2] = 26;
        array6[3] = 14;
        array6[4] = -99;
        array6[5] = 48;
        array6[6] = 27;
        array6[7] = 75;
        a(array5, new byte[] { -17, 53, -1, -39, -108, 80, -96, -115 });
        jsonObject.put(new String(array5, utf_8).intern(), (Object)this.a(x509Certificate.getIssuerUniqueID()));
        final byte[] array8;
        final byte[] array7 = array8 = new byte[6];
        array8[0] = 53;
        array8[1] = 107;
        array8[2] = -71;
        array8[3] = 74;
        array8[4] = -34;
        array8[5] = 20;
        a(array7, new byte[] { 34, 56, 93, -127, -65, 120, -69, -10 });
        jsonObject.put(new String(array7, utf_8).intern(), (Object)x509Certificate.getSerialNumber());
        if (x509Certificate.getSubjectDN() != null) {
            final byte[] array10;
            final byte[] array9 = array10 = new byte[7];
            array10[0] = 115;
            array10[1] = -10;
            array10[2] = -117;
            array10[3] = 43;
            array10[4] = -122;
            array10[5] = -119;
            array10[6] = 31;
            a(array9, new byte[] { 100, -107, 95, -25, -29, -22, 107, 42 });
            jsonObject.put(new String(array9, utf_8).intern(), (Object)x509Certificate.getSubjectDN().getName());
        }
        final byte[] array12;
        final byte[] array11 = array12 = new byte[23];
        array12[0] = -15;
        array12[1] = 41;
        array12[2] = -88;
        array12[3] = 99;
        array12[4] = -86;
        array12[5] = 30;
        array12[6] = 61;
        array12[7] = -104;
        array12[8] = 49;
        array12[9] = -80;
        array12[10] = -35;
        array12[11] = -51;
        array12[12] = 103;
        array12[13] = -12;
        array12[14] = -92;
        array12[15] = 40;
        array12[17] = (array12[16] = -33);
        array12[18] = 27;
        array12[19] = -116;
        array12[20] = 69;
        array12[21] = 32;
        array12[22] = -78;
        a(array11, new byte[] { -26, 74, 124, -81, -93, 79, -37, 59, 33, -46, 10, 25, 117, -69, 66, -29, -59, -116, -37, 79, 40, 69, -63 });
        jsonObject.put(new String(array11, utf_8).intern(), (Object)this.c(x509Certificate));
        final byte[] array14;
        final byte[] array13 = array14 = new byte[9];
        array14[0] = 44;
        array14[1] = 28;
        array14[2] = -61;
        array14[3] = -40;
        array14[4] = 19;
        array14[5] = -73;
        array14[6] = 66;
        array14[7] = -112;
        array14[8] = -34;
        a(array13, new byte[] { 59, 127, 23, 20, 26, -26, -92, 59, -70 });
        jsonObject.put(new String(array13, utf_8).intern(), (Object)this.a(x509Certificate.getSubjectUniqueID()));
        return jsonObject;
    }
    
    public final JSONArray b(final X509Certificate x509Certificate) {
        try {
            return this.a((Collection<List<?>>)x509Certificate.getIssuerAlternativeNames());
        }
        catch (final Exception ex) {
            return new JSONArray();
        }
    }
    
    public final JSONArray c(final X509Certificate x509Certificate) {
        try {
            return this.a((Collection<List<?>>)x509Certificate.getSubjectAlternativeNames());
        }
        catch (final Exception ex) {
            return new JSONArray();
        }
    }
}
