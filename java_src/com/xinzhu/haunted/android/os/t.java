package com.xinzhu.haunted.android.os;

import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtStrictMode.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66981a = "t";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66982b = com.xinzhu.haunted.d.a(StrictMode.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66983c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66984d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f66985e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66986f = false;

    public static boolean a() {
        if (f66985e.get() == null) {
            if (f66986f) {
                return false;
            }
            f66985e.compareAndSet(null, com.xinzhu.haunted.d.g(f66982b, "disableDeathOnFileUriExposure", new Object[0]));
            f66986f = true;
            return f66985e.get() != null;
        }
        return true;
    }

    public static boolean b(ApplicationInfo applicationInfo) {
        if (f66983c.get() == null) {
            if (f66984d) {
                return false;
            }
            f66983c.compareAndSet(null, com.xinzhu.haunted.d.g(f66982b, "initThreadDefaults", ApplicationInfo.class));
            f66984d = true;
            return f66983c.get() != null;
        }
        return true;
    }

    public static void c() {
        if (a()) {
            try {
                f66985e.get().invoke(null, new Object[0]);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static void d(ApplicationInfo applicationInfo) {
        if (b(applicationInfo)) {
            try {
                f66983c.get().invoke(null, applicationInfo);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }
}
