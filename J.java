package com.unity3d.player;

import com.google.android.gms.tasks.OnSuccessListener;

final class j implements OnSuccessListener
{
    private IAssetPackManagerMobileDataConfirmationCallback a;
    private UnityPlayer b;
    
    public j(final UnityPlayer b, final IAssetPackManagerMobileDataConfirmationCallback a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onSuccess(final Object o) {
        final Integer n = (Integer)o;
        final IAssetPackManagerMobileDataConfirmationCallback a = this.a;
        if (a != null) {
            this.b.invokeOnMainThread((Runnable)new i(a, n == -1));
        }
    }
}
