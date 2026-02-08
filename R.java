package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession$StateCallback;

final class r extends CameraCaptureSession$StateCallback
{
    final w a;
    
    r(final w a) {
        this.a = a;
    }
    
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        w.-$$Nest$fputA(this.a, 3);
        D.Log(6, "Camera2: CaptureSession configuration failed.");
    }
    
    public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        final w a = this.a;
        if (a.b == null) {
            return;
        }
        final Object -$$Nest$fgett = w.-$$Nest$fgett(a);
        synchronized (-$$Nest$fgett) {
            final w a2 = this.a;
            w.-$$Nest$fputr(a2, cameraCaptureSession);
            try {
                w.-$$Nest$fputq(a2, a2.b.createCaptureRequest(1));
                final w a3 = this.a;
                w.-$$Nest$fgetq(a3).addTarget(a3.w);
                final w a4 = this.a;
                w.-$$Nest$fgetq(a4).set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, (Object)w.-$$Nest$fgetn(a4));
                w.-$$Nest$mg(this.a);
                return;
            }
            catch (final IllegalStateException ex) {
                new StringBuilder("Camera2: IllegalStateException ").append((Object)ex);
            }
            catch (final CameraAccessException ex2) {
                new StringBuilder("Camera2: CameraAccessException ").append((Object)ex2);
                goto Label_0107;
            }
            final String s;
            D.Log(6, s);
        }
    }
}
