package com.gameanalytics.sdk.utilities;

import java.util.concurrent.TimeUnit;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Timer implements Parcelable
{
    public static final Parcelable$Creator<Timer> CREATOR;
    private long highResTime;
    private long timeInMicros;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<Timer>() {
            public Timer createFromParcel(final Parcel parcel) {
                return new Timer(parcel, null);
            }
            
            public Timer[] newArray(final int n) {
                return new Timer[n];
            }
        };
    }
    
    public Timer() {
        this.timeInMicros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.highResTime = System.nanoTime();
    }
    
    public Timer(final long timeInMicros, final long highResTime) {
        this.timeInMicros = timeInMicros;
        this.highResTime = highResTime;
    }
    
    private Timer(final Parcel parcel) {
        this.timeInMicros = parcel.readLong();
        this.highResTime = parcel.readLong();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long getCurrentTimestampMicros() {
        return this.timeInMicros + this.getDurationMicros();
    }
    
    public long getDurationMicros() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.highResTime);
    }
    
    public long getDurationMicros(final Timer timer) {
        return TimeUnit.NANOSECONDS.toMicros(timer.highResTime - this.highResTime);
    }
    
    public long getHighResTime() {
        return TimeUnit.NANOSECONDS.toMicros(this.highResTime);
    }
    
    public long getMicros() {
        return this.timeInMicros;
    }
    
    public void reset() {
        this.timeInMicros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.highResTime = System.nanoTime();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.timeInMicros);
        parcel.writeLong(this.highResTime);
    }
}
