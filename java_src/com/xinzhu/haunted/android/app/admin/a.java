package com.xinzhu.haunted.android.app.admin;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIDevicePolicyManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65747a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65748b = d.b("android.app.admin.IDevicePolicyManager");

    /* compiled from: HtIDevicePolicyManager.java */
    /* renamed from: com.xinzhu.haunted.android.app.admin.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0689a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f65749a = d.b("android.app.admin.IDevicePolicyManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f65750b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f65751c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f65750b.get().invoke(null, iBinder);
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
            if (f65750b.get() == null) {
                if (f65751c) {
                    return false;
                }
                f65750b.compareAndSet(null, d.g(f65749a, "asInterface", IBinder.class));
                f65751c = true;
                return f65750b.get() != null;
            }
            return true;
        }
    }
}
