package com.xinzhu.haunted.android.app;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityTaskManager.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65845a = "f";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65846b = com.xinzhu.haunted.d.b("android.app.ActivityTaskManager");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f65847c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f65848d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f65849e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f65850f = false;

    public static boolean a() {
        if (f65847c.get() == null) {
            if (f65848d) {
                return false;
            }
            f65847c.compareAndSet(null, com.xinzhu.haunted.d.f(f65846b, "IActivityTaskManagerSingleton"));
            f65848d = true;
            return f65847c.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f65849e.get() == null) {
            if (f65850f) {
                return false;
            }
            f65849e.compareAndSet(null, com.xinzhu.haunted.d.g(f65846b, "getService", new Object[0]));
            f65850f = true;
            return f65849e.get() != null;
        }
        return true;
    }

    public static n c() {
        if (b()) {
            try {
                return new n(f65849e.get().invoke(null, new Object[0]));
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
                return f65847c.get().get(null);
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
                f65847c.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
