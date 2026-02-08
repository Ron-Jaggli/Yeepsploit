package com.aheaditec.talsec.security;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.gms.common.GoogleApiAvailability;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import java.nio.charset.Charset;
import android.os.Build$VERSION;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import androidx.biometric.BiometricManager;

public class l0
{
    public static final String p;
    public final BiometricManager a;
    public final I0 b;
    public final F0 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[5];
        array2[0] = 30;
        array2[1] = -122;
        array2[2] = 118;
        array2[3] = 71;
        array2[4] = -123;
        a(array, new byte[] { -89, 1, -102, -58, -9, -118, -77, 77 });
        p = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public l0(final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[32];
        array2[0] = -76;
        array2[1] = 69;
        array2[2] = 67;
        array2[3] = -18;
        array2[4] = 83;
        array2[5] = -122;
        array2[6] = -65;
        array2[7] = -24;
        array2[8] = 32;
        array2[9] = -109;
        array2[10] = 68;
        array2[11] = 33;
        array2[12] = -101;
        array2[13] = -19;
        array2[14] = 74;
        array2[15] = 72;
        array2[16] = 89;
        array2[17] = -74;
        array2[18] = -14;
        array2[19] = 60;
        array2[20] = 70;
        array2[21] = -4;
        array2[22] = -96;
        array2[23] = -119;
        array2[24] = 0;
        array2[25] = -33;
        array2[26] = 99;
        array2[27] = -10;
        array2[28] = 83;
        array2[29] = 61;
        array2[30] = 62;
        array2[31] = 93;
        a(array, new byte[] { 57, 93, -47, 34, -104, 26, 85, 101, -76, -27, -60, -18, 86, -88, -49, -61, -110, -51, 74, -54, -71, -84, 77, -82, -19, -125, -104, 29, -93, 120, -7, -4 });
        BiometricManager from = null;
        Label_0857: {
            if (context.checkSelfPermission(new String(array, StandardCharsets.UTF_8).intern()) != 0) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[34];
                array4[0] = 31;
                array4[1] = -115;
                array4[2] = -65;
                array4[3] = 117;
                array4[4] = -6;
                array4[5] = 22;
                array4[6] = -2;
                array4[7] = 73;
                array4[8] = 79;
                array4[9] = -109;
                array4[10] = 110;
                array4[11] = -31;
                array4[12] = 22;
                array4[13] = -99;
                array4[14] = -25;
                array4[15] = -87;
                array4[16] = 95;
                array4[17] = 60;
                array4[18] = -93;
                array4[19] = 94;
                array4[20] = -38;
                array4[21] = -126;
                array4[22] = 82;
                array4[23] = 95;
                array4[24] = 52;
                array4[25] = -10;
                array4[26] = -111;
                array4[27] = 82;
                array4[28] = 31;
                array4[29] = 28;
                array4[30] = 101;
                array4[31] = 117;
                array4[32] = -95;
                array4[33] = 84;
                a(array3, new byte[] { -94, 20, 85, -86, -15, 109, 20, -126, -125, -27, -110, 46, -45, -7, 42, 101, 108, 68, 59, -108, 45, 53, -101, -121, -111, -83, 68, -16, -111, 89, -123, -98, -17, 0 });
                if (context.checkSelfPermission(new String(array3, StandardCharsets.UTF_8).intern()) != 0) {
                    from = null;
                    break Label_0857;
                }
            }
            from = BiometricManager.from(context);
        }
        this.a = from;
        this.b = I0.a(context);
        this.c = new F0(context);
        this.f = this.a(context);
        this.d = this.b(context);
        this.e = this.c(context);
        this.g = this.d(context);
        this.h = this.e(context);
        this.i = Build$VERSION.SECURITY_PATCH;
        this.j = this.g();
        this.k = this.m();
        this.l = this.e();
        this.m = this.t();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[16];
        array6[0] = 6;
        array6[1] = 4;
        array6[2] = 36;
        array6[3] = -37;
        array6[4] = 102;
        array6[5] = 39;
        array6[6] = -27;
        array6[7] = -9;
        array6[8] = 77;
        array6[9] = 51;
        array6[10] = 70;
        array6[11] = -61;
        array6[12] = -71;
        array6[13] = -124;
        array6[14] = 0;
        array6[15] = 81;
        a(array5, new byte[] { -61, -126, -58, 120, 70, 124, 57, 47, -119, 101, -42, 68, 63, 30, 23, -41 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        this.n = this.b(new String(array5, utf_8).intern());
        final byte[] array8;
        final byte[] array7 = array8 = new byte[17];
        array8[0] = 77;
        array8[1] = 46;
        array8[2] = -101;
        array8[3] = -84;
        array8[4] = -83;
        array8[5] = 27;
        array8[6] = -40;
        array8[7] = 52;
        array8[8] = 27;
        array8[9] = 2;
        array8[10] = -125;
        array8[11] = -70;
        array8[12] = 3;
        array8[13] = 36;
        array8[14] = -28;
        array8[15] = -53;
        array8[16] = -32;
        a(array7, new byte[] { -104, 104, 94, 74, 29, 96, 36, -30, -57, -86, -102, 122, -56, 99, 53, 75, -124 });
        this.o = this.b(new String(array7, utf_8).intern());
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = -1003175592;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] array4 = null;
    Label_0332:
        while (true) {
            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
            final int n6 = n >>> 8;
            final int n7 = ~((~n6 | 0xBEB383EC | n5) - ((n6 & 0xBEB383EC) | n5));
            final int n8 = -1171264002 - ((n7 & 0x2) | -130029571 - n7);
            Label_1011: {
                Label_0383: {
                    switch (0xBDD888E4 ^ ~n8 + (n8 | 0x1) * 2) {
                        default: {
                            break Label_1011;
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
                            break Label_0383;
                        }
                        case 1870596681: {
                            break Label_0332;
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
                            break Label_0383;
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
                            break Label_1011;
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
    
    public String a() {
        return this.g;
    }
    
    public final String a(final Context context) {
        final int n = -1;
        while (true) {
            try {
                final ContentResolver contentResolver = context.getContentResolver();
                final byte[] array2;
                final byte[] array = array2 = new byte[11];
                array2[0] = -67;
                array2[1] = -112;
                array2[2] = -16;
                array2[3] = -44;
                array2[4] = 123;
                array2[5] = 30;
                array2[6] = 5;
                array2[7] = -115;
                array2[8] = 63;
                array2[9] = 109;
                array2[10] = 30;
                a(array, new byte[] { 0, 26, 0, 104, 122, 98, 22, -115, 83, 8, 122 });
                final int int1 = Settings$Global.getInt(contentResolver, new String(array, StandardCharsets.UTF_8).intern(), -1);
                String s;
                if (int1 != 0) {
                    if (int1 != 1) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[9];
                        array4[0] = 2;
                        array4[1] = 115;
                        array4[2] = 62;
                        array4[3] = 115;
                        array4[4] = 18;
                        array4[5] = -13;
                        array4[6] = -119;
                        array4[7] = 111;
                        array4[8] = -84;
                        a(array3, new byte[] { -45, 14, -44, -80, -48, -119, -107, -76, -56 });
                        s = new String(array3, StandardCharsets.UTF_8);
                    }
                    else {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[4];
                        array6[0] = -85;
                        array6[1] = 105;
                        array6[2] = 66;
                        array6[3] = -109;
                        a(array5, new byte[] { 59, 37, -63, -112, 36, -97, -82, 109 });
                        s = new String(array5, StandardCharsets.UTF_8);
                    }
                }
                else {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[5];
                    array8[0] = -103;
                    array8[1] = 5;
                    array8[2] = 81;
                    array8[3] = -122;
                    array8[4] = 108;
                    a(array7, new byte[] { 91, -110, -82, -101, 9, 59, -3, 54 });
                    s = new String(array7, StandardCharsets.UTF_8);
                }
                return s.intern();
            }
            catch (final Exception ex) {
                final int int1 = n;
                continue;
            }
            break;
        }
    }
    
    public final String a(String c) {
        try {
            c = C1.c((String)c);
            if (c != null && !((String)c).isEmpty()) {
                return (String)c;
            }
            final byte[] array2;
            final byte[] array = array2 = new byte[4];
            array2[0] = -98;
            array2[1] = 5;
            array2[2] = 57;
            array2[3] = -47;
            a(array, new byte[] { 44, -100, -60, 86, 90, -44, -122, -12 });
            c = new String(array, StandardCharsets.UTF_8);
            return ((String)c).intern();
        }
        catch (final Exception ex) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[5];
            array4[0] = 56;
            array4[1] = -87;
            array4[2] = 53;
            array4[3] = 27;
            array4[4] = 18;
            a(array3, new byte[] { -71, -28, -43, 18, 96, 87, 37, -37 });
            c = new String(array3, StandardCharsets.UTF_8);
            return ((String)c).intern();
        }
    }
    
    public String b() {
        return this.h;
    }
    
    public final String b(String name) {
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[18];
            array2[0] = 58;
            array2[1] = -13;
            array2[2] = -115;
            array2[3] = -43;
            array2[4] = 83;
            array2[5] = -27;
            array2[6] = 127;
            array2[7] = -31;
            array2[8] = 66;
            array2[9] = -122;
            array2[10] = -35;
            array2[11] = -108;
            array2[12] = -105;
            array2[13] = -97;
            array2[14] = -96;
            array2[15] = -55;
            array2[16] = -124;
            array2[17] = 3;
            a(array, new byte[] { -65, -114, -101, 69, -104, -69, -107, 109, -119, 0, 97, -92, 126, -63, 123, 66, -15, 123 });
            return String.valueOf((boolean)Class.forName(new String(array, StandardCharsets.UTF_8).intern()).getMethod(name, (Class<?>[])new Class[0]).invoke((Object)null, new Object[0]));
        }
        catch (final Error error) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[5];
            array4[0] = -29;
            array4[1] = 105;
            array4[2] = 47;
            array4[3] = -24;
            array4[4] = 85;
            a(array3, new byte[] { -30, 37, -45, 37, 39, -98, -97, -111 });
            name = new String(array3, StandardCharsets.UTF_8);
        }
        catch (final Exception ex) {
            final byte[] array6;
            final byte[] array5 = array6 = new byte[5];
            array6[0] = -123;
            array6[1] = 6;
            array6[2] = -95;
            array6[3] = 114;
            array6[4] = -112;
            a(array5, new byte[] { 76, -122, 96, -70, -30, -90, -7, 8 });
            name = new String(array5, StandardCharsets.UTF_8);
            goto Label_0389;
        }
    }
    
    public final boolean b(final Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }
    
    public String c() {
        final BiometricManager a = this.a;
        if (a == null) {
            return null;
        }
        try {
            final int canAuthenticate = a.canAuthenticate(255);
            if (canAuthenticate != 0) {
                if (canAuthenticate != 1) {
                    if (canAuthenticate == 11) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[12];
                        array2[0] = 28;
                        array2[1] = -32;
                        array2[2] = 97;
                        array2[3] = -94;
                        array2[4] = -90;
                        array2[5] = 56;
                        array2[6] = -82;
                        array2[7] = -66;
                        array2[8] = -93;
                        array2[9] = -35;
                        array2[10] = -20;
                        array2[11] = -14;
                        a(array, new byte[] { -82, -94, -67, 97, 15, 72, 82, 78, 43, -89, 59, 49 });
                        return new String(array, StandardCharsets.UTF_8).intern();
                    }
                    if (canAuthenticate != 12) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[5];
                        array4[0] = -65;
                        array4[1] = 64;
                        array4[2] = 120;
                        array4[3] = 63;
                        array4[4] = -71;
                        a(array3, new byte[] { 6, 92, -104, -50, -53, 72, -111, 63 });
                        return new String(array3, StandardCharsets.UTF_8).intern();
                    }
                }
                final byte[] array6;
                final byte[] array5 = array6 = new byte[10];
                array6[0] = 31;
                array6[1] = -22;
                array6[2] = -47;
                array6[3] = -56;
                array6[4] = -73;
                array6[5] = 27;
                array6[6] = 114;
                array6[7] = -114;
                array6[8] = -43;
                array6[9] = 40;
                a(array5, new byte[] { -83, -72, 11, 74, 41, 109, -109, -111, -89, 77 });
                return new String(array5, StandardCharsets.UTF_8).intern();
            }
            final byte[] array8;
            final byte[] array7 = array8 = new byte[6];
            array8[0] = -29;
            array8[1] = -93;
            array8[2] = 4;
            array8[3] = 77;
            array8[4] = -83;
            array8[5] = 0;
            a(array7, new byte[] { -26, -14, 2, -58, -37, 101, 64, 79 });
            return new String(array7, StandardCharsets.UTF_8).intern();
        }
        catch (final SecurityException ex) {
            return null;
        }
    }
    
    public final boolean c(final Context context) {
        boolean b = false;
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final byte[] array2;
            final byte[] array = array2 = new byte[15];
            array2[0] = 57;
            array2[1] = -32;
            array2[2] = 48;
            array2[3] = 8;
            array2[4] = 111;
            array2[5] = -78;
            array2[6] = 54;
            array2[7] = -113;
            array2[8] = 45;
            array2[9] = -49;
            array2[10] = 33;
            array2[11] = -113;
            array2[12] = -17;
            array2[13] = 105;
            array2[14] = -87;
            a(array, new byte[] { -66, -94, -49, 68, 123, -43, -55, -122, -76, -43, -67, -103, -104, 0, -51 });
            if (packageManager.getPackageInfo(new String(array, StandardCharsets.UTF_8).intern(), 128) != null) {
                b = true;
            }
            return b;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return b;
        }
    }
    
    public String d() {
        return this.l;
    }
    
    public final String d(final Context context) {
        final int n = -1;
        while (true) {
            try {
                final ContentResolver contentResolver = context.getContentResolver();
                final byte[] array2;
                final byte[] array = array2 = new byte[9];
                array2[0] = -40;
                array2[1] = 101;
                array2[2] = 33;
                array2[3] = -31;
                array2[4] = -89;
                array2[5] = 43;
                array2[6] = -107;
                array2[7] = -70;
                array2[8] = -84;
                a(array, new byte[] { 29, 38, -25, 44, 20, 109, 110, 112, -55 });
                final int int1 = Settings$Global.getInt(contentResolver, new String(array, StandardCharsets.UTF_8).intern(), -1);
                String s;
                if (int1 != 0) {
                    if (int1 != 1) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[9];
                        array4[0] = -99;
                        array4[1] = -128;
                        array4[2] = -103;
                        array4[3] = -128;
                        array4[4] = 97;
                        array4[5] = -105;
                        array4[6] = -64;
                        array4[7] = 83;
                        array4[8] = -126;
                        a(array3, new byte[] { 52, 0, 111, -122, 99, -20, 92, -45, -26 });
                        s = new String(array3, StandardCharsets.UTF_8);
                    }
                    else {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[4];
                        array6[0] = 111;
                        array6[1] = 64;
                        array6[2] = -48;
                        array6[3] = -53;
                        a(array5, new byte[] { 103, 92, 55, 75, 20, 85, 96, -87 });
                        s = new String(array5, StandardCharsets.UTF_8);
                    }
                }
                else {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[5];
                    array8[0] = 98;
                    array8[1] = 99;
                    array8[2] = -7;
                    array8[3] = -2;
                    array8[4] = 119;
                    a(array7, new byte[] { 96, 48, 7, 18, 18, -43, 35, -88 });
                    s = new String(array7, StandardCharsets.UTF_8);
                }
                return s.intern();
            }
            catch (final Exception ex) {
                final int int1 = n;
                continue;
            }
            break;
        }
    }
    
    public final String e() {
        final byte[] array2;
        final byte[] array = array2 = new byte[23];
        array2[0] = -12;
        array2[1] = 60;
        array2[2] = -121;
        array2[3] = 79;
        array2[4] = 14;
        array2[5] = 60;
        array2[6] = -111;
        array2[7] = 1;
        array2[8] = 102;
        array2[9] = 109;
        array2[10] = -18;
        array2[11] = 48;
        array2[12] = 32;
        array2[13] = 105;
        array2[14] = 3;
        array2[15] = -95;
        array2[16] = -81;
        array2[17] = 15;
        array2[18] = -37;
        array2[19] = 18;
        array2[20] = -72;
        array2[21] = -106;
        array2[22] = -119;
        a(array, new byte[] { -1, 79, -115, -63, -64, 70, 115, 68, 120, 52, 78, -15, -85, 57, 1, 45, 32, -104, 32, 28, -42, -29, -15 });
        return this.a(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public final String e(final Context context) {
        final int n = -1;
        while (true) {
            try {
                final ContentResolver contentResolver = context.getContentResolver();
                final byte[] array2;
                final byte[] array = array2 = new byte[14];
                array2[0] = 81;
                array2[1] = 115;
                array2[2] = 9;
                array2[3] = -100;
                array2[4] = -1;
                array2[5] = -128;
                array2[6] = -31;
                array2[7] = 79;
                array2[8] = 81;
                array2[9] = -100;
                array2[10] = 21;
                array2[11] = -93;
                array2[12] = 78;
                array2[13] = 75;
                a(array, new byte[] { -108, 21, 15, -111, -4, 26, 58, -33, -112, -42, -3, 106, 32, 46 });
                final int int1 = Settings$Global.getInt(contentResolver, new String(array, StandardCharsets.UTF_8).intern(), -1);
                String s;
                if (int1 != 0) {
                    if (int1 != 1) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[9];
                        array4[0] = 112;
                        array4[1] = -57;
                        array4[2] = -69;
                        array4[3] = 105;
                        array4[4] = 115;
                        array4[5] = -80;
                        array4[6] = -55;
                        array4[7] = -44;
                        array4[8] = 122;
                        a(array3, new byte[] { 97, -37, 73, -87, 113, -9, 85, 82, 30 });
                        s = new String(array3, StandardCharsets.UTF_8);
                    }
                    else {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[4];
                        array6[0] = 73;
                        array6[1] = -77;
                        array6[2] = -8;
                        array6[3] = -72;
                        a(array5, new byte[] { -103, -46, 31, 126, 79, -100, 86, 107 });
                        s = new String(array5, StandardCharsets.UTF_8);
                    }
                }
                else {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[5];
                    array8[0] = -82;
                    array8[1] = -124;
                    array8[2] = -52;
                    array8[3] = 36;
                    array8[4] = 103;
                    a(array7, new byte[] { 52, 19, 82, -12, 2, 76, -63, 119 });
                    s = new String(array7, StandardCharsets.UTF_8);
                }
                return s.intern();
            }
            catch (final Exception ex) {
                final int int1 = n;
                continue;
            }
            break;
        }
    }
    
    public String f() {
        return this.j;
    }
    
    public final String g() {
        final byte[] array2;
        final byte[] array = array2 = new byte[24];
        array2[0] = -91;
        array2[1] = -53;
        array2[2] = -27;
        array2[3] = 22;
        array2[4] = -70;
        array2[5] = 44;
        array2[6] = -8;
        array2[7] = 21;
        array2[8] = -127;
        array2[9] = 87;
        array2[10] = -39;
        array2[11] = 101;
        array2[12] = -55;
        array2[13] = -52;
        array2[14] = 13;
        array2[15] = 83;
        array2[16] = 94;
        array2[17] = -125;
        array2[18] = -56;
        array2[19] = 106;
        array2[20] = 114;
        array2[21] = 18;
        array2[22] = 124;
        array2[23] = 103;
        a(array, new byte[] { 46, -36, 35, 9, 44, 117, 26, 88, 87, 42, 101, -86, 24, -45, 19, -47, 44, 2, 95, -95, 127, 110, -101, -79 });
        return this.a(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public boolean h() {
        return this.d;
    }
    
    public boolean i() {
        return this.e;
    }
    
    public String j() {
        return this.f;
    }
    
    public String k() {
        return this.c.a().toString();
    }
    
    public String l() {
        final I0 b = this.b;
        if (b == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[5];
            array2[0] = -107;
            array2[1] = -35;
            array2[2] = 99;
            array2[3] = -53;
            array2[4] = 49;
            a(array, new byte[] { 92, -71, -89, 66, 67, 5, 37, -49 });
            return new String(array, StandardCharsets.UTF_8).intern();
        }
        String s;
        if (b.a()) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[6];
            array4[0] = 93;
            array4[1] = -121;
            array4[2] = 70;
            array4[3] = -20;
            array4[4] = 18;
            array4[5] = -9;
            a(array3, new byte[] { 109, 26, -37, 37, 119, -109, 102, 112 });
            s = new String(array3, StandardCharsets.UTF_8);
        }
        else {
            final byte[] array6;
            final byte[] array5 = array6 = new byte[8];
            array6[0] = -54;
            array6[1] = 57;
            array6[2] = 76;
            array6[3] = 65;
            array6[4] = -57;
            array6[5] = 69;
            array6[6] = 33;
            array6[7] = -22;
            a(array5, new byte[] { 27, 73, -46, -52, 8, 88, -10, 40 });
            s = new String(array5, StandardCharsets.UTF_8);
        }
        return s.intern();
    }
    
    public final String m() {
        final byte[] array2;
        final byte[] array = array2 = new byte[10];
        array2[0] = 60;
        array2[1] = 70;
        array2[2] = 53;
        array2[3] = 25;
        array2[4] = 80;
        array2[5] = 77;
        array2[6] = -107;
        array2[7] = 103;
        array2[8] = 0;
        array2[9] = 29;
        a(array, new byte[] { -121, 86, -45, 30, -102, 92, 104, -72, 99, 120 });
        return this.a(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public final String n() {
        return Build$VERSION.SECURITY_PATCH;
    }
    
    public String o() {
        return this.i;
    }
    
    public String p() {
        return this.n;
    }
    
    public String q() {
        return this.o;
    }
    
    public String r() {
        return this.m;
    }
    
    public String s() {
        return this.k;
    }
    
    public final String t() {
        final byte[] array2;
        final byte[] array = array2 = new byte[23];
        array2[0] = 122;
        array2[1] = 16;
        array2[2] = 97;
        array2[3] = 122;
        array2[4] = 6;
        array2[5] = -98;
        array2[6] = -92;
        array2[7] = 99;
        array2[8] = -43;
        array2[9] = -52;
        array2[10] = 11;
        array2[11] = 99;
        array2[12] = 85;
        array2[13] = -106;
        array2[14] = -122;
        array2[15] = -91;
        array2[16] = 35;
        array2[17] = 19;
        array2[18] = -44;
        array2[19] = -68;
        array2[20] = -6;
        array2[21] = 93;
        array2[22] = 53;
        a(array, new byte[] { 49, -115, -85, -81, -123, -19, 101, -23, 10, -33, 17, -84, -105, -10, -128, 40, -94, 110, 32, 112, -120, 62, 80 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final File file = new File(new String(array, utf_8).intern());
        try {
            final BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader(file));
            try {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    final byte[] array4;
                    final byte[] array3 = array4 = new byte[4];
                    array4[0] = 32;
                    array4[1] = 20;
                    array4[2] = -102;
                    array4[3] = 51;
                    a(array3, new byte[] { -86, 110, 98, -13, -59, 123, -106, -83 });
                    final String intern = new String(array3, utf_8).intern();
                    bufferedReader.close();
                    return intern;
                }
                final byte[] array5 = { 127 };
                a(array5, new byte[] { 79, 83, -65, -49, 82, 37, 112, -14 });
                if (line.contains((CharSequence)new String(array5, utf_8).intern())) {
                    final byte[] array7;
                    final byte[] array6 = array7 = new byte[10];
                    array7[0] = -83;
                    array7[1] = -126;
                    array7[2] = 115;
                    array7[3] = 69;
                    array7[4] = -38;
                    array7[5] = 43;
                    array7[6] = -55;
                    array7[7] = -110;
                    array7[8] = -101;
                    array7[9] = -91;
                    a(array6, new byte[] { 33, 21, -105, -54, 23, 106, 72, -100, -19, -64 });
                    final String intern2 = new String(array6, utf_8).intern();
                    bufferedReader.close();
                    return intern2;
                }
                final byte[] array8 = { 66 };
                a(array8, new byte[] { 115, 7, 78, 26, 117, 79, -58, 52 });
                if (line.contains((CharSequence)new String(array8, utf_8).intern())) {
                    final byte[] array10;
                    final byte[] array9 = array10 = new byte[9];
                    array10[0] = -70;
                    array10[1] = 23;
                    array10[2] = -76;
                    array10[3] = 94;
                    array10[4] = -102;
                    array10[5] = -120;
                    array10[6] = -50;
                    array10[7] = -73;
                    array10[8] = 64;
                    a(array9, new byte[] { 59, 107, 64, -82, 76, 21, 41, 116, 39 });
                    final String intern3 = new String(array9, utf_8).intern();
                    bufferedReader.close();
                    return intern3;
                }
                final byte[] array12;
                final byte[] array11 = array12 = new byte[7];
                array12[0] = -84;
                array12[1] = -33;
                array12[2] = 86;
                array12[3] = 90;
                array12[4] = -61;
                array12[5] = -123;
                array12[6] = 63;
                a(array11, new byte[] { 37, -93, -93, -46, -84, -14, 81, -19 });
                final String intern4 = new String(array11, utf_8).intern();
                bufferedReader.close();
                return intern4;
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
        catch (final IOException ex) {
            final byte[] array14;
            final byte[] array13 = array14 = new byte[5];
            array14[0] = -31;
            array14[1] = 98;
            array14[2] = -34;
            array14[3] = 69;
            array14[4] = -22;
            a(array13, new byte[] { -32, 34, 34, -57, -104, -13, -12, 3 });
            return new String(array13, StandardCharsets.UTF_8).intern();
        }
    }
}
