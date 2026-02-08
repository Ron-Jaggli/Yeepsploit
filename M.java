package com.unity3d.player;

import java.util.Iterator;
import java.util.Map;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.OnCompleteListener;

final class m implements OnCompleteListener
{
    private IAssetPackManagerStatusQueryCallback a;
    private UnityPlayer b;
    private String[] c;
    
    public m(final UnityPlayer b, final IAssetPackManagerStatusQueryCallback a, final String[] c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void onComplete(final Task task) {
        if (this.a == null) {
            return;
        }
        int n = 0;
        try {
            final AssetPackStates assetPackStates = (AssetPackStates)task.getResult();
            final Map packStates = assetPackStates.packStates();
            final int size = packStates.size();
            final String[] array = new String[size];
            final int[] array2 = new int[size];
            final int[] array3 = new int[size];
            for (final AssetPackState assetPackState : packStates.values()) {
                array[n] = assetPackState.name();
                array2[n] = assetPackState.status();
                array3[n] = assetPackState.errorCode();
                ++n;
            }
            this.b.invokeOnMainThread((Runnable)new l(this.a, assetPackStates.totalBytes(), array, array2, array3));
        }
        catch (final RuntimeExecutionException cause) {
            final String message = cause.getMessage();
            final String[] c = this.c;
            final int length = c.length;
            int n2 = 0;
            while (true) {
                final int n3 = -100;
                if (n2 >= length) {
                    final String[] c2 = this.c;
                    final int[] array4 = new int[c2.length];
                    final int[] array5 = new int[c2.length];
                    int n4 = 0;
                    String[] c3 = null;
                Label_0304:
                    while (true) {
                        c3 = this.c;
                        if (n4 < c3.length) {
                            array4[n4] = 0;
                            Throwable cause2 = cause;
                            while (true) {
                                while (!(cause2 instanceof AssetPackException)) {
                                    if ((cause2 = cause2.getCause()) == null) {
                                        final int errorCode = -100;
                                        array5[n4] = errorCode;
                                        ++n4;
                                        continue Label_0304;
                                    }
                                }
                                final int errorCode = ((AssetPackException)cause2).getErrorCode();
                                continue;
                            }
                        }
                        break;
                    }
                    this.b.invokeOnMainThread((Runnable)new l(this.a, 0L, c3, array4, array5));
                    return;
                }
                final String s = c[n2];
                if (message.contains((CharSequence)s)) {
                    final UnityPlayer b = this.b;
                    final IAssetPackManagerStatusQueryCallback a = this.a;
                    while (true) {
                        while (!(cause instanceof AssetPackException)) {
                            if ((cause = cause.getCause()) == null) {
                                final int errorCode2 = n3;
                                b.invokeOnMainThread((Runnable)new l(a, 0L, new String[] { s }, new int[] { 0 }, new int[] { errorCode2 }));
                                return;
                            }
                        }
                        final int errorCode2 = ((AssetPackException)cause).getErrorCode();
                        continue;
                    }
                }
                ++n2;
            }
        }
    }
}
