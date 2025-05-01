package com.xinzhu.haunted.android.content;

import android.app.job.JobParameters;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtJobParameters.java */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66339b = "o";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66340c = com.xinzhu.haunted.d.a(JobParameters.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66341d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66342e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66343f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66344g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66345h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66346i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66347j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66348k = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66349a;

    public o(Object obj) {
        this.f66349a = obj;
    }

    public static boolean a() {
        if (f66343f.get() == null) {
            if (f66344g) {
                return false;
            }
            f66343f.compareAndSet(null, com.xinzhu.haunted.d.f(f66340c, "REASON_CANCELED"));
            f66344g = true;
            return f66343f.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f66341d.get() == null) {
            if (f66342e) {
                return false;
            }
            f66341d.compareAndSet(null, com.xinzhu.haunted.d.f(f66340c, "REASON_TIMEOUT"));
            f66342e = true;
            return f66341d.get() != null;
        }
        return true;
    }

    public static int g() {
        if (a()) {
            try {
                return ((Integer) f66343f.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static int h() {
        if (b()) {
            try {
                return ((Integer) f66341d.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static boolean i(int i4) {
        if (a()) {
            try {
                f66343f.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean j(int i4) {
        if (b()) {
            try {
                f66341d.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean c() {
        if (f66347j.get() == null) {
            if (f66348k) {
                return false;
            }
            f66347j.compareAndSet(null, com.xinzhu.haunted.d.g(f66340c, "getDebugStopReason", new Object[0]));
            f66348k = true;
            return f66347j.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f66345h.get() == null) {
            if (f66346i) {
                return false;
            }
            f66345h.compareAndSet(null, com.xinzhu.haunted.d.g(f66340c, "getStopReason", new Object[0]));
            f66346i = true;
            return f66345h.get() != null;
        }
        return true;
    }

    public String e() {
        if (c()) {
            try {
                return (String) f66347j.get().invoke(this.f66349a, new Object[0]);
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

    public int f() {
        if (d()) {
            try {
                return ((Integer) f66345h.get().invoke(this.f66349a, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    private o() {
    }
}
