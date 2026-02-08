package com.aheaditec.talsec_security.security.api;

import java.util.Collection;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.z1;
import kotlin.enums.EnumEntriesKt;
import kotlin.enums.EnumEntries;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import androidx.biometric.BiometricManager;
import android.content.Context;
import com.aheaditec.talsec.security.L;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.y1;
import com.aheaditec.talsec.security.J;
import kotlin.jvm.internal.Intrinsics;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.nio.charset.StandardCharsets;
import android.content.BroadcastReceiver;

public final class ThreatListener extends BroadcastReceiver
{
    public static final a d;
    public static final String e;
    public static final String f;
    public static final String g;
    public final ThreatDetected a;
    public final DeviceState b;
    public final RaspExecutionState c;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = -62;
        array2[1] = -58;
        array2[2] = 4;
        array2[3] = 47;
        array2[4] = -89;
        array2[5] = 109;
        array2[6] = -69;
        array2[7] = -48;
        array2[8] = 59;
        array2[9] = 40;
        array2[10] = 111;
        array2[11] = 60;
        a(array, new byte[] { 43, -11, 58, -58, 10, 9, 104, 108, -106, 91, -89, -47 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        g = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[9];
        array4[0] = 86;
        array4[1] = -95;
        array4[2] = 25;
        array4[3] = 96;
        array4[4] = 69;
        array4[5] = -50;
        array4[6] = 97;
        array4[7] = 1;
        array4[8] = -74;
        a(array3, new byte[] { -77, -64, -51, -115, -74, -1, -110, 55, -9 });
        f = new String(array3, utf_8).intern();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[11];
        array6[0] = -63;
        array6[1] = 94;
        array6[2] = 90;
        array6[3] = -6;
        array6[4] = 73;
        array6[5] = 118;
        array6[6] = -26;
        array6[7] = 43;
        array6[8] = -123;
        array6[9] = -120;
        array6[10] = 96;
        a(array5, new byte[] { 49, 13, -128, 15, -88, 32, 7, -57, -53, -50, 47 });
        e = new String(array5, utf_8).intern();
        d = new a(null);
    }
    
    public ThreatListener(final ThreatDetected threatDetected) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 7;
        array2[1] = 34;
        array2[2] = 114;
        array2[3] = 5;
        array2[4] = -113;
        array2[5] = -94;
        array2[6] = 9;
        a(array, new byte[] { -33, 103, -106, 2, -18, -42, 122, -10 });
        Intrinsics.checkNotNullParameter((Object)threatDetected, new String(array, StandardCharsets.UTF_8).intern());
        this(threatDetected, null, null);
    }
    
    public ThreatListener(final ThreatDetected threatDetected, final DeviceState deviceState) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 78;
        array2[1] = -55;
        array2[2] = -21;
        array2[3] = 127;
        array2[4] = -66;
        array2[5] = 99;
        array2[6] = -39;
        a(array, new byte[] { -122, -34, 47, -121, -33, 23, -86, -20 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)threatDetected, new String(array, utf_8).intern());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[11];
        array4[0] = -79;
        array4[1] = -117;
        array4[2] = -47;
        array4[3] = -39;
        array4[4] = -128;
        array4[5] = -95;
        array4[6] = 34;
        array4[7] = -72;
        array4[8] = -21;
        array4[9] = 40;
        array4[10] = -87;
        a(array3, new byte[] { 49, 28, 53, 85, 71, -22, -57, 110, -118, 92, -52 });
        Intrinsics.checkNotNullParameter((Object)deviceState, new String(array3, utf_8).intern());
        this(threatDetected, deviceState, null);
    }
    
    public ThreatListener(final ThreatDetected a, final DeviceState b, final RaspExecutionState c) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = -57;
        array2[1] = 51;
        array2[2] = 82;
        array2[3] = -105;
        array2[4] = -128;
        array2[5] = -28;
        array2[6] = 19;
        a(array, new byte[] { 31, 73, -74, -100, -31, -112, 96, 26 });
        Intrinsics.checkNotNullParameter((Object)a, new String(array, StandardCharsets.UTF_8).intern());
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = -1003175592;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        byte[] array4 = null;
    Label_0325:
        while (true) {
            final int n5 = (n & 0x1000000) * (n | 0x1000000) + (n & 0xFEFFFFFF) * (~n & 0x1000000);
            final int n6 = n >>> 8;
            final int n7 = ~((~n6 | 0xBEB383EC | n5) - ((n6 & 0xBEB383EC) | n5));
            final int n8 = -1171264002 - ((n7 & 0x2) | -130029571 - n7);
            Label_0980: {
                Label_0374: {
                    switch (0xBDD888E4 ^ ~n8 + (n8 | 0x1) * 2) {
                        default: {
                            break Label_0980;
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
                            break Label_0374;
                        }
                        case 1870596681: {
                            break Label_0325;
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
                            break Label_0374;
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
                            break Label_0980;
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
    
    public final BiometricState getBiometricState(final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 4;
        array2[1] = -4;
        array2[2] = 46;
        array2[3] = -65;
        array2[4] = 31;
        array2[5] = 81;
        array2[6] = 27;
        a(array, new byte[] { -53, -122, -50, 85, 122, 41, 111, -32 });
        Intrinsics.checkNotNullParameter((Object)context, new String(array, StandardCharsets.UTF_8).intern());
        final int canAuthenticate = BiometricManager.from(context).canAuthenticate();
        BiometricState biometricState;
        if (canAuthenticate != 0) {
            if (canAuthenticate != 11) {
                biometricState = BiometricState.NOT_AVAILABLE;
            }
            else {
                biometricState = BiometricState.NONE_ENROLLED;
            }
        }
        else {
            biometricState = BiometricState.ACTIVE;
        }
        return biometricState;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[9];
            array2[0] = 85;
            array2[1] = 123;
            array2[2] = -15;
            array2[3] = 104;
            array2[4] = 36;
            array2[5] = -119;
            array2[6] = 58;
            array2[7] = -40;
            array2[8] = -13;
            a(array, new byte[] { -80, 38, 37, -124, -105, 50, -19, 110, -78 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String stringExtra = intent.getStringExtra(new String(array, utf_8).intern());
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case 1580766949: {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[15];
                        array4[0] = -122;
                        array4[1] = -107;
                        array4[2] = 7;
                        array4[3] = -51;
                        array4[4] = 58;
                        array4[5] = -35;
                        array4[6] = -122;
                        array4[7] = -101;
                        array4[8] = -34;
                        array4[9] = -77;
                        array4[10] = 27;
                        array4[11] = 92;
                        array4[12] = 75;
                        array4[13] = 103;
                        array4[14] = 46;
                        a(array3, new byte[] { 89, -32, 11, 74, -69, -92, -86, -104, -31, -50, -1, -38, 34, 9, 73 });
                        if (!stringExtra.equals((Object)new String(array3, utf_8).intern())) {
                            break;
                        }
                        this.a.onScreenRecordingDetected();
                        break;
                    }
                    case 1558978392: {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[7];
                        array6[0] = 28;
                        array6[1] = -22;
                        array6[2] = -77;
                        array6[3] = 57;
                        array6[4] = -25;
                        array6[5] = -121;
                        array6[6] = 18;
                        a(array5, new byte[] { -92, -78, 83, -47, -120, -29, 119, 11 });
                        if (!stringExtra.equals((Object)new String(array5, utf_8).intern())) {
                            break;
                        }
                        final DeviceState b = this.b;
                        if (b != null) {
                            b.onDeveloperModeDetected();
                            break;
                        }
                        break;
                    }
                    case 1556684755: {
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[27];
                        array8[0] = 68;
                        array8[1] = 41;
                        array8[2] = -50;
                        array8[3] = 34;
                        array8[4] = 16;
                        array8[5] = -100;
                        array8[6] = 93;
                        array8[7] = 29;
                        array8[8] = 47;
                        array8[9] = 120;
                        array8[10] = -48;
                        array8[11] = 83;
                        array8[12] = -68;
                        array8[13] = -44;
                        array8[14] = 58;
                        array8[15] = -42;
                        array8[16] = -50;
                        array8[17] = -101;
                        array8[18] = 111;
                        array8[19] = -103;
                        array8[20] = -81;
                        array8[21] = 89;
                        array8[22] = -56;
                        array8[23] = -51;
                        array8[24] = 54;
                        array8[25] = 27;
                        array8[26] = -40;
                        a(array7, new byte[] { -99, 120, 52, -9, -63, -6, -69, 26, -73, 44, 44, -59, 20, -93, -64, 84, 19, -3, -120, -108, 61, 20, 85, 69, 68, 120, -67 });
                        if (!stringExtra.equals((Object)new String(array7, utf_8).intern())) {
                            break;
                        }
                        this.a.onUntrustedInstallationSourceDetected();
                        break;
                    }
                    case 1336193813: {
                        final byte[] array10;
                        final byte[] array9 = array10 = new byte[8];
                        array10[0] = 96;
                        array10[1] = -52;
                        array10[2] = 58;
                        array10[3] = 105;
                        array10[4] = 127;
                        array10[5] = -125;
                        array10[6] = 59;
                        array10[7] = 7;
                        a(array9, new byte[] { 97, -41, -39, -89, 66, 5, -62, 27 });
                        if (!stringExtra.equals((Object)new String(array9, utf_8).intern())) {
                            break;
                        }
                        this.a.onEmulatorDetected();
                        break;
                    }
                    case 1129117765: {
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[9];
                        array12[0] = 120;
                        array12[1] = -121;
                        array12[2] = -23;
                        array12[3] = -19;
                        array12[4] = 78;
                        array12[5] = -75;
                        array12[6] = -56;
                        array12[7] = 56;
                        array12[8] = -13;
                        a(array11, new byte[] { 111, 12, 40, 36, -105, -49, 108, -53, -67 });
                        if (!stringExtra.equals((Object)new String(array11, utf_8).intern())) {
                            break;
                        }
                        final DeviceState b2 = this.b;
                        if (b2 != null) {
                            b2.onSystemVPNDetected();
                            break;
                        }
                        break;
                    }
                    case 1107986850: {
                        final byte[] array14;
                        final byte[] array13 = array14 = new byte[10];
                        array14[0] = -2;
                        array14[1] = -121;
                        array14[2] = 42;
                        array14[3] = -63;
                        array14[4] = 127;
                        array14[5] = -65;
                        array14[6] = 43;
                        array14[7] = -94;
                        array14[8] = 22;
                        array14[9] = 43;
                        a(array13, new byte[] { -61, 17, -2, 102, 77, -52, -1, 104, 115, 79 });
                        if (!stringExtra.equals((Object)new String(array13, utf_8).intern())) {
                            break;
                        }
                        final DeviceState b3 = this.b;
                        if (b3 != null) {
                            b3.onADBEnabledDetected();
                            break;
                        }
                        break;
                    }
                    case 834063317: {
                        final byte[] array16;
                        final byte[] array15 = array16 = new byte[7];
                        array16[0] = -39;
                        array16[1] = -46;
                        array16[2] = 84;
                        array16[3] = -4;
                        array16[4] = -86;
                        array16[5] = -65;
                        array16[6] = 53;
                        a(array15, new byte[] { 16, -95, -86, 41, -53, -51, 80, -15 });
                        if (!stringExtra.equals((Object)new String(array15, utf_8).intern())) {
                            break;
                        }
                        final byte[] array18;
                        final byte[] array17 = array18 = new byte[12];
                        array18[0] = 6;
                        array18[1] = -109;
                        array18[2] = 41;
                        array18[3] = -100;
                        array18[4] = 1;
                        array18[5] = -43;
                        array18[6] = -105;
                        array18[7] = 84;
                        array18[8] = -77;
                        array18[9] = 92;
                        array18[10] = 103;
                        array18[11] = -84;
                        a(array17, new byte[] { -25, -63, -41, -87, -28, -112, 76, -24, 30, 4, -97, 65 });
                        final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(new String(array17, utf_8).intern());
                        if (parcelableArrayListExtra != null && !((Collection)parcelableArrayListExtra).isEmpty()) {
                            this.a.onMalwareDetected((List<SuspiciousAppInfo>)parcelableArrayListExtra);
                            break;
                        }
                        break;
                    }
                    case 639597323: {
                        final byte[] array20;
                        final byte[] array19 = array20 = new byte[18];
                        array20[0] = 91;
                        array20[1] = -75;
                        array20[2] = -2;
                        array20[3] = 11;
                        array20[4] = -91;
                        array20[5] = -109;
                        array20[6] = -67;
                        array20[7] = 27;
                        array20[8] = 55;
                        array20[9] = -90;
                        array20[10] = -2;
                        array20[11] = 42;
                        array20[12] = 98;
                        array20[13] = -26;
                        array20[14] = 3;
                        array20[15] = -51;
                        array20[16] = 109;
                        array20[17] = -95;
                        a(array19, new byte[] { -73, -11, 47, 12, 40, -30, 68, 27, -65, -52, 27, -24, 127, -89, 1, 64, 31, -60 });
                        if (!stringExtra.equals((Object)new String(array19, utf_8).intern())) {
                            break;
                        }
                        final DeviceState b4 = this.b;
                        if (b4 != null) {
                            b4.onHardwareBackedKeystoreNotAvailableDetected();
                            break;
                        }
                        break;
                    }
                    case 99463088: {
                        final byte[] array22;
                        final byte[] array21 = array22 = new byte[5];
                        array22[0] = 118;
                        array22[1] = 108;
                        array22[2] = -4;
                        array22[3] = 0;
                        array22[4] = 89;
                        a(array21, new byte[] { 114, 53, 1, 8, 42, -13, 83, 78 });
                        if (!stringExtra.equals((Object)new String(array21, utf_8).intern())) {
                            break;
                        }
                        this.a.onHookDetected();
                        break;
                    }
                    case 95458899: {
                        final byte[] array24;
                        final byte[] array23 = array24 = new byte[5];
                        array24[0] = -24;
                        array24[1] = -30;
                        array24[2] = 34;
                        array24[3] = 19;
                        array24[4] = -35;
                        a(array23, new byte[] { -24, -75, -10, 0, -70, 60, -73, 75 });
                        if (!stringExtra.equals((Object)new String(array23, utf_8).intern())) {
                            break;
                        }
                        this.a.onDebuggerDetected();
                        break;
                    }
                    case 3506402: {
                        final byte[] array26;
                        final byte[] array25 = array26 = new byte[4];
                        array26[0] = 119;
                        array26[1] = -120;
                        array26[2] = -19;
                        array26[3] = 53;
                        a(array25, new byte[] { 105, 25, 48, -20, -67, -82, -57, 47 });
                        if (!stringExtra.equals((Object)new String(array25, utf_8).intern())) {
                            break;
                        }
                        this.a.onRootDetected();
                        break;
                    }
                    case -328950239: {
                        final byte[] array28;
                        final byte[] array27 = array28 = new byte[12];
                        array28[0] = 111;
                        array28[1] = -93;
                        array28[2] = -52;
                        array28[3] = 127;
                        array28[4] = -86;
                        array28[5] = -15;
                        array28[6] = 69;
                        array28[7] = -109;
                        array28[8] = 4;
                        array28[9] = -118;
                        array28[10] = 126;
                        array28[11] = 18;
                        a(array27, new byte[] { 99, -16, 77, -111, 45, -80, -45, -112, -9, 4, -107, 0 });
                        if (!stringExtra.equals((Object)new String(array27, utf_8).intern())) {
                            break;
                        }
                        final DeviceState b5 = this.b;
                        if (b5 != null) {
                            b5.onUnlockedDeviceDetected();
                            break;
                        }
                        break;
                    }
                    case -416447130: {
                        final byte[] array30;
                        final byte[] array29 = array30 = new byte[10];
                        array30[0] = 40;
                        array30[1] = -17;
                        array30[2] = -12;
                        array30[3] = -96;
                        array30[4] = 53;
                        array30[5] = -60;
                        array30[6] = -108;
                        array30[7] = -115;
                        array30[8] = 91;
                        array30[9] = 68;
                        a(array29, new byte[] { -65, -65, 20, 102, -68, -33, 117, -104, 52, 48 });
                        if (!stringExtra.equals((Object)new String(array29, utf_8).intern())) {
                            break;
                        }
                        this.a.onScreenshotDetected();
                        break;
                    }
                    case -603894139: {
                        final byte[] array32;
                        final byte[] array31 = array32 = new byte[12];
                        array32[0] = -22;
                        array32[1] = 8;
                        array32[2] = -85;
                        array32[3] = 64;
                        array32[4] = 40;
                        array32[5] = 3;
                        array32[6] = -21;
                        array32[7] = -45;
                        array32[8] = 8;
                        array32[9] = 10;
                        array32[10] = 55;
                        array32[11] = -113;
                        a(array31, new byte[] { -5, -104, 111, -58, -81, -123, 46, 83, -5, -98, -50, -104 });
                        if (!stringExtra.equals((Object)new String(array31, utf_8).intern())) {
                            break;
                        }
                        this.a.onUnsecureWifiDetected();
                        break;
                    }
                    case -748118530: {
                        final byte[] array34;
                        final byte[] array33 = array34 = new byte[17];
                        array34[0] = 108;
                        array34[1] = -116;
                        array34[2] = 111;
                        array34[3] = -86;
                        array34[4] = -84;
                        array34[5] = 66;
                        array34[6] = -68;
                        array34[7] = -81;
                        array34[8] = 44;
                        array34[9] = -40;
                        array34[10] = 9;
                        array34[11] = 78;
                        array34[12] = 46;
                        array34[13] = -25;
                        array34[14] = 54;
                        array34[15] = 61;
                        array34[16] = 20;
                        a(array33, new byte[] { 113, 22, -115, 79, 56, 85, 77, 121, -93, -125, 18, -34, -69, -89, -64, -6, 112 });
                        if (!stringExtra.equals((Object)new String(array33, utf_8).intern())) {
                            break;
                        }
                        final RaspExecutionState c = this.c;
                        if (c != null) {
                            c.onAllChecksFinished();
                            break;
                        }
                        break;
                    }
                    case -881046147: {
                        final byte[] array36;
                        final byte[] array35 = array36 = new byte[6];
                        array36[0] = -81;
                        array36[1] = 0;
                        array36[2] = 38;
                        array36[3] = -69;
                        array36[4] = -93;
                        array36[5] = 85;
                        a(array35, new byte[] { 39, -113, -6, 109, -58, 39, 58, 57 });
                        if (!stringExtra.equals((Object)new String(array35, utf_8).intern())) {
                            break;
                        }
                        this.a.onTamperDetected();
                        break;
                    }
                    case -1226736817: {
                        final byte[] array38;
                        final byte[] array37 = array38 = new byte[13];
                        array38[0] = -82;
                        array38[1] = 90;
                        array38[2] = 68;
                        array38[3] = 97;
                        array38[4] = -27;
                        array38[5] = -40;
                        array38[6] = 48;
                        array38[7] = 100;
                        array38[8] = -59;
                        array38[9] = 15;
                        array38[10] = -8;
                        array38[11] = 52;
                        array38[12] = 111;
                        a(array37, new byte[] { 54, 45, -64, -86, -22, -93, -32, -81, 7, -103, 0, -7, 8 });
                        if (!stringExtra.equals((Object)new String(array37, utf_8).intern())) {
                            break;
                        }
                        this.a.onDeviceBindingDetected();
                        break;
                    }
                    case -1367123171: {
                        final byte[] array40;
                        final byte[] array39 = array40 = new byte[17];
                        array40[0] = 21;
                        array40[1] = -60;
                        array40[2] = -119;
                        array40[3] = 48;
                        array40[4] = 26;
                        array40[5] = 4;
                        array40[6] = -17;
                        array40[7] = -121;
                        array40[8] = -41;
                        array40[9] = -24;
                        array40[10] = 72;
                        array40[11] = 121;
                        array40[12] = -107;
                        array40[13] = -115;
                        array40[14] = 65;
                        array40[15] = 49;
                        array40[16] = 43;
                        a(array39, new byte[] { -42, -45, -99, -25, -51, -110, 1, -98, 18, -71, -44, -110, 74, 8, -58, -10, 88 });
                        if (!stringExtra.equals((Object)new String(array39, utf_8).intern())) {
                            break;
                        }
                        this.a.onObfuscationIssuesDetected();
                        break;
                    }
                    case -1492991450: {
                        final byte[] array42;
                        final byte[] array41 = array42 = new byte[12];
                        array42[0] = -117;
                        array42[1] = 15;
                        array42[2] = -74;
                        array42[3] = 0;
                        array42[4] = -113;
                        array42[5] = -91;
                        array42[6] = -30;
                        array42[7] = 77;
                        array42[8] = 53;
                        array42[9] = -46;
                        array42[10] = -13;
                        array42[11] = 95;
                        a(array41, new byte[] { 91, -108, 74, 6, 96, -29, 59, -33, -65, -42, 11, -91 });
                        if (!stringExtra.equals((Object)new String(array41, utf_8).intern())) {
                            break;
                        }
                        this.a.onTimeSpoofingDetected();
                        break;
                    }
                    case -1642813682: {
                        final byte[] array44;
                        final byte[] array43 = array44 = new byte[16];
                        array44[0] = 29;
                        array44[1] = 127;
                        array44[2] = 2;
                        array44[3] = 77;
                        array44[4] = 12;
                        array44[5] = -89;
                        array44[6] = -39;
                        array44[7] = 55;
                        array44[8] = 44;
                        array44[9] = -30;
                        array44[10] = -119;
                        array44[11] = -51;
                        array44[12] = -20;
                        array44[13] = -66;
                        array44[14] = -10;
                        array44[15] = -79;
                        a(array43, new byte[] { -83, 3, 23, -50, -60, -3, 36, -12, -125, -65, -108, 64, -10, -59, 6, 115 });
                        if (!stringExtra.equals((Object)new String(array43, utf_8).intern())) {
                            break;
                        }
                        this.a.onLocationSpoofingDetected();
                        break;
                    }
                    case -2000714514: {
                        final byte[] array46;
                        final byte[] array45 = array46 = new byte[13];
                        array46[0] = -40;
                        array46[1] = -85;
                        array46[2] = 55;
                        array46[3] = -25;
                        array46[4] = -117;
                        array46[5] = -54;
                        array46[6] = 111;
                        array46[7] = 118;
                        array46[8] = -37;
                        array46[9] = -23;
                        array46[10] = 116;
                        array46[11] = 10;
                        array46[12] = 63;
                        a(array45, new byte[] { 17, -20, -59, 61, 70, -15, -113, -85, 11, -74, -120, 15, 90 });
                        if (!stringExtra.equals((Object)new String(array45, utf_8).intern())) {
                            break;
                        }
                        this.a.onMultiInstanceDetected();
                        break;
                    }
                }
            }
        }
    }
    
    public final void registerListener(final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 107;
        array2[1] = 76;
        array2[2] = 35;
        array2[3] = -10;
        array2[4] = 80;
        array2[5] = 114;
        array2[6] = 102;
        a(array, new byte[] { 108, 85, -5, 44, 53, 10, 18, -13 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter((Object)context, new String(array, utf_8).intern());
        final LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        final byte[] array4;
        final byte[] array3 = array4 = new byte[11];
        array4[0] = -82;
        array4[1] = 23;
        array4[2] = -116;
        array4[3] = -87;
        array4[4] = 96;
        array4[5] = -76;
        array4[6] = 11;
        array4[7] = -73;
        array4[8] = -55;
        array4[9] = 101;
        array4[10] = -98;
        a(array3, new byte[] { 6, 68, -78, 88, 65, -31, 34, 80, -121, 35, -47 });
        instance.registerReceiver((BroadcastReceiver)this, new IntentFilter(new String(array3, utf_8).intern()));
    }
    
    public final void unregisterListener(final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = 11;
        array2[1] = -32;
        array2[2] = -56;
        array2[3] = 19;
        array2[4] = -67;
        array2[5] = -74;
        array2[6] = -124;
        a(array, new byte[] { -52, -94, 84, 2, -40, -50, -16, 124 });
        Intrinsics.checkNotNullParameter((Object)context, new String(array, StandardCharsets.UTF_8).intern());
        LocalBroadcastManager.getInstance(context).unregisterReceiver((BroadcastReceiver)this);
    }
    
    public enum BiometricState
    {
        ACTIVE, 
        NONE_ENROLLED, 
        NOT_AVAILABLE;
        
        public static final BiometricState[] a;
        public static final EnumEntries b;
        
        static {
            final byte[] array2;
            final byte[] array = array2 = new byte[13];
            array2[0] = -29;
            array2[1] = 18;
            array2[2] = -34;
            array2[3] = 65;
            array2[4] = 48;
            array2[5] = 37;
            array2[6] = 29;
            array2[7] = 35;
            array2[8] = 81;
            array2[9] = 42;
            array2[10] = -100;
            array2[11] = -89;
            array2[12] = -2;
            a(array, new byte[] { -85, -69, 111, -24, -85, 53, -100, 61, -5, -95, -97, -115, 110 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final byte[] array4;
            final byte[] array3 = array4 = new byte[13];
            array4[0] = 36;
            array4[1] = 42;
            array4[2] = 45;
            array4[3] = -86;
            array4[4] = 87;
            array4[5] = -6;
            array4[6] = -19;
            array4[7] = -23;
            array4[8] = -40;
            array4[9] = 77;
            array4[10] = -54;
            array4[11] = -6;
            array4[12] = -76;
            a(array3, new byte[] { 97, -16, 9, 119, 50, 65, -72, 65, -121, 104, 31, -97, -24 });
            final byte[] array6;
            final byte[] array5 = array6 = new byte[6];
            array6[0] = 91;
            array6[1] = -101;
            array6[2] = 63;
            array6[3] = 57;
            array6[4] = 59;
            array6[5] = -12;
            a(array5, new byte[] { 108, -79, 109, -75, 27, 28, -110, 64 });
        }
        
        public static void a(final byte[] array, final byte[] array2) {
            short[] array3 = null;
            final int n = -1740520186;
            final int n2 = 0;
            int n3 = 0;
            final int n5;
            final int n4 = n5 = n3;
            int n7;
            int n6 = n7 = n5;
            int n8 = n5;
            int n9 = n4;
            int n10 = n2;
            int n11 = n;
        Label_0248:
            while (true) {
                Label_0663: {
                    Label_0406: {
                        Label_0343: {
                            switch (n11) {
                                default: {
                                    break Label_0663;
                                }
                                case 2093236949: {
                                    if (n7 < 32) {
                                        n11 = -2038999444;
                                        continue;
                                    }
                                    n11 = 1771480224;
                                    continue;
                                }
                                case 1771480224: {
                                    array[n10] = (byte)(n8 & 0xFF);
                                    array[n10 + 1] = (byte)(n8 >> 8 & 0xFF);
                                    array[n10 + 2] = (byte)(n6 & 0xFF);
                                    array[n10 + 3] = (byte)(n6 >> 8 & 0xFF);
                                    n10 += 4;
                                    break;
                                }
                                case 1734050766: {
                                    if (n10 > 0) {
                                        n11 = -473033593;
                                        continue;
                                    }
                                    n11 = 1314339506;
                                    continue;
                                }
                                case 1314339506: {
                                    break Label_0248;
                                }
                                case 998066383: {
                                    n3 = array.length - array.length % 4;
                                    n10 = 0;
                                    break;
                                }
                                case 974072829: {
                                    n10 = array.length % 4;
                                    break Label_0343;
                                }
                                case 766056152: {
                                    if (n10 < 4) {
                                        n11 = -1489518479;
                                        continue;
                                    }
                                    n11 = 998066383;
                                    continue;
                                }
                                case -473033593: {
                                    final int length = array.length;
                                    final int n12 = -n10;
                                    final int n13 = -length;
                                    final int n14 = n13 | n12;
                                    array[n14 - n13 * 2 + (n13 ^ n12 ^ n14)] = (byte)(array[array.length - n10] ^ array2[n10 % 8]);
                                    --n10;
                                    break Label_0343;
                                }
                                case -1489518479: {
                                    array3[n10] = (short)((array2[(0x2 & ~n10) * (n10 & 0xFFFFFFFD) + (n10 & 0x2) * (n10 | 0x2)] & 0xFF) ^ (array2[n10 * 2 + 1] & 0xFF) << 8);
                                    ++n10;
                                    break Label_0406;
                                }
                                case -1740520186: {
                                    array3 = new short[4];
                                    n10 = 0;
                                    break Label_0406;
                                }
                                case -1809249287: {
                                    final byte b = array[n10];
                                    n8 = (short)((array[(n10 & 0x1) * 2 + (n10 ^ 0x1)] & 0xFF) << 8 | 255 - (b | 0xFF) + b);
                                    final int n15 = -n10;
                                    final int n16 = n15 | 0x2;
                                    n6 = (short)((array[n16 - n15 * 2 + (n15 ^ 0x2 ^ n16)] & 0xFF) | (array[n10 + 3] & 0xFF) << 8);
                                    n9 = -14624;
                                    n7 = 0;
                                    break Label_0663;
                                }
                                case -2038999444: {
                                    final int n17 = (short)((n8 << 4) + array3[2]) ^ n8 + n9;
                                    final short n18 = array3[3];
                                    final int n19 = -(n8 >>> 5);
                                    final int n20 = n19 | n18;
                                    final int n21 = n20 - n19 * 2 + (n19 ^ n18 ^ n20);
                                    final int n22 = -z1.a(n21 | ~n17, 2, n21 - n17, 2);
                                    n6 = (short)O.a(n6, 3, -(N.a(n6, -4, 1, n22) | (n22 & 0x2)), 1);
                                    n8 = (short)(n8 - ((short)((n6 << 4) + array3[0]) ^ (n9 | n6) - (~n6 & 0x48 & n9) + ((n6 | 0x48) & n9) ^ (n6 >>> 5) + array3[1]));
                                    n9 = (short)(n9 - 40503);
                                    ++n7;
                                    break Label_0663;
                                }
                                case -2143294076: {
                                    if (n10 < n3) {
                                        n11 = -1809249287;
                                        continue;
                                    }
                                    n11 = 974072829;
                                    continue;
                                }
                            }
                            n11 = -2143294076;
                            continue;
                        }
                        n11 = 1734050766;
                        continue;
                    }
                    n11 = 766056152;
                    continue;
                }
                n11 = 2093236949;
            }
        }
        
        public static EnumEntries<BiometricState> getEntries() {
            return (EnumEntries<BiometricState>)BiometricState.b;
        }
    }
    
    public interface DeviceState
    {
        void onADBEnabledDetected();
        
        void onDeveloperModeDetected();
        
        void onHardwareBackedKeystoreNotAvailableDetected();
        
        void onSystemVPNDetected();
        
        void onUnlockedDeviceDetected();
    }
    
    public abstract static class RaspExecutionState
    {
        public void onAllChecksFinished() {
        }
    }
    
    public interface ThreatDetected
    {
        void onDebuggerDetected();
        
        void onDeviceBindingDetected();
        
        void onEmulatorDetected();
        
        void onHookDetected();
        
        void onLocationSpoofingDetected();
        
        void onMalwareDetected(final List<SuspiciousAppInfo> p0);
        
        void onMultiInstanceDetected();
        
        void onObfuscationIssuesDetected();
        
        void onRootDetected();
        
        void onScreenRecordingDetected();
        
        void onScreenshotDetected();
        
        void onTamperDetected();
        
        void onTimeSpoofingDetected();
        
        void onUnsecureWifiDetected();
        
        void onUntrustedInstallationSourceDetected();
    }
    
    public static final class a
    {
        public a() {
        }
        
        public a(final DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}
