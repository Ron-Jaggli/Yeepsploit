package com.aheaditec.talsec.security;

import java.nio.charset.Charset;
import android.content.Context;
import java.nio.charset.StandardCharsets;

public class c1 extends s
{
    public static final String o;
    public static final long p = 86400000L;
    public static final int q = 10;
    public final b1 n;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = 109;
        array2[1] = 31;
        array2[2] = -119;
        array2[3] = -36;
        array2[4] = 27;
        array2[5] = -6;
        array2[6] = -48;
        array2[7] = -55;
        a(array, new byte[] { 9, 122, -3, -71, 120, -114, -75, -83 });
        o = new String(array, StandardCharsets.UTF_8).intern();
    }
    
    public c1(final R0 r0, final E1 e1, final b1 n) {
        super(r0, e1);
        this.n = n;
    }
    
    private static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n2 = 0;
        int n3 = -1850458006;
        byte[] array4 = null;
    Label_0268:
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
                    break Label_0268;
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
    
    public void a(final Context context) {
    }
    
    public void e() {
        final long currentTimeMillis = System.currentTimeMillis();
        final Long a = this.n.a();
        if (a != null && currentTimeMillis - a > 86400000L) {
            this.n.g();
        }
        if (this.n.c() < 10) {
            this.n.e();
            final byte[] array2;
            final byte[] array = array2 = new byte[8];
            array2[0] = -77;
            array2[1] = -117;
            array2[2] = 41;
            array2[3] = 5;
            array2[4] = -43;
            array2[5] = -61;
            array2[6] = 115;
            array2[7] = 86;
            a(array, new byte[] { -41, -18, 93, 96, -74, -73, 22, 50 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String intern = new String(array, utf_8).intern();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[4];
            array4[0] = -117;
            array4[1] = 33;
            array4[2] = -114;
            array4[3] = -85;
            a(array3, new byte[] { -1, 83, -5, -50, 97, -17, -33, -111 });
            this.c(intern, new String(array3, utf_8).intern());
        }
        super.a(new X(false, true, true));
    }
}
