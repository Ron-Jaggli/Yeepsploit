package com.yahoo.sketches.quantiles;

import java.util.Arrays;
import java.util.Comparator;

final class ItemsUpdateImpl
{
    static final boolean $assertionsDisabled = false;
    
    private ItemsUpdateImpl() {
    }
    
    static <T> void inPlacePropagateCarry(final int n, final T[] array, int n2, final T[] array2, final int n3, final boolean b, final ItemsSketch<T> itemsSketch) {
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        final long bitPattern = itemsSketch.getBitPattern();
        final int k = itemsSketch.getK();
        final int lowestZeroBitStarting = Util.lowestZeroBitStartingAt(bitPattern, n);
        if (b) {
            zipSize2KBuffer(array2, n3, combinedBuffer, (lowestZeroBitStarting + 2) * k, k);
        }
        else {
            System.arraycopy((Object)array, n2, (Object)combinedBuffer, (lowestZeroBitStarting + 2) * k, k);
        }
        int i;
        int n4;
        int n5;
        for (i = n, n2 = lowestZeroBitStarting; i < n2; ++i) {
            n4 = (i + 2) * k;
            n5 = (n2 + 2) * k;
            mergeTwoSizeKBuffers(combinedBuffer, n4, combinedBuffer, n5, array2, n3, k, itemsSketch.getComparator());
            zipSize2KBuffer(array2, n3, combinedBuffer, n5, k);
            Arrays.fill(combinedBuffer, n4, (i + 3) * k, (Object)null);
        }
        itemsSketch.bitPattern_ = bitPattern + (1L << n);
    }
    
    static <T> void maybeGrowLevels(final ItemsSketch<T> itemsSketch, final long n) {
        final int k = itemsSketch.getK();
        final int computeNumLevelsNeeded = Util.computeNumLevelsNeeded(k, n);
        if (computeNumLevelsNeeded == 0) {
            return;
        }
        final int combinedBufferItemCapacity_ = (computeNumLevelsNeeded + 2) * k;
        if (combinedBufferItemCapacity_ <= itemsSketch.getCombinedBufferAllocatedCount()) {
            return;
        }
        itemsSketch.combinedBuffer_ = Arrays.copyOf(itemsSketch.getCombinedBuffer(), combinedBufferItemCapacity_);
        itemsSketch.combinedBufferItemCapacity_ = combinedBufferItemCapacity_;
    }
    
    private static <T> void mergeTwoSizeKBuffers(final T[] array, int n, final T[] array2, int n2, final T[] array3, int n3, int n4, final Comparator<? super T> comparator) {
        final int n5 = n + n4;
        n4 += n2;
        while (n < n5 && n2 < n4) {
            if (comparator.compare((Object)array2[n2], (Object)array[n]) < 0) {
                array3[n3] = array2[n2];
                ++n3;
                ++n2;
            }
            else {
                array3[n3] = array[n];
                ++n3;
                ++n;
            }
        }
        if (n < n5) {
            System.arraycopy((Object)array, n, (Object)array3, n3, n5 - n);
        }
        else {
            System.arraycopy((Object)array, n2, (Object)array3, n3, n4 - n2);
        }
    }
    
    private static void zipSize2KBuffer(final Object[] array, int i, final Object[] array2, final int n, final int n2) {
        int n3 = i + (ItemsSketch.rand.nextBoolean() ? 1 : 0);
        for (i = n; i < n2 + n; ++i) {
            array2[i] = array[n3];
            n3 += 2;
        }
    }
}
