package com.xinzhu.haunted.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityClient.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65753a = "b";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65754b = com.xinzhu.haunted.d.b("android.app.ActivityClient");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f65755c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f65756d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f65757e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f65758f = false;

    public static boolean a() {
        if (f65755c.get() == null) {
            if (f65756d) {
                return false;
            }
            f65755c.compareAndSet(null, com.xinzhu.haunted.d.f(f65754b, "INTERFACE_SINGLETON"));
            f65756d = true;
            return f65755c.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f65757e.get() == null) {
            if (f65758f) {
                return false;
            }
            f65757e.compareAndSet(null, com.xinzhu.haunted.d.g(f65754b, "getActivityClientController", new Object[0]));
            f65758f = true;
            return f65757e.get() != null;
        }
        return true;
    }

    public static IInterface c() {
        if (b()) {
            try {
                return (IInterface) f65757e.get().invoke(null, new Object[0]);
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
                return f65755c.get().get(null);
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
                f65755c.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* compiled from: HtActivityClient.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65759b = com.xinzhu.haunted.d.b("android.app.ActivityClient$ActivityClientControllerSingleton");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f65760c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65761d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65762a;

        public a(Object obj) {
            this.f65762a = obj;
        }

        public boolean a() {
            if (f65760c.get() == null) {
                if (f65761d) {
                    return false;
                }
                f65760c.compareAndSet(null, com.xinzhu.haunted.d.f(f65759b, "mKnownInstance"));
                f65761d = true;
                return f65760c.get() != null;
            }
            return true;
        }

        public IInterface b() {
            if (a()) {
                try {
                    return (IInterface) f65760c.get().get(this.f65762a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean c(IInterface iInterface) {
            if (a()) {
                try {
                    f65760c.get().set(this.f65762a, iInterface);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        private a() {
        }
    }
}
