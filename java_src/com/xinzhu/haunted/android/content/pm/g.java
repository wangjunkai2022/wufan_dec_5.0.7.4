package com.xinzhu.haunted.android.content.pm;

import android.content.pm.PackageInfo;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtPackageInfo.java */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66478b = "g";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66479c = com.xinzhu.haunted.d.a(PackageInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66480d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66481e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66482a;

    public g(Object obj) {
        this.f66482a = obj;
    }

    public boolean a() {
        if (f66480d.get() == null) {
            if (f66481e) {
                return false;
            }
            f66480d.compareAndSet(null, com.xinzhu.haunted.d.f(f66479c, "restrictedAccountType"));
            f66481e = true;
            return f66480d.get() != null;
        }
        return true;
    }

    public String b() {
        if (a()) {
            try {
                return (String) f66480d.get().get(this.f66482a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(String str) {
        if (a()) {
            try {
                f66480d.get().set(this.f66482a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private g() {
    }
}
