package com.xinzhu.haunted.dalvik.system;

import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtVMRuntime.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67400b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67401c = d.b("dalvik.system.VMRuntime");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f67402d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67403e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f67404f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67405g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f67406h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f67407i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f67408j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f67409k = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67410a;

    public a(Object obj) {
        this.f67410a = obj;
    }

    public static boolean a() {
        if (f67402d.get() == null) {
            if (f67403e) {
                return false;
            }
            f67402d.compareAndSet(null, d.g(f67401c, "getRuntime", new Object[0]));
            f67403e = true;
            return f67402d.get() != null;
        }
        return true;
    }

    public static a e() {
        if (a()) {
            try {
                return new a(f67402d.get().invoke(null, new Object[0]));
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

    public boolean b() {
        if (f67406h.get() == null) {
            if (f67407i) {
                return false;
            }
            f67406h.compareAndSet(null, d.g(f67401c, "is64Bit", new Object[0]));
            f67407i = true;
            return f67406h.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f67408j.get() == null) {
            if (f67409k) {
                return false;
            }
            f67408j.compareAndSet(null, d.g(f67401c, "isJavaDebuggable", new Object[0]));
            f67409k = true;
            return f67408j.get() != null;
        }
        return true;
    }

    public boolean d(int i4) {
        if (f67404f.get() == null) {
            if (f67405g) {
                return false;
            }
            f67404f.compareAndSet(null, d.g(f67401c, "setTargetSdkVersion", Integer.TYPE));
            f67405g = true;
            return f67404f.get() != null;
        }
        return true;
    }

    public Boolean f() {
        if (!b()) {
            return Boolean.FALSE;
        }
        try {
            return (Boolean) f67406h.get().invoke(this.f67410a, new Object[0]);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return Boolean.FALSE;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public Boolean g() {
        if (!c()) {
            return Boolean.FALSE;
        }
        try {
            return (Boolean) f67408j.get().invoke(this.f67410a, new Object[0]);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return Boolean.FALSE;
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public void h(int i4) {
        if (d(i4)) {
            try {
                f67404f.get().invoke(this.f67410a, Integer.valueOf(i4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    private a() {
    }
}
