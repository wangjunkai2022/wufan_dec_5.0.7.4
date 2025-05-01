package com.xinzhu.haunted.android.content;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIContentService.java */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66294a = "j";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66295b = com.xinzhu.haunted.d.b("android.content.IContentService");

    /* compiled from: HtIContentService.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66296a = com.xinzhu.haunted.d.b("android.content.IContentService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66297b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66298c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66297b.get().invoke(null, iBinder);
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
            if (f66297b.get() == null) {
                if (f66298c) {
                    return false;
                }
                f66297b.compareAndSet(null, com.xinzhu.haunted.d.g(f66296a, "asInterface", IBinder.class));
                f66298c = true;
                return f66297b.get() != null;
            }
            return true;
        }
    }
}
