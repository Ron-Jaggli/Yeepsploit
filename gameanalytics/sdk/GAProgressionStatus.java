package com.gameanalytics.sdk;

public enum GAProgressionStatus
{
    private static final GAProgressionStatus[] $VALUES;
    
    Complete("Complete", 2), 
    Fail("Fail", 3), 
    Start("Start", 1), 
    Undefined("", 0);
    
    private int id;
    private String value;
    
    private static /* synthetic */ GAProgressionStatus[] $values() {
        return new GAProgressionStatus[] { GAProgressionStatus.Undefined, GAProgressionStatus.Start, GAProgressionStatus.Complete, GAProgressionStatus.Fail };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GAProgressionStatus(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static GAProgressionStatus valueOf(final int n) {
        for (final GAProgressionStatus gaProgressionStatus : values()) {
            if (gaProgressionStatus.id == n) {
                return gaProgressionStatus;
            }
        }
        return GAProgressionStatus.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
