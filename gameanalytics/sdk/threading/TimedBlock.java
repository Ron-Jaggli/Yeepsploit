package com.gameanalytics.sdk.threading;

import java.util.Date;

class TimedBlock implements Comparable<TimedBlock>
{
    public final IBlock block;
    public final Date deadLine;
    
    public TimedBlock(final Date deadLine, final IBlock block) {
        this.deadLine = deadLine;
        this.block = block;
    }
    
    public int compareTo(final TimedBlock timedBlock) {
        return this.deadLine.compareTo(timedBlock.deadLine);
    }
    
    @Override
    public String toString() {
        return "{TimedBlock: deadLine=" + this.deadLine.getTime() + ", block=" + this.block.getName() + "}";
    }
}
