package com.gameanalytics.sdk.events;

public enum EGASdkErrorAction
{
    private static final EGASdkErrorAction[] $VALUES;
    
    DatabaseOpenOrCreate("db_open_or_create", 19), 
    DatabaseTooLarge("db_too_large", 18), 
    FailHttp400("fail_http_400", 26), 
    FailHttp401("fail_http_401", 27), 
    FailHttp500("fail_http_500", 28), 
    FailHttpJsonDecode("fail_http_json_decode", 29), 
    FailHttpJsonEncode("fail_http_json_encode", 30), 
    ImpressionDataIsNull("impression_data_null", 35), 
    InvalidAdAction("invalid_ad_action", 31), 
    InvalidAdNetworkName("invalid_ad_network", 34), 
    InvalidAdNetworkVersion("invalid_ad_network_version", 36), 
    InvalidAdType("invalid_ad_type", 32), 
    InvalidAmount("invalid_amount", 9), 
    InvalidCurrency("invalid_currency", 1), 
    InvalidEventIdCharacters("invalid_event_id_characters", 13), 
    InvalidEventIdLength("invalid_event_id_length", 12), 
    InvalidEventPartCharacters("invalid_event_part_characters", 4), 
    InvalidEventPartLength("invalid_event_part_length", 3), 
    InvalidFlowType("invalid_flow_type", 6), 
    InvalidLongString("invalid_long_string", 17), 
    InvalidProgressionStatus("invalid_progression_status", 15), 
    InvalidSeverity("invalid_severity", 16), 
    InvalidShortString("invalid_short_string", 2), 
    InvalidStore("invalid_store", 5), 
    InvalidString("invalid_string", 33), 
    JsonError("json_error", 25), 
    NotFoundInAvailableCurrencies("not_found_in_available_currencies", 8), 
    NotFoundInAvailableItemTypes("not_found_in_available_item_types", 10), 
    SqlBegin("sql_begin", 20), 
    SqlCommit("sql_commit", 23), 
    SqlRawQuery("sql_raw_query", 22), 
    SqlRollback("sql_rollback", 24), 
    SqlSetColumn("sql_set_column", 21), 
    StringEmptyOrNull("string_empty_or_null", 7), 
    Undefined("", 0), 
    WrongProgressionOrder("wrong_progression_order", 11);
    
    private int id;
    private String value;
    
    private static /* synthetic */ EGASdkErrorAction[] $values() {
        return new EGASdkErrorAction[] { EGASdkErrorAction.Undefined, EGASdkErrorAction.InvalidCurrency, EGASdkErrorAction.InvalidShortString, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorAction.InvalidStore, EGASdkErrorAction.InvalidFlowType, EGASdkErrorAction.StringEmptyOrNull, EGASdkErrorAction.NotFoundInAvailableCurrencies, EGASdkErrorAction.InvalidAmount, EGASdkErrorAction.NotFoundInAvailableItemTypes, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorAction.InvalidEventIdLength, EGASdkErrorAction.InvalidEventIdCharacters, EGASdkErrorAction.InvalidProgressionStatus, EGASdkErrorAction.InvalidSeverity, EGASdkErrorAction.InvalidLongString, EGASdkErrorAction.DatabaseTooLarge, EGASdkErrorAction.DatabaseOpenOrCreate, EGASdkErrorAction.SqlBegin, EGASdkErrorAction.SqlSetColumn, EGASdkErrorAction.SqlRawQuery, EGASdkErrorAction.SqlCommit, EGASdkErrorAction.SqlRollback, EGASdkErrorAction.JsonError, EGASdkErrorAction.FailHttp400, EGASdkErrorAction.FailHttp401, EGASdkErrorAction.FailHttp500, EGASdkErrorAction.FailHttpJsonDecode, EGASdkErrorAction.FailHttpJsonEncode, EGASdkErrorAction.InvalidAdAction, EGASdkErrorAction.InvalidAdType, EGASdkErrorAction.InvalidString, EGASdkErrorAction.InvalidAdNetworkName, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorAction.InvalidAdNetworkVersion };
    }
    
    static {
        $VALUES = $values();
    }
    
    private EGASdkErrorAction(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static EGASdkErrorAction valueOf(final int n) {
        for (final EGASdkErrorAction egaSdkErrorAction : values()) {
            if (egaSdkErrorAction.id == n) {
                return egaSdkErrorAction;
            }
        }
        return EGASdkErrorAction.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
