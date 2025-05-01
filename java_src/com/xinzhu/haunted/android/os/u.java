package com.xinzhu.haunted.android.os;

import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSystemNotificationChannels.java */
/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66988a = "u";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66989b = com.xinzhu.haunted.d.b("com.android.internal.notification.SystemNotificationChannels");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f66990c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66991d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f66992e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f66993f = false;

    public static boolean a() {
        if (f66990c.get() == null) {
            if (f66991d) {
                return false;
            }
            f66990c.compareAndSet(null, com.xinzhu.haunted.d.f(f66989b, "ACCOUNT"));
            f66991d = true;
            return f66990c.get() != null;
        }
        return true;
    }

    public static boolean b(String str, int i4, Context context) {
        if (f66992e.get() == null) {
            if (f66993f) {
                return false;
            }
            f66992e.compareAndSet(null, com.xinzhu.haunted.d.g(f66989b, "createAccountChannelForPackage", String.class, Integer.TYPE, Context.class));
            f66993f = true;
            return f66992e.get() != null;
        }
        return true;
    }

    public static void c(String str, int i4, Context context) {
        if (b(str, i4, context)) {
            try {
                f66992e.get().invoke(null, str, Integer.valueOf(i4), context);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static String d() {
        if (a()) {
            try {
                return (String) f66990c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean e(String str) {
        if (a()) {
            try {
                f66990c.get().set(null, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
