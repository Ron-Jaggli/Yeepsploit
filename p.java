package com.unity3d.player;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.invoke.MethodHandles$Lookup;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

final class P implements InvocationHandler
{
    private Runnable a;
    private UnityPlayer b;
    private long c;
    final long d;
    
    P(final UnityPlayer b, final long d) {
        this.d = d;
        final long -$$Nest$sfgetb = ReflectionHelper.-$$Nest$sfgetb();
        this.a = (Runnable)new T(-$$Nest$sfgetb, d);
        this.b = b;
        this.c = -$$Nest$sfgetb;
    }
    
    private static Object a(Object invokeWithArguments, final Method method, final Object[] array, final S s) {
        Object[] array2 = array;
        Label_0013: {
            if (array != null) {
                break Label_0013;
            }
            try {
                try {
                    array2 = new Object[0];
                    final Class declaringClass = method.getDeclaringClass();
                    final java.lang.reflect.Constructor<MethodHandles$Lookup> declaredConstructor = MethodHandles$Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                    ((AccessibleObject)declaredConstructor).setAccessible(true);
                    invokeWithArguments = ((MethodHandles$Lookup)declaredConstructor.newInstance(new Object[] { declaringClass, 2 })).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(invokeWithArguments).invokeWithArguments(array2);
                    final long -$$Nest$fgeta = S.-$$Nest$fgeta(s);
                    if (-$$Nest$fgeta != 0L) {
                        ReflectionHelper.-$$Nest$smnativeProxyJNIFreeGCHandle(-$$Nest$fgeta);
                    }
                    return invokeWithArguments;
                }
                finally {
                    final long -$$Nest$fgeta2 = S.-$$Nest$fgeta(s);
                    if (-$$Nest$fgeta2 != 0L) {
                        ReflectionHelper.-$$Nest$smnativeProxyJNIFreeGCHandle(-$$Nest$fgeta2);
                    }
                }
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {}
        }
    }
    
    @Override
    protected void finalize() {
        this.b.invokeOnMainThread(this.a);
        super.finalize();
    }
    
    public final Object invoke(Object a, final Method method, final Object[] array) {
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            D.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            final Object -$$Nest$smnativeProxyInvoke = ReflectionHelper.-$$Nest$smnativeProxyInvoke(this.d, method.getName(), array);
            if (!(-$$Nest$smnativeProxyInvoke instanceof S)) {
                return -$$Nest$smnativeProxyInvoke;
            }
            final S s = (S)-$$Nest$smnativeProxyInvoke;
            if (S.-$$Nest$fgetb(s) && (method.getModifiers() & 0x400) == 0x0) {
                a = a(a, method, array, s);
                return a;
            }
            ReflectionHelper.-$$Nest$smnativeProxyLogJNIInvokeException(S.-$$Nest$fgeta(s));
            return null;
        }
        finally {
            ReflectionHelper.endProxyCall();
        }
    }
}
