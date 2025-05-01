package com.xinzhu.haunted.android.content.pm;

import android.content.pm.Signature;
import android.util.ArraySet;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.PublicKey;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSigningDetails.java */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66558b = "n";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66559c = com.xinzhu.haunted.d.b("android.content.pm.SigningDetails");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66560d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66561e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66562f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66563g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66564h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66565i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f66566j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66567k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Field> f66568l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66569m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Constructor> f66570n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66571o = false;

    /* renamed from: p  reason: collision with root package name */
    private static AtomicReference<Constructor> f66572p = new AtomicReference<>();

    /* renamed from: q  reason: collision with root package name */
    private static boolean f66573q = false;

    /* renamed from: r  reason: collision with root package name */
    private static AtomicReference<Constructor> f66574r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    private static boolean f66575s = false;

    /* renamed from: t  reason: collision with root package name */
    private static AtomicReference<Constructor> f66576t = new AtomicReference<>();

    /* renamed from: u  reason: collision with root package name */
    private static boolean f66577u = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66578a;

    public n(Object obj) {
        this.f66578a = obj;
    }

    public static boolean a(Signature[] signatureArr, int i4) {
        if (f66570n.get() == null) {
            if (f66571o) {
                return false;
            }
            f66570n.compareAndSet(null, com.xinzhu.haunted.d.d(f66559c, "HtSigningDetails", Signature[].class, Integer.TYPE));
            f66571o = true;
            return f66570n.get() != null;
        }
        return true;
    }

    public static boolean b(Signature[] signatureArr, int i4, Signature[] signatureArr2) {
        if (f66572p.get() == null) {
            if (f66573q) {
                return false;
            }
            f66572p.compareAndSet(null, com.xinzhu.haunted.d.d(f66559c, "HtSigningDetails", Signature[].class, Integer.TYPE, Signature[].class));
            f66573q = true;
            return f66572p.get() != null;
        }
        return true;
    }

    public static boolean c(Signature[] signatureArr, int i4, ArraySet arraySet, Signature[] signatureArr2) {
        if (f66574r.get() == null) {
            if (f66575s) {
                return false;
            }
            f66574r.compareAndSet(null, com.xinzhu.haunted.d.d(f66559c, "HtSigningDetails", Signature[].class, Integer.TYPE, ArraySet.class, Signature[].class));
            f66575s = true;
            return f66574r.get() != null;
        }
        return true;
    }

    public static boolean d(Object obj) {
        if (f66576t.get() == null) {
            if (f66577u) {
                return false;
            }
            f66576t.compareAndSet(null, com.xinzhu.haunted.d.d(f66559c, "HtSigningDetails", "android.content.pm.SigningDetails"));
            f66577u = true;
            return f66576t.get() != null;
        }
        return true;
    }

    public static boolean e() {
        if (f66560d.get() == null) {
            if (f66561e) {
                return false;
            }
            f66560d.compareAndSet(null, com.xinzhu.haunted.d.f(f66559c, "UNKNOWN"));
            f66561e = true;
            return f66560d.get() != null;
        }
        return true;
    }

    public static n j(Object obj) {
        if (d(obj)) {
            try {
                n nVar = new n();
                nVar.f66578a = f66576t.get().newInstance(obj);
                return nVar;
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

    public static n k(Signature[] signatureArr, int i4) {
        if (a(signatureArr, i4)) {
            try {
                n nVar = new n();
                nVar.f66578a = f66570n.get().newInstance(signatureArr, Integer.valueOf(i4));
                return nVar;
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

    public static n l(Signature[] signatureArr, int i4, ArraySet arraySet, Signature[] signatureArr2) {
        if (c(signatureArr, i4, arraySet, signatureArr2)) {
            try {
                n nVar = new n();
                nVar.f66578a = f66574r.get().newInstance(signatureArr, Integer.valueOf(i4), arraySet, signatureArr2);
                return nVar;
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

    public static n m(Signature[] signatureArr, int i4, Signature[] signatureArr2) {
        if (b(signatureArr, i4, signatureArr2)) {
            try {
                n nVar = new n();
                nVar.f66578a = f66572p.get().newInstance(signatureArr, Integer.valueOf(i4), signatureArr2);
                return nVar;
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

    public static Object n() {
        if (e()) {
            try {
                return f66560d.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean s(Object obj) {
        if (e()) {
            try {
                f66560d.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean f() {
        if (f66568l.get() == null) {
            if (f66569m) {
                return false;
            }
            f66568l.compareAndSet(null, com.xinzhu.haunted.d.f(f66559c, "mPastSigningCertificates"));
            f66569m = true;
            return f66568l.get() != null;
        }
        return true;
    }

    public boolean g() {
        if (f66566j.get() == null) {
            if (f66567k) {
                return false;
            }
            f66566j.compareAndSet(null, com.xinzhu.haunted.d.f(f66559c, "mPublicKeys"));
            f66567k = true;
            return f66566j.get() != null;
        }
        return true;
    }

    public boolean h() {
        if (f66564h.get() == null) {
            if (f66565i) {
                return false;
            }
            f66564h.compareAndSet(null, com.xinzhu.haunted.d.f(f66559c, "mSignatureSchemeVersion"));
            f66565i = true;
            return f66564h.get() != null;
        }
        return true;
    }

    public boolean i() {
        if (f66562f.get() == null) {
            if (f66563g) {
                return false;
            }
            f66562f.compareAndSet(null, com.xinzhu.haunted.d.f(f66559c, "mSignatures"));
            f66563g = true;
            return f66562f.get() != null;
        }
        return true;
    }

    public Signature[] o() {
        if (f()) {
            try {
                return (Signature[]) f66568l.get().get(this.f66578a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public ArraySet<PublicKey> p() {
        if (g()) {
            try {
                return (ArraySet) f66566j.get().get(this.f66578a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public int q() {
        if (h()) {
            try {
                return ((Integer) f66564h.get().get(this.f66578a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public Signature[] r() {
        if (i()) {
            try {
                return (Signature[]) f66562f.get().get(this.f66578a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean t(Signature[] signatureArr) {
        if (f()) {
            try {
                f66568l.get().set(this.f66578a, signatureArr);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean u(ArraySet<PublicKey> arraySet) {
        if (g()) {
            try {
                f66566j.get().set(this.f66578a, arraySet);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean v(int i4) {
        if (h()) {
            try {
                f66564h.get().set(this.f66578a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean w(Signature[] signatureArr) {
        if (i()) {
            try {
                f66562f.get().set(this.f66578a, signatureArr);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private n() {
    }
}
