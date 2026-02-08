package com.yahoo.sketches.quantiles;

import java.util.Arrays;
import java.util.Comparator;

class ItemsPmfCdfImpl
{
    static final boolean $assertionsDisabled = false;
    
    static <T> void bilinearTimeIncrementHistogramCounters(final T[] array, final int n, final int n2, final long n3, final T[] array2, final long[] array3, final Comparator<? super T> comparator) {
        for (int i = 0; i < n2; ++i) {
            T t;
            int n4;
            for (t = array[i + n], n4 = 0; n4 < array2.length && comparator.compare((Object)t, (Object)array2[n4]) >= 0; ++n4) {}
            array3[n4] += n3;
        }
    }
    
    static <T> double[] getPMFOrCDF(final ItemsSketch<T> itemsSketch, final T[] array, final boolean b) {
        final long[] internalBuildHistogram = internalBuildHistogram(array, itemsSketch);
        final int length = internalBuildHistogram.length;
        final double[] array2 = new double[length];
        final double n = (double)itemsSketch.getN();
        int i = 0;
        final int n2 = 0;
        if (b) {
            long n3 = 0L;
            for (int j = n2; j < length; ++j) {
                n3 += internalBuildHistogram[j];
                array2[j] = n3 / n;
            }
        }
        else {
            while (i < length) {
                array2[i] = internalBuildHistogram[i] / n;
                ++i;
            }
        }
        return array2;
    }
    
    private static <T> long[] internalBuildHistogram(final T[] array, final ItemsSketch<T> itemsSketch) {
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        final int baseBufferCount = itemsSketch.getBaseBufferCount();
        ItemsUtil.validateValues(array, itemsSketch.getComparator());
        final int length = array.length;
        final long[] array2 = new long[length + 1];
        if (length < 50) {
            bilinearTimeIncrementHistogramCounters(combinedBuffer, 0, baseBufferCount, 1L, array, array2, itemsSketch.getComparator());
        }
        else {
            Arrays.sort(combinedBuffer, 0, baseBufferCount);
            linearTimeIncrementHistogramCounters(combinedBuffer, 0, baseBufferCount, 1L, array, array2, itemsSketch.getComparator());
        }
        long bitPattern = itemsSketch.getBitPattern();
        final int k = itemsSketch.getK();
        int n = 0;
        long n2 = 1L;
        while (bitPattern != 0L) {
            n2 += n2;
            if ((0x1L & bitPattern) > 0L) {
                linearTimeIncrementHistogramCounters(combinedBuffer, (n + 2) * k, k, n2, array, array2, itemsSketch.getComparator());
            }
            ++n;
            bitPattern >>>= 1;
        }
        return array2;
    }
    
    static <T> void linearTimeIncrementHistogramCounters(final T[] array, final int n, final int n2, final long n3, final T[] array2, final long[] array3, final Comparator<? super T> comparator) {
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2 && n5 < array2.length) {
            if (comparator.compare((Object)array[n4 + n], (Object)array2[n5]) < 0) {
                array3[n5] += n3;
                ++n4;
            }
            else {
                ++n5;
            }
        }
        if (n5 == array2.length) {
            array3[n5] += n3 * (n2 - n4);
        }
    }
}
