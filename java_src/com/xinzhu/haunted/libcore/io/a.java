package com.xinzhu.haunted.libcore.io;

import com.umeng.analytics.pro.bm;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtLibcore.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67417a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67418b = d.b("libcore.io.Libcore");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f67419c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67420d = false;

    public static boolean a() {
        if (f67419c.get() == null) {
            if (f67420d) {
                return false;
            }
            f67419c.compareAndSet(null, d.f(f67418b, bm.f63463x));
            f67420d = true;
            return f67419c.get() != null;
        }
        return true;
    }

    public static Object b() {
        if (a()) {
            try {
                return f67419c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean c(Object obj) {
        if (a()) {
            try {
                f67419c.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
