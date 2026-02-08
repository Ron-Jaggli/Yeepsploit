package bitter.jnibridge;

import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

final class a implements InvocationHandler
{
    private Object[] a;
    private long b;
    
    public a(final long b) {
        this.a = new Object[0];
        this.b = b;
    }
    
    private static Object a(final Object o, final Method method, final Object[] array) {
        Object[] array2 = array;
        if (array == null) {
            array2 = new Object[0];
        }
        final Class declaringClass = method.getDeclaringClass();
        try {
            return MethodHandles.lookup().findSpecial(declaringClass, method.getName(), MethodType.methodType(method.getReturnType(), method.getParameterTypes()), (Class)o.getClass()).bindTo(o).invokeWithArguments(array2);
        }
        catch (final Exception ex) {
            System.err.println("JNIBridge error calling default method: " + ((Throwable)ex).getMessage());
            return null;
        }
    }
    
    public final Object invoke(Object a, final Method method, final Object[] array) {
        final Object[] a2 = this.a;
        synchronized (a2) {
            final long b = this.b;
            if (b == 0L) {
                return null;
            }
            try {
                return JNIBridge.invoke(b, method.getDeclaringClass(), method, array);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                if (method.isDefault()) {
                    a = a(a, method, array);
                    return a;
                }
                System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                throw noSuchMethodError;
            }
        }
    }
}
