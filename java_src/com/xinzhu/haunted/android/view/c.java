package com.xinzhu.haunted.android.view;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIWindowManager.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67113a = "c";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67114b = com.xinzhu.haunted.d.b("android.view.IWindowManager");

    /* compiled from: HtIWindowManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67115a = com.xinzhu.haunted.d.b("android.view.IWindowManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67116b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67117c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67116b.get().invoke(null, iBinder);
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
            if (f67116b.get() == null) {
                if (f67117c) {
                    return false;
                }
                f67116b.compareAndSet(null, com.xinzhu.haunted.d.g(f67115a, "asInterface", IBinder.class));
                f67117c = true;
                return f67116b.get() != null;
            }
            return true;
        }
    }
}
