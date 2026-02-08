package com.unity3d.player;

class UnityCoreAssetPacksStatusCallbacks implements IAssetPackManagerDownloadStatusCallback, IAssetPackManagerStatusQueryCallback
{
    public UnityCoreAssetPacksStatusCallbacks() {
    }
    
    private final native void nativeStatusQueryResult(final String p0, final int p1, final int p2);
    
    @Override
    public void onStatusResult(final long n, final String[] array, final int[] array2, final int[] array3) {
        for (int i = 0; i < array2.length; ++i) {
            this.nativeStatusQueryResult(array[i], array2[i], array3[i]);
        }
    }
    
    @Override
    public void onStatusUpdate(final String s, final int n, final long n2, final long n3, final int n4, final int n5) {
        this.nativeStatusQueryResult(s, n, n5);
    }
}
