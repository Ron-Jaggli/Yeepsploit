package com.yahoo.memory;

final class DefaultMemoryManager implements MemoryRequestServer
{
    private static final DefaultMemoryManager memMgr;
    
    static {
        memMgr = new DefaultMemoryManager();
    }
    
    private DefaultMemoryManager() {
    }
    
    static DefaultMemoryManager getInstance() {
        return DefaultMemoryManager.memMgr;
    }
    
    @Override
    public WritableMemory request(final long n) {
        final WritableMemory allocate = WritableMemory.allocate((int)n);
        allocate.setMemoryRequest(this);
        return allocate;
    }
    
    @Override
    public void requestClose(final WritableMemory writableMemory, final WritableMemory writableMemory2) {
    }
}
