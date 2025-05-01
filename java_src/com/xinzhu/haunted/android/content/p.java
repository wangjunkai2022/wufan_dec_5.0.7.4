package com.xinzhu.haunted.android.content;

import android.accounts.Account;
import android.content.PeriodicSync;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtPeriodicSync.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66350b = "p";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66351c = com.xinzhu.haunted.d.a(PeriodicSync.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66352d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66353e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Constructor> f66354f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66355g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f66356h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66357i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66358a;

    public p(Object obj) {
        this.f66358a = obj;
    }

    public static boolean a(Account account, String str, Bundle bundle, long j4, long j5) {
        if (f66354f.get() == null) {
            if (f66355g) {
                return false;
            }
            AtomicReference<Constructor> atomicReference = f66354f;
            Class<?> cls = f66351c;
            Class cls2 = Long.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.d(cls, "HtPeriodicSync", Account.class, String.class, Bundle.class, cls2, cls2));
            f66355g = true;
            return f66354f.get() != null;
        }
        return true;
    }

    public static boolean b(PeriodicSync periodicSync) {
        if (f66356h.get() == null) {
            if (f66357i) {
                return false;
            }
            f66356h.compareAndSet(null, com.xinzhu.haunted.d.d(f66351c, "HtPeriodicSync", PeriodicSync.class));
            f66357i = true;
            return f66356h.get() != null;
        }
        return true;
    }

    public static p d(Account account, String str, Bundle bundle, long j4, long j5) {
        if (a(account, str, bundle, j4, j5)) {
            try {
                p pVar = new p();
                pVar.f66358a = f66354f.get().newInstance(account, str, bundle, Long.valueOf(j4), Long.valueOf(j5));
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

    public static p e(PeriodicSync periodicSync) {
        if (b(periodicSync)) {
            try {
                p pVar = new p();
                pVar.f66358a = f66356h.get().newInstance(periodicSync);
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

    public boolean c() {
        if (f66352d.get() == null) {
            if (f66353e) {
                return false;
            }
            f66352d.compareAndSet(null, com.xinzhu.haunted.d.f(f66351c, "flexTime"));
            f66353e = true;
            return f66352d.get() != null;
        }
        return true;
    }

    public long f() {
        if (c()) {
            try {
                return ((Long) f66352d.get().get(this.f66358a)).longValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public boolean g(long j4) {
        if (c()) {
            try {
                f66352d.get().set(this.f66358a, Long.valueOf(j4));
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
