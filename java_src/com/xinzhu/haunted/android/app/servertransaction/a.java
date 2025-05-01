package com.xinzhu.haunted.android.app.servertransaction;

import android.os.IBinder;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtClientTransaction.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66091b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66092c = com.xinzhu.haunted.d.b("android.app.servertransaction.ClientTransaction");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66093d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66094e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66095f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66096g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66097h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66098i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66099a;

    public a(Object obj) {
        this.f66099a = obj;
    }

    public boolean a() {
        if (f66097h.get() == null) {
            if (f66098i) {
                return false;
            }
            f66097h.compareAndSet(null, com.xinzhu.haunted.d.f(f66092c, "mActivityCallbacks"));
            f66098i = true;
            return f66097h.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66093d.get() == null) {
            if (f66094e) {
                return false;
            }
            f66093d.compareAndSet(null, com.xinzhu.haunted.d.f(f66092c, "mActivityToken"));
            f66094e = true;
            return f66093d.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66095f.get() == null) {
            if (f66096g) {
                return false;
            }
            f66095f.compareAndSet(null, com.xinzhu.haunted.d.f(f66092c, "mLifecycleStateRequest"));
            f66096g = true;
            return f66095f.get() != null;
        }
        return true;
    }

    public List<Object> d() {
        if (a()) {
            try {
                return (List) f66097h.get().get(this.f66099a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public IBinder e() {
        if (b()) {
            try {
                return (IBinder) f66093d.get().get(this.f66099a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Object f() {
        if (c()) {
            try {
                return f66095f.get().get(this.f66099a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean g(List<Object> list) {
        if (a()) {
            try {
                f66097h.get().set(this.f66099a, list);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean h(IBinder iBinder) {
        if (b()) {
            try {
                f66093d.get().set(this.f66099a, iBinder);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean i(Object obj) {
        if (c()) {
            try {
                f66095f.get().set(this.f66099a, obj);
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
