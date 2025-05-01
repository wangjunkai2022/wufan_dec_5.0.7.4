package com.xinzhu.haunted.android.sec.clipboard;

import android.os.IBinder;
import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIClipboardService.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67062a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67063b = d.b("android.sec.clipboard.IClipboardService");

    /* compiled from: HtIClipboardService.java */
    /* renamed from: com.xinzhu.haunted.android.sec.clipboard.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0706a {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f67064a = d.b("android.sec.clipboard.IClipboardService$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f67065b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f67066c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f67065b.get().invoke(null, iBinder);
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
            if (f67065b.get() == null) {
                if (f67066c) {
                    return false;
                }
                f67065b.compareAndSet(null, d.g(f67064a, "asInterface", IBinder.class));
                f67066c = true;
                return f67065b.get() != null;
            }
            return true;
        }
    }
}
