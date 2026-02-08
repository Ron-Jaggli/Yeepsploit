package com.aheaditec.talsec_security.security.api;

import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.Iterator;
import android.os.Parcel;
import com.aheaditec.talsec.security.a;
import com.aheaditec.talsec.security.K;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.J;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import android.content.pm.PackageInfo;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class SuspiciousAppInfo implements Parcelable
{
    public static final Parcelable$Creator<SuspiciousAppInfo> CREATOR;
    public final PackageInfo a;
    public final String b;
    public final Set<String> c;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SuspiciousAppInfo(final PackageInfo a, final String b, final Set<String> c) {
        final byte[] array2;
        final byte[] array = array2 = new byte[11];
        array2[0] = 119;
        array2[1] = 74;
        array2[2] = -44;
        array2[3] = -94;
        array2[4] = 8;
        array2[5] = 34;
        array2[6] = -68;
        array2[7] = 29;
        array2[8] = 79;
        array2[9] = 117;
        array2[10] = -46;
        a(array, new byte[] { -16, 90, -95, -30, 82, 117, -61, 109, 33, 19, -67 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)a, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = -49;
        array4[1] = 84;
        array4[2] = -62;
        array4[3] = 12;
        array4[4] = -14;
        array4[5] = 73;
        a(array3, new byte[] { -90, 97, -115, -104, -99, 39, -56, -99 });
        Intrinsics.checkNotNullParameter((Object)b, new String(array3, utf_8).intern());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        int n = 0;
        byte[] array3 = null;
        int n2 = 0;
        int n4;
        int n3 = n4 = 0;
        int n5 = 1180709023;
        byte[] array4 = null;
    Label_0405:
        while (true) {
            final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
            final int n7 = n5 >>> 8;
            final int n8 = 1;
            final int n9 = 1;
            final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
            final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
            Label_1036: {
                Label_0570: {
                    switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                        default: {
                            break Label_1036;
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
                            break Label_0570;
                        }
                        case 373627814: {
                            break Label_0405;
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
                            break Label_0570;
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
                            break Label_1036;
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
    
    public final PackageInfo component1() {
        return this.a;
    }
    
    public final String component2() {
        return this.b;
    }
    
    public final Set<String> component3() {
        return this.c;
    }
    
    public final SuspiciousAppInfo copy(final PackageInfo packageInfo, final String s, final Set<String> set) {
        final byte[] array2;
        final byte[] array = array2 = new byte[11];
        array2[0] = 62;
        array2[1] = -44;
        array2[2] = -76;
        array2[3] = 95;
        array2[4] = -113;
        array2[5] = -16;
        array2[6] = -96;
        array2[7] = 51;
        array2[8] = -70;
        array2[9] = 63;
        array2[10] = 58;
        a(array, new byte[] { 55, -27, -63, 77, -41, -57, -81, -109, -44, 89, 85 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)packageInfo, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[6];
        array4[0] = -23;
        array4[1] = -119;
        array4[2] = -63;
        array4[3] = -6;
        array4[4] = -97;
        array4[5] = -59;
        a(array3, new byte[] { -124, 28, -117, -94, -16, -85, 78, 4 });
        Intrinsics.checkNotNullParameter((Object)s, new String(array3, utf_8).intern());
        return new SuspiciousAppInfo(packageInfo, s, set);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!Intrinsics.areEqual((Object)SuspiciousAppInfo.class, (Object)class1)) {
            return false;
        }
        final byte[] array2;
        final byte[] array = array2 = new byte[97];
        array2[0] = 28;
        array2[1] = -25;
        array2[2] = -123;
        array2[3] = -87;
        array2[4] = -30;
        array2[5] = 46;
        array2[6] = -95;
        array2[7] = -110;
        array2[8] = 59;
        array2[9] = 78;
        array2[10] = 12;
        array2[11] = -97;
        array2[12] = 16;
        array2[13] = -56;
        array2[14] = 16;
        array2[15] = -68;
        array2[16] = -77;
        array2[17] = 14;
        array2[18] = -111;
        array2[19] = 86;
        array2[20] = -19;
        array2[21] = 3;
        array2[22] = -41;
        array2[23] = -25;
        array2[24] = 86;
        array2[25] = 43;
        array2[26] = -26;
        array2[27] = 110;
        array2[28] = -15;
        array2[29] = -121;
        array2[30] = 25;
        array2[31] = -108;
        array2[32] = -114;
        array2[33] = -79;
        array2[34] = -31;
        array2[35] = -73;
        array2[36] = 9;
        array2[37] = -3;
        array2[38] = 24;
        array2[39] = -16;
        array2[40] = 82;
        array2[41] = 104;
        array2[42] = 106;
        array2[43] = -64;
        array2[44] = 63;
        array2[45] = 68;
        array2[46] = 65;
        array2[47] = -56;
        array2[48] = -26;
        array2[49] = -88;
        array2[50] = 19;
        array2[51] = -105;
        array2[52] = -118;
        array2[53] = -64;
        array2[54] = 84;
        array2[55] = -58;
        array2[56] = 108;
        array2[57] = -27;
        array2[58] = -15;
        array2[59] = 110;
        array2[60] = -6;
        array2[61] = -20;
        array2[62] = 32;
        array2[63] = 46;
        array2[64] = -25;
        array2[65] = -10;
        array2[66] = -65;
        array2[67] = -89;
        array2[68] = -44;
        array2[69] = -119;
        array2[70] = -14;
        array2[71] = -49;
        array2[72] = -100;
        array2[73] = -8;
        array2[74] = -1;
        array2[75] = -31;
        array2[76] = -32;
        array2[77] = -22;
        array2[78] = 51;
        array2[79] = 119;
        array2[80] = -21;
        array2[81] = -108;
        array2[82] = 96;
        array2[83] = -103;
        array2[84] = -128;
        array2[86] = (array2[85] = 6);
        array2[87] = 94;
        array2[88] = 76;
        array2[89] = 27;
        array2[90] = 117;
        array2[91] = -56;
        array2[92] = -120;
        array2[93] = -107;
        array2[94] = 64;
        array2[95] = 96;
        array2[96] = -80;
        a(array, new byte[] { 91, -62, -45, -34, -85, 125, -86, 21, 62, 81, 98, -40, 91, -35, 26, -8, -69, -83, -49, -113, -126, -100, -31, -94, 34, 117, -75, 25, 109, 27, 96, -51, -29, -8, 123, -21, 18, -50, 97, -74, 101, 57, -20, -67, 71, 80, 18, -43, 108, -5, 39, -4, -44, -36, 17, -68, -8, -23, 108, 36, -126, -55, 60, 96, 124, -65, 123, -19, -102, 26, 114, -42, -34, -68, 112, -24, 106, -54, 68, 114, -95, 17, -2, 1, -46, -107, 89, 74, 34, -104, 30, -47, -31, 12, 25, 31, -33 });
        Intrinsics.checkNotNull(o, new String(array, StandardCharsets.UTF_8).intern());
        final SuspiciousAppInfo suspiciousAppInfo = (SuspiciousAppInfo)o;
        return Intrinsics.areEqual((Object)this.a, (Object)suspiciousAppInfo.a) && Intrinsics.areEqual((Object)this.b, (Object)suspiciousAppInfo.b) && Intrinsics.areEqual((Object)this.c, (Object)suspiciousAppInfo.c);
    }
    
    public final PackageInfo getPackageInfo() {
        return this.a;
    }
    
    public final Set<String> getPermissions() {
        return this.c;
    }
    
    public final String getReason() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return this.a.packageName.hashCode();
    }
    
    @Override
    public String toString() {
        final PackageInfo a = this.a;
        final String b = this.b;
        final Set<String> c = this.c;
        final byte[] array2;
        final byte[] array = array2 = new byte[30];
        array2[0] = 101;
        array2[1] = 37;
        array2[2] = -43;
        array2[3] = -84;
        array2[4] = -92;
        array2[5] = 33;
        array2[6] = -11;
        array2[7] = -25;
        array2[8] = 26;
        array2[9] = -96;
        array2[10] = 83;
        array2[11] = -104;
        array2[12] = 108;
        array2[13] = -57;
        array2[14] = 3;
        array2[15] = 92;
        array2[16] = -29;
        array2[17] = 60;
        array2[18] = 36;
        array2[19] = -115;
        array2[20] = -62;
        array2[21] = -17;
        array2[22] = 118;
        array2[23] = 114;
        array2[24] = 119;
        array2[25] = 101;
        array2[26] = -40;
        array2[27] = 33;
        array2[28] = -110;
        array2[29] = 100;
        a(array, new byte[] { 31, -128, -112, -11, -74, 114, -122, -95, 88, 3, -3, 0, 5, -66, 87, 83, 117, 68, 62, 5, -118, -76, 1, 46, -5, 91, -96, 96, -3, 89 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[9];
        array4[0] = 113;
        array4[1] = 79;
        array4[2] = 56;
        array4[3] = -65;
        array4[4] = 85;
        array4[5] = 3;
        array4[6] = 90;
        array4[7] = 32;
        array4[8] = -26;
        a(array3, new byte[] { 70, -97, 52, -13, 29, -96, 31, 103, -37 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[14];
        array6[0] = -74;
        array6[1] = 97;
        array6[2] = 74;
        array6[3] = -9;
        array6[4] = 71;
        array6[5] = -81;
        array6[6] = 35;
        array6[7] = 42;
        array6[8] = -114;
        array6[9] = -36;
        array6[10] = 110;
        array6[11] = -95;
        array6[12] = 10;
        array6[13] = 31;
        a(array5, new byte[] { -125, 113, 36, -85, 30, -14, 52, 114, -26, -27, -21, -25, 121, 34 });
        final String intern3 = new String(array5, utf_8).intern();
        final byte[] array7 = { -108 };
        a(array7, new byte[] { -67, 119, 64, 115, 6, 89, 106, -47 });
        return intern + (Object)a + intern2 + b + intern3 + (Object)c + new String(array7, utf_8).intern();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final byte[] array2;
        final byte[] array = array2 = new byte[4];
        array2[0] = 76;
        array2[1] = 97;
        array2[2] = 56;
        array2[3] = 96;
        a(array, new byte[] { 17, 52, 53, 45, -14, 80, -23, -25 });
        Intrinsics.checkNotNullParameter((Object)parcel, new String(array, StandardCharsets.UTF_8).intern());
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeString(this.b);
        final Set<String> c = this.c;
        if (c == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeInt(c.size());
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                parcel.writeString((String)iterator.next());
            }
        }
    }
    
    public static final class Creator implements Parcelable$Creator<SuspiciousAppInfo>
    {
        public static void a(final byte[] array, final byte[] array2) {
            int n = 0;
            byte[] array3 = null;
            int n2 = 0;
            int n4;
            int n3 = n4 = 0;
            int n5 = 1180709023;
            byte[] array4 = null;
        Label_0398:
            while (true) {
                final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
                final int n7 = n5 >>> 8;
                final int n8 = 1;
                int n9 = 1;
                final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
                final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
                Label_1029: {
                    Label_0563: {
                        switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                            default: {
                                break Label_1029;
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
                                break Label_0563;
                            }
                            case 373627814: {
                                break Label_0398;
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
                                break Label_0563;
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
                                break Label_1029;
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
        
        public final SuspiciousAppInfo createFromParcel(final Parcel parcel) {
            final byte[] array2;
            final byte[] array = array2 = new byte[6];
            array2[0] = -13;
            array2[1] = -27;
            array2[2] = 3;
            array2[3] = -112;
            array2[4] = 40;
            array2[5] = 14;
            a(array, new byte[] { 108, -76, 91, 12, 77, 98, -33, -45 });
            Intrinsics.checkNotNullParameter((Object)parcel, new String(array, StandardCharsets.UTF_8).intern());
            final PackageInfo packageInfo = (PackageInfo)parcel.readParcelable(SuspiciousAppInfo.class.getClassLoader());
            final String string = parcel.readString();
            Object o;
            if (parcel.readInt() == 0) {
                o = null;
            }
            else {
                final int int1 = parcel.readInt();
                final LinkedHashSet set = new LinkedHashSet(int1);
                for (int i = 0; i != int1; ++i) {
                    ((AbstractCollection)set).add((Object)parcel.readString());
                }
                o = set;
            }
            return new SuspiciousAppInfo(packageInfo, string, (Set<String>)o);
        }
        
        public final SuspiciousAppInfo[] newArray(final int n) {
            return new SuspiciousAppInfo[n];
        }
    }
}
