package com.unity3d.player.a;

import android.net.ConnectivityManager;
import android.content.Context;
import android.net.ConnectivityManager$NetworkCallback;
import com.unity3d.player.E;

public final class d extends E
{
    private int b;
    private final ConnectivityManager$NetworkCallback c;
    
    public d(final Context context) {
        super(context);
        this.b = 0;
        final c c = new c(this);
        this.c = c;
        if (super.a == null) {
            return;
        }
        this.b = super.b();
        super.a.registerDefaultNetworkCallback((ConnectivityManager$NetworkCallback)c);
    }
    
    public final void a() {
        final ConnectivityManager a = super.a;
        if (a == null) {
            return;
        }
        a.unregisterNetworkCallback(this.c);
    }
    
    public final int b() {
        return this.b;
    }
}
