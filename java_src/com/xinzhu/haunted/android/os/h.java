package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIDeviceIdleController.java */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66848a = "h";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66849b = com.xinzhu.haunted.d.b("android.os.IDeviceIdleController");

    /* compiled from: HtIDeviceIdleController.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66850a = com.xinzhu.haunted.d.b("android.os.IDeviceIdleController$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66851b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66852c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66851b.get().invoke(null, iBinder);
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
            if (f66851b.get() == null) {
                if (f66852c) {
                    return false;
                }
                f66851b.compareAndSet(null, com.xinzhu.haunted.d.g(f66850a, "asInterface", IBinder.class));
                f66852c = true;
                return f66851b.get() != null;
            }
            return true;
        }
    }
}
