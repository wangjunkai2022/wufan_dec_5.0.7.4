package com.xinzhu.haunted.com.android.internal.view;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIInputMethodManager.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67358a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67359b = d.b("com.android.internal.view.IInputMethodManager");

    /* compiled from: HtIInputMethodManager.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0717a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67360a = d.b("com.android.internal.view.IInputMethodManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67361b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67362c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67361b.get().invoke(null, iBinder);
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
            if (f67361b.get() == null) {
                if (f67362c) {
                    return false;
                }
                f67361b.compareAndSet(null, d.g(f67360a, "asInterface", IBinder.class));
                f67362c = true;
                return f67361b.get() != null;
            }
            return true;
        }
    }
}
