package com.xinzhu.haunted.android.content;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtContentProviderNative.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66248a = "g";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66249b = com.xinzhu.haunted.d.b("android.content.ContentProviderNative");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66250c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66251d = false;

    public static Object a(IBinder iBinder) {
        if (b(iBinder)) {
            try {
                return f66250c.get().invoke(null, iBinder);
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

    public static boolean b(IBinder iBinder) {
        if (f66250c.get() == null) {
            if (f66251d) {
                return false;
            }
            f66250c.compareAndSet(null, com.xinzhu.haunted.d.g(f66249b, "asInterface", IBinder.class));
            f66251d = true;
            return f66250c.get() != null;
        }
        return true;
    }
}
