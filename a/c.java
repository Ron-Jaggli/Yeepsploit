package com.unity3d.player.a;

import android.net.NetworkCapabilities;
import android.net.Network;
import android.net.ConnectivityManager$NetworkCallback;

final class c extends ConnectivityManager$NetworkCallback
{
    final d a;
    
    c(final d a) {
        this.a = a;
    }
    
    public final void onAvailable(final Network network) {
        super.onAvailable(network);
    }
    
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        final boolean hasTransport = networkCapabilities.hasTransport(0);
        final d a = this.a;
        int n;
        if (hasTransport) {
            n = 1;
        }
        else {
            n = 2;
        }
        d.-$$Nest$fputb(a, n);
    }
    
    public final void onLost(final Network network) {
        super.onLost(network);
        d.-$$Nest$fputb(this.a, 0);
    }
    
    public final void onUnavailable() {
        super.onUnavailable();
        d.-$$Nest$fputb(this.a, 0);
    }
}
