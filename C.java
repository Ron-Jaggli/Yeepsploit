package com.unity3d.player;

import android.view.View$OnKeyListener;
import android.view.View$OnTouchListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ProgressBar;

abstract class c
{
    private static final int[] a;
    private static ProgressBar b;
    private static View c;
    private static int d = -1;
    
    static {
        a = new int[] { 16842874, 16843401, 16842873, 16843400 };
    }
    
    public static void a() {
        final ProgressBar b = com.unity3d.player.c.b;
        if (b != null) {
            if (b != null && com.unity3d.player.c.c != null) {
                final ViewGroup viewGroup = (ViewGroup)((View)b).getParent();
                if (viewGroup != null) {
                    viewGroup.removeView((View)com.unity3d.player.c.b);
                    viewGroup.removeView(com.unity3d.player.c.c);
                }
                com.unity3d.player.c.b = null;
                com.unity3d.player.c.c = null;
            }
            com.unity3d.player.c.d = -1;
        }
    }
    
    public static void a(final Activity activity, final FrameLayout frameLayout, final int d) {
        if (d >= 0) {
            final int[] a = com.unity3d.player.c.a;
            if (d < 4) {
                if (frameLayout != null) {
                    if (activity != null && !activity.isFinishing()) {
                        if (!activity.isDestroyed()) {
                            if (com.unity3d.player.c.b != null) {
                                if (com.unity3d.player.c.d == d) {
                                    return;
                                }
                                a();
                            }
                            com.unity3d.player.c.d = d;
                            final ProgressBar b = new ProgressBar((Context)activity, (AttributeSet)null, a[d]);
                            final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                            layoutParams.gravity = 17;
                            ((View)b).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            b.setBackground((Drawable)new ColorDrawable(0));
                            b.setIndeterminate(true);
                            com.unity3d.player.c.b = b;
                            final View c = new View((Context)activity);
                            c.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
                            c.setBackgroundColor(0);
                            c.setFocusableInTouchMode(true);
                            c.requestFocus();
                            c.setOnTouchListener((View$OnTouchListener)new a());
                            c.setOnKeyListener((View$OnKeyListener)new b());
                            ((ViewGroup)frameLayout).addView(com.unity3d.player.c.c = c);
                            ((ViewGroup)frameLayout).addView((View)com.unity3d.player.c.b);
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("ViewGroup cannot be null.");
            }
        }
    }
}
