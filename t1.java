package com.unity3d.player;

import android.view.ViewGroup;
import android.view.View;

final class t1 implements Runnable
{
    final UnityPlayerForActivityOrService a;
    
    t1(final UnityPlayerForActivityOrService a) {
        this.a = a;
    }
    
    public final void run() {
        final UnityPlayerForActivityOrService a = this.a;
        if (UnityPlayerForActivityOrService.-$$Nest$fgetmMainDisplayOverride(a)) {
            ((ViewGroup)((UnityPlayer)a).getFrameLayout()).removeView((View)this.a.getView());
        }
        else if (((View)a.getView()).getParent() == null) {
            ((ViewGroup)((UnityPlayer)this.a).getFrameLayout()).addView((View)this.a.getView());
        }
        else {
            D.Log(5, "Couldn't add view, because it's already assigned to another parent");
        }
    }
}
