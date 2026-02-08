package com.aheaditec.talsec.security;

import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;
import android.os.Build$VERSION;
import java.io.Closeable;
import kotlin.io.CloseableKt;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.text.Charsets;
import java.io.FileInputStream;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;
import android.os.Build;
import java.util.Iterator;
import java.util.ArrayList;
import java.nio.charset.Charset;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class p0
{
    public final List<a> a;
    
    public p0() {
        final byte[] array2;
        final byte[] array = array2 = new byte[8];
        array2[0] = -6;
        array2[1] = 46;
        array2[2] = -20;
        array2[3] = -8;
        array2[4] = -96;
        array2[5] = -88;
        array2[6] = -114;
        array2[7] = -66;
        a(array, new byte[] { -120, 115, -125, -83, -86, 12, -52, -27 });
        final Charset utf_8 = StandardCharsets.UTF_8;
        final String intern = new String(array, utf_8).intern();
        final byte[] array4;
        final byte[] array3 = array4 = new byte[10];
        array4[0] = -65;
        array4[1] = 22;
        array4[2] = -3;
        array4[3] = 97;
        array4[4] = -25;
        array4[5] = 1;
        array4[6] = 118;
        array4[7] = 84;
        array4[8] = -7;
        array4[9] = -107;
        a(array3, new byte[] { -38, -87, 111, 90, -96, -99, 1, 70, -100, -25 });
        final a a = new a(null, null, null, null, intern, null, null, null, new String(array3, utf_8).intern(), 239, null);
        final byte[] array6;
        final byte[] array5 = array6 = new byte[14];
        array6[0] = -49;
        array6[1] = -35;
        array6[2] = 63;
        array6[3] = 97;
        array6[4] = -116;
        array6[5] = 124;
        array6[6] = -60;
        array6[7] = -123;
        array6[8] = -92;
        array6[9] = 14;
        array6[10] = -63;
        array6[11] = 31;
        array6[12] = -3;
        array6[13] = 8;
        a(array5, new byte[] { -111, -30, 58, 31, -55, 73, -50, -18, -74, -90, -114, -116, -35, 58 });
        final String intern2 = new String(array5, utf_8).intern();
        final byte[] array8;
        final byte[] array7 = array8 = new byte[5];
        array8[0] = -6;
        array8[1] = 115;
        array8[2] = 37;
        array8[3] = 86;
        array8[4] = 48;
        a(array7, new byte[] { -74, -115, -2, -112, 2, -120, 71, 59 });
        final String intern3 = new String(array7, utf_8).intern();
        final byte[] array10;
        final byte[] array9 = array10 = new byte[10];
        array10[0] = 24;
        array10[1] = 85;
        array10[2] = -47;
        array10[3] = 61;
        array10[4] = 76;
        array10[5] = -70;
        array10[6] = -15;
        array10[7] = 54;
        array10[8] = 63;
        array10[9] = -72;
        a(array9, new byte[] { 63, 106, -109, 54, 5, 6, 123, 104, 90, -54 });
        final a a2 = new a(intern2, null, null, null, null, null, intern3, null, new String(array9, utf_8).intern(), 190, null);
        final byte[] array12;
        final byte[] array11 = array12 = new byte[8];
        array12[0] = 82;
        array12[1] = -22;
        array12[2] = -19;
        array12[3] = 52;
        array12[4] = -107;
        array12[5] = -49;
        array12[6] = 65;
        array12[7] = -111;
        a(array11, new byte[] { 10, -50, 118, 95, -112, -45, 31, 13 });
        final String intern4 = new String(array11, utf_8).intern();
        final byte[] array14;
        final byte[] array13 = array14 = new byte[5];
        array14[0] = -25;
        array14[1] = 116;
        array14[2] = 48;
        array14[3] = -61;
        array14[4] = -35;
        a(array13, new byte[] { -71, -118, -21, 5, -17, 51, 65, -1 });
        final String intern5 = new String(array13, utf_8).intern();
        final byte[] array16;
        final byte[] array15 = array16 = new byte[10];
        array16[0] = -36;
        array16[1] = 41;
        array16[2] = -52;
        array16[3] = 99;
        array16[4] = 23;
        array16[5] = -19;
        array16[6] = -45;
        array16[7] = 31;
        array16[8] = -21;
        array16[9] = 11;
        a(array15, new byte[] { 123, 118, -98, 92, 48, -79, -100, 127, -114, 121 });
        final a a3 = new a(null, null, null, null, intern4, null, intern5, null, new String(array15, utf_8).intern(), 175, null);
        final byte[] array18;
        final byte[] array17 = array18 = new byte[3];
        array18[0] = 84;
        array18[1] = -14;
        array18[2] = 119;
        a(array17, new byte[] { 44, -54, 65, 6, 99, -58, 81, 52 });
        final String intern6 = new String(array17, utf_8).intern();
        final byte[] array20;
        final byte[] array19 = array20 = new byte[8];
        array20[0] = -31;
        array20[1] = -109;
        array20[2] = -10;
        array20[3] = -18;
        array20[4] = -95;
        array20[5] = 115;
        array20[6] = -90;
        array20[7] = -2;
        a(array19, new byte[] { -101, 14, -58, -62, -127, 117, 125, -55 });
        final String intern7 = new String(array19, utf_8).intern();
        final byte[] array22;
        final byte[] array21 = array22 = new byte[10];
        array22[0] = -83;
        array22[1] = 63;
        array22[2] = -16;
        array22[3] = 70;
        array22[4] = -87;
        array22[5] = -38;
        array22[6] = -49;
        array22[7] = 75;
        array22[8] = -124;
        array22[9] = -95;
        a(array21, new byte[] { -52, -128, 114, 127, -30, -26, -104, 75, -31, -45 });
        final a a4 = new a(null, null, null, intern6, null, intern7, null, null, new String(array21, utf_8).intern(), 215, null);
        final byte[] array24;
        final byte[] array23 = array24 = new byte[9];
        array24[0] = -115;
        array24[1] = 56;
        array24[2] = -13;
        array24[3] = 75;
        array24[4] = 5;
        array24[5] = -111;
        array24[6] = 88;
        array24[7] = 43;
        array24[8] = -112;
        a(array23, new byte[] { -86, -81, -88, 127, 60, -46, 82, 52, -37 });
        final String intern8 = new String(array23, utf_8).intern();
        final byte[] array26;
        final byte[] array25 = array26 = new byte[5];
        array26[0] = -23;
        array26[1] = -37;
        array26[2] = 114;
        array26[3] = -108;
        array26[4] = -28;
        a(array25, new byte[] { -57, 37, 46, -45, -42, 16, 9, -117 });
        final String intern9 = new String(array25, utf_8).intern();
        final byte[] array28;
        final byte[] array27 = array28 = new byte[10];
        array28[0] = 34;
        array28[1] = 26;
        array28[2] = 80;
        array28[3] = -72;
        array28[4] = -96;
        array28[5] = 29;
        array28[6] = -15;
        array28[7] = -85;
        array28[8] = 13;
        array28[9] = 37;
        a(array27, new byte[] { 85, -91, 18, -79, -39, -95, 122, -21, 104, 87 });
        final a a5 = new a(intern8, null, null, null, null, null, intern9, null, new String(array27, utf_8).intern(), 190, null);
        final byte[] array30;
        final byte[] array29 = array30 = new byte[8];
        array30[0] = -109;
        array30[1] = -6;
        array30[2] = 40;
        array30[3] = -82;
        array30[4] = -118;
        array30[5] = -100;
        array30[6] = -7;
        array30[7] = -5;
        a(array29, new byte[] { -83, -35, 97, 0, -93, -36, -78, -40 });
        final String intern10 = new String(array29, utf_8).intern();
        final byte[] array32;
        final byte[] array31 = array32 = new byte[5];
        array32[0] = -120;
        array32[1] = 59;
        array32[2] = -50;
        array32[3] = 64;
        array32[4] = 38;
        a(array31, new byte[] { -88, 69, -23, -121, 20, 100, -21, -113 });
        final String intern11 = new String(array31, utf_8).intern();
        final byte[] array34;
        final byte[] array33 = array34 = new byte[10];
        array34[0] = 5;
        array34[1] = -68;
        array34[2] = 24;
        array34[3] = -39;
        array34[4] = 55;
        array34[5] = 51;
        array34[6] = 110;
        array34[7] = 59;
        array34[8] = -2;
        array34[9] = -83;
        a(array33, new byte[] { 52, 3, 75, 18, 80, -113, -7, 90, -101, -33 });
        final a a6 = new a(intern10, null, null, null, null, null, intern11, null, new String(array33, utf_8).intern(), 190, null);
        final byte[] array36;
        final byte[] array35 = array36 = new byte[8];
        array36[0] = -122;
        array36[1] = -103;
        array36[2] = -101;
        array36[3] = 23;
        array36[4] = -30;
        array36[5] = -76;
        array36[6] = -126;
        array36[7] = -37;
        a(array35, new byte[] { -66, 4, -95, 105, -60, -68, -99, 4 });
        final String intern12 = new String(array35, utf_8).intern();
        final byte[] array38;
        final byte[] array37 = array38 = new byte[5];
        array38[0] = 76;
        array38[1] = -101;
        array38[2] = 39;
        array38[3] = -20;
        array38[4] = -5;
        a(array37, new byte[] { 100, -27, 0, -37, -55, 107, 120, -31 });
        final String intern13 = new String(array37, utf_8).intern();
        final byte[] array40;
        final byte[] array39 = array40 = new byte[10];
        array40[0] = 81;
        array40[1] = -113;
        array40[2] = -98;
        array40[3] = -76;
        array40[4] = 53;
        array40[5] = 2;
        array40[6] = 44;
        array40[7] = 126;
        array40[8] = -64;
        array40[9] = -124;
        a(array39, new byte[] { 8, 16, -47, -83, 78, -98, 55, 32, -91, -10 });
        final a a7 = new a(null, null, null, null, null, intern12, intern13, null, new String(array39, utf_8).intern(), 159, null);
        final byte[] array42;
        final byte[] array41 = array42 = new byte[8];
        array42[0] = -18;
        array42[1] = -112;
        array42[2] = -88;
        array42[3] = 52;
        array42[4] = -21;
        array42[5] = 53;
        array42[6] = -20;
        array42[7] = 109;
        a(array41, new byte[] { -90, 13, 112, -116, -69, 50, -55, 60 });
        final String intern14 = new String(array41, utf_8).intern();
        final byte[] array44;
        final byte[] array43 = array44 = new byte[5];
        array44[0] = -99;
        array44[1] = 59;
        array44[2] = 112;
        array44[3] = -80;
        array44[4] = -50;
        a(array43, new byte[] { -109, 69, 43, -73, -4, 1, 123, -86 });
        final String intern15 = new String(array43, utf_8).intern();
        final byte[] array46;
        final byte[] array45 = array46 = new byte[10];
        array46[0] = 6;
        array46[1] = 83;
        array46[2] = -59;
        array46[3] = 23;
        array46[4] = -52;
        array46[5] = 103;
        array46[6] = -31;
        array46[7] = -55;
        array46[8] = 66;
        array46[9] = -11;
        a(array45, new byte[] { 49, 108, -89, 80, -123, 59, 106, -55, 39, -121 });
        final a a8 = new a(null, null, null, null, null, intern14, intern15, null, new String(array45, utf_8).intern(), 159, null);
        final byte[] array48;
        final byte[] array47 = array48 = new byte[3];
        array48[0] = 34;
        array48[1] = 80;
        array48[2] = -72;
        a(array47, new byte[] { 90, 104, -114, -43, 125, -100, -79, -102 });
        final String intern16 = new String(array47, utf_8).intern();
        final byte[] array50;
        final byte[] array49 = array50 = new byte[8];
        array50[0] = -76;
        array50[1] = 73;
        array50[2] = -34;
        array50[3] = 95;
        array50[4] = -1;
        array50[5] = -123;
        array50[6] = -61;
        array50[7] = 113;
        a(array49, new byte[] { -48, 52, -35, 49, -81, -32, -32, 88 });
        final String intern17 = new String(array49, utf_8).intern();
        final byte[] array52;
        final byte[] array51 = array52 = new byte[10];
        array52[0] = 84;
        array52[1] = -62;
        array52[2] = -101;
        array52[3] = 53;
        array52[4] = 91;
        array52[5] = -100;
        array52[6] = -86;
        array52[7] = 31;
        array52[8] = -21;
        array52[9] = -62;
        a(array51, new byte[] { 3, -35, -51, 46, -12, 31, -74, 127, -114, -80 });
        final a a9 = new a(null, null, null, intern16, null, intern17, null, null, new String(array51, utf_8).intern(), 215, null);
        final byte[] array54;
        final byte[] array53 = array54 = new byte[3];
        array54[0] = 111;
        array54[1] = -104;
        array54[2] = 7;
        a(array53, new byte[] { 23, -96, 49, -15, 62, 81, -47, 49 });
        final String intern18 = new String(array53, utf_8).intern();
        final byte[] array56;
        final byte[] array55 = array56 = new byte[8];
        array56[0] = 31;
        array56[1] = -60;
        array56[2] = -101;
        array56[3] = 52;
        array56[4] = -79;
        array56[5] = -38;
        array56[6] = -107;
        array56[7] = -61;
        a(array55, new byte[] { 53, -71, -96, -116, 113, 29, -114, -90 });
        final String intern19 = new String(array55, utf_8).intern();
        final byte[] array58;
        final byte[] array57 = array58 = new byte[10];
        array58[0] = 95;
        array58[1] = -12;
        array58[2] = 92;
        array58[3] = -92;
        array58[4] = -62;
        array58[5] = -25;
        array58[6] = 54;
        array58[7] = -35;
        array58[8] = 42;
        array58[9] = -47;
        a(array57, new byte[] { -6, -54, 14, -99, 123, -69, 65, -67, 79, -93 });
        final a a10 = new a(null, null, null, intern18, null, intern19, null, null, new String(array57, utf_8).intern(), 215, null);
        final byte[] array60;
        final byte[] array59 = array60 = new byte[3];
        array60[0] = 40;
        array60[1] = 27;
        array60[2] = 46;
        a(array59, new byte[] { 80, 35, 24, -30, 59, -116, -24, -1 });
        final String intern20 = new String(array59, utf_8).intern();
        final byte[] array62;
        final byte[] array61 = array62 = new byte[8];
        array62[0] = 55;
        array62[1] = -66;
        array62[2] = 44;
        array62[3] = -63;
        array62[4] = -5;
        array62[5] = -101;
        array62[6] = 68;
        array62[7] = -17;
        a(array61, new byte[] { 77, 35, -20, -98, -85, -36, 93, -70 });
        final String intern21 = new String(array61, utf_8).intern();
        final byte[] array64;
        final byte[] array63 = array64 = new byte[10];
        array64[0] = 6;
        array64[1] = 20;
        array64[2] = 3;
        array64[3] = -88;
        array64[4] = -43;
        array64[5] = 10;
        array64[6] = 111;
        array64[7] = 22;
        array64[8] = 74;
        array64[9] = 41;
        a(array63, new byte[] { 49, -85, 101, -95, 110, -106, -8, -121, 47, 91 });
        final a a11 = new a(null, null, null, intern20, null, intern21, null, null, new String(array63, utf_8).intern(), 215, null);
        final byte[] array66;
        final byte[] array65 = array66 = new byte[3];
        array66[0] = -44;
        array66[1] = 117;
        array66[2] = -67;
        a(array65, new byte[] { -84, 77, -117, -31, 5, 37, 120, -118 });
        final String intern22 = new String(array65, utf_8).intern();
        final byte[] array68;
        final byte[] array67 = array68 = new byte[8];
        array68[0] = 22;
        array68[1] = -43;
        array68[2] = 97;
        array68[3] = -45;
        array68[4] = -28;
        array68[5] = 50;
        array68[6] = -29;
        array68[7] = -8;
        a(array67, new byte[] { 46, -56, 54, -83, -58, 58, -59, -49 });
        final String intern23 = new String(array67, utf_8).intern();
        final byte[] array70;
        final byte[] array69 = array70 = new byte[10];
        array70[0] = -62;
        array70[1] = -99;
        array70[2] = -123;
        array70[3] = -81;
        array70[4] = 37;
        array70[5] = -96;
        array70[6] = -110;
        array70[7] = 65;
        array70[8] = 74;
        array70[9] = -126;
        a(array69, new byte[] { 117, 34, -24, -88, 94, -4, -35, 81, 47, -16 });
        final a a12 = new a(null, null, null, intern22, null, intern23, null, null, new String(array69, utf_8).intern(), 215, null);
        final byte[] array72;
        final byte[] array71 = array72 = new byte[3];
        array72[0] = -126;
        array72[1] = 56;
        array72[2] = 102;
        a(array71, new byte[] { -6, 0, 80, -37, 40, 68, 27, 117 });
        final String intern24 = new String(array71, utf_8).intern();
        final byte[] array74;
        final byte[] array73 = array74 = new byte[8];
        array74[0] = -75;
        array74[1] = 127;
        array74[2] = -7;
        array74[3] = -61;
        array74[4] = -110;
        array74[5] = 94;
        array74[6] = -71;
        array74[7] = 82;
        a(array73, new byte[] { -49, 98, -66, -101, -109, -98, 118, 53 });
        final String intern25 = new String(array73, utf_8).intern();
        final byte[] array76;
        final byte[] array75 = array76 = new byte[10];
        array76[0] = -124;
        array76[1] = -69;
        array76[2] = -103;
        array76[3] = -80;
        array76[4] = -104;
        array76[5] = -52;
        array76[6] = 107;
        array76[7] = -63;
        array76[8] = 125;
        array76[9] = -13;
        a(array75, new byte[] { -81, 7, -41, -18, -76, -24, -12, -70, 22, -128 });
        final a a13 = new a(null, null, null, intern24, null, intern25, null, null, new String(array75, utf_8).intern(), 215, null);
        final byte[] array78;
        final byte[] array77 = array78 = new byte[3];
        array78[0] = 66;
        array78[1] = -99;
        array78[2] = 96;
        a(array77, new byte[] { 58, -91, 86, -91, 33, 13, -64, 51 });
        final String intern26 = new String(array77, utf_8).intern();
        final byte[] array80;
        final byte[] array79 = array80 = new byte[6];
        array80[0] = -91;
        array80[1] = 47;
        array80[2] = -25;
        array80[3] = -15;
        array80[4] = -103;
        array80[5] = -19;
        a(array79, new byte[] { -33, -112, -76, -38, -88, -89, -6, -2 });
        final String intern27 = new String(array79, utf_8).intern();
        final byte[] array82;
        final byte[] array81 = array82 = new byte[10];
        array82[0] = -52;
        array82[1] = 0;
        array82[2] = 12;
        array82[3] = -125;
        array82[4] = -96;
        array82[5] = 1;
        array82[6] = -23;
        array82[7] = -66;
        array82[8] = -40;
        array82[9] = 22;
        a(array81, new byte[] { 119, -100, 99, -1, -36, -91, 114, -10, -77, 101 });
        final a a14 = new a(null, null, null, intern26, null, intern27, null, null, new String(array81, utf_8).intern(), 215, null);
        final byte[] array84;
        final byte[] array83 = array84 = new byte[3];
        array84[0] = 78;
        array84[1] = 85;
        array84[2] = -86;
        a(array83, new byte[] { 54, 109, -100, -30, -8, -14, 5, 101 });
        final String intern28 = new String(array83, utf_8).intern();
        final byte[] array86;
        final byte[] array85 = array86 = new byte[8];
        array86[0] = -19;
        array86[1] = 40;
        array86[2] = -46;
        array86[3] = -98;
        array86[4] = -99;
        array86[5] = -31;
        array86[6] = -40;
        array86[7] = -101;
        a(array85, new byte[] { -89, -107, -23, -14, -115, 4, -40, -10 });
        final String intern29 = new String(array85, utf_8).intern();
        final byte[] array88;
        final byte[] array87 = array88 = new byte[10];
        array88[0] = 107;
        array88[1] = -110;
        array88[2] = 96;
        array88[3] = -128;
        array88[4] = 72;
        array88[5] = 78;
        array88[6] = -125;
        array88[7] = 23;
        array88[8] = 84;
        array88[9] = -109;
        a(array87, new byte[] { 18, 46, 0, -2, 4, 106, -52, -115, 63, -32 });
        final a a15 = new a(null, null, null, intern28, null, intern29, null, null, new String(array87, utf_8).intern(), 215, null);
        final byte[] array90;
        final byte[] array89 = array90 = new byte[3];
        array90[0] = 56;
        array90[1] = 52;
        array90[2] = 51;
        a(array89, new byte[] { 64, 12, 5, -55, 11, -85, -114, 97 });
        final String intern30 = new String(array89, utf_8).intern();
        final byte[] array92;
        final byte[] array91 = array92 = new byte[8];
        array92[0] = -127;
        array92[1] = 40;
        array92[2] = -80;
        array92[3] = 9;
        array92[4] = -60;
        array92[5] = 118;
        array92[6] = 52;
        array92[7] = 89;
        a(array91, new byte[] { -69, -107, -121, 103, -26, 127, -10, 51 });
        final String intern31 = new String(array91, utf_8).intern();
        final byte[] array94;
        final byte[] array93 = array94 = new byte[10];
        array94[0] = 127;
        array94[1] = -102;
        array94[2] = 96;
        array94[3] = -4;
        array94[4] = -122;
        array94[5] = 44;
        array94[6] = -43;
        array94[7] = -37;
        array94[8] = -16;
        array94[9] = 55;
        a(array93, new byte[] { 38, 38, 0, -78, -66, -120, -98, -47, -101, 68 });
        final a a16 = new a(null, null, null, intern30, null, intern31, null, null, new String(array93, utf_8).intern(), 215, null);
        final byte[] array96;
        final byte[] array95 = array96 = new byte[3];
        array96[0] = 126;
        array96[1] = -53;
        array96[2] = -26;
        a(array95, new byte[] { 6, -13, -48, 85, -70, -127, -83, 66 });
        final String intern32 = new String(array95, utf_8).intern();
        final byte[] array98;
        final byte[] array97 = array98 = new byte[5];
        array98[0] = -53;
        array98[1] = 123;
        array98[2] = -118;
        array98[3] = 98;
        array98[4] = -51;
        a(array97, new byte[] { -127, 104, -73, 107, -1, -48, 35, 24 });
        final String intern33 = new String(array97, utf_8).intern();
        final byte[] array100;
        final byte[] array99 = array100 = new byte[10];
        array100[0] = 67;
        array100[1] = 110;
        array100[2] = -36;
        array100[3] = 81;
        array100[4] = 121;
        array100[5] = -101;
        array100[6] = 114;
        array100[7] = -16;
        array100[8] = 91;
        array100[9] = -48;
        a(array99, new byte[] { -22, 49, -109, 77, 19, 31, -2, -85, 48, -93 });
        final a a17 = new a(null, null, null, intern32, null, intern33, null, null, new String(array99, utf_8).intern(), 215, null);
        final byte[] array102;
        final byte[] array101 = array102 = new byte[3];
        array102[0] = -45;
        array102[1] = 68;
        array102[2] = 24;
        a(array101, new byte[] { -85, 124, 46, 53, 28, -57, -95, -67 });
        final String intern34 = new String(array101, utf_8).intern();
        final byte[] array104;
        final byte[] array103 = array104 = new byte[8];
        array104[0] = -92;
        array104[1] = -123;
        array104[2] = -102;
        array104[3] = 107;
        array104[4] = -65;
        array104[5] = -28;
        array104[6] = 45;
        array104[7] = -3;
        a(array103, new byte[] { -32, -8, -95, 69, 111, 3, 5, -40 });
        final String intern35 = new String(array103, utf_8).intern();
        final byte[] array106;
        final byte[] array105 = array106 = new byte[10];
        array106[0] = -9;
        array106[1] = -61;
        array106[2] = 83;
        array106[3] = -27;
        array106[4] = -99;
        array106[5] = 59;
        array106[6] = -82;
        array106[7] = 69;
        array106[8] = -42;
        array106[9] = 59;
        a(array105, new byte[] { -98, -33, 16, -103, -73, 127, -71, 63, -67, 72 });
        final a a18 = new a(null, null, null, intern34, null, intern35, null, null, new String(array105, utf_8).intern(), 215, null);
        final byte[] array108;
        final byte[] array107 = array108 = new byte[3];
        array108[0] = 14;
        array108[1] = -70;
        array108[2] = -98;
        a(array107, new byte[] { 118, -126, -88, 8, -20, 45, 106, 3 });
        final String intern36 = new String(array107, utf_8).intern();
        final byte[] array110;
        final byte[] array109 = array110 = new byte[8];
        array110[0] = -5;
        array110[1] = 17;
        array110[2] = 52;
        array110[3] = 70;
        array110[4] = -124;
        array110[5] = -115;
        array110[6] = 119;
        array110[7] = -15;
        a(array109, new byte[] { -111, -116, 3, 26, -90, -22, 46, -48 });
        final String intern37 = new String(array109, utf_8).intern();
        final byte[] array112;
        final byte[] array111 = array112 = new byte[10];
        array112[0] = -35;
        array112[1] = -23;
        array112[2] = -64;
        array112[3] = 21;
        array112[4] = -52;
        array112[5] = 3;
        array112[6] = 98;
        array112[7] = -38;
        array112[8] = 11;
        array112[9] = -122;
        a(array111, new byte[] { -120, -75, -97, -119, -120, -89, -19, -47, 96, -11 });
        final a a19 = new a(null, null, null, intern36, null, intern37, null, null, new String(array111, utf_8).intern(), 215, null);
        final byte[] array114;
        final byte[] array113 = array114 = new byte[3];
        array114[0] = -90;
        array114[1] = 91;
        array114[2] = 15;
        a(array113, new byte[] { -34, 99, 57, -67, 63, -35, 22, 7 });
        final String intern38 = new String(array113, utf_8).intern();
        final byte[] array116;
        final byte[] array115 = array116 = new byte[6];
        array116[0] = -75;
        array116[1] = 75;
        array116[2] = 26;
        array116[3] = -53;
        array116[4] = -84;
        array116[5] = -48;
        a(array115, new byte[] { -25, 57, 18, 20, -100, -31, -114, -77 });
        final String intern39 = new String(array115, utf_8).intern();
        final byte[] array118;
        final byte[] array117 = array118 = new byte[10];
        array118[0] = -88;
        array118[1] = 30;
        array118[2] = -49;
        array118[3] = -105;
        array118[4] = -64;
        array118[5] = -14;
        array118[6] = -66;
        array118[7] = 127;
        array118[8] = -26;
        array118[9] = -105;
        a(array117, new byte[] { -45, -94, -92, 11, 124, -74, -55, 53, -115, -28 });
        final a a20 = new a(null, null, null, intern38, null, intern39, null, null, new String(array117, utf_8).intern(), 215, null);
        final byte[] array120;
        final byte[] array119 = array120 = new byte[3];
        array120[0] = -58;
        array120[1] = 57;
        array120[2] = 82;
        a(array119, new byte[] { -66, 1, 100, -111, -46, -83, 1, 58 });
        final String intern40 = new String(array119, utf_8).intern();
        final byte[] array122;
        final byte[] array121 = array122 = new byte[13];
        array122[0] = 111;
        array122[1] = -8;
        array122[2] = -80;
        array122[3] = 71;
        array122[4] = 87;
        array122[5] = 121;
        array122[6] = -8;
        array122[7] = -42;
        array122[8] = -14;
        array122[9] = -67;
        array122[10] = 61;
        array122[11] = 91;
        array122[12] = -52;
        a(array121, new byte[] { 9, -26, -33, 48, 4, 92, -107, 15, -100, -72, -9, -125, -4 });
        final String intern41 = new String(array121, utf_8).intern();
        final byte[] array124;
        final byte[] array123 = array124 = new byte[10];
        array124[0] = -73;
        array124[1] = -123;
        array124[2] = 123;
        array124[3] = -114;
        array124[4] = 100;
        array124[5] = -53;
        array124[6] = 38;
        array124[7] = 56;
        array124[8] = -102;
        array124[9] = 53;
        a(array123, new byte[] { -34, 25, -7, 3, 32, -17, 49, 116, -15, 70 });
        final a a21 = new a(null, null, null, intern40, null, intern41, null, null, new String(array123, utf_8).intern(), 215, null);
        final byte[] array126;
        final byte[] array125 = array126 = new byte[3];
        array126[0] = -7;
        array126[1] = -3;
        array126[2] = 40;
        a(array125, new byte[] { -127, -59, 30, -3, -8, 105, -24, -34 });
        final String intern42 = new String(array125, utf_8).intern();
        final byte[] array128;
        final byte[] array127 = array128 = new byte[13];
        array128[0] = -60;
        array128[1] = -17;
        array128[2] = 95;
        array128[3] = 126;
        array128[4] = -127;
        array128[5] = -96;
        array128[6] = 3;
        array128[7] = -100;
        array128[8] = 108;
        array128[9] = 104;
        array128[10] = -91;
        array128[11] = 5;
        array128[12] = -21;
        a(array127, new byte[] { 116, -47, 4, 71, -74, 37, 59, -43, 22, -117, 127, 77, -37 });
        final String intern43 = new String(array127, utf_8).intern();
        final byte[] array130;
        final byte[] array129 = array130 = new byte[10];
        array130[0] = -126;
        array130[1] = -47;
        array130[2] = -73;
        array130[3] = 55;
        array130[4] = 76;
        array130[5] = 87;
        array130[6] = -28;
        array130[7] = 107;
        array130[8] = 75;
        array130[9] = -102;
        a(array129, new byte[] { -87, -19, -84, 107, 8, 83, 111, 33, 32, -23 });
        final a a22 = new a(null, null, null, intern42, null, intern43, null, null, new String(array129, utf_8).intern(), 215, null);
        final byte[] array132;
        final byte[] array131 = array132 = new byte[3];
        array132[0] = 120;
        array132[1] = 46;
        array132[2] = 74;
        a(array131, new byte[] { 0, 22, 124, -8, 124, 70, -12, 1 });
        final String intern44 = new String(array131, utf_8).intern();
        final byte[] array134;
        final byte[] array133 = array134 = new byte[7];
        array134[0] = 60;
        array134[1] = 25;
        array134[2] = -33;
        array134[3] = 103;
        array134[4] = 22;
        array134[5] = 0;
        array134[6] = 125;
        a(array133, new byte[] { 89, -114, -36, 72, 47, 51, 77, 117 });
        final String intern45 = new String(array133, utf_8).intern();
        final byte[] array136;
        final byte[] array135 = array136 = new byte[10];
        array136[0] = 18;
        array136[1] = -116;
        array136[2] = 67;
        array136[3] = 40;
        array136[4] = 1;
        array136[5] = -117;
        array136[6] = -60;
        array136[7] = 28;
        array136[8] = 97;
        array136[9] = 46;
        a(array135, new byte[] { 57, 16, 33, 102, 59, 47, -112, -104, 10, 93 });
        final a a23 = new a(null, null, null, intern44, null, intern45, null, null, new String(array135, utf_8).intern(), 215, null);
        final byte[] array138;
        final byte[] array137 = array138 = new byte[3];
        array138[0] = -28;
        array138[1] = 72;
        array138[2] = 1;
        a(array137, new byte[] { -100, 112, 55, 51, 16, -56, -1, 62 });
        final String intern46 = new String(array137, utf_8).intern();
        final byte[] array140;
        final byte[] array139 = array140 = new byte[10];
        array140[0] = -37;
        array140[1] = 4;
        array140[2] = 41;
        array140[3] = 97;
        array140[4] = -72;
        array140[5] = 51;
        array140[6] = -46;
        array140[7] = -117;
        array140[8] = 68;
        array140[9] = 122;
        a(array139, new byte[] { 116, 125, 91, 61, -35, 67, -54, -60, 28, 54 });
        final String intern47 = new String(array139, utf_8).intern();
        final byte[] array142;
        final byte[] array141 = array142 = new byte[10];
        array142[0] = 46;
        array142[1] = -61;
        array142[2] = -93;
        array142[3] = -18;
        array142[4] = -72;
        array142[5] = -100;
        array142[6] = -96;
        array142[7] = -84;
        array142[8] = 7;
        array142[9] = 94;
        a(array141, new byte[] { 85, -33, -64, -92, -44, 24, -84, -24, 108, 45 });
        final a a24 = new a(null, null, null, intern46, null, intern47, null, null, new String(array141, utf_8).intern(), 215, null);
        final byte[] array144;
        final byte[] array143 = array144 = new byte[3];
        array144[0] = -22;
        array144[1] = 52;
        array144[2] = 86;
        a(array143, new byte[] { -110, 12, 96, -9, 95, -76, -76, -101 });
        final String intern48 = new String(array143, utf_8).intern();
        final byte[] array146;
        final byte[] array145 = array146 = new byte[10];
        array146[0] = -49;
        array146[1] = 68;
        array146[2] = -63;
        array146[3] = 96;
        array146[4] = -37;
        array146[5] = -106;
        array146[6] = -16;
        array146[7] = -38;
        array146[8] = 88;
        array146[9] = 110;
        a(array145, new byte[] { 119, 71, 126, 76, 109, -4, -86, 4, 9, 42 });
        final String intern49 = new String(array145, utf_8).intern();
        final byte[] array148;
        final byte[] array147 = array148 = new byte[10];
        array148[0] = 60;
        array148[1] = -8;
        array148[2] = -111;
        array148[3] = -11;
        array148[4] = -84;
        array148[5] = -93;
        array148[6] = -10;
        array148[7] = -19;
        array148[8] = 99;
        array148[9] = 63;
        a(array147, new byte[] { 103, -60, -50, -87, -24, 7, -126, -89, 8, 76 });
        final a a25 = new a(null, null, null, intern48, null, intern49, null, null, new String(array147, utf_8).intern(), 215, null);
        final byte[] array150;
        final byte[] array149 = array150 = new byte[4];
        array150[0] = -128;
        array150[1] = -86;
        array150[2] = -127;
        array150[3] = -119;
        a(array149, new byte[] { -38, -7, -40, -3, 67, -31, 121, -127 });
        final String intern50 = new String(array149, utf_8).intern();
        final byte[] array152;
        final byte[] array151 = array152 = new byte[12];
        array152[0] = -80;
        array152[1] = 111;
        array152[2] = 21;
        array152[3] = -24;
        array152[4] = -5;
        array152[6] = (array152[5] = 34);
        array152[7] = 119;
        array152[8] = -76;
        array152[9] = -69;
        array152[10] = 69;
        array152[11] = 67;
        a(array151, new byte[] { -32, 58, 101, -74, 123, 124, 49, 87, -61, -1, 10, 72 });
        final String intern51 = new String(array151, utf_8).intern();
        final byte[] array154;
        final byte[] array153 = array154 = new byte[9];
        array154[0] = 43;
        array154[1] = -18;
        array154[2] = 6;
        array154[3] = -7;
        array154[4] = 116;
        array154[5] = -41;
        array154[6] = -96;
        array154[7] = -106;
        array154[8] = -48;
        a(array153, new byte[] { 71, -80, 76, -75, -5, -19, -72, 12, -76 });
        final a a26 = new a(null, intern50, null, null, null, null, null, intern51, new String(array153, utf_8).intern(), 125, null);
        final byte[] array156;
        final byte[] array155 = array156 = new byte[4];
        array156[0] = 62;
        array156[1] = 122;
        array156[2] = -18;
        array156[3] = 96;
        a(array155, new byte[] { 56, 73, 107, 38, -36, 67, 39, 12 });
        final String intern52 = new String(array155, utf_8).intern();
        final byte[] array158;
        final byte[] array157 = array158 = new byte[12];
        array158[0] = -114;
        array158[1] = -17;
        array158[2] = -94;
        array158[3] = -67;
        array158[4] = 42;
        array158[5] = -52;
        array158[6] = -2;
        array158[7] = -49;
        array158[8] = -63;
        array158[9] = -74;
        array158[10] = 84;
        array158[11] = 36;
        a(array157, new byte[] { -72, -54, -64, -18, 56, -46, 116, -65, -117, 39, 4, 121 });
        final String intern53 = new String(array157, utf_8).intern();
        final byte[] array160;
        final byte[] array159 = array160 = new byte[9];
        array160[0] = -46;
        array160[1] = -36;
        array160[2] = -12;
        array160[3] = -119;
        array160[4] = -85;
        array160[5] = 89;
        array160[6] = 70;
        array160[7] = 15;
        array160[8] = -48;
        a(array159, new byte[] { -112, -30, 122, 5, -74, 96, 18, -125, -76 });
        final a a27 = new a(null, intern52, null, null, null, null, null, intern53, new String(array159, utf_8).intern(), 125, null);
        final byte[] array162;
        final byte[] array161 = array162 = new byte[6];
        array162[0] = -49;
        array162[1] = 94;
        array162[2] = -83;
        array162[3] = 46;
        array162[4] = 0;
        array162[5] = -68;
        a(array161, new byte[] { -109, 86, -66, 89, 111, -49, 72, -62 });
        final String intern54 = new String(array161, utf_8).intern();
        final byte[] array164;
        final byte[] array163 = array164 = new byte[12];
        array164[0] = 68;
        array164[1] = 23;
        array164[2] = 80;
        array164[3] = 55;
        array164[4] = 38;
        array164[5] = -23;
        array164[6] = -89;
        array164[7] = -39;
        array164[8] = 69;
        array164[9] = -103;
        array164[10] = -48;
        array164[11] = 108;
        a(array163, new byte[] { -20, -95, 40, 91, 56, -73, -84, -87, 20, 29, -96, 25 });
        final String intern55 = new String(array163, utf_8).intern();
        final byte[] array166;
        final byte[] array165 = array166 = new byte[9];
        array166[0] = 29;
        array166[1] = 44;
        array166[2] = -59;
        array166[3] = -100;
        array166[4] = 49;
        array166[5] = -95;
        array166[6] = 31;
        array166[7] = -61;
        array166[8] = 77;
        a(array165, new byte[] { 81, 114, -117, 18, 64, -8, 91, -65, 41 });
        final a a28 = new a(null, intern54, null, null, null, null, null, intern55, new String(array165, utf_8).intern(), 125, null);
        final byte[] array168;
        final byte[] array167 = array168 = new byte[6];
        array168[0] = 127;
        array168[1] = -32;
        array168[2] = -34;
        array168[3] = -94;
        array168[4] = -116;
        array168[5] = 102;
        a(array167, new byte[] { 3, -56, -111, -27, -29, 21, -13, -49 });
        final String intern56 = new String(array167, utf_8).intern();
        final byte[] array170;
        final byte[] array169 = array170 = new byte[12];
        array170[0] = 118;
        array170[1] = -24;
        array170[2] = 36;
        array170[3] = 126;
        array170[4] = 117;
        array170[5] = 14;
        array170[6] = -36;
        array170[7] = -78;
        array170[8] = 1;
        array170[9] = 104;
        array170[10] = -88;
        array170[11] = -95;
        a(array169, new byte[] { 32, -51, 58, 47, -7, -113, -110, -12, 75, 89, -49, -2 });
        final String intern57 = new String(array169, utf_8).intern();
        final byte[] array172;
        final byte[] array171 = array172 = new byte[9];
        array172[0] = -27;
        array172[1] = 63;
        array172[2] = 117;
        array172[3] = 119;
        array172[4] = 14;
        array172[5] = -16;
        array172[6] = -80;
        array172[7] = -116;
        array172[8] = 33;
        a(array171, new byte[] { 121, -127, -5, 42, 81, -55, -56, 2, 69 });
        final a a29 = new a(null, intern56, null, null, null, null, null, intern57, new String(array171, utf_8).intern(), 125, null);
        final byte[] array174;
        final byte[] array173 = array174 = new byte[6];
        array174[0] = 35;
        array174[1] = 64;
        array174[2] = 52;
        array174[3] = 113;
        array174[4] = -8;
        array174[5] = -28;
        a(array173, new byte[] { 47, 104, 55, 56, -105, -105, -4, -37 });
        final String intern58 = new String(array173, utf_8).intern();
        final byte[] array176;
        final byte[] array175 = array176 = new byte[12];
        array176[0] = -39;
        array176[1] = 25;
        array176[2] = 62;
        array176[3] = -24;
        array176[4] = -119;
        array176[5] = -44;
        array176[6] = 5;
        array176[7] = 107;
        array176[8] = 48;
        array176[9] = -15;
        array176[10] = 47;
        array176[11] = 21;
        a(array175, new byte[] { -121, -84, 58, -74, -55, -22, 74, 59, 71, -75, 52, -110 });
        final String intern59 = new String(array175, utf_8).intern();
        final byte[] array178;
        final byte[] array177 = array178 = new byte[9];
        array178[0] = -106;
        array178[1] = 102;
        array178[2] = 112;
        array178[3] = 37;
        array178[4] = -91;
        array178[5] = 2;
        array178[6] = 117;
        array178[7] = -65;
        array178[8] = -12;
        a(array177, new byte[] { -52, 56, -2, 88, -84, -101, 5, -13, -112 });
        final a a30 = new a(null, null, intern58, null, null, null, null, intern59, new String(array177, utf_8).intern(), 123, null);
        final byte[] array180;
        final byte[] array179 = array180 = new byte[6];
        array180[0] = -54;
        array180[1] = -113;
        array180[2] = 64;
        array180[3] = -97;
        array180[4] = -62;
        array180[5] = -83;
        a(array179, new byte[] { -104, 39, 36, 10, -83, -34, -51, -6 });
        final String intern60 = new String(array179, utf_8).intern();
        final byte[] array182;
        final byte[] array181 = array182 = new byte[12];
        array182[0] = -24;
        array182[1] = 35;
        array182[2] = 60;
        array182[3] = 64;
        array182[4] = 49;
        array182[5] = 66;
        array182[6] = 70;
        array182[7] = 0;
        array182[8] = -100;
        array182[9] = -105;
        array182[10] = 94;
        array182[11] = -109;
        a(array181, new byte[] { -110, -122, 50, 65, 61, 92, 28, -126, -24, 6, -2, -17 });
        final String intern61 = new String(array181, utf_8).intern();
        final byte[] array184;
        final byte[] array183 = array184 = new byte[9];
        array184[0] = -16;
        array184[1] = 115;
        array184[2] = -39;
        array184[3] = -23;
        array184[4] = 125;
        array184[5] = 82;
        array184[6] = 100;
        array184[7] = -101;
        array184[8] = -85;
        a(array183, new byte[] { 110, 77, -89, -91, 4, 107, -12, 22, -49 });
        this.a = (List<a>)CollectionsKt.listOf((Object[])new a[] { a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, new a(null, null, intern60, null, null, null, null, intern61, new String(array183, utf_8).intern(), 123, null) });
    }
    
    public static void a(final byte[] array, final byte[] array2) {
        int n = 0;
        byte[] array3 = null;
        int n2 = 0;
        int n4;
        int n3 = n4 = 0;
        int n5 = 1180709023;
        byte[] array4 = null;
    Label_0412:
        while (true) {
            final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
            final int n7 = n5 >>> 8;
            final int n8 = 1;
            int n9 = 1;
            final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
            final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
            Label_1066: {
                Label_0580: {
                    switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                        default: {
                            break Label_1066;
                        }
                        case 1548321255: {
                            final int length = array.length;
                            final int n11 = 0 - (0 - array.length % 4);
                            if ((length & ~n11) - (~length & n11) <= 0) {
                                n9 = n;
                            }
                            if (n9 != 0) {
                                n5 = 1910359311;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            array3 = array2;
                            array4 = array;
                            n3 = n;
                            continue;
                        }
                        case 975213712: {
                            final int length2 = array4.length;
                            final int n12 = 0 - n4;
                            final int length3 = array4.length;
                            final int n13 = ~n12;
                            final byte b = array4[(length3 | n12) - (0xD8E528C6 & n13 & length3) + ((0xD8E528C6 | n12) & length3)];
                            final int length4 = array4.length;
                            final byte b2 = array3[(length4 ^ n13) + (length4 | n12) * 2 + 1];
                            array4[(length2 | n12) * 2 - (length2 ^ n12)] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                            final int n14 = ~n4 + n4 * 2;
                            final long n15 = lcmp((long)n4, (long)2) >>> 31 & 0x1;
                            if (n15 != 0) {
                                n5 = 986083301;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            n2 = n14;
                            if (n15 != 0) {
                                n2 = n14;
                                continue;
                            }
                            break Label_0580;
                        }
                        case 373627814: {
                            break Label_0412;
                        }
                        case 298177592: {
                            final int length5 = array4.length;
                            final int n16 = 0 - n4;
                            final int a2 = L.a(n, (length5 & 0x2) | N.a(n16, -4, 1, length5), n16 * 3, 1);
                            final byte b3 = array3[a2];
                            final int length6 = array4.length;
                            final int n17 = 0 - n16;
                            final int n18 = n17 | length6;
                            final byte b4 = array3[O.a(n17, 2, n18, length6 ^ n17 ^ n18)];
                            array3[a2] = (byte)((byte)(b4 ^ b3) + (byte)((byte)2 * (byte)(b4 & b3)));
                            n5 = 1565752577;
                            continue;
                        }
                        case -97532338: {
                            final int n19 = array4.length % 4;
                            final long n20 = lcmp((long)n19, (long)1) >>> 31 & 0x1;
                            if (n20 != 0) {
                                n5 = 986083301;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            n2 = n19;
                            if (n20 != 0) {
                                n2 = n19;
                                continue;
                            }
                            break Label_0580;
                        }
                        case -870579640: {
                            final int n21 = n3 - 1 - (n3 | 0xFFFFFFFC);
                            final byte b5 = array3[n21];
                            final int n22 = (b5 & 0x1000000) * (b5 | 0x1000000) + (b5 & 0xFEFFFFFF) * (~b5 & 0x1000000);
                            final int n23 = n3 + 3 + (-1 - n3 | 0xFFFFFFFD);
                            final int n24 = array3[n23] & 0xFF;
                            final int n25 = n24 * (~n24 & 0x10000);
                            final int n26 = ~((0xB46B5CF6 | ~n25 | n22) - ((n25 & 0xB46B5CF6) | n22));
                            final int a3 = K.a(0xF821C5CC & n3, n3, 1, 0xF821C5CD & n3);
                            final int n27 = array3[a3] & 0xFF;
                            final int n28 = n27 * (~n27 & 0x100);
                            final int n29 = array3[n3] & 0xFF;
                            final int n30 = (n28 + n26 - (n28 & n26) & ~n29) + n29;
                            final byte b6 = array4[n21];
                            final int n31 = (b6 & 0x1000000) * (b6 | 0x1000000) + (0xFEFFFFFF & b6) * (~b6 & 0x1000000);
                            final int n32 = array4[n23] & 0xFF;
                            final int n33 = n32 * (~n32 & 0x10000);
                            final int n34 = ~((n31 | (~n33 | 0xAF2F3113)) - ((n33 & 0xAF2F3113) | n31));
                            final int n35 = array4[a3] & 0xFF;
                            final int n36 = n35 * (~n35 & 0x100);
                            final int a4 = J.a(n36, n34, 1, -1 - n36 | -1 - n34);
                            final int n37 = a4 - 1 - (~(array4[n3] & 0xFF) | a4);
                            final int n38 = n30 << (dcmpg((double)n30, Double.NaN) >>> 31);
                            final int n39 = (n38 ^ 0xE715D017) + (n38 & 0xE715D017) * 2;
                            final int n40 = n39 + n37 - (n39 & n37) * 2;
                            array4[n3] = (byte)n40;
                            array4[a3] = (byte)(n40 >>> 8);
                            array4[n23] = (byte)(n40 >>> 16);
                            array4[n21] = (byte)(n40 >>> 24);
                            n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                            final int length7 = array4.length;
                            final int a5 = com.aheaditec.talsec.security.a.a(array4.length, 4, 0, 0);
                            if ((lcmp((long)n3, (long)((length7 & ~a5) * 2 - (length7 ^ a5))) >>> 31 & 0x1) != 0x0) {
                                n5 = 1910359311;
                                n = 0;
                                continue;
                            }
                            n = 0;
                            break Label_1066;
                        }
                        case -2000520841: {
                            final int length8 = array4.length;
                            final int n41 = 0 - (0 - n2);
                            int n42 = n8;
                            if (dcmpg((double)array3[(length8 & ~n41) * 2 - (length8 ^ n41)], Double.NaN) <= -1) {
                                n42 = 0;
                            }
                            if (n42 != 0) {
                                n5 = 1565752577;
                            }
                            else {
                                n5 = 1621215041;
                            }
                            if (n42 == 0) {
                                n5 = -1164716566;
                            }
                            n4 = n2;
                            n = 0;
                            continue;
                        }
                    }
                    continue;
                }
                n5 = -1138188205;
                continue;
            }
            n5 = 1621215041;
        }
    }
    
    public final List<a> a() {
        final List<a> a = this.a;
        final ArrayList list = new ArrayList();
        for (final Object next : a) {
            if (((a)next).a()) {
                ((Collection)list).add(next);
            }
        }
        return (List<a>)list;
    }
    
    public static final class a
    {
        public static final p0.a.a l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public static final String q;
        public static final String r;
        public static final String s;
        public static final String t;
        public static final String u;
        public static final String v;
        public static final String w;
        public static final String x;
        public static final String y;
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public String i;
        public final int j;
        public int k;
        
        static {
            final byte[] array2;
            final byte[] array = array2 = new byte[7];
            array2[0] = 71;
            array2[1] = -58;
            array2[2] = -15;
            array2[3] = -114;
            array2[4] = 21;
            array2[5] = -50;
            array2[6] = 29;
            a(array, new byte[] { 30, -45, -121, 4, 116, -67, 120, -117 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            y = new String(array, utf_8).intern();
            final byte[] array4;
            final byte[] array3 = array4 = new byte[5];
            array4[0] = 99;
            array4[1] = -92;
            array4[2] = -5;
            array4[3] = 69;
            array4[4] = 114;
            a(array3, new byte[] { -9, -6, -119, 57, 30, 76, 54, -65 });
            x = new String(array3, utf_8).intern();
            final byte[] array6;
            final byte[] array5 = array6 = new byte[6];
            array6[0] = -45;
            array6[1] = 112;
            array6[2] = -8;
            array6[3] = 94;
            array6[4] = 123;
            array6[5] = 81;
            a(array5, new byte[] { -96, 69, 120, 80, 24, 52, 102, -36 });
            w = new String(array5, utf_8).intern();
            final byte[] array8;
            final byte[] array7 = array8 = new byte[6];
            array8[0] = -127;
            array8[1] = -70;
            array8[2] = -52;
            array8[3] = -20;
            array8[4] = 126;
            array8[5] = -41;
            a(array7, new byte[] { -53, -6, -93, -58, 28, -66, -45, -2 });
            v = new String(array7, utf_8).intern();
            final byte[] array10;
            final byte[] array9 = array10 = new byte[5];
            array10[0] = -6;
            array10[1] = -12;
            array10[2] = -44;
            array10[3] = -53;
            array10[4] = 81;
            a(array9, new byte[] { -127, -53, -97, -46, 53, -27, -113, 41 });
            u = new String(array9, utf_8).intern();
            final byte[] array12;
            final byte[] array11 = array12 = new byte[8];
            array12[0] = -98;
            array12[1] = 100;
            array12[2] = 89;
            array12[3] = 13;
            array12[4] = -68;
            array12[5] = -115;
            array12[6] = 30;
            array12[7] = 93;
            a(array11, new byte[] { -33, 53, 21, -126, -76, 28, 87, 81 });
            t = new String(array11, utf_8).intern();
            final byte[] array14;
            final byte[] array13 = array14 = new byte[7];
            array14[0] = -74;
            array14[1] = 63;
            array14[2] = -77;
            array14[3] = -14;
            array14[4] = -50;
            array14[5] = 26;
            array14[6] = -20;
            a(array13, new byte[] { -81, 125, -58, -81, -69, 121, -104, -53 });
            s = new String(array13, utf_8).intern();
            final byte[] array16;
            final byte[] array15 = array16 = new byte[8];
            array16[0] = -22;
            array16[1] = 73;
            array16[2] = 82;
            array16[3] = 58;
            array16[4] = 24;
            array16[5] = 55;
            array16[6] = -62;
            array16[7] = -70;
            a(array15, new byte[] { -117, 88, 10, 119, 88, -122, -102, -8 });
            r = new String(array15, utf_8).intern();
            final byte[] array18;
            final byte[] array17 = array18 = new byte[9];
            array18[0] = -74;
            array18[1] = 7;
            array18[2] = -18;
            array18[3] = 67;
            array18[4] = 57;
            array18[5] = 3;
            array18[6] = 68;
            array18[7] = -123;
            array18[8] = -56;
            a(array17, new byte[] { -87, -110, 106, 64, 63, -95, 5, 5, -84 });
            q = new String(array17, utf_8).intern();
            final byte[] array20;
            final byte[] array19 = array20 = new byte[10];
            array20[0] = -66;
            array20[1] = -16;
            array20[2] = 85;
            array20[3] = -4;
            array20[4] = 100;
            array20[5] = -13;
            array20[6] = -111;
            array20[7] = 65;
            array20[8] = -58;
            array20[9] = 76;
            a(array19, new byte[] { -68, -49, 27, -78, -15, 2, -22, 57, -85, 41 });
            p = new String(array19, utf_8).intern();
            final byte[] array22;
            final byte[] array21 = array22 = new byte[2];
            array22[0] = 81;
            array22[1] = 91;
            a(array21, new byte[] { 107, 123, -35, -118, 14, 30, 96, -11 });
            o = new String(array21, utf_8).intern();
            final byte[] array24;
            final byte[] array23 = array24 = new byte[13];
            array24[0] = 71;
            array24[1] = -65;
            array24[2] = -118;
            array24[3] = 38;
            array24[4] = 11;
            array24[5] = -32;
            array24[6] = 120;
            array24[7] = -70;
            array24[8] = 104;
            array24[9] = 5;
            array24[10] = 97;
            array24[11] = 107;
            array24[12] = -90;
            a(array23, new byte[] { 81, -1, -30, 98, 81, -1, 5, -29, 6, -100, -7, 37, -55 });
            n = new String(array23, utf_8).intern();
            final byte[] array26;
            final byte[] array25 = array26 = new byte[9];
            array26[0] = 103;
            array26[1] = 24;
            array26[2] = -125;
            array26[3] = -93;
            array26[4] = 84;
            array26[5] = 104;
            array26[6] = 66;
            array26[7] = -107;
            array26[8] = 63;
            a(array25, new byte[] { -19, -105, -32, 14, 26, 54, 16, 19, 77 });
            m = new String(array25, utf_8).intern();
            l = new p0.a.a(null);
        }
        
        public a() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }
        
        public a(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = this.b();
        }
        
        public static void a(final byte[] array, final byte[] array2) {
            int n = 0;
            byte[] array3 = null;
            int n2 = 0;
            int n4;
            int n3 = n4 = 0;
            int n5 = 1180709023;
            byte[] array4 = null;
        Label_0412:
            while (true) {
                final int n6 = (n5 & 0x1000000) * (n5 | 0x1000000) + (n5 & 0xFEFFFFFF) * (~n5 & 0x1000000);
                final int n7 = n5 >>> 8;
                final int n8 = 1;
                int n9 = 1;
                final int a = J.a(n7, n6, 1, -1 - n7 | -1 - n6);
                final int n10 = (a ^ 0xF3F8BAED) + (a & 0xF3F8BAED) * 2;
                Label_1066: {
                    Label_0580: {
                        switch (n10 - 814310662 - (n10 & 0xCF769AFA) * 2) {
                            default: {
                                break Label_1066;
                            }
                            case 1548321255: {
                                final int length = array.length;
                                final int n11 = 0 - (0 - array.length % 4);
                                if ((length & ~n11) - (~length & n11) <= 0) {
                                    n9 = n;
                                }
                                if (n9 != 0) {
                                    n5 = 1910359311;
                                }
                                else {
                                    n5 = 1621215041;
                                }
                                array3 = array2;
                                array4 = array;
                                n3 = n;
                                continue;
                            }
                            case 975213712: {
                                final int length2 = array4.length;
                                final int n12 = 0 - n4;
                                final int length3 = array4.length;
                                final int n13 = ~n12;
                                final byte b = array4[(length3 | n12) - (0xD8E528C6 & n13 & length3) + ((0xD8E528C6 | n12) & length3)];
                                final int length4 = array4.length;
                                final byte b2 = array3[(length4 ^ n13) + (length4 | n12) * 2 + 1];
                                array4[(length2 | n12) * 2 - (length2 ^ n12)] = (byte)((byte)((byte)b2 - (byte)b) + (byte)((byte)2 * (byte)(~b2 & b)));
                                final int n14 = ~n4 + n4 * 2;
                                final long n15 = lcmp((long)n4, (long)2) >>> 31 & 0x1;
                                if (n15 != 0) {
                                    n5 = 986083301;
                                }
                                else {
                                    n5 = 1621215041;
                                }
                                n2 = n14;
                                if (n15 != 0) {
                                    n2 = n14;
                                    continue;
                                }
                                break Label_0580;
                            }
                            case 373627814: {
                                break Label_0412;
                            }
                            case 298177592: {
                                final int length5 = array4.length;
                                final int n16 = 0 - n4;
                                final int a2 = L.a(n, (length5 & 0x2) | N.a(n16, -4, 1, length5), n16 * 3, 1);
                                final byte b3 = array3[a2];
                                final int length6 = array4.length;
                                final int n17 = 0 - n16;
                                final int n18 = n17 | length6;
                                final byte b4 = array3[O.a(n17, 2, n18, length6 ^ n17 ^ n18)];
                                array3[a2] = (byte)((byte)(b4 ^ b3) + (byte)((byte)2 * (byte)(b4 & b3)));
                                n5 = 1565752577;
                                continue;
                            }
                            case -97532338: {
                                final int n19 = array4.length % 4;
                                final long n20 = lcmp((long)n19, (long)1) >>> 31 & 0x1;
                                if (n20 != 0) {
                                    n5 = 986083301;
                                }
                                else {
                                    n5 = 1621215041;
                                }
                                n2 = n19;
                                if (n20 != 0) {
                                    n2 = n19;
                                    continue;
                                }
                                break Label_0580;
                            }
                            case -870579640: {
                                final int n21 = n3 - 1 - (n3 | 0xFFFFFFFC);
                                final byte b5 = array3[n21];
                                final int n22 = (b5 & 0x1000000) * (b5 | 0x1000000) + (b5 & 0xFEFFFFFF) * (~b5 & 0x1000000);
                                final int n23 = n3 + 3 + (-1 - n3 | 0xFFFFFFFD);
                                final int n24 = array3[n23] & 0xFF;
                                final int n25 = n24 * (~n24 & 0x10000);
                                final int n26 = ~((0xB46B5CF6 | ~n25 | n22) - ((n25 & 0xB46B5CF6) | n22));
                                final int a3 = K.a(0xF821C5CC & n3, n3, 1, 0xF821C5CD & n3);
                                final int n27 = array3[a3] & 0xFF;
                                final int n28 = n27 * (~n27 & 0x100);
                                final int n29 = array3[n3] & 0xFF;
                                final int n30 = (n28 + n26 - (n28 & n26) & ~n29) + n29;
                                final byte b6 = array4[n21];
                                final int n31 = (b6 & 0x1000000) * (b6 | 0x1000000) + (0xFEFFFFFF & b6) * (~b6 & 0x1000000);
                                final int n32 = array4[n23] & 0xFF;
                                final int n33 = n32 * (~n32 & 0x10000);
                                final int n34 = ~((n31 | (~n33 | 0xAF2F3113)) - ((n33 & 0xAF2F3113) | n31));
                                final int n35 = array4[a3] & 0xFF;
                                final int n36 = n35 * (~n35 & 0x100);
                                final int a4 = J.a(n36, n34, 1, -1 - n36 | -1 - n34);
                                final int n37 = a4 - 1 - (~(array4[n3] & 0xFF) | a4);
                                final int n38 = n30 << (dcmpg((double)n30, Double.NaN) >>> 31);
                                final int n39 = (n38 ^ 0xE715D017) + (n38 & 0xE715D017) * 2;
                                final int n40 = n39 + n37 - (n39 & n37) * 2;
                                array4[n3] = (byte)n40;
                                array4[a3] = (byte)(n40 >>> 8);
                                array4[n23] = (byte)(n40 >>> 16);
                                array4[n21] = (byte)(n40 >>> 24);
                                n3 = (n3 ^ 0x4) + (n3 & 0x4) * 2;
                                final int length7 = array4.length;
                                final int a5 = com.aheaditec.talsec.security.a.a(array4.length, 4, 0, 0);
                                if ((lcmp((long)n3, (long)((length7 & ~a5) * 2 - (length7 ^ a5))) >>> 31 & 0x1) != 0x0) {
                                    n5 = 1910359311;
                                    n = 0;
                                    continue;
                                }
                                n = 0;
                                break Label_1066;
                            }
                            case -2000520841: {
                                final int length8 = array4.length;
                                final int n41 = 0 - (0 - n2);
                                int n42 = n8;
                                if (dcmpg((double)array3[(length8 & ~n41) * 2 - (length8 ^ n41)], Double.NaN) <= -1) {
                                    n42 = 0;
                                }
                                if (n42 != 0) {
                                    n5 = 1565752577;
                                }
                                else {
                                    n5 = 1621215041;
                                }
                                if (n42 == 0) {
                                    n5 = -1164716566;
                                }
                                n4 = n2;
                                n = 0;
                                continue;
                            }
                        }
                        continue;
                    }
                    n5 = -1138188205;
                    continue;
                }
                n5 = 1621215041;
            }
        }
        
        public final boolean a() {
            final String a = this.a;
            boolean b = true;
            if (a != null && this.g(a)) {
                ++this.k;
            }
            final String b2 = this.b;
            if (b2 != null && this.e(b2)) {
                ++this.k;
            }
            final String c = this.c;
            if (c != null && this.a(c)) {
                ++this.k;
            }
            final String d = this.d;
            if (d != null && this.b(d)) {
                ++this.k;
            }
            final String e = this.e;
            if (e != null && this.d(e)) {
                ++this.k;
            }
            final String f = this.f;
            if (f != null && this.f(f)) {
                ++this.k;
            }
            final String g = this.g;
            if (g != null && this.h(g)) {
                ++this.k;
            }
            final String h = this.h;
            if (h != null && this.c(h)) {
                ++this.k;
            }
            if (this.k != this.j) {
                b = false;
            }
            return b;
        }
        
        public final boolean a(final String s) {
            try {
                final String board = Build.BOARD;
                if (board != null) {
                    return StringsKt.contains$default((CharSequence)board, (CharSequence)s, false, 2, (Object)null);
                }
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = 28;
                array2[1] = -126;
                array2[2] = 26;
                array2[3] = 59;
                array2[4] = 36;
                array2[5] = -18;
                array2[6] = 14;
                array2[7] = -8;
                array2[8] = -11;
                array2[9] = 105;
                array2[10] = -12;
                array2[11] = 98;
                array2[12] = -123;
                array2[13] = -95;
                array2[14] = -60;
                array2[15] = -26;
                a(array, new byte[] { 59, 29, 52, 103, 48, -74, 50, -86, 121, 53, 122, 64, -32, 3, -106, -83 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[39];
                array4[0] = -73;
                array4[1] = -57;
                array4[2] = 9;
                array4[3] = 26;
                array4[4] = 84;
                array4[5] = 74;
                array4[6] = 122;
                array4[7] = 107;
                array4[8] = -92;
                array4[9] = 26;
                array4[10] = 62;
                array4[11] = 76;
                array4[12] = -10;
                array4[13] = 124;
                array4[14] = 28;
                array4[15] = 75;
                array4[16] = 12;
                array4[17] = 31;
                array4[18] = 26;
                array4[19] = 4;
                array4[20] = -76;
                array4[21] = -5;
                array4[22] = 109;
                array4[23] = 55;
                array4[24] = 76;
                array4[25] = -117;
                array4[26] = 52;
                array4[27] = -71;
                array4[28] = -27;
                array4[29] = -57;
                array4[30] = 14;
                array4[31] = 77;
                array4[32] = 22;
                array4[33] = -8;
                array4[34] = -56;
                array4[35] = 70;
                array4[36] = 108;
                array4[37] = 17;
                array4[38] = -102;
                a(array3, new byte[] { -37, -27, 101, -114, 15, -102, -9, 27, -74, -90, 69, -123, -128, 79, 105, 71, 104, -100, 93, -125, -68, 11, 26, 91, 14, 23, 59, -80, -112, -72, 57, 56, 59, 8, -103, 72, 9, 125, -2 });
                new String(array3, utf_8).intern();
            }
            return false;
        }
        
        public final int b() {
            int n;
            if (this.a != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2 = n;
            if (this.b != null) {
                n2 = n + 1;
            }
            int n3 = n2;
            if (this.c != null) {
                n3 = n2 + 1;
            }
            int n4 = n3;
            if (this.d != null) {
                n4 = n3 + 1;
            }
            int n5 = n4;
            if (this.e != null) {
                n5 = n4 + 1;
            }
            int n6 = n5;
            if (this.f != null) {
                n6 = n5 + 1;
            }
            int n7 = n6;
            if (this.g != null) {
                n7 = n6 + 1;
            }
            int n8 = n7;
            if (this.h != null) {
                n8 = n7 + 1;
            }
            return n8;
        }
        
        public final boolean b(final String s) {
            try {
                final String[] supported_ABIS = Build.SUPPORTED_ABIS;
                if (supported_ABIS != null) {
                    return ArraysKt.contains((Object[])supported_ABIS, (Object)s);
                }
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = 45;
                array2[1] = 77;
                array2[2] = -101;
                array2[3] = 33;
                array2[4] = -88;
                array2[5] = -38;
                array2[6] = -63;
                array2[7] = -47;
                array2[8] = 53;
                array2[9] = -3;
                array2[10] = 21;
                array2[11] = 50;
                array2[12] = 36;
                array2[13] = -108;
                array2[14] = 97;
                array2[15] = 35;
                a(array, new byte[] { 76, 82, -78, 109, -76, -30, 113, -47, 57, -63, 91, -112, 63, 22, -7, 105 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[48];
                array4[0] = -127;
                array4[1] = 46;
                array4[2] = 109;
                array4[3] = 119;
                array4[4] = 69;
                array4[5] = -40;
                array4[6] = -125;
                array4[7] = 113;
                array4[8] = -70;
                array4[9] = 62;
                array4[10] = 99;
                array4[11] = 105;
                array4[12] = 2;
                array4[13] = 123;
                array4[14] = -72;
                array4[15] = 94;
                array4[16] = -113;
                array4[17] = 100;
                array4[18] = 34;
                array4[19] = 97;
                array4[20] = -22;
                array4[21] = -18;
                array4[22] = -65;
                array4[23] = 1;
                array4[24] = -103;
                array4[25] = 55;
                array4[26] = -113;
                array4[27] = 89;
                array4[28] = -58;
                array4[29] = -113;
                array4[30] = -117;
                array4[31] = -120;
                array4[32] = -108;
                array4[33] = 79;
                array4[34] = -82;
                array4[35] = 30;
                array4[36] = 123;
                array4[37] = -106;
                array4[38] = -65;
                array4[39] = -100;
                array4[40] = -55;
                array4[41] = 121;
                array4[42] = 68;
                array4[43] = 78;
                array4[44] = -2;
                array4[45] = -95;
                array4[46] = 110;
                array4[47] = 107;
                a(array3, new byte[] { -83, -116, 9, 49, 32, 40, -33, 50, -68, -126, -16, 97, 76, 72, -59, 84, -27, 71, 53, 40, 118, -2, -25, -115, -39, -117, -43, -112, 126, 10, -58, -15, -60, 77, -28, 116, 40, -7, -24, -9, 105, 90, 78, 65, -128, -12, -20, 39 });
                new String(array3, utf_8).intern();
            }
            return false;
        }
        
        public final String c() {
            return this.i;
        }
        
        public final boolean c(final String s) {
            final Map<String, String> e = this.e();
            final byte[] array2;
            final byte[] array = array2 = new byte[8];
            array2[0] = 19;
            array2[1] = 110;
            array2[2] = -116;
            array2[3] = 25;
            array2[4] = -44;
            array2[5] = -4;
            array2[6] = 100;
            array2[7] = 15;
            a(array, new byte[] { 68, 63, -24, -106, -116, -51, 0, -125 });
            final Charset utf_8 = StandardCharsets.UTF_8;
            final String intern = new String(array, utf_8).intern();
            final LinkedHashMap linkedHashMap = (LinkedHashMap)e;
            final String s2 = (String)linkedHashMap.get((Object)intern);
            boolean b = true;
            if (s2 == null || !StringsKt.contains$default((CharSequence)s2, (CharSequence)s, false, 2, (Object)null)) {
                final byte[] array4;
                final byte[] array3 = array4 = new byte[10];
                array4[0] = -46;
                array4[1] = 112;
                array4[2] = 72;
                array4[3] = -65;
                array4[4] = 107;
                array4[5] = 98;
                array4[6] = 66;
                array4[7] = 79;
                array4[8] = 81;
                array4[9] = 3;
                a(array3, new byte[] { -88, 79, 22, -13, -16, 113, 22, 71, 60, 102 });
                final String s3 = (String)linkedHashMap.get((Object)new String(array3, utf_8).intern());
                if (s3 == null || !StringsKt.contains$default((CharSequence)s3, (CharSequence)s, false, 2, (Object)null)) {
                    final byte[] array6;
                    final byte[] array5 = array6 = new byte[9];
                    array6[0] = -58;
                    array6[1] = 17;
                    array6[2] = -96;
                    array6[3] = -94;
                    array6[4] = 117;
                    array6[5] = 58;
                    array6[6] = 46;
                    array6[7] = -121;
                    array6[8] = 55;
                    a(array5, new byte[] { -103, -92, -72, -33, 3, 120, 91, 7, 83 });
                    final String s4 = (String)linkedHashMap.get((Object)new String(array5, utf_8).intern());
                    if (s4 == null || !StringsKt.contains$default((CharSequence)s4, (CharSequence)s, false, 2, (Object)null)) {
                        b = false;
                    }
                }
            }
            return b;
        }
        
        public final String d() {
            return this.h;
        }
        
        public final boolean d(final String s) {
            try {
                return Intrinsics.areEqual((Object)s, (Object)Build.DEVICE);
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = 46;
                array2[1] = 105;
                array2[2] = -34;
                array2[3] = 111;
                array2[4] = -124;
                array2[5] = 95;
                array2[6] = -78;
                array2[7] = 110;
                array2[8] = -34;
                array2[9] = -48;
                array2[10] = 17;
                array2[11] = -105;
                array2[12] = -112;
                array2[13] = 31;
                array2[14] = 39;
                array2[15] = 23;
                a(array, new byte[] { 73, 54, 119, 51, -48, 103, -34, 32, -92, -20, 95, -21, -53, -99, 50, 126 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[40];
                array4[0] = -54;
                array4[1] = -90;
                array4[2] = -4;
                array4[3] = -83;
                array4[4] = 94;
                array4[5] = 13;
                array4[6] = -106;
                array4[7] = 77;
                array4[8] = -127;
                array4[9] = 96;
                array4[10] = -8;
                array4[11] = 85;
                array4[12] = 99;
                array4[13] = 108;
                array4[14] = -22;
                array4[15] = 64;
                array4[16] = -28;
                array4[17] = 58;
                array4[18] = -84;
                array4[19] = -106;
                array4[20] = 113;
                array4[21] = -119;
                array4[22] = 67;
                array4[23] = 110;
                array4[24] = 53;
                array4[25] = -101;
                array4[26] = 51;
                array4[27] = 2;
                array4[28] = 104;
                array4[29] = 85;
                array4[30] = -73;
                array4[31] = -41;
                array4[32] = -86;
                array4[33] = -41;
                array4[34] = 1;
                array4[35] = 60;
                array4[36] = -32;
                array4[37] = 122;
                array4[38] = -55;
                array4[39] = -35;
                a(array3, new byte[] { 120, 4, 121, -37, 21, 93, -53, 62, -47, 60, -121, -114, -21, 62, 115, 62, -128, 121, -81, 17, -1, -40, -21, 51, 69, 39, 66, 69, 21, 64, -53, -73, -46, -62, 11, 115, 114, 79, -113, -46 });
                new String(array3, utf_8).intern();
                return false;
            }
        }
        
        public final Map<String, String> e() {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                final byte[] array2;
                final byte[] array = array2 = new byte[13];
                array2[0] = 91;
                array2[1] = 3;
                array2[2] = 48;
                array2[3] = 30;
                array2[4] = -127;
                array2[5] = 0;
                array2[6] = -37;
                array2[7] = -2;
                array2[8] = 11;
                array2[9] = -59;
                array2[10] = 127;
                array2[11] = -82;
                array2[12] = 11;
                a(array, new byte[] { 93, -93, 44, -118, -53, 95, -94, -89, 103, -36, -5, -32, 100 });
                final InputStreamReader inputStreamReader = new InputStreamReader((InputStream)new FileInputStream(new File(new String(array, StandardCharsets.UTF_8).intern())), Charsets.UTF_8);
                BufferedReader bufferedReader;
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader)inputStreamReader;
                }
                else {
                    bufferedReader = new BufferedReader((Reader)inputStreamReader, 8192);
                }
                try {
                    for (final String s : TextStreamsKt.lineSequence(bufferedReader)) {
                        final byte[] array4;
                        final byte[] array3 = array4 = new byte[2];
                        array4[0] = -61;
                        array4[1] = 125;
                        a(array3, new byte[] { -7, 93, 44, -2, -16, 62, 104, 45 });
                        final List split$default = StringsKt.split$default((CharSequence)s, new String[] { new String(array3, StandardCharsets.UTF_8).intern() }, false, 0, 6, (Object)null);
                        if (split$default.size() > 1) {
                            ((Map)linkedHashMap).put((Object)StringsKt.trim((CharSequence)split$default.get(0)).toString(), (Object)StringsKt.trim((CharSequence)split$default.get(1)).toString());
                        }
                    }
                    final Unit instance = Unit.INSTANCE;
                    CloseableKt.closeFinally((Closeable)bufferedReader, (Throwable)null);
                }
                finally {
                    try {}
                    finally {
                        final Throwable t;
                        CloseableKt.closeFinally((Closeable)bufferedReader, t);
                    }
                }
                return (Map<String, String>)linkedHashMap;
            }
            catch (final Exception ex) {
                return (Map<String, String>)linkedHashMap;
            }
        }
        
        public final boolean e(final String s) {
            try {
                final String hardware = Build.HARDWARE;
                if (hardware != null) {
                    return StringsKt.contains$default((CharSequence)hardware, (CharSequence)s, false, 2, (Object)null);
                }
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = 6;
                array2[1] = 120;
                array2[2] = -56;
                array2[3] = 18;
                array2[4] = -27;
                array2[5] = -14;
                array2[6] = 117;
                array2[7] = 40;
                array2[8] = -4;
                array2[9] = -61;
                array2[10] = 49;
                array2[11] = -104;
                array2[12] = -119;
                array2[13] = -84;
                array2[14] = -92;
                array2[15] = 118;
                a(array, new byte[] { 49, 71, -123, -128, 111, -54, 29, 90, -126, -33, 63, -10, -28, 14, -74, 29 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[42];
                array4[0] = -54;
                array4[1] = 115;
                array4[2] = 54;
                array4[3] = 36;
                array4[4] = 89;
                array4[5] = -96;
                array4[6] = 49;
                array4[7] = 40;
                array4[8] = -44;
                array4[9] = 5;
                array4[10] = -29;
                array4[11] = -28;
                array4[12] = -21;
                array4[13] = 46;
                array4[14] = -39;
                array4[15] = -92;
                array4[16] = -6;
                array4[17] = 50;
                array4[18] = -69;
                array4[19] = 21;
                array4[20] = -91;
                array4[21] = 99;
                array4[22] = 101;
                array4[23] = -37;
                array4[24] = -30;
                array4[25] = 5;
                array4[26] = -7;
                array4[27] = 105;
                array4[28] = 41;
                array4[29] = 76;
                array4[30] = -23;
                array4[31] = -80;
                array4[32] = 25;
                array4[33] = -99;
                array4[34] = 119;
                array4[35] = 37;
                array4[36] = 40;
                array4[37] = 1;
                array4[38] = -49;
                array4[39] = -50;
                array4[40] = 119;
                array4[41] = 3;
                a(array3, new byte[] { 120, 49, 46, 100, 20, -80, 48, 89, -90, -103, 112, -35, 115, 125, -92, -38, 114, 113, -68, -108, -85, 115, 17, -57, 116, -103, -121, 96, 74, 61, -91, 13, 55, 12, 16, 121, -15, -106, -112, -60, 27, 103 });
                new String(array3, utf_8).intern();
            }
            return false;
        }
        
        public final String f() {
            return this.c;
        }
        
        public final boolean f(final String s) {
            try {
                return Intrinsics.areEqual((Object)s, (Object)Build.MODEL);
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = -99;
                array2[1] = -16;
                array2[2] = -42;
                array2[3] = -54;
                array2[4] = -86;
                array2[5] = -67;
                array2[6] = 60;
                array2[7] = -84;
                array2[8] = 77;
                array2[9] = -100;
                array2[10] = 26;
                array2[11] = -2;
                array2[12] = 40;
                array2[13] = -95;
                array2[14] = 96;
                array2[15] = -124;
                a(array, new byte[] { -68, -49, 111, -40, -78, 5, 101, -34, 17, 32, 105, -44, 67, 3, -6, 14 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[39];
                array4[0] = -107;
                array4[1] = -37;
                array4[2] = -92;
                array4[3] = 88;
                array4[4] = 45;
                array4[5] = -122;
                array4[6] = 63;
                array4[7] = -112;
                array4[8] = 38;
                array4[9] = -117;
                array4[10] = -61;
                array4[11] = -32;
                array4[12] = 10;
                array4[13] = 39;
                array4[14] = -67;
                array4[15] = 69;
                array4[16] = -101;
                array4[17] = 1;
                array4[18] = -81;
                array4[19] = 8;
                array4[20] = 60;
                array4[21] = -106;
                array4[22] = -8;
                array4[23] = -41;
                array4[24] = -112;
                array4[25] = 15;
                array4[26] = 38;
                array4[27] = -13;
                array4[28] = -3;
                array4[29] = -74;
                array4[30] = -22;
                array4[31] = -96;
                array4[32] = 86;
                array4[33] = 25;
                array4[34] = 19;
                array4[35] = 13;
                array4[36] = 104;
                array4[37] = -37;
                array4[38] = 70;
                a(array3, new byte[] { -71, -39, -64, 80, 72, -42, 50, 17, 56, 23, -111, -39, 84, 116, -56, 57, -47, -94, -80, 127, 68, -26, -92, -69, -30, -109, 44, -10, -103, 41, -103, -2, 3, 105, 95, 125, 13, -73, 34 });
                new String(array3, utf_8).intern();
                return false;
            }
        }
        
        public final String g() {
            return this.d;
        }
        
        public final boolean g(final String s) {
            try {
                final String product = Build.PRODUCT;
                if (product != null) {
                    return StringsKt.contains$default((CharSequence)product, (CharSequence)s, false, 2, (Object)null);
                }
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = 46;
                array2[1] = -18;
                array2[2] = 31;
                array2[3] = 77;
                array2[4] = -82;
                array2[5] = -57;
                array2[6] = -71;
                array2[7] = 82;
                array2[8] = 127;
                array2[9] = 66;
                array2[10] = -1;
                array2[11] = -90;
                array2[12] = 69;
                array2[13] = 98;
                array2[14] = 100;
                array2[15] = 111;
                a(array, new byte[] { 73, -79, 54, 81, -74, -33, -23, 84, 3, 94, -123, -4, 32, 64, -11, 53 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[41];
                array4[0] = -9;
                array4[1] = 28;
                array4[2] = 13;
                array4[3] = 90;
                array4[4] = -80;
                array4[5] = -108;
                array4[6] = 115;
                array4[7] = 101;
                array4[8] = 76;
                array4[9] = 63;
                array4[10] = -101;
                array4[11] = 108;
                array4[12] = -116;
                array4[13] = -50;
                array4[14] = -67;
                array4[15] = -61;
                array4[16] = -12;
                array4[17] = 78;
                array4[18] = 27;
                array4[19] = -76;
                array4[20] = 79;
                array4[21] = -107;
                array4[22] = -23;
                array4[23] = -74;
                array4[24] = -95;
                array4[25] = -18;
                array4[26] = 127;
                array4[27] = 29;
                array4[28] = -11;
                array4[29] = -60;
                array4[30] = 55;
                array4[31] = -109;
                array4[32] = 23;
                array4[33] = -70;
                array4[34] = 87;
                array4[35] = 69;
                array4[36] = 73;
                array4[37] = -108;
                array4[38] = 127;
                array4[39] = -97;
                array4[40] = -108;
                a(array3, new byte[] { -101, -98, 105, 78, -85, -28, -18, 37, 14, -125, -24, 101, -42, -35, -56, -65, 112, 109, 92, -13, 17, -27, -107, -36, -79, -78, 5, 76, -114, -58, 98, -16, 43, 41, -18, 125, 24, 45, 5, 12, -16 });
                new String(array3, utf_8).intern();
            }
            return false;
        }
        
        public final String h() {
            return this.e;
        }
        
        public final boolean h(final String s) {
            try {
                return Intrinsics.areEqual((Object)Build$VERSION.RELEASE, (Object)s);
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                final byte[] array2;
                final byte[] array = array2 = new byte[16];
                array2[0] = 41;
                array2[1] = 121;
                array2[2] = -27;
                array2[3] = -15;
                array2[4] = 70;
                array2[5] = 122;
                array2[6] = 52;
                array2[7] = -56;
                array2[8] = 113;
                array2[9] = -15;
                array2[10] = -22;
                array2[11] = 102;
                array2[12] = 24;
                array2[13] = 101;
                array2[14] = -98;
                array2[15] = -115;
                a(array, new byte[] { 80, 70, -96, -99, 14, 66, 92, -70, -3, -52, 120, 60, 83, 71, -37, 24 });
                final Charset utf_8 = StandardCharsets.UTF_8;
                new String(array, utf_8).intern();
                final byte[] array4;
                final byte[] array3 = array4 = new byte[49];
                array4[0] = -19;
                array4[1] = 20;
                array4[2] = 45;
                array4[3] = -19;
                array4[4] = -74;
                array4[5] = -28;
                array4[6] = 17;
                array4[7] = 86;
                array4[8] = -36;
                array4[9] = -37;
                array4[10] = -16;
                array4[11] = 100;
                array4[12] = 61;
                array4[13] = -65;
                array4[14] = 122;
                array4[15] = -2;
                array4[16] = 9;
                array4[17] = 2;
                array4[18] = -21;
                array4[19] = -70;
                array4[20] = 98;
                array4[21] = 105;
                array4[22] = -60;
                array4[23] = -38;
                array4[24] = -103;
                array4[25] = 64;
                array4[26] = 51;
                array4[27] = 66;
                array4[28] = 0;
                array4[29] = -77;
                array4[30] = 21;
                array4[31] = -84;
                array4[32] = 62;
                array4[33] = -69;
                array4[34] = 18;
                array4[35] = 118;
                array4[36] = 25;
                array4[37] = 46;
                array4[38] = 80;
                array4[39] = 66;
                array4[40] = -75;
                array4[41] = 94;
                array4[42] = 45;
                array4[43] = 52;
                array4[44] = 15;
                array4[45] = 95;
                array4[46] = -128;
                array4[47] = -122;
                array4[48] = 108;
                a(array3, new byte[] { -111, -106, 73, -101, -83, -12, 80, 87, -98, -25, 127, 93, 69, 12, 4, -76, 99, -95, 108, -19, -18, 120, 112, -56, -39, 92, 65, -123, 63, 38, 50, 24, 96, 36, 71, 113, 52, -101, 6, 32, -35, 61, 82, 45, 82, 102, -49, 3, 8 });
                new String(array3, utf_8).intern();
                return false;
            }
        }
        
        public final String i() {
            return this.b;
        }
        
        public final void i(final String i) {
            this.i = i;
        }
        
        public final String j() {
            return this.f;
        }
        
        public final String k() {
            return this.a;
        }
        
        public final String l() {
            return this.g;
        }
        
        public final JSONObject m() {
            final JSONObject jsonObject = new JSONObject();
            try {
                if (this.a != null) {
                    final byte[] array2;
                    final byte[] array = array2 = new byte[7];
                    array2[0] = 93;
                    array2[1] = 58;
                    array2[2] = -62;
                    array2[3] = 34;
                    array2[4] = -73;
                    array2[5] = 45;
                    array2[6] = -50;
                    a(array, new byte[] { 22, 120, -105, 95, -62, 78, -70, 89 });
                    jsonObject.put(new String(array, StandardCharsets.UTF_8).intern(), (Object)this.a);
                }
                if (this.b != null) {
                    final byte[] array4;
                    final byte[] array3 = array4 = new byte[8];
                    array4[0] = 97;
                    array4[1] = -63;
                    array4[2] = 81;
                    array4[3] = 112;
                    array4[4] = 99;
                    array4[5] = -78;
                    array4[6] = 107;
                    array4[7] = -31;
                    a(array3, new byte[] { -14, -49, 13, 45, -3, 2, 4, -99 });
                    jsonObject.put(new String(array3, StandardCharsets.UTF_8).intern(), (Object)this.b);
                }
                if (this.c != null) {
                    final byte[] array6;
                    final byte[] array5 = array6 = new byte[5];
                    array6[0] = -10;
                    array6[1] = 91;
                    array6[2] = -34;
                    array6[3] = -37;
                    array6[4] = -50;
                    a(array5, new byte[] { 125, 100, -87, -62, -86, 66, -67, 104 });
                    jsonObject.put(new String(array5, StandardCharsets.UTF_8).intern(), (Object)this.c);
                }
                if (this.d != null) {
                    final byte[] array8;
                    final byte[] array7 = array8 = new byte[6];
                    array8[0] = 51;
                    array8[1] = 101;
                    array8[2] = -40;
                    array8[3] = 121;
                    array8[4] = 23;
                    array8[5] = -90;
                    a(array7, new byte[] { 57, 69, -105, 81, 117, -49, -68, -46 });
                    jsonObject.put(new String(array7, StandardCharsets.UTF_8).intern(), (Object)this.d);
                }
                if (this.e != null) {
                    final byte[] array10;
                    final byte[] array9 = array10 = new byte[6];
                    array10[0] = 103;
                    array10[1] = 52;
                    array10[2] = 118;
                    array10[3] = 5;
                    array10[4] = 54;
                    array10[5] = 43;
                    a(array9, new byte[] { -20, -128, -22, -124, 85, 78, -8, -83 });
                    jsonObject.put(new String(array9, StandardCharsets.UTF_8).intern(), (Object)this.e);
                }
                if (this.f != null) {
                    final byte[] array12;
                    final byte[] array11 = array12 = new byte[5];
                    array12[0] = -96;
                    array12[1] = 83;
                    array12[2] = 41;
                    array12[3] = -41;
                    array12[4] = 92;
                    a(array11, new byte[] { -74, 108, 55, -53, 48, -78, 39, -59 });
                    jsonObject.put(new String(array11, StandardCharsets.UTF_8).intern(), (Object)this.f);
                }
                if (this.g != null) {
                    final byte[] array14;
                    final byte[] array13 = array14 = new byte[7];
                    array14[0] = -77;
                    array14[1] = -49;
                    array14[2] = -108;
                    array14[3] = -93;
                    array14[4] = -108;
                    array14[5] = -65;
                    array14[6] = 29;
                    a(array13, new byte[] { -86, -38, -30, -33, -11, -52, 120, 47 });
                    jsonObject.put(new String(array13, StandardCharsets.UTF_8).intern(), (Object)this.g);
                }
                if (this.h != null) {
                    final byte[] array16;
                    final byte[] array15 = array16 = new byte[9];
                    array16[0] = -119;
                    array16[1] = -2;
                    array16[2] = -10;
                    array16[3] = -70;
                    array16[4] = -14;
                    array16[5] = 118;
                    array16[6] = 99;
                    array16[7] = -86;
                    array16[8] = 63;
                    a(array15, new byte[] { -45, -66, 109, 5, -128, 72, -15, -35, 77 });
                    jsonObject.put(new String(array15, StandardCharsets.UTF_8).intern(), (Object)this.h);
                }
                return jsonObject;
            }
            catch (final JSONException ex) {
                return jsonObject;
            }
        }
        
        public static final class a
        {
            public a() {
            }
            
            public a(final DefaultConstructorMarker defaultConstructorMarker) {
            }
        }
    }
}
