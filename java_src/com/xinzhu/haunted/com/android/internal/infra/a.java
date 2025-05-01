package com.xinzhu.haunted.com.android.internal.infra;

import com.xinzhu.haunted.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAndroidFuture.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67293b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67294c = d.b("com.android.internal.infra.AndroidFuture");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f67295d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67296e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f67297f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67298g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f67299h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f67300i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67301a;

    public a(Object obj) {
        this.f67301a = obj;
    }

    public static boolean a() {
        if (f67299h.get() == null) {
            if (f67300i) {
                return false;
            }
            f67299h.compareAndSet(null, d.d(f67294c, "HtAndroidFuture", new Object[0]));
            f67300i = true;
            return f67299h.get() != null;
        }
        return true;
    }

    public static a e() {
        if (a()) {
            try {
                a aVar = new a();
                aVar.f67301a = f67299h.get().newInstance(new Object[0]);
                return aVar;
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

    public boolean b(Object obj) {
        if (f67295d.get() == null) {
            if (f67296e) {
                return false;
            }
            f67295d.compareAndSet(null, d.g(f67294c, "complete", Object.class));
            f67296e = true;
            return f67295d.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f67297f.get() == null) {
            if (f67298g) {
                return false;
            }
            f67297f.compareAndSet(null, d.g(f67294c, "get", new Object[0]));
            f67298g = true;
            return f67297f.get() != null;
        }
        return true;
    }

    public boolean d(Object obj) {
        if (b(obj)) {
            try {
                return ((Boolean) f67295d.get().invoke(this.f67301a, obj)).booleanValue();
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

    public Object f() {
        if (c()) {
            try {
                return f67297f.get().invoke(this.f67301a, new Object[0]);
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

    private a() {
    }
}
