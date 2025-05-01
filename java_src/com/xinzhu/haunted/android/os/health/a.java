package com.xinzhu.haunted.android.os.health;

import android.os.IInterface;
import android.os.health.SystemHealthManager;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSystemHealthManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66854b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66855c = d.a(SystemHealthManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66856d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66857e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66858a;

    public a(Object obj) {
        this.f66858a = obj;
    }

    public boolean a() {
        if (f66856d.get() == null) {
            if (f66857e) {
                return false;
            }
            f66856d.compareAndSet(null, d.f(f66855c, "mBatteryStats"));
            f66857e = true;
            return f66856d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f66856d.get().get(this.f66858a);
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
                f66856d.get().set(this.f66858a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private a() {
    }
}
