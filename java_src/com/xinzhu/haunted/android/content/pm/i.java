package com.xinzhu.haunted.android.content.pm;

import android.content.pm.PackageItemInfo;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtPackageItemInfo.java */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66489b = "i";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66490c = com.xinzhu.haunted.d.a(PackageItemInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66491d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66492e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66493a;

    public i(Object obj) {
        this.f66493a = obj;
    }

    public boolean a() {
        if (f66491d.get() == null) {
            if (f66492e) {
                return false;
            }
            f66491d.compareAndSet(null, com.xinzhu.haunted.d.f(f66490c, "showUserIcon"));
            f66492e = true;
            return f66491d.get() != null;
        }
        return true;
    }

    public int b() {
        if (a()) {
            try {
                return ((Integer) f66491d.get().get(this.f66493a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean c(int i4) {
        if (a()) {
            try {
                f66491d.get().set(this.f66493a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private i() {
    }
}
