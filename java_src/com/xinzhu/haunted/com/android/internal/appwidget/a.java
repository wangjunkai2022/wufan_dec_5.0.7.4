package com.xinzhu.haunted.com.android.internal.appwidget;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIAppWidgetService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67235a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67236b = d.b("com.android.internal.appwidget.IAppWidgetService");

    /* compiled from: HtIAppWidgetService.java */
    /* renamed from: com.xinzhu.haunted.com.android.internal.appwidget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0711a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67237a = d.b("com.android.internal.appwidget.IAppWidgetService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67238b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67239c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67238b.get().invoke(null, iBinder);
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
            if (f67238b.get() == null) {
                if (f67239c) {
                    return false;
                }
                f67238b.compareAndSet(null, d.g(f67237a, "asInterface", IBinder.class));
                f67239c = true;
                return f67238b.get() != null;
            }
            return true;
        }
    }
}
