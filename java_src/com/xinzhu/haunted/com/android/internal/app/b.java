package com.xinzhu.haunted.com.android.internal.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIBatteryStats.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67228a = "b";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67229b = com.xinzhu.haunted.d.b("com.android.internal.app.IBatteryStats");

    /* compiled from: HtIBatteryStats.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67230a = com.xinzhu.haunted.d.b("com.android.internal.app.IBatteryStats$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67231b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67232c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67231b.get().invoke(null, iBinder);
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
            if (f67231b.get() == null) {
                if (f67232c) {
                    return false;
                }
                f67231b.compareAndSet(null, com.xinzhu.haunted.d.g(f67230a, "asInterface", IBinder.class));
                f67232c = true;
                return f67231b.get() != null;
            }
            return true;
        }
    }
}
