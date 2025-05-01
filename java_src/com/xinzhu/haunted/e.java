package com.xinzhu.haunted;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: HtMethod.java */
/* loaded from: classes6.dex */
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67415b = "e";

    /* renamed from: a  reason: collision with root package name */
    private Method f67416a;

    public e(Class<?> cls, String str, Object... objArr) throws NoSuchMethodException {
        this(cls, null, str, objArr);
    }

    public T a(Object obj, Object... objArr) throws Throwable {
        try {
            return (T) this.f67416a.invoke(obj, objArr);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() != null) {
                throw e5.getCause();
            }
            throw e5;
        }
    }

    public T call(Object obj, Object... objArr) {
        try {
            return (T) this.f67416a.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            Throwable th = e6;
            if (cause != null) {
                th = e6.getCause();
            }
            th.printStackTrace();
            return null;
        }
    }

    public e(Class<?> cls, ClassLoader classLoader, String str, Object... objArr) throws NoSuchMethodException {
    }
}
