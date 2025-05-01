package com.xinzhu.haunted.android.hardware.location;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIContextHubService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66719a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66720b = d.b("android.hardware.location.IContextHubService");

    /* compiled from: HtIContextHubService.java */
    /* renamed from: com.xinzhu.haunted.android.hardware.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0697a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66721a = d.b("android.hardware.location.IContextHubService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66722b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66723c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66722b.get().invoke(null, iBinder);
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
            if (f66722b.get() == null) {
                if (f66723c) {
                    return false;
                }
                f66722b.compareAndSet(null, d.g(f66721a, "asInterface", IBinder.class));
                f66723c = true;
                return f66722b.get() != null;
            }
            return true;
        }
    }
}
