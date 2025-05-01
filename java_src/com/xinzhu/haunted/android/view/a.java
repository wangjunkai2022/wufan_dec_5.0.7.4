package com.xinzhu.haunted.android.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIAutoFillManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67095a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67096b = com.xinzhu.haunted.d.b("android.view.autofill.IAutoFillManager");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f67097c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67098d = false;

    /* compiled from: HtIAutoFillManager.java */
    /* renamed from: com.xinzhu.haunted.android.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0707a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67099a = com.xinzhu.haunted.d.b("android.view.autofill.IAutoFillManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67100b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67101c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67100b.get().invoke(null, iBinder);
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
            if (f67100b.get() == null) {
                if (f67101c) {
                    return false;
                }
                f67100b.compareAndSet(null, com.xinzhu.haunted.d.g(f67099a, "asInterface", IBinder.class));
                f67101c = true;
                return f67100b.get() != null;
            }
            return true;
        }
    }

    public static boolean a(Bundle bundle, boolean z4) {
        if (f67097c.get() == null) {
            if (f67098d) {
                return false;
            }
            f67097c.compareAndSet(null, com.xinzhu.haunted.d.g(f67096b, "setDefusable", Bundle.class, Boolean.TYPE));
            f67098d = true;
            return f67097c.get() != null;
        }
        return true;
    }

    public static Bundle b(Bundle bundle, boolean z4) {
        if (a(bundle, z4)) {
            try {
                return (Bundle) f67097c.get().invoke(null, bundle, Boolean.valueOf(z4));
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
}
