package com.xinzhu.haunted.android.accounts;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAccountManager.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65699b = "c";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65700c = com.xinzhu.haunted.d.a(AccountManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65701d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65702e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f65703f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f65704g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f65705h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f65706i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f65707j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f65708k = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65709a;

    public c(Object obj) {
        this.f65709a = obj;
    }

    public static boolean d() {
        if (f65705h.get() == null) {
            if (f65706i) {
                return false;
            }
            f65705h.compareAndSet(null, com.xinzhu.haunted.d.g(f65700c, "invalidateLocalAccountsDataCaches", new Object[0]));
            f65706i = true;
            return f65705h.get() != null;
        }
        return true;
    }

    public static void h() {
        if (d()) {
            try {
                f65705h.get().invoke(null, new Object[0]);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean a() {
        if (f65701d.get() == null) {
            if (f65702e) {
                return false;
            }
            f65701d.compareAndSet(null, com.xinzhu.haunted.d.f(f65700c, "mService"));
            f65702e = true;
            return f65701d.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f65707j.get() == null) {
            if (f65708k) {
                return false;
            }
            f65707j.compareAndSet(null, com.xinzhu.haunted.d.g(f65700c, "disableLocalAccountCaches", new Object[0]));
            f65708k = true;
            return f65707j.get() != null;
        }
        return true;
    }

    public boolean c(String str, String str2, AccountManagerCallback accountManagerCallback, Handler handler) {
        if (f65703f.get() == null) {
            if (f65704g) {
                return false;
            }
            f65703f.compareAndSet(null, com.xinzhu.haunted.d.g(f65700c, "getAuthTokenLabel", String.class, String.class, AccountManagerCallback.class, Handler.class));
            f65704g = true;
            return f65703f.get() != null;
        }
        return true;
    }

    public void e() {
        if (b()) {
            try {
                f65707j.get().invoke(this.f65709a, new Object[0]);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public AccountManagerFuture<String> f(String str, String str2, AccountManagerCallback accountManagerCallback, Handler handler) {
        if (c(str, str2, accountManagerCallback, handler)) {
            try {
                return (AccountManagerFuture) f65703f.get().invoke(this.f65709a, str, str2, accountManagerCallback, handler);
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

    public d g() {
        if (a()) {
            try {
                return new d(f65701d.get().get(this.f65709a));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean i(d dVar) {
        if (a()) {
            try {
                f65701d.get().set(this.f65709a, dVar.f65714a);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private c() {
    }
}
