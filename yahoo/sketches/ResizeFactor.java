package com.yahoo.sketches;

public enum ResizeFactor
{
    private static final ResizeFactor[] $VALUES;
    
    X1(0), 
    X2(1), 
    X4(2), 
    X8(3);
    
    private int lg_;
    
    private static /* synthetic */ ResizeFactor[] $values() {
        return new ResizeFactor[] { ResizeFactor.X1, ResizeFactor.X2, ResizeFactor.X4, ResizeFactor.X8 };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ResizeFactor(final int lg_) {
        this.lg_ = lg_;
    }
    
    public static ResizeFactor getRF(final int n) {
        final ResizeFactor x1 = ResizeFactor.X1;
        if (x1.lg() == n) {
            return x1;
        }
        final ResizeFactor x2 = ResizeFactor.X2;
        if (x2.lg() == n) {
            return x2;
        }
        final ResizeFactor x3 = ResizeFactor.X4;
        if (x3.lg() == n) {
            return x3;
        }
        return ResizeFactor.X8;
    }
    
    public int getValue() {
        return 1 << this.lg_;
    }
    
    public int lg() {
        return this.lg_;
    }
}
