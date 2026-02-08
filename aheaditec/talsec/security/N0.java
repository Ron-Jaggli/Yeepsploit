package com.aheaditec.talsec.security;

import java.io.File;
import java.util.ArrayList;
import android.os.Build;
import java.util.Locale;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import android.telephony.TelephonyManager;
import android.content.Context;

public class n0 extends i
{
    public n0(final R0 r0, final u1 u1, final E1 e1) {
        super(r0, u1, e1);
    }
    
    public static void c(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = -1003175592;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] array4 = null;
    Label_0322:
        while (true) {
            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
            final int n6 = n >>> 8;
            final int n7 = ~((~n6 | 0xBEB383EC | n5) - ((n6 & 0xBEB383EC) | n5));
            final int n8 = -1171264002 - ((n7 & 0x2) | -130029571 - n7);
            Label_0977: {
                Label_0371: {
                    switch (0xBDD888E4 ^ ~n8 + (n8 | 0x1) * 2) {
                        default: {
                            break Label_0977;
                        }
                        case 1879000533: {
                            final int length = array4.length;
                            final int n9 = 0 - n3;
                            final int n10 = 0 - n9;
                            final int n11 = n10 | length;
                            final int length2 = array4.length;
                            final byte b = array4[(n10 ^ length2) - (~length2 & n10) * 2];
                            final int length3 = array4.length;
                            final byte b2 = array3[(n9 | length3) * 2 - (length3 ^ n9)];
                            array4[n11 - n10 * 2 + (length ^ n10 ^ n11)] = (byte)((byte)~b2 + (byte)((byte)2 * (byte)(b2 | 0x1)) ^ b ^ 0x1);
                            final int n12 = ~n3 + n3 * 2;
                            final long n13 = lcmp((long)n3, (long)2) >>> 31 & 0x1;
                            if (n13 != 0) {
                                n = -1216566512;
                            }
                            else {
                                n = 935800592;
                            }
                            n2 = n12;
                            if (n13 != 0) {
                                n2 = n12;
                                continue;
                            }
                            break Label_0371;
                        }
                        case 1870596681: {
                            break Label_0322;
                        }
                        case 1429728656: {
                            final int n14 = array4.length % 4;
                            final long n15 = lcmp((long)n14, (long)1) >>> 31 & 0x1;
                            if (n15 != 0) {
                                n = -1216566512;
                            }
                            else {
                                n = 935800592;
                            }
                            n2 = n14;
                            if (n15 != 0) {
                                n2 = n14;
                                continue;
                            }
                            break Label_0371;
                        }
                        case 256719606: {
                            final int n16 = n4 - 1 - (n4 | 0xFFFFFFFC);
                            final byte b3 = array3[n16];
                            final int n17 = (b3 & 0x1000000) * (b3 | 0x1000000) + (b3 & 0xFEFFFFFF) * (~b3 & 0x1000000);
                            final int n18 = n4 + 2;
                            final int n19 = n18 - (n4 & 0x2);
                            final int n20 = array3[n19] & 0xFF;
                            final int n21 = n20 * (~n20 & 0x10000);
                            final int a = J.a(n21, n17, 1, -1 - n21 | -1 - n17);
                            final int n22 = n18 + (-1 - n4 | 0xFFFFFFFE);
                            final int n23 = array3[n22] & 0xFF;
                            final int n24 = n23 * (~n23 & 0x100);
                            final int n25 = n24 - 1 - (~a | n24);
                            final int n26 = array3[n4] & 0xFF;
                            final int n27 = ~((n26 | (~n25 | 0xD2FAA664)) - ((n25 & 0xD2FAA664) | n26));
                            final byte b4 = array4[n16];
                            final int n28 = (b4 & 0x1000000) * (b4 | 0x1000000) + (0xFEFFFFFF & b4) * (~b4 & 0x1000000);
                            final int n29 = array4[n19] & 0xFF;
                            final int n30 = n29 * (~n29 & 0x10000);
                            final int n31 = array4[n22] & 0xFF;
                            final int n32 = n31 * (~n31 & 0x100);
                            final int n33 = array4[n4] & 0xFF;
                            final int n34 = n27 << (dcmpg((double)n27, Double.NaN) >>> 31);
                            final int n35 = -659933419 - ((n28 & 0x2) | 1983400305 - n28);
                            final int n36 = (n35 ^ ~n30) + (n35 | n30) * 2 + 1;
                            final int n37 = (n36 ^ n33) + (n36 & n33) * 2;
                            final int n38 = (n37 | n32) - (0x8249843B & ~n32 & n37) + ((n32 | 0x8249843B) & n37);
                            final int a2 = y1.a(n34 | n38, 2, n34, n38);
                            array4[n4] = (byte)a2;
                            array4[n22] = (byte)(a2 >>> 8);
                            array4[n19] = (byte)(a2 >>> 16);
                            array4[n16] = (byte)(a2 >>> 24);
                            n4 = (n4 ^ 0x4) + (n4 & 0x4) * 2;
                            final int length4 = array4.length;
                            final int n39 = 0 - array4.length % 4;
                            final long n40 = lcmp((long)n4, (long)((length4 | n39) * 2 - (length4 ^ n39))) >>> 31 & 0x1;
                            if (n40 != 0) {
                                n = -1515449616;
                            }
                            else {
                                n = 935800592;
                            }
                            if (n40 != 0) {
                                continue;
                            }
                            n = -10521562;
                            continue;
                        }
                        case -497756741: {
                            final int length5 = array4.length;
                            final int n41 = 0 - n3;
                            final int n42 = (length5 | n41) * 2 - (length5 ^ n41);
                            final byte b5 = array3[n42];
                            final int length6 = array4.length;
                            final byte b6 = array3[(n41 | length6) - (0x45569591 & ~n41 & length6) + ((n41 | 0x45569591) & length6)];
                            array3[n42] = (byte)((byte)((byte)(b6 ^ ~b5) + (byte)((byte)2 * (byte)(b6 | b5))) + (byte)1);
                            break Label_0977;
                        }
                        case -1486048729: {
                            final int length7 = array.length;
                            final int n43 = 0 - (0 - array.length % 4);
                            final boolean b7 = (length7 & ~n43) - (~length7 & n43) > 0;
                            if (b7) {
                                n = -1515449616;
                            }
                            else {
                                n = 935800592;
                            }
                            if (!b7) {
                                n = -10521562;
                            }
                            array3 = array2;
                            array4 = array;
                            n4 = 0;
                            continue;
                        }
                        case -1922532006: {
                            final int length8 = array4.length;
                            final int n44 = 0 - n2;
                            if (dcmpg((double)array3[L.a(0, (length8 & 0x2) | N.a(n44, -4, 1, length8), n44 * 3, 1)], Double.NaN) > -1) {
                                n = 935800592;
                            }
                            else {
                                n = -1671996003;
                            }
                            n3 = n2;
                            continue;
                        }
                    }
                    continue;
                }
                n = -1058029970;
                continue;
            }
            n = 935800592;
        }
    }
    
    public void a(final Context context) {
        this.d(context);
    }
    
    public final boolean a(final TelephonyManager telephonyManager) {
        final String line1Number = telephonyManager.getLine1Number();
        final byte[] array2;
        final byte[] array = array2 = new byte[9];
        array2[0] = -37;
        array2[1] = 108;
        array2[2] = -3;
        array2[3] = -48;
        array2[4] = -53;
        array2[5] = 98;
        array2[6] = 64;
        array2[7] = 89;
        array2[8] = -62;
        c(array, new byte[] { 78, 111, 90, 6, 90, 98, -125, -114, -9 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        if (line1Number != null && line1Number.contains((CharSequence)intern)) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[16];
            array4[0] = 91;
            array4[1] = 116;
            array4[2] = 36;
            array4[3] = 75;
            array4[4] = -110;
            array4[5] = 56;
            array4[6] = -117;
            array4[7] = -106;
            array4[8] = -103;
            array4[9] = -14;
            array4[10] = -52;
            array4[11] = -112;
            array4[12] = -62;
            array4[13] = 3;
            array4[14] = 78;
            array4[15] = 45;
            c(array3, new byte[] { -100, 9, -13, -50, 93, 106, -108, -106, 88, -47, 112, -122, 11, -109, -38, -3 });
            this.c(new String(array3, utf_8).intern(), telephonyManager.getLine1Number());
            return true;
        }
        return false;
    }
    
    public final boolean a(final U0 u0, final String s) {
        final String[] b = u0.b;
        int i = 0;
        if (b == null) {
            return false;
        }
        final int length = b.length;
        boolean b2 = false;
        while (i < length) {
            if (s.equals((Object)b[i])) {
                final byte[] array2;
                final byte[] array = array2 = new byte[27];
                array2[0] = -111;
                array2[1] = 14;
                array2[2] = 2;
                array2[3] = -51;
                array2[4] = -25;
                array2[5] = 40;
                array2[6] = 29;
                array2[7] = -83;
                array2[8] = -127;
                array2[9] = -15;
                array2[11] = (array2[10] = 13);
                array2[12] = 87;
                array2[13] = 125;
                array2[14] = -36;
                array2[15] = 30;
                array2[16] = 9;
                array2[17] = -27;
                array2[18] = -54;
                array2[19] = 7;
                array2[20] = 46;
                array2[21] = 127;
                array2[22] = 31;
                array2[23] = -37;
                array2[24] = -23;
                array2[25] = -56;
                array2[26] = 113;
                c(array, new byte[] { 86, -108, 22, 76, -32, 83, -30, 122, 73, -66, 11, 0, -119, 58, 60, -18, -35, -73, 78, 30, -85, 58, -16, 81, -100, -83, 2 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                final String intern = new String(array, utf_8).intern();
                final StringBuilder append = new StringBuilder().append(u0.a);
                final byte[] array4;
                final byte[] array3 = array4 = new byte[3];
                array4[0] = 104;
                array4[1] = 121;
                array4[2] = 91;
                c(array3, new byte[] { 72, 67, 123, -47, 93, -96, -77, 50 });
                this.c(intern, append.append(new String(array3, utf_8).intern()).append(s).toString());
                b2 = true;
            }
            ++i;
        }
        return b2;
    }
    
    public final boolean a(String line, final String s, final String s2) {
        try {
            final BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader((String)line));
            try {
                do {
                    line = bufferedReader.readLine();
                    if (line != null) {
                        continue;
                    }
                    bufferedReader.close();
                    return false;
                } while (!((String)line).toLowerCase(Locale.ENGLISH).contains((CharSequence)s2));
                this.c(s, s2);
                bufferedReader.close();
                return true;
            }
            finally {
                try {
                    bufferedReader.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)line).addSuppressed(t);
                }
            }
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final boolean a(String b, final String[] array, final String s, final boolean b2) {
        final StringBuilder sb = new StringBuilder();
        final byte[] array3;
        final byte[] array2 = array3 = new byte[8];
        array3[0] = 18;
        array3[1] = 52;
        array3[2] = -74;
        array3[3] = -117;
        array3[4] = 74;
        array3[5] = -29;
        array3[6] = -13;
        array3[7] = 31;
        c(array2, new byte[] { -47, 68, 92, -98, -100, -65, 21, -94 });
        b = C1.b(sb.append(new String(array2, StandardCharsets.UTF_8).intern()).append(b).toString());
        if (b == null) {
            return false;
        }
        for (final String s2 : array) {
            if (b.equalsIgnoreCase(s2)) {
                if (b2) {
                    this.b(s, s2);
                }
                else {
                    this.c(s, s2);
                }
                return true;
            }
        }
        return false;
    }
    
    public final boolean b(final Context context) {
        final TelephonyManager c = this.c(context);
        boolean b = false;
        if (c == null) {
            return false;
        }
        if (this.a(c) || this.c(c) || this.b(c) || this.d(c)) {
            b = true;
        }
        return b;
    }
    
    public final boolean b(final TelephonyManager telephonyManager) {
        final String simSerialNumber = telephonyManager.getSimSerialNumber();
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = 3;
        array2[1] = -5;
        array2[2] = 58;
        array2[3] = 75;
        array2[4] = 7;
        array2[5] = -108;
        array2[6] = -85;
        array2[7] = -34;
        array2[8] = -62;
        array2[9] = -57;
        array2[10] = -67;
        array2[11] = 112;
        array2[12] = 30;
        array2[13] = -21;
        array2[14] = 37;
        array2[15] = 113;
        array2[16] = -37;
        array2[17] = -55;
        array2[18] = -8;
        array2[19] = 121;
        c(array, new byte[] { -97, -47, -100, -100, -97, -80, 45, 114, 84, -124, 30, -30, -13, -32, -94, -30, 79, -128, 88, -20 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        if (simSerialNumber != null && simSerialNumber.contains((CharSequence)intern)) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[14];
            array4[0] = -83;
            array4[1] = 79;
            array4[2] = 118;
            array4[3] = 29;
            array4[4] = 71;
            array4[5] = 50;
            array4[6] = 3;
            array4[7] = -26;
            array4[8] = -102;
            array4[9] = -41;
            array4[10] = -28;
            array4[11] = 54;
            array4[12] = -50;
            array4[13] = -13;
            c(array3, new byte[] { 50, 85, -115, 28, -128, 76, 28, 37, 109, -96, 36, -16, -81, -97 });
            this.c(new String(array3, utf_8).intern(), telephonyManager.getSimSerialNumber());
            return true;
        }
        return false;
    }
    
    public final boolean b(final U0 u0, final String s) {
        if (!s.isEmpty()) {
            final byte[] array2;
            final byte[] array = array2 = new byte[34];
            array2[0] = -79;
            array2[1] = -82;
            array2[2] = 20;
            array2[3] = -123;
            array2[4] = -16;
            array2[5] = 50;
            array2[6] = 82;
            array2[7] = -11;
            array2[8] = -71;
            array2[9] = -119;
            array2[10] = -19;
            array2[11] = -45;
            array2[12] = -119;
            array2[13] = -94;
            array2[14] = -31;
            array2[15] = -29;
            array2[16] = 71;
            array2[17] = 44;
            array2[18] = -108;
            array2[19] = -65;
            array2[20] = 75;
            array2[21] = -58;
            array2[22] = -82;
            array2[23] = -5;
            array2[24] = 76;
            array2[25] = -70;
            array2[26] = 111;
            array2[27] = -75;
            array2[28] = -63;
            array2[29] = 87;
            array2[30] = 117;
            array2[31] = 39;
            array2[32] = 107;
            array2[33] = -11;
            c(array, new byte[] { 54, -12, -29, -124, -1, 112, -74, 56, 45, 18, 45, 66, 84, -57, 59, 47, -120, 113, 79, 81, -96, -35, 76, 39, -65, -55, -92, 122, 16, 41, -122, -3, 4, -121 });
            this.c(new String(array, StandardCharsets.UTF_8).intern(), u0.a);
            return true;
        }
        return false;
    }
    
    public final TelephonyManager c(final Context context) {
        return null;
    }
    
    public final boolean c(final TelephonyManager telephonyManager) {
        final String subscriberId = telephonyManager.getSubscriberId();
        final byte[] array2;
        final byte[] array = array2 = new byte[15];
        array2[0] = 42;
        array2[1] = 43;
        array2[2] = -116;
        array2[3] = -75;
        array2[4] = -61;
        array2[5] = -47;
        array2[6] = 114;
        array2[7] = 73;
        array2[8] = 8;
        array2[9] = -117;
        array2[10] = 63;
        array2[11] = 75;
        array2[12] = -55;
        array2[13] = 32;
        array2[14] = -83;
        c(array, new byte[] { -3, 41, -50, 37, 81, -113, -44, -101, -100, 72, -127, -99, -7, 16, -99 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        if (subscriberId != null && subscriberId.contains((CharSequence)intern)) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[16];
            array4[0] = -28;
            array4[1] = 120;
            array4[2] = -37;
            array4[3] = 102;
            array4[4] = -61;
            array4[5] = -82;
            array4[6] = 123;
            array4[7] = 72;
            array4[8] = -30;
            array4[9] = 121;
            array4[10] = -120;
            array4[11] = -117;
            array4[12] = 35;
            array4[13] = 121;
            array4[14] = 72;
            array4[15] = -55;
            c(array3, new byte[] { -21, 14, 40, -86, 12, -49, -104, -56, -11, 21, -109, -113, -94, 20, -13, 79 });
            this.c(new String(array3, utf_8).intern(), telephonyManager.getSubscriberId());
            return true;
        }
        return false;
    }
    
    public void d(final Context context) {
        this.a(this.a((f$a)new n0$$ExternalSyntheticLambda0(this, context)));
    }
    
    public final boolean d(final TelephonyManager telephonyManager) {
        final String voiceMailNumber = telephonyManager.getVoiceMailNumber();
        final byte[] array2;
        final byte[] array = array2 = new byte[11];
        array2[0] = -51;
        array2[1] = 107;
        array2[2] = 25;
        array2[3] = -123;
        array2[4] = -54;
        array2[5] = 5;
        array2[6] = 12;
        array2[7] = -76;
        array2[8] = -84;
        array2[9] = -52;
        array2[10] = -48;
        c(array, new byte[] { 64, 108, -66, -46, 92, -62, 74, 35, -100, -8, -23 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        if (voiceMailNumber != null && voiceMailNumber.contains((CharSequence)intern)) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[20];
            array4[0] = -90;
            array4[1] = -105;
            array4[2] = -28;
            array4[3] = -14;
            array4[4] = 123;
            array4[5] = 36;
            array4[6] = -96;
            array4[7] = 63;
            array4[8] = 121;
            array4[9] = 27;
            array4[10] = -15;
            array4[11] = -110;
            array4[12] = -3;
            array4[13] = 11;
            array4[14] = -108;
            array4[15] = 33;
            array4[16] = 16;
            array4[17] = -27;
            array4[18] = -30;
            array4[19] = -42;
            c(array3, new byte[] { 41, -19, 51, 54, 116, 68, 125, -53, 126, 108, 46, -108, -56, -107, 75, -15, -39, -80, 49, 75 });
            this.c(new String(array3, utf_8).intern(), telephonyManager.getVoiceMailNumber());
            return true;
        }
        return false;
    }
    
    public final boolean e() {
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = 23;
        array2[1] = 14;
        array2[2] = -111;
        array2[3] = -68;
        array2[4] = -52;
        array2[5] = 13;
        array2[6] = -26;
        array2[7] = -63;
        array2[8] = 78;
        array2[9] = -63;
        array2[10] = 18;
        array2[11] = 35;
        array2[12] = -114;
        array2[13] = -79;
        array2[14] = -114;
        array2[15] = -104;
        array2[16] = 38;
        c(array, new byte[] { -108, -117, 112, 112, 19, -44, 36, 65, -98, -56, -85, -26, 85, -19, 111, -114, 86 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        try {
            final BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader(intern));
            try {
                final String line = bufferedReader.readLine();
                if (line != null) {
                    final byte[] array4;
                    final byte[] array3 = array4 = new byte[9];
                    array4[0] = 98;
                    array4[1] = 30;
                    array4[2] = 36;
                    array4[3] = -88;
                    array4[4] = 57;
                    array4[5] = -128;
                    array4[6] = -93;
                    array4[7] = -80;
                    array4[8] = -53;
                    c(array3, new byte[] { 60, 97, -13, 103, -78, 31, 108, 41, -28 });
                    if (line.contains((CharSequence)new String(array3, utf_8).intern())) {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[17];
                        array6[0] = 67;
                        array6[1] = -109;
                        array6[2] = 40;
                        array6[3] = 47;
                        array6[4] = 123;
                        array6[5] = -59;
                        array6[6] = -117;
                        array6[7] = -69;
                        array6[8] = -117;
                        array6[9] = -43;
                        array6[10] = 29;
                        array6[11] = 118;
                        array6[12] = 114;
                        array6[13] = -3;
                        array6[14] = -98;
                        array6[15] = -93;
                        array6[16] = -69;
                        c(array5, new byte[] { -124, -24, -1, -14, 116, -16, -110, 115, 91, -79, -32, -76, 81, -103, 127, 115, -53 });
                        final String intern2 = new String(array5, utf_8).intern();
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[4];
                        array8[0] = -118;
                        array8[1] = 120;
                        array8[2] = -24;
                        array8[3] = -72;
                        c(array7, new byte[] { 90, 20, 47, 126, -56, 81, -2, 6 });
                        this.b(intern2, new String(array7, utf_8).intern());
                        bufferedReader.close();
                        return true;
                    }
                }
                bufferedReader.close();
                return false;
            }
            finally {
                try {
                    bufferedReader.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final boolean e(final String s, final String s2) {
        return s != null && s.contains((CharSequence)s2);
    }
    
    public final boolean f() {
        final byte[] array2;
        final byte[] array = array2 = new byte[13];
        array2[0] = -28;
        array2[1] = 8;
        array2[2] = -111;
        array2[3] = -30;
        array2[4] = -86;
        array2[5] = 26;
        array2[6] = -107;
        array2[7] = -91;
        array2[8] = -124;
        array2[9] = -78;
        array2[10] = -87;
        array2[11] = 126;
        array2[12] = 61;
        c(array, new byte[] { -89, -122, 112, 42, 45, 39, 100, 120, 93, -55, 117, -121, 82 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[12];
        array4[0] = 37;
        array4[1] = 92;
        array4[2] = 28;
        array4[3] = -126;
        array4[4] = 23;
        array4[5] = -113;
        array4[6] = 18;
        array4[7] = 100;
        array4[8] = 107;
        array4[9] = -64;
        array4[10] = -106;
        array4[11] = 31;
        c(array3, new byte[] { -86, 33, -21, -121, -48, 63, -12, -77, 70, -64, 110, -19 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[10];
        array6[0] = 20;
        array6[1] = 32;
        array6[2] = 96;
        array6[3] = -29;
        array6[4] = 12;
        array6[5] = -49;
        array6[6] = -112;
        array6[7] = -22;
        array6[8] = 16;
        array6[9] = 82;
        c(array5, new byte[] { -48, 116, -94, 32, -62, -54, 107, 62, 127, 32 });
        return this.a(intern, intern2, new String(array5, utf_8).intern());
    }
    
    public final boolean g() {
        final byte[] array2;
        final byte[] array = array2 = new byte[22];
        array2[0] = 118;
        array2[1] = 94;
        array2[2] = -107;
        array2[3] = -122;
        array2[4] = -103;
        array2[5] = 64;
        array2[6] = 97;
        array2[7] = -109;
        array2[8] = -40;
        array2[9] = -114;
        array2[10] = 52;
        array2[11] = 50;
        array2[12] = -53;
        array2[13] = 6;
        array2[14] = 16;
        array2[15] = -6;
        array2[16] = 13;
        array2[17] = -76;
        array2[18] = -13;
        array2[19] = 27;
        array2[20] = 89;
        array2[21] = -104;
        c(array, new byte[] { 104, 35, 41, -103, 79, 65, -73, -128, 31, 8, -120, -9, 31, -127, -81, 61, -45, -56, 9, 23, 42, -20 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final String[] e = m0.E;
        final byte[] array4;
        final byte[] array3 = array4 = new byte[16];
        array4[0] = -34;
        array4[1] = -65;
        array4[2] = -122;
        array4[3] = -53;
        array4[4] = -37;
        array4[5] = -67;
        array4[6] = -97;
        array4[7] = 5;
        array4[8] = 118;
        array4[9] = 6;
        array4[10] = -6;
        array4[11] = 33;
        array4[12] = -103;
        array4[13] = 0;
        array4[14] = 6;
        array4[15] = -128;
        c(array3, new byte[] { -31, -59, -99, 78, 20, -18, 124, 29, 118, -107, 31, -21, 79, -81, 21, -117 });
        return this.a(intern, e, new String(array3, utf_8).intern(), true);
    }
    
    public final boolean h() {
        final byte[] array2;
        final byte[] array = array2 = new byte[20];
        array2[0] = -10;
        array2[1] = 10;
        array2[2] = 46;
        array2[3] = -40;
        array2[4] = 12;
        array2[5] = -124;
        array2[6] = 36;
        array2[7] = -68;
        array2[8] = -69;
        array2[9] = -62;
        array2[10] = 117;
        array2[11] = -43;
        array2[12] = 86;
        array2[13] = 72;
        array2[14] = 86;
        array2[15] = -94;
        array2[16] = -59;
        array2[17] = 19;
        array2[18] = -32;
        array2[19] = -51;
        c(array, new byte[] { -24, -105, -79, 94, -47, 29, -32, 119, 52, -98, -111, 90, -44, 92, -69, 101, 71, 96, 32, 93 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[3];
        array4[0] = -4;
        array4[1] = 104;
        array4[2] = 109;
        c(array3, new byte[] { -124, 80, 91, 33, -58, 74, 84, -35 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[16];
        array6[0] = -40;
        array6[1] = 44;
        array6[2] = 45;
        array6[3] = 82;
        array6[4] = -18;
        array6[5] = 38;
        array6[6] = -109;
        array6[7] = 104;
        array6[8] = 96;
        array6[9] = 37;
        array6[10] = 48;
        array6[11] = 75;
        array6[12] = 88;
        array6[13] = -103;
        array6[14] = 27;
        array6[15] = 43;
        c(array5, new byte[] { 31, 114, -6, -41, -7, 81, 104, -66, 104, 114, -42, -62, -114, -57, -1, -32 });
        return this.a(intern, new String[] { intern2 }, new String(array5, utf_8).intern(), true);
    }
    
    public final boolean i() {
        final byte[] array2;
        final byte[] array = array2 = new byte[22];
        array2[0] = 29;
        array2[1] = -10;
        array2[2] = 55;
        array2[3] = 119;
        array2[4] = 61;
        array2[5] = 90;
        array2[6] = -85;
        array2[7] = -55;
        array2[8] = -116;
        array2[9] = 118;
        array2[10] = -116;
        array2[11] = -19;
        array2[12] = 40;
        array2[13] = 111;
        array2[14] = -98;
        array2[15] = -25;
        array2[16] = 99;
        array2[17] = 4;
        array2[18] = -31;
        array2[19] = -61;
        array2[20] = 68;
        array2[21] = -50;
        c(array, new byte[] { -77, -116, -121, -67, -128, 43, 107, 69, 91, 74, -120, 34, -30, 53, 99, 43, 41, -109, 32, 75, 114, -6 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = 87;
        array4[1] = -125;
        array4[2] = 13;
        array4[3] = -49;
        array4[4] = 71;
        array4[5] = 111;
        c(array3, new byte[] { -125, 72, 73, 110, 113, 91, -128, 101 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[18];
        array6[0] = 82;
        array6[1] = -118;
        array6[2] = 55;
        array6[3] = -42;
        array6[4] = -12;
        array6[5] = -17;
        array6[6] = -115;
        array6[7] = -100;
        array6[8] = -67;
        array6[9] = -66;
        array6[10] = -90;
        array6[11] = -81;
        array6[12] = 35;
        array6[13] = 44;
        array6[14] = 0;
        array6[15] = -98;
        array6[16] = -109;
        array6[17] = 40;
        c(array5, new byte[] { -107, 31, -52, 91, -13, -104, -110, -117, 13, -51, 108, 125, -75, 88, 0, 109, -91, 28 });
        return this.a(intern, new String[] { intern2 }, new String(array5, utf_8).intern(), true);
    }
    
    public final boolean j() {
        final String board = Build.BOARD;
        if (board != null) {
            final String lowerCase = board.toLowerCase(Locale.ENGLISH);
            final byte[] array2;
            final byte[] array = array2 = new byte[3];
            array2[0] = 20;
            array2[1] = 89;
            array2[2] = 73;
            c(array, new byte[] { 122, 54, 49, -9, -66, 38, 82, -29 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (lowerCase.contains((CharSequence)new String(array, utf_8).intern())) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[18];
                array4[0] = -70;
                array4[1] = -38;
                array4[2] = -85;
                array4[3] = -29;
                array4[4] = 65;
                array4[5] = -36;
                array4[6] = 10;
                array4[7] = -126;
                array4[8] = -41;
                array4[9] = -13;
                array4[10] = -17;
                array4[11] = 19;
                array4[12] = -101;
                array4[13] = -49;
                array4[14] = -107;
                array4[15] = 7;
                array4[16] = -15;
                array4[17] = -60;
                c(array3, new byte[] { 61, -96, 120, 37, -114, -116, 17, -111, 23, -128, 21, 25, 77, -1, 104, 11, -125, -96 });
                final String intern = new String(array3, utf_8).intern();
                final byte[] array6;
                final byte[] array5 = array6 = new byte[3];
                array6[0] = 125;
                array6[1] = -31;
                array6[2] = -34;
                c(array5, new byte[] { 19, -114, -90, -104, 100, 96, 48, -54 });
                this.c(intern, new String(array5, utf_8).intern());
                return true;
            }
        }
        return false;
    }
    
    public final boolean k() {
        final String bootloader = Build.BOOTLOADER;
        if (bootloader != null) {
            final String lowerCase = bootloader.toLowerCase(Locale.ENGLISH);
            final byte[] array2;
            final byte[] array = array2 = new byte[3];
            array2[0] = 74;
            array2[1] = -25;
            array2[2] = -6;
            c(array, new byte[] { 36, -120, -126, -74, 62, 78, -119, 9 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (lowerCase.contains((CharSequence)new String(array, utf_8).intern())) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[23];
                array4[0] = 116;
                array4[1] = 88;
                array4[2] = -47;
                array4[3] = -37;
                array4[4] = 32;
                array4[5] = 64;
                array4[6] = 3;
                array4[7] = -53;
                array4[8] = -23;
                array4[9] = -117;
                array4[10] = -35;
                array4[11] = -1;
                array4[12] = -77;
                array4[13] = -47;
                array4[14] = 91;
                array4[15] = -57;
                array4[16] = 23;
                array4[17] = -75;
                array4[18] = 13;
                array4[19] = 9;
                array4[20] = 108;
                array4[21] = 78;
                array4[22] = -18;
                c(array3, new byte[] { 123, 46, 38, 93, -81, 104, 24, 88, -31, 24, 59, 13, 37, -3, -94, 70, -49, -50, 16, 10, 8, 43, -100 });
                final String intern = new String(array3, utf_8).intern();
                final byte[] array6;
                final byte[] array5 = array6 = new byte[3];
                array6[0] = 28;
                array6[1] = 27;
                array6[2] = -27;
                c(array5, new byte[] { 114, 116, -99, -75, 37, 7, 108, -2 });
                this.c(intern, new String(array5, utf_8).intern());
                return true;
            }
        }
        return false;
    }
    
    public final boolean l() {
        for (final String s : m0.B) {
            if (Build.BRAND.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[18];
                array2[0] = 29;
                array2[1] = -36;
                array2[2] = -126;
                array2[3] = -119;
                array2[4] = 123;
                array2[5] = -96;
                array2[6] = -2;
                array2[8] = (array2[7] = -34);
                array2[9] = 21;
                array2[10] = 76;
                array2[11] = -57;
                array2[12] = 40;
                array2[13] = -4;
                array2[14] = -51;
                array2[15] = -105;
                array2[16] = -46;
                array2[17] = 20;
                c(array, new byte[] { -94, -95, -111, -120, 116, -53, 29, 52, -18, 98, -54, 70, -66, -85, 77, -101, -68, 112 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean m() {
        for (final String s : m0.F) {
            if (Build.DEVICE.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[19];
                array2[0] = 74;
                array2[1] = -77;
                array2[2] = -30;
                array2[3] = -98;
                array2[4] = -66;
                array2[5] = 125;
                array2[6] = -105;
                array2[7] = -79;
                array2[8] = -80;
                array2[9] = 48;
                array2[10] = -126;
                array2[11] = -68;
                array2[12] = 56;
                array2[13] = 16;
                array2[14] = 63;
                array2[15] = 44;
                array2[16] = -42;
                array2[17] = 26;
                array2[18] = 1;
                c(array, new byte[] { -115, -56, 49, 98, 9, 46, 100, 97, 56, 127, -128, 113, -82, -71, -43, -8, -65, 121, 100 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean n() {
        for (final String s : m0.I) {
            if (Build.FINGERPRINT.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[24];
                array2[0] = 86;
                array2[1] = 99;
                array2[2] = 72;
                array2[3] = -84;
                array2[4] = -126;
                array2[5] = -102;
                array2[6] = -30;
                array2[7] = 106;
                array2[8] = -48;
                array2[9] = -7;
                array2[10] = -1;
                array2[11] = 37;
                array2[12] = 35;
                array2[13] = 120;
                array2[14] = 123;
                array2[15] = 122;
                array2[16] = -115;
                array2[17] = 120;
                array2[18] = 22;
                array2[19] = 84;
                array2[20] = -64;
                array2[21] = -116;
                array2[22] = 4;
                array2[23] = -74;
                c(array, new byte[] { -103, 56, -33, 109, 77, -51, 57, -72, 24, -122, 5, -25, -75, 35, -124, -78, 86, 3, -6, -58, 22, 19, 24, 108 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean o() {
        final byte[] array2;
        final byte[] array = array2 = new byte[15];
        array2[0] = 39;
        array2[1] = 30;
        array2[2] = 53;
        array2[3] = 122;
        array2[4] = -100;
        array2[5] = 98;
        array2[6] = 27;
        array2[7] = 91;
        array2[8] = -59;
        array2[9] = 123;
        array2[10] = -28;
        array2[11] = 125;
        array2[12] = -116;
        array2[13] = 59;
        array2[14] = 118;
        c(array, new byte[] { -71, 100, -119, -66, 53, 57, -31, -39, 71, 15, 58, -127, -6, 84, 4 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final String[] c = m0.C;
        final byte[] array4;
        final byte[] array3 = array4 = new byte[19];
        array4[0] = 101;
        array4[1] = 9;
        array4[2] = 46;
        array4[3] = -88;
        array4[4] = -33;
        array4[5] = 15;
        array4[6] = -89;
        array4[7] = -55;
        array4[8] = 127;
        array4[9] = 112;
        array4[10] = 6;
        array4[11] = -1;
        array4[12] = 57;
        array4[13] = -119;
        array4[14] = 46;
        array4[15] = -118;
        array4[16] = -92;
        array4[17] = 0;
        array4[18] = -91;
        c(array3, new byte[] { 106, -97, -6, 105, -24, -72, 117, 89, 79, 63, 12, 14, -81, 48, -52, -115, -46, 111, -41 });
        return this.a(intern, c, new String(array3, utf_8).intern(), false);
    }
    
    public final boolean p() {
        for (final String s : m0.H) {
            if (Build.HARDWARE.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[21];
                array2[0] = -18;
                array2[1] = -80;
                array2[2] = -59;
                array2[3] = 39;
                array2[4] = -51;
                array2[5] = 37;
                array2[6] = 73;
                array2[7] = 112;
                array2[8] = 116;
                array2[9] = 117;
                array2[10] = -8;
                array2[11] = -107;
                array2[12] = 21;
                array2[13] = 42;
                array2[14] = -128;
                array2[15] = 97;
                array2[16] = -116;
                array2[17] = -60;
                array2[18] = -99;
                array2[19] = -88;
                array2[20] = -98;
                c(array, new byte[] { -15, -10, 82, -23, 26, 86, -42, -89, 116, 2, 30, -105, -53, 95, -109, -79, 84, -59, 110, 121, -5 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean q() {
        for (final String s : m0.A) {
            if (Build.MANUFACTURER.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[25];
                array2[0] = -11;
                array2[1] = 73;
                array2[2] = -36;
                array2[3] = -108;
                array2[4] = 53;
                array2[5] = 93;
                array2[6] = 38;
                array2[7] = -102;
                array2[8] = -107;
                array2[9] = -34;
                array2[10] = 98;
                array2[11] = 32;
                array2[12] = -13;
                array2[13] = 69;
                array2[14] = -11;
                array2[15] = 1;
                array2[16] = -124;
                array2[17] = 110;
                array2[18] = -10;
                array2[19] = 109;
                array2[20] = -43;
                array2[21] = -36;
                array2[22] = 84;
                array2[23] = 85;
                array2[24] = -108;
                c(array, new byte[] { -6, 95, 43, -108, -78, 15, -11, -119, 85, -83, -96, -19, -27, 126, 6, 10, 93, 58, 9, -77, 13, -65, -76, -46, -26 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean r() {
        for (final String s : m0.G) {
            if (Build.MODEL.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[18];
                array2[0] = 0;
                array2[1] = 31;
                array2[2] = 59;
                array2[3] = 33;
                array2[4] = -120;
                array2[5] = -110;
                array2[6] = -87;
                array2[7] = -20;
                array2[8] = -110;
                array2[9] = 13;
                array2[10] = 114;
                array2[11] = 78;
                array2[12] = -92;
                array2[13] = 61;
                array2[14] = -116;
                array2[15] = -128;
                array2[16] = 52;
                array2[17] = 16;
                c(array, new byte[] { -57, 100, -56, -32, 71, -59, 118, 58, 90, -102, -105, -33, 58, 102, -111, -122, 81, 124 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean s() {
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = 13;
        array2[1] = -114;
        array2[2] = -16;
        array2[3] = -3;
        array2[4] = -32;
        array2[5] = 20;
        array2[6] = 51;
        array2[7] = 17;
        array2[8] = 56;
        array2[9] = -60;
        array2[10] = 36;
        array2[11] = 29;
        array2[12] = -26;
        array2[13] = 77;
        array2[14] = -21;
        array2[15] = 22;
        array2[16] = 52;
        c(array, new byte[] { -61, 20, 76, 2, -21, 99, -41, 23, -14, -63, -6, 30, -2, 93, 50, 11, 89 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[3];
        array4[0] = 94;
        array4[1] = -121;
        array4[2] = 42;
        c(array3, new byte[] { 48, -24, 82, -115, 62, 114, 88, -74 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[21];
        array6[0] = 61;
        array6[1] = -63;
        array6[2] = -97;
        array6[3] = -90;
        array6[4] = 69;
        array6[5] = -35;
        array6[6] = -19;
        array6[7] = -108;
        array6[8] = 33;
        array6[9] = -56;
        array6[10] = -63;
        array6[11] = -87;
        array6[12] = 92;
        array6[13] = -97;
        array6[14] = -5;
        array6[15] = -43;
        array6[16] = 23;
        array6[17] = -109;
        array6[18] = -128;
        array6[19] = 107;
        array6[20] = -10;
        c(array5, new byte[] { -126, -58, 116, 106, -126, -113, 50, -126, -87, -44, 71, 99, 114, -35, 1, 89, -49, -26, -99, -65, -101 });
        return this.a(intern, new String[] { intern2 }, new String(array5, utf_8).intern(), false);
    }
    
    public final boolean t() {
        for (final String s : m0.z) {
            final String product = Build.PRODUCT;
            if (product != null && product.contains((CharSequence)s)) {
                final byte[] array2;
                final byte[] array = array2 = new byte[20];
                array2[0] = 107;
                array2[1] = -103;
                array2[2] = -13;
                array2[3] = -62;
                array2[4] = -36;
                array2[5] = 48;
                array2[6] = -35;
                array2[7] = -125;
                array2[8] = 115;
                array2[9] = 56;
                array2[10] = 5;
                array2[11] = -111;
                array2[12] = -2;
                array2[13] = 125;
                array2[14] = -42;
                array2[15] = -87;
                array2[16] = 62;
                array2[17] = -104;
                array2[18] = -58;
                array2[19] = -15;
                c(array, new byte[] { 108, -17, 0, 70, -21, 91, 34, -109, 123, 71, 3, -100, -48, 59, 58, 99, -122, -16, 91, 32 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean u() {
        final U0[] j = m0.J;
        final int length = j.length;
        int i = 0;
        boolean b = false;
        while (i < length) {
            final U0 u0 = j[i];
            final StringBuilder sb = new StringBuilder();
            final byte[] array2;
            final byte[] array = array2 = new byte[8];
            array2[0] = -109;
            array2[1] = 104;
            array2[2] = 119;
            array2[3] = -117;
            array2[4] = -91;
            array2[5] = 43;
            array2[6] = 40;
            array2[7] = -80;
            c(array, new byte[] { 80, 51, -99, -99, 59, 118, -22, 50 });
            final String b2 = C1.b(sb.append(new String(array, StandardCharsets.UTF_8).intern()).append(u0.a).toString());
            boolean b3 = b;
            if (b2 != null) {
                boolean b4;
                if (u0.b == null) {
                    b4 = this.b(u0, b2);
                }
                else {
                    b4 = this.a(u0, b2);
                }
                b3 = (b | b4);
            }
            ++i;
            b = b3;
        }
        return b;
    }
    
    public final boolean v() {
        if (Build.getRadioVersion() != null) {
            final String radioVersion = Build.getRadioVersion();
            final byte[] array2;
            final byte[] array = array2 = new byte[7];
            array2[0] = -22;
            array2[1] = -48;
            array2[2] = 105;
            array2[3] = -50;
            array2[4] = -62;
            array2[5] = 114;
            array2[6] = 47;
            c(array, new byte[] { -65, -112, -21, 30, -14, 92, 31, 6 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (radioVersion.equalsIgnoreCase(new String(array, utf_8).intern())) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[18];
                array4[0] = 88;
                array4[1] = 44;
                array4[2] = 69;
                array4[3] = 48;
                array4[4] = -42;
                array4[5] = 81;
                array4[6] = 103;
                array4[7] = 5;
                array4[8] = -39;
                array4[9] = 82;
                array4[10] = -81;
                array4[11] = -34;
                array4[12] = -2;
                array4[13] = -46;
                array4[14] = 88;
                array4[15] = -128;
                array4[16] = -82;
                array4[17] = 37;
                c(array3, new byte[] { -97, 113, -46, -15, 17, 122, -76, 18, 17, 33, 85, 46, -48, -110, -85, -122, -57, 74 });
                final String intern = new String(array3, utf_8).intern();
                final byte[] array6;
                final byte[] array5 = array6 = new byte[7];
                array6[0] = -71;
                array6[1] = 37;
                array6[2] = -120;
                array6[3] = -110;
                array6[4] = 8;
                array6[5] = -32;
                array6[6] = 2;
                c(array5, new byte[] { 108, 61, -54, -38, 56, -50, 50, 20 });
                this.b(intern, new String(array5, utf_8).intern());
                return true;
            }
        }
        return false;
    }
    
    public final boolean w() {
        final String serial = Build.SERIAL;
        if (serial != null) {
            final String lowerCase = serial.toLowerCase(Locale.ENGLISH);
            final byte[] array2;
            final byte[] array = array2 = new byte[3];
            array2[0] = 95;
            array2[1] = 127;
            array2[2] = 117;
            c(array, new byte[] { 49, 16, 13, 40, 96, -84, -77, 54 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (lowerCase.contains((CharSequence)new String(array, utf_8).intern())) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[19];
                array4[0] = -39;
                array4[1] = 66;
                array4[2] = -106;
                array4[3] = 8;
                array4[4] = 77;
                array4[5] = 126;
                array4[6] = -38;
                array4[7] = 29;
                array4[8] = -112;
                array4[9] = 2;
                array4[10] = 112;
                array4[11] = 20;
                array4[12] = 33;
                array4[13] = 74;
                array4[14] = -63;
                array4[15] = -1;
                array4[16] = -52;
                array4[17] = 92;
                array4[18] = -120;
                c(array3, new byte[] { 30, 88, 109, 8, -102, 46, 33, -11, 88, -111, -107, 25, -73, 100, 86, 16, -91, 61, -28 });
                final String intern = new String(array3, utf_8).intern();
                final byte[] array6;
                final byte[] array5 = array6 = new byte[3];
                array6[0] = -22;
                array6[1] = 9;
                array6[2] = -41;
                c(array5, new byte[] { -124, 102, -81, -89, -108, 82, -57, -114 });
                this.c(intern, new String(array5, utf_8).intern());
                return true;
            }
        }
        return false;
    }
    
    public final boolean x() {
        final ArrayList list = (ArrayList)new p0().a();
        if (!list.isEmpty()) {
            final byte[] array2;
            final byte[] array = array2 = new byte[18];
            array2[0] = -19;
            array2[1] = 120;
            array2[2] = -110;
            array2[3] = -115;
            array2[4] = 111;
            array2[5] = 95;
            array2[6] = -70;
            array2[7] = 53;
            array2[8] = 40;
            array2[9] = 34;
            array2[10] = -21;
            array2[11] = -74;
            array2[12] = -77;
            array2[13] = 6;
            array2[14] = -39;
            array2[15] = -76;
            array2[16] = 45;
            array2[17] = -96;
            c(array, new byte[] { -14, 14, 97, -109, 120, 8, 65, -19, -96, 110, 41, 118, 37, -74, 56, 118, 67, -60 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            this.c(new String(array, utf_8).intern(), ((p0.a)list.get(0)).i);
            final byte[] array4;
            final byte[] array3 = array4 = new byte[17];
            array4[0] = -86;
            array4[1] = 115;
            array4[2] = 89;
            array4[3] = 123;
            array4[4] = -121;
            array4[5] = -102;
            array4[6] = 118;
            array4[7] = 122;
            array4[8] = 77;
            array4[9] = -43;
            array4[10] = -14;
            array4[11] = -62;
            array4[12] = -122;
            array4[13] = -54;
            array4[14] = 17;
            array4[15] = -62;
            array4[16] = 95;
            c(array3, new byte[] { 40, 0, -96, -72, 111, -19, -98, -75, -110, -89, 52, 87, 69, -34, -22, 72, 58 });
            this.a(new String(array3, utf_8).intern(), ((p0.a)list.get(0)).m());
            return true;
        }
        return false;
    }
    
    public final boolean y() {
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = 2;
        array2[1] = -65;
        array2[2] = 26;
        array2[3] = 122;
        array2[4] = 35;
        array2[5] = 127;
        array2[6] = 8;
        array2[7] = 1;
        array2[8] = 25;
        array2[9] = 10;
        array2[10] = 66;
        array2[11] = -38;
        c(array, new byte[] { -119, -36, -2, -77, -92, 67, 23, 12, -56, -103, -57, 79 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[11];
        array4[0] = -54;
        array4[1] = -56;
        array4[2] = 124;
        array4[3] = -51;
        array4[4] = -33;
        array4[5] = 92;
        array4[6] = 20;
        array4[7] = 26;
        array4[8] = -19;
        array4[9] = 57;
        array4[10] = -104;
        c(array3, new byte[] { 13, -34, -117, 76, -24, 7, -23, 9, -125, 77, -21 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[6];
        array6[0] = 30;
        array6[1] = 64;
        array6[2] = -79;
        array6[3] = 76;
        array6[4] = 102;
        array6[5] = 98;
        c(array5, new byte[] { -76, 79, 76, -41, 21, 4, -15, -17 });
        return this.a(intern, intern2, new String(array5, utf_8).intern());
    }
    
    public final boolean z() {
        final String[] k = m0.K;
        final int length = k.length;
        int n = 0;
    Label_0503_Outer:
        while (true) {
            if (n >= length) {
                return false;
            }
            final File file = new File(k[n]);
            while (true) {
                try {
                    if (file.exists() && file.isDirectory()) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[20];
                        array2[0] = -61;
                        array2[1] = 127;
                        array2[2] = -52;
                        array2[3] = -115;
                        array2[4] = 104;
                        array2[5] = -88;
                        array2[6] = 47;
                        array2[7] = 9;
                        array2[8] = -93;
                        array2[9] = 104;
                        array2[10] = -118;
                        array2[11] = 53;
                        array2[12] = 3;
                        array2[13] = 50;
                        array2[14] = -7;
                        array2[15] = 71;
                        array2[16] = 63;
                        array2[17] = 65;
                        array2[18] = 74;
                        array2[19] = -104;
                        c(array, new byte[] { 4, 5, 91, -109, 103, -45, -52, 30, 43, 55, -120, -8, -43, 79, 25, -59, -121, 91, -33, -114 });
                        final Charset utf_8 = StandardCharsets.UTF_8;
                        final String intern = new String(array, utf_8).intern();
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[10];
                        array4[0] = -110;
                        array4[1] = -74;
                        array4[2] = -13;
                        array4[3] = 19;
                        array4[4] = -89;
                        array4[5] = -70;
                        array4[6] = 115;
                        array4[7] = -111;
                        array4[8] = 90;
                        array4[9] = -40;
                        c(array3, new byte[] { 116, -56, 16, 19, 24, -36, -124, -112, 49, -85 });
                        this.c(intern, new String(array3, utf_8).intern());
                        return true;
                    }
                    ++n;
                    continue Label_0503_Outer;
                }
                catch (final SecurityException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
