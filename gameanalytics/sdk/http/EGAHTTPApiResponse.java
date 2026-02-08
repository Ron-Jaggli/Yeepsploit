package com.gameanalytics.sdk.http;

public enum EGAHTTPApiResponse
{
    private static final EGAHTTPApiResponse[] $VALUES;
    
    BadRequest, 
    BadResponse, 
    Created, 
    InternalServerError, 
    JsonDecodeFailed, 
    JsonEncodeFailed, 
    NoResponse, 
    Ok, 
    RequestTimeout, 
    Unauthorized, 
    UnknownResponseCode;
    
    private static /* synthetic */ EGAHTTPApiResponse[] $values() {
        return new EGAHTTPApiResponse[] { EGAHTTPApiResponse.NoResponse, EGAHTTPApiResponse.BadResponse, EGAHTTPApiResponse.RequestTimeout, EGAHTTPApiResponse.JsonEncodeFailed, EGAHTTPApiResponse.JsonDecodeFailed, EGAHTTPApiResponse.InternalServerError, EGAHTTPApiResponse.BadRequest, EGAHTTPApiResponse.Unauthorized, EGAHTTPApiResponse.UnknownResponseCode, EGAHTTPApiResponse.Ok, EGAHTTPApiResponse.Created };
    }
    
    static {
        $VALUES = $values();
    }
}
