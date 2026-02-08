package com.unity3d.player;

import android.net.Uri;
import android.os.Handler;
import android.media.AudioManager;
import android.database.ContentObserver;

final class o extends ContentObserver
{
    private final p a;
    private final AudioManager b;
    private final int c;
    private int d;
    
    public o(final Handler handler, final AudioManager b, final p a) {
        super(handler);
        this.b = b;
        this.c = 3;
        this.a = a;
        this.d = b.getStreamVolume(3);
    }
    
    public final boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }
    
    public final void onChange(final boolean b, final Uri uri) {
        final AudioManager b2 = this.b;
        if (b2 != null && this.a != null) {
            final int streamVolume = b2.getStreamVolume(this.c);
            if (streamVolume != this.d) {
                this.d = streamVolume;
                this.a.onAudioVolumeChanged(streamVolume);
            }
        }
    }
}
