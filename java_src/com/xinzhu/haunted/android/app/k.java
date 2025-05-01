package com.xinzhu.haunted.android.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtApplicationThreadNative.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65980a = "k";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65981b = com.xinzhu.haunted.d.b("android.app.ApplicationThreadNative");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f65982c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f65983d = false;

    public static IInterface a(IBinder iBinder) {
        if (b(iBinder)) {
            try {
                return (IInterface) f65982c.get().invoke(null, iBinder);
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
        if (f65982c.get() == null) {
            if (f65983d) {
                return false;
            }
            f65982c.compareAndSet(null, com.xinzhu.haunted.d.g(f65981b, "asInterface", IBinder.class));
            f65983d = true;
            return f65982c.get() != null;
        }
        return true;
    }
}
