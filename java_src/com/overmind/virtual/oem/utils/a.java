package com.overmind.virtual.oem.utils;

import com.join.mgps.Util.h0;
import com.umeng.analytics.pro.bm;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: Reflect.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f57887a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57888b = true;

    /* compiled from: Reflect.java */
    /* renamed from: com.overmind.virtual.oem.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0581a implements InvocationHandler {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f57889b;

        C0581a(boolean z4) {
            this.f57889b = z4;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                return a.w(a.this.f57887a).call(name, objArr).o();
            } catch (ReflectException e5) {
                if (this.f57889b) {
                    Map map = (Map) a.this.f57887a;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith("get")) {
                        return map.get(a.D(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith(bm.ae)) {
                        return map.get(a.D(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(a.D(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Reflect.java */
    /* loaded from: classes5.dex */
    public static class b {
        private b() {
        }
    }

    private a(Class<?> cls) {
        this.f57887a = cls;
    }

    private static a A(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            c(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return w(obj);
            }
            return w(method.invoke(obj, objArr));
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String D(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    private Method F(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Method[] methods;
        Method[] declaredMethods;
        Class<?> G = G();
        for (Method method : G.getMethods()) {
            if (r(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : G.getDeclaredMethods()) {
                if (r(method2, str, clsArr)) {
                    return method2;
                }
            }
            G = G.getSuperclass();
        } while (G != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + G() + h0.f27805a);
    }

    private static Class<?>[] H(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            clsArr[i4] = obj == null ? b.class : obj.getClass();
        }
        return clsArr;
    }

    private static Object I(Object obj) {
        return obj instanceof a ? ((a) obj).o() : obj;
    }

    public static Class<?> J(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            return Void.TYPE == cls ? Void.class : cls;
        }
        return cls;
    }

    public static <T extends AccessibleObject> T c(T t4) {
        if (t4 == null) {
            return null;
        }
        if (t4 instanceof Member) {
            Member member = (Member) t4;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t4;
            }
        }
        if (!t4.isAccessible()) {
            t4.setAccessible(true);
        }
        return t4;
    }

    public static Object h(Class<?> cls) {
        Class<?> J = J(cls);
        if (J != null && J.isPrimitive()) {
            if (Boolean.class == J) {
                return Boolean.FALSE;
            }
            if (Number.class.isAssignableFrom(J)) {
                return 0;
            }
            if (Character.class == J) {
                return (char) 0;
            }
        }
        return null;
    }

    private Field k(String str) throws ReflectException {
        Class<?> G = G();
        try {
            return G.getField(str);
        } catch (NoSuchFieldException e5) {
            do {
                try {
                    return (Field) c(G.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    G = G.getSuperclass();
                    if (G == null) {
                        throw new ReflectException(e5);
                    }
                }
            } while (G == null);
            throw new ReflectException(e5);
        }
    }

    private static Class<?> m(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    private static Class<?> n(String str, ClassLoader classLoader) throws ReflectException {
        try {
            return Class.forName(str, true, classLoader);
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public static String q(Method method) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(Modifier.toString(method.getModifiers()));
        sb.append(" ");
        sb.append(method.getReturnType().getName());
        sb.append(" ");
        sb.append(method.getName());
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> cls : parameterTypes) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        if (parameterTypes.length > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(")");
        return sb.toString();
    }

    private boolean r(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && s(method.getParameterTypes(), clsArr);
    }

    private boolean s(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            for (int i4 = 0; i4 < clsArr2.length; i4++) {
                if (clsArr2[i4] != b.class && !J(clsArr[i4]).isAssignableFrom(J(clsArr2[i4]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean t(Class<?>[] clsArr) {
        return clsArr.length > 0 && clsArr[0].isAssignableFrom(Object[].class);
    }

    private boolean u(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && t(method.getParameterTypes());
    }

    public static a v(Class<?> cls) {
        return new a(cls);
    }

    public static a w(Object obj) {
        return new a(obj);
    }

    public static a x(String str) throws ReflectException {
        return v(m(str));
    }

    public static a y(String str, ClassLoader classLoader) throws ReflectException {
        return v(n(str, classLoader));
    }

    private static a z(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return w(((Constructor) c(constructor)).newInstance(objArr));
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public <T> T B(String str) {
        try {
            return (T) j(str).o();
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void C() {
        Map<String, a> l4;
        if (this.f57887a == null || (l4 = l()) == null) {
            return;
        }
        for (Map.Entry<String, a> entry : l4.entrySet()) {
            String key = entry.getKey();
            Object obj = entry.getValue().f57887a;
            String obj2 = obj == null ? "null" : obj.toString();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            sb.append(" = ");
            sb.append(obj2);
        }
    }

    public a E(String str, Object obj) throws ReflectException {
        try {
            Field k4 = k(str);
            k4.setAccessible(true);
            k4.set(this.f57887a, I(obj));
            return this;
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public Class<?> G() {
        if (this.f57888b) {
            return (Class) this.f57887a;
        }
        return this.f57887a.getClass();
    }

    public a call(String str) throws ReflectException {
        return call(str, new Object[0]);
    }

    public <P> P d(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0581a(this.f57887a instanceof Map));
    }

    public a e(String str, Object... objArr) throws ReflectException {
        Class<?>[] H = H(objArr);
        Method[] declaredMethods = G().getDeclaredMethods();
        int length = declaredMethods.length;
        Method method = null;
        int i4 = 0;
        char c5 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Method method2 = declaredMethods[i4];
            if (r(method2, str, H)) {
                c5 = 2;
                method = method2;
                break;
            }
            if (u(method2, str, H)) {
                method = method2;
                c5 = 1;
            } else if (method2.getName().equals(str) && method2.getParameterTypes().length == 0 && c5 == 0) {
                method = method2;
            }
            i4++;
        }
        if (method != null) {
            if (c5 == 0) {
                objArr = new Object[0];
            }
            if (c5 == 1) {
                objArr = new Object[]{objArr};
            }
            return A(method, this.f57887a, objArr);
        }
        throw new ReflectException("no method found for " + str, new NoSuchMethodException("No best method " + str + " with params " + Arrays.toString(H) + " could be found on type " + G() + h0.f27805a));
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && this.f57887a.equals(((a) obj).o());
    }

    public a f() throws ReflectException {
        return g(new Object[0]);
    }

    public a g(Object... objArr) throws ReflectException {
        Constructor<?>[] declaredConstructors;
        Class<?>[] H = H(objArr);
        try {
            return z(G().getDeclaredConstructor(H), objArr);
        } catch (NoSuchMethodException e5) {
            for (Constructor<?> constructor : G().getDeclaredConstructors()) {
                if (s(constructor.getParameterTypes(), H)) {
                    return z(constructor, objArr);
                }
            }
            throw new ReflectException(e5);
        }
    }

    public int hashCode() {
        return this.f57887a.hashCode();
    }

    public Method i(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> G = G();
        try {
            return G.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return G.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    G = G.getSuperclass();
                    if (G == null) {
                        throw new NoSuchMethodException();
                    }
                }
            } while (G == null);
            throw new NoSuchMethodException();
        }
    }

    public a j(String str) throws ReflectException {
        try {
            return w(k(str).get(this.f57887a));
        } catch (Exception e5) {
            throw new ReflectException(this.f57887a.getClass().getName(), e5);
        }
    }

    public Map<String, a> l() {
        Field[] declaredFields;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> G = G();
        do {
            for (Field field : G.getDeclaredFields()) {
                if ((!this.f57888b) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, j(name));
                    }
                }
            }
            G = G.getSuperclass();
        } while (G != null);
        return linkedHashMap;
    }

    public <T> T o() {
        return (T) this.f57887a;
    }

    public <T> T p(String str) throws ReflectException {
        return (T) j(str).o();
    }

    public String toString() {
        return this.f57887a.toString();
    }

    public a call(String str, Object... objArr) throws ReflectException {
        Class<?>[] H = H(objArr);
        try {
            try {
                return A(i(str, H), this.f57887a, objArr);
            } catch (NoSuchMethodException e5) {
                throw new ReflectException(e5);
            }
        } catch (NoSuchMethodException unused) {
            return A(F(str, H), this.f57887a, objArr);
        }
    }

    private a(Object obj) {
        this.f57887a = obj;
    }
}
