package com.xinzhu.haunted.android.view.inputmethod;

import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIInputMethodManagerGlobalInvoker.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67130a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67131b = d.b("android.view.inputmethod.IInputMethodManagerGlobalInvoker");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f67132c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67133d = false;

    public static boolean a() {
        if (f67132c.get() == null) {
            if (f67133d) {
                return false;
            }
            f67132c.compareAndSet(null, d.f(f67131b, "sServiceCache"));
            f67133d = true;
            return f67132c.get() != null;
        }
        return true;
    }

    public static Object b() {
        if (a()) {
            try {
                return f67132c.get().get(null);
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
                f67132c.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
