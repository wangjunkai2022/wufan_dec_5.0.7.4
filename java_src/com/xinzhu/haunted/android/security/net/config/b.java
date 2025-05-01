package com.xinzhu.haunted.android.security.net.config;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtNetworkSecurityConfigProvider.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67072a = "b";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67073b = com.xinzhu.haunted.d.b("android.security.net.config.NetworkSecurityConfigProvider");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f67074c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67075d = false;

    public static boolean a(Context context) {
        if (f67074c.get() == null) {
            if (f67075d) {
                return false;
            }
            f67074c.compareAndSet(null, com.xinzhu.haunted.d.g(f67073b, "install", Context.class));
            f67075d = true;
            return f67074c.get() != null;
        }
        return true;
    }

    public static void b(Context context) {
        if (a(context)) {
            try {
                f67074c.get().invoke(null, context);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }
}
