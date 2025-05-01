package com.xinzhu.haunted.android.app;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtApplicationPackageManager.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65945b = "j";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65946c = com.xinzhu.haunted.d.b("android.app.ApplicationPackageManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65947d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65948e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65949a;

    public j(Object obj) {
        this.f65949a = obj;
    }

    public boolean a() {
        if (f65947d.get() == null) {
            if (f65948e) {
                return false;
            }
            f65947d.compareAndSet(null, com.xinzhu.haunted.d.f(f65946c, "mPermissionManager"));
            f65948e = true;
            return f65947d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f65947d.get().get(this.f65949a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(IInterface iInterface) {
        if (a()) {
            try {
                f65947d.get().set(this.f65949a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private j() {
    }
}
