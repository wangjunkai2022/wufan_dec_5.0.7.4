package com.switfpass.pay.activity.zxing.camera;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f61646a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static final Object f61647b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f61648c;

    static {
        Method b5;
        Object a5;
        Class c5;
        Method b6;
        Class c6 = c("android.os.ServiceManager");
        Object a6 = (c6 == null || (b5 = b(c6, "getService", String.class)) == null || (a5 = a(b5, null, "hardware")) == null || (c5 = c("android.os.IHardwareService$Stub")) == null || (b6 = b(c5, "asInterface", IBinder.class)) == null) ? null : a(b6, null, a5);
        f61647b = a6;
        f61648c = a6 != null ? b(a6.getClass(), "setFlashlightEnabled", Boolean.TYPE) : null;
    }

    private e() {
    }

    private static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            new StringBuilder("Unexpected error while invoking ").append(method);
            return null;
        } catch (RuntimeException unused2) {
            new StringBuilder("Unexpected error while invoking ").append(method);
            return null;
        } catch (InvocationTargetException e5) {
            new StringBuilder("Unexpected error while invoking ").append(method);
            e5.getCause();
            return null;
        }
    }

    private static Method b(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (RuntimeException unused2) {
            new StringBuilder("Unexpected error while finding method ").append(str);
            return null;
        }
    }

    private static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            new StringBuilder("Unexpected error while finding class ").append(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        Object obj = f61647b;
        if (obj != null) {
            a(f61648c, obj, Boolean.FALSE);
        }
    }
}
