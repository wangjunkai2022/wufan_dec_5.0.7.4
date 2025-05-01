package com.xinzhu.haunted.android.content.pm;

import android.content.pm.Signature;
import android.util.ArraySet;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtPackageParser.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66494b = "j";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66495c = com.xinzhu.haunted.d.b("android.content.pm.PackageParser");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66496d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66497e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66498f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66499g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66500h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66501i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66502j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66503k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66504l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66505m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Constructor> f66506n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66507o = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66508a;

    public j(Object obj) {
        this.f66508a = obj;
    }

    public static boolean a() {
        if (f66506n.get() == null) {
            if (f66507o) {
                return false;
            }
            f66506n.compareAndSet(null, com.xinzhu.haunted.d.d(f66495c, "HtPackageParser", new Object[0]));
            f66507o = true;
            return f66506n.get() != null;
        }
        return true;
    }

    public static boolean b(Object obj, int i4) {
        if (f66498f.get() == null) {
            if (f66499g) {
                return false;
            }
            f66498f.compareAndSet(null, com.xinzhu.haunted.d.g(f66495c, "collectCertificates", "android.content.pm.PackageParser$Package", Integer.TYPE));
            f66499g = true;
            return f66498f.get() != null;
        }
        return true;
    }

    public static boolean c(Object obj, boolean z4) {
        if (f66500h.get() == null) {
            if (f66501i) {
                return false;
            }
            f66500h.compareAndSet(null, com.xinzhu.haunted.d.g(f66495c, "collectCertificates", "android.content.pm.PackageParser$Package", Boolean.TYPE));
            f66501i = true;
            return f66500h.get() != null;
        }
        return true;
    }

    public static void g(Object obj, int i4) throws Throwable {
        if (b(obj, i4)) {
            try {
                f66498f.get().invoke(null, obj, Integer.valueOf(i4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                if (e6.getCause() != null) {
                    throw e6.getCause();
                }
                throw e6;
            }
        }
    }

    public static void h(Object obj, boolean z4) throws Throwable {
        if (c(obj, z4)) {
            try {
                f66500h.get().invoke(null, obj, Boolean.valueOf(z4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                if (e6.getCause() != null) {
                    throw e6.getCause();
                }
                throw e6;
            }
        }
    }

    public static j k() {
        if (a()) {
            try {
                j jVar = new j();
                jVar.f66508a = f66506n.get().newInstance(new Object[0]);
                return jVar;
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

    public boolean d(Object obj, int i4) {
        if (f66502j.get() == null) {
            if (f66503k) {
                return false;
            }
            f66502j.compareAndSet(null, com.xinzhu.haunted.d.g(f66495c, "collectCertificates", "android.content.pm.PackageParser$Package", Integer.TYPE));
            f66503k = true;
            return f66502j.get() != null;
        }
        return true;
    }

    public boolean e(Object obj, boolean z4) {
        if (f66504l.get() == null) {
            if (f66505m) {
                return false;
            }
            f66504l.compareAndSet(null, com.xinzhu.haunted.d.g(f66495c, "collectCertificates", "android.content.pm.PackageParser$Package", Boolean.TYPE));
            f66505m = true;
            return f66504l.get() != null;
        }
        return true;
    }

    public boolean f(File file, int i4) {
        if (f66496d.get() == null) {
            if (f66497e) {
                return false;
            }
            f66496d.compareAndSet(null, com.xinzhu.haunted.d.g(f66495c, "parsePackage", File.class, Integer.TYPE));
            f66497e = true;
            return f66496d.get() != null;
        }
        return true;
    }

    public void i(Object obj, int i4) throws Throwable {
        if (d(obj, i4)) {
            try {
                f66502j.get().invoke(this.f66508a, obj, Integer.valueOf(i4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                if (e6.getCause() != null) {
                    throw e6.getCause();
                }
                throw e6;
            }
        }
    }

    public void j(Object obj, boolean z4) throws Throwable {
        if (e(obj, z4)) {
            try {
                f66504l.get().invoke(this.f66508a, obj, Boolean.valueOf(z4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                if (e6.getCause() != null) {
                    throw e6.getCause();
                }
                throw e6;
            }
        }
    }

    public Object l(File file, int i4) {
        if (f(file, i4)) {
            try {
                return f66496d.get().invoke(this.f66508a, file, Integer.valueOf(i4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* compiled from: HtPackageParser.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f66509b = com.xinzhu.haunted.d.b("android.content.pm.PackageParser$SigningDetails");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f66510c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f66511d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f66512e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f66513f = false;

        /* renamed from: g  reason: collision with root package name */
        private static AtomicReference<Field> f66514g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        private static boolean f66515h = false;

        /* renamed from: i  reason: collision with root package name */
        private static AtomicReference<Field> f66516i = new AtomicReference<>();

        /* renamed from: j  reason: collision with root package name */
        private static boolean f66517j = false;

        /* renamed from: k  reason: collision with root package name */
        private static AtomicReference<Field> f66518k = new AtomicReference<>();

        /* renamed from: l  reason: collision with root package name */
        private static boolean f66519l = false;

        /* renamed from: m  reason: collision with root package name */
        private static AtomicReference<Field> f66520m = new AtomicReference<>();

        /* renamed from: n  reason: collision with root package name */
        private static boolean f66521n = false;

        /* renamed from: o  reason: collision with root package name */
        private static AtomicReference<Method> f66522o = new AtomicReference<>();

        /* renamed from: p  reason: collision with root package name */
        private static boolean f66523p = false;

        /* renamed from: q  reason: collision with root package name */
        private static AtomicReference<Method> f66524q = new AtomicReference<>();

        /* renamed from: r  reason: collision with root package name */
        private static boolean f66525r = false;

        /* renamed from: s  reason: collision with root package name */
        private static AtomicReference<Constructor> f66526s = new AtomicReference<>();

        /* renamed from: t  reason: collision with root package name */
        private static boolean f66527t = false;

        /* renamed from: u  reason: collision with root package name */
        private static AtomicReference<Constructor> f66528u = new AtomicReference<>();

        /* renamed from: v  reason: collision with root package name */
        private static boolean f66529v = false;

        /* renamed from: w  reason: collision with root package name */
        private static AtomicReference<Constructor> f66530w = new AtomicReference<>();

        /* renamed from: x  reason: collision with root package name */
        private static boolean f66531x = false;

        /* renamed from: y  reason: collision with root package name */
        private static AtomicReference<Constructor> f66532y = new AtomicReference<>();

        /* renamed from: z  reason: collision with root package name */
        private static boolean f66533z = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f66534a;

        public a(Object obj) {
            this.f66534a = obj;
        }

        public static boolean a(Signature[] signatureArr, int i4) {
            if (f66526s.get() == null) {
                if (f66527t) {
                    return false;
                }
                f66526s.compareAndSet(null, com.xinzhu.haunted.d.d(f66509b, "HtSigningDetails", Signature[].class, Integer.TYPE));
                f66527t = true;
                return f66526s.get() != null;
            }
            return true;
        }

        public static boolean b(Signature[] signatureArr, int i4, Signature[] signatureArr2) {
            if (f66528u.get() == null) {
                if (f66529v) {
                    return false;
                }
                f66528u.compareAndSet(null, com.xinzhu.haunted.d.d(f66509b, "HtSigningDetails", Signature[].class, Integer.TYPE, Signature[].class));
                f66529v = true;
                return f66528u.get() != null;
            }
            return true;
        }

        public static boolean c(Signature[] signatureArr, int i4, ArraySet arraySet, Signature[] signatureArr2) {
            if (f66530w.get() == null) {
                if (f66531x) {
                    return false;
                }
                f66530w.compareAndSet(null, com.xinzhu.haunted.d.d(f66509b, "HtSigningDetails", Signature[].class, Integer.TYPE, ArraySet.class, Signature[].class));
                f66531x = true;
                return f66530w.get() != null;
            }
            return true;
        }

        public static boolean d(Object obj) {
            if (f66532y.get() == null) {
                if (f66533z) {
                    return false;
                }
                f66532y.compareAndSet(null, com.xinzhu.haunted.d.d(f66509b, "HtSigningDetails", "android.content.pm.PackageParser$SigningDetails"));
                f66533z = true;
                return f66532y.get() != null;
            }
            return true;
        }

        public static boolean e() {
            if (f66510c.get() == null) {
                if (f66511d) {
                    return false;
                }
                f66510c.compareAndSet(null, com.xinzhu.haunted.d.f(f66509b, "UNKNOWN"));
                f66511d = true;
                return f66510c.get() != null;
            }
            return true;
        }

        public static a m(Object obj) {
            if (d(obj)) {
                try {
                    a aVar = new a();
                    aVar.f66534a = f66532y.get().newInstance(obj);
                    return aVar;
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

        public static a n(Signature[] signatureArr, int i4) {
            if (a(signatureArr, i4)) {
                try {
                    a aVar = new a();
                    aVar.f66534a = f66526s.get().newInstance(signatureArr, Integer.valueOf(i4));
                    return aVar;
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

        public static a o(Signature[] signatureArr, int i4, ArraySet arraySet, Signature[] signatureArr2) {
            if (c(signatureArr, i4, arraySet, signatureArr2)) {
                try {
                    a aVar = new a();
                    aVar.f66534a = f66530w.get().newInstance(signatureArr, Integer.valueOf(i4), arraySet, signatureArr2);
                    return aVar;
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

        public static a p(Signature[] signatureArr, int i4, Signature[] signatureArr2) {
            if (b(signatureArr, i4, signatureArr2)) {
                try {
                    a aVar = new a();
                    aVar.f66534a = f66528u.get().newInstance(signatureArr, Integer.valueOf(i4), signatureArr2);
                    return aVar;
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

        public static Object q() {
            if (e()) {
                try {
                    return f66510c.get().get(null);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public static boolean y(Object obj) {
            if (e()) {
                try {
                    f66510c.get().set(null, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean A(int[] iArr) {
            if (g()) {
                try {
                    f66520m.get().set(this.f66534a, iArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean B(ArraySet<PublicKey> arraySet) {
            if (h()) {
                try {
                    f66516i.get().set(this.f66534a, arraySet);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean C(int i4) {
            if (i()) {
                try {
                    f66514g.get().set(this.f66534a, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean D(Signature[] signatureArr) {
            if (j()) {
                try {
                    f66512e.get().set(this.f66534a, signatureArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean f() {
            if (f66518k.get() == null) {
                if (f66519l) {
                    return false;
                }
                f66518k.compareAndSet(null, com.xinzhu.haunted.d.f(f66509b, "pastSigningCertificates"));
                f66519l = true;
                return f66518k.get() != null;
            }
            return true;
        }

        public boolean g() {
            if (f66520m.get() == null) {
                if (f66521n) {
                    return false;
                }
                f66520m.compareAndSet(null, com.xinzhu.haunted.d.f(f66509b, "pastSigningCertificatesFlags"));
                f66521n = true;
                return f66520m.get() != null;
            }
            return true;
        }

        public boolean h() {
            if (f66516i.get() == null) {
                if (f66517j) {
                    return false;
                }
                f66516i.compareAndSet(null, com.xinzhu.haunted.d.f(f66509b, "publicKeys"));
                f66517j = true;
                return f66516i.get() != null;
            }
            return true;
        }

        public boolean i() {
            if (f66514g.get() == null) {
                if (f66515h) {
                    return false;
                }
                f66514g.compareAndSet(null, com.xinzhu.haunted.d.f(f66509b, "signatureSchemeVersion"));
                f66515h = true;
                return f66514g.get() != null;
            }
            return true;
        }

        public boolean j() {
            if (f66512e.get() == null) {
                if (f66513f) {
                    return false;
                }
                f66512e.compareAndSet(null, com.xinzhu.haunted.d.f(f66509b, "signatures"));
                f66513f = true;
                return f66512e.get() != null;
            }
            return true;
        }

        public boolean k() {
            if (f66522o.get() == null) {
                if (f66523p) {
                    return false;
                }
                f66522o.compareAndSet(null, com.xinzhu.haunted.d.g(f66509b, "hasPastSigningCertificates", new Object[0]));
                f66523p = true;
                return f66522o.get() != null;
            }
            return true;
        }

        public boolean l() {
            if (f66524q.get() == null) {
                if (f66525r) {
                    return false;
                }
                f66524q.compareAndSet(null, com.xinzhu.haunted.d.g(f66509b, "hasSignatures", new Object[0]));
                f66525r = true;
                return f66524q.get() != null;
            }
            return true;
        }

        public Signature[] r() {
            if (f()) {
                try {
                    return (Signature[]) f66518k.get().get(this.f66534a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public int[] s() {
            if (g()) {
                try {
                    return (int[]) f66520m.get().get(this.f66534a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public ArraySet<PublicKey> t() {
            if (h()) {
                try {
                    return (ArraySet) f66516i.get().get(this.f66534a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public int u() {
            if (i()) {
                try {
                    return ((Integer) f66514g.get().get(this.f66534a)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public Signature[] v() {
            if (j()) {
                try {
                    return (Signature[]) f66512e.get().get(this.f66534a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean w() {
            if (k()) {
                try {
                    return ((Boolean) f66522o.get().invoke(this.f66534a, new Object[0])).booleanValue();
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

        public boolean x() {
            if (l()) {
                try {
                    return ((Boolean) f66524q.get().invoke(this.f66534a, new Object[0])).booleanValue();
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

        public boolean z(Signature[] signatureArr) {
            if (f()) {
                try {
                    f66518k.get().set(this.f66534a, signatureArr);
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

    private j() {
    }
}
