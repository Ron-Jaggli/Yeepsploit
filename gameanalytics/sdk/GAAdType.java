package com.gameanalytics.sdk;

public enum GAAdType
{
    private static final GAAdType[] $VALUES;
    
    AppOpen("app_open", 7), 
    Banner("banner", 6), 
    Interstitial("interstitial", 4), 
    OfferWall("offer_wall", 5), 
    Playable("playable", 3), 
    RewardedVideo("rewarded_video", 2), 
    Undefined("", 0), 
    Video("video", 1);
    
    private int id;
    private String value;
    
    private static /* synthetic */ GAAdType[] $values() {
        return new GAAdType[] { GAAdType.Undefined, GAAdType.Video, GAAdType.RewardedVideo, GAAdType.Playable, GAAdType.Interstitial, GAAdType.OfferWall, GAAdType.Banner, GAAdType.AppOpen };
    }
    
    static {
        $VALUES = $values();
    }
    
    private GAAdType(final String value, final int id) {
        this.value = value;
        this.id = id;
    }
    
    public static GAAdType valueOf(final int n) {
        for (final GAAdType gaAdType : values()) {
            if (gaAdType.id == n) {
                return gaAdType;
            }
        }
        return GAAdType.Undefined;
    }
    
    public String toString() {
        return this.value;
    }
}
