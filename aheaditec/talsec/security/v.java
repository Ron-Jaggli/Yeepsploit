package com.aheaditec.talsec.security;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.security.cert.X509Certificate;
import java.util.List;

public class V extends d
{
    public final String h;
    public final List<X509Certificate> i;
    
    public V(final String h, final List<X509Certificate> i) {
        this.h = h;
        this.i = i;
    }
    
    public void a(final JSONObject jsonObject) throws JSONException {
        final JSONArray jsonArray = new JSONArray();
        for (final X509Certificate x509Certificate : this.i) {
            if (x509Certificate != null) {
                jsonArray.put((Object)this.a(x509Certificate));
            }
        }
        jsonObject.put(this.h, (Object)jsonArray);
    }
}
