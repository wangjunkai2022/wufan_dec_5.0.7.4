package com.xinzhu.haunted.com.android.internal.telephony;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtISub.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67331a = "d";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67332b = com.xinzhu.haunted.d.b("com.android.internal.telephony.ISub");

    /* compiled from: HtISub.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67333a = com.xinzhu.haunted.d.b("com.android.internal.telephony.ISub$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67334b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67335c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67334b.get().invoke(null, iBinder);
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
            if (f67334b.get() == null) {
                if (f67335c) {
                    return false;
                }
                f67334b.compareAndSet(null, com.xinzhu.haunted.d.g(f67333a, "asInterface", IBinder.class));
                f67335c = true;
                return f67334b.get() != null;
            }
            return true;
        }
    }
}
