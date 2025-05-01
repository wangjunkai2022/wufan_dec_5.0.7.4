package com.xinzhu.haunted.android.content.pm;

import android.content.pm.SigningInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSigningInfo.java */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66579b = "o";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66580c = com.xinzhu.haunted.d.a(SigningInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66581d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66582e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Constructor> f66583f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66584g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f66585h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66586i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66587a;

    public o(Object obj) {
        this.f66587a = obj;
    }

    public static boolean a(Object obj) {
        if (f66583f.get() == null) {
            if (f66584g) {
                return false;
            }
            f66583f.compareAndSet(null, com.xinzhu.haunted.d.d(f66580c, "HtSigningInfo", "android.content.pm.PackageParser$SigningDetails"));
            f66584g = true;
            return f66583f.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f66585h.get() == null) {
            if (f66586i) {
                return false;
            }
            f66585h.compareAndSet(null, com.xinzhu.haunted.d.d(f66580c, "HtSigningInfo", new Object[0]));
            f66586i = true;
            return f66585h.get() != null;
        }
        return true;
    }

    public static o d() {
        if (b()) {
            try {
                o oVar = new o();
                oVar.f66587a = f66585h.get().newInstance(new Object[0]);
                return oVar;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            } catch (InstantiationException e6) {
                e6.printStackTrace();
                return null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static o e(Object obj) {
        if (a(obj)) {
            try {
                o oVar = new o();
                oVar.f66587a = f66583f.get().newInstance(obj);
                return oVar;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            } catch (InstantiationException e6) {
                e6.printStackTrace();
                return null;
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c() {
        if (f66581d.get() == null) {
            if (f66582e) {
                return false;
            }
            f66581d.compareAndSet(null, com.xinzhu.haunted.d.f(f66580c, "mSigningDetails"));
            f66582e = true;
            return f66581d.get() != null;
        }
        return true;
    }

    public Object f() {
        if (c()) {
            try {
                return f66581d.get().get(this.f66587a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean g(Object obj) {
        if (c()) {
            try {
                f66581d.get().set(this.f66587a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private o() {
    }
}
