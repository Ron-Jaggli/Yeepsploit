package com.unity3d.player;

import com.unity3d.player.a.e;
import android.window.OnBackInvokedCallback;

final class d implements OnBackInvokedCallback
{
    final e a;
    
    d(final e a) {
        this.a = a;
    }
    
    public final void onBackInvoked() {
        final Runnable a = ((F)this.a).a;
        if (a != null) {
            a.run();
        }
    }
}
