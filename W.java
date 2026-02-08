package com.unity3d.player;

import java.util.Arrays;
import android.hardware.camera2.CameraCaptureSession$StateCallback;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import android.hardware.camera2.params.StreamConfigurationMap;
import java.util.concurrent.TimeUnit;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraAccessException;
import android.util.SizeF;
import android.hardware.camera2.CameraCharacteristics;
import android.content.Context;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import android.media.ImageReader$OnImageAvailableListener;
import android.hardware.camera2.CameraDevice$StateCallback;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest$Builder;
import android.media.Image;
import android.media.ImageReader;
import android.util.Range;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.hardware.camera2.CameraDevice;
import com.unity3d.player.a.b;
import java.util.concurrent.Semaphore;
import android.hardware.camera2.CameraManager;

class w
{
    private static CameraManager B;
    private static String[] C;
    private static Semaphore D;
    public static final int E = 0;
    private int A;
    private b a;
    protected CameraDevice b;
    private HandlerThread c;
    protected Handler d;
    private Rect e;
    private Rect f;
    private int g;
    private int h;
    private float i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private Range n;
    private ImageReader o;
    private Image p;
    private CaptureRequest$Builder q;
    private CameraCaptureSession r;
    protected CameraCaptureSession$CaptureCallback s;
    private Object t;
    private int u;
    private SurfaceTexture v;
    protected Surface w;
    private final CameraDevice$StateCallback x;
    private final ImageReader$OnImageAvailableListener y;
    private final SurfaceTexture$OnFrameAvailableListener z;
    
    static {
        w.D = new Semaphore(1);
    }
    
    protected w(final b a) {
        this.a = null;
        this.i = -1.0f;
        this.j = -1.0f;
        this.m = false;
        this.o = null;
        this.r = null;
        this.s = null;
        this.t = new Object();
        this.w = null;
        this.A = 3;
        this.x = new s(this);
        this.y = (ImageReader$OnImageAvailableListener)new t(this);
        this.z = (SurfaceTexture$OnFrameAvailableListener)new u(this);
        this.a = a;
        this.e();
    }
    
    public static int a(final Context context, final int n) {
        try {
            final CameraCharacteristics cameraCharacteristics = getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[n]);
            final float[] array = (float[])cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            final SizeF sizeF = (SizeF)cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (array.length > 0) {
                return (int)(array[0] * 36.0f / sizeF.getWidth());
            }
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
        }
        return 0;
    }
    
    private void a(final CameraDevice cameraDevice) {
        final Object t = this.t;
        synchronized (t) {
            this.r = null;
            monitorexit(t);
            cameraDevice.close();
            this.b = null;
        }
    }
    
    private void a(Object o) {
        if (o == "Focus") {
            this.m = false;
            o = this.t;
            synchronized (o) {
                if (this.r != null) {
                    try {
                        this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, (Object)0);
                        this.q.setTag((Object)"Regular");
                        this.r.setRepeatingRequest(this.q.build(), this.getCaptureCallback(), this.d);
                    }
                    catch (final CameraAccessException ex) {
                        com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
                    }
                }
                return;
            }
        }
        if (o == "Cancel focus") {
            o = this.t;
            synchronized (o) {
                if (this.r != null) {
                    this.g();
                }
            }
        }
    }
    
    private void b() {
        try {
            final Semaphore d = com.unity3d.player.w.D;
            final TimeUnit seconds = TimeUnit.SECONDS;
            if (!d.tryAcquire(4L, seconds)) {
                com.unity3d.player.D.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.b.close();
            try {
                if (!com.unity3d.player.w.D.tryAcquire(4L, seconds)) {
                    com.unity3d.player.D.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            }
            catch (final InterruptedException ex) {
                com.unity3d.player.D.Log(6, "Camera2: Interrupted while waiting to close camera " + (Object)ex);
            }
            this.b = null;
            com.unity3d.player.w.D.release();
        }
        catch (final InterruptedException ex2) {
            com.unity3d.player.D.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + (Object)ex2);
        }
    }
    
    public static int[] b(final Context context, int i) {
        try {
            final StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap)getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i]).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Size[] array = null;
            Label_0063: {
                if (streamConfigurationMap == null) {
                    com.unity3d.player.D.Log(6, "Camera2: configuration map is not available.");
                }
                else {
                    final Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                    if (outputSizes != null) {
                        array = outputSizes;
                        if (outputSizes.length != 0) {
                            break Label_0063;
                        }
                    }
                }
                array = null;
            }
            if (array != null) {
                final int[] array2 = new int[array.length * 2];
                int n;
                for (i = 0; i < array.length; ++i) {
                    n = i * 2;
                    array2[n] = array[i].getWidth();
                    array2[n + 1] = array[i].getHeight();
                }
                return array2;
            }
            return null;
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
            return null;
        }
    }
    
    public static int c(final Context context, int intValue) {
        try {
            intValue = (int)getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[intValue]).get(CameraCharacteristics.SENSOR_ORIENTATION);
            return intValue;
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
            return 0;
        }
    }
    
    public static boolean d(final Context context, int intValue) {
        boolean b = false;
        try {
            intValue = (int)getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[intValue]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            if (intValue > 0) {
                b = true;
            }
            return b;
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
            return false;
        }
    }
    
    private void e() {
        ((Thread)(this.c = new HandlerThread("CameraBackground"))).start();
        this.d = new Handler(this.c.getLooper());
    }
    
    public static boolean e(final Context context, int intValue) {
        boolean b = false;
        try {
            intValue = (int)getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[intValue]).get(CameraCharacteristics.LENS_FACING);
            if (intValue == 0) {
                b = true;
            }
            return b;
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
            return false;
        }
    }
    
    private void f() {
        try {
            final CameraCaptureSession r = this.r;
            if (r != null) {
                r.stopRepeating();
                this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, (Object)2);
                this.q.set(CaptureRequest.CONTROL_AF_MODE, (Object)0);
                this.q.setTag((Object)"Cancel focus");
                this.r.capture(this.q.build(), this.getCaptureCallback(), this.d);
            }
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
        }
    }
    
    private void g() {
        try {
            if (this.h != 0) {
                final float i = this.i;
                if (i >= 0.0f && i <= 1.0f) {
                    final float j = this.j;
                    if (j >= 0.0f) {
                        if (j <= 1.0f) {
                            this.m = true;
                            final int width = this.f.width();
                            final int k = this.k;
                            final int n = (int)((width - k * 2) * this.i + k);
                            final int height = this.f.height();
                            final int l = this.l;
                            final int n2 = (int)((1.0 - this.j) * (height - l * 2) + l);
                            final int max = Math.max(this.g + 1, Math.min(n, this.f.width() - this.g - 1));
                            final int max2 = Math.max(this.g + 1, Math.min(n2, this.f.height() - this.g - 1));
                            final CaptureRequest$Builder q = this.q;
                            final CaptureRequest$Key control_AF_REGIONS = CaptureRequest.CONTROL_AF_REGIONS;
                            final int g = this.g;
                            final int n3 = g * 2;
                            q.set(control_AF_REGIONS, (Object)new MeteringRectangle[] { new MeteringRectangle(max - g, max2 - g, n3, n3, 999) });
                            this.q.set(CaptureRequest.CONTROL_AF_MODE, (Object)1);
                            this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, (Object)1);
                            this.q.setTag((Object)"Focus");
                            this.r.capture(this.q.build(), this.getCaptureCallback(), this.d);
                            return;
                        }
                    }
                }
            }
            this.q.set(CaptureRequest.CONTROL_AF_MODE, (Object)4);
            this.q.setTag((Object)"Regular");
            final CameraCaptureSession r = this.r;
            if (r != null) {
                r.setRepeatingRequest(this.q.build(), this.getCaptureCallback(), this.d);
            }
        }
        catch (final CameraAccessException ex) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
        }
    }
    
    protected static String[] getCameraIds(final Context context) {
        if (w.C == null) {
            try {
                if (PlatformSupport.QUINCE_TART_SUPPORT) {
                    w.C = z.a(context);
                }
                else {
                    w.C = getCameraManager(context).getCameraIdList();
                }
            }
            catch (final CameraAccessException ex) {
                com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
                w.C = new String[0];
            }
        }
        return w.C;
    }
    
    protected static CameraManager getCameraManager(final Context context) {
        if (w.B == null) {
            w.B = (CameraManager)context.getSystemService("camera");
        }
        return w.B;
    }
    
    public final void a() {
        if (this.b != null) {
            this.i();
            this.b();
            this.s = null;
            this.w = null;
            this.v = null;
            final Image p = this.p;
            if (p != null) {
                p.close();
                this.p = null;
            }
            final ImageReader o = this.o;
            if (o != null) {
                o.close();
                this.o = null;
            }
        }
        this.c.quit();
        try {
            ((Thread)this.c).join(4000L);
            this.c = null;
            this.d = null;
        }
        catch (final InterruptedException ex) {
            ((Thread)this.c).interrupt();
            com.unity3d.player.D.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + (Object)ex);
        }
    }
    
    public final boolean a(final float i, final float j) {
        if (this.h > 0) {
            if (!this.m) {
                this.i = i;
                this.j = j;
                final Object t = this.t;
                synchronized (t) {
                    if (this.r != null && this.A != 2) {
                        this.f();
                    }
                    return true;
                }
            }
            com.unity3d.player.D.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }
    
    public final boolean a(final Context context, final int n, int i, int n2, int intValue, final int n3, final Surface surface) {
        try {
            final CameraCharacteristics cameraCharacteristics = com.unity3d.player.w.B.getCameraCharacteristics(getCameraIds(context)[n]);
            if ((int)cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL) == 2) {
                com.unity3d.player.D.Log(5, "Camera2: only LEGACY hardware level is supported.");
            }
            final StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap)cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            final Size[] array = null;
            Size[] array2;
            if (streamConfigurationMap == null) {
                com.unity3d.player.D.Log(6, "Camera2: configuration map is not available.");
                array2 = array;
            }
            else {
                final Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                array2 = array;
                if (outputSizes != null) {
                    if (outputSizes.length == 0) {
                        array2 = array;
                    }
                    else {
                        array2 = outputSizes;
                    }
                }
            }
            if (array2 != null && array2.length != 0) {
                final double n4 = i;
                final double n5 = n2;
                i = 0;
                int n6 = 0;
                n2 = 0;
                double n7 = Double.MAX_VALUE;
                while (i < array2.length) {
                    final int width = array2[i].getWidth();
                    final int height = array2[i].getHeight();
                    final double n8 = Math.abs(Math.log(n5 / height)) + Math.abs(Math.log(n4 / width));
                    double n9 = n7;
                    if (n8 < n7) {
                        n6 = height;
                        n9 = n8;
                        n2 = width;
                    }
                    ++i;
                    n7 = n9;
                }
                this.e = new Rect(0, 0, n2, n6);
                final Range[] array3 = (Range[])cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                Label_0897: {
                    if (array3 != null) {
                        if (array3.length != 0) {
                            n2 = -1;
                            i = 0;
                            double n10 = Double.MAX_VALUE;
                            while (true) {
                                while (i < array3.length) {
                                    final int intValue2 = (int)array3[i].getLower();
                                    final int intValue3 = (int)array3[i].getUpper();
                                    final float n11 = (float)intValue;
                                    if (n11 + 0.1f > intValue2 && n11 - 0.1f < intValue3) {
                                        this.n = new Range((Comparable)intValue, (Comparable)intValue);
                                        try {
                                            if (!com.unity3d.player.w.D.tryAcquire(4L, TimeUnit.SECONDS)) {
                                                com.unity3d.player.D.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                                                return false;
                                            }
                                            try {
                                                com.unity3d.player.w.B.openCamera(this.getCameraIdToOpen(context, n), this.x, this.d);
                                            }
                                            catch (final IllegalArgumentException ex) {
                                                new StringBuilder("Camera2: IllegalArgumentException ").append((Object)ex).toString();
                                                goto Label_0574;
                                            }
                                            catch (final SecurityException ex2) {
                                                new StringBuilder("Camera2: SecurityException ").append((Object)ex2).toString();
                                            }
                                            catch (final CameraAccessException ex3) {
                                                com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex3);
                                                com.unity3d.player.w.D.release();
                                            }
                                            try {
                                                if (!com.unity3d.player.w.D.tryAcquire(4L, TimeUnit.SECONDS)) {
                                                    com.unity3d.player.D.Log(5, "Camera2: Timeout waiting to open camera.");
                                                    return false;
                                                }
                                                com.unity3d.player.w.D.release();
                                                goto Label_0636;
                                            }
                                            catch (final InterruptedException ex4) {}
                                            return false;
                                        }
                                        catch (final InterruptedException ex5) {
                                            com.unity3d.player.D.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + (Object)ex5);
                                            return false;
                                        }
                                        break Label_0897;
                                    }
                                    final double n12 = (float)Math.min(Math.abs(intValue - intValue2), Math.abs(intValue - intValue3));
                                    double n13 = n10;
                                    if (n12 < n10) {
                                        n2 = i;
                                        n13 = n12;
                                    }
                                    ++i;
                                    n10 = n13;
                                }
                                Comparable comparable;
                                if (intValue > (int)array3[n2].getUpper()) {
                                    comparable = array3[n2].getUpper();
                                }
                                else {
                                    comparable = array3[n2].getLower();
                                }
                                intValue = (int)comparable;
                                continue;
                            }
                        }
                    }
                }
                com.unity3d.player.D.Log(6, "Camera2: target FPS ranges are not avialable.");
                return false;
            }
            return false;
        }
        catch (final CameraAccessException ex6) {
            com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex6);
            return false;
        }
    }
    
    public final Rect c() {
        return this.e;
    }
    
    protected void createCaptureSession(final CameraCaptureSession$StateCallback cameraCaptureSession$StateCallback) {
        this.b.createCaptureSession(Arrays.asList((Object[])new Surface[] { this.w }), cameraCaptureSession$StateCallback, this.d);
    }
    
    public final void d() {
        final Object t = this.t;
        synchronized (t) {
            final CameraCaptureSession r = this.r;
            if (r != null) {
                try {
                    r.stopRepeating();
                    this.A = 2;
                }
                catch (final CameraAccessException ex) {
                    com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
                }
            }
        }
    }
    
    protected String getCameraIdToOpen(final Context context, final int n) {
        return getCameraIds(context)[n];
    }
    
    protected CameraCaptureSession$CaptureCallback getCaptureCallback() {
        if (this.s == null) {
            this.s = new v(this);
        }
        return this.s;
    }
    
    public final void h() {
        Label_0152: {
            Surface surface;
            if (this.u != 0) {
                if (this.w != null) {
                    break Label_0152;
                }
                (this.v = new SurfaceTexture(this.u)).setDefaultBufferSize(this.e.width(), this.e.height());
                this.v.setOnFrameAvailableListener(this.z, this.d);
                surface = new Surface(this.v);
            }
            else {
                if (this.w != null || this.o != null) {
                    break Label_0152;
                }
                (this.o = ImageReader.newInstance(this.e.width(), this.e.height(), 35, 2)).setOnImageAvailableListener(this.y, this.d);
                this.p = null;
                surface = this.o.getSurface();
            }
            this.w = surface;
            try {
                final CameraCaptureSession r = this.r;
                if (r != null) {
                    if (this.A == 2) {
                        r.setRepeatingRequest(this.q.build(), this.getCaptureCallback(), this.d);
                    }
                }
                else {
                    this.createCaptureSession(new r(this));
                }
                this.A = 1;
            }
            catch (final CameraAccessException ex) {
                com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
            }
        }
    }
    
    public final void i() {
        final Object t = this.t;
        synchronized (t) {
            final CameraCaptureSession r = this.r;
            if (r != null) {
                try {
                    r.abortCaptures();
                }
                catch (final CameraAccessException ex) {
                    com.unity3d.player.D.Log(6, "Camera2: CameraAccessException " + (Object)ex);
                }
                this.r.close();
                this.r = null;
                this.A = 3;
            }
        }
    }
}
