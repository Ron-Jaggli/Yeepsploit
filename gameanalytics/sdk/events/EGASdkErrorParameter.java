package com.gameanalytics.sdk.events;

public enum EGASdkErrorParameter
{
    private static final EGASdkErrorParameter[] $VALUES;
    
    AdAction("ad_action", 15), 
    AdNetwork("ad_network", 19), 
    AdNetworkVersion("ad_network_version", 19), 
    AdPlacement("ad_placement", 18), 
    AdSdkName("ad_sdk_name", 17), 
    AdType("ad_type", 16), 
    Amount("amount", 7), 
    CartType("cart_type", 2), 
    Currency("currency", 1), 
    EventId("event_id", 11), 
    FlowType("flow_type", 6), 
    ImpressionData("impression_data", 20), 
    ItemId("item_id", 4), 
    ItemType("item_type", 3), 
    Message("message", 14), 
    Progression01("progression01", 8), 
    Progression02("progression02", 9), 
    Progression03("progression03", 10), 
    ProgressionStatus("progression_status", 12), 
    Severity("severity", 13), 
    Store("store", 5), 
    Undefined("", 0);
    
    private int id;
    private String value;
    
    private static /* synthetic */ EGASdkErrorParameter[] $values() {
        return new EGASdkErrorParameter[] { EGASdkErrorParameter.Undefined, EGASdkErrorParameter.Currency, EGASdkErrorParameter.CartType, EGASdkErrorParameter.ItemType, EGASdkErrorParameter.ItemId, EGASdkErrorParameter.Store, EGASdkErrorParameter.FlowType, EGASdkErrorParameter.Amount, EGASdkErrorParameter.Progression01, EGASdkErrorParameter.Progression02, EGASdkErrorParameter.Progression03, EGASdkErrorParameter.EventId, EGASdkErrorParameter.ProgressionStatus, EGASdkErrorParameter.Severity, EGASdkErrorParameter.Message, EGASdkErrorParameter.AdAction, EGASdkErrorParameter.AdType, EGASdkErrorParameter.AdSdkName, EGASdkErrorParameter.AdPlacement, EGASdkErrorParameter.AdNetwork, EGASdkErrorParameter.ImpressionData, EGASdkErrorParameter.AdNetworkVersion };
    }
    
    static {
        $VALUES = $values();
    }
    
    private EGASdkErrorParameter(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static EGASdkErrorParameter valueOf(final int n) {
        for (final EGASdkErrorParameter egaSdkErrorParameter : values()) {
            if (egaSdkErrorParameter.id == n) {
                return egaSdkErrorParameter;
            }
        }
        return EGASdkErrorParameter.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
