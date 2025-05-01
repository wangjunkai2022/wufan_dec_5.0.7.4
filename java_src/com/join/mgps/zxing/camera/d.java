package com.join.mgps.zxing.camera;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: FlashlightManager.java */
/* loaded from: classes5.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55056a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static final Object f55057b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f55058c;

    static {
        Object c5 = c();
        f55057b = c5;
        f55058c = d(c5);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        h(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        h(false);
    }

    private static Object c() {
        Method g4;
        Object e5;
        Class<?> f5;
        Method g5;
        Class<?> f6 = f("android.os.ServiceManager");
        if (f6 == null || (g4 = g(f6, "getService", String.class)) == null || (e5 = e(g4, null, "hardware")) == null || (f5 = f("android.os.IHardwareService$Stub")) == null || (g5 = g(f5, "asInterface", IBinder.class)) == null) {
            return null;
        }
        return e(g5, null, e5);
    }

    private static Method d(Object obj) {
        if (obj == null) {
            return null;
        }
        return g(obj.getClass(), "setFlashlightEnabled", Boolean.TYPE);
    }

    private static Object e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected error while invoking ");
            sb.append(method);
            return null;
        } catch (RuntimeException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected error while invoking ");
            sb2.append(method);
            return null;
        } catch (InvocationTargetException e5) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unexpected error while invoking ");
            sb3.append(method);
            e5.getCause();
            return null;
        }
    }

    private static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected error while finding class ");
            sb.append(str);
            return null;
        }
    }

    private static Method g(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (RuntimeException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected error while finding method ");
            sb.append(str);
            return null;
        }
    }

    private static void h(boolean z4) {
        Object obj = f55057b;
        if (obj != null) {
            e(f55058c, obj, Boolean.valueOf(z4));
        }
    }
}
