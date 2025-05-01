package com.nineoldandroids.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ReflectiveProperty.java */
/* loaded from: classes5.dex */
class d<T, V> extends c<T, V> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f57790f = "get";

    /* renamed from: g  reason: collision with root package name */
    private static final String f57791g = "is";

    /* renamed from: h  reason: collision with root package name */
    private static final String f57792h = "set";

    /* renamed from: c  reason: collision with root package name */
    private Method f57793c;

    /* renamed from: d  reason: collision with root package name */
    private Method f57794d;

    /* renamed from: e  reason: collision with root package name */
    private Field f57795e;

    public d(Class<T> cls, Class<V> cls2, String str) {
        super(cls2, str);
        String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        String str3 = f57790f + str2;
        try {
            try {
                this.f57794d = cls.getMethod(str3, null);
            } catch (NoSuchMethodException unused) {
                String str4 = "is" + str2;
                try {
                    try {
                        try {
                            this.f57794d = cls.getMethod(str4, null);
                        } catch (NoSuchFieldException unused2) {
                            throw new NoSuchPropertyException("No accessor method or field found for property with name " + str);
                        }
                    } catch (NoSuchMethodException unused3) {
                        Field field = cls.getField(str);
                        this.f57795e = field;
                        Class<?> type = field.getType();
                        if (f(cls2, type)) {
                            return;
                        }
                        throw new NoSuchPropertyException("Underlying type (" + type + ") does not match Property type (" + cls2 + ")");
                    }
                } catch (NoSuchMethodException unused4) {
                    Method declaredMethod = cls.getDeclaredMethod(str4, null);
                    this.f57794d = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            }
        } catch (NoSuchMethodException unused5) {
            Method declaredMethod2 = cls.getDeclaredMethod(str3, null);
            this.f57794d = declaredMethod2;
            declaredMethod2.setAccessible(true);
        }
        Class<?> returnType = this.f57794d.getReturnType();
        if (f(cls2, returnType)) {
            try {
                Method declaredMethod3 = cls.getDeclaredMethod(f57792h + str2, returnType);
                this.f57793c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                return;
            } catch (NoSuchMethodException unused6) {
                return;
            }
        }
        throw new NoSuchPropertyException("Underlying type (" + returnType + ") does not match Property type (" + cls2 + ")");
    }

    private boolean f(Class<V> cls, Class cls2) {
        if (cls2 != cls) {
            if (cls2.isPrimitive()) {
                if (cls2 == Float.TYPE && cls == Float.class) {
                    return true;
                }
                if (cls2 == Integer.TYPE && cls == Integer.class) {
                    return true;
                }
                if (cls2 == Boolean.TYPE && cls == Boolean.class) {
                    return true;
                }
                if (cls2 == Long.TYPE && cls == Long.class) {
                    return true;
                }
                if (cls2 == Double.TYPE && cls == Double.class) {
                    return true;
                }
                if (cls2 == Short.TYPE && cls == Short.class) {
                    return true;
                }
                if (cls2 == Byte.TYPE && cls == Byte.class) {
                    return true;
                }
                return cls2 == Character.TYPE && cls == Character.class;
            }
            return false;
        }
        return true;
    }

    @Override // com.nineoldandroids.util.c
    public V a(T t4) {
        Method method = this.f57794d;
        if (method != null) {
            try {
                return (V) method.invoke(t4, null);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5.getCause());
            }
        }
        Field field = this.f57795e;
        if (field != null) {
            try {
                return (V) field.get(t4);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        throw new AssertionError();
    }

    @Override // com.nineoldandroids.util.c
    public boolean c() {
        return this.f57793c == null && this.f57795e == null;
    }

    @Override // com.nineoldandroids.util.c
    public void e(T t4, V v2) {
        Method method = this.f57793c;
        if (method != null) {
            try {
                method.invoke(t4, v2);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5.getCause());
            }
        }
        Field field = this.f57795e;
        if (field != null) {
            try {
                field.set(t4, v2);
                return;
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        throw new UnsupportedOperationException("Property " + b() + " is read-only");
    }
}
