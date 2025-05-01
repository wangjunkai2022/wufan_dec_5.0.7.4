package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtINetworkManagementService.java */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66860a = "i";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66861b = com.xinzhu.haunted.d.b("android.os.INetworkManagementService");

    /* compiled from: HtINetworkManagementService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66862a = com.xinzhu.haunted.d.b("android.os.INetworkManagementService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66863b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66864c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66863b.get().invoke(null, iBinder);
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
            if (f66863b.get() == null) {
                if (f66864c) {
                    return false;
                }
                f66863b.compareAndSet(null, com.xinzhu.haunted.d.g(f66862a, "asInterface", IBinder.class));
                f66864c = true;
                return f66863b.get() != null;
            }
            return true;
        }
    }
}
