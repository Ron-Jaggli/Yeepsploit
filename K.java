package com.unity3d.player;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.play.core.assetpacks.AssetPackException;
import java.util.List;
import java.util.Collection;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.Collections;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Vector;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;

final class k implements OnCompleteListener
{
    private IAssetPackManagerDownloadStatusCallback a;
    private UnityPlayer b;
    private String[] c;
    
    public k(final UnityPlayer b, final IAssetPackManagerDownloadStatusCallback a, final String[] c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void onComplete(final Task task) {
        try {
            final AssetPackStates assetPackStates = (AssetPackStates)task.getResult();
            final Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            final Vector vector = new Vector();
            for (final AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() == 0 && assetPackState.status() != 4 && assetPackState.status() != 5 && assetPackState.status() != 0) {
                    vector.add((Object)assetPackState.name());
                }
                else {
                    final String name = assetPackState.name();
                    final int status = assetPackState.status();
                    final int errorCode = assetPackState.errorCode();
                    final long totalBytes = assetPackStates.totalBytes();
                    long n;
                    if (status == 4) {
                        n = totalBytes;
                    }
                    else {
                        n = 0L;
                    }
                    this.b.invokeOnMainThread((Runnable)new g(Collections.singleton((Object)this.a), name, status, totalBytes, n, 0, errorCode));
                }
            }
            if (vector.size() > 0) {
                final n -$$Nest$sfgete = n.-$$Nest$sfgete();
                final UnityPlayer b = this.b;
                final IAssetPackManagerDownloadStatusCallback a = this.a;
                -$$Nest$sfgete.getClass();
                final n -$$Nest$sfgete2 = n.-$$Nest$sfgete();
                synchronized (-$$Nest$sfgete2) {
                    final Object -$$Nest$fgetd = n.-$$Nest$fgetd(-$$Nest$sfgete);
                    if (-$$Nest$fgetd == null) {
                        final h h = new h(-$$Nest$sfgete, b, a);
                        n.-$$Nest$fgetb(-$$Nest$sfgete).registerListener((AssetPackStateUpdateListener)h);
                        n.-$$Nest$fputd(-$$Nest$sfgete, (Object)h);
                    }
                    else {
                        ((h)-$$Nest$fgetd).a(a);
                    }
                    ((AbstractCollection)n.-$$Nest$fgetc(-$$Nest$sfgete)).addAll((Collection)vector);
                    n.-$$Nest$fgetb(-$$Nest$sfgete).fetch((List)vector);
                }
            }
        }
        catch (final RuntimeExecutionException cause) {
            final String[] c = this.c;
            if (c.length == 1) {
                final String s = c[0];
                while (true) {
                    while (!(cause instanceof AssetPackException)) {
                        if ((cause = cause.getCause()) == null) {
                            final int errorCode2 = -100;
                            this.b.invokeOnMainThread((Runnable)new g(Collections.singleton((Object)this.a), s, 0, 0L, 0L, 0, errorCode2));
                            return;
                        }
                    }
                    final int errorCode2 = ((AssetPackException)cause).getErrorCode();
                    continue;
                }
            }
            final n -$$Nest$sfgete3 = n.-$$Nest$sfgete();
            final IAssetPackManagerDownloadStatusCallback a2 = this.a;
            -$$Nest$sfgete3.getClass();
            for (final String s2 : c) {
                n.-$$Nest$fgetb(-$$Nest$sfgete3).getPackStates(Collections.singletonList((Object)s2)).addOnCompleteListener((OnCompleteListener)new k(n.-$$Nest$fgeta(-$$Nest$sfgete3), a2, new String[] { s2 }));
            }
        }
    }
}
