package com.xinzhu.haunted.android.net.wifi;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIWifiManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66788a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66789b = d.b("android.net.wifi.IWifiManager");

    /* compiled from: HtIWifiManager.java */
    /* renamed from: com.xinzhu.haunted.android.net.wifi.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0701a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66790a = d.b("android.net.wifi.IWifiManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66791b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66792c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66791b.get().invoke(null, iBinder);
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
            if (f66791b.get() == null) {
                if (f66792c) {
                    return false;
                }
                f66791b.compareAndSet(null, d.g(f66790a, "asInterface", IBinder.class));
                f66792c = true;
                return f66791b.get() != null;
            }
            return true;
        }
    }
}
