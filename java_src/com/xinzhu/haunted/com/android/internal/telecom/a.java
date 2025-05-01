package com.xinzhu.haunted.com.android.internal.telecom;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtITelecomService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67310a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67311b = d.b("com.android.internal.telecom.ITelecomService");

    /* compiled from: HtITelecomService.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.telecom.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0714a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67312a = d.b("com.android.internal.telecom.ITelecomService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67313b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67314c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67313b.get().invoke(null, iBinder);
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
            if (f67313b.get() == null) {
                if (f67314c) {
                    return false;
                }
                f67313b.compareAndSet(null, d.g(f67312a, "asInterface", IBinder.class));
                f67314c = true;
                return f67313b.get() != null;
            }
            return true;
        }
    }
}
