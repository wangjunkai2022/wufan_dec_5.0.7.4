package com.xinzhu.haunted.com.android.internal.telephony;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtISms.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67326a = "c";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67327b = com.xinzhu.haunted.d.b("com.android.internal.telephony.ISms");

    /* compiled from: HtISms.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67328a = com.xinzhu.haunted.d.b("com.android.internal.telephony.ISms$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67329b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67330c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67329b.get().invoke(null, iBinder);
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
            if (f67329b.get() == null) {
                if (f67330c) {
                    return false;
                }
                f67329b.compareAndSet(null, com.xinzhu.haunted.d.g(f67328a, "asInterface", IBinder.class));
                f67330c = true;
                return f67329b.get() != null;
            }
            return true;
        }
    }
}
