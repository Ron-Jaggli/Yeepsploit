package com.gameanalytics.sdk.http;

import java.io.IOException;
import com.gameanalytics.sdk.logging.GALogger;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;

public class SendTestRequest implements Callable<String>
{
    private String body;
    private String contentType;
    
    public SendTestRequest() {
        this.contentType = "application/json";
    }
    
    public String call() {
        while (true) {
            try {
                final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("https://ennu5mo7xan0n.x.pipedream.net").openConnection();
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", this.contentType);
                final byte[] bytes = this.body.getBytes("UTF-8");
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                httpURLConnection.getOutputStream().write(bytes);
                final BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(httpURLConnection.getInputStream()));
                final StringBuffer sb = new StringBuffer();
                while (true) {
                    final String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                bufferedReader.close();
                GALogger.d("Request has been sent");
                return null;
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public void setBody(final String body) {
        this.body = body;
    }
    
    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }
}
