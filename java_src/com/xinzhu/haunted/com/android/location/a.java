package com.xinzhu.haunted.com.android.location;

import android.location.LocationManager;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtLocationManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67364b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67365c = d.a(LocationManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f67366d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67367e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67368a;

    public a(Object obj) {
        this.f67368a = obj;
    }

    public boolean a() {
        if (f67366d.get() == null) {
            if (f67367e) {
                return false;
            }
            f67366d.compareAndSet(null, d.f(f67365c, "mService"));
            f67367e = true;
            return f67366d.get() != null;
        }
        return true;
    }

    public Object b() {
        if (a()) {
            try {
                return f67366d.get().get(this.f67368a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(Object obj) {
        if (a()) {
            try {
                f67366d.get().set(this.f67368a, obj);
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
