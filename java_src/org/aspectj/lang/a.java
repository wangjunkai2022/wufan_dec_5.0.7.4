package org.aspectj.lang;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* compiled from: Aspects14.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Class[] f72186a = new Class[0];

    /* renamed from: b  reason: collision with root package name */
    private static final Class[] f72187b;

    /* renamed from: c  reason: collision with root package name */
    private static final Class[] f72188c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object[] f72189d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f72190e = "aspectOf";

    /* renamed from: f  reason: collision with root package name */
    private static final String f72191f = "hasAspect";

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f72192g;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ Class f72193h;

    static {
        Class[] clsArr = new Class[1];
        Class cls = f72192g;
        if (cls == null) {
            cls = f("java.lang.Object");
            f72192g = cls;
        }
        clsArr[0] = cls;
        f72187b = clsArr;
        Class[] clsArr2 = new Class[1];
        Class cls2 = f72193h;
        if (cls2 == null) {
            cls2 = f("java.lang.Class");
            f72193h = cls2;
        }
        clsArr2[0] = cls2;
        f72188c = clsArr2;
        f72189d = new Object[0];
    }

    public static Object a(Class cls) throws NoAspectBoundException {
        try {
            return k(cls).invoke(null, f72189d);
        } catch (InvocationTargetException e5) {
            throw new NoAspectBoundException(cls.getName(), e5);
        } catch (Exception e6) {
            throw new NoAspectBoundException(cls.getName(), e6);
        }
    }

    public static Object b(Class cls, Class cls2) throws NoAspectBoundException {
        try {
            return i(cls).invoke(null, cls2);
        } catch (InvocationTargetException e5) {
            throw new NoAspectBoundException(cls.getName(), e5);
        } catch (Exception e6) {
            throw new NoAspectBoundException(cls.getName(), e6);
        }
    }

    public static Object c(Class cls, Object obj) throws NoAspectBoundException {
        try {
            return g(cls).invoke(null, obj);
        } catch (InvocationTargetException e5) {
            throw new NoAspectBoundException(cls.getName(), e5);
        } catch (Exception e6) {
            throw new NoAspectBoundException(cls.getName(), e6);
        }
    }

    private static Method d(Method method, Class cls) throws NoSuchMethodException {
        method.setAccessible(true);
        if (method.isAccessible() && Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
            return method;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cls.getName());
        stringBuffer.append(".aspectOf(..) is not accessible public static");
        throw new NoSuchMethodException(stringBuffer.toString());
    }

    private static Method e(Method method, Class cls) throws NoSuchMethodException {
        method.setAccessible(true);
        if (method.isAccessible() && Modifier.isPublic(method.getModifiers()) && Modifier.isStatic(method.getModifiers())) {
            return method;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cls.getName());
        stringBuffer.append(".hasAspect(..) is not accessible public static");
        throw new NoSuchMethodException(stringBuffer.toString());
    }

    static /* synthetic */ Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e5) {
            throw new NoClassDefFoundError(e5.getMessage());
        }
    }

    private static Method g(Class cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod(f72190e, f72187b), cls);
    }

    private static Method h(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod(f72191f, f72187b), cls);
    }

    private static Method i(Class cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod(f72190e, f72188c), cls);
    }

    private static Method j(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod(f72191f, f72188c), cls);
    }

    private static Method k(Class cls) throws NoSuchMethodException {
        return d(cls.getDeclaredMethod(f72190e, f72186a), cls);
    }

    private static Method l(Class cls) throws NoSuchMethodException {
        return e(cls.getDeclaredMethod(f72191f, f72186a), cls);
    }

    public static boolean m(Class cls) throws NoAspectBoundException {
        try {
            return ((Boolean) l(cls).invoke(null, f72189d)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean n(Class cls, Class cls2) throws NoAspectBoundException {
        try {
            return ((Boolean) j(cls).invoke(null, cls2)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(Class cls, Object obj) throws NoAspectBoundException {
        try {
            return ((Boolean) h(cls).invoke(null, obj)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
