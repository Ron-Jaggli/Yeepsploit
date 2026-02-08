package com.aheaditec.talsec_security.security.api;

import java.util.concurrent.Executor;
import android.view.WindowManager;
import android.app.Activity;
import androidx.core.content.ContextCompat;
import android.content.Context;
import android.util.Log;
import com.aheaditec.talsec.security.a;
import com.aheaditec.talsec.security.K;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.J;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import java.nio.charset.Charset;
import android.os.Build$VERSION;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import android.app.Activity$ScreenCaptureCallback;

public final class ScreenProtector
{
    public static final ScreenProtector INSTANCE;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final boolean d;
    public static final boolean e;
    public static final Activity$ScreenCaptureCallback f;
    public static final Consumer<Integer> g;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[21];
        array2[0] = 87;
        array2[1] = -64;
        array2[2] = -90;
        array2[3] = -121;
        array2[4] = 113;
        array2[5] = 89;
        array2[6] = -4;
        array2[7] = -124;
        array2[8] = -2;
        array2[9] = 5;
        array2[10] = 116;
        array2[11] = -68;
        array2[12] = -50;
        array2[13] = -58;
        array2[14] = 92;
        array2[15] = -35;
        array2[16] = 127;
        array2[17] = 98;
        array2[18] = 84;
        array2[19] = 44;
        array2[20] = 113;
        a(array, new byte[] { -20, -48, -76, 13, -3, 105, -103, 0, 117, -112, -5, -22, -121, -28, 29, -62, 3, 49, 10, 92, 3 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        c = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[13];
        array4[0] = -95;
        array4[1] = 95;
        array4[2] = -2;
        array4[3] = 57;
        array4[4] = 122;
        array4[5] = 107;
        array4[6] = -38;
        array4[7] = -127;
        array4[8] = 79;
        array4[9] = -80;
        array4[10] = 48;
        array4[11] = -3;
        array4[12] = -53;
        a(array3, new byte[] { -69, 108, 118, 117, 8, 53, -28, 12, 19, 3, 74, -88, -81 });
        b = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[10];
        array6[0] = 8;
        array6[1] = 106;
        array6[2] = -14;
        array6[3] = -101;
        array6[4] = 14;
        array6[5] = -112;
        array6[6] = 119;
        array6[7] = 25;
        array6[8] = -65;
        array6[9] = 59;
        a(array5, new byte[] { 100, 57, 106, 23, 84, 46, -17, -119, -48, 79 });
        a = new String(array5, utf_8).intern();
        INSTANCE = new ScreenProtector();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = true;
        d = (sdk_INT < 34);
        e = (sdk_INT < 35 && b2);
        Object f2;
        if (sdk_INT >= 34) {
            f2 = new ScreenProtector$$ExternalSyntheticLambda0();
        }
        else {
            f2 = null;
        }
        f = (Activity$ScreenCaptureCallback)f2;
        g = (Consumer)new ScreenProtector$$ExternalSyntheticLambda1();
    }
    
    public static final void a() {
        final Function0<Unit> a = (Function0<Unit>)ScreenProtector$a.a;
    }
    
    public static final void a(final Integer n) {
        final byte[] array2;
        final byte[] array = array2 = new byte[5];
        array2[0] = -48;
        array2[1] = -63;
        array2[2] = 77;
        array2[3] = -111;
        array2[4] = -106;
        a(array, new byte[] { -116, -27, 22, -2, -13, -111, 65, -51 });
        Intrinsics.checkNotNullParameter((Object)n, new String(array, StandardCharsets.UTF_8).intern());
        if (n == 1) {
            final Function0<Unit> a = (Function0<Unit>)ScreenProtector$b.a;
        }
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        int n = 0;
        byte[] array3 = null;
        int n2 = 0;
        int n4;
        int n3 = n4 = 0;
        int n5 = 1180709023;
        byte[] array4 = null;
    Label_0402:
        while (true) {
            final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
            final int n7 = n5 >>> 8;
            final int n8 = 1;
            int n9 = 1;
            final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
            final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
            Label_1033: {
                Label_0567: {
                    switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                        default: {
                            break Label_1033;
                        }
                        case 1548321255: {
                            final int length = array.length;
                            final int n11 = 0 - (0 - array.length % 4);
                            if ((length & ~n11) - (~length & n11) <= 0) {
                                n9 = n;
                            }
                            if (n9 != 0) {
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
                            final int n12 = 0 - n4;
                            final int length3 = array4.length;
                            final int n13 = ~n12;
                            final byte b = array4[(length3 | n12) - (0xD8E528C6 & n13 & length3) + ((0xD8E528C6 | n12) & length3)];
                            final int length4 = array4.length;
                            final byte b2 = array3[(length4 ^ n13) + (length4 | n12) * 2 + 1];
                            array4[(length2 | n12) * 2 - (length2 ^ n12)] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                            final int n14 = ~n4 + n4 * 2;
                            final long n15 = lcmp((long)n4, (long)2) >>> 31 & 0x1;
                            if (n15 != 0) {
                                n5 = 986083301;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            n2 = n14;
                            if (n15 != 0) {
                                n2 = n14;
                                continue;
                            }
                            break Label_0567;
                        }
                        case 373627814: {
                            break Label_0402;
                        }
                        case 298177592: {
                            final int length5 = array4.length;
                            final int n16 = 0 - n4;
                            final int a2 = L.a(n, (length5 & 0x2) | N.a(n16, -4, 1, length5), n16 * 3, 1);
                            final byte b3 = array3[a2];
                            final int length6 = array4.length;
                            final int n17 = 0 - n16;
                            final int n18 = n17 | length6;
                            final byte b4 = array3[O.a(n17, 2, n18, length6 ^ n17 ^ n18)];
                            array3[a2] = (byte)((byte)(b4 ^ b3) + (byte)((byte)2 * (byte)(b4 & b3)));
                            n5 = 1565752577;
                            continue;
                        }
                        case -97532338: {
                            final int n19 = array4.length % 4;
                            final long n20 = lcmp((long)n19, (long)1) >>> 31 & 0x1;
                            if (n20 != 0) {
                                n5 = 986083301;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            n2 = n19;
                            if (n20 != 0) {
                                n2 = n19;
                                continue;
                            }
                            break Label_0567;
                        }
                        case -870579640: {
                            final int n21 = n3 - 1 - (n3 | 0xFFFFFFFC);
                            final byte b5 = array3[n21];
                            final int n22 = (b5 & 0x1000000) * (b5 | 0x1000000) + (b5 & 0xFEFFFFFF) * (~b5 & 0x1000000);
                            final int n23 = n3 + 3 + (-1 - n3 | 0xFFFFFFFD);
                            final int n24 = array3[n23] & 0xFF;
                            final int n25 = n24 * (~n24 & 0x10000);
                            final int n26 = ~((0xB46B5CF6 | ~n25 | n22) - ((n25 & 0xB46B5CF6) | n22));
                            final int a3 = K.a(0xF821C5CC & n3, n3, 1, 0xF821C5CD & n3);
                            final int n27 = array3[a3] & 0xFF;
                            final int n28 = n27 * (~n27 & 0x100);
                            final int n29 = array3[n3] & 0xFF;
                            final int n30 = (n28 + n26 - (n28 & n26) & ~n29) + n29;
                            final byte b6 = array4[n21];
                            final int n31 = (b6 & 0x1000000) * (b6 | 0x1000000) + (0xFEFFFFFF & b6) * (~b6 & 0x1000000);
                            final int n32 = array4[n23] & 0xFF;
                            final int n33 = n32 * (~n32 & 0x10000);
                            final int n34 = ~((n31 | (~n33 | 0xAF2F3113)) - ((n33 & 0xAF2F3113) | n31));
                            final int n35 = array4[a3] & 0xFF;
                            final int n36 = n35 * (~n35 & 0x100);
                            final int a4 = J.a(n36, n34, 1, -1 - n36 | -1 - n34);
                            final int n37 = a4 - 1 - (~(array4[n3] & 0xFF) | a4);
                            final int n38 = n30 << (dcmpg((double)n30, Double.NaN) >>> 31);
                            final int n39 = (n38 ^ 0xE715D017) + (n38 & 0xE715D017) * 2;
                            final int n40 = n39 + n37 - (n39 & n37) * 2;
                            array4[n3] = (byte)n40;
                            array4[a3] = (byte)(n40 >>> 8);
                            array4[n23] = (byte)(n40 >>> 16);
                            array4[n21] = (byte)(n40 >>> 24);
                            n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                            final int length7 = array4.length;
                            final int a5 = com.aheaditec.talsec.security.a.a(array4.length, 4, 0, 0);
                            if ((lcmp((long)n3, (long)((length7 & ~a5) * 2 - (length7 ^ a5))) >>> 31 & 0x1) != 0x0) {
                                n5 = 1910359311;
                                n = 0;
                                continue;
                            }
                            n = 0;
                            break Label_1033;
                        }
                        case -2000520841: {
                            final int length8 = array4.length;
                            final int n41 = 0 - (0 - n2);
                            int n42 = n8;
                            if (dcmpg((double)array3[(length8 & ~n41) * 2 - (length8 ^ n41)], Double.NaN) <= -1) {
                                n42 = 0;
                            }
                            if (n42 != 0) {
                                n5 = 1565752577;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            if (n42 == 0) {
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
    
    public final void a(final String s, final int n) {
        final byte[] array2;
        final byte[] array = array2 = new byte[21];
        array2[0] = 61;
        array2[1] = -17;
        array2[2] = -76;
        array2[3] = -81;
        array2[4] = 23;
        array2[5] = 47;
        array2[6] = -126;
        array2[7] = 108;
        array2[8] = -13;
        array2[9] = 123;
        array2[11] = (array2[10] = 107);
        array2[12] = -65;
        array2[13] = -124;
        array2[14] = -1;
        array2[15] = -62;
        array2[16] = 69;
        array2[17] = -21;
        array2[18] = 122;
        array2[19] = 121;
        array2[20] = -46;
        a(array, new byte[] { 82, -66, -62, -11, 91, 124, -69, 40, 106, 78, -8, 29, -40, 38, 123, -49, 9, -72, -8, 46, -96 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[19];
        array4[0] = 79;
        array4[1] = -7;
        array4[2] = 112;
        array4[3] = 3;
        array4[4] = 25;
        array4[5] = 116;
        array4[6] = -124;
        array4[7] = 79;
        array4[8] = -63;
        array4[9] = 62;
        array4[10] = -119;
        array4[11] = -30;
        array4[12] = -18;
        array4[13] = 76;
        array4[14] = -25;
        array4[15] = -16;
        array4[16] = -17;
        array4[17] = 92;
        array4[18] = 10;
        a(array3, new byte[] { -14, -57, 3, -120, 101, 64, -114, 84, -105, 78, -27, -96, 114, 85, 126, -99, -118, 46, 42 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[21];
        array6[0] = 54;
        array6[1] = -59;
        array6[2] = -64;
        array6[3] = 108;
        array6[4] = -46;
        array6[5] = -100;
        array6[6] = 124;
        array6[7] = 83;
        array6[8] = -52;
        array6[9] = -93;
        array6[10] = -100;
        array6[11] = 12;
        array6[12] = 89;
        array6[13] = -56;
        array6[14] = 115;
        array6[15] = 41;
        array6[16] = -30;
        array6[17] = -4;
        array6[18] = -73;
        array6[19] = 109;
        array6[20] = -23;
        a(array5, new byte[] { -1, -43, -117, 25, -89, 46, 8, 73, -112, -77, -98, 120, 6, -77, 22, 121, -107, -40, -127, 106, -55 });
        final String intern3 = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[2];
        array8[0] = -84;
        array8[1] = 7;
        a(array7, new byte[] { -123, 41, 46, -88, -18, 31, -122, 28 });
        Log.e(intern, intern2 + s + intern3 + n + new String(array7, utf_8).intern());
    }
    
    public final void a(final String s, final String s2) {
        final byte[] array2;
        final byte[] array = array2 = new byte[21];
        array2[0] = -17;
        array2[1] = -57;
        array2[2] = -110;
        array2[3] = -33;
        array2[4] = -22;
        array2[5] = 77;
        array2[6] = 121;
        array2[7] = -32;
        array2[8] = -28;
        array2[9] = -68;
        array2[10] = -56;
        array2[11] = -53;
        array2[12] = 105;
        array2[13] = -51;
        array2[14] = -78;
        array2[15] = 100;
        array2[16] = -20;
        array2[17] = 37;
        array2[18] = -59;
        array2[19] = -128;
        array2[20] = 38;
        a(array, new byte[] { -92, -42, -24, -59, 120, 94, 20, -100, 127, 9, -104, -66, 34, -17, -57, 41, 114, 118, -101, 8, 84 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[19];
        array4[0] = 34;
        array4[1] = -39;
        array4[2] = -27;
        array4[3] = -50;
        array4[4] = 61;
        array4[5] = 112;
        array4[6] = -14;
        array4[7] = -115;
        array4[8] = 84;
        array4[9] = 66;
        array4[10] = -85;
        array4[11] = -105;
        array4[12] = -20;
        array4[13] = 77;
        array4[14] = -25;
        array4[15] = 1;
        array4[16] = -124;
        array4[17] = -112;
        array4[18] = -60;
        a(array3, new byte[] { 77, -24, 118, -69, 65, 68, -68, 18, 36, -110, -61, 11, 116, 84, 126, -114, -31, -30, -28 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[20];
        array6[0] = -43;
        array6[1] = 58;
        array6[2] = 27;
        array6[3] = 30;
        array6[4] = -65;
        array6[5] = 54;
        array6[6] = -52;
        array6[7] = 72;
        array6[8] = 75;
        array6[9] = -8;
        array6[10] = -118;
        array6[11] = 121;
        array6[12] = 125;
        array6[13] = 105;
        array6[14] = -79;
        array6[15] = -50;
        array6[16] = -70;
        array6[17] = -78;
        array6[18] = -42;
        array6[19] = 117;
        a(array5, new byte[] { -34, -119, 100, -117, -68, -124, -105, 68, 9, 6, -107, 83, -2, 59, -68, -66, -125, 11, -101, 110 });
        final String intern3 = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[42];
        array8[0] = -99;
        array8[1] = -31;
        array8[2] = -41;
        array8[3] = -57;
        array8[4] = -19;
        array8[5] = 97;
        array8[6] = 71;
        array8[7] = 0;
        array8[8] = -13;
        array8[9] = 104;
        array8[10] = 14;
        array8[11] = -54;
        array8[12] = -34;
        array8[13] = -54;
        array8[14] = 62;
        array8[15] = 71;
        array8[16] = 20;
        array8[17] = 108;
        array8[18] = -6;
        array8[19] = -56;
        array8[20] = 106;
        array8[21] = -118;
        array8[22] = 49;
        array8[23] = -29;
        array8[24] = 27;
        array8[25] = -85;
        array8[26] = 6;
        array8[27] = -94;
        array8[28] = 64;
        array8[29] = -7;
        array8[30] = -99;
        array8[31] = 77;
        array8[32] = -53;
        array8[33] = 78;
        array8[34] = -61;
        array8[35] = 11;
        array8[36] = -110;
        array8[37] = 116;
        array8[38] = -120;
        array8[39] = -43;
        array8[40] = -6;
        array8[41] = 70;
        a(array7, new byte[] { -90, -63, -100, -50, 105, 56, 30, -116, -125, 55, 74, 3, -96, -23, 8, 57, 79, 61, 126, -43, -8, 29, -4, -94, 94, -69, 49, -27, 13, -69, -36, 61, -104, 51, -116, 126, -28, 66, -41, -65, -114, 104 });
        Log.e(intern, intern2 + s + intern3 + s2 + new String(array7, utf_8).intern());
    }
    
    public final boolean a(final Context context) {
        final boolean d = ScreenProtector.d;
        boolean b = false;
        if (d) {
            final ScreenProtector instance = ScreenProtector.INSTANCE;
            final byte[] array2;
            final byte[] array = array2 = new byte[10];
            array2[0] = -106;
            array2[1] = -29;
            array2[2] = 34;
            array2[3] = 99;
            array2[4] = 62;
            array2[5] = -40;
            array2[6] = -46;
            array2[7] = 104;
            array2[8] = -60;
            array2[9] = 17;
            a(array, new byte[] { -50, -80, 58, 31, 68, -26, -117, 25, -85, 101 });
            instance.a(new String(array, StandardCharsets.UTF_8).intern(), 34);
        }
        else {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[40];
            array4[0] = 23;
            array4[1] = -90;
            array4[2] = -103;
            array4[3] = 118;
            array4[4] = -94;
            array4[5] = 9;
            array4[6] = -34;
            array4[7] = 109;
            array4[8] = 21;
            array4[9] = 50;
            array4[10] = 42;
            array4[12] = (array4[11] = 96);
            array4[13] = -67;
            array4[14] = 75;
            array4[15] = 78;
            array4[16] = 67;
            array4[17] = -19;
            array4[18] = 1;
            array4[19] = -113;
            array4[20] = -75;
            array4[21] = 11;
            array4[22] = -128;
            array4[23] = -67;
            array4[24] = 93;
            array4[25] = -68;
            array4[26] = -94;
            array4[27] = 37;
            array4[28] = -55;
            array4[29] = 0;
            array4[30] = 72;
            array4[32] = (array4[31] = -42);
            array4[33] = 113;
            array4[34] = -14;
            array4[35] = 103;
            array4[36] = -30;
            array4[37] = 26;
            array4[38] = 21;
            array4[39] = 86;
            a(array3, new byte[] { 95, -8, -25, 29, -74, -112, -92, 92, 78, -121, 66, 38, -14, -3, 34, 64, 21, -77, 25, -28, -39, -113, -81, 23, -14, 18, -36, 127, -124, 117, -9, -80, 114, 98, -99, 80, -97, 127, 49, 44 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (ContextCompat.checkSelfPermission(context, new String(array3, utf_8).intern()) == 0) {
                b = true;
            }
            else {
                final ScreenProtector instance2 = ScreenProtector.INSTANCE;
                final byte[] array6;
                final byte[] array5 = array6 = new byte[10];
                array6[0] = 30;
                array6[1] = -60;
                array6[2] = 32;
                array6[3] = 60;
                array6[4] = -109;
                array6[5] = -17;
                array6[6] = 71;
                array6[7] = 74;
                array6[8] = -97;
                array6[9] = -30;
                a(array5, new byte[] { 86, -41, 60, 114, -33, -79, 30, 59, -16, -106 });
                final String intern = new String(array5, utf_8).intern();
                final byte[] array8;
                final byte[] array7 = array8 = new byte[40];
                array8[0] = -29;
                array8[1] = 105;
                array8[2] = -121;
                array8[3] = 22;
                array8[4] = -105;
                array8[5] = -36;
                array8[6] = 79;
                array8[7] = -29;
                array8[8] = -107;
                array8[9] = -19;
                array8[10] = -51;
                array8[11] = 102;
                array8[12] = 58;
                array8[13] = -21;
                array8[14] = 127;
                array8[15] = 63;
                array8[16] = 74;
                array8[17] = 121;
                array8[18] = -28;
                array8[19] = -79;
                array8[20] = -25;
                array8[21] = 14;
                array8[22] = -94;
                array8[23] = 121;
                array8[24] = -123;
                array8[25] = -100;
                array8[26] = 16;
                array8[27] = -84;
                array8[28] = -10;
                array8[29] = 59;
                array8[30] = 13;
                array8[31] = -62;
                array8[32] = -70;
                array8[33] = 15;
                array8[34] = 119;
                array8[35] = -42;
                array8[36] = 30;
                array8[37] = -80;
                array8[38] = -113;
                array8[39] = 23;
                a(array7, new byte[] { 107, 55, -51, 125, -31, -27, 21, -26, -50, -72, -87, 36, 60, -56, -10, 110, 14, 71, -76, 14, -117, -118, -47, 83, -70, -13, 45, 8, -115, -82, 50, -91, -50, 124, 32, -97, 51, 21, -56, 107 });
                instance2.a(intern, new String(array7, utf_8).intern());
            }
        }
        return b;
    }
    
    public final boolean b(final Context context) {
        if (ScreenProtector.e) {
            final ScreenProtector instance = ScreenProtector.INSTANCE;
            final byte[] array2;
            final byte[] array = array2 = new byte[13];
            array2[0] = 71;
            array2[1] = 91;
            array2[2] = -70;
            array2[3] = 45;
            array2[4] = 18;
            array2[5] = -105;
            array2[6] = 36;
            array2[7] = 2;
            array2[8] = 51;
            array2[9] = -98;
            array2[10] = 80;
            array2[11] = -103;
            array2[12] = 111;
            a(array, new byte[] { 29, 104, -78, 97, 96, 41, -17, -120, 63, 45, 42, 4, 11 });
            instance.a(new String(array, StandardCharsets.UTF_8).intern(), 35);
        }
        else {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[42];
            array4[0] = 61;
            array4[1] = 127;
            array4[2] = -33;
            array4[3] = 38;
            array4[4] = 116;
            array4[5] = -31;
            array4[6] = 7;
            array4[7] = -5;
            array4[8] = -106;
            array4[9] = -27;
            array4[10] = -39;
            array4[11] = 108;
            array4[12] = 93;
            array4[13] = -91;
            array4[14] = -15;
            array4[15] = -92;
            array4[16] = 12;
            array4[17] = 7;
            array4[18] = -104;
            array4[19] = -57;
            array4[20] = -104;
            array4[21] = -127;
            array4[22] = 16;
            array4[23] = 34;
            array4[24] = -54;
            array4[25] = 33;
            array4[26] = 52;
            array4[27] = -52;
            array4[28] = 14;
            array4[29] = 112;
            array4[30] = -26;
            array4[31] = -13;
            array4[33] = (array4[32] = 73);
            array4[34] = -50;
            array4[35] = -125;
            array4[36] = -124;
            array4[37] = 120;
            array4[38] = -29;
            array4[39] = 38;
            array4[40] = 73;
            array4[41] = -19;
            a(array3, new byte[] { 69, 65, -91, 109, 4, -72, 77, -18, -49, -80, -107, 26, 29, 6, 109, -26, 76, -103, -96, -100, -58, 5, 64, 122, -121, -82, 81, -88, 69, 101, -115, -42, -1, 74, 117, -39, -76, 90, -111, -120, 7, -86 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (ContextCompat.checkSelfPermission(context, new String(array3, utf_8).intern()) == 0) {
                return true;
            }
            final ScreenProtector instance2 = ScreenProtector.INSTANCE;
            final byte[] array6;
            final byte[] array5 = array6 = new byte[13];
            array6[0] = 108;
            array6[1] = -122;
            array6[2] = -50;
            array6[3] = 6;
            array6[4] = 111;
            array6[5] = 14;
            array6[6] = -32;
            array6[7] = 31;
            array6[8] = -35;
            array6[9] = -38;
            array6[10] = -126;
            array6[11] = -38;
            array6[12] = 26;
            a(array5, new byte[] { 8, 21, -89, 124, -13, -113, -86, -122, -95, -23, -41, -63, 126 });
            final String intern = new String(array5, utf_8).intern();
            final byte[] array8;
            final byte[] array7 = array8 = new byte[42];
            array8[0] = -41;
            array8[1] = -72;
            array8[2] = 9;
            array8[3] = 20;
            array8[4] = -98;
            array8[5] = 24;
            array8[6] = -105;
            array8[7] = 49;
            array8[8] = -47;
            array8[9] = 49;
            array8[10] = 45;
            array8[11] = 30;
            array8[12] = 115;
            array8[13] = -60;
            array8[14] = -2;
            array8[15] = -24;
            array8[16] = 73;
            array8[17] = 121;
            array8[18] = -42;
            array8[19] = 15;
            array8[20] = 50;
            array8[21] = -7;
            array8[22] = 72;
            array8[23] = 53;
            array8[24] = 11;
            array8[25] = 48;
            array8[26] = 9;
            array8[27] = -76;
            array8[28] = 49;
            array8[29] = -32;
            array8[30] = 32;
            array8[31] = -24;
            array8[32] = 43;
            array8[33] = -14;
            array8[34] = -43;
            array8[35] = 65;
            array8[36] = 30;
            array8[37] = 18;
            array8[38] = -43;
            array8[39] = 4;
            array8[40] = -95;
            array8[41] = 30;
            a(array7, new byte[] { -97, 6, 88, 127, -38, -95, -35, 56, -118, -124, 73, -116, 3, -25, 119, -102, 15, 71, -30, 100, 96, -35, -9, -114, 72, -97, 68, 16, 76, -43, 79, -65, 93, -48, 122, 27, 58, 112, 123, 102, -17, 89 });
            instance2.a(intern, new String(array7, utf_8).intern());
        }
        return false;
    }
    
    public final void registerScreenCallbacks(final Activity activity) {
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = -97;
        array2[1] = -83;
        array2[2] = -62;
        array2[3] = 70;
        array2[4] = -125;
        array2[5] = -45;
        array2[6] = -30;
        array2[7] = -59;
        a(array, new byte[] { -25, -2, -96, 72, -34, -22, -128, -43 });
        Intrinsics.checkNotNullParameter((Object)activity, new String(array, StandardCharsets.UTF_8).intern());
        if (this.a((Context)activity)) {
            final Activity$ScreenCaptureCallback f = ScreenProtector.f;
            if (f != null) {
                activity.registerScreenCaptureCallback(ContextCompat.getMainExecutor((Context)activity), f);
            }
        }
        if (this.b((Context)activity)) {
            final WindowManager windowManager = activity.getWindowManager();
            final Executor mainExecutor = ContextCompat.getMainExecutor((Context)activity);
            final Consumer<Integer> g = ScreenProtector.g;
            g.accept((Object)windowManager.addScreenRecordingCallback(mainExecutor, (Consumer)g));
        }
    }
    
    public final void unregisterScreenCallbacks(final Activity activity) {
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = 53;
        array2[1] = 111;
        array2[2] = 29;
        array2[3] = 55;
        array2[4] = 45;
        array2[5] = 67;
        array2[6] = -108;
        array2[7] = -119;
        a(array, new byte[] { 61, 60, 83, 119, 68, 90, -54, 9 });
        Intrinsics.checkNotNullParameter((Object)activity, new String(array, StandardCharsets.UTF_8).intern());
        if (this.a((Context)activity)) {
            final Activity$ScreenCaptureCallback f = ScreenProtector.f;
            if (f != null) {
                activity.unregisterScreenCaptureCallback(f);
            }
        }
        if (this.b((Context)activity)) {
            activity.getWindowManager().removeScreenRecordingCallback((Consumer)ScreenProtector.g);
        }
    }
}
