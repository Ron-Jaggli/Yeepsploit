package com.gameanalytics.sdk;

public enum GAErrorSeverity
{
    private static final GAErrorSeverity[] $VALUES;
    
    Critical("critical", 5), 
    Debug("debug", 1), 
    Error("error", 4), 
    Info("info", 2), 
    Undefined("", 0), 
    Warning("warning", 3);
    
    private int id;
    private String value;
    
    private static /* synthetic */ GAErrorSeverity[] $values() {
        return new GAErrorSeverity[] { GAErrorSeverity.Undefined, GAErrorSeverity.Debug, GAErrorSeverity.Info, GAErrorSeverity.Warning, GAErrorSeverity.Error, GAErrorSeverity.Critical };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GAErrorSeverity(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static GAErrorSeverity valueOf(final int n) {
        for (final GAErrorSeverity gaErrorSeverity : values()) {
            if (gaErrorSeverity.id == n) {
                return gaErrorSeverity;
            }
        }
        return GAErrorSeverity.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
