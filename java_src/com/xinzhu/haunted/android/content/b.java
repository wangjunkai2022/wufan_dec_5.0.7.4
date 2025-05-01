package com.xinzhu.haunted.android.content;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAttributionSourceState.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66214b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66215c = com.xinzhu.haunted.d.b("android.content.AttributionSourceState");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66216d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66217e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66218f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66219g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66220a;

    public b(Object obj) {
        this.f66220a = obj;
    }

    public boolean a() {
        if (f66216d.get() == null) {
            if (f66217e) {
                return false;
            }
            f66216d.compareAndSet(null, com.xinzhu.haunted.d.f(f66215c, "packageName"));
            f66217e = true;
            return f66216d.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66218f.get() == null) {
            if (f66219g) {
                return false;
            }
            f66218f.compareAndSet(null, com.xinzhu.haunted.d.f(f66215c, "uid"));
            f66219g = true;
            return f66218f.get() != null;
        }
        return true;
    }

    public String c() {
        if (a()) {
            try {
                return (String) f66216d.get().get(this.f66220a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Integer d() {
        if (b()) {
            try {
                return (Integer) f66218f.get().get(this.f66220a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean e(String str) {
        if (a()) {
            try {
                f66216d.get().set(this.f66220a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean f(Integer num) {
        if (b()) {
            try {
                f66218f.get().set(this.f66220a, num);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private b() {
    }
}
