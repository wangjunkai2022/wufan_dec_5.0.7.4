package com.xinzhu.haunted;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: HtClass.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67399a = "d";

    public static Class<?> a(Class<?> cls) {
        return cls;
    }

    public static Class<?> b(String str) {
        return i(str);
    }

    public static Class<?> c(String str, ClassLoader classLoader) {
        return j(str, classLoader);
    }

    public static Constructor d(Class<?> cls, String str, Object... objArr) {
        return e(null, cls, str, objArr);
    }

    public static Constructor e(ClassLoader classLoader, Class<?> cls, String str, Object... objArr) {
        Constructor<?> declaredConstructor;
        Class<?>[] clsArr = objArr.length != 0 ? new Class[objArr.length] : null;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (objArr[i4] instanceof String) {
                clsArr[i4] = j((String) objArr[i4], classLoader);
            } else if (objArr[i4] instanceof Class) {
                clsArr[i4] = (Class) objArr[i4];
            } else {
                throw new RuntimeException("Wicked.");
            }
        }
        try {
            if (objArr.length == 0) {
                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            } else {
                declaredConstructor = cls.getDeclaredConstructor(clsArr);
            }
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Field f(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("No such field as ");
            sb.append(str);
            sb.append(" under ");
            sb.append(cls.getSimpleName());
            return null;
        }
    }

    public static Method g(Class<?> cls, String str, Object... objArr) {
        return h(null, cls, str, objArr);
    }

    public static Method h(ClassLoader classLoader, Class<?> cls, String str, Object... objArr) {
        Method declaredMethod;
        Class<?>[] clsArr = objArr.length != 0 ? new Class[objArr.length] : null;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (objArr[i4] instanceof String) {
                clsArr[i4] = j((String) objArr[i4], classLoader);
            } else if (objArr[i4] instanceof Class) {
                clsArr[i4] = (Class) objArr[i4];
            } else {
                throw new RuntimeException("Wicked.");
            }
        }
        try {
            if (objArr.length == 0) {
                declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            } else {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            }
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    static Class<?> i(String str) {
        return j(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Class<?>] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static Class<?> j(String str, ClassLoader classLoader) {
        try {
            if (classLoader != null) {
                str = classLoader.loadClass(str);
            } else {
                str = Class.forName(str);
            }
            return str;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot load class ");
            sb.append(str);
            return null;
        }
    }
}
