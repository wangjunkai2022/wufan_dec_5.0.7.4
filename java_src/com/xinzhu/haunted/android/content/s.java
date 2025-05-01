package com.xinzhu.haunted.android.content;

import android.accounts.Account;
import android.content.SyncRequest;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSyncRequest.java */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66681b = "s";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66682c = com.xinzhu.haunted.d.a(SyncRequest.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66683d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66684e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66685f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66686g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66687h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66688i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66689j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66690k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66691l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66692m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Method> f66693n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66694o = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66695a;

    public s(Object obj) {
        this.f66695a = obj;
    }

    public boolean a() {
        if (f66691l.get() == null) {
            if (f66692m) {
                return false;
            }
            f66691l.compareAndSet(null, com.xinzhu.haunted.d.g(f66682c, "getAccount", new Object[0]));
            f66692m = true;
            return f66691l.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66683d.get() == null) {
            if (f66684e) {
                return false;
            }
            f66683d.compareAndSet(null, com.xinzhu.haunted.d.g(f66682c, "getBundle", new Object[0]));
            f66684e = true;
            return f66683d.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66693n.get() == null) {
            if (f66694o) {
                return false;
            }
            f66693n.compareAndSet(null, com.xinzhu.haunted.d.g(f66682c, "getProvider", new Object[0]));
            f66694o = true;
            return f66693n.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f66685f.get() == null) {
            if (f66686g) {
                return false;
            }
            f66685f.compareAndSet(null, com.xinzhu.haunted.d.g(f66682c, "getSyncFlexTime", new Object[0]));
            f66686g = true;
            return f66685f.get() != null;
        }
        return true;
    }

    public boolean e() {
        if (f66687h.get() == null) {
            if (f66688i) {
                return false;
            }
            f66687h.compareAndSet(null, com.xinzhu.haunted.d.g(f66682c, "getSyncRunTime", new Object[0]));
            f66688i = true;
            return f66687h.get() != null;
        }
        return true;
    }

    public boolean f() {
        if (f66689j.get() == null) {
            if (f66690k) {
                return false;
            }
            f66689j.compareAndSet(null, com.xinzhu.haunted.d.g(f66682c, "isPeriodic", new Object[0]));
            f66690k = true;
            return f66689j.get() != null;
        }
        return true;
    }

    public Account g() {
        if (a()) {
            try {
                return (Account) f66691l.get().invoke(this.f66695a, new Object[0]);
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

    public Bundle h() {
        if (b()) {
            try {
                return (Bundle) f66683d.get().invoke(this.f66695a, new Object[0]);
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

    public String i() {
        if (c()) {
            try {
                return (String) f66693n.get().invoke(this.f66695a, new Object[0]);
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

    public long j() {
        if (d()) {
            try {
                return ((Long) f66685f.get().invoke(this.f66695a, new Object[0])).longValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0L;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public long k() {
        if (e()) {
            try {
                return ((Long) f66687h.get().invoke(this.f66695a, new Object[0])).longValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0L;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public boolean l() {
        if (f()) {
            try {
                return ((Boolean) f66689j.get().invoke(this.f66695a, new Object[0])).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private s() {
    }
}
