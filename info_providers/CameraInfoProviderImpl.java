package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import android.hardware.Camera$CameraInfo;
import java.util.LinkedList;
import android.hardware.Camera;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "()V", "extractInfo", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfo;", "getCameraInfo", "stringDescriptionForType", "", "type", "", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class CameraInfoProviderImpl implements CameraInfoProvider
{
    private final List<CameraInfo> extractInfo() {
        final int numberOfCameras = Camera.getNumberOfCameras();
        final LinkedList list = new LinkedList();
        for (int i = 0; i < numberOfCameras; ++i) {
            final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
            Camera.getCameraInfo(i, camera$CameraInfo);
            list.add((Object)new CameraInfo(String.valueOf(i), this.stringDescriptionForType(camera$CameraInfo.facing), String.valueOf(camera$CameraInfo.orientation)));
        }
        return (List<CameraInfo>)list;
    }
    
    private final String stringDescriptionForType(final int n) {
        String s;
        if (n != 0) {
            if (n != 1) {
                s = "";
            }
            else {
                s = "front";
            }
        }
        else {
            s = "back";
        }
        return s;
    }
    
    @Override
    public List<CameraInfo> getCameraInfo() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new CameraInfoProviderImpl$getCameraInfo.CameraInfoProviderImpl$getCameraInfo$1(this), 1, (Object)null);
        final List emptyList = CollectionsKt.emptyList();
        List list = (List)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            list = emptyList;
        }
        return (List<CameraInfo>)list;
    }
}
