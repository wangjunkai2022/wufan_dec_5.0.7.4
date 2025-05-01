package com.xinzhu.haunted.android.content.pm;

import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Parcel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityInfo.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66359b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66360c = com.xinzhu.haunted.d.a(ActivityInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66361d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66362e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66363f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66364g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66365h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66366i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f66367j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66368k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Field> f66369l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66370m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Field> f66371n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66372o = false;

    /* renamed from: p  reason: collision with root package name */
    private static AtomicReference<Field> f66373p = new AtomicReference<>();

    /* renamed from: q  reason: collision with root package name */
    private static boolean f66374q = false;

    /* renamed from: r  reason: collision with root package name */
    private static AtomicReference<Field> f66375r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    private static boolean f66376s = false;

    /* renamed from: t  reason: collision with root package name */
    private static AtomicReference<Field> f66377t = new AtomicReference<>();

    /* renamed from: u  reason: collision with root package name */
    private static boolean f66378u = false;

    /* renamed from: v  reason: collision with root package name */
    private static AtomicReference<Field> f66379v = new AtomicReference<>();

    /* renamed from: w  reason: collision with root package name */
    private static boolean f66380w = false;

    /* renamed from: x  reason: collision with root package name */
    private static AtomicReference<Method> f66381x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    private static boolean f66382y = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66383a;

    public a(Object obj) {
        this.f66383a = obj;
    }

    public static boolean k(TypedArray typedArray) {
        if (f66381x.get() == null) {
            if (f66382y) {
                return false;
            }
            f66381x.compareAndSet(null, com.xinzhu.haunted.d.g(f66360c, "isTranslucentOrFloating", TypedArray.class));
            f66382y = true;
            return f66381x.get() != null;
        }
        return true;
    }

    public static boolean v(TypedArray typedArray) {
        if (k(typedArray)) {
            try {
                return ((Boolean) f66381x.get().invoke(null, typedArray)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean A(float f5) {
        if (e()) {
            try {
                f66375r.get().set(this.f66383a, Float.valueOf(f5));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean B(int i4) {
        if (f()) {
            try {
                f66363f.get().set(this.f66383a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean C(String str) {
        if (g()) {
            try {
                f66369l.get().set(this.f66383a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean D(int i4) {
        if (h()) {
            try {
                f66367j.get().set(this.f66383a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean E(int i4) {
        if (i()) {
            try {
                f66371n.get().set(this.f66383a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean F(boolean z4) {
        if (j()) {
            try {
                f66377t.get().set(this.f66383a, Boolean.valueOf(z4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        if (f66361d.get() == null) {
            if (f66362e) {
                return false;
            }
            f66361d.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "launchToken"));
            f66362e = true;
            return f66361d.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66365h.get() == null) {
            if (f66366i) {
                return false;
            }
            f66365h.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "lockTaskLaunchMode"));
            f66366i = true;
            return f66365h.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f66379v.get() == null) {
            if (f66380w) {
                return false;
            }
            f66379v.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "mKnownActivityEmbeddingCerts"));
            f66380w = true;
            return f66379v.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f66373p.get() == null) {
            if (f66374q) {
                return false;
            }
            f66373p.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "mMaxAspectRatio"));
            f66374q = true;
            return f66373p.get() != null;
        }
        return true;
    }

    public boolean e() {
        if (f66375r.get() == null) {
            if (f66376s) {
                return false;
            }
            f66375r.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "mMinAspectRatio"));
            f66376s = true;
            return f66375r.get() != null;
        }
        return true;
    }

    public boolean f() {
        if (f66363f.get() == null) {
            if (f66364g) {
                return false;
            }
            f66363f.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "privateFlags"));
            f66364g = true;
            return f66363f.get() != null;
        }
        return true;
    }

    public boolean g() {
        if (f66369l.get() == null) {
            if (f66370m) {
                return false;
            }
            f66369l.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "requestedVrComponent"));
            f66370m = true;
            return f66369l.get() != null;
        }
        return true;
    }

    public boolean h() {
        if (f66367j.get() == null) {
            if (f66368k) {
                return false;
            }
            f66367j.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "resizeMode"));
            f66368k = true;
            return f66367j.get() != null;
        }
        return true;
    }

    public boolean i() {
        if (f66371n.get() == null) {
            if (f66372o) {
                return false;
            }
            f66371n.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "rotationAnimation"));
            f66372o = true;
            return f66371n.get() != null;
        }
        return true;
    }

    public boolean j() {
        if (f66377t.get() == null) {
            if (f66378u) {
                return false;
            }
            f66377t.compareAndSet(null, com.xinzhu.haunted.d.f(f66360c, "supportsSizeChanges"));
            f66378u = true;
            return f66377t.get() != null;
        }
        return true;
    }

    public String l() {
        if (a()) {
            try {
                return (String) f66361d.get().get(this.f66383a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public int m() {
        if (b()) {
            try {
                return ((Integer) f66365h.get().get(this.f66383a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public Set<String> n() {
        if (c()) {
            try {
                return (Set) f66379v.get().get(this.f66383a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public float o() {
        if (d()) {
            try {
                return ((Float) f66373p.get().get(this.f66383a)).floatValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public float p() {
        if (e()) {
            try {
                return ((Float) f66375r.get().get(this.f66383a)).floatValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public int q() {
        if (f()) {
            try {
                return ((Integer) f66363f.get().get(this.f66383a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public String r() {
        if (g()) {
            try {
                return (String) f66369l.get().get(this.f66383a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public int s() {
        if (h()) {
            try {
                return ((Integer) f66367j.get().get(this.f66383a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public int t() {
        if (i()) {
            try {
                return ((Integer) f66371n.get().get(this.f66383a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean u() {
        if (j()) {
            try {
                return ((Boolean) f66377t.get().get(this.f66383a)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean w(String str) {
        if (a()) {
            try {
                f66361d.get().set(this.f66383a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean x(int i4) {
        if (b()) {
            try {
                f66365h.get().set(this.f66383a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean y(Set<String> set) {
        if (c()) {
            try {
                f66379v.get().set(this.f66383a, set);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean z(float f5) {
        if (d()) {
            try {
                f66373p.get().set(this.f66383a, Float.valueOf(f5));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* compiled from: HtActivityInfo.java */
    /* renamed from: com.xinzhu.haunted.android.content.pm.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0696a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f66384b = com.xinzhu.haunted.d.b("android.content.pm.ActivityInfo$WindowLayout");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Constructor> f66385c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f66386d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f66387a;

        public C0696a(Object obj) {
            this.f66387a = obj;
        }

        public static boolean a(Parcel parcel) {
            if (f66385c.get() == null) {
                if (f66386d) {
                    return false;
                }
                f66385c.compareAndSet(null, com.xinzhu.haunted.d.d(f66384b, "HtWindowLayout", Parcel.class));
                f66386d = true;
                return f66385c.get() != null;
            }
            return true;
        }

        public static C0696a b(Parcel parcel) {
            if (a(parcel)) {
                try {
                    C0696a c0696a = new C0696a();
                    c0696a.f66387a = f66385c.get().newInstance(parcel);
                    return c0696a;
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

        private C0696a() {
        }
    }

    private a() {
    }
}
