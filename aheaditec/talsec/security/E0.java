package com.aheaditec.talsec.security;

import java.security.Key;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import android.util.Base64;
import java.security.PublicKey;
import android.content.Context;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class e0
{
    public static final String b;
    public static final String c;
    public static final String d;
    public final u0 a;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = 23;
        array2[1] = 83;
        array2[2] = -125;
        array2[3] = 31;
        array2[4] = -10;
        array2[5] = -66;
        array2[6] = -38;
        array2[7] = 43;
        array2[8] = -18;
        array2[9] = 99;
        array2[10] = 21;
        array2[11] = -112;
        array2[12] = -16;
        array2[13] = 19;
        array2[14] = 102;
        array2[15] = 54;
        array2[16] = 118;
        array2[17] = 122;
        array2[18] = 85;
        array2[19] = 63;
        a(array, new byte[] { 117, 58, -19, 123, -97, -48, -67, 116, -115, 12, 120, -32, -97, 96, 15, 66, 19, 37, 60, 91 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        d = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[18];
        array4[0] = -125;
        array4[1] = -17;
        array4[2] = -18;
        array4[3] = 18;
        array4[4] = -118;
        array4[5] = 108;
        array4[6] = 68;
        array4[7] = 111;
        array4[8] = -61;
        array4[9] = 31;
        array4[10] = -65;
        array4[11] = 99;
        array4[12] = -41;
        array4[13] = -78;
        array4[14] = -115;
        array4[15] = -30;
        array4[16] = 75;
        array4[17] = 53;
        a(array3, new byte[] { -31, -122, -128, 118, -29, 2, 35, 48, -77, 106, -35, 15, -66, -47, -46, -119, 46, 76 });
        c = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[18];
        array6[0] = 44;
        array6[1] = -85;
        array6[2] = 17;
        array6[3] = -75;
        array6[4] = -70;
        array6[5] = -108;
        array6[6] = 118;
        array6[7] = 71;
        array6[8] = -63;
        array6[9] = -30;
        array6[10] = 93;
        array6[11] = 104;
        array6[12] = 22;
        array6[13] = -26;
        array6[14] = 5;
        array6[15] = -56;
        array6[16] = -115;
        array6[17] = 68;
        a(array5, new byte[] { 78, -62, 127, -47, -45, -6, 17, 24, -96, -116, 57, 26, 121, -113, 97, -105, -28, 32 });
        b = new String(array5, utf_8).intern();
    }
    
    public e0(final Context context) {
        this.a = new u0(context);
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = -585497720;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] array4 = null;
    Label_0804:
        while (true) {
            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
            final int n6 = n >>> 8;
            final int n7 = ~((~n6 | 0xF1CB17FB | n5) - ((n6 & 0xF1CB17FB) | n5));
            final int n8 = -1081514022 - ((n7 & 0x2) | -10362931 - n7);
            final int a = y1.a(n8 | 0xE67A7917, 2, n8, -428181225);
            n = -1057239115;
            final int n9 = 1;
            final int n10 = 1;
            byte[] array5 = null;
            byte[] array6 = null;
            Label_1183: {
                int n12 = 0;
                Label_1166: {
                    switch (a) {
                        default: {
                            n = -897645243;
                            continue;
                        }
                        case 2013813686: {
                            n4 = array3.length % 4;
                            final long n11 = lcmp((long)n4, (long)1) >>> 31 & 0x1;
                            if (n11 != 0) {
                                n = 2100390411;
                            }
                            else {
                                n = -897645243;
                            }
                            if (n11 != 0) {
                                continue;
                            }
                            n12 = n4;
                            break Label_1166;
                        }
                        case 1758587480: {
                            final int length = array3.length;
                            final int n13 = 0 - n4;
                            int n14 = n10;
                            if (dcmpg((double)array4[(length | n13) - (~n13 & 0x310B7971 & length) + ((0x310B7971 | n13) & length)], Double.NaN) <= -1) {
                                n14 = 0;
                            }
                            if (n14 != 0) {
                                n = -1057239115;
                            }
                            else {
                                n = -897645243;
                            }
                            n2 = n4;
                            continue;
                        }
                        case 783648904: {
                            final int n15 = n3 + 4 + (-1 - n3 | 0xFFFFFFFC);
                            final byte b = array4[n15];
                            final int n16 = (b & 0x1000000) * (b | 0x1000000) + (b & 0xFEFFFFFF) * (~b & 0x1000000);
                            final int n17 = n3 & 0x2;
                            final int n18 = n3 + 2 - n17;
                            final int n19 = array4[n18] & 0xFF;
                            final int n20 = n19 * (~n19 & 0x10000);
                            final int n21 = ~((0x1BDAA809 | ~n20 | n16) - ((n20 & 0x1BDAA809) | n16));
                            final int n22 = n3 + 1 - (n3 & 0x1);
                            final int n23 = array4[n22] & 0xFF;
                            final int n24 = n23 * (~n23 & 0x100);
                            final int n25 = ~((n21 | (~n24 | 0x4F34C9EF)) - ((n24 & 0x4F34C9EF) | n21));
                            final int n26 = array4[n3] & 0xFF;
                            final int a2 = J.a(n25, n26, 1, -1 - n25 | -1 - n26);
                            final byte b2 = array3[n15];
                            final int n27 = (b2 & 0x1000000) * (b2 | 0x1000000) + (0xFEFFFFFF & b2) * (~b2 & 0x1000000);
                            final int n28 = array3[n18] & 0xFF;
                            final int n29 = n28 * (~n28 & 0x10000);
                            final int a3 = K.a(~n27 & 0x622BED86 & n29, n29, n27, (0x622BED86 | n27) & n29);
                            final int n30 = array3[n22] & 0xFF;
                            final int n31 = n30 * (~n30 & 0x100);
                            final int n32 = ~((a3 | (~n31 | 0x853F6546)) - ((0x853F6546 & n31) | a3));
                            final int n33 = array3[n3] & 0xFF;
                            final int a4 = J.a(n32, n33, 1, -1 - n32 | -1 - n33);
                            final int n34 = a2 << (dcmpg((double)a2, Double.NaN) >>> 31);
                            final int n35 = n34 + a4 - (n34 & a4) * 2;
                            array3[n3] = (byte)n35;
                            array3[n22] = (byte)(n35 >>> 8);
                            array3[n18] = (byte)(n35 >>> 16);
                            array3[n15] = (byte)(n35 >>> 24);
                            final int n36 = -11 - (-15 - n3 | n17);
                            final int length2 = array3.length;
                            final int a5 = com.aheaditec.talsec.security.a.a(array3.length, 4, 0, 0);
                            final long n37 = lcmp((long)n36, (long)((length2 & ~a5) * 2 - (length2 ^ a5))) >>> 31 & 0x1;
                            if (n37 != 0) {
                                n = -897645243;
                            }
                            else {
                                n = 1251644638;
                            }
                            n3 = n36;
                            if (n37 != 0) {
                                n = -1469476344;
                                n3 = n36;
                                continue;
                            }
                            continue;
                        }
                        case 769572960: {
                            break Label_0804;
                        }
                        case -477594107: {
                            final int length3 = array3.length;
                            final int n38 = 0 - n2;
                            final int n39 = (length3 | n38) - (0xE14783F0 & ~n38 & length3) + ((n38 | 0xE14783F0) & length3);
                            final byte b3 = array4[n39];
                            final int length4 = array3.length;
                            final byte b4 = array4[(n38 | length4) * 2 - (length4 ^ n38)];
                            final int n40 = (byte)0 - (byte)b3;
                            final int n41 = n40 | b4;
                            array4[n39] = (byte)((byte)((byte)n41 - (byte)((byte)2 * (byte)n40)) + (byte)(b4 ^ n40 ^ n41));
                            continue;
                        }
                        case -1350640889: {
                            final int length5 = array.length;
                            final int n42 = 0 - array.length % 4;
                            int n43 = n9;
                            if ((length5 | n42) - (0x3831AA16 & ~n42 & length5) + ((n42 | 0x3831AA16) & length5) <= 0) {
                                n43 = 0;
                            }
                            if (n43 != 0) {
                                n = -897645243;
                            }
                            else {
                                n = 1251644638;
                            }
                            if (n43 != 0) {
                                n = -1469476344;
                            }
                            array5 = array2;
                            array6 = array;
                            n3 = 0;
                            break Label_1183;
                        }
                        case -1819084085: {
                            final int length6 = array3.length;
                            final int n44 = 0 - n2;
                            final int length7 = array3.length;
                            final int n45 = 0 - n44;
                            final byte b5 = array3[(length7 & ~n45) - (~length7 & n45)];
                            final int length8 = array3.length;
                            final byte b6 = array4[(length8 | n44) - (0x9BFB9859 & ~n44 & length8) + ((n44 | 0x9BFB9859) & length8)];
                            array3[(length6 | n44) * 2 - (length6 ^ n44)] = (byte)((byte)((byte)((byte)2 * (byte)(b6 | b5)) - (byte)b6) - (byte)b5);
                            final int n46 = 4 - (5 - n2 | (n2 & 0x2));
                            final long n47 = lcmp((long)n2, (long)2) >>> 31 & 0x1;
                            int n48;
                            if (n47 != 0) {
                                n48 = 2100390411;
                            }
                            else {
                                n48 = -897645243;
                            }
                            n12 = n46;
                            if (n47 != 0) {
                                n = n48;
                                n4 = n46;
                                continue;
                            }
                            break Label_1166;
                        }
                    }
                    continue;
                }
                final int n49 = -2079636786;
                n4 = n12;
                array5 = array4;
                array6 = array3;
                n = n49;
            }
            array3 = array6;
            array4 = array5;
        }
    }
    
    public void a(final String s) {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = -115;
        array2[1] = 25;
        array2[2] = -83;
        array2[3] = 57;
        array2[4] = -17;
        array2[5] = -47;
        array2[6] = -11;
        array2[7] = -16;
        array2[8] = -40;
        array2[9] = -32;
        array2[10] = 96;
        array2[11] = 125;
        array2[12] = -8;
        array2[13] = -63;
        array2[14] = -88;
        array2[15] = -42;
        array2[16] = -61;
        array2[17] = 101;
        a(array, new byte[] { -17, 112, -61, 93, -122, -65, -110, -81, -71, -114, 4, 15, -105, -88, -52, -119, -86, 1 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), s);
    }
    
    public void a(final PublicKey publicKey) {
        final String encodeToString = Base64.encodeToString(((Key)publicKey).getEncoded(), 2);
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = -18;
        array2[1] = -2;
        array2[2] = 64;
        array2[3] = -75;
        array2[4] = -64;
        array2[5] = 119;
        array2[6] = 118;
        array2[7] = -51;
        array2[8] = 50;
        array2[9] = -12;
        array2[10] = -126;
        array2[11] = 1;
        array2[12] = 106;
        array2[13] = 22;
        array2[14] = -10;
        array2[15] = -72;
        array2[16] = 1;
        array2[17] = -111;
        a(array, new byte[] { -116, -105, 46, -47, -87, 25, 17, -110, 66, -127, -32, 109, 3, 117, -87, -45, 100, -24 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), encodeToString);
    }
    
    public boolean a() {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = 73;
        array2[1] = 19;
        array2[2] = -121;
        array2[3] = -90;
        array2[4] = -61;
        array2[5] = 87;
        array2[6] = -61;
        array2[7] = -39;
        array2[8] = -49;
        array2[9] = -97;
        array2[10] = -108;
        array2[11] = 37;
        array2[12] = 66;
        array2[13] = 25;
        array2[14] = 82;
        array2[15] = 63;
        array2[16] = 28;
        array2[17] = 20;
        a(array, new byte[] { 43, 122, -23, -62, -86, 57, -92, -122, -82, -15, -16, 87, 45, 112, 54, 96, 117, 112 });
        return a.b(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public void b(final String s) {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = -80;
        array2[1] = -99;
        array2[2] = -8;
        array2[3] = -57;
        array2[4] = 48;
        array2[5] = -127;
        array2[6] = -56;
        array2[7] = -67;
        array2[8] = -7;
        array2[9] = 106;
        array2[10] = -94;
        array2[11] = 34;
        array2[12] = 94;
        array2[13] = -31;
        array2[14] = 68;
        array2[15] = -73;
        array2[16] = -74;
        array2[17] = -10;
        array2[18] = 99;
        array2[19] = 88;
        a(array, new byte[] { -46, -12, -106, -93, 89, -17, -81, -30, -102, 5, -49, 82, 49, -110, 45, -61, -45, -87, 10, 60 });
        a.a(new String(array, StandardCharsets.UTF_8).intern(), s);
    }
    
    public boolean b() {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = 39;
        array2[1] = -4;
        array2[2] = 27;
        array2[3] = 54;
        array2[4] = 113;
        array2[5] = -68;
        array2[6] = 113;
        array2[7] = -24;
        array2[8] = -102;
        array2[9] = 32;
        array2[10] = 118;
        array2[11] = 23;
        array2[12] = 37;
        array2[13] = 102;
        array2[14] = -35;
        array2[15] = -64;
        array2[16] = 1;
        array2[17] = -127;
        array2[18] = -88;
        array2[19] = 1;
        a(array, new byte[] { 69, -107, 117, 82, 24, -46, 22, -73, -7, 79, 27, 103, 74, 21, -76, -76, 100, -34, -63, 101 });
        return a.b(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public String c() {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = -106;
        array2[1] = 2;
        array2[2] = 123;
        array2[3] = 17;
        array2[4] = -75;
        array2[5] = 121;
        array2[6] = 78;
        array2[7] = -65;
        array2[8] = -128;
        array2[9] = 127;
        array2[10] = -36;
        array2[11] = -24;
        array2[12] = -25;
        array2[13] = 102;
        array2[14] = -32;
        array2[15] = 88;
        array2[16] = 90;
        array2[17] = 94;
        a(array, new byte[] { -12, 107, 21, 117, -36, 23, 41, -32, -31, 17, -72, -102, -120, 15, -124, 7, 51, 58 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (!a.b(new String(array, utf_8).intern())) {
            return null;
        }
        final u0 a2 = this.a;
        final byte[] array4;
        final byte[] array3 = array4 = new byte[18];
        array4[0] = 21;
        array4[1] = 93;
        array4[2] = 89;
        array4[3] = 80;
        array4[4] = -38;
        array4[5] = 34;
        array4[6] = 53;
        array4[7] = 99;
        array4[8] = -40;
        array4[9] = 37;
        array4[10] = 88;
        array4[11] = 86;
        array4[12] = 8;
        array4[13] = -28;
        array4[14] = -96;
        array4[15] = 98;
        array4[16] = 81;
        array4[17] = 14;
        a(array3, new byte[] { 119, 52, 55, 52, -77, 76, 82, 60, -71, 75, 60, 36, 103, -115, -60, 61, 56, 106 });
        return a2.a(new String(array3, utf_8).intern());
    }
    
    public String d() {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = 66;
        array2[1] = 22;
        array2[2] = -24;
        array2[3] = -63;
        array2[4] = 51;
        array2[5] = 7;
        array2[6] = -8;
        array2[7] = 69;
        array2[8] = 102;
        array2[9] = -13;
        array2[10] = -54;
        array2[11] = -127;
        array2[12] = -30;
        array2[13] = -109;
        array2[14] = -64;
        array2[15] = 0;
        array2[16] = -57;
        array2[17] = -91;
        array2[18] = 13;
        array2[19] = 7;
        a(array, new byte[] { 32, 127, -122, -91, 90, 105, -97, 26, 5, -100, -89, -15, -115, -32, -87, 116, -94, -6, 100, 99 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (!a.b(new String(array, utf_8).intern())) {
            return null;
        }
        final u0 a2 = this.a;
        final byte[] array4;
        final byte[] array3 = array4 = new byte[20];
        array4[0] = -71;
        array4[1] = -16;
        array4[2] = -9;
        array4[3] = -97;
        array4[4] = 105;
        array4[5] = 124;
        array4[6] = 21;
        array4[7] = -106;
        array4[8] = 118;
        array4[9] = 76;
        array4[10] = 48;
        array4[11] = 13;
        array4[12] = -50;
        array4[13] = 77;
        array4[14] = -28;
        array4[15] = -34;
        array4[16] = 120;
        array4[17] = -12;
        array4[18] = -84;
        array4[19] = -117;
        a(array3, new byte[] { -37, -103, -103, -5, 0, 18, 114, -55, 21, 35, 93, 125, -95, 62, -115, -86, 29, -85, -59, -17 });
        return a2.a(new String(array3, utf_8).intern());
    }
    
    public PublicKey e() {
        final u0 a = this.a;
        final byte[] array2;
        final byte[] array = array2 = new byte[18];
        array2[0] = 118;
        array2[1] = -97;
        array2[2] = 127;
        array2[3] = -117;
        array2[4] = 12;
        array2[5] = 77;
        array2[6] = -128;
        array2[7] = -122;
        array2[8] = -63;
        array2[9] = 105;
        array2[10] = 29;
        array2[11] = 108;
        array2[12] = -58;
        array2[13] = -13;
        array2[14] = -75;
        array2[15] = 4;
        array2[16] = -44;
        array2[17] = 106;
        a(array, new byte[] { 20, -10, 17, -17, 101, 35, -25, -39, -79, 28, 127, 0, -81, -112, -22, 111, -79, 19 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (!a.b(new String(array, utf_8).intern())) {
            return null;
        }
        final u0 a2 = this.a;
        final byte[] array4;
        final byte[] array3 = array4 = new byte[18];
        array4[0] = -118;
        array4[1] = -89;
        array4[2] = 8;
        array4[3] = -94;
        array4[4] = 66;
        array4[5] = -28;
        array4[6] = -128;
        array4[7] = 12;
        array4[8] = -102;
        array4[9] = -116;
        array4[10] = -103;
        array4[11] = 76;
        array4[12] = -33;
        array4[13] = -10;
        array4[14] = -8;
        array4[15] = 54;
        array4[16] = -26;
        array4[17] = -43;
        a(array3, new byte[] { -24, -50, 102, -58, 43, -118, -25, 83, -22, -7, -5, 32, -74, -107, -89, 93, -125, -84 });
        final byte[] decode = Base64.decode(a2.a(new String(array3, utf_8).intern()), 2);
        try {
            final byte[] array6;
            final byte[] array5 = array6 = new byte[3];
            array6[0] = 37;
            array6[1] = 117;
            array6[2] = -97;
            a(array5, new byte[] { 119, 38, -34, 91, -1, 34, 94, -48 });
            return KeyFactory.getInstance(new String(array5, utf_8).intern()).generatePublic((KeySpec)new X509EncodedKeySpec(decode));
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
