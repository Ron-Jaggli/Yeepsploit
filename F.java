package com.unity3d.player;

import android.view.View;
import android.view.View$MeasureSpec;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.SurfaceView;

final class f extends SurfaceView
{
    private float a;
    private UnityPlayer b;
    
    public f(final UnityPlayer b) {
        super(b.getContext());
        this.b = b;
    }
    
    public final void a(final float a) {
        this.a = a;
        final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
        int n;
        if (a <= 0.0f) {
            n = -1;
        }
        else {
            n = -2;
        }
        layoutParams.width = n;
        layoutParams.height = n;
        ((View)this).setLayoutParams(layoutParams);
    }
    
    public final boolean a() {
        return this.a > 0.0f;
    }
    
    public final boolean onCapturedPointerEvent(final MotionEvent motionEvent) {
        return this.b.injectEvent((InputEvent)motionEvent);
    }
    
    public final boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        return this.a() && this.b.injectEvent((InputEvent)motionEvent);
    }
    
    protected void onMeasure(int n, int n2) {
        if (this.a <= 0.0f) {
            super.onMeasure(n, n2);
            return;
        }
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        if (size > 0 && size2 > 0 && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE && View$MeasureSpec.getMode(n2) == Integer.MIN_VALUE) {
            final float n3 = (float)size;
            final float n4 = (float)size2;
            final float n5 = n3 / n4;
            final float a = this.a;
            if (n5 < a) {
                n = (int)(n3 / a);
                n2 = size;
            }
            else {
                n2 = (int)(n4 * a);
                n = size2;
            }
            ((View)this).setMeasuredDimension(n2, n);
            return;
        }
        super.onMeasure(n, n2);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.a() && this.b.injectEvent((InputEvent)motionEvent);
    }
}
