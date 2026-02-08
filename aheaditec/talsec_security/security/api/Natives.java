package com.aheaditec.talsec_security.security.api;

import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.z1;
import java.nio.charset.StandardCharsets;

public final class Natives
{
    public static final Natives INSTANCE;
    
    static {
        INSTANCE = new Natives();
        final byte[] array2;
        final byte[] array = array2 = new byte[5];
        array2[0] = -59;
        array2[1] = 111;
        array2[2] = 103;
        array2[3] = -118;
        array2[4] = -53;
        a(array, new byte[] { -81, -87, 20, 55, 116, -25, 49, 12 });
        System.loadLibrary(new String(array, StandardCharsets.UTF_8).intern());
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
    Label_0256:
        while (true) {
            int n12 = 0;
            Label_0674: {
                Label_0414: {
                    Label_0351: {
                        switch (n11) {
                            default: {
                                n12 = n6;
                                break Label_0674;
                            }
                            case 2093236949: {
                                if (n6 < 32) {
                                    n11 = -2038999444;
                                    continue;
                                }
                                n11 = 1771480224;
                                continue;
                            }
                            case 1771480224: {
                                array[n10] = (byte)(n8 & 0xFF);
                                array[n10 + 1] = (byte)(n8 >> 8 & 0xFF);
                                array[n10 + 2] = (byte)(n7 & 0xFF);
                                array[n10 + 3] = (byte)(n7 >> 8 & 0xFF);
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
                                break Label_0256;
                            }
                            case 998066383: {
                                n3 = array.length - array.length % 4;
                                n10 = 0;
                                break;
                            }
                            case 974072829: {
                                n10 = array.length % 4;
                                break Label_0351;
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
                                final int n13 = -n10;
                                final int n14 = -length;
                                final int n15 = n14 | n13;
                                array[n15 - n14 * 2 + (n14 ^ n13 ^ n15)] = (byte)(array[array.length - n10] ^ array2[n10 % 8]);
                                --n10;
                                break Label_0351;
                            }
                            case -1489518479: {
                                array3[n10] = (short)((array2[(0x2 & ~n10) * (n10 & 0xFFFFFFFD) + (n10 & 0x2) * (n10 | 0x2)] & 0xFF) ^ (array2[n10 * 2 + 1] & 0xFF) << 8);
                                ++n10;
                                break Label_0414;
                            }
                            case -1740520186: {
                                array3 = new short[4];
                                n10 = 0;
                                break Label_0414;
                            }
                            case -1809249287: {
                                final byte b = array[n10];
                                n8 = (short)((array[(n10 & 0x1) * 2 + (n10 ^ 0x1)] & 0xFF) << 8 | 255 - (b | 0xFF) + b);
                                final int n16 = -n10;
                                final int n17 = n16 | 0x2;
                                n7 = (short)((array[n17 - n16 * 2 + (n16 ^ 0x2 ^ n17)] & 0xFF) | (array[n10 + 3] & 0xFF) << 8);
                                n9 = -14624;
                                n12 = 0;
                                break Label_0674;
                            }
                            case -2038999444: {
                                final int n18 = (short)((n8 << 4) + array3[2]) ^ n8 + n9;
                                final short n19 = array3[3];
                                final int n20 = -(n8 >>> 5);
                                final int n21 = n20 | n19;
                                final int n22 = n21 - n20 * 2 + (n20 ^ n19 ^ n21);
                                final int n23 = -z1.a(n22 | ~n18, 2, n22 - n18, 2);
                                n7 = (short)O.a(n7, 3, -(N.a(n7, -4, 1, n23) | (n23 & 0x2)), 1);
                                n8 = (short)(n8 - ((short)((n7 << 4) + array3[0]) ^ (n9 | n7) - (~n7 & 0x32 & n9) + ((n7 | 0x32) & n9) ^ (n7 >>> 5) + array3[1]));
                                n9 = (short)(n9 - 40503);
                                n12 = n6 + 1;
                                break Label_0674;
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
            n6 = n12;
        }
    }
    
    public final void start(final Context context) {
        final byte[] array2;
        final byte[] array = array2 = new byte[7];
        array2[0] = -26;
        array2[1] = -1;
        array2[2] = 8;
        array2[3] = 2;
        array2[4] = 83;
        array2[5] = -1;
        array2[6] = 83;
        a(array, new byte[] { -101, 39, -121, 54, -36, -115, 35, -36 });
        Intrinsics.checkNotNullParameter((Object)context, new String(array, StandardCharsets.UTF_8).intern());
        this.start(context, false);
    }
    
    public final native void start(final Context p0, final boolean p1);
    
    public final native void stop();
}
