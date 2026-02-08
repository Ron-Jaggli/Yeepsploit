package bitter.jnibridge;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JNIBridge
{
    static void disableInterfaceProxy(final Object o) {
        if (o != null) {
            final a a = (a)Proxy.getInvocationHandler(o);
            final Object[] -$$Nest$fgeta = bitter.jnibridge.a.-$$Nest$fgeta(a);
            synchronized (-$$Nest$fgeta) {
                bitter.jnibridge.a.-$$Nest$fputb(a, 0L);
            }
        }
    }
    
    static native Object invoke(final long p0, final Class p1, final Method p2, final Object[] p3);
    
    static Object newInterfaceProxy(final long n, final Class[] array) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), array, (InvocationHandler)new a(n));
    }
}
