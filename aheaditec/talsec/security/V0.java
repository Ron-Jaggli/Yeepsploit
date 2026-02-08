package com.aheaditec.talsec.security;

import java.net.BindException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.Process;
import dalvik.system.DexClassLoader;
import java.io.File;
import kotlin.random.Random$Default;
import com.aheaditec.talsec_security.security.Natives;
import kotlin.collections.ArraysKt;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager$ApplicationInfoFlags;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.util.Random;
import java.io.Closeable;
import android.content.Context;
import java.util.Enumeration;
import java.io.IOException;
import dalvik.system.DexFile;
import java.util.HashSet;
import java.util.Set;
import android.content.pm.ApplicationInfo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class v0 extends j
{
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] J;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final byte[] S;
    public static final byte[] T;
    public static final byte[] U;
    public static final byte[] V;
    public static final byte[] W;
    public static final byte[] X;
    public static final byte[] Y;
    public static final byte[] Z;
    public static final byte[] a0;
    public static final byte[] b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final byte[] z;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = 81;
        array2[1] = -116;
        array2[2] = -123;
        array2[3] = 2;
        array2[4] = -94;
        array2[5] = -30;
        array2[6] = -25;
        array2[7] = -27;
        c(array, new byte[] { 120, -115, -53, 25, -87, -94, -26, -118 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        y = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[12];
        array4[0] = 109;
        array4[1] = 85;
        array4[2] = -82;
        array4[3] = -118;
        array4[4] = -74;
        array4[5] = -48;
        array4[6] = 96;
        array4[7] = -54;
        array4[8] = -82;
        array4[9] = 100;
        array4[10] = 56;
        array4[11] = -122;
        c(array3, new byte[] { 47, 11, -39, -46, -36, -117, 73, -91, -13, -35, 107, -56 });
        x = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[11];
        array6[0] = 27;
        array6[1] = 66;
        array6[2] = -47;
        array6[3] = 108;
        array6[4] = -22;
        array6[5] = 121;
        array6[6] = -101;
        array6[7] = -14;
        array6[8] = -85;
        array6[9] = -81;
        array6[10] = 48;
        c(array5, new byte[] { -113, -2, -45, 6, -90, -6, 4, 104, -50, -50, 93 });
        w = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[34];
        array8[0] = -48;
        array8[1] = -111;
        array8[2] = -8;
        array8[3] = 23;
        array8[4] = -32;
        array8[5] = 64;
        array8[6] = 19;
        array8[7] = -51;
        array8[8] = 84;
        array8[9] = 119;
        array8[10] = -108;
        array8[11] = 2;
        array8[12] = -72;
        array8[13] = 117;
        array8[14] = 4;
        array8[15] = 104;
        array8[16] = -2;
        array8[17] = -27;
        array8[18] = 93;
        array8[19] = 127;
        array8[20] = -93;
        array8[21] = 10;
        array8[22] = 48;
        array8[23] = 18;
        array8[24] = -11;
        array8[25] = 23;
        array8[26] = 18;
        array8[27] = 60;
        array8[28] = 54;
        array8[29] = -97;
        array8[30] = 109;
        array8[31] = 20;
        array8[32] = -17;
        array8[33] = 25;
        c(array7, new byte[] { 22, -77, -105, 75, -85, -11, -109, -55, 73, -43, 10, 87, -12, -46, -128, 1, -84, -102, 27, -10, -29, 73, 107, 93, -50, 53, -111, 63, 104, -54, 89, 101, -114, 107 });
        v = new String(array7, utf_8).intern();
        final byte[] array10;
        final byte[] array9 = array10 = new byte[24];
        array10[0] = -7;
        array10[1] = -71;
        array10[2] = 120;
        array10[3] = -101;
        array10[4] = -3;
        array10[5] = -46;
        array10[6] = -63;
        array10[7] = -13;
        array10[8] = 11;
        array10[9] = -14;
        array10[10] = -6;
        array10[11] = 15;
        array10[12] = 67;
        array10[13] = -100;
        array10[14] = 45;
        array10[15] = 59;
        array10[16] = -37;
        array10[17] = -72;
        array10[18] = -120;
        array10[19] = -71;
        array10[20] = 3;
        array10[21] = -79;
        array10[22] = 36;
        array10[23] = 55;
        c(array9, new byte[] { -89, -102, 54, -46, -87, 113, -70, 126, 116, 103, -98, 99, 65, -61, 89, 97, -60, -87, -9, -68, 121, -93, 94, 57 });
        u = new String(array9, utf_8).intern();
        final byte[] array12;
        final byte[] array11 = array12 = new byte[15];
        array12[0] = -109;
        array12[1] = 19;
        array12[2] = 107;
        array12[3] = -69;
        array12[4] = -56;
        array12[5] = -92;
        array12[6] = 76;
        array12[7] = -73;
        array12[8] = -53;
        array12[9] = -75;
        array12[10] = 116;
        array12[11] = 97;
        array12[12] = 88;
        array12[13] = -8;
        array12[14] = -23;
        c(array11, new byte[] { 7, 76, 36, -65, -70, -78, 84, -67, -67, -96, 25, -11, 42, -109, -102 });
        t = new String(array11, utf_8).intern();
        final byte[] array14;
        final byte[] array13 = array14 = new byte[18];
        array14[0] = -101;
        array14[1] = -128;
        array14[2] = 115;
        array14[3] = -49;
        array14[4] = 51;
        array14[5] = -7;
        array14[6] = -115;
        array14[7] = 75;
        array14[8] = 18;
        array14[9] = 121;
        array14[10] = -80;
        array14[11] = -2;
        array14[12] = -114;
        array14[13] = -61;
        array14[14] = 94;
        array14[15] = 36;
        array14[16] = -48;
        array14[17] = 45;
        c(array13, new byte[] { 15, -71, 44, -109, 111, -121, 2, 39, -110, -33, -22, -102, 2, -120, 76, 50, -76, 94 });
        s = new String(array13, utf_8).intern();
        final byte[] array16;
        final byte[] array15 = array16 = new byte[37];
        array16[0] = 122;
        array16[1] = -109;
        array16[2] = 83;
        array16[3] = 18;
        array16[4] = 95;
        array16[5] = 93;
        array16[6] = -60;
        array16[7] = -82;
        array16[8] = -38;
        array16[9] = -48;
        array16[10] = 81;
        array16[11] = -122;
        array16[12] = -89;
        array16[13] = 68;
        array16[14] = 105;
        array16[15] = -78;
        array16[16] = -75;
        array16[17] = 21;
        array16[18] = -15;
        array16[19] = 10;
        array16[20] = -48;
        array16[21] = 100;
        array16[22] = 96;
        array16[23] = -11;
        array16[24] = -35;
        array16[25] = 57;
        array16[26] = -38;
        array16[27] = -25;
        array16[28] = 33;
        array16[29] = 104;
        array16[30] = 102;
        array16[31] = -55;
        array16[32] = -29;
        array16[33] = -98;
        array16[34] = -31;
        array16[35] = 58;
        array16[36] = 42;
        c(array15, new byte[] { 53, -58, 61, 94, 83, -7, -84, -83, -46, 114, 74, -55, -1, -10, 24, -88, 11, 76, -85, 39, -56, -26, 40, -96, -55, 40, -44, 105, 92, -15, 29, 107, -99, -61, -92, 47, 83 });
        r = new String(array15, utf_8).intern();
        final byte[] array18;
        final byte[] array17 = array18 = new byte[15];
        array18[0] = -39;
        array18[1] = 96;
        array18[2] = 94;
        array18[3] = -45;
        array18[4] = -66;
        array18[5] = 72;
        array18[6] = 84;
        array18[7] = 114;
        array18[8] = -55;
        array18[9] = -94;
        array18[10] = 74;
        array18[11] = -54;
        array18[12] = -45;
        array18[13] = -29;
        array18[14] = 21;
        c(array17, new byte[] { -47, -40, 80, -105, -20, -21, 53, -6, -63, -103, 52, -97, -78, -128, 112 });
        q = new String(array17, utf_8).intern();
        p = "v0";
        z = new byte[] { -41, 9, -18, 78, -123, 19, 114, -84, -61, 106, 51, -76, 124, -95, -106, -58, 119, -28, -114, -98, -58, -91, -118, 116, -92, -54, -66, 72, -115, 27, 71, -94 };
        A = new byte[] { -125, 123, -101, 11 };
        B = new byte[] { -79, 72, -126, 29, -32 };
        C = new byte[] { -77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 29, -54, -71, -54, 41, -31, 119, 34, -48 };
        D = new byte[] { -76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5 };
        E = new byte[] { -76, 102, -125, 96, -28, 125, 22, -34, -84, 3, 87, -102, 21, -49, -30, -93, 5, -118, -17, -14, -24, -54, -7, 90, -2, -77, -39, 39, -7, 126, 14, -52, -66, 125 };
        F = new byte[] { -76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5, -24, -24, -39, 80, -106 };
        G = new byte[] { -66, 103, -104, 33, -18, 118, 22 };
        H = new byte[] { -77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 44, -44, -91, -51, 45, -23, 89, 53, -53, -77, 110, -117 };
        I = new byte[] { -70, 104, -121, 32 };
        J = new byte[] { -65, 104, -128, 42, -23, 118, 58, -61, -84, 1, 86, -48, 49, -60, -30, -82, 24, -128 };
        K = new byte[] { -113, 121, -127, 61, -32, 119, 48, -34, -86, 14, 84, -47, 82, -53, -9, -76 };
        L = new byte[] { -74 };
        M = new byte[] { -75 };
        N = new byte[] { -76 };
        O = new byte[] { -77 };
        P = new byte[] { -78 };
        Q = new byte[] { -79 };
        R = new byte[] { -80 };
        S = new byte[] { -65 };
        T = new byte[] { -66 };
        U = new byte[] { -67 };
        V = new byte[] { -69 };
        W = new byte[] { -83 };
        X = new byte[] { -82 };
        Y = new byte[] { -81 };
        Z = new byte[] { -92, 125, -113, 60, -15 };
        a0 = new byte[] { -92, 125, -127, 62 };
        b0 = new byte[] { -70 };
        c0 = new byte[] { -71 };
        d0 = new byte[] { -72 };
    }
    
    public v0(final R0 r0, final u1 u1, final E1 e1) {
        super(r0, u1, e1);
    }
    
    private static void c(final byte[] array, final byte[] array2) {
        int n = 0;
        byte[] array3 = null;
        int n2 = 0;
        int a = 0;
        int n3 = a = 0;
        int n4 = 1516727821;
        byte[] array4 = null;
    Label_0498:
        while (true) {
            final int n5 = (n4 & 0x1000000) * (n4 | 0x1000000) + (n4 & 0xFEFFFFFF) * (~n4 & 0x1000000);
            final int n6 = n4 >>> 8;
            final int a2 = com.aheaditec.talsec.security.K.a(0x26CC2060 & ~n5 & n6, n6, n5, (n5 | 0x26CC2060) & n6);
            final int n7 = (a2 ^ 0x264C5215) + (a2 & 0x264C5215) * 2;
            final int n8 = 1;
            final int n9 = 1;
            Label_1062: {
                Label_1050: {
                    int n15 = 0;
                    switch (~n7 + (n7 | 0x1) * 2 ^ 0x3962F1EF) {
                        default: {
                            n4 = -365117735;
                            continue;
                        }
                        case 961838909: {
                            final int length = array4.length;
                            final int n10 = 0 - a;
                            int n11 = n9;
                            if (dcmpg((double)array3[(length | n10) - (0x9DAB291 & ~n10 & length) + ((n10 | 0x9DAB291) & length)], Double.NaN) <= -1) {
                                n11 = n;
                            }
                            if (n11 != 0) {
                                n4 = -365117735;
                            }
                            else {
                                n4 = 1093626513;
                            }
                            if (n11 != 0) {
                                n4 = -746753280;
                            }
                            n2 = a;
                            continue;
                        }
                        case 511524454: {
                            final int length2 = array4.length;
                            final int n12 = 0 - n2;
                            final int n13 = 0 - n12;
                            final int length3 = array4.length;
                            final byte b = array4[(length3 | n12) * 2 - (length3 ^ n12)];
                            final int length4 = array4.length;
                            final byte b2 = array3[(n12 ^ length4) + (length4 & n12) * 2];
                            array4[(length2 ^ n13) - (~length2 & n13) * 2] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                            final int n14 = a = com.aheaditec.talsec.security.M.a(n2, 3, ~n2 * 2, 1);
                            if ((lcmp((long)n2, (long)2) >>> 31 & 0x1) != 0x0) {
                                n15 = n14;
                                break;
                            }
                            break Label_1062;
                        }
                        case 180635757: {
                            final int length5 = array.length;
                            final int n16 = 0 - array.length % 4;
                            int n17 = n8;
                            if ((length5 ^ ~n16) + (length5 | n16) * 2 + 1 <= 0) {
                                n17 = n;
                            }
                            if (n17 != 0) {
                                n4 = -1605440657;
                            }
                            else {
                                n4 = -365117735;
                            }
                            if (n17 == 0) {
                                n4 = -169475207;
                            }
                            array3 = array2;
                            array4 = array;
                            n3 = n;
                            continue;
                        }
                        case -1135475043: {
                            break Label_0498;
                        }
                        case -1399959314: {
                            final int a3 = com.aheaditec.talsec.security.K.a(0xB82B9FA4 & n3, n3, 3, 0xB82B9FA7 & n3);
                            final byte b3 = array3[a3];
                            final int n18 = (b3 & 0x1000000) * (b3 | 0x1000000) + (b3 & 0xFEFFFFFF) * (~b3 & 0x1000000);
                            final int n19 = n3 - 1;
                            final int n20 = n19 - (n3 | 0xFFFFFFFD);
                            final int n21 = array3[n20] & 0xFF;
                            final int n22 = n21 * (~n21 & 0x10000);
                            final int a4 = com.aheaditec.talsec.security.J.a(n22, n18, 1, -1 - n22 | -1 - n18);
                            final int n23 = n19 - (n3 | 0xFFFFFFFE);
                            final int n24 = array3[n23] & 0xFF;
                            final int n25 = n24 * (~n24 & 0x100);
                            final int n26 = n25 - 1 - (~a4 | n25);
                            final int n27 = array3[n3] & 0xFF;
                            final int a5 = com.aheaditec.talsec.security.J.a(n26, n27, 1, -1 - n26 | -1 - n27);
                            final byte b4 = array4[a3];
                            final int n28 = (0x1000000 & b4) * (b4 | 0x1000000) + (0xFEFFFFFF & b4) * (~b4 & 0x1000000);
                            final int n29 = array4[n20] & 0xFF;
                            final int n30 = (n29 * (~n29 & 0x10000) & ~n28) + n28;
                            final int n31 = array4[n23] & 0xFF;
                            final int n32 = n31 * (~n31 & 0x100);
                            final int n33 = ~((~n32 | 0x3652D953 | n30) - ((n32 & 0x3652D953) | n30));
                            final int n34 = array4[n3] & 0xFF;
                            final int n35 = ~((~n33 | 0x557285B4 | n34) - ((n33 & 0x557285B4) | n34));
                            final int n36 = a5 << (dcmpg((double)a5, Double.NaN) >>> 31);
                            final int n37 = -1254002618 - ((n36 & 0x2) | -1672003491 - n36);
                            final int n38 = n37 + n35 - (n37 & n35) * 2;
                            array4[n3] = (byte)n38;
                            array4[n23] = (byte)(n38 >>> 8);
                            array4[n20] = (byte)(n38 >>> 16);
                            array4[a3] = (byte)(n38 >>> 24);
                            n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                            final int length6 = array4.length;
                            final int n39 = 0 - array4.length % 4;
                            final long n40 = lcmp((long)n3, (long)com.aheaditec.talsec.security.L.a(0, (length6 & 0x2) | com.aheaditec.talsec.security.N.a(n39, -4, 1, length6), n39 * 3, 1)) >>> 31 & 0x1;
                            int n41;
                            if (n40 != 0) {
                                n41 = -1605440657;
                            }
                            else {
                                n41 = -365117735;
                            }
                            if (n40 != 0) {
                                final int n42 = 0;
                                n4 = n41;
                                n = n42;
                                continue;
                            }
                            n4 = -169475207;
                            break Label_1050;
                        }
                        case -1725904394: {
                            n15 = array4.length % 4;
                            if ((lcmp((long)n15, (long)1) >>> 31 & 0x1) != 0x0) {
                                break;
                            }
                            final int n43 = 0;
                            a = n15;
                            n = n43;
                            break Label_1062;
                        }
                        case -1896910703: {
                            final int length7 = array4.length;
                            final int n44 = 0 - n2;
                            final int n45 = (length7 ^ n44) + (length7 & n44) * 2;
                            final byte b5 = array3[n45];
                            final int length8 = array4.length;
                            final int n46 = 0 - n44;
                            final int n47 = n46 | length8;
                            final byte b6 = array3[com.aheaditec.talsec.security.O.a(n46, 2, n47, length8 ^ n46 ^ n47)];
                            array3[n45] = (byte)((byte)((byte)2 * (byte)(b6 | b5)) - (byte)(b6 ^ b5));
                            n = 0;
                            n4 = -746753280;
                            continue;
                        }
                    }
                    n4 = -458924450;
                    a = n15;
                }
                n = 0;
                continue;
            }
            n4 = -365117735;
        }
    }
    
    public final String a(final byte[] array) {
        return new String(this.b(array), StandardCharsets.UTF_8);
    }
    
    public final Set<String> a(final ApplicationInfo applicationInfo) {
        final HashSet set = new HashSet();
        try {
            final DexFile dexFile = new DexFile(applicationInfo.sourceDir);
            final Enumeration entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                set.add((Object)entries.nextElement());
            }
            dexFile.close();
        }
        catch (final IOException ex) {
            final byte[] array2;
            final byte[] array = array2 = new byte[18];
            array2[0] = -3;
            array2[1] = 105;
            array2[2] = -76;
            array2[3] = -41;
            array2[4] = 36;
            array2[5] = 122;
            array2[6] = -73;
            array2[7] = 110;
            array2[8] = 121;
            array2[9] = -22;
            array2[10] = 116;
            array2[11] = -8;
            array2[12] = 27;
            array2[13] = 74;
            array2[14] = -18;
            array2[15] = 7;
            array2[16] = 45;
            array2[17] = -55;
            c(array, new byte[] { -75, -47, -26, -101, 102, 4, -20, 1, 39, 108, 39, -100, -107, 14, -100, 79, 73, -70 });
            this.a(new String(array, StandardCharsets.UTF_8).intern(), (Exception)ex);
        }
        return (Set<String>)set;
    }
    
    public void a(final Context context) {
        this.d(context);
    }
    
    public final void a(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final IOException ex) {
                final byte[] array2;
                final byte[] array = array2 = new byte[11];
                array2[0] = 94;
                array2[1] = 30;
                array2[2] = 29;
                array2[3] = -62;
                array2[4] = 79;
                array2[5] = -107;
                array2[6] = -74;
                array2[7] = -61;
                array2[8] = 34;
                array2[9] = 46;
                array2[10] = -122;
                c(array, new byte[] { 84, 66, -120, -104, 65, -106, -40, -104, 71, 79, -21 });
                this.a(new String(array, StandardCharsets.UTF_8).intern(), (Exception)ex);
            }
        }
    }
    
    public final void a(final String s, final Exception ex) {
        String s2;
        if (((Throwable)ex).getMessage() == null) {
            s2 = ex.getClass().getSimpleName();
        }
        else {
            s2 = ((Throwable)ex).getMessage();
        }
        ((f)this).a(s, s2);
    }
    
    public final byte[] a(final byte[] array, final int n) {
        if (n == 2) {
            final byte[] array3;
            final byte[] array2 = array3 = new byte[15];
            array3[0] = -92;
            array3[1] = -103;
            array3[2] = 9;
            array3[3] = 115;
            array3[4] = -122;
            array3[5] = 51;
            array3[6] = 108;
            array3[7] = -126;
            array3[8] = 73;
            array3[9] = -91;
            array3[10] = 81;
            array3[11] = 9;
            array3[12] = 18;
            array3[13] = -128;
            array3[14] = 65;
            c(array2, new byte[] { -34, -63, -126, -9, 4, 49, 46, -54, 65, -98, 27, 98, 115, -29, 36 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String intern = new String(array2, utf_8).intern();
            final byte[] array5;
            final byte[] array4 = array5 = new byte[19];
            array5[0] = 35;
            array5[1] = -40;
            array5[2] = -54;
            array5[3] = -31;
            array5[4] = 1;
            array5[5] = -12;
            array5[6] = 118;
            array5[7] = -83;
            array5[8] = -67;
            array5[9] = -115;
            array5[10] = 46;
            array5[11] = -27;
            array5[12] = 114;
            array5[13] = 98;
            array5[14] = -72;
            array5[15] = -13;
            array5[16] = 14;
            array5[17] = 42;
            array5[18] = -70;
            c(array4, new byte[] { -121, 125, -66, 121, -116, 86, 45, -64, -17, 125, 93, 125, 105, -45, -16, 110, 103, 92, -33 });
            ((f)this).c(intern, new String(array4, utf_8).intern());
            return v0.A;
        }
        return array;
    }
    
    public final byte[] a(byte[] array, final StackTraceElement stackTraceElement) {
        final String className = stackTraceElement.getClassName();
        final byte[] b = this.b(v0.F);
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (className.equals((Object)new String(b, utf_8)) && stackTraceElement.getMethodName().equals((Object)new String(this.b(v0.G), utf_8))) {
            final byte[] array2;
            array = (array2 = new byte[15]);
            array2[0] = 35;
            array2[1] = -88;
            array2[2] = 71;
            array2[3] = 99;
            array2[4] = 34;
            array2[5] = -127;
            array2[6] = 95;
            array2[7] = 12;
            array2[8] = 67;
            array2[9] = 50;
            array2[10] = -30;
            array2[11] = -99;
            array2[12] = -104;
            array2[13] = -18;
            array2[14] = 9;
            c(array, new byte[] { 87, -112, 56, -25, 96, -94, 65, 84, 55, 41, -52, -42, -7, -115, 108 });
            final String intern = new String(array, utf_8).intern();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[22];
            array4[0] = -124;
            array4[1] = -14;
            array4[2] = 12;
            array4[3] = 2;
            array4[4] = -10;
            array4[5] = 62;
            array4[6] = -31;
            array4[7] = -45;
            array4[8] = -33;
            array4[9] = 104;
            array4[10] = -34;
            array4[11] = 49;
            array4[12] = 5;
            array4[13] = 98;
            array4[14] = -109;
            array4[15] = 97;
            array4[16] = 87;
            array4[17] = 37;
            array4[18] = -99;
            array4[19] = 101;
            array4[20] = -117;
            array4[21] = 49;
            c(array3, new byte[] { 3, 110, 121, 80, -86, 42, -41, -115, -61, -47, -59, 61, 60, 1, -4, -22, 59, 33, 5, -20, -1, 84 });
            ((f)this).c(intern, new String(array3, utf_8).intern());
            return v0.A;
        }
        return array;
    }
    
    public final boolean b(final boolean b) {
        return new Random().nextInt(v0.B.length) > 0 && !b;
    }
    
    public final byte[] b(Context b) {
        final PackageManager packageManager = ((Context)b).getPackageManager();
        if (packageManager == null) {
            return v0.B;
        }
        b = v0.B;
        final ArrayList list = new ArrayList(2);
        final byte[] b2 = this.b(v0.C);
        final Charset utf_8 = StandardCharsets.UTF_8;
        list.add((Object)new String(b2, utf_8));
        list.add((Object)new String(this.b(v0.D), utf_8));
        int n = 0;
    Label_0948_Outer:
        while (true) {
            if (n >= list.size()) {
                return (byte[])b;
            }
            while (true) {
                try {
                    ApplicationInfo applicationInfo;
                    if (Build$VERSION.SDK_INT >= 33) {
                        applicationInfo = packageManager.getApplicationInfo((String)list.get(n), PackageManager$ApplicationInfoFlags.of(0L));
                    }
                    else {
                        applicationInfo = packageManager.getApplicationInfo((String)list.get(n), 0);
                    }
                    if (applicationInfo != null) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[15];
                        array2[0] = 55;
                        array2[1] = -67;
                        array2[2] = 68;
                        array2[3] = -21;
                        array2[4] = -49;
                        array2[5] = -119;
                        array2[6] = 56;
                        array2[7] = 75;
                        array2[8] = 48;
                        array2[9] = 120;
                        array2[10] = -91;
                        array2[11] = -117;
                        array2[12] = 84;
                        array2[13] = -52;
                        array2[14] = 123;
                        c(array, new byte[] { 107, -91, 55, 111, -69, -97, 96, 17, 116, -19, -25, -53, 38, -89, 8 });
                        final Charset utf_9 = StandardCharsets.UTF_8;
                        final String intern = new String(array, utf_9).intern();
                        final StringBuilder sb = new StringBuilder();
                        String s;
                        if (n == 0) {
                            s = new(java.lang.String.class)();
                            final byte[] array4;
                            final byte[] array3 = array4 = new byte[6];
                            array4[0] = 88;
                            array4[1] = -18;
                            array4[2] = -76;
                            array4[3] = -62;
                            array4[4] = -22;
                            array4[5] = -90;
                            c(array3, new byte[] { 23, 110, -15, -104, -113, -62, -54, -125 });
                            new String(array3, utf_9);
                        }
                        else {
                            final byte[] array6;
                            final byte[] array5 = array6 = new byte[9];
                            array6[0] = -72;
                            array6[1] = 59;
                            array6[2] = -114;
                            array6[3] = -115;
                            array6[4] = -68;
                            array6[5] = 84;
                            array6[6] = -80;
                            array6[7] = 39;
                            array6[8] = -99;
                            c(array5, new byte[] { 2, 31, 2, -26, -33, -10, -26, 58, -8 });
                            s = new String(array5, utf_9);
                        }
                        final StringBuilder append = sb.append(s.intern());
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[20];
                        array8[0] = 85;
                        array8[1] = 58;
                        array8[2] = 27;
                        array8[3] = -83;
                        array8[4] = -11;
                        array8[5] = -42;
                        array8[6] = 70;
                        array8[7] = -105;
                        array8[8] = 116;
                        array8[9] = -13;
                        array8[10] = 17;
                        array8[11] = 107;
                        array8[12] = -62;
                        array8[13] = -22;
                        array8[14] = -39;
                        array8[15] = -113;
                        array8[16] = 96;
                        array8[17] = 11;
                        array8[18] = -64;
                        array8[19] = -40;
                        c(array7, new byte[] { -116, 44, -118, -65, -78, -126, 124, -33, 49, -93, 123, -22, -66, -102, -64, -35, 42, 79, -69, -100 });
                        ((f)this).c(intern, append.append(new String(array7, utf_9).intern()).toString());
                    }
                    Object a = b;
                    if (applicationInfo != null) {
                        a = b;
                        if (list.contains((Object)applicationInfo.packageName)) {
                            a = v0.A;
                        }
                    }
                    ++n;
                    b = a;
                    continue Label_0948_Outer;
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    final Object a = b;
                    continue;
                }
                break;
            }
        }
    }
    
    public final byte[] b(Set<String> a) {
        final byte[] b = v0.B;
        final List list = Arrays.asList((Object[])new String[] { this.a(v0.L), this.a(v0.N), this.a(v0.M), this.a(v0.P), this.a(v0.O), this.a(v0.Q), this.a(v0.R), this.a(v0.S), this.a(v0.T), this.a(v0.U), this.a(v0.V), this.a(v0.W), this.a(v0.X), this.a(v0.Y), this.a(v0.Z), this.a(v0.a0), this.a(v0.b0), this.a(v0.c0), this.a(v0.d0) });
        final Iterator iterator = ((Set)(Object)a).iterator();
        a = b;
    Label_0285:
        while (iterator.hasNext()) {
            final String className = (String)iterator.next();
            final byte[] array2;
            final byte[] array = array2 = new byte[29];
            array2[0] = 55;
            array2[1] = 98;
            array2[2] = 66;
            array2[3] = 95;
            array2[4] = -28;
            array2[5] = 97;
            array2[6] = 99;
            array2[7] = 56;
            array2[8] = -68;
            array2[9] = -18;
            array2[10] = 83;
            array2[11] = 35;
            array2[12] = -95;
            array2[13] = 36;
            array2[14] = -106;
            array2[15] = -77;
            array2[16] = -82;
            array2[17] = -42;
            array2[18] = -54;
            array2[20] = (array2[19] = 99);
            array2[21] = -121;
            array2[22] = 92;
            array2[23] = -67;
            array2[24] = -55;
            array2[25] = 57;
            array2[26] = -101;
            array2[27] = 112;
            array2[28] = -35;
            c(array, new byte[] { 107, -35, 68, 88, -100, -39, 27, 64, -17, 87, 61, 45, -39, -38, -9, -71, -39, 117, -59, -25, 83, -60, 79, -59, -45, 27, 8, -20, -92 });
            byte[] array3 = a;
            if (className.startsWith(new String(array, StandardCharsets.UTF_8).intern())) {
                while (true) {
                    array3 = a;
                Label_1586:
                    while (true) {
                        int n;
                        try {
                            final Class<?> forName = Class.forName(className);
                            array3 = a;
                            final Method[] declaredMethods = forName.getDeclaredMethods();
                            array3 = a;
                            final int length = declaredMethods.length;
                            n = 0;
                            array3 = a;
                            if (n >= length) {
                                break;
                            }
                            final Method method = declaredMethods[n];
                            array3 = a;
                            if (!list.contains((Object)method.getName())) {
                                array3 = a;
                                if (Modifier.isNative(method.getModifiers())) {
                                    array3 = a;
                                    array3 = a;
                                    final byte[] array4 = new byte[18];
                                    array3 = a;
                                    final byte[] array5 = array4;
                                    array5[0] = 51;
                                    array5[1] = -40;
                                    array5[2] = 47;
                                    array5[3] = 102;
                                    array5[4] = -27;
                                    array5[5] = -105;
                                    array5[6] = -18;
                                    array5[7] = -78;
                                    array5[8] = 118;
                                    array5[9] = 101;
                                    array5[10] = 22;
                                    array5[11] = 45;
                                    array5[12] = -72;
                                    array5[13] = 88;
                                    array5[14] = 30;
                                    array5[15] = 33;
                                    array5[16] = -88;
                                    array5[17] = -83;
                                    array3 = a;
                                    c(array4, new byte[] { 103, -128, 96, -20, -91, -87, -91, -83, 54, -29, -120, 71, -12, -4, -117, 53, -52, -34 });
                                    array3 = a;
                                    final Charset utf_8 = StandardCharsets.UTF_8;
                                    array3 = a;
                                    final String s = new String(array4, utf_8);
                                    array3 = a;
                                    final String intern = s.intern();
                                    array3 = a;
                                    array3 = a;
                                    final StringBuilder sb = new StringBuilder();
                                    array3 = a;
                                    array3 = a;
                                    final byte[] array6 = new byte[23];
                                    array3 = a;
                                    final byte[] array7 = array6;
                                    array7[0] = -70;
                                    array7[1] = 48;
                                    array7[2] = -105;
                                    array7[3] = 75;
                                    array7[4] = 79;
                                    array7[5] = 58;
                                    array7[6] = 69;
                                    array7[7] = -84;
                                    array7[8] = -89;
                                    array7[9] = 100;
                                    array7[10] = 67;
                                    array7[11] = -103;
                                    array7[12] = -36;
                                    array7[13] = -67;
                                    array7[14] = 121;
                                    array7[15] = -126;
                                    array7[16] = -25;
                                    array7[17] = -114;
                                    array7[18] = -41;
                                    array7[19] = 14;
                                    array7[20] = -42;
                                    array7[21] = -60;
                                    array7[22] = 106;
                                    array3 = a;
                                    c(array6, new byte[] { 11, 34, -7, 9, 80, 47, 123, -79, -23, -38, 53, -44, -52, -94, 45, -119, -104, -79, -72, 71, -78, -2, 74 });
                                    array3 = a;
                                    final String s2 = new String(array6, utf_8);
                                    array3 = a;
                                    final StringBuilder append = sb.append(s2.intern()).append(forName.getCanonicalName());
                                    array3 = a;
                                    array3 = a;
                                    final byte[] array8 = new byte[2];
                                    array3 = a;
                                    final byte[] array9 = array8;
                                    array9[0] = -96;
                                    array9[1] = -21;
                                    array3 = a;
                                    c(array8, new byte[] { -115, -43, 113, -6, 51, -113, 6, -7 });
                                    array3 = a;
                                    final String s3 = new String(array8, utf_8);
                                    array3 = a;
                                    final String string = append.append(s3.intern()).append(method.getName()).toString();
                                    try {
                                        this.e(intern, string);
                                        array3 = (a = v0.A);
                                    }
                                    catch (final ClassNotFoundException | NoClassDefFoundError | SecurityException ex) {}
                                }
                            }
                        }
                        catch (final ClassNotFoundException | NoClassDefFoundError | SecurityException ex) {
                            a = array3;
                            break Label_1586;
                        }
                        ++n;
                        continue;
                    }
                    final ClassNotFoundException | NoClassDefFoundError | SecurityException ex;
                    if (((Throwable)ex).getMessage() != null) {
                        ((Throwable)ex).getMessage();
                        final byte[] array11;
                        final byte[] array10 = array11 = new byte[18];
                        array11[0] = 85;
                        array11[1] = 82;
                        array11[2] = -104;
                        array11[3] = -25;
                        array11[4] = -83;
                        array11[5] = 57;
                        array11[6] = 2;
                        array11[7] = 54;
                        array11[8] = 82;
                        array11[9] = -58;
                        array11[10] = -48;
                        array11[11] = -66;
                        array11[12] = -114;
                        array11[13] = 79;
                        array11[14] = 35;
                        array11[15] = 117;
                        array11[16] = 46;
                        array11[17] = 84;
                        c(array10, new byte[] { 77, 10, 19, 108, -35, 71, 121, 41, 82, -128, -53, -38, 2, 12, 97, 1, 74, 39 });
                        ((f)this).a(new String(array10, StandardCharsets.UTF_8).intern(), ((Throwable)ex).getMessage());
                        continue Label_0285;
                    }
                    final byte[] array13;
                    final byte[] array12 = array13 = new byte[51];
                    array13[0] = -125;
                    array13[1] = -120;
                    array13[2] = -76;
                    array13[3] = -63;
                    array13[4] = -41;
                    array13[5] = -23;
                    array13[6] = 124;
                    array13[7] = -87;
                    array13[8] = 74;
                    array13[9] = 12;
                    array13[10] = 95;
                    array13[11] = 0;
                    array13[12] = 121;
                    array13[13] = 88;
                    array13[14] = -78;
                    array13[15] = 74;
                    array13[16] = 53;
                    array13[17] = 1;
                    array13[18] = 104;
                    array13[19] = 20;
                    array13[20] = 5;
                    array13[21] = -60;
                    array13[22] = 82;
                    array13[23] = -107;
                    array13[24] = 58;
                    array13[25] = -71;
                    array13[26] = 95;
                    array13[27] = 46;
                    array13[28] = 86;
                    array13[29] = -7;
                    array13[30] = -31;
                    array13[31] = 104;
                    array13[32] = 126;
                    array13[33] = 102;
                    array13[34] = 104;
                    array13[35] = -25;
                    array13[36] = -58;
                    array13[37] = -2;
                    array13[38] = -54;
                    array13[39] = 33;
                    array13[40] = -115;
                    array13[41] = 118;
                    array13[42] = 89;
                    array13[43] = 59;
                    array13[44] = 76;
                    array13[45] = -61;
                    array13[46] = -51;
                    array13[47] = -59;
                    array13[48] = 124;
                    array13[49] = -110;
                    array13[50] = -74;
                    c(array12, new byte[] { -9, -80, -25, -119, -45, 122, 38, -81, 80, 79, 80, 90, 86, 7, -42, -21, 107, 69, 23, 73, 119, 89, 77, -56, 105, -90, 81, 68, -115, 111, -106, -24, 41, -45, 33, -82, -56, 103, -44, 48, -60, -24, 75, 2, 56, 118, -44, -99, 29, -11, -45 });
                    new String(array12, StandardCharsets.UTF_8).intern();
                    continue Label_0285;
                }
            }
            a = array3;
        }
        return a;
    }
    
    public final byte[] b(final byte[] array) {
        final byte[] array2 = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            final byte[] z = v0.z;
            array2[i] = (byte)(b ^ z[i % z.length]);
        }
        return array2;
    }
    
    public final byte[] b(byte[] array, final StackTraceElement stackTraceElement) {
        final String className = stackTraceElement.getClassName();
        final byte[] b = this.b(v0.H);
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (className.equals((Object)new String(b, utf_8)) && stackTraceElement.getMethodName().equals((Object)new String(this.b(v0.J), utf_8))) {
            final byte[] array2;
            array = (array2 = new byte[15]);
            array2[0] = 59;
            array2[1] = -18;
            array2[2] = 75;
            array2[3] = 15;
            array2[4] = 119;
            array2[5] = -64;
            array2[6] = 63;
            array2[7] = -128;
            array2[8] = -17;
            array2[9] = 26;
            array2[10] = 94;
            array2[11] = -39;
            array2[12] = 59;
            array2[13] = -10;
            array2[14] = 98;
            c(array, new byte[] { 111, 86, 68, 83, 51, 99, 97, -56, -93, 65, 32, -110, 90, -107, 7 });
            final String intern = new String(array, utf_8).intern();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[19];
            array4[0] = 52;
            array4[1] = -71;
            array4[2] = 32;
            array4[3] = 12;
            array4[4] = 9;
            array4[5] = -49;
            array4[6] = 126;
            array4[7] = 42;
            array4[8] = 15;
            array4[9] = -128;
            array4[10] = -55;
            array4[11] = 81;
            array4[12] = 88;
            array4[13] = -55;
            array4[14] = 58;
            array4[15] = -125;
            array4[16] = 77;
            array4[17] = -26;
            array4[18] = -50;
            c(array3, new byte[] { 115, -90, 101, 78, -125, 123, 116, 70, -109, -71, -67, 29, -113, 97, 96, -45, 62, -125, -86 });
            ((f)this).c(intern, new String(array3, utf_8).intern());
            return v0.A;
        }
        return array;
    }
    
    public final byte[] c(final Context context) {
        return v0.B;
    }
    
    public final byte[] c(final Set<String> set) {
        final byte[] b = v0.B;
        final byte[] b2 = this.b(v0.D);
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String s = new String(b2, utf_8);
        final String s2 = new String(this.b(v0.K), utf_8);
        final Iterator iterator = set.iterator();
        byte[] array = b;
        while (iterator.hasNext()) {
            final String s3 = (String)iterator.next();
            if (s3.contains((CharSequence)s)) {
                final byte[] array3;
                final byte[] array2 = array3 = new byte[37];
                array3[0] = 30;
                array3[1] = 104;
                array3[2] = 101;
                array3[3] = 50;
                array3[4] = 121;
                array3[5] = -82;
                array3[6] = -70;
                array3[7] = 123;
                array3[8] = -71;
                array3[9] = -2;
                array3[10] = -66;
                array3[11] = -101;
                array3[12] = -95;
                array3[13] = 108;
                array3[14] = -17;
                array3[15] = -28;
                array3[16] = 48;
                array3[17] = -107;
                array3[18] = -29;
                array3[19] = 82;
                array3[20] = -24;
                array3[21] = -27;
                array3[22] = -122;
                array3[23] = 69;
                array3[24] = 66;
                array3[25] = -34;
                array3[26] = 31;
                array3[27] = -91;
                array3[28] = -46;
                array3[29] = -114;
                array3[30] = -22;
                array3[31] = 48;
                array3[32] = 43;
                array3[33] = -66;
                array3[34] = -23;
                array3[35] = -30;
                array3[36] = 55;
                c(array2, new byte[] { -111, -35, 38, 62, 49, -86, -1, -6, -17, 92, -15, -26, 5, -33, -102, 126, -120, -53, -99, -1, -96, 103, 11, -15, 68, -113, -111, -89, -51, -105, -102, 100, 101, -93, -100, 119, 78 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                final String intern = new String(array2, utf_9).intern();
                final StringBuilder sb = new StringBuilder();
                final byte[] array5;
                final byte[] array4 = array5 = new byte[31];
                array5[0] = -127;
                array5[1] = 86;
                array5[2] = -32;
                array5[3] = 21;
                array5[4] = -19;
                array5[5] = 45;
                array5[6] = 11;
                array5[7] = 80;
                array5[8] = 32;
                array5[9] = 91;
                array5[10] = -6;
                array5[11] = -13;
                array5[12] = 13;
                array5[13] = -97;
                array5[14] = -123;
                array5[15] = 78;
                array5[16] = 54;
                array5[17] = 5;
                array5[18] = -117;
                array5[19] = 118;
                array5[20] = -34;
                array5[21] = -114;
                array5[22] = 49;
                array5[23] = 113;
                array5[24] = 1;
                array5[25] = -65;
                array5[26] = -80;
                array5[27] = 46;
                array5[28] = 120;
                array5[29] = -58;
                array5[30] = 67;
                c(array4, new byte[] { -23, -13, -105, 77, -80, 47, -128, 11, 92, 75, -97, -126, -125, -67, -10, 17, 45, 58, -1, 3, -46, -67, 91, 56, 126, -96, -37, 39, 28, -4, 99 });
                ((f)this).c(intern, sb.append(new String(array4, utf_9).intern()).append(s3).toString());
                array = v0.A;
            }
            if (s3.contains((CharSequence)s2)) {
                final byte[] array7;
                final byte[] array6 = array7 = new byte[37];
                array7[0] = -44;
                array7[1] = 49;
                array7[2] = -113;
                array7[3] = -125;
                array7[4] = 29;
                array7[5] = -102;
                array7[6] = 24;
                array7[7] = 31;
                array7[8] = -100;
                array7[9] = -65;
                array7[10] = 14;
                array7[11] = 104;
                array7[12] = -106;
                array7[13] = 71;
                array7[14] = -79;
                array7[15] = -24;
                array7[16] = -70;
                array7[17] = 92;
                array7[18] = 36;
                array7[19] = -8;
                array7[20] = -25;
                array7[21] = -104;
                array7[22] = 89;
                array7[23] = 69;
                array7[24] = -4;
                array7[25] = 21;
                array7[26] = -16;
                array7[27] = 17;
                array7[28] = -31;
                array7[29] = 127;
                array7[30] = 5;
                array7[31] = -89;
                array7[32] = -65;
                array7[33] = -6;
                array7[34] = -117;
                array7[35] = -72;
                array7[36] = -80;
                c(array6, new byte[] { -57, 36, 17, -50, -107, -66, 97, 94, 20, -98, -127, -13, -16, -11, -16, -126, 18, 3, 86, -103, -99, -70, 64, -16, -86, 68, -86, 91, -100, 6, -127, -47, -15, 103, -6, -79, -55 });
                final Charset utf_10 = StandardCharsets.UTF_8;
                final String intern2 = new String(array6, utf_10).intern();
                final StringBuilder sb2 = new StringBuilder();
                final byte[] array9;
                final byte[] array8 = array9 = new byte[11];
                array9[0] = -95;
                array9[1] = 6;
                array9[2] = -54;
                array9[3] = 63;
                array9[4] = -34;
                array9[5] = -17;
                array9[6] = 30;
                array9[7] = 10;
                array9[8] = -86;
                array9[9] = 75;
                array9[10] = -59;
                c(array8, new byte[] { 16, 71, -69, 51, -46, 91, 84, 39, -21, 25, -27 });
                ((f)this).c(intern2, sb2.append(new String(array8, utf_10).intern()).append(s3).toString());
                array = v0.A;
            }
        }
        return array;
    }
    
    public final byte[] c(byte[] array, final StackTraceElement stackTraceElement) {
        final String className = stackTraceElement.getClassName();
        final byte[] b = this.b(v0.H);
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (className.equals((Object)new String(b, utf_8)) && stackTraceElement.getMethodName().equals((Object)new String(this.b(v0.I), utf_8))) {
            final byte[] array2;
            array = (array2 = new byte[15]);
            array2[0] = 37;
            array2[1] = 98;
            array2[2] = -43;
            array2[3] = 111;
            array2[4] = -120;
            array2[5] = -72;
            array2[6] = 6;
            array2[7] = -79;
            array2[8] = -21;
            array2[9] = 80;
            array2[10] = -122;
            array2[11] = -66;
            array2[12] = -117;
            array2[13] = 44;
            array2[14] = 23;
            c(array, new byte[] { 93, -38, -59, -13, -6, -69, -120, -73, -97, 11, -24, -77, -22, 79, 114 });
            final String intern = new String(array, utf_8).intern();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[16];
            array4[0] = -71;
            array4[1] = -76;
            array4[2] = -102;
            array4[3] = 78;
            array4[4] = -10;
            array4[5] = 21;
            array4[6] = 9;
            array4[7] = 61;
            array4[8] = -65;
            array4[9] = 91;
            array4[10] = -51;
            array4[11] = 25;
            array4[12] = -127;
            array4[13] = -40;
            array4[14] = 65;
            array4[15] = -121;
            c(array3, new byte[] { -8, -108, 11, 37, -86, 65, 63, 59, -29, 75, -62, 97, 12, -126, 77, -55 });
            ((f)this).c(intern, new String(array3, utf_8).intern());
            return v0.A;
        }
        return array;
    }
    
    public void d(final Context context) {
        super.a(((f)this).a((f$a)new v0$$ExternalSyntheticLambda0(this, context)));
    }
    
    public final void e(final String s, final String s2) {
        ((f)this).c(s, s2);
    }
    
    public final boolean e() {
        final Random$Default default1 = kotlin.random.Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] g = Natives.a.g(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[29];
        array2[0] = 22;
        array2[1] = -128;
        array2[2] = -65;
        array2[3] = -34;
        array2[4] = 89;
        array2[5] = -15;
        array2[6] = 23;
        array2[7] = 46;
        array2[8] = 99;
        array2[9] = 86;
        array2[10] = 43;
        array2[11] = -8;
        array2[12] = 39;
        array2[13] = 113;
        array2[14] = 16;
        array2[15] = 69;
        array2[16] = 28;
        array2[17] = 5;
        array2[18] = 4;
        array2[19] = 15;
        array2[20] = 84;
        array2[21] = -52;
        array2[22] = 65;
        array2[23] = 93;
        array2[24] = -27;
        array2[25] = -93;
        array2[26] = 115;
        array2[27] = 121;
        array2[28] = 77;
        c(array, new byte[] { -114, -62, -16, 127, 66, 104, -119, 54, 70, 15, 95, 113, 93, -45, -114, 7, -122, 17, 119, 98, 72, 127, 75, 31, -104, -80, 40, -4, 33 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final Boolean a = ((f)this).a(g, first, first2, new String(array, utf_8).intern());
        if (a != null && a) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[25];
            array4[0] = -112;
            array4[1] = -43;
            array4[2] = -20;
            array4[3] = -128;
            array4[5] = (array4[4] = 127);
            array4[6] = 13;
            array4[7] = 90;
            array4[8] = 75;
            array4[9] = 20;
            array4[10] = -77;
            array4[11] = -101;
            array4[12] = 122;
            array4[13] = 113;
            array4[14] = 4;
            array4[15] = -116;
            array4[16] = -84;
            array4[17] = -83;
            array4[18] = -50;
            array4[19] = -40;
            array4[20] = 8;
            array4[21] = 114;
            array4[22] = 105;
            array4[24] = (array4[23] = -55);
            c(array3, new byte[] { 8, 120, -97, -83, 36, -26, 126, 34, 30, 77, -25, -48, 50, -45, -126, -48, -10, -71, -63, -109, -124, -31, 50, -109, -83 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = -123;
            array6[1] = 90;
            array6[2] = -18;
            array6[3] = 15;
            c(array5, new byte[] { 8, -7, -80, 81, 107, -96, 70, 39 });
            ((f)this).c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
    
    public final byte[] e(final Context context) {
        final byte[] b = v0.B;
        byte[] a;
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[34];
            array2[0] = -73;
            array2[1] = 105;
            array2[2] = -81;
            array2[3] = 85;
            array2[4] = 107;
            array2[5] = -59;
            array2[6] = 95;
            array2[7] = 64;
            array2[8] = 71;
            array2[9] = 84;
            array2[10] = -41;
            array2[11] = -89;
            array2[12] = 69;
            array2[13] = -16;
            array2[14] = -38;
            array2[15] = -111;
            array2[16] = 94;
            array2[17] = 85;
            array2[18] = 43;
            array2[19] = -73;
            array2[20] = 4;
            array2[21] = 19;
            array2[22] = -48;
            array2[23] = 91;
            array2[24] = -24;
            array2[25] = -89;
            array2[26] = 27;
            array2[27] = 45;
            array2[28] = -114;
            array2[29] = 82;
            array2[30] = -30;
            array2[31] = -3;
            array2[32] = -79;
            array2[33] = 51;
            c(array, new byte[] { -81, -22, -21, 13, 54, 112, 72, 86, 56, -10, -53, -79, 55, 87, -53, -54, 76, 74, -119, -82, -126, 48, -53, 38, -63, -91, -120, 48, 0, 8, -30, 126, -48, 65 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final File file = new File(new String(array, utf_8).intern());
            a = b;
            if (file.exists()) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[3];
                array4[0] = -16;
                array4[1] = 127;
                array4[2] = -23;
                c(array3, new byte[] { -108, 26, -111, 4, -96, -115, 97, -22 });
                final Class loadClass = new DexClassLoader(file.getPath(), context.getDir(new String(array3, utf_8).intern(), 0).getPath(), (String)null, ClassLoader.getSystemClassLoader()).loadClass(new String(this.b(v0.H), utf_8));
                final byte[] array6;
                final byte[] array5 = array6 = new byte[16];
                array6[0] = 97;
                array6[1] = 119;
                array6[2] = 80;
                array6[3] = 28;
                array6[4] = 102;
                array6[5] = 44;
                array6[6] = 29;
                array6[7] = -73;
                array6[8] = -9;
                array6[9] = -49;
                array6[10] = -69;
                array6[11] = 70;
                array6[12] = -110;
                array6[13] = -103;
                array6[14] = 82;
                array6[15] = 76;
                c(array5, new byte[] { 29, -30, 57, 43, 45, 19, -124, -71, -86, 105, -12, 27, -8, -64, 83, 9 });
                final Method declaredMethod = loadClass.getDeclaredMethod(new String(array5, utf_8).intern(), (Class[])new Class[0]);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                final Integer n = (Integer)declaredMethod.invoke((Object)null, new Object[0]);
                a = b;
                if (n != null) {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[24];
                    array8[0] = 66;
                    array8[1] = -123;
                    array8[2] = 75;
                    array8[3] = 7;
                    array8[4] = 60;
                    array8[5] = -55;
                    array8[6] = -98;
                    array8[7] = -87;
                    array8[8] = 104;
                    array8[9] = -112;
                    array8[10] = 53;
                    array8[11] = 108;
                    array8[12] = -67;
                    array8[13] = 38;
                    array8[14] = -92;
                    array8[15] = 85;
                    array8[16] = 87;
                    array8[17] = -14;
                    array8[18] = -21;
                    array8[19] = 68;
                    array8[20] = 85;
                    array8[21] = 6;
                    array8[22] = -91;
                    array8[23] = 106;
                    c(array7, new byte[] { 66, -58, 41, 94, 106, -118, 17, -75, 85, -59, 93, 6, -21, 25, -32, -5, 56, 99, -104, 15, 75, 52, -33, -10 });
                    final String intern = new String(array7, utf_8).intern();
                    final StringBuilder sb = new StringBuilder();
                    final byte[] array10;
                    final byte[] array9 = array10 = new byte[21];
                    array10[0] = -66;
                    array10[1] = 34;
                    array10[2] = -81;
                    array10[3] = -117;
                    array10[4] = -92;
                    array10[5] = -11;
                    array10[6] = 125;
                    array10[7] = -85;
                    array10[8] = 14;
                    array10[9] = -66;
                    array10[10] = -97;
                    array10[11] = -25;
                    array10[12] = 54;
                    array10[13] = -34;
                    array10[14] = -70;
                    array10[15] = -4;
                    array10[16] = -89;
                    array10[17] = -55;
                    array10[18] = -97;
                    array10[19] = 97;
                    array10[20] = 96;
                    c(array9, new byte[] { 15, 30, -16, -52, -41, -91, 59, -62, 120, -99, 16, 107, 45, 120, -11, 117, -21, 112, 6, -9, 64 });
                    ((f)this).c(intern, sb.append(new String(array9, utf_8).intern()).append((Object)n).toString());
                    a = v0.A;
                }
            }
        }
        catch (final Exception ex) {
            final byte[] array12;
            final byte[] array11 = array12 = new byte[24];
            array12[0] = -28;
            array12[1] = -23;
            array12[2] = -81;
            array12[3] = 43;
            array12[4] = -66;
            array12[5] = -91;
            array12[6] = -49;
            array12[7] = 84;
            array12[8] = 80;
            array12[9] = -77;
            array12[10] = 16;
            array12[11] = 84;
            array12[12] = -34;
            array12[13] = 59;
            array12[14] = 58;
            array12[15] = -57;
            array12[16] = -11;
            array12[17] = -9;
            array12[18] = -20;
            array12[19] = -75;
            array12[20] = -85;
            array12[21] = -122;
            array12[22] = -44;
            array12[23] = 96;
            c(array11, new byte[] { -92, 106, 13, 67, -24, -90, -64, 23, 29, -90, 120, 14, -50, 36, 106, 109, -102, 102, -101, -64, -31, -76, -50, -20 });
            this.a(new String(array11, StandardCharsets.UTF_8).intern(), ex);
            a = b;
        }
        return a;
    }
    
    public final byte[] f() {
        byte[] array = v0.B;
        int i = 0;
        try {
            final byte[] a = v0.A;
            final byte b = array[a.length + 1 - array.length * a.length];
            return new byte[] { b, b, b };
        }
        catch (final Exception ex) {
            final StackTraceElement[] stackTrace = ((Throwable)ex).getStackTrace();
            final int length = stackTrace.length;
            int n = 0;
            while (i < length) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                byte[] a2 = array;
                int n2 = n;
                if (stackTraceElement.getClassName().equals((Object)new String(this.b(v0.E), StandardCharsets.UTF_8))) {
                    n2 = n + 1;
                    a2 = this.a(array, n2);
                }
                array = this.b(this.c(this.a(a2, stackTraceElement), stackTraceElement), stackTraceElement);
                ++i;
                n = n2;
            }
            return array;
        }
    }
    
    public final byte[] g() {
        Closeable closeable2 = null;
        Label_1122: {
            Object o = null;
            Closeable closeable = null;
            Label_0592: {
                try {
                    Object o2 = null;
                    BufferedReader bufferedReader = null;
                Label_0567:
                    while (true) {
                        o = new StringBuilder();
                        final byte[] array2;
                        final byte[] array = array2 = new byte[6];
                        array2[0] = 86;
                        array2[1] = 0;
                        array2[2] = 28;
                        array2[3] = -127;
                        array2[4] = -31;
                        array2[5] = 60;
                        c(array, new byte[] { -112, 64, -124, -43, -126, 19, 44, -88 });
                        final Charset utf_8 = StandardCharsets.UTF_8;
                        o = ((StringBuilder)o).append(new String(array, utf_8).intern()).append(Process.myPid());
                        o2 = new(java.lang.String.class)();
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[5];
                        array4[0] = -126;
                        array4[1] = 123;
                        array4[2] = 72;
                        array4[3] = -126;
                        array4[4] = 119;
                        c(array3, new byte[] { -60, -26, 62, -39, 4, 11, -90, -8 });
                        new String(array3, utf_8);
                        o = new FileReader(((StringBuilder)o).append(((String)o2).intern()).toString());
                        bufferedReader = new BufferedReader((Reader)o);
                        while (true) {
                            try {
                                try {
                                    o2 = new HashSet();
                                    byte[] array5;
                                    Charset utf_9;
                                    do {
                                        o = bufferedReader.readLine();
                                        if (o == null) {
                                            break Label_0567;
                                        }
                                        final byte[] array7;
                                        final byte[] array6 = array7 = new byte[3];
                                        array7[0] = 59;
                                        array7[1] = -127;
                                        array7[2] = -61;
                                        c(array6, new byte[] { 21, -14, -84, -116, 72, 112, 55, -65 });
                                        utf_9 = StandardCharsets.UTF_8;
                                        if (((String)o).endsWith(new String(array6, utf_9).intern())) {}
                                        final byte[] array8;
                                        array5 = (array8 = new byte[4]);
                                        array8[0] = -16;
                                        array8[1] = 124;
                                        array8[2] = -33;
                                        array8[3] = -58;
                                        c(array5, new byte[] { -11, -26, -45, -101, -104, -34, -45, -15 });
                                    } while (!((String)o).endsWith(new String(array5, utf_9).intern()));
                                }
                                finally {}
                            }
                            catch (final Exception o) {
                                break Label_0592;
                            }
                            ((HashSet)o2).add((Object)((String)o).substring(((String)o).lastIndexOf(32) + 1));
                            continue;
                        }
                    }
                    o = this.c((Set<String>)o2);
                    this.a((Closeable)bufferedReader);
                    return (byte[])o;
                }
                catch (final Exception o) {
                    closeable = null;
                }
                finally {
                    closeable2 = null;
                    break Label_1122;
                }
            }
            final byte[] array10;
            final byte[] array9 = array10 = new byte[37];
            array10[0] = 26;
            array10[1] = -25;
            array10[2] = -50;
            array10[3] = -7;
            array10[4] = 126;
            array10[5] = -63;
            array10[6] = 40;
            array10[7] = 34;
            array10[8] = -66;
            array10[9] = 83;
            array10[10] = -66;
            array10[11] = -3;
            array10[12] = 43;
            array10[13] = -20;
            array10[14] = -108;
            array10[15] = -83;
            array10[16] = -69;
            array10[17] = 73;
            array10[18] = -7;
            array10[19] = 9;
            array10[20] = 29;
            array10[21] = 102;
            array10[22] = 73;
            array10[23] = -120;
            array10[24] = 20;
            array10[25] = -113;
            array10[26] = -115;
            array10[27] = -24;
            array10[28] = -44;
            array10[29] = -28;
            array10[30] = 58;
            array10[31] = -123;
            array10[32] = -24;
            array10[33] = 74;
            array10[34] = -123;
            array10[35] = -100;
            array10[36] = 59;
            c(array9, new byte[] { -107, 82, -48, -125, 52, -123, -111, 49, -10, -15, -16, -128, 123, 94, 20, -58, 17, -8, -78, 42, -109, -28, 79, -85, -110, -66, -1, 116, -57, 125, 106, -81, -92, -9, -1, -43, 66 });
            this.a(new String(array9, StandardCharsets.UTF_8).intern(), (Exception)o);
            final byte[] b = v0.B;
            this.a(closeable);
            return b;
        }
        this.a(closeable2);
    }
    
    public final boolean h() {
        final Random$Default default1 = kotlin.random.Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] e = Natives.a.e(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[24];
        array2[0] = 56;
        array2[1] = -105;
        array2[2] = -84;
        array2[3] = 25;
        array2[4] = 73;
        array2[5] = 13;
        array2[6] = 41;
        array2[7] = 19;
        array2[8] = -116;
        array2[9] = -40;
        array2[10] = 88;
        array2[11] = 100;
        array2[12] = 88;
        array2[13] = -119;
        array2[14] = 2;
        array2[15] = 67;
        array2[16] = 83;
        array2[17] = 120;
        array2[18] = 116;
        array2[19] = -114;
        array2[20] = 26;
        array2[21] = -63;
        array2[22] = -92;
        array2[23] = -106;
        c(array, new byte[] { 104, -76, 0, 83, 55, 57, 94, 42, 21, -120, 81, -24, 66, -54, 97, 20, 26, -38, 48, -44, 112, 112, -34, -31 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final Boolean a = ((f)this).a(e, first, first2, new String(array, utf_8).intern());
        if (a != null && a) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[20];
            array4[0] = -104;
            array4[1] = -5;
            array4[2] = 32;
            array4[3] = 112;
            array4[4] = 12;
            array4[5] = 123;
            array4[6] = 60;
            array4[7] = -97;
            array4[8] = -2;
            array4[9] = -51;
            array4[10] = 0;
            array4[11] = -8;
            array4[12] = 68;
            array4[13] = -52;
            array4[14] = -50;
            array4[15] = -19;
            array4[16] = -118;
            array4[17] = 118;
            array4[18] = 32;
            array4[19] = -9;
            c(array3, new byte[] { 8, 89, 124, -23, 124, -17, 114, -74, -93, 114, 121, -124, 78, -113, -99, 106, -15, -44, 100, 123 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = -59;
            array6[1] = -115;
            array6[2] = 10;
            array6[3] = 109;
            c(array5, new byte[] { -56, -49, -107, -17, -106, -12, 26, 12 });
            ((f)this).c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
    
    public final boolean i() {
        final Random$Default default1 = kotlin.random.Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] f = Natives.a.f(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[26];
        array2[0] = -5;
        array2[1] = -86;
        array2[2] = -30;
        array2[3] = 127;
        array2[4] = 64;
        array2[5] = -46;
        array2[6] = -38;
        array2[7] = -65;
        array2[8] = -7;
        array2[9] = -20;
        array2[10] = -78;
        array2[11] = -109;
        array2[12] = 80;
        array2[13] = -112;
        array2[14] = 73;
        array2[15] = -99;
        array2[16] = 124;
        array2[17] = -14;
        array2[18] = -33;
        array2[19] = 67;
        array2[20] = -113;
        array2[21] = 66;
        array2[22] = -117;
        array2[23] = -39;
        array2[24] = -6;
        array2[25] = 21;
        c(array, new byte[] { -87, -87, -70, -12, 64, -122, -47, -45, -77, 110, -38, -35, 57, -84, 54, -43, 31, 103, -57, 17, -8, -11, -35, -97, -106, 121 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final Boolean a = ((f)this).a(f, first, first2, new String(array, utf_8).intern());
        if (a != null && a) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[22];
            array4[0] = 30;
            array4[1] = 116;
            array4[2] = -73;
            array4[3] = 63;
            array4[4] = 31;
            array4[5] = -28;
            array4[6] = 21;
            array4[7] = -119;
            array4[8] = 103;
            array4[9] = -124;
            array4[10] = 93;
            array4[11] = 121;
            array4[12] = 96;
            array4[13] = 74;
            array4[14] = -32;
            array4[15] = -86;
            array4[16] = -88;
            array4[17] = 21;
            array4[18] = 36;
            array4[19] = 76;
            array4[20] = 125;
            array4[21] = -74;
            c(array3, new byte[] { -114, -41, 6, 53, -115, 80, -118, -63, 25, -58, 65, 3, 41, -42, -98, -64, -13, 64, 96, 12, 19, -47 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = -122;
            array6[1] = -112;
            array6[2] = -93;
            array6[3] = 58;
            c(array5, new byte[] { 9, -77, -20, 70, 56, 55, -13, 54 });
            ((f)this).c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
    
    public final boolean j() {
        try {
            final ServerSocket serverSocket = new ServerSocket(27042);
            try {
                final byte[] array2;
                final byte[] array = array2 = new byte[9];
                array2[0] = 108;
                array2[1] = 94;
                array2[2] = 88;
                array2[3] = -41;
                array2[4] = 126;
                array2[5] = 88;
                array2[6] = 92;
                array2[7] = -91;
                array2[8] = 100;
                c(array, new byte[] { 23, 1, 81, -99, 41, 0, 73, -67, 16 });
                final Socket socket = new Socket(new String(array, StandardCharsets.UTF_8).intern(), 27042);
                try {
                    new ObjectOutputStream(socket.getOutputStream());
                    socket.close();
                    serverSocket.close();
                    return false;
                }
                finally {
                    try {
                        socket.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
            catch (final Exception ex) {}
            finally {
                try {
                    serverSocket.close();
                }
                finally {
                    final Throwable t3;
                    final Throwable t4;
                    t3.addSuppressed(t4);
                }
            }
        }
        catch (final Exception ex2) {
            return false;
        }
        catch (final BindException ex3) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[37];
            array4[0] = -6;
            array4[1] = 105;
            array4[2] = -93;
            array4[3] = 102;
            array4[4] = 71;
            array4[5] = -58;
            array4[6] = 33;
            array4[7] = -107;
            array4[8] = -101;
            array4[9] = -98;
            array4[10] = 65;
            array4[11] = -94;
            array4[12] = 13;
            array4[13] = 30;
            array4[14] = 62;
            array4[15] = 50;
            array4[16] = 101;
            array4[17] = -9;
            array4[18] = 120;
            array4[19] = 104;
            array4[20] = 78;
            array4[21] = 17;
            array4[22] = -2;
            array4[23] = -103;
            array4[24] = 17;
            array4[25] = 64;
            array4[26] = 23;
            array4[27] = -104;
            array4[28] = -36;
            array4[29] = 87;
            array4[30] = -86;
            array4[31] = 34;
            array4[32] = -106;
            array4[33] = -76;
            array4[34] = -21;
            array4[35] = 60;
            array4[36] = -117;
            c(array3, new byte[] { -86, -22, 0, -15, 63, 125, 127, -31, 12, -52, 78, -71, 121, 58, -112, 62, 40, 98, 49, 3, 66, 69, -50, -29, -121, 4, 120, -47, -48, -45, -28, 56, -7, -83, -101, 66, -71 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = -42;
            array6[1] = -61;
            array6[2] = 43;
            array6[3] = 51;
            c(array5, new byte[] { -71, -127, 116, 61, -58, -109, 20, -19 });
            ((f)this).b(intern, new String(array5, utf_8).intern());
            return true;
        }
    }
    
    public final boolean k() {
        final Random$Default default1 = kotlin.random.Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] o = Natives.a.o(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[34];
        array2[0] = 126;
        array2[1] = -77;
        array2[2] = 46;
        array2[3] = 97;
        array2[4] = 101;
        array2[5] = 9;
        array2[6] = 5;
        array2[7] = -125;
        array2[8] = 44;
        array2[9] = 20;
        array2[10] = -119;
        array2[11] = -39;
        array2[12] = -102;
        array2[13] = 49;
        array2[14] = -4;
        array2[15] = -29;
        array2[16] = 90;
        array2[17] = 75;
        array2[18] = 25;
        array2[19] = 35;
        array2[20] = 33;
        array2[21] = 60;
        array2[22] = 49;
        array2[23] = 85;
        array2[24] = 32;
        array2[25] = 93;
        array2[26] = 97;
        array2[27] = -80;
        array2[28] = 87;
        array2[29] = 2;
        array2[30] = -77;
        array2[31] = -23;
        array2[32] = 92;
        array2[33] = 4;
        c(array, new byte[] { 46, -112, 124, -11, 33, 50, -126, -44, 98, 33, -3, -97, 15, 46, -81, 110, 51, -2, -115, 62, 107, 30, 106, -24, 92, -2, 42, -64, 80, 53, 6, 112, 48, 104 });
        final int[] e = ((f)this).e(o, first, first2, new String(array, StandardCharsets.UTF_8).intern());
        if (e != null && e.length > 0) {
            ((f)this).a(e);
            return true;
        }
        return false;
    }
    
    public final boolean l() {
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = -47;
        array2[1] = 84;
        array2[2] = -104;
        array2[3] = 2;
        array2[4] = -100;
        array2[5] = -43;
        array2[6] = -81;
        array2[7] = 120;
        array2[8] = -49;
        array2[9] = 63;
        array2[10] = -28;
        array2[11] = -62;
        array2[12] = 66;
        array2[13] = 30;
        array2[14] = 65;
        array2[15] = 18;
        array2[16] = 98;
        c(array, new byte[] { -55, 5, 2, 10, -54, 117, -13, -2, -61, -32, -97, -114, 77, 1, 75, 88, 18 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String b = C1.b(new String(array, utf_8).intern());
        if (b != null && !b.isEmpty()) {
            final byte[] array3 = { -15 };
            c(array3, new byte[] { -5, 73, -88, 36, -122, -6, 18, -113 });
            for (final String s : b.split(new String(array3, utf_8).intern())) {
                final String trim = s.trim();
                final byte[] array5;
                final byte[] array4 = array5 = new byte[2];
                array5[0] = 95;
                array5[1] = 11;
                c(array4, new byte[] { 44, 103, 126, -99, 88, -33, 9, 49 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                if (!trim.startsWith(new String(array4, utf_9).intern())) {
                    if (!s.trim().isEmpty()) {
                        final String trim2 = s.trim();
                        final byte[] array7;
                        final byte[] array6 = array7 = new byte[3];
                        array7[0] = -55;
                        array7[1] = 92;
                        array7[2] = 32;
                        c(array6, new byte[] { -107, 47, 11, -78, 95, -21, 68, 65 });
                        final String[] split2 = trim2.split(new String(array6, utf_9).intern());
                        if (split2.length >= 10) {
                            final String s2 = split2[1];
                            final byte[] array8 = { -16 };
                            c(array8, new byte[] { -54, 72, -122, 45, 108, -123, 6, 66 });
                            final String s3 = s2.split(new String(array8, utf_9).intern())[0];
                            if (!s3.isEmpty()) {
                                final byte[] array10;
                                final byte[] array9 = array10 = new byte[8];
                                array10[0] = 52;
                                array10[1] = 36;
                                array10[2] = 123;
                                array10[3] = 71;
                                array10[4] = 50;
                                array10[5] = 11;
                                array10[6] = -77;
                                array10[7] = -89;
                                c(array9, new byte[] { 27, -27, 96, 94, 25, 11, -102, -56 });
                                if (s3.equalsIgnoreCase(new String(array9, utf_9).intern())) {
                                    final byte[] array12;
                                    final byte[] array11 = array12 = new byte[24];
                                    array12[0] = 109;
                                    array12[1] = 49;
                                    array12[2] = 63;
                                    array12[3] = -46;
                                    array12[4] = 120;
                                    array12[5] = -115;
                                    array12[6] = 120;
                                    array12[7] = -121;
                                    array12[8] = -39;
                                    array12[9] = 106;
                                    array12[10] = -8;
                                    array12[11] = 37;
                                    array12[12] = -44;
                                    array12[13] = -120;
                                    array12[14] = -58;
                                    array12[15] = -18;
                                    array12[16] = -126;
                                    array12[17] = 81;
                                    array12[18] = -97;
                                    array12[19] = 90;
                                    array12[20] = -86;
                                    array12[21] = 94;
                                    array12[22] = 11;
                                    array12[23] = -12;
                                    c(array11, new byte[] { 24, 18, 102, -101, 111, -63, 110, -57, -62, -33, -99, -20, -55, -54, -59, 113, -6, 76, 2, 39, -17, -8, -125, 109 });
                                    final String b2 = C1.b(new String(array11, utf_9).intern());
                                    if (b2 != null && !b2.isEmpty()) {
                                        final byte[] array14;
                                        final byte[] array13 = array14 = new byte[18];
                                        array14[0] = -127;
                                        array14[1] = 31;
                                        array14[2] = -94;
                                        array14[3] = 51;
                                        array14[4] = -21;
                                        array14[5] = 91;
                                        array14[6] = 121;
                                        array14[7] = -79;
                                        array14[8] = -102;
                                        array14[9] = 44;
                                        array14[10] = -88;
                                        array14[11] = 80;
                                        array14[12] = 9;
                                        array14[13] = 78;
                                        array14[14] = -14;
                                        array14[15] = -45;
                                        array14[16] = -34;
                                        array14[17] = 43;
                                        c(array13, new byte[] { 9, 77, -39, 68, -60, 4, 33, -34, -1, 21, -30, 24, 113, -5, -107, -116, -69, 89 });
                                        final String intern = new String(array13, utf_9).intern();
                                        final byte[] array16;
                                        final byte[] array15 = array16 = new byte[4];
                                        array16[0] = 38;
                                        array16[1] = 125;
                                        array16[2] = -16;
                                        array16[3] = -118;
                                        c(array15, new byte[] { 105, -33, -102, -42, 13, 43, 48, 93 });
                                        ((f)this).b(intern, new String(array15, utf_9).intern());
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
