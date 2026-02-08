package net.codestage.actk.androidnative;

import java.io.File;
import java.util.Locale;
import android.util.Log;

class FileFilter
{
    private Boolean caseSensitive;
    private Boolean exactFileNameMatch;
    private Boolean exactPathMatch;
    private String filterExtension;
    private String filterFileName;
    private String filterPath;
    private Boolean pathRecursive;
    
    FileFilter(final String s) {
        if (s == null || s.isEmpty()) {
            Log.e(NativeUtils.LogTag, "Can't parse FileFilter: string is null or empty!");
            return;
        }
        final String[] split = s.split("\\|");
        if (split.length < 4) {
            Log.e(NativeUtils.LogTag, "Can't parse FileFilter: string split only to " + split.length + " parts instead of minimum 4 parts!");
            return;
        }
        this.caseSensitive = Boolean.parseBoolean(split[0]);
        this.pathRecursive = Boolean.parseBoolean(split[1]);
        this.exactFileNameMatch = Boolean.parseBoolean(split[2]);
        this.exactPathMatch = Boolean.parseBoolean(split[3]);
        if (split.length >= 5) {
            this.filterPath = split[4];
        }
        if (split.length >= 6) {
            this.filterExtension = split[5];
        }
        if (split.length >= 7) {
            this.filterFileName = split[6];
        }
    }
    
    private static boolean PathMatch(final String s, final String s2, final boolean b, final boolean b2) {
        if (b) {
            if (b2 && !NativeUtils.ContainsIgnoreCase(s, s2)) {
                return false;
            }
            if (!s.contains((CharSequence)s2)) {
                return false;
            }
        }
        else {
            int n;
            if (b2) {
                n = s.toLowerCase(Locale.US).indexOf(s2.toLowerCase(Locale.US));
            }
            else {
                n = s.indexOf(s2);
            }
            if (n == -1) {
                return false;
            }
            final int index = s.indexOf(47, s2.length() + n);
            if (index != -1 && index > n) {
                return false;
            }
        }
        return true;
    }
    
    boolean MatchPath(String s) {
        final File file = new File(s);
        s = this.filterExtension;
        if (s == null || s.isEmpty()) {
            s = this.filterFileName;
            if (s == null || s.isEmpty()) {
                s = this.filterPath;
                if (s == null || s.isEmpty()) {
                    return false;
                }
            }
        }
        s = this.filterExtension;
        Label_0157: {
            if (s != null && !s.isEmpty()) {
                s = file.getName();
                if (s.isEmpty()) {
                    return false;
                }
                if (s.indexOf(".") > 0) {
                    s = s.substring(s.lastIndexOf(".") + 1);
                    if (s.isEmpty()) {
                        return false;
                    }
                    if (this.caseSensitive && !this.filterExtension.equals((Object)s)) {
                        return false;
                    }
                    if (this.filterExtension.equalsIgnoreCase(s)) {
                        break Label_0157;
                    }
                }
                return false;
            }
        }
        s = this.filterFileName;
        if (s != null && !s.isEmpty()) {
            final String name = file.getName();
            if (name.isEmpty()) {
                return false;
            }
            s = name;
            if (name.indexOf(".") > 0) {
                s = name.substring(0, name.lastIndexOf("."));
            }
            if (this.exactFileNameMatch) {
                if (this.caseSensitive && !s.equals((Object)this.filterFileName)) {
                    return false;
                }
                if (!s.equalsIgnoreCase(this.filterFileName)) {
                    return false;
                }
            }
            else {
                if (this.caseSensitive && !s.contains((CharSequence)this.filterFileName)) {
                    return false;
                }
                if (!NativeUtils.ContainsIgnoreCase(s, this.filterFileName)) {
                    return false;
                }
            }
        }
        s = this.filterPath;
        if (s != null && !s.isEmpty()) {
            s = file.getPath();
            if (s.isEmpty()) {
                return false;
            }
            if (this.exactPathMatch) {
                if (this.caseSensitive && !s.equals((Object)this.filterPath)) {
                    return false;
                }
                if (!s.equalsIgnoreCase(this.filterPath)) {
                    return false;
                }
            }
            else if (!PathMatch(s, this.filterPath, this.pathRecursive, this.caseSensitive ^ true)) {
                return false;
            }
        }
        return true;
    }
    
    String ToString() {
        return "caseSensitive: " + (Object)this.caseSensitive + ", pathRecursive: " + (Object)this.pathRecursive + ", exactFileNameMatch: " + (Object)this.exactFileNameMatch + ", exactPathMatch: " + (Object)this.exactPathMatch + ", filterPath: " + this.filterPath + ", filterExtension: " + this.filterExtension + ", filterFileName: " + this.filterFileName;
    }
}
