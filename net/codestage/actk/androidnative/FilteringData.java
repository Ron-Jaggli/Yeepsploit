package net.codestage.actk.androidnative;

import java.util.List;
import java.util.ArrayList;

class FilteringData
{
    private final FileFilter[] ignores;
    private final FileFilter[] includes;
    
    public FilteringData(final FileFilter[] includes, final FileFilter[] ignores) {
        this.includes = includes;
        this.ignores = ignores;
    }
    
    public static FilteringData CreateFromFilters(final String[] array) {
        if (array == null) {
            return new FilteringData(null, null);
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final int length = array.length;
        int i = 0;
        boolean b = false;
        while (i < length) {
            final String s = array[i];
            if (s.equals((Object)"IGNORES")) {
                b = true;
            }
            else if (b) {
                ((List)list2).add((Object)s);
            }
            else {
                ((List)list).add((Object)s);
            }
            ++i;
        }
        return new FilteringData(GetFiltersFromStrings((String[])((List)list).toArray((Object[])new String[((List)list).size()])), GetFiltersFromStrings((String[])((List)list2).toArray((Object[])new String[((List)list2).size()])));
    }
    
    private static FileFilter[] GetFiltersFromStrings(final String[] array) {
        if (array != null && array.length != 0) {
            final FileFilter[] array2 = new FileFilter[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = new FileFilter(array[i]);
            }
            return array2;
        }
        return null;
    }
    
    private boolean IsPathMatchesFilters(final String s, final FileFilter[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].MatchPath(s)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean IsIgnored(final String s) {
        final FileFilter[] ignores = this.ignores;
        return ignores != null && ignores.length != 0 && this.IsPathMatchesFilters(s, ignores);
    }
    
    public boolean IsIncluded(final String s) {
        final FileFilter[] includes = this.includes;
        return includes != null && includes.length != 0 && this.IsPathMatchesFilters(s, includes);
    }
}
