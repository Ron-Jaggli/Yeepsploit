package com.yahoo.sketches.quantiles;

import com.yahoo.sketches.ArrayOfItemsSerDe;
import com.yahoo.memory.Memory;
import java.util.Comparator;

public final class ItemsUnion<T>
{
    static final boolean $assertionsDisabled = false;
    protected final Comparator<? super T> comparator_;
    protected ItemsSketch<T> gadget_;
    protected final int maxK_;
    
    private ItemsUnion(final int maxK_, final Comparator<? super T> comparator_, final ItemsSketch<T> gadget_) {
        this.maxK_ = maxK_;
        this.comparator_ = comparator_;
        this.gadget_ = gadget_;
    }
    
    public static <T> ItemsUnion<T> heapify(final Memory memory, final Comparator<? super T> comparator, final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        final ItemsSketch<T> heapify = ItemsSketch.heapify(memory, comparator, arrayOfItemsSerDe);
        return new ItemsUnion<T>(heapify.getK(), heapify.getComparator(), (ItemsSketch<Object>)heapify);
    }
    
    public static <T> ItemsUnion<T> newInstance(final int n, final Comparator<? super T> comparator) {
        return new ItemsUnion<T>(n, comparator, null);
    }
    
    public static <T> ItemsUnion<T> newInstance(final ItemsSketch<T> itemsSketch) {
        return new ItemsUnion<T>(itemsSketch.getK(), itemsSketch.getComparator(), ItemsSketch.copy(itemsSketch));
    }
    
    public static <T> ItemsUnion<T> newInstance(final Comparator<? super T> comparator) {
        return new ItemsUnion<T>(128, comparator, null);
    }
    
    static <T> ItemsSketch<T> updateLogic(int n, final Comparator<? super T> comparator, final ItemsSketch<T> itemsSketch, final ItemsSketch<T> itemsSketch2) {
        final int n2 = 0;
        final int n3 = 0;
        int n4;
        if (itemsSketch == null) {
            n4 = 0;
        }
        else if (itemsSketch.isEmpty()) {
            n4 = 4;
        }
        else {
            n4 = 8;
        }
        int n5;
        if (itemsSketch2 == null) {
            n5 = 0;
        }
        else if (itemsSketch2.isEmpty()) {
            n5 = 1;
        }
        else {
            n5 = 2;
        }
        int n6 = 0;
        switch (n4 | n5) {
            default: {
                n6 = 0;
                break;
            }
            case 6:
            case 10: {
                n6 = 3;
                break;
            }
            case 4:
            case 5:
            case 8:
            case 9: {
                n6 = 1;
                break;
            }
            case 2: {
                n6 = 2;
                break;
            }
            case 1: {
                n6 = 4;
                break;
            }
        }
        if (n6 != 0) {
            Object instance = itemsSketch;
            if (n6 != 1) {
                ItemsSketch<T> itemsSketch3;
                if (n6 != 2) {
                    if (n6 != 3) {
                        if (n6 != 4) {
                            return null;
                        }
                        instance = ItemsSketch.newInstance(Math.min(n, itemsSketch2.getK()), (java.util.Comparator<? super Object>)comparator);
                        return (ItemsSketch<T>)instance;
                    }
                    else if (!itemsSketch2.isEstimationMode()) {
                        final int baseBufferCount = itemsSketch2.getBaseBufferCount();
                        final Object[] combinedBuffer = itemsSketch2.getCombinedBuffer();
                        n = n3;
                        while (true) {
                            instance = itemsSketch;
                            if (n >= baseBufferCount) {
                                return (ItemsSketch<T>)instance;
                            }
                            itemsSketch.update((T)combinedBuffer[n]);
                            ++n;
                        }
                    }
                    else {
                        if (itemsSketch.getK() <= itemsSketch2.getK()) {
                            ItemsMergeImpl.mergeInto(itemsSketch2, itemsSketch);
                            instance = itemsSketch;
                            return (ItemsSketch<T>)instance;
                        }
                        itemsSketch3 = ItemsSketch.copy(itemsSketch2);
                        ItemsMergeImpl.mergeInto(itemsSketch, itemsSketch3);
                    }
                }
                else if (!itemsSketch2.isEstimationMode()) {
                    final ItemsSketch<Object> instance2 = ItemsSketch.newInstance(n, (java.util.Comparator<? super Object>)comparator);
                    final int baseBufferCount2 = itemsSketch2.getBaseBufferCount();
                    final Object[] combinedBuffer2 = itemsSketch2.getCombinedBuffer();
                    n = n2;
                    while (true) {
                        instance = instance2;
                        if (n >= baseBufferCount2) {
                            return (ItemsSketch<T>)instance;
                        }
                        instance2.update(combinedBuffer2[n]);
                        ++n;
                    }
                }
                else if (n < itemsSketch2.getK()) {
                    itemsSketch3 = itemsSketch2.downSample(n);
                }
                else {
                    itemsSketch3 = ItemsSketch.copy(itemsSketch2);
                }
                instance = itemsSketch3;
                return (ItemsSketch<T>)instance;
            }
            return (ItemsSketch<T>)instance;
        }
        Object instance = null;
        return (ItemsSketch<T>)instance;
    }
    
    public int getEffectiveK() {
        final ItemsSketch<T> gadget_ = this.gadget_;
        int n;
        if (gadget_ != null) {
            n = gadget_.getK();
        }
        else {
            n = this.maxK_;
        }
        return n;
    }
    
    public int getMaxK() {
        return this.maxK_;
    }
    
    public ItemsSketch<T> getResult() {
        final ItemsSketch<T> gadget_ = this.gadget_;
        if (gadget_ == null) {
            return ItemsSketch.newInstance(this.maxK_, this.comparator_);
        }
        return ItemsSketch.copy(gadget_);
    }
    
    public ItemsSketch<T> getResultAndReset() {
        final ItemsSketch<T> gadget_ = this.gadget_;
        if (gadget_ == null) {
            return null;
        }
        this.gadget_ = null;
        return gadget_;
    }
    
    public boolean isDirect() {
        final ItemsSketch<T> gadget_ = this.gadget_;
        return gadget_ != null && gadget_.isDirect();
    }
    
    public boolean isEmpty() {
        final ItemsSketch<T> gadget_ = this.gadget_;
        return gadget_ == null || gadget_.isEmpty();
    }
    
    public void reset() {
        this.gadget_ = null;
    }
    
    public byte[] toByteArray(final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        final ItemsSketch<T> gadget_ = this.gadget_;
        if (gadget_ == null) {
            return ItemsSketch.newInstance(this.maxK_, (java.util.Comparator<? super Object>)this.comparator_).toByteArray((ArrayOfItemsSerDe<Object>)arrayOfItemsSerDe);
        }
        return gadget_.toByteArray(arrayOfItemsSerDe);
    }
    
    @Override
    public String toString() {
        return this.toString(true, false);
    }
    
    public String toString(final boolean b, final boolean b2) {
        final StringBuilder sb = new StringBuilder();
        final String simpleName = this.getClass().getSimpleName();
        final String format = String.format("%,d", new Object[] { this.getMaxK() });
        sb.append(Util.LS).append("### Quantiles ").append(simpleName).append(com.yahoo.sketches.Util.LS);
        sb.append("   maxK                         : ").append(format);
        final ItemsSketch<T> gadget_ = this.gadget_;
        if (gadget_ == null) {
            sb.append(ItemsSketch.newInstance(this.maxK_, (java.util.Comparator<? super Object>)this.comparator_).toString());
            return sb.toString();
        }
        sb.append(gadget_.toString(b, b2));
        return sb.toString();
    }
    
    public void update(final Memory memory, final ArrayOfItemsSerDe<T> arrayOfItemsSerDe) {
        this.gadget_ = updateLogic(this.maxK_, this.comparator_, this.gadget_, ItemsSketch.heapify(memory, this.comparator_, arrayOfItemsSerDe));
    }
    
    public void update(final ItemsSketch<T> itemsSketch) {
        this.gadget_ = updateLogic(this.maxK_, this.comparator_, this.gadget_, itemsSketch);
    }
    
    public void update(final T t) {
        if (t == null) {
            return;
        }
        if (this.gadget_ == null) {
            this.gadget_ = ItemsSketch.newInstance(this.maxK_, this.comparator_);
        }
        this.gadget_.update(t);
    }
}
