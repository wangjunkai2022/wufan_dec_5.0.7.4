package com.xinzhu.haunted.android.app;

import android.app.Application;
import android.app.Instrumentation;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtLoadedApk.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66122b = "u";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66123c = com.xinzhu.haunted.d.b("android.app.LoadedApk");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66124d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66125e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66126f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66127g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66128h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66129i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66130j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66131k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66132l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66133m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Method> f66134n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66135o = false;

    /* renamed from: p  reason: collision with root package name */
    private static AtomicReference<Method> f66136p = new AtomicReference<>();

    /* renamed from: q  reason: collision with root package name */
    private static boolean f66137q = false;

    /* renamed from: r  reason: collision with root package name */
    private static AtomicReference<Method> f66138r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    private static boolean f66139s = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66140a;

    /* compiled from: HtLoadedApk.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f66141b = com.xinzhu.haunted.d.b("android.app.LoadedApk$ReceiverDispatcher");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f66142c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f66143d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f66144a;

        /* compiled from: HtLoadedApk.java */
        /* renamed from: com.xinzhu.haunted.android.app.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0694a {

            /* renamed from: a  reason: collision with root package name */
            public static Class<?> f66145a = com.xinzhu.haunted.d.b("android.app.LoadedApk$ReceiverDispatcher$Args");
        }

        public a(Object obj) {
            this.f66144a = obj;
        }

        public boolean a() {
            if (f66142c.get() == null) {
                if (f66143d) {
                    return false;
                }
                f66142c.compareAndSet(null, com.xinzhu.haunted.d.f(f66141b, "mIIntentReceiver"));
                f66143d = true;
                return f66142c.get() != null;
            }
            return true;
        }

        public Object b() {
            if (a()) {
                try {
                    return f66142c.get().get(this.f66144a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean c(Object obj) {
            if (a()) {
                try {
                    f66142c.get().set(this.f66144a, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        /* compiled from: HtLoadedApk.java */
        /* loaded from: classes.dex */
        public static final class b {

            /* renamed from: b  reason: collision with root package name */
            public static Class<?> f66146b = com.xinzhu.haunted.d.b("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver");

            /* renamed from: c  reason: collision with root package name */
            private static AtomicReference<Field> f66147c = new AtomicReference<>();

            /* renamed from: d  reason: collision with root package name */
            private static boolean f66148d = false;

            /* renamed from: a  reason: collision with root package name */
            public Object f66149a;

            public b(Object obj) {
                this.f66149a = obj;
            }

            public boolean a() {
                if (f66147c.get() == null) {
                    if (f66148d) {
                        return false;
                    }
                    f66147c.compareAndSet(null, com.xinzhu.haunted.d.f(f66146b, "mDispatcher"));
                    f66148d = true;
                    return f66147c.get() != null;
                }
                return true;
            }

            public Object b() {
                if (a()) {
                    try {
                        return f66147c.get().get(this.f66149a);
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                        return null;
                    }
                }
                return null;
            }

            public boolean c(Object obj) {
                if (a()) {
                    try {
                        f66147c.get().set(this.f66149a, obj);
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

        private a() {
        }
    }

    public u(Object obj) {
        this.f66140a = obj;
    }

    public boolean a() {
        if (f66126f.get() == null) {
            if (f66127g) {
                return false;
            }
            f66126f.compareAndSet(null, com.xinzhu.haunted.d.f(f66123c, "mApplicationInfo"));
            f66127g = true;
            return f66126f.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66128h.get() == null) {
            if (f66129i) {
                return false;
            }
            f66128h.compareAndSet(null, com.xinzhu.haunted.d.f(f66123c, "mPackageName"));
            f66129i = true;
            return f66128h.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66124d.get() == null) {
            if (f66125e) {
                return false;
            }
            f66124d.compareAndSet(null, com.xinzhu.haunted.d.f(f66123c, "mSecurityViolation"));
            f66125e = true;
            return f66124d.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f66132l.get() == null) {
            if (f66133m) {
                return false;
            }
            f66132l.compareAndSet(null, com.xinzhu.haunted.d.g(f66123c, "getClassLoader", new Object[0]));
            f66133m = true;
            return f66132l.get() != null;
        }
        return true;
    }

    public boolean e() {
        if (f66138r.get() == null) {
            if (f66139s) {
                return false;
            }
            f66138r.compareAndSet(null, com.xinzhu.haunted.d.g(f66123c, "getCredentialProtectedDataDirFile", new Object[0]));
            f66139s = true;
            return f66138r.get() != null;
        }
        return true;
    }

    public boolean f() {
        if (f66134n.get() == null) {
            if (f66135o) {
                return false;
            }
            f66134n.compareAndSet(null, com.xinzhu.haunted.d.g(f66123c, "getDataDirFile", new Object[0]));
            f66135o = true;
            return f66134n.get() != null;
        }
        return true;
    }

    public boolean g() {
        if (f66136p.get() == null) {
            if (f66137q) {
                return false;
            }
            f66136p.compareAndSet(null, com.xinzhu.haunted.d.g(f66123c, "getDeviceProtectedDataDirFile", new Object[0]));
            f66137q = true;
            return f66136p.get() != null;
        }
        return true;
    }

    public boolean h(boolean z4, Instrumentation instrumentation) {
        if (f66130j.get() == null) {
            if (f66131k) {
                return false;
            }
            f66130j.compareAndSet(null, com.xinzhu.haunted.d.g(f66123c, "makeApplication", Boolean.TYPE, Instrumentation.class));
            f66131k = true;
            return f66130j.get() != null;
        }
        return true;
    }

    public ClassLoader i() {
        if (d()) {
            try {
                return (ClassLoader) f66132l.get().invoke(this.f66140a, new Object[0]);
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

    public File j() {
        if (e()) {
            try {
                return (File) f66138r.get().invoke(this.f66140a, new Object[0]);
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

    public File k() {
        if (f()) {
            try {
                return (File) f66134n.get().invoke(this.f66140a, new Object[0]);
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

    public File l() {
        if (g()) {
            try {
                return (File) f66136p.get().invoke(this.f66140a, new Object[0]);
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

    public ApplicationInfo m() {
        if (a()) {
            try {
                return (ApplicationInfo) f66126f.get().get(this.f66140a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public String n() {
        if (b()) {
            try {
                return (String) f66128h.get().get(this.f66140a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean o() {
        if (c()) {
            try {
                return ((Boolean) f66124d.get().get(this.f66140a)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public Application p(boolean z4, Instrumentation instrumentation) {
        if (h(z4, instrumentation)) {
            try {
                return (Application) f66130j.get().invoke(this.f66140a, Boolean.valueOf(z4), instrumentation);
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

    public boolean q(ApplicationInfo applicationInfo) {
        if (a()) {
            try {
                f66126f.get().set(this.f66140a, applicationInfo);
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
                f66128h.get().set(this.f66140a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean s(boolean z4) {
        if (c()) {
            try {
                f66124d.get().set(this.f66140a, Boolean.valueOf(z4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private u() {
    }
}
