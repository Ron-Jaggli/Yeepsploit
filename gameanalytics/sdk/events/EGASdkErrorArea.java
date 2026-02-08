package com.gameanalytics.sdk.events;

public enum EGASdkErrorArea
{
    private static final EGASdkErrorArea[] $VALUES;
    
    AdEvent("ad", 20), 
    AddDimensions("add_dimensions", 15), 
    AddEventsToStore("add_events_to_store", 12), 
    AddFields("add_fields", 16), 
    BusinessEvent("business", 1), 
    DesignEvent("design", 4), 
    EnsurePersistedStates("ensure_persisted_states", 7), 
    ErrorEvent("error", 5), 
    EventsHttp("events_http", 10), 
    HealthEvent("health", 1), 
    ImpressionEvent("impression", 21), 
    InitHttp("init_http", 9), 
    InitRequest("init_request", 17), 
    InitialInit("internal_init", 19), 
    JsonStringToMap("json_string_to_map", 13), 
    ProcessEvents("process_events", 11), 
    ProgressionEvent("progression", 3), 
    ResourceEvent("resource", 2), 
    SendEvents("send_events", 18), 
    SessionEnd("session_end", 8), 
    SessionStart("session_start", 14), 
    Sql("sql", 6), 
    Undefined("", 0);
    
    private int id;
    private String value;
    
    private static /* synthetic */ EGASdkErrorArea[] $values() {
        return new EGASdkErrorArea[] { EGASdkErrorArea.Undefined, EGASdkErrorArea.BusinessEvent, EGASdkErrorArea.ResourceEvent, EGASdkErrorArea.ProgressionEvent, EGASdkErrorArea.DesignEvent, EGASdkErrorArea.ErrorEvent, EGASdkErrorArea.Sql, EGASdkErrorArea.EnsurePersistedStates, EGASdkErrorArea.SessionEnd, EGASdkErrorArea.InitHttp, EGASdkErrorArea.EventsHttp, EGASdkErrorArea.ProcessEvents, EGASdkErrorArea.AddEventsToStore, EGASdkErrorArea.JsonStringToMap, EGASdkErrorArea.SessionStart, EGASdkErrorArea.AddDimensions, EGASdkErrorArea.AddFields, EGASdkErrorArea.InitRequest, EGASdkErrorArea.SendEvents, EGASdkErrorArea.InitialInit, EGASdkErrorArea.AdEvent, EGASdkErrorArea.ImpressionEvent, EGASdkErrorArea.HealthEvent };
    }
    
    static {
        $VALUES = $values();
    }
    
    private EGASdkErrorArea(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static EGASdkErrorArea valueOf(final int n) {
        for (final EGASdkErrorArea egaSdkErrorArea : values()) {
            if (egaSdkErrorArea.id == n) {
                return egaSdkErrorArea;
            }
        }
        return EGASdkErrorArea.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
