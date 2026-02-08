package com.aheaditec.talsec.security;

import org.json.JSONException;
import java.util.Iterator;
import java.util.Map$Entry;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class U
{
    public final Map<String, T> a;
    
    public U() {
        this.a = (Map<String, T>)new HashMap(15);
    }
    
    public JSONObject a() throws JSONException {
        synchronized (this) {
            final JSONObject jsonObject = new JSONObject();
            for (final Map$Entry map$Entry : this.a.entrySet()) {
                jsonObject.put((String)map$Entry.getKey(), (Object)((T)map$Entry.getValue()).a());
            }
            return jsonObject;
        }
    }
    
    public final void a(final T t, final T.a a, final Long n) {
        if (n != null) {
            t.a(a, n);
        }
        else {
            t.a(a);
        }
    }
    
    public void a(final String s, final T.a a, final Long n) {
        synchronized (this) {
            final T t = (T)this.a.get((Object)s);
            if (t != null) {
                if (n != null) {
                    t.a(a, n);
                }
                else {
                    t.a(a);
                }
                return;
            }
            this.a.put((Object)s, (Object)new T(a, n));
        }
    }
}
