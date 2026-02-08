package com.gameanalytics.sdk.events;

public enum EGASdkErrorCategory
{
    private static final EGASdkErrorCategory[] $VALUES;
    
    Database("db", 2), 
    EventValidation("event_validation", 1), 
    Http("http", 4), 
    Init("init", 3), 
    Json("json", 5), 
    Undefined("", 0);
    
    private int id;
    private String value;
    
    private static /* synthetic */ EGASdkErrorCategory[] $values() {
        return new EGASdkErrorCategory[] { EGASdkErrorCategory.Undefined, EGASdkErrorCategory.EventValidation, EGASdkErrorCategory.Database, EGASdkErrorCategory.Init, EGASdkErrorCategory.Http, EGASdkErrorCategory.Json };
    }
    
    static {
        $VALUES = $values();
    }
    
    private EGASdkErrorCategory(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static EGASdkErrorCategory valueOf(final int n) {
        for (final EGASdkErrorCategory egaSdkErrorCategory : values()) {
            if (egaSdkErrorCategory.id == n) {
                return egaSdkErrorCategory;
            }
        }
        return EGASdkErrorCategory.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
