package com.xinzhu.haunted.android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIShortcutService.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66472a = "f";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66473b = com.xinzhu.haunted.d.b("android.content.pm.IShortcutService");

    /* compiled from: HtIShortcutService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66474a = com.xinzhu.haunted.d.b("android.content.pm.IShortcutService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66475b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66476c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66475b.get().invoke(null, iBinder);
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
            if (f66475b.get() == null) {
                if (f66476c) {
                    return false;
                }
                f66475b.compareAndSet(null, com.xinzhu.haunted.d.g(f66474a, "asInterface", IBinder.class));
                f66476c = true;
                return f66475b.get() != null;
            }
            return true;
        }
    }
}
