package com.gameanalytics.sdk.utilities;

import com.gameanalytics.sdk.logging.GALogger;
import java.util.HashMap;

public class Stopwatch
{
    private static HashMap<String, Stopwatch> timers;
    private boolean isRunning;
    private long startTimestamp;
    private long totalTime;
    
    static {
        Stopwatch.timers = (HashMap<String, Stopwatch>)new HashMap();
    }
    
    public Stopwatch() {
        this.totalTime = 0L;
        this.isRunning = false;
        this.start();
    }
    
    public static String getTimeString(final long n) {
        String s;
        if (n < 10000L) {
            s = n + " ms";
        }
        else {
            s = n / 1000.0 + " s";
        }
        return s;
    }
    
    public static void pauseTimer(final String s) {
        if (Stopwatch.timers.containsKey((Object)s)) {
            ((Stopwatch)Stopwatch.timers.get((Object)s)).pause();
        }
        else {
            GALogger.w("pauseTimer: no value found for key=" + s);
        }
    }
    
    public static void resumeTimer(final String s) {
        if (Stopwatch.timers.containsKey((Object)s)) {
            ((Stopwatch)Stopwatch.timers.get((Object)s)).resume();
        }
        else {
            GALogger.w("resumeTimer: no value found for key=" + s);
        }
    }
    
    public static void startTimer(final String s) {
        if (Stopwatch.timers.containsKey((Object)s)) {
            GALogger.w("startTimer: overriding old value for key=" + s);
        }
        Stopwatch.timers.put((Object)s, (Object)new Stopwatch());
    }
    
    public static long stopTimer(final String s) {
        long stop;
        if (Stopwatch.timers.containsKey((Object)s)) {
            stop = ((Stopwatch)Stopwatch.timers.get((Object)s)).stop();
        }
        else {
            GALogger.w("stopTimer: no value found for key=" + s);
            stop = 0L;
        }
        return stop;
    }
    
    private void updateTotalTime() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long startTimestamp = this.startTimestamp;
        this.startTimestamp = currentTimeMillis;
        this.totalTime += currentTimeMillis - startTimestamp;
    }
    
    public long getTime() {
        this.updateTotalTime();
        return this.totalTime;
    }
    
    public String getTimeString() {
        return getTimeString(this.getTime());
    }
    
    public void pause() {
        if (this.isRunning) {
            this.updateTotalTime();
            this.isRunning = false;
        }
    }
    
    public void reset() {
        this.totalTime = 0L;
        this.startTimestamp = System.currentTimeMillis();
    }
    
    public void resume() {
        this.start();
    }
    
    public long split() {
        if (this.isRunning) {
            this.updateTotalTime();
        }
        return this.totalTime;
    }
    
    public void start() {
        if (this.isRunning) {
            return;
        }
        this.startTimestamp = System.currentTimeMillis();
        this.isRunning = true;
    }
    
    public long stop() {
        if (this.isRunning) {
            this.updateTotalTime();
            this.isRunning = false;
        }
        return this.totalTime;
    }
}
