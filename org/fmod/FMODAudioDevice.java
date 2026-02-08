package org.fmod;

import java.nio.Buffer;
import android.util.Log;
import java.nio.ByteBuffer;
import android.media.AudioTrack;

public class FMODAudioDevice implements Runnable
{
    private volatile Thread a;
    private volatile boolean b;
    private AudioTrack c;
    private boolean d;
    private ByteBuffer e;
    private byte[] f;
    private volatile a g;
    
    public FMODAudioDevice() {
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
    }
    
    private native int fmodGetInfo(final int p0);
    
    private native int fmodProcess(final ByteBuffer p0);
    
    private void releaseAudioTrack() {
        final AudioTrack c = this.c;
        if (c != null) {
            if (c.getState() == 1) {
                this.c.stop();
            }
            this.c.release();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.d = false;
    }
    
    public void close() {
        synchronized (this) {
            this.stop();
        }
    }
    
    native int fmodProcessMicData(final ByteBuffer p0, final int p1);
    
    public boolean isRunning() {
        return this.a != null && this.a.isAlive();
    }
    
    public void run() {
        int n = 3;
        while (this.b) {
            int n2 = n;
            if (!this.d && (n2 = n) > 0) {
                this.releaseAudioTrack();
                final int fmodGetInfo = this.fmodGetInfo(0);
                int n3;
                if (this.fmodGetInfo(4) == 1) {
                    n3 = 4;
                }
                else {
                    n3 = 12;
                }
                final int minBufferSize = AudioTrack.getMinBufferSize(fmodGetInfo, n3, 2);
                final int n4 = this.fmodGetInfo(4) * 2;
                int n5 = Math.round(minBufferSize * 1.1f) & ~(n4 - 1);
                final int fmodGetInfo2 = this.fmodGetInfo(1);
                final int n6 = this.fmodGetInfo(2) * fmodGetInfo2 * n4;
                if (n6 > n5) {
                    n5 = n6;
                }
                final AudioTrack c = new AudioTrack(3, fmodGetInfo, n3, 2, n5, 1);
                this.c = c;
                final boolean d = c.getState() == 1;
                this.d = d;
                if (d) {
                    final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo2 * n4);
                    this.e = allocateDirect;
                    this.f = new byte[((Buffer)allocateDirect).capacity()];
                    this.c.play();
                    n2 = 3;
                }
                else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.c.getState() + ")");
                    this.releaseAudioTrack();
                    n2 = n - 1;
                }
            }
            n = n2;
            if (this.d) {
                if (this.fmodGetInfo(3) == 1) {
                    this.fmodProcess(this.e);
                    final ByteBuffer e = this.e;
                    e.get(this.f, 0, ((Buffer)e).capacity());
                    this.c.write(this.f, 0, ((Buffer)this.e).capacity());
                    this.e.position(0);
                    n = n2;
                }
                else {
                    this.releaseAudioTrack();
                    n = n2;
                }
            }
        }
        this.releaseAudioTrack();
    }
    
    public void start() {
        synchronized (this) {
            if (this.a != null) {
                this.stop();
            }
            (this.a = new Thread((Runnable)this, "FMODAudioDevice")).setPriority(10);
            this.b = true;
            this.a.start();
            if (this.g != null) {
                this.g.c();
            }
        }
    }
    
    public int startAudioRecord(int a, final int n, final int n2) {
        synchronized (this) {
            if (this.g == null) {
                (this.g = new a(this, a, n)).c();
            }
            a = this.g.a();
            return a;
        }
    }
    
    public void stop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: dup            
        //     2: astore_2       
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        org/fmod/FMODAudioDevice.a:Ljava/lang/Thread;
        //     8: ifnull          31
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        org/fmod/FMODAudioDevice.b:Z
        //    16: aload_0        
        //    17: getfield        org/fmod/FMODAudioDevice.a:Ljava/lang/Thread;
        //    20: invokevirtual   java/lang/Thread.join:()V
        //    23: aload_0        
        //    24: aconst_null    
        //    25: putfield        org/fmod/FMODAudioDevice.a:Ljava/lang/Thread;
        //    28: goto            4
        //    31: aload_0        
        //    32: getfield        org/fmod/FMODAudioDevice.g:Lorg/fmod/a;
        //    35: ifnull          45
        //    38: aload_0        
        //    39: getfield        org/fmod/FMODAudioDevice.g:Lorg/fmod/a;
        //    42: invokevirtual   org/fmod/a.d:()V
        //    45: aload_2        
        //    46: monitorexit    
        //    47: return         
        //    48: astore_1       
        //    49: aload_2        
        //    50: monitorexit    
        //    51: aload_1        
        //    52: athrow         
        //    53: astore_1       
        //    54: goto            4
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      16     48     53     Any
        //  16     28     53     57     Ljava/lang/InterruptedException;
        //  16     28     48     53     Any
        //  31     45     48     53     Any
        //  49     51     48     53     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1154)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:652)
        //     at java.lang.Thread.run(Thread.java:1563)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void stopAudioRecord() {
        synchronized (this) {
            if (this.g != null) {
                this.g.d();
                this.g = null;
            }
        }
    }
}
