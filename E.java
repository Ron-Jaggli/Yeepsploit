package com.unity3d.player;

import android.window.OnBackInvokedCallback;
import android.app.Dialog;
import android.app.Activity;
import android.window.OnBackInvokedDispatcher;

abstract class e
{
    public static OnBackInvokedDispatcher a(final Object o) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (o instanceof Activity) {
            onBackInvokedDispatcher = ((Activity)o).getOnBackInvokedDispatcher();
        }
        else {
            if (!(o instanceof Dialog)) {
                throw new IllegalArgumentException("Unsupported context type when getting '" + o.getClass().getName() + "' OnBackInvokedDispatcher");
            }
            onBackInvokedDispatcher = ((Dialog)o).getOnBackInvokedDispatcher();
        }
        return onBackInvokedDispatcher;
    }
    
    public static void a(final OnBackInvokedDispatcher onBackInvokedDispatcher, final int n, final OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(n, onBackInvokedCallback);
    }
    
    public static void a(final OnBackInvokedDispatcher onBackInvokedDispatcher, final OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }
}
