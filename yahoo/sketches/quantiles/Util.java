package com.yahoo.sketches.quantiles;

import com.yahoo.memory.Memory;
import com.yahoo.sketches.SketchesArgumentException;
import com.yahoo.sketches.Family;

final class Util
{
    static final String LS;
    static final char TAB = '\t';
    
    static {
        LS = System.getProperty("line.separator");
    }
    
    private Util() {
    }
    
    static void checkFamilyID(final int n) {
        final Family idToFamily = Family.idToFamily(n);
        if (idToFamily.equals((Object)Family.QUANTILES)) {
            return;
        }
        throw new SketchesArgumentException("Possible corruption: Invalid Family: " + idToFamily.toString());
    }
    
    static void checkHeapFlags(final int n) {
        if ((n & 0xFFFFFFE1) <= 0) {
            return;
        }
        throw new SketchesArgumentException("Possible corruption: Invalid flags field: " + Integer.toBinaryString(n));
    }
    
    static boolean checkIsCompactMemory(final Memory memory) {
        return (PreambleUtil.extractFlags(memory) & 0xA) > 0;
    }
    
    static void checkK(final int n) {
        if (n >= 2 && n < 65536 && com.yahoo.sketches.Util.isPowerOf2(n)) {
            return;
        }
        throw new SketchesArgumentException("K must be > 1 and < 65536 and Power of 2: " + n);
    }
    
    static boolean checkPreLongsFlagsCap(final int n, final int n2, final long n3) {
        final boolean b = (n2 & 0x4) > 0;
        final int minPreLongs = Family.QUANTILES.getMinPreLongs();
        final int maxPreLongs = Family.QUANTILES.getMaxPreLongs();
        if ((n != minPreLongs || !b) && (n != maxPreLongs || b)) {
            throw new SketchesArgumentException("Possible corruption: PreambleLongs inconsistent with empty state: " + n);
        }
        checkHeapFlags(n2);
        if (n3 >= n << 3) {
            return b;
        }
        throw new SketchesArgumentException("Possible corruption: Insufficient capacity for preamble: " + n3);
    }
    
    static int computeBaseBufferItems(final int n, final long n2) {
        return (int)(n2 % (n * 2L));
    }
    
    static long computeBitPattern(final int n, final long n2) {
        return n2 / (n * 2L);
    }
    
    static int computeCombinedBufferItemCapacity(final int n, final long n2) {
        final int computeNumLevelsNeeded = computeNumLevelsNeeded(n, n2);
        if (computeNumLevelsNeeded == 0) {
            return Math.max(4, com.yahoo.sketches.Util.ceilingPowerOf2(computeBaseBufferItems(n, n2)));
        }
        return (computeNumLevelsNeeded + 2) * n;
    }
    
    static int computeNumLevelsNeeded(final int n, final long n2) {
        return hiBitPos(n2 / (n * 2L)) + 1;
    }
    
    static int computeRetainedItems(final int n, final long n2) {
        return computeBaseBufferItems(n, n2) + computeValidLevels(computeBitPattern(n, n2)) * n;
    }
    
    static int computeTotalLevels(final long n) {
        return hiBitPos(n) + 1;
    }
    
    static int computeValidLevels(final long n) {
        return Long.bitCount(n);
    }
    
    static int hiBitPos(final long n) {
        return 63 - Long.numberOfLeadingZeros(n);
    }
    
    static double lg(final double n) {
        return Math.log(n) / Math.log(2.0);
    }
    
    static int lowestZeroBitStartingAt(long n, int n2) {
        for (n2 &= 0x3F, n >>>= n2; (0x1L & n) != 0x0L; n >>>= 1, ++n2) {}
        return n2;
    }
    
    static final void validateFractions(final double[] array) {
        if (array == null) {
            throw new SketchesArgumentException("Fractions cannot be null.");
        }
        if (array.length == 0) {
            return;
        }
        final double n = array[0];
        final double n2 = array[array.length - 1];
        if (n >= 0.0 && n2 <= 1.0) {
            validateValues(array);
            return;
        }
        throw new SketchesArgumentException("A fraction cannot be less than zero or greater than 1.0");
    }
    
    static final void validateValues(final double[] array) {
        if (array != null) {
            final int length = array.length;
            int i = 0;
            while (i < length - 1) {
                final double n = array[i];
                ++i;
                if (n < array[i]) {
                    continue;
                }
                throw new SketchesArgumentException("Values must be unique, monotonically increasing and not NaN.");
            }
            return;
        }
        throw new SketchesArgumentException("Values cannot be null.");
    }
    
    static class EpsilonFromK
    {
        static final boolean $assertionsDisabled = false;
        private static final double adjustKForEps = 1.3333333333333333;
        private static final double bracketedBinarySearchForEpsTol = 1.0E-15;
        private static final double deltaForEps = 0.01;
        
        private static double bracketedBinarySearchForEps(final double n, final double n2, final double n3) {
            if ((n3 - n2) / n2 < 1.0E-15) {
                return n2;
            }
            final double n4 = (n2 + n3) / 2.0;
            if (epsForKPredicate(n4, n)) {
                return bracketedBinarySearchForEps(n, n4, n3);
            }
            return bracketedBinarySearchForEps(n, n2, n4);
        }
        
        private static boolean epsForKPredicate(final double n, final double n2) {
            return kOfEpsFormula(n) >= n2;
        }
        
        static double getAdjustedEpsilon(final int n) {
            return getTheoreticalEpsilon(n, 1.3333333333333333);
        }
        
        private static double getTheoreticalEpsilon(final int n, final double n2) {
            if (n >= 2) {
                return bracketedBinarySearchForEps(n * n2, 1.0E-16, 0.9999999999999999);
            }
            throw new SketchesArgumentException("K must be greater than one.");
        }
        
        private static double kOfEpsFormula(final double n) {
            return 1.0 / n * Math.sqrt(Math.log(1.0 / (n * 0.01)));
        }
    }
}
