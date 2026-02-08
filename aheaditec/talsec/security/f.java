package com.aheaditec.talsec.security;

public class F
{
    public final String a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String e;
    public final String f;
    public final String g;
    
    public F(String s, final r0$a r0$a, final String e, final String f) {
        this.a = s;
        this.b = r0$a.a();
        this.e = e;
        final String[] c = r0$a.c();
        this.c = c;
        String[] b;
        if (r0$a.b() == null) {
            b = new String[0];
        }
        else {
            b = r0$a.b();
        }
        this.d = b;
        this.f = f;
        if (c.length > 0) {
            s = c[0];
        }
        else {
            s = null;
        }
        this.g = s;
    }
    
    public String[] a() {
        return this.b;
    }
    
    public String[] b() {
        return this.c;
    }
    
    public String[] c() {
        return this.d;
    }
    
    public String d() {
        return this.f;
    }
    
    public String e() {
        return this.a;
    }
    
    public String f() {
        return this.g;
    }
    
    public String g() {
        return this.e;
    }
}
