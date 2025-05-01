package com.xinzhu.haunted.android.content.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtUserInfo.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66588b = "p";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66589c = com.xinzhu.haunted.d.b("android.content.pm.UserInfo");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66590d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66591e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Constructor> f66592f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66593g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66594a;

    public p(Object obj) {
        this.f66594a = obj;
    }

    public static boolean a(int i4, String str, int i5) {
        if (f66592f.get() == null) {
            if (f66593g) {
                return false;
            }
            AtomicReference<Constructor> atomicReference = f66592f;
            Class<?> cls = f66589c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.d(cls, "HtUserInfo", cls2, String.class, cls2));
            f66593g = true;
            return f66592f.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f66590d.get() == null) {
            if (f66591e) {
                return false;
            }
            f66590d.compareAndSet(null, com.xinzhu.haunted.d.f(f66589c, "FLAG_PRIMARY"));
            f66591e = true;
            return f66590d.get() != null;
        }
        return true;
    }

    public static p c(int i4, String str, int i5) {
        if (a(i4, str, i5)) {
            try {
                p pVar = new p();
                pVar.f66594a = f66592f.get().newInstance(Integer.valueOf(i4), str, Integer.valueOf(i5));
                return pVar;
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

    public static int d() {
        if (b()) {
            try {
                return ((Integer) f66590d.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static boolean e(int i4) {
        if (b()) {
            try {
                f66590d.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private p() {
    }
}
