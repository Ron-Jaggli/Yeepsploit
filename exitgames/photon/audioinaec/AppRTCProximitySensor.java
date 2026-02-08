package com.exitgames.photon.audioinaec;

import android.hardware.SensorEvent;
import android.util.Log;
import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

public class AppRTCProximitySensor implements SensorEventListener
{
    private static final String TAG = "[PV] [AI] AppRTCProximitySensor";
    private boolean lastStateReportIsNear;
    private final Runnable onSensorStateListener;
    private Sensor proximitySensor;
    private final SensorManager sensorManager;
    private final ThreadUtils.ThreadChecker threadChecker;
    
    private AppRTCProximitySensor(final Context context, final Runnable onSensorStateListener) {
        this.threadChecker = new ThreadUtils.ThreadChecker();
        Log.d("[PV] [AI] AppRTCProximitySensor", "AppRTCProximitySensor" + AppRTCUtils.getThreadInfo());
        this.onSensorStateListener = onSensorStateListener;
        this.sensorManager = (SensorManager)context.getSystemService("sensor");
    }
    
    static AppRTCProximitySensor create(final Context context, final Runnable runnable) {
        return new AppRTCProximitySensor(context, runnable);
    }
    
    private boolean initDefaultSensor() {
        if (this.proximitySensor != null) {
            return true;
        }
        if ((this.proximitySensor = this.sensorManager.getDefaultSensor(8)) == null) {
            return false;
        }
        this.logProximitySensorInfo();
        return true;
    }
    
    private void logProximitySensorInfo() {
        if (this.proximitySensor == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Proximity sensor: name=");
        sb.append(this.proximitySensor.getName());
        sb.append(", vendor: ").append(this.proximitySensor.getVendor());
        sb.append(", power: ").append(this.proximitySensor.getPower());
        sb.append(", resolution: ").append(this.proximitySensor.getResolution());
        sb.append(", max range: ").append(this.proximitySensor.getMaximumRange());
        sb.append(", min delay: ").append(this.proximitySensor.getMinDelay());
        Log.d("[PV] [AI] AppRTCProximitySensor", sb.toString());
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
        this.threadChecker.checkIsOnValidThread();
        AppRTCUtils.assertIsTrue(sensor.getType() == 8);
        if (n == 0) {
            Log.e("[PV] [AI] AppRTCProximitySensor", "The values returned by this sensor cannot be trusted");
        }
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        this.threadChecker.checkIsOnValidThread();
        AppRTCUtils.assertIsTrue(sensorEvent.sensor.getType() == 8);
        if (sensorEvent.values[0] < this.proximitySensor.getMaximumRange()) {
            Log.d("[PV] [AI] AppRTCProximitySensor", "Proximity sensor => NEAR state");
            this.lastStateReportIsNear = true;
        }
        else {
            Log.d("[PV] [AI] AppRTCProximitySensor", "Proximity sensor => FAR state");
            this.lastStateReportIsNear = false;
        }
        final Runnable onSensorStateListener = this.onSensorStateListener;
        if (onSensorStateListener != null) {
            onSensorStateListener.run();
        }
        Log.d("[PV] [AI] AppRTCProximitySensor", "onSensorChanged" + AppRTCUtils.getThreadInfo() + ": accuracy=" + sensorEvent.accuracy + ", timestamp=" + sensorEvent.timestamp + ", distance=" + sensorEvent.values[0]);
    }
    
    public boolean sensorReportsNearState() {
        this.threadChecker.checkIsOnValidThread();
        return this.lastStateReportIsNear;
    }
    
    public boolean start() {
        this.threadChecker.checkIsOnValidThread();
        Log.d("[PV] [AI] AppRTCProximitySensor", "start" + AppRTCUtils.getThreadInfo());
        if (!this.initDefaultSensor()) {
            return false;
        }
        this.sensorManager.registerListener((SensorEventListener)this, this.proximitySensor, 3);
        return true;
    }
    
    public void stop() {
        this.threadChecker.checkIsOnValidThread();
        Log.d("[PV] [AI] AppRTCProximitySensor", "stop" + AppRTCUtils.getThreadInfo());
        final Sensor proximitySensor = this.proximitySensor;
        if (proximitySensor == null) {
            return;
        }
        this.sensorManager.unregisterListener((SensorEventListener)this, proximitySensor);
    }
}
