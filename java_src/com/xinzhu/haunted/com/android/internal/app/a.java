package com.xinzhu.haunted.com.android.internal.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIAppOpsService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67223a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67224b = com.xinzhu.haunted.d.b("com.android.internal.app.IAppOpsService");

    /* compiled from: HtIAppOpsService.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0710a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67225a = com.xinzhu.haunted.d.b("com.android.internal.app.IAppOpsService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67226b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67227c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67226b.get().invoke(null, iBinder);
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
            if (f67226b.get() == null) {
                if (f67227c) {
                    return false;
                }
                f67226b.compareAndSet(null, com.xinzhu.haunted.d.g(f67225a, "asInterface", IBinder.class));
                f67227c = true;
                return f67226b.get() != null;
            }
            return true;
        }
    }
}
