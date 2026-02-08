package com.gameanalytics.sdk.logging;

enum EGALoggerMessageType
{
    private static final EGALoggerMessageType[] $VALUES;
    
    Debug, 
    Error, 
    Info, 
    Warning;
    
    private static /* synthetic */ EGALoggerMessageType[] $values() {
        return new EGALoggerMessageType[] { EGALoggerMessageType.Error, EGALoggerMessageType.Warning, EGALoggerMessageType.Info, EGALoggerMessageType.Debug };
    }
    
    static {
        $VALUES = $values();
    }
}
