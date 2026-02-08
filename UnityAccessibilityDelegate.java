package com.unity3d.player;

import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Objects;
import android.content.res.Configuration;
import java.util.concurrent.Semaphore;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.AccessibilityManager;
import android.view.SurfaceView;
import android.view.View$AccessibilityDelegate;

class UnityAccessibilityDelegate extends View$AccessibilityDelegate
{
    private final UnityPlayer a;
    private final SurfaceView b;
    private AccessibilityManager c;
    private u0 d;
    private CaptioningManager e;
    private w0 f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private AccessibilityNodeProvider k;
    
    UnityAccessibilityDelegate(final UnityPlayer a) {
        this.g = -1;
        this.h = -1;
        this.i = false;
        this.j = 1.0f;
        this.k = (AccessibilityNodeProvider)new s0(this);
        this.a = a;
        this.b = a.getSurfaceView();
    }
    
    private static native int[] getRootNodeIds();
    
    private static native int hitTest(final float p0, final float p1);
    
    protected static UnityAccessibilityDelegate init(UnityPlayer accessibilityDelegate) {
        accessibilityDelegate = (UnityPlayer)new UnityAccessibilityDelegate(accessibilityDelegate);
        ((UnityAccessibilityDelegate)accessibilityDelegate).c = (AccessibilityManager)((UnityAccessibilityDelegate)accessibilityDelegate).a.getContext().getSystemService("accessibility");
        final CaptioningManager e = (CaptioningManager)((UnityAccessibilityDelegate)accessibilityDelegate).a.getContext().getSystemService("captioning");
        ((UnityAccessibilityDelegate)accessibilityDelegate).e = e;
        while (true) {
            if (((UnityAccessibilityDelegate)accessibilityDelegate).c == null && e == null) {
                break Label_0089;
            }
            final Semaphore semaphore = new Semaphore(0);
            ((UnityAccessibilityDelegate)accessibilityDelegate).a.runOnUiThread((Runnable)new k0((UnityAccessibilityDelegate)accessibilityDelegate, semaphore));
            try {
                semaphore.acquire();
                ((UnityAccessibilityDelegate)accessibilityDelegate).j = ((UnityAccessibilityDelegate)accessibilityDelegate).a.getContext().getResources().getConfiguration().fontScale;
                ((UnityAccessibilityDelegate)accessibilityDelegate).a.setAccessibilityDelegate((UnityAccessibilityDelegate)accessibilityDelegate);
                return (UnityAccessibilityDelegate)accessibilityDelegate;
            }
            catch (final InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    
    private static native boolean isNodeDismissable(final int p0);
    
    private static native boolean isNodeSelectable(final int p0);
    
    private static native void onNodeDecremented(final int p0);
    
    private static native boolean onNodeDismissed(final int p0);
    
    private static native void onNodeFocusChanged(final int p0, final boolean p1);
    
    private static native void onNodeIncremented(final int p0);
    
    private static native boolean onNodeSelected(final int p0);
    
    private static native boolean populateNodeInfo(final AccessibilityNodeInfo p0, final int p1, final View p2);
    
    private static native void sendClosedCaptioningChangedNotification(final boolean p0);
    
    private static native void sendFontScaleChangedNotification(final float p0);
    
    private static native void sendScreenReaderStatusChangedNotification(final boolean p0);
    
    public final void a(final Configuration configuration) {
        final float fontScale = configuration.fontScale;
        if (fontScale != this.j) {
            this.j = fontScale;
            final UnityPlayer a = this.a;
            Objects.requireNonNull((Object)a);
            this.a.invokeOnMainThread((Runnable)new l0(a, configuration));
        }
    }
    
    protected void cleanup() {
        final u0 d = this.d;
        if (d != null) {
            d.cleanup();
        }
        final w0 f = this.f;
        if (f != null) {
            f.cleanup();
        }
        this.a.setAccessibilityDelegate(null);
    }
    
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
        return this.k;
    }
    
    protected int getFocusedNodeId() {
        return this.g;
    }
    
    protected boolean sendAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent == null) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)((View)this.b).getParent();
        return viewGroup != null && viewGroup.requestSendAccessibilityEvent((View)this.b, accessibilityEvent);
    }
    
    protected boolean sendAnnouncementForVirtualViewId(final int n, final String s) {
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.setEnabled(true);
        obtain.setSource((View)this.b, n);
        obtain.getText().add((Object)s);
        return this.sendAccessibilityEvent(obtain);
    }
    
    protected boolean sendEventForVirtualViewId(final int g, final int n) {
        if (!this.c.isEnabled()) {
            return false;
        }
        final AccessibilityEvent obtain = AccessibilityEvent.obtain(n);
        obtain.setEnabled(true);
        obtain.setSource((View)this.b, g);
        if (n == 2048) {
            obtain.setContentChangeTypes(1);
        }
        if (n == 32768) {
            if (this.g == g) {
                return false;
            }
            this.g = g;
            ((View)this.b).invalidate();
            final UnityPlayer a = this.a;
            Objects.requireNonNull((Object)a);
            this.a.invokeOnMainThread((Runnable)new n0(a, g));
        }
        if (n == 65536) {
            if (this.g == g) {
                this.g = -1;
            }
            ((View)this.b).invalidate();
            final UnityPlayer a2 = this.a;
            Objects.requireNonNull((Object)a2);
            this.a.invokeOnMainThread((Runnable)new o0(a2, g));
        }
        return this.sendAccessibilityEvent(obtain);
    }
    
    protected boolean sendEventForVirtualViewIdFromNative(final int n, final int n2) {
        this.a.runOnUiThread((Runnable)new m0(this, n, n2));
        return true;
    }
}
