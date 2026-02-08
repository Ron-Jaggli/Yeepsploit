package com.gameanalytics.sdk.state;

import java.util.Map$Entry;
import com.gameanalytics.sdk.http.EGAHTTPApiResponse;
import java.util.Iterator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.http.GAHTTPApi;
import android.content.Context;
import com.gameanalytics.sdk.device.GADevice;
import java.util.Locale;
import java.util.UUID;
import com.gameanalytics.sdk.validators.GAValidator;
import org.json.JSONException;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import org.json.JSONArray;
import android.text.TextUtils;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.device.GADevice$DeviceInfo;
import com.gameanalytics.sdk.store.GAStore;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.threading.GAThreading;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.threading.IBlock;
import com.gameanalytics.sdk.GAPlatform$FunctionInfo;
import java.util.concurrent.TimeUnit;
import com.gameanalytics.sdk.GAErrorSeverity;
import android.animation.ValueAnimator;
import com.gameanalytics.sdk.IRemoteConfigsListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import org.json.JSONObject;
import java.util.Date;
import java.util.HashMap;

public class GAState
{
    private static final String CATEGORY_SDK_ERROR = "sdk_error";
    private static final GAState INSTANCE;
    private static final int MAX_CUSTOM_FIELDS_COUNT = 50;
    private static final int MAX_CUSTOM_FIELDS_KEY_LENGTH = 64;
    private static final int MAX_CUSTOM_FIELDS_VALUE_STRING_LENGTH = 256;
    private static final int MAX_ERROR_COUNT = 10;
    static int countEndSession = 0;
    private static final HashMap<String, Integer> countMap;
    public static final int fpsTableLength = 121;
    public static final int maxFpsValue = 120;
    private static final HashMap<String, Date> timestampMap;
    private static boolean useManualSessionHandling;
    private String abId;
    private String abVariantId;
    private boolean autoDetectAppVersion;
    private String[] availableCustomDimensions01;
    private String[] availableCustomDimensions02;
    private String[] availableCustomDimensions03;
    private String[] availableResourceCurrencies;
    private String[] availableResourceItemTypes;
    private String build;
    private long clientServerTimeOffset;
    private String configsHash;
    private JSONObject configurations;
    private String currentCustomDimension01;
    private String currentCustomDimension02;
    private String currentCustomDimension03;
    private final Map<String, Object> currentGlobalCustomEventFields;
    private AtomicBoolean doSampleFps;
    private AtomicBoolean doSampleMemory;
    private boolean doSendEvents;
    private boolean enableErrorReporting;
    private boolean enableEventSubmision;
    private String externalUserId;
    private final long fpsSampleFrequency;
    private long[] fpsTable;
    private String gameKey;
    private boolean healthEventErrorFlag;
    private boolean inForeground;
    private boolean initAuthorized;
    boolean isFirstTimeRunning;
    private boolean isInitialized;
    long lastFpsLogTimestamp;
    long lastMemSampleTimestamp;
    long lastTimestamp;
    private final long memSampleFrequency;
    private boolean newInstall;
    private final HashMap<String, Integer> progressionTries;
    private boolean remoteConfigsIsReady;
    private final ArrayList<IRemoteConfigsListener> remoteConfigsListeners;
    private int samplesFpsLastFrame;
    private JSONObject sdkConfig;
    private JSONObject sdkConfigCached;
    private final JSONObject sdkConfigDefault;
    private String secretKey;
    private String sessionId;
    private int sessionNum;
    private long sessionStart;
    private int sumFpsLastFrame;
    private int transactionNum;
    private boolean useRandomId;
    private String userId;
    private ValueAnimator v_animator;
    private boolean wasFpsTrackingStarted;
    
    static {
        INSTANCE = new GAState();
        countMap = new HashMap();
        timestampMap = new HashMap();
        GAState.countEndSession = 0;
    }
    
    private GAState() {
        this.sdkConfig = null;
        this.sdkConfigCached = null;
        this.sdkConfigDefault = new JSONObject();
        this.configurations = new JSONObject();
        this.remoteConfigsListeners = (ArrayList<IRemoteConfigsListener>)new ArrayList();
        this.availableCustomDimensions01 = new String[0];
        this.availableCustomDimensions02 = new String[0];
        this.availableCustomDimensions03 = new String[0];
        this.currentCustomDimension01 = "";
        this.currentCustomDimension02 = "";
        this.currentCustomDimension03 = "";
        this.currentGlobalCustomEventFields = (Map<String, Object>)new HashMap();
        this.doSendEvents = true;
        this.availableResourceCurrencies = new String[0];
        this.availableResourceItemTypes = new String[0];
        this.build = "";
        this.sessionId = "";
        this.progressionTries = (HashMap<String, Integer>)new HashMap();
        this.userId = "";
        this.externalUserId = "";
        this.enableErrorReporting = true;
        this.enableEventSubmision = true;
        this.configsHash = "";
        this.abId = "";
        this.abVariantId = "";
        this.autoDetectAppVersion = false;
        this.inForeground = true;
        this.healthEventErrorFlag = false;
        this.gameKey = "";
        this.secretKey = "";
        this.lastTimestamp = 0L;
        this.lastFpsLogTimestamp = 0L;
        this.lastMemSampleTimestamp = 0L;
        this.isFirstTimeRunning = true;
        this.sumFpsLastFrame = 0;
        this.samplesFpsLastFrame = 0;
        this.fpsSampleFrequency = 1000L;
        this.memSampleFrequency = 5000L;
        this.fpsTable = new long[121];
        this.wasFpsTrackingStarted = false;
        this.doSampleFps = new AtomicBoolean(false);
        this.doSampleMemory = new AtomicBoolean(false);
        this.logFPS();
    }
    
    private static void addErrorEvent(final String s, final GAErrorSeverity gaErrorSeverity, final String s2) {
        if (!isEventSubmissionEnabled()) {
            return;
        }
        final Date date = new Date();
        final HashMap<String, Date> timestampMap = GAState.timestampMap;
        if (!timestampMap.containsKey((Object)s)) {
            timestampMap.put((Object)s, (Object)date);
        }
        final HashMap<String, Integer> countMap = GAState.countMap;
        if (!countMap.containsKey((Object)s)) {
            countMap.put((Object)s, (Object)0);
        }
        if (TimeUnit.MILLISECONDS.toMinutes(date.getTime() - ((Date)timestampMap.get((Object)s)).getTime()) >= 60L) {
            countMap.put((Object)s, (Object)0);
            timestampMap.put((Object)s, (Object)date);
        }
        if ((int)countMap.get((Object)s) >= 10) {
            return;
        }
        GAThreading.performTaskOnGAThread((IBlock)new IBlock(gaErrorSeverity, s2, new GAPlatform$FunctionInfo(), s) {
            final String val$baseMessage;
            final GAPlatform$FunctionInfo val$functionInfo;
            final String val$message;
            final GAErrorSeverity val$severity;
            
            public void execute() {
                GAEvents.addErrorEvent(this.val$severity, this.val$message, null, true, this.val$functionInfo.method, this.val$functionInfo.line, this.val$functionInfo.module);
                GAState.countMap.put((Object)this.val$baseMessage, (Object)((int)GAState.countMap.get((Object)this.val$baseMessage) + 1));
            }
            
            public String getName() {
                return "addErrorEvent";
            }
        });
    }
    
    public static void addRemoteConfigsListener(final IRemoteConfigsListener remoteConfigsListener) {
        if (!getInstance().remoteConfigsListeners.contains((Object)remoteConfigsListener)) {
            getInstance().remoteConfigsListeners.add((Object)remoteConfigsListener);
        }
    }
    
    private static long calculateServerTimeOffset(final long n) {
        return n - GAUtilities.timeIntervalSince1970();
    }
    
    public static void clearProgressionTries(final String s) {
        final HashMap<String, Integer> progressionTries = getInstance().progressionTries;
        if (progressionTries.containsKey((Object)s)) {
            progressionTries.remove((Object)s);
        }
        final ArrayList list = new ArrayList();
        list.add((Object)s);
        GAStore.executeQuerySync("DELETE FROM ga_progression WHERE progression = ?;", (ArrayList<String>)list);
    }
    
    public static boolean doSendEvents() {
        return getInstance().doSendEvents;
    }
    
    public static void enableFpsSampling(final boolean enableFPSTracking) {
        GADevice$DeviceInfo.enableFPSTracking = enableFPSTracking;
        GAState.INSTANCE.doSampleFps.set(enableFPSTracking);
    }
    
    public static void enableMemorySampling(final boolean enableMemoryHistograms) {
        GADevice$DeviceInfo.enableMemoryHistograms = enableMemoryHistograms;
        GAState.INSTANCE.doSampleMemory.set(enableMemoryHistograms);
        if (enableMemoryHistograms) {
            GADevice$DeviceInfo.enableMemoryTracking = true;
        }
    }
    
    public static void endSessionAndStopQueue() {
        if (isInitialized()) {
            ++GAState.countEndSession;
            GALogger.i("End session: " + GAState.countEndSession);
            if (isEnabled() && sessionIsStarted()) {
                GALogger.i("Ending session.");
                GAEvents.stopEventQueue();
                GAEvents.addHealthEvent(getInstance().fpsTable, getInstance().healthEventErrorFlag);
                GAEvents.addSessionEndEvent();
                getInstance().sessionStart = 0L;
                GAThreading.stop();
            }
        }
    }
    
    private static void ensurePersistedStates() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        final JSONArray executeQuerySync = GAStore.executeQuerySync("SELECT * FROM ga_state;");
        final int n = 0;
        if (executeQuerySync != null && executeQuerySync.length() != 0) {
            for (int i = 0; i < executeQuerySync.length(); ++i) {
                final JSONObject jsonObject2 = executeQuerySync.getJSONObject(i);
                jsonObject.put(jsonObject2.getString("key"), jsonObject2.get("value"));
            }
        }
        final GAState instance = getInstance();
        instance.sessionNum = jsonObject.optInt("session_num", 0);
        final SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences("GameAnalytics", 0);
        if (sharedPreferences != null) {
            if (instance.sessionNum == 0) {
                instance.sessionNum = sharedPreferences.getInt("ga_session_num", 0);
            }
            instance.abId = sharedPreferences.getString("ga_ab_id", instance.abId);
            instance.abVariantId = sharedPreferences.getString("ga_ab_variant_id", instance.abVariantId);
        }
        instance.transactionNum = jsonObject.optInt("transaction_num", 0);
        if (jsonObject.has("new_install")) {
            final boolean optBoolean = jsonObject.optBoolean("new_install", false);
            instance.newInstall = optBoolean;
            if (optBoolean) {
                GALogger.d("new_install found in DB: " + instance.newInstall);
            }
        }
        else if (GAStore.setState("new_install", Boolean.toString(false))) {
            instance.newInstall = true;
            GALogger.d("new_install not found in DB initializing value to 'true'");
        }
        else {
            GALogger.d("Failed to set value for key='new_install' in DB");
        }
        if (jsonObject.has("use_random_id")) {
            instance.useRandomId = jsonObject.optBoolean("use_random_id", false);
        }
        if (instance.newInstall) {
            if (GAStore.setState("use_random_id", Boolean.toString(true))) {
                instance.useRandomId = true;
                GALogger.d("use_random_id not found in DB initializing value to 'true'");
            }
            else {
                GALogger.d("Failed to set value for key='use_random_id' in DB");
            }
        }
        if (instance.useRandomId) {
            GALogger.d("Using random generated id as user_id");
        }
        if (!TextUtils.isEmpty((CharSequence)instance.currentCustomDimension01)) {
            GAStore.setState("dimension01", instance.currentCustomDimension01);
        }
        else {
            final String optString = jsonObject.optString("dimension01", "");
            instance.currentCustomDimension01 = optString;
            if (optString.length() != 0) {
                GALogger.d("Dimension01 found in cache: " + instance.currentCustomDimension01);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)instance.currentCustomDimension02)) {
            GAStore.setState("dimension02", instance.currentCustomDimension02);
        }
        else {
            final String optString2 = jsonObject.optString("dimension02", "");
            instance.currentCustomDimension02 = optString2;
            if (optString2.length() != 0) {
                GALogger.d("Dimension02 found cache: " + instance.currentCustomDimension02);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)instance.currentCustomDimension03)) {
            GAStore.setState("dimension03", instance.currentCustomDimension03);
        }
        else {
            final String optString3 = jsonObject.optString("dimension03", "");
            instance.currentCustomDimension03 = optString3;
            if (optString3.length() != 0) {
                GALogger.d("Dimension03 found in cache: " + instance.currentCustomDimension03);
            }
        }
        final String optString4 = jsonObject.optString("sdk_config_cached", "");
        if (optString4.length() != 0) {
            final JSONObject dictionary = GAUtilities.dictionary(optString4);
            if (dictionary.length() != 0) {
                if (!getLastUsedIdentifier().equals((Object)getIdentifier())) {
                    GALogger.w("New identifier spotted compared to last one used, clearing cached configs hash!!");
                    dictionary.remove("configs_hash");
                }
                instance.sdkConfigCached = dictionary;
            }
        }
        getInstance().configsHash = getSdkConfig().optString("configs_hash", "");
        getInstance().abId = getSdkConfig().optString("ab_id", instance.abId);
        getInstance().abVariantId = getSdkConfig().optString("ab_variant_id", instance.abVariantId);
        if (sharedPreferences != null) {
            final SharedPreferences$Editor edit = sharedPreferences.edit();
            if (!TextUtils.isEmpty((CharSequence)instance.abId)) {
                edit.putString("ga_ab_id", instance.abId);
            }
            if (!TextUtils.isEmpty((CharSequence)instance.abVariantId)) {
                edit.putString("ga_ab_variant_id", instance.abVariantId);
            }
            edit.apply();
        }
        final JSONArray executeQuerySync2 = GAStore.executeQuerySync("SELECT * FROM ga_progression;");
        if (executeQuerySync2 != null && executeQuerySync2.length() != 0) {
            for (int j = n; j < executeQuerySync2.length(); ++j) {
                final JSONObject jsonObject3 = executeQuerySync2.getJSONObject(j);
                instance.progressionTries.put((Object)jsonObject3.getString("progression"), (Object)jsonObject3.getInt("tries"));
            }
        }
    }
    
    public static String getABTestingId() {
        return getInstance().abId;
    }
    
    public static String getABTestingVariantId() {
        return getInstance().abVariantId;
    }
    
    private static String getBuild() {
        return getInstance().build;
    }
    
    public static long getClientTsAdjusted() {
        final long timeIntervalSince1970 = GAUtilities.timeIntervalSince1970();
        final long n = getInstance().clientServerTimeOffset + timeIntervalSince1970;
        if (GAValidator.validateClientTs(n)) {
            return n;
        }
        return timeIntervalSince1970;
    }
    
    private static String getConfigsHash() {
        return getInstance().configsHash;
    }
    
    public static String getDimension01() {
        return getInstance().currentCustomDimension01;
    }
    
    public static String getDimension02() {
        return getInstance().currentCustomDimension02;
    }
    
    public static String getDimension03() {
        return getInstance().currentCustomDimension03;
    }
    
    public static JSONObject getEventAnnotations() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("v", 2);
        jsonObject.put("user_id", (Object)getIdentifier());
        jsonObject.put("event_uuid", (Object)UUID.randomUUID().toString().toLowerCase(Locale.US));
        if (!TextUtils.isEmpty((CharSequence)GADevice.getGAID()) && !GAUtilities.isZeroId(GADevice.getGAID()) && !GADevice.getIsLimitedAdTracking()) {
            jsonObject.put("google_aid", (Object)GADevice.getGAID());
            if (!TextUtils.isEmpty((CharSequence)GADevice.getAdIdSource())) {
                jsonObject.put("google_aid_src", (Object)GADevice.getAdIdSource());
            }
            if (!TextUtils.isEmpty((CharSequence)GADevice.getOAID())) {
                jsonObject.put("oaid", (Object)GADevice.getOAID());
            }
        }
        else if (!TextUtils.isEmpty((CharSequence)GADevice.getOAID()) && !GAUtilities.isZeroId(GADevice.getOAID())) {
            jsonObject.put("oaid", (Object)GADevice.getOAID());
        }
        if (!TextUtils.isEmpty((CharSequence)GADevice.getAppSetId())) {
            jsonObject.put("android_app_set_id", (Object)GADevice.getAppSetId());
        }
        if (getInstance().configurations != null && getInstance().configurations.length() > 0) {
            jsonObject.put("configurations", (Object)getInstance().configurations);
        }
        if (!TextUtils.isEmpty((CharSequence)getInstance().abId)) {
            jsonObject.put("ab_id", (Object)getInstance().abId);
        }
        if (!TextUtils.isEmpty((CharSequence)getInstance().abVariantId)) {
            jsonObject.put("ab_variant_id", (Object)getInstance().abVariantId);
        }
        jsonObject.put("client_ts", getClientTsAdjusted());
        jsonObject.put("sdk_version", (Object)GADevice.getRelevantSdkVersion());
        jsonObject.put("os_version", (Object)(GADevice.getBuildPlatform() + " " + GADevice.getOSVersion()));
        jsonObject.put("manufacturer", (Object)GADevice.getDeviceManufacturer());
        jsonObject.put("device", (Object)GADevice.getDeviceModel());
        jsonObject.put("platform", (Object)GADevice.getBuildPlatform());
        jsonObject.put("session_id", (Object)getInstance().sessionId);
        jsonObject.put("session_num", getSessionNum());
        final String connectionType = GADevice.getConnectionType();
        if (GAValidator.validateConnectionType(connectionType)) {
            jsonObject.put("connection_type", (Object)connectionType);
        }
        final String bundleIdentifier = GADevice.getBundleIdentifier();
        if (GAValidator.validateBundleID(bundleIdentifier)) {
            jsonObject.put("android_bundle_id", (Object)bundleIdentifier);
        }
        final String appVersion = GADevice.getAppVersion();
        if (GAValidator.validateAppVersion(appVersion)) {
            jsonObject.put("android_app_version", (Object)appVersion);
        }
        final Integer value = GADevice.getAppBuild();
        if (GAValidator.validateAppBuild(value)) {
            jsonObject.put("android_app_build", (Object)String.valueOf((Object)value));
        }
        final String appSignature = GADevice.getAppSignature();
        if (GAValidator.validateAppSignature(appSignature)) {
            jsonObject.put("android_app_signature", (Object)appSignature);
        }
        final String channelId = GADevice.getChannelId();
        if (GAValidator.validateChannelId(channelId)) {
            jsonObject.put("android_channel_id", (Object)channelId);
        }
        if (GADevice.getGameEngineVersion().length() != 0) {
            jsonObject.put("engine_version", (Object)GADevice.getGameEngineVersion());
        }
        if (!TextUtils.isEmpty((CharSequence)getExternalUserId())) {
            jsonObject.put("user_id_ext", (Object)getExternalUserId());
        }
        if (GADevice.getIsHacked()) {
            jsonObject.put("jailbroken", true);
        }
        if (GADevice.getIsLimitedAdTracking()) {
            jsonObject.put("limited_ad_tracking", true);
        }
        if (getBuild().length() != 0) {
            jsonObject.put("build", (Object)getBuild());
        }
        return jsonObject;
    }
    
    public static String getExternalUserId() {
        return getInstance().externalUserId;
    }
    
    public static String getGameKey() {
        return getInstance().gameKey;
    }
    
    public static Map<String, Object> getGlobalCustomEventFields() {
        return getInstance().currentGlobalCustomEventFields;
    }
    
    public static String getIdentifier() {
        final String userId = getUserId();
        if (!TextUtils.isEmpty((CharSequence)userId)) {
            GALogger.d("getIdentifier: Using custom user id");
            updateLastUsedIdentifier(userId);
            return userId;
        }
        String s;
        if (GADevice.doTrackGAID) {
            final String gaid = GADevice.getGAID();
            if (!getInstance().useRandomId && !TextUtils.isEmpty((CharSequence)gaid) && !GAUtilities.isZeroId(gaid) && !GADevice.getIsLimitedAdTracking()) {
                GALogger.d("getIdentifier: Using GAID");
                updateLastUsedIdentifier(gaid);
                return gaid;
            }
            final String oaid = GADevice.getOAID();
            s = gaid;
            if (!getInstance().useRandomId) {
                s = gaid;
                if (!TextUtils.isEmpty((CharSequence)oaid)) {
                    s = gaid;
                    if (!GAUtilities.isZeroId(oaid)) {
                        GALogger.d("getIdentifier: Using OAID");
                        updateLastUsedIdentifier(oaid);
                        return oaid;
                    }
                }
            }
        }
        else {
            s = "";
        }
        if (getInstance().useRandomId || GADevice.getIsLimitedAdTracking() || (!TextUtils.isEmpty((CharSequence)s) && GAUtilities.isZeroId(s))) {
            final Context applicationContext = GAPlatform.getApplicationContext();
            final int n = 0;
            final SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("GameAnalytics", 0);
            if (sharedPreferences != null) {
                GALogger.d("getIdentifier: Using random id");
                final String string = sharedPreferences.getString("ga_random_user_id", "");
                final String lastUsedIdentifier = getLastUsedIdentifier();
                int n2 = n;
                if (!TextUtils.isEmpty((CharSequence)lastUsedIdentifier)) {
                    n2 = n;
                    if (!TextUtils.isEmpty((CharSequence)s)) {
                        n2 = n;
                        if (!GAUtilities.isZeroId(s)) {
                            n2 = n;
                            if (lastUsedIdentifier.equals((Object)s)) {
                                n2 = n;
                                if (GADevice.doTrackGAID) {
                                    n2 = n;
                                    if (!GADevice.getIsLimitedAdTracking()) {
                                        n2 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                String string2;
                if (TextUtils.isEmpty((CharSequence)string)) {
                    if (!getInstance().newInstall && getInstance().useRandomId && n2 != 0) {
                        return lastUsedIdentifier;
                    }
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    string2 = UUID.randomUUID().toString();
                    edit.putString("ga_random_user_id", string2);
                    edit.apply();
                }
                else {
                    string2 = string;
                    if (n2 != 0) {
                        return lastUsedIdentifier;
                    }
                }
                updateLastUsedIdentifier(string2);
                return string2;
            }
        }
        return "00000000-0000-0000-0000-000000000000";
    }
    
    public static JSONObject getInitAnnotations() {
        final JSONObject jsonObject = new JSONObject();
        try {
            String identifier;
            if (isEventSubmissionEnabled()) {
                identifier = getIdentifier();
            }
            else {
                identifier = "";
            }
            jsonObject.put("user_id", (Object)identifier);
            jsonObject.put("sdk_version", (Object)GADevice.getRelevantSdkVersion());
            jsonObject.put("os_version", (Object)(GADevice.getBuildPlatform() + " " + GADevice.getOSVersion()));
            jsonObject.put("platform", (Object)GADevice.getBuildPlatform());
            if (!TextUtils.isEmpty((CharSequence)getBuild())) {
                jsonObject.put("build", (Object)getBuild());
            }
            else {
                jsonObject.put("build", (Object)null);
            }
            if (!TextUtils.isEmpty((CharSequence)getInstance().abId)) {
                jsonObject.put("ab_id", (Object)getInstance().abId);
            }
            if (!TextUtils.isEmpty((CharSequence)getInstance().abVariantId)) {
                jsonObject.put("ab_variant_id", (Object)getInstance().abVariantId);
            }
            jsonObject.put("session_num", getSessionNum());
            jsonObject.put("random_salt", getSessionNum());
        }
        catch (final JSONException ex) {
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.InitRequest, EGASdkErrorAction.FailHttpJsonDecode, ex.toString(), getGameKey(), getSecretKey());
        }
        return jsonObject;
    }
    
    private static GAState getInstance() {
        return GAState.INSTANCE;
    }
    
    private static String getLastUsedIdentifier() {
        final SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences("GameAnalytics", 0);
        String string;
        if (sharedPreferences != null) {
            string = sharedPreferences.getString("ga_last_used_identifier", "");
        }
        else {
            string = null;
        }
        return string;
    }
    
    public static int getProgressionTries(final String s) {
        if (getInstance().progressionTries.containsKey((Object)s)) {
            return (int)getInstance().progressionTries.get((Object)s);
        }
        return 0;
    }
    
    public static JSONObject getRemoteConfigsContentAsJson() {
        try {
            return new JSONObject(getInstance().configurations.toString());
        }
        catch (final JSONException ex) {
            return null;
        }
    }
    
    public static String getRemoteConfigsContentAsString() {
        try {
            return getInstance().configurations.toString(4);
        }
        catch (final JSONException ex) {
            return getInstance().configurations.toString();
        }
    }
    
    public static String getRemoteConfigsStringValue(final String s, final String s2) {
        return getInstance().configurations.optString(s, s2);
    }
    
    private static JSONObject getSdkConfig() {
        if (getInstance().sdkConfig != null) {
            return getInstance().sdkConfig;
        }
        if (getInstance().sdkConfigCached != null) {
            return getInstance().sdkConfigCached;
        }
        return getInstance().sdkConfigDefault;
    }
    
    public static JSONObject getSdkErrorEventAnnotations() throws JSONException {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("v", 2);
        jsonObject.put("event_uuid", (Object)UUID.randomUUID().toString().toLowerCase(Locale.US));
        jsonObject.put("category", (Object)"sdk_error");
        jsonObject.put("sdk_version", (Object)GADevice.getRelevantSdkVersion());
        jsonObject.put("os_version", (Object)(GADevice.getBuildPlatform() + " " + GADevice.getOSVersion()));
        jsonObject.put("manufacturer", (Object)GADevice.getDeviceManufacturer());
        jsonObject.put("device", (Object)GADevice.getDeviceModel());
        jsonObject.put("platform", (Object)GADevice.getBuildPlatform());
        if (GADevice.getGameEngineVersion().length() != 0) {
            jsonObject.put("engine_version", (Object)GADevice.getGameEngineVersion());
        }
        if (GADevice.getIsHacked()) {
            jsonObject.put("jailbroken", true);
        }
        return jsonObject;
    }
    
    public static String getSecretKey() {
        return getInstance().secretKey;
    }
    
    public static String getSessionId() {
        return getInstance().sessionId;
    }
    
    public static int getSessionNum() {
        return getInstance().sessionNum;
    }
    
    public static long getSessionStart() {
        return getInstance().sessionStart;
    }
    
    public static int getTransactionNum() {
        return getInstance().transactionNum;
    }
    
    public static String getUserId() {
        return getInstance().userId;
    }
    
    public static boolean hasAvailableCustomDimensions01(final String s) {
        return GAUtilities.stringArrayContainsString(getInstance().availableCustomDimensions01, s);
    }
    
    public static boolean hasAvailableCustomDimensions02(final String s) {
        return GAUtilities.stringArrayContainsString(getInstance().availableCustomDimensions02, s);
    }
    
    public static boolean hasAvailableCustomDimensions03(final String s) {
        return GAUtilities.stringArrayContainsString(getInstance().availableCustomDimensions03, s);
    }
    
    public static boolean hasAvailableResourceCurrency(final String s) {
        return GAUtilities.stringArrayContainsString(getInstance().availableResourceCurrencies, s);
    }
    
    public static boolean hasAvailableResourceItemType(final String s) {
        return GAUtilities.stringArrayContainsString(getInstance().availableResourceItemTypes, s);
    }
    
    public static void incrementProgressionTries(final String s) {
        final int n = getProgressionTries(s) + 1;
        getInstance().progressionTries.put((Object)s, (Object)n);
        final ArrayList list = new ArrayList();
        list.add((Object)s);
        list.add((Object)(n + ""));
        GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_progression (progression, tries) VALUES(?, ?);", (ArrayList<String>)list);
    }
    
    public static void incrementSessionNum() {
        getInstance().sessionNum = getSessionNum() + 1;
    }
    
    public static void incrementTransactionNum() {
        getInstance().transactionNum = getTransactionNum() + 1;
    }
    
    public static void internalInitialize() {
        if (!GAStore.getTableReady()) {
            return;
        }
        try {
            ensurePersistedStates();
        }
        catch (final JSONException ex) {
            GALogger.e("internalInitialize: error creating json in ensurePersistedStates()");
            ex.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.InitialInit, EGASdkErrorAction.FailHttpJsonDecode, ex.toString(), getGameKey(), getSecretKey());
        }
        setInitialized(true);
        startNewSession();
        GAEvents.addSdkInitEvent();
        if (isEnabled()) {
            GAEvents.ensureEventQueueIsRunning();
        }
    }
    
    public static boolean isAutoDetectAppVersionEnabled() {
        return getInstance().autoDetectAppVersion;
    }
    
    public static boolean isEnabled() {
        return getInstance().initAuthorized;
    }
    
    public static boolean isEventSubmissionEnabled() {
        return getInstance().enableEventSubmision;
    }
    
    public static boolean isInForeground() {
        return getInstance().inForeground;
    }
    
    public static boolean isInitialized() {
        return getInstance().isInitialized;
    }
    
    public static boolean isNewInstall() {
        return getInstance().newInstall;
    }
    
    public static boolean isRemoteConfigsReady() {
        return getInstance().remoteConfigsIsReady;
    }
    
    private void logFPS() {
        try {
            this.lastTimestamp = System.currentTimeMillis();
            (this.v_animator = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setRepeatCount(-1);
            this.v_animator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new GAState$$ExternalSyntheticLambda0(this));
            this.v_animator.start();
            this.wasFpsTrackingStarted = true;
        }
        catch (final RuntimeException ex) {
            this.healthEventErrorFlag = true;
            GALogger.e("Failed to log FPS (please ensure you are running on the main thread):" + ex.getMessage());
        }
        finally {
            this.healthEventErrorFlag = true;
            final Throwable t;
            GALogger.e("Failed to log FPS with reason:" + t.getMessage());
        }
    }
    
    private static void populateConfigurations(JSONObject optJSONArray) {
        final JSONObject configurations = getInstance().configurations;
        synchronized (configurations) {
            optJSONArray = (JSONObject)optJSONArray.optJSONArray("configs");
            if (optJSONArray != null) {
                getInstance().configurations = new JSONObject();
                for (int i = 0; i < ((JSONArray)optJSONArray).length(); ++i) {
                    final JSONObject optJSONObject = ((JSONArray)optJSONArray).optJSONObject(i);
                    if (optJSONObject != null) {
                        final String optString = optJSONObject.optString("key");
                        final Object opt = optJSONObject.opt("value");
                        final long optLong = optJSONObject.optLong("start_ts", -2147483648L);
                        final long optLong2 = optJSONObject.optLong("end_ts", 2147483647L);
                        final long clientTsAdjusted = getClientTsAdjusted();
                        if (optString != null && opt != null && clientTsAdjusted > optLong && clientTsAdjusted < optLong2) {
                            try {
                                getInstance().configurations.put(optString, opt);
                                GALogger.d("configuration added: " + optJSONObject.toString());
                            }
                            catch (final JSONException ex) {
                                GALogger.w("populateConfigurations failed - unable to add configuration '" + optString + "'.");
                            }
                        }
                    }
                }
            }
            getInstance().remoteConfigsIsReady = true;
            final Iterator iterator = getInstance().remoteConfigsListeners.iterator();
            while (iterator.hasNext()) {
                ((IRemoteConfigsListener)iterator.next()).onRemoteConfigsUpdated();
            }
        }
    }
    
    public static void removeRemoteConfigsListener(final IRemoteConfigsListener remoteConfigsListener) {
        if (getInstance().remoteConfigsListeners.contains((Object)remoteConfigsListener)) {
            getInstance().remoteConfigsListeners.remove((Object)remoteConfigsListener);
        }
    }
    
    public static void resumeSessionAndStartQueue() {
        if (!isInitialized()) {
            return;
        }
        if (!sessionIsStarted()) {
            GALogger.i("Resuming session.");
            GAThreading.start();
            startNewSession();
        }
    }
    
    public static boolean sessionIsStarted() {
        return getInstance().sessionStart != 0.0;
    }
    
    public static void setAutoDetectAppVersion(final boolean autoDetectAppVersion) {
        getInstance().autoDetectAppVersion = autoDetectAppVersion;
        if (autoDetectAppVersion) {
            GALogger.i("Enabled auto detect app version for build field");
        }
        else {
            GALogger.i("Disabled auto detect app version for build field");
        }
    }
    
    public static void setAvailableCustomDimensions01(final String... availableCustomDimensions01) {
        if (!GAValidator.validateCustomDimensions(availableCustomDimensions01)) {
            return;
        }
        getInstance().availableCustomDimensions01 = availableCustomDimensions01;
        validateAndFixCurrentDimensions();
        GALogger.i("Set available custom01 dimension values: (" + GAUtilities.joinStringArray(availableCustomDimensions01, ", ") + ")");
    }
    
    public static void setAvailableCustomDimensions02(final String... availableCustomDimensions02) {
        if (!GAValidator.validateCustomDimensions(availableCustomDimensions02)) {
            return;
        }
        getInstance().availableCustomDimensions02 = availableCustomDimensions02;
        validateAndFixCurrentDimensions();
        GALogger.i("Set available custom02 dimension values: (" + GAUtilities.joinStringArray(availableCustomDimensions02, ", ") + ")");
    }
    
    public static void setAvailableCustomDimensions03(final String... availableCustomDimensions03) {
        if (!GAValidator.validateCustomDimensions(availableCustomDimensions03)) {
            return;
        }
        getInstance().availableCustomDimensions03 = availableCustomDimensions03;
        validateAndFixCurrentDimensions();
        GALogger.i("Set available custom03 dimension values: (" + GAUtilities.joinStringArray(availableCustomDimensions03, ", ") + ")");
    }
    
    public static void setAvailableResourceCurrencies(final String... availableResourceCurrencies) {
        if (!GAValidator.validateResourceCurrencies(availableResourceCurrencies)) {
            return;
        }
        getInstance().availableResourceCurrencies = availableResourceCurrencies;
        GALogger.i("Set available resource currencies: (" + GAUtilities.joinStringArray(availableResourceCurrencies, ", ") + ")");
    }
    
    public static void setAvailableResourceItemTypes(final String... availableResourceItemTypes) {
        if (!GAValidator.validateResourceItemTypes(availableResourceItemTypes)) {
            return;
        }
        getInstance().availableResourceItemTypes = availableResourceItemTypes;
        GALogger.i("Set available resource item types: (" + GAUtilities.joinStringArray(availableResourceItemTypes, ", ") + ")");
    }
    
    public static void setBuild(final String build) {
        getInstance().build = build;
        GALogger.i("Set build version: " + build);
    }
    
    public static void setCustomDimension01(final String currentCustomDimension01) {
        getInstance().currentCustomDimension01 = currentCustomDimension01;
        if (GAStore.getTableReady()) {
            GAStore.setState("dimension01", currentCustomDimension01);
        }
        GALogger.i("Set custom01 dimension value: " + currentCustomDimension01);
    }
    
    public static void setCustomDimension02(final String currentCustomDimension02) {
        getInstance().currentCustomDimension02 = currentCustomDimension02;
        if (GAStore.getTableReady()) {
            GAStore.setState("dimension02", currentCustomDimension02);
        }
        GALogger.i("Set custom02 dimension value: " + currentCustomDimension02);
    }
    
    public static void setCustomDimension03(final String currentCustomDimension03) {
        getInstance().currentCustomDimension03 = currentCustomDimension03;
        if (GAStore.getTableReady()) {
            GAStore.setState("dimension03", currentCustomDimension03);
        }
        GALogger.i("Set custom03 dimension value: " + currentCustomDimension03);
    }
    
    public static void setEnableErrorReporting(final boolean enableErrorReporting) {
        GALogger.d("setEnableErrorReporting: " + enableErrorReporting);
        getInstance().enableErrorReporting = enableErrorReporting;
    }
    
    public static void setEnableEventSubmission(final boolean doSendEvents, final boolean enableEventSubmision) {
        getInstance().doSendEvents = doSendEvents;
        if (doSendEvents) {
            getInstance().enableEventSubmision = true;
        }
        else {
            getInstance().enableEventSubmision = enableEventSubmision;
        }
    }
    
    public static void setExternalUserId(final String externalUserId) {
        getInstance().externalUserId = externalUserId;
    }
    
    public static void setGlobalCustomEventFields(final Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            getInstance().currentGlobalCustomEventFields.clear();
            getInstance().currentGlobalCustomEventFields.putAll((Map)map);
            GALogger.i("Set global custom event fields: " + (Object)new JSONObject((Map)map));
            return;
        }
        getInstance().currentGlobalCustomEventFields.clear();
    }
    
    public static void setInForeground(final boolean inForeground) {
        getInstance().inForeground = inForeground;
    }
    
    public static void setInitialized(final boolean isInitialized) {
        getInstance().isInitialized = isInitialized;
    }
    
    public static void setKeys(final String gameKey, final String secretKey) {
        getInstance().gameKey = gameKey;
        getInstance().secretKey = secretKey;
    }
    
    public static void setManualSessionHandling(final boolean useManualSessionHandling) {
        GAState.useManualSessionHandling = useManualSessionHandling;
        GALogger.i("Use manual session handling: " + useManualSessionHandling);
    }
    
    public static void setNewInstall(final boolean newInstall) {
        getInstance().newInstall = newInstall;
    }
    
    public static void setUserId(final String s) {
        final GAState instance = getInstance();
        String userId = s;
        if (s == null) {
            userId = "";
        }
        instance.userId = userId;
        GALogger.i("Set user id: " + getInstance().userId);
    }
    
    public static void startAnimator() {
        try {
            final ValueAnimator v_animator = GAState.INSTANCE.v_animator;
            if (v_animator != null) {
                v_animator.start();
            }
        }
        finally {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static void startNewSession() {
        if (isEventSubmissionEnabled()) {
            GALogger.i("Starting a new session.");
        }
        validateAndFixCurrentDimensions();
        if (isAutoDetectAppVersionEnabled()) {
            final String appVersion = GADevice.getAppVersion();
            if (GAValidator.validateAppVersion(appVersion)) {
                setBuild(appVersion);
                GALogger.i("Auto detecting app version and setting build field to: " + appVersion);
            }
        }
        GADevice.reloadAdId();
        final GAHTTPApi.GAHTTPApiResponseJSONObjectPair requestInitReturningDict = GAHTTPApi.getInstance().requestInitReturningDict(getInstance().configsHash);
        final EGAHTTPApiResponse response = requestInitReturningDict.response;
        final JSONObject json = requestInitReturningDict.json;
        final EGAHTTPApiResponse ok = EGAHTTPApiResponse.Ok;
        int n = 0;
        if ((response == ok || response == EGAHTTPApiResponse.Created) && json != null) {
            long calculateServerTimeOffset;
            if (json.optLong("server_ts", -1L) > 0.0) {
                calculateServerTimeOffset = calculateServerTimeOffset(json.optLong("server_ts", -1L));
            }
            else {
                calculateServerTimeOffset = 0L;
            }
            try {
                json.put("time_offset", calculateServerTimeOffset);
            }
            catch (final JSONException ex) {
                GALogger.e("startNewSession: error creating json");
                ex.printStackTrace();
            }
            if (response != EGAHTTPApiResponse.Created) {
                try {
                    if (getSdkConfig().has("configs")) {
                        json.put("configs", (Object)getSdkConfig().optJSONArray("configs"));
                    }
                    if (getSdkConfig().has("configs_hash")) {
                        json.put("configs_hash", (Object)getSdkConfig().optString("configs_hash", ""));
                    }
                    if (getSdkConfig().has("ab_id")) {
                        json.put("ab_id", (Object)getSdkConfig().optString("ab_id", ""));
                    }
                    if (getSdkConfig().has("ab_variant_id")) {
                        json.put("ab_variant_id", (Object)getSdkConfig().optString("ab_variant_id", ""));
                    }
                }
                catch (final JSONException ex2) {
                    GALogger.e("startNewSession: error creating json");
                    ex2.printStackTrace();
                }
            }
            getInstance().configsHash = json.optString("configs_hash", "");
            getInstance().abId = json.optString("ab_id", "");
            getInstance().abVariantId = json.optString("ab_variant_id", "");
            GAStore.setState("sdk_config_cached", json.toString());
            getInstance().sdkConfigCached = json;
            getInstance().sdkConfig = json;
            getInstance().initAuthorized = true;
        }
        else if (response == EGAHTTPApiResponse.Unauthorized) {
            GALogger.w("Initialize SDK failed - Unauthorized");
            getInstance().initAuthorized = false;
        }
        else {
            if (response != EGAHTTPApiResponse.NoResponse && response != EGAHTTPApiResponse.RequestTimeout) {
                if (response != EGAHTTPApiResponse.BadResponse && response != EGAHTTPApiResponse.JsonEncodeFailed && response != EGAHTTPApiResponse.JsonDecodeFailed) {
                    if (response == EGAHTTPApiResponse.BadRequest || response == EGAHTTPApiResponse.UnknownResponseCode) {
                        GALogger.i("Init call (session start) failed - bad request or unknown response.");
                    }
                }
                else {
                    GALogger.i("Init call (session start) failed - bad response. Could be bad response from proxy or GA servers.");
                }
            }
            else {
                GALogger.i("Init call (session start) failed - no response. Could be offline or timeout.");
            }
            if (getInstance().sdkConfig == null) {
                if (getInstance().sdkConfigCached != null) {
                    GALogger.i("Init call (session start) failed - using cached init values.");
                    getInstance().sdkConfig = getInstance().sdkConfigCached;
                }
                else {
                    GALogger.i("Init call (session start) failed - using default init values.");
                    getInstance().sdkConfig = getInstance().sdkConfigDefault;
                }
            }
            else {
                GALogger.i("Init call (session start) failed - using cached init values.");
            }
            getInstance().initAuthorized = true;
        }
        getInstance().clientServerTimeOffset = getSdkConfig().optLong("time_offset", 0L);
        populateConfigurations(getSdkConfig());
        if (!isEnabled()) {
            GALogger.w("Could not start session: SDK is disabled.");
            GAEvents.stopEventQueue();
            return;
        }
        GAEvents.ensureEventQueueIsRunning();
        getInstance().sessionId = UUID.randomUUID().toString().toLowerCase(Locale.US);
        getInstance().sessionStart = getClientTsAdjusted();
        while (true) {
            getInstance();
            if (n >= 120) {
                break;
            }
            getInstance().fpsTable[n] = 0L;
            ++n;
        }
        getInstance().updateLastUsedSDKVersion();
        GAEvents.addSessionStartEvent();
    }
    
    public static void stopAnimator() {
        try {
            final ValueAnimator v_animator = GAState.INSTANCE.v_animator;
            if (v_animator != null) {
                v_animator.end();
            }
        }
        finally {
            final Throwable t;
            t.printStackTrace();
        }
    }
    
    private static void updateLastUsedIdentifier(final String s) {
        final SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences("GameAnalytics", 0);
        if (sharedPreferences != null && !TextUtils.isEmpty((CharSequence)s) && !s.equals((Object)getLastUsedIdentifier())) {
            GALogger.d("updateLastUsedIdentifier: newId=" + s);
            final SharedPreferences$Editor edit = sharedPreferences.edit();
            edit.putString("ga_last_used_identifier", s);
            edit.apply();
        }
    }
    
    private void updateLastUsedSDKVersion() {
        final SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences("GameAnalytics", 0);
        if (sharedPreferences != null) {
            final String string = sharedPreferences.getString("ga_sdk_version", "");
            final String relevantSdkVersion = GADevice.getRelevantSdkVersion();
            if (!TextUtils.isEmpty((CharSequence)relevantSdkVersion) && (TextUtils.isEmpty((CharSequence)string) || !relevantSdkVersion.equals((Object)string))) {
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                edit.putString("ga_sdk_version", GADevice.getRelevantSdkVersion());
                edit.apply();
            }
        }
    }
    
    public static boolean useErrorReporting() {
        return getInstance().enableErrorReporting;
    }
    
    public static boolean useManualSessionHandling() {
        return GAState.useManualSessionHandling;
    }
    
    public static JSONObject validateAndCleanCustomFields(Map<String, Object> iterator) {
        final JSONObject jsonObject = new JSONObject();
        if (iterator != null) {
            iterator = ((Map)iterator).entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Map$Entry map$Entry = (Map$Entry)iterator.next();
                if (map$Entry.getKey() != null && map$Entry.getValue() != null) {
                    if (n < 50) {
                        if (GAUtilities.stringMatch((String)map$Entry.getKey(), "^[a-zA-Z0-9_]{1,64}$")) {
                            Label_0148: {
                                String string;
                                if (map$Entry.getValue() instanceof Character) {
                                    string = map$Entry.getValue().toString();
                                    if (string.length() > 256 || string.length() <= 0) {
                                        final String format = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                                        GALogger.w(format);
                                        addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", GAErrorSeverity.Warning, format);
                                        continue;
                                    }
                                }
                                else {
                                    if (map$Entry.getValue() instanceof String) {
                                        final String s = (String)map$Entry.getValue();
                                        if (s.length() <= 256 && s.length() > 0) {
                                            try {
                                                jsonObject.put((String)map$Entry.getKey(), (Object)s);
                                                break Label_0148;
                                            }
                                            catch (final JSONException ex) {
                                                final String format2 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                                                GALogger.w(format2);
                                                addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", GAErrorSeverity.Warning, format2);
                                                continue;
                                            }
                                        }
                                        final String format3 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                                        GALogger.w(format3);
                                        addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", GAErrorSeverity.Warning, format3);
                                        continue;
                                    }
                                    if (map$Entry.getValue() instanceof Number) {
                                        final Number n2 = (Number)map$Entry.getValue();
                                        try {
                                            jsonObject.put((String)map$Entry.getKey(), (Object)n2);
                                            break Label_0148;
                                        }
                                        catch (final JSONException ex2) {
                                            final String format4 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                                            GALogger.w(format4);
                                            addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", GAErrorSeverity.Warning, format4);
                                            continue;
                                        }
                                    }
                                    final String format5 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is not a string or number", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                                    GALogger.w(format5);
                                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is not a string or number", GAErrorSeverity.Warning, format5);
                                    continue;
                                }
                                try {
                                    jsonObject.put((String)map$Entry.getKey(), (Object)string);
                                    ++n;
                                }
                                catch (final JSONException ex3) {
                                    final String format6 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                                    GALogger.w(format6);
                                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", GAErrorSeverity.Warning, format6);
                                }
                            }
                        }
                        else {
                            final String format7 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key contains illegal character, is empty or exceeds the max number of characters (64)", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                            GALogger.w(format7);
                            addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key contains illegal character, is empty or exceeds the max number of characters (64)", GAErrorSeverity.Warning, format7);
                        }
                    }
                    else {
                        final String format8 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because it exceeds the max number of custom fields (50)", new Object[] { map$Entry.getKey(), map$Entry.getValue().toString() });
                        GALogger.w(format8);
                        addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because it exceeds the max number of custom fields (50)", GAErrorSeverity.Warning, format8);
                    }
                }
                else {
                    final String format9 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key or value is null", new Object[] { map$Entry.getKey(), map$Entry.getValue() });
                    GALogger.w(format9);
                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key or value is null", GAErrorSeverity.Warning, format9);
                }
            }
        }
        return jsonObject;
    }
    
    private static void validateAndFixCurrentDimensions() {
        if (!GAValidator.validateDimension01(getInstance().currentCustomDimension01)) {
            GALogger.d("Invalid dimension01 found in variable. Setting to nil. Invalid dimension: " + getInstance().currentCustomDimension01);
            setCustomDimension01("");
        }
        if (!GAValidator.validateDimension02(getInstance().currentCustomDimension02)) {
            GALogger.d("Invalid dimension02 found in variable. Setting to nil. Invalid dimension: " + getInstance().currentCustomDimension02);
            setCustomDimension02("");
        }
        if (!GAValidator.validateDimension03(getInstance().currentCustomDimension03)) {
            GALogger.d("Invalid dimension03 found in variable. Setting to nil. Invalid dimension: " + getInstance().currentCustomDimension03);
            setCustomDimension03("");
        }
    }
}
