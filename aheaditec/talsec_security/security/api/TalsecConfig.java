package com.aheaditec.talsec_security.security.api;

import java.nio.charset.Charset;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

public class TalsecConfig
{
    public final String a;
    public final String[] b;
    public final String c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final String[][] g;
    public final String[] h;
    public final boolean i;
    public final boolean j;
    
    public TalsecConfig(final Builder builder) {
        this.a = builder.c();
        this.b = builder.d();
        this.c = builder.i();
        this.d = builder.g();
        this.e = builder.b();
        this.f = builder.a();
        this.g = builder.h();
        this.h = builder.j();
        this.i = builder.e();
        this.j = builder.f();
    }
    
    public String[] getBlacklistedHashes() {
        return this.f;
    }
    
    public String[] getBlacklistedPackageNames() {
        return this.e;
    }
    
    public String getExpectedPackageName() {
        return this.a;
    }
    
    public String[] getExpectedSigningCertificateHashes() {
        return this.b;
    }
    
    public boolean getKillOnBypass() {
        return this.j;
    }
    
    public String[] getSupportedAlternativeStores() {
        return this.d;
    }
    
    public String[][] getSuspiciousPermissions() {
        return this.g;
    }
    
    public String getWatcherMail() {
        return this.c;
    }
    
    public String[] getWhitelistedInstallationSources() {
        return this.h;
    }
    
    public boolean isProd() {
        return this.i;
    }
    
    public static class Builder
    {
        public final String a;
        public final String[] b;
        public String c;
        public String[] d;
        public String[] e;
        public String[] f;
        public String[][] g;
        public String[] h;
        public boolean i;
        public boolean j;
        
        public Builder(final String a, final String[] b) {
            this.i = true;
            this.j = false;
            if (a != null) {
                a(b);
                this.a = a;
                this.b = b;
                return;
            }
            final byte[] array2;
            final byte[] array = array2 = new byte[28];
            array2[0] = -39;
            array2[1] = 0;
            array2[2] = -127;
            array2[4] = (array2[3] = 78);
            array2[5] = 61;
            array2[6] = 84;
            array2[7] = -51;
            array2[8] = -13;
            array2[9] = 109;
            array2[10] = -111;
            array2[11] = -32;
            array2[12] = -76;
            array2[13] = 10;
            array2[14] = -46;
            array2[15] = -110;
            array2[16] = -103;
            array2[17] = 70;
            array2[18] = 26;
            array2[19] = 65;
            array2[20] = 39;
            array2[21] = -52;
            array2[22] = 96;
            array2[23] = 16;
            array2[24] = 21;
            array2[25] = -20;
            array2[26] = -70;
            array2[27] = -35;
            a(array, new byte[] { -100, 120, -15, 43, 45, 73, 49, -87, -93, 12, -14, -117, -43, 109, -73, -36, -8, 43, 127, 97, 78, -65, 64, 126, 96, -128, -42, -13 });
            throw new IllegalArgumentException(new String(array, StandardCharsets.UTF_8).intern());
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
        
        public static void a(final String[] array) {
            if (array != null && array.length != 0) {
                final int length = array.length;
                int i = 0;
                while (i < length) {
                    final String s = array[i];
                    try {
                        if (Base64.decode(s, 2).length == 32) {
                            ++i;
                            continue;
                        }
                        final StringBuilder sb = new StringBuilder();
                        final byte[] array3;
                        final byte[] array2 = array3 = new byte[66];
                        array3[0] = -105;
                        array3[1] = 22;
                        array3[2] = 6;
                        array3[3] = -9;
                        array3[4] = 58;
                        array3[5] = 1;
                        array3[6] = 27;
                        array3[7] = 78;
                        array3[8] = -118;
                        array3[9] = 1;
                        array3[10] = 82;
                        array3[11] = -67;
                        array3[12] = 74;
                        array3[13] = 75;
                        array3[14] = -13;
                        array3[15] = 48;
                        array3[16] = 79;
                        array3[17] = -128;
                        array3[18] = 87;
                        array3[19] = -128;
                        array3[20] = -37;
                        array3[21] = -17;
                        array3[22] = 30;
                        array3[23] = 81;
                        array3[24] = -23;
                        array3[25] = 66;
                        array3[26] = 87;
                        array3[27] = 97;
                        array3[28] = 61;
                        array3[29] = 14;
                        array3[30] = 59;
                        array3[31] = -126;
                        array3[32] = -25;
                        array3[33] = 118;
                        array3[34] = 50;
                        array3[35] = -19;
                        array3[36] = 127;
                        array3[37] = 76;
                        array3[38] = 94;
                        array3[39] = 86;
                        array3[40] = 92;
                        array3[41] = -121;
                        array3[42] = -25;
                        array3[43] = -106;
                        array3[44] = 5;
                        array3[45] = -37;
                        array3[46] = -25;
                        array3[47] = -98;
                        array3[48] = -25;
                        array3[49] = -17;
                        array3[50] = 64;
                        array3[51] = -12;
                        array3[52] = 54;
                        array3[53] = 78;
                        array3[54] = 95;
                        array3[55] = -8;
                        array3[56] = 38;
                        array3[57] = -4;
                        array3[58] = -25;
                        array3[59] = 53;
                        array3[60] = -99;
                        array3[61] = -31;
                        array3[62] = -116;
                        array3[63] = -124;
                        array3[64] = -69;
                        array3[65] = -1;
                        a(array2, new byte[] { -46, 110, 118, -110, 89, 117, 126, 42, -86, 82, 59, -38, 36, 34, -99, 87, 111, -61, 50, -14, -81, -122, 120, 56, -118, 35, 35, 4, 29, 70, 90, -15, -113, 19, 65, -51, 28, 35, 48, 34, 61, -18, -119, -74, 108, -75, -111, -1, -117, -122, 36, -44, 83, 32, 43, -118, 95, -46, -57, 112, -13, -107, -2, -3, -101, -61 });
                        final Charset utf_8 = StandardCharsets.UTF_8;
                        final StringBuilder append = sb.append(new String(array2, utf_8).intern()).append(s);
                        final byte[] array5;
                        final byte[] array4 = array5 = new byte[69];
                        array5[0] = -100;
                        array5[1] = 58;
                        array5[2] = -36;
                        array5[3] = 12;
                        array5[4] = 76;
                        array5[5] = -115;
                        array5[6] = 105;
                        array5[7] = -116;
                        array5[8] = -85;
                        array5[9] = -101;
                        array5[10] = 45;
                        array5[11] = 34;
                        array5[12] = 117;
                        array5[13] = -32;
                        array5[14] = 127;
                        array5[15] = -123;
                        array5[16] = -71;
                        array5[17] = 38;
                        array5[18] = 58;
                        array5[19] = -31;
                        array5[20] = -35;
                        array5[21] = 105;
                        array5[22] = -36;
                        array5[23] = -118;
                        array5[24] = -64;
                        array5[25] = -125;
                        array5[26] = 35;
                        array5[27] = 117;
                        array5[28] = 74;
                        array5[29] = -80;
                        array5[30] = -105;
                        array5[31] = -91;
                        array5[32] = -68;
                        array5[33] = -9;
                        array5[34] = 119;
                        array5[35] = 40;
                        array5[36] = 88;
                        array5[37] = -60;
                        array5[38] = -13;
                        array5[39] = -51;
                        array5[40] = 123;
                        array5[41] = -10;
                        array5[42] = -94;
                        array5[43] = -85;
                        array5[44] = -43;
                        array5[45] = 31;
                        array5[46] = -96;
                        array5[47] = 103;
                        array5[48] = 73;
                        array5[49] = 84;
                        array5[50] = 15;
                        array5[51] = 40;
                        array5[52] = -86;
                        array5[53] = -69;
                        array5[54] = 114;
                        array5[55] = -61;
                        array5[56] = -127;
                        array5[57] = 111;
                        array5[58] = 64;
                        array5[59] = 88;
                        array5[60] = -22;
                        array5[61] = 61;
                        array5[62] = 102;
                        array5[63] = 82;
                        array5[64] = 44;
                        array5[65] = 18;
                        array5[66] = 111;
                        array5[67] = 127;
                        array5[68] = -22;
                        a(array4, new byte[] { -94, 26, -75, 127, 108, -29, 6, -8, -117, -56, 101, 99, 88, -46, 74, -77, -103, 84, 95, -111, -81, 12, -81, -17, -82, -9, 66, 1, 35, -33, -7, -123, -45, -111, 87, 92, 48, -95, -45, -66, 18, -111, -52, -62, -69, 120, -128, 4, 44, 38, 123, 65, -52, -46, 17, -94, -11, 10, 96, 49, -124, 29, 36, 51, 95, 119, 89, 75, -60 });
                        throw new IllegalArgumentException(append.append(new String(array4, utf_8).intern()).toString());
                    }
                    catch (final IllegalArgumentException ex) {
                        final StringBuilder sb2 = new StringBuilder();
                        final byte[] array7;
                        final byte[] array6 = array7 = new byte[66];
                        array7[0] = 101;
                        array7[1] = -99;
                        array7[2] = -67;
                        array7[3] = 0;
                        array7[4] = -67;
                        array7[5] = -59;
                        array7[6] = 11;
                        array7[7] = 1;
                        array7[8] = 41;
                        array7[9] = 106;
                        array7[10] = 11;
                        array7[11] = -116;
                        array7[12] = -31;
                        array7[13] = -4;
                        array7[14] = -83;
                        array7[15] = 38;
                        array7[16] = 124;
                        array7[17] = -23;
                        array7[18] = 35;
                        array7[19] = -95;
                        array7[20] = -111;
                        array7[21] = 31;
                        array7[22] = -14;
                        array7[23] = 25;
                        array7[24] = -38;
                        array7[25] = 89;
                        array7[26] = 40;
                        array7[27] = 24;
                        array7[28] = 98;
                        array7[29] = -117;
                        array7[30] = -91;
                        array7[31] = -77;
                        array7[32] = 36;
                        array7[33] = 10;
                        array7[34] = -126;
                        array7[35] = -2;
                        array7[36] = -81;
                        array7[37] = -72;
                        array7[38] = -24;
                        array7[39] = -46;
                        array7[40] = -120;
                        array7[41] = -107;
                        array7[42] = -123;
                        array7[43] = -128;
                        array7[44] = 123;
                        array7[45] = -7;
                        array7[46] = -28;
                        array7[47] = 123;
                        array7[48] = -33;
                        array7[49] = 54;
                        array7[50] = -31;
                        array7[51] = 59;
                        array7[52] = -7;
                        array7[53] = 92;
                        array7[54] = 25;
                        array7[55] = -65;
                        array7[56] = -36;
                        array7[57] = -76;
                        array7[58] = 93;
                        array7[59] = -77;
                        array7[60] = -38;
                        array7[61] = -10;
                        array7[62] = -44;
                        array7[63] = -25;
                        array7[64] = -119;
                        array7[65] = 41;
                        a(array6, new byte[] { 32, -27, -51, 101, -34, -79, 110, 101, 9, 57, 98, -21, -113, -107, -61, 65, 92, -86, 70, -45, -27, 118, -108, 112, -71, 56, 92, 125, 66, -61, -60, -64, 76, 111, -15, -34, -52, -41, -122, -90, -23, -4, -21, -96, 18, -105, -110, 26, -77, 95, -123, 27, -100, 50, 109, -51, -91, -102, 125, -10, -76, -126, -90, -98, -87, 21 });
                        final Charset utf_9 = StandardCharsets.UTF_8;
                        final StringBuilder append2 = sb2.append(new String(array6, utf_9).intern()).append(s);
                        final byte[] array9;
                        final byte[] array8 = array9 = new byte[24];
                        array9[0] = 10;
                        array9[1] = -67;
                        array9[2] = -109;
                        array9[3] = 83;
                        array9[4] = 38;
                        array9[5] = 31;
                        array9[6] = 69;
                        array9[7] = -105;
                        array9[8] = 87;
                        array9[9] = 109;
                        array9[10] = -103;
                        array9[11] = 24;
                        array9[12] = -116;
                        array9[13] = 96;
                        array9[14] = -49;
                        array9[15] = -75;
                        array9[16] = -87;
                        array9[17] = -15;
                        array9[18] = -68;
                        array9[19] = -10;
                        array9[20] = 47;
                        array9[21] = -101;
                        array9[22] = 25;
                        array9[23] = 80;
                        a(array8, new byte[] { 52, -99, -6, 32, 6, 113, 42, -29, 119, 4, -9, 56, -50, 1, -68, -48, -97, -59, -100, -112, 64, -23, 116, 126 });
                        throw new IllegalArgumentException(append2.append(new String(array8, utf_9).intern()).toString(), (Throwable)ex);
                    }
                    break;
                }
                return;
            }
            final byte[] array11;
            final byte[] array10 = array11 = new byte[67];
            array11[0] = -118;
            array11[1] = -111;
            array11[2] = 14;
            array11[3] = 56;
            array11[4] = -56;
            array11[5] = 92;
            array11[6] = -90;
            array11[7] = 57;
            array11[8] = -126;
            array11[9] = 50;
            array11[10] = 80;
            array11[11] = 68;
            array11[12] = 19;
            array11[13] = -31;
            array11[14] = 111;
            array11[15] = -69;
            array11[16] = -39;
            array11[17] = 45;
            array11[18] = -3;
            array11[19] = 109;
            array11[20] = -57;
            array11[21] = 113;
            array11[22] = 2;
            array11[23] = -33;
            array11[24] = -65;
            array11[25] = -55;
            array11[26] = -87;
            array11[27] = 28;
            array11[28] = -27;
            array11[29] = -51;
            array11[30] = 72;
            array11[31] = -79;
            array11[32] = 12;
            array11[33] = 102;
            array11[34] = 66;
            array11[35] = 110;
            array11[36] = -21;
            array11[37] = 101;
            array11[38] = -27;
            array11[39] = 115;
            array11[40] = -13;
            array11[41] = -37;
            array11[42] = -28;
            array11[43] = 10;
            array11[44] = -79;
            array11[45] = 81;
            array11[46] = 118;
            array11[47] = -128;
            array11[48] = 106;
            array11[49] = 76;
            array11[50] = -41;
            array11[51] = -103;
            array11[52] = 123;
            array11[53] = 90;
            array11[54] = -84;
            array11[55] = 41;
            array11[56] = -87;
            array11[57] = -74;
            array11[58] = -33;
            array11[59] = -42;
            array11[60] = -15;
            array11[61] = 93;
            array11[62] = -96;
            array11[63] = 51;
            array11[64] = 28;
            array11[65] = -19;
            array11[66] = -51;
            a(array10, new byte[] { -49, -23, 126, 93, -85, 40, -61, 93, -94, 97, 57, 35, 125, -120, 1, -36, -7, 110, -104, 31, -77, 24, 100, -74, -36, -88, -35, 121, -59, -123, 41, -62, 100, 3, 49, 78, -118, 23, -128, 83, -99, -76, -112, 42, -43, 52, 16, -23, 4, 41, -77, -71, 18, 52, -116, 125, -56, -38, -84, -77, -110, 30, -49, 93, 122, -124, -86 });
            throw new IllegalArgumentException(new String(array10, StandardCharsets.UTF_8).intern());
        }
        
        public String[] a() {
            return this.f;
        }
        
        public String[] b() {
            return this.e;
        }
        
        public Builder blacklistedHashes(final String[] f) {
            this.f = f;
            return this;
        }
        
        public Builder blacklistedPackageNames(final String[] e) {
            this.e = e;
            return this;
        }
        
        public TalsecConfig build() {
            return new TalsecConfig(this);
        }
        
        public String c() {
            return this.a;
        }
        
        public String[] d() {
            return this.b;
        }
        
        public boolean e() {
            return this.i;
        }
        
        public boolean f() {
            return this.j;
        }
        
        public String[] g() {
            return this.d;
        }
        
        public String[][] h() {
            return this.g;
        }
        
        public String i() {
            return this.c;
        }
        
        public String[] j() {
            return this.h;
        }
        
        public Builder killOnBypass(final boolean j) {
            this.j = j;
            return this;
        }
        
        public Builder prod(final boolean i) {
            this.i = i;
            return this;
        }
        
        public Builder supportedAlternativeStores(final String[] d) {
            this.d = d;
            return this;
        }
        
        public Builder suspiciousPermissions(final String[][] g) {
            this.g = g;
            return this;
        }
        
        public Builder watcherMail(final String c) {
            this.c = c;
            return this;
        }
        
        public Builder whitelistedInstallationSources(final String[] h) {
            this.h = h;
            return this;
        }
    }
}
