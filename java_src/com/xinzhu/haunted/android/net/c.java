package com.xinzhu.haunted.android.net;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtITetheringConnector.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66780a = "c";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66781b = com.xinzhu.haunted.d.b("android.net.ITetheringConnector");

    /* compiled from: HtITetheringConnector.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66782a = com.xinzhu.haunted.d.b("android.net.ITetheringConnector$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66783b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66784c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66783b.get().invoke(null, iBinder);
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
            if (f66783b.get() == null) {
                if (f66784c) {
                    return false;
                }
                f66783b.compareAndSet(null, com.xinzhu.haunted.d.g(f66782a, "asInterface", IBinder.class));
                f66784c = true;
                return f66783b.get() != null;
            }
            return true;
        }
    }
}
