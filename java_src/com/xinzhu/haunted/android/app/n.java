package com.xinzhu.haunted.android.app;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIActivityTaskManager.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66035b = "n";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66036c = com.xinzhu.haunted.d.b("android.app.IActivityTaskManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66037d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66038e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66039f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66040g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66041a;

    /* compiled from: HtIActivityTaskManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66042a = com.xinzhu.haunted.d.b("android.app.IActivityTaskManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66043b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66044c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66043b.get().invoke(null, iBinder);
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
            if (f66043b.get() == null) {
                if (f66044c) {
                    return false;
                }
                f66043b.compareAndSet(null, com.xinzhu.haunted.d.g(f66042a, "asInterface", IBinder.class));
                f66044c = true;
                return f66043b.get() != null;
            }
            return true;
        }
    }

    public n(Object obj) {
        this.f66041a = obj;
    }

    public boolean a(IBinder iBinder) {
        if (f66039f.get() == null) {
            if (f66040g) {
                return false;
            }
            f66039f.compareAndSet(null, com.xinzhu.haunted.d.g(f66036c, "getLaunchedFromPackage", IBinder.class));
            f66040g = true;
            return f66039f.get() != null;
        }
        return true;
    }

    public boolean b(IBinder iBinder) {
        if (f66037d.get() == null) {
            if (f66038e) {
                return false;
            }
            f66037d.compareAndSet(null, com.xinzhu.haunted.d.g(f66036c, "getLaunchedFromUid", IBinder.class));
            f66038e = true;
            return f66037d.get() != null;
        }
        return true;
    }

    public String c(IBinder iBinder) {
        if (a(iBinder)) {
            try {
                return (String) f66039f.get().invoke(this.f66041a, iBinder);
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

    public int d(IBinder iBinder) {
        if (b(iBinder)) {
            try {
                return ((Integer) f66037d.get().invoke(this.f66041a, iBinder)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    private n() {
    }
}
