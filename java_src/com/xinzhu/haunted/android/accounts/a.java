package com.xinzhu.haunted.android.accounts;

import android.accounts.Account;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAccount.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65681b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65682c = com.xinzhu.haunted.d.a(Account.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f65683d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65684e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f65685f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f65686g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f65687h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f65688i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Constructor> f65689j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f65690k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Constructor> f65691l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f65692m = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65693a;

    public a(Object obj) {
        this.f65693a = obj;
    }

    public static boolean a(Account account, String str) {
        if (f65689j.get() == null) {
            if (f65690k) {
                return false;
            }
            f65689j.compareAndSet(null, com.xinzhu.haunted.d.d(f65682c, "HtAccount", Account.class, String.class));
            f65690k = true;
            return f65689j.get() != null;
        }
        return true;
    }

    public static boolean b(String str, String str2, String str3) {
        if (f65691l.get() == null) {
            if (f65692m) {
                return false;
            }
            f65691l.compareAndSet(null, com.xinzhu.haunted.d.d(f65682c, "HtAccount", String.class, String.class, String.class));
            f65692m = true;
            return f65691l.get() != null;
        }
        return true;
    }

    public static a f(Account account, String str) {
        if (a(account, str)) {
            try {
                a aVar = new a();
                aVar.f65693a = f65689j.get().newInstance(account, str);
                return aVar;
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

    public static a g(String str, String str2, String str3) {
        if (b(str, str2, str3)) {
            try {
                a aVar = new a();
                aVar.f65693a = f65691l.get().newInstance(str, str2, str3);
                return aVar;
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
        if (f65685f.get() == null) {
            if (f65686g) {
                return false;
            }
            f65685f.compareAndSet(null, com.xinzhu.haunted.d.g(f65682c, "getAccessId", new Object[0]));
            f65686g = true;
            return f65685f.get() != null;
        }
        return true;
    }

    public boolean d(String str, String str2) {
        if (f65687h.get() == null) {
            if (f65688i) {
                return false;
            }
            f65687h.compareAndSet(null, com.xinzhu.haunted.d.g(f65682c, "putString", String.class, String.class));
            f65688i = true;
            return f65687h.get() != null;
        }
        return true;
    }

    public boolean e() {
        if (f65683d.get() == null) {
            if (f65684e) {
                return false;
            }
            f65683d.compareAndSet(null, com.xinzhu.haunted.d.g(f65682c, "toSafeString", new Object[0]));
            f65684e = true;
            return f65683d.get() != null;
        }
        return true;
    }

    public String h() {
        if (c()) {
            try {
                return (String) f65685f.get().invoke(this.f65693a, new Object[0]);
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

    public String i(String str, String str2) {
        if (d(str, str2)) {
            try {
                return (String) f65687h.get().invoke(this.f65693a, str, str2);
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

    public String j() {
        if (e()) {
            try {
                return (String) f65683d.get().invoke(this.f65693a, new Object[0]);
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

    private a() {
    }
}
