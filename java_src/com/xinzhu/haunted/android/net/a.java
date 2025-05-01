package com.xinzhu.haunted.android.net;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIConnectivityManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66770a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66771b = com.xinzhu.haunted.d.b("android.net.IConnectivityManager");

    /* compiled from: HtIConnectivityManager.java */
    /* renamed from: com.xinzhu.haunted.android.net.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0700a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66772a = com.xinzhu.haunted.d.b("android.net.IConnectivityManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66773b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66774c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66773b.get().invoke(null, iBinder);
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
            if (f66773b.get() == null) {
                if (f66774c) {
                    return false;
                }
                f66773b.compareAndSet(null, com.xinzhu.haunted.d.g(f66772a, "asInterface", IBinder.class));
                f66774c = true;
                return f66773b.get() != null;
            }
            return true;
        }
    }
}
