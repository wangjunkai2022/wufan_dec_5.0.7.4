package com.xinzhu.haunted.android.content.res;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtApkAssets.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66665a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66666b = com.xinzhu.haunted.d.b("android.content.res.ApkAssets");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66667c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66668d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f66669e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66670f = false;

    public static boolean a(String str, int i4) {
        if (f66667c.get() == null) {
            if (f66668d) {
                return false;
            }
            f66667c.compareAndSet(null, com.xinzhu.haunted.d.g(f66666b, "loadFromPath", String.class, Integer.TYPE));
            f66668d = true;
            return f66667c.get() != null;
        }
        return true;
    }

    public static boolean b(String str, boolean z4) {
        if (f66669e.get() == null) {
            if (f66670f) {
                return false;
            }
            f66669e.compareAndSet(null, com.xinzhu.haunted.d.g(f66666b, "loadFromPath", String.class, Boolean.TYPE));
            f66670f = true;
            return f66669e.get() != null;
        }
        return true;
    }

    public static Object c(String str, int i4) {
        if (a(str, i4)) {
            try {
                return f66667c.get().invoke(null, str, Integer.valueOf(i4));
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

    public static Object d(String str, boolean z4) {
        if (b(str, z4)) {
            try {
                return f66669e.get().invoke(null, str, Boolean.valueOf(z4));
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
}
