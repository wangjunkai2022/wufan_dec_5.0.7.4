package com.xinzhu.haunted.android.content.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtParceledListSlice.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66535b = "k";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66536c = com.xinzhu.haunted.d.b("android.content.pm.ParceledListSlice");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66537d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66538e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66539f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66540g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f66541h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66542i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66543a;

    public k(Object obj) {
        this.f66543a = obj;
    }

    public static boolean a(List list) {
        if (f66541h.get() == null) {
            if (f66542i) {
                return false;
            }
            f66541h.compareAndSet(null, com.xinzhu.haunted.d.d(f66536c, "HtParceledListSlice", List.class));
            f66542i = true;
            return f66541h.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f66539f.get() == null) {
            if (f66540g) {
                return false;
            }
            f66539f.compareAndSet(null, com.xinzhu.haunted.d.g(f66536c, "emptyList", new Object[0]));
            f66540g = true;
            return f66539f.get() != null;
        }
        return true;
    }

    public static k d(List list) {
        if (a(list)) {
            try {
                k kVar = new k();
                kVar.f66543a = f66541h.get().newInstance(list);
                return kVar;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            } catch (InstantiationException e6) {
                e6.printStackTrace();
                return null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static Object e() {
        if (b()) {
            try {
                return f66539f.get().invoke(null, new Object[0]);
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

    public boolean c() {
        if (f66537d.get() == null) {
            if (f66538e) {
                return false;
            }
            f66537d.compareAndSet(null, com.xinzhu.haunted.d.g(f66536c, "getList", new Object[0]));
            f66538e = true;
            return f66537d.get() != null;
        }
        return true;
    }

    public List<?> f() {
        if (c()) {
            try {
                return (List) f66537d.get().invoke(this.f66543a, new Object[0]);
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

    private k() {
    }
}
