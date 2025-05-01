package com.xinzhu.haunted.android.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIWallpaperManager.java */
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66115a = "t";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66116b = com.xinzhu.haunted.d.b("android.app.IWallpaperManager");

    /* compiled from: HtIWallpaperManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66117a = com.xinzhu.haunted.d.b("android.app.IWallpaperManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66118b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66119c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66118b.get().invoke(null, iBinder);
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
            if (f66118b.get() == null) {
                if (f66119c) {
                    return false;
                }
                f66118b.compareAndSet(null, com.xinzhu.haunted.d.g(f66117a, "asInterface", IBinder.class));
                f66119c = true;
                return f66118b.get() != null;
            }
            return true;
        }
    }
}
