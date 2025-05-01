package com.vuaukou.vco.hykiiuy.plugin;

import android.content.Context;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
/* loaded from: classes8.dex */
public final class e {
    private static int a(Class cls, String str, int i4) {
        try {
            return a(cls, str).getInt(null);
        } catch (Throwable th) {
            return i4;
        }
    }

    private static Object a(Context context, Class cls) {
        if (cls == null) {
            try {
                cls = Class.forName(a.auu.a.c("LwsQFw4aAWAEBBVPMgY6DAIMFQoxJhcRBAU="));
            } catch (Throwable th) {
                return null;
            }
        }
        Method method = cls.getMethod(a.auu.a.c("LRAGFwQdEQ8GAAwXGhE3MRwXBBIB"), new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke(null, new Object[0]);
        if (invoke != null || context == null) {
            return invoke;
        }
        Field field = context.getClass().getField(a.auu.a.c("IykbBAUWAQ8VHw=="));
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField(a.auu.a.c("IyQXEQgFDDocIA0TFgQq"));
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private static Constructor a(Object obj, Class... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            } catch (NoSuchMethodException e5) {
            }
        }
        throw new NoSuchMethodException(a.auu.a.c("DQoaFhUBEC0RGxdBBAw6DVQVAAEEIwAAABMARQ==") + Arrays.asList(clsArr) + a.auu.a.c("bgsbEUEVCjsLEEUIHUU=") + obj.getClass());
    }

    private static Field a(Class cls, String str) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e5) {
            }
        }
        throw new NoSuchFieldException(a.auu.a.c("CAwRCQVT") + str + a.auu.a.c("bgsbEUEVCjsLEEUIHUU=") + cls);
    }

    public static Field a(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e5) {
            }
        }
        throw new NoSuchFieldException(a.auu.a.c("CAwRCQVT") + str + a.auu.a.c("bgsbEUEVCjsLEEUIHUU=") + obj.getClass());
    }

    private static Method a(Class cls, String str, Class... clsArr) {
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException e5) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException(a.auu.a.c("AwAADQ4XRQ==") + str + a.auu.a.c("bhIdEQlTFS8XFQgEBwA8FlQ=") + Arrays.asList(clsArr) + a.auu.a.c("bgsbEUEVCjsLEEUIHUU=") + cls);
    }

    public static Method a(Object obj, String str, Class... clsArr) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException e5) {
            }
        }
        throw new NoSuchMethodException(a.auu.a.c("AwAADQ4XRQ==") + str + a.auu.a.c("bhIdEQlTFS8XFQgEBwA8FlQ=") + Arrays.asList(clsArr) + a.auu.a.c("bgsbEUEVCjsLEEUIHUU=") + obj.getClass());
    }

    private static void a(Object obj, String str, int i4) {
        if (i4 <= 0) {
            return;
        }
        Field a5 = a(obj, str);
        Object[] objArr = (Object[]) a5.get(obj);
        int length = objArr.length - i4;
        if (length > 0) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
            System.arraycopy(objArr, i4, objArr2, 0, length);
            a5.set(obj, objArr2);
        }
    }

    private static void a(Object obj, String str, Object[] objArr) {
        Field a5 = a(obj, str);
        Object[] objArr2 = (Object[]) a5.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        a5.set(obj, objArr3);
    }
}
