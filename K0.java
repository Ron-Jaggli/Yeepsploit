package com.unity3d.player;

import java.util.concurrent.Semaphore;

final class k0 implements Runnable
{
    final Semaphore a;
    final UnityAccessibilityDelegate b;
    
    k0(final UnityAccessibilityDelegate b, final Semaphore a) {
        this.b = b;
        this.a = a;
    }
    
    public final void run() {
        try {
            final UnityAccessibilityDelegate b = this.b;
            if (UnityAccessibilityDelegate.-$$Nest$fgetc(b) != null) {
                UnityAccessibilityDelegate.-$$Nest$fputd(b, new u0(b));
            }
            final UnityAccessibilityDelegate b2 = this.b;
            if (UnityAccessibilityDelegate.-$$Nest$fgete(b2) != null) {
                UnityAccessibilityDelegate.-$$Nest$fputf(b2, new w0(this.b));
            }
        }
        finally {
            this.a.release();
        }
    }
}
