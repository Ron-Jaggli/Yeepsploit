package com.aheaditec.talsec.security;

import android.content.Context;
import com.aheaditec.talsec_security.security.api.TalsecConfig;

public class x0 implements w0
{
    public static volatile x0 h;
    public final String a;
    public final o0 b;
    public final String c;
    public final F d;
    public final String e;
    public final g0 f;
    public final U g;
    
    public x0(final String a, final o0 b, final String c, final F d, final String e, final g0 f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new U();
    }
    
    public static x0 a(final v1 v1, final TalsecConfig talsecConfig, final Context context, final r0$a r0$a) {
        if (x0.h == null) {
            synchronized (x0.class) {
                if (x0.h == null) {
                    x0.h = new x0(v1.b().g, v1.a(), f1.a(), new F(context.getPackageName(), r0$a, w0.a(context), w0.b(context)), talsecConfig.getWatcherMail(), (g0)h0.e.a(context));
                }
            }
        }
        return x0.h;
    }
    
    @Override
    public F a() {
        return this.d;
    }
    
    @Override
    public String b() {
        return this.e;
    }
    
    @Override
    public U c() {
        return this.g;
    }
    
    @Override
    public String d() {
        return this.c;
    }
    
    @Override
    public g0 e() {
        return this.f;
    }
    
    @Override
    public String f() {
        return this.a;
    }
    
    @Override
    public String g() {
        return this.b.b();
    }
}
