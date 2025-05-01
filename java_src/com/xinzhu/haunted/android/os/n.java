package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIVibratorManagerService.java */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66890a = "n";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66891b = com.xinzhu.haunted.d.b("android.os.IVibratorManagerService");

    /* compiled from: HtIVibratorManagerService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66892a = com.xinzhu.haunted.d.b("android.os.IVibratorManagerService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66893b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66894c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66893b.get().invoke(null, iBinder);
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
            if (f66893b.get() == null) {
                if (f66894c) {
                    return false;
                }
                f66893b.compareAndSet(null, com.xinzhu.haunted.d.g(f66892a, "asInterface", IBinder.class));
                f66894c = true;
                return f66893b.get() != null;
            }
            return true;
        }
    }
}
