package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import java.util.Iterator;
import com.fingerprintjs.android.fingerprint.tools.SignalsUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions;
import kotlin.collections.CollectionsKt;
import kotlin.TuplesKt;
import kotlin.Pair;
import java.util.List;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.Fingerprinter$Version;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.SensorDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProvider;
import kotlin.Lazy;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0086\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001By\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ)\u0010\u0099\u0002\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u009b\u00020\u009a\u00022\b\u0010\u009c\u0002\u001a\u00030\u009d\u00022\b\u0010\u009e\u0002\u001a\u00030\u009f\u0002H\u0007R\u001b\u0010\u001f\u001a\u00020 8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020?8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\b@\u0010AR\u001b\u0010C\u001a\u00020D8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\bE\u0010FR\u001b\u0010H\u001a\u00020I8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010$\u001a\u0004\bJ\u0010KR\u001b\u0010M\u001a\u00020N8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010$\u001a\u0004\bO\u0010PR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020S8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010$\u001a\u0004\bT\u0010UR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010W\u001a\u00020X8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010$\u001a\u0004\bY\u0010ZR\u001b\u0010\\\u001a\u00020]8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010$\u001a\u0004\b^\u0010_R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010a\u001a\u00020b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010$\u001a\u0004\bc\u0010dR\u001b\u0010f\u001a\u00020g8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010$\u001a\u0004\bh\u0010iR\u001b\u0010k\u001a\u00020l8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bo\u0010$\u001a\u0004\bm\u0010nR\u001b\u0010p\u001a\u00020q8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010$\u001a\u0004\br\u0010sR\u001b\u0010u\u001a\u00020v8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\by\u0010$\u001a\u0004\bw\u0010xR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010z\u001a\u00020{8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b~\u0010$\u001a\u0004\b|\u0010}R\u001f\u0010\u007f\u001a\u00030\u0080\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010$\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0084\u0001\u001a\u00030\u0085\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010$\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u0089\u0001\u001a\u00030\u008a\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010$\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u008e\u0001\u001a\u00030\u008f\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010$\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0094\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0097\u0001\u0010$\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0098\u0001\u001a\u00030\u0099\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010$\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u009d\u0001\u001a\u00030\u009e\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¡\u0001\u0010$\u001a\u0006\b\u009f\u0001\u0010 \u0001R \u0010¢\u0001\u001a\u00030£\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010$\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010§\u0001\u001a\u00030¨\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bª\u0001\u0010$\u001a\u0006\b§\u0001\u0010©\u0001R \u0010«\u0001\u001a\u00030¬\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¯\u0001\u0010$\u001a\u0006\b\u00ad\u0001\u0010®\u0001R \u0010°\u0001\u001a\u00030±\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b´\u0001\u0010$\u001a\u0006\b²\u0001\u0010³\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010µ\u0001\u001a\u00030¶\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¹\u0001\u0010$\u001a\u0006\b·\u0001\u0010¸\u0001R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010º\u0001\u001a\u00030»\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¾\u0001\u0010$\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010¿\u0001\u001a\u00030\u00c0\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00c3\u0001\u0010$\u001a\u0006\b\u00c1\u0001\u0010\u00c2\u0001R \u0010\u00c4\u0001\u001a\u00030\u00c5\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00c8\u0001\u0010$\u001a\u0006\b\u00c6\u0001\u0010\u00c7\u0001R \u0010\u00c9\u0001\u001a\u00030\u00ca\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00cd\u0001\u0010$\u001a\u0006\b\u00cb\u0001\u0010\u00cc\u0001R \u0010\u00ce\u0001\u001a\u00030\u00cf\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00d2\u0001\u0010$\u001a\u0006\b\u00d0\u0001\u0010\u00d1\u0001R \u0010\u00d3\u0001\u001a\u00030\u00d4\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00d7\u0001\u0010$\u001a\u0006\b\u00d5\u0001\u0010\u00d6\u0001R \u0010\u00d8\u0001\u001a\u00030\u00d9\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00dc\u0001\u0010$\u001a\u0006\b\u00da\u0001\u0010\u00db\u0001R \u0010\u00dd\u0001\u001a\u00030\u00de\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00e1\u0001\u0010$\u001a\u0006\b\u00df\u0001\u0010\u00e0\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u00e2\u0001\u001a\u00030\u00e3\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00e6\u0001\u0010$\u001a\u0006\b\u00e4\u0001\u0010\u00e5\u0001R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u00e7\u0001\u001a\u00030\u00e8\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00eb\u0001\u0010$\u001a\u0006\b\u00e9\u0001\u0010\u00ea\u0001R \u0010\u00ec\u0001\u001a\u00030\u00ed\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00f0\u0001\u0010$\u001a\u0006\b\u00ee\u0001\u0010\u00ef\u0001R \u0010\u00f1\u0001\u001a\u00030\u00f2\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00f5\u0001\u0010$\u001a\u0006\b\u00f3\u0001\u0010\u00f4\u0001R \u0010\u00f6\u0001\u001a\u00030\u00f7\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00fa\u0001\u0010$\u001a\u0006\b\u00f8\u0001\u0010\u00f9\u0001R \u0010\u00fb\u0001\u001a\u00030\u00fc\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u00ff\u0001\u0010$\u001a\u0006\b\u00fd\u0001\u0010\u00fe\u0001R \u0010\u0080\u0002\u001a\u00030\u0081\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0002\u0010$\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R \u0010\u0085\u0002\u001a\u00030\u0086\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0002\u0010$\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R \u0010\u008a\u0002\u001a\u00030\u008b\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0002\u0010$\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R \u0010\u008f\u0002\u001a\u00030\u0090\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0002\u0010$\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R \u0010\u0094\u0002\u001a\u00030\u0095\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0002\u0010$\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002¨\u0006 \u0002" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "", "cpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;", "memInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "sensorsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;", "inputDeviceDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;", "batteryInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;", "cameraInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "gpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;", "osBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "codecInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;", "deviceSecurityInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "packageManagerDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;", "settingsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "devicePersonalizationInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "fingerprintSensorInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "(Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;)V", "abiTypeSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AbiTypeSignal;", "getAbiTypeSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AbiTypeSignal;", "abiTypeSignal$delegate", "Lkotlin/Lazy;", "accessibilityEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AccessibilityEnabledSignal;", "getAccessibilityEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AccessibilityEnabledSignal;", "accessibilityEnabledSignal$delegate", "adbEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AdbEnabledSignal;", "getAdbEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AdbEnabledSignal;", "adbEnabledSignal$delegate", "alarmAlertPathSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AlarmAlertPathSignal;", "getAlarmAlertPathSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AlarmAlertPathSignal;", "alarmAlertPathSignal$delegate", "androidVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AndroidVersionSignal;", "getAndroidVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AndroidVersionSignal;", "androidVersionSignal$delegate", "applicationsListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ApplicationsListSignal;", "getApplicationsListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ApplicationsListSignal;", "applicationsListSignal$delegate", "availableLocalesSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "getAvailableLocalesSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "availableLocalesSignal$delegate", "batteryFullCapacitySignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacitySignal;", "getBatteryFullCapacitySignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacitySignal;", "batteryFullCapacitySignal$delegate", "batteryFullCapacityV2Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacityV2Signal;", "getBatteryFullCapacityV2Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacityV2Signal;", "batteryFullCapacityV2Signal$delegate", "batteryHealthSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryHealthSignal;", "getBatteryHealthSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryHealthSignal;", "batteryHealthSignal$delegate", "cameraListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CameraListSignal;", "getCameraListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CameraListSignal;", "cameraListSignal$delegate", "codecListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CodecListSignal;", "getCodecListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CodecListSignal;", "codecListSignal$delegate", "coresCountSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CoresCountSignal;", "getCoresCountSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CoresCountSignal;", "coresCountSignal$delegate", "dataRoamingEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DataRoamingEnabledSignal;", "getDataRoamingEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DataRoamingEnabledSignal;", "dataRoamingEnabledSignal$delegate", "dateFormatSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DateFormatSignal;", "getDateFormatSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DateFormatSignal;", "dateFormatSignal$delegate", "defaultInputMethodSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultInputMethodSignal;", "getDefaultInputMethodSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultInputMethodSignal;", "defaultInputMethodSignal$delegate", "defaultLanguageSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultLanguageSignal;", "getDefaultLanguageSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultLanguageSignal;", "defaultLanguageSignal$delegate", "developmentSettingsEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DevelopmentSettingsEnabledSignal;", "getDevelopmentSettingsEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DevelopmentSettingsEnabledSignal;", "developmentSettingsEnabledSignal$delegate", "encryptionStatusSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EncryptionStatusSignal;", "getEncryptionStatusSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EncryptionStatusSignal;", "encryptionStatusSignal$delegate", "endButtonBehaviourSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EndButtonBehaviourSignal;", "getEndButtonBehaviourSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EndButtonBehaviourSignal;", "endButtonBehaviourSignal$delegate", "fingerprintSensorStatusSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSensorStatusSignal;", "getFingerprintSensorStatusSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSensorStatusSignal;", "fingerprintSensorStatusSignal$delegate", "fingerprintSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSignal;", "getFingerprintSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSignal;", "fingerprintSignal$delegate", "fontScaleSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "getFontScaleSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "fontScaleSignal$delegate", "glesVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/GlesVersionSignal;", "getGlesVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/GlesVersionSignal;", "glesVersionSignal$delegate", "httpProxySignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/HttpProxySignal;", "getHttpProxySignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/HttpProxySignal;", "httpProxySignal$delegate", "inputDevicesSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesSignal;", "getInputDevicesSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesSignal;", "inputDevicesSignal$delegate", "inputDevicesV2Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesV2Signal;", "getInputDevicesV2Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesV2Signal;", "inputDevicesV2Signal$delegate", "isPinSecurityEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/IsPinSecurityEnabledSignal;", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/IsPinSecurityEnabledSignal;", "isPinSecurityEnabledSignal$delegate", "kernelVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/KernelVersionSignal;", "getKernelVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/KernelVersionSignal;", "kernelVersionSignal$delegate", "manufacturerNameSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ManufacturerNameSignal;", "getManufacturerNameSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ManufacturerNameSignal;", "manufacturerNameSignal$delegate", "modelNameSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ModelNameSignal;", "getModelNameSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ModelNameSignal;", "modelNameSignal$delegate", "procCpuInfoSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "getProcCpuInfoSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "procCpuInfoSignal$delegate", "procCpuInfoV2Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "getProcCpuInfoV2Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "procCpuInfoV2Signal$delegate", "regionCountrySignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RegionCountrySignal;", "getRegionCountrySignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RegionCountrySignal;", "regionCountrySignal$delegate", "ringtoneSourceSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RingtoneSourceSignal;", "getRingtoneSourceSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RingtoneSourceSignal;", "ringtoneSourceSignal$delegate", "rttCallingModeSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "getRttCallingModeSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "rttCallingModeSignal$delegate", "screenOffTimeoutSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ScreenOffTimeoutSignal;", "getScreenOffTimeoutSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ScreenOffTimeoutSignal;", "screenOffTimeoutSignal$delegate", "sdkVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SdkVersionSignal;", "getSdkVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SdkVersionSignal;", "sdkVersionSignal$delegate", "securityProvidersSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SecurityProvidersSignal;", "getSecurityProvidersSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SecurityProvidersSignal;", "securityProvidersSignal$delegate", "sensorsSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "getSensorsSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "sensorsSignal$delegate", "systemApplicationsListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "getSystemApplicationsListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "systemApplicationsListSignal$delegate", "textAutoPunctuateSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoPunctuateSignal;", "getTextAutoPunctuateSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoPunctuateSignal;", "textAutoPunctuateSignal$delegate", "textAutoReplaceEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoReplaceEnabledSignal;", "getTextAutoReplaceEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoReplaceEnabledSignal;", "textAutoReplaceEnabledSignal$delegate", "time12Or24Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/Time12Or24Signal;", "getTime12Or24Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/Time12Or24Signal;", "time12Or24Signal$delegate", "timezoneSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TimezoneSignal;", "getTimezoneSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TimezoneSignal;", "timezoneSignal$delegate", "totalInternalStorageSpaceSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalInternalStorageSpaceSignal;", "getTotalInternalStorageSpaceSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalInternalStorageSpaceSignal;", "totalInternalStorageSpaceSignal$delegate", "totalRamSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalRamSignal;", "getTotalRamSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalRamSignal;", "totalRamSignal$delegate", "touchExplorationEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TouchExplorationEnabledSignal;", "getTouchExplorationEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TouchExplorationEnabledSignal;", "touchExplorationEnabledSignal$delegate", "transitionAnimationScaleSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TransitionAnimationScaleSignal;", "getTransitionAnimationScaleSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TransitionAnimationScaleSignal;", "transitionAnimationScaleSignal$delegate", "windowAnimationScaleSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/WindowAnimationScaleSignal;", "getWindowAnimationScaleSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/WindowAnimationScaleSignal;", "windowAnimationScaleSignal$delegate", "getSignalsMatching", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class FingerprintingSignalsProvider
{
    private final Lazy abiTypeSignal$delegate;
    private final Lazy accessibilityEnabledSignal$delegate;
    private final Lazy adbEnabledSignal$delegate;
    private final Lazy alarmAlertPathSignal$delegate;
    private final Lazy androidVersionSignal$delegate;
    private final Lazy applicationsListSignal$delegate;
    private final Lazy availableLocalesSignal$delegate;
    private final Lazy batteryFullCapacitySignal$delegate;
    private final Lazy batteryFullCapacityV2Signal$delegate;
    private final Lazy batteryHealthSignal$delegate;
    private final BatteryInfoProvider batteryInfoProvider;
    private final CameraInfoProvider cameraInfoProvider;
    private final Lazy cameraListSignal$delegate;
    private final CodecInfoProvider codecInfoProvider;
    private final Lazy codecListSignal$delegate;
    private final Lazy coresCountSignal$delegate;
    private final CpuInfoProvider cpuInfoProvider;
    private final Lazy dataRoamingEnabledSignal$delegate;
    private final Lazy dateFormatSignal$delegate;
    private final Lazy defaultInputMethodSignal$delegate;
    private final Lazy defaultLanguageSignal$delegate;
    private final Lazy developmentSettingsEnabledSignal$delegate;
    private final DevicePersonalizationInfoProvider devicePersonalizationInfoProvider;
    private final DeviceSecurityInfoProvider deviceSecurityInfoProvider;
    private final Lazy encryptionStatusSignal$delegate;
    private final Lazy endButtonBehaviourSignal$delegate;
    private final FingerprintSensorInfoProvider fingerprintSensorInfoProvider;
    private final Lazy fingerprintSensorStatusSignal$delegate;
    private final Lazy fingerprintSignal$delegate;
    private final Lazy fontScaleSignal$delegate;
    private final Lazy glesVersionSignal$delegate;
    private final GpuInfoProvider gpuInfoProvider;
    private final Lazy httpProxySignal$delegate;
    private final InputDeviceDataSource inputDeviceDataSource;
    private final Lazy inputDevicesSignal$delegate;
    private final Lazy inputDevicesV2Signal$delegate;
    private final Lazy isPinSecurityEnabledSignal$delegate;
    private final Lazy kernelVersionSignal$delegate;
    private final Lazy manufacturerNameSignal$delegate;
    private final MemInfoProvider memInfoProvider;
    private final Lazy modelNameSignal$delegate;
    private final OsBuildInfoProvider osBuildInfoProvider;
    private final PackageManagerDataSource packageManagerDataSource;
    private final Lazy procCpuInfoSignal$delegate;
    private final Lazy procCpuInfoV2Signal$delegate;
    private final Lazy regionCountrySignal$delegate;
    private final Lazy ringtoneSourceSignal$delegate;
    private final Lazy rttCallingModeSignal$delegate;
    private final Lazy screenOffTimeoutSignal$delegate;
    private final Lazy sdkVersionSignal$delegate;
    private final Lazy securityProvidersSignal$delegate;
    private final SensorDataSource sensorsDataSource;
    private final Lazy sensorsSignal$delegate;
    private final SettingsDataSource settingsDataSource;
    private final Lazy systemApplicationsListSignal$delegate;
    private final Lazy textAutoPunctuateSignal$delegate;
    private final Lazy textAutoReplaceEnabledSignal$delegate;
    private final Lazy time12Or24Signal$delegate;
    private final Lazy timezoneSignal$delegate;
    private final Lazy totalInternalStorageSpaceSignal$delegate;
    private final Lazy totalRamSignal$delegate;
    private final Lazy touchExplorationEnabledSignal$delegate;
    private final Lazy transitionAnimationScaleSignal$delegate;
    private final Lazy windowAnimationScaleSignal$delegate;
    
    public FingerprintingSignalsProvider(final CpuInfoProvider cpuInfoProvider, final MemInfoProvider memInfoProvider, final SensorDataSource sensorsDataSource, final InputDeviceDataSource inputDeviceDataSource, final BatteryInfoProvider batteryInfoProvider, final CameraInfoProvider cameraInfoProvider, final GpuInfoProvider gpuInfoProvider, final OsBuildInfoProvider osBuildInfoProvider, final CodecInfoProvider codecInfoProvider, final DeviceSecurityInfoProvider deviceSecurityInfoProvider, final PackageManagerDataSource packageManagerDataSource, final SettingsDataSource settingsDataSource, final DevicePersonalizationInfoProvider devicePersonalizationInfoProvider, final FingerprintSensorInfoProvider fingerprintSensorInfoProvider) {
        Intrinsics.checkNotNullParameter((Object)cpuInfoProvider, "cpuInfoProvider");
        Intrinsics.checkNotNullParameter((Object)memInfoProvider, "memInfoProvider");
        Intrinsics.checkNotNullParameter((Object)sensorsDataSource, "sensorsDataSource");
        Intrinsics.checkNotNullParameter((Object)inputDeviceDataSource, "inputDeviceDataSource");
        Intrinsics.checkNotNullParameter((Object)batteryInfoProvider, "batteryInfoProvider");
        Intrinsics.checkNotNullParameter((Object)cameraInfoProvider, "cameraInfoProvider");
        Intrinsics.checkNotNullParameter((Object)gpuInfoProvider, "gpuInfoProvider");
        Intrinsics.checkNotNullParameter((Object)osBuildInfoProvider, "osBuildInfoProvider");
        Intrinsics.checkNotNullParameter((Object)deviceSecurityInfoProvider, "deviceSecurityInfoProvider");
        Intrinsics.checkNotNullParameter((Object)packageManagerDataSource, "packageManagerDataSource");
        Intrinsics.checkNotNullParameter((Object)settingsDataSource, "settingsDataSource");
        Intrinsics.checkNotNullParameter((Object)devicePersonalizationInfoProvider, "devicePersonalizationInfoProvider");
        Intrinsics.checkNotNullParameter((Object)fingerprintSensorInfoProvider, "fingerprintSensorInfoProvider");
        this.cpuInfoProvider = cpuInfoProvider;
        this.memInfoProvider = memInfoProvider;
        this.sensorsDataSource = sensorsDataSource;
        this.inputDeviceDataSource = inputDeviceDataSource;
        this.batteryInfoProvider = batteryInfoProvider;
        this.cameraInfoProvider = cameraInfoProvider;
        this.gpuInfoProvider = gpuInfoProvider;
        this.osBuildInfoProvider = osBuildInfoProvider;
        this.codecInfoProvider = codecInfoProvider;
        this.deviceSecurityInfoProvider = deviceSecurityInfoProvider;
        this.packageManagerDataSource = packageManagerDataSource;
        this.settingsDataSource = settingsDataSource;
        this.devicePersonalizationInfoProvider = devicePersonalizationInfoProvider;
        this.fingerprintSensorInfoProvider = fingerprintSensorInfoProvider;
        this.manufacturerNameSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$manufacturerNameSignal.FingerprintingSignalsProvider$manufacturerNameSignal$2(this));
        this.modelNameSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$modelNameSignal.FingerprintingSignalsProvider$modelNameSignal$2(this));
        this.totalRamSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$totalRamSignal.FingerprintingSignalsProvider$totalRamSignal$2(this));
        this.totalInternalStorageSpaceSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$totalInternalStorageSpaceSignal.FingerprintingSignalsProvider$totalInternalStorageSpaceSignal$2(this));
        this.procCpuInfoSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$procCpuInfoSignal.FingerprintingSignalsProvider$procCpuInfoSignal$2(this));
        this.procCpuInfoV2Signal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$procCpuInfoV2Signal.FingerprintingSignalsProvider$procCpuInfoV2Signal$2(this));
        this.sensorsSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$sensorsSignal.FingerprintingSignalsProvider$sensorsSignal$2(this));
        this.inputDevicesSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$inputDevicesSignal.FingerprintingSignalsProvider$inputDevicesSignal$2(this));
        this.inputDevicesV2Signal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$inputDevicesV2Signal.FingerprintingSignalsProvider$inputDevicesV2Signal$2(this));
        this.batteryHealthSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$batteryHealthSignal$2(this));
        this.batteryFullCapacitySignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$batteryFullCapacitySignal$2(this));
        this.batteryFullCapacityV2Signal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$batteryFullCapacityV2Signal$2(this));
        this.cameraListSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$cameraListSignal$2(this));
        this.glesVersionSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$glesVersionSignal.FingerprintingSignalsProvider$glesVersionSignal$2(this));
        this.abiTypeSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$abiTypeSignal$2(this));
        this.coresCountSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$coresCountSignal$2(this));
        this.fingerprintSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$fingerprintSignal$2(this));
        this.androidVersionSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$androidVersionSignal$2(this));
        this.sdkVersionSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$sdkVersionSignal.FingerprintingSignalsProvider$sdkVersionSignal$2(this));
        this.kernelVersionSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$kernelVersionSignal.FingerprintingSignalsProvider$kernelVersionSignal$2(this));
        this.encryptionStatusSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$encryptionStatusSignal$2(this));
        this.codecListSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$codecListSignal$2(this));
        this.securityProvidersSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$securityProvidersSignal.FingerprintingSignalsProvider$securityProvidersSignal$2(this));
        this.applicationsListSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$applicationsListSignal$2(this));
        this.systemApplicationsListSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$systemApplicationsListSignal.FingerprintingSignalsProvider$systemApplicationsListSignal$2(this));
        this.adbEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$adbEnabledSignal$2(this));
        this.developmentSettingsEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$developmentSettingsEnabledSignal$2(this));
        this.httpProxySignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$httpProxySignal.FingerprintingSignalsProvider$httpProxySignal$2(this));
        this.transitionAnimationScaleSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$transitionAnimationScaleSignal.FingerprintingSignalsProvider$transitionAnimationScaleSignal$2(this));
        this.windowAnimationScaleSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$windowAnimationScaleSignal.FingerprintingSignalsProvider$windowAnimationScaleSignal$2(this));
        this.dataRoamingEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$dataRoamingEnabledSignal$2(this));
        this.accessibilityEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$accessibilityEnabledSignal$2(this));
        this.defaultInputMethodSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$defaultInputMethodSignal$2(this));
        this.rttCallingModeSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$rttCallingModeSignal.FingerprintingSignalsProvider$rttCallingModeSignal$2(this));
        this.touchExplorationEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$touchExplorationEnabledSignal.FingerprintingSignalsProvider$touchExplorationEnabledSignal$2(this));
        this.alarmAlertPathSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$alarmAlertPathSignal$2(this));
        this.dateFormatSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$dateFormatSignal$2(this));
        this.endButtonBehaviourSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$endButtonBehaviourSignal$2(this));
        this.fontScaleSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$fontScaleSignal.FingerprintingSignalsProvider$fontScaleSignal$2(this));
        this.screenOffTimeoutSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$screenOffTimeoutSignal.FingerprintingSignalsProvider$screenOffTimeoutSignal$2(this));
        this.textAutoReplaceEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$textAutoReplaceEnabledSignal.FingerprintingSignalsProvider$textAutoReplaceEnabledSignal$2(this));
        this.textAutoPunctuateSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$textAutoPunctuateSignal.FingerprintingSignalsProvider$textAutoPunctuateSignal$2(this));
        this.time12Or24Signal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$time12Or24Signal.FingerprintingSignalsProvider$time12Or24Signal$2(this));
        this.isPinSecurityEnabledSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$isPinSecurityEnabledSignal.FingerprintingSignalsProvider$isPinSecurityEnabledSignal$2(this));
        this.fingerprintSensorStatusSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$fingerprintSensorStatusSignal$2(this));
        this.ringtoneSourceSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$ringtoneSourceSignal.FingerprintingSignalsProvider$ringtoneSourceSignal$2(this));
        this.availableLocalesSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$availableLocalesSignal$2(this));
        this.regionCountrySignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$regionCountrySignal.FingerprintingSignalsProvider$regionCountrySignal$2(this));
        this.defaultLanguageSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$defaultLanguageSignal$2(this));
        this.timezoneSignal$delegate = LazyKt.lazy((Function0)new FingerprintingSignalsProvider$timezoneSignal.FingerprintingSignalsProvider$timezoneSignal$2(this));
    }
    
    public final AbiTypeSignal getAbiTypeSignal() {
        return (AbiTypeSignal)this.abiTypeSignal$delegate.getValue();
    }
    
    public final AccessibilityEnabledSignal getAccessibilityEnabledSignal() {
        return (AccessibilityEnabledSignal)this.accessibilityEnabledSignal$delegate.getValue();
    }
    
    public final AdbEnabledSignal getAdbEnabledSignal() {
        return (AdbEnabledSignal)this.adbEnabledSignal$delegate.getValue();
    }
    
    public final AlarmAlertPathSignal getAlarmAlertPathSignal() {
        return (AlarmAlertPathSignal)this.alarmAlertPathSignal$delegate.getValue();
    }
    
    public final AndroidVersionSignal getAndroidVersionSignal() {
        return (AndroidVersionSignal)this.androidVersionSignal$delegate.getValue();
    }
    
    public final ApplicationsListSignal getApplicationsListSignal() {
        return (ApplicationsListSignal)this.applicationsListSignal$delegate.getValue();
    }
    
    public final AvailableLocalesSignal getAvailableLocalesSignal() {
        return (AvailableLocalesSignal)this.availableLocalesSignal$delegate.getValue();
    }
    
    public final BatteryFullCapacitySignal getBatteryFullCapacitySignal() {
        return (BatteryFullCapacitySignal)this.batteryFullCapacitySignal$delegate.getValue();
    }
    
    public final BatteryFullCapacityV2Signal getBatteryFullCapacityV2Signal() {
        return (BatteryFullCapacityV2Signal)this.batteryFullCapacityV2Signal$delegate.getValue();
    }
    
    public final BatteryHealthSignal getBatteryHealthSignal() {
        return (BatteryHealthSignal)this.batteryHealthSignal$delegate.getValue();
    }
    
    public final CameraListSignal getCameraListSignal() {
        return (CameraListSignal)this.cameraListSignal$delegate.getValue();
    }
    
    public final CodecListSignal getCodecListSignal() {
        return (CodecListSignal)this.codecListSignal$delegate.getValue();
    }
    
    public final CoresCountSignal getCoresCountSignal() {
        return (CoresCountSignal)this.coresCountSignal$delegate.getValue();
    }
    
    public final DataRoamingEnabledSignal getDataRoamingEnabledSignal() {
        return (DataRoamingEnabledSignal)this.dataRoamingEnabledSignal$delegate.getValue();
    }
    
    public final DateFormatSignal getDateFormatSignal() {
        return (DateFormatSignal)this.dateFormatSignal$delegate.getValue();
    }
    
    public final DefaultInputMethodSignal getDefaultInputMethodSignal() {
        return (DefaultInputMethodSignal)this.defaultInputMethodSignal$delegate.getValue();
    }
    
    public final DefaultLanguageSignal getDefaultLanguageSignal() {
        return (DefaultLanguageSignal)this.defaultLanguageSignal$delegate.getValue();
    }
    
    public final DevelopmentSettingsEnabledSignal getDevelopmentSettingsEnabledSignal() {
        return (DevelopmentSettingsEnabledSignal)this.developmentSettingsEnabledSignal$delegate.getValue();
    }
    
    public final EncryptionStatusSignal getEncryptionStatusSignal() {
        return (EncryptionStatusSignal)this.encryptionStatusSignal$delegate.getValue();
    }
    
    public final EndButtonBehaviourSignal getEndButtonBehaviourSignal() {
        return (EndButtonBehaviourSignal)this.endButtonBehaviourSignal$delegate.getValue();
    }
    
    public final FingerprintSensorStatusSignal getFingerprintSensorStatusSignal() {
        return (FingerprintSensorStatusSignal)this.fingerprintSensorStatusSignal$delegate.getValue();
    }
    
    public final FingerprintSignal getFingerprintSignal() {
        return (FingerprintSignal)this.fingerprintSignal$delegate.getValue();
    }
    
    public final FontScaleSignal getFontScaleSignal() {
        return (FontScaleSignal)this.fontScaleSignal$delegate.getValue();
    }
    
    public final GlesVersionSignal getGlesVersionSignal() {
        return (GlesVersionSignal)this.glesVersionSignal$delegate.getValue();
    }
    
    public final HttpProxySignal getHttpProxySignal() {
        return (HttpProxySignal)this.httpProxySignal$delegate.getValue();
    }
    
    public final InputDevicesSignal getInputDevicesSignal() {
        return (InputDevicesSignal)this.inputDevicesSignal$delegate.getValue();
    }
    
    public final InputDevicesV2Signal getInputDevicesV2Signal() {
        return (InputDevicesV2Signal)this.inputDevicesV2Signal$delegate.getValue();
    }
    
    public final KernelVersionSignal getKernelVersionSignal() {
        return (KernelVersionSignal)this.kernelVersionSignal$delegate.getValue();
    }
    
    public final ManufacturerNameSignal getManufacturerNameSignal() {
        return (ManufacturerNameSignal)this.manufacturerNameSignal$delegate.getValue();
    }
    
    public final ModelNameSignal getModelNameSignal() {
        return (ModelNameSignal)this.modelNameSignal$delegate.getValue();
    }
    
    public final ProcCpuInfoSignal getProcCpuInfoSignal() {
        return (ProcCpuInfoSignal)this.procCpuInfoSignal$delegate.getValue();
    }
    
    public final ProcCpuInfoV2Signal getProcCpuInfoV2Signal() {
        return (ProcCpuInfoV2Signal)this.procCpuInfoV2Signal$delegate.getValue();
    }
    
    public final RegionCountrySignal getRegionCountrySignal() {
        return (RegionCountrySignal)this.regionCountrySignal$delegate.getValue();
    }
    
    public final RingtoneSourceSignal getRingtoneSourceSignal() {
        return (RingtoneSourceSignal)this.ringtoneSourceSignal$delegate.getValue();
    }
    
    public final RttCallingModeSignal getRttCallingModeSignal() {
        return (RttCallingModeSignal)this.rttCallingModeSignal$delegate.getValue();
    }
    
    public final ScreenOffTimeoutSignal getScreenOffTimeoutSignal() {
        return (ScreenOffTimeoutSignal)this.screenOffTimeoutSignal$delegate.getValue();
    }
    
    public final SdkVersionSignal getSdkVersionSignal() {
        return (SdkVersionSignal)this.sdkVersionSignal$delegate.getValue();
    }
    
    public final SecurityProvidersSignal getSecurityProvidersSignal() {
        return (SecurityProvidersSignal)this.securityProvidersSignal$delegate.getValue();
    }
    
    public final SensorsSignal getSensorsSignal() {
        return (SensorsSignal)this.sensorsSignal$delegate.getValue();
    }
    
    public final List<FingerprintingSignal<?>> getSignalsMatching(final Fingerprinter$Version fingerprinter$Version, final StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter((Object)fingerprinter$Version, "version");
        Intrinsics.checkNotNullParameter((Object)stabilityLevel, "stabilityLevel");
        final List list = CollectionsKt.listOf((Object[])new Pair[] { TuplesKt.to((Object)ManufacturerNameSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$1(this)), TuplesKt.to((Object)ModelNameSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$2(this)), TuplesKt.to((Object)TotalRamSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$3(this)), TuplesKt.to((Object)TotalInternalStorageSpaceSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$4(this)), TuplesKt.to((Object)ProcCpuInfoSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$5(this)), TuplesKt.to((Object)ProcCpuInfoV2Signal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$6(this)), TuplesKt.to((Object)SensorsSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$7(this)), TuplesKt.to((Object)InputDevicesSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$8(this)), TuplesKt.to((Object)InputDevicesV2Signal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$9(this)), TuplesKt.to((Object)BatteryHealthSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$10(this)), TuplesKt.to((Object)BatteryFullCapacitySignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$11(this)), TuplesKt.to((Object)BatteryFullCapacityV2Signal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$12(this)), TuplesKt.to((Object)CameraListSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$13(this)), TuplesKt.to((Object)GlesVersionSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$14(this)), TuplesKt.to((Object)AbiTypeSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$15(this)), TuplesKt.to((Object)CoresCountSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$16(this)), TuplesKt.to((Object)FingerprintSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$17(this)), TuplesKt.to((Object)AndroidVersionSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$18(this)), TuplesKt.to((Object)SdkVersionSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$19(this)), TuplesKt.to((Object)KernelVersionSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$20(this)), TuplesKt.to((Object)EncryptionStatusSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$21(this)), TuplesKt.to((Object)CodecListSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$22(this)), TuplesKt.to((Object)SecurityProvidersSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$23(this)), TuplesKt.to((Object)ApplicationsListSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$24(this)), TuplesKt.to((Object)SystemApplicationsListSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$25(this)), TuplesKt.to((Object)AdbEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$26(this)), TuplesKt.to((Object)DevelopmentSettingsEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$27(this)), TuplesKt.to((Object)HttpProxySignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$28(this)), TuplesKt.to((Object)TransitionAnimationScaleSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$29(this)), TuplesKt.to((Object)WindowAnimationScaleSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$30(this)), TuplesKt.to((Object)DataRoamingEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$31(this)), TuplesKt.to((Object)AccessibilityEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$32(this)), TuplesKt.to((Object)DefaultInputMethodSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$33(this)), TuplesKt.to((Object)RttCallingModeSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$34(this)), TuplesKt.to((Object)TouchExplorationEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$35(this)), TuplesKt.to((Object)AlarmAlertPathSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$36(this)), TuplesKt.to((Object)DateFormatSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$37(this)), TuplesKt.to((Object)EndButtonBehaviourSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$38(this)), TuplesKt.to((Object)FontScaleSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$39(this)), TuplesKt.to((Object)ScreenOffTimeoutSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$40(this)), TuplesKt.to((Object)TextAutoReplaceEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$41(this)), TuplesKt.to((Object)TextAutoPunctuateSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$42(this)), TuplesKt.to((Object)Time12Or24Signal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$43(this)), TuplesKt.to((Object)IsPinSecurityEnabledSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$44(this)), TuplesKt.to((Object)FingerprintSensorStatusSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$45(this)), TuplesKt.to((Object)RingtoneSourceSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$46(this)), TuplesKt.to((Object)AvailableLocalesSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$47(this)), TuplesKt.to((Object)RegionCountrySignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$48(this)), TuplesKt.to((Object)DefaultLanguageSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$49(this)), TuplesKt.to((Object)TimezoneSignal.Companion.getInfo(), (Object)new FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$50(this)) });
        final Fingerprinter$Version v_1 = Fingerprinter$Version.V_1;
        List sortedWith;
        if (fingerprinter$Version.compareTo((Object)Fingerprinter$Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release()) <= 0 && fingerprinter$Version.compareTo((Object)v_1) >= 0) {
            sortedWith = CollectionsKt.sortedWith((Iterable)CollectionsKt.flatten((Iterable)CollectionsKt.listOf((Object[])new List[] { FingerprintingLegacySchemeSupportExtensions.INSTANCE.getHardwareSignals(this, fingerprinter$Version, stabilityLevel), FingerprintingLegacySchemeSupportExtensions.INSTANCE.getOsBuildSignals(this, fingerprinter$Version, stabilityLevel), FingerprintingLegacySchemeSupportExtensions.INSTANCE.getDeviceStateSignals(this, fingerprinter$Version, stabilityLevel), FingerprintingLegacySchemeSupportExtensions.INSTANCE.getInstalledAppsSignals(this, fingerprinter$Version, stabilityLevel) })), (Comparator)new FingerprintingSignalsProvider$getSignalsMatching$$inlined$sortedBy.FingerprintingSignalsProvider$getSignalsMatching$$inlined$sortedBy$1(list));
        }
        else {
            final Iterable iterable = (Iterable)list;
            final Collection collection = (Collection)new ArrayList();
            for (final Pair pair : iterable) {
                final FingerprintingSignal signalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(fingerprinter$Version, stabilityLevel, (FingerprintingSignal$Info)pair.getFirst(), (Function0)pair.getSecond());
                if (signalIfNeeded != null) {
                    collection.add((Object)signalIfNeeded);
                }
            }
            sortedWith = (List)collection;
        }
        return (List<FingerprintingSignal<?>>)sortedWith;
    }
    
    public final SystemApplicationsListSignal getSystemApplicationsListSignal() {
        return (SystemApplicationsListSignal)this.systemApplicationsListSignal$delegate.getValue();
    }
    
    public final TextAutoPunctuateSignal getTextAutoPunctuateSignal() {
        return (TextAutoPunctuateSignal)this.textAutoPunctuateSignal$delegate.getValue();
    }
    
    public final TextAutoReplaceEnabledSignal getTextAutoReplaceEnabledSignal() {
        return (TextAutoReplaceEnabledSignal)this.textAutoReplaceEnabledSignal$delegate.getValue();
    }
    
    public final Time12Or24Signal getTime12Or24Signal() {
        return (Time12Or24Signal)this.time12Or24Signal$delegate.getValue();
    }
    
    public final TimezoneSignal getTimezoneSignal() {
        return (TimezoneSignal)this.timezoneSignal$delegate.getValue();
    }
    
    public final TotalInternalStorageSpaceSignal getTotalInternalStorageSpaceSignal() {
        return (TotalInternalStorageSpaceSignal)this.totalInternalStorageSpaceSignal$delegate.getValue();
    }
    
    public final TotalRamSignal getTotalRamSignal() {
        return (TotalRamSignal)this.totalRamSignal$delegate.getValue();
    }
    
    public final TouchExplorationEnabledSignal getTouchExplorationEnabledSignal() {
        return (TouchExplorationEnabledSignal)this.touchExplorationEnabledSignal$delegate.getValue();
    }
    
    public final TransitionAnimationScaleSignal getTransitionAnimationScaleSignal() {
        return (TransitionAnimationScaleSignal)this.transitionAnimationScaleSignal$delegate.getValue();
    }
    
    public final WindowAnimationScaleSignal getWindowAnimationScaleSignal() {
        return (WindowAnimationScaleSignal)this.windowAnimationScaleSignal$delegate.getValue();
    }
    
    public final IsPinSecurityEnabledSignal isPinSecurityEnabledSignal() {
        return (IsPinSecurityEnabledSignal)this.isPinSecurityEnabledSignal$delegate.getValue();
    }
}
