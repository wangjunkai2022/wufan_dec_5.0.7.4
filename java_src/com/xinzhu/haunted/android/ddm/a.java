package com.xinzhu.haunted.android.ddm;

import com.xinzhu.haunted.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtDdmHandleAppName.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66706a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66707b = d.b("android.ddm.DdmHandleAppName");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66708c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66709d = false;

    public static boolean a(String str, int i4) {
        if (f66708c.get() == null) {
            if (f66709d) {
                return false;
            }
            f66708c.compareAndSet(null, d.g(f66707b, "setAppName", String.class, Integer.TYPE));
            f66709d = true;
            return f66708c.get() != null;
        }
        return true;
    }

    public static void b(String str, int i4) {
        if (a(str, i4)) {
            try {
                f66708c.get().invoke(null, str, Integer.valueOf(i4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }
}
