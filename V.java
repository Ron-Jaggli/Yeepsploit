package com.unity3d.player;

import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;

class v extends CameraCaptureSession$CaptureCallback
{
    final w a;
    
    v(final w a) {
        this.a = a;
    }
    
    public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        w.-$$Nest$ma(this.a, captureRequest.getTag());
    }
    
    public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
        D.Log(5, "Camera2: Capture session failed " + captureRequest.getTag() + " reason " + captureFailure.getReason());
        w.-$$Nest$ma(this.a, captureRequest.getTag());
    }
    
    public final void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int n) {
    }
    
    public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int n, final long n2) {
    }
}
