package com.aheaditec.talsec.security;

import android.content.pm.PackageManager;
import java.util.Collection;
import android.view.MotionEvent;
import android.view.InputEvent;
import java.util.Iterator;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import android.content.Context;
import java.util.Set;

public final class T0 extends f
{
    public static final String r;
    public static final String s;
    public static final long t = 5000L;
    public Set<String> l;
    public final Context m;
    public final boolean n;
    public long o;
    public List<String> p;
    public boolean q;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[38];
        array2[0] = -21;
        array2[1] = 8;
        array2[2] = 56;
        array2[3] = 65;
        array2[4] = 48;
        array2[5] = 117;
        array2[6] = 87;
        array2[7] = 4;
        array2[8] = 76;
        array2[9] = 123;
        array2[10] = -94;
        array2[11] = -51;
        array2[12] = 73;
        array2[13] = -85;
        array2[14] = 20;
        array2[15] = -49;
        array2[16] = -120;
        array2[17] = -22;
        array2[18] = -37;
        array2[19] = -125;
        array2[20] = -59;
        array2[21] = -24;
        array2[22] = 67;
        array2[23] = 80;
        array2[24] = 65;
        array2[25] = 49;
        array2[26] = -56;
        array2[27] = -23;
        array2[28] = -98;
        array2[29] = -84;
        array2[30] = -121;
        array2[31] = 119;
        array2[32] = 5;
        array2[33] = 35;
        array2[34] = -119;
        array2[35] = -121;
        array2[36] = -92;
        array2[37] = 116;
        b(array, new byte[] { -18, 84, -18, -107, 35, 34, -127, -108, 88, 40, 70, 2, 68, -54, -15, 4, -101, -74, 123, 54, 56, -88, -123, -9, -80, 125, 123, 71, 119, -109, 65, -74, -2, 21, 73, 33, -21, 35 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        s = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[7];
        array4[0] = -56;
        array4[1] = -62;
        array4[2] = -23;
        array4[3] = 5;
        array4[4] = 126;
        array4[5] = 98;
        array4[6] = 104;
        b(array3, new byte[] { -37, -90, 62, -47, 18, 3, 17, 45 });
        r = new String(array3, utf_8).intern();
    }
    
    public T0(final R0 r0, final Context m) {
        super(r0);
        this.l = (Set<String>)new HashSet();
        this.o = 0L;
        this.p = (List<String>)new ArrayList();
        this.q = true;
        this.m = m;
        this.n = r0.b();
    }
    
    private static void b(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n3 = 0;
        int n2 = n3 = 0;
        int n4 = -894652659;
        byte[] array4 = null;
    Label_0519:
        while (true) {
            final int n5 = (n4 & 0x1000000) * (n4 | 0x1000000) + (n4 & 0xFEFFFFFF) * (~n4 & 0x1000000);
            final int n6 = n4 >>> 8;
            final int n7 = n6 + n5 - (n6 & n5);
            final int n8 = (n7 ^ 0x56E7650F) + (n7 & 0x56E7650F) * 2;
            boolean b = true;
            final int n9 = 1;
            switch (n8 - 1434379843 + (~n8 & 0x557EE643) * 2) {
                default: {
                    n4 = 196573321;
                    continue;
                }
                case 1888416065: {
                    final int n10 = array4.length % 4;
                    final long n11 = lcmp((long)n10, (long)1) >>> 31 & 0x1;
                    if (n11 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 1298988808;
                    }
                    n3 = n10;
                    if (n11 != 0) {
                        n3 = n10;
                        break;
                    }
                    continue;
                }
                case 835516413: {
                    final int length = array.length;
                    final int n12 = 0 - (0 - array.length % 4);
                    int n13 = n9;
                    if ((length ^ n12) - (~length & n12) * 2 <= 0) {
                        n13 = 0;
                    }
                    if (n13 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 145880015;
                    }
                    if (n13 != 0) {
                        n4 = -826922365;
                    }
                    array3 = array2;
                    array4 = array;
                    n2 = 0;
                    continue;
                }
                case 614184219: {
                    final int length2 = array4.length;
                    final int n14 = 0 - n;
                    final int a = N.a(n14, -4, 1, length2);
                    final int length3 = array4.length;
                    final byte b2 = array4[(length3 ^ n14) + (length3 & n14) * 2];
                    final int length4 = array4.length;
                    final int n15 = 0 - n14;
                    final byte b3 = array3[(~n15 & length4) * 2 - (length4 ^ n15)];
                    array4[L.a(0, (length2 & 0x2) | a, n14 * 3, 1)] = (byte)((byte)((byte)b3 + (byte)b2) - (byte)((byte)2 * (byte)(b3 & b2)));
                    final int n16 = (0xEBDA5001 | n) + (0x1425AFFE | n);
                    final long n17 = lcmp((long)n, (long)2) >>> 31 & 0x1;
                    if (n17 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 1298988808;
                    }
                    n3 = n16;
                    if (n17 != 0) {
                        n3 = n16;
                        break;
                    }
                    continue;
                }
                case 172635213: {
                    final int length5 = array4.length;
                    final int n18 = 0 - n3;
                    if (dcmpg((double)array3[(length5 ^ n18) + (length5 & n18) * 2], Double.NaN) <= -1) {
                        b = false;
                    }
                    if (b) {
                        n4 = -34715366;
                    }
                    else {
                        n4 = 196573321;
                    }
                    n = n3;
                    continue;
                }
                case -625567707: {
                    break Label_0519;
                }
                case -1882653318: {
                    final int n19 = n2 - 1 - (n2 | 0xFFFFFFFC);
                    final byte b4 = array3[n19];
                    final int n20 = (b4 & 0x1000000) * (b4 | 0x1000000) + (b4 & 0xFEFFFFFF) * (~b4 & 0x1000000);
                    final int n21 = n2 + 3 + (-1 - n2 | 0xFFFFFFFD);
                    final int n22 = array3[n21] & 0xFF;
                    final int n23 = n22 * (~n22 & 0x10000);
                    final int n24 = ~((n20 | (0x45BCA602 | ~n23)) - ((n23 & 0x45BCA602) | n20));
                    final int a2 = K.a(0x29123D34 & n2, n2, 1, 0x29123D35 & n2);
                    final int n25 = array3[a2] & 0xFF;
                    final int n26 = (~n24 & n25 * (~n25 & 0x100)) + n24;
                    final int n27 = n26 - 1 - (~(array3[n2] & 0xFF) | n26);
                    final byte b5 = array4[n19];
                    final int n28 = (b5 & 0x1000000) * (b5 | 0x1000000) + (0xFEFFFFFF & b5) * (~b5 & 0x1000000);
                    final int n29 = array4[n21] & 0xFF;
                    final int n30 = n29 * (~n29 & 0x10000);
                    final int n31 = ~((n28 | (~n30 | 0xE56F6087)) - ((n30 & 0xE56F6087) | n28));
                    final int n32 = array4[a2] & 0xFF;
                    final int n33 = n32 * (~n32 & 0x100);
                    final int n34 = array4[n2] & 0xFF;
                    final int n35 = (n33 + n31 - (n33 & n31) & ~n34) + n34;
                    final int n36 = n27 << (dcmpg((double)n27, Double.NaN) >>> 31);
                    final int n37 = n36 + n35 - (n36 & n35) * 2;
                    final int n38 = 659933421 - ((n37 & 0x2) | -1983400303 - n37);
                    array4[n2] = (byte)n38;
                    array4[a2] = (byte)(n38 >>> 8);
                    array4[n21] = (byte)(n38 >>> 16);
                    array4[n19] = (byte)(n38 >>> 24);
                    n2 = (n2 ^ 0x4) + (n2 & 0x4) * 2;
                    final int length6 = array4.length;
                    final int n39 = 0 - array4.length % 4;
                    final long n40 = lcmp((long)n2, (long)((length6 ^ n39) + (length6 & n39) * 2)) >>> 31 & 0x1;
                    if (n40 != 0) {
                        n4 = 196573321;
                    }
                    else {
                        n4 = 145880015;
                    }
                    if (n40 == 0) {
                        continue;
                    }
                    n4 = -826922365;
                    continue;
                }
                case -1970406716: {
                    final int length7 = array4.length;
                    final int n41 = 0 - n;
                    final int n42 = ~n41;
                    final int n43 = (length7 | n41) - (0x23ED3929 & n42 & length7) + ((n41 | 0x23ED3929) & length7);
                    final byte b6 = array3[n43];
                    final int length8 = array4.length;
                    final byte b7 = array3[(length8 ^ n42) + (n41 | length8) * 2 + 1];
                    final int n44 = (byte)0 - (byte)b6;
                    array3[n43] = (byte)((byte)((byte)2 * (byte)(b7 & ~n44)) - (byte)(b7 ^ n44));
                    n4 = -34715366;
                    continue;
                }
            }
            n4 = -518432968;
        }
    }
    
    public final String a(final int n) {
        String s;
        if (this.a(n, 1)) {
            final byte[] array2;
            final byte[] array = array2 = new byte[23];
            array2[0] = 122;
            array2[1] = -92;
            array2[2] = 86;
            array2[3] = -56;
            array2[4] = -100;
            array2[5] = -26;
            array2[6] = 59;
            array2[7] = -127;
            array2[8] = 25;
            array2[9] = -90;
            array2[10] = 112;
            array2[11] = 47;
            array2[12] = -115;
            array2[13] = -9;
            array2[14] = -22;
            array2[15] = -57;
            array2[16] = 100;
            array2[17] = -103;
            array2[18] = -35;
            array2[19] = -123;
            array2[20] = 114;
            array2[21] = -120;
            array2[22] = 121;
            b(array, new byte[] { -112, -99, -27, 97, -97, -93, -128, 49, -15, -102, -71, -18, 96, -73, 59, 118, -126, -39, 104, 50, 32, -51, 61 });
            s = new String(array, StandardCharsets.UTF_8);
        }
        else {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[33];
            array4[0] = 4;
            array4[1] = -1;
            array4[2] = 54;
            array4[3] = 98;
            array4[4] = -21;
            array4[5] = 25;
            array4[6] = 108;
            array4[7] = -40;
            array4[8] = -123;
            array4[9] = 23;
            array4[10] = 50;
            array4[11] = 65;
            array4[12] = 113;
            array4[13] = -93;
            array4[14] = 33;
            array4[15] = 53;
            array4[16] = -19;
            array4[17] = 13;
            array4[18] = 84;
            array4[19] = -29;
            array4[20] = -33;
            array4[21] = -97;
            array4[22] = -101;
            array4[23] = -43;
            array4[24] = -90;
            array4[25] = 60;
            array4[26] = -49;
            array4[27] = 33;
            array4[28] = -57;
            array4[29] = -1;
            array4[30] = -27;
            array4[31] = -120;
            array4[32] = 9;
            b(array3, new byte[] { -18, -58, -123, -53, -24, 92, -41, 104, 109, 43, -5, -128, -100, -29, -16, -121, 8, 50, -110, 72, 58, -90, 37, 110, -91, 1, 123, -108, 32, -67, 33, 47, 77 });
            s = new String(array3, StandardCharsets.UTF_8);
        }
        return s.intern();
    }
    
    public final List<String> a(final List<PackageInfo> list) {
        final ArrayList list2 = new ArrayList(30);
    Label_0018:
        for (final PackageInfo packageInfo : list) {
            final String[] requestedPermissions = packageInfo.requestedPermissions;
            if (requestedPermissions != null && requestedPermissions.length > 0) {
                int n = 0;
                while (true) {
                    final String[] requestedPermissions2 = packageInfo.requestedPermissions;
                    if (n >= requestedPermissions2.length) {
                        continue Label_0018;
                    }
                    final String s = requestedPermissions2[n];
                    final byte[] array2;
                    final byte[] array = array2 = new byte[38];
                    array2[0] = 58;
                    array2[1] = -4;
                    array2[2] = -125;
                    array2[3] = 103;
                    array2[4] = 1;
                    array2[5] = 78;
                    array2[6] = 26;
                    array2[7] = 5;
                    array2[8] = -6;
                    array2[9] = 37;
                    array2[10] = 60;
                    array2[11] = -111;
                    array2[12] = -107;
                    array2[13] = 42;
                    array2[14] = 7;
                    array2[15] = 102;
                    array2[16] = 29;
                    array2[17] = 111;
                    array2[18] = 27;
                    array2[19] = 100;
                    array2[20] = 23;
                    array2[21] = 119;
                    array2[22] = 96;
                    array2[23] = 57;
                    array2[24] = -103;
                    array2[25] = 28;
                    array2[26] = 80;
                    array2[27] = -124;
                    array2[28] = -112;
                    array2[29] = 7;
                    array2[30] = 62;
                    array2[31] = -49;
                    array2[32] = 107;
                    array2[33] = -43;
                    array2[34] = 7;
                    array2[35] = -45;
                    array2[36] = -38;
                    array2[37] = -33;
                    b(array, new byte[] { 63, -96, 85, -77, 18, 25, -52, -107, -18, 118, -40, 94, -104, 75, -30, -83, 14, 51, -69, -47, -22, 55, -90, -98, 104, 80, -29, 42, 121, 56, -8, 14, -112, -29, -57, 117, -107, -120 });
                    if (s.equals((Object)new String(array, StandardCharsets.UTF_8).intern())) {
                        break;
                    }
                    ++n;
                }
                final int[] requestedPermissionsFlags = packageInfo.requestedPermissionsFlags;
                if (requestedPermissionsFlags == null || (requestedPermissionsFlags[n] & 0x2) == 0x0) {
                    continue;
                }
                list2.add((Object)packageInfo.packageName);
            }
        }
        return (List<String>)list2;
    }
    
    public void a(final Context context) {
    }
    
    public final boolean a(final int n, final int n2) {
        return (n & n2) == n2;
    }
    
    public boolean a(final InputEvent inputEvent) {
        boolean a;
        if (inputEvent instanceof MotionEvent) {
            a = this.a((MotionEvent)inputEvent);
        }
        else {
            final byte[] array2;
            final byte[] array = array2 = new byte[10];
            array2[0] = 118;
            array2[1] = 65;
            array2[2] = -19;
            array2[3] = -112;
            array2[4] = -71;
            array2[5] = -73;
            array2[6] = 36;
            array2[7] = 3;
            array2[8] = 100;
            array2[9] = -116;
            b(array, new byte[] { 123, 32, 44, 84, -82, -26, -61, -41, 1, -24 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String intern = new String(array, utf_8).intern();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[28];
            array4[0] = 55;
            array4[1] = 107;
            array4[2] = 90;
            array4[3] = -86;
            array4[4] = 34;
            array4[5] = -53;
            array4[6] = -118;
            array4[7] = 108;
            array4[8] = -71;
            array4[9] = -120;
            array4[10] = -1;
            array4[11] = -3;
            array4[12] = -98;
            array4[13] = 1;
            array4[14] = -72;
            array4[15] = 17;
            array4[16] = 123;
            array4[17] = -93;
            array4[18] = 54;
            array4[19] = -35;
            array4[20] = 60;
            array4[21] = -93;
            array4[22] = -66;
            array4[23] = 36;
            array4[24] = 75;
            array4[25] = 38;
            array4[26] = -116;
            array4[27] = 27;
            b(array3, new byte[] { -50, 48, -121, 122, 49, -82, 106, -18, -95, -17, 29, 58, 90, 93, 96, -109, 118, -1, -44, 10, 36, -83, 105, -4, 66, 122, 106, -117 });
            this.a(intern, new String(array3, utf_8).intern());
            a = false;
        }
        final X x = new X(true, a ^ true, true);
        final byte[] array6;
        final byte[] array5 = array6 = new byte[7];
        array6[0] = 50;
        array6[1] = 22;
        array6[2] = -96;
        array6[3] = 118;
        array6[4] = -101;
        array6[5] = 67;
        array6[6] = -10;
        b(array5, new byte[] { 33, 114, 119, -94, -9, 34, -113, 106 });
        final Charset utf_9 = StandardCharsets.UTF_8;
        this.a(new String(array5, utf_9).intern(), x);
        if (x.c()) {
            final byte[] array8;
            final byte[] array7 = array8 = new byte[7];
            array8[0] = -89;
            array8[1] = -69;
            array8[2] = -22;
            array8[3] = -117;
            array8[4] = 22;
            array8[5] = 7;
            array8[6] = 24;
            b(array7, new byte[] { -76, -33, 61, 95, 122, 102, 97, 2 });
            this.c(new String(array7, utf_9).intern());
        }
        return a;
    }
    
    public final boolean a(final MotionEvent motionEvent) {
        if (!this.a(motionEvent.getFlags(), 1) && !this.a(motionEvent.getFlags(), 2)) {
            return false;
        }
        if (this.n) {
            if (this.e()) {
                this.p = this.b(this.m);
            }
            final HashSet set = new HashSet((Collection)this.p);
            if (!this.l.equals(set)) {
                this.l = (Set<String>)set;
                final byte[] array2;
                final byte[] array = array2 = new byte[21];
                array2[0] = -94;
                array2[1] = -128;
                array2[2] = -32;
                array2[3] = 35;
                array2[4] = 14;
                array2[5] = -122;
                array2[6] = 82;
                array2[7] = 62;
                array2[8] = 15;
                array2[9] = -117;
                array2[10] = -9;
                array2[11] = 56;
                array2[12] = 117;
                array2[13] = -55;
                array2[14] = 65;
                array2[15] = -105;
                array2[16] = -69;
                array2[17] = -123;
                array2[18] = -5;
                array2[19] = 113;
                array2[20] = -11;
                b(array, new byte[] { -81, -31, 33, -25, 25, -41, -75, -22, 6, -39, 72, -23, 109, -98, -96, 71, 82, -26, 44, -95, -127 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                this.c(new String(array, utf_8).intern(), this.a(motionEvent.getFlags()));
                final byte[] array4;
                final byte[] array3 = array4 = new byte[20];
                array4[0] = -89;
                array4[1] = 17;
                array4[2] = -127;
                array4[3] = 102;
                array4[4] = -111;
                array4[5] = -104;
                array4[6] = 123;
                array4[7] = -121;
                array4[8] = 58;
                array4[9] = 77;
                array4[10] = 2;
                array4[11] = 32;
                array4[12] = -119;
                array4[13] = -11;
                array4[14] = 83;
                array4[15] = 125;
                array4[16] = -28;
                array4[17] = -77;
                array4[18] = 71;
                array4[19] = -78;
                b(array3, new byte[] { -76, 117, 86, -78, -127, -41, -112, 44, 40, 44, -28, -29, -103, -81, -124, -69, 1, -18, -91, 103 });
                this.a(new String(array3, utf_8).intern(), (List)this.p);
            }
        }
        else if (this.q) {
            this.q = false;
            final byte[] array6;
            final byte[] array5 = array6 = new byte[21];
            array6[0] = 40;
            array6[1] = 88;
            array6[2] = 48;
            array6[3] = 9;
            array6[4] = 89;
            array6[5] = 44;
            array6[6] = 24;
            array6[7] = -43;
            array6[8] = 61;
            array6[9] = -106;
            array6[10] = 72;
            array6[11] = -93;
            array6[12] = -60;
            array6[13] = -59;
            array6[14] = 36;
            array6[15] = -121;
            array6[16] = 53;
            array6[17] = 26;
            array6[18] = -114;
            array6[19] = -66;
            array6[20] = -124;
            b(array5, new byte[] { 37, 57, -15, -51, 78, 125, -1, 1, 52, -60, -9, 114, -36, -110, -59, 87, -36, 121, 89, 110, -16 });
            this.c(new String(array5, StandardCharsets.UTF_8).intern(), this.a(motionEvent.getFlags()));
        }
        return true;
    }
    
    public final List<String> b(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return (List<String>)new ArrayList(0);
        }
        return this.a((List<PackageInfo>)packageManager.getInstalledPackages(4096));
    }
    
    public boolean b() {
        return false;
    }
    
    public final boolean b(final Set<String> obj) {
        return this.l.equals(obj);
    }
    
    public boolean c() {
        return false;
    }
    
    public final boolean e() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.o > 5000L) {
            this.o = currentTimeMillis;
            return true;
        }
        return false;
    }
}
