package com.unity3d.player;

import android.view.KeyEvent;
import android.content.Context;
import android.widget.EditText;

final class a0 extends EditText
{
    final W a;
    
    a0(final Context context, final W a) {
        this.a = a;
        super(context);
    }
    
    public final void onEditorAction(final int n) {
        if (n == 6) {
            final W a = this.a;
            a.a(a.a(), false);
        }
    }
    
    public final boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            if (keyEvent.getAction() == 1) {
                final W a = this.a;
                a.a(a.a(), false);
            }
            return true;
        }
        if (n == 84) {
            return true;
        }
        if (n == 66 && keyEvent.getAction() == 0 && (this.getInputType() & 0x20000) == 0x0) {
            final W a2 = this.a;
            a2.a(a2.a(), false);
            return true;
        }
        return super.onKeyPreIme(n, keyEvent);
    }
    
    protected void onSelectionChanged(final int n, final int n2) {
        super.onSelectionChanged(n, n2);
        this.a.b.reportSoftInputSelection(n, n2 - n);
    }
}
