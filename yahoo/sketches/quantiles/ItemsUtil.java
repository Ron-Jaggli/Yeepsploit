package com.yahoo.sketches.quantiles;

import java.util.Comparator;
import java.util.Arrays;
import com.yahoo.sketches.SketchesArgumentException;

final class ItemsUtil
{
    static final boolean $assertionsDisabled = false;
    static final int ITEMS_SER_VER = 3;
    static final int PRIOR_ITEMS_SER_VER = 2;
    
    private ItemsUtil() {
    }
    
    static void checkItemsSerVer(final int n) {
        if (n != 3 && n != 2) {
            throw new SketchesArgumentException("Possible corruption: Invalid Serialization Version: " + n);
        }
    }
    
    static <T> void processFullBaseBuffer(final ItemsSketch<T> itemsSketch) {
        final int baseBufferCount = itemsSketch.getBaseBufferCount();
        ItemsUpdateImpl.maybeGrowLevels(itemsSketch, itemsSketch.getN());
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        Arrays.sort(combinedBuffer, 0, baseBufferCount);
        ItemsUpdateImpl.inPlacePropagateCarry(0, null, 0, combinedBuffer, 0, true, (ItemsSketch<Object>)itemsSketch);
        Arrays.fill(combinedBuffer, itemsSketch.baseBufferCount_ = 0, itemsSketch.getK() * 2, (Object)null);
    }
    
    static <T> String toString(final boolean b, final boolean b2, final ItemsSketch<T> itemsSketch) {
        final StringBuilder sb = new StringBuilder();
        final String simpleName = itemsSketch.getClass().getSimpleName();
        final int baseBufferCount = itemsSketch.getBaseBufferCount();
        final int combinedBufferAllocatedCount = itemsSketch.getCombinedBufferAllocatedCount();
        final int k = itemsSketch.getK();
        final long bitPattern = itemsSketch.getBitPattern();
        if (b2) {
            sb.append(Util.LS).append("### ").append(simpleName).append(" DATA DETAIL: ").append(Util.LS);
            final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
            sb.append("   BaseBuffer   :");
            if (baseBufferCount > 0) {
                for (int i = 0; i < baseBufferCount; ++i) {
                    sb.append(' ').append(combinedBuffer[i]);
                }
            }
            sb.append(Util.LS);
            final int n = k * 2;
            if (combinedBufferAllocatedCount > n) {
                sb.append("   Valid | Level");
                for (int j = n; j < combinedBufferAllocatedCount; ++j) {
                    if (j % k == 0) {
                        int n2;
                        if (j > n) {
                            n2 = (j - n) / k;
                        }
                        else {
                            n2 = 0;
                        }
                        String s;
                        if ((1L << n2 & bitPattern) > 0L) {
                            s = "    T  ";
                        }
                        else {
                            s = "    F  ";
                        }
                        sb.append(Util.LS).append("   ").append(s).append(" ").append(String.format("%5d", new Object[] { n2 })).append(":");
                    }
                    sb.append(' ').append(combinedBuffer[j]);
                }
                sb.append(Util.LS);
            }
            sb.append("### END DATA DETAIL").append(Util.LS);
        }
        if (b) {
            final long n3 = itemsSketch.getN();
            final String format = String.format("%,d", new Object[] { n3 });
            final int computeNumLevelsNeeded = Util.computeNumLevelsNeeded(k, n3);
            final String format2 = String.format("%,d", new Object[] { combinedBufferAllocatedCount });
            int n4;
            if (itemsSketch.isEmpty()) {
                n4 = 8;
            }
            else {
                n4 = 16;
            }
            final String format3 = String.format("%.3f%%", new Object[] { Util.EpsilonFromK.getAdjustedEpsilon(k) * 100.0 });
            final String format4 = String.format("%,d", new Object[] { itemsSketch.getRetainedItems() });
            sb.append(Util.LS).append("### ").append(simpleName).append(" SUMMARY: ").append(Util.LS);
            sb.append("   K                            : ").append(k).append(Util.LS);
            sb.append("   N                            : ").append(format).append(Util.LS);
            sb.append("   BaseBufferCount              : ").append(baseBufferCount).append(Util.LS);
            sb.append("   CombinedBufferAllocatedCount : ").append(format2).append(Util.LS);
            sb.append("   Total Levels                 : ").append(computeNumLevelsNeeded).append(Util.LS);
            sb.append("   Valid Levels                 : ").append(Util.computeValidLevels(bitPattern)).append(Util.LS);
            sb.append("   Level Bit Pattern            : ").append(Long.toBinaryString(bitPattern)).append(Util.LS);
            sb.append("   Valid Samples                : ").append(format4).append(Util.LS);
            sb.append("   Preamble Bytes               : ").append(n4).append(Util.LS);
            sb.append("   Normalized Rank Error        : ").append(format3).append(Util.LS);
            sb.append("   Min Value                    : ").append(itemsSketch.getMinValue()).append(Util.LS);
            sb.append("   Max Value                    : ").append(itemsSketch.getMaxValue()).append(Util.LS);
            sb.append("### END SKETCH SUMMARY").append(Util.LS);
        }
        return sb.toString();
    }
    
    static final <T> void validateValues(final T[] array, final Comparator<? super T> comparator) {
        final int length = array.length;
        int i = 0;
        while (i < length - 1) {
            final T t = array[i];
            if (t != null) {
                ++i;
                final T t2 = array[i];
                if (t2 != null && comparator.compare((Object)t, (Object)t2) < 0) {
                    continue;
                }
            }
            throw new SketchesArgumentException("Values must be unique, monotonically increasing and not null.");
        }
    }
}
