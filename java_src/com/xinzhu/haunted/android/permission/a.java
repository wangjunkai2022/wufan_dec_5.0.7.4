package com.xinzhu.haunted.android.permission;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIPermissionManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67029a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67030b = d.b("android.permission.IPermissionManager");

    /* compiled from: HtIPermissionManager.java */
    /* renamed from: com.xinzhu.haunted.android.permission.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0703a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67031a = d.b("android.permission.IPermissionManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67032b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67033c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67032b.get().invoke(null, iBinder);
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
            if (f67032b.get() == null) {
                if (f67033c) {
                    return false;
                }
                f67032b.compareAndSet(null, d.g(f67031a, "asInterface", IBinder.class));
                f67033c = true;
                return f67032b.get() != null;
            }
            return true;
        }
    }
}
