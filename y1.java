package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.a.a;
import java.util.concurrent.Semaphore;

final class y1 implements Runnable
{
    final UnityPlayerForActivityOrService a;
    final String b;
    final int c;
    final boolean d;
    final boolean e;
    final boolean f;
    final boolean g;
    final String h;
    final int i;
    final boolean j;
    final boolean k;
    final Semaphore l;
    final UnityPlayerForActivityOrService m;
    
    y1(final UnityPlayerForActivityOrService m, final UnityPlayerForActivityOrService a, final String b, final int c, final boolean d, final boolean e, final boolean f, final boolean g, final String h, final int i, final boolean j, final boolean k, final Semaphore l) {
        this.m = m;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final void run() {
        try {
            try {
                final UnityPlayerForActivityOrService m = this.m;
                if (UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(m) != null) {
                    UnityPlayerForActivityOrService.-$$Nest$mdismissSoftInput(m);
                }
                final UnityPlayerForActivityOrService i = this.m;
                final int a = SoftInputProvider.a();
                final Context mContext = ((UnityPlayer)this.m).mContext;
                final UnityPlayerForActivityOrService a2 = this.a;
                Object o;
                if (com.unity3d.player.a.a.a(a) != 2) {
                    o = new g0(mContext, a2);
                }
                else {
                    o = new b0(mContext, a2);
                }
                UnityPlayerForActivityOrService.-$$Nest$fputmSoftInput(i, (W)o);
                UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.m).a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                final W -$$Nest$fgetmSoftInput = UnityPlayerForActivityOrService.-$$Nest$fgetmSoftInput(this.m);
                -$$Nest$fgetmSoftInput.f = (J)new x1(this);
                -$$Nest$fgetmSoftInput.d();
                UnityPlayerForActivityOrService.-$$Nest$mnativeReportKeyboardConfigChanged(this.m);
            }
            finally {}
        }
        catch (final Exception ex) {
            D.Log(6, "Exception when opening Softinput " + (Object)ex);
        }
        this.l.release();
        return;
        this.l.release();
    }
}
