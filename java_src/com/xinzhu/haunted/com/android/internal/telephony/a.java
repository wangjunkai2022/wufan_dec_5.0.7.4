package com.xinzhu.haunted.com.android.internal.telephony;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIHwTelephony.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67316a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67317b = com.xinzhu.haunted.d.b("com.android.internal.telephony.IHwTelephony");

    /* compiled from: HtIHwTelephony.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.telephony.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0715a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67318a = com.xinzhu.haunted.d.b("com.android.internal.telephony.IHwTelephony$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67319b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67320c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67319b.get().invoke(null, iBinder);
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
            if (f67319b.get() == null) {
                if (f67320c) {
                    return false;
                }
                f67319b.compareAndSet(null, com.xinzhu.haunted.d.g(f67318a, "asInterface", IBinder.class));
                f67320c = true;
                return f67319b.get() != null;
            }
            return true;
        }
    }
}
