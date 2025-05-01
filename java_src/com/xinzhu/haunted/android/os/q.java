package com.xinzhu.haunted.android.os;

import android.os.Process;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtProcess.java */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66913a = "q";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66914b = com.xinzhu.haunted.d.a(Process.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66915c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66916d = false;

    public static boolean a(String str) {
        if (f66915c.get() == null) {
            if (f66916d) {
                return false;
            }
            f66915c.compareAndSet(null, com.xinzhu.haunted.d.g(f66914b, "setArgV0", String.class));
            f66916d = true;
            return f66915c.get() != null;
        }
        return true;
    }

    public static void b(String str) {
        if (a(str)) {
            try {
                f66915c.get().invoke(null, str);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }
}
