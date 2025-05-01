package com.xinzhu.haunted.android.content.res;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAssetManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66671b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66672c = com.xinzhu.haunted.d.b("android.content.res.AssetManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66673d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66674e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66675f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66676g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f66677h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66678i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66679a;

    public b(Object obj) {
        this.f66679a = obj;
    }

    public static boolean b() {
        if (f66677h.get() == null) {
            if (f66678i) {
                return false;
            }
            f66677h.compareAndSet(null, com.xinzhu.haunted.d.d(f66672c, "HtAssetManager", new Object[0]));
            f66678i = true;
            return f66677h.get() != null;
        }
        return true;
    }

    public static b e() {
        if (b()) {
            try {
                b bVar = new b();
                bVar.f66679a = f66677h.get().newInstance(new Object[0]);
                return bVar;
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

    public Integer a(String str) {
        if (c(str)) {
            try {
                return (Integer) f66675f.get().invoke(this.f66679a, str);
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

    public boolean c(String str) {
        if (f66675f.get() == null) {
            if (f66676g) {
                return false;
            }
            f66675f.compareAndSet(null, com.xinzhu.haunted.d.g(f66672c, "addAssetPath", String.class));
            f66676g = true;
            return f66675f.get() != null;
        }
        return true;
    }

    public boolean d(Object obj, boolean z4) {
        if (f66673d.get() == null) {
            if (f66674e) {
                return false;
            }
            f66673d.compareAndSet(null, com.xinzhu.haunted.d.g(f66672c, "setApkAssets", "[Landroid.content.res.ApkAssets;", Boolean.TYPE));
            f66674e = true;
            return f66673d.get() != null;
        }
        return true;
    }

    public void f(Object obj, boolean z4) {
        if (d(obj, z4)) {
            try {
                f66673d.get().invoke(this.f66679a, obj, Boolean.valueOf(z4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    private b() {
    }
}
