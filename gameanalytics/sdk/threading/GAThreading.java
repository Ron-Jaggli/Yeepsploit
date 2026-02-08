package com.gameanalytics.sdk.threading;

import java.util.Date;
import com.gameanalytics.sdk.logging.GALogger;
import java.util.TimerTask;
import java.util.Timer;

public final class GAThreading extends Timer
{
    private static final GAThreading INSTANCE;
    private static final long THREAD_WAIT_TIME_IN_MS = 1000L;
    private final FIFOPriorityQueue<TimedBlock> blocks;
    private TimerTask task;
    
    static {
        INSTANCE = new GAThreading();
    }
    
    private GAThreading() {
        super("GA Thread");
        this.blocks = new FIFOPriorityQueue<TimedBlock>();
        this.task = null;
        this.startInternal();
    }
    
    private void addTimedBlock(final TimedBlock timedBlock) {
        this.blocks.add(timedBlock);
    }
    
    private static TimerTask createTask() {
        return new TimerTask() {
            public void run() {
                try {
                    while (true) {
                        final TimedBlock access$000 = getNextBlock();
                        if (access$000 == null) {
                            break;
                        }
                        access$000.block.execute();
                    }
                }
                catch (final Exception ex) {
                    GALogger.e("Error on GA thread");
                    ex.printStackTrace();
                }
            }
        };
    }
    
    private static GAThreading getInstance() {
        return GAThreading.INSTANCE;
    }
    
    private static TimedBlock getNextBlock() {
        final GAThreading instance = getInstance();
        synchronized (instance) {
            final Date date = new Date();
            if (!getInstance().blocks.isEmpty() && getInstance().blocks.peek().deadLine.compareTo(date) <= 0) {
                return getInstance().blocks.poll();
            }
            return null;
        }
    }
    
    public static void performTaskDelayed(final IBlock block, final long n) {
        final GAThreading instance = getInstance();
        synchronized (instance) {
            final Date date = new Date();
            date.setTime(date.getTime() + n * 1000L);
            getInstance().addTimedBlock(new TimedBlock(date, block));
        }
    }
    
    public static void performTaskOnGAThread(final IBlock block) {
        performTaskDelayed(block, 0L);
    }
    
    public static void scheduleTimer(final double n, final IBlock block) {
        final GAThreading instance = getInstance();
        synchronized (instance) {
            final Date date = new Date();
            date.setTime(date.getTime() + (long)(n * 1000.0));
            getInstance().addTimedBlock(new TimedBlock(date, block));
        }
    }
    
    public static void start() {
        getInstance().startInternal();
    }
    
    private void startInternal() {
        if (this.task == null) {
            GALogger.d("Starting GA Thread");
            synchronized (this) {
                this.scheduleAtFixedRate(this.task = createTask(), 0L, 1000L);
            }
        }
    }
    
    public static void stop() {
        if (getInstance().task != null) {
            GALogger.d("Stopping GA Thread");
            final GAThreading instance = getInstance();
            synchronized (instance) {
                getInstance().task.cancel();
                getInstance().task = null;
            }
        }
    }
}
