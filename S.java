package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice$StateCallback;

final class s extends CameraDevice$StateCallback
{
    final w a;
    
    s(final w a) {
        this.a = a;
    }
    
    public final void onClosed(final CameraDevice cameraDevice) {
        w.-$$Nest$sfgetD().release();
    }
    
    public final void onDisconnected(final CameraDevice cameraDevice) {
        D.Log(5, "Camera2: CameraDevice disconnected.");
        w.-$$Nest$ma(this.a, cameraDevice);
        w.-$$Nest$sfgetD().release();
    }
    
    public final void onError(final CameraDevice cameraDevice, final int n) {
        D.Log(6, "Camera2: Error opening CameraDevice " + n);
        w.-$$Nest$ma(this.a, cameraDevice);
        w.-$$Nest$sfgetD().release();
    }
    
    public final void onOpened(final CameraDevice b) {
        this.a.b = b;
        w.-$$Nest$sfgetD().release();
    }
}
