package com.yahoo.sketches.quantiles;

import com.yahoo.memory.WritableMemory;
import java.lang.reflect.Array;
import com.yahoo.sketches.ArrayOfItemsSerDe;
import com.yahoo.memory.Memory;
import com.yahoo.sketches.SketchesArgumentException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public final class ItemsSketch<T>
{
    static final boolean $assertionsDisabled = false;
    static final int MIN_K = 2;
    static final int SER_VER = 3;
    public static final Random rand;
    int baseBufferCount_;
    long bitPattern_;
    int combinedBufferItemCapacity_;
    Object[] combinedBuffer_;
    private final Comparator<? super T> comparator_;
    final int k_;
    T maxValue_;
    T minValue_;
    long n_;
    
    static {
        rand = new Random();
    }
    
    private ItemsSketch(final int k_, final Comparator<? super T> comparator_) {
        Util.checkK(k_);
        this.k_ = k_;
        this.comparator_ = comparator_;
    }
    
    private ItemsAuxiliary<T> constructAuxiliary() {
        return new ItemsAuxiliary<T>(this);
    }
    
    static <T> ItemsSketch<T> copy(final ItemsSketch<T> itemsSketch) {
        final ItemsSketch<Object> instance = newInstance(itemsSketch.k_, (java.util.Comparator<? super Object>)itemsSketch.comparator_);
        instance.n_ = itemsSketch.n_;
        instance.minValue_ = itemsSketch.getMinValue();
        instance.maxValue_ = itemsSketch.getMaxValue();
        instance.combinedBufferItemCapacity_ = itemsSketch.getCombinedBufferAllocatedCount();
        instance.baseBufferCount_ = itemsSketch.getBaseBufferCount();
        instance.bitPattern_ = itemsSketch.getBitPattern();
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        instance.combinedBuffer_ = Arrays.copyOf(combinedBuffer, combinedBuffer.length);
        return (ItemsSketch<T>)instance;
    }
    
    private static double[] getEvenlySpaced(final int n) {
        if (n > 0) {
            final double[] array = new double[n];
            array[0] = 0.0;
            for (int i = 1; i < n; ++i) {
                array[i] = i / (double)(n - 1);
            }
            if (n > 1) {
                array[n - 1] = 1.0;
            }
            return array;
        }
        throw new SketchesArgumentException("n must be > zero.");
    }
    
    public static double getNormalizedRankError(final int n) {
        return Util.EpsilonFromK.getAdjustedEpsilon(n);
    }
    
    private static <T> void growBaseBuffer(final ItemsSketch<T> itemsSketch) {
        final Object[] combinedBuffer = itemsSketch.getCombinedBuffer();
        final int max = Math.max(Math.min(itemsSketch.getK() * 2, itemsSketch.getCombinedBufferAllocatedCount() * 2), 1);
        itemsSketch.combinedBufferItemCapacity_ = max;
        itemsSketch.combinedBuffer_ = Arrays.copyOf(combinedBuffer, max);
    }
    
    public static <T> ItemsSketch<T> heapify(final Memory memory, final Comparator<? super T> comparator, final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        final long capacity = memory.getCapacity();
        if (capacity < 8L) {
            throw new SketchesArgumentException("Memory too small: " + capacity);
        }
        final int preLongs = PreambleUtil.extractPreLongs(memory);
        final int serVer = PreambleUtil.extractSerVer(memory);
        final int familyID = PreambleUtil.extractFamilyID(memory);
        final int flags = PreambleUtil.extractFlags(memory);
        final int k = PreambleUtil.extractK(memory);
        ItemsUtil.checkItemsSerVer(serVer);
        if (serVer != 3) {
            throw new SketchesArgumentException("Possible corruption: Invalid serialization version: " + serVer);
        }
        if ((flags & 0x8) == 0x0) {
            throw new SketchesArgumentException("Non-compact Memory images are not supported.");
        }
        final boolean checkPreLongsFlagsCap = Util.checkPreLongsFlagsCap(preLongs, flags, capacity);
        Util.checkFamilyID(familyID);
        final ItemsSketch<Object> instance = newInstance(k, (java.util.Comparator<? super Object>)comparator);
        if (checkPreLongsFlagsCap) {
            return (ItemsSketch<T>)instance;
        }
        final long n = PreambleUtil.extractN(memory);
        final int computeRetainedItems = Util.computeRetainedItems(k, n);
        instance.n_ = n;
        instance.combinedBufferItemCapacity_ = Util.computeCombinedBufferItemCapacity(k, n);
        instance.baseBufferCount_ = Util.computeBaseBufferItems(k, n);
        instance.bitPattern_ = Util.computeBitPattern(k, n);
        instance.combinedBuffer_ = new Object[instance.combinedBufferItemCapacity_];
        final long n2 = preLongs * 8;
        instance.itemsArrayToCombinedBuffer(arrayOfItemsSerDe.deserializeFromMemory(memory.region(n2, memory.getCapacity() - n2), computeRetainedItems + 2));
        return (ItemsSketch<T>)instance;
    }
    
    private void itemsArrayToCombinedBuffer(final T[] array) {
        int n = 0;
        this.minValue_ = array[0];
        this.maxValue_ = array[1];
        System.arraycopy((Object)array, 2, (Object)this.combinedBuffer_, 0, this.baseBufferCount_);
        long bitPattern_ = this.bitPattern_;
        if (bitPattern_ > 0L) {
            int n2 = this.baseBufferCount_ + 2;
            while (bitPattern_ != 0L) {
                int n3 = n2;
                if ((0x1L & bitPattern_) > 0L) {
                    final Object[] combinedBuffer_ = this.combinedBuffer_;
                    final int k_ = this.k_;
                    System.arraycopy((Object)array, n2, (Object)combinedBuffer_, (n + 2) * k_, k_);
                    n3 = n2 + this.k_;
                }
                ++n;
                bitPattern_ >>>= 1;
                n2 = n3;
            }
        }
    }
    
    public static <T> ItemsSketch<T> newInstance(int combinedBufferItemCapacity_, final Comparator<? super T> comparator) {
        final ItemsSketch itemsSketch = new ItemsSketch(combinedBufferItemCapacity_, (Comparator<? super T>)comparator);
        combinedBufferItemCapacity_ = Math.min(2, combinedBufferItemCapacity_) * 2;
        itemsSketch.n_ = 0L;
        itemsSketch.combinedBufferItemCapacity_ = combinedBufferItemCapacity_;
        itemsSketch.combinedBuffer_ = new Object[combinedBufferItemCapacity_];
        itemsSketch.baseBufferCount_ = 0;
        itemsSketch.bitPattern_ = 0L;
        itemsSketch.minValue_ = null;
        itemsSketch.maxValue_ = null;
        return itemsSketch;
    }
    
    public static <T> ItemsSketch<T> newInstance(final Comparator<? super T> comparator) {
        return newInstance(128, comparator);
    }
    
    public ItemsSketch<T> downSample(final int n) {
        final ItemsSketch<Object> instance = newInstance(n, (java.util.Comparator<? super Object>)this.comparator_);
        ItemsMergeImpl.downSamplingMergeInto(this, (ItemsSketch<T>)instance);
        return (ItemsSketch<T>)instance;
    }
    
    int getBaseBufferCount() {
        return this.baseBufferCount_;
    }
    
    long getBitPattern() {
        return this.bitPattern_;
    }
    
    public double[] getCDF(final T[] array) {
        if (this.isEmpty()) {
            return null;
        }
        return ItemsPmfCdfImpl.getPMFOrCDF(this, array, true);
    }
    
    Object[] getCombinedBuffer() {
        return this.combinedBuffer_;
    }
    
    int getCombinedBufferAllocatedCount() {
        return this.combinedBufferItemCapacity_;
    }
    
    Comparator<? super T> getComparator() {
        return this.comparator_;
    }
    
    public int getK() {
        return this.k_;
    }
    
    public T getMaxValue() {
        return this.maxValue_;
    }
    
    public T getMinValue() {
        return this.minValue_;
    }
    
    public long getN() {
        return this.n_;
    }
    
    public double getNormalizedRankError() {
        return getNormalizedRankError(this.getK());
    }
    
    public double[] getPMF(final T[] array) {
        if (this.isEmpty()) {
            return null;
        }
        return ItemsPmfCdfImpl.getPMFOrCDF(this, array, false);
    }
    
    public T getQuantile(final double n) {
        if (n >= 0.0) {
            final double n2 = dcmpl(n, 1.0);
            if (n2 <= 0) {
                if (n == 0.0) {
                    return this.minValue_;
                }
                if (n2 == 0) {
                    return this.maxValue_;
                }
                return this.constructAuxiliary().getQuantile(n);
            }
        }
        throw new SketchesArgumentException("Fraction cannot be less than zero or greater than 1.0");
    }
    
    public T[] getQuantiles(final int n) {
        if (this.isEmpty()) {
            return null;
        }
        return this.getQuantiles(getEvenlySpaced(n));
    }
    
    public T[] getQuantiles(final double[] array) {
        final boolean empty = this.isEmpty();
        ItemsAuxiliary itemsAuxiliary = null;
        if (empty) {
            return null;
        }
        Util.validateFractions(array);
        final Object[] array2 = (Object[])Array.newInstance((Class)this.minValue_.getClass(), array.length);
        ItemsAuxiliary<T> constructAuxiliary;
        for (int i = 0; i < array.length; ++i, itemsAuxiliary = constructAuxiliary) {
            final double n = array[i];
            if (n == 0.0) {
                array2[i] = this.minValue_;
                constructAuxiliary = itemsAuxiliary;
            }
            else if (n == 1.0) {
                array2[i] = this.maxValue_;
                constructAuxiliary = itemsAuxiliary;
            }
            else {
                if ((constructAuxiliary = itemsAuxiliary) == null) {
                    constructAuxiliary = this.constructAuxiliary();
                }
                array2[i] = constructAuxiliary.getQuantile(n);
            }
        }
        return (T[])array2;
    }
    
    public double getRank(final T t) {
        if (this.isEmpty()) {
            return Double.NaN;
        }
        return this.getCDF(new Object[] { t })[0];
    }
    
    public int getRetainedItems() {
        return Util.computeRetainedItems(this.getK(), this.getN());
    }
    
    public boolean isDirect() {
        return false;
    }
    
    public boolean isEmpty() {
        return this.getN() == 0L;
    }
    
    public boolean isEstimationMode() {
        return this.getN() >= this.k_ * 2L;
    }
    
    public void putMemory(final WritableMemory writableMemory, final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        final byte[] byteArray = this.toByteArray(arrayOfItemsSerDe);
        final long capacity = writableMemory.getCapacity();
        if (capacity >= byteArray.length) {
            writableMemory.putByteArray(0L, byteArray, 0, byteArray.length);
            return;
        }
        throw new SketchesArgumentException("Destination Memory not large enough: " + capacity + " < " + byteArray.length);
    }
    
    public void reset() {
        this.n_ = 0L;
        final int combinedBufferItemCapacity_ = Math.min(2, this.k_) * 2;
        this.combinedBufferItemCapacity_ = combinedBufferItemCapacity_;
        this.combinedBuffer_ = new Object[combinedBufferItemCapacity_];
        this.baseBufferCount_ = 0;
        this.bitPattern_ = 0L;
        this.minValue_ = null;
        this.maxValue_ = null;
    }
    
    public byte[] toByteArray(final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        return this.toByteArray(false, arrayOfItemsSerDe);
    }
    
    public byte[] toByteArray(final boolean b, final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        return ItemsByteArrayImpl.toByteArray(this, b, arrayOfItemsSerDe);
    }
    
    @Override
    public String toString() {
        return this.toString(true, false);
    }
    
    public String toString(final boolean b, final boolean b2) {
        return ItemsUtil.toString(b, b2, (ItemsSketch<Object>)this);
    }
    
    public void update(final T t) {
        if (t == null) {
            return;
        }
        final T maxValue_ = this.maxValue_;
        if (maxValue_ == null || this.comparator_.compare((Object)t, (Object)maxValue_) > 0) {
            this.maxValue_ = t;
        }
        final T minValue_ = this.minValue_;
        if (minValue_ == null || this.comparator_.compare((Object)t, (Object)minValue_) < 0) {
            this.minValue_ = t;
        }
        if (this.baseBufferCount_ + 1 > this.combinedBufferItemCapacity_) {
            growBaseBuffer((ItemsSketch<Object>)this);
        }
        final Object[] combinedBuffer_ = this.combinedBuffer_;
        final int baseBufferCount_ = this.baseBufferCount_;
        final int baseBufferCount_2 = baseBufferCount_ + 1;
        this.baseBufferCount_ = baseBufferCount_2;
        combinedBuffer_[baseBufferCount_] = t;
        ++this.n_;
        if (baseBufferCount_2 == this.k_ * 2) {
            ItemsUtil.processFullBaseBuffer((ItemsSketch<Object>)this);
        }
    }
}
