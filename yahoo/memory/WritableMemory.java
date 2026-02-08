package com.yahoo.memory;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public abstract class WritableMemory extends Memory
{
    public static WritableMemory allocate(final int n) {
        if (n == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(new byte[n]), ByteOrder.nativeOrder());
    }
    
    public static WritableMemory wrap(final ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyException("ByteBuffer is read-only.");
        }
        if (byteBuffer.capacity() == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(byteBuffer, ByteOrder.nativeOrder());
    }
    
    public static WritableMemory wrap(final byte[] array) {
        Util.nullCheck(array);
        if (array.length == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(array), ByteOrder.nativeOrder());
    }
    
    public static WritableMemory wrap(final byte[] array, final ByteOrder byteOrder) {
        Util.nullCheck(array);
        if (array.length == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(array), byteOrder);
    }
    
    public abstract void clear();
    
    public abstract void clear(final long p0, final long p1);
    
    public abstract void clearBits(final long p0, final byte p1);
    
    public abstract void fill(final byte p0);
    
    public abstract void fill(final long p0, final long p1, final byte p2);
    
    public abstract Object getArray();
    
    public abstract ByteBuffer getByteBuffer();
    
    public abstract MemoryRequestServer getMemoryRequestServer();
    
    public abstract long getRegionOffset(final long p0);
    
    public abstract void putBoolean(final long p0, final boolean p1);
    
    public abstract void putBooleanArray(final long p0, final boolean[] p1, final int p2, final int p3);
    
    public abstract void putByte(final long p0, final byte p1);
    
    public abstract void putByteArray(final long p0, final byte[] p1, final int p2, final int p3);
    
    public abstract void putChar(final long p0, final char p1);
    
    public abstract void putCharArray(final long p0, final char[] p1, final int p2, final int p3);
    
    public abstract void putDouble(final long p0, final double p1);
    
    public abstract void putDoubleArray(final long p0, final double[] p1, final int p2, final int p3);
    
    public abstract void putFloat(final long p0, final float p1);
    
    public abstract void putFloatArray(final long p0, final float[] p1, final int p2, final int p3);
    
    public abstract void putInt(final long p0, final int p1);
    
    public abstract void putIntArray(final long p0, final int[] p1, final int p2, final int p3);
    
    public abstract void putLong(final long p0, final long p1);
    
    public abstract void putLongArray(final long p0, final long[] p1, final int p2, final int p3);
    
    public abstract void putShort(final long p0, final short p1);
    
    public abstract void putShortArray(final long p0, final short[] p1, final int p2, final int p3);
    
    public abstract void setBits(final long p0, final byte p1);
    
    public abstract void setMemoryRequest(final MemoryRequestServer p0);
    
    public abstract WritableMemory writableDuplicate();
    
    public abstract WritableMemory writableRegion(final long p0, final long p1);
}
