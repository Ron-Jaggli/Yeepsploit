package com.unity3d.player;

import android.widget.TextView;
import android.widget.EditText;

final class e1 implements Runnable
{
    final String a;
    final UnityPlayerForActivityOrService b;
    
    e1(final UnityPlayerForActivityOrService b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        final W -$$Nest$fgetmSoftInput = UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.b);
        if (-$$Nest$fgetmSoftInput != null) {
            final String a = this.a;
            if (a != null) {
                final EditText c = -$$Nest$fgetmSoftInput.c;
                if (c != null) {
                    ((TextView)c).setText((CharSequence)a);
                    -$$Nest$fgetmSoftInput.c.setSelection(a.length());
                }
            }
        }
    }
}
