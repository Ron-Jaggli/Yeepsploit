package com.aheaditec.talsec.security;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import java.nio.charset.StandardCharsets;

public class h1 implements y0
{
    public final String a;
    public final String b;
    
    public h1(final String a, final String b) {
        this.a = a;
        if (b == null) {
            final byte[] array2;
            final byte[] array = array2 = new byte[4];
            array2[0] = 47;
            array2[1] = -99;
            array2[2] = -102;
            array2[3] = 96;
            a(array, new byte[] { 65, -24, -10, 12, -1, 114, -68, 69 });
            this.b = new String(array, StandardCharsets.UTF_8).intern();
        }
        else {
            this.b = b;
        }
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        byte[] array3 = null;
        int n = 0;
        int n2 = 0;
        int n3 = -1850458006;
        byte[] array4 = null;
    Label_0266:
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
                    break Label_0266;
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
    
    public void a(final JSONObject jsonObject) throws JSONException {
        jsonObject.put(this.a, (Object)this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final h1 h1 = (h1)o;
            if (!Objects.equals((Object)this.a, (Object)h1.a) || !Objects.equals((Object)this.b, (Object)h1.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
}
