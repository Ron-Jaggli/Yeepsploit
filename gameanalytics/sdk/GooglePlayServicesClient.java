package com.gameanalytics.sdk;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.content.ComponentName;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.io.IOException;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.Looper;
import android.content.Context;

public class GooglePlayServicesClient
{
    public static GooglePlayServicesInfo getGooglePlayServicesInfo(final Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        final GooglePlayServicesConnection googlePlayServicesConnection = new GooglePlayServicesConnection();
        final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, (ServiceConnection)googlePlayServicesConnection, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                final GooglePlayServicesInterface googlePlayServicesInterface = new GooglePlayServicesInterface(googlePlayServicesConnection.getBinder());
                final GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(googlePlayServicesInterface.getGpsAdid(), googlePlayServicesInterface.getTrackingEnabled(true));
                context.unbindService((ServiceConnection)googlePlayServicesConnection);
                return googlePlayServicesInfo;
            }
            finally {}
        }
        catch (final Exception ex) {
            throw ex;
        }
        context.unbindService((ServiceConnection)googlePlayServicesConnection);
    }
    
    private static final class GooglePlayServicesConnection implements ServiceConnection
    {
        private final LinkedBlockingQueue<IBinder> queue;
        boolean retrieved;
        
        private GooglePlayServicesConnection() {
            this.retrieved = false;
            this.queue = (LinkedBlockingQueue<IBinder>)new LinkedBlockingQueue(1);
        }
        
        public IBinder getBinder() throws InterruptedException {
            if (!this.retrieved) {
                this.retrieved = true;
                return (IBinder)this.queue.take();
            }
            throw new IllegalStateException();
        }
        
        public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            try {
                this.queue.put((Object)binder);
            }
            catch (final InterruptedException ex) {}
        }
        
        public void onServiceDisconnected(final ComponentName componentName) {
        }
    }
    
    public static final class GooglePlayServicesInfo
    {
        private final String gpsAdid;
        private final Boolean limitAdTrackingEnabled;
        
        GooglePlayServicesInfo(final String gpsAdid, final Boolean limitAdTrackingEnabled) {
            this.gpsAdid = gpsAdid;
            this.limitAdTrackingEnabled = limitAdTrackingEnabled;
        }
        
        public String getGpsAdid() {
            return this.gpsAdid;
        }
        
        public Boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }
    
    private static final class GooglePlayServicesInterface implements IInterface
    {
        private IBinder binder;
        
        public GooglePlayServicesInterface(final IBinder binder) {
            this.binder = binder;
        }
        
        public IBinder asBinder() {
            return this.binder;
        }
        
        public String getGpsAdid() throws RemoteException {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        
        public Boolean getTrackingEnabled(final boolean b) throws RemoteException {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean b2 = true;
                obtain.writeInt((int)(b ? 1 : 0));
                this.binder.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    b2 = false;
                }
                Boolean value = b2;
                obtain2.recycle();
                obtain.recycle();
                if (value == null) {
                    value = null;
                }
                return value;
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
