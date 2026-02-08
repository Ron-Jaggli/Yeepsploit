package com.unity3d.player;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnHoverListener;

public final class x0 implements View$OnHoverListener
{
    final UnityAccessibilityDelegate a;
    
    protected x0(final UnityAccessibilityDelegate a) {
        this.a = a;
    }
    
    public final boolean onHover(final View view, final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                Log.i("a11y", "hover unknown" + motionEvent.toString());
            }
            else {
                final UnityAccessibilityDelegate a = this.a;
                final int -$$Nest$fgeth = UnityAccessibilityDelegate.-$$Nest$fgeth(a);
                if (-$$Nest$fgeth != -1) {
                    UnityAccessibilityDelegate.-$$Nest$fputh(a, -1);
                    if (-$$Nest$fgeth != -1) {
                        a.sendEventForVirtualViewId(-$$Nest$fgeth, 256);
                    }
                }
            }
        }
        else {
            final int -$$Nest$smhitTest = UnityAccessibilityDelegate.-$$Nest$smhitTest(motionEvent.getX(), motionEvent.getY());
            final UnityAccessibilityDelegate a2 = this.a;
            final int -$$Nest$fgeth2 = UnityAccessibilityDelegate.-$$Nest$fgeth(a2);
            if (-$$Nest$fgeth2 != -$$Nest$smhitTest) {
                UnityAccessibilityDelegate.-$$Nest$fputh(a2, -$$Nest$smhitTest);
                if (-$$Nest$smhitTest != -1) {
                    a2.sendEventForVirtualViewId(-$$Nest$smhitTest, 128);
                }
                if (-$$Nest$fgeth2 != -1) {
                    a2.sendEventForVirtualViewId(-$$Nest$fgeth2, 256);
                }
            }
        }
        return true;
    }
}
