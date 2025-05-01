package com.xinzhu.haunted.android.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivity.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65727b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65728c = com.xinzhu.haunted.d.a(Activity.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65729d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65730e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f65731f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f65732g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f65733h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f65734i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f65735j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f65736k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Field> f65737l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f65738m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Method> f65739n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f65740o = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65741a;

    public a(Object obj) {
        this.f65741a = obj;
    }

    public boolean a() {
        if (f65735j.get() == null) {
            if (f65736k) {
                return false;
            }
            f65735j.compareAndSet(null, com.xinzhu.haunted.d.f(f65728c, "mActivityInfo"));
            f65736k = true;
            return f65735j.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f65733h.get() == null) {
            if (f65734i) {
                return false;
            }
            f65733h.compareAndSet(null, com.xinzhu.haunted.d.f(f65728c, "mFinished"));
            f65734i = true;
            return f65733h.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f65729d.get() == null) {
            if (f65730e) {
                return false;
            }
            f65729d.compareAndSet(null, com.xinzhu.haunted.d.f(f65728c, "mResultCode"));
            f65730e = true;
            return f65729d.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f65731f.get() == null) {
            if (f65732g) {
                return false;
            }
            f65731f.compareAndSet(null, com.xinzhu.haunted.d.f(f65728c, "mResultData"));
            f65732g = true;
            return f65731f.get() != null;
        }
        return true;
    }

    public boolean e() {
        if (f65737l.get() == null) {
            if (f65738m) {
                return false;
            }
            f65737l.compareAndSet(null, com.xinzhu.haunted.d.f(f65728c, "mToken"));
            f65738m = true;
            return f65737l.get() != null;
        }
        return true;
    }

    public boolean f() {
        if (f65739n.get() == null) {
            if (f65740o) {
                return false;
            }
            f65739n.compareAndSet(null, com.xinzhu.haunted.d.g(f65728c, "getActivityToken", new Object[0]));
            f65740o = true;
            return f65739n.get() != null;
        }
        return true;
    }

    public IBinder g() {
        if (f()) {
            try {
                return (IBinder) f65739n.get().invoke(this.f65741a, new Object[0]);
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

    public ActivityInfo h() {
        if (a()) {
            try {
                return (ActivityInfo) f65735j.get().get(this.f65741a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean i() {
        if (b()) {
            try {
                return ((Boolean) f65733h.get().get(this.f65741a)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int j() {
        if (c()) {
            try {
                return ((Integer) f65729d.get().get(this.f65741a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public Intent k() {
        if (d()) {
            try {
                return (Intent) f65731f.get().get(this.f65741a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public IBinder l() {
        if (e()) {
            try {
                return (IBinder) f65737l.get().get(this.f65741a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean m(ActivityInfo activityInfo) {
        if (a()) {
            try {
                f65735j.get().set(this.f65741a, activityInfo);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean n(boolean z4) {
        if (b()) {
            try {
                f65733h.get().set(this.f65741a, Boolean.valueOf(z4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean o(int i4) {
        if (c()) {
            try {
                f65729d.get().set(this.f65741a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean p(Intent intent) {
        if (d()) {
            try {
                f65731f.get().set(this.f65741a, intent);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean q(IBinder iBinder) {
        if (e()) {
            try {
                f65737l.get().set(this.f65741a, iBinder);
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
