package com.gameanalytics.sdk;

public enum GAResourceFlowType
{
    private static final GAResourceFlowType[] $VALUES;
    
    Sink("Sink", 2), 
    Source("Source", 1), 
    Undefined("", 0);
    
    private int id;
    private String value;
    
    private static /* synthetic */ GAResourceFlowType[] $values() {
        return new GAResourceFlowType[] { GAResourceFlowType.Undefined, GAResourceFlowType.Source, GAResourceFlowType.Sink };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GAResourceFlowType(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static GAResourceFlowType valueOf(final int n) {
        for (final GAResourceFlowType gaResourceFlowType : values()) {
            if (gaResourceFlowType.id == n) {
                return gaResourceFlowType;
            }
        }
        return GAResourceFlowType.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
