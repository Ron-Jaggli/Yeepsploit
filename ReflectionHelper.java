package com.unity3d.player;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.reflect.Array;

final class ReflectionHelper
{
    protected static boolean LOG;
    protected static final boolean LOGV = false;
    private static Q[] a;
    private static long b;
    private static long c;
    private static boolean d;
    
    static {
        ReflectionHelper.a = new Q[4096];
    }
    
    private static float a(final Class p0, final Class[] p1, final Class[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore          7
        //     4: ldc             0.1
        //     6: fstore          6
        //     8: iload           7
        //    10: ifne            16
        //    13: ldc             0.1
        //    15: freturn        
        //    16: iconst_0       
        //    17: istore          8
        //    19: aload_1        
        //    20: ifnonnull       29
        //    23: iconst_0       
        //    24: istore          7
        //    26: goto            33
        //    29: aload_1        
        //    30: arraylength    
        //    31: istore          7
        //    33: iload           7
        //    35: iconst_1       
        //    36: iadd           
        //    37: aload_2        
        //    38: arraylength    
        //    39: if_icmpeq       44
        //    42: fconst_0       
        //    43: freturn        
        //    44: aload_1        
        //    45: ifnull          169
        //    48: aload_1        
        //    49: arraylength    
        //    50: istore          9
        //    52: iconst_0       
        //    53: istore          7
        //    55: fconst_1       
        //    56: fstore          4
        //    58: fload           4
        //    60: fstore          5
        //    62: iload           8
        //    64: iload           9
        //    66: if_icmpge       172
        //    69: aload_1        
        //    70: iload           8
        //    72: aaload         
        //    73: astore          11
        //    75: aload_2        
        //    76: iload           7
        //    78: aaload         
        //    79: astore          10
        //    81: aload           11
        //    83: aload           10
        //    85: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    88: ifeq            96
        //    91: fconst_1       
        //    92: fstore_3       
        //    93: goto            154
        //    96: aload           11
        //    98: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   101: ifne            152
        //   104: aload           10
        //   106: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   109: ifne            152
        //   112: aload           11
        //   114: aload           10
        //   116: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   119: astore          12
        //   121: aload           12
        //   123: ifnull          132
        //   126: ldc             0.5
        //   128: fstore_3       
        //   129: goto            154
        //   132: aload           10
        //   134: aload           11
        //   136: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   139: astore          10
        //   141: aload           10
        //   143: ifnull          152
        //   146: ldc             0.1
        //   148: fstore_3       
        //   149: goto            154
        //   152: fconst_0       
        //   153: fstore_3       
        //   154: fload           4
        //   156: fload_3        
        //   157: fmul           
        //   158: fstore          4
        //   160: iinc            8, 1
        //   163: iinc            7, 1
        //   166: goto            58
        //   169: fconst_1       
        //   170: fstore          5
        //   172: aload_2        
        //   173: aload_2        
        //   174: arraylength    
        //   175: iconst_1       
        //   176: isub           
        //   177: aaload         
        //   178: astore_1       
        //   179: aload_0        
        //   180: aload_1        
        //   181: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   184: ifeq            192
        //   187: fconst_1       
        //   188: fstore_3       
        //   189: goto            240
        //   192: aload_0        
        //   193: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   196: ifne            238
        //   199: aload_1        
        //   200: invokevirtual   java/lang/Class.isPrimitive:()Z
        //   203: ifne            238
        //   206: aload_0        
        //   207: aload_1        
        //   208: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   211: astore_2       
        //   212: aload_2        
        //   213: ifnull          222
        //   216: ldc             0.5
        //   218: fstore_3       
        //   219: goto            240
        //   222: aload_1        
        //   223: aload_0        
        //   224: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   227: astore_0       
        //   228: aload_0        
        //   229: ifnull          238
        //   232: fload           6
        //   234: fstore_3       
        //   235: goto            240
        //   238: fconst_0       
        //   239: fstore_3       
        //   240: fload           5
        //   242: fload_3        
        //   243: fmul           
        //   244: freturn        
        //   245: astore          12
        //   247: goto            132
        //   250: astore          10
        //   252: goto            152
        //   255: astore_2       
        //   256: goto            222
        //   259: astore_0       
        //   260: goto            238
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  112    121    245    250    Ljava/lang/ClassCastException;
        //  132    141    250    255    Ljava/lang/ClassCastException;
        //  206    212    255    259    Ljava/lang/ClassCastException;
        //  222    228    259    263    Ljava/lang/ClassCastException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException: Attempt to invoke virtual method 'm5.p0 m5.v1.S()' on a null object reference
        //     at k5.v.o(SourceFile:28)
        //     at k5.v$b.t(SourceFile:103)
        //     at k5.v$b.a(SourceFile:11)
        //     at w5.a.P(SourceFile:168)
        //     at w5.a.j(SourceFile:193)
        //     at a6.j.j(SourceFile:23)
        //     at a6.j.i(SourceFile:28)
        //     at a6.i.n(SourceFile:7)
        //     at a6.i.m(SourceFile:174)
        //     at a6.i.c(SourceFile:67)
        //     at a6.i.r(SourceFile:328)
        //     at a6.i.s(SourceFile:17)
        //     at a6.i.q(SourceFile:29)
        //     at a6.i.b(SourceFile:33)
        //     at y5.d.e(SourceFile:6)
        //     at y5.d.b(SourceFile:1)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(SourceFile:306)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:131)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
        //     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
        //     at e7.a.run(SourceFile:1)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1154)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:652)
        //     at java.lang.Thread.run(Thread.java:1563)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static Class a(String className, final int[] array) {
        Label_0233: {
            int index = 0;
            Label_0068: {
                while (array[0] < className.length()) {
                    final int n = array[0];
                    array[0] = n + 1;
                    final char char1 = className.charAt(n);
                    if (char1 == '(') {
                        continue;
                    }
                    if (char1 == ')') {
                        continue;
                    }
                    if (char1 != 'L') {
                        break Label_0233;
                    }
                    index = className.indexOf(59, array[0]);
                    if (index == -1) {
                        break Label_0233;
                    }
                    break Label_0068;
                }
                break Label_0233;
            }
            className = className.substring(array[0], index);
            array[0] = index + 1;
            className = className.replace('/', '.');
            try {
                return Class.forName(className);
                final char char1;
                iftrue(Label_0109:)(char1 != 'Z');
                return Boolean.TYPE;
                Label_0119: {
                    iftrue(Label_0129:)(char1 != 'F');
                }
                return Float.TYPE;
                Label_0129:
                iftrue(Label_0139:)(char1 != 'V');
                return Void.TYPE;
                Label_0169:
                iftrue(Label_0179:)(char1 != 'J');
                return Long.TYPE;
                Label_0109:
                iftrue(Label_0119:)(char1 != 'I');
                return Integer.TYPE;
                Label_0179:
                iftrue(Label_0189:)(char1 != 'D');
                return Double.TYPE;
                Label_0149:
                iftrue(Label_0159:)(char1 != 'C');
                return Character.TYPE;
                Label_0189:
                iftrue(Label_0208:)(char1 != '[');
                return Array.newInstance(a(className, array), 0).getClass();
                return null;
                Label_0159:
                iftrue(Label_0169:)(char1 != 'S');
                return Short.TYPE;
                Label_0208:
                D.Log(5, "! parseType; " + char1 + " is not known!");
                return null;
                Label_0139:
                iftrue(Label_0149:)(char1 != 'B');
                return Byte.TYPE;
            }
            catch (final ClassNotFoundException ex) {
                return null;
            }
        }
    }
    
    private static boolean a(final Q q) {
        synchronized (ReflectionHelper.class) {
            final Q q2 = ReflectionHelper.a[Q.-$$Nest$fgetd(q) & 0xFFF];
            if (!q.equals(q2)) {
                return false;
            }
            q.e = q2.e;
            return true;
        }
    }
    
    private static Class[] a(final String s) {
        int n = 0;
        final int[] array = { 0 };
        final ArrayList list = new ArrayList();
        while (array[0] < s.length()) {
            final Class a = a(s, array);
            if (a == null) {
                break;
            }
            list.add((Object)a);
        }
        final Class[] array2 = new Class[list.size()];
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            array2[n] = (Class)iterator.next();
            ++n;
        }
        return array2;
    }
    
    protected static boolean beginProxyCall(final long n) {
        synchronized (ReflectionHelper.class) {
            if (n == ReflectionHelper.b) {
                ++ReflectionHelper.c;
                return true;
            }
            return false;
        }
    }
    
    protected static Object createInvocationError(final long n, final boolean b) {
        return new S(n, b);
    }
    
    protected static void endProxyCall() {
        synchronized (ReflectionHelper.class) {
            if (0L == --ReflectionHelper.c && ReflectionHelper.d) {
                ReflectionHelper.class.notifyAll();
            }
        }
    }
    
    protected static void endUnityLaunch() {
        final Class<ReflectionHelper> clazz;
        monitorenter(clazz = ReflectionHelper.class);
        try {
            try {
                ++ReflectionHelper.b;
                ReflectionHelper.d = true;
                while (ReflectionHelper.c > 0L) {
                    ReflectionHelper.class.wait();
                }
            }
            finally {
                monitorexit(clazz);
                ReflectionHelper.d = false;
                monitorexit(clazz);
            }
        }
        catch (final InterruptedException ex) {}
    }
    
    protected static Constructor getConstructorID(final Class clazz, final String s) {
        final Q q = new Q(clazz, "", s);
        Label_0161: {
            if (a(q)) {
                final Constructor constructor = (Constructor)q.e;
                break Label_0161;
            }
            final Class[] a = a(s);
            final Constructor[] constructors = clazz.getConstructors();
            final int length = constructors.length;
            Object o = null;
            float n = 0.0f;
            int n2 = 0;
            Object e;
            while (true) {
                e = o;
                if (n2 >= length) {
                    break;
                }
                e = constructors[n2];
                final float a2 = a(Void.TYPE, ((Constructor)e).getParameterTypes(), a);
                float n3 = n;
                if (a2 > n) {
                    if (a2 == 1.0f) {
                        break;
                    }
                    o = e;
                    n3 = a2;
                }
                ++n2;
                n = n3;
            }
            synchronized (ReflectionHelper.class) {
                q.e = (Member)e;
                ReflectionHelper.a[Q.-$$Nest$fgetd(q) & 0xFFF] = q;
                monitorexit(ReflectionHelper.class);
                final Constructor constructor = (Constructor)e;
                if (constructor != null) {
                    return constructor;
                }
                throw new NoSuchMethodError("<init>" + s + " in class " + clazz.getName());
            }
        }
    }
    
    protected static Field getFieldID(Class clazz, final String s, final String s2, final boolean b) {
        final Q q = new Q(clazz, s, s2);
        Label_0317: {
            if (a(q)) {
                final Object e = q.e;
                break Label_0317;
            }
            final Class[] a = a(s2);
            float n = 0.0f;
            final Member member = null;
            Class superclass = clazz;
            Object o = member;
            Object e;
            while (true) {
                e = o;
                if (superclass == null) {
                    break;
                }
                final Field[] declaredFields = superclass.getDeclaredFields();
                final int length = declaredFields.length;
                int n2 = 0;
                Object o2 = o;
                float n3;
                while (true) {
                    n3 = n;
                    o = o2;
                    if (n2 >= length) {
                        break;
                    }
                    final Field field = declaredFields[n2];
                    float n4;
                    if (b != Modifier.isStatic(field.getModifiers())) {
                        n4 = n;
                        o = o2;
                    }
                    else if (field.getName().compareTo(s) != 0) {
                        n4 = n;
                        o = o2;
                    }
                    else {
                        final float a2 = a(field.getType(), null, a);
                        n4 = n;
                        o = o2;
                        if (a2 > n) {
                            o = field;
                            if (a2 == 1.0f) {
                                n3 = a2;
                                break;
                            }
                            n4 = a2;
                        }
                    }
                    ++n2;
                    n = n4;
                    o2 = o;
                }
                if (n3 == 1.0f) {
                    e = o;
                    break;
                }
                e = o;
                if (superclass.isPrimitive()) {
                    break;
                }
                e = o;
                if (superclass.isInterface()) {
                    break;
                }
                e = o;
                if (superclass.equals(Object.class)) {
                    break;
                }
                if (superclass.equals(Void.TYPE)) {
                    e = o;
                    break;
                }
                superclass = superclass.getSuperclass();
                n = n3;
            }
            synchronized (ReflectionHelper.class) {
                q.e = (Member)e;
                ReflectionHelper.a[Q.-$$Nest$fgetd(q) & 0xFFF] = q;
                monitorexit(ReflectionHelper.class);
                clazz = superclass;
                if (e == null) {
                    String s3;
                    if (b) {
                        s3 = "static";
                    }
                    else {
                        s3 = "non-static";
                    }
                    throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", new Object[] { s3, s, s2, clazz.getName() }));
                }
                return (Field)e;
            }
        }
    }
    
    protected static String getFieldSignature(final Field field) {
        final Class type = field.getType();
        if (type.isPrimitive()) {
            final String name = type.getName();
            if ("boolean".equals((Object)name)) {
                return "Z";
            }
            if ("byte".equals((Object)name)) {
                return "B";
            }
            if ("char".equals((Object)name)) {
                return "C";
            }
            if ("double".equals((Object)name)) {
                return "D";
            }
            if ("float".equals((Object)name)) {
                return "F";
            }
            if ("int".equals((Object)name)) {
                return "I";
            }
            if ("long".equals((Object)name)) {
                return "J";
            }
            String s = name;
            if ("short".equals((Object)name)) {
                s = "S";
            }
            return s;
        }
        else {
            if (type.isArray()) {
                return type.getName().replace('.', '/');
            }
            return "L" + type.getName().replace('.', '/') + ";";
        }
    }
    
    protected static Method getMethodID(Class clazz, final String s, final String s2, final boolean b) {
        final Q q = new Q(clazz, s, s2);
        Label_0304: {
            if (a(q)) {
                final Object o = q.e;
                break Label_0304;
            }
            final Class[] a = a(s2);
            final Member member = null;
            float n = 0.0f;
            Class superclass = clazz;
            Object o2 = member;
            Object e;
            while (true) {
                e = o2;
                if (superclass == null) {
                    break;
                }
                final Method[] declaredMethods = superclass.getDeclaredMethods();
                final int length = declaredMethods.length;
                int n2 = 0;
                Object o3 = o2;
                float a2;
                while (true) {
                    o2 = o3;
                    a2 = n;
                    if (n2 >= length) {
                        break;
                    }
                    o2 = declaredMethods[n2];
                    float n3;
                    if (b != Modifier.isStatic(((Method)o2).getModifiers())) {
                        n3 = n;
                    }
                    else if (((Method)o2).getName().compareTo(s) != 0) {
                        n3 = n;
                    }
                    else {
                        a2 = a(((Method)o2).getReturnType(), ((Method)o2).getParameterTypes(), a);
                        n3 = n;
                        if (a2 > n) {
                            if (a2 == 1.0f) {
                                break;
                            }
                            n3 = a2;
                            o3 = o2;
                        }
                    }
                    ++n2;
                    n = n3;
                }
                if (a2 == 1.0f) {
                    e = o2;
                    break;
                }
                e = o2;
                if (superclass.isPrimitive()) {
                    break;
                }
                e = o2;
                if (superclass.isInterface()) {
                    break;
                }
                e = o2;
                if (superclass.equals(Object.class)) {
                    break;
                }
                if (superclass.equals(Void.TYPE)) {
                    e = o2;
                    break;
                }
                superclass = superclass.getSuperclass();
                n = a2;
            }
            synchronized (ReflectionHelper.class) {
                q.e = (Member)e;
                ReflectionHelper.a[Q.-$$Nest$fgetd(q) & 0xFFF] = q;
                monitorexit(ReflectionHelper.class);
                clazz = superclass;
                final Object o = e;
                if (o == null) {
                    String s3;
                    if (b) {
                        s3 = "static";
                    }
                    else {
                        s3 = "non-static";
                    }
                    throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", new Object[] { s3, s, s2, clazz.getName() }));
                }
                return (Method)o;
            }
        }
    }
    
    private static native void nativeProxyFinalize(final long p0);
    
    private static native Object nativeProxyInvoke(final long p0, final String p1, final Object[] p2);
    
    private static native void nativeProxyJNIFreeGCHandle(final long p0);
    
    private static native void nativeProxyLogJNIInvokeException(final long p0);
    
    protected static Object newProxyInstance(final UnityPlayer unityPlayer, final long n, final Class clazz) {
        return newProxyInstance(unityPlayer, n, new Class[] { clazz });
    }
    
    protected static Object newProxyInstance(final UnityPlayer unityPlayer, final long n, final Class[] array) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), array, (InvocationHandler)new P(unityPlayer, n));
    }
}
