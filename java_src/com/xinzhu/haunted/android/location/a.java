package com.xinzhu.haunted.android.location;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtGeocoderParams.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66731b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66732c = com.xinzhu.haunted.d.b("android.location.GeocoderParams");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66733d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66734e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66735f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66736g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66737h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66738i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f66739j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66740k = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66741a;

    public a(Object obj) {
        this.f66741a = obj;
    }

    public boolean a() {
        if (f66737h.get() == null) {
            if (f66738i) {
                return false;
            }
            f66737h.compareAndSet(null, com.xinzhu.haunted.d.f(f66732c, "mAttributionTag"));
            f66738i = true;
            return f66737h.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66739j.get() == null) {
            if (f66740k) {
                return false;
            }
            f66739j.compareAndSet(null, com.xinzhu.haunted.d.f(f66732c, "mLocale"));
            f66740k = true;
            return f66739j.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66735f.get() == null) {
            if (f66736g) {
                return false;
            }
            f66735f.compareAndSet(null, com.xinzhu.haunted.d.f(f66732c, "mPackageName"));
            f66736g = true;
            return f66735f.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f66733d.get() == null) {
            if (f66734e) {
                return false;
            }
            f66733d.compareAndSet(null, com.xinzhu.haunted.d.f(f66732c, "mUid"));
            f66734e = true;
            return f66733d.get() != null;
        }
        return true;
    }

    public String e() {
        if (a()) {
            try {
                return (String) f66737h.get().get(this.f66741a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Locale f() {
        if (b()) {
            try {
                return (Locale) f66739j.get().get(this.f66741a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public String g() {
        if (c()) {
            try {
                return (String) f66735f.get().get(this.f66741a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public int h() {
        if (d()) {
            try {
                return ((Integer) f66733d.get().get(this.f66741a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean i(String str) {
        if (a()) {
            try {
                f66737h.get().set(this.f66741a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean j(Locale locale) {
        if (b()) {
            try {
                f66739j.get().set(this.f66741a, locale);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean k(String str) {
        if (c()) {
            try {
                f66735f.get().set(this.f66741a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean l(int i4) {
        if (d()) {
            try {
                f66733d.get().set(this.f66741a, Integer.valueOf(i4));
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
