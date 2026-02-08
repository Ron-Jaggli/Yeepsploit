package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.Result;
import kotlin.collections.CollectionsKt;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;
import android.media.MediaCodecList;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;", "codecList", "Landroid/media/MediaCodecList;", "(Landroid/media/MediaCodecList;)V", "codecsList", "", "Lcom/fingerprintjs/android/fingerprint/info_providers/MediaCodecInfo;", "extractCodecInfo", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class CodecInfoProviderImpl implements CodecInfoProvider
{
    private final MediaCodecList codecList;
    
    public CodecInfoProviderImpl(final MediaCodecList codecList) {
        this.codecList = codecList;
    }
    
    private final List<MediaCodecInfo> extractCodecInfo() {
        final MediaCodecList codecList = this.codecList;
        Intrinsics.checkNotNull((Object)codecList);
        final android.media.MediaCodecInfo[] codecInfos = codecList.getCodecInfos();
        Intrinsics.checkNotNullExpressionValue((Object)codecInfos, "getCodecInfos(...)");
        final Object[] array = codecInfos;
        final Collection collection = (Collection)new ArrayList(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            final android.media.MediaCodecInfo mediaCodecInfo = (android.media.MediaCodecInfo)array[i];
            Intrinsics.checkNotNull((Object)mediaCodecInfo);
            final String name = mediaCodecInfo.getName();
            Intrinsics.checkNotNull((Object)name);
            final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            Intrinsics.checkNotNull((Object)supportedTypes);
            final Collection collection2 = (Collection)new ArrayList(supportedTypes.length);
            for (int length2 = supportedTypes.length, j = 0; j < length2; ++j) {
                collection2.add((Object)String.valueOf((Object)supportedTypes[j]));
            }
            collection.add((Object)new MediaCodecInfo(name, (List<String>)collection2));
        }
        return (List<MediaCodecInfo>)collection;
    }
    
    @Override
    public List<MediaCodecInfo> codecsList() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new CodecInfoProviderImpl$codecsList.CodecInfoProviderImpl$codecsList$1(this), 1, (Object)null);
        final List emptyList = CollectionsKt.emptyList();
        List list = (List)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            list = emptyList;
        }
        return (List<MediaCodecInfo>)list;
    }
}
