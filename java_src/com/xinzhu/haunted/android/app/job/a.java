package com.xinzhu.haunted.android.app.job;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIJobScheduler.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65957a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65958b = com.xinzhu.haunted.d.b("android.app.job.IJobScheduler");

    /* compiled from: HtIJobScheduler.java */
    /* renamed from: com.xinzhu.haunted.android.app.job.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0691a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f65959a = com.xinzhu.haunted.d.b("android.app.job.IJobScheduler$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f65960b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f65961c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f65960b.get().invoke(null, iBinder);
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
            if (f65960b.get() == null) {
                if (f65961c) {
                    return false;
                }
                f65960b.compareAndSet(null, com.xinzhu.haunted.d.g(f65959a, "asInterface", IBinder.class));
                f65961c = true;
                return f65960b.get() != null;
            }
            return true;
        }
    }
}
