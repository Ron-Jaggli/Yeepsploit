package com.aheaditec.talsec.security;

public class X
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public Long d;
    
    public X(final boolean a, final boolean b, final boolean c) {
        this.d = null;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Long a() {
        return this.d;
    }
    
    public void a(final long n) {
        this.d = n;
    }
    
    public boolean b() {
        return this.a ^ true;
    }
    
    public boolean c() {
        return !this.a || !this.b || !this.c;
    }
}
