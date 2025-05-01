package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIPowerManager.java */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66866a = "j";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66867b = com.xinzhu.haunted.d.b("android.os.IPowerManager");

    /* compiled from: HtIPowerManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66868a = com.xinzhu.haunted.d.b("android.os.IPowerManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66869b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66870c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66869b.get().invoke(null, iBinder);
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
            if (f66869b.get() == null) {
                if (f66870c) {
                    return false;
                }
                f66869b.compareAndSet(null, com.xinzhu.haunted.d.g(f66868a, "asInterface", IBinder.class));
                f66870c = true;
                return f66869b.get() != null;
            }
            return true;
        }
    }
}
