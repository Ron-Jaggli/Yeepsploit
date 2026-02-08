package com.unity3d.player;

import java.util.Set;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.HashSet;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;

final class h implements AssetPackStateUpdateListener
{
    private HashSet a;
    private UnityPlayer b;
    final n c;
    
    public h(final n c, final UnityPlayer b, final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        this.c = c;
        this.b = b;
        (this.a = new HashSet()).add((Object)assetPackManagerDownloadStatusCallback);
    }
    
    public final void a(final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        synchronized (this) {
            this.a.add((Object)assetPackManagerDownloadStatusCallback);
        }
    }
    
    public final void onStateUpdate(final Object o) {
        final AssetPackState assetPackState = (AssetPackState)o;
        synchronized (this) {
            Label_0097: {
                if (assetPackState.status() != 4 && assetPackState.status() != 5 && assetPackState.status() != 0) {
                    break Label_0097;
                }
                final n -$$Nest$sfgete = n.-$$Nest$sfgete();
                synchronized (-$$Nest$sfgete) {
                    n.-$$Nest$fgetc(this.c).remove((Object)assetPackState.name());
                    if (n.-$$Nest$fgetc(this.c).isEmpty()) {
                        final n c = this.c;
                        c.a(n.-$$Nest$fgetd(c));
                        n.-$$Nest$fputd(this.c, (Object)null);
                    }
                    monitorexit(-$$Nest$sfgete);
                    if (this.a.size() == 0) {
                        monitorexit(this);
                    }
                    else {
                        this.b.invokeOnMainThread((Runnable)new g((Set)this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
                    }
                }
            }
        }
    }
}
