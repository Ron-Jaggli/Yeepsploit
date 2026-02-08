package com.yahoo.memory;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

class WritableMemoryImpl extends WritableMemory
{
    static final boolean $assertionsDisabled = false;
    static final WritableMemoryImpl ZERO_SIZE_MEMORY;
    private final ByteBuffer byteBuf;
    private final int capacity;
    private final int offset;
    
    static {
        ZERO_SIZE_MEMORY = new WritableMemoryImpl(ByteBuffer.wrap(new byte[0]), ByteOrder.nativeOrder());
    }
    
    private WritableMemoryImpl(final ByteBuffer byteBuf, final int offset, final int capacity, final ByteOrder byteOrder) {
        this.byteBuf = byteBuf;
        this.capacity = capacity;
        this.offset = offset;
        byteBuf.order(byteOrder);
    }
    
    WritableMemoryImpl(final ByteBuffer byteBuf, final ByteOrder byteOrder) {
        this.byteBuf = byteBuf;
        this.capacity = byteBuf.capacity();
        this.offset = 0;
        byteBuf.order(byteOrder);
    }
    
    static String toHex(final String s, final long n, int byte1, final Memory memory) {
        final long n2 = byte1;
        Util.checkBounds(n, n2, memory.getCapacity());
        final WritableMemoryImpl writableMemoryImpl = (WritableMemoryImpl)memory;
        final StringBuilder sb = new StringBuilder();
        final ByteBuffer byteBuf = writableMemoryImpl.byteBuf;
        String string = "null";
        String string2;
        if (byteBuf == null) {
            string2 = "null";
        }
        else {
            string2 = writableMemoryImpl.byteBuf.getClass().getSimpleName() + ", " + ((long)writableMemoryImpl.byteBuf.hashCode() & 0xFFFFFFFFL);
        }
        final MemoryRequestServer memoryRequestServer = writableMemoryImpl.getMemoryRequestServer();
        if (memoryRequestServer != null) {
            string = memoryRequestServer.getClass().getSimpleName() + ", " + (0xFFFFFFFFL & (long)memoryRequestServer.hashCode());
        }
        sb.append(s).append(Util.LS);
        sb.append("ByteBuf, hashCode   : ").append(string2).append(Util.LS);
        sb.append("RegionOffset        : ").append(writableMemoryImpl.getRegionOffset(0L)).append(Util.LS);
        sb.append("Capacity            : ").append(memory.getCapacity()).append(Util.LS);
        sb.append("MemReq, hashCode    : ").append(string).append(Util.LS);
        sb.append("Resource Read Only  : ").append(memory.isResourceReadOnly()).append(Util.LS);
        sb.append("Resource Endianness : ").append(writableMemoryImpl.byteBuf.order().toString()).append(Util.LS);
        sb.append("Data, littleEndian  :  0  1  2  3  4  5  6  7");
        for (long n3 = 0L; n3 < n2; ++n3) {
            final long n4 = n + n3;
            byte1 = memory.getByte(n4);
            if (n3 % 8L == 0L) {
                sb.append(String.format("%n%20s: ", new Object[] { n4 }));
            }
            sb.append(String.format("%02x ", new Object[] { byte1 & 0xFF }));
        }
        sb.append(Util.LS);
        return sb.toString();
    }
    
    @Override
    public void checkBounds(final long n, final long n2) {
        Util.checkBounds(n, n2, this.capacity);
    }
    
    @Override
    public void clear() {
        this.fill(0L, this.capacity, (byte)0);
    }
    
    @Override
    public void clear(final long n, final long n2) {
        this.fill(n, n2, (byte)0);
    }
    
    @Override
    public void clearBits(final long n, final byte b) {
        Util.assertBounds(n, 1L, this.capacity);
        final long n2 = this.offset;
        final ByteBuffer byteBuf = this.byteBuf;
        final int n3 = (int)(n2 + n);
        this.byteBuf.put(n3, (byte)(byteBuf.get(n3) & 0xFF & ~b));
    }
    
    @Override
    public int compareTo(final long n, final long n2, final Memory memory, final long n3, final long n4) {
        Util.checkBounds(n, n2, this.capacity);
        Util.checkBounds(n3, n4, memory.getCapacity());
        final long n5 = lcmp(n2, n4);
        if (n5 < 0) {
            return -1;
        }
        if (n5 > 0) {
            return 1;
        }
        final int n6 = (int)this.getRegionOffset(n);
        final WritableMemoryImpl writableMemoryImpl = (WritableMemoryImpl)memory;
        for (int n7 = (int)writableMemoryImpl.getRegionOffset(n3), n8 = (int)n2, i = n6; i < n8 + n6; ++i, ++n7) {
            final byte value = this.byteBuf.get(i);
            final byte value2 = writableMemoryImpl.byteBuf.get(n7);
            if (value < value2) {
                return -1;
            }
            if (value > value2) {
                return 1;
            }
        }
        return 0;
    }
    
    @Override
    public void copyTo(final long n, final WritableMemory writableMemory, final long n2, final long n3) {
        Util.checkBounds(n, n3, this.capacity);
        Util.checkBounds(n2, n3, writableMemory.getCapacity());
        if (this.isSameResource(writableMemory) && n == n2) {
            return;
        }
        final int n4 = (int)n3;
        final byte[] array = new byte[n4];
        this.getByteArray(n, array, 0, n4);
        writableMemory.putByteArray(n2, array, 0, n4);
    }
    
    @Override
    public void fill(final byte b) {
        this.fill(0L, this.capacity, b);
    }
    
    @Override
    public void fill(long n, final long n2, final byte b) {
        final int n3 = (int)n;
        n = n3;
        final int n4 = (int)n2;
        Util.checkBounds(n, n4, this.capacity);
        int i = 0;
        while (i < n4 + (i = this.offset + n3)) {
            this.byteBuf.put(i, b);
            ++i;
        }
    }
    
    @Override
    public Object getArray() {
        return this.byteBuf.array();
    }
    
    @Override
    public boolean getBoolean(final long n) {
        Util.assertBounds(n, 1L, this.capacity);
        return this.byteBuf.get(this.offset + (int)n) != 0;
    }
    
    @Override
    public void getBooleanArray(final long n, final boolean[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = (int)(this.offset + n), i = n2; i < n2 + n3; ++i, ++n4) {
            array[i] = (this.byteBuf.get(n4) != 0);
        }
    }
    
    @Override
    public byte getByte(final long n) {
        Util.assertBounds(n, 1L, this.capacity);
        return this.byteBuf.get(this.offset + (int)n);
    }
    
    @Override
    public void getByteArray(final long n, final byte[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        if (this.byteBuf.hasArray()) {
            System.arraycopy((Object)this.byteBuf.array(), this.offset + (int)n, (Object)array, n2, n3);
        }
        else {
            for (int n4 = (int)(this.offset + n), i = n2; i < n2 + n3; ++i, ++n4) {
                array[i] = this.byteBuf.get(n4);
            }
        }
    }
    
    @Override
    public ByteBuffer getByteBuffer() {
        return this.byteBuf;
    }
    
    @Override
    public long getCapacity() {
        return this.capacity;
    }
    
    @Override
    public char getChar(final long n) {
        Util.assertBounds(n, 2L, this.capacity);
        return this.byteBuf.getChar(this.offset + (int)n);
    }
    
    @Override
    public void getCharArray(final long n, final char[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3 << 1, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n4 += 2) {
            array[i] = this.byteBuf.getChar(n4);
        }
    }
    
    @Override
    public double getDouble(final long n) {
        Util.assertBounds(n, 8L, this.capacity);
        return this.byteBuf.getDouble(this.offset + (int)n);
    }
    
    @Override
    public void getDoubleArray(final long n, final double[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3 << 3, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n4 += 8) {
            array[i] = this.byteBuf.getDouble(n4);
        }
    }
    
    @Override
    public float getFloat(final long n) {
        Util.assertBounds(n, 4L, this.capacity);
        return this.byteBuf.getFloat(this.offset + (int)n);
    }
    
    @Override
    public void getFloatArray(final long n, final float[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3 << 2, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n4 += 4) {
            array[i] = this.byteBuf.getFloat(n4);
        }
    }
    
    @Override
    public int getInt(final long n) {
        Util.assertBounds(n, 4L, this.capacity);
        return this.byteBuf.getInt(this.offset + (int)n);
    }
    
    @Override
    public void getIntArray(final long n, final int[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3 << 2, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n4 += 4) {
            array[i] = this.byteBuf.getInt(n4);
        }
    }
    
    @Override
    public long getLong(final long n) {
        Util.assertBounds(n, 8L, this.capacity);
        return this.byteBuf.getLong(this.offset + (int)n);
    }
    
    @Override
    public void getLongArray(final long n, final long[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3 << 3, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n4 += 8) {
            array[i] = this.byteBuf.getLong(n4);
        }
    }
    
    @Override
    public MemoryRequestServer getMemoryRequestServer() {
        return DefaultMemoryManager.getInstance();
    }
    
    @Override
    public long getRegionOffset(final long n) {
        return this.offset + n;
    }
    
    @Override
    public ByteOrder getResourceOrder() {
        return this.byteBuf.order();
    }
    
    @Override
    public short getShort(final long n) {
        Util.assertBounds(n, 2L, this.capacity);
        return this.byteBuf.getShort(this.offset + (int)n);
    }
    
    @Override
    public void getShortArray(final long n, final short[] array, final int n2, final int n3) {
        Util.checkBounds(n, n3 << 1, this.capacity);
        Util.checkBounds(n2, n3, array.length);
        for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n4 += 2) {
            array[i] = this.byteBuf.getShort(n4);
        }
    }
    
    @Override
    public boolean hasArray() {
        return this.byteBuf.hasArray();
    }
    
    @Override
    public boolean hasByteBuffer() {
        return true;
    }
    
    @Override
    public boolean isDirect() {
        return this.byteBuf.isDirect();
    }
    
    @Override
    public boolean isResourceReadOnly() {
        return this.byteBuf.isReadOnly();
    }
    
    @Override
    public boolean isSameResource(final Memory memory) {
        boolean b2;
        final boolean b = b2 = false;
        if (memory != null) {
            b2 = b;
            if (!this.isDirect()) {
                if (memory.isDirect()) {
                    b2 = b;
                }
                else {
                    final WritableMemoryImpl writableMemoryImpl = (WritableMemoryImpl)memory;
                    b2 = b;
                    if (this.hasArray()) {
                        b2 = b;
                        if (memory.hasArray()) {
                            final ByteBuffer byteBuf = this.byteBuf;
                            if (byteBuf != writableMemoryImpl.byteBuf) {
                                b2 = b;
                                if (byteBuf.array() != writableMemoryImpl.byteBuf.array()) {
                                    return b2;
                                }
                            }
                            b2 = b;
                            if (this.capacity == writableMemoryImpl.capacity) {
                                b2 = b;
                                if (this.offset == writableMemoryImpl.offset) {
                                    b2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public void putBoolean(final long n, final boolean b) {
        Util.assertBounds(n, 1L, this.capacity);
        this.byteBuf.put(this.offset + (int)n, (byte)(byte)(b ? 1 : 0));
    }
    
    @Override
    public void putBooleanArray(final long n, final boolean[] array, final int n2, final int n3) {
        final long n4 = n3;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int n5 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, ++n5) {
            this.byteBuf.put(n5, (byte)(byte)(array[i] ? 1 : 0));
        }
    }
    
    @Override
    public void putByte(final long n, final byte b) {
        Util.assertBounds(n, 1L, this.capacity);
        this.byteBuf.put(this.offset + (int)n, b);
    }
    
    @Override
    public void putByteArray(final long n, final byte[] array, final int n2, final int n3) {
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n3, this.capacity);
        if (this.byteBuf.hasArray()) {
            System.arraycopy((Object)array, n2, (Object)this.byteBuf.array(), this.offset + (int)n, n3);
        }
        else {
            for (int n4 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, ++n4) {
                this.byteBuf.put(n4, array[i]);
            }
        }
    }
    
    @Override
    public void putChar(final long n, final char c) {
        Util.assertBounds(n, 2L, this.capacity);
        this.byteBuf.putChar(this.offset + (int)n, c);
    }
    
    @Override
    public void putCharArray(final long n, final char[] array, final int n2, final int n3) {
        final long n4 = n3 << 1;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int n5 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n5 += 2) {
            this.byteBuf.putChar(n5, array[i]);
        }
    }
    
    @Override
    public void putDouble(final long n, final double n2) {
        Util.assertBounds(n, 8L, this.capacity);
        this.byteBuf.putDouble(this.offset + (int)n, n2);
    }
    
    @Override
    public void putDoubleArray(final long n, final double[] array, final int n2, final int n3) {
        final long n4 = n3 << 3;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int n5 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n5 += 8) {
            this.byteBuf.putDouble(n5, array[i]);
        }
    }
    
    @Override
    public void putFloat(final long n, final float n2) {
        Util.assertBounds(n, 4L, this.capacity);
        this.byteBuf.putFloat(this.offset + (int)n, n2);
    }
    
    @Override
    public void putFloatArray(final long n, final float[] array, final int n2, final int n3) {
        final long n4 = n3 << 2;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int n5 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n5 += 4) {
            this.byteBuf.putFloat(n5, array[i]);
        }
    }
    
    @Override
    public void putInt(final long n, final int n2) {
        Util.assertBounds(n, 4L, this.capacity);
        this.byteBuf.putInt(this.offset + (int)n, n2);
    }
    
    @Override
    public void putIntArray(final long n, final int[] array, final int n2, final int n3) {
        final long n4 = n3 << 2;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int n5 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n5 += 4) {
            this.byteBuf.putInt(n5, array[i]);
        }
    }
    
    @Override
    public void putLong(final long n, final long n2) {
        Util.assertBounds(n, 8L, this.capacity);
        this.byteBuf.putLong(this.offset + (int)n, n2);
    }
    
    @Override
    public void putLongArray(final long n, final long[] array, final int n2, final int n3) {
        final long n4 = n3 << 3;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int n5 = this.offset + (int)n, i = n2; i < n2 + n3; ++i, n5 += 8) {
            this.byteBuf.putLong(n5, array[i]);
        }
    }
    
    @Override
    public void putShort(final long n, final short n2) {
        Util.assertBounds(n, 2L, this.capacity);
        this.byteBuf.putShort(this.offset + (int)n, n2);
    }
    
    @Override
    public void putShortArray(final long n, final short[] array, final int n2, final int n3) {
        final long n4 = n3 << 1;
        Util.checkBounds(n2, n3, array.length);
        Util.checkBounds(n, n4, this.capacity);
        for (int i = n2; i < n2 + n3; ++i) {
            this.byteBuf.putShort(array[i]);
        }
    }
    
    @Override
    public Memory region(final long n, final long n2) {
        return this.writableRegion(n, n2);
    }
    
    @Override
    public void setBits(final long n, final byte b) {
        Util.assertBounds(n, 1L, this.capacity);
        final int n2 = this.offset + (int)n;
        this.byteBuf.put(n2, (byte)(this.byteBuf.get(n2) | b));
    }
    
    @Override
    public void setMemoryRequest(final MemoryRequestServer memoryRequestServer) {
    }
    
    @Override
    public boolean swapBytes() {
        return this.byteBuf.order() != ByteOrder.nativeOrder();
    }
    
    @Override
    public String toHexString(final String s, final long n, final int n2) {
        final String simpleName = this.getClass().getSimpleName();
        final String string = ".toHexString" + String.format("(..., %d, %d)", new Object[] { n, n2 }) + ", hashCode: " + ((long)this.hashCode() & 0xFFFFFFFFL);
        final StringBuilder sb = new StringBuilder("### ");
        sb.append(simpleName).append(" SUMMARY ###").append(Util.LS);
        sb.append("Header Comment      : ").append(s).append(Util.LS);
        sb.append("Call Params         : ").append(string);
        return toHex(sb.toString(), n, n2, this);
    }
    
    @Override
    public WritableMemory writableDuplicate() {
        return this.writableRegion(0L, this.capacity);
    }
    
    @Override
    public WritableMemory writableRegion(final long n, final long n2) {
        Util.checkBounds(n, n2, this.capacity);
        final ByteBuffer byteBuf = this.byteBuf;
        return new WritableMemoryImpl(byteBuf, this.offset + (int)n, (int)n2, byteBuf.order());
    }
}
