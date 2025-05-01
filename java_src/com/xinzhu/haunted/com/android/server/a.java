package com.xinzhu.haunted.com.android.server;

import android.util.ArrayMap;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSystemConfig.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67376b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67377c = d.b("com.android.server.SystemConfig");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f67378d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67379e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f67380f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67381g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67382a;

    public a(Object obj) {
        this.f67382a = obj;
    }

    public static boolean a() {
        if (f67378d.get() == null) {
            if (f67379e) {
                return false;
            }
            f67378d.compareAndSet(null, d.g(f67377c, "getInstance", new Object[0]));
            f67379e = true;
            return f67378d.get() != null;
        }
        return true;
    }

    public static Object c() {
        if (a()) {
            try {
                return f67378d.get().invoke(null, new Object[0]);
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
        if (f67380f.get() == null) {
            if (f67381g) {
                return false;
            }
            f67380f.compareAndSet(null, d.g(f67377c, "getSharedLibraries", new Object[0]));
            f67381g = true;
            return f67380f.get() != null;
        }
        return true;
    }

    public ArrayMap<String, Object> d() {
        if (b()) {
            try {
                return (ArrayMap) f67380f.get().invoke(this.f67382a, new Object[0]);
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

    /* compiled from: HtSystemConfig.java */
    /* renamed from: com.xinzhu.haunted.com.android.server.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0718a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f67383b = d.b("com.android.server.SystemConfig$SharedLibraryEntry");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f67384c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f67385d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f67386e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f67387f = false;

        /* renamed from: g  reason: collision with root package name */
        private static AtomicReference<Field> f67388g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        private static boolean f67389h = false;

        /* renamed from: i  reason: collision with root package name */
        private static AtomicReference<Field> f67390i = new AtomicReference<>();

        /* renamed from: j  reason: collision with root package name */
        private static boolean f67391j = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f67392a;

        public C0718a(Object obj) {
            this.f67392a = obj;
        }

        public boolean a() {
            if (f67388g.get() == null) {
                if (f67389h) {
                    return false;
                }
                f67388g.compareAndSet(null, d.f(f67383b, "dependencies"));
                f67389h = true;
                return f67388g.get() != null;
            }
            return true;
        }

        public boolean b() {
            if (f67386e.get() == null) {
                if (f67387f) {
                    return false;
                }
                f67386e.compareAndSet(null, d.f(f67383b, "filename"));
                f67387f = true;
                return f67386e.get() != null;
            }
            return true;
        }

        public boolean c() {
            if (f67390i.get() == null) {
                if (f67391j) {
                    return false;
                }
                f67390i.compareAndSet(null, d.f(f67383b, "isNative"));
                f67391j = true;
                return f67390i.get() != null;
            }
            return true;
        }

        public boolean d() {
            if (f67384c.get() == null) {
                if (f67385d) {
                    return false;
                }
                f67384c.compareAndSet(null, d.f(f67383b, "name"));
                f67385d = true;
                return f67384c.get() != null;
            }
            return true;
        }

        public String[] e() {
            if (a()) {
                try {
                    return (String[]) f67388g.get().get(this.f67392a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public String f() {
            if (b()) {
                try {
                    return (String) f67386e.get().get(this.f67392a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean g() {
            if (c()) {
                try {
                    return ((Boolean) f67390i.get().get(this.f67392a)).booleanValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public String h() {
            if (d()) {
                try {
                    return (String) f67384c.get().get(this.f67392a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean i(String[] strArr) {
            if (a()) {
                try {
                    f67388g.get().set(this.f67392a, strArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean j(String str) {
            if (b()) {
                try {
                    f67386e.get().set(this.f67392a, str);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean k(boolean z4) {
            if (c()) {
                try {
                    f67390i.get().set(this.f67392a, Boolean.valueOf(z4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean l(String str) {
            if (d()) {
                try {
                    f67384c.get().set(this.f67392a, str);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        private C0718a() {
        }
    }

    private a() {
    }
}
