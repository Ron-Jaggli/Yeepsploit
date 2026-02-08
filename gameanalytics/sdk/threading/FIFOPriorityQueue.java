package com.gameanalytics.sdk.threading;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.PriorityBlockingQueue;

class FIFOPriorityQueue<T extends Comparable<? super T>>
{
    private final PriorityBlockingQueue<FIFOEntry<T>> _queue;
    
    public FIFOPriorityQueue() {
        this._queue = (PriorityBlockingQueue<FIFOEntry<T>>)new PriorityBlockingQueue();
    }
    
    public void add(final T t) {
        this._queue.add((Object)new FIFOEntry((Comparable)t));
    }
    
    public boolean isEmpty() {
        return this._queue.isEmpty();
    }
    
    public T peek() {
        final FIFOEntry fifoEntry = (FIFOEntry)this._queue.peek();
        Comparable<? super T> entry;
        if (fifoEntry == null) {
            entry = null;
        }
        else {
            entry = fifoEntry.getEntry();
        }
        return (T)entry;
    }
    
    public T poll() {
        final FIFOEntry fifoEntry = (FIFOEntry)this._queue.poll();
        Comparable<? super T> entry;
        if (fifoEntry == null) {
            entry = null;
        }
        else {
            entry = fifoEntry.getEntry();
        }
        return (T)entry;
    }
    
    private static class FIFOEntry<E extends Comparable<? super E>> implements Comparable<FIFOEntry<E>>
    {
        private static final AtomicLong seq;
        private final E entry;
        private final long seqNum;
        
        static {
            seq = new AtomicLong();
        }
        
        private FIFOEntry(final E entry) {
            this.seqNum = FIFOEntry.seq.getAndIncrement();
            this.entry = entry;
        }
        
        public int compareTo(final FIFOEntry<E> fifoEntry) {
            int compareTo;
            final int n = compareTo = this.entry.compareTo((Object)fifoEntry.entry);
            if (n == 0) {
                compareTo = n;
                if (fifoEntry.entry != this.entry) {
                    if (this.seqNum < fifoEntry.seqNum) {
                        compareTo = -1;
                    }
                    else {
                        compareTo = 1;
                    }
                }
            }
            return compareTo;
        }
        
        public E getEntry() {
            return this.entry;
        }
    }
}
