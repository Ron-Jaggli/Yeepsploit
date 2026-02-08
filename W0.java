package com.unity3d.player;

import java.util.Objects;
import android.view.accessibility.CaptioningManager$CaptioningChangeListener;

public final class w0 extends CaptioningManager$CaptioningChangeListener
{
    final UnityAccessibilityDelegate a;
    
    w0(final UnityAccessibilityDelegate a) {
        this.a = a;
        UnityAccessibilityDelegate.-$$Nest$fgete(a).addCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)this);
        this.onEnabledChanged(UnityAccessibilityDelegate.-$$Nest$fgete(a).isEnabled());
    }
    
    protected void cleanup() {
        UnityAccessibilityDelegate.-$$Nest$fgete(this.a).removeCaptioningChangeListener((CaptioningManager$CaptioningChangeListener)this);
    }
    
    public final void onEnabledChanged(final boolean b) {
        final UnityPlayer -$$Nest$fgeta = UnityAccessibilityDelegate.-$$Nest$fgeta(this.a);
        Objects.requireNonNull((Object)-$$Nest$fgeta);
        UnityAccessibilityDelegate.-$$Nest$fgeta(this.a).invokeOnMainThread((Runnable)new v0(-$$Nest$fgeta, b));
    }
}
