package com.yahoo.sketches;

import java.util.HashMap;
import java.util.Map;

public enum Family
{
    private static final Family[] $VALUES;
    
    ALPHA(1, "Alpha", 3, 3), 
    A_NOT_B(6, "AnotB", 3, 3), 
    COMPACT(3, "Compact", 1, 3), 
    FREQUENCY(10, "FREQUENCY", 1, 4), 
    HLL(7, "HLL", 1, 1), 
    INTERSECTION(5, "Intersection", 3, 3), 
    KLL(15, "KLL", 1, 2), 
    QUANTILES(8, "QUANTILES", 1, 2), 
    QUICKSELECT(2, "QuickSelect", 3, 3), 
    RESERVOIR(11, "RESERVOIR", 1, 2), 
    RESERVOIR_UNION(12, "RESERVOIR_UNION", 1, 1), 
    TUPLE(9, "TUPLE", 1, 1), 
    UNION(4, "Union", 4, 4), 
    VAROPT(13, "VAROPT", 1, 4), 
    VAROPT_UNION(14, "VAROPT_UNION", 1, 4);
    
    private static final Map<String, Family> lookupFamName;
    private static final Map<Integer, Family> lookupID;
    private String famName_;
    private int id_;
    private int maxPreLongs_;
    private int minPreLongs_;
    
    private static /* synthetic */ Family[] $values() {
        return new Family[] { Family.ALPHA, Family.QUICKSELECT, Family.COMPACT, Family.UNION, Family.INTERSECTION, Family.A_NOT_B, Family.HLL, Family.QUANTILES, Family.TUPLE, Family.FREQUENCY, Family.RESERVOIR, Family.RESERVOIR_UNION, Family.VAROPT, Family.VAROPT_UNION, Family.KLL };
    }
    
    static {
        $VALUES = $values();
        lookupID = (Map)new HashMap();
        lookupFamName = (Map)new HashMap();
        for (final Family family : values()) {
            Family.lookupID.put((Object)family.getID(), (Object)family);
            Family.lookupFamName.put((Object)family.getFamilyName().toUpperCase(), (Object)family);
        }
    }
    
    private Family(final int id_, final String s2, final int minPreLongs_, final int maxPreLongs_) {
        this.id_ = id_;
        this.famName_ = s2.toUpperCase();
        this.minPreLongs_ = minPreLongs_;
        this.maxPreLongs_ = maxPreLongs_;
    }
    
    public static Family idToFamily(final int n) {
        final Family family = (Family)Family.lookupID.get((Object)n);
        if (family != null) {
            return family;
        }
        throw new SketchesArgumentException("Possible Corruption: Illegal Family ID: " + n);
    }
    
    public static Family stringToFamily(final String s) {
        final Family family = (Family)Family.lookupFamName.get((Object)s.toUpperCase());
        if (family != null) {
            return family;
        }
        throw new SketchesArgumentException("Possible Corruption: Illegal Family Name: " + s);
    }
    
    public void checkFamilyID(final int n) {
        if (n == this.id_) {
            return;
        }
        throw new SketchesArgumentException("Possible Corruption: This Family " + this.toString() + " does not match the ID of the given Family: " + idToFamily(n).toString());
    }
    
    public String getFamilyName() {
        return this.famName_;
    }
    
    public int getID() {
        return this.id_;
    }
    
    public int getMaxPreLongs() {
        return this.maxPreLongs_;
    }
    
    public int getMinPreLongs() {
        return this.minPreLongs_;
    }
    
    public String toString() {
        return this.famName_;
    }
}
