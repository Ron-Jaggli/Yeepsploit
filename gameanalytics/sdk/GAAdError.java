package com.gameanalytics.sdk;

public enum GAAdError
{
    private static final GAAdError[] $VALUES;
    
    InternalError("internal_error", 4), 
    InvalidRequest("invalid_request", 5), 
    NoFill("no_fill", 3), 
    Offline("offline", 2), 
    UnableToPrecache("unable_to_precache", 6), 
    Undefined("", 0), 
    Unknown("unknown", 1);
    
    private int id;
    private String value;
    
    private static /* synthetic */ GAAdError[] $values() {
        return new GAAdError[] { GAAdError.Undefined, GAAdError.Unknown, GAAdError.Offline, GAAdError.NoFill, GAAdError.InternalError, GAAdError.InvalidRequest, GAAdError.UnableToPrecache };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GAAdError(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static GAAdError valueOf(final int n) {
        for (final GAAdError gaAdError : values()) {
            if (gaAdError.id == n) {
                return gaAdError;
            }
        }
        return GAAdError.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
