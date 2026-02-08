package com.unity3d.player;

import android.app.Activity;
import java.util.List;
import android.content.Context;

class PlayAssetDeliveryUnityWrapper
{
    private static PlayAssetDeliveryUnityWrapper b;
    private n a;
    
    private PlayAssetDeliveryUnityWrapper(final UnityPlayer unityPlayer, final Context context) {
        this.a = null;
        Label_0065: {
            if (PlayAssetDeliveryUnityWrapper.b != null) {
                break Label_0065;
            }
            try {
                if (this.getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", List.class).getReturnType().getName().equals((Object)"com.google.android.gms.tasks.Task")) {
                    this.a = a(unityPlayer, context);
                }
                return;
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
            }
            catch (final ClassNotFoundException | NoSuchMethodException | SecurityException ex) {}
        }
    }
    
    private static n a(final UnityPlayer unityPlayer, final Context context) {
        return n.a(unityPlayer, context);
    }
    
    private void a() {
        if (!this.playCoreApiMissing()) {
            return;
        }
        throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
    }
    
    public static PlayAssetDeliveryUnityWrapper getInstance() {
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            PlayAssetDeliveryUnityWrapper b;
            while (true) {
                b = PlayAssetDeliveryUnityWrapper.b;
                if (b != null) {
                    break;
                }
                try {
                    PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                }
                catch (final InterruptedException ex) {
                    D.Log(6, ((Throwable)ex).getMessage());
                }
            }
            if (b != null) {
                return b;
            }
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper is not yet initialised.");
        }
    }
    
    public static PlayAssetDeliveryUnityWrapper init(final UnityPlayer unityPlayer, final Context context) {
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            if (PlayAssetDeliveryUnityWrapper.b == null) {
                PlayAssetDeliveryUnityWrapper.b = new PlayAssetDeliveryUnityWrapper(unityPlayer, context);
                PlayAssetDeliveryUnityWrapper.class.notifyAll();
                return PlayAssetDeliveryUnityWrapper.b;
            }
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
        }
    }
    
    public void cancelAssetPackDownload(final String s) {
        this.cancelAssetPackDownloads(new String[] { s });
    }
    
    public void cancelAssetPackDownloads(final String[] array) {
        this.a();
        this.a.a(array);
    }
    
    public void downloadAssetPack(final String s, final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        this.downloadAssetPacks(new String[] { s }, assetPackManagerDownloadStatusCallback);
    }
    
    public void downloadAssetPacks(final String[] array, final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        this.a();
        this.a.a(array, assetPackManagerDownloadStatusCallback);
    }
    
    public String getAssetPackPath(final String s) {
        this.a();
        return this.a.a(s);
    }
    
    public void getAssetPackState(final String s, final IAssetPackManagerStatusQueryCallback assetPackManagerStatusQueryCallback) {
        this.getAssetPackStates(new String[] { s }, assetPackManagerStatusQueryCallback);
    }
    
    public void getAssetPackStates(final String[] array, final IAssetPackManagerStatusQueryCallback assetPackManagerStatusQueryCallback) {
        this.a();
        this.a.a(array, assetPackManagerStatusQueryCallback);
    }
    
    public boolean playCoreApiMissing() {
        return this.a == null;
    }
    
    public Object registerDownloadStatusListener(final IAssetPackManagerDownloadStatusCallback assetPackManagerDownloadStatusCallback) {
        this.a();
        return this.a.a(assetPackManagerDownloadStatusCallback);
    }
    
    public void removeAssetPack(final String s) {
        this.a();
        this.a.b(s);
    }
    
    public void requestToUseMobileData(final Activity activity, final IAssetPackManagerMobileDataConfirmationCallback assetPackManagerMobileDataConfirmationCallback) {
        this.a();
        this.a.a(activity, assetPackManagerMobileDataConfirmationCallback);
    }
    
    public void unregisterDownloadStatusListener(final Object o) {
        this.a();
        this.a.a(o);
    }
}
