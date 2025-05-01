package com.xinzhu.haunted.com.android.internal.textservice;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtITextServicesManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67352a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67353b = d.b("com.android.internal.textservice.ITextServicesManager");

    /* compiled from: HtITextServicesManager.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.textservice.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0716a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67354a = d.b("com.android.internal.textservice.ITextServicesManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67355b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67356c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67355b.get().invoke(null, iBinder);
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
            if (f67355b.get() == null) {
                if (f67356c) {
                    return false;
                }
                f67355b.compareAndSet(null, d.g(f67354a, "asInterface", IBinder.class));
                f67356c = true;
                return f67355b.get() != null;
            }
            return true;
        }
    }
}
