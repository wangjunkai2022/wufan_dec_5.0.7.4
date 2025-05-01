package com.xinzhu.haunted.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityManagerOreo.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65797a = "e";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65798b = com.xinzhu.haunted.d.b("android.app.ActivityManager");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f65799c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f65800d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f65801e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f65802f = false;

    public static boolean a() {
        if (f65799c.get() == null) {
            if (f65800d) {
                return false;
            }
            f65799c.compareAndSet(null, com.xinzhu.haunted.d.f(f65798b, "IActivityManagerSingleton"));
            f65800d = true;
            return f65799c.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f65801e.get() == null) {
            if (f65802f) {
                return false;
            }
            f65801e.compareAndSet(null, com.xinzhu.haunted.d.g(f65798b, "getService", new Object[0]));
            f65802f = true;
            return f65801e.get() != null;
        }
        return true;
    }

    public static IInterface c() {
        if (b()) {
            try {
                return (IInterface) f65801e.get().invoke(null, new Object[0]);
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

    public static Object d() {
        if (a()) {
            try {
                return f65799c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean e(Object obj) {
        if (a()) {
            try {
                f65799c.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
