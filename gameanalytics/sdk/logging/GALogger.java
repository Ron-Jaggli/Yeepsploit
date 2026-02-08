package com.gameanalytics.sdk.logging;

import android.util.Log;

public class GALogger
{
    private static final GALogger INSTANCE;
    private static final String TAG = "GameAnalytics";
    private boolean debugEnabled;
    private boolean infoLogAdvancedEnabled;
    private boolean infoLogEnabled;
    
    static {
        INSTANCE = new GALogger();
    }
    
    private GALogger() {
    }
    
    public static void d(String string) {
        if (!getInstance().debugEnabled) {
            return;
        }
        string = "Debug/GameAnalytics: " + string;
        getInstance().sendNotificationMessage(string, EGALoggerMessageType.Debug);
    }
    
    public static void e(String string) {
        string = "Error/GameAnalytics: " + string;
        getInstance().sendNotificationMessage(string, EGALoggerMessageType.Error);
    }
    
    public static boolean getAdvancedInfoLog() {
        return getInstance().infoLogAdvancedEnabled;
    }
    
    public static boolean getInfoLog() {
        return getInstance().infoLogEnabled;
    }
    
    private static GALogger getInstance() {
        return GALogger.INSTANCE;
    }
    
    public static void i(String string) {
        if (!getInstance().infoLogEnabled) {
            return;
        }
        string = "Info/GameAnalytics: " + string;
        getInstance().sendNotificationMessage(string, EGALoggerMessageType.Info);
    }
    
    public static void ii(String string) {
        if (!getInstance().infoLogAdvancedEnabled) {
            return;
        }
        string = "Verbose/GameAnalytics: " + string;
        getInstance().sendNotificationMessage(string, EGALoggerMessageType.Info);
    }
    
    public static void setAdvancedInfoLog(final boolean infoLogAdvancedEnabled) {
        getInstance().infoLogAdvancedEnabled = infoLogAdvancedEnabled;
    }
    
    public static void setInfoLog(final boolean infoLogEnabled) {
        getInstance().infoLogEnabled = infoLogEnabled;
    }
    
    public static void w(String string) {
        string = "Warning/GameAnalytics: " + string;
        getInstance().sendNotificationMessage(string, EGALoggerMessageType.Warning);
    }
    
    public void sendNotificationMessage(final String s, final EGALoggerMessageType egaLoggerMessageType) {
        final int n = GALogger$1.$SwitchMap$com$gameanalytics$sdk$logging$EGALoggerMessageType[egaLoggerMessageType.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        Log.i("GameAnalytics", s);
                    }
                }
                else {
                    Log.d("GameAnalytics", s);
                }
            }
            else {
                Log.w("GameAnalytics", s);
            }
        }
        else {
            Log.e("GameAnalytics", s);
        }
    }
}
