package com.aheaditec.talsec.security;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import android.content.Intent;
import java.nio.charset.Charset;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import android.content.Context;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.security.SecureRandom;

public class p1 implements c, a
{
    public static final int g = 4500;
    public static final int h = 255;
    public final SecureRandom a;
    public ScheduledExecutorService b;
    public ScheduledFuture<?> c;
    public int d;
    public Long e;
    public final Context f;
    
    public p1(final Context f) {
        this.a = new SecureRandom();
        this.d = 0;
        this.e = null;
        this.f = f;
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n2 = 0;
        int n3 = -1850458006;
        byte[] array4 = null;
    Label_0267:
        while (true) {
            final int n4 = n3 >>> 8;
            final int n5 = 1;
            final int n6 = 1;
            final int n7 = n4 - 1 - (~((0x1000000 & n3) * (n3 | 0x1000000) + (0xFEFFFFFF & n3) * (~n3 & 0x1000000)) | n4);
            final int n8 = -1700147435 - ((n7 & 0x2) | 2028104049 - n7);
            n3 = -1396193641;
            int n9 = 0;
            switch (0xAEBB822B ^ ~n8 + (n8 | 0x1) * 2) {
                default: {
                    n9 = n2;
                    break;
                }
                case 1733787683: {
                    final byte b = array4[n];
                    final byte b2 = array3[n];
                    array4[n] = (byte)((byte)((byte)b2 + (byte)b) - (byte)((byte)2 * (byte)(b2 & b)));
                    n2 = (n9 = (n ^ 0x1) + (n & 0x1) * 2);
                    if ((lcmp((long)n2, (long)array4.length) >>> 31 & 0x1) != 0x0) {
                        n3 = 1985663266;
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
                    break Label_0267;
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
            n2 = n9;
        }
    }
    
    @Override
    public String a() {
        return this.a(System.currentTimeMillis());
    }
    
    public final String a(long n) {
        final Long e = this.e;
        String s;
        if (e == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[12];
            array2[0] = -2;
            array2[1] = 79;
            array2[2] = 126;
            array2[3] = 41;
            array2[4] = 107;
            array2[5] = -127;
            array2[6] = 89;
            array2[7] = -46;
            array2[8] = 10;
            array2[9] = 100;
            array2[10] = -123;
            array2[11] = -126;
            a(array, new byte[] { -73, 33, 23, 93, 2, -32, 53, -69, 112, 13, -21, -27 });
            s = new String(array, StandardCharsets.UTF_8);
        }
        else {
            n -= e;
            if (n < 0L) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[13];
                array4[0] = 112;
                array4[1] = 123;
                array4[2] = 82;
                array4[3] = 90;
                array4[4] = 92;
                array4[5] = 110;
                array4[6] = 47;
                array4[7] = -36;
                array4[8] = -110;
                array4[9] = 48;
                array4[10] = -76;
                array4[11] = -66;
                array4[12] = 68;
                a(array3, new byte[] { 36, 18, 63, 63, 15, 23, 65, -65, -41, 66, -58, -47, 54 });
                s = new String(array3, StandardCharsets.UTF_8);
            }
            else if (n < 10000L) {
                final byte[] array6;
                final byte[] array5 = array6 = new byte[6];
                array6[0] = 31;
                array6[1] = 94;
                array6[2] = 83;
                array6[3] = -69;
                array6[4] = -33;
                array6[5] = 77;
                a(array5, new byte[] { 94, 61, 39, -46, -87, 40, -32, 123 });
                s = new String(array5, StandardCharsets.UTF_8);
            }
            else {
                final byte[] array8;
                final byte[] array7 = array8 = new byte[10];
                array8[0] = 15;
                array8[1] = 64;
                array8[2] = -127;
                array8[3] = 68;
                array8[4] = 41;
                array8[5] = -92;
                array8[6] = 87;
                array8[7] = -100;
                array8[8] = 33;
                array8[9] = 111;
                a(array7, new byte[] { 65, 47, -11, 22, 92, -54, 57, -11, 79, 8 });
                s = new String(array7, StandardCharsets.UTF_8);
            }
        }
        return s.intern();
    }
    
    @Override
    public void a(final int n) {
        final int d = this.d;
        if ((d & n) == n) {
            return;
        }
        this.d = d + n;
        final byte[] array2;
        final byte[] array = array2 = new byte[35];
        array2[0] = -110;
        array2[2] = (array2[1] = -47);
        array2[3] = 50;
        array2[4] = 44;
        array2[5] = 96;
        array2[6] = -29;
        array2[7] = 54;
        array2[8] = -42;
        array2[9] = 116;
        array2[10] = 58;
        array2[11] = 14;
        array2[12] = 72;
        array2[13] = 95;
        array2[14] = -91;
        array2[15] = -30;
        array2[16] = -98;
        array2[17] = 20;
        array2[18] = -74;
        array2[19] = 74;
        array2[20] = 99;
        array2[21] = -35;
        array2[22] = -23;
        array2[23] = 13;
        array2[24] = 55;
        array2[25] = 86;
        array2[26] = 119;
        array2[27] = -82;
        array2[28] = 112;
        array2[29] = 45;
        array2[30] = -98;
        array2[31] = -83;
        array2[32] = -78;
        array2[33] = 75;
        array2[34] = -110;
        a(array, new byte[] { -44, -80, -72, 94, 73, 4, -61, 66, -71, 84, 91, 98, 36, 48, -58, -125, -22, 113, -106, 40, 22, -69, -113, 104, 69, 118, 90, -114, 64, 85, -69, -99, -125, 125, -22 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String format = String.format(new String(array, utf_8).intern(), new Object[] { this.d });
        final byte[] array4;
        final byte[] array3 = array4 = new byte[5];
        array4[0] = 9;
        array4[1] = 114;
        array4[2] = -94;
        array4[3] = 1;
        array4[4] = -26;
        a(array3, new byte[] { 74, 30, -61, 111, -127, 121, -9, -109 });
        Log.v(new String(array3, utf_8).intern(), format);
        final StringBuilder sb = new StringBuilder();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[7];
        array6[0] = 1;
        array6[1] = -50;
        array6[2] = 91;
        array6[3] = 97;
        array6[4] = -45;
        array6[5] = -103;
        array6[6] = -63;
        a(array5, new byte[] { 68, -106, 30, 34, -13, -76, -31, -18 });
        this.a(sb.append(new String(array5, utf_8).intern()).append(this.d).toString());
    }
    
    public final void a(final String s) {
        final byte[] array2;
        final byte[] array = array2 = new byte[64];
        array2[0] = 36;
        array2[1] = 97;
        array2[2] = 15;
        array2[3] = -88;
        array2[4] = 15;
        array2[5] = -2;
        array2[6] = -6;
        array2[7] = 93;
        array2[8] = 70;
        array2[9] = 63;
        array2[10] = 85;
        array2[11] = 0;
        array2[12] = 58;
        array2[13] = 66;
        array2[14] = 77;
        array2[15] = 26;
        array2[16] = 22;
        array2[17] = -41;
        array2[18] = -76;
        array2[19] = 97;
        array2[20] = -69;
        array2[21] = 97;
        array2[22] = 15;
        array2[23] = 99;
        array2[24] = -83;
        array2[25] = 48;
        array2[26] = -98;
        array2[27] = 5;
        array2[28] = -111;
        array2[29] = -65;
        array2[30] = -123;
        array2[31] = 0;
        array2[32] = 58;
        array2[33] = -101;
        array2[34] = -73;
        array2[35] = -24;
        array2[36] = -77;
        array2[37] = 110;
        array2[38] = 61;
        array2[39] = -6;
        array2[40] = 19;
        array2[41] = 61;
        array2[42] = 57;
        array2[43] = 86;
        array2[44] = -12;
        array2[45] = 40;
        array2[46] = -82;
        array2[47] = 122;
        array2[48] = -51;
        array2[49] = 53;
        array2[50] = -104;
        array2[51] = 11;
        array2[52] = 55;
        array2[53] = 114;
        array2[54] = -20;
        array2[55] = 18;
        array2[56] = -9;
        array2[57] = -42;
        array2[58] = 69;
        array2[59] = -90;
        array2[60] = 111;
        array2[61] = 78;
        array2[62] = 56;
        array2[63] = -121;
        a(array, new byte[] { 16, 82, 107, -54, 63, -99, -104, 104, 114, 8, 51, 55, 10, 112, 46, 45, 114, -29, -115, 89, -116, 82, 60, 90, -52, 82, -4, 97, -94, -36, -80, 56, 2, -93, -45, -47, -117, 92, 13, -61, 39, 11, 91, 102, -106, 78, -99, 30, -11, 5, -84, 110, 7, 70, -33, 39, -58, -30, 125, -112, 9, 45, 1, -77 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final Intent intent = new Intent(new String(array, utf_8).intern());
        intent.setPackage(this.f.getPackageName());
        final byte[] array4;
        final byte[] array3 = array4 = new byte[4];
        array4[0] = -120;
        array4[1] = 86;
        array4[2] = 102;
        array4[3] = -58;
        a(array3, new byte[] { -20, 55, 18, -89, 79, 11, -27, 34 });
        intent.putExtra(new String(array3, utf_8).intern(), s);
        this.f.sendBroadcast(intent);
    }
    
    @Override
    public String b() {
        StringBuilder sb;
        String s;
        if (this.d == 255) {
            sb = new StringBuilder();
            final byte[] array2;
            final byte[] array = array2 = new byte[7];
            array2[0] = -1;
            array2[1] = 16;
            array2[2] = 127;
            array2[3] = 95;
            array2[4] = -90;
            array2[5] = -99;
            array2[6] = -103;
            a(array, new byte[] { -69, 127, 17, 58, -122, -80, -71, -61 });
            s = new String(array, StandardCharsets.UTF_8);
        }
        else {
            sb = new StringBuilder();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[10];
            array4[0] = 15;
            array4[1] = 18;
            array4[2] = -115;
            array4[3] = 84;
            array4[4] = 75;
            array4[5] = -12;
            array4[6] = -110;
            array4[7] = 38;
            array4[8] = -41;
            array4[9] = 92;
            a(array3, new byte[] { 93, 103, -29, 58, 34, -102, -11, 6, -6, 124 });
            s = new String(array3, StandardCharsets.UTF_8);
        }
        return sb.append(s.intern()).append(this.d).toString();
    }
    
    @Override
    public void c() {
        final byte[] array2;
        final byte[] array = array2 = new byte[35];
        array2[0] = -9;
        array2[1] = -117;
        array2[2] = 46;
        array2[3] = -76;
        array2[4] = 1;
        array2[5] = 73;
        array2[6] = 26;
        array2[7] = 85;
        array2[8] = 79;
        array2[9] = -13;
        array2[10] = 42;
        array2[11] = 33;
        array2[12] = -58;
        array2[13] = -105;
        array2[14] = 7;
        array2[15] = -30;
        array2[16] = 116;
        array2[17] = -51;
        array2[18] = -80;
        array2[19] = -45;
        array2[20] = 66;
        array2[21] = 105;
        array2[22] = -119;
        array2[23] = -41;
        array2[24] = 83;
        array2[25] = -38;
        array2[26] = 83;
        array2[27] = 19;
        array2[28] = 117;
        array2[29] = 80;
        array2[30] = 12;
        array2[31] = 108;
        array2[32] = 38;
        array2[33] = 112;
        array2[34] = 31;
        a(array, new byte[] { -79, -22, 71, -40, 100, 45, 58, 33, 32, -45, 75, 77, -86, -8, 100, -125, 0, -88, -112, -79, 55, 15, -17, -78, 33, -6, 126, 51, 69, 40, 41, 92, 23, 70, 103 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String format = String.format(new String(array, utf_8).intern(), new Object[] { this.d });
        final byte[] array4;
        final byte[] array3 = array4 = new byte[5];
        array4[0] = -72;
        array4[1] = -91;
        array4[2] = 49;
        array4[3] = 74;
        array4[4] = -52;
        a(array3, new byte[] { -5, -55, 80, 36, -85, -9, 32, -90 });
        Log.v(new String(array3, utf_8).intern(), format);
        final StringBuilder sb = new StringBuilder();
        final byte[] array6;
        final byte[] array5 = array6 = new byte[7];
        array6[0] = 17;
        array6[1] = -10;
        array6[2] = -44;
        array6[3] = 100;
        array6[4] = -67;
        array6[5] = 108;
        array6[6] = 23;
        a(array5, new byte[] { 84, -82, -111, 39, -99, 65, 55, -24 });
        this.a(sb.append(new String(array5, utf_8).intern()).append(this.d).toString());
        this.e();
    }
    
    public final void e() {
        final int nextInt = ((Random)this.a).nextInt(4);
        Label_2838: {
            String s;
            String s2;
            if (nextInt != 0) {
                if (nextInt != 1) {
                    if (nextInt == 2) {
                        final byte[] array2;
                        final byte[] array = array2 = new byte[6];
                        array2[0] = -16;
                        array2[1] = -122;
                        array2[2] = -83;
                        array2[3] = 120;
                        array2[4] = 103;
                        array2[5] = 37;
                        a(array, new byte[] { -93, -1, -34, 12, 2, 72, 95, -46 });
                        final Charset utf_8 = StandardCharsets.UTF_8;
                        final String intern = new String(array, utf_8).intern();
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[17];
                        array4[0] = 12;
                        array4[1] = -102;
                        array4[2] = -35;
                        array4[3] = 8;
                        array4[4] = -89;
                        array4[5] = -88;
                        array4[6] = 31;
                        array4[7] = 74;
                        array4[8] = -125;
                        array4[9] = 82;
                        array4[10] = -115;
                        array4[11] = 98;
                        array4[12] = -34;
                        array4[13] = -50;
                        array4[14] = -24;
                        array4[15] = -13;
                        array4[16] = 2;
                        a(array3, new byte[] { 73, -12, -87, 122, -34, -120, 113, 37, -9, 114, -21, 13, -85, -96, -116, -45, 34 });
                        Log.d(intern, new String(array3, utf_8).intern());
                        break Label_2838;
                    }
                    if (nextInt != 3) {
                        final byte[] array6;
                        final byte[] array5 = array6 = new byte[6];
                        array6[0] = -94;
                        array6[1] = -80;
                        array6[2] = 36;
                        array6[3] = -103;
                        array6[4] = 109;
                        array6[5] = 95;
                        a(array5, new byte[] { -15, -55, 87, -19, 8, 50, -39, 100 });
                        final Charset utf_9 = StandardCharsets.UTF_8;
                        s = new String(array5, utf_9).intern();
                        final byte[] array8;
                        final byte[] array7 = array8 = new byte[34];
                        array8[0] = 21;
                        array8[1] = 76;
                        array8[2] = -76;
                        array8[3] = -93;
                        array8[4] = -77;
                        array8[5] = 74;
                        array8[6] = -7;
                        array8[7] = 32;
                        array8[8] = 68;
                        array8[9] = -75;
                        array8[10] = 69;
                        array8[11] = 89;
                        array8[12] = 61;
                        array8[13] = -88;
                        array8[14] = 53;
                        array8[15] = -96;
                        array8[16] = 29;
                        array8[17] = -112;
                        array8[18] = -38;
                        array8[19] = -100;
                        array8[20] = 48;
                        array8[21] = -128;
                        array8[22] = -79;
                        array8[23] = 118;
                        array8[24] = -52;
                        array8[25] = -51;
                        array8[26] = -122;
                        array8[27] = -63;
                        array8[28] = 62;
                        array8[29] = -44;
                        array8[30] = -74;
                        array8[31] = 36;
                        array8[32] = 7;
                        array8[33] = -61;
                        a(array7, new byte[] { 91, 35, -108, -48, -42, 56, -113, 73, 39, -48, 101, 41, 72, -54, 89, -55, 110, -8, -65, -8, 16, -26, -34, 4, -10, -19, -13, -88, 83, -69, -46, 65, 39, -29 });
                        s2 = new String(array7, utf_9);
                    }
                    else {
                        final byte[] array10;
                        final byte[] array9 = array10 = new byte[6];
                        array10[0] = 109;
                        array10[1] = -120;
                        array10[2] = 77;
                        array10[3] = -3;
                        array10[4] = -43;
                        array10[5] = 94;
                        a(array9, new byte[] { 62, -15, 62, -119, -80, 51, 37, 4 });
                        final Charset utf_10 = StandardCharsets.UTF_8;
                        s = new String(array9, utf_10).intern();
                        final byte[] array12;
                        final byte[] array11 = array12 = new byte[49];
                        array12[0] = 104;
                        array12[1] = 105;
                        array12[2] = -47;
                        array12[3] = -121;
                        array12[4] = 87;
                        array12[5] = 103;
                        array12[6] = -15;
                        array12[7] = 34;
                        array12[8] = -55;
                        array12[9] = -112;
                        array12[10] = 35;
                        array12[11] = 119;
                        array12[12] = -9;
                        array12[13] = 2;
                        array12[14] = 62;
                        array12[15] = 117;
                        array12[16] = -24;
                        array12[17] = 7;
                        array12[18] = -14;
                        array12[19] = -3;
                        array12[20] = 58;
                        array12[21] = 110;
                        array12[22] = 48;
                        array12[23] = -11;
                        array12[24] = 83;
                        array12[25] = 97;
                        array12[26] = 14;
                        array12[27] = 105;
                        array12[28] = 29;
                        array12[29] = -56;
                        array12[30] = 71;
                        array12[31] = -34;
                        array12[32] = -79;
                        array12[33] = -46;
                        array12[34] = 59;
                        array12[35] = -63;
                        array12[36] = 23;
                        array12[37] = 57;
                        array12[38] = -43;
                        array12[39] = -124;
                        array12[40] = -19;
                        array12[41] = -37;
                        array12[42] = 83;
                        array12[43] = 62;
                        array12[44] = -65;
                        array12[45] = 117;
                        array12[46] = 113;
                        array12[47] = 71;
                        array12[48] = 65;
                        a(array11, new byte[] { 41, 73, -93, -30, 36, 8, -124, 80, -86, -11, 3, 17, -106, 107, 82, 16, -116, 39, -122, -110, 26, 13, 81, -103, 63, 65, 70, 8, 111, -84, 48, -65, -61, -73, 121, -76, 113, 95, -80, -10, -61, -72, 63, 81, -52, 16, 95, 103, 97 });
                        s2 = new String(array11, utf_10);
                    }
                }
                else {
                    final byte[] array14;
                    final byte[] array13 = array14 = new byte[6];
                    array14[0] = -23;
                    array14[1] = -111;
                    array14[2] = 35;
                    array14[3] = 8;
                    array14[4] = -76;
                    array14[5] = -67;
                    a(array13, new byte[] { -71, -16, 81, 107, -47, -47, 28, -45 });
                    final Charset utf_11 = StandardCharsets.UTF_8;
                    s = new String(array13, utf_11).intern();
                    final byte[] array16;
                    final byte[] array15 = array16 = new byte[32];
                    array16[0] = -89;
                    array16[1] = -11;
                    array16[2] = 60;
                    array16[3] = 66;
                    array16[4] = -21;
                    array16[5] = -94;
                    array16[6] = 16;
                    array16[7] = -75;
                    array16[8] = -8;
                    array16[9] = -10;
                    array16[10] = 25;
                    array16[11] = 64;
                    array16[12] = 57;
                    array16[13] = -13;
                    array16[14] = 41;
                    array16[15] = -77;
                    array16[16] = -69;
                    array16[17] = 70;
                    array16[18] = -110;
                    array16[19] = 92;
                    array16[20] = 14;
                    array16[21] = -51;
                    array16[22] = 96;
                    array16[23] = 118;
                    array16[24] = -114;
                    array16[25] = -5;
                    array16[26] = 127;
                    array16[27] = 116;
                    array16[28] = -76;
                    array16[29] = -98;
                    array16[30] = -106;
                    array16[31] = -9;
                    a(array15, new byte[] { -30, -115, 76, 39, -120, -42, 121, -37, -97, -42, 123, 41, 87, -105, 76, -63, -101, 36, -25, 40, 46, -86, 15, 2, -82, -107, 10, 24, -40, -65, -74, -41 });
                    s2 = new String(array15, utf_11);
                }
            }
            else {
                final byte[] array18;
                final byte[] array17 = array18 = new byte[6];
                array18[0] = -22;
                array18[1] = -69;
                array18[2] = -6;
                array18[3] = 48;
                array18[4] = 44;
                array18[5] = -52;
                a(array17, new byte[] { -71, -62, -119, 68, 73, -95, 44, 31 });
                final Charset utf_12 = StandardCharsets.UTF_8;
                s = new String(array17, utf_12).intern();
                final byte[] array20;
                final byte[] array19 = array20 = new byte[34];
                array20[0] = -34;
                array20[1] = 89;
                array20[2] = 122;
                array20[3] = 39;
                array20[4] = -12;
                array20[5] = -41;
                array20[6] = 62;
                array20[7] = -96;
                array20[8] = -112;
                array20[9] = -84;
                array20[10] = 81;
                array20[11] = -50;
                array20[12] = 79;
                array20[13] = -71;
                array20[14] = 24;
                array20[15] = -72;
                array20[16] = -81;
                array20[17] = -20;
                array20[18] = -101;
                array20[19] = 109;
                array20[20] = -31;
                array20[21] = 68;
                array20[22] = 72;
                array20[23] = 105;
                array20[24] = 28;
                array20[25] = 73;
                array20[26] = 91;
                array20[27] = -75;
                array20[28] = -95;
                array20[29] = 42;
                array20[30] = 105;
                array20[31] = -80;
                array20[32] = -38;
                array20[33] = -82;
                a(array19, new byte[] { -97, 121, 8, 66, -121, -72, 75, -46, -13, -55, 113, -88, 46, -48, 116, -35, -53, -52, -17, 2, -63, 39, 41, 5, 112, 105, 56, -39, -50, 89, 12, -98, -6, -114 });
                s2 = new String(array19, utf_12);
            }
            Log.w(s, s2.intern());
        }
        final byte[] array22;
        final byte[] array21 = array22 = new byte[2];
        array22[0] = 56;
        array22[1] = 73;
        a(array21, new byte[] { 112, 11, 107, -85, 54, 69, 77, 54 });
        this.a(new String(array21, StandardCharsets.UTF_8).intern());
        this.e = System.currentTimeMillis();
    }
    
    public final void f() {
        final long n = ((Random)this.a).nextInt(3500) + 1000;
        try {
            Thread.sleep(n);
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void g() {
        final ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.b = scheduledThreadPool;
        this.c = (ScheduledFuture<?>)scheduledThreadPool.scheduleWithFixedDelay((Runnable)new p1$$ExternalSyntheticLambda0(this), 0L, 5L, TimeUnit.SECONDS);
    }
    
    public void h() {
        final ScheduledFuture<?> c = this.c;
        if (c != null) {
            ((Future)c).cancel(true);
        }
        final ScheduledExecutorService b = this.b;
        if (b != null) {
            ((ExecutorService)b).shutdown();
        }
    }
}
