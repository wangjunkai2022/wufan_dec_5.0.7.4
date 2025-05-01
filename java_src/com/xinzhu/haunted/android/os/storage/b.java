package com.xinzhu.haunted.android.os.storage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIStorageManager.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66948a = "b";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66949b = com.xinzhu.haunted.d.b("android.os.storage.IStorageManager");

    /* compiled from: HtIStorageManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66950a = com.xinzhu.haunted.d.b("android.os.storage.IStorageManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66951b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66952c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66951b.get().invoke(null, iBinder);
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
            if (f66951b.get() == null) {
                if (f66952c) {
                    return false;
                }
                f66951b.compareAndSet(null, com.xinzhu.haunted.d.g(f66950a, "asInterface", IBinder.class));
                f66952c = true;
                return f66951b.get() != null;
            }
            return true;
        }
    }
}
