package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIVibratorService.java */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66896a = "o";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66897b = com.xinzhu.haunted.d.b("android.os.IVibratorService");

    /* compiled from: HtIVibratorService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66898a = com.xinzhu.haunted.d.b("android.os.IVibratorService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66899b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66900c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66899b.get().invoke(null, iBinder);
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
            if (f66899b.get() == null) {
                if (f66900c) {
                    return false;
                }
                f66899b.compareAndSet(null, com.xinzhu.haunted.d.g(f66898a, "asInterface", IBinder.class));
                f66900c = true;
                return f66899b.get() != null;
            }
            return true;
        }
    }
}
