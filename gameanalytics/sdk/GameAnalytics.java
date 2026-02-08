package com.gameanalytics.sdk;

import com.gameanalytics.sdk.utilities.Stopwatch;
import java.util.Iterator;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.http.GAHTTPApi;
import java.util.HashMap;
import android.app.Activity;
import com.gameanalytics.sdk.store.GAStore;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.validators.GAValidator;
import com.gameanalytics.sdk.logging.GALogger;
import org.json.JSONException;
import org.json.JSONObject;
import com.gameanalytics.sdk.threading.GAThreading;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.threading.IBlock;
import com.gameanalytics.sdk.state.GAState;
import java.util.Map;

public class GameAnalytics
{
    public static final String BANNER = "BANNER";
    public static final String INTERSTITIAL = "INTERSTITIAL";
    private static final int MAX_RETRIES = 500;
    public static final String NATIVE = "NATIVE";
    public static final String REWARDED_INTERSTITIAL = "REWARDED_INTERSTITIAL";
    public static final String REWARDED_VIDEO = "REWARDED_VIDEO";
    private static int currentRetries;
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2) {
        final GAAdAction value = GAAdAction.valueOf(n);
        final GAAdType value2 = GAAdType.valueOf(n2);
        final Map map = null;
        addAdEvent(value, value2, s, s2, (Map<String, Object>)null);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final int n3) {
        final GAAdAction value = GAAdAction.valueOf(n);
        final GAAdType value2 = GAAdType.valueOf(n2);
        final GAAdError value3 = GAAdError.valueOf(n3);
        final Map map = null;
        addAdEvent(value, value2, s, s2, value3, null);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final int n3, final String s3) {
        addAdEvent(GAAdAction.valueOf(n), GAAdType.valueOf(n2), s, s2, GAAdError.valueOf(n3), jsonStringToMap(s3), false);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final int n3, final String s3, final boolean b) {
        addAdEvent(GAAdAction.valueOf(n), GAAdType.valueOf(n2), s, s2, GAAdError.valueOf(n3), jsonStringToMap(s3), b);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final long n3) {
        final GAAdAction value = GAAdAction.valueOf(n);
        final GAAdType value2 = GAAdType.valueOf(n2);
        final Map map = null;
        addAdEvent(value, value2, s, s2, n3, null);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final long n3, final String s3) {
        addAdEvent(GAAdAction.valueOf(n), GAAdType.valueOf(n2), s, s2, n3, jsonStringToMap(s3), false);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final long n3, final String s3, final boolean b) {
        addAdEvent(GAAdAction.valueOf(n), GAAdType.valueOf(n2), s, s2, n3, jsonStringToMap(s3), b);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final String s3) {
        addAdEvent(GAAdAction.valueOf(n), GAAdType.valueOf(n2), s, s2, jsonStringToMap(s3), false);
    }
    
    public static void addAdEvent(final int n, final int n2, final String s, final String s2, final String s3, final boolean b) {
        addAdEvent(GAAdAction.valueOf(n), GAAdType.valueOf(n2), s, s2, jsonStringToMap(s3), b);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2) {
        final Map map = null;
        addAdEvent(gaAdAction, gaAdType, s, s2, (Map<String, Object>)null);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final long n) {
        final Map map = null;
        addAdEvent(gaAdAction, gaAdType, s, s2, n, null);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final long n, final Map<String, Object> map) {
        addAdEvent(gaAdAction, gaAdType, s, s2, n, map, false);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final long n, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaAdAction, gaAdType, s, s2, n, map, b) {
                final GAAdAction val$adAction;
                final String val$adPlacement;
                final String val$adSdkName;
                final GAAdType val$adType;
                final Map val$customFields;
                final long val$duration;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add ad event")) {
                        return;
                    }
                    GAEvents.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, GAAdError.Undefined, this.val$duration, true, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addAdEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaAdAction, gaAdType, s, s2, n, map, b) {
                final GAAdAction val$adAction;
                final String val$adPlacement;
                final String val$adSdkName;
                final GAAdType val$adType;
                final Map val$customFields;
                final long val$duration;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not ad error event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, this.val$duration, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, GAAdError.Undefined, this.val$duration, true, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addAdEvent";
                }
            }, 1L);
        }
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final GAAdError gaAdError) {
        final Map map = null;
        addAdEvent(gaAdAction, gaAdType, s, s2, gaAdError, null);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final GAAdError gaAdError, final Map<String, Object> map) {
        addAdEvent(gaAdAction, gaAdType, s, s2, gaAdError, map, false);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final GAAdError gaAdError, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaAdAction, gaAdType, s, s2, gaAdError, map, b) {
                final GAAdAction val$adAction;
                final String val$adPlacement;
                final String val$adSdkName;
                final GAAdType val$adType;
                final Map val$customFields;
                final boolean val$mergeFields;
                final GAAdError val$noAdReason;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add ad event")) {
                        return;
                    }
                    GAEvents.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, this.val$noAdReason, 0L, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addAdEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaAdAction, gaAdType, s, s2, gaAdError, map, b) {
                final GAAdAction val$adAction;
                final String val$adPlacement;
                final String val$adSdkName;
                final GAAdType val$adType;
                final Map val$customFields;
                final boolean val$mergeFields;
                final GAAdError val$noAdReason;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not ad error event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, this.val$noAdReason, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, this.val$noAdReason, 0L, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addAdEvent";
                }
            }, 1L);
        }
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final Map<String, Object> map) {
        addAdEvent(gaAdAction, gaAdType, s, s2, map, false);
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaAdAction, gaAdType, s, s2, map, b) {
                final GAAdAction val$adAction;
                final String val$adPlacement;
                final String val$adSdkName;
                final GAAdType val$adType;
                final Map val$customFields;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add ad event")) {
                        return;
                    }
                    GAEvents.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, GAAdError.Undefined, 0L, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addAdEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaAdAction, gaAdType, s, s2, map, b) {
                final GAAdAction val$adAction;
                final String val$adPlacement;
                final String val$adSdkName;
                final GAAdType val$adType;
                final Map val$customFields;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not ad event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addAdEvent(this.val$adAction, this.val$adType, this.val$adSdkName, this.val$adPlacement, GAAdError.Undefined, 0L, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addAdEvent";
                }
            }, 1L);
        }
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4) {
        addBusinessEvent(s, n, s2, s3, s4, "", "", "");
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5) {
        addBusinessEvent(s, n, s2, s3, s4, "", "", "", jsonStringToMap(s5), false);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        final Map map = null;
        addBusinessEvent(s, n, s2, s3, s4, s5, s6, s7, (Map<String, Object>)null);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8) {
        addBusinessEvent(s, n, s2, s3, s4, s5, s6, s7, jsonStringToMap(s8), false);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final boolean b) {
        addBusinessEvent(s, n, s2, s3, s4, s5, s6, s7, jsonStringToMap(s8), b);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final Map<String, Object> map) {
        addBusinessEvent(s, n, s2, s3, s4, s5, s6, s7, map, false);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(s, n, s2, s3, s4, s5, s6, s7, map, b) {
                final int val$amount;
                final String val$cartType;
                final String val$currency;
                final Map val$customFields;
                final String val$itemId;
                final String val$itemType;
                final boolean val$mergeFields;
                final String val$receipt;
                final String val$signature;
                final String val$store;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add business event")) {
                        return;
                    }
                    GAEvents.addBusinessEvent(this.val$currency, this.val$amount, this.val$itemType, this.val$itemId, this.val$cartType, this.val$receipt, this.val$store, this.val$signature, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addBusinessEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(s, n, s2, s3, s4, s5, s6, s7, map, b) {
                final int val$amount;
                final String val$cartType;
                final String val$currency;
                final Map val$customFields;
                final String val$itemId;
                final String val$itemType;
                final boolean val$mergeFields;
                final String val$receipt;
                final String val$signature;
                final String val$store;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add business event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addBusinessEvent(this.val$currency, this.val$amount, this.val$itemType, this.val$itemId, this.val$cartType, this.val$receipt, this.val$store, this.val$signature, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addBusinessEvent(this.val$currency, this.val$amount, this.val$itemType, this.val$itemId, this.val$cartType, this.val$receipt, this.val$store, this.val$signature, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addBusinessEvent";
                }
            }, 1L);
        }
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final String s5, final boolean b) {
        addBusinessEvent(s, n, s2, s3, s4, "", "", "", jsonStringToMap(s5), b);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final Map<String, Object> map) {
        addBusinessEvent(s, n, s2, s3, s4, "", "", "", map, false);
    }
    
    public static void addBusinessEvent(final String s, final int n, final String s2, final String s3, final String s4, final Map<String, Object> map, final boolean b) {
        addBusinessEvent(s, n, s2, s3, s4, "", "", "", map, b);
    }
    
    public static void addDesignEvent(final String s) {
        final Map map = null;
        addDesignEvent(s, (Map<String, Object>)null);
    }
    
    public static void addDesignEvent(final String s, final double n) {
        final Map map = null;
        addDesignEvent(s, n, (Map<String, Object>)null);
    }
    
    public static void addDesignEvent(final String s, final double n, final String s2) {
        addDesignEvent(s, n, jsonStringToMap(s2), false);
    }
    
    public static void addDesignEvent(final String s, final double n, final String s2, final boolean b) {
        addDesignEvent(s, n, jsonStringToMap(s2), b);
    }
    
    public static void addDesignEvent(final String s, final double n, final Map<String, Object> map) {
        addDesignEvent(s, n, map, false);
    }
    
    public static void addDesignEvent(final String s, final double n, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(s, n, map, b) {
                final Map val$customFields;
                final String val$eventId;
                final boolean val$mergeFields;
                final double val$value;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add design event")) {
                        return;
                    }
                    GAEvents.addDesignEvent(this.val$eventId, this.val$value, true, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addDesignEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(s, n, map, b) {
                final Map val$customFields;
                final String val$eventId;
                final boolean val$mergeFields;
                final double val$value;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add design event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addDesignEvent(this.val$eventId, this.val$value, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addDesignEvent(this.val$eventId, this.val$value, true, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addDesignEvent";
                }
            }, 1L);
        }
    }
    
    public static void addDesignEvent(final String s, final String s2) {
        addDesignEvent(s, jsonStringToMap(s2), false);
    }
    
    public static void addDesignEvent(final String s, final String s2, final boolean b) {
        addDesignEvent(s, jsonStringToMap(s2), b);
    }
    
    public static void addDesignEvent(final String s, final Map<String, Object> map) {
        addDesignEvent(s, map, false);
    }
    
    public static void addDesignEvent(final String s, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(s, map, b) {
                final Map val$customFields;
                final String val$eventId;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add design event")) {
                        return;
                    }
                    GAEvents.addDesignEvent(this.val$eventId, 0.0, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addDesignEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(s, map, b) {
                final Map val$customFields;
                final String val$eventId;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add design event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addDesignEvent(this.val$eventId, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addDesignEvent(this.val$eventId, 0.0, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addDesignEvent";
                }
            }, 1L);
        }
    }
    
    public static void addErrorEvent(final int n, final String s) {
        addErrorEvent(GAErrorSeverity.valueOf(n), s);
    }
    
    public static void addErrorEvent(final int n, final String s, final String s2) {
        addErrorEvent(GAErrorSeverity.valueOf(n), s, jsonStringToMap(s2), false);
    }
    
    public static void addErrorEvent(final int n, final String s, final String s2, final boolean b) {
        addErrorEvent(GAErrorSeverity.valueOf(n), s, jsonStringToMap(s2), b);
    }
    
    public static void addErrorEvent(final GAErrorSeverity gaErrorSeverity, final String s) {
        final Map map = null;
        addErrorEvent(gaErrorSeverity, s, null);
    }
    
    public static void addErrorEvent(final GAErrorSeverity gaErrorSeverity, final String s, final Map<String, Object> map) {
        addErrorEvent(gaErrorSeverity, s, map, false);
    }
    
    public static void addErrorEvent(final GAErrorSeverity gaErrorSeverity, final String s, final Map<String, Object> map, final boolean b) {
        final GAPlatform.FunctionInfo functionInfo = new GAPlatform.FunctionInfo();
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaErrorSeverity, s, map, b, functionInfo) {
                final Map val$customFields;
                final GAPlatform.FunctionInfo val$functionInfo;
                final boolean val$mergeFields;
                final String val$message;
                final GAErrorSeverity val$severity;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add error event")) {
                        return;
                    }
                    GAEvents.addErrorEvent(this.val$severity, this.val$message, this.val$customFields, this.val$mergeFields, this.val$functionInfo.method, this.val$functionInfo.line, this.val$functionInfo.module);
                }
                
                @Override
                public String getName() {
                    return "addErrorEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaErrorSeverity, s, map, b, functionInfo) {
                final Map val$customFields;
                final GAPlatform.FunctionInfo val$functionInfo;
                final boolean val$mergeFields;
                final String val$message;
                final GAErrorSeverity val$severity;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add error event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addErrorEvent(this.val$severity, this.val$message, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addErrorEvent(this.val$severity, this.val$message, this.val$customFields, this.val$mergeFields, this.val$functionInfo.method, this.val$functionInfo.line, this.val$functionInfo.module);
                }
                
                @Override
                public String getName() {
                    return "addErrorEvent";
                }
            }, 1L);
        }
    }
    
    public static void addImpressionAdMobEvent(final String s, final String s2) {
        try {
            addImpressionAdMobEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionAdMobEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionAdMobEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionAdMobEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("admob", s, jsonObject);
    }
    
    public static void addImpressionAdMobEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("admob", s, jsonObject, map);
    }
    
    public static void addImpressionAequusEvent(final String s, final String s2) {
        try {
            addImpressionAequusEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionAequusEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionAequusEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionAequusEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("aequus", s, jsonObject);
    }
    
    public static void addImpressionAequusEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("aequus", s, jsonObject, map);
    }
    
    public static void addImpressionEvent(final String s, final String s2, final String s3, final String s4) {
        try {
            addImpressionEvent(s, s2, new JSONObject(s3), jsonStringToMap(s4));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionEvent(final String s, final String s2, final String s3, final String s4, final boolean b) {
        try {
            addImpressionEvent(s, s2, new JSONObject(s3), jsonStringToMap(s4), b);
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionEvent(final String s, final String s2, final JSONObject jsonObject) {
        final Map map = null;
        addImpressionEvent(s, s2, jsonObject, null);
    }
    
    public static void addImpressionEvent(final String s, final String s2, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent(s, s2, jsonObject, map, false);
    }
    
    public static void addImpressionEvent(final String s, final String s2, final JSONObject jsonObject, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(s, s2, jsonObject, map, b) {
                final String val$adNetworkName;
                final String val$adNetworkVersion;
                final Map val$customFields;
                final JSONObject val$impressionData;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add impression event")) {
                        return;
                    }
                    GAEvents.addImpressionEvent(this.val$adNetworkName, this.val$adNetworkVersion, this.val$impressionData, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addImpressionEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(s, s2, jsonObject, map, b) {
                final String val$adNetworkName;
                final String val$adNetworkVersion;
                final Map val$customFields;
                final JSONObject val$impressionData;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add impression event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addImpressionEvent(this.val$adNetworkName, this.val$adNetworkVersion, this.val$impressionData, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addImpressionEvent(this.val$adNetworkName, this.val$adNetworkVersion, this.val$impressionData, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addImpressionEvent";
                }
            }, 1L);
        }
    }
    
    public static void addImpressionFyberEvent(final String s, final String s2) {
        try {
            addImpressionFyberEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionFyberEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionFyberEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionFyberEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("fyber", s, jsonObject);
    }
    
    public static void addImpressionFyberEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("fyber", s, jsonObject, map);
    }
    
    public static void addImpressionHyperBidEvent(final String s, final String s2) {
        try {
            addImpressionHyperBidEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionHyperBidEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionHyperBidEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionHyperBidEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("hyperbid", s, jsonObject);
    }
    
    public static void addImpressionHyperBidEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("hyperbid", s, jsonObject, map);
    }
    
    public static void addImpressionIronSourceEvent(final String s, final String s2) {
        try {
            addImpressionIronSourceEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionIronSourceEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionIronSourceEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionIronSourceEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("ironsource", s, jsonObject);
    }
    
    public static void addImpressionIronSourceEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("ironsource", s, jsonObject, map);
    }
    
    public static void addImpressionMaxEvent(final String s, final String s2) {
        try {
            addImpressionMaxEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionMaxEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionMaxEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionMaxEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("max", s, jsonObject);
    }
    
    public static void addImpressionMaxEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("max", s, jsonObject, map);
    }
    
    public static void addImpressionMoPubEvent(final String s, final String s2) {
        try {
            addImpressionMoPubEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionMoPubEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionMoPubEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionMoPubEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("mopub", s, jsonObject);
    }
    
    public static void addImpressionMoPubEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("mopub", s, jsonObject, map);
    }
    
    public static void addImpressionTopOnEvent(final String s, final String s2) {
        try {
            addImpressionTopOnEvent(s, new JSONObject(s2));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionTopOnEvent(final String s, final String s2, final String s3) {
        try {
            addImpressionTopOnEvent(s, new JSONObject(s2), jsonStringToMap(s3));
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void addImpressionTopOnEvent(final String s, final JSONObject jsonObject) {
        addImpressionEvent("topon", s, jsonObject);
    }
    
    public static void addImpressionTopOnEvent(final String s, final JSONObject jsonObject, final Map<String, Object> map) {
        addImpressionEvent("topon", s, jsonObject, map);
    }
    
    public static void addProgressionEvent(final int n, final String s, final String s2, final String s3) {
        addProgressionEvent(GAProgressionStatus.valueOf(n), s, s2, s3);
    }
    
    public static void addProgressionEvent(final int n, final String s, final String s2, final String s3, final double n2) {
        addProgressionEvent(GAProgressionStatus.valueOf(n), s, s2, s3, n2);
    }
    
    public static void addProgressionEvent(final int n, final String s, final String s2, final String s3, final double n2, final String s4) {
        addProgressionEvent(GAProgressionStatus.valueOf(n), s, s2, s3, n2, jsonStringToMap(s4), false);
    }
    
    public static void addProgressionEvent(final int n, final String s, final String s2, final String s3, final double n2, final String s4, final boolean b) {
        addProgressionEvent(GAProgressionStatus.valueOf(n), s, s2, s3, n2, jsonStringToMap(s4), b);
    }
    
    public static void addProgressionEvent(final int n, final String s, final String s2, final String s3, final String s4) {
        addProgressionEvent(GAProgressionStatus.valueOf(n), s, s2, s3, jsonStringToMap(s4), false);
    }
    
    public static void addProgressionEvent(final int n, final String s, final String s2, final String s3, final String s4, final boolean b) {
        addProgressionEvent(GAProgressionStatus.valueOf(n), s, s2, s3, jsonStringToMap(s4), b);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s) {
        addProgressionEvent(gaProgressionStatus, s, "", "");
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final double n) {
        addProgressionEvent(gaProgressionStatus, s, "", "", n);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final double n, final Map<String, Object> map) {
        addProgressionEvent(gaProgressionStatus, s, "", "", n, map, false);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final double n, final Map<String, Object> map, final boolean b) {
        addProgressionEvent(gaProgressionStatus, s, "", "", n, map, b);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2) {
        addProgressionEvent(gaProgressionStatus, s, s2, "");
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final double n) {
        addProgressionEvent(gaProgressionStatus, s, s2, "", n);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final double n, final Map<String, Object> map) {
        addProgressionEvent(gaProgressionStatus, s, s2, "", n, map, false);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final double n, final Map<String, Object> map, final boolean b) {
        addProgressionEvent(gaProgressionStatus, s, s2, "", n, map, b);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3) {
        final Map map = null;
        addProgressionEvent(gaProgressionStatus, s, s2, s3, null);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3, final double n) {
        final Map map = null;
        addProgressionEvent(gaProgressionStatus, s, s2, s3, n, null);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3, final double n, final Map<String, Object> map) {
        addProgressionEvent(gaProgressionStatus, s, s2, s3, n, map, false);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3, final double n, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaProgressionStatus, s, s2, s3, n, map, b) {
                final Map val$customFields;
                final boolean val$mergeFields;
                final String val$progression01;
                final String val$progression02;
                final String val$progression03;
                final GAProgressionStatus val$progressionStatus;
                final double val$score;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add progression event")) {
                        return;
                    }
                    GAEvents.addProgressionEvent(this.val$progressionStatus, this.val$progression01, this.val$progression02, this.val$progression03, (int)this.val$score, true, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addProgressionEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaProgressionStatus, s, s2, s3, n, map, b) {
                final Map val$customFields;
                final boolean val$mergeFields;
                final String val$progression01;
                final String val$progression02;
                final String val$progression03;
                final GAProgressionStatus val$progressionStatus;
                final double val$score;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add progression event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addProgressionEvent(this.val$progressionStatus, this.val$progression01, this.val$progression02, this.val$progression03, this.val$score, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addProgressionEvent(this.val$progressionStatus, this.val$progression01, this.val$progression02, this.val$progression03, (int)this.val$score, true, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addProgressionEvent";
                }
            }, 1L);
        }
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3, final Map<String, Object> map) {
        addProgressionEvent(gaProgressionStatus, s, s2, s3, map, false);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaProgressionStatus, s, s2, s3, map, b) {
                final Map val$customFields;
                final boolean val$mergeFields;
                final String val$progression01;
                final String val$progression02;
                final String val$progression03;
                final GAProgressionStatus val$progressionStatus;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add progression event")) {
                        return;
                    }
                    GAEvents.addProgressionEvent(this.val$progressionStatus, this.val$progression01, this.val$progression02, this.val$progression03, 0, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addProgressionEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaProgressionStatus, s, s2, s3, map, b) {
                final Map val$customFields;
                final boolean val$mergeFields;
                final String val$progression01;
                final String val$progression02;
                final String val$progression03;
                final GAProgressionStatus val$progressionStatus;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add progression event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addProgressionEvent(this.val$progressionStatus, this.val$progression01, this.val$progression02, this.val$progression03, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addProgressionEvent(this.val$progressionStatus, this.val$progression01, this.val$progression02, this.val$progression03, 0, false, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addProgressionEvent";
                }
            }, 1L);
        }
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final Map<String, Object> map) {
        addProgressionEvent(gaProgressionStatus, s, s2, "", map, false);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final Map<String, Object> map, final boolean b) {
        addProgressionEvent(gaProgressionStatus, s, s2, "", map, b);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final Map<String, Object> map) {
        addProgressionEvent(gaProgressionStatus, s, "", "", map, false);
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final Map<String, Object> map, final boolean b) {
        addProgressionEvent(gaProgressionStatus, s, "", "", map, b);
    }
    
    public static void addRemoteConfigsListener(final IRemoteConfigsListener remoteConfigsListener) {
        GAState.addRemoteConfigsListener(remoteConfigsListener);
    }
    
    public static void addResourceEvent(final int n, final String s, final float n2, final String s2, final String s3) {
        addResourceEvent(GAResourceFlowType.valueOf(n), s, n2, s2, s3);
    }
    
    public static void addResourceEvent(final int n, final String s, final float n2, final String s2, final String s3, final String s4) {
        addResourceEvent(GAResourceFlowType.valueOf(n), s, n2, s2, s3, jsonStringToMap(s4), false);
    }
    
    public static void addResourceEvent(final int n, final String s, final float n2, final String s2, final String s3, final String s4, final boolean b) {
        addResourceEvent(GAResourceFlowType.valueOf(n), s, n2, s2, s3, jsonStringToMap(s4), b);
    }
    
    public static void addResourceEvent(final GAResourceFlowType gaResourceFlowType, final String s, final float n, final String s2, final String s3) {
        final Map map = null;
        addResourceEvent(gaResourceFlowType, s, n, s2, s3, null);
    }
    
    public static void addResourceEvent(final GAResourceFlowType gaResourceFlowType, final String s, final float n, final String s2, final String s3, final Map<String, Object> map) {
        addResourceEvent(gaResourceFlowType, s, n, s2, s3, map, false);
    }
    
    public static void addResourceEvent(final GAResourceFlowType gaResourceFlowType, final String s, final float n, final String s2, final String s3, final Map<String, Object> map, final boolean b) {
        if (GAState.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaResourceFlowType, s, n, s2, s3, map, b) {
                final float val$amount;
                final String val$currency;
                final Map val$customFields;
                final GAResourceFlowType val$flowType;
                final String val$itemId;
                final String val$itemType;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, true, "Could not add resource event")) {
                        return;
                    }
                    GAEvents.addResourceEvent(this.val$flowType, this.val$currency, (double)this.val$amount, this.val$itemType, this.val$itemId, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addResourceEvent";
                }
            });
        }
        else {
            GAThreading.performTaskDelayed((IBlock)new IBlock(gaResourceFlowType, s, n, s2, s3, map, b) {
                final float val$amount;
                final String val$currency;
                final Map val$customFields;
                final GAResourceFlowType val$flowType;
                final String val$itemId;
                final String val$itemType;
                final boolean val$mergeFields;
                
                @Override
                public void execute() {
                    if (!isSdkReady(true, GameAnalytics.currentRetries >= 500, "Could not add resource event")) {
                        if (!GAState.isInitialized() && GameAnalytics.currentRetries < 500) {
                            GameAnalytics.addResourceEvent(this.val$flowType, this.val$currency, this.val$amount, this.val$itemType, this.val$itemId, (Map<String, Object>)this.val$customFields, this.val$mergeFields);
                            ++GameAnalytics.currentRetries;
                        }
                        return;
                    }
                    GAEvents.addResourceEvent(this.val$flowType, this.val$currency, (double)this.val$amount, this.val$itemType, this.val$itemId, this.val$customFields, this.val$mergeFields);
                }
                
                @Override
                public String getName() {
                    return "addResourceEvent";
                }
            }, 1L);
        }
    }
    
    public static void configureAutoDetectAppVersion(final boolean b) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b) {
            final boolean val$flag;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    return;
                }
                GAState.setAutoDetectAppVersion(this.val$flag);
            }
            
            @Override
            public String getName() {
                return "configureAutoDetectAppVersion";
            }
        });
    }
    
    public static void configureAvailableCustomDimensions01(final String... array) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(array) {
            final String[] val$customDimensions;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("Available custom dimensions must be set before SDK is initialized");
                    return;
                }
                GAState.setAvailableCustomDimensions01(this.val$customDimensions);
            }
            
            @Override
            public String getName() {
                return "configureAvailableCustomDimensions01";
            }
        });
    }
    
    public static void configureAvailableCustomDimensions02(final String... array) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(array) {
            final String[] val$customDimensions;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("Available custom dimensions must be set before SDK is initialized");
                    return;
                }
                GAState.setAvailableCustomDimensions02(this.val$customDimensions);
            }
            
            @Override
            public String getName() {
                return "configureAvailableCustomDimensions02";
            }
        });
    }
    
    public static void configureAvailableCustomDimensions03(final String... array) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(array) {
            final String[] val$customDimensions;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("Available custom dimensions must be set before SDK is initialized");
                    return;
                }
                GAState.setAvailableCustomDimensions03(this.val$customDimensions);
            }
            
            @Override
            public String getName() {
                return "configureAvailableCustomDimensions03";
            }
        });
    }
    
    public static void configureAvailableResourceCurrencies(final String... array) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(array) {
            final String[] val$resourceCurrencies;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("Available resource currencies must be set before SDK is initialized");
                    return;
                }
                GAState.setAvailableResourceCurrencies(this.val$resourceCurrencies);
            }
            
            @Override
            public String getName() {
                return "configureAvailableResourceCurrencies";
            }
        });
    }
    
    public static void configureAvailableResourceItemTypes(final String... array) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(array) {
            final String[] val$resourceItemTypes;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("Available resource item types must be set before SDK is initialized");
                    return;
                }
                GAState.setAvailableResourceItemTypes(this.val$resourceItemTypes);
            }
            
            @Override
            public String getName() {
                return "configureAvailableResourceItemTypes";
            }
        });
    }
    
    public static void configureBuild(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$build;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("Build version must be set before SDK is initialized.");
                    return;
                }
                if (!GAValidator.validateBuild(this.val$build)) {
                    GALogger.i("Validation fail - configure build: Cannot be null, empty or above 32 length. String: " + this.val$build);
                    return;
                }
                GAState.setBuild(this.val$build);
            }
            
            @Override
            public String getName() {
                return "configureBuild";
            }
        });
    }
    
    public static void configureExternalUserId(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$uId;
            
            @Override
            public void execute() {
                GAState.setExternalUserId(this.val$uId);
            }
            
            @Override
            public String getName() {
                return "configureExternalUserId";
            }
        });
    }
    
    public static void configureGameEngineVersion(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$gameEngineVersion;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    return;
                }
                if (!GAValidator.validateEngineVersion(this.val$gameEngineVersion)) {
                    GALogger.i("Validation fail - configure sdk version: Sdk version not supported. String: " + this.val$gameEngineVersion);
                    return;
                }
                GADevice.setGameEngineVersion(this.val$gameEngineVersion);
            }
            
            @Override
            public String getName() {
                return "configureGameEngineVersion";
            }
        });
    }
    
    static void configureIsHacked(final boolean b) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b) {
            final boolean val$isHacked;
            
            @Override
            public void execute() {
                if (!isSdkReady(false)) {
                    return;
                }
                GADevice.setIsHacked(this.val$isHacked);
            }
            
            @Override
            public String getName() {
                return "configureIsHacked";
            }
        });
    }
    
    static void configureIsLimitedAdTracking(final boolean b) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b) {
            final boolean val$isLimitedAdTracking;
            
            @Override
            public void execute() {
                if (!isSdkReady(false)) {
                    return;
                }
                GADevice.setIsLimitedAdTracking(this.val$isLimitedAdTracking);
            }
            
            @Override
            public String getName() {
                return "configureIsLimitedAdTracking";
            }
        });
    }
    
    public static void configureSdkGameEngineVersion(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$sdkGameEngineVersion;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    return;
                }
                if (!GAValidator.validateSdkWrapperVersion(this.val$sdkGameEngineVersion)) {
                    GALogger.i("Validation fail - configure sdk version: Sdk version not supported. String: " + this.val$sdkGameEngineVersion);
                    return;
                }
                GADevice.setSdkGameEngineVersion(this.val$sdkGameEngineVersion);
            }
            
            @Override
            public String getName() {
                return "configureSdkGameEngineVersion";
            }
        });
    }
    
    public static void configureUserId(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$uId;
            
            @Override
            public void execute() {
                if (isSdkReady(true, false)) {
                    GALogger.w("A custom user id must be set before SDK is initialized.");
                    return;
                }
                if (!GAValidator.validateUserId(this.val$uId)) {
                    GALogger.i("Validation fail - configure user_id: Cannot be null, empty or above 64 length. Will use default user_id method. Used string: " + this.val$uId);
                    return;
                }
                GAState.setUserId(this.val$uId);
            }
            
            @Override
            public String getName() {
                return "configureUserId";
            }
        });
    }
    
    static void configureWritableFilePath(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$path;
            
            @Override
            public void execute() {
                GADevice.setWritableFilePath(this.val$path);
                if (!GAStore.ensureDatabase(false)) {
                    GALogger.w("Could not ensure/validate local event database: " + this.val$path);
                }
            }
            
            @Override
            public String getName() {
                return "configureWritableFilePath";
            }
        });
    }
    
    public static void enableFpsHistogram(final boolean b) {
        GAState.enableFpsSampling(b);
    }
    
    public static void enableHealthHardwareInfo(final boolean b) {
        GADevice.DeviceInfo.enableHardwareTracking = b;
        GADevice.DeviceInfo.enableMemoryTracking = b;
    }
    
    public static void enableMemoryHistogram(final boolean b) {
        GAState.enableMemorySampling(b);
    }
    
    public static void enableSDKInitEvent(final boolean isSdkInitEventEnabled) {
        GAEvents.isSdkInitEventEnabled = isSdkInitEventEnabled;
    }
    
    public static void endSession() {
        if (GAState.useManualSessionHandling()) {
            onStop();
        }
    }
    
    public static String getABTestingId() {
        return GAState.getABTestingId();
    }
    
    public static String getABTestingVariantId() {
        return GAState.getABTestingVariantId();
    }
    
    public static String getExternalUserId() {
        return GAState.getExternalUserId();
    }
    
    public static String getRemoteConfigsContentAsString() {
        return GAState.getRemoteConfigsContentAsString();
    }
    
    public static String getRemoteConfigsValueAsString(final String s) {
        return getRemoteConfigsValueAsString(s, null);
    }
    
    public static String getRemoteConfigsValueAsString(final String s, final String s2) {
        return GAState.getRemoteConfigsStringValue(s, s2);
    }
    
    public static String getUserId() {
        return GAState.getUserId();
    }
    
    public static void initialize(final Activity activity, final String s, final String s2) {
        GADevice.DeviceInfo.GetAppUptime();
        GAPlatform.initialize(activity);
        initialize(s, s2);
    }
    
    public static void initialize(final String s, final String s2) {
        if (GAPlatform.isInitialized()) {
            GAThreading.performTaskOnGAThread((IBlock)new IBlock(s, s2) {
                final String val$gameKey;
                final String val$gameSecret;
                
                @Override
                public void execute() {
                    if (isSdkReady(true, false)) {
                        GALogger.w("SDK already initialized. Can only be called once.");
                        return;
                    }
                    if (!GAValidator.validateKeys(this.val$gameKey, this.val$gameSecret)) {
                        GALogger.w("SDK failed initialize. Game key or secret key is invalid. Can only contain characters A-z 0-9, gameKey is 32 length, gameSecret is 40 length. Failed keys - gameKey: " + this.val$gameKey + ", secretKey: " + this.val$gameSecret);
                        return;
                    }
                    GAState.setKeys(this.val$gameKey, this.val$gameSecret);
                    GAState.internalInitialize();
                }
                
                @Override
                public String getName() {
                    return "initialize";
                }
            });
        }
        else {
            GALogger.w("Initialize error: You must call GAPlatform.initialize before GameAnalytics.initialize. Or add the activity to GameAnalytics.initialize.");
        }
    }
    
    public static boolean isRemoteConfigsReady() {
        return GAState.isRemoteConfigsReady();
    }
    
    private static boolean isSdkReady(final boolean b) {
        return isSdkReady(b, true);
    }
    
    private static boolean isSdkReady(final boolean b, final boolean b2) {
        return isSdkReady(b, b2, "");
    }
    
    private static boolean isSdkReady(final boolean b, final boolean b2, final String s) {
        String string = s;
        if (s.length() != 0) {
            string = s + ": ";
        }
        if (!GAStore.getTableReady()) {
            if (b2) {
                GALogger.w(string + "Datastore not initialized");
            }
            return false;
        }
        if (b && !GAState.isInitialized()) {
            if (b2) {
                GALogger.w(string + "SDK is not initialized");
            }
            return false;
        }
        if (b && !GAState.isEnabled()) {
            if (b2) {
                GALogger.w(string + "SDK is disabled");
            }
            return false;
        }
        if (b && !GAState.sessionIsStarted()) {
            if (b2) {
                GALogger.w(string + "Session has not started yet");
            }
            return false;
        }
        return true;
    }
    
    private static Map<String, Object> jsonStringToMap(final String s) {
        final HashMap hashMap = new HashMap();
        try {
            final JSONObject jsonObject = new JSONObject(s);
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s2 = (String)keys.next();
                ((Map)hashMap).put((Object)s2, jsonObject.get(s2));
            }
        }
        catch (final JSONException ex) {
            GALogger.d("jsonStringToMap: failed to decode jsonString=" + s);
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.JsonStringToMap, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
        return (Map<String, Object>)hashMap;
    }
    
    static void onResume() {
        GAThreading.start();
        GAThreading.performTaskOnGAThread((IBlock)new IBlock() {
            @Override
            public void execute() {
                GAState.resumeSessionAndStartQueue();
            }
            
            @Override
            public String getName() {
                return "onResume";
            }
        });
    }
    
    static void onStop() {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock() {
            @Override
            public void execute() {
                GAState.endSessionAndStopQueue();
            }
            
            @Override
            public String getName() {
                return "onStop";
            }
        });
    }
    
    public static void pauseTimer(final String s) {
        Stopwatch.pauseTimer(s);
    }
    
    public static void removeRemoteConfigsListener(final IRemoteConfigsListener remoteConfigsListener) {
        GAState.removeRemoteConfigsListener(remoteConfigsListener);
    }
    
    public static void resumeTimer(final String s) {
        Stopwatch.resumeTimer(s);
    }
    
    static void setAppBuild(final int n) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(n) {
            final int val$appBuild;
            
            @Override
            public void execute() {
                GADevice.setAppBuild(this.val$appBuild);
            }
            
            @Override
            public String getName() {
                return "setAppBuild";
            }
        });
    }
    
    static void setAppVersion(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$appVersion;
            
            @Override
            public void execute() {
                GADevice.setAppVersion(this.val$appVersion);
            }
            
            @Override
            public String getName() {
                return "setAppVersion";
            }
        });
    }
    
    public static void setBaseUrl(final String baseUrl) {
        GAHTTPApi.getInstance().setBaseUrl(baseUrl);
    }
    
    static void setBundleIdentifier(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$bundleIdentifier;
            
            @Override
            public void execute() {
                GADevice.setBundleId(this.val$bundleIdentifier);
            }
            
            @Override
            public String getName() {
                return "setBundleIdentifier";
            }
        });
    }
    
    static void setConnectionType(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$networkConnectionType;
            
            @Override
            public void execute() {
                if (!isSdkReady(false)) {
                    return;
                }
                GADevice.setConnectionType(this.val$networkConnectionType);
            }
            
            @Override
            public String getName() {
                return "setConnectionType";
            }
        });
    }
    
    public static void setCustomDimension01(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$dimension;
            
            @Override
            public void execute() {
                if (!GAValidator.validateDimension01(this.val$dimension)) {
                    GALogger.w("Could not set custom01 dimension value to '" + this.val$dimension + "'. Value not found in available custom01 dimension values");
                    return;
                }
                GAState.setCustomDimension01(this.val$dimension);
            }
            
            @Override
            public String getName() {
                return "setCustomDimension01";
            }
        });
    }
    
    public static void setCustomDimension02(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$dimension;
            
            @Override
            public void execute() {
                if (!GAValidator.validateDimension02(this.val$dimension)) {
                    GALogger.w("Could not set custom02 dimension value to '" + this.val$dimension + "'. Value not found in available custom02 dimension values");
                    return;
                }
                GAState.setCustomDimension02(this.val$dimension);
            }
            
            @Override
            public String getName() {
                return "setCustomDimension02";
            }
        });
    }
    
    public static void setCustomDimension03(final String s) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(s) {
            final String val$dimension;
            
            @Override
            public void execute() {
                if (!GAValidator.validateDimension03(this.val$dimension)) {
                    GALogger.w("Could not set custom03 dimension value to '" + this.val$dimension + "'. Value not found in available custom03 dimension values");
                    return;
                }
                GAState.setCustomDimension03(this.val$dimension);
            }
            
            @Override
            public String getName() {
                return "setCustomDimension03";
            }
        });
    }
    
    public static void setEnabledErrorReporting(final boolean enableErrorReporting) {
        GAState.setEnableErrorReporting(enableErrorReporting);
    }
    
    public static void setEnabledEventSubmission(final boolean b) {
        setEnabledEventSubmission(b, false);
    }
    
    public static void setEnabledEventSubmission(final boolean b, final boolean b2) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b, b2) {
            final boolean val$doSubmitEventsLocally;
            final boolean val$flag;
            
            @Override
            public void execute() {
                final boolean val$flag = this.val$flag;
                if (val$flag) {
                    GAState.setEnableEventSubmission(val$flag, this.val$doSubmitEventsLocally);
                    GALogger.i("Event submission enabled");
                }
                else {
                    GALogger.i("Event submission disabled");
                    GAState.setEnableEventSubmission(this.val$flag, this.val$doSubmitEventsLocally);
                }
            }
            
            @Override
            public String getName() {
                return "setEnabledEventSubmission";
            }
        });
    }
    
    public static void setEnabledInfoLog(final boolean b) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b) {
            final boolean val$flag;
            
            @Override
            public void execute() {
                final boolean val$flag = this.val$flag;
                if (val$flag) {
                    GALogger.setInfoLog(val$flag);
                    GALogger.i("Info logging enabled");
                }
                else {
                    GALogger.i("Info logging disabled");
                    GALogger.setInfoLog(this.val$flag);
                }
            }
            
            @Override
            public String getName() {
                return "setEnabledInfoLog";
            }
        });
    }
    
    public static void setEnabledManualSessionHandling(final boolean b) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b) {
            final boolean val$flag;
            
            @Override
            public void execute() {
                GAState.setManualSessionHandling(this.val$flag);
            }
            
            @Override
            public String getName() {
                return "setEnabledManualSessionHandling";
            }
        });
    }
    
    public static void setEnabledVerboseLog(final boolean b) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(b) {
            final boolean val$flag;
            
            @Override
            public void execute() {
                final boolean val$flag = this.val$flag;
                if (val$flag) {
                    GALogger.setAdvancedInfoLog(val$flag);
                    GALogger.i("Verbose logging enabled");
                }
                else {
                    GALogger.i("Verbose logging disabled");
                    GALogger.setAdvancedInfoLog(this.val$flag);
                }
            }
            
            @Override
            public String getName() {
                return "setEnabledVerboseLog";
            }
        });
    }
    
    public static void setGAIDTracking(final boolean doTrackGAID) {
        GADevice.doTrackGAID = doTrackGAID;
    }
    
    public static void setGlobalCustomEventFields(final String s) {
        setGlobalCustomEventFields(jsonStringToMap(s));
    }
    
    public static void setGlobalCustomEventFields(final Map<String, Object> map) {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(map) {
            final Map val$customFields;
            
            @Override
            public void execute() {
                GAState.setGlobalCustomEventFields(this.val$customFields);
            }
            
            @Override
            public String getName() {
                return "setGlobalCustomEventFields";
            }
        });
    }
    
    public static void startSession() {
        GAThreading.performTaskOnGAThread((IBlock)new IBlock() {
            @Override
            public void execute() {
                if (GAState.useManualSessionHandling()) {
                    if (!GAState.isInitialized()) {
                        return;
                    }
                    if (GAState.isEnabled() && GAState.sessionIsStarted()) {
                        GAState.endSessionAndStopQueue();
                    }
                    GAState.resumeSessionAndStartQueue();
                }
            }
            
            @Override
            public String getName() {
                return "startSession";
            }
        });
    }
    
    public static void startTimer(final String s) {
        Stopwatch.startTimer(s);
    }
    
    public static long stopTimer(final String s) {
        return Stopwatch.stopTimer(s);
    }
}
