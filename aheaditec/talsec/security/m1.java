package com.aheaditec.talsec.security;

public class m1 extends Exception
{
    public final int a;
    
    public m1(final int a, final String s) {
        super(s);
        this.a = a;
    }
    
    public m1(final int a, final String s, final Throwable t) {
        super(s, t);
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
}
