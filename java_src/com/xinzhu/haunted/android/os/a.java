package com.xinzhu.haunted.android.os;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtBundle.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66794a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66795b = com.xinzhu.haunted.d.a(Bundle.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66796c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f66797d = false;

    public static boolean a(Bundle bundle, boolean z4) {
        if (f66796c.get() == null) {
            if (f66797d) {
                return false;
            }
            f66796c.compareAndSet(null, com.xinzhu.haunted.d.g(f66795b, "setDefusable", Bundle.class, Boolean.TYPE));
            f66797d = true;
            return f66796c.get() != null;
        }
        return true;
    }

    public static Bundle b(Bundle bundle, boolean z4) {
        if (a(bundle, z4)) {
            try {
                return (Bundle) f66796c.get().invoke(null, bundle, Boolean.valueOf(z4));
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
}
