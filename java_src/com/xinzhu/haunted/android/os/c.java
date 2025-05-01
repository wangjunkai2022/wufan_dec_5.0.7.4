package com.xinzhu.haunted.android.os;

import android.os.Environment;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtEnvironment.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66810a = "c";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66811b = com.xinzhu.haunted.d.a(Environment.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f66812c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66813d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f66814e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66815f = false;

    /* renamed from: g  reason: collision with root package name */
    private static AtomicReference<Method> f66816g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f66817h = false;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicReference<Method> f66818i = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    private static boolean f66819j = false;

    /* renamed from: k  reason: collision with root package name */
    private static AtomicReference<Method> f66820k = new AtomicReference<>();

    /* renamed from: l  reason: collision with root package name */
    private static boolean f66821l = false;

    /* renamed from: m  reason: collision with root package name */
    private static AtomicReference<Method> f66822m = new AtomicReference<>();

    /* renamed from: n  reason: collision with root package name */
    private static boolean f66823n = false;

    public static boolean a() {
        if (f66812c.get() == null) {
            if (f66813d) {
                return false;
            }
            f66812c.compareAndSet(null, com.xinzhu.haunted.d.f(f66811b, "STANDARD_DIRECTORIES"));
            f66813d = true;
            return f66812c.get() != null;
        }
        return true;
    }

    public static boolean b(String str) {
        if (f66814e.get() == null) {
            if (f66815f) {
                return false;
            }
            f66814e.compareAndSet(null, com.xinzhu.haunted.d.g(f66811b, "getDataAppDirectory", String.class));
            f66815f = true;
            return f66814e.get() != null;
        }
        return true;
    }

    public static boolean c(int i4) {
        if (f66818i.get() == null) {
            if (f66819j) {
                return false;
            }
            f66818i.compareAndSet(null, com.xinzhu.haunted.d.g(f66811b, "getDataSystemCeDirectory", Integer.TYPE));
            f66819j = true;
            return f66818i.get() != null;
        }
        return true;
    }

    public static boolean d(int i4) {
        if (f66816g.get() == null) {
            if (f66817h) {
                return false;
            }
            f66816g.compareAndSet(null, com.xinzhu.haunted.d.g(f66811b, "getDataSystemDeDirectory", Integer.TYPE));
            f66817h = true;
            return f66816g.get() != null;
        }
        return true;
    }

    public static boolean e() {
        if (f66820k.get() == null) {
            if (f66821l) {
                return false;
            }
            f66820k.compareAndSet(null, com.xinzhu.haunted.d.g(f66811b, "getDataSystemDirectory", new Object[0]));
            f66821l = true;
            return f66820k.get() != null;
        }
        return true;
    }

    public static boolean f(int i4) {
        if (f66822m.get() == null) {
            if (f66823n) {
                return false;
            }
            f66822m.compareAndSet(null, com.xinzhu.haunted.d.g(f66811b, "getUserSystemDirectory", Integer.TYPE));
            f66823n = true;
            return f66822m.get() != null;
        }
        return true;
    }

    public static File g(String str) {
        if (b(str)) {
            try {
                return (File) f66814e.get().invoke(null, str);
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

    public static File h(int i4) {
        if (c(i4)) {
            try {
                return (File) f66818i.get().invoke(null, Integer.valueOf(i4));
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

    public static File i(int i4) {
        if (d(i4)) {
            try {
                return (File) f66816g.get().invoke(null, Integer.valueOf(i4));
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

    public static File j() {
        if (e()) {
            try {
                return (File) f66820k.get().invoke(null, new Object[0]);
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

    public static File k(int i4) {
        if (f(i4)) {
            try {
                return (File) f66822m.get().invoke(null, Integer.valueOf(i4));
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

    public static String[] l() {
        if (a()) {
            try {
                return (String[]) f66812c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean m(String[] strArr) {
        if (a()) {
            try {
                f66812c.get().set(null, strArr);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
