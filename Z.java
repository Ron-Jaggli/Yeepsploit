package com.unity3d.player;

import android.hardware.camera2.CameraCaptureSession$CaptureCallback;
import java.util.concurrent.Executor;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.Collections;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.CameraCaptureSession$StateCallback;
import java.util.Iterator;
import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import android.content.Context;
import com.unity3d.player.a.b;
import java.util.HashMap;

final class z extends w
{
    private static HashMap G;
    private String F;
    
    protected z(final b b) {
        super(b);
        this.F = null;
    }
    
    public static String[] a(final Context context) {
        final String[] cameraIdList = w.getCameraManager(context).getCameraIdList();
        final ArrayList list = new ArrayList();
        z.G = new HashMap();
        for (final String s : cameraIdList) {
            list.add((Object)s);
            z.G.put((Object)s, (Object)s);
        }
        final int length2 = cameraIdList.length;
        int j = 0;
    Label_0076:
        while (j < length2) {
            final String s2 = cameraIdList[j];
            final CameraCharacteristics cameraCharacteristics = w.getCameraManager(context).getCameraCharacteristics(s2);
            final int[] array = (int[])cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            while (true) {
                for (int length3 = array.length, k = 0; k < length3; ++k) {
                    if (array[k] == 11) {
                        com.unity3d.player.D.Log(4, String.format("Camera2 %s is a logical camera backed by two or more physical cameras", new Object[] { s2 }));
                        for (final String s3 : cameraCharacteristics.getPhysicalCameraIds()) {
                            if (list.indexOf((Object)s3) == -1) {
                                list.add((Object)s3);
                                z.G.put((Object)s3, (Object)s2);
                            }
                            com.unity3d.player.D.Log(4, String.format("Physical camera2 found : %s", new Object[] { s3 }));
                        }
                        ++j;
                        continue Label_0076;
                    }
                }
                com.unity3d.player.D.Log(4, String.format("Camera2 %s is a simple camera", new Object[] { s2 }));
                continue;
            }
        }
        return (String[])list.toArray((Object[])new String[list.size()]);
    }
    
    @Override
    protected void createCaptureSession(final CameraCaptureSession$StateCallback cameraCaptureSession$StateCallback) {
        final OutputConfiguration outputConfiguration = new OutputConfiguration(super.w);
        final String f = this.F;
        if (f != null) {
            outputConfiguration.setPhysicalCameraId(f);
        }
        super.b.createCaptureSession(new SessionConfiguration(0, Collections.singletonList((Object)outputConfiguration), (Executor)new y(super.d), cameraCaptureSession$StateCallback));
    }
    
    @Override
    protected String getCameraIdToOpen(final Context context, final int n) {
        final String f = com.unity3d.player.w.getCameraIds(context)[n];
        String s = (String)z.G.get((Object)f);
        if (s.equals((Object)f)) {
            this.F = null;
            s = f;
        }
        else {
            this.F = f;
        }
        return s;
    }
    
    @Override
    protected CameraCaptureSession$CaptureCallback getCaptureCallback() {
        if (super.s == null) {
            super.s = new x(this);
        }
        return super.s;
    }
}
