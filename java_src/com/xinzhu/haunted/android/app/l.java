package com.xinzhu.haunted.android.app;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtContextImpl.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65990b = "l";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65991c = com.xinzhu.haunted.d.b("android.app.ContextImpl");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65992d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65993e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f65994f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f65995g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f65996h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f65997i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f65998j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f65999k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66000l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66001m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Method> f66002n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66003o = false;

    /* renamed from: p  reason: collision with root package name */
    private static AtomicReference<Method> f66004p = new AtomicReference<>();

    /* renamed from: q  reason: collision with root package name */
    private static boolean f66005q = false;

    /* renamed from: r  reason: collision with root package name */
    private static AtomicReference<Method> f66006r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    private static boolean f66007s = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66008a;

    public l(Object obj) {
        this.f66008a = obj;
    }

    public boolean a() {
        if (f65994f.get() == null) {
            if (f65995g) {
                return false;
            }
            f65994f.compareAndSet(null, com.xinzhu.haunted.d.f(f65991c, "mBasePackageName"));
            f65995g = true;
            return f65994f.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f65996h.get() == null) {
            if (f65997i) {
                return false;
            }
            f65996h.compareAndSet(null, com.xinzhu.haunted.d.f(f65991c, "mOpPackageName"));
            f65997i = true;
            return f65996h.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f65998j.get() == null) {
            if (f65999k) {
                return false;
            }
            f65998j.compareAndSet(null, com.xinzhu.haunted.d.f(f65991c, "mPackageInfo"));
            f65999k = true;
            return f65998j.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f65992d.get() == null) {
            if (f65993e) {
                return false;
            }
            f65992d.compareAndSet(null, com.xinzhu.haunted.d.f(f65991c, "mPackageManager"));
            f65993e = true;
            return f65992d.get() != null;
        }
        return true;
    }

    public boolean e() {
        if (f66004p.get() == null) {
            if (f66005q) {
                return false;
            }
            f66004p.compareAndSet(null, com.xinzhu.haunted.d.g(f65991c, "getAttributionSource", new Object[0]));
            f66005q = true;
            return f66004p.get() != null;
        }
        return true;
    }

    public boolean f() {
        if (f66000l.get() == null) {
            if (f66001m) {
                return false;
            }
            f66000l.compareAndSet(null, com.xinzhu.haunted.d.g(f65991c, "getUserId", new Object[0]));
            f66001m = true;
            return f66000l.get() != null;
        }
        return true;
    }

    public boolean g() {
        if (f66006r.get() == null) {
            if (f66007s) {
                return false;
            }
            f66006r.compareAndSet(null, com.xinzhu.haunted.d.g(f65991c, "isCredentialProtectedStorage", new Object[0]));
            f66007s = true;
            return f66006r.get() != null;
        }
        return true;
    }

    public boolean h(Context context) {
        if (f66002n.get() == null) {
            if (f66003o) {
                return false;
            }
            f66002n.compareAndSet(null, com.xinzhu.haunted.d.g(f65991c, "setOuterContext", Context.class));
            f66003o = true;
            return f66002n.get() != null;
        }
        return true;
    }

    public Object i() {
        if (e()) {
            try {
                return f66004p.get().invoke(this.f66008a, new Object[0]);
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

    public int j() {
        if (f()) {
            try {
                return ((Integer) f66000l.get().invoke(this.f66008a, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public String k() {
        if (a()) {
            try {
                return (String) f65994f.get().get(this.f66008a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public String l() {
        if (b()) {
            try {
                return (String) f65996h.get().get(this.f66008a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Object m() {
        if (c()) {
            try {
                return f65998j.get().get(this.f66008a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public PackageManager n() {
        if (d()) {
            try {
                return (PackageManager) f65992d.get().get(this.f66008a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean o() {
        if (g()) {
            try {
                return ((Boolean) f66006r.get().invoke(this.f66008a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public void p(Context context) {
        if (h(context)) {
            try {
                f66002n.get().invoke(this.f66008a, context);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean q(String str) {
        if (a()) {
            try {
                f65994f.get().set(this.f66008a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean r(String str) {
        if (b()) {
            try {
                f65996h.get().set(this.f66008a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean s(Object obj) {
        if (c()) {
            try {
                f65998j.get().set(this.f66008a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean t(PackageManager packageManager) {
        if (d()) {
            try {
                f65992d.get().set(this.f66008a, packageManager);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private l() {
    }
}
