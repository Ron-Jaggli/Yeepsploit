package com.gameanalytics.sdk.http;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.Callable;
import com.gameanalytics.sdk.utilities.TaskRunner;
import com.gameanalytics.sdk.events.SdkErrorTask;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import android.text.TextUtils;
import com.gameanalytics.sdk.validators.GAValidator;
import com.gameanalytics.sdk.events.EGASdkErrorParameter;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.logging.GALogger;
import java.io.IOException;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.state.GAState;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.HashMap;

public class GAHTTPApi
{
    private static final GAHTTPApi INSTANCE;
    private static final int MAX_ERROR_MESSAGE_LENGTH = 256;
    private static int MAX_SDK_ERROR_EVENTS;
    private static int SDK_ERROR_TIMEOUT;
    private String baseUrl;
    private String eventsUrlPath;
    private String hostName;
    private String initializeUrlPath;
    private String protocol;
    private String remoteConfigsBaseUrl;
    private String remoteConfigsVersion;
    private HashMap<String, SdkErrorEventCounter> sdkErrorEventTimeout;
    private boolean useGzip;
    private String version;
    
    static {
        INSTANCE = new GAHTTPApi();
        GAHTTPApi.SDK_ERROR_TIMEOUT = 3600000;
        GAHTTPApi.MAX_SDK_ERROR_EVENTS = 10;
    }
    
    private GAHTTPApi() {
        this.protocol = "https";
        this.hostName = "api.gameanalytics.com";
        this.version = "v2";
        this.remoteConfigsVersion = "v1";
        this.baseUrl = this.protocol + "://" + this.hostName + "/" + this.version;
        this.remoteConfigsBaseUrl = this.protocol + "://" + this.hostName + "/remote_configs/" + this.remoteConfigsVersion;
        this.initializeUrlPath = "init";
        this.eventsUrlPath = "events";
        this.useGzip = true;
        this.sdkErrorEventTimeout = (HashMap<String, SdkErrorEventCounter>)new HashMap();
    }
    
    private HttpURLConnection createRequest(final String s, final byte[] array, final boolean b) throws IOException {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(s).openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(array.length));
        if (b) {
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
        httpURLConnection.setRequestProperty("Authorization", GAUtilities.hmac(GAState.getSecretKey(), array));
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }
    
    public static GAHTTPApi getInstance() {
        return GAHTTPApi.INSTANCE;
    }
    
    private EGAHTTPApiResponse processRequestResponse(final HttpURLConnection httpURLConnection, final String s, final String s2) {
        int responseCode;
        try {
            responseCode = httpURLConnection.getResponseCode();
        }
        catch (final IOException | Exception ex) {
            responseCode = 0;
        }
        if (s.length() == 0) {
            String responseMessage;
            try {
                responseMessage = httpURLConnection.getResponseMessage();
            }
            catch (final IOException | Exception ex2) {
                responseMessage = "";
            }
            GALogger.d(s2 + " request. failed. Might be no connection. Description: " + responseMessage + ", Status code: " + responseCode);
            return EGAHTTPApiResponse.NoResponse;
        }
        if (responseCode == 200) {
            return EGAHTTPApiResponse.Ok;
        }
        if (responseCode == 201) {
            return EGAHTTPApiResponse.Created;
        }
        if (responseCode == 0 || responseCode == 401) {
            GALogger.d(s2 + " request. 401 - Unauthorized.");
            return EGAHTTPApiResponse.Unauthorized;
        }
        if (responseCode == 400) {
            GALogger.d(s2 + " request. 400 - Bad Request.");
            return EGAHTTPApiResponse.BadRequest;
        }
        if (responseCode == 500) {
            GALogger.d(s2 + " request. 500 - Internal Server Error.");
            return EGAHTTPApiResponse.InternalServerError;
        }
        return EGAHTTPApiResponse.UnknownResponseCode;
    }
    
    private void sendSdkErrorEventInternal(EGASdkErrorCategory egaSdkErrorCategory, final EGASdkErrorArea egaSdkErrorArea, final EGASdkErrorAction egaSdkErrorAction, final EGASdkErrorParameter egaSdkErrorParameter, final String s, String methodName, final String s2) {
        final String s3 = "";
        if (!GAState.doSendEvents()) {
            return;
        }
        final String string = egaSdkErrorArea.toString();
        final long currentTimeMillis = System.currentTimeMillis();
        if (!this.sdkErrorEventTimeout.containsKey((Object)string)) {
            final SdkErrorEventCounter sdkErrorEventCounter = new SdkErrorEventCounter(currentTimeMillis);
            ++sdkErrorEventCounter.count;
            this.sdkErrorEventTimeout.put((Object)string, (Object)sdkErrorEventCounter);
        }
        else {
            final SdkErrorEventCounter sdkErrorEventCounter2 = (SdkErrorEventCounter)this.sdkErrorEventTimeout.get((Object)string);
            if (sdkErrorEventCounter2.count >= GAHTTPApi.MAX_SDK_ERROR_EVENTS) {
                if (currentTimeMillis - sdkErrorEventCounter2.timestamp <= GAHTTPApi.SDK_ERROR_TIMEOUT) {
                    GALogger.e("Too many errors have been registered while sending events, error code: \"" + string + "\". Please check if your event submission is correct. Maximum error events allowed is: " + GAHTTPApi.MAX_SDK_ERROR_EVENTS + " per hour!");
                    return;
                }
                sdkErrorEventCounter2.timestamp = currentTimeMillis;
                sdkErrorEventCounter2.count = 0;
            }
            ++sdkErrorEventCounter2.count;
        }
        if (!GAValidator.validateSdkErrorEvent(methodName, s2, egaSdkErrorCategory, egaSdkErrorArea, egaSdkErrorAction)) {
            return;
        }
        final String string2 = this.baseUrl + "/" + methodName + "/" + this.eventsUrlPath;
        GALogger.d("Sending 'events' URL: " + string2);
        try {
            final JSONObject sdkErrorEventAnnotations = GAState.getSdkErrorEventAnnotations();
            final String string3 = egaSdkErrorCategory.toString();
            sdkErrorEventAnnotations.put("error_category", (Object)string3);
            methodName = (String)(egaSdkErrorCategory = (EGASdkErrorCategory)("" + string3));
            try {
                final String string4 = egaSdkErrorArea.toString();
                egaSdkErrorCategory = (EGASdkErrorCategory)methodName;
                sdkErrorEventAnnotations.put("error_area", (Object)string4);
                egaSdkErrorCategory = (EGASdkErrorCategory)methodName;
                egaSdkErrorCategory = (EGASdkErrorCategory)methodName;
                final StringBuilder sb = new StringBuilder();
                egaSdkErrorCategory = (EGASdkErrorCategory)methodName;
                final Object o = egaSdkErrorCategory = (EGASdkErrorCategory)sb.append(methodName).append(":").append(string4).toString();
                sdkErrorEventAnnotations.put("error_action", (Object)egaSdkErrorAction.toString());
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int n = 4;
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                methodName = stackTrace[4].getMethodName();
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                sdkErrorEventAnnotations.put("function_name", (Object)methodName);
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final int lineNumber = stackTrace[4].getLineNumber();
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                sdkErrorEventAnnotations.put("line_number", lineNumber);
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final StringBuilder sb2 = new StringBuilder();
                while (true) {
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    if (n >= stackTrace.length) {
                        break;
                    }
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    final StringBuilder sb3 = new StringBuilder();
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    sb2.append(sb3.append(stackTrace[n].toString()).append("\n").toString());
                    ++n;
                }
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                if (sb2.length() > 4096) {
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    sb2.setLength(4096);
                }
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                sdkErrorEventAnnotations.put("stacktrace", (Object)sb2.toString());
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final StringBuilder sb4 = new StringBuilder();
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                GALogger.e(sb4.append("sendSdkErrorEvent: ").append(methodName).append("at line: ").append(lineNumber).append(" with stacktrace:\n").append((Object)sb2).toString());
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final String string5 = egaSdkErrorParameter.toString();
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                if (!TextUtils.isEmpty((CharSequence)string5)) {
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    sdkErrorEventAnnotations.put("error_parameter", (Object)string5);
                }
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    String substring;
                    if (s.length() > 256) {
                        egaSdkErrorCategory = (EGASdkErrorCategory)o;
                        substring = s.substring(0, 256);
                    }
                    else {
                        substring = s;
                    }
                    egaSdkErrorCategory = (EGASdkErrorCategory)o;
                    sdkErrorEventAnnotations.put("reason", (Object)substring);
                }
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final ArrayList list = new ArrayList();
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                list.add((Object)sdkErrorEventAnnotations);
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
                final String jsonString = GAUtilities.jsonString((ArrayList<JSONObject>)list);
                egaSdkErrorCategory = (EGASdkErrorCategory)o;
            }
            catch (final JSONException ex) {}
        }
        catch (final JSONException ex) {
            egaSdkErrorCategory = (EGASdkErrorCategory)"";
        }
        final JSONException ex;
        ex.printStackTrace();
        final String jsonString = s3;
        if (TextUtils.isEmpty((CharSequence)jsonString)) {
            GALogger.w("sendSdkErrorEvent: JSON encoding failed.");
            return;
        }
        try {
            GALogger.d("sendSdkErrorEvent json: " + jsonString);
            TaskRunner.executeAsync((java.util.concurrent.Callable<Object>)new SdkErrorTask(string2, (String)egaSdkErrorCategory, jsonString.getBytes("UTF-8"), s2), null);
        }
        catch (final UnsupportedEncodingException ex2) {
            GALogger.w("sendSdkErrorEvent: Payload data encoding failed.");
            ex2.printStackTrace();
        }
    }
    
    private JSONObject validateAndCleanInitRequestResponse(final JSONObject jsonObject, final boolean b) {
        if (jsonObject == null) {
            GALogger.w("validateInitRequestResponse failed - no response dictionary.");
            return null;
        }
        final JSONObject jsonObject2 = new JSONObject();
        if (jsonObject.has("server_ts")) {
            try {
                final double optDouble = jsonObject.optDouble("server_ts", -1.0);
                if (optDouble > 0.0) {
                    jsonObject2.put("server_ts", optDouble);
                }
            }
            catch (final JSONException ex) {
                GALogger.w("validateInitRequestResponse failed - invalid type in 'server_ts' field.");
                return null;
            }
        }
        if (b) {
            if (jsonObject.has("configs")) {
                try {
                    jsonObject2.put("configs", (Object)jsonObject.getJSONArray("configs"));
                }
                catch (final JSONException ex2) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'configs' field.");
                    return null;
                }
            }
            if (jsonObject.has("configs_hash")) {
                try {
                    jsonObject2.put("configs_hash", (Object)jsonObject.getString("configs_hash"));
                }
                catch (final JSONException ex3) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'configs_hash' field.");
                    return null;
                }
            }
            if (jsonObject.has("ab_id")) {
                try {
                    jsonObject2.put("ab_id", (Object)jsonObject.getString("ab_id"));
                }
                catch (final JSONException ex4) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'ab_id' field.");
                    return null;
                }
            }
            if (jsonObject.has("ab_variant_id")) {
                try {
                    jsonObject2.put("ab_variant_id", (Object)jsonObject.getString("ab_variant_id"));
                }
                catch (final JSONException ex5) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'ab_variant_id' field.");
                    return null;
                }
            }
        }
        return jsonObject2;
    }
    
    public byte[] createPayloadData(final String s, final boolean b) throws Exception {
        byte[] bytes;
        if (b) {
            final byte[] gzipCompress = GAUtilities.gzipCompress(s);
            GALogger.d("Gzip stats. Size: " + s.getBytes("UTF-8").length + ", Compressed: " + gzipCompress.length + ", Content: " + s);
            bytes = gzipCompress;
        }
        else {
            bytes = s.getBytes("UTF-8");
        }
        return bytes;
    }
    
    public GAHTTPApiResponseJSONObjectPair requestInitReturningDict(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.<init>:(Lcom/gameanalytics/sdk/http/GAHTTPApi;)V
        //     8: astore          7
        //    10: invokestatic    com/gameanalytics/sdk/state/GAState.getGameKey:()Ljava/lang/String;
        //    13: astore_3       
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: invokespecial   java/lang/StringBuilder.<init>:()V
        //    21: aload_0        
        //    22: getfield        com/gameanalytics/sdk/http/GAHTTPApi.remoteConfigsBaseUrl:Ljava/lang/String;
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: ldc             "/"
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: aload_0        
        //    34: getfield        com/gameanalytics/sdk/http/GAHTTPApi.initializeUrlPath:Ljava/lang/String;
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: ldc_w           "?game_key="
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_3        
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: ldc_w           "&interval_seconds=0&configs_hash="
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: aload_1        
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    63: astore_3       
        //    64: aload_3        
        //    65: astore_1       
        //    66: invokestatic    com/gameanalytics/sdk/state/GAState.getABTestingId:()Ljava/lang/String;
        //    69: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    72: ifne            102
        //    75: new             Ljava/lang/StringBuilder;
        //    78: dup            
        //    79: invokespecial   java/lang/StringBuilder.<init>:()V
        //    82: aload_3        
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: ldc_w           "&ab_id="
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: invokestatic    com/gameanalytics/sdk/state/GAState.getABTestingId:()Ljava/lang/String;
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: astore_1       
        //   102: aload_1        
        //   103: astore          5
        //   105: invokestatic    com/gameanalytics/sdk/state/GAState.getABTestingVariantId:()Ljava/lang/String;
        //   108: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   111: ifne            142
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: invokespecial   java/lang/StringBuilder.<init>:()V
        //   121: aload_1        
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: ldc_w           "&ab_variant_id="
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   131: invokestatic    com/gameanalytics/sdk/state/GAState.getABTestingVariantId:()Ljava/lang/String;
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   140: astore          5
        //   142: new             Ljava/lang/StringBuilder;
        //   145: dup            
        //   146: ldc_w           "Sending 'init' URL: "
        //   149: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   152: aload           5
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   160: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   163: invokestatic    com/gameanalytics/sdk/state/GAState.getInitAnnotations:()Lorg/json/JSONObject;
        //   166: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   169: astore          8
        //   171: aload           8
        //   173: ifnull          743
        //   176: aload           8
        //   178: invokevirtual   java/lang/String.length:()I
        //   181: ifne            187
        //   184: goto            743
        //   187: ldc             ""
        //   189: astore          4
        //   191: aload_0        
        //   192: aload           8
        //   194: aload_0        
        //   195: getfield        com/gameanalytics/sdk/http/GAHTTPApi.useGzip:Z
        //   198: invokevirtual   com/gameanalytics/sdk/http/GAHTTPApi.createPayloadData:(Ljava/lang/String;Z)[B
        //   201: astore          6
        //   203: aload_0        
        //   204: aload           5
        //   206: aload           6
        //   208: aload_0        
        //   209: getfield        com/gameanalytics/sdk/http/GAHTTPApi.useGzip:Z
        //   212: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi.createRequest:(Ljava/lang/String;[BZ)Ljava/net/HttpURLConnection;
        //   215: astore_1       
        //   216: aload_1        
        //   217: astore_3       
        //   218: aload_1        
        //   219: invokevirtual   java/net/HttpURLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   222: aload           6
        //   224: invokevirtual   java/io/OutputStream.write:([B)V
        //   227: aload_1        
        //   228: astore_3       
        //   229: new             Ljava/io/BufferedReader;
        //   232: astore          6
        //   234: aload_1        
        //   235: astore_3       
        //   236: new             Ljava/io/InputStreamReader;
        //   239: astore          9
        //   241: aload_1        
        //   242: astore_3       
        //   243: aload           9
        //   245: aload_1        
        //   246: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   249: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   252: aload_1        
        //   253: astore_3       
        //   254: aload           6
        //   256: aload           9
        //   258: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   261: aload_1        
        //   262: astore_3       
        //   263: new             Ljava/lang/StringBuffer;
        //   266: astore          9
        //   268: aload_1        
        //   269: astore_3       
        //   270: aload           9
        //   272: invokespecial   java/lang/StringBuffer.<init>:()V
        //   275: aload_1        
        //   276: astore_3       
        //   277: aload           6
        //   279: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   282: astore          10
        //   284: aload           10
        //   286: ifnull          302
        //   289: aload_1        
        //   290: astore_3       
        //   291: aload           9
        //   293: aload           10
        //   295: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   298: pop            
        //   299: goto            275
        //   302: aload_1        
        //   303: astore_3       
        //   304: aload           6
        //   306: invokevirtual   java/io/BufferedReader.close:()V
        //   309: aload_1        
        //   310: astore_3       
        //   311: aload           9
        //   313: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   316: astore          6
        //   318: aload           6
        //   320: astore          4
        //   322: goto            328
        //   325: astore_1       
        //   326: aconst_null    
        //   327: astore_1       
        //   328: goto            432
        //   331: astore_1       
        //   332: aconst_null    
        //   333: astore_1       
        //   334: aload_1        
        //   335: astore_3       
        //   336: new             Ljava/io/BufferedReader;
        //   339: astore          6
        //   341: aload_1        
        //   342: astore_3       
        //   343: new             Ljava/io/InputStreamReader;
        //   346: astore          9
        //   348: aload_1        
        //   349: astore_3       
        //   350: aload           9
        //   352: aload_1        
        //   353: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //   356: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   359: aload_1        
        //   360: astore_3       
        //   361: aload           6
        //   363: aload           9
        //   365: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   368: aload_1        
        //   369: astore_3       
        //   370: new             Ljava/lang/StringBuffer;
        //   373: astore          9
        //   375: aload_1        
        //   376: astore_3       
        //   377: aload           9
        //   379: invokespecial   java/lang/StringBuffer.<init>:()V
        //   382: aload_1        
        //   383: astore_3       
        //   384: aload           6
        //   386: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   389: astore          10
        //   391: aload           10
        //   393: ifnull          409
        //   396: aload_1        
        //   397: astore_3       
        //   398: aload           9
        //   400: aload           10
        //   402: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   405: pop            
        //   406: goto            382
        //   409: aload_1        
        //   410: astore_3       
        //   411: aload           6
        //   413: invokevirtual   java/io/BufferedReader.close:()V
        //   416: aload_1        
        //   417: astore_3       
        //   418: aload           9
        //   420: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   423: astore          6
        //   425: aload           6
        //   427: astore          4
        //   429: goto            328
        //   432: new             Ljava/lang/StringBuilder;
        //   435: dup            
        //   436: ldc_w           "init request content : "
        //   439: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   442: aload           4
        //   444: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   447: ldc_w           ", JSONstring: "
        //   450: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   453: aload           8
        //   455: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   458: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   461: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   464: aload           4
        //   466: invokestatic    com/gameanalytics/sdk/utilities/GAUtilities.dictionary:(Ljava/lang/String;)Lorg/json/JSONObject;
        //   469: astore          6
        //   471: aload_0        
        //   472: aload_1        
        //   473: aload           4
        //   475: ldc_w           "Init"
        //   478: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi.processRequestResponse:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   481: astore_3       
        //   482: aload_3        
        //   483: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.Ok:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   486: if_acmpeq       588
        //   489: aload_3        
        //   490: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.Created:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   493: if_acmpeq       588
        //   496: aload_3        
        //   497: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.BadRequest:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   500: if_acmpeq       588
        //   503: aload_1        
        //   504: ldc             "Authorization"
        //   506: invokevirtual   java/net/HttpURLConnection.getRequestProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   509: astore_1       
        //   510: new             Ljava/lang/StringBuilder;
        //   513: dup            
        //   514: ldc_w           "Failed Init Call. URL: "
        //   517: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   520: aload           5
        //   522: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   525: ldc_w           ", Authorization: "
        //   528: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   531: aload_1        
        //   532: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   535: ldc_w           ", JSONString: "
        //   538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   541: aload           8
        //   543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   546: ldc_w           ", responseJSON: "
        //   549: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   552: aload           6
        //   554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   557: ldc_w           ", requestResponseEnum: "
        //   560: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   563: aload_3        
        //   564: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   567: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   570: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   573: aload           7
        //   575: aload_3        
        //   576: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   579: aload           7
        //   581: aconst_null    
        //   582: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   585: aload           7
        //   587: areturn        
        //   588: aload           6
        //   590: ifnonnull       639
        //   593: ldc_w           "Failed Init Call. Json decoding failed"
        //   596: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   599: aload           7
        //   601: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.JsonDecodeFailed:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   604: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   607: invokestatic    com/gameanalytics/sdk/http/GAHTTPApi.getInstance:()Lcom/gameanalytics/sdk/http/GAHTTPApi;
        //   610: getstatic       com/gameanalytics/sdk/events/EGASdkErrorCategory.Http:Lcom/gameanalytics/sdk/events/EGASdkErrorCategory;
        //   613: getstatic       com/gameanalytics/sdk/events/EGASdkErrorArea.InitHttp:Lcom/gameanalytics/sdk/events/EGASdkErrorArea;
        //   616: getstatic       com/gameanalytics/sdk/events/EGASdkErrorAction.FailHttpJsonDecode:Lcom/gameanalytics/sdk/events/EGASdkErrorAction;
        //   619: aload           4
        //   621: invokestatic    com/gameanalytics/sdk/state/GAState.getGameKey:()Ljava/lang/String;
        //   624: invokestatic    com/gameanalytics/sdk/state/GAState.getSecretKey:()Ljava/lang/String;
        //   627: invokevirtual   com/gameanalytics/sdk/http/GAHTTPApi.sendSdkErrorEvent:(Lcom/gameanalytics/sdk/events/EGASdkErrorCategory;Lcom/gameanalytics/sdk/events/EGASdkErrorArea;Lcom/gameanalytics/sdk/events/EGASdkErrorAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   630: aload           7
        //   632: aconst_null    
        //   633: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   636: aload           7
        //   638: areturn        
        //   639: aload_3        
        //   640: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.BadRequest:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   643: if_acmpne       685
        //   646: new             Ljava/lang/StringBuilder;
        //   649: dup            
        //   650: ldc_w           "Failed Init Call. Bad request. Response: "
        //   653: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   656: aload           6
        //   658: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //   661: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   664: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   667: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   670: aload           7
        //   672: aload_3        
        //   673: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   676: aload           7
        //   678: aconst_null    
        //   679: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   682: aload           7
        //   684: areturn        
        //   685: aload_3        
        //   686: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.Created:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   689: if_acmpne       697
        //   692: iconst_1       
        //   693: istore_2       
        //   694: goto            699
        //   697: iconst_0       
        //   698: istore_2       
        //   699: aload_0        
        //   700: aload           6
        //   702: iload_2        
        //   703: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi.validateAndCleanInitRequestResponse:(Lorg/json/JSONObject;Z)Lorg/json/JSONObject;
        //   706: astore_1       
        //   707: aload_1        
        //   708: ifnonnull       728
        //   711: aload           7
        //   713: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.BadResponse:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   716: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   719: aload           7
        //   721: aconst_null    
        //   722: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   725: aload           7
        //   727: areturn        
        //   728: aload           7
        //   730: aload_3        
        //   731: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   734: aload           7
        //   736: aload_1        
        //   737: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   740: aload           7
        //   742: areturn        
        //   743: aload           7
        //   745: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.JsonEncodeFailed:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   748: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   751: aload           7
        //   753: aconst_null    
        //   754: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   757: aload           7
        //   759: areturn        
        //   760: astore_3       
        //   761: goto            334
        //   764: astore_1       
        //   765: aload_3        
        //   766: astore_1       
        //   767: goto            328
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  191    216    331    334    Ljava/io/IOException;
        //  191    216    325    328    Ljava/lang/Exception;
        //  218    227    760    764    Ljava/io/IOException;
        //  218    227    764    770    Ljava/lang/Exception;
        //  229    234    760    764    Ljava/io/IOException;
        //  229    234    764    770    Ljava/lang/Exception;
        //  236    241    760    764    Ljava/io/IOException;
        //  236    241    764    770    Ljava/lang/Exception;
        //  243    252    760    764    Ljava/io/IOException;
        //  243    252    764    770    Ljava/lang/Exception;
        //  254    261    760    764    Ljava/io/IOException;
        //  254    261    764    770    Ljava/lang/Exception;
        //  263    268    760    764    Ljava/io/IOException;
        //  263    268    764    770    Ljava/lang/Exception;
        //  270    275    760    764    Ljava/io/IOException;
        //  270    275    764    770    Ljava/lang/Exception;
        //  277    284    760    764    Ljava/io/IOException;
        //  277    284    764    770    Ljava/lang/Exception;
        //  291    299    760    764    Ljava/io/IOException;
        //  291    299    764    770    Ljava/lang/Exception;
        //  304    309    760    764    Ljava/io/IOException;
        //  304    309    764    770    Ljava/lang/Exception;
        //  311    318    760    764    Ljava/io/IOException;
        //  311    318    764    770    Ljava/lang/Exception;
        //  336    341    764    770    Ljava/io/IOException;
        //  336    341    764    770    Ljava/lang/Exception;
        //  343    348    764    770    Ljava/io/IOException;
        //  343    348    764    770    Ljava/lang/Exception;
        //  350    359    764    770    Ljava/io/IOException;
        //  350    359    764    770    Ljava/lang/Exception;
        //  361    368    764    770    Ljava/io/IOException;
        //  361    368    764    770    Ljava/lang/Exception;
        //  370    375    764    770    Ljava/io/IOException;
        //  370    375    764    770    Ljava/lang/Exception;
        //  377    382    764    770    Ljava/io/IOException;
        //  377    382    764    770    Ljava/lang/Exception;
        //  384    391    764    770    Ljava/io/IOException;
        //  384    391    764    770    Ljava/lang/Exception;
        //  398    406    764    770    Ljava/io/IOException;
        //  398    406    764    770    Ljava/lang/Exception;
        //  411    416    764    770    Ljava/io/IOException;
        //  411    416    764    770    Ljava/lang/Exception;
        //  418    425    764    770    Ljava/io/IOException;
        //  418    425    764    770    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0275:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1154)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:652)
        //     at java.lang.Thread.run(Thread.java:1563)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public GAHTTPApiResponseJSONObjectPair sendEventsInArray(final ArrayList<JSONObject> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     4: ifeq            13
        //     7: ldc_w           "sendEventsInArray called with missing eventArray"
        //    10: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //    13: new             Lcom/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair;
        //    16: dup            
        //    17: aload_0        
        //    18: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.<init>:(Lcom/gameanalytics/sdk/http/GAHTTPApi;)V
        //    21: astore          5
        //    23: invokestatic    com/gameanalytics/sdk/state/GAState.getGameKey:()Ljava/lang/String;
        //    26: astore_2       
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: aload_0        
        //    35: getfield        com/gameanalytics/sdk/http/GAHTTPApi.baseUrl:Ljava/lang/String;
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: ldc             "/"
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_2        
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    50: ldc             "/"
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: aload_0        
        //    56: getfield        com/gameanalytics/sdk/http/GAHTTPApi.eventsUrlPath:Ljava/lang/String;
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    62: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    65: astore          6
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: ldc_w           "Sending 'events' URL: "
        //    74: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    77: aload           6
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    85: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //    88: aload_1        
        //    89: invokestatic    com/gameanalytics/sdk/utilities/GAUtilities.jsonString:(Ljava/util/ArrayList;)Ljava/lang/String;
        //    92: astore          7
        //    94: aload           7
        //    96: invokevirtual   java/lang/String.length:()I
        //    99: ifne            125
        //   102: ldc_w           "sendEventsInArray JSON encoding failed of eventArray"
        //   105: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   108: aload           5
        //   110: aconst_null    
        //   111: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   114: aload           5
        //   116: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.JsonEncodeFailed:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   119: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   122: aload           5
        //   124: areturn        
        //   125: ldc             ""
        //   127: astore_3       
        //   128: aload_0        
        //   129: aload           7
        //   131: aload_0        
        //   132: getfield        com/gameanalytics/sdk/http/GAHTTPApi.useGzip:Z
        //   135: invokevirtual   com/gameanalytics/sdk/http/GAHTTPApi.createPayloadData:(Ljava/lang/String;Z)[B
        //   138: astore          4
        //   140: aload_0        
        //   141: aload           6
        //   143: aload           4
        //   145: aload_0        
        //   146: getfield        com/gameanalytics/sdk/http/GAHTTPApi.useGzip:Z
        //   149: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi.createRequest:(Ljava/lang/String;[BZ)Ljava/net/HttpURLConnection;
        //   152: astore_1       
        //   153: aload_1        
        //   154: astore_2       
        //   155: aload_1        
        //   156: invokevirtual   java/net/HttpURLConnection.getOutputStream:()Ljava/io/OutputStream;
        //   159: aload           4
        //   161: invokevirtual   java/io/OutputStream.write:([B)V
        //   164: aload_1        
        //   165: astore_2       
        //   166: new             Ljava/io/BufferedReader;
        //   169: astore          4
        //   171: aload_1        
        //   172: astore_2       
        //   173: new             Ljava/io/InputStreamReader;
        //   176: astore          8
        //   178: aload_1        
        //   179: astore_2       
        //   180: aload           8
        //   182: aload_1        
        //   183: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   186: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   189: aload_1        
        //   190: astore_2       
        //   191: aload           4
        //   193: aload           8
        //   195: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   198: aload_1        
        //   199: astore_2       
        //   200: new             Ljava/lang/StringBuffer;
        //   203: astore          9
        //   205: aload_1        
        //   206: astore_2       
        //   207: aload           9
        //   209: invokespecial   java/lang/StringBuffer.<init>:()V
        //   212: aload_1        
        //   213: astore_2       
        //   214: aload           4
        //   216: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   219: astore          8
        //   221: aload           8
        //   223: ifnull          239
        //   226: aload_1        
        //   227: astore_2       
        //   228: aload           9
        //   230: aload           8
        //   232: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   235: pop            
        //   236: goto            212
        //   239: aload_1        
        //   240: astore_2       
        //   241: aload           4
        //   243: invokevirtual   java/io/BufferedReader.close:()V
        //   246: aload_1        
        //   247: astore_2       
        //   248: aload           9
        //   250: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   253: astore          4
        //   255: aload           4
        //   257: astore_3       
        //   258: goto            264
        //   261: astore_1       
        //   262: aconst_null    
        //   263: astore_1       
        //   264: goto            367
        //   267: astore_1       
        //   268: aconst_null    
        //   269: astore_1       
        //   270: aload_1        
        //   271: astore_2       
        //   272: new             Ljava/io/BufferedReader;
        //   275: astore          4
        //   277: aload_1        
        //   278: astore_2       
        //   279: new             Ljava/io/InputStreamReader;
        //   282: astore          8
        //   284: aload_1        
        //   285: astore_2       
        //   286: aload           8
        //   288: aload_1        
        //   289: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //   292: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   295: aload_1        
        //   296: astore_2       
        //   297: aload           4
        //   299: aload           8
        //   301: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   304: aload_1        
        //   305: astore_2       
        //   306: new             Ljava/lang/StringBuffer;
        //   309: astore          8
        //   311: aload_1        
        //   312: astore_2       
        //   313: aload           8
        //   315: invokespecial   java/lang/StringBuffer.<init>:()V
        //   318: aload_1        
        //   319: astore_2       
        //   320: aload           4
        //   322: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   325: astore          9
        //   327: aload           9
        //   329: ifnull          345
        //   332: aload_1        
        //   333: astore_2       
        //   334: aload           8
        //   336: aload           9
        //   338: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   341: pop            
        //   342: goto            318
        //   345: aload_1        
        //   346: astore_2       
        //   347: aload           4
        //   349: invokevirtual   java/io/BufferedReader.close:()V
        //   352: aload_1        
        //   353: astore_2       
        //   354: aload           8
        //   356: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   359: astore          4
        //   361: aload           4
        //   363: astore_3       
        //   364: goto            264
        //   367: new             Ljava/lang/StringBuilder;
        //   370: dup            
        //   371: ldc_w           "events request content: "
        //   374: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   377: aload_3        
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   384: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   387: aload_0        
        //   388: aload_1        
        //   389: aload_3        
        //   390: ldc_w           "Events"
        //   393: invokespecial   com/gameanalytics/sdk/http/GAHTTPApi.processRequestResponse:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   396: astore_2       
        //   397: aload_2        
        //   398: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.Ok:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   401: if_acmpeq       475
        //   404: aload_2        
        //   405: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.BadRequest:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   408: if_acmpeq       475
        //   411: aload_1        
        //   412: ldc             "Authorization"
        //   414: invokevirtual   java/net/HttpURLConnection.getRequestProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   417: astore_1       
        //   418: new             Ljava/lang/StringBuilder;
        //   421: dup            
        //   422: ldc_w           "Failed events Call. URL: "
        //   425: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   428: aload           6
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   433: ldc_w           ", Authorization: "
        //   436: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   439: aload_1        
        //   440: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   443: ldc_w           ", JSONString: "
        //   446: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   449: aload           7
        //   451: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   454: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   457: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   460: aload           5
        //   462: aconst_null    
        //   463: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   466: aload           5
        //   468: aload_2        
        //   469: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   472: aload           5
        //   474: areturn        
        //   475: aload_3        
        //   476: invokestatic    com/gameanalytics/sdk/utilities/GAUtilities.dictionary:(Ljava/lang/String;)Lorg/json/JSONObject;
        //   479: astore_1       
        //   480: aload_1        
        //   481: ifnonnull       530
        //   484: aload_3        
        //   485: invokestatic    com/gameanalytics/sdk/utilities/GAUtilities.array:(Ljava/lang/String;)Lorg/json/JSONArray;
        //   488: ifnonnull       530
        //   491: aload           5
        //   493: aconst_null    
        //   494: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   497: aload           5
        //   499: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.JsonDecodeFailed:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   502: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   505: invokestatic    com/gameanalytics/sdk/http/GAHTTPApi.getInstance:()Lcom/gameanalytics/sdk/http/GAHTTPApi;
        //   508: getstatic       com/gameanalytics/sdk/events/EGASdkErrorCategory.Http:Lcom/gameanalytics/sdk/events/EGASdkErrorCategory;
        //   511: getstatic       com/gameanalytics/sdk/events/EGASdkErrorArea.EventsHttp:Lcom/gameanalytics/sdk/events/EGASdkErrorArea;
        //   514: getstatic       com/gameanalytics/sdk/events/EGASdkErrorAction.FailHttpJsonDecode:Lcom/gameanalytics/sdk/events/EGASdkErrorAction;
        //   517: aload_3        
        //   518: invokestatic    com/gameanalytics/sdk/state/GAState.getGameKey:()Ljava/lang/String;
        //   521: invokestatic    com/gameanalytics/sdk/state/GAState.getSecretKey:()Ljava/lang/String;
        //   524: invokevirtual   com/gameanalytics/sdk/http/GAHTTPApi.sendSdkErrorEvent:(Lcom/gameanalytics/sdk/events/EGASdkErrorCategory;Lcom/gameanalytics/sdk/events/EGASdkErrorArea;Lcom/gameanalytics/sdk/events/EGASdkErrorAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   527: aload           5
        //   529: areturn        
        //   530: aload_2        
        //   531: getstatic       com/gameanalytics/sdk/http/EGAHTTPApiResponse.BadRequest:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   534: if_acmpne       557
        //   537: new             Ljava/lang/StringBuilder;
        //   540: dup            
        //   541: ldc_w           "Failed Events Call. Bad request. Response: "
        //   544: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   547: aload_3        
        //   548: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   551: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   554: invokestatic    com/gameanalytics/sdk/logging/GALogger.d:(Ljava/lang/String;)V
        //   557: aload           5
        //   559: aload_1        
        //   560: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.json:Lorg/json/JSONObject;
        //   563: aload           5
        //   565: aload_2        
        //   566: putfield        com/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair.response:Lcom/gameanalytics/sdk/http/EGAHTTPApiResponse;
        //   569: aload           5
        //   571: areturn        
        //   572: astore_2       
        //   573: goto            270
        //   576: astore_1       
        //   577: aload_2        
        //   578: astore_1       
        //   579: goto            264
        //    Signature:
        //  (Ljava/util/ArrayList<Lorg/json/JSONObject;>;)Lcom/gameanalytics/sdk/http/GAHTTPApi$GAHTTPApiResponseJSONObjectPair;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  128    153    267    270    Ljava/io/IOException;
        //  128    153    261    264    Ljava/lang/Exception;
        //  155    164    572    576    Ljava/io/IOException;
        //  155    164    576    582    Ljava/lang/Exception;
        //  166    171    572    576    Ljava/io/IOException;
        //  166    171    576    582    Ljava/lang/Exception;
        //  173    178    572    576    Ljava/io/IOException;
        //  173    178    576    582    Ljava/lang/Exception;
        //  180    189    572    576    Ljava/io/IOException;
        //  180    189    576    582    Ljava/lang/Exception;
        //  191    198    572    576    Ljava/io/IOException;
        //  191    198    576    582    Ljava/lang/Exception;
        //  200    205    572    576    Ljava/io/IOException;
        //  200    205    576    582    Ljava/lang/Exception;
        //  207    212    572    576    Ljava/io/IOException;
        //  207    212    576    582    Ljava/lang/Exception;
        //  214    221    572    576    Ljava/io/IOException;
        //  214    221    576    582    Ljava/lang/Exception;
        //  228    236    572    576    Ljava/io/IOException;
        //  228    236    576    582    Ljava/lang/Exception;
        //  241    246    572    576    Ljava/io/IOException;
        //  241    246    576    582    Ljava/lang/Exception;
        //  248    255    572    576    Ljava/io/IOException;
        //  248    255    576    582    Ljava/lang/Exception;
        //  272    277    576    582    Ljava/io/IOException;
        //  272    277    576    582    Ljava/lang/Exception;
        //  279    284    576    582    Ljava/io/IOException;
        //  279    284    576    582    Ljava/lang/Exception;
        //  286    295    576    582    Ljava/io/IOException;
        //  286    295    576    582    Ljava/lang/Exception;
        //  297    304    576    582    Ljava/io/IOException;
        //  297    304    576    582    Ljava/lang/Exception;
        //  306    311    576    582    Ljava/io/IOException;
        //  306    311    576    582    Ljava/lang/Exception;
        //  313    318    576    582    Ljava/io/IOException;
        //  313    318    576    582    Ljava/lang/Exception;
        //  320    327    576    582    Ljava/io/IOException;
        //  320    327    576    582    Ljava/lang/Exception;
        //  334    342    576    582    Ljava/io/IOException;
        //  334    342    576    582    Ljava/lang/Exception;
        //  347    352    576    582    Ljava/io/IOException;
        //  347    352    576    582    Ljava/lang/Exception;
        //  354    361    576    582    Ljava/io/IOException;
        //  354    361    576    582    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0212:
        //     at w5.m.a(SourceFile:20)
        //     at w5.f.o(SourceFile:122)
        //     at w5.f.r(SourceFile:571)
        //     at w5.f.q(SourceFile:3)
        //     at a6.j.j(SourceFile:32)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1154)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:652)
        //     at java.lang.Thread.run(Thread.java:1563)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void sendSdkErrorEvent(final EGASdkErrorCategory egaSdkErrorCategory, final EGASdkErrorArea egaSdkErrorArea, final EGASdkErrorAction egaSdkErrorAction, final EGASdkErrorParameter egaSdkErrorParameter, final String s, final String s2, final String s3) {
        this.sendSdkErrorEventInternal(egaSdkErrorCategory, egaSdkErrorArea, egaSdkErrorAction, egaSdkErrorParameter, s, s2, s3);
    }
    
    public void sendSdkErrorEvent(final EGASdkErrorCategory egaSdkErrorCategory, final EGASdkErrorArea egaSdkErrorArea, final EGASdkErrorAction egaSdkErrorAction, final String s, final String s2, final String s3) {
        this.sendSdkErrorEventInternal(egaSdkErrorCategory, egaSdkErrorArea, egaSdkErrorAction, EGASdkErrorParameter.Undefined, s, s2, s3);
    }
    
    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
        GALogger.d("New base URL: " + this.baseUrl);
    }
    
    public class GAHTTPApiResponseJSONObjectPair
    {
        public JSONObject json;
        public EGAHTTPApiResponse response;
        final GAHTTPApi this$0;
        
        public GAHTTPApiResponseJSONObjectPair(final GAHTTPApi this$0) {
            this.this$0 = this$0;
        }
    }
    
    private static class SdkErrorEventCounter
    {
        public int count;
        public long timestamp;
        
        SdkErrorEventCounter(final long timestamp) {
            this.timestamp = timestamp;
            this.count = 0;
        }
    }
}
