package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.o0;
import com.aheaditec.talsec.security.r1;
import android.view.Window;
import android.app.Activity;
import java.nio.charset.StandardCharsets;
import com.aheaditec.talsec.security.a1;
import android.content.Context;
import com.aheaditec.talsec.security.a;
import com.aheaditec.talsec.security.K;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.J;

public final class Talsec extends TalsecBridge
{
    public static boolean b;
    public static boolean c;
    public static boolean d;
    
    public static void a(final byte[] array, final byte[] array2) {
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
    
    public static void addToWhitelist(final Context context, final String s) {
        if (s != null) {
            final a1 a = a1.a;
            a.a(context);
            a.a(s);
            return;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[27];
        array2[0] = -85;
        array2[1] = -55;
        array2[2] = 114;
        array2[3] = -63;
        array2[4] = 90;
        array2[5] = 48;
        array2[6] = 60;
        array2[7] = 29;
        array2[8] = 46;
        array2[9] = -39;
        array2[10] = 40;
        array2[11] = 10;
        array2[12] = 63;
        array2[13] = 6;
        array2[14] = 96;
        array2[15] = 17;
        array2[16] = 57;
        array2[17] = -63;
        array2[18] = -24;
        array2[19] = -14;
        array2[20] = -128;
        array2[21] = -68;
        array2[22] = 59;
        array2[23] = -13;
        array2[24] = -97;
        array2[25] = -14;
        array2[26] = 55;
        a(array, new byte[] { -28, -40, -5, -62, 36, -121, 67, 108, 56, -28, 55, 67, 69, -105, -8, -105, 63, -27, -78, -87, -50, -52, 63, -97, -13, -98, 25 });
        throw new IllegalArgumentException(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public static void blockScreenCapture(final Activity activity, final boolean b) {
        if (activity.getWindow() != null) {
            final Window window = activity.getWindow();
            boolean d;
            if (b) {
                window.setFlags(8192, 8192);
                d = true;
            }
            else {
                window.clearFlags(8192);
                d = false;
            }
            Talsec.d = d;
            return;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[33];
        array2[0] = 22;
        array2[1] = -74;
        array2[2] = 101;
        array2[3] = -125;
        array2[4] = -70;
        array2[5] = -39;
        array2[6] = -99;
        array2[7] = 90;
        array2[8] = 32;
        array2[9] = -64;
        array2[10] = -23;
        array2[11] = 92;
        array2[12] = -49;
        array2[13] = 111;
        array2[14] = 72;
        array2[15] = 86;
        array2[16] = -49;
        array2[17] = -118;
        array2[18] = -23;
        array2[19] = -87;
        array2[20] = -80;
        array2[21] = -122;
        array2[22] = 65;
        array2[23] = -83;
        array2[24] = -62;
        array2[25] = -102;
        array2[26] = 8;
        array2[27] = -70;
        array2[28] = 105;
        array2[29] = -9;
        array2[30] = -57;
        array2[31] = -96;
        array2[32] = -8;
        a(array, new byte[] { 64, 5, -4, 2, -75, -32, -45, 60, -23, -26, 106, 75, -108, 48, 41, -113, -113, 41, -76, -32, -56, 34, 76, -27, -99, 43, 76, -17, -15, -60, -107, -34, -42 });
        throw new IllegalStateException(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public static boolean isScreenCaptureBlocked() {
        return Talsec.d;
    }
    
    public static boolean isScreenRecordingIncidentCached() {
        return Talsec.b;
    }
    
    public static boolean isScreenshotIncidentCached() {
        return Talsec.c;
    }
    
    public static void onScreenRecordingDetected() {
        final r1 a = TalsecBridge.a;
        if (a != null) {
            a.b();
        }
        else {
            Talsec.b = true;
        }
    }
    
    public static void onScreenshotDetected() {
        final r1 a = TalsecBridge.a;
        if (a != null) {
            a.c();
        }
        else {
            Talsec.c = true;
        }
    }
    
    public static void removeExternalId(final Context context) {
        if (context != null) {
            new o0(context).c();
            return;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[23];
        array2[0] = 13;
        array2[1] = -56;
        array2[2] = -76;
        array2[3] = -61;
        array2[4] = -108;
        array2[5] = -63;
        array2[6] = 50;
        array2[7] = 46;
        array2[8] = 71;
        array2[9] = 43;
        array2[10] = 115;
        array2[11] = -14;
        array2[12] = 30;
        array2[13] = -123;
        array2[14] = -96;
        array2[15] = 114;
        array2[16] = 122;
        array2[17] = -108;
        array2[18] = 44;
        array2[19] = -88;
        array2[20] = 84;
        array2[21] = 90;
        array2[22] = -8;
        a(array, new byte[] { 55, -41, -60, -48, -38, -23, 48, 39, 13, 122, 7, -75, 90, 33, 107, 41, 8, -28, 44, -10, 56, 54, -42 });
        throw new IllegalArgumentException(new String(array, StandardCharsets.UTF_8).intern());
    }
    
    public static void start(final Context context, final TalsecConfig talsecConfig) {
        start(context, talsecConfig, TalsecMode.BACKGROUND);
    }
    
    public static void start(final Context context, final TalsecConfig talsecConfig, final TalsecMode talsecMode) {
        if (context == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[23];
            array2[0] = 29;
            array2[1] = 5;
            array2[2] = -41;
            array2[3] = -89;
            array2[4] = -126;
            array2[5] = -109;
            array2[6] = 79;
            array2[7] = 68;
            array2[8] = 40;
            array2[9] = 106;
            array2[10] = -6;
            array2[11] = -24;
            array2[12] = 55;
            array2[13] = 52;
            array2[14] = -94;
            array2[15] = -35;
            array2[16] = -89;
            array2[17] = -21;
            array2[18] = -18;
            array2[19] = -101;
            array2[20] = -20;
            array2[21] = -53;
            array2[22] = 66;
            a(array, new byte[] { 71, -102, -93, -20, -48, 27, 38, 125, 52, 59, 126, -97, 65, 112, 108, -40, -85, -5, 106, 7, -128, -89, 108 });
            throw new IllegalArgumentException(new String(array, StandardCharsets.UTF_8).intern());
        }
        if (TalsecBridge.a == null && talsecConfig == null) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[29];
            array4[0] = 83;
            array4[1] = 103;
            array4[2] = 48;
            array4[3] = -2;
            array4[4] = -68;
            array4[5] = -92;
            array4[6] = 41;
            array4[7] = -89;
            array4[8] = 101;
            array4[9] = -109;
            array4[10] = -105;
            array4[11] = -54;
            array4[12] = 10;
            array4[13] = 14;
            array4[14] = -28;
            array4[15] = 26;
            array4[16] = 107;
            array4[17] = 94;
            array4[18] = -3;
            array4[19] = 109;
            array4[20] = -22;
            array4[21] = 64;
            array4[22] = -80;
            array4[23] = 4;
            array4[24] = 106;
            array4[25] = -91;
            array4[26] = 29;
            array4[27] = -117;
            array4[28] = 5;
            a(array3, new byte[] { -16, 53, 70, -90, -62, -9, -13, -4, -13, 44, -36, -68, 86, 94, 113, -108, -18, 95, 124, 50, -77, 82, -65, 61, -19, -1, 91, 0, 43 });
            throw new IllegalArgumentException(new String(array3, StandardCharsets.UTF_8).intern());
        }
        if (talsecMode != null) {
            TalsecBridge.a = r1.g.a(context, talsecConfig, talsecMode);
            return;
        }
        final byte[] array6;
        final byte[] array5 = array6 = new byte[27];
        array6[0] = -75;
        array6[1] = -79;
        array6[2] = 12;
        array6[3] = 24;
        array6[4] = -26;
        array6[5] = 107;
        array6[6] = -119;
        array6[7] = -14;
        array6[8] = -23;
        array6[9] = 119;
        array6[10] = 110;
        array6[11] = -12;
        array6[12] = -18;
        array6[13] = -6;
        array6[14] = 97;
        array6[15] = 26;
        array6[16] = -88;
        array6[17] = -3;
        array6[18] = 120;
        array6[19] = -12;
        array6[20] = -72;
        array6[21] = -57;
        array6[22] = -77;
        array6[23] = 7;
        array6[24] = 68;
        array6[25] = -11;
        array6[26] = -66;
        a(array5, new byte[] { -54, 0, 75, -124, 108, 56, -109, -40, 111, 67, -11, -20, 118, -53, -7, -116, -80, -71, 66, -81, -58, 23, -56, -117, 40, -103, -112 });
        throw new IllegalArgumentException(new String(array5, StandardCharsets.UTF_8).intern());
    }
    
    public static void stop() {
        final r1 a = TalsecBridge.a;
        if (a == null) {
            return;
        }
        a.e();
        TalsecBridge.a = null;
        Natives.INSTANCE.stop();
    }
    
    public static void storeExternalId(final Context context, final String s) {
        if (context != null && s != null) {
            new o0(context).d(s);
            return;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[37];
        array2[0] = -39;
        array2[1] = 74;
        array2[2] = -81;
        array2[3] = -112;
        array2[4] = -34;
        array2[5] = 101;
        array2[6] = -12;
        array2[7] = 50;
        array2[8] = 96;
        array2[9] = -50;
        array2[10] = -60;
        array2[11] = -116;
        array2[12] = -2;
        array2[13] = -122;
        array2[14] = -94;
        array2[15] = -43;
        array2[16] = 47;
        array2[17] = -60;
        array2[18] = 0;
        array2[19] = -10;
        array2[20] = 30;
        array2[21] = 58;
        array2[22] = 86;
        array2[23] = 75;
        array2[24] = -30;
        array2[25] = -63;
        array2[26] = -31;
        array2[27] = -67;
        array2[28] = 33;
        array2[29] = -54;
        array2[30] = 17;
        array2[31] = -33;
        array2[32] = -32;
        array2[33] = -80;
        array2[34] = -25;
        array2[35] = 39;
        array2[36] = -63;
        a(array, new byte[] { -125, 85, -85, -3, -92, 77, 106, 43, -8, -21, -50, 2, 111, 34, -78, -64, 42, -43, 86, -40, 99, 74, 31, 67, 117, -33, 120, -30, -22, -41, 94, 24, 119, -11, 117, 100, -17 });
        throw new IllegalArgumentException(new String(array, StandardCharsets.UTF_8).intern());
    }
}
