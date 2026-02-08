package com.aheaditec.talsec.security;

import android.content.Intent;
import android.os.Build$VERSION;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import android.content.Context;
import android.content.IntentFilter;
import com.aheaditec.talsec_security.security.LifecycleObserver;
import android.content.BroadcastReceiver;

public class o1 extends BroadcastReceiver implements b
{
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final IntentFilter j;
    public final P0 a;
    public final i1.a b;
    public final Context c;
    public boolean d;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = 116;
        array2[1] = -35;
        array2[2] = -56;
        array2[3] = -109;
        array2[4] = 1;
        array2[5] = 110;
        array2[6] = 106;
        array2[7] = -114;
        array2[8] = -39;
        array2[9] = 3;
        array2[10] = -122;
        array2[11] = 109;
        a(array, new byte[] { 89, -120, 110, -65, -22, 21, -125, -93, 41, -80, -93, -118 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        i = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[11];
        array4[0] = -45;
        array4[1] = -31;
        array4[2] = -28;
        array4[3] = -98;
        array4[4] = 116;
        array4[5] = -74;
        array4[6] = 92;
        array4[7] = -23;
        array4[8] = 70;
        array4[9] = 29;
        array4[10] = -75;
        a(array3, new byte[] { 54, -116, 2, 72, 87, -22, -111, 14, 30, 88, -10 });
        h = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[9];
        array6[0] = 74;
        array6[2] = (array6[1] = -128);
        array6[3] = 59;
        array6[4] = -101;
        array6[5] = -37;
        array6[6] = 86;
        array6[7] = -54;
        array6[8] = -98;
        a(array5, new byte[] { -81, 46, -90, -44, 112, -121, -105, 100, -36 });
        g = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[30];
        array8[0] = -119;
        array8[1] = 53;
        array8[2] = 62;
        array8[3] = 60;
        array8[4] = -24;
        array8[5] = -120;
        array8[6] = 68;
        array8[7] = 88;
        array8[8] = -64;
        array8[9] = 127;
        array8[10] = -44;
        array8[11] = -52;
        array8[12] = -102;
        array8[13] = 87;
        array8[14] = -67;
        array8[15] = -97;
        array8[16] = 57;
        array8[17] = 87;
        array8[18] = -124;
        array8[19] = -9;
        array8[20] = -99;
        array8[21] = -60;
        array8[22] = 56;
        array8[23] = -113;
        array8[24] = 74;
        array8[25] = 33;
        array8[26] = -67;
        array8[27] = -49;
        array8[28] = 60;
        array8[29] = 124;
        a(array7, new byte[] { 78, 76, -35, -80, -21, 25, -39, -35, 8, 8, 104, 97, 81, 49, 70, 100, -76, 39, -105, 45, 40, -35, -60, -94, -117, 124, 89, 91, 95, 25 });
        f = new String(array7, utf_8).intern();
        final byte[] array10;
        final byte[] array9 = array10 = new byte[2];
        array10[0] = -126;
        array10[1] = 18;
        a(array9, new byte[] { -54, 80, 124, -39, -106, 64, -31, 97 });
        e = new String(array9, utf_8).intern();
        final byte[] array12;
        final byte[] array11 = array12 = new byte[30];
        array12[0] = 118;
        array12[1] = -110;
        array12[2] = -32;
        array12[3] = 43;
        array12[4] = 73;
        array12[5] = -17;
        array12[6] = -54;
        array12[7] = 77;
        array12[8] = -26;
        array12[9] = -41;
        array12[10] = 54;
        array12[11] = 53;
        array12[12] = 64;
        array12[13] = -4;
        array12[14] = 123;
        array12[15] = -83;
        array12[16] = 102;
        array12[17] = -20;
        array12[18] = -88;
        array12[19] = 29;
        array12[20] = -118;
        array12[21] = -54;
        array12[22] = -79;
        array12[23] = -49;
        array12[24] = -119;
        array12[25] = -30;
        array12[26] = 35;
        array12[27] = -16;
        array12[28] = 12;
        array12[29] = 100;
        a(array11, new byte[] { 121, -17, 63, -96, -118, -77, 83, -41, -26, -96, -122, -39, -117, -99, -124, 105, 99, -71, 123, -12, 71, -41, 77, 97, 72, -94, -29, 59, 111, 1 });
        j = new IntentFilter(new String(array11, utf_8).intern());
    }
    
    public o1(final Context c, final P0 a, final i1.a b) {
        this.d = false;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
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
    
    public void a() {
        this.b.c();
        this.a(this.c);
    }
    
    public final void a(Context applicationContext) {
        synchronized (this) {
            if (!this.d) {
                applicationContext = applicationContext.getApplicationContext();
                if (applicationContext != null) {
                    if (Build$VERSION.SDK_INT >= 33) {
                        applicationContext.registerReceiver((BroadcastReceiver)this, o1.j, 4);
                    }
                    else {
                        applicationContext.registerReceiver((BroadcastReceiver)this, o1.j);
                    }
                    this.d = true;
                }
            }
        }
    }
    
    public final void a(final String s) {
        final byte[] array2;
        final byte[] array = array2 = new byte[2];
        array2[0] = 28;
        array2[1] = 57;
        a(array, new byte[] { 84, 123, -41, -100, 10, -108, 118, 79 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (s.equals((Object)new String(array, utf_8).intern())) {
            this.a.a();
        }
        else {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[2];
            array4[0] = -54;
            array4[1] = 1;
            a(array3, new byte[] { -126, 67, -124, -93, -48, -111, -117, 25 });
            new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[30];
            array6[0] = 66;
            array6[1] = 29;
            array6[2] = -25;
            array6[3] = 60;
            array6[4] = 28;
            array6[5] = -119;
            array6[6] = 93;
            array6[7] = 116;
            array6[8] = 100;
            array6[9] = 20;
            array6[10] = 14;
            array6[11] = -95;
            array6[12] = 43;
            array6[13] = 54;
            array6[14] = -29;
            array6[15] = 94;
            array6[16] = 35;
            array6[17] = -28;
            array6[18] = -122;
            array6[19] = -115;
            array6[20] = -126;
            array6[21] = -54;
            array6[22] = -47;
            array6[23] = -26;
            array6[24] = -54;
            array6[25] = -88;
            array6[26] = -14;
            array6[27] = -70;
            array6[28] = 110;
            array6[29] = 51;
            a(array5, new byte[] { -77, 100, 50, -15, -81, 1, -95, -10, 64, 64, -96, 110, -86, 80, 38, -96, -96, -76, -40, -99, 67, -37, 38, 32, 24, -13, 0, 51, 64, 29 });
            new String(array5, utf_8).intern();
        }
    }
    
    public void b() {
        this.b(this.c);
    }
    
    public void b(Context applicationContext) {
        monitorenter(this);
        Label_0034: {
            if (applicationContext == null) {
                break Label_0034;
            }
            try {
                if (this.d) {
                    applicationContext = applicationContext.getApplicationContext();
                    if (applicationContext != null) {
                        applicationContext.unregisterReceiver((BroadcastReceiver)this);
                        this.d = false;
                    }
                }
                this.a.i();
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 49;
            array2[1] = 16;
            array2[2] = 61;
            array2[3] = -104;
            array2[4] = -94;
            array2[5] = 90;
            array2[6] = -38;
            array2[7] = -89;
            array2[8] = 64;
            a(array, new byte[] { -108, -66, -6, -77, 9, 6, 19, 66, 2 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (intent.hasExtra(new String(array, utf_8).intern())) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[9];
                array4[0] = 74;
                array4[1] = 103;
                array4[2] = -121;
                array4[3] = -61;
                array4[4] = 48;
                array4[5] = -105;
                array4[6] = 28;
                array4[7] = 69;
                array4[8] = -15;
                a(array3, new byte[] { -81, 23, -83, 108, -101, -54, -47, -17, -77 });
                final String stringExtra = intent.getStringExtra(new String(array3, utf_8).intern());
                if (stringExtra != null) {
                    this.a(stringExtra);
                }
            }
            else {
                final byte[] array6;
                final byte[] array5 = array6 = new byte[11];
                array6[0] = -86;
                array6[1] = -125;
                array6[2] = 86;
                array6[3] = 32;
                array6[4] = 46;
                array6[5] = -39;
                array6[6] = 118;
                array6[7] = -50;
                array6[8] = 115;
                array6[9] = 111;
                array6[10] = 94;
                a(array5, new byte[] { 15, 50, -100, -53, -99, -120, -73, 117, 43, 42, 29 });
                if (intent.hasExtra(new String(array5, utf_8).intern())) {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[11];
                    array8[0] = -16;
                    array8[1] = 61;
                    array8[2] = -89;
                    array8[3] = 11;
                    array8[4] = 105;
                    array8[5] = 80;
                    array8[6] = -37;
                    array8[7] = -118;
                    array8[8] = 106;
                    array8[9] = -111;
                    array8[10] = -63;
                    a(array7, new byte[] { -43, 104, 77, 39, 66, 112, 18, -88, 50, -44, -126 });
                    final String stringExtra2 = intent.getStringExtra(new String(array7, utf_8).intern());
                    if (stringExtra2 != null) {
                        this.a.a(stringExtra2);
                    }
                }
                else {
                    final byte[] array10;
                    final byte[] array9 = array10 = new byte[12];
                    array10[0] = -50;
                    array10[1] = -18;
                    array10[2] = -89;
                    array10[3] = 30;
                    array10[4] = -92;
                    array10[5] = 91;
                    array10[6] = 52;
                    array10[7] = -127;
                    array10[8] = 53;
                    array10[9] = 102;
                    array10[10] = -25;
                    array10[11] = 84;
                    a(array9, new byte[] { 51, -97, 77, -56, 7, 7, -7, -80, -115, 18, 13, -14 });
                    if (intent.hasExtra(new String(array9, utf_8).intern())) {
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[12];
                        array12[0] = 106;
                        array12[1] = -42;
                        array12[2] = -19;
                        array12[3] = -38;
                        array12[4] = 76;
                        array12[5] = 115;
                        array12[6] = -46;
                        array12[7] = -85;
                        array12[8] = 48;
                        array12[9] = 90;
                        array12[10] = -104;
                        array12[11] = -66;
                        a(array11, new byte[] { 79, -121, 11, 116, -65, 46, 27, 93, -128, 6, 94, 100 });
                        final String stringExtra3 = intent.getStringExtra(new String(array11, utf_8).intern());
                        if (stringExtra3 != null) {
                            final byte[] array14;
                            final byte[] array13 = array14 = new byte[2];
                            array14[0] = 46;
                            array14[1] = -76;
                            a(array13, new byte[] { 108, -13, -44, -48, -21, 9, -76, 74 });
                            if (stringExtra3.equals((Object)new String(array13, utf_8).intern())) {
                                this.b(context);
                            }
                        }
                    }
                }
            }
        }
    }
}
