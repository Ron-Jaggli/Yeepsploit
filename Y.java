package com.unity3d.player;

import java.util.concurrent.RejectedExecutionException;
import android.os.Handler;
import java.util.concurrent.Executor;

final class y implements Executor
{
    private final Handler a;
    
    public y(final Handler a) {
        this.a = a;
    }
    
    public final void execute(final Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException((Object)this.a + " is shutting down");
    }
}
