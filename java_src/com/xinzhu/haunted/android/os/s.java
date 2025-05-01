package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtServiceManager.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66928a = "s";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66929b = com.xinzhu.haunted.d.b("android.os.ServiceManager");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f66930c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66931d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Field> f66932e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66933f = false;

    /* renamed from: g  reason: collision with root package name */
    private static AtomicReference<Method> f66934g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f66935h = false;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicReference<Method> f66936i = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    private static boolean f66937j = false;

    /* renamed from: k  reason: collision with root package name */
    private static AtomicReference<Method> f66938k = new AtomicReference<>();

    /* renamed from: l  reason: collision with root package name */
    private static boolean f66939l = false;

    /* renamed from: m  reason: collision with root package name */
    private static AtomicReference<Method> f66940m = new AtomicReference<>();

    /* renamed from: n  reason: collision with root package name */
    private static boolean f66941n = false;

    public static IBinder a() {
        if (d()) {
            try {
                return (IBinder) f66934g.get().invoke(null, new Object[0]);
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

    public static boolean b() {
        if (f66930c.get() == null) {
            if (f66931d) {
                return false;
            }
            f66930c.compareAndSet(null, com.xinzhu.haunted.d.f(f66929b, "sCache"));
            f66931d = true;
            return f66930c.get() != null;
        }
        return true;
    }

    public static boolean c() {
        if (f66932e.get() == null) {
            if (f66933f) {
                return false;
            }
            f66932e.compareAndSet(null, com.xinzhu.haunted.d.f(f66929b, "sServiceManager"));
            f66933f = true;
            return f66932e.get() != null;
        }
        return true;
    }

    public static boolean d() {
        if (f66934g.get() == null) {
            if (f66935h) {
                return false;
            }
            f66934g.compareAndSet(null, com.xinzhu.haunted.d.g(f66929b, "checkService", new Object[0]));
            f66935h = true;
            return f66934g.get() != null;
        }
        return true;
    }

    public static boolean e() {
        if (f66936i.get() == null) {
            if (f66937j) {
                return false;
            }
            f66936i.compareAndSet(null, com.xinzhu.haunted.d.g(f66929b, "getIServiceManager", new Object[0]));
            f66937j = true;
            return f66936i.get() != null;
        }
        return true;
    }

    public static boolean f(String str) {
        if (f66938k.get() == null) {
            if (f66939l) {
                return false;
            }
            f66938k.compareAndSet(null, com.xinzhu.haunted.d.g(f66929b, "getService", String.class));
            f66939l = true;
            return f66938k.get() != null;
        }
        return true;
    }

    public static boolean g(String str) {
        if (f66940m.get() == null) {
            if (f66941n) {
                return false;
            }
            f66940m.compareAndSet(null, com.xinzhu.haunted.d.g(f66929b, "getServiceOrThrow", String.class));
            f66941n = true;
            return f66940m.get() != null;
        }
        return true;
    }

    public static IInterface h() {
        if (e()) {
            try {
                return (IInterface) f66936i.get().invoke(null, new Object[0]);
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

    public static IBinder i(String str) {
        if (f(str)) {
            try {
                return (IBinder) f66938k.get().invoke(null, str);
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

    public static IBinder j(String str) {
        if (g(str)) {
            try {
                return (IBinder) f66940m.get().invoke(null, str);
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

    public static Map<String, IBinder> k() {
        if (b()) {
            try {
                return (Map) f66930c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static IInterface l() {
        if (c()) {
            try {
                return (IInterface) f66932e.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean m(Map<String, IBinder> map) {
        if (b()) {
            try {
                f66930c.get().set(null, map);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean n(IInterface iInterface) {
        if (c()) {
            try {
                f66932e.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
