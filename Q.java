package com.unity3d.player;

import android.provider.Settings$System;
import android.os.Handler;
import android.os.Looper;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.content.Context;

final class q
{
    private final Context a;
    private final AudioManager b;
    private o c;
    
    public q(final Context a) {
        this.a = a;
        this.b = (AudioManager)a.getSystemService("audio");
    }
    
    public final void a() {
        if (this.c != null) {
            this.a.getContentResolver().unregisterContentObserver((ContentObserver)this.c);
            this.c = null;
        }
    }
    
    public final void a(final p p) {
        this.c = new o(new Handler(Looper.getMainLooper()), this.b, p);
        this.a.getContentResolver().registerContentObserver(Settings$System.CONTENT_URI, true, (ContentObserver)this.c);
    }
}
