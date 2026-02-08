package com.unity3d.player;

import android.widget.TextView;
import android.widget.EditText;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;

final class f1 implements Runnable
{
    final int a;
    final UnityPlayerForActivityOrService b;
    
    f1(final UnityPlayerForActivityOrService b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        final W -$$Nest$fgetmSoftInput = UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.b);
        if (-$$Nest$fgetmSoftInput != null) {
            final int a = this.a;
            final EditText c = -$$Nest$fgetmSoftInput.c;
            if (c != null) {
                if (a > 0) {
                    ((TextView)c).setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(a) });
                }
                else {
                    ((TextView)c).setFilters(new InputFilter[0]);
                }
            }
        }
    }
}
