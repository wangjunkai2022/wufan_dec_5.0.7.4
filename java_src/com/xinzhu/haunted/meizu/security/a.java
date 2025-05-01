package com.xinzhu.haunted.meizu.security;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIFlymePermissionService.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67422a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67423b = d.b("meizu.security.IFlymePermissionService");

    /* compiled from: HtIFlymePermissionService.java */
    /* renamed from: com.xinzhu.haunted.meizu.security.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0719a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67424a = d.b("meizu.security.IFlymePermissionService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67425b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67426c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67425b.get().invoke(null, iBinder);
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
            if (f67425b.get() == null) {
                if (f67426c) {
                    return false;
                }
                f67425b.compareAndSet(null, d.g(f67424a, "asInterface", IBinder.class));
                f67426c = true;
                return f67425b.get() != null;
            }
            return true;
        }
    }
}
