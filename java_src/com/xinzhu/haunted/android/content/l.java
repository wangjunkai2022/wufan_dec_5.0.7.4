package com.xinzhu.haunted.android.content;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIRestrictionsManager.java */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66306a = "l";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66307b = com.xinzhu.haunted.d.b("android.content.IRestrictionsManager");

    /* compiled from: HtIRestrictionsManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66308a = com.xinzhu.haunted.d.b("android.content.IRestrictionsManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66309b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66310c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66309b.get().invoke(null, iBinder);
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
            if (f66309b.get() == null) {
                if (f66310c) {
                    return false;
                }
                f66309b.compareAndSet(null, com.xinzhu.haunted.d.g(f66308a, "asInterface", IBinder.class));
                f66310c = true;
                return f66309b.get() != null;
            }
            return true;
        }
    }
}
