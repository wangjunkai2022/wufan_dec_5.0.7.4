package com.xinzhu.haunted.android.security.net.config;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtApplicationConfig.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67068a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67069b = com.xinzhu.haunted.d.b("android.security.net.config.ApplicationConfig");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f67070c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67071d = false;

    public static boolean a(Object obj) {
        if (f67070c.get() == null) {
            if (f67071d) {
                return false;
            }
            f67070c.compareAndSet(null, com.xinzhu.haunted.d.g(f67069b, "setDefaultInstance", "android.security.net.config.ApplicationConfig"));
            f67071d = true;
            return f67070c.get() != null;
        }
        return true;
    }

    public static void b(Object obj) {
        if (a(obj)) {
            try {
                f67070c.get().invoke(null, obj);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }
}
