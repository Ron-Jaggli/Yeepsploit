package com.aheaditec.talsec.security;

import java.util.UUID;
import java.security.KeyStore$LoadStoreParameter;
import java.security.KeyStore$Entry;
import java.security.KeyStore$ProtectionParameter;
import java.security.Key;
import javax.crypto.Cipher;
import java.security.KeyStore$PrivateKeyEntry;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import android.security.keystore.KeyGenParameterSpec$Builder;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import android.content.Context;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class d0 extends h
{
    public static final String q;
    public static final String r;
    public static final String s;
    public final e0 o;
    public final g0 p;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = -112;
        array2[1] = 58;
        array2[2] = -22;
        array2[3] = -117;
        array2[4] = -36;
        array2[5] = -33;
        array2[6] = 71;
        array2[7] = 76;
        array2[8] = -121;
        array2[9] = -7;
        array2[10] = 70;
        array2[11] = -113;
        array2[12] = 68;
        array2[13] = -115;
        array2[14] = -14;
        array2[15] = -84;
        array2[16] = 121;
        array2[17] = 89;
        array2[18] = -69;
        array2[19] = -51;
        c(array, new byte[] { -85, -103, -107, -67, -126, -52, -17, 123, -64, -30, -17, -12, 94, 13, 126, -31, 6, 96, -65, -61 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        s = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[15];
        array4[0] = 92;
        array4[1] = -81;
        array4[2] = 106;
        array4[3] = 126;
        array4[4] = -6;
        array4[5] = 76;
        array4[6] = 24;
        array4[7] = 67;
        array4[8] = 44;
        array4[9] = -38;
        array4[10] = -115;
        array4[11] = 11;
        array4[12] = 32;
        array4[13] = 91;
        array4[14] = 21;
        c(array3, new byte[] { 6, -15, -8, 36, 126, 85, 102, 33, 50, -45, -56, -104, 79, 41, 112 });
        r = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[13];
        array6[0] = 55;
        array6[1] = -76;
        array6[2] = 125;
        array6[3] = 83;
        array6[4] = 72;
        array6[5] = -8;
        array6[6] = 94;
        array6[7] = 43;
        array6[8] = 63;
        array6[9] = 31;
        array6[10] = -6;
        array6[11] = -24;
        array6[12] = 89;
        c(array5, new byte[] { 76, 5, -4, 56, 22, -53, 6, 91, 58, -85, 125, -97, 62 });
        q = new String(array5, utf_8).intern();
    }
    
    public d0(final R0 r0, final E1 e1, final Context context, final g0 p4) {
        super(r0, e1);
        this.o = new e0(context);
        this.p = p4;
    }
    
    private static void c(final byte[] array, final byte[] array2) {
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
    
    public void a(final Context context) {
        this.h();
    }
    
    public final void a(final KeyStore keyStore) {
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[13];
            array2[0] = 47;
            array2[1] = -69;
            array2[2] = 62;
            array2[3] = -2;
            array2[4] = 85;
            array2[5] = 33;
            array2[6] = -49;
            array2[7] = -111;
            array2[8] = 66;
            array2[9] = -52;
            array2[10] = -36;
            array2[11] = 0;
            array2[12] = -57;
            c(array, new byte[] { 100, 10, 61, -90, 25, 114, 119, 17, 21, -40, -97, -121, -96 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (keyStore.containsAlias(new String(array, utf_8).intern())) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[13];
                array4[0] = 101;
                array4[1] = 46;
                array4[2] = 6;
                array4[3] = 47;
                array4[4] = -107;
                array4[5] = 102;
                array4[6] = 58;
                array4[7] = 31;
                array4[8] = -42;
                array4[9] = -90;
                array4[10] = -123;
                array4[11] = 14;
                array4[12] = -47;
                c(array3, new byte[] { 26, 127, 84, 117, -39, 53, 98, -113, -95, -14, -42, 121, -74 });
                keyStore.deleteEntry(new String(array3, utf_8).intern());
            }
            final byte[] array6;
            final byte[] array5 = array6 = new byte[3];
            array6[0] = 119;
            array6[1] = -121;
            array6[2] = 101;
            c(array5, new byte[] { 37, -44, 36, -63, -80, 107, 29, -78 });
            final String intern = new String(array5, utf_8).intern();
            final byte[] array8;
            final byte[] array7 = array8 = new byte[15];
            array8[0] = 38;
            array8[1] = 93;
            array8[2] = 48;
            array8[3] = -14;
            array8[4] = -80;
            array8[5] = 68;
            array8[6] = 16;
            array8[7] = 10;
            array8[8] = -4;
            array8[9] = -111;
            array8[10] = 1;
            array8[11] = -81;
            array8[12] = 48;
            array8[13] = 57;
            array8[14] = -32;
            c(array7, new byte[] { 80, 99, 62, -103, -56, 93, 94, 90, -126, 24, 61, -12, 95, 75, -123 });
            final KeyPairGenerator instance = KeyPairGenerator.getInstance(intern, new String(array7, utf_8).intern());
            final byte[] array10;
            final byte[] array9 = array10 = new byte[13];
            array10[0] = -95;
            array10[1] = -126;
            array10[2] = 115;
            array10[3] = -112;
            array10[4] = 45;
            array10[5] = 28;
            array10[6] = -116;
            array10[7] = -93;
            array10[8] = 22;
            array10[9] = -76;
            array10[10] = 36;
            array10[11] = 86;
            array10[12] = -114;
            c(array9, new byte[] { -34, 19, 10, -4, 49, -81, -72, -29, 97, 0, 56, 81, -23 });
            final KeyGenParameterSpec$Builder setKeySize = new KeyGenParameterSpec$Builder(new String(array9, utf_8).intern(), 3).setKeySize(2048);
            final byte[] array12;
            final byte[] array11 = array12 = new byte[12];
            array12[0] = 9;
            array12[1] = -3;
            array12[2] = -34;
            array12[3] = 61;
            array12[4] = -4;
            array12[5] = 24;
            array12[6] = -2;
            array12[7] = -45;
            array12[8] = 107;
            array12[9] = 50;
            array12[10] = 121;
            array12[11] = 51;
            c(array11, new byte[] { 66, -26, -121, -121, -74, 120, -119, -48, -8, -118, 1, 109 });
            instance.initialize((AlgorithmParameterSpec)setKeySize.setEncryptionPaddings(new String[] { new String(array11, utf_8).intern() }).setUserAuthenticationRequired(false).build());
            final PublicKey public1 = instance.generateKeyPair().getPublic();
            final byte[] array14;
            final byte[] array13 = array14 = new byte[13];
            array14[0] = -82;
            array14[1] = -101;
            array14[2] = 34;
            array14[3] = 104;
            array14[4] = -56;
            array14[5] = 75;
            array14[6] = -107;
            array14[7] = -80;
            array14[8] = -49;
            array14[9] = -41;
            array14[10] = -56;
            array14[11] = -57;
            array14[12] = 32;
            c(array13, new byte[] { -29, 42, 57, 52, -106, 88, -63, -14, -118, -29, -117, -62, 71 });
            if (keyStore.containsAlias(new String(array13, utf_8).intern())) {
                this.o.a(public1);
            }
        }
        catch (final Exception | NoSuchMethodError exception | NoSuchMethodError) {}
    }
    
    public final boolean a(final PublicKey publicKey, final KeyStore$PrivateKeyEntry keyStore$PrivateKeyEntry, final String s) {
        final boolean b = true;
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[20];
            array2[0] = 39;
            array2[1] = -67;
            array2[2] = 109;
            array2[3] = -116;
            array2[4] = 74;
            array2[5] = 32;
            array2[6] = -99;
            array2[7] = -113;
            array2[8] = -111;
            array2[9] = 78;
            array2[10] = -68;
            array2[11] = -6;
            array2[12] = -116;
            array2[13] = -110;
            array2[14] = 74;
            array2[15] = -91;
            array2[16] = 66;
            array2[17] = 100;
            array2[18] = -15;
            array2[19] = -78;
            c(array, new byte[] { 94, 30, 23, -68, -8, -110, -55, -71, -86, 53, -23, -62, -90, -14, 21, -38, 15, 61, -119, -18 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final Cipher instance = Cipher.getInstance(new String(array, utf_8).intern());
            instance.init(1, (Key)publicKey);
            final byte[] doFinal = instance.doFinal(s.getBytes(utf_8));
            final byte[] array4;
            final byte[] array3 = array4 = new byte[20];
            array4[0] = -78;
            array4[1] = 23;
            array4[2] = -42;
            array4[3] = 103;
            array4[4] = -34;
            array4[5] = -33;
            array4[6] = 119;
            array4[7] = 84;
            array4[8] = 61;
            array4[9] = -106;
            array4[10] = -127;
            array4[11] = 110;
            array4[12] = 126;
            array4[13] = -83;
            array4[14] = 101;
            array4[15] = 39;
            array4[16] = -88;
            array4[17] = -28;
            array4[18] = -47;
            array4[19] = 14;
            c(array3, new byte[] { -55, 116, -127, 97, -124, -52, 31, -108, 86, 13, -83, 86, 56, 45, -17, 91, -75, -67, -87, -126 });
            final Cipher instance2 = Cipher.getInstance(new String(array3, utf_8).intern());
            instance2.init(2, (Key)keyStore$PrivateKeyEntry.getPrivateKey());
            return s.equals((Object)new String(instance2.doFinal(doFinal), utf_8));
        }
        catch (final Exception ex) {
            return b;
        }
    }
    
    public final KeyStore$PrivateKeyEntry b(final KeyStore keyStore) {
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[13];
            array2[0] = 90;
            array2[1] = -18;
            array2[2] = 115;
            array2[3] = -85;
            array2[4] = -3;
            array2[5] = 117;
            array2[6] = -24;
            array2[7] = -43;
            array2[8] = -112;
            array2[9] = 46;
            array2[10] = -42;
            array2[11] = 8;
            array2[12] = -10;
            c(array, new byte[] { -9, -66, 9, -15, -127, 70, -108, -43, -25, 122, -87, 127, -111 });
            final KeyStore$Entry entry = keyStore.getEntry(new String(array, StandardCharsets.UTF_8).intern(), (KeyStore$ProtectionParameter)null);
            if (entry instanceof KeyStore$PrivateKeyEntry) {
                return (KeyStore$PrivateKeyEntry)entry;
            }
            return null;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public final boolean e() {
        final String a = this.p.a();
        if (a == null) {
            return false;
        }
        if (this.o.a()) {
            final String c = this.o.c();
            if (!a.equals((Object)c)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[18];
                array2[0] = -21;
                array2[1] = 69;
                array2[2] = -60;
                array2[3] = 104;
                array2[4] = -1;
                array2[5] = -105;
                array2[6] = 121;
                array2[7] = 23;
                array2[8] = -28;
                array2[9] = -9;
                array2[10] = 112;
                array2[11] = 76;
                array2[12] = -84;
                array2[13] = 6;
                array2[14] = -36;
                array2[15] = -125;
                array2[16] = -123;
                array2[17] = -97;
                c(array, new byte[] { 120, 92, -118, 66, 122, 35, -10, -112, 118, -61, 35, 65, -40, -98, -89, 6, -30, -6 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                final String intern = new String(array, utf_8).intern();
                final StringBuilder sb = new StringBuilder();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[5];
                array4[0] = 103;
                array4[1] = 115;
                array4[2] = -125;
                array4[3] = -99;
                array4[4] = 18;
                c(array3, new byte[] { 17, 79, -47, -64, 50, 97, 5, 47 });
                final StringBuilder append = sb.append(new String(array3, utf_8).intern()).append(c);
                final byte[] array6;
                final byte[] array5 = array6 = new byte[7];
                array6[0] = -83;
                array6[1] = 71;
                array6[2] = -97;
                array6[3] = 114;
                array6[4] = 112;
                array6[5] = -36;
                array6[6] = 120;
                c(array5, new byte[] { 106, -105, -37, 48, 7, -26, 88, 32 });
                this.c(intern, append.append(new String(array5, utf_8).intern()).append(a).toString());
                return true;
            }
        }
        else {
            this.o.a(a);
        }
        return false;
    }
    
    public final boolean f() {
        final String c = this.p.c();
        if (c == null) {
            return false;
        }
        if (this.o.b()) {
            final String d = this.o.d();
            if (!c.equals((Object)d)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[20];
                array2[0] = -50;
                array2[1] = -79;
                array2[2] = -26;
                array2[3] = 27;
                array2[4] = -7;
                array2[5] = -39;
                array2[6] = 106;
                array2[7] = -105;
                array2[8] = 64;
                array2[9] = -79;
                array2[10] = 23;
                array2[11] = 13;
                array2[12] = -127;
                array2[13] = -121;
                array2[14] = -2;
                array2[15] = 30;
                array2[16] = -73;
                array2[17] = -127;
                array2[18] = -118;
                array2[19] = 80;
                c(array, new byte[] { -109, 8, 109, 113, 127, -28, 4, 17, 28, 8, 78, -127, -79, 19, -88, -113, -65, 31, -40, 78 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                final String intern = new String(array, utf_8).intern();
                final StringBuilder sb = new StringBuilder();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[5];
                array4[0] = 10;
                array4[1] = -99;
                array4[2] = 37;
                array4[3] = -78;
                array4[4] = -48;
                c(array3, new byte[] { 46, 33, 44, -95, -16, 51, 46, -75 });
                final StringBuilder append = sb.append(new String(array3, utf_8).intern()).append(d);
                final byte[] array6;
                final byte[] array5 = array6 = new byte[7];
                array6[0] = -116;
                array6[1] = -86;
                array6[2] = -83;
                array6[3] = 50;
                array6[4] = -81;
                array6[5] = -95;
                array6[6] = -16;
                c(array5, new byte[] { -119, -70, -83, 112, -40, -101, -48, -42 });
                this.b(intern, append.append(new String(array5, utf_8).intern()).append(c).toString());
                return true;
            }
        }
        else {
            this.o.b(c);
        }
        return false;
    }
    
    public final a g() {
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[15];
            array2[0] = 114;
            array2[1] = 105;
            array2[2] = 50;
            array2[3] = -99;
            array2[4] = -96;
            array2[5] = -93;
            array2[6] = -63;
            array2[7] = -108;
            array2[8] = 72;
            array2[9] = 38;
            array2[10] = 43;
            array2[11] = 52;
            array2[12] = 62;
            array2[13] = 29;
            array2[14] = -24;
            c(array, new byte[] { 28, 55, 64, 8, -72, -6, -113, -8, 22, -113, 98, 89, 81, 111, -115 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final KeyStore instance = KeyStore.getInstance(new String(array, utf_8).intern());
            instance.load((KeyStore$LoadStoreParameter)null);
            final PublicKey e = this.o.e();
            if (e != null) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[13];
                array4[0] = 15;
                array4[1] = 9;
                array4[2] = -128;
                array4[3] = 97;
                array4[4] = -38;
                array4[5] = 82;
                array4[6] = 104;
                array4[7] = 77;
                array4[8] = 43;
                array4[9] = 71;
                array4[10] = -91;
                array4[11] = -27;
                array4[12] = -60;
                c(array3, new byte[] { 68, -104, -42, 43, -88, 97, 20, 61, 46, 83, -74, -92, -93 });
                if (!instance.containsAlias(new String(array3, utf_8).intern())) {
                    final byte[] array6;
                    final byte[] array5 = array6 = new byte[17];
                    array6[0] = -2;
                    array6[1] = -79;
                    array6[3] = (array6[2] = -98);
                    array6[4] = 52;
                    array6[5] = -11;
                    array6[6] = -51;
                    array6[7] = -8;
                    array6[8] = -62;
                    array6[9] = 36;
                    array6[10] = -1;
                    array6[11] = 2;
                    array6[12] = 86;
                    array6[13] = -33;
                    array6[14] = -21;
                    array6[15] = 6;
                    array6[16] = -42;
                    c(array5, new byte[] { -125, 8, -27, -18, 58, -68, -120, -91, -106, -122, -124, 90, 39, -18, 111, 122, -77 });
                    final String intern = new String(array5, utf_8).intern();
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[15];
                    array8[0] = -99;
                    array8[1] = -126;
                    array8[2] = -46;
                    array8[3] = -64;
                    array8[4] = -68;
                    array8[5] = 24;
                    array8[6] = 33;
                    array8[7] = -73;
                    array8[8] = 42;
                    array8[9] = -62;
                    array8[10] = 14;
                    array8[11] = 27;
                    array8[12] = 3;
                    array8[13] = -93;
                    array8[14] = -120;
                    c(array7, new byte[] { -27, 30, -90, -70, -72, 104, 57, -15, 71, 18, 83, -115, 118, -51, -20 });
                    this.c(intern, new String(array7, utf_8).intern());
                    this.a(instance);
                    return new a(false, true);
                }
                final KeyStore$PrivateKeyEntry b = this.b(instance);
                if (b != null) {
                    if (!this.a(e, b, UUID.randomUUID().toString())) {
                        final byte[] array10;
                        final byte[] array9 = array10 = new byte[17];
                        array10[0] = -52;
                        array10[1] = 90;
                        array10[2] = -55;
                        array10[3] = 82;
                        array10[4] = 92;
                        array10[5] = -62;
                        array10[6] = -97;
                        array10[7] = -78;
                        array10[8] = 11;
                        array10[9] = 85;
                        array10[10] = -47;
                        array10[11] = -40;
                        array10[12] = -62;
                        array10[13] = 87;
                        array10[14] = 7;
                        array10[15] = 85;
                        array10[16] = 115;
                        c(array9, new byte[] { -111, 99, -105, 50, 34, -21, -74, -33, 77, 87, -98, -76, -109, 102, 83, 75, 22 });
                        final String intern2 = new String(array9, utf_8).intern();
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[16];
                        array12[0] = 22;
                        array12[1] = 95;
                        array12[2] = -84;
                        array12[3] = 104;
                        array12[4] = -53;
                        array12[5] = 1;
                        array12[6] = 20;
                        array12[7] = -58;
                        array12[8] = -62;
                        array12[9] = 51;
                        array12[10] = 4;
                        array12[11] = 0;
                        array12[12] = 89;
                        array12[13] = -17;
                        array12[14] = 33;
                        array12[15] = 90;
                        c(array11, new byte[] { 102, 106, -65, 49, -109, -104, 80, -1, -104, -118, 97, -122, 33, -53, 44, 75 });
                        this.c(intern2, new String(array11, utf_8).intern());
                        return new a(true, false);
                    }
                    return new a(false, false);
                }
            }
            this.a(instance);
            return new a(false, false);
        }
        catch (final Exception ex) {
            return new a(false, false);
        }
    }
    
    public void h() {
        super.a(this.a((f$a)new d0$$ExternalSyntheticLambda0(this)));
    }
    
    public final X i() {
        final boolean e = this.e();
        boolean b = true;
        final a g = this.g();
        final boolean a = g.a;
        if (g.b || this.f()) {
            b = false;
        }
        return new X(e ^ true, a ^ true, b);
    }
    
    public static class a
    {
        public final boolean a;
        public final boolean b;
        
        public a(final boolean a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        public boolean a() {
            return this.a;
        }
        
        public boolean b() {
            return this.b;
        }
    }
}
