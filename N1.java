package com.unity3d.player;

import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

final class n1 implements View$OnApplyWindowInsetsListener
{
    final UnityPlayerForActivityOrService a;
    
    n1(final UnityPlayerForActivityOrService a) {
        this.a = a;
    }
    
    public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        ((UnityPlayer)this.a).invokeOnMainThread((Runnable)new a1(this, windowInsets));
        return windowInsets;
    }
}
