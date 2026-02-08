package com.aheaditec.talsec_security.security;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleEventObserver;

public class LifecycleObserver implements LifecycleEventObserver
{
    public final LifecycleObserver.LifecycleObserver$b a;
    
    public LifecycleObserver(final LifecycleObserver.LifecycleObserver$b a) {
        this.a = a;
    }
    
    public void onStateChanged(final LifecycleOwner lifecycleOwner, final Lifecycle$Event lifecycle$Event) {
        final int n = LifecycleObserver$a.a[((Enum)lifecycle$Event).ordinal()];
        if (n != 1) {
            if (n == 2) {
                this.a.a();
            }
        }
        else {
            this.a.b();
        }
    }
}
