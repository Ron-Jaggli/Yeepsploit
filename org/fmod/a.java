package org.fmod;

import java.nio.Buffer;
import android.util.Log;
import android.media.AudioRecord;
import java.nio.ByteBuffer;

final class a implements Runnable
{
    private final FMODAudioDevice a;
    private final ByteBuffer b;
    private final int c;
    private final int d;
    private volatile Thread e;
    private volatile boolean f;
    private AudioRecord g;
    private boolean h;
    
    a(final FMODAudioDevice a, final int c, final int d) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(c, d, 2));
    }
    
    private void b() {
        final AudioRecord g = this.g;
        if (g != null) {
            if (g.getState() == 1) {
                this.g.stop();
            }
            this.g.release();
            this.g = null;
        }
        this.b.position(0);
        this.h = false;
    }
    
    public final int a() {
        return ((Buffer)this.b).capacity();
    }
    
    public final void c() {
        if (this.e != null) {
            this.d();
        }
        this.f = true;
        (this.e = new Thread((Runnable)this)).start();
    }
    
    public final void d() {
        while (true) {
            if (this.e == null) {
                return;
            }
            this.f = false;
            try {
                this.e.join();
                this.e = null;
                continue;
            }
            catch (final InterruptedException ex) {}
        }
    }
    
    public final void run() {
        int n = 3;
        while (this.f) {
            int n2 = n;
            if (!this.h && (n2 = n) > 0) {
                this.b();
                final AudioRecord g = new AudioRecord(1, this.c, this.d, 2, ((Buffer)this.b).capacity());
                this.g = g;
                final int state = g.getState();
                boolean h = true;
                if (state != 1) {
                    h = false;
                }
                this.h = h;
                if (h) {
                    this.b.position(0);
                    this.g.startRecording();
                    n2 = 3;
                }
                else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.g.getState() + ")");
                    n2 = n - 1;
                    this.b();
                }
            }
            n = n2;
            if (this.h) {
                n = n2;
                if (this.g.getRecordingState() != 3) {
                    continue;
                }
                final AudioRecord g2 = this.g;
                final ByteBuffer b = this.b;
                this.a.fmodProcessMicData(this.b, g2.read(b, ((Buffer)b).capacity()));
                this.b.position(0);
                n = n2;
            }
        }
        this.b();
    }
}
