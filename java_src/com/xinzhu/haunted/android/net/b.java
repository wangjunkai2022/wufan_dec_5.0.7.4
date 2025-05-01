package com.xinzhu.haunted.android.net;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtINetworkScoreService.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66775a = "b";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66776b = com.xinzhu.haunted.d.b("android.net.INetworkScoreService");

    /* compiled from: HtINetworkScoreService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66777a = com.xinzhu.haunted.d.b("android.net.INetworkScoreService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66778b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66779c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66778b.get().invoke(null, iBinder);
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
            if (f66778b.get() == null) {
                if (f66779c) {
                    return false;
                }
                f66778b.compareAndSet(null, com.xinzhu.haunted.d.g(f66777a, "asInterface", IBinder.class));
                f66779c = true;
                return f66778b.get() != null;
            }
            return true;
        }
    }
}
