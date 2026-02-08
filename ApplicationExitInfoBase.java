package com.unity3d.player;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Objects;

abstract class ApplicationExitInfoBase
{
    public abstract int describeContents();
    
    public abstract int getDefiningUid();
    
    public abstract String getDescription();
    
    public abstract int getImportance();
    
    public abstract int getPackageUid();
    
    public abstract int getPid();
    
    public abstract String getProcessName();
    
    public abstract byte[] getProcessStateSummary();
    
    public abstract long getPss();
    
    public abstract int getRealUid();
    
    public abstract int getReason();
    
    public abstract long getRss();
    
    public abstract int getStatus();
    
    public abstract long getTimestamp();
    
    public abstract byte[] getTrace();
    
    @Override
    public int hashCode() {
        return Objects.hashCode((Object)this.getDescription()) + (Objects.hashCode((Object)this.getProcessName()) + (Long.hashCode(this.getTimestamp()) + ((((((((this.getPid() * 31 + this.getRealUid()) * 31 + this.getPackageUid()) * 31 + this.getDefiningUid()) * 31 + this.getReason()) * 31 + this.getImportance()) * 31 + this.getStatus()) * 31 + (int)this.getPss()) * 31 + (int)this.getRss()) * 31) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ApplicationExitInfo [");
        sb.append(this.hashCode()).append("]");
        sb.append(System.lineSeparator()).append("{");
        final long timestamp = this.getTimestamp();
        sb.append(System.lineSeparator()).append("timestamp : ").append(timestamp);
        sb.append(System.lineSeparator()).append("date : ").append(((Format)new SimpleDateFormat("yyyy MM dd HH:mm:ss")).format((Object)timestamp));
        sb.append(System.lineSeparator()).append("pid : ").append(this.getPid());
        sb.append(System.lineSeparator()).append("realUid : ").append(this.getRealUid());
        sb.append(System.lineSeparator()).append("packageUid : ").append(this.getPackageUid());
        sb.append(System.lineSeparator()).append("definingUid : ").append(this.getDefiningUid());
        sb.append(System.lineSeparator()).append("process : ").append(this.getProcessName());
        sb.append(System.lineSeparator()).append("reason : ").append(this.getReason());
        sb.append(System.lineSeparator()).append("status : ").append(this.getStatus());
        sb.append(System.lineSeparator()).append("importance : ").append(this.getImportance());
        sb.append(System.lineSeparator()).append("pss : ").append(this.getPss());
        sb.append(System.lineSeparator()).append("rss : ").append(this.getRss());
        sb.append(System.lineSeparator()).append("description : ").append(this.getDescription());
        final byte[] processStateSummary = this.getProcessStateSummary();
        final StringBuilder append = sb.append(System.lineSeparator()).append("state : ");
        final String s = "empty";
        String string;
        if (processStateSummary != null && processStateSummary.length != 0) {
            string = Integer.toString(processStateSummary.length) + " bytes";
        }
        else {
            string = "empty";
        }
        append.append(string);
        final byte[] trace = this.getTrace();
        final StringBuilder append2 = sb.append(System.lineSeparator()).append("trace : ");
        String string2;
        if (trace == null) {
            string2 = s;
        }
        else {
            string2 = Integer.toString(trace.length) + " bytes";
        }
        append2.append(string2);
        sb.append(System.lineSeparator()).append("}");
        return sb.toString();
    }
}
