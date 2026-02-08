package com.yahoo.memory;

public final class Util
{
    static final boolean $assertionsDisabled = false;
    public static final int BOOLEAN_SHIFT = 0;
    public static final int BYTE_SHIFT = 0;
    public static final int CHAR_SHIFT = 1;
    public static final int DOUBLE_SHIFT = 3;
    public static final int FLOAT_SHIFT = 2;
    public static final int INT_SHIFT = 2;
    public static final int LONG_SHIFT = 3;
    static final String LS;
    public static final int SHORT_SHIFT = 1;
    
    static {
        LS = System.getProperty("line.separator");
    }
    
    public static void assertBounds(final long n, final long n2, final long n3) {
    }
    
    public static void checkBounds(final long n, final long n2, final long n3) {
        final long n4 = n2 + n;
        if ((n | n2 | n4 | n3 - n4) >= 0L) {
            return;
        }
        throw new IllegalArgumentException("reqOffset: " + n + ", reqLength: , (reqOff + reqLen): " + n4 + ", allocSize: " + n3);
    }
    
    public static boolean checkOverlap(final long n, final long n2, final long n3) {
        return Math.min(n, n2) + n3 <= Math.max(n, n2);
    }
    
    static final void nullCheck(final Object o) {
        if (o != null) {
            return;
        }
        throw new IllegalArgumentException("An input argument is null.");
    }
}
