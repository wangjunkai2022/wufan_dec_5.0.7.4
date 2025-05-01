package com.xinzhu.haunted.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityManagerNative.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65789a = "d";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65790b = com.xinzhu.haunted.d.b("android.app.ActivityManagerNative");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f65791c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f65792d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f65793e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f65794f = false;

    public static boolean a() {
        if (f65791c.get() == null) {
            if (f65792d) {
                return false;
            }
            f65791c.compareAndSet(null, com.xinzhu.haunted.d.f(f65790b, "gDefault"));
            f65792d = true;
            return f65791c.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f65793e.get() == null) {
            if (f65794f) {
                return false;
            }
            f65793e.compareAndSet(null, com.xinzhu.haunted.d.g(f65790b, "getDefault", new Object[0]));
            f65794f = true;
            return f65793e.get() != null;
        }
        return true;
    }

    public static IInterface c() {
        if (b()) {
            try {
                return (IInterface) f65793e.get().invoke(null, new Object[0]);
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

    public static Object d() {
        if (a()) {
            try {
                return f65791c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean e(Object obj) {
        if (a()) {
            try {
                f65791c.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
