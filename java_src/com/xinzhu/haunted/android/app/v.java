package com.xinzhu.haunted.android.app;

import android.app.NotificationManager;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtNotificationManager.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66158a = "v";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66159b = com.xinzhu.haunted.d.a(NotificationManager.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f66160c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66161d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f66162e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66163f = false;

    public static boolean a() {
        if (f66160c.get() == null) {
            if (f66161d) {
                return false;
            }
            f66160c.compareAndSet(null, com.xinzhu.haunted.d.f(f66159b, "sService"));
            f66161d = true;
            return f66160c.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f66162e.get() == null) {
            if (f66163f) {
                return false;
            }
            f66162e.compareAndSet(null, com.xinzhu.haunted.d.g(f66159b, "getService", new Object[0]));
            f66163f = true;
            return f66162e.get() != null;
        }
        return true;
    }

    public static IInterface c() {
        if (b()) {
            try {
                return (IInterface) f66162e.get().invoke(null, new Object[0]);
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

    public static IInterface d() {
        if (a()) {
            try {
                return (IInterface) f66160c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean e(IInterface iInterface) {
        if (a()) {
            try {
                f66160c.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
