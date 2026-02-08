package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import java.util.Arrays;
import com.google.android.gms.tasks.OnSuccessListener;
import android.app.Activity;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import android.content.Context;
import java.util.HashSet;
import com.google.android.play.core.assetpacks.AssetPackManager;

final class n
{
    private static n e;
    private UnityPlayer a;
    private AssetPackManager b;
    private HashSet c;
    private Object d;
    
    private n(final UnityPlayer a, final Context context) {
        if (n.e == null) {
            this.a = a;
            this.b = AssetPackManagerFactory.getInstance(context);
            this.c = new HashSet();
            return;
        }
        throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
    }
    
    public static n a(final UnityPlayer unityPlayer, final Context context) {
        if (n.e == null) {
            n.e = new n(unityPlayer, context);
        }
        return n.e;
    }
    
    public final Object a(final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        final h h = new h(this, this.a, assetPackManagerDownloadStatusCallback);
        this.b.registerListener((AssetPackStateUpdateListener)h);
        return h;
    }
    
    public final String a(final String s) {
        final AssetPackLocation packLocation = this.b.getPackLocation(s);
        if (packLocation == null) {
            return "";
        }
        return packLocation.assetsPath();
    }
    
    public final void a(final Activity activity, final IAssetPackManagerMobileDataConfirmationCallback assetPackManagerMobileDataConfirmationCallback) {
        this.b.showCellularDataConfirmation(activity).addOnSuccessListener((OnSuccessListener)new j(this.a, assetPackManagerMobileDataConfirmationCallback));
    }
    
    public final void a(final Object o) {
        if (!(o instanceof h)) {
            return;
        }
        this.b.unregisterListener((AssetPackStateUpdateListener)o);
    }
    
    public final void a(final String[] array) {
        this.b.cancel(Arrays.asList((Object[])array));
    }
    
    public final void a(final String[] array, final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        if (array != null) {
            if (array.length != 0) {
                this.b.getPackStates(Arrays.asList((Object[])array)).addOnCompleteListener((OnCompleteListener)new k(this.a, assetPackManagerDownloadStatusCallback, array));
            }
        }
    }
    
    public final void a(final String[] array, final IAssetPackManagerStatusQueryCallback assetPackManagerStatusQueryCallback) {
        this.b.getPackStates(Arrays.asList((Object[])array)).addOnCompleteListener((OnCompleteListener)new m(this.a, assetPackManagerStatusQueryCallback, array));
    }
    
    public final void b(final String s) {
        this.b.removePack(s);
    }
}
