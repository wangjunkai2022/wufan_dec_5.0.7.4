package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIStatsManagerService.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66872a = "k";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66873b = com.xinzhu.haunted.d.b("android.os.IStatsManagerService");

    /* compiled from: HtIStatsManagerService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66874a = com.xinzhu.haunted.d.b("android.os.IStatsManagerService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66875b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66876c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66875b.get().invoke(null, iBinder);
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
            if (f66875b.get() == null) {
                if (f66876c) {
                    return false;
                }
                f66875b.compareAndSet(null, com.xinzhu.haunted.d.g(f66874a, "asInterface", IBinder.class));
                f66876c = true;
                return f66875b.get() != null;
            }
            return true;
        }
    }
}
