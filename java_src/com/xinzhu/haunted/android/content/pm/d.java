package com.xinzhu.haunted.android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtILauncherApps.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66450a = "d";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66451b = com.xinzhu.haunted.d.b("android.content.pm.ILauncherApps");

    /* compiled from: HtILauncherApps.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66452a = com.xinzhu.haunted.d.b("android.content.pm.ILauncherApps$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66453b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66454c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66453b.get().invoke(null, iBinder);
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
            if (f66453b.get() == null) {
                if (f66454c) {
                    return false;
                }
                f66453b.compareAndSet(null, com.xinzhu.haunted.d.g(f66452a, "asInterface", IBinder.class));
                f66454c = true;
                return f66453b.get() != null;
            }
            return true;
        }
    }
}
