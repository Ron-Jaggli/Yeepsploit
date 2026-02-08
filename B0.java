package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import android.os.Handler;

final class b0 extends W
{
    private boolean h;
    private Handler i;
    private Runnable j;
    
    public b0(final Context context, final UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.h = false;
    }
    
    @Override
    public final void a(final boolean d) {
        super.d = d;
        EditText editText;
        int visibility;
        if (d) {
            editText = super.c;
            visibility = 4;
        }
        else {
            editText = super.c;
            visibility = 0;
        }
        ((View)editText).setVisibility(visibility);
        ((View)super.c).invalidate();
        ((View)super.c).requestLayout();
    }
    
    @Override
    public final void b() {
        final Handler i = this.i;
        if (i != null) {
            final Runnable j = this.j;
            if (j != null) {
                i.removeCallbacks(j);
            }
        }
        ((ViewGroup)super.b.getFrameLayout()).removeView((View)super.c);
        this.h = false;
        this.invokeOnClose();
    }
    
    @Override
    public final boolean c() {
        return false;
    }
    
    @Override
    protected EditText createEditText(final W w) {
        return new a0(super.a, w);
    }
    
    @Override
    public final void d() {
        if (this.h) {
            return;
        }
        final FrameLayout frameLayout = super.b.getFrameLayout();
        ((ViewGroup)frameLayout).addView((View)super.c);
        ((ViewGroup)frameLayout).bringChildToFront((View)super.c);
        ((View)super.c).setVisibility(0);
        ((View)super.c).requestFocus();
        this.j = (Runnable)new Z(this);
        (this.i = new Handler(Looper.getMainLooper())).postDelayed(this.j, 400L);
        this.h = true;
    }
}
