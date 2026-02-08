package com.unity3d.player;

import android.view.View;
import android.app.Dialog;
import android.widget.EditText;
import android.content.DialogInterface$OnCancelListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.Context;

final class g0 extends W
{
    Y h;
    
    public g0(final Context context, final UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
    }
    
    public final void a(final String s, final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final String s2, final int n2, final boolean b5, final boolean b6) {
        (this.h = new Y(super.a, super.b)).a((W)this, b5, b6);
        ((Dialog)this.h).setOnDismissListener((DialogInterface$OnDismissListener)new c0(this));
        super.a(s, n, b, b2, b3, b4, s2, n2, b5, b6);
        ((View)((UnityPlayer)super.b).getFrameLayout()).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new d0(this));
        ((View)super.c).requestFocus();
        ((Dialog)this.h).setOnCancelListener((DialogInterface$OnCancelListener)new e0(this));
    }
    
    public final void a(final boolean d) {
        super.d = d;
        this.h.a(d);
    }
    
    public final void b() {
        ((Dialog)this.h).dismiss();
    }
    
    protected EditText createEditText(final W w) {
        return new f0(this, super.a, w);
    }
    
    public final void d() {
        ((Dialog)this.h).show();
    }
    
    protected void reportSoftInputArea() {
        if (((Dialog)this.h).isShowing()) {
            super.b.reportSoftInputArea(this.h.a());
        }
    }
}
