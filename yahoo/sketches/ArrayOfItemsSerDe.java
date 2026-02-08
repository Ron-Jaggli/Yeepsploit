package com.yahoo.sketches;

import com.yahoo.memory.Memory;

public abstract class ArrayOfItemsSerDe<T>
{
    public abstract T[] deserializeFromMemory(final Memory p0, final int p1);
    
    public abstract byte[] serializeToByteArray(final T[] p0);
}
