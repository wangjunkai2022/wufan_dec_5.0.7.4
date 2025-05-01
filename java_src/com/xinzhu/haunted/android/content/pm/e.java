package com.xinzhu.haunted.android.content.pm;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIPackageManager.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66460b = "e";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66461c = com.xinzhu.haunted.d.b("android.content.pm.IPackageManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66462d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66463e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66464f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66465g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66466h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66467i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66468j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66469k = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66470a;

    public e(Object obj) {
        this.f66470a = obj;
    }

    public int a(String str, String str2, int i4) {
        if (b(str, str2, i4)) {
            try {
                return ((Integer) f66466h.get().invoke(this.f66470a, str, str2, Integer.valueOf(i4))).intValue();
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

    public boolean b(String str, String str2, int i4) {
        if (f66466h.get() == null) {
            if (f66467i) {
                return false;
            }
            f66466h.compareAndSet(null, com.xinzhu.haunted.d.g(f66461c, "checkPermission", String.class, String.class, Integer.TYPE));
            f66467i = true;
            return f66466h.get() != null;
        }
        return true;
    }

    public boolean c(String str, int i4, int i5) {
        if (f66462d.get() == null) {
            if (f66463e) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66462d;
            Class<?> cls = f66461c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "getApplicationInfo", String.class, cls2, cls2));
            f66463e = true;
            return f66462d.get() != null;
        }
        return true;
    }

    public boolean d(String str, long j4, int i4) {
        if (f66464f.get() == null) {
            if (f66465g) {
                return false;
            }
            f66464f.compareAndSet(null, com.xinzhu.haunted.d.g(f66461c, "getApplicationInfo", String.class, Long.TYPE, Integer.TYPE));
            f66465g = true;
            return f66464f.get() != null;
        }
        return true;
    }

    public boolean e(Intent intent, String str, int i4, int i5) {
        if (f66468j.get() == null) {
            if (f66469k) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66468j;
            Class<?> cls = f66461c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "resolveIntent", Intent.class, String.class, cls2, cls2));
            f66469k = true;
            return f66468j.get() != null;
        }
        return true;
    }

    public ApplicationInfo f(String str, int i4, int i5) {
        if (c(str, i4, i5)) {
            try {
                return (ApplicationInfo) f66462d.get().invoke(this.f66470a, str, Integer.valueOf(i4), Integer.valueOf(i5));
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

    public ApplicationInfo g(String str, long j4, int i4) {
        if (d(str, j4, i4)) {
            try {
                return (ApplicationInfo) f66464f.get().invoke(this.f66470a, str, Long.valueOf(j4), Integer.valueOf(i4));
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

    public ResolveInfo h(Intent intent, String str, int i4, int i5) {
        if (e(intent, str, i4, i5)) {
            try {
                return (ResolveInfo) f66468j.get().invoke(this.f66470a, intent, str, Integer.valueOf(i4), Integer.valueOf(i5));
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

    private e() {
    }
}
