package com.xinzhu.haunted.app;

import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtHwApiCacheManagerEx.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67135b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67136c = d.b("huawei.android.app.HwApiCacheMangerEx");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f67137d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67138e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f67139f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67140g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67141a;

    public a(Object obj) {
        this.f67141a = obj;
    }

    public static boolean b() {
        if (f67139f.get() == null) {
            if (f67140g) {
                return false;
            }
            f67139f.compareAndSet(null, d.g(f67136c, "getDefault", new Object[0]));
            f67140g = true;
            return f67139f.get() != null;
        }
        return true;
    }

    public static a c() {
        if (b()) {
            try {
                return new a(f67139f.get().invoke(null, new Object[0]));
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

    public boolean a() {
        if (f67137d.get() == null) {
            if (f67138e) {
                return false;
            }
            f67137d.compareAndSet(null, d.f(f67136c, "mPkg"));
            f67138e = true;
            return f67137d.get() != null;
        }
        return true;
    }

    public Object d() {
        if (a()) {
            try {
                return f67137d.get().get(this.f67141a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean e(Object obj) {
        if (a()) {
            try {
                f67137d.get().set(this.f67141a, obj);
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
