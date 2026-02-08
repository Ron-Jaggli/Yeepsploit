package com.aheaditec.talsec.security;

import java.nio.charset.StandardCharsets;

public abstract class n implements b0
{
    public static final String c;
    public final u1 a;
    public final E1 b;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[12];
        array2[0] = -69;
        array2[1] = 59;
        array2[2] = 109;
        array2[3] = -25;
        array2[4] = 77;
        array2[5] = -33;
        array2[6] = -122;
        array2[7] = 63;
        array2[8] = -8;
        array2[9] = 59;
        array2[10] = -41;
        array2[11] = 118;
        a(array, new byte[] { -53, 90, 30, -108, 46, -80, -30, 90, -89, 72, -78, 2 });
        c = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public n(final u1 a, final E1 b) {
        this.a = a;
        this.b = b;
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
        }
    }
    
    public boolean a(final boolean b) {
        this.b.a().getClass();
        this.a.a(t1$a.k, b);
        if (!b) {
            final E1 b2 = this.b;
            b2.a().getClass();
            final byte[] array2;
            final byte[] array = array2 = new byte[12];
            array2[0] = -38;
            array2[1] = 123;
            array2[2] = 55;
            array2[3] = -8;
            array2[4] = -42;
            array2[5] = 2;
            array2[6] = 61;
            array2[7] = 25;
            array2[8] = 44;
            array2[9] = -119;
            array2[10] = 7;
            array2[11] = -34;
            a(array, new byte[] { -86, 26, 68, -117, -75, 109, 89, 124, 115, -6, 98, -86 });
            b2.a(Integer.valueOf(1), new String(array, StandardCharsets.UTF_8).intern());
        }
        return b;
    }
    
    public final void b(final boolean b) {
        this.a.a(t1$a.k, b);
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return false;
    }
}
