package com.gameanalytics.sdk.unity;

import com.gameanalytics.sdk.GameAnalytics;
import com.unity3d.player.UnityPlayer;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.IRemoteConfigsListener;

public class UnityGameAnalytics
{
    private static final String GameAnalyticsGameObjectName = "GameAnalytics";
    private static final String OnRemoteConfigsUpdatedMethodName = "OnRemoteConfigsUpdated";
    private static final IRemoteConfigsListener remoteConfigsListener;
    
    static {
        remoteConfigsListener = (IRemoteConfigsListener)new IRemoteConfigsListener() {
            public void onRemoteConfigsUpdated() {
                GALogger.d("UnityGameAnalytics: onRemoteConfigsUpdated called");
                UnityPlayer.UnitySendMessage("GameAnalytics", "OnRemoteConfigsUpdated", "");
            }
        };
    }
    
    public static void initialize() {
        GALogger.d("UnityGameAnalytics: initialize called");
        GameAnalytics.addRemoteConfigsListener(UnityGameAnalytics.remoteConfigsListener);
    }
}
