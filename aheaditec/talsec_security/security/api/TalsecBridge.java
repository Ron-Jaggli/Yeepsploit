package com.aheaditec.talsec_security.security.api;

import java.nio.ByteBuffer;
import com.aheaditec.talsec.security.r1;

public abstract class TalsecBridge
{
    public static r1 a;
    
    public static ByteBuffer getTalsecFlags() {
        final r1 a = TalsecBridge.a;
        if (a == null) {
            return ByteBuffer.wrap(new byte[0]);
        }
        return a.d();
    }
}
