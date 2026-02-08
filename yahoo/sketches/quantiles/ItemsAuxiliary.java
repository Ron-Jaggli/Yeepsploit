package com.yahoo.sketches.quantiles;

import java.util.Arrays;
import java.util.Comparator;

final class ItemsAuxiliary<T>
{
    static final boolean $assertionsDisabled = false;
    final long[] auxCumWtsArr_;
    final long auxN_;
    final Object[] auxSamplesArr_;
    
    ItemsAuxiliary(final ItemsSketch<T> itemsSketch) {
        final int k = itemsSketch.getK();
        final long n = itemsSketch.getN();
        final long bitPattern = itemsSketch.getBitPattern();
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        final int baseBufferCount = itemsSketch.getBaseBufferCount();
        final int retainedItems = itemsSketch.getRetainedItems();
        final Object[] auxSamplesArr_ = new Object[retainedItems];
        final int n2 = retainedItems + 1;
        final long[] auxCumWtsArr_ = new long[n2];
        populateFromItemsSketch(k, n, bitPattern, combinedBuffer, baseBufferCount, retainedItems, auxSamplesArr_, auxCumWtsArr_, itemsSketch.getComparator());
        ItemsMergeImpl.blockyTandemMergeSort(auxSamplesArr_, auxCumWtsArr_, retainedItems, k, itemsSketch.getComparator());
        long n3 = 0L;
        long n4;
        for (int i = 0; i < n2; ++i, n3 += n4) {
            n4 = auxCumWtsArr_[i];
            auxCumWtsArr_[i] = n3;
        }
        this.auxN_ = n;
        this.auxSamplesArr_ = auxSamplesArr_;
        this.auxCumWtsArr_ = auxCumWtsArr_;
    }
    
    private T approximatelyAnswerPositionalQuery(final long n) {
        return (T)this.auxSamplesArr_[chunkContainingPos(this.auxCumWtsArr_, n)];
    }
    
    static int chunkContainingPos(final long[] array, final long n) {
        final int n2 = array.length - 1;
        final long n3 = array[n2];
        return searchForChunkContainingPos(array, n, 0, n2);
    }
    
    private static final <T> void populateFromItemsSketch(int i, long n, long n2, final T[] array, final int n3, final int n4, final T[] array2, final long[] array3, final Comparator<? super T> comparator) {
        final int n5 = 0;
        n = 1L;
        int n6 = 0;
        int n7 = 0;
        while (n2 != 0L) {
            n *= 2L;
            int n8 = n6;
            if ((n2 & 0x1L) > 0L) {
                int n9 = 0;
                while (true) {
                    n8 = n6;
                    if (n9 >= i) {
                        break;
                    }
                    array2[n6] = array[n9 + (n7 + 2) * i];
                    array3[n6] = n;
                    ++n6;
                    ++n9;
                }
            }
            ++n7;
            n2 >>>= 1;
            n6 = n8;
        }
        int n10 = n6;
        for (i = n5; i < n3; ++i) {
            array2[n10] = array[i];
            array3[n10] = 1L;
            ++n10;
        }
        Arrays.sort((Object[])array2, n6, n4, (Comparator)comparator);
        array3[n4] = 0L;
    }
    
    static long posOfPhi(final double n, final long n2) {
        long n3;
        if ((n3 = (long)Math.floor(n * n2)) == n2) {
            n3 = n2 - 1L;
        }
        return n3;
    }
    
    private static int searchForChunkContainingPos(final long[] array, final long n, final int n2, final int n3) {
        if (n2 + 1 == n3) {
            return n2;
        }
        final int n4 = (n3 - n2) / 2 + n2;
        if (array[n4] <= n) {
            return searchForChunkContainingPos(array, n, n4, n3);
        }
        return searchForChunkContainingPos(array, n, n2, n4);
    }
    
    T getQuantile(final double n) {
        final long auxN_ = this.auxN_;
        if (auxN_ <= 0L) {
            return null;
        }
        return this.approximatelyAnswerPositionalQuery(posOfPhi(n, auxN_));
    }
}
