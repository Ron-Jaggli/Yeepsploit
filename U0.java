package com.unity3d.player;

import android.view.View;
import java.util.Objects;
import android.view.View$OnHoverListener;
import android.view.View$AccessibilityDelegate;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener;

final class u0 implements AccessibilityManager$AccessibilityStateChangeListener, AccessibilityManager$TouchExplorationStateChangeListener
{
    final UnityAccessibilityDelegate a;
    
    u0(final UnityAccessibilityDelegate a) {
        this.a = a;
        UnityAccessibilityDelegate.-$$Nest$fgetc(a).addAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)this);
        UnityAccessibilityDelegate.-$$Nest$fgetc(a).addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)this);
        if (UnityAccessibilityDelegate.-$$Nest$fgetc(a).isEnabled()) {
            this.onAccessibilityStateChanged(true);
        }
    }
    
    protected void cleanup() {
        UnityAccessibilityDelegate.-$$Nest$fgetc(this.a).removeAccessibilityStateChangeListener((AccessibilityManager$AccessibilityStateChangeListener)this);
        UnityAccessibilityDelegate.-$$Nest$fgetc(this.a).removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)this);
    }
    
    public final void onAccessibilityStateChanged(final boolean b) {
        if (b) {
            final UnityAccessibilityDelegate a = this.a;
            ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(a)).setAccessibilityDelegate((View$AccessibilityDelegate)a);
            ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a)).setWillNotDraw(false);
            this.onTouchExplorationStateChanged(UnityAccessibilityDelegate.-$$Nest$fgetc(this.a).isTouchExplorationEnabled());
        }
        else {
            ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a)).setAccessibilityDelegate((View$AccessibilityDelegate)null);
            ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a)).setWillNotDraw(true);
            this.onTouchExplorationStateChanged(false);
        }
    }
    
    public final void onTouchExplorationStateChanged(final boolean b) {
        final boolean b2 = UnityAccessibilityDelegate.-$$Nest$fgetc(this.a).isEnabled() && b;
        final UnityAccessibilityDelegate a = this.a;
        if (b2) {
            ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(a)).setOnHoverListener((View$OnHoverListener)new x0(a));
        }
        else {
            ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(a)).setOnHoverListener((View$OnHoverListener)null);
        }
        final UnityAccessibilityDelegate a2 = this.a;
        if (UnityAccessibilityDelegate.-$$Nest$fgeti(a2) == b2) {
            return;
        }
        UnityAccessibilityDelegate.-$$Nest$fputi(a2, b2);
        final UnityPlayer -$$Nest$fgeta = UnityAccessibilityDelegate.-$$Nest$fgeta(a2);
        Objects.requireNonNull((Object)-$$Nest$fgeta);
        UnityAccessibilityDelegate.-$$Nest$fgeta(this.a).invokeOnMainThread((Runnable)new t0(-$$Nest$fgeta, b2));
    }
}
