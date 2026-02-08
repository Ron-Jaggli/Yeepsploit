package com.aheaditec.talsec.security;

import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;
import android.accessibilityservice.AccessibilityServiceInfo;
import java.util.HashSet;
import android.view.accessibility.AccessibilityManager;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class z0 extends k1
{
    public static final String A;
    public final Set<String> z;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[17];
        array2[0] = 124;
        array2[1] = -35;
        array2[2] = -45;
        array2[3] = 71;
        array2[4] = -100;
        array2[5] = 21;
        array2[6] = -76;
        array2[7] = 112;
        array2[8] = 59;
        array2[9] = -70;
        array2[10] = -15;
        array2[11] = 58;
        array2[12] = 40;
        array2[13] = 28;
        array2[14] = 16;
        array2[15] = 100;
        array2[16] = 55;
        c(array, new byte[] { 29, -66, -80, 34, -17, 102, -35, 18, 82, -42, -104, 78, 81, 93, 96, 20, 68 });
        A = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public z0(final w0 w0, final i1 i1, final U u, final Set<String> z, final String s, final boolean b) {
        super(w0, i1, u, s, b);
        this.z = z;
    }
    
    public static Set<String> a(final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[13];
        array2[0] = -91;
        array2[1] = 89;
        array2[2] = 109;
        array2[3] = 60;
        array2[4] = 18;
        array2[5] = 9;
        array2[6] = 93;
        array2[7] = 86;
        array2[8] = -109;
        array2[9] = -127;
        array2[10] = -14;
        array2[11] = 19;
        array2[12] = -22;
        c(array, new byte[] { -60, 58, 14, 89, 97, 122, 52, 52, -6, -19, -101, 103, -109 });
        final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService(new String(array, StandardCharsets.UTF_8).intern());
        if (accessibilityManager == null) {
            return (Set<String>)new HashSet();
        }
        final List enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList != null && !enabledAccessibilityServiceList.isEmpty()) {
            final HashSet set = new HashSet(enabledAccessibilityServiceList.size());
            final Iterator iterator = enabledAccessibilityServiceList.iterator();
            while (iterator.hasNext()) {
                final ResolveInfo resolveInfo = ((AccessibilityServiceInfo)iterator.next()).getResolveInfo();
                if (resolveInfo != null) {
                    final ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo == null) {
                        continue;
                    }
                    final ApplicationInfo applicationInfo = serviceInfo.applicationInfo;
                    if (applicationInfo == null) {
                        continue;
                    }
                    set.add((Object)applicationInfo.packageName);
                }
            }
            return (Set<String>)set;
        }
        return (Set<String>)new HashSet();
    }
    
    public static void c(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = -585497720;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] array4 = null;
    Label_0804:
        while (true) {
            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
            final int n6 = n >>> 8;
            final int n7 = ~((~n6 | 0xF1CB17FB | n5) - ((n6 & 0xF1CB17FB) | n5));
            final int n8 = -1081514022 - ((n7 & 0x2) | -10362931 - n7);
            final int a = y1.a(n8 | 0xE67A7917, 2, n8, -428181225);
            n = -1057239115;
            final int n9 = 1;
            final int n10 = 1;
            int n12 = 0;
            Label_1166: {
                switch (a) {
                    default: {
                        n = -897645243;
                        continue;
                    }
                    case 2013813686: {
                        n4 = array3.length % 4;
                        final long n11 = lcmp((long)n4, (long)1) >>> 31 & 0x1;
                        if (n11 != 0) {
                            n = 2100390411;
                        }
                        else {
                            n = -897645243;
                        }
                        if (n11 != 0) {
                            continue;
                        }
                        n12 = n4;
                        break Label_1166;
                    }
                    case 1758587480: {
                        final int length = array3.length;
                        final int n13 = 0 - n4;
                        int n14 = n10;
                        if (dcmpg((double)array4[(length | n13) - (~n13 & 0x310B7971 & length) + ((0x310B7971 | n13) & length)], Double.NaN) <= -1) {
                            n14 = 0;
                        }
                        if (n14 != 0) {
                            n = -1057239115;
                        }
                        else {
                            n = -897645243;
                        }
                        n2 = n4;
                        continue;
                    }
                    case 783648904: {
                        final int n15 = n3 + 4 + (-1 - n3 | 0xFFFFFFFC);
                        final byte b = array4[n15];
                        final int n16 = (b & 0x1000000) * (b | 0x1000000) + (b & 0xFEFFFFFF) * (~b & 0x1000000);
                        final int n17 = n3 & 0x2;
                        final int n18 = n3 + 2 - n17;
                        final int n19 = array4[n18] & 0xFF;
                        final int n20 = n19 * (~n19 & 0x10000);
                        final int n21 = ~((0x1BDAA809 | ~n20 | n16) - ((n20 & 0x1BDAA809) | n16));
                        final int n22 = n3 + 1 - (n3 & 0x1);
                        final int n23 = array4[n22] & 0xFF;
                        final int n24 = n23 * (~n23 & 0x100);
                        final int n25 = ~((n21 | (~n24 | 0x4F34C9EF)) - ((n24 & 0x4F34C9EF) | n21));
                        final int n26 = array4[n3] & 0xFF;
                        final int a2 = J.a(n25, n26, 1, -1 - n25 | -1 - n26);
                        final byte b2 = array3[n15];
                        final int n27 = (b2 & 0x1000000) * (b2 | 0x1000000) + (0xFEFFFFFF & b2) * (~b2 & 0x1000000);
                        final int n28 = array3[n18] & 0xFF;
                        final int n29 = n28 * (~n28 & 0x10000);
                        final int a3 = K.a(~n27 & 0x622BED86 & n29, n29, n27, (0x622BED86 | n27) & n29);
                        final int n30 = array3[n22] & 0xFF;
                        final int n31 = n30 * (~n30 & 0x100);
                        final int n32 = ~((a3 | (~n31 | 0x853F6546)) - ((0x853F6546 & n31) | a3));
                        final int n33 = array3[n3] & 0xFF;
                        final int a4 = J.a(n32, n33, 1, -1 - n32 | -1 - n33);
                        final int n34 = a2 << (dcmpg((double)a2, Double.NaN) >>> 31);
                        final int n35 = n34 + a4 - (n34 & a4) * 2;
                        array3[n3] = (byte)n35;
                        array3[n22] = (byte)(n35 >>> 8);
                        array3[n18] = (byte)(n35 >>> 16);
                        array3[n15] = (byte)(n35 >>> 24);
                        final int n36 = -11 - (-15 - n3 | n17);
                        final int length2 = array3.length;
                        final int a5 = com.aheaditec.talsec.security.a.a(array3.length, 4, 0, 0);
                        final long n37 = lcmp((long)n36, (long)((length2 & ~a5) * 2 - (length2 ^ a5))) >>> 31 & 0x1;
                        if (n37 != 0) {
                            n = -897645243;
                        }
                        else {
                            n = 1251644638;
                        }
                        n3 = n36;
                        if (n37 != 0) {
                            n = -1469476344;
                            n3 = n36;
                            continue;
                        }
                        continue;
                    }
                    case 769572960: {
                        break Label_0804;
                    }
                    case -477594107: {
                        final int length3 = array3.length;
                        final int n38 = 0 - n2;
                        final int n39 = (length3 | n38) - (0xE14783F0 & ~n38 & length3) + ((n38 | 0xE14783F0) & length3);
                        final byte b3 = array4[n39];
                        final int length4 = array3.length;
                        final byte b4 = array4[(n38 | length4) * 2 - (length4 ^ n38)];
                        final int n40 = (byte)0 - (byte)b3;
                        final int n41 = n40 | b4;
                        array4[n39] = (byte)((byte)((byte)n41 - (byte)((byte)2 * (byte)n40)) + (byte)(b4 ^ n40 ^ n41));
                        continue;
                    }
                    case -1350640889: {
                        final int length5 = array.length;
                        final int n42 = 0 - array.length % 4;
                        int n43 = n9;
                        if ((length5 | n42) - (0x3831AA16 & ~n42 & length5) + ((n42 | 0x3831AA16) & length5) <= 0) {
                            n43 = 0;
                        }
                        if (n43 != 0) {
                            n = -897645243;
                        }
                        else {
                            n = 1251644638;
                        }
                        if (n43 != 0) {
                            n = -1469476344;
                        }
                        array4 = array2;
                        array3 = array;
                        n3 = 0;
                        continue;
                    }
                    case -1819084085: {
                        final int length6 = array3.length;
                        final int n44 = 0 - n2;
                        final int length7 = array3.length;
                        final int n45 = 0 - n44;
                        final byte b5 = array3[(length7 & ~n45) - (~length7 & n45)];
                        final int length8 = array3.length;
                        final byte b6 = array4[(length8 | n44) - (0x9BFB9859 & ~n44 & length8) + ((n44 | 0x9BFB9859) & length8)];
                        array3[(length6 | n44) * 2 - (length6 ^ n44)] = (byte)((byte)((byte)((byte)2 * (byte)(b6 | b5)) - (byte)b6) - (byte)b5);
                        final int n46 = 4 - (5 - n2 | (n2 & 0x2));
                        final long n47 = lcmp((long)n2, (long)2) >>> 31 & 0x1;
                        int n48;
                        if (n47 != 0) {
                            n48 = 2100390411;
                        }
                        else {
                            n48 = -897645243;
                        }
                        n12 = n46;
                        if (n47 != 0) {
                            n = n48;
                            n4 = n46;
                            continue;
                        }
                        break Label_1166;
                    }
                }
                continue;
            }
            final int n49 = -2079636786;
            n4 = n12;
            n = n49;
        }
    }
    
    public JSONObject c() throws JSONException {
        final JSONObject c = super.c();
        if (this.z != null) {
            final JSONArray jsonArray = new JSONArray();
            final Iterator iterator = this.z.iterator();
            while (iterator.hasNext()) {
                jsonArray.put((Object)iterator.next());
            }
            final byte[] array2;
            final byte[] array = array2 = new byte[17];
            array2[0] = 53;
            array2[1] = 59;
            array2[2] = -113;
            array2[3] = 73;
            array2[4] = -120;
            array2[5] = -45;
            array2[6] = -126;
            array2[7] = -18;
            array2[8] = -76;
            array2[9] = -124;
            array2[10] = 84;
            array2[11] = 78;
            array2[12] = 16;
            array2[13] = 84;
            array2[14] = 11;
            array2[15] = -97;
            array2[16] = 48;
            c(array, new byte[] { 84, 88, -20, 44, -5, -96, -21, -116, -35, -24, 61, 58, 105, 21, 123, -17, 67 });
            c.put(new String(array, StandardCharsets.UTF_8).intern(), (Object)jsonArray);
        }
        return c;
    }
}
