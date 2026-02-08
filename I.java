package com.unity3d.player;

final class i implements Runnable
{
    private IAssetPackManagerMobileDataConfirmationCallback a;
    private boolean b;
    
    i(final IAssetPackManagerMobileDataConfirmationCallback a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void run() {
        this.a.onMobileDataConfirmationResult(this.b);
    }
}
