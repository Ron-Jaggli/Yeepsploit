package com.aheaditec.talsec.security;

import java.util.UUID;

public class f1
{
    public static volatile String a;
    
    public static String a() {
        if (f1.a == null) {
            synchronized (f1.class) {
                if (f1.a == null) {
                    f1.a = UUID.randomUUID().toString();
                }
            }
        }
        return f1.a;
    }
}
