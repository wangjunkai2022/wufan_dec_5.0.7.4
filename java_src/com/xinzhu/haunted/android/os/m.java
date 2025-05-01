package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIUserManager.java */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66884a = "m";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66885b = com.xinzhu.haunted.d.b("android.os.IUserManager");

    /* compiled from: HtIUserManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66886a = com.xinzhu.haunted.d.b("android.os.IUserManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66887b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66888c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66887b.get().invoke(null, iBinder);
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
            if (f66887b.get() == null) {
                if (f66888c) {
                    return false;
                }
                f66887b.compareAndSet(null, com.xinzhu.haunted.d.g(f66886a, "asInterface", IBinder.class));
                f66888c = true;
                return f66887b.get() != null;
            }
            return true;
        }
    }
}
