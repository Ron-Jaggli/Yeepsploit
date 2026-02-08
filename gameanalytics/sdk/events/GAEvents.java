package com.gameanalytics.sdk.events;

import org.json.JSONTokener;
import com.gameanalytics.sdk.http.EGAHTTPApiResponse;
import java.util.UUID;
import com.gameanalytics.sdk.threading.GAThreading;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.GAResourceFlowType;
import com.gameanalytics.sdk.GAProgressionStatus;
import com.gameanalytics.sdk.device.GADevice;
import org.json.JSONArray;
import com.gameanalytics.sdk.device.GADevice$DeviceInfo;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.GAErrorSeverity;
import java.io.UnsupportedEncodingException;
import android.util.Base64;
import com.gameanalytics.sdk.store.GAStore;
import java.util.ArrayList;
import java.util.Iterator;
import com.gameanalytics.sdk.validators.ValidationResult;
import org.json.JSONException;
import com.gameanalytics.sdk.logging.GALogger;
import java.util.Map$Entry;
import java.util.HashMap;
import org.json.JSONObject;
import com.gameanalytics.sdk.http.GAHTTPApi;
import com.gameanalytics.sdk.validators.GAValidator;
import com.gameanalytics.sdk.state.GAState;
import java.util.Map;
import com.gameanalytics.sdk.GAAdError;
import com.gameanalytics.sdk.GAAdType;
import com.gameanalytics.sdk.GAAdAction;
import com.gameanalytics.sdk.threading.IBlock;
import java.util.HashSet;

public class GAEvents
{
    private static final String CATEGORY_ADS = "ads";
    private static final String CATEGORY_BUSINESS = "business";
    private static final String CATEGORY_DESIGN = "design";
    private static final String CATEGORY_ERROR = "error";
    private static final String CATEGORY_HEALTH = "health";
    private static final String CATEGORY_IMPRESSION = "impression";
    private static final String CATEGORY_PROGRESSION = "progression";
    private static final String CATEGORY_RESOURCE = "resource";
    private static final String CATEGORY_SDK_INIT = "sdk_init";
    private static final String CATEGORY_SESSION_END = "session_end";
    private static final String CATEGORY_SESSION_START = "user";
    private static final GAEvents INSTANCE;
    private static final int MAX_EVENTS_SIZE = 500;
    private static int countEnd;
    private static int countMissingEnd;
    private static int countUser;
    private static HashSet<Integer> fixedMissingSessionEnds;
    public static boolean isSdkInitEventEnabled;
    private static final IBlock processEventQueueBlock;
    private boolean isRunning;
    private boolean keepRunning;
    
    static {
        INSTANCE = new GAEvents();
        GAEvents.isSdkInitEventEnabled = false;
        GAEvents.countEnd = 0;
        GAEvents.countUser = 0;
        GAEvents.countMissingEnd = 0;
        GAEvents.fixedMissingSessionEnds = (HashSet<Integer>)new HashSet();
        processEventQueueBlock = (IBlock)new IBlock() {
            public void execute() {
                processEventQueue();
            }
            
            public String getName() {
                return "processEventQueue";
            }
        };
    }
    
    private GAEvents() {
    }
    
    public static void addAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, String s, final String s2, final GAAdError gaAdError, final long n, final boolean b, final Map<String, Object> map, final boolean b2) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final String string = gaAdAction.toString();
        final String string2 = gaAdType.toString();
        final String string3 = gaAdError.toString();
        final ValidationResult validateAdEvent = GAValidator.validateAdEvent(gaAdAction, gaAdType, s, s2);
        if (validateAdEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateAdEvent.category, validateAdEvent.area, validateAdEvent.action, validateAdEvent.parameter, validateAdEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("category", (Object)"ads");
            jsonObject.put("ad_sdk_name", (Object)s);
            jsonObject.put("ad_placement", (Object)s2);
            jsonObject.put("ad_type", (Object)string2);
            jsonObject.put("ad_action", (Object)string);
            if (gaAdAction == GAAdAction.FailedShow && string3.length() > 0) {
                jsonObject.put("ad_fail_show_reason", (Object)string3);
            }
            if (b && (gaAdType == GAAdType.RewardedVideo || gaAdType == GAAdType.Video)) {
                jsonObject.put("ad_duration", n);
            }
            addDimensionsToEvent(jsonObject);
            Map<String, Object> globalCustomEventFields;
            if (map != null && !map.isEmpty()) {
                globalCustomEventFields = map;
            }
            else {
                globalCustomEventFields = GAState.getGlobalCustomEventFields();
            }
            final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
            if (b2 && map != null && !map.isEmpty()) {
                for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                    if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                        ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            final StringBuilder append = new StringBuilder().append("Add AD event: {ad_sdk_name:").append(s).append(", ad_placement:").append(s2).append(", ad_type:").append(string2).append(", ad_action:").append(string);
            final GAAdAction failedShow = GAAdAction.FailedShow;
            s = "";
            String string4;
            if (gaAdAction == failedShow && string3.length() > 0) {
                string4 = ", ad_fail_show_reason:" + string3;
            }
            else {
                string4 = "";
            }
            final StringBuilder append2 = append.append(string4);
            String string5 = s;
            Label_0507: {
                if (b) {
                    if (gaAdType != GAAdType.RewardedVideo) {
                        string5 = s;
                        if (gaAdType != GAAdType.Video) {
                            break Label_0507;
                        }
                    }
                    string5 = ", ad_duration:" + n;
                }
            }
            GALogger.i(append2.append(string5).append("}").toString());
            addEventToStore(jsonObject);
        }
        catch (final JSONException ex) {
            GALogger.e("addAdEvent: Error creating json");
            ex.printStackTrace();
        }
    }
    
    public static void addBusinessEvent(String s, final int n, String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final Map<String, Object> map, final boolean b) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final ValidationResult validateBusinessEvent = GAValidator.validateBusinessEvent(s, n, s4, s2, s3, s5, s6, s7);
        if (validateBusinessEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateBusinessEvent.category, validateBusinessEvent.area, validateBusinessEvent.action, validateBusinessEvent.parameter, validateBusinessEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        GAState.incrementTransactionNum();
        final ArrayList list = new ArrayList();
        list.add((Object)"transaction_num");
        list.add((Object)String.valueOf(GAState.getTransactionNum()));
        GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_state (key, value) VALUES(?, ?);", (ArrayList<String>)list);
        try {
            final JSONObject jsonObject2 = new JSONObject();
            if (s5 != null && s5.length() != 0) {
                try {
                    jsonObject2.put("receipt", (Object)Base64.encodeToString(s5.getBytes("UTF-8"), 0));
                }
                catch (final UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
                jsonObject2.put("store", (Object)s6);
                if (s7 != null && s7.length() != 0) {
                    jsonObject2.put("signature", (Object)s7);
                }
            }
            jsonObject.put("event_id", (Object)(s2 + ":" + s3));
            jsonObject.put("category", (Object)"business");
            jsonObject.put("currency", (Object)s);
            jsonObject.put("amount", n);
            jsonObject.put("transaction_num", GAState.getTransactionNum());
            if (s4 != null && s4.length() != 0) {
                jsonObject.put("cart_type", (Object)s4);
            }
            if (jsonObject2.length() != 0) {
                jsonObject.put("receipt_info", (Object)jsonObject2);
            }
            addDimensionsToEvent(jsonObject);
            Map<String, Object> globalCustomEventFields;
            if (map != null && !map.isEmpty()) {
                globalCustomEventFields = map;
            }
            else {
                globalCustomEventFields = GAState.getGlobalCustomEventFields();
            }
            final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
            if (b && map != null && !map.isEmpty()) {
                for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                    if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                        ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            final StringBuilder append = new StringBuilder().append("Add BUSINESS event: {currency:").append(s).append(", amount:").append(n).append(", itemType:").append(s2).append(", itemId:").append(s3).append(", cartType:").append(s4);
            s = (s2 = "");
            if (s5 != null) {
                s2 = s;
                if (s5.length() != 0) {
                    final StringBuilder append2 = new StringBuilder().append(", receipt_info: { store: ").append(s6).append(", receipt: #RECEIPT#");
                    s2 = s;
                    if (s7 != null) {
                        s2 = s;
                        if (s7.length() != 0) {
                            s2 = ", signature: " + s7;
                        }
                    }
                    s2 = append2.append(s2).append("}").toString();
                }
            }
            GALogger.i(append.append(s2).append("}").toString());
            addEventToStore(jsonObject);
        }
        catch (final JSONException ex2) {
            GALogger.e("addBusinessEvent: Error creating json");
            ex2.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.JsonError, ex2.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    private static void addCustomFieldsToEvent(final JSONObject jsonObject, final JSONObject jsonObject2) {
        if (jsonObject == null) {
            return;
        }
        if (jsonObject2 != null) {
            try {
                if (jsonObject2.length() > 0) {
                    jsonObject.put("custom_fields", (Object)jsonObject2);
                }
            }
            catch (final JSONException ex) {
                GALogger.e("addFieldsToEvent: Error creating json");
                ex.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.AddFields, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }
    
    public static void addDesignEvent(final String s, final double n, final boolean b, final Map<String, Object> map, final boolean b2) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final ValidationResult validateDesignEvent = GAValidator.validateDesignEvent(s);
        if (validateDesignEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateDesignEvent.category, validateDesignEvent.area, validateDesignEvent.action, validateDesignEvent.parameter, validateDesignEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("category", (Object)"design");
            jsonObject.put("event_id", (Object)s);
            if (b) {
                jsonObject.put("value", n);
            }
            addDimensionsToEvent(jsonObject);
            Map<String, Object> globalCustomEventFields;
            if (map != null && !map.isEmpty()) {
                globalCustomEventFields = map;
            }
            else {
                globalCustomEventFields = GAState.getGlobalCustomEventFields();
            }
            final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
            if (b2 && map != null && !map.isEmpty()) {
                for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                    if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                        ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            GALogger.i("Add DESIGN event: {eventId:" + s + ", value:" + n + "}");
            addEventToStore(jsonObject);
        }
        catch (final JSONException ex) {
            GALogger.e("addDesignEvent: Error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.DesignEvent, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    public static void addDimensionsToEvent(final JSONObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        try {
            if (GAState.getDimension01().length() != 0) {
                jsonObject.put("custom_01", (Object)GAState.getDimension01());
            }
            if (GAState.getDimension02().length() != 0) {
                jsonObject.put("custom_02", (Object)GAState.getDimension02());
            }
            if (GAState.getDimension03().length() != 0) {
                jsonObject.put("custom_03", (Object)GAState.getDimension03());
            }
        }
        catch (final JSONException ex) {
            GALogger.e("addDimensionsToEvent: Error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.AddDimensions, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    public static void addErrorEvent(final GAErrorSeverity gaErrorSeverity, final String s, final Map<String, Object> map, final boolean b, final String s2, final int n, final String s3) {
        addErrorEvent(gaErrorSeverity, s, map, b, false, s2, n, s3);
    }
    
    public static void addErrorEvent(final GAErrorSeverity gaErrorSeverity, final String s, final Map<String, Object> map, final boolean b, final boolean b2, final String s2, final int n, String string) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        string = gaErrorSeverity.toString();
        final ValidationResult validateErrorEvent = GAValidator.validateErrorEvent(gaErrorSeverity, s);
        if (validateErrorEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateErrorEvent.category, validateErrorEvent.area, validateErrorEvent.action, validateErrorEvent.parameter, validateErrorEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("category", (Object)"error");
            jsonObject.put("severity", (Object)string);
            jsonObject.put("message", (Object)s);
            addDimensionsToEvent(jsonObject);
            if (!b2) {
                Map<String, Object> globalCustomEventFields;
                if (map != null && !map.isEmpty()) {
                    globalCustomEventFields = map;
                }
                else {
                    globalCustomEventFields = GAState.getGlobalCustomEventFields();
                }
                final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
                if (b && map != null && !map.isEmpty()) {
                    for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                            ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            }
            if (s2 != null && !s2.isEmpty()) {
                jsonObject.put("function_name", (Object)s2);
            }
            if (n >= 0) {
                jsonObject.put("line_number", n);
            }
            GALogger.i("Add ERROR event: {severity:" + string + ", message:" + s + "}");
            addEventToStore(jsonObject);
        }
        catch (final JSONException ex) {
            GALogger.e("addErrorEvent: Error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ErrorEvent, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    private static void addEventToStore(final JSONObject jsonObject) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        if (!GAStore.getTableReady()) {
            GALogger.w("Could not add event: SDK datastore error");
            return;
        }
        if (!GAState.isInitialized()) {
            GALogger.w("Could not add event: SDK is not initialized");
            return;
        }
        try {
            if (GAStore.isDbTooLargeForEvents() && !GAUtilities.stringMatch(jsonObject.getString("category"), "^(user|session_end|business)$")) {
                GALogger.w("Database too large. Event has been blocked.");
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.AddEventsToStore, EGASdkErrorAction.DatabaseTooLarge, "", GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            final JSONObject eventAnnotations = GAState.getEventAnnotations();
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s = (String)keys.next();
                eventAnnotations.put(s, jsonObject.get(s));
            }
            final String string = eventAnnotations.toString();
            GALogger.ii("Event added to queue: " + string);
            final ArrayList list = new ArrayList();
            list.add((Object)"new");
            list.add((Object)eventAnnotations.getString("category"));
            list.add((Object)eventAnnotations.getString("session_id"));
            list.add((Object)eventAnnotations.getString("client_ts"));
            list.add((Object)string);
            GAStore.executeQuerySync("INSERT INTO ga_events (status, category, session_id, client_ts, event) VALUES(?, ?, ?, ?, ?);", (ArrayList<String>)list);
            if (jsonObject.getString("category").equals((Object)"session_end")) {
                list.clear();
                list.add((Object)eventAnnotations.getString("session_id"));
                GAStore.executeQuerySync("DELETE FROM ga_session WHERE session_id = ?;", (ArrayList<String>)list);
            }
            else {
                updateSessionTime();
            }
        }
        catch (final JSONException ex) {
            GALogger.e("addEventToStore: error using json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.AddEventsToStore, EGASdkErrorAction.DatabaseTooLarge, "", GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    private static void addHealthAnnotations(final JSONObject jsonObject, final GADevice$DeviceInfo gaDevice$DeviceInfo) {
        if (jsonObject != null) {
            if (gaDevice$DeviceInfo != null) {
                try {
                    if (GADevice$DeviceInfo.enableHardwareTracking) {
                        if (gaDevice$DeviceInfo.cpuName != null && !gaDevice$DeviceInfo.cpuName.isEmpty()) {
                            jsonObject.put("cpu_model", (Object)gaDevice$DeviceInfo.cpuName);
                        }
                        if (gaDevice$DeviceInfo.hardware != null && !gaDevice$DeviceInfo.hardware.isEmpty()) {
                            jsonObject.put("hardware", (Object)gaDevice$DeviceInfo.hardware);
                        }
                        if (gaDevice$DeviceInfo.numCores > 0) {
                            jsonObject.put("cpu_num_cores", gaDevice$DeviceInfo.numCores);
                        }
                    }
                    if (GADevice$DeviceInfo.enableMemoryTracking) {
                        if (gaDevice$DeviceInfo.memTotal > 0.0) {
                            jsonObject.put("memory_sys_total", gaDevice$DeviceInfo.memTotal);
                            jsonObject.put("memory_sys_used", gaDevice$DeviceInfo.UsedSysMemory());
                        }
                        if (gaDevice$DeviceInfo.appMemoryUsage > 0.0) {
                            jsonObject.put("memory_app_used", gaDevice$DeviceInfo.appMemoryUsage);
                        }
                    }
                    if (GADevice$DeviceInfo.enableStorageTracking) {
                        if (gaDevice$DeviceInfo.totalDeviceStorage > 0.0) {
                            jsonObject.put("storage_device_total", gaDevice$DeviceInfo.totalDeviceStorage);
                        }
                        if (gaDevice$DeviceInfo.availableDeviceStorage > 0.0) {
                            jsonObject.put("storage_device_free", gaDevice$DeviceInfo.availableDeviceStorage);
                        }
                        if (GADevice$DeviceInfo.enableExternalStorageTracking) {
                            if (gaDevice$DeviceInfo.totalExternalStorage > 0.0) {
                                jsonObject.put("storage_external_total", gaDevice$DeviceInfo.totalExternalStorage);
                            }
                            if (gaDevice$DeviceInfo.availableExternalStorage > 0.0) {
                                jsonObject.put("storage_external_free", gaDevice$DeviceInfo.availableExternalStorage);
                            }
                        }
                    }
                    if (gaDevice$DeviceInfo.screenHeight > 0 && gaDevice$DeviceInfo.screenWidth > 0) {
                        jsonObject.put("resolution", (Object)new StringBuilder().append(gaDevice$DeviceInfo.screenWidth).append('x').append(gaDevice$DeviceInfo.screenHeight).toString());
                    }
                }
                catch (final JSONException ex) {
                    ex.printStackTrace();
                }
                finally {
                    final Throwable t;
                    t.printStackTrace();
                }
            }
        }
    }
    
    public static void addHealthEvent(final long[] array, final boolean b) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        if (!GADevice$DeviceInfo.IsHealthEventEnabled()) {
            return;
        }
        try {
            final JSONObject jsonObject = new JSONObject();
            final boolean enableFPSTracking = GADevice$DeviceInfo.enableFPSTracking;
            final int n = 0;
            if (enableFPSTracking) {
                final JSONArray jsonArray = new JSONArray();
                boolean b2;
                if (array != null && array.length == 121) {
                    int n2 = 0;
                    while (true) {
                        b2 = b;
                        if (n2 >= array.length) {
                            break;
                        }
                        jsonArray.put(array[n2]);
                        ++n2;
                    }
                }
                else {
                    GALogger.e("addHealthEvent: Invalid fps metrics");
                    for (int i = 0; i < 121; ++i) {
                        jsonArray.put(0L);
                    }
                    b2 = true;
                }
                if (b2) {
                    GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.HealthEvent, EGASdkErrorAction.JsonError, "An error occured during calculating the fps metrics. Fps health event may not be accurate", GAState.getGameKey(), GAState.getSecretKey());
                    GALogger.e("addHealthEvent: Inaccurate fps reading.");
                }
                jsonObject.put("fps_data_table", (Object)jsonArray);
            }
            final GADevice$DeviceInfo readDeviceInfo = GADevice.ReadDeviceInfo();
            jsonObject.put("category", (Object)"health");
            addHealthAnnotations(jsonObject, readDeviceInfo);
            if (GADevice$DeviceInfo.enableMemoryTracking && GADevice$DeviceInfo.enableMemoryHistograms) {
                final int[] getAppMemoryPercentage = GADevice$DeviceInfo.GetAppMemoryPercentage();
                final int[] getSysMemoryPercentage = GADevice$DeviceInfo.GetSysMemoryPercentage();
                if (getSysMemoryPercentage != null && getSysMemoryPercentage.length > 0) {
                    final JSONArray jsonArray2 = new JSONArray();
                    for (int length = getSysMemoryPercentage.length, j = 0; j < length; ++j) {
                        jsonArray2.put(getSysMemoryPercentage[j]);
                    }
                    jsonObject.put("memory_sys_data_table", (Object)jsonArray2);
                }
                if (getAppMemoryPercentage != null && getAppMemoryPercentage.length > 0) {
                    final JSONArray jsonArray3 = new JSONArray();
                    for (int length2 = getAppMemoryPercentage.length, k = n; k < length2; ++k) {
                        jsonArray3.put(getAppMemoryPercentage[k]);
                    }
                    jsonObject.put("memory_app_data_table", (Object)jsonArray3);
                }
            }
            addDimensionsToEvent(jsonObject);
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
            addEventToStore(jsonObject);
            GALogger.i("Add HEALTH event.");
        }
        catch (final JSONException ex) {
            GALogger.e("addHealthEvent: Error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.HealthEvent, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
        finally {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    public static void addImpressionEvent(final String s, final String s2, final JSONObject jsonObject, final Map<String, Object> map, final boolean b) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final ValidationResult validateImpressionEvent = GAValidator.validateImpressionEvent(s, s2, jsonObject);
        if (validateImpressionEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateImpressionEvent.category, validateImpressionEvent.area, validateImpressionEvent.action, validateImpressionEvent.parameter, validateImpressionEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        final JSONObject jsonObject2 = new JSONObject();
        try {
            jsonObject2.put("category", (Object)"impression");
            jsonObject2.put("ad_network_name", (Object)s);
            jsonObject2.put("ad_network_version", (Object)s2);
            if (jsonObject != null && jsonObject.length() > 0) {
                jsonObject2.put("impression_data", (Object)jsonObject);
            }
            addDimensionsToEvent(jsonObject2);
            Map<String, Object> globalCustomEventFields;
            if (map != null && !map.isEmpty()) {
                globalCustomEventFields = map;
            }
            else {
                globalCustomEventFields = GAState.getGlobalCustomEventFields();
            }
            final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
            if (b && map != null && !map.isEmpty()) {
                for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                    if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                        ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            addCustomFieldsToEvent(jsonObject2, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            GALogger.i("Add IMPRESSION event: {ad_network_name:" + s + ", ad_network_version:" + s2 + ", impression_data:#impressionData}");
            addEventToStore(jsonObject2);
        }
        catch (final JSONException ex) {
            GALogger.e("addImpressionEvent: Error creating json");
            ex.printStackTrace();
        }
    }
    
    public static void addProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3, final int n, final boolean b, final Map<String, Object> map, final boolean b2) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final String string = gaProgressionStatus.toString();
        final ValidationResult validateProgressionEvent = GAValidator.validateProgressionEvent(gaProgressionStatus, s, s2, s3);
        if (validateProgressionEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateProgressionEvent.category, validateProgressionEvent.area, validateProgressionEvent.action, validateProgressionEvent.parameter, validateProgressionEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        String s4;
        if (s2 != null && s2.length() != 0) {
            if (s3 != null && s3.length() != 0) {
                s4 = s + ":" + s2 + ":" + s3;
            }
            else {
                s4 = s + ":" + s2;
            }
        }
        else {
            s4 = s;
        }
        try {
            jsonObject.put("category", (Object)"progression");
            jsonObject.put("event_id", (Object)(string + ":" + s4));
            if (b && gaProgressionStatus != GAProgressionStatus.Start) {
                jsonObject.put("score", n);
            }
            if (gaProgressionStatus == GAProgressionStatus.Fail) {
                GAState.incrementProgressionTries(s4);
            }
            int progressionTries;
            if (gaProgressionStatus == GAProgressionStatus.Complete) {
                GAState.incrementProgressionTries(s4);
                progressionTries = GAState.getProgressionTries(s4);
                jsonObject.put("attempt_num", progressionTries);
                GAState.clearProgressionTries(s4);
            }
            else {
                progressionTries = 0;
            }
            addDimensionsToEvent(jsonObject);
            Map<String, Object> globalCustomEventFields;
            if (map != null && !map.isEmpty()) {
                globalCustomEventFields = map;
            }
            else {
                globalCustomEventFields = GAState.getGlobalCustomEventFields();
            }
            final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
            if (b2 && map != null && !map.isEmpty()) {
                for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                    if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                        ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            GALogger.i("Add PROGRESSION event: {status:" + string + ", progression01:" + s + ", progression02:" + s2 + ", progression03:" + s3 + ", score:" + n + ", attempt:" + progressionTries + "}");
            addEventToStore(jsonObject);
        }
        catch (final JSONException ex) {
            GALogger.e("addProgressionEvent: Error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    public static void addResourceEvent(final GAResourceFlowType gaResourceFlowType, final String s, final double n, final String s2, final String s3, final Map<String, Object> map, final boolean b) {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final ValidationResult validateResourceEvent = GAValidator.validateResourceEvent(gaResourceFlowType, s, (long)n, s2, s3);
        if (validateResourceEvent != null) {
            GAHTTPApi.getInstance().sendSdkErrorEvent(validateResourceEvent.category, validateResourceEvent.area, validateResourceEvent.action, validateResourceEvent.parameter, validateResourceEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
            return;
        }
        double n2 = n;
        if (gaResourceFlowType == GAResourceFlowType.Sink) {
            n2 = n * -1.0;
        }
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("event_id", (Object)(gaResourceFlowType.toString() + ":" + s + ":" + s2 + ":" + s3));
            jsonObject.put("category", (Object)"resource");
            jsonObject.put("amount", n2);
            addDimensionsToEvent(jsonObject);
            Map<String, Object> globalCustomEventFields;
            if (map != null && !map.isEmpty()) {
                globalCustomEventFields = map;
            }
            else {
                globalCustomEventFields = GAState.getGlobalCustomEventFields();
            }
            final HashMap hashMap = new HashMap((Map)globalCustomEventFields);
            if (b && map != null && !map.isEmpty()) {
                for (final Map$Entry map$Entry : GAState.getGlobalCustomEventFields().entrySet()) {
                    if (!((Map)hashMap).containsKey(map$Entry.getKey())) {
                        ((Map)hashMap).put((Object)map$Entry.getKey(), map$Entry.getValue());
                    }
                }
            }
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields((Map<String, Object>)hashMap));
            GALogger.i("Add RESOURCE event: {currency:" + s + ", amount:" + n2 + ", itemType:" + s2 + ", itemId:" + s3 + "}");
            addEventToStore(jsonObject);
        }
        catch (final JSONException ex) {
            GALogger.e("addResourceEvent: Error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    public static void addSdkInitEvent() {
        if (!GAEvents.isSdkInitEventEnabled) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        final GADevice$DeviceInfo readDeviceInfo = GADevice.ReadDeviceInfo();
        try {
            addHealthAnnotations(jsonObject, readDeviceInfo);
            jsonObject.put("category", (Object)"sdk_init");
            jsonObject.put("app_boot_time", GADevice$DeviceInfo.GetAppUptime());
            final int sessionNum = GAState.getSessionNum();
            boolean b = true;
            if (sessionNum != 1) {
                b = false;
            }
            jsonObject.put("is_first_sdk_init", b);
            addDimensionsToEvent(jsonObject);
            addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
            addEventToStore(jsonObject);
            GALogger.i("Add SDK_INIT event.");
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
        }
        finally {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    public static void addSessionEndEvent() {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        if (++GAEvents.countEnd > GAEvents.countUser) {
            GALogger.e("Invalid pairs of user/end session events:" + GAEvents.countUser + "-" + GAEvents.countEnd);
        }
        long n;
        if ((n = GAState.getClientTsAdjusted() - GAState.getSessionStart()) < 0L) {
            GALogger.w("Session length was calculated to be less then 0. Should not be possible. Resetting to 0.");
            n = 0L;
        }
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("category", (Object)"session_end");
            jsonObject.put("length", n);
        }
        catch (final JSONException ex) {
            GALogger.e("addSessionEndEvent: error creating json");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.SessionEnd, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
        addDimensionsToEvent(jsonObject);
        addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
        addEventToStore(jsonObject);
        GALogger.i("Add SESSION END event.");
        processEvents("", false);
    }
    
    public static void addSessionStartEvent() {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("category", (Object)"user");
            if (GAState.isNewInstall()) {
                jsonObject.put("install", true);
                GAState.setNewInstall(false);
            }
        }
        catch (final JSONException ex) {
            GALogger.e("addSessionStartEvent: error creating json");
            ex.printStackTrace();
        }
        GAState.incrementSessionNum();
        final ArrayList list = new ArrayList();
        list.add((Object)"session_num");
        list.add((Object)String.valueOf(GAState.getSessionNum()));
        GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_state (key, value) VALUES(?, ?);", (ArrayList<String>)list);
        final SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences("GameAnalytics", 0);
        if (sharedPreferences != null) {
            final SharedPreferences$Editor edit = sharedPreferences.edit();
            edit.putInt("ga_session_num", GAState.getSessionNum());
            edit.apply();
        }
        addDimensionsToEvent(jsonObject);
        addCustomFieldsToEvent(jsonObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
        if (GAEvents.countEnd > ++GAEvents.countUser) {
            GALogger.e("Invalid pairs of user/end session events:" + GAEvents.countUser + "-" + GAEvents.countEnd);
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.SessionEnd, EGASdkErrorAction.JsonError, "Duplicate session end events", GAState.getGameKey(), GAState.getSecretKey());
        }
        addEventToStore(jsonObject);
        GALogger.i("Add SESSION START event");
        processEvents("user", false);
    }
    
    public static void cleanupEvents() {
        GAStore.executeQuerySync("UPDATE ga_events SET status = 'new';");
    }
    
    public static void ensureEventQueueIsRunning() {
        getInstance().keepRunning = true;
        if (!getInstance().isRunning) {
            getInstance().isRunning = true;
            GAThreading.scheduleTimer(8.0, GAEvents.processEventQueueBlock);
        }
    }
    
    public static void fixMissingSessionEndEvents() throws JSONException {
        if (!GAState.isEventSubmissionEnabled()) {
            return;
        }
        final ArrayList list = new ArrayList();
        list.add((Object)GAState.getSessionId());
        final JSONArray executeQuerySync = GAStore.executeQuerySync("SELECT timestamp, event FROM ga_session WHERE session_id != ?;", (ArrayList<String>)list);
        if (executeQuerySync != null) {
            if (executeQuerySync.length() != 0) {
                GALogger.i(executeQuerySync.length() + " session(s) located with missing session_end event.");
                for (int i = 0; i < executeQuerySync.length(); ++i) {
                    final JSONObject jsonObject = executeQuerySync.getJSONObject(i);
                    final JSONObject dictionary = GAUtilities.dictionary(jsonObject.getString("event"));
                    final long long1 = dictionary.getLong("client_ts");
                    final long optLong = jsonObject.optLong("timestamp", 0L);
                    final long max = Math.max(0L, long1 - optLong);
                    final int int1 = dictionary.getInt("session_num");
                    if (GAEvents.fixedMissingSessionEnds.contains((Object)int1)) {
                        GALogger.e("fixMissingSessionEndEvents duplicate session_end!");
                    }
                    else {
                        GAEvents.fixedMissingSessionEnds.add((Object)int1);
                        GALogger.d("fixMissingSessionEndEvents length calculated: " + max + ", start_ts=" + optLong + ", event_ts=" + long1 + "-> for session " + int1);
                        dictionary.put("category", (Object)"session_end");
                        dictionary.put("length", max);
                        addEventToStore(dictionary);
                    }
                }
            }
        }
    }
    
    private static GAEvents getInstance() {
        return GAEvents.INSTANCE;
    }
    
    private static void processEventQueue() {
        processEvents("", true);
        if (getInstance().keepRunning) {
            GAThreading.scheduleTimer(8.0, GAEvents.processEventQueueBlock);
        }
        else {
            getInstance().isRunning = false;
        }
    }
    
    public static void processEvents(String string, final boolean b) {
        if (!GAState.doSendEvents()) {
            return;
        }
        try {
            final String string2 = UUID.randomUUID().toString();
            final String string3 = "DELETE FROM ga_events WHERE status = '" + string2 + "'";
            final String string4 = "UPDATE ga_events SET status = 'new' WHERE status = '" + string2 + "';";
            if (b) {
                cleanupEvents();
                fixMissingSessionEndEvents();
            }
            String string5 = "";
            if (string.length() != 0) {
                string5 = " AND category='" + string + "' ";
            }
            string = "SELECT event FROM ga_events WHERE status = 'new' " + string5 + ";";
            String s = "UPDATE ga_events SET status = '" + string2 + "' WHERE status = 'new' " + string5 + ";";
            JSONArray jsonArray = GAStore.executeQuerySync(string);
            if (jsonArray == null || jsonArray.length() == 0) {
                GALogger.i("Event queue: No events to send");
                updateSessionTime();
                return;
            }
            if (jsonArray.length() > 500) {
                final JSONArray executeQuerySync = GAStore.executeQuerySync("SELECT client_ts FROM ga_events WHERE status = 'new' " + string5 + " ORDER BY client_ts ASC LIMIT 0,500;");
                if (executeQuerySync == null) {
                    return;
                }
                final String string6 = ((JSONObject)executeQuerySync.get(executeQuerySync.length() - 1)).getString("client_ts");
                jsonArray = GAStore.executeQuerySync("SELECT event FROM ga_events WHERE status = 'new' " + string5 + " AND client_ts<='" + string6 + "';");
                if (jsonArray == null) {
                    return;
                }
                s = "UPDATE ga_events SET status='" + string2 + "' WHERE status='new' " + string5 + " AND client_ts<='" + string6 + "';";
            }
            GALogger.i("Event queue: Sending " + jsonArray.length() + " events.");
            if (GAStore.executeQuerySync(s) == null) {
                return;
            }
            final ArrayList list = new ArrayList();
            for (int i = 0; i < jsonArray.length(); ++i) {
                final JSONObject dictionary = GAUtilities.dictionary(((JSONObject)jsonArray.get(i)).getString("event"));
                if (dictionary.length() != 0) {
                    if (dictionary.has("client_ts") && !GAValidator.validateClientTs(dictionary.getLong("client_ts"))) {
                        dictionary.remove("client_ts");
                    }
                    list.add((Object)dictionary);
                }
            }
            final GAHTTPApi.GAHTTPApiResponseJSONObjectPair sendEventsInArray = GAHTTPApi.getInstance().sendEventsInArray((ArrayList<JSONObject>)list);
            final EGAHTTPApiResponse response = sendEventsInArray.response;
            final JSONObject json = sendEventsInArray.json;
            if (response == EGAHTTPApiResponse.Ok) {
                GAStore.executeQuerySync(string3);
                GALogger.i("Event queue: " + jsonArray.length() + " events sent.");
            }
            else if (response == EGAHTTPApiResponse.NoResponse) {
                GALogger.w("Event queue: Failed to send events to collector - Retrying next time");
                GAStore.executeQuerySync(string4);
            }
            else {
                if (json != null) {
                    final Object nextValue = new JSONTokener(json.toString()).nextValue();
                    GALogger.d(json.toString());
                    if (response == EGAHTTPApiResponse.BadRequest && nextValue instanceof JSONArray) {
                        GALogger.w("Event queue: " + jsonArray.length() + " events sent. " + json.length() + " events failed GA server validation.");
                    }
                    else {
                        GALogger.w("Event queue: Failed to send events.");
                    }
                }
                else {
                    GALogger.w("Event queue: Failed to send events.");
                }
                GAStore.executeQuerySync(string3);
            }
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ProcessEvents, EGASdkErrorAction.JsonError, ex.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
    
    public static void stopEventQueue() {
        getInstance().keepRunning = false;
    }
    
    private static void updateSessionTime() throws JSONException {
        if (GAState.sessionIsStarted()) {
            final JSONObject eventAnnotations = GAState.getEventAnnotations();
            addDimensionsToEvent(eventAnnotations);
            addCustomFieldsToEvent(eventAnnotations, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
            final String string = eventAnnotations.toString();
            final ArrayList list = new ArrayList();
            list.add((Object)eventAnnotations.getString("session_id"));
            list.add((Object)String.valueOf(GAState.getSessionStart()));
            list.add((Object)string);
            GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_session(session_id, timestamp, event) VALUES(?, ?, ?);", (ArrayList<String>)list);
        }
    }
}
