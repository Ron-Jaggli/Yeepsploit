package com.aheaditec.talsec_security.security.api;

import java.util.Date;
import java.util.Random;

public final class MemoryRewrite
{
    public static final Random a;
    
    static {
        a = new Random(new Date().getTime());
    }
    
    public static void rewriteWithRandomness(final byte[] array) {
        if (array != null) {
            MemoryRewrite.a.nextBytes(array);
        }
    }
    
    public static void rewriteWithRandomness(final char[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = (char)(MemoryRewrite.a.nextInt(26) + 97);
        }
    }
}
