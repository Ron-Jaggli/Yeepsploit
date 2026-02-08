package com.yahoo.sketches;

public class SketchesException extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    
    public SketchesException(final String s) {
        super(s);
    }
    
    public SketchesException(final String s, final Throwable t) {
        super(s, t);
    }
}
