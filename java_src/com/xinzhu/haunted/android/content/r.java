package com.xinzhu.haunted.android.content;

import android.accounts.Account;
import android.content.SyncInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSyncInfo.java */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66654b = "r";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66655c = com.xinzhu.haunted.d.a(SyncInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66656d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66657e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66658f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66659g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f66660h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66661i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Constructor> f66662j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66663k = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66664a;

    public r(Object obj) {
        this.f66664a = obj;
    }

    public static boolean a(int i4, Account account, String str, long j4) {
        if (f66660h.get() == null) {
            if (f66661i) {
                return false;
            }
            f66660h.compareAndSet(null, com.xinzhu.haunted.d.d(f66655c, "HtSyncInfo", Integer.TYPE, Account.class, String.class, Long.TYPE));
            f66661i = true;
            return f66660h.get() != null;
        }
        return true;
    }

    public static boolean b(SyncInfo syncInfo) {
        if (f66662j.get() == null) {
            if (f66663k) {
                return false;
            }
            f66662j.compareAndSet(null, com.xinzhu.haunted.d.d(f66655c, "HtSyncInfo", SyncInfo.class));
            f66663k = true;
            return f66662j.get() != null;
        }
        return true;
    }

    public static boolean d(int i4, String str, long j4) {
        if (f66658f.get() == null) {
            if (f66659g) {
                return false;
            }
            f66658f.compareAndSet(null, com.xinzhu.haunted.d.g(f66655c, "createAccountRedacted", Integer.TYPE, String.class, Long.TYPE));
            f66659g = true;
            return f66658f.get() != null;
        }
        return true;
    }

    public static r e(int i4, Account account, String str, long j4) {
        if (a(i4, account, str, j4)) {
            try {
                r rVar = new r();
                rVar.f66664a = f66660h.get().newInstance(Integer.valueOf(i4), account, str, Long.valueOf(j4));
                return rVar;
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

    public static r f(SyncInfo syncInfo) {
        if (b(syncInfo)) {
            try {
                r rVar = new r();
                rVar.f66664a = f66662j.get().newInstance(syncInfo);
                return rVar;
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

    public static SyncInfo g(int i4, String str, long j4) {
        if (d(i4, str, j4)) {
            try {
                return (SyncInfo) f66658f.get().invoke(null, Integer.valueOf(i4), str, Long.valueOf(j4));
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

    public boolean c() {
        if (f66656d.get() == null) {
            if (f66657e) {
                return false;
            }
            f66656d.compareAndSet(null, com.xinzhu.haunted.d.f(f66655c, "authorityId"));
            f66657e = true;
            return f66656d.get() != null;
        }
        return true;
    }

    public int h() {
        if (c()) {
            try {
                return ((Integer) f66656d.get().get(this.f66664a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean i(int i4) {
        if (c()) {
            try {
                f66656d.get().set(this.f66664a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private r() {
    }
}
