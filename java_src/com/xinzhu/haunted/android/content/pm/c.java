package com.xinzhu.haunted.android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtICrossProfileApps.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66443a = "c";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66444b = com.xinzhu.haunted.d.b("android.content.pm.ICrossProfileApps");

    /* compiled from: HtICrossProfileApps.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66445a = com.xinzhu.haunted.d.b("android.content.pm.ICrossProfileApps$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66446b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66447c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66446b.get().invoke(null, iBinder);
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
            if (f66446b.get() == null) {
                if (f66447c) {
                    return false;
                }
                f66446b.compareAndSet(null, com.xinzhu.haunted.d.g(f66445a, "asInterface", IBinder.class));
                f66447c = true;
                return f66446b.get() != null;
            }
            return true;
        }
    }
}
