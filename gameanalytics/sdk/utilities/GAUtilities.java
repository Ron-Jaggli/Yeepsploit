package com.gameanalytics.sdk.utilities;

import java.util.regex.Pattern;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.UUID;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.io.UnsupportedEncodingException;
import android.util.Base64;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import android.content.Context;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;

public class GAUtilities
{
    public static final String GAID_PACKAGE_NAME = "com.google.android.gms.ads.identifier";
    public static final String OAID_PACKAGE_NAME = "com.huawei.hms.ads.identifier";
    
    public static JSONArray array(final String s) {
        JSONArray jsonArray;
        try {
            jsonArray = new JSONArray(s);
        }
        catch (final JSONException ex) {
            jsonArray = null;
        }
        return jsonArray;
    }
    
    public static JSONObject dictionary(final String s) {
        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject(s);
        }
        catch (final JSONException ex) {
            jsonObject = null;
        }
        return jsonObject;
    }
    
    public static String getGAID(final Context context) {
        return Reflection.getAdId("com.google.android.gms.ads.identifier", context);
    }
    
    public static String getOAID(final Context context) {
        final String s = null;
        try {
            final String adId = Reflection.getAdId("com.huawei.hms.ads.identifier", context);
            if (isZeroId(adId)) {}
            return adId;
        }
        finally {
            return s;
        }
    }
    
    public static byte[] gzipCompress(String byteArray) throws IOException {
        if (byteArray == null || byteArray.length() == 0) {
            return new byte[0];
        }
        final ByteArrayOutputStream byteArrayOutputStream = null;
        GZIPOutputStream gzipOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        try {
            final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream2) {
                    {
                        this.def.setLevel(9);
                    }
                };
                try {
                    gzipOutputStream.write(byteArray.getBytes("UTF-8"));
                    gzipOutputStream.close();
                    byteArray = (String)(Object)byteArrayOutputStream2.toByteArray();
                    try {
                        byteArrayOutputStream2.close();
                        gzipOutputStream.close();
                    }
                    catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                    return (byte[])(Object)byteArray;
                }
                finally {}
            }
            finally {}
        }
        finally {
            gzipOutputStream2 = null;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
        Label_0115: {
            Label_0100: {
                if (byteArrayOutputStream3 != null) {
                    Label_0111: {
                        try {
                            byteArrayOutputStream3.close();
                        }
                        catch (final IOException ex2) {
                            break Label_0111;
                        }
                        break Label_0100;
                    }
                    final IOException ex2;
                    ex2.printStackTrace();
                    break Label_0115;
                }
            }
            if (gzipOutputStream2 != null) {
                gzipOutputStream2.close();
            }
        }
    }
    
    public static String gzipDecompress(byte[] string) throws Exception {
        GZIPInputStream gzipInputStream2;
        BufferedReader bufferedReader2;
        try {
            final GZIPInputStream gzipInputStream = new GZIPInputStream((InputStream)new ByteArrayInputStream((byte[])string));
            try {
                final BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader((InputStream)gzipInputStream, "UTF-8"));
                string = "";
                try {
                    while (true) {
                        final String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        string = (String)string + line;
                    }
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                        gzipInputStream.close();
                    }
                    catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                    return (String)string;
                }
                finally {}
            }
            finally {}
        }
        finally {
            gzipInputStream2 = null;
            bufferedReader2 = null;
        }
        Label_0129: {
            if (bufferedReader2 != null) {
                Label_0140: {
                    try {
                        bufferedReader2.close();
                    }
                    catch (final IOException ex2) {
                        break Label_0140;
                    }
                    break Label_0129;
                }
                final IOException ex2;
                ex2.printStackTrace();
                return;
            }
        }
        if (gzipInputStream2 != null) {
            gzipInputStream2.close();
        }
    }
    
    public static String hmac(String encodeToString, final byte[] array) {
        try {
            final Mac instance = Mac.getInstance("HmacSHA256");
            instance.init((Key)new SecretKeySpec(encodeToString.getBytes("UTF-8"), "HmacSHA256"));
            encodeToString = Base64.encodeToString(instance.doFinal(array), 0);
            return encodeToString;
        }
        catch (final UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        catch (final InvalidKeyException ex2) {
            ex2.printStackTrace();
        }
        catch (final NoSuchAlgorithmException ex3) {
            ex3.printStackTrace();
        }
        encodeToString = "";
        return encodeToString;
    }
    
    public static Boolean isLimitAdTrackingEnabled(final String s, final Context context) {
        return Reflection.isLimitAdTrackingEnabled(s, context);
    }
    
    public static boolean isZeroId(final String s) {
        final UUID fromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
        while (true) {
            try {
                boolean b;
                if (UUID.fromString(s) == fromString) {
                    b = true;
                }
                else {
                    b = false;
                }
                boolean b3;
                boolean b2 = b3 = (s != null && b);
                if (!b2) {
                    b3 = b2;
                    if (s != null) {
                        int n = 0;
                        while (true) {
                            b3 = b2;
                            if (n >= s.length()) {
                                break;
                            }
                            b2 = (s.charAt(n) == '0');
                            if (!b2) {
                                b3 = b2;
                                break;
                            }
                            ++n;
                        }
                    }
                }
                return b3;
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public static String joinStringArray(final String[] array, final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int length = array.length, i = 0; i < length; ++i) {
            if (i > 0) {
                sb.append(s);
            }
            sb.append(array[i]);
        }
        return sb.toString();
    }
    
    public static String jsonString(final ArrayList<JSONObject> list) {
        String string;
        try {
            final JSONArray jsonArray = new JSONArray();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                jsonArray.put((Object)iterator.next());
            }
            string = jsonArray.toString();
        }
        catch (final Exception ex) {
            string = "";
        }
        return string;
    }
    
    public static boolean stringArrayContainsString(final String[] array, final String s) {
        if (array.length == 0) {
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].equals((Object)s)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean stringMatch(final String s, final String s2) {
        return s != null && s2 != null && Pattern.matches(s2, (CharSequence)s);
    }
    
    public static long timeIntervalSince1970() {
        return System.currentTimeMillis() / 1000L;
    }
}
