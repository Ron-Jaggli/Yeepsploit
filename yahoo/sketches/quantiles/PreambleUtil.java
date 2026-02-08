package com.yahoo.sketches.quantiles;

import com.yahoo.sketches.Family;
import com.yahoo.memory.WritableMemory;
import com.yahoo.memory.Memory;
import java.nio.ByteOrder;

final class PreambleUtil
{
    static final int BIG_ENDIAN_FLAG_MASK = 1;
    static final int COMBINED_BUFFER = 32;
    static final int COMPACT_FLAG_MASK = 8;
    static final int DEFAULT_K = 128;
    static final int EMPTY_FLAG_MASK = 4;
    static final int FAMILY_BYTE = 2;
    static final int FLAGS_BYTE = 3;
    static final int K_SHORT = 4;
    static final int MAX_DOUBLE = 24;
    static final int MIN_DOUBLE = 16;
    static final boolean NATIVE_ORDER_IS_BIG_ENDIAN;
    static final int N_LONG = 8;
    static final int ORDERED_FLAG_MASK = 16;
    static final int PREAMBLE_LONGS_BYTE = 0;
    static final int READ_ONLY_FLAG_MASK = 2;
    static final int SER_VER_BYTE = 1;
    
    static {
        NATIVE_ORDER_IS_BIG_ENDIAN = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    }
    
    private PreambleUtil() {
    }
    
    static int extractFamilyID(final Memory memory) {
        return memory.getByte(2L) & 0xFF;
    }
    
    static int extractFlags(final Memory memory) {
        return memory.getByte(3L) & 0xFF;
    }
    
    static int extractK(final Memory memory) {
        return memory.getShort(4L) & 0xFFFF;
    }
    
    static double extractMaxDouble(final Memory memory) {
        return memory.getDouble(24L);
    }
    
    static double extractMinDouble(final Memory memory) {
        return memory.getDouble(16L);
    }
    
    static long extractN(final Memory memory) {
        return memory.getLong(8L);
    }
    
    static int extractPreLongs(final Memory memory) {
        return memory.getByte(0L) & 0xFF;
    }
    
    static int extractSerVer(final Memory memory) {
        return memory.getByte(1L) & 0xFF;
    }
    
    static void insertFamilyID(final WritableMemory writableMemory, final int n) {
        writableMemory.putByte(2L, (byte)n);
    }
    
    static void insertFlags(final WritableMemory writableMemory, final int n) {
        writableMemory.putByte(3L, (byte)n);
    }
    
    static void insertK(final WritableMemory writableMemory, final int n) {
        writableMemory.putShort(4L, (short)n);
    }
    
    static void insertMaxDouble(final WritableMemory writableMemory, final double n) {
        writableMemory.putDouble(24L, n);
    }
    
    static void insertMinDouble(final WritableMemory writableMemory, final double n) {
        writableMemory.putDouble(16L, n);
    }
    
    static void insertN(final WritableMemory writableMemory, final long n) {
        writableMemory.putLong(8L, n);
    }
    
    static void insertPreLongs(final WritableMemory writableMemory, final int n) {
        writableMemory.putByte(0L, (byte)n);
    }
    
    static void insertSerVer(final WritableMemory writableMemory, final int n) {
        writableMemory.putByte(1L, (byte)n);
    }
    
    private static String memoryToString(final Memory memory, final boolean b) {
        final int preLongs = extractPreLongs(memory);
        final int serVer = extractSerVer(memory);
        final String string = Family.idToFamily(extractFamilyID(memory)).toString();
        final int flags = extractFlags(memory);
        boolean b2 = false;
        final boolean b3 = (flags & 0x1) > 0;
        final String string2 = ByteOrder.nativeOrder().toString();
        final boolean b4 = (flags & 0x2) > 0;
        final boolean b5 = (flags & 0x4) > 0;
        final boolean b6 = (flags & 0x8) > 0;
        if ((flags & 0x10) > 0) {
            b2 = true;
        }
        final int k = extractK(memory);
        long n;
        if (preLongs == 1) {
            n = 0L;
        }
        else {
            n = extractN(memory);
        }
        double minDouble;
        double maxDouble;
        if (preLongs > 1 && b) {
            minDouble = extractMinDouble(memory);
            maxDouble = extractMaxDouble(memory);
        }
        else {
            minDouble = Double.NaN;
            maxDouble = Double.NaN;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(Util.LS);
        sb.append("### QUANTILES SKETCH PREAMBLE SUMMARY:").append(Util.LS);
        sb.append("Byte  0: Preamble Longs       : ").append(preLongs).append(Util.LS);
        sb.append("Byte  1: Serialization Version: ").append(serVer).append(Util.LS);
        sb.append("Byte  2: Family               : ").append(string).append(Util.LS);
        sb.append("Byte  3: Flags Field          : ").append(String.format("%02o", new Object[] { flags })).append(Util.LS);
        sb.append("  BIG ENDIAN                  : ").append(b3).append(Util.LS);
        sb.append("  (Native Byte Order)         : ").append(string2).append(Util.LS);
        sb.append("  READ ONLY                   : ").append(b4).append(Util.LS);
        sb.append("  EMPTY                       : ").append(b5).append(Util.LS);
        sb.append("  COMPACT                     : ").append(b6).append(Util.LS);
        sb.append("  ORDERED                     : ").append(b2).append(Util.LS);
        sb.append("Bytes  4-5  : K               : ").append(k).append(Util.LS);
        if (preLongs == 1) {
            sb.append(" --ABSENT, ASSUMED:").append(Util.LS);
        }
        sb.append("Bytes  8-15 : N                : ").append(n).append(Util.LS);
        if (b) {
            sb.append("MinDouble                      : ").append(minDouble).append(Util.LS);
            sb.append("MaxDouble                      : ").append(maxDouble).append(Util.LS);
        }
        sb.append("Retained Items                 : ").append(Util.computeRetainedItems(k, n)).append(Util.LS);
        sb.append("Total Bytes                    : ").append(memory.getCapacity()).append(Util.LS);
        sb.append("### END SKETCH PREAMBLE SUMMARY").append(Util.LS);
        return sb.toString();
    }
    
    static String toString(final Memory memory, final boolean b) {
        return memoryToString(memory, b);
    }
    
    static String toString(final byte[] array, final boolean b) {
        return toString(Memory.wrap(array), b);
    }
}
