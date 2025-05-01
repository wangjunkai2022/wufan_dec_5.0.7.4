package com.xinzhu.haunted.android.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSingleton.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67085b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67086c = com.xinzhu.haunted.d.b("android.util.Singleton");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f67087d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67088e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f67089f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67090g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67091a;

    public b(Object obj) {
        this.f67091a = obj;
    }

    public boolean a() {
        if (f67087d.get() == null) {
            if (f67088e) {
                return false;
            }
            f67087d.compareAndSet(null, com.xinzhu.haunted.d.f(f67086c, "mInstance"));
            f67088e = true;
            return f67087d.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f67089f.get() == null) {
            if (f67090g) {
                return false;
            }
            f67089f.compareAndSet(null, com.xinzhu.haunted.d.g(f67086c, "get", new Object[0]));
            f67090g = true;
            return f67089f.get() != null;
        }
        return true;
    }

    public Object c() {
        if (b()) {
            try {
                return f67089f.get().invoke(this.f67091a, new Object[0]);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Object d() {
        if (a()) {
            try {
                return f67087d.get().get(this.f67091a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean e(Object obj) {
        if (a()) {
            try {
                f67087d.get().set(this.f67091a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private b() {
    }
}
