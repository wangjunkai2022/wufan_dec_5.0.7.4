package com.xinzhu.haunted.android.content;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAttributionSource.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66185b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66186c = com.xinzhu.haunted.d.b("android.content.AttributionSource");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66187d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66188e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66189f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66190g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66191a;

    public a(Object obj) {
        this.f66191a = obj;
    }

    public boolean a() {
        if (f66187d.get() == null) {
            if (f66188e) {
                return false;
            }
            f66187d.compareAndSet(null, com.xinzhu.haunted.d.f(f66186c, "mAttributionSourceState"));
            f66188e = true;
            return f66187d.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66189f.get() == null) {
            if (f66190g) {
                return false;
            }
            f66189f.compareAndSet(null, com.xinzhu.haunted.d.g(f66186c, "getNext", new Object[0]));
            f66190g = true;
            return f66189f.get() != null;
        }
        return true;
    }

    public Object c() {
        if (b()) {
            try {
                return f66189f.get().invoke(this.f66191a, new Object[0]);
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

    public Object d() {
        if (a()) {
            try {
                return f66187d.get().get(this.f66191a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean e(Object obj) {
        if (a()) {
            try {
                f66187d.get().set(this.f66191a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private a() {
    }
}
