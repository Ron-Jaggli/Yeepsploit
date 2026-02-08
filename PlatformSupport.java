package com.unity3d.player;

import android.os.Build$VERSION;

public class PlatformSupport
{
    static final boolean NOUGAT_SUPPORT;
    static final boolean OREO_SUPPORT;
    static final boolean PIE_SUPPORT;
    static final boolean QUINCE_TART_SUPPORT;
    static final boolean RED_VELVET_CAKE_SUPPORT;
    static final boolean SNOW_CONE_SUPPORT;
    static final boolean TIRAMISU_SUPPORT;
    static final boolean UPSIDE_DOWN_CAKE_SUPPORT;
    static final boolean VANILLA_ICE_CREAM_SUPPORT;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        NOUGAT_SUPPORT = true;
        OREO_SUPPORT = true;
        PIE_SUPPORT = true;
        QUINCE_TART_SUPPORT = true;
        RED_VELVET_CAKE_SUPPORT = (sdk_INT >= 30);
        SNOW_CONE_SUPPORT = (sdk_INT >= 31);
        TIRAMISU_SUPPORT = (sdk_INT >= 33);
        UPSIDE_DOWN_CAKE_SUPPORT = (sdk_INT >= 34);
        VANILLA_ICE_CREAM_SUPPORT = (sdk_INT >= 35 && b);
    }
}
