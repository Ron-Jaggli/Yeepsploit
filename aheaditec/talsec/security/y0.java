package com.aheaditec.talsec.security;

import java.util.Set;
import android.os.Build;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import java.util.List;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager;
import kotlin.random.Random$Default;
import com.aheaditec.talsec_security.security.Natives;
import kotlin.collections.ArraysKt;
import kotlin.random.Random;
import java.util.ArrayList;
import java.nio.charset.Charset;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageInfo;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.nio.charset.StandardCharsets;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager$ApplicationInfoFlags;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public class Y0 extends r
{
    public final Integer q;
    public final boolean r;
    public final Z0 s;
    public X t;
    
    public Y0(final R0 r0, final u1 u1, final E1 e1, final Z0 s) {
        super(r0, u1, e1);
        this.q = e1.a().b();
        this.r = r0.b();
        this.s = s;
    }
    
    private static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n2 = 0;
        int n3 = -1850458006;
        byte[] array4 = null;
    Label_0265:
        while (true) {
            final int n4 = n3 >>> 8;
            final int n5 = 1;
            final int n6 = 1;
            final int n7 = n4 - 1 - (~((0x1000000 & n3) * (n3 | 0x1000000) + (0xFEFFFFFF & n3) * (~n3 & 0x1000000)) | n4);
            final int n8 = -1700147435 - ((n7 & 0x2) | 2028104049 - n7);
            n3 = -1396193641;
            switch (0xAEBB822B ^ ~n8 + (n8 | 0x1) * 2) {
                case 1733787683: {
                    final byte b = array4[n];
                    final byte b2 = array3[n];
                    array4[n] = (byte)((byte)((byte)b2 + (byte)b) - (byte)((byte)2 * (byte)(b2 & b)));
                    final int n9 = n2 = (n ^ 0x1) + (n & 0x1) * 2;
                    if ((lcmp((long)n9, (long)array4.length) >>> 31 & 0x1) != 0x0) {
                        n3 = 1985663266;
                        n2 = n9;
                        continue;
                    }
                    break;
                }
                case 585276366: {
                    int n10 = n6;
                    if (array.length <= 0) {
                        n10 = 0;
                    }
                    if (n10 != 0) {
                        n3 = 1985663266;
                    }
                    else {
                        n3 = -1396193641;
                    }
                    array4 = array;
                    array3 = array2;
                    n2 = 0;
                    continue;
                }
                case 399486784: {
                    break Label_0265;
                }
                case -360299937: {
                    int n11 = n5;
                    if (dcmpg((double)array3[n2], Double.NaN) <= -1) {
                        n11 = 0;
                    }
                    if (n11 == 0) {
                        n3 = 427928065;
                    }
                    if (n11 != 0) {
                        n3 = 614229416;
                    }
                    n = n2;
                    continue;
                }
                case -1940167324: {
                    final byte b3 = array3[n];
                    final int n12 = (byte)0 - (byte)b3;
                    array3[n] = (byte)((byte)(b3 & ~n12) - (byte)(~b3 & n12));
                    n3 = 614229416;
                    continue;
                }
            }
            n3 = -1396193641;
        }
    }
    
    public final ApplicationInfo a(final Context context, final String s) {
        final ApplicationInfo applicationInfo = null;
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ApplicationInfo applicationInfo2;
            if (Build$VERSION.SDK_INT >= 33) {
                applicationInfo2 = packageManager.getApplicationInfo(s, PackageManager$ApplicationInfoFlags.of(0L));
            }
            else {
                applicationInfo2 = packageManager.getApplicationInfo(s, 0);
            }
            return applicationInfo2;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return applicationInfo;
        }
    }
    
    public void a(final Context context) {
        this.d(context);
    }
    
    public final boolean a(final Context context, final boolean b) {
        final byte[] array2;
        final byte[] array = array2 = new byte[27];
        array2[0] = -42;
        array2[1] = 38;
        array2[2] = 90;
        array2[3] = -120;
        array2[4] = -89;
        array2[5] = 103;
        array2[6] = -84;
        array2[8] = (array2[7] = -45);
        array2[9] = -42;
        array2[10] = -21;
        array2[11] = 85;
        array2[12] = -68;
        array2[13] = 112;
        array2[14] = -69;
        array2[15] = -75;
        array2[16] = 14;
        array2[17] = -120;
        array2[18] = -71;
        array2[19] = 31;
        array2[20] = 55;
        array2[21] = 126;
        array2[22] = 13;
        array2[23] = 1;
        array2[24] = -104;
        array2[25] = -113;
        array2[26] = 29;
        a(array, new byte[] { -66, 71, 41, -38, -56, 8, -40, -70, -67, -79, -69, 52, -33, 27, -38, -46, 107, -5, -16, 113, 68, 10, 108, 109, -12, -22, 121 });
        final String intern = new String(array, StandardCharsets.UTF_8).intern();
        if (b) {
            for (final String s : X0.m) {
                if (this.a(context, s) != null) {
                    String intern2;
                    if (this.r) {
                        intern2 = s;
                    }
                    else {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[4];
                        array4[0] = -105;
                        array4[1] = -73;
                        array4[2] = 0;
                        array4[3] = -74;
                        a(array3, new byte[] { -29, -59, 117, -45, -125, -16, -71, -16 });
                        intern2 = new String(array3, StandardCharsets.UTF_8).intern();
                    }
                    this.b(intern, intern2);
                    return true;
                }
            }
        }
        for (final String s2 : X0.l) {
            if (this.a(context, s2) != null) {
                String intern3;
                if (this.r) {
                    intern3 = s2;
                }
                else {
                    final byte[] array6;
                    final byte[] array5 = array6 = new byte[4];
                    array6[0] = 29;
                    array6[1] = 48;
                    array6[2] = -125;
                    array6[3] = 122;
                    a(array5, new byte[] { 105, 66, -10, 31, -113, 7, 73, -35 });
                    intern3 = new String(array5, StandardCharsets.UTF_8).intern();
                }
                this.c(intern, intern3);
                return true;
            }
        }
        return false;
    }
    
    public final boolean a(final PackageManager packageManager) {
        try {
            final byte[] array2;
            final byte[] array = array2 = new byte[26];
            array2[0] = 109;
            array2[1] = 65;
            array2[2] = -80;
            array2[3] = -5;
            array2[4] = 50;
            array2[5] = -22;
            array2[6] = 20;
            array2[7] = 93;
            array2[8] = -5;
            array2[9] = 18;
            array2[10] = -36;
            array2[11] = 91;
            array2[12] = -21;
            array2[13] = -22;
            array2[14] = -68;
            array2[15] = 119;
            array2[16] = -113;
            array2[17] = -118;
            array2[18] = -58;
            array2[19] = -23;
            array2[20] = -97;
            array2[21] = 81;
            array2[22] = 51;
            array2[23] = -125;
            array2[24] = 84;
            array2[25] = 118;
            a(array, new byte[] { 12, 47, -44, -119, 93, -125, 112, 115, -110, 124, -88, 62, -123, -98, -110, 22, -20, -2, -81, -122, -15, 127, 126, -62, 29, 56 });
            final Iterator iterator = packageManager.queryIntentActivities(new Intent(new String(array, StandardCharsets.UTF_8).intern()), 131072).iterator();
            while (iterator.hasNext()) {
                final ActivityInfo activityInfo = ((ResolveInfo)iterator.next()).activityInfo;
                if (activityInfo != null) {
                    final String packageName = activityInfo.packageName;
                    if (packageName == null) {
                        continue;
                    }
                    if (this.a(packageManager, packageName)) {
                        this.s.a(packageName);
                        return true;
                    }
                    continue;
                }
            }
            return false;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final boolean a(final PackageManager packageManager, String intern) {
        try {
            final PackageInfo packageInfo = packageManager.getPackageInfo(intern, 4111);
            if (packageInfo == null) {
                return false;
            }
            final ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                return false;
            }
            if ((applicationInfo.flags & 0x1) != 0x0) {
                return false;
            }
            final ActivityInfo[] activities = packageInfo.activities;
            if (activities != null) {
                final ServiceInfo[] services = packageInfo.services;
                if (services != null) {
                    final ActivityInfo[] receivers = packageInfo.receivers;
                    if (receivers != null) {
                        final ProviderInfo[] providers = packageInfo.providers;
                        if (providers != null) {
                            if (activities.length == 2 && (services.length == 2 || services.length == 1) && receivers.length == 1 && providers.length == 1) {
                                final String[] requestedPermissions = packageInfo.requestedPermissions;
                                if (requestedPermissions != null) {
                                    if (requestedPermissions.length >= 8) {
                                        try {
                                            final byte[] array2;
                                            final byte[] array = array2 = new byte[27];
                                            array2[0] = -22;
                                            array2[1] = 41;
                                            array2[2] = 53;
                                            array2[3] = 106;
                                            array2[4] = -114;
                                            array2[5] = 45;
                                            array2[6] = 30;
                                            array2[7] = 89;
                                            array2[8] = -52;
                                            array2[9] = 74;
                                            array2[10] = 63;
                                            array2[11] = 74;
                                            array2[12] = 110;
                                            array2[13] = -81;
                                            array2[14] = -102;
                                            array2[15] = -55;
                                            array2[16] = 0;
                                            array2[17] = -14;
                                            array2[18] = -105;
                                            array2[19] = 94;
                                            array2[20] = 66;
                                            array2[21] = -71;
                                            array2[22] = -23;
                                            array2[23] = 89;
                                            array2[24] = 36;
                                            array2[25] = -12;
                                            array2[26] = -51;
                                            a(array, new byte[] { -117, 71, 81, 24, -31, 68, 122, 119, -68, 47, 77, 39, 7, -36, -23, -96, 111, -100, -71, 23, 12, -19, -84, 11, 106, -79, -103 });
                                            final Charset utf_8 = StandardCharsets.UTF_8;
                                            final String intern2 = new String(array, utf_8).intern();
                                            final byte[] array4;
                                            final byte[] array3 = array4 = new byte[37];
                                            array4[0] = 106;
                                            array4[1] = 97;
                                            array4[2] = 70;
                                            array4[3] = -5;
                                            array4[4] = 120;
                                            array4[5] = 37;
                                            array4[6] = -128;
                                            array4[7] = -127;
                                            array4[8] = -99;
                                            array4[9] = -86;
                                            array4[10] = -34;
                                            array4[11] = 52;
                                            array4[12] = 0;
                                            array4[13] = 126;
                                            array4[14] = 120;
                                            array4[15] = -41;
                                            array4[16] = -36;
                                            array4[17] = 119;
                                            array4[18] = -49;
                                            array4[19] = 38;
                                            array4[20] = -117;
                                            array4[21] = 51;
                                            array4[22] = 37;
                                            array4[23] = -63;
                                            array4[24] = 84;
                                            array4[25] = 53;
                                            array4[26] = -12;
                                            array4[27] = 127;
                                            array4[28] = -87;
                                            array4[29] = -41;
                                            array4[30] = 112;
                                            array4[31] = -53;
                                            array4[32] = -84;
                                            array4[33] = -107;
                                            array4[34] = 20;
                                            array4[35] = 126;
                                            array4[36] = -80;
                                            a(array3, new byte[] { 11, 15, 34, -119, 23, 76, -28, -81, -19, -49, -84, 89, 105, 13, 11, -66, -77, 25, -31, 96, -60, 97, 96, -122, 6, 122, -95, 49, -19, -120, 35, -114, -2, -61, 93, 61, -11 });
                                            final String intern3 = new String(array3, utf_8).intern();
                                            final byte[] array6;
                                            final byte[] array5 = array6 = new byte[37];
                                            array6[0] = -2;
                                            array6[1] = 53;
                                            array6[2] = -14;
                                            array6[3] = -27;
                                            array6[4] = -42;
                                            array6[5] = 2;
                                            array6[6] = -73;
                                            array6[7] = 88;
                                            array6[8] = -28;
                                            array6[9] = 40;
                                            array6[10] = 56;
                                            array6[11] = 71;
                                            array6[12] = -18;
                                            array6[13] = -122;
                                            array6[14] = -111;
                                            array6[15] = -126;
                                            array6[16] = -127;
                                            array6[17] = 96;
                                            array6[18] = 112;
                                            array6[19] = 22;
                                            array6[20] = 75;
                                            array6[21] = -20;
                                            array6[22] = -122;
                                            array6[23] = -111;
                                            array6[24] = -19;
                                            array6[25] = 115;
                                            array6[26] = -15;
                                            array6[27] = 112;
                                            array6[28] = 50;
                                            array6[29] = -89;
                                            array6[30] = 85;
                                            array6[31] = 7;
                                            array6[32] = 87;
                                            array6[33] = 86;
                                            array6[34] = 11;
                                            array6[35] = -61;
                                            array6[36] = 22;
                                            a(array5, new byte[] { -97, 91, -106, -105, -71, 107, -45, 118, -108, 77, 74, 42, -121, -11, -30, -21, -18, 14, 94, 71, 30, -87, -44, -56, -78, 50, -67, 60, 109, -9, 20, 68, 28, 23, 76, -122, 69 });
                                            final String intern4 = new String(array5, utf_8).intern();
                                            final byte[] array8;
                                            final byte[] array7 = array8 = new byte[39];
                                            array8[0] = -77;
                                            array8[1] = 7;
                                            array8[2] = 106;
                                            array8[3] = 64;
                                            array8[5] = (array8[4] = 45);
                                            array8[6] = -77;
                                            array8[7] = -45;
                                            array8[8] = -87;
                                            array8[9] = 4;
                                            array8[10] = 88;
                                            array8[11] = 76;
                                            array8[12] = 65;
                                            array8[13] = 82;
                                            array8[14] = -90;
                                            array8[15] = 2;
                                            array8[16] = 70;
                                            array8[17] = -20;
                                            array8[18] = 50;
                                            array8[19] = 117;
                                            array8[20] = -44;
                                            array8[21] = -4;
                                            array8[22] = 52;
                                            array8[23] = -35;
                                            array8[24] = 92;
                                            array8[25] = -38;
                                            array8[26] = 111;
                                            array8[27] = 73;
                                            array8[28] = 104;
                                            array8[29] = -40;
                                            array8[30] = -49;
                                            array8[31] = 113;
                                            array8[32] = -86;
                                            array8[33] = -56;
                                            array8[34] = -123;
                                            array8[35] = 58;
                                            array8[36] = -79;
                                            array8[37] = 76;
                                            array8[38] = -82;
                                            a(array7, new byte[] { -46, 105, 14, 50, 66, 68, -41, -3, -39, 97, 42, 33, 40, 33, -43, 107, 41, -126, 28, 52, -105, -65, 113, -114, 15, -123, 33, 12, 60, -113, -128, 35, -31, -105, -42, 110, -16, 24, -21 });
                                            final String intern5 = new String(array7, utf_8).intern();
                                            final byte[] array10;
                                            final byte[] array9 = array10 = new byte[39];
                                            array10[0] = 53;
                                            array10[1] = 55;
                                            array10[2] = 68;
                                            array10[3] = 1;
                                            array10[4] = -38;
                                            array10[5] = -85;
                                            array10[6] = -106;
                                            array10[7] = 41;
                                            array10[8] = -6;
                                            array10[9] = 77;
                                            array10[10] = -43;
                                            array10[11] = -12;
                                            array10[12] = 44;
                                            array10[13] = -83;
                                            array10[14] = -64;
                                            array10[15] = 13;
                                            array10[16] = 93;
                                            array10[17] = -107;
                                            array10[18] = -35;
                                            array10[19] = -64;
                                            array10[20] = 11;
                                            array10[21] = -50;
                                            array10[22] = -48;
                                            array10[23] = 8;
                                            array10[24] = 72;
                                            array10[25] = -97;
                                            array10[26] = -1;
                                            array10[27] = -17;
                                            array10[28] = 40;
                                            array10[29] = -97;
                                            array10[30] = 19;
                                            array10[31] = -44;
                                            array10[32] = -114;
                                            array10[33] = -74;
                                            array10[34] = 74;
                                            array10[35] = 48;
                                            array10[36] = -106;
                                            array10[37] = 45;
                                            array10[38] = 103;
                                            a(array9, new byte[] { 84, 89, 32, 115, -75, -62, -14, 7, -118, 40, -89, -103, 69, -34, -77, 100, 50, -5, -13, -120, 66, -118, -107, 87, 7, -55, -70, -67, 100, -34, 74, -117, -39, -1, 4, 116, -39, 122, 52 });
                                            final String intern6 = new String(array9, utf_8).intern();
                                            final byte[] array12;
                                            final byte[] array11 = array12 = new byte[37];
                                            array12[0] = 102;
                                            array12[1] = 123;
                                            array12[2] = -24;
                                            array12[3] = -12;
                                            array12[4] = 24;
                                            array12[5] = -30;
                                            array12[6] = -16;
                                            array12[7] = 121;
                                            array12[8] = -26;
                                            array12[9] = -42;
                                            array12[10] = 62;
                                            array12[11] = -37;
                                            array12[12] = 126;
                                            array12[13] = -86;
                                            array12[14] = -45;
                                            array12[15] = -67;
                                            array12[16] = 124;
                                            array12[17] = -67;
                                            array12[18] = 25;
                                            array12[19] = -57;
                                            array12[20] = 49;
                                            array12[21] = 76;
                                            array12[22] = -23;
                                            array12[23] = 117;
                                            array12[24] = -1;
                                            array12[25] = -114;
                                            array12[26] = -1;
                                            array12[27] = -70;
                                            array12[28] = -37;
                                            array12[29] = 62;
                                            array12[30] = 102;
                                            array12[31] = -116;
                                            array12[32] = -66;
                                            array12[33] = -2;
                                            array12[34] = 31;
                                            array12[35] = -26;
                                            array12[36] = 64;
                                            a(array11, new byte[] { 7, 21, -116, -122, 119, -117, -108, 87, -106, -77, 76, -74, 23, -39, -96, -44, 19, -45, 55, -105, 126, 31, -67, 42, -79, -63, -85, -13, -99, 119, 37, -51, -22, -73, 80, -88, 19 });
                                            final String intern7 = new String(array11, utf_8).intern();
                                            final byte[] array14;
                                            final byte[] array13 = array14 = new byte[54];
                                            array14[0] = -44;
                                            array14[1] = 76;
                                            array14[2] = 28;
                                            array14[3] = -125;
                                            array14[4] = 78;
                                            array14[5] = -69;
                                            array14[6] = 100;
                                            array14[7] = -35;
                                            array14[8] = -36;
                                            array14[9] = -84;
                                            array14[10] = -123;
                                            array14[11] = -18;
                                            array14[12] = 69;
                                            array14[13] = -87;
                                            array14[14] = 110;
                                            array14[15] = 19;
                                            array14[16] = 104;
                                            array14[17] = -66;
                                            array14[18] = 18;
                                            array14[19] = -126;
                                            array14[20] = 38;
                                            array14[21] = -45;
                                            array14[22] = -94;
                                            array14[23] = 102;
                                            array14[24] = -74;
                                            array14[25] = 6;
                                            array14[26] = -72;
                                            array14[27] = -23;
                                            array14[28] = 64;
                                            array14[29] = 46;
                                            array14[30] = 63;
                                            array14[31] = -37;
                                            array14[32] = -66;
                                            array14[33] = -93;
                                            array14[34] = 88;
                                            array14[35] = 116;
                                            array14[36] = 72;
                                            array14[37] = -68;
                                            array14[38] = -86;
                                            array14[39] = -44;
                                            array14[40] = -92;
                                            array14[41] = -110;
                                            array14[42] = 18;
                                            array14[43] = 121;
                                            array14[44] = -35;
                                            array14[45] = 28;
                                            array14[46] = -33;
                                            array14[47] = -114;
                                            array14[48] = 63;
                                            array14[49] = -59;
                                            array14[50] = 73;
                                            array14[51] = 81;
                                            array14[52] = -25;
                                            array14[53] = -34;
                                            a(array13, new byte[] { -75, 34, 120, -15, 33, -46, 0, -13, -84, -55, -9, -125, 44, -38, 29, 122, 7, -48, 60, -41, 118, -105, -29, 50, -13, 89, -24, -88, 3, 101, 126, -100, -5, -16, 7, 35, 1, -24, -30, -101, -15, -58, 77, 44, -114, 89, -115, -47, 126, -122, 29, 24, -88, -112 });
                                            final String intern8 = new String(array13, utf_8).intern();
                                            final byte[] array16;
                                            final byte[] array15 = array16 = new byte[43];
                                            array16[0] = 34;
                                            array16[1] = 35;
                                            array16[2] = 108;
                                            array16[3] = -99;
                                            array16[4] = 106;
                                            array16[5] = 68;
                                            array16[6] = 67;
                                            array16[7] = -96;
                                            array16[8] = -89;
                                            array16[9] = 101;
                                            array16[10] = 27;
                                            array16[11] = 114;
                                            array16[12] = 22;
                                            array16[13] = -92;
                                            array16[14] = 24;
                                            array16[15] = -29;
                                            array16[16] = -127;
                                            array16[17] = -13;
                                            array16[18] = 4;
                                            array16[19] = 126;
                                            array16[20] = -108;
                                            array16[21] = 53;
                                            array16[22] = 37;
                                            array16[23] = -8;
                                            array16[24] = 34;
                                            array16[25] = 115;
                                            array16[26] = -52;
                                            array16[27] = 102;
                                            array16[28] = -22;
                                            array16[29] = 51;
                                            array16[30] = -109;
                                            array16[31] = 51;
                                            array16[32] = -119;
                                            array16[33] = -43;
                                            array16[34] = 23;
                                            array16[35] = -26;
                                            array16[36] = 52;
                                            array16[37] = -39;
                                            array16[38] = 35;
                                            array16[39] = 116;
                                            array16[40] = 70;
                                            array16[41] = -18;
                                            array16[42] = 79;
                                            a(array15, new byte[] { 67, 77, 8, -17, 5, 45, 39, -114, -41, 0, 105, 31, 127, -41, 107, -118, -18, -99, 42, 44, -47, 100, 112, -67, 113, 39, -109, 47, -92, 96, -57, 114, -59, -103, 72, -74, 117, -102, 104, 53, 1, -85, 28 });
                                            final String intern9 = new String(array15, utf_8).intern();
                                            final byte[] array18;
                                            final byte[] array17 = array18 = new byte[32];
                                            array18[0] = -40;
                                            array18[1] = -6;
                                            array18[2] = 8;
                                            array18[3] = 32;
                                            array18[4] = -6;
                                            array18[5] = -38;
                                            array18[6] = 122;
                                            array18[7] = 97;
                                            array18[8] = 68;
                                            array18[9] = -108;
                                            array18[10] = 10;
                                            array18[11] = -2;
                                            array18[12] = 41;
                                            array18[13] = 24;
                                            array18[14] = 18;
                                            array18[15] = -50;
                                            array18[16] = 97;
                                            array18[17] = 17;
                                            array18[18] = 49;
                                            array18[19] = 79;
                                            array18[20] = -68;
                                            array18[21] = 102;
                                            array18[22] = 61;
                                            array18[23] = -84;
                                            array18[24] = -62;
                                            array18[25] = -26;
                                            array18[26] = -47;
                                            array18[27] = 40;
                                            array18[28] = 33;
                                            array18[29] = 46;
                                            array18[30] = 18;
                                            array18[31] = 11;
                                            a(array17, new byte[] { -71, -108, 108, 82, -107, -77, 30, 79, 52, -15, 120, -109, 64, 107, 97, -89, 14, 127, 31, 26, -17, 35, 98, -18, -117, -87, -100, 109, 117, 124, 91, 72 });
                                            final String intern10 = new String(array17, utf_8).intern();
                                            final byte[] array20;
                                            final byte[] array19 = array20 = new byte[34];
                                            array20[0] = -2;
                                            array20[1] = -96;
                                            array20[2] = 21;
                                            array20[3] = 102;
                                            array20[4] = 35;
                                            array20[5] = -90;
                                            array20[6] = -30;
                                            array20[7] = 31;
                                            array20[8] = -55;
                                            array20[9] = 6;
                                            array20[10] = 36;
                                            array20[11] = 102;
                                            array20[12] = -47;
                                            array20[13] = -109;
                                            array20[14] = -79;
                                            array20[15] = 125;
                                            array20[16] = -15;
                                            array20[17] = 89;
                                            array20[18] = -49;
                                            array20[19] = -125;
                                            array20[20] = -22;
                                            array20[21] = 19;
                                            array20[22] = 92;
                                            array20[23] = 83;
                                            array20[24] = -68;
                                            array20[25] = -59;
                                            array20[26] = -5;
                                            array20[27] = -22;
                                            array20[28] = -115;
                                            array20[29] = -94;
                                            array20[30] = -117;
                                            array20[31] = -42;
                                            array20[32] = -59;
                                            array20[33] = -99;
                                            a(array19, new byte[] { -97, -50, 113, 20, 76, -49, -122, 49, -71, 99, 86, 11, -72, -32, -62, 20, -98, 55, -31, -42, -71, 86, 3, 21, -11, -117, -68, -81, -33, -14, -39, -97, -117, -55 });
                                            final HashSet set = new HashSet((Collection)Arrays.asList((Object[])new String[] { intern2, intern3, intern10, intern4, intern5, intern6, new String(array19, utf_8).intern(), intern8, intern9 }));
                                            final byte[] array22;
                                            final byte[] array21 = array22 = new byte[47];
                                            array22[0] = -113;
                                            array22[1] = 13;
                                            array22[2] = -119;
                                            array22[3] = -49;
                                            array22[4] = -98;
                                            array22[5] = -10;
                                            array22[6] = 113;
                                            array22[7] = -127;
                                            array22[8] = -35;
                                            array22[9] = 86;
                                            array22[10] = -20;
                                            array22[11] = -71;
                                            array22[12] = -24;
                                            array22[13] = -91;
                                            array22[14] = -75;
                                            array22[15] = 72;
                                            array22[16] = -127;
                                            array22[17] = 123;
                                            array22[18] = -34;
                                            array22[19] = -6;
                                            array22[20] = 121;
                                            array22[21] = 14;
                                            array22[22] = -22;
                                            array22[23] = 26;
                                            array22[24] = 106;
                                            array22[26] = (array22[25] = 107);
                                            array22[27] = 20;
                                            array22[28] = -39;
                                            array22[29] = -121;
                                            array22[30] = 22;
                                            array22[31] = -54;
                                            array22[32] = -10;
                                            array22[33] = -61;
                                            array22[34] = -18;
                                            array22[35] = -94;
                                            array22[36] = -66;
                                            array22[37] = 102;
                                            array22[38] = 110;
                                            array22[40] = (array22[39] = -101);
                                            array22[41] = -93;
                                            array22[42] = 31;
                                            array22[43] = -7;
                                            array22[45] = (array22[44] = 87);
                                            array22[46] = 62;
                                            a(array21, new byte[] { -18, 99, -19, -67, -15, -97, 21, -81, -83, 51, -98, -44, -127, -42, -58, 33, -18, 21, -16, -68, 54, 92, -81, 93, 56, 36, 62, 90, -99, -40, 69, -113, -92, -107, -89, -31, -5, 57, 42, -38, -49, -30, 64, -86, 14, 25, 125 });
                                            final HashSet set2 = new HashSet((Collection)Arrays.asList((Object[])new String[] { intern2, intern3, new String(array21, utf_8).intern(), intern4, intern5, intern6, intern7, intern8, intern9 }));
                                            final byte[] array24;
                                            final byte[] array23 = array24 = new byte[42];
                                            array24[0] = -116;
                                            array24[1] = 86;
                                            array24[2] = -115;
                                            array24[3] = 80;
                                            array24[4] = 37;
                                            array24[5] = -26;
                                            array24[6] = 83;
                                            array24[7] = -32;
                                            array24[8] = -69;
                                            array24[9] = -43;
                                            array24[10] = -63;
                                            array24[11] = 126;
                                            array24[12] = 107;
                                            array24[13] = -72;
                                            array24[14] = 39;
                                            array24[15] = -110;
                                            array24[16] = -59;
                                            array24[17] = -40;
                                            array24[18] = 36;
                                            array24[19] = 80;
                                            array24[20] = -19;
                                            array24[21] = 70;
                                            array24[22] = -105;
                                            array24[23] = -95;
                                            array24[24] = 109;
                                            array24[25] = -24;
                                            array24[26] = 127;
                                            array24[27] = 55;
                                            array24[28] = -59;
                                            array24[29] = 85;
                                            array24[30] = 16;
                                            array24[31] = -32;
                                            array24[32] = -36;
                                            array24[33] = -107;
                                            array24[34] = 101;
                                            array24[35] = 30;
                                            array24[36] = -29;
                                            array24[37] = -97;
                                            array24[38] = 19;
                                            array24[39] = 118;
                                            array24[40] = 122;
                                            array24[41] = 79;
                                            a(array23, new byte[] { -19, 56, -23, 34, 74, -113, 55, -50, -53, -80, -77, 19, 2, -53, 84, -5, -86, -74, 10, 2, -72, 8, -56, -12, 62, -83, 45, 104, -116, 27, 89, -76, -107, -44, 49, 91, -89, -64, 89, 57, 56, 28 });
                                            final HashSet set3 = new HashSet((Collection)Arrays.asList((Object[])new String[] { intern2, intern5, intern9, intern6, intern8, intern7, new String(array23, utf_8).intern(), intern4 }));
                                            final HashSet set4 = new HashSet((Collection)Arrays.asList((Object[])packageInfo.requestedPermissions));
                                            final boolean containsAll = ((Set)set4).containsAll((Collection)set);
                                            final boolean containsAll2 = ((Set)set4).containsAll((Collection)set2);
                                            final boolean containsAll3 = ((Set)set4).containsAll((Collection)set3);
                                            if (!containsAll && !containsAll2 && !containsAll3) {
                                                return false;
                                            }
                                            final long n = new File(applicationInfo.sourceDir).length() / 1024L;
                                            if ((n < 20L || n > 40L) && (n < 9216L || n > 20480L)) {
                                                return false;
                                            }
                                            String s;
                                            if (containsAll) {
                                                s = String.valueOf(1);
                                            }
                                            else if (containsAll2) {
                                                s = String.valueOf(2);
                                            }
                                            else {
                                                s = String.valueOf(3);
                                            }
                                            final byte[] array26;
                                            final byte[] array25 = array26 = new byte[17];
                                            array26[0] = -127;
                                            array26[1] = -121;
                                            array26[2] = 108;
                                            array26[3] = 82;
                                            array26[4] = -61;
                                            array26[5] = -103;
                                            array26[6] = -52;
                                            array26[7] = -121;
                                            array26[8] = 78;
                                            array26[9] = 48;
                                            array26[10] = 111;
                                            array26[11] = 103;
                                            array26[12] = 10;
                                            array26[13] = -118;
                                            array26[14] = 2;
                                            array26[15] = 93;
                                            array26[16] = 127;
                                            a(array25, new byte[] { -23, -26, 31, 31, -94, -2, -91, -12, 37, 99, 27, 18, 104, -61, 108, 59, 16 });
                                            this.c(new String(array25, utf_8).intern(), s);
                                            final byte[] array28;
                                            final byte[] array27 = array28 = new byte[13];
                                            array28[0] = -24;
                                            array28[1] = 52;
                                            array28[2] = 91;
                                            array28[3] = 65;
                                            array28[4] = 44;
                                            array28[5] = 49;
                                            array28[6] = 113;
                                            array28[7] = 26;
                                            array28[8] = 94;
                                            array28[9] = -96;
                                            array28[10] = -91;
                                            array28[11] = -23;
                                            array28[12] = -85;
                                            a(array27, new byte[] { -128, 85, 40, 12, 77, 86, 24, 105, 53, -13, -47, -100, -55 });
                                            final String intern11 = new String(array27, utf_8).intern();
                                            if (!this.r) {
                                                final byte[] array30;
                                                final byte[] array29 = array30 = new byte[4];
                                                array30[0] = 91;
                                                array30[1] = 93;
                                                array30[2] = -14;
                                                array30[3] = -97;
                                                a(array29, new byte[] { 47, 47, -121, -6, 23, 77, -28, 122 });
                                                intern = new String(array29, utf_8).intern();
                                            }
                                            this.c(intern11, intern);
                                            return true;
                                        }
                                        catch (final Exception ex) {
                                            return false;
                                        }
                                    }
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        catch (final Exception ex2) {}
        return false;
    }
    
    public final String[] a(final Context context, final String[] array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            final ApplicationInfo a = this.a(context, array[i]);
            if (a != null) {
                final String sourceDir = a.sourceDir;
                if (sourceDir != null) {
                    list.add((Object)sourceDir);
                }
            }
        }
        return (String[])list.toArray((Object[])new String[list.size()]);
    }
    
    public final boolean b(final Context context) {
        final Random$Default default1 = Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final Natives a = Natives.a;
        final byte[] b = a.b(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[25];
        array2[0] = -73;
        array2[1] = -36;
        array2[2] = -99;
        array2[3] = -74;
        array2[4] = 6;
        array2[5] = -18;
        array2[6] = -92;
        array2[7] = 13;
        array2[8] = -111;
        array2[9] = 81;
        array2[10] = -79;
        array2[11] = 46;
        array2[12] = -97;
        array2[13] = 23;
        array2[14] = -18;
        array2[15] = 52;
        array2[16] = -88;
        array2[17] = -16;
        array2[18] = 108;
        array2[19] = -112;
        array2[20] = 64;
        array2[21] = -102;
        array2[22] = 102;
        array2[23] = -120;
        array2[24] = -77;
        a(array, new byte[] { -42, -82, -8, -9, 118, -123, -41, 76, -25, 48, -40, 66, -2, 117, -126, 81, -18, -103, 30, -29, 52, -39, 7, -28, -33 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String[] g = this.g(b, first, first2, new String(array, utf_8).intern());
        if (g == null) {
            return false;
        }
        final byte[] c = a.c(this.a(this.a(context, g), first, first2), first, first2);
        final byte[] array4;
        final byte[] array3 = array4 = new byte[26];
        array4[0] = -109;
        array4[1] = -53;
        array4[2] = 58;
        array4[3] = -84;
        array4[4] = 117;
        array4[5] = -50;
        array4[6] = 78;
        array4[7] = 113;
        array4[8] = 1;
        array4[9] = 119;
        array4[10] = -38;
        array4[11] = 94;
        array4[12] = -55;
        array4[13] = 66;
        array4[14] = -88;
        array4[15] = 34;
        array4[16] = 59;
        array4[17] = -15;
        array4[18] = -49;
        array4[19] = -54;
        array4[20] = 88;
        array4[21] = 80;
        array4[22] = 124;
        array4[23] = 54;
        array4[24] = 3;
        array4[25] = 32;
        a(array3, new byte[] { -14, -71, 95, -19, 5, -91, 61, 48, 119, 22, -77, 50, -88, 32, -60, 71, 104, -108, -84, -91, 54, 52, 63, 87, 111, 76 });
        final Boolean a2 = this.a(c, first, first2, new String(array3, utf_8).intern());
        if (a2 != null && a2) {
            final byte[] array6;
            final byte[] array5 = array6 = new byte[16];
            array6[0] = 45;
            array6[1] = 115;
            array6[2] = 87;
            array6[3] = -88;
            array6[4] = 96;
            array6[5] = 52;
            array6[6] = 50;
            array6[7] = 82;
            array6[8] = -57;
            array6[9] = 20;
            array6[10] = -7;
            array6[11] = -47;
            array6[12] = 4;
            array6[13] = -80;
            array6[14] = 59;
            array6[15] = 104;
            a(array5, new byte[] { 76, 1, 50, -23, 16, 95, 65, 19, -79, 117, -112, -67, 101, -46, 87, 13 });
            final String intern = new String(array5, utf_8).intern();
            final byte[] array8;
            final byte[] array7 = array8 = new byte[6];
            array8[0] = -2;
            array8[1] = 114;
            array8[2] = -74;
            array8[3] = -53;
            array8[4] = -115;
            array8[5] = -93;
            a(array7, new byte[] { -112, 19, -62, -94, -5, -58, -87, -8 });
            this.c(intern, new String(array7, utf_8).intern());
            return true;
        }
        return false;
    }
    
    public final boolean b(final Context context, final boolean b) {
        final byte[] array2;
        final byte[] array = array2 = new byte[35];
        array2[0] = 31;
        array2[1] = -91;
        array2[2] = 0;
        array2[3] = -61;
        array2[4] = 108;
        array2[5] = -95;
        array2[6] = 65;
        array2[7] = 92;
        array2[8] = 35;
        array2[9] = -124;
        array2[10] = -48;
        array2[11] = -11;
        array2[12] = 121;
        array2[13] = 19;
        array2[14] = -8;
        array2[15] = 114;
        array2[16] = -107;
        array2[17] = 77;
        array2[18] = -62;
        array2[19] = -45;
        array2[20] = -39;
        array2[21] = 104;
        array2[22] = 36;
        array2[23] = -12;
        array2[24] = 60;
        array2[25] = 57;
        array2[26] = -125;
        array2[27] = 59;
        array2[28] = 65;
        array2[29] = -45;
        array2[30] = 118;
        array2[31] = 69;
        array2[32] = -13;
        array2[33] = -46;
        array2[34] = -126;
        a(array, new byte[] { 118, -42, 82, -74, 2, -49, 40, 50, 68, -41, -91, -91, 11, 124, -101, 23, -26, 62, -89, -96, -104, 11, 80, -99, 74, 80, -9, 66, 12, -78, 24, 36, -108, -73, -16 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[8];
        array4[0] = -80;
        array4[1] = -123;
        array4[2] = -36;
        array4[3] = 118;
        array4[4] = 40;
        array4[5] = -56;
        array4[6] = 24;
        array4[7] = -43;
        a(array3, new byte[] { -47, -26, -88, 31, 94, -95, 108, -84 });
        final ActivityManager activityManager = (ActivityManager)context.getSystemService(new String(array3, utf_8).intern());
        if (activityManager == null) {
            return false;
        }
        final List runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        final Iterator iterator = runningAppProcesses.iterator();
        while (iterator.hasNext()) {
            String s = ((ActivityManager$RunningAppProcessInfo)iterator.next()).processName;
            if (s != null) {
                if (b) {
                    final String[] m = X0.m;
                    for (int length = m.length, i = 0; i < length; ++i) {
                        if (s.contains((CharSequence)m[i])) {
                            if (!this.r) {
                                final byte[] array6;
                                final byte[] array5 = array6 = new byte[4];
                                array6[0] = 68;
                                array6[1] = -105;
                                array6[2] = -68;
                                array6[3] = -9;
                                a(array5, new byte[] { 48, -27, -55, -110, -39, -60, 34, -38 });
                                s = new String(array5, StandardCharsets.UTF_8).intern();
                            }
                            this.b(intern, s);
                            return true;
                        }
                    }
                }
                final String[] l = X0.l;
                for (int length2 = l.length, j = 0; j < length2; ++j) {
                    if (s.contains((CharSequence)l[j])) {
                        if (!this.r) {
                            final byte[] array8;
                            final byte[] array7 = array8 = new byte[4];
                            array8[0] = -123;
                            array8[1] = 61;
                            array8[2] = 62;
                            array8[3] = 86;
                            a(array7, new byte[] { -15, 79, 75, 51, -37, -22, -22, 20 });
                            s = new String(array7, StandardCharsets.UTF_8).intern();
                        }
                        this.c(intern, s);
                        return true;
                    }
                }
                final byte[] array10;
                final byte[] array9 = array10 = new byte[6];
                array10[0] = -119;
                array10[1] = -64;
                array10[2] = -5;
                array10[3] = -124;
                array10[4] = 54;
                array10[5] = 96;
                a(array9, new byte[] { -28, -95, -100, -19, 69, 11, -89, 37 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                if (s.contains((CharSequence)new String(array9, utf_9).intern())) {
                    if (!this.r) {
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[4];
                        array12[0] = -94;
                        array12[1] = -43;
                        array12[2] = -121;
                        array12[3] = 123;
                        a(array11, new byte[] { -42, -89, -14, 30, -88, -112, -22, -118 });
                        s = new String(array11, utf_9).intern();
                    }
                    this.c(intern, s);
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    public final boolean b(final PackageManager packageManager) {
        if (packageManager == null) {
            return false;
        }
        final String a = this.s.a();
        if (a != null) {
            if (this.a(packageManager, a)) {
                return true;
            }
            this.s.b();
        }
        return this.a(packageManager);
    }
    
    public final boolean b(final boolean b) {
        final byte[] array2;
        final byte[] array = array2 = new byte[22];
        array2[0] = 26;
        array2[1] = -18;
        array2[2] = 84;
        array2[3] = 73;
        array2[4] = 93;
        array2[5] = -66;
        array2[6] = 118;
        array2[7] = 98;
        array2[8] = 82;
        array2[9] = -122;
        array2[10] = -38;
        array2[11] = -46;
        array2[12] = -103;
        array2[14] = (array2[13] = 8);
        array2[15] = -111;
        array2[16] = -66;
        array2[17] = -127;
        array2[18] = -103;
        array2[19] = 56;
        array2[20] = 126;
        array2[21] = 93;
        a(array, new byte[] { 115, -99, 6, 60, 51, -48, 31, 12, 53, -43, -81, -126, -21, 103, 107, -12, -51, -14, -4, 75, 46, 14 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[2];
        array4[0] = -31;
        array4[1] = -28;
        a(array3, new byte[] { -111, -105, 105, -67, -100, -128, -1, -59 });
        final String intern2 = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[5];
        array6[0] = -15;
        array6[1] = -53;
        array6[2] = -108;
        array6[3] = -27;
        array6[4] = -122;
        a(array5, new byte[] { -127, -72, -76, -56, -57, -35, 21, 12 });
        final String intern3 = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[5];
        array8[0] = 32;
        array8[1] = -109;
        array8[2] = -68;
        array8[3] = 6;
        array8[4] = 110;
        a(array7, new byte[] { 80, -32, -100, 43, 11, -105, -61, -128 });
        final String intern4 = new String(array7, utf_8).intern();
        for (int i = 0; i < 3; ++i) {
            final String s = (new String[] { intern2, intern3, intern4 })[i];
            final String b2 = C1.b(s);
            if (b2 != null) {
                if (b) {
                    for (final String s2 : X0.m) {
                        if (b2.contains((CharSequence)s2)) {
                            String string = s;
                            if (this.r) {
                                final StringBuilder append = new StringBuilder().append(s);
                                final byte[] array9 = { -42 };
                                a(array9, new byte[] { -10, 26, 33, -96, 55, 77, 27, 8 });
                                string = append.append(new String(array9, StandardCharsets.UTF_8).intern()).append(s2).toString();
                            }
                            this.b(intern, string);
                            return true;
                        }
                    }
                }
                for (final String s3 : X0.l) {
                    if (b2.contains((CharSequence)s3)) {
                        String string2 = s;
                        if (this.r) {
                            final StringBuilder append2 = new StringBuilder().append(s);
                            final byte[] array10 = { 21 };
                            a(array10, new byte[] { 53, -92, 117, -119, -62, 31, 11, 75 });
                            string2 = append2.append(new String(array10, StandardCharsets.UTF_8).intern()).append(s3).toString();
                        }
                        this.c(intern, string2);
                        return true;
                    }
                }
                final byte[] array12;
                final byte[] array11 = array12 = new byte[6];
                array12[0] = -19;
                array12[1] = -17;
                array12[2] = 86;
                array12[3] = 45;
                array12[4] = 24;
                array12[5] = 51;
                a(array11, new byte[] { -128, -114, 49, 68, 107, 88, -59, -49 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                if (b2.contains((CharSequence)new String(array11, utf_9).intern())) {
                    String string3 = s;
                    if (this.r) {
                        final StringBuilder append3 = new StringBuilder().append(s);
                        final byte[] array13 = { -123 };
                        a(array13, new byte[] { -91, -84, -52, 104, -23, 95, -47, -95 });
                        final StringBuilder append4 = append3.append(new String(array13, utf_9).intern());
                        final byte[] array15;
                        final byte[] array14 = array15 = new byte[6];
                        array15[0] = 99;
                        array15[1] = -57;
                        array15[2] = -38;
                        array15[3] = -107;
                        array15[4] = -10;
                        array15[5] = 33;
                        a(array14, new byte[] { 14, -90, -67, -4, -123, 74, 64, 72 });
                        string3 = append4.append(new String(array14, utf_9).intern()).toString();
                    }
                    this.c(intern, string3);
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean c() {
        super.m.a().b();
        return false;
    }
    
    public final boolean c(final Context context) {
        final Intent intent = new Intent();
        final byte[] array2;
        final byte[] array = array2 = new byte[22];
        array2[0] = 34;
        array2[1] = 109;
        array2[2] = 124;
        array2[3] = 56;
        array2[4] = -9;
        array2[5] = 45;
        array2[6] = 120;
        array2[7] = 76;
        array2[8] = 13;
        array2[9] = 113;
        array2[10] = 13;
        array2[11] = -85;
        array2[12] = 51;
        array2[13] = 110;
        array2[14] = -2;
        array2[15] = 33;
        array2[16] = 16;
        array2[17] = -77;
        array2[18] = 124;
        array2[19] = 57;
        array2[20] = -10;
        array2[21] = 64;
        a(array, new byte[] { 65, 2, 17, 22, -125, 94, 22, 43, 35, 25, 100, -49, 86, 3, -121, 64, 96, -61, 16, 80, -123, 52 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[43];
        array4[0] = -72;
        array4[1] = 55;
        array4[3] = (array4[2] = -57);
        array4[4] = 61;
        array4[5] = 58;
        array4[6] = -82;
        array4[7] = 83;
        array4[8] = 106;
        array4[9] = -99;
        array4[10] = 36;
        array4[11] = 27;
        array4[12] = -98;
        array4[13] = 46;
        array4[14] = 4;
        array4[15] = -97;
        array4[16] = -110;
        array4[17] = -54;
        array4[18] = -108;
        array4[19] = 16;
        array4[20] = -120;
        array4[21] = 108;
        array4[22] = -36;
        array4[23] = 48;
        array4[24] = -116;
        array4[25] = 111;
        array4[26] = 106;
        array4[27] = -73;
        array4[28] = -98;
        array4[29] = 46;
        array4[30] = -9;
        array4[31] = -100;
        array4[32] = 56;
        array4[33] = 79;
        array4[34] = -115;
        array4[35] = -47;
        array4[36] = 77;
        array4[37] = 9;
        array4[38] = 0;
        array4[39] = 124;
        array4[40] = 71;
        array4[41] = 80;
        array4[42] = -47;
        a(array3, new byte[] { -37, 88, -86, -23, 73, 73, -64, 52, 68, -11, 77, 127, -5, 67, 125, -2, -30, -70, -8, 121, -5, 24, -14, 125, -19, 6, 4, -10, -3, 90, -98, -22, 81, 59, -12, -99, 44, 124, 110, 31, 47, 53, -93 });
        intent.setClassName(intern, new String(array3, utf_8).intern());
        try {
            context.startActivity(intent);
            final byte[] array6;
            final byte[] array5 = array6 = new byte[19];
            array6[0] = -8;
            array6[1] = -89;
            array6[2] = -119;
            array6[3] = 68;
            array6[4] = 47;
            array6[5] = -94;
            array6[6] = -31;
            array6[7] = -84;
            array6[8] = 39;
            array6[9] = -85;
            array6[10] = 39;
            array6[11] = -37;
            array6[12] = 54;
            array6[13] = 64;
            array6[14] = 58;
            array6[15] = -72;
            array6[16] = -12;
            array6[17] = -110;
            array6[18] = 103;
            a(array5, new byte[] { -98, -50, -25, 32, 125, -51, -114, -40, 102, -37, 87, -103, 79, 9, 84, -52, -111, -4, 19 });
            final String intern2 = new String(array5, utf_8).intern();
            final byte[] array8;
            final byte[] array7 = array8 = new byte[4];
            array8[0] = -113;
            array8[1] = 126;
            array8[2] = 20;
            array8[3] = 49;
            a(array7, new byte[] { -5, 12, 97, 84, 124, -68, 72, 30 });
            this.b(intern2, new String(array7, utf_8).intern());
            return true;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final boolean c(final Context context, final boolean b) {
        final byte[] array2;
        final byte[] array = array2 = new byte[32];
        array2[0] = 32;
        array2[1] = -41;
        array2[2] = 80;
        array2[3] = 38;
        array2[4] = 83;
        array2[5] = 125;
        array2[6] = 28;
        array2[7] = -118;
        array2[8] = 92;
        array2[9] = -38;
        array2[10] = 81;
        array2[11] = -13;
        array2[12] = -72;
        array2[13] = 59;
        array2[14] = -17;
        array2[15] = -60;
        array2[16] = -93;
        array2[17] = 6;
        array2[18] = 109;
        array2[19] = -19;
        array2[20] = 110;
        array2[21] = -61;
        array2[22] = -39;
        array2[23] = -68;
        array2[24] = 30;
        array2[25] = -85;
        array2[26] = -28;
        array2[27] = 9;
        array2[28] = 2;
        array2[29] = 34;
        array2[30] = 85;
        array2[31] = 97;
        a(array, new byte[] { 73, -92, 2, 83, 61, 19, 117, -28, 59, -119, 36, -93, -54, 84, -116, -95, -48, 117, 8, -98, 61, -73, -72, -56, 109, -26, -123, 103, 99, 69, 48, 19 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[10];
        array4[0] = 90;
        array4[1] = -64;
        array4[2] = -5;
        array4[3] = -54;
        array4[4] = -102;
        array4[5] = 6;
        array4[6] = 50;
        array4[7] = -100;
        array4[8] = -46;
        array4[9] = -123;
        a(array3, new byte[] { 47, -77, -102, -83, -1, 117, 70, -3, -90, -10 });
        final UsageStatsManager usageStatsManager = (UsageStatsManager)context.getSystemService(new String(array3, utf_8).intern());
        if (usageStatsManager == null) {
            return false;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final List queryUsageStats = usageStatsManager.queryUsageStats(0, currentTimeMillis - 100000000L, currentTimeMillis);
        if (queryUsageStats == null) {
            return false;
        }
        final Iterator iterator = queryUsageStats.iterator();
        while (iterator.hasNext()) {
            String s = ((UsageStats)iterator.next()).getPackageName();
            if (s != null) {
                if (b) {
                    final String[] m = X0.m;
                    for (int length = m.length, i = 0; i < length; ++i) {
                        if (s.contains((CharSequence)m[i])) {
                            if (!this.r) {
                                final byte[] array6;
                                final byte[] array5 = array6 = new byte[4];
                                array6[0] = 64;
                                array6[1] = 43;
                                array6[2] = -27;
                                array6[3] = -97;
                                a(array5, new byte[] { 52, 89, -112, -6, -8, 71, -90, -9 });
                                s = new String(array5, StandardCharsets.UTF_8).intern();
                            }
                            this.b(intern, s);
                            return true;
                        }
                    }
                }
                final String[] l = X0.l;
                for (int length2 = l.length, j = 0; j < length2; ++j) {
                    if (s.contains((CharSequence)l[j])) {
                        if (!this.r) {
                            final byte[] array8;
                            final byte[] array7 = array8 = new byte[4];
                            array8[0] = -38;
                            array8[1] = 64;
                            array8[2] = -53;
                            array8[3] = 78;
                            a(array7, new byte[] { -82, 50, -66, 43, 127, 24, 94, -57 });
                            s = new String(array7, StandardCharsets.UTF_8).intern();
                        }
                        this.c(intern, s);
                        return true;
                    }
                }
                final byte[] array10;
                final byte[] array9 = array10 = new byte[6];
                array10[0] = -100;
                array10[1] = 118;
                array10[2] = 11;
                array10[3] = 76;
                array10[4] = 66;
                array10[5] = 65;
                a(array9, new byte[] { -15, 23, 108, 37, 49, 42, -53, -33 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                if (s.contains((CharSequence)new String(array9, utf_9).intern())) {
                    if (!this.r) {
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[4];
                        array12[0] = -35;
                        array12[1] = 49;
                        array12[2] = -87;
                        array12[3] = -21;
                        a(array11, new byte[] { -87, 67, -36, -114, -21, -32, -128, -60 });
                        s = new String(array11, utf_9).intern();
                    }
                    this.c(intern, s);
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    public void d(final Context context) {
        super.a(this.t = this.a((f$a)new Y0$$ExternalSyntheticLambda0(this, context)));
    }
    
    public final boolean d(final String s) {
        final boolean g = this.g(s);
        if (g) {
            final byte[] array2;
            final byte[] array = array2 = new byte[17];
            array2[0] = -30;
            array2[1] = 59;
            array2[2] = -82;
            array2[3] = 22;
            array2[4] = -79;
            array2[5] = 88;
            array2[6] = 118;
            array2[7] = 6;
            array2[8] = -89;
            array2[9] = 20;
            array2[10] = 103;
            array2[11] = -117;
            array2[12] = 106;
            array2[13] = 17;
            array2[14] = 101;
            array2[15] = -95;
            array2[16] = -3;
            a(array, new byte[] { -127, 90, -64, 83, -55, 61, 21, 115, -45, 113, 36, -28, 7, 124, 4, -49, -103 });
            this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
        }
        return g;
    }
    
    public void e(final Context context) {
        final X t = this.t;
        if (t != null && t.b()) {
            return;
        }
        super.a(this.a((f$a)new Y0$$ExternalSyntheticLambda1(this, context)));
    }
    
    public final boolean e() {
        final String[] g = X0.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            if (this.f(g[i])) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean e(final String s) {
        for (final String s2 : X0.h) {
            final StringBuilder append = new StringBuilder().append(s2);
            final byte[] array = { -75 };
            a(array, new byte[] { -107, 119, -125, -34, -91, 18, -18, -54 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            if (C1.b(append.append(new String(array, utf_8).intern()).append(s).toString()) != null) {
                final byte[] array3;
                final byte[] array2 = array3 = new byte[27];
                array3[0] = -111;
                array3[1] = 75;
                array3[2] = 11;
                array3[3] = 109;
                array3[4] = -103;
                array3[5] = -6;
                array3[6] = 92;
                array3[7] = -70;
                array3[8] = -13;
                array3[9] = -100;
                array3[10] = 0;
                array3[11] = 73;
                array3[12] = -74;
                array3[13] = 97;
                array3[14] = -78;
                array3[15] = -73;
                array3[16] = -33;
                array3[17] = -4;
                array3[18] = -72;
                array3[19] = 38;
                array3[20] = -101;
                array3[21] = -5;
                array3[22] = 83;
                array3[23] = 82;
                array3[24] = 43;
                array3[25] = 10;
                array3[26] = -113;
                a(array2, new byte[] { -14, 42, 101, 40, -31, -97, 63, -49, -121, -7, 67, 38, -37, 12, -45, -39, -69, -87, -53, 79, -11, -100, 4, 58, 66, 105, -25 });
                final String intern = new String(array2, utf_8).intern();
                final StringBuilder append2 = new StringBuilder().append(s2);
                final byte[] array4 = { 110 };
                a(array4, new byte[] { 78, 107, 70, -115, 73, 20, -113, 90 });
                this.c(intern, append2.append(new String(array4, utf_8).intern()).append(s).toString());
                return true;
            }
        }
        return false;
    }
    
    public final boolean e(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = -1;
        array2[1] = 80;
        array2[2] = -21;
        array2[3] = -31;
        array2[4] = 93;
        array2[5] = 4;
        array2[6] = 47;
        array2[7] = 24;
        a(array, new byte[] { -104, 53, -97, -111, 47, 107, 95, 56 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String b = C1.b(sb.append(new String(array, utf_8).intern()).append(s).toString());
        final boolean b2 = b != null && b.equals((Object)s2);
        if (b2) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[23];
            array4[0] = -112;
            array4[1] = -94;
            array4[2] = 2;
            array4[3] = 97;
            array4[4] = 49;
            array4[5] = -13;
            array4[6] = 126;
            array4[7] = 110;
            array4[8] = -99;
            array4[9] = 3;
            array4[10] = -104;
            array4[11] = -92;
            array4[12] = 95;
            array4[13] = 32;
            array4[14] = -53;
            array4[15] = -22;
            array4[16] = -103;
            array4[17] = -7;
            array4[18] = -69;
            array4[19] = -99;
            array4[20] = 44;
            array4[21] = 18;
            array4[22] = -67;
            a(array3, new byte[] { -7, -47, 81, 24, 66, -121, 27, 3, -51, 113, -9, -44, 58, 82, -65, -109, -36, -120, -50, -4, 64, 70, -46 });
            final String intern = new String(array3, utf_8).intern();
            final StringBuilder append = new StringBuilder().append(s);
            final byte[] array6;
            final byte[] array5 = array6 = new byte[3];
            array6[0] = 87;
            array6[1] = 96;
            array6[2] = -44;
            a(array5, new byte[] { 119, 90, -12, -108, 3, -47, -31, 31 });
            this.c(intern, append.append(new String(array5, utf_8).intern()).append(s2).toString());
        }
        return b2;
    }
    
    public final boolean f() {
        for (final String s : X0.i) {
            if (new File(s).exists()) {
                final byte[] array2;
                final byte[] array = array2 = new byte[15];
                array2[0] = 48;
                array2[1] = 2;
                array2[2] = -106;
                array2[3] = -66;
                array2[4] = -30;
                array2[5] = 63;
                array2[7] = (array2[6] = 0);
                array2[8] = 57;
                array2[9] = -17;
                array2[10] = 51;
                array2[11] = -36;
                array2[12] = 121;
                array2[13] = -92;
                array2[14] = -118;
                a(array, new byte[] { 81, 112, -13, -8, -117, 83, 101, 115, 105, -99, 86, -81, 28, -54, -2 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean f(final String s) {
        for (final String s2 : X0.j) {
            if (new File(s2 + s).exists()) {
                final byte[] array2;
                final byte[] array = array2 = new byte[18];
                array2[0] = -115;
                array2[1] = 107;
                array2[2] = 120;
                array2[3] = 6;
                array2[4] = -41;
                array2[5] = -124;
                array2[6] = 122;
                array2[7] = 26;
                array2[8] = 49;
                array2[9] = 37;
                array2[10] = -76;
                array2[11] = -121;
                array2[12] = -56;
                array2[13] = -88;
                array2[14] = 111;
                array2[15] = 12;
                array2[16] = -50;
                array2[17] = 47;
                a(array, new byte[] { -20, 25, 29, 68, -66, -22, 27, 104, 88, 64, -57, -41, -70, -51, 28, 105, -96, 91 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s2 + s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean g() {
        for (final String s : X0.k) {
            if (new File(s).canWrite()) {
                final byte[] array2;
                final byte[] array = array2 = new byte[18];
                array2[0] = -102;
                array2[1] = 31;
                array2[2] = -30;
                array2[3] = 28;
                array2[4] = 77;
                array2[5] = -30;
                array2[6] = 91;
                array2[7] = 74;
                array2[8] = -60;
                array2[9] = 8;
                array2[10] = -105;
                array2[11] = 19;
                array2[12] = 112;
                array2[13] = 10;
                array2[14] = 42;
                array2[15] = 6;
                array2[16] = -40;
                array2[17] = -107;
                a(array, new byte[] { -5, 109, -121, 90, 34, -114, 63, 47, -74, 123, -64, 97, 25, 126, 75, 100, -76, -16 });
                this.c(new String(array, StandardCharsets.UTF_8).intern(), s);
                return true;
            }
        }
        return false;
    }
    
    public final boolean g(final String s) {
        boolean b = false;
        try {
            if (C1.a(s) != null) {
                b = true;
            }
            return b;
        }
        catch (final Exception ex) {
            return b;
        }
    }
    
    public final boolean h() {
        final byte[] array2;
        final byte[] array = array2 = new byte[19];
        array2[0] = -23;
        array2[1] = 13;
        array2[2] = 9;
        array2[3] = 85;
        array2[4] = 44;
        array2[5] = -55;
        array2[6] = 124;
        array2[7] = -91;
        array2[8] = -103;
        array2[9] = 59;
        array2[10] = -80;
        array2[11] = -55;
        array2[12] = -95;
        array2[13] = -55;
        array2[14] = 103;
        array2[15] = -58;
        array2[16] = -7;
        array2[17] = -97;
        array2[18] = 5;
        a(array, new byte[] { -128, 99, 96, 33, 2, -70, 10, -58, -73, 86, -47, -82, -56, -70, 12, -103, -119, -7, 118 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[7];
        array4[0] = 21;
        array4[1] = -74;
        array4[2] = 30;
        array4[3] = -7;
        array4[4] = -5;
        array4[5] = 112;
        array4[6] = -51;
        a(array3, new byte[] { 102, -62, 113, -119, -117, 21, -87, 13 });
        final boolean e = this.e(intern, new String(array3, utf_8).intern());
        boolean b2;
        final boolean b = b2 = true;
        if (!e) {
            final byte[] array6;
            final byte[] array5 = array6 = new byte[20];
            array6[0] = 93;
            array6[1] = -25;
            array6[2] = -107;
            array6[3] = -46;
            array6[4] = 53;
            array6[5] = -87;
            array6[6] = 44;
            array6[7] = -95;
            array6[8] = 37;
            array6[9] = -53;
            array6[10] = 16;
            array6[11] = -9;
            array6[12] = -82;
            array6[13] = -127;
            array6[14] = 115;
            array6[15] = 47;
            array6[16] = -68;
            array6[17] = 116;
            array6[18] = 119;
            array6[19] = 43;
            a(array5, new byte[] { 52, -119, -4, -90, 27, -38, 90, -62, 11, -90, 113, -112, -57, -14, 24, 112, -52, 18, 4, 79 });
            final String intern2 = new String(array5, utf_8).intern();
            final byte[] array8;
            final byte[] array7 = array8 = new byte[7];
            array8[0] = 121;
            array8[1] = -62;
            array8[2] = 49;
            array8[3] = 74;
            array8[4] = 59;
            array8[5] = -75;
            array8[6] = -28;
            a(array7, new byte[] { 10, -74, 94, 58, 75, -48, -128, 17 });
            b2 = b;
            if (!this.e(intern2, new String(array7, utf_8).intern())) {
                final byte[] array10;
                final byte[] array9 = array10 = new byte[23];
                array10[0] = -99;
                array10[1] = 68;
                array10[2] = 27;
                array10[3] = -49;
                array10[4] = 66;
                array10[5] = -106;
                array10[6] = 1;
                array10[7] = -114;
                array10[8] = -99;
                array10[9] = 78;
                array10[10] = -92;
                array10[11] = -53;
                array10[12] = 88;
                array10[13] = 126;
                array10[14] = -55;
                array10[15] = 72;
                array10[16] = 64;
                array10[17] = 56;
                array10[18] = 11;
                array10[19] = 27;
                array10[20] = 71;
                array10[21] = -62;
                array10[22] = -22;
                a(array9, new byte[] { -12, 42, 114, -69, 108, -27, 119, -19, -77, 35, -59, -84, 49, 13, -94, 23, 51, 93, 121, 109, 46, -95, -113 });
                final String intern3 = new String(array9, utf_8).intern();
                final byte[] array12;
                final byte[] array11 = array12 = new byte[7];
                array12[0] = -64;
                array12[1] = -8;
                array12[2] = -24;
                array12[3] = 71;
                array12[4] = 4;
                array12[5] = 71;
                array12[6] = -125;
                a(array11, new byte[] { -77, -116, -121, 55, 116, 34, -25, -115 });
                b2 = b;
                if (!this.e(intern3, new String(array11, utf_8).intern())) {
                    final byte[] array14;
                    final byte[] array13 = array14 = new byte[19];
                    array14[0] = -60;
                    array14[1] = -23;
                    array14[2] = 81;
                    array14[3] = 65;
                    array14[4] = -14;
                    array14[5] = 113;
                    array14[6] = -51;
                    array14[7] = -95;
                    array14[8] = -80;
                    array14[9] = -75;
                    array14[10] = -36;
                    array14[11] = -32;
                    array14[12] = -33;
                    array14[13] = -28;
                    array14[14] = -63;
                    array14[15] = -28;
                    array14[16] = 36;
                    array14[17] = -119;
                    array14[18] = -89;
                    a(array13, new byte[] { -76, -116, 35, 50, -101, 2, -71, -113, -35, -44, -69, -119, -84, -113, -17, -116, 77, -19, -62 });
                    final String intern4 = new String(array13, utf_8).intern();
                    final byte[] array15 = { -1 };
                    a(array15, new byte[] { -50, -30, 99, -90, -24, -127, 79, 49 });
                    b2 = (this.e(intern4, new String(array15, utf_8).intern()) && b);
                }
            }
        }
        return b2;
    }
    
    public boolean i() {
        final byte[] array2;
        final byte[] array = array2 = new byte[44];
        array2[0] = 57;
        array2[1] = 19;
        array2[2] = -58;
        array2[3] = 71;
        array2[4] = 84;
        array2[5] = 44;
        array2[6] = -98;
        array2[7] = -48;
        array2[8] = -112;
        array2[9] = 95;
        array2[10] = 24;
        array2[11] = -76;
        array2[12] = -5;
        array2[13] = 98;
        array2[14] = 11;
        array2[15] = 32;
        array2[16] = 45;
        array2[17] = 25;
        array2[18] = -51;
        array2[19] = -69;
        array2[20] = 0;
        array2[21] = 66;
        array2[22] = 41;
        array2[23] = 59;
        array2[24] = 73;
        array2[25] = 111;
        array2[26] = -25;
        array2[27] = -3;
        array2[28] = -16;
        array2[29] = 121;
        array2[30] = 104;
        array2[31] = 22;
        array2[32] = 1;
        array2[33] = -12;
        array2[34] = 63;
        array2[35] = 96;
        array2[36] = -36;
        array2[37] = -55;
        array2[38] = 94;
        array2[39] = 114;
        array2[40] = 4;
        array2[41] = 99;
        array2[42] = -45;
        array2[43] = 46;
        a(array, new byte[] { 94, 118, -78, 55, 38, 67, -18, -16, -32, 58, 106, -57, -110, 17, 127, 14, 94, 96, -66, -107, 118, 45, 69, 95, 22, 14, -105, -115, -81, 12, 6, 123, 110, -127, 81, 20, -125, -84, 48, 19, 102, 15, -74, 74 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String b = C1.b(new String(array, utf_8).intern());
        if (b != null) {
            final byte[] array3 = { 75 };
            a(array3, new byte[] { 122, 70, -7, 127, -109, 55, 72, -52 });
            if (b.equals((Object)new String(array3, utf_8).intern())) {
                final byte[] array5;
                final byte[] array4 = array5 = new byte[19];
                array5[0] = -89;
                array5[1] = 73;
                array5[2] = 10;
                array5[3] = 22;
                array5[4] = 120;
                array5[5] = -110;
                array5[6] = -96;
                array5[7] = -110;
                array5[8] = -90;
                array5[9] = 16;
                array5[10] = -84;
                array5[11] = 68;
                array5[12] = 127;
                array5[13] = -2;
                array5[14] = 62;
                array5[15] = 113;
                array5[16] = 62;
                array5[17] = 82;
                array5[18] = 68;
                a(array4, new byte[] { -60, 33, 111, 117, 19, -57, -50, -1, -55, 101, -62, 48, 58, -112, 95, 19, 82, 55, 32 });
                final String intern = new String(array4, utf_8).intern();
                final byte[] array7;
                final byte[] array6 = array7 = new byte[4];
                array7[0] = -46;
                array7[1] = -43;
                array7[2] = -95;
                array7[3] = -70;
                a(array6, new byte[] { -90, -89, -44, -33, -105, -68, 31, -106 });
                this.b(intern, new String(array6, utf_8).intern());
                return true;
            }
        }
        return false;
    }
    
    public final boolean j() {
        final byte[] array2;
        final byte[] array = array2 = new byte[33];
        array2[0] = 124;
        array2[1] = 108;
        array2[2] = 90;
        array2[3] = 86;
        array2[4] = 20;
        array2[5] = 3;
        array2[6] = -6;
        array2[8] = (array2[7] = 16);
        array2[9] = -15;
        array2[10] = -10;
        array2[11] = -70;
        array2[12] = 86;
        array2[13] = -86;
        array2[14] = 37;
        array2[15] = -16;
        array2[16] = -78;
        array2[17] = -41;
        array2[18] = -70;
        array2[19] = 77;
        array2[20] = 70;
        array2[21] = 92;
        array2[22] = 16;
        array2[23] = 44;
        array2[24] = -127;
        array2[25] = 57;
        array2[26] = -36;
        array2[27] = 64;
        array2[28] = 59;
        array2[29] = 9;
        array2[30] = 102;
        array2[31] = 93;
        array2[32] = -96;
        a(array, new byte[] { 27, 9, 46, 38, 102, 108, -118, 48, 98, -98, -40, -40, 57, -59, 81, -34, -60, -78, -56, 36, 32, 53, 117, 72, -29, 86, -77, 52, 72, 125, 7, 41, -59 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String b = C1.b(new String(array, utf_8).intern());
        if (b != null) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[6];
            array4[0] = -93;
            array4[1] = 41;
            array4[2] = 8;
            array4[3] = 60;
            array4[5] = (array4[4] = -91);
            a(array3, new byte[] { -38, 76, 100, 80, -54, -46, 56, -96 });
            if (!b.equals((Object)new String(array3, utf_8).intern())) {
                final byte[] array6;
                final byte[] array5 = array6 = new byte[6];
                array6[0] = -82;
                array6[1] = 116;
                array6[2] = -125;
                array6[3] = -74;
                array6[4] = 30;
                array6[5] = 1;
                a(array5, new byte[] { -63, 6, -30, -40, 121, 100, -65, 60 });
                if (!b.equals((Object)new String(array5, utf_8).intern())) {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[3];
                    array8[0] = -101;
                    array8[1] = -35;
                    array8[2] = -107;
                    a(array7, new byte[] { -23, -72, -15, 99, 20, -109, 32, -40 });
                    if (!b.equals((Object)new String(array7, utf_8).intern())) {
                        return false;
                    }
                }
            }
            final byte[] array10;
            final byte[] array9 = array10 = new byte[28];
            array10[0] = 18;
            array10[1] = 36;
            array10[2] = 116;
            array10[3] = 42;
            array10[4] = 126;
            array10[5] = 122;
            array10[6] = 71;
            array10[7] = -17;
            array10[8] = 102;
            array10[9] = -125;
            array10[10] = 1;
            array10[11] = -128;
            array10[12] = 0;
            array10[13] = 119;
            array10[14] = 121;
            array10[15] = 107;
            array10[16] = -98;
            array10[17] = -46;
            array10[18] = 63;
            array10[19] = -100;
            array10[20] = -106;
            array10[21] = -92;
            array10[22] = 32;
            array10[23] = -81;
            array10[24] = 114;
            array10[25] = 103;
            array10[26] = 74;
            array10[27] = -35;
            a(array9, new byte[] { 113, 76, 17, 73, 21, 44, 34, -99, 15, -27, 104, -27, 100, 53, 22, 4, -22, -66, 80, -3, -14, -63, 82, -4, 6, 6, 62, -72 });
            this.b(new String(array9, utf_8).intern(), b);
            return true;
        }
        return false;
    }
    
    public final boolean k() {
        final byte[] array2;
        final byte[] array = array2 = new byte[16];
        array2[0] = 30;
        array2[1] = 54;
        array2[2] = 40;
        array2[3] = -23;
        array2[4] = -95;
        array2[5] = -76;
        array2[6] = -72;
        array2[7] = 31;
        array2[8] = -101;
        array2[9] = 86;
        array2[10] = 118;
        array2[11] = 86;
        array2[12] = -65;
        array2[13] = 49;
        array2[14] = 10;
        array2[15] = 118;
        a(array, new byte[] { 109, 83, 90, -97, -56, -41, -35, 49, -6, 50, 20, 120, -51, 94, 101, 2 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final Integer value = C1.d(intern);
        if (value.equals((Object)1)) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[23];
            array4[0] = -51;
            array4[1] = 41;
            array4[2] = -21;
            array4[3] = -54;
            array4[4] = -40;
            array4[5] = 97;
            array4[6] = 94;
            array4[7] = -78;
            array4[8] = -7;
            array4[9] = -101;
            array4[10] = 37;
            array4[11] = 67;
            array4[12] = -63;
            array4[13] = -11;
            array4[14] = 60;
            array4[15] = 112;
            array4[16] = -23;
            array4[17] = 121;
            array4[18] = 108;
            array4[19] = 5;
            array4[20] = 113;
            array4[21] = 102;
            array4[22] = -24;
            a(array3, new byte[] { -92, 90, -72, -77, -85, 21, 59, -33, -87, -23, 74, 51, -92, -121, 72, 9, -84, 8, 25, 100, 29, 50, -121 });
            final String intern2 = new String(array3, utf_8).intern();
            final StringBuilder append = new StringBuilder().append(intern);
            final byte[] array6;
            final byte[] array5 = array6 = new byte[3];
            array6[0] = 73;
            array6[1] = 17;
            array6[2] = 51;
            a(array5, new byte[] { 105, 43, 19, 22, -28, 97, 125, 105 });
            this.c(intern2, append.append(new String(array5, utf_8).intern()).append((Object)value).toString());
            return true;
        }
        return false;
    }
    
    public final boolean l() {
        final Random$Default default1 = Random.Default;
        boolean b = true;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] l = Natives.a.l(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[32];
        array2[0] = 115;
        array2[1] = 48;
        array2[2] = -17;
        array2[3] = 14;
        array2[4] = 39;
        array2[5] = 120;
        array2[6] = -80;
        array2[7] = 21;
        array2[8] = -126;
        array2[9] = -94;
        array2[10] = 13;
        array2[11] = 11;
        array2[12] = -68;
        array2[13] = 41;
        array2[14] = -27;
        array2[15] = 20;
        array2[16] = -97;
        array2[17] = -110;
        array2[18] = 0;
        array2[19] = -50;
        array2[20] = 3;
        array2[21] = -50;
        array2[22] = -90;
        array2[23] = -51;
        array2[24] = 6;
        array2[25] = -76;
        array2[26] = -3;
        array2[27] = -116;
        array2[28] = -83;
        array2[29] = -2;
        array2[30] = -73;
        array2[31] = -1;
        a(array, new byte[] { 26, 67, -85, 107, 81, 17, -45, 112, -48, -51, 98, 127, -39, 77, -93, 113, -2, -26, 117, -68, 102, -102, -61, -66, 114, -35, -109, -21, -18, -97, -37, -109 });
        final int[] e = this.e(l, first, first2, new String(array, StandardCharsets.UTF_8).intern());
        if (e != null && e.length > 0) {
            this.a(e);
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean m() {
        final byte[] array2;
        final byte[] array = array2 = new byte[26];
        array2[0] = -76;
        array2[1] = -58;
        array2[2] = 117;
        array2[3] = 100;
        array2[4] = -14;
        array2[5] = 48;
        array2[6] = -24;
        array2[7] = -76;
        array2[8] = -61;
        array2[9] = -29;
        array2[10] = 34;
        array2[11] = 87;
        array2[12] = 69;
        array2[13] = 119;
        array2[14] = -75;
        array2[15] = 27;
        array2[16] = -10;
        array2[17] = -13;
        array2[18] = -1;
        array2[19] = -127;
        array2[20] = -64;
        array2[21] = -22;
        array2[22] = -11;
        array2[23] = -92;
        array2[24] = 121;
        array2[25] = -81;
        a(array, new byte[] { -101, -93, 1, 7, -35, 67, -115, -41, -74, -111, 75, 35, 60, 88, -38, 111, -105, -112, -102, -13, -76, -103, -37, -34, 16, -33 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final boolean exists = new File(new String(array, utf_8).intern()).exists();
        if (!exists) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[23];
            array4[0] = 17;
            array4[1] = 87;
            array4[2] = -102;
            array4[3] = -43;
            array4[4] = 98;
            array4[5] = -25;
            array4[6] = 55;
            array4[7] = -26;
            array4[8] = -15;
            array4[9] = -16;
            array4[10] = 125;
            array4[11] = -62;
            array4[12] = 94;
            array4[13] = -34;
            array4[14] = 122;
            array4[15] = 36;
            array4[16] = 102;
            array4[17] = 83;
            array4[18] = -21;
            array4[19] = 105;
            array4[20] = 2;
            array4[21] = 56;
            array4[22] = 105;
            a(array3, new byte[] { 120, 36, -43, -95, 3, -92, 82, -108, -123, -103, 27, -85, 61, -65, 14, 65, 43, 58, -104, 26, 107, 86, 14 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[26];
            array6[0] = 113;
            array6[1] = 65;
            array6[2] = 40;
            array6[3] = -67;
            array6[4] = -118;
            array6[5] = -37;
            array6[6] = -103;
            array6[7] = 8;
            array6[8] = -64;
            array6[9] = -81;
            array6[10] = -12;
            array6[11] = -90;
            array6[12] = -81;
            array6[13] = -39;
            array6[14] = 36;
            array6[15] = -31;
            array6[16] = -43;
            array6[17] = 91;
            array6[18] = -72;
            array6[19] = -29;
            array6[20] = -12;
            array6[21] = -99;
            array6[22] = -46;
            array6[23] = -71;
            array6[24] = -89;
            array6[25] = -43;
            a(array5, new byte[] { 94, 36, 92, -34, -91, -88, -4, 107, -75, -35, -99, -46, -42, -10, 75, -107, -76, 56, -35, -111, -128, -18, -4, -61, -50, -91 });
            this.c(intern, new String(array5, utf_8).intern());
        }
        return exists ^ true;
    }
    
    public final boolean n() {
        final byte[] array2;
        final byte[] array = array2 = new byte[13];
        array2[0] = 64;
        array2[1] = -63;
        array2[2] = 101;
        array2[3] = 10;
        array2[4] = 25;
        array2[5] = 72;
        array2[6] = -79;
        array2[7] = 61;
        array2[8] = 72;
        array2[9] = 10;
        array2[10] = 109;
        array2[11] = -72;
        array2[12] = 102;
        a(array, new byte[] { 50, -82, 75, 110, 124, 42, -60, 90, 47, 107, 15, -44, 3 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        if (Integer.valueOf(C1.d(new String(array, utf_8).intern())).equals((Object)1)) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[23];
            array4[0] = -45;
            array4[1] = 92;
            array4[2] = 21;
            array4[3] = -110;
            array4[4] = 69;
            array4[5] = -89;
            array4[6] = 95;
            array4[7] = -66;
            array4[8] = 68;
            array4[9] = -89;
            array4[10] = 37;
            array4[11] = 65;
            array4[12] = -32;
            array4[13] = -78;
            array4[14] = 45;
            array4[15] = -114;
            array4[16] = 51;
            array4[17] = 62;
            array4[18] = 59;
            array4[19] = 50;
            array4[20] = 67;
            array4[21] = 100;
            array4[22] = -29;
            a(array3, new byte[] { -80, 52, 112, -15, 46, -9, 45, -47, 52, -62, 87, 53, -103, -10, 72, -20, 70, 89, 92, 83, 33, 8, -122 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = -21;
            array6[1] = -47;
            array6[2] = 68;
            array6[3] = -31;
            a(array5, new byte[] { -97, -93, 49, -124, -28, -34, 89, 53 });
            this.c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
    
    public final boolean o() {
        final byte[] array2;
        final byte[] array = array2 = new byte[4];
        array2[0] = -63;
        array2[1] = -75;
        array2[2] = -70;
        array2[3] = -85;
        a(array, new byte[] { -111, -12, -18, -29, 45, 105, 78, -8 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String getenv = System.getenv(new String(array, utf_8).intern());
        if (getenv != null) {
            final byte[] array3 = { -10 };
            a(array3, new byte[] { -52, 37, -21, 100, 26, 58, 54, 60 });
            for (final String s : getenv.split(new String(array3, utf_8).intern())) {
                final byte[] array5;
                final byte[] array4 = array5 = new byte[2];
                array5[0] = -83;
                array5[1] = -66;
                a(array4, new byte[] { -34, -53, -7, -81, -63, 95, -69, 28 });
                final Charset utf_9 = StandardCharsets.UTF_8;
                if (new File(s, new String(array4, utf_9).intern()).exists()) {
                    final byte[] array7;
                    final byte[] array6 = array7 = new byte[10];
                    array7[0] = -84;
                    array7[1] = -99;
                    array7[2] = -106;
                    array7[3] = -40;
                    array7[4] = 71;
                    array7[5] = 93;
                    array7[6] = -3;
                    array7[7] = 101;
                    array7[8] = 127;
                    array7[9] = 68;
                    a(array6, new byte[] { -59, -18, -59, -83, 8, 51, -83, 4, 11, 44 });
                    this.c(new String(array6, utf_9).intern(), s);
                    return true;
                }
            }
        }
        return false;
    }
    
    public final boolean p() {
        final String tags = Build.TAGS;
        boolean b = false;
        Label_0157: {
            if (tags != null) {
                final byte[] array2;
                final byte[] array = array2 = new byte[9];
                array2[0] = -13;
                array2[1] = 91;
                array2[2] = 47;
                array2[3] = -49;
                array2[4] = -108;
                array2[5] = -25;
                array2[6] = 0;
                array2[7] = -92;
                array2[8] = 47;
                a(array, new byte[] { -121, 62, 92, -69, -71, -116, 101, -35, 92 });
                if (tags.contains((CharSequence)new String(array, StandardCharsets.UTF_8).intern())) {
                    b = true;
                    break Label_0157;
                }
            }
            b = false;
        }
        if (b) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[18];
            array4[0] = -22;
            array4[1] = 73;
            array4[2] = 24;
            array4[3] = -64;
            array4[4] = 112;
            array4[5] = -73;
            array4[6] = 32;
            array4[7] = 91;
            array4[8] = 8;
            array4[9] = 111;
            array4[10] = -127;
            array4[11] = -113;
            array4[12] = -80;
            array4[13] = 109;
            array4[14] = -97;
            array4[15] = 30;
            array4[16] = 10;
            array4[17] = -40;
            a(array3, new byte[] { -117, 59, 125, -108, 21, -60, 84, 16, 109, 22, -14, -54, -34, 12, -3, 114, 111, -68 });
            this.c(new String(array3, StandardCharsets.UTF_8).intern(), tags);
        }
        return b;
    }
    
    public final boolean q() {
        final Random$Default default1 = Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] q = Natives.a.q(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[34];
        array2[0] = -82;
        array2[1] = 114;
        array2[2] = 108;
        array2[3] = -19;
        array2[4] = -87;
        array2[5] = 5;
        array2[6] = -116;
        array2[7] = 86;
        array2[8] = 117;
        array2[9] = -56;
        array2[10] = 17;
        array2[11] = -24;
        array2[13] = (array2[12] = -82);
        array2[14] = -98;
        array2[15] = 59;
        array2[16] = 19;
        array2[17] = -78;
        array2[18] = 90;
        array2[19] = 49;
        array2[20] = 1;
        array2[21] = -100;
        array2[22] = -93;
        array2[23] = 123;
        array2[24] = -76;
        array2[25] = -38;
        array2[26] = -94;
        array2[27] = 33;
        array2[28] = 5;
        array2[29] = -19;
        array2[30] = -96;
        array2[31] = -14;
        array2[32] = 28;
        array2[33] = 20;
        a(array, new byte[] { -57, 1, 54, -108, -50, 108, -1, 61, 49, -83, 101, -115, -51, -38, -5, 95, 85, -41, 59, 69, 116, -18, -58, 47, -47, -87, -42, 72, 107, -118, -29, -109, 112, 120 });
        final int[] e = this.e(q, first, first2, new String(array, StandardCharsets.UTF_8).intern());
        if (e != null && e.length > 0) {
            this.a(e);
            return true;
        }
        return false;
    }
    
    public final boolean r() {
        final Random$Default default1 = Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] a = Natives.a.a(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[14];
        array2[0] = -93;
        array2[1] = 89;
        array2[2] = -88;
        array2[3] = -96;
        array2[4] = -91;
        array2[5] = -74;
        array2[6] = 115;
        array2[7] = 47;
        array2[8] = -49;
        array2[9] = 63;
        array2[10] = -64;
        array2[11] = -51;
        array2[12] = 57;
        array2[13] = 55;
        a(array, new byte[] { -47, 54, -57, -44, -21, -41, 7, 70, -71, 90, -125, -84, 85, 91 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final Boolean a2 = this.a(a, first, first2, new String(array, utf_8).intern());
        if (a2 != null && a2) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[10];
            array4[0] = -7;
            array4[1] = -24;
            array4[2] = 123;
            array4[3] = -30;
            array4[4] = 81;
            array4[5] = 25;
            array4[6] = -56;
            array4[7] = -121;
            array4[8] = -111;
            array4[9] = 126;
            a(array3, new byte[] { -117, -121, 20, -106, 31, 120, -68, -18, -25, 27 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = -36;
            array6[1] = 126;
            array6[2] = -51;
            array6[3] = 45;
            a(array5, new byte[] { -88, 12, -72, 72, 45, -12, 81, -22 });
            this.c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
    
    public final boolean s() {
        final Random$Default default1 = Random.Default;
        final byte first = ArraysKt.first(default1.nextBytes(1));
        final byte first2 = ArraysKt.first(default1.nextBytes(1));
        final byte[] m = Natives.a.m(first, first2);
        final byte[] array2;
        final byte[] array = array2 = new byte[22];
        array2[0] = -34;
        array2[1] = -77;
        array2[2] = 57;
        array2[3] = -106;
        array2[5] = (array2[4] = -53);
        array2[6] = -58;
        array2[7] = 82;
        array2[8] = 58;
        array2[9] = 105;
        array2[10] = -43;
        array2[11] = -3;
        array2[12] = 17;
        array2[13] = -48;
        array2[14] = 4;
        array2[15] = 98;
        array2[16] = -107;
        array2[17] = -67;
        array2[18] = -59;
        array2[19] = -71;
        array2[20] = 79;
        array2[21] = -56;
        a(array, new byte[] { -83, -37, 88, -5, -94, -96, -87, 26, 83, 13, -80, -113, 95, -79, 112, 11, -29, -40, -122, -40, 35, -92 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final Boolean a = this.a(m, first, first2, new String(array, utf_8).intern());
        if (a != null && a) {
            final byte[] array4;
            final byte[] array3 = array4 = new byte[18];
            array4[0] = -93;
            array4[1] = -121;
            array4[2] = -87;
            array4[3] = -72;
            array4[4] = -21;
            array4[5] = -58;
            array4[6] = 16;
            array4[7] = 120;
            array4[8] = 121;
            array4[9] = 97;
            array4[10] = 0;
            array4[11] = 31;
            array4[12] = 86;
            array4[13] = 119;
            array4[14] = 18;
            array4[15] = 6;
            array4[16] = -89;
            array4[17] = 46;
            a(array3, new byte[] { -48, -17, -56, -43, -126, -83, 127, 48, 16, 5, 101, 109, 24, 22, 102, 111, -47, 75 });
            final String intern = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[4];
            array6[0] = 99;
            array6[1] = -11;
            array6[2] = -112;
            array6[3] = 72;
            a(array5, new byte[] { 23, -121, -27, 45, 68, 14, 12, 99 });
            this.c(intern, new String(array5, utf_8).intern());
            return true;
        }
        return false;
    }
}
