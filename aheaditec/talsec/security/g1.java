package com.aheaditec.talsec.security;

import java.util.Map;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import android.os.Process;
import android.app.ActivityManager$AppTask;
import android.app.ActivityManager;
import android.content.IntentFilter;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.nio.charset.StandardCharsets;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class G1 extends BroadcastReceiver implements C0
{
    public static final a f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final long j = 3000L;
    public final boolean a;
    public final Context b;
    public final LocalBroadcastManager c;
    public final ConcurrentHashMap<String, Runnable> d;
    public final Handler e;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = 122;
        array2[1] = 123;
        array2[2] = 3;
        array2[3] = 55;
        array2[4] = -32;
        array2[5] = 96;
        array2[6] = -66;
        array2[7] = 68;
        array2[8] = 18;
        array2[9] = 15;
        array2[10] = -49;
        array2[11] = 1;
        a(array, new byte[] { -126, 78, -57, -112, 5, 33, 111, -15, -22, 33, 122, -84 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        i = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[9];
        array4[0] = -83;
        array4[1] = 104;
        array4[2] = -87;
        array4[3] = -92;
        array4[4] = -27;
        array4[5] = -66;
        array4[6] = 107;
        array4[7] = -2;
        array4[8] = 124;
        a(array3, new byte[] { 64, 83, 17, 21, -26, -116, -40, 72, 61 });
        h = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[11];
        array6[0] = -49;
        array6[1] = -46;
        array6[2] = -27;
        array6[3] = 87;
        array6[4] = 17;
        array6[5] = 107;
        array6[6] = 47;
        array6[7] = 88;
        array6[8] = -27;
        array6[9] = -31;
        array6[10] = 93;
        a(array5, new byte[] { 55, -4, 91, -30, -8, 91, -2, -13, -85, -89, 18 });
        g = new String(array5, utf_8).intern();
        f = new a(null);
    }
    
    public G1(final boolean a, final Context b) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 107;
        array2[1] = 70;
        array2[2] = -24;
        array2[3] = -2;
        array2[4] = -68;
        array2[5] = -9;
        array2[6] = -120;
        a(array, new byte[] { 108, 27, 8, 40, -39, -113, -4, 13 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)b, new String(array, utf_8).intern());
        this.a = a;
        this.b = b;
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(b);
        final byte[] array4;
        final byte[] array3 = array4 = new byte[16];
        array4[0] = 80;
        array4[1] = -87;
        array4[2] = 22;
        array4[3] = 124;
        array4[4] = 20;
        array4[5] = 33;
        array4[6] = -69;
        array4[7] = -42;
        array4[8] = -104;
        array4[9] = -84;
        array4[10] = -48;
        array4[11] = -117;
        array4[12] = 29;
        array4[13] = -2;
        array4[14] = 77;
        array4[15] = 89;
        a(array3, new byte[] { 91, -6, -16, -41, 6, 64, 93, 21, -118, -3, 7, 1, -49, -27, -19, -46 });
        Intrinsics.checkNotNullExpressionValue((Object)instance, new String(array3, utf_8).intern());
        this.c = instance;
        this.d = (ConcurrentHashMap<String, Runnable>)new ConcurrentHashMap();
        this.e = new Handler(Looper.getMainLooper());
        final byte[] array6;
        final byte[] array5 = array6 = new byte[11];
        array6[0] = 80;
        array6[1] = -90;
        array6[2] = -68;
        array6[3] = -84;
        array6[4] = -104;
        array6[5] = -70;
        array6[6] = 77;
        array6[7] = -59;
        array6[8] = 28;
        array6[9] = 114;
        array6[10] = -28;
        a(array5, new byte[] { -88, -120, 2, 25, 113, -118, -100, 110, 82, 52, -85 });
        instance.registerReceiver((BroadcastReceiver)this, new IntentFilter(new String(array5, utf_8).intern()));
    }
    
    public static final void a(final String s, final G1 g1) {
        final byte[] array2;
        final byte[] array = array2 = new byte[11];
        array2[0] = -81;
        array2[1] = -120;
        array2[2] = -114;
        array2[3] = -79;
        array2[4] = 2;
        array2[5] = -21;
        array2[6] = 69;
        array2[7] = -90;
        array2[8] = -79;
        array2[9] = -116;
        array2[10] = -66;
        a(array, new byte[] { 103, -23, 84, 101, 11, -92, -93, 22, -48, -31, -37 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)s, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = -81;
        array4[1] = 101;
        array4[2] = 118;
        array4[3] = -88;
        array4[4] = -127;
        array4[5] = -24;
        a(array3, new byte[] { -73, 51, -83, 125, -91, -40, 96, 94 });
        Intrinsics.checkNotNullParameter((Object)g1, new String(array3, utf_8).intern());
        final byte[] array6;
        final byte[] array5 = array6 = new byte[12];
        array6[0] = -110;
        array6[1] = -35;
        array6[2] = 115;
        array6[3] = -122;
        array6[4] = -117;
        array6[5] = 17;
        array6[6] = -17;
        array6[7] = 22;
        array6[8] = -95;
        array6[9] = -84;
        array6[10] = -103;
        array6[11] = 56;
        a(array5, new byte[] { 106, -24, -73, 33, 110, 80, 62, -93, 89, -126, 44, -107 });
        new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[44];
        array8[0] = -53;
        array8[1] = -119;
        array8[2] = -18;
        array8[3] = -61;
        array8[4] = -75;
        array8[5] = 27;
        array8[6] = -42;
        array8[7] = 108;
        array8[8] = 78;
        array8[9] = 22;
        array8[10] = 124;
        array8[11] = -34;
        array8[12] = 1;
        array8[13] = 84;
        array8[14] = -101;
        array8[15] = -26;
        array8[16] = -80;
        array8[17] = 60;
        array8[18] = -122;
        array8[19] = 97;
        array8[20] = 39;
        array8[21] = -36;
        array8[22] = 25;
        array8[23] = -26;
        array8[24] = 59;
        array8[25] = -8;
        array8[26] = 61;
        array8[27] = 15;
        array8[28] = -8;
        array8[29] = 37;
        array8[30] = 94;
        array8[31] = -83;
        array8[32] = -118;
        array8[33] = 110;
        array8[34] = 47;
        array8[35] = -54;
        array8[36] = -9;
        array8[37] = -26;
        array8[38] = -94;
        array8[39] = 59;
        array8[41] = (array8[40] = -82);
        array8[42] = -57;
        array8[43] = -65;
        a(array7, new byte[] { 45, -17, 12, 0, -94, 122, 68, -86, 71, 116, -85, 27, 25, 7, 77, 101, 116, 7, 103, -29, 33, -68, -8, 37, 51, -87, -18, -38, -32, 43, -70, 106, -115, 61, -12, 18, -2, -76, 48, -13, -67, -50, 107, 61 });
        final String intern = new String(array7, utf_8).intern();
        final byte[] array10;
        final byte[] array9 = array10 = new byte[9];
        array10[0] = -13;
        array10[1] = -36;
        array10[2] = -124;
        array10[3] = -112;
        array10[4] = 84;
        array10[5] = -128;
        array10[6] = 107;
        array10[7] = -103;
        array10[8] = -5;
        a(array9, new byte[] { 55, -118, 100, 18, 76, -41, -76, 94, -43 });
        new StringBuilder().append(intern).append(s).append(new String(array9, utf_8).intern()).toString();
        if (g1.a) {
            g1.b();
        }
        g1.d.remove((Object)s);
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n3 = 0;
        int n2 = n3 = 0;
        int n4 = -894652659;
        byte[] array4 = null;
    Label_0545:
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
                    break Label_0545;
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
    
    public void a(final String s) {
        final byte[] array2;
        final byte[] array = array2 = new byte[10];
        array2[0] = -44;
        array2[1] = 26;
        array2[2] = -74;
        array2[3] = 109;
        array2[4] = -47;
        array2[5] = 48;
        array2[6] = 84;
        array2[7] = 95;
        array2[8] = 59;
        array2[9] = 1;
        a(array, new byte[] { -52, 76, 82, -86, -44, 82, -108, -100, 86, 100 });
        Intrinsics.checkNotNullParameter((Object)s, new String(array, StandardCharsets.UTF_8).intern());
        final G1$$ExternalSyntheticLambda0 g1$$ExternalSyntheticLambda0 = new G1$$ExternalSyntheticLambda0(s, this);
        ((Map)this.d).put((Object)s, (Object)g1$$ExternalSyntheticLambda0);
        this.e.postDelayed((Runnable)g1$$ExternalSyntheticLambda0, 3000L);
    }
    
    public final void b() {
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = -47;
        array2[1] = -6;
        array2[2] = -86;
        array2[3] = -119;
        array2[4] = 92;
        array2[5] = 53;
        array2[6] = 41;
        array2[7] = -119;
        array2[8] = 82;
        array2[9] = 32;
        array2[10] = 92;
        array2[11] = 50;
        a(array, new byte[] { 41, -49, 110, 46, -71, 116, -8, 60, -86, 14, -23, -97 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[43];
        array4[0] = -123;
        array4[1] = 1;
        array4[2] = -5;
        array4[3] = 38;
        array4[4] = 15;
        array4[5] = -70;
        array4[6] = 11;
        array4[7] = -73;
        array4[8] = 92;
        array4[9] = -4;
        array4[10] = -36;
        array4[11] = 52;
        array4[12] = -107;
        array4[13] = 70;
        array4[14] = 62;
        array4[15] = 44;
        array4[16] = 98;
        array4[17] = 91;
        array4[18] = 9;
        array4[19] = -40;
        array4[20] = 104;
        array4[21] = 37;
        array4[22] = -57;
        array4[23] = -95;
        array4[24] = 58;
        array4[25] = -51;
        array4[26] = 16;
        array4[27] = 11;
        array4[28] = -49;
        array4[29] = -47;
        array4[30] = -16;
        array4[31] = -86;
        array4[32] = -46;
        array4[33] = -23;
        array4[34] = 56;
        array4[35] = 127;
        array4[36] = 14;
        array4[37] = 27;
        array4[38] = -4;
        array4[39] = -12;
        array4[40] = 11;
        array4[41] = 88;
        array4[42] = -61;
        a(array3, new byte[] { 105, 79, 19, -31, -53, -37, -22, 53, 83, -85, 2, -6, 81, 39, -28, -21, -90, 26, -38, 22, 127, 118, 18, 35, -46, -97, -49, -38, 11, -1, 18, 120, -62, -66, -19, -68, 22, 76, 29, 36, 42, 121, -30 });
        new String(array3, utf_8).intern();
        final Context b = this.b;
        final byte[] array6;
        final byte[] array5 = array6 = new byte[8];
        array6[0] = -110;
        array6[1] = -23;
        array6[2] = -115;
        array6[3] = -107;
        array6[4] = -119;
        array6[5] = 17;
        array6[6] = -84;
        array6[7] = 10;
        a(array5, new byte[] { -105, -72, 107, 94, -109, 70, 74, -47 });
        final Object systemService = b.getSystemService(new String(array5, utf_8).intern());
        ActivityManager activityManager;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager)systemService;
        }
        else {
            activityManager = null;
        }
        if (activityManager != null) {
            final List appTasks = activityManager.getAppTasks();
            if (appTasks != null) {
                final Iterator iterator = ((Iterable)appTasks).iterator();
                while (iterator.hasNext()) {
                    ((ActivityManager$AppTask)iterator.next()).finishAndRemoveTask();
                }
            }
        }
        try {
            System.exit(0);
            final byte[] array8;
            final byte[] array7 = array8 = new byte[65];
            array8[0] = 37;
            array8[1] = -73;
            array8[2] = -46;
            array8[3] = -30;
            array8[4] = 35;
            array8[5] = 127;
            array8[6] = 32;
            array8[7] = 44;
            array8[8] = -5;
            array8[9] = -89;
            array8[10] = -105;
            array8[11] = -24;
            array8[12] = 76;
            array8[13] = -28;
            array8[14] = -65;
            array8[15] = -15;
            array8[16] = 80;
            array8[17] = 17;
            array8[18] = 86;
            array8[19] = -89;
            array8[20] = -27;
            array8[21] = -25;
            array8[22] = 110;
            array8[23] = 121;
            array8[24] = 92;
            array8[25] = 60;
            array8[26] = -124;
            array8[27] = 81;
            array8[28] = 75;
            array8[29] = -46;
            array8[30] = -43;
            array8[31] = 67;
            array8[32] = 86;
            array8[33] = -43;
            array8[34] = 2;
            array8[35] = -31;
            array8[36] = -74;
            array8[37] = -118;
            array8[38] = 91;
            array8[39] = 101;
            array8[40] = -20;
            array8[41] = 62;
            array8[42] = -63;
            array8[43] = 103;
            array8[44] = -10;
            array8[45] = -21;
            array8[46] = 55;
            array8[47] = 90;
            array8[48] = 19;
            array8[49] = 68;
            array8[50] = -109;
            array8[51] = -96;
            array8[52] = -103;
            array8[53] = 29;
            array8[54] = 34;
            array8[55] = -33;
            array8[56] = -26;
            array8[57] = -2;
            array8[58] = -118;
            array8[59] = -33;
            array8[60] = -105;
            array8[61] = 96;
            array8[62] = 124;
            array8[63] = 66;
            array8[64] = -94;
            a(array7, new byte[] { -46, -47, 55, 52, 42, 36, -128, -21, -25, -16, 113, 106, 90, -73, 89, 38, 70, 77, -127, 97, 33, -68, -113, -83, 77, 115, 90, -97, 86, -56, 71, -102, 90, -126, -36, 38, 114, -36, -67, -25, -9, 113, 36, -27, -31, -120, -43, -120, 0, 37, 68, 102, 93, 124, -61, 93, -22, -79, 84, 9, 83, 87, -76, -19, -116 });
            throw new RuntimeException(new String(array7, StandardCharsets.UTF_8).intern());
        }
        catch (final Exception ex) {}
        finally {
            Process.killProcess(Process.myPid());
        }
    }
    
    public final void c() {
        this.c.unregisterReceiver((BroadcastReceiver)this);
        this.e.removeCallbacksAndMessages((Object)null);
        this.d.clear();
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = 63;
        array2[1] = -51;
        array2[2] = -21;
        array2[3] = -48;
        array2[4] = 20;
        array2[5] = -126;
        array2[6] = 104;
        array2[7] = 10;
        array2[8] = 39;
        array2[9] = 41;
        array2[10] = 108;
        array2[11] = -9;
        a(array, new byte[] { -57, -8, 47, 119, -15, -61, -71, -65, -33, 7, -39, 90 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[46];
        array4[0] = -50;
        array4[1] = 20;
        array4[2] = 118;
        array4[3] = 92;
        array4[4] = -10;
        array4[5] = -112;
        array4[6] = 23;
        array4[7] = 1;
        array4[8] = -48;
        array4[9] = -64;
        array4[10] = 48;
        array4[11] = -104;
        array4[12] = 22;
        array4[13] = 43;
        array4[14] = -90;
        array4[15] = 24;
        array4[16] = 48;
        array4[17] = -20;
        array4[18] = -63;
        array4[19] = 49;
        array4[20] = -33;
        array4[21] = -93;
        array4[22] = 16;
        array4[23] = -118;
        array4[24] = -31;
        array4[25] = 71;
        array4[26] = 39;
        array4[27] = -17;
        array4[28] = 20;
        array4[29] = 33;
        array4[30] = 77;
        array4[31] = -41;
        array4[32] = -68;
        array4[33] = -67;
        array4[34] = 25;
        array4[35] = 36;
        array4[36] = -4;
        array4[37] = -97;
        array4[38] = -76;
        array4[39] = -106;
        array4[40] = -53;
        array4[41] = -108;
        array4[42] = -30;
        array4[43] = 70;
        array4[44] = 32;
        array4[45] = -128;
        a(array3, new byte[] { 54, 65, -110, -101, -13, -14, -46, -41, -43, -111, -19, 26, 0, 120, 115, -33, 61, -120, 22, -27, 27, -63, -16, 94, -24, 18, -4, 58, 12, 114, -87, 16, -76, -77, -4, -13, -5, -50, 99, 67, -36, -64, 5, -120, 76, -7 });
        new String(array3, utf_8).intern();
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = -6;
            array2[1] = -56;
            array2[2] = -111;
            array2[3] = -59;
            array2[4] = 6;
            array2[5] = -128;
            array2[6] = -69;
            array2[7] = 80;
            array2[8] = 91;
            a(array, new byte[] { 23, -13, 41, 116, 5, -78, 8, -26, 26 });
            final String stringExtra = intent.getStringExtra(new String(array, StandardCharsets.UTF_8).intern());
            if (stringExtra != null) {
                final Runnable runnable = (Runnable)this.d.get((Object)stringExtra);
                if (runnable != null) {
                    this.e.removeCallbacks(runnable);
                    this.d.remove((Object)stringExtra);
                }
            }
        }
    }
    
    public static final class a
    {
        public a() {
        }
        
        public a(final DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
