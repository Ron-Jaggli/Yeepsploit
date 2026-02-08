package com.gameanalytics.sdk;

public enum GAAdAction
{
    private static final GAAdAction[] $VALUES;
    
    Clicked("clicked", 1), 
    FailedShow("failed_show", 3), 
    Loaded("loaded", 6), 
    Request("request", 5), 
    RewardReceived("reward_received", 4), 
    Show("show", 2), 
    Undefined("", 0);
    
    private int id;
    private String value;
    
    private static /* synthetic */ GAAdAction[] $values() {
        return new GAAdAction[] { GAAdAction.Undefined, GAAdAction.Clicked, GAAdAction.Show, GAAdAction.FailedShow, GAAdAction.RewardReceived, GAAdAction.Request, GAAdAction.Loaded };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GAAdAction(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static GAAdAction valueOf(final int n) {
        for (final GAAdAction gaAdAction : values()) {
            if (gaAdAction.id == n) {
                return gaAdAction;
            }
        }
        return GAAdAction.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
