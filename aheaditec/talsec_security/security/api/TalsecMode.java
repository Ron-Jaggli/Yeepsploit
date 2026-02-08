package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.O;
import com.aheaditec.talsec.security.N;
import com.aheaditec.talsec.security.z1;
import java.nio.charset.Charset;
import kotlin.enums.EnumEntriesKt;
import java.nio.charset.StandardCharsets;
import kotlin.enums.EnumEntries;

public enum TalsecMode
{
    BACKGROUND, 
    FOREGROUND;
    
    public static final TalsecMode[] a;
    public static final EnumEntries b;
    
    static {
        final byte[] array2;
        final byte[] array = array2 = new byte[10];
        array2[0] = -122;
        array2[1] = 12;
        array2[2] = -92;
        array2[3] = -88;
        array2[4] = 61;
        array2[5] = -88;
        array2[6] = -10;
        array2[7] = -23;
        array2[8] = -81;
        array2[9] = -15;
        a(array, new byte[] { 113, -75, -31, -126, 127, 35, 72, -52, -39, -89 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final byte[] array4;
        final byte[] array3 = array4 = new byte[10];
        array4[0] = -111;
        array4[1] = 27;
        array4[2] = 95;
        array4[3] = -115;
        array4[4] = -93;
        array4[5] = -97;
        array4[6] = -56;
        array4[7] = 45;
        array4[8] = 91;
        array4[9] = 66;
        a(array3, new byte[] { -8, 6, 21, 99, -87, 18, 97, 96, -31, 90 });
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
    Label_0252:
        while (true) {
            Label_0666: {
                Label_0410: {
                    Label_0347: {
                        switch (n11) {
                            default: {
                                break Label_0666;
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
                                break Label_0252;
                            }
                            case 998066383: {
                                n3 = array.length - array.length % 4;
                                n10 = 0;
                                break;
                            }
                            case 974072829: {
                                n10 = array.length % 4;
                                break Label_0347;
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
                                break Label_0347;
                            }
                            case -1489518479: {
                                array3[n10] = (short)((array2[(0x2 & ~n10) * (n10 & 0xFFFFFFFD) + (n10 & 0x2) * (n10 | 0x2)] & 0xFF) ^ (array2[n10 * 2 + 1] & 0xFF) << 8);
                                ++n10;
                                break Label_0410;
                            }
                            case -1740520186: {
                                array3 = new short[4];
                                n10 = 0;
                                break Label_0410;
                            }
                            case -1809249287: {
                                final byte b = array[n10];
                                n8 = (short)((array[(n10 & 0x1) * 2 + (n10 ^ 0x1)] & 0xFF) << 8 | 255 - (b | 0xFF) + b);
                                final int n15 = -n10;
                                final int n16 = n15 | 0x2;
                                n7 = (short)((array[n16 - n15 * 2 + (n15 ^ 0x2 ^ n16)] & 0xFF) | (array[n10 + 3] & 0xFF) << 8);
                                n9 = -14624;
                                n6 = 0;
                                break Label_0666;
                            }
                            case -2038999444: {
                                final int n17 = (short)((n8 << 4) + array3[2]) ^ n8 + n9;
                                final short n18 = array3[3];
                                final int n19 = -(n8 >>> 5);
                                final int n20 = n19 | n18;
                                final int n21 = n20 - n19 * 2 + (n19 ^ n18 ^ n20);
                                final int n22 = -z1.a(n21 | ~n17, 2, n21 - n17, 2);
                                n7 = (short)O.a(n7, 3, -(N.a(n7, -4, 1, n22) | (n22 & 0x2)), 1);
                                n8 = (short)(n8 - ((short)((n7 << 4) + array3[0]) ^ (n9 | n7) - (~n7 & 0x35 & n9) + ((n7 | 0x35) & n9) ^ (n7 >>> 5) + array3[1]));
                                n9 = (short)(n9 - 40503);
                                ++n6;
                                break Label_0666;
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
    
    public static EnumEntries<TalsecMode> getEntries() {
        return (EnumEntries<TalsecMode>)TalsecMode.b;
    }
}
