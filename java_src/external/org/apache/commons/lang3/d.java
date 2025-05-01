package external.org.apache.commons.lang3;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: ClassUtils.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final char f68899c = '$';

    /* renamed from: e  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f68901e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f68902f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, String> f68903g;

    /* renamed from: h  reason: collision with root package name */
    private static final Map<String, String> f68904h;

    /* renamed from: a  reason: collision with root package name */
    public static final char f68897a = '.';

    /* renamed from: b  reason: collision with root package name */
    public static final String f68898b = String.valueOf((char) f68897a);

    /* renamed from: d  reason: collision with root package name */
    public static final String f68900d = String.valueOf('$');

    static {
        HashMap hashMap = new HashMap();
        f68901e = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        hashMap.put(cls, cls);
        f68902f = new HashMap();
        for (Class<?> cls2 : hashMap.keySet()) {
            Class<?> cls3 = f68901e.get(cls2);
            if (!cls2.equals(cls3)) {
                f68902f.put(cls3, cls2);
            }
        }
        f68903g = new HashMap();
        f68904h = new HashMap();
        a(MethodReflectParams.INT, "I");
        a("boolean", "Z");
        a("float", "F");
        a(MethodReflectParams.LONG, "J");
        a(MethodReflectParams.SHORT, "S");
        a(MethodReflectParams.BYTE, "B");
        a(MethodReflectParams.DOUBLE, "D");
        a(MethodReflectParams.CHAR, "C");
    }

    public static boolean A(Class<?> cls, Class<?> cls2) {
        return B(cls, cls2, f.j(JavaVersion.JAVA_1_5));
    }

    public static boolean B(Class<?> cls, Class<?> cls2, boolean z4) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z4) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = H(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = L(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (cls2.isPrimitive()) {
                Class cls3 = Integer.TYPE;
                if (cls3.equals(cls)) {
                    return Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                }
                Class cls4 = Long.TYPE;
                if (cls4.equals(cls)) {
                    return Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2);
                } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                    return false;
                } else {
                    Class cls5 = Float.TYPE;
                    if (cls5.equals(cls)) {
                        return Double.TYPE.equals(cls2);
                    }
                    if (Character.TYPE.equals(cls)) {
                        return cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
                    } else if (Short.TYPE.equals(cls)) {
                        return cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
                    } else if (Byte.TYPE.equals(cls)) {
                        return Short.TYPE.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls5.equals(cls2) || Double.TYPE.equals(cls2);
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }
        return cls2.isAssignableFrom(cls);
    }

    public static boolean C(Class<?>[] clsArr, Class<?>... clsArr2) {
        return D(clsArr, clsArr2, f.j(JavaVersion.JAVA_1_5));
    }

    public static boolean D(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z4) {
        if (a.S0(clsArr, clsArr2)) {
            if (clsArr == null) {
                clsArr = a.f68834b;
            }
            if (clsArr2 == null) {
                clsArr2 = a.f68834b;
            }
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                if (!B(clsArr[i4], clsArr2[i4], z4)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean E(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean F(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || G(cls);
    }

    public static boolean G(Class<?> cls) {
        return f68902f.containsKey(cls);
    }

    public static Class<?> H(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : f68901e.get(cls);
    }

    public static Class<?>[] I(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            clsArr2[i4] = H(clsArr[i4]);
        }
        return clsArr2;
    }

    private static String J(String str) {
        String z4 = e.z(str);
        Objects.requireNonNull(z4, "className must not be null.");
        if (z4.endsWith("[]")) {
            StringBuilder sb = new StringBuilder();
            while (z4.endsWith("[]")) {
                z4 = z4.substring(0, z4.length() - 2);
                sb.append("[");
            }
            String str2 = f68903g.get(z4);
            if (str2 != null) {
                sb.append(str2);
            } else {
                sb.append("L");
                sb.append(z4);
                sb.append(";");
            }
            return sb.toString();
        }
        return z4;
    }

    public static Class<?>[] K(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return a.f68834b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i4 = 0; i4 < objArr.length; i4++) {
            clsArr[i4] = objArr[i4] == null ? null : objArr[i4].getClass();
        }
        return clsArr;
    }

    public static Class<?> L(Class<?> cls) {
        return f68902f.get(cls);
    }

    public static Class<?>[] M(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i4 = 0; i4 < clsArr.length; i4++) {
            clsArr2[i4] = L(clsArr[i4]);
        }
        return clsArr2;
    }

    private static void a(String str, String str2) {
        f68903g.put(str, str2);
        f68904h.put(str2, str);
    }

    public static List<Class<?>> b(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List<String> c(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static List<Class<?>> d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    private static void e(Class<?> cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces;
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    e(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> f(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    private static String g(String str) {
        int length;
        String z4 = e.z(str);
        if (z4 == null) {
            return null;
        }
        int i4 = 0;
        while (z4.startsWith("[")) {
            i4++;
            z4 = z4.substring(1);
        }
        if (i4 < 1) {
            return z4;
        }
        if (z4.startsWith("L")) {
            if (z4.endsWith(";")) {
                length = z4.length() - 1;
            } else {
                length = z4.length();
            }
            z4 = z4.substring(1, length);
        } else if (z4.length() > 0) {
            z4 = f68904h.get(z4.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(z4);
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("[]");
        }
        return sb.toString();
    }

    public static Class<?> h(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return i(classLoader, str, true);
    }

    public static Class<?> i(ClassLoader classLoader, String str, boolean z4) throws ClassNotFoundException {
        try {
            Map<String, String> map = f68903g;
            if (map.containsKey(str)) {
                return Class.forName("[" + map.get(str), z4, classLoader).getComponentType();
            }
            return Class.forName(J(str), z4, classLoader);
        } catch (ClassNotFoundException e5) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return i(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z4);
                } catch (ClassNotFoundException unused) {
                    throw e5;
                }
            }
            throw e5;
        }
    }

    public static Class<?> j(String str) throws ClassNotFoundException {
        return k(str, true);
    }

    public static Class<?> k(String str, boolean z4) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = d.class.getClassLoader();
        }
        return i(contextClassLoader, str, z4);
    }

    public static String l(Class<?> cls) {
        return cls == null ? "" : n(cls.getName());
    }

    public static String m(Object obj, String str) {
        return obj == null ? str : n(obj.getClass().getName());
    }

    public static String n(String str) {
        return q(g(str));
    }

    public static String o(Class<?> cls) {
        return cls == null ? "" : q(cls.getName());
    }

    public static String p(Object obj, String str) {
        return obj == null ? str : o(obj.getClass());
    }

    public static String q(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf);
    }

    public static Method r(Class<?> cls, String str, Class<?>... clsArr) throws SecurityException, NoSuchMethodException {
        Method method = cls.getMethod(str, clsArr);
        if (Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
            return method;
        }
        ArrayList<Class> arrayList = new ArrayList();
        arrayList.addAll(d(cls));
        arrayList.addAll(f(cls));
        for (Class cls2 : arrayList) {
            if (Modifier.isPublic(cls2.getModifiers())) {
                try {
                    Method method2 = cls2.getMethod(str, clsArr);
                    if (Modifier.isPublic(method2.getDeclaringClass().getModifiers())) {
                        return method2;
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        throw new NoSuchMethodException("Can't find a public method for " + str + " " + a.m3(clsArr));
    }

    public static String s(Class<?> cls) {
        return cls == null ? "" : u(cls.getName());
    }

    public static String t(Object obj, String str) {
        return obj == null ? str : u(obj.getClass().getName());
    }

    public static String u(String str) {
        return x(g(str));
    }

    public static String v(Class<?> cls) {
        return cls == null ? "" : x(cls.getName());
    }

    public static String w(Object obj, String str) {
        return obj == null ? str : v(obj.getClass());
    }

    public static String x(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
        }
        Map<String, String> map = f68904h;
        if (map.containsKey(str)) {
            str = map.get(str);
        }
        int lastIndexOf = str.lastIndexOf(46);
        int indexOf = str.indexOf(36, lastIndexOf != -1 ? lastIndexOf + 1 : 0);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', f68897a);
        }
        return substring + ((Object) sb);
    }

    public static String y(Class<?> cls) {
        return cls == null ? "" : cls.getSimpleName();
    }

    public static String z(Object obj, String str) {
        return obj == null ? str : y(obj.getClass());
    }
}
