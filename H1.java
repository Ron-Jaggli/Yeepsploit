package com.unity3d.player;

import android.widget.EditText;

final class h1 implements Runnable
{
    final int a;
    final int b;
    final UnityPlayerForActivityOrService c;
    
    h1(final UnityPlayerForActivityOrService c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        final W -$$Nest$fgetmSoftInput = UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.c);
        if (-$$Nest$fgetmSoftInput != null) {
            final int a = this.a;
            final int b = this.b;
            final EditText c = -$$Nest$fgetmSoftInput.c;
            if (c != null) {
                final int length = ((CharSequence)c.getText()).length();
                final int n = b + a;
                if (length >= n) {
                    -$$Nest$fgetmSoftInput.c.setSelection(a, n);
                }
            }
        }
    }
}
