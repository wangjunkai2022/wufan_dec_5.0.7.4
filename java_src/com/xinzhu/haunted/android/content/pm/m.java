package com.xinzhu.haunted.android.content.pm;

import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSharedLibraryInfo.java */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66549b = "m";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66550c = com.xinzhu.haunted.d.a(SharedLibraryInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66551d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66552e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66553f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66554g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Constructor> f66555h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66556i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66557a;

    public m(Object obj) {
        this.f66557a = obj;
    }

    public static boolean a(String str, String str2, List list, String str3, long j4, int i4, VersionedPackage versionedPackage, List list2, List list3, boolean z4) {
        if (f66555h.get() == null) {
            if (f66556i) {
                return false;
            }
            f66555h.compareAndSet(null, com.xinzhu.haunted.d.d(f66550c, "HtSharedLibraryInfo", String.class, String.class, List.class, String.class, Long.TYPE, Integer.TYPE, VersionedPackage.class, List.class, List.class, Boolean.TYPE));
            f66556i = true;
            return f66555h.get() != null;
        }
        return true;
    }

    public static m d(String str, String str2, List list, String str3, long j4, int i4, VersionedPackage versionedPackage, List list2, List list3, boolean z4) {
        if (a(str, str2, list, str3, j4, i4, versionedPackage, list2, list3, z4)) {
            try {
                m mVar = new m();
                mVar.f66557a = f66555h.get().newInstance(str, str2, list, str3, Long.valueOf(j4), Integer.valueOf(i4), versionedPackage, list2, list3, Boolean.valueOf(z4));
                return mVar;
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

    public boolean b() {
        if (f66551d.get() == null) {
            if (f66552e) {
                return false;
            }
            f66551d.compareAndSet(null, com.xinzhu.haunted.d.g(f66550c, "getName", new Object[0]));
            f66552e = true;
            return f66551d.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66553f.get() == null) {
            if (f66554g) {
                return false;
            }
            f66553f.compareAndSet(null, com.xinzhu.haunted.d.g(f66550c, "getPath", new Object[0]));
            f66554g = true;
            return f66553f.get() != null;
        }
        return true;
    }

    public String e() {
        if (b()) {
            try {
                return (String) f66551d.get().invoke(this.f66557a, new Object[0]);
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

    public String f() {
        if (c()) {
            try {
                return (String) f66553f.get().invoke(this.f66557a, new Object[0]);
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

    private m() {
    }
}
