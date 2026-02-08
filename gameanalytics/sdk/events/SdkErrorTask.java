package com.gameanalytics.sdk.events;

import android.text.TextUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.gameanalytics.sdk.logging.GALogger;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.utilities.GAUtilities;
import java.util.Date;
import java.util.HashMap;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;

public class SdkErrorTask implements Callable<HttpURLConnection>
{
    private static final int MAX_COUNT = 10;
    private static HashMap<String, Integer> countMap;
    private static HashMap<String, Date> timestampMap;
    protected String body;
    protected String hashHmac;
    protected byte[] payloadData;
    protected String type;
    protected String url;
    
    static {
        SdkErrorTask.countMap = (HashMap<String, Integer>)new HashMap();
        SdkErrorTask.timestampMap = (HashMap<String, Date>)new HashMap();
    }
    
    public SdkErrorTask(final String url, final String type, final byte[] payloadData, final String s) {
        this.body = "";
        this.url = url;
        this.type = type;
        this.payloadData = payloadData;
        this.hashHmac = GAUtilities.hmac(s, payloadData);
    }
    
    public HttpURLConnection call() {
        final boolean eventSubmissionEnabled = GAState.isEventSubmissionEnabled();
        final HttpURLConnection httpURLConnection = null;
        Object line = null;
        if (!eventSubmissionEnabled) {
            return null;
        }
        final Date date = new Date();
        if (!SdkErrorTask.timestampMap.containsKey((Object)this.type)) {
            SdkErrorTask.timestampMap.put((Object)this.type, (Object)date);
        }
        if (!SdkErrorTask.countMap.containsKey((Object)this.type)) {
            SdkErrorTask.countMap.put((Object)this.type, (Object)0);
        }
        if (TimeUnit.MILLISECONDS.toMinutes(date.getTime() - ((Date)SdkErrorTask.timestampMap.get((Object)this.type)).getTime()) >= 60L) {
            SdkErrorTask.countMap.put((Object)this.type, (Object)0);
            SdkErrorTask.timestampMap.put((Object)this.type, (Object)date);
        }
        if ((int)SdkErrorTask.countMap.get((Object)this.type) >= 10) {
            return null;
        }
        Object o = httpURLConnection;
        while (true) {
            try {
                try {
                    o = httpURLConnection;
                    final URL url = new URL(this.url);
                    o = httpURLConnection;
                    final Object o2 = url.openConnection();
                    Label_0534: {
                        Label_0417: {
                            try {
                                ((HttpURLConnection)o2).setDoOutput(true);
                                ((HttpURLConnection)o2).setDoInput(true);
                                ((HttpURLConnection)o2).setRequestMethod("POST");
                                ((HttpURLConnection)o2).setRequestProperty("Content-Length", String.valueOf(this.payloadData.length));
                                ((HttpURLConnection)o2).setRequestProperty("Authorization", this.hashHmac);
                                ((HttpURLConnection)o2).setRequestProperty("Content-Type", "application/json");
                                GALogger.d("sdk error request url : " + this.url);
                                GALogger.d("sdk error request Authorization : " + this.hashHmac);
                                ((HttpURLConnection)o2).getOutputStream().write(this.payloadData);
                                line = new InputStreamReader(((HttpURLConnection)o2).getInputStream());
                                o = new BufferedReader((Reader)line);
                                final StringBuffer sb = new StringBuffer();
                                while (true) {
                                    line = ((BufferedReader)o).readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    sb.append((String)line);
                                }
                                ((BufferedReader)o).close();
                                this.body = sb.toString();
                            }
                            catch (final Exception o) {}
                            catch (final IOException o) {
                                break Label_0417;
                            }
                            break Label_0534;
                        }
                        o = o2;
                        line = new(java.io.BufferedReader.class)();
                        o = o2;
                        o = o2;
                        final InputStreamReader inputStreamReader = new InputStreamReader(((HttpURLConnection)o2).getErrorStream());
                        o = o2;
                        new BufferedReader((Reader)inputStreamReader);
                        o = o2;
                        o = o2;
                        final StringBuffer sb2 = new StringBuffer();
                        while (true) {
                            o = o2;
                            final String line2 = ((BufferedReader)line).readLine();
                            if (line2 == null) {
                                break;
                            }
                            o = o2;
                            sb2.append(line2);
                        }
                        o = o2;
                        ((BufferedReader)line).close();
                        o = o2;
                        this.body = sb2.toString();
                    }
                    GALogger.d("sdk error request content : " + this.body);
                    return (HttpURLConnection)o2;
                }
                catch (final IOException ex) {
                    final Object o2 = line;
                }
            }
            catch (final Exception | IOException ex2) {
                final Object o2 = o;
                continue;
            }
            break;
        }
    }
    
    protected void onPostExecute(final HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
    Label_0020_Outer:
        while (true) {
            int responseCode;
            try {
                responseCode = httpURLConnection.getResponseCode();
                final HttpURLConnection httpURLConnection2 = httpURLConnection;
                final String s = httpURLConnection2.getResponseMessage();
                break Label_0023;
            }
            catch (final IOException ex) {
                responseCode = 0;
            }
            while (true) {
                try {
                    final HttpURLConnection httpURLConnection2 = httpURLConnection;
                    String s = httpURLConnection2.getResponseMessage();
                    if (TextUtils.isEmpty((CharSequence)this.body)) {
                        GALogger.d("sdk error failed. Might be no connection. Description: " + s + ", Status code: " + responseCode);
                        return;
                    }
                    if (responseCode != 200) {
                        GALogger.d("sdk error failed. response code not 200. status code: " + responseCode + ", description: " + s + ", body: " + this.body);
                        return;
                    }
                    final HashMap<String, Integer> countMap = SdkErrorTask.countMap;
                    final String type = this.type;
                    countMap.put((Object)type, (Object)((int)countMap.get((Object)type) + 1));
                    return;
                    s = "";
                    continue Label_0020_Outer;
                }
                catch (final IOException ex2) {
                    continue;
                }
                break;
            }
            break;
        }
    }
}
