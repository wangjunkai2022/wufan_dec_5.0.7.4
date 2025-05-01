package com.xinzhu.haunted.android.os.storage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIMountService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66943a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66944b = com.xinzhu.haunted.d.b("android.os.storage.IMountService");

    /* compiled from: HtIMountService.java */
    /* renamed from: com.xinzhu.haunted.android.os.storage.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0702a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66945a = com.xinzhu.haunted.d.b("android.os.storage.IMountService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66946b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66947c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66946b.get().invoke(null, iBinder);
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
            if (f66946b.get() == null) {
                if (f66947c) {
                    return false;
                }
                f66946b.compareAndSet(null, com.xinzhu.haunted.d.g(f66945a, "asInterface", IBinder.class));
                f66947c = true;
                return f66946b.get() != null;
            }
            return true;
        }
    }
}
