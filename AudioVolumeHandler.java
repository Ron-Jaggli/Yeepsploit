package com.unity3d.player;

import android.content.Context;

public class AudioVolumeHandler implements p
{
    private q a;
    
    AudioVolumeHandler(final Context context) {
        (this.a = new q(context)).a((p)this);
    }
    
    public final void a() {
        this.a.a();
        this.a = null;
    }
    
    @Override
    public final native void onAudioVolumeChanged(final int p0);
}
