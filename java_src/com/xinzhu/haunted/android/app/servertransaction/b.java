package com.xinzhu.haunted.android.app.servertransaction;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtLaunchActivityItem.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66100b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66101c = com.xinzhu.haunted.d.b("android.app.servertransaction.LaunchActivityItem");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66102d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66103e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66104f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66105g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66106h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66107i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66108a;

    public b(Object obj) {
        this.f66108a = obj;
    }

    public boolean a() {
        if (f66106h.get() == null) {
            if (f66107i) {
                return false;
            }
            f66106h.compareAndSet(null, com.xinzhu.haunted.d.f(f66101c, "mActivityClientController"));
            f66107i = true;
            return f66106h.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66102d.get() == null) {
            if (f66103e) {
                return false;
            }
            f66102d.compareAndSet(null, com.xinzhu.haunted.d.f(f66101c, "mInfo"));
            f66103e = true;
            return f66102d.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66104f.get() == null) {
            if (f66105g) {
                return false;
            }
            f66104f.compareAndSet(null, com.xinzhu.haunted.d.f(f66101c, "mIntent"));
            f66105g = true;
            return f66104f.get() != null;
        }
        return true;
    }

    public IInterface d() {
        if (a()) {
            try {
                return (IInterface) f66106h.get().get(this.f66108a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public ActivityInfo e() {
        if (b()) {
            try {
                return (ActivityInfo) f66102d.get().get(this.f66108a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Intent f() {
        if (c()) {
            try {
                return (Intent) f66104f.get().get(this.f66108a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean g(IInterface iInterface) {
        if (a()) {
            try {
                f66106h.get().set(this.f66108a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean h(ActivityInfo activityInfo) {
        if (b()) {
            try {
                f66102d.get().set(this.f66108a, activityInfo);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean i(Intent intent) {
        if (c()) {
            try {
                f66104f.get().set(this.f66108a, intent);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private b() {
    }
}
