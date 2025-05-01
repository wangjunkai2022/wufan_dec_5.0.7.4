package com.xinzhu.haunted.android.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIApplicationThreadOreo.java */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66058a = "q";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66059b = com.xinzhu.haunted.d.b("android.app.IApplicationThread");

    /* compiled from: HtIApplicationThreadOreo.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66060a = com.xinzhu.haunted.d.b("android.app.IApplicationThread$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66061b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66062c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66061b.get().invoke(null, iBinder);
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
            if (f66061b.get() == null) {
                if (f66062c) {
                    return false;
                }
                f66061b.compareAndSet(null, com.xinzhu.haunted.d.g(f66060a, "asInterface", IBinder.class));
                f66062c = true;
                return f66061b.get() != null;
            }
            return true;
        }
    }
}
