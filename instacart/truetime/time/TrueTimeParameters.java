package com.instacart.truetime.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001#Bg\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006$" }, d2 = { "Lcom/instacart/truetime/time/TrueTimeParameters;", "", "connectionTimeoutInMillis", "", "ntpHostPool", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "retryCountAgainstSingleIp", "rootDelayMax", "", "rootDispersionMax", "serverResponseDelayMaxInMillis", "syncIntervalInMillis", "", "returnSafelyWhenUninitialized", "", "filterIpv6Addresses", "strictNtpMode", "(ILjava/util/ArrayList;IFFIJZZZ)V", "getConnectionTimeoutInMillis", "()I", "getFilterIpv6Addresses", "()Z", "getNtpHostPool", "()Ljava/util/ArrayList;", "getRetryCountAgainstSingleIp", "getReturnSafelyWhenUninitialized", "getRootDelayMax", "()F", "getRootDispersionMax", "getServerResponseDelayMaxInMillis", "getStrictNtpMode", "getSyncIntervalInMillis", "()J", "Builder", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public final class TrueTimeParameters
{
    private final int connectionTimeoutInMillis;
    private final boolean filterIpv6Addresses;
    private final ArrayList<String> ntpHostPool;
    private final int retryCountAgainstSingleIp;
    private final boolean returnSafelyWhenUninitialized;
    private final float rootDelayMax;
    private final float rootDispersionMax;
    private final int serverResponseDelayMaxInMillis;
    private final boolean strictNtpMode;
    private final long syncIntervalInMillis;
    
    private TrueTimeParameters(final int connectionTimeoutInMillis, final ArrayList<String> ntpHostPool, final int retryCountAgainstSingleIp, final float rootDelayMax, final float rootDispersionMax, final int serverResponseDelayMaxInMillis, final long syncIntervalInMillis, final boolean returnSafelyWhenUninitialized, final boolean filterIpv6Addresses, final boolean strictNtpMode) {
        this.connectionTimeoutInMillis = connectionTimeoutInMillis;
        this.ntpHostPool = ntpHostPool;
        this.retryCountAgainstSingleIp = retryCountAgainstSingleIp;
        this.rootDelayMax = rootDelayMax;
        this.rootDispersionMax = rootDispersionMax;
        this.serverResponseDelayMaxInMillis = serverResponseDelayMaxInMillis;
        this.syncIntervalInMillis = syncIntervalInMillis;
        this.returnSafelyWhenUninitialized = returnSafelyWhenUninitialized;
        this.filterIpv6Addresses = filterIpv6Addresses;
        this.strictNtpMode = strictNtpMode;
    }
    
    public final int getConnectionTimeoutInMillis() {
        return this.connectionTimeoutInMillis;
    }
    
    public final boolean getFilterIpv6Addresses() {
        return this.filterIpv6Addresses;
    }
    
    public final ArrayList<String> getNtpHostPool() {
        return this.ntpHostPool;
    }
    
    public final int getRetryCountAgainstSingleIp() {
        return this.retryCountAgainstSingleIp;
    }
    
    public final boolean getReturnSafelyWhenUninitialized() {
        return this.returnSafelyWhenUninitialized;
    }
    
    public final float getRootDelayMax() {
        return this.rootDelayMax;
    }
    
    public final float getRootDispersionMax() {
        return this.rootDispersionMax;
    }
    
    public final int getServerResponseDelayMaxInMillis() {
        return this.serverResponseDelayMaxInMillis;
    }
    
    public final boolean getStrictNtpMode() {
        return this.strictNtpMode;
    }
    
    public final long getSyncIntervalInMillis() {
        return this.syncIntervalInMillis;
    }
    
    @Metadata(d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00002\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017" }, d2 = { "Lcom/instacart/truetime/time/TrueTimeParameters$Builder;", "", "()V", "connectionTimeoutInMillis", "", "filterIpv6Addresses", "", "ntpHostPool", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "retryCountAgainstSingleIp", "returnSafelyWhenUninitialized", "rootDelayMax", "", "rootDispersionMax", "serverResponseDelayMaxInMillis", "strictNtpMode", "syncIntervalInMillis", "", "buildParams", "Lcom/instacart/truetime/time/TrueTimeParameters;", "value", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
    public static final class Builder
    {
        private int connectionTimeoutInMillis;
        private boolean filterIpv6Addresses;
        private ArrayList<String> ntpHostPool;
        private int retryCountAgainstSingleIp;
        private boolean returnSafelyWhenUninitialized;
        private float rootDelayMax;
        private float rootDispersionMax;
        private int serverResponseDelayMaxInMillis;
        private boolean strictNtpMode;
        private long syncIntervalInMillis;
        
        public Builder() {
            this.connectionTimeoutInMillis = 30000;
            this.ntpHostPool = (ArrayList<String>)CollectionsKt.arrayListOf((Object[])new String[] { "time.google.com" });
            this.retryCountAgainstSingleIp = 50;
            this.rootDelayMax = 100.0f;
            this.rootDispersionMax = 100.0f;
            this.serverResponseDelayMaxInMillis = 750;
            this.syncIntervalInMillis = 3600000L;
            this.returnSafelyWhenUninitialized = true;
            this.filterIpv6Addresses = true;
            this.strictNtpMode = true;
        }
        
        public final TrueTimeParameters buildParams() {
            return new TrueTimeParameters(this.connectionTimeoutInMillis, this.ntpHostPool, this.retryCountAgainstSingleIp, this.rootDelayMax, this.rootDispersionMax, this.serverResponseDelayMaxInMillis, this.syncIntervalInMillis, this.returnSafelyWhenUninitialized, this.filterIpv6Addresses, this.strictNtpMode, null);
        }
        
        public final Builder connectionTimeoutInMillis(final int connectionTimeoutInMillis) {
            this.connectionTimeoutInMillis = connectionTimeoutInMillis;
            return this;
        }
        
        public final Builder filterIpv6Addresses(final boolean filterIpv6Addresses) {
            this.filterIpv6Addresses = filterIpv6Addresses;
            return this;
        }
        
        public final Builder ntpHostPool(final ArrayList<String> ntpHostPool) {
            Intrinsics.checkNotNullParameter((Object)ntpHostPool, "value");
            this.ntpHostPool = ntpHostPool;
            return this;
        }
        
        public final Builder retryCountAgainstSingleIp(final int retryCountAgainstSingleIp) {
            this.retryCountAgainstSingleIp = retryCountAgainstSingleIp;
            return this;
        }
        
        public final Builder returnSafelyWhenUninitialized(final boolean returnSafelyWhenUninitialized) {
            this.returnSafelyWhenUninitialized = returnSafelyWhenUninitialized;
            return this;
        }
        
        public final Builder rootDelayMax(final float rootDelayMax) {
            this.rootDelayMax = rootDelayMax;
            return this;
        }
        
        public final Builder rootDispersionMax(final float rootDispersionMax) {
            this.rootDispersionMax = rootDispersionMax;
            return this;
        }
        
        public final Builder serverResponseDelayMaxInMillis(final int serverResponseDelayMaxInMillis) {
            this.serverResponseDelayMaxInMillis = serverResponseDelayMaxInMillis;
            return this;
        }
        
        public final Builder strictNtpMode(final boolean strictNtpMode) {
            this.strictNtpMode = strictNtpMode;
            return this;
        }
        
        public final Builder syncIntervalInMillis(final long syncIntervalInMillis) {
            this.syncIntervalInMillis = syncIntervalInMillis;
            return this;
        }
    }
}
