package com.fingerprintjs.android.fingerprint.info_providers;

import kotlin.collections.MapsKt;
import kotlin.Result;
import com.fingerprintjs.android.fingerprint.tools.threading.safe.SafeKt;
import kotlin.jvm.functions.Function0;
import com.fingerprintjs.android.fingerprint.tools.parsers.CpuInfoParserKt;
import java.nio.charset.Charset;
import kotlin.io.FilesKt;
import java.util.List;
import kotlin.io.CloseableKt;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.jvm.internal.Intrinsics;
import java.util.Scanner;
import java.io.File;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0002J\b\u0010\f\u001a\u00020\nH\u0002¨\u0006\r" }, d2 = { "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProviderImpl;", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;", "()V", "abiType", "", "coresCount", "", "cpuInfo", "", "cpuInfoV2", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "getCpuInfo", "getCpuInfoV2", "fingerprint_release" }, k = 1, mv = { 1, 9, 0 }, xi = 48)
public final class CpuInfoProviderImpl implements CpuInfoProvider
{
    private final Map<String, String> getCpuInfo() {
        final Map map = (Map)new HashMap();
        final Closeable closeable = (Closeable)new Scanner(new File("/proc/cpuinfo"));
        try {
            final Scanner scanner = (Scanner)closeable;
            while (scanner.hasNextLine()) {
                final String nextLine = scanner.nextLine();
                Intrinsics.checkNotNull((Object)nextLine);
                final List split$default = StringsKt.split$default((CharSequence)nextLine, new String[] { ": " }, false, 0, 6, (Object)null);
                if (split$default.size() > 1) {
                    final CharSequence charSequence = (CharSequence)split$default.get(0);
                    int n = charSequence.length() - 1;
                    int i = 0;
                    int n2 = 0;
                    while (i <= n) {
                        int n3;
                        if (n2 == 0) {
                            n3 = i;
                        }
                        else {
                            n3 = n;
                        }
                        final boolean b = Intrinsics.compare((int)charSequence.charAt(n3), 32) <= 0;
                        if (n2 == 0) {
                            if (!b) {
                                n2 = 1;
                            }
                            else {
                                ++i;
                            }
                        }
                        else {
                            if (!b) {
                                break;
                            }
                            --n;
                        }
                    }
                    final String string = charSequence.subSequence(i, n + 1).toString();
                    final CharSequence charSequence2 = (CharSequence)split$default.get(1);
                    int n4 = charSequence2.length() - 1;
                    int j = 0;
                    int n5 = 0;
                    while (j <= n4) {
                        int n6;
                        if (n5 == 0) {
                            n6 = j;
                        }
                        else {
                            n6 = n4;
                        }
                        final boolean b2 = Intrinsics.compare((int)charSequence2.charAt(n6), 32) <= 0;
                        if (n5 == 0) {
                            if (!b2) {
                                n5 = 1;
                            }
                            else {
                                ++j;
                            }
                        }
                        else {
                            if (!b2) {
                                break;
                            }
                            --n4;
                        }
                    }
                    map.put((Object)string, (Object)charSequence2.subSequence(j, n4 + 1).toString());
                }
            }
            final Unit instance = Unit.INSTANCE;
            CloseableKt.closeFinally(closeable, (Throwable)null);
            return (Map<String, String>)map;
        }
        finally {
            try {}
            finally {
                final Throwable t;
                CloseableKt.closeFinally(closeable, t);
            }
        }
    }
    
    private final CpuInfo getCpuInfoV2() {
        return CpuInfoParserKt.parseCpuInfo(FilesKt.readText$default(new File("/proc/cpuinfo"), (Charset)null, 1, (Object)null));
    }
    
    @Override
    public String abiType() {
        Object safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)CpuInfoProviderImpl$abiType.CpuInfoProviderImpl$abiType$1.INSTANCE, 1, (Object)null))) {
            safeWithTimeout$default = "";
        }
        return (String)safeWithTimeout$default;
    }
    
    @Override
    public int coresCount() {
        Object o;
        if (Result.isFailure-impl(o = SafeKt.safeWithTimeout$default(0L, (Function0)CpuInfoProviderImpl$coresCount.CpuInfoProviderImpl$coresCount$1.INSTANCE, 1, (Object)null))) {
            o = 0;
        }
        return ((Number)o).intValue();
    }
    
    @Override
    public Map<String, String> cpuInfo() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new CpuInfoProviderImpl$cpuInfo.CpuInfoProviderImpl$cpuInfo$1(this), 1, (Object)null);
        final Map emptyMap = MapsKt.emptyMap();
        Map map = (Map)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            map = emptyMap;
        }
        return (Map<String, String>)map;
    }
    
    @Override
    public CpuInfo cpuInfoV2() {
        final Object safeWithTimeout$default = SafeKt.safeWithTimeout$default(0L, (Function0)new CpuInfoProviderImpl$cpuInfoV2.CpuInfoProviderImpl$cpuInfoV2$1(this), 1, (Object)null);
        final CpuInfo empty = CpuInfo.Companion.getEMPTY();
        CpuInfo cpuInfo = (CpuInfo)safeWithTimeout$default;
        if (Result.isFailure-impl(safeWithTimeout$default)) {
            cpuInfo = empty;
        }
        return cpuInfo;
    }
}
