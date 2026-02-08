package com.fingerprintjs.android.fingerprint.tools.parsers;

import kotlin.text.CharsKt;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import java.util.List;
import kotlin.TuplesKt;
import java.util.ArrayList;
import kotlin.text.StringsKt;
import kotlin.collections.CollectionsKt;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "SINGLE_PROCESSOR_KEY", "", "parseCpuInfo", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "contents", "fingerprint_release" }, k = 2, mv = { 1, 9, 0 }, xi = 48)
public final class CpuInfoParserKt
{
    private static final String SINGLE_PROCESSOR_KEY = "processor";
    
    public static final CpuInfo parseCpuInfo(String s) {
        Intrinsics.checkNotNullParameter((Object)s, "contents");
        final Iterable iterable = (Iterable)CollectionsKt.plus((Collection)CollectionsKt.plus((Collection)CollectionsKt.listOf((Object)""), (Iterable)StringsKt.lines((CharSequence)s)), (Iterable)CollectionsKt.listOf((Object)""));
        final Collection collection = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            collection.add((Object)TuplesKt.to((Object)next, (Object)n));
            ++n;
        }
        final List filterNotNull = CollectionsKt.filterNotNull((Iterable)CollectionsKt.windowed((Iterable)collection, 2, 1, false, (Function1)CpuInfoParserKt$parseCpuInfo$repeatedBlankLinesIndices.CpuInfoParserKt$parseCpuInfo$repeatedBlankLinesIndices$2.INSTANCE));
        final Collection collection2 = (Collection)new ArrayList();
        final Iterator iterator2 = iterable.iterator();
        int n2 = 0;
        while (iterator2.hasNext()) {
            final Object next2 = iterator2.next();
            if (n2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            s = (String)next2;
            if (!filterNotNull.contains((Object)n2)) {
                collection2.add(next2);
            }
            ++n2;
        }
        final List list = (List)collection2;
        final Iterable iterable2 = (Iterable)list;
        final Collection collection3 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        final Iterator iterator3 = iterable2.iterator();
        int n3 = 0;
        while (iterator3.hasNext()) {
            final Object next3 = iterator3.next();
            if (n3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String s2 = (String)next3;
            Object value = n3;
            ((Number)value).intValue();
            if (!StringsKt.isBlank((CharSequence)s2)) {
                value = null;
            }
            collection3.add(value);
            ++n3;
        }
        final Iterable iterable3 = (Iterable)CollectionsKt.windowed((Iterable)CollectionsKt.filterNotNull((Iterable)collection3), 2, 1, false, (Function1)new CpuInfoParserKt$parseCpuInfo$sectionsOfLines.CpuInfoParserKt$parseCpuInfo$sectionsOfLines$1(list));
        final Collection collection4 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable3, 10));
        for (final Iterable iterable4 : iterable3) {
            final Collection collection5 = (Collection)new ArrayList();
            final Iterator iterator5 = iterable4.iterator();
            while (iterator5.hasNext()) {
                final Pair<String, String> cpuInfo$parseLine = parseCpuInfo$parseLine((String)iterator5.next());
                if (cpuInfo$parseLine != null) {
                    collection5.add((Object)cpuInfo$parseLine);
                }
            }
            collection4.add((Object)collection5);
        }
        final Iterable iterable5 = (Iterable)collection4;
        final Collection collection6 = (Collection)new ArrayList();
        for (final Object next4 : iterable5) {
            if (!((Collection)next4).isEmpty()) {
                collection6.add(next4);
            }
        }
        final Iterable iterable6 = (Iterable)collection6;
        final Collection collection7 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable6, 10));
        final Iterator iterator7 = iterable6.iterator();
        while (iterator7.hasNext()) {
            collection7.add((Object)parseCpuInfo$extractProcessorInfo((List<Pair<String, String>>)iterator7.next()));
        }
        final Iterable iterable7 = (Iterable)collection7;
        final Collection collection8 = (Collection)new ArrayList();
        for (final Object next5 : iterable7) {
            if (!((Collection)next5).isEmpty()) {
                collection8.add(next5);
            }
        }
        final Iterable iterable8 = (Iterable)collection8;
        final Collection collection9 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable8, 10));
        for (final Iterable iterable9 : iterable8) {
            final Collection collection10 = (Collection)new ArrayList();
            for (final Object next6 : iterable9) {
                if (!parseCpuInfo$isSingleProcessorPair((Pair<String, String>)next6)) {
                    collection10.add(next6);
                }
            }
            collection9.add((Object)collection10);
        }
        final List list2 = (List)collection9;
        final Collection collection11 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable6, 10));
        final Iterator iterator11 = iterable6.iterator();
        while (iterator11.hasNext()) {
            collection11.add((Object)parseCpuInfo$extractCommonInfo((List<Pair<String, String>>)iterator11.next()));
        }
        final Iterable iterable10 = (Iterable)collection11;
        final Collection collection12 = (Collection)new ArrayList();
        for (final Object next7 : iterable10) {
            if (!((Collection)next7).isEmpty()) {
                collection12.add(next7);
            }
        }
        return new CpuInfo(CollectionsKt.flatten((Iterable)collection12), list2);
    }
    
    private static final List<Pair<String, String>> parseCpuInfo$extractCommonInfo(final List<Pair<String, String>> list) {
        final Iterable iterable = (Iterable)list;
        final ArrayList list2 = new ArrayList();
        for (final Object next : iterable) {
            if (parseCpuInfo$isSingleProcessorPair((Pair<String, String>)next)) {
                break;
            }
            list2.add(next);
        }
        return (List<Pair<String, String>>)list2;
    }
    
    private static final List<Pair<String, String>> parseCpuInfo$extractProcessorInfo(final List<Pair<String, String>> list) {
        final Iterable iterable = (Iterable)list;
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n != 0) {
                list2.add(next);
            }
            else {
                if (!parseCpuInfo$isSingleProcessorPair((Pair<String, String>)next)) {
                    continue;
                }
                list2.add(next);
                n = 1;
            }
        }
        return (List<Pair<String, String>>)list2;
    }
    
    private static final boolean parseCpuInfo$isSingleProcessorPair(final Pair<String, String> pair) {
        final boolean equal = Intrinsics.areEqual(pair.getFirst(), (Object)"processor");
        boolean b = false;
        if (equal) {
            final CharSequence charSequence = (CharSequence)pair.getSecond();
            for (int i = 0; i < charSequence.length(); ++i) {
                if (!Character.isDigit(charSequence.charAt(i))) {
                    b = b;
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    private static final Pair<String, String> parseCpuInfo$parseLine(String substring) {
        List split$default = StringsKt.split$default((CharSequence)substring, new String[] { ":" }, false, 2, 2, (Object)null);
        final int size = split$default.size();
        Pair to = null;
        if (size != 2) {
            split$default = null;
        }
        if (split$default != null) {
            final Iterable iterable = (Iterable)split$default;
            final Collection collection = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            final Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                substring = (String)iterator.next();
                final int length = substring.length();
                int n = 0;
                String s;
                while (true) {
                    s = "";
                    if (n >= length) {
                        substring = "";
                        break;
                    }
                    if (!CharsKt.isWhitespace(substring.charAt(n))) {
                        substring = substring.substring(n);
                        Intrinsics.checkNotNullExpressionValue((Object)substring, "substring(...)");
                        break;
                    }
                    ++n;
                }
                int lastIndex = StringsKt.getLastIndex((CharSequence)substring);
                String substring2;
                while (true) {
                    substring2 = s;
                    if (-1 >= lastIndex) {
                        break;
                    }
                    if (!CharsKt.isWhitespace(substring.charAt(lastIndex))) {
                        substring2 = substring.substring(0, lastIndex + 1);
                        Intrinsics.checkNotNullExpressionValue((Object)substring2, "substring(...)");
                        break;
                    }
                    --lastIndex;
                }
                collection.add((Object)substring2);
            }
            final List list = (List)collection;
            to = TuplesKt.to(list.get(0), list.get(1));
        }
        return (Pair<String, String>)to;
    }
}
