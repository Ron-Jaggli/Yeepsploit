package com.yahoo.memory;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public abstract class Memory
{
    static String toHex(final String s, final long n, final int n2, final Memory memory) {
        return WritableMemoryImpl.toHex(s, n, n2, memory);
    }
    
    public static Memory wrap(final ByteBuffer byteBuffer) {
        if (byteBuffer != null && byteBuffer.capacity() == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(byteBuffer, ByteOrder.nativeOrder());
    }
    
    public static Memory wrap(final byte[] array) {
        return wrap(array, 0, array.length, ByteOrder.nativeOrder());
    }
    
    public static Memory wrap(final byte[] array, final int n, final int n2, final ByteOrder byteOrder) {
        Util.nullCheck(array);
        Util.nullCheck(byteOrder);
        Util.checkBounds(n, n2, array.length);
        if (n2 == 0) {
            return WritableMemoryImpl.ZERO_SIZE_MEMORY;
        }
        return new WritableMemoryImpl(ByteBuffer.wrap(array), byteOrder);
    }
    
    public static Memory wrap(final byte[] array, final ByteOrder byteOrder) {
        return wrap(array, 0, array.length, byteOrder);
    }
    
    public abstract void checkBounds(final long p0, final long p1);
    
    public abstract int compareTo(final long p0, final long p1, final Memory p2, final long p3, final long p4);
    
    public abstract void copyTo(final long p0, final WritableMemory p1, final long p2, final long p3);
    
    public abstract boolean getBoolean(final long p0);
    
    public abstract void getBooleanArray(final long p0, final boolean[] p1, final int p2, final int p3);
    
    public abstract byte getByte(final long p0);
    
    public abstract void getByteArray(final long p0, final byte[] p1, final int p2, final int p3);
    
    public abstract long getCapacity();
    
    public abstract char getChar(final long p0);
    
    public abstract void getCharArray(final long p0, final char[] p1, final int p2, final int p3);
    
    public abstract double getDouble(final long p0);
    
    public abstract void getDoubleArray(final long p0, final double[] p1, final int p2, final int p3);
    
    public abstract float getFloat(final long p0);
    
    public abstract void getFloatArray(final long p0, final float[] p1, final int p2, final int p3);
    
    public abstract int getInt(final long p0);
    
    public abstract void getIntArray(final long p0, final int[] p1, final int p2, final int p3);
    
    public abstract long getLong(final long p0);
    
    public abstract void getLongArray(final long p0, final long[] p1, final int p2, final int p3);
    
    public abstract ByteOrder getResourceOrder();
    
    public abstract short getShort(final long p0);
    
    public abstract void getShortArray(final long p0, final short[] p1, final int p2, final int p3);
    
    public abstract boolean hasArray();
    
    public abstract boolean hasByteBuffer();
    
    public abstract boolean isDirect();
    
    public abstract boolean isResourceReadOnly();
    
    public abstract boolean isSameResource(final Memory p0);
    
    public abstract Memory region(final long p0, final long p1);
    
    public abstract boolean swapBytes();
    
    public abstract String toHexString(final String p0, final long p1, final int p2);
}
