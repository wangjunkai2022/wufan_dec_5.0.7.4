package com.xinzhu.haunted.android.media;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIMediaRouterService.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66757a = "b";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66758b = com.xinzhu.haunted.d.b("android.media.IMediaRouterService");

    /* compiled from: HtIMediaRouterService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66759a = com.xinzhu.haunted.d.b("android.media.IMediaRouterService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66760b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66761c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66760b.get().invoke(null, iBinder);
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
            if (f66760b.get() == null) {
                if (f66761c) {
                    return false;
                }
                f66760b.compareAndSet(null, com.xinzhu.haunted.d.g(f66759a, "asInterface", IBinder.class));
                f66761c = true;
                return f66760b.get() != null;
            }
            return true;
        }
    }
}
