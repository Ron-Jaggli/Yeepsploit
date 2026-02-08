package com.fingerprintjs.android.fingerprint.signal_providers;

import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.LinkedHashMap;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfo;
import com.fingerprintjs.android.fingerprint.info_providers.SensorData;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceData;
import kotlin.Pair;
import com.fingerprintjs.android.fingerprint.info_providers.MediaCodecInfo;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import java.util.Collection;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;
import kotlin.Deprecated;

@Deprecated(message = "This symbol is deprecated because it may be useful only when using deprecated Fingerprinter.getFingerprint(stabilityLevel, listener) or Fingerprinter.getDeviceId(listener) methods. Whenever we remove those methods from the library, we will remove this symbol as well.")
@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u0019\u001a\u00020\tH&J \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u00172\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "T", "Lcom/fingerprintjs/android/fingerprint/signal_providers/Signal;", "addedInVersion", "", "removedInVersion", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "name", "", "displayName", "value", "(ILjava/lang/Integer;Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getAddedInVersion", "()I", "getDisplayName", "()Ljava/lang/String;", "getRemovedInVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStabilityLevel", "()Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "toMap", "", "", "toString", "wrapSignalToMap", "signal", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public abstract class IdentificationSignal<T> extends Signal<T>
{
    private final int addedInVersion;
    private final String displayName;
    private final Integer removedInVersion;
    private final StabilityLevel stabilityLevel;
    
    public IdentificationSignal(final int addedInVersion, final Integer removedInVersion, final StabilityLevel stabilityLevel, final String s, final String displayName, final T t) {
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        Intrinsics.checkNotNullParameter((Object)s, "name");
        Intrinsics.checkNotNullParameter((Object)displayName, "displayName");
        super(s, t);
        this.addedInVersion = addedInVersion;
        this.removedInVersion = removedInVersion;
        this.stabilityLevel = stabilityLevel;
        this.displayName = displayName;
    }
    
    private final Map<String, Object> wrapSignalToMap(final Signal<?> signal) {
        Object o;
        if ((o = signal.getValue()) == null) {
            o = MapsKt.emptyMap();
        }
        Map map;
        if (o instanceof String) {
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", o));
        }
        else if (o instanceof Integer) {
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", o));
        }
        else if (o instanceof Long) {
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", o));
        }
        else if (o instanceof Boolean) {
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", o));
        }
        else if (o instanceof Map) {
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", o));
        }
        else if (o instanceof List) {
            final Iterable iterable = (Iterable)o;
            final Collection collection = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (final Object next : iterable) {
                Object o2;
                if (next instanceof MediaCodecInfo) {
                    final MediaCodecInfo mediaCodecInfo = (MediaCodecInfo)next;
                    o2 = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"codecName", (Object)mediaCodecInfo.getName()), TuplesKt.to((Object)"codecCapabilities", (Object)mediaCodecInfo.getCapabilities()) });
                }
                else if (next instanceof InputDeviceData) {
                    final InputDeviceData inputDeviceData = (InputDeviceData)next;
                    o2 = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"vendor", (Object)inputDeviceData.getVendor()), TuplesKt.to((Object)"name", (Object)inputDeviceData.getName()) });
                }
                else if (next instanceof SensorData) {
                    final SensorData sensorData = (SensorData)next;
                    o2 = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"sensorName", (Object)sensorData.getSensorName()), TuplesKt.to((Object)"vendorName", (Object)sensorData.getVendorName()) });
                }
                else if (next instanceof CameraInfo) {
                    final CameraInfo cameraInfo = (CameraInfo)next;
                    o2 = MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"cameraName", (Object)cameraInfo.getCameraName()), TuplesKt.to((Object)"cameraType", (Object)cameraInfo.getCameraType()), TuplesKt.to((Object)"cameraOrientation", (Object)cameraInfo.getCameraOrientation()) });
                }
                else if (next instanceof Pair) {
                    final Pair pair = (Pair)next;
                    o2 = CollectionsKt.listOf((Object[])new String[] { String.valueOf(pair.getFirst()), String.valueOf(pair.getSecond()) });
                }
                else {
                    o2 = String.valueOf(next);
                }
                collection.add(o2);
            }
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", (Object)collection));
        }
        else if (o instanceof CpuInfo) {
            final CpuInfo cpuInfo = (CpuInfo)o;
            final List commonInfo = cpuInfo.getCommonInfo();
            final int size = cpuInfo.getPerProcessorInfo().size();
            final Iterable iterable2 = (Iterable)CollectionsKt.flatten((Iterable)cpuInfo.getPerProcessorInfo());
            final Map map2 = (Map)new LinkedHashMap();
            for (final Object next2 : iterable2) {
                final Pair pair2 = (Pair)next2;
                Object value;
                if ((value = map2.get((Object)pair2)) == null) {
                    value = new ArrayList();
                    map2.put((Object)pair2, value);
                }
                ((List)value).add(next2);
            }
            final Map map3 = (Map)new LinkedHashMap();
            for (final Map$Entry map$Entry : map2.entrySet()) {
                if (((List)map$Entry.getValue()).size() == size) {
                    map3.put(map$Entry.getKey(), map$Entry.getValue());
                }
            }
            final Collection collection2 = (Collection)new ArrayList(map3.size());
            final Iterator iterator4 = map3.entrySet().iterator();
            while (iterator4.hasNext()) {
                collection2.add((Object)((Map$Entry)iterator4.next()).getKey());
            }
            final List list = (List)collection2;
            final Iterable iterable3 = (Iterable)list;
            final Collection collection3 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
            final Iterator iterator5 = iterable3.iterator();
            while (iterator5.hasNext()) {
                collection3.add((Object)((Pair)iterator5.next()).getFirst());
            }
            final Set set = CollectionsKt.toSet((Iterable)collection3);
            final Iterable iterable4 = (Iterable)cpuInfo.getPerProcessorInfo();
            final Collection collection4 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
            for (final Iterable iterable5 : iterable4) {
                final Collection collection5 = (Collection)new ArrayList();
                for (final Object next3 : iterable5) {
                    if (!set.contains(((Pair)next3).getFirst())) {
                        collection5.add(next3);
                    }
                }
                collection4.add((Object)collection5);
            }
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", (Object)MapsKt.mapOf(new Pair[] { TuplesKt.to((Object)"commonProps", (Object)commonInfo), TuplesKt.to((Object)"repeatedProps", (Object)list), TuplesKt.to((Object)"uniquePerCpuProps", (Object)collection4) })));
        }
        else {
            map = MapsKt.mapOf(TuplesKt.to((Object)"v", (Object)o.toString()));
        }
        return (Map<String, Object>)map;
    }
    
    public final int getAddedInVersion() {
        return this.addedInVersion;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final Integer getRemovedInVersion() {
        return this.removedInVersion;
    }
    
    public final StabilityLevel getStabilityLevel() {
        return this.stabilityLevel;
    }
    
    @Override
    public Map<String, Object> toMap() {
        return this.wrapSignalToMap(this);
    }
    
    @Override
    public abstract String toString();
}
