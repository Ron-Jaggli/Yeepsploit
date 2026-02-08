package com.yahoo.sketches;

public final class Util
{
    static final boolean $assertionsDisabled = false;
    public static final double LOG2;
    public static final String LS;
    public static final char TAB = '\t';
    
    static {
        LS = System.getProperty("line.separator");
        LOG2 = Math.log(2.0);
    }
    
    private Util() {
    }
    
    public static int bytesToInt(final byte[] array) {
        int i = 0;
        int n = 0;
        while (i < 4) {
            n |= (array[i] & 0xFF) << i * 8;
            ++i;
        }
        return n;
    }
    
    public static long bytesToLong(final byte[] array) {
        long n = 0L;
        for (int i = 0; i < 8; ++i) {
            n |= ((long)array[i] & 0xFFL) << i * 8;
        }
        return n;
    }
    
    public static String bytesToString(final byte[] array, final boolean b, final boolean b2, final String s) {
        final StringBuilder sb = new StringBuilder();
        int n;
        if (b) {
            n = -1;
        }
        else {
            n = 255;
        }
        final int length = array.length;
        final int n2 = 0;
        int n3 = length;
        if (b2) {
            int n4 = n2;
            int n5;
            while (true) {
                n5 = length - 1;
                if (n4 >= n5) {
                    break;
                }
                sb.append(array[n4] & n).append(s);
                ++n4;
            }
            sb.append(array[n5] & n);
        }
        else {
            while (true) {
                final int n6 = n3 - 1;
                if (n3 <= 1) {
                    break;
                }
                sb.append(array[n6] & n).append(s);
                n3 = n6;
            }
            sb.append(array[0] & n);
        }
        return sb.toString();
    }
    
    public static int ceilingPowerOf2(int highestOneBit) {
        if (highestOneBit <= 1) {
            return 1;
        }
        final int n = 1073741824;
        if (highestOneBit >= 1073741824) {
            highestOneBit = n;
        }
        else {
            highestOneBit = Integer.highestOneBit(highestOneBit - 1 << 1);
        }
        return highestOneBit;
    }
    
    public static final String characterPad(String value, final int n, final char c, final boolean b) {
        final char[] charArray = value.toCharArray();
        final int length = charArray.length;
        if (length < n) {
            final char[] array = new char[n];
            final int n2 = n - length;
            int i = 0;
            final int n3 = 0;
            if (b) {
                int n4 = n3;
                int j;
                while (true) {
                    j = length;
                    if (n4 >= length) {
                        break;
                    }
                    array[n4] = charArray[n4];
                    ++n4;
                }
                while (j < n) {
                    array[j] = c;
                    ++j;
                }
            }
            else {
                while (i < n2) {
                    array[i] = c;
                    ++i;
                }
                for (int k = n2; k < n; ++k) {
                    array[k] = charArray[k - n2];
                }
            }
            value = String.valueOf(array);
        }
        return value;
    }
    
    public static void checkIfMultipleOf8AndGT0(final long n, final String s) {
        if ((0x7L & n) == 0x0L && n > 0L) {
            return;
        }
        throw new SketchesArgumentException("The value of the parameter \"" + s + "\" must be a positive multiple of 8 and greater than zero: " + n);
    }
    
    public static void checkIfPowerOf2(final int n, final String s) {
        if (n > 0 && (n - 1 & n) == 0x0) {
            return;
        }
        throw new SketchesArgumentException("The value of the parameter \"" + s + "\" must be a positive integer-power of 2 and greater than 0: " + n);
    }
    
    public static void checkProbability(final double n, final String s) {
        if (n >= 0.0 && n <= 1.0) {
            return;
        }
        throw new SketchesArgumentException("The value of the parameter \"" + s + "\" must be between 0.0 inclusive and 1.0 inclusive: " + n);
    }
    
    public static final short checkSeedHashes(final short n, final short n2) {
        if (n == n2) {
            return n;
        }
        throw new SketchesArgumentException("Incompatible Seed Hashes. " + (int)n + ", " + (int)n2);
    }
    
    public static int[] evenlyLgSpaced(final int n, int i, final int n2) {
        if (n2 <= 0) {
            throw new SketchesArgumentException("points must be > 0");
        }
        if (i < 0 || n < 0) {
            throw new SketchesArgumentException("lgStart and lgEnd must be >= 0.");
        }
        final int[] array = new int[n2];
        final int n3 = 1;
        array[0] = 1 << n;
        if (n2 == 1) {
            return array;
        }
        final double n4 = (i - n) / (n2 - 1.0);
        for (i = n3; i < n2; ++i) {
            array[i] = (int)Math.round(Math.pow(2.0, i * n4 + n));
        }
        return array;
    }
    
    public static int floorPowerOf2(final int n) {
        if (n <= 1) {
            return 1;
        }
        return Integer.highestOneBit(n);
    }
    
    public static byte[] intToBytes(int n, final byte[] array) {
        for (int i = 0; i < 4; ++i) {
            array[i] = (byte)(n & 0xFF);
            n >>>= 8;
        }
        return array;
    }
    
    public static double invPow2(final int n) {
        return Double.longBitsToDouble(1023L - n << 52);
    }
    
    public static boolean isLessThanUnsigned(final long n, final long n2) {
        final boolean b = true;
        return n < n2 ^ (n < 0L != n2 < 0L && b);
    }
    
    public static boolean isMultipleOf8AndGT0(final long n) {
        return (0x7L & n) == 0x0L && n > 0L;
    }
    
    public static boolean isPowerOf2(final int n) {
        return n > 0 && (n & n - 1) == 0x0;
    }
    
    public static final double log2(final double n) {
        return Math.log(n) / Util.LOG2;
    }
    
    public static byte[] longToBytes(long n, final byte[] array) {
        for (int i = 0; i < 8; ++i) {
            array[i] = (byte)(0xFFL & n);
            n >>>= 8;
        }
        return array;
    }
    
    public static String longToHexBytes(final long n) {
        final StringBuilder sb = new StringBuilder();
        int n2 = 8;
        while (true) {
            final int n3 = n2 - 1;
            if (n2 <= 0) {
                break;
            }
            sb.append(zeroPad(Long.toHexString(n >>> n3 * 8 & 0xFFL), 2)).append(" ");
            n2 = n3;
        }
        return sb.toString();
    }
    
    public static String milliSecToString(long n) {
        final double n2 = (double)n;
        final long n3 = (long)(n2 % 1000.0);
        final long n4 = (long)(n2 / 1000.0 % 60.0);
        final long n5 = (long)(n2 / 60000.0 % 60.0);
        n = (long)(n2 / 3600000.0);
        return String.format("%d:%2s:%2s.%3s", new Object[] { n, zeroPad(Long.toString(n5), 2), zeroPad(Long.toString(n4), 2), zeroPad(Long.toString(n3), 3) });
    }
    
    public static String nanoSecToString(long n) {
        final double n2 = (double)n;
        n = (long)(n2 % 1000.0);
        return String.format("%d.%3s %3s %3s", new Object[] { (long)(n2 / 1.0E9), zeroPad(Long.toString((long)(n2 / 1000000.0 % 1000.0)), 3), zeroPad(Long.toString((long)(n2 / 1000.0 % 1000.0)), 3), zeroPad(Long.toString(n), 3) });
    }
    
    public static final int pwr2LawNext(int n, final int n2) {
        int n3;
        if (n2 < 1) {
            n3 = 1;
        }
        else {
            n3 = n2;
        }
        final double log2 = log2(n3);
        final double n4 = n;
        n = (int)Math.round(log2 * n4);
        int i;
        do {
            ++n;
            i = (int)Math.round(Math.pow(2.0, n / n4));
        } while (i <= n2);
        return i;
    }
    
    public static final int pwr2LawPrev(int n, final int n2) {
        if (n2 <= 1) {
            return 0;
        }
        final double log2 = log2(n2);
        final double n3 = n;
        n = (int)Math.round(log2 * n3);
        int n4;
        do {
            --n;
            n4 = (int)Math.round(Math.pow(2.0, n / n3));
        } while (n4 >= n2 && n4 > 1);
        return n4;
    }
    
    public static int simpleIntLog2(final int n) {
        return Integer.numberOfTrailingZeros(n);
    }
    
    public static final int startingSubMultiple(int n, final ResizeFactor resizeFactor, final int n2) {
        final int lg = resizeFactor.lg();
        if (n <= n2) {
            n = n2;
        }
        else if (lg != 0) {
            n = (n - n2) % lg + n2;
        }
        return n;
    }
    
    public static int toLog2(final int n, final String s) {
        checkIfPowerOf2(n, s);
        return Integer.numberOfTrailingZeros(n);
    }
    
    public static final String zeroPad(final String s, final int n) {
        return characterPad(s, n, '0', false);
    }
}
