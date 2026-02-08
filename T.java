package com.unity3d.player;

import android.media.Image$Plane;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader$OnImageAvailableListener;

final class t implements ImageReader$OnImageAvailableListener
{
    final w a;
    
    t(final w a) {
        this.a = a;
    }
    
    public final void onImageAvailable(final ImageReader imageReader) {
        if (w.-$$Nest$sfgetD().tryAcquire()) {
            final Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                final Image$Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper)w.-$$Nest$fgeta(this.a)).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                }
                else {
                    D.Log(6, "Camera2: Wrong image format.");
                }
                final Image -$$Nest$fgetp = w.-$$Nest$fgetp(this.a);
                if (-$$Nest$fgetp != null) {
                    -$$Nest$fgetp.close();
                }
                w.-$$Nest$fputp(this.a, acquireNextImage);
            }
            w.-$$Nest$sfgetD().release();
        }
    }
}
