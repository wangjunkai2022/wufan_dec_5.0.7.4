package com.xinzhu.haunted.android.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIUriGrantsManager.java */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66076a = "s";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66077b = com.xinzhu.haunted.d.b("android.app.IUriGrantsManager");

    /* compiled from: HtIUriGrantsManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66078a = com.xinzhu.haunted.d.b("android.app.IUriGrantsManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66079b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66080c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66079b.get().invoke(null, iBinder);
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
            if (f66079b.get() == null) {
                if (f66080c) {
                    return false;
                }
                f66079b.compareAndSet(null, com.xinzhu.haunted.d.g(f66078a, "asInterface", IBinder.class));
                f66080c = true;
                return f66079b.get() != null;
            }
            return true;
        }
    }
}
