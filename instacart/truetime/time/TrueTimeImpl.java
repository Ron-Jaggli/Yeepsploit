package com.instacart.truetime.time;

import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import java.util.Date;
import com.instacart.truetime.SntpEventListener;
import java.net.UnknownHostException;
import java.net.Inet6Address;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.collections.CollectionsKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.net.InetAddress;
import kotlin.coroutines.Continuation;
import com.instacart.truetime.NoOpEventListener;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import com.instacart.truetime.TimeKeeperListener;
import com.instacart.truetime.sntp.SntpImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import com.instacart.truetime.sntp.Sntp;
import kotlinx.coroutines.CoroutineScope;
import com.instacart.truetime.TrueTimeEventListener;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002J\u0012\u0010$\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00120\u001dH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%" }, d2 = { "Lcom/instacart/truetime/time/TrueTimeImpl;", "Lcom/instacart/truetime/time/TrueTime;", "params", "Lcom/instacart/truetime/time/TrueTimeParameters;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "listener", "Lcom/instacart/truetime/TrueTimeEventListener;", "(Lcom/instacart/truetime/time/TrueTimeParameters;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/instacart/truetime/TrueTimeEventListener;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sntp", "Lcom/instacart/truetime/sntp/Sntp;", "timeKeeper", "Lcom/instacart/truetime/time/TimeKeeper;", "hasTheTime", "", "initialize", "", "(Lcom/instacart/truetime/time/TrueTimeParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "Ljava/util/Date;", "nowSafely", "nowTrueOnly", "requestTime", "with", "ipHostAddress", "Ljava/net/InetAddress;", "resolveNtpHostToIPs", "", "ntpHostAddress", "", "sntpRequest", "sync", "Lkotlinx/coroutines/Job;", "filterLeastRoundTripDelay", "filterMedianClockOffset", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public final class TrueTimeImpl implements TrueTime
{
    private final TrueTimeEventListener listener;
    private final TrueTimeParameters params;
    private final CoroutineScope scope;
    private final Sntp sntp;
    private final TimeKeeper timeKeeper;
    
    public TrueTimeImpl() {
        this(null, null, null, 7, null);
    }
    
    public TrueTimeImpl(final TrueTimeParameters params, final CoroutineDispatcher coroutineDispatcher, final TrueTimeEventListener listener) {
        Intrinsics.checkNotNullParameter((Object)params, "params");
        Intrinsics.checkNotNullParameter((Object)coroutineDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter((Object)listener, "listener");
        this.params = params;
        this.listener = listener;
        final Sntp sntp = new SntpImpl();
        this.sntp = sntp;
        this.timeKeeper = new TimeKeeper(sntp, listener);
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job)null, 1, (Object)null).plus((CoroutineContext)coroutineDispatcher).plus((CoroutineContext)new TrueTimeImpl$special$$inlined$CoroutineExceptionHandler.TrueTimeImpl$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this)));
    }
    
    private final long[] filterLeastRoundTripDelay(final List<long[]> list) {
        final Iterator iterator = ((Iterable)list).iterator();
        Object next;
        if (!iterator.hasNext()) {
            next = null;
        }
        else {
            next = iterator.next();
            if (iterator.hasNext()) {
                long roundTripDelay = this.sntp.roundTripDelay((long[])next);
                long[] array = (long[])next;
                do {
                    final Object next2 = iterator.next();
                    final long roundTripDelay2 = this.sntp.roundTripDelay((long[])next2);
                    next = array;
                    long n = roundTripDelay;
                    if (roundTripDelay > roundTripDelay2) {
                        next = next2;
                        n = roundTripDelay2;
                    }
                    array = (long[])next;
                    roundTripDelay = n;
                } while (iterator.hasNext());
            }
        }
        final long[] array2 = (long[])next;
        if (array2 != null) {
            return array2;
        }
        throw new IllegalStateException("Could not find any results from requestingTime");
    }
    
    private final long[] filterMedianClockOffset(final List<long[]> list) {
        final List sortedWith = CollectionsKt.sortedWith((Iterable)list, (Comparator)new TrueTimeImpl$filterMedianClockOffset$$inlined$sortedBy.TrueTimeImpl$filterMedianClockOffset$$inlined$sortedBy$1(this));
        return (long[])sortedWith.get(sortedWith.size() / 2);
    }
    
    private final Object initialize(final TrueTimeParameters trueTimeParameters, final Continuation<? super long[]> continuation) {
        Object o = null;
        Label_0053: {
            if (continuation instanceof TrueTimeImpl$initialize.TrueTimeImpl$initialize$1) {
                final TrueTimeImpl$initialize.TrueTimeImpl$initialize$1 trueTimeImpl$initialize$1 = (TrueTimeImpl$initialize.TrueTimeImpl$initialize$1)continuation;
                if ((trueTimeImpl$initialize$1.label & Integer.MIN_VALUE) != 0x0) {
                    trueTimeImpl$initialize$1.label += Integer.MIN_VALUE;
                    o = trueTimeImpl$initialize$1;
                    break Label_0053;
                }
            }
            o = new TrueTimeImpl$initialize.TrueTimeImpl$initialize$1(this, (Continuation)continuation);
        }
        final Object result = ((TrueTimeImpl$initialize.TrueTimeImpl$initialize$1)o).result;
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        final int label = ((TrueTimeImpl$initialize.TrueTimeImpl$initialize$1)o).label;
        TrueTimeImpl trueTimeImpl = null;
        long[] filterMedianClockOffset = null;
        Label_0385: {
            Object o2;
            if (label != 0) {
                if (label != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                trueTimeImpl = (TrueTimeImpl)((TrueTimeImpl$initialize.TrueTimeImpl$initialize$1)o).L$0;
                ResultKt.throwOnFailure(result);
                o2 = result;
            }
            else {
                ResultKt.throwOnFailure(result);
                this.listener.initialize(trueTimeParameters);
                final List<InetAddress> resolveNtpHostToIPs = this.resolveNtpHostToIPs((String)CollectionsKt.first((List)trueTimeParameters.getNtpHostPool()));
                if (this.params.getStrictNtpMode()) {
                    final Iterable iterable = (Iterable)resolveNtpHostToIPs;
                    final Collection collection = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (final InetAddress inetAddress : iterable) {
                        final Iterable iterable2 = (Iterable)new IntRange(1, 5);
                        final Collection collection2 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        final Iterator iterator2 = iterable2.iterator();
                        while (iterator2.hasNext()) {
                            ((IntIterator)iterator2).nextInt();
                            collection2.add((Object)this.requestTime(trueTimeParameters, inetAddress));
                        }
                        collection.add((Object)this.filterLeastRoundTripDelay((List<long[]>)CollectionsKt.toList((Iterable)collection2)));
                    }
                    filterMedianClockOffset = this.filterMedianClockOffset((List<long[]>)CollectionsKt.take((Iterable)collection, 5));
                    trueTimeImpl = this;
                    break Label_0385;
                }
                final Function2 function2 = (Function2)new TrueTimeImpl$initialize$ntpResult.TrueTimeImpl$initialize$ntpResult$2((List)resolveNtpHostToIPs, this, trueTimeParameters, (Continuation)null);
                ((TrueTimeImpl$initialize.TrueTimeImpl$initialize$1)o).L$0 = this;
                ((TrueTimeImpl$initialize.TrueTimeImpl$initialize$1)o).label = 1;
                final Object coroutineScope = CoroutineScopeKt.coroutineScope(function2, (Continuation)o);
                trueTimeImpl = this;
                if ((o2 = coroutineScope) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            filterMedianClockOffset = (long[])o2;
        }
        trueTimeImpl.listener.initializeSuccess(filterMedianClockOffset);
        trueTimeImpl.timeKeeper.save(filterMedianClockOffset);
        return filterMedianClockOffset;
    }
    
    private final long[] requestTime(final TrueTimeParameters trueTimeParameters, final InetAddress inetAddress) {
        final int retryCountAgainstSingleIp = trueTimeParameters.getRetryCountAgainstSingleIp();
        int i = 0;
        while (i < retryCountAgainstSingleIp - 1) {
            try {
                return this.sntpRequest(trueTimeParameters, inetAddress);
            }
            catch (final Exception ex) {
                this.listener.sntpRequestFailed(ex);
                ++i;
                continue;
            }
            break;
        }
        this.listener.lastSntpRequestAttempt(inetAddress);
        return this.sntpRequest(trueTimeParameters, inetAddress);
    }
    
    private final List<InetAddress> resolveNtpHostToIPs(final String s) throws UnknownHostException {
        final InetAddress[] allByName = InetAddress.getAllByName(s);
        Intrinsics.checkNotNullExpressionValue((Object)allByName, "getAllByName(ntpHostAddress)");
        final List list = ArraysKt.toList((Object[])allByName);
        this.listener.resolvedNtpHostToIPs(s, (List<? extends InetAddress>)list);
        final Iterable iterable = (Iterable)list;
        final Collection collection = (Collection)new ArrayList();
        for (final Object next : iterable) {
            final InetAddress inetAddress = (InetAddress)next;
            if (!this.params.getFilterIpv6Addresses() || !(inetAddress instanceof Inet6Address)) {
                collection.add(next);
            }
        }
        return (List<InetAddress>)collection;
    }
    
    private final long[] sntpRequest(final TrueTimeParameters trueTimeParameters, final InetAddress inetAddress) {
        return this.sntp.requestTime(inetAddress, trueTimeParameters.getRootDelayMax(), trueTimeParameters.getRootDispersionMax(), trueTimeParameters.getServerResponseDelayMaxInMillis(), trueTimeParameters.getConnectionTimeoutInMillis(), this.listener);
    }
    
    @Override
    public boolean hasTheTime() {
        return this.timeKeeper.hasTheTime();
    }
    
    @Override
    public Date now() {
        Date date;
        if (this.params.getReturnSafelyWhenUninitialized()) {
            date = this.nowSafely();
        }
        else {
            date = this.nowTrueOnly();
        }
        return date;
    }
    
    @Override
    public Date nowSafely() {
        Date nowTrueOnly;
        if (this.timeKeeper.hasTheTime()) {
            nowTrueOnly = this.nowTrueOnly();
        }
        else {
            this.listener.returningDeviceTime();
            nowTrueOnly = new Date();
        }
        return nowTrueOnly;
    }
    
    @Override
    public Date nowTrueOnly() {
        if (this.hasTheTime()) {
            return this.timeKeeper.now();
        }
        throw new IllegalStateException("TrueTime was not initialized successfully yet");
    }
    
    @Override
    public Job sync() {
        return BuildersKt.launch$default(this.scope, (CoroutineContext)new CoroutineName("TrueTime-Syncer"), (CoroutineStart)null, (Function2)new TrueTimeImpl$sync.TrueTimeImpl$sync$1(this, (Continuation)null), 2, (Object)null);
    }
}
