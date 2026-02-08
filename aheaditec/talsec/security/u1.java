package com.aheaditec.talsec.security;

import java.nio.ByteBuffer;

public class u1
{
    public final byte[] a;
    public final B0 b;
    
    public u1(final B0 b) {
        this.b = b;
        this.a = b.d();
    }
    
    public ByteBuffer a() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }
    
    public final void a(final int n, final int n2) {
        final byte[] a = this.a;
        a[n] &= (byte)~(1 << n2);
    }
    
    public final void a(final int n, final int n2, final boolean b) {
        if (b) {
            this.b(n, n2);
        }
        else {
            this.a(n, n2);
        }
        this.b.a(this.a);
    }
    
    public void a(final t1.a a, final boolean b) {
        this.a(a.a, a.b, b);
    }
    
    public final void b() {
        this.b.a(this.a);
    }
    
    public final void b(final int n, final int n2) {
        final byte[] a = this.a;
        a[n] |= (byte)(1 << n2);
    }
}
