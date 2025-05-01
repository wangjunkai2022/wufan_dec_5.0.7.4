package com.xinzhu.haunted.com.android.net.wifi;

import android.net.wifi.WifiManager;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtWifiManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67370b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67371c = d.a(WifiManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f67372d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67373e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67374a;

    public a(Object obj) {
        this.f67374a = obj;
    }

    public boolean a() {
        if (f67372d.get() == null) {
            if (f67373e) {
                return false;
            }
            f67372d.compareAndSet(null, d.f(f67371c, "mService"));
            f67373e = true;
            return f67372d.get() != null;
        }
        return true;
    }

    public Object b() {
        if (a()) {
            try {
                return f67372d.get().get(this.f67374a);
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
                f67372d.get().set(this.f67374a, obj);
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
