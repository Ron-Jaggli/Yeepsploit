package com.yahoo.sketches.quantiles;

import com.yahoo.sketches.SketchesArgumentException;
import com.yahoo.sketches.Util;
import java.util.Arrays;
import java.util.Comparator;

final class ItemsMergeImpl
{
    static final boolean $assertionsDisabled = false;
    
    private ItemsMergeImpl() {
    }
    
    static <T> void blockyTandemMergeSort(final T[] array, final long[] array2, final int n, final int n2, final Comparator<? super T> comparator) {
        if (n <= n2) {
            return;
        }
        int n4;
        final int n3 = n4 = n / n2;
        if (n3 * n2 < n) {
            n4 = n3 + 1;
        }
        blockyTandemMergeSortRecursion(Arrays.copyOf((Object[])array, n), Arrays.copyOf(array2, n), array, array2, 0, n4, n2, n, (java.util.Comparator<? super Object>)comparator);
    }
    
    private static <T> void blockyTandemMergeSortRecursion(final T[] array, final long[] array2, final T[] array3, final long[] array4, int n, int n2, final int n3, final int n4, final Comparator<? super T> comparator) {
        if (n2 == 1) {
            return;
        }
        final int n5 = n2 / 2;
        final int n6 = n2 - n5;
        final int n7 = n + n5;
        blockyTandemMergeSortRecursion(array3, array4, (Object[])array, array2, n, n5, n3, n4, (java.util.Comparator<? super Object>)comparator);
        blockyTandemMergeSortRecursion(array3, array4, (Object[])array, array2, n7, n6, n3, n4, (java.util.Comparator<? super Object>)comparator);
        n2 = n * n3;
        final int n8 = n7 * n3;
        n = n6 * n3;
        if (n8 + n > n4) {
            n = n4 - n8;
        }
        tandemMerge(array, array2, n2, n5 * n3, n8, n, array3, array4, n2, comparator);
    }
    
    static <T> void downSamplingMergeInto(final ItemsSketch<T> itemsSketch, final ItemsSketch<T> itemsSketch2) {
        final int k = itemsSketch2.getK();
        final int i = itemsSketch.getK();
        if (i % k == 0) {
            final int n = i / k;
            Util.checkIfPowerOf2(n, "source.getK()/target.getK() ratio");
            final int numberOfTrailingZeros = Integer.numberOfTrailingZeros(n);
            final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
            final Object[] combinedBuffer2 = itemsSketch.getCombinedBuffer();
            final long n_ = itemsSketch2.getN() + itemsSketch.getN();
            for (int j = 0; j < itemsSketch.getBaseBufferCount(); ++j) {
                itemsSketch2.update((T)combinedBuffer2[j]);
            }
            ItemsUpdateImpl.maybeGrowLevels(itemsSketch2, n_);
            final Object[] array = new Object[k * 2];
            final Object[] array2 = new Object[k];
            long bitPattern = itemsSketch.getBitPattern();
            int n2 = 0;
            while (bitPattern != 0L) {
                if ((bitPattern & 0x1L) > 0L) {
                    justZipWithStride(combinedBuffer, (n2 + 2) * i, array2, 0, k, n);
                    ItemsUpdateImpl.inPlacePropagateCarry(n2 + numberOfTrailingZeros, array2, 0, array, 0, false, (ItemsSketch<Object>)itemsSketch2);
                }
                ++n2;
                bitPattern >>>= 1;
            }
            itemsSketch2.n_ = n_;
            Object maxValue = itemsSketch.getMaxValue();
            final Object minValue = itemsSketch.getMinValue();
            final Object maxValue2 = itemsSketch2.getMaxValue();
            final Object minValue2 = itemsSketch2.getMinValue();
            if (maxValue != null && maxValue2 != null) {
                if (itemsSketch.getComparator().compare(maxValue, maxValue2) <= 0) {
                    maxValue = maxValue2;
                }
                itemsSketch2.maxValue_ = (T)maxValue;
            }
            else if (maxValue2 == null) {
                itemsSketch2.maxValue_ = (T)maxValue;
            }
            if (minValue != null && minValue2 != null) {
                Object minValue_ = minValue;
                if (itemsSketch.getComparator().compare(minValue, minValue2) > 0) {
                    minValue_ = minValue2;
                }
                itemsSketch2.minValue_ = (T)minValue_;
            }
            else if (minValue2 == null) {
                itemsSketch2.minValue_ = (T)minValue;
            }
            return;
        }
        throw new SketchesArgumentException("source.getK() must equal target.getK() * 2^(nonnegative integer).");
    }
    
    private static <T> void justZipWithStride(final T[] array, int i, final T[] array2, final int n, final int n2, final int n3) {
        int n4 = i + ItemsSketch.rand.nextInt(n3);
        for (i = n; i < n2 + n; ++i) {
            array2[i] = array[n4];
            n4 += n3;
        }
    }
    
    static <T> void mergeInto(final ItemsSketch<T> itemsSketch, final ItemsSketch<T> itemsSketch2) {
        final int k = itemsSketch.getK();
        final int i = itemsSketch2.getK();
        final long n = itemsSketch.getN();
        final long n2 = itemsSketch2.getN();
        if (k != i) {
            downSamplingMergeInto((ItemsSketch<Object>)itemsSketch, (ItemsSketch<Object>)itemsSketch2);
            return;
        }
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        final long n_ = n2 + n;
        for (int j = 0; j < itemsSketch.getBaseBufferCount(); ++j) {
            itemsSketch2.update(combinedBuffer[j]);
        }
        ItemsUpdateImpl.maybeGrowLevels((ItemsSketch<Object>)itemsSketch2, n_);
        final Object[] array = new Object[i * 2];
        long bitPattern = itemsSketch.getBitPattern();
        int n3 = 0;
        while (bitPattern != 0L) {
            if ((0x1L & bitPattern) > 0L) {
                ItemsUpdateImpl.inPlacePropagateCarry(n3, combinedBuffer, (n3 + 2) * i, array, 0, false, (ItemsSketch<Object>)itemsSketch2);
            }
            ++n3;
            bitPattern >>>= 1;
        }
        itemsSketch2.n_ = n_;
        Object maxValue = itemsSketch.getMaxValue();
        final Object minValue = itemsSketch.getMinValue();
        final Object maxValue2 = itemsSketch2.getMaxValue();
        final Object minValue2 = itemsSketch2.getMinValue();
        if (maxValue != null && maxValue2 != null) {
            if (itemsSketch.getComparator().compare(maxValue, maxValue2) <= 0) {
                maxValue = maxValue2;
            }
            itemsSketch2.maxValue_ = (T)maxValue;
        }
        else if (maxValue2 == null) {
            itemsSketch2.maxValue_ = (T)maxValue;
        }
        if (minValue != null && minValue2 != null) {
            Object minValue_ = minValue;
            if (itemsSketch.getComparator().compare(minValue, minValue2) > 0) {
                minValue_ = minValue2;
            }
            itemsSketch2.minValue_ = (T)minValue_;
        }
        else if (minValue2 == null) {
            itemsSketch2.minValue_ = (T)minValue;
        }
    }
    
    private static <T> void tandemMerge(final T[] array, final long[] array2, int n, int n2, int n3, int n4, final T[] array3, final long[] array4, int n5, final Comparator<? super T> comparator) {
        n2 += n;
        n4 += n3;
        while (n < n2 && n3 < n4) {
            if (comparator.compare((Object)array[n3], (Object)array[n]) < 0) {
                array3[n5] = array[n3];
                array4[n5] = array2[n3];
                ++n5;
                ++n3;
            }
            else {
                array3[n5] = array[n];
                array4[n5] = array2[n];
                ++n5;
                ++n;
            }
        }
        if (n < n2) {
            n2 -= n;
            System.arraycopy((Object)array, n, (Object)array3, n5, n2);
            System.arraycopy((Object)array2, n, (Object)array4, n5, n2);
        }
        else {
            n = n4 - n3;
            System.arraycopy((Object)array, n3, (Object)array3, n5, n);
            System.arraycopy((Object)array2, n3, (Object)array4, n5, n);
        }
    }
}
