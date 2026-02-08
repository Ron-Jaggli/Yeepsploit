package com.yahoo.sketches;

import com.yahoo.memory.WritableMemory;
import com.yahoo.memory.Util;
import com.yahoo.memory.Memory;

public class ArrayOfDoublesSerDe extends ArrayOfItemsSerDe<Double>
{
    @Override
    public Double[] deserializeFromMemory(final Memory memory, final int n) {
        final long capacity = memory.getCapacity();
        long n2 = 0L;
        Util.checkBounds(0L, 8L, capacity);
        final Double[] array = new Double[n];
        for (int i = 0; i < n; ++i) {
            array[i] = memory.getDouble(n2);
            n2 += 8L;
        }
        return array;
    }
    
    @Override
    public byte[] serializeToByteArray(final Double[] array) {
        final byte[] array2 = new byte[array.length * 8];
        final WritableMemory wrap = WritableMemory.wrap(array2);
        long n = 0L;
        for (int i = 0; i < array.length; ++i) {
            wrap.putDouble(n, array[i]);
            n += 8L;
        }
        return array2;
    }
}
