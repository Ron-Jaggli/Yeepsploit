package com.yahoo.sketches.quantiles;

import com.yahoo.sketches.ArrayOfItemsSerDe;
import com.yahoo.sketches.Family;
import com.yahoo.memory.WritableMemory;
import java.util.Arrays;
import java.lang.reflect.Array;

final class ItemsByteArrayImpl
{
    private ItemsByteArrayImpl() {
    }
    
    private static <T> T[] combinedBufferToItemsArray(final ItemsSketch<T> itemsSketch, final boolean b) {
        final int retainedItems = itemsSketch.getRetainedItems();
        final T minValue = itemsSketch.getMinValue();
        final Object[] array = (Object[])Array.newInstance((Class)minValue.getClass(), retainedItems + 2);
        int n = 0;
        array[0] = minValue;
        array[1] = itemsSketch.getMaxValue();
        final int baseBufferCount = itemsSketch.getBaseBufferCount();
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        System.arraycopy((Object)combinedBuffer, 0, (Object)array, 2, baseBufferCount);
        long bitPattern = itemsSketch.getBitPattern();
        if (bitPattern > 0L) {
            final int k = itemsSketch.getK();
            int n2 = baseBufferCount + 2;
            while (bitPattern != 0L) {
                int n3 = n2;
                if ((0x1L & bitPattern) > 0L) {
                    System.arraycopy((Object)combinedBuffer, (n + 2) * k, (Object)array, n2, k);
                    n3 = n2 + k;
                }
                ++n;
                bitPattern >>>= 1;
                n2 = n3;
            }
        }
        if (b) {
            Arrays.sort(array, 2, baseBufferCount + 2, itemsSketch.getComparator());
        }
        return (T[])array;
    }
    
    private static void insertPre0(final WritableMemory writableMemory, final int n, final int n2, final int n3) {
        PreambleUtil.insertPreLongs(writableMemory, n);
        PreambleUtil.insertSerVer(writableMemory, 3);
        PreambleUtil.insertFamilyID(writableMemory, Family.QUANTILES.getID());
        PreambleUtil.insertFlags(writableMemory, n2);
        PreambleUtil.insertK(writableMemory, n3);
    }
    
    static <T> byte[] toByteArray(final ItemsSketch<T> itemsSketch, final boolean b, final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        final boolean empty = itemsSketch.isEmpty();
        int n = 0;
        int n2;
        if (empty) {
            n2 = 4;
        }
        else {
            n2 = 0;
        }
        if (b) {
            n = 16;
        }
        final int n3 = n | n2 | 0x8;
        if (empty) {
            final byte[] array = new byte[8];
            insertPre0(WritableMemory.wrap(array), 1, n3, itemsSketch.getK());
            return array;
        }
        final byte[] serializeToByteArray = arrayOfItemsSerDe.serializeToByteArray(combinedBufferToItemsArray(itemsSketch, b));
        final byte[] array2 = new byte[serializeToByteArray.length + 16];
        final WritableMemory wrap = WritableMemory.wrap(array2);
        insertPre0(wrap, 2, n3, itemsSketch.getK());
        PreambleUtil.insertN(wrap, itemsSketch.getN());
        wrap.putByteArray(16L, serializeToByteArray, 0, serializeToByteArray.length);
        return array2;
    }
}
