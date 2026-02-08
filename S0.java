package com.unity3d.player;

import java.util.Objects;
import android.os.Bundle;
import android.view.ViewParent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class s0 extends AccessibilityNodeProvider
{
    final UnityAccessibilityDelegate a;
    
    s0(final UnityAccessibilityDelegate a) {
        this.a = a;
    }
    
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        if (i == -1) {
            final AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain((View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a));
            final ViewParent parent = ((View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a)).getParent();
            if (parent instanceof View) {
                obtain.setParent((View)parent);
            }
            final int[] -$$Nest$smgetRootNodeIds = UnityAccessibilityDelegate.-$$Nest$smgetRootNodeIds();
            if (-$$Nest$smgetRootNodeIds != null) {
                int length;
                for (length = -$$Nest$smgetRootNodeIds.length, i = 0; i < length; ++i) {
                    obtain.addChild((View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a), -$$Nest$smgetRootNodeIds[i]);
                }
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2;
        if (!UnityAccessibilityDelegate.-$$Nest$smpopulateNodeInfo(obtain2 = AccessibilityNodeInfo.obtain(), i, (View)UnityAccessibilityDelegate.-$$Nest$fgetb(this.a))) {
            obtain2 = null;
        }
        return obtain2;
    }
    
    public final boolean performAction(final int n, int n2, final Bundle bundle) {
        UnityAccessibilityDelegate unityAccessibilityDelegate;
        if (n2 == 64) {
            unityAccessibilityDelegate = this.a;
            n2 = 32768;
        }
        else if (n2 == 128) {
            unityAccessibilityDelegate = this.a;
            n2 = 65536;
        }
        else if (n2 == 16) {
            if (!UnityAccessibilityDelegate.-$$Nest$smisNodeSelectable(n)) {
                return false;
            }
            final UnityPlayer -$$Nest$fgeta = UnityAccessibilityDelegate.-$$Nest$fgeta(this.a);
            Objects.requireNonNull((Object)-$$Nest$fgeta);
            UnityAccessibilityDelegate.-$$Nest$fgeta(this.a).invokeOnMainThread((Runnable)new p0(this, -$$Nest$fgeta, n));
            return true;
        }
        else {
            if (n2 == 4096 || n2 == 8192) {
                final UnityPlayer -$$Nest$fgeta2 = UnityAccessibilityDelegate.-$$Nest$fgeta(this.a);
                Objects.requireNonNull((Object)-$$Nest$fgeta2);
                UnityAccessibilityDelegate.-$$Nest$fgeta(this.a).invokeOnMainThread((Runnable)new q0(this, -$$Nest$fgeta2, n2, n));
                return true;
            }
            if (n2 != 1048576) {
                return false;
            }
            if (!UnityAccessibilityDelegate.-$$Nest$smisNodeDismissable(n)) {
                return false;
            }
            final UnityPlayer -$$Nest$fgeta3 = UnityAccessibilityDelegate.-$$Nest$fgeta(this.a);
            Objects.requireNonNull((Object)-$$Nest$fgeta3);
            UnityAccessibilityDelegate.-$$Nest$fgeta(this.a).invokeOnMainThread((Runnable)new r0(-$$Nest$fgeta3, n));
            return true;
        }
        return unityAccessibilityDelegate.sendEventForVirtualViewId(n, n2);
    }
}
