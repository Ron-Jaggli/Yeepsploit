package com.unity3d.player;

import java.lang.reflect.AccessibleObject;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import android.app.ApplicationExitInfo;

class ApplicationExitInfoWrapper extends ApplicationExitInfoBase
{
    private ApplicationExitInfo mApplicationExitInfo;
    
    public ApplicationExitInfoWrapper(final ApplicationExitInfo mApplicationExitInfo) {
        this.mApplicationExitInfo = mApplicationExitInfo;
    }
    
    protected static Object GetStaticFieldByReflection(final Class clazz, final String s, Object value, final boolean b) {
        StringBuilder sb;
        try {
            final Field declaredField = clazz.getDeclaredField(s);
            if (b) {
                ((AccessibleObject)declaredField).setAccessible(true);
            }
            value = declaredField.get((Object)null);
            return value;
        }
        catch (final Exception ex) {
            sb = new StringBuilder("ApplicationExitInfo: GetStaticFieldByReflection exception ");
        }
        catch (final NoSuchFieldException ex) {
            sb = new StringBuilder("ApplicationExitInfo: GetStaticFieldByReflection NoSuchFieldException ");
        }
        final Exception ex;
        D.Log(6, sb.append((Object)ex).toString());
        return value;
    }
    
    private boolean checkSupport() {
        return this.mApplicationExitInfo != null && PlatformSupport.RED_VELVET_CAKE_SUPPORT;
    }
    
    private byte[] readAllBytes(final InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[1024];
        try {
            while (true) {
                final int read = inputStream.read(array, 0, 1024);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        }
        catch (final IOException ex) {
            D.Log(6, "ApplicationExitInfo: readAllBytes exception " + (Object)ex);
            throw ex;
        }
    }
    
    @Override
    public int describeContents() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.describeContents();
        }
        return 0;
    }
    
    @Override
    public int getDefiningUid() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getDefiningUid();
        }
        return 0;
    }
    
    @Override
    public String getDescription() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getDescription();
        }
        return null;
    }
    
    @Override
    public int getImportance() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getImportance();
        }
        return 0;
    }
    
    @Override
    public int getPackageUid() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getPackageUid();
        }
        return 0;
    }
    
    @Override
    public int getPid() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getPid();
        }
        return 0;
    }
    
    @Override
    public String getProcessName() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getProcessName();
        }
        return null;
    }
    
    @Override
    public byte[] getProcessStateSummary() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getProcessStateSummary();
        }
        return new byte[0];
    }
    
    @Override
    public long getPss() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getPss();
        }
        return 0L;
    }
    
    @Override
    public int getRealUid() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getRealUid();
        }
        return 0;
    }
    
    @Override
    public int getReason() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getReason();
        }
        return 0;
    }
    
    @Override
    public long getRss() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getRss();
        }
        return 0L;
    }
    
    @Override
    public int getStatus() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getStatus();
        }
        return 0;
    }
    
    @Override
    public long getTimestamp() {
        if (this.checkSupport()) {
            return this.mApplicationExitInfo.getTimestamp();
        }
        return 0L;
    }
    
    @Override
    public byte[] getTrace() {
        if (this.checkSupport()) {
            try {
                return this.readAllBytes(this.mApplicationExitInfo.getTraceInputStream());
            }
            catch (final IOException ex) {
                D.Log(6, "ApplicationExitInfo: getTrace exception " + (Object)ex);
            }
        }
        return null;
    }
}
