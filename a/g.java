package com.unity3d.player.a;

import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

public final class g extends View
{
    final int a;
    final int b;
    int c;
    Bitmap d;
    Bitmap e;
    
    public g(final Context context, int n) {
        super(context);
        this.c = -16777216;
        this.a = n;
        n = this.getResources().getIdentifier("unity_static_splash", "drawable", this.getContext().getPackageName());
        this.b = n;
        if (n != 0) {
            this.forceLayout();
        }
        n = this.getResources().getIdentifier("staticSplashScreenBackgroundColor", "color", this.getContext().getPackageName());
        if (n != 0) {
            this.c = this.getResources().getColor(n, this.getContext().getTheme());
        }
        this.setBackgroundColor(this.c);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Bitmap d = this.d;
        if (d != null) {
            d.recycle();
            this.d = null;
        }
        final Bitmap e = this.e;
        if (e != null) {
            e.recycle();
            this.e = null;
        }
    }
    
    public final void onLayout(final boolean b, int n, int width, int height, int width2) {
        if (this.b == 0) {
            return;
        }
        if (this.d == null) {
            final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
            bitmapFactory$Options.inScaled = false;
            this.d = BitmapFactory.decodeResource(this.getResources(), this.b, bitmapFactory$Options);
        }
        width2 = this.d.getWidth();
        height = this.d.getHeight();
        width = this.getWidth();
        final int height2 = this.getHeight();
        if (width != 0) {
            if (height2 != 0) {
                final float n2 = width2 / (float)height;
                final float n3 = (float)width;
                final float n4 = (float)height2;
                if (n3 / n4 <= n2) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final int a = com.unity3d.player.a.a.a(this.a);
                Label_0238: {
                    if (a != 0) {
                        if (a != 1 && a != 2) {
                            n = width2;
                            width = height;
                            break Label_0238;
                        }
                        if (this.a == 3) {
                            height = 1;
                        }
                        else {
                            height = 0;
                        }
                        if ((height ^ n) != 0x0) {
                            height = (int)(n3 / n2);
                            n = width;
                            width = height;
                            break Label_0238;
                        }
                    }
                    else {
                        if (width < (n = width2)) {
                            height = (int)(n3 / n2);
                            n = width;
                        }
                        if (height2 >= (width = height)) {
                            break Label_0238;
                        }
                    }
                    n = (int)(n4 * n2);
                    width = height2;
                }
                final Bitmap e = this.e;
                if (e != null) {
                    if (e.getWidth() == n && this.e.getHeight() == width) {
                        return;
                    }
                    final Bitmap e2 = this.e;
                    if (e2 != this.d) {
                        e2.recycle();
                        this.e = null;
                    }
                }
                (this.e = Bitmap.createScaledBitmap(this.d, n, width, true)).setDensity(this.getResources().getDisplayMetrics().densityDpi);
                final ColorDrawable colorDrawable = new ColorDrawable(this.c);
                final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.getResources(), this.e);
                bitmapDrawable.setGravity(17);
                this.setBackground((Drawable)new LayerDrawable(new Drawable[] { (Drawable)colorDrawable, (Drawable)bitmapDrawable }));
            }
        }
    }
}
