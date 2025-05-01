package com.xinzhu.haunted.android.view.accessibility;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIAccessibilityManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67102a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67103b = d.b("android.view.accessibility.IAccessibilityManager");

    /* compiled from: HtIAccessibilityManager.java */
    /* renamed from: com.xinzhu.haunted.android.view.accessibility.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0708a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67104a = d.b("android.view.accessibility.IAccessibilityManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67105b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67106c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67105b.get().invoke(null, iBinder);
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
            if (f67105b.get() == null) {
                if (f67106c) {
                    return false;
                }
                f67105b.compareAndSet(null, d.g(f67104a, "asInterface", IBinder.class));
                f67106c = true;
                return f67105b.get() != null;
            }
            return true;
        }
    }
}
