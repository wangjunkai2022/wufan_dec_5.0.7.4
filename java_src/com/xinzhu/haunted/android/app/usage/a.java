package com.xinzhu.haunted.android.app.usage;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIUsageStatsManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66152a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66153b = d.b("android.app.usage.IUsageStatsManager");

    /* compiled from: HtIUsageStatsManager.java */
    /* renamed from: com.xinzhu.haunted.android.app.usage.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0695a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66154a = d.b("android.app.usage.IUsageStatsManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66155b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66156c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66155b.get().invoke(null, iBinder);
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
            if (f66155b.get() == null) {
                if (f66156c) {
                    return false;
                }
                f66155b.compareAndSet(null, d.g(f66154a, "asInterface", IBinder.class));
                f66156c = true;
                return f66155b.get() != null;
            }
            return true;
        }
    }
}
