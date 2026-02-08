package com.unity3d.player;

import android.view.View;
import android.view.KeyEvent;
import android.content.Context;
import android.widget.EditText;

final class f0 extends EditText
{
    final W a;
    final g0 b;
    
    f0(final g0 b, final Context context, final W a) {
        this.b = b;
        this.a = a;
        super(context);
    }
    
    public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            if (keyEvent.getAction() == 1) {
                this.b.h.onBackPressed();
            }
            return true;
        }
        if (n == 84) {
            return true;
        }
        if (n == 66 && keyEvent.getAction() == 0 && (this.getInputType() & 0x20000) == 0x0) {
            final W a = this.a;
            a.a(a.a(), false);
            return true;
        }
        if (n == 111 && keyEvent.getAction() == 0) {
            final W a2 = this.a;
            a2.a(a2.a(), true);
            return true;
        }
        return super.onKeyPreIme(n, keyEvent);
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            ((View)this).requestFocus();
            this.a.e();
        }
    }
}
