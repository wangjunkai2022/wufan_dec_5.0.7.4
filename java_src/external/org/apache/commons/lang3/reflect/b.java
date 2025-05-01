package external.org.apache.commons.lang3.reflect;

import external.org.apache.commons.lang3.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: MethodUtils.java */
/* loaded from: classes6.dex */
public class b {
    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return b(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method b(Method method) {
        if (a.e(method)) {
            Class<?> declaringClass = method.getDeclaringClass();
            if (Modifier.isPublic(declaringClass.getModifiers())) {
                return method;
            }
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            Method c5 = c(declaringClass, name, parameterTypes);
            return c5 == null ? d(declaringClass, name, parameterTypes) : c5;
        }
        return null;
    }

    private static Method c(Class<?> cls, String str, Class<?>... clsArr) {
        Method method = null;
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i4 = 0; i4 < interfaces.length; i4++) {
                if (Modifier.isPublic(interfaces[i4].getModifiers())) {
                    try {
                        method = interfaces[i4].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                    }
                    if (method == null && (method = c(interfaces[i4], str, clsArr)) == null) {
                    }
                    cls = cls.getSuperclass();
                }
            }
            cls = cls.getSuperclass();
        }
        return method;
    }

    private static Method d(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (Modifier.isPublic(superclass.getModifiers())) {
                try {
                    return superclass.getMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static Method e(Class<?> cls, String str, Class<?>... clsArr) {
        Method[] methods;
        Method b5;
        try {
            Method method = cls.getMethod(str, clsArr);
            a.g(method);
            return method;
        } catch (NoSuchMethodException unused) {
            Method method2 = null;
            for (Method method3 : cls.getMethods()) {
                if (method3.getName().equals(str) && d.D(clsArr, method3.getParameterTypes(), true) && (b5 = b(method3)) != null && (method2 == null || a.a(b5.getParameterTypes(), method2.getParameterTypes(), clsArr) < 0)) {
                    method2 = b5;
                }
            }
            if (method2 != null) {
                a.g(method2);
            }
            return method2;
        }
    }

    public static Object f(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i4 = 0; i4 < length; i4++) {
            clsArr[i4] = objArr[i4].getClass();
        }
        return g(obj, str, objArr, clsArr);
    }

    public static Object g(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        if (clsArr == null) {
            clsArr = external.org.apache.commons.lang3.a.f68834b;
        }
        Method a5 = a(obj.getClass(), str, clsArr);
        if (a5 != null) {
            return a5.invoke(obj, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object h(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i4 = 0; i4 < length; i4++) {
            clsArr[i4] = objArr[i4].getClass();
        }
        return i(cls, str, objArr, clsArr);
    }

    public static Object i(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        if (clsArr == null) {
            clsArr = external.org.apache.commons.lang3.a.f68834b;
        }
        Method a5 = a(cls, str, clsArr);
        if (a5 != null) {
            return a5.invoke(null, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }

    public static Object j(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i4 = 0; i4 < length; i4++) {
            clsArr[i4] = objArr[i4].getClass();
        }
        return k(obj, str, objArr, clsArr);
    }

    public static Object k(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null) {
            clsArr = external.org.apache.commons.lang3.a.f68834b;
        }
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        Method e5 = e(obj.getClass(), str, clsArr);
        if (e5 != null) {
            return e5.invoke(obj, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on object: " + obj.getClass().getName());
    }

    public static Object l(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        int length = objArr.length;
        Class[] clsArr = new Class[length];
        for (int i4 = 0; i4 < length; i4++) {
            clsArr[i4] = objArr[i4].getClass();
        }
        return m(cls, str, objArr, clsArr);
    }

    public static Object m(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (clsArr == null) {
            clsArr = external.org.apache.commons.lang3.a.f68834b;
        }
        if (objArr == null) {
            objArr = external.org.apache.commons.lang3.a.f68833a;
        }
        Method e5 = e(cls, str, clsArr);
        if (e5 != null) {
            return e5.invoke(null, objArr);
        }
        throw new NoSuchMethodException("No such accessible method: " + str + "() on class: " + cls.getName());
    }
}
