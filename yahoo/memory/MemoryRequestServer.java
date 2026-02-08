package com.yahoo.memory;

public interface MemoryRequestServer
{
    WritableMemory request(final long p0);
    
    void requestClose(final WritableMemory p0, final WritableMemory p1);
}
