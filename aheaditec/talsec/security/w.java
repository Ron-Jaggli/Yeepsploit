package com.aheaditec.talsec.security;

import java.util.Objects;
import org.json.JSONException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class W implements y0
{
    public final String a;
    public final List<String> b;
    
    public W(final String a, final List<String> b) {
        this.a = a;
        if (b == null) {
            this.b = (List<String>)new ArrayList();
        }
        else {
            this.b = b;
        }
    }
    
    public void a(final JSONObject jsonObject) throws JSONException {
        final JSONArray jsonArray = new JSONArray();
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)iterator.next());
        }
        jsonObject.put(this.a, (Object)jsonArray);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final W w = (W)o;
            if (!Objects.equals((Object)this.a, (Object)w.a) || !Objects.equals((Object)this.b, (Object)w.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
}
