package com.xinzhu.haunted.android.content.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtApplicationInfo.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66391b = "b";

    /* renamed from: a  reason: collision with root package name */
    public Object f66441a;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66393c = com.xinzhu.haunted.d.a(ApplicationInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66395d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66397e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66399f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66401g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f66403h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66405i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f66407j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66409k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Field> f66411l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66413m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Field> f66415n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66417o = false;

    /* renamed from: p  reason: collision with root package name */
    private static AtomicReference<Field> f66419p = new AtomicReference<>();

    /* renamed from: q  reason: collision with root package name */
    private static boolean f66421q = false;

    /* renamed from: r  reason: collision with root package name */
    private static AtomicReference<Field> f66423r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    private static boolean f66425s = false;

    /* renamed from: t  reason: collision with root package name */
    private static AtomicReference<Field> f66427t = new AtomicReference<>();

    /* renamed from: u  reason: collision with root package name */
    private static boolean f66429u = false;

    /* renamed from: v  reason: collision with root package name */
    private static AtomicReference<Field> f66431v = new AtomicReference<>();

    /* renamed from: w  reason: collision with root package name */
    private static boolean f66433w = false;

    /* renamed from: x  reason: collision with root package name */
    private static AtomicReference<Field> f66435x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    private static boolean f66437y = false;

    /* renamed from: z  reason: collision with root package name */
    private static AtomicReference<Field> f66439z = new AtomicReference<>();
    private static boolean A = false;
    private static AtomicReference<Field> B = new AtomicReference<>();
    private static boolean C = false;
    private static AtomicReference<Field> D = new AtomicReference<>();
    private static boolean E = false;
    private static AtomicReference<Field> F = new AtomicReference<>();
    private static boolean G = false;
    private static AtomicReference<Field> H = new AtomicReference<>();
    private static boolean I = false;
    private static AtomicReference<Field> J = new AtomicReference<>();
    private static boolean K = false;
    private static AtomicReference<Field> L = new AtomicReference<>();
    private static boolean M = false;
    private static AtomicReference<Field> N = new AtomicReference<>();
    private static boolean O = false;
    private static AtomicReference<Field> P = new AtomicReference<>();
    private static boolean Q = false;
    private static AtomicReference<Field> R = new AtomicReference<>();
    private static boolean S = false;
    private static AtomicReference<Field> T = new AtomicReference<>();
    private static boolean U = false;
    private static AtomicReference<Field> V = new AtomicReference<>();
    private static boolean W = false;
    private static AtomicReference<Field> X = new AtomicReference<>();
    private static boolean Y = false;
    private static AtomicReference<Field> Z = new AtomicReference<>();

    /* renamed from: a0  reason: collision with root package name */
    private static boolean f66390a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    private static AtomicReference<Field> f66392b0 = new AtomicReference<>();

    /* renamed from: c0  reason: collision with root package name */
    private static boolean f66394c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    private static AtomicReference<Field> f66396d0 = new AtomicReference<>();

    /* renamed from: e0  reason: collision with root package name */
    private static boolean f66398e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    private static AtomicReference<Field> f66400f0 = new AtomicReference<>();

    /* renamed from: g0  reason: collision with root package name */
    private static boolean f66402g0 = false;

    /* renamed from: h0  reason: collision with root package name */
    private static AtomicReference<Field> f66404h0 = new AtomicReference<>();

    /* renamed from: i0  reason: collision with root package name */
    private static boolean f66406i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    private static AtomicReference<Field> f66408j0 = new AtomicReference<>();

    /* renamed from: k0  reason: collision with root package name */
    private static boolean f66410k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    private static AtomicReference<Field> f66412l0 = new AtomicReference<>();

    /* renamed from: m0  reason: collision with root package name */
    private static boolean f66414m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    private static AtomicReference<Field> f66416n0 = new AtomicReference<>();

    /* renamed from: o0  reason: collision with root package name */
    private static boolean f66418o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    private static AtomicReference<Field> f66420p0 = new AtomicReference<>();

    /* renamed from: q0  reason: collision with root package name */
    private static boolean f66422q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    private static AtomicReference<Field> f66424r0 = new AtomicReference<>();

    /* renamed from: s0  reason: collision with root package name */
    private static boolean f66426s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    private static AtomicReference<Field> f66428t0 = new AtomicReference<>();

    /* renamed from: u0  reason: collision with root package name */
    private static boolean f66430u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    private static AtomicReference<Field> f66432v0 = new AtomicReference<>();

    /* renamed from: w0  reason: collision with root package name */
    private static boolean f66434w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    private static AtomicReference<Field> f66436x0 = new AtomicReference<>();

    /* renamed from: y0  reason: collision with root package name */
    private static boolean f66438y0 = false;

    /* renamed from: z0  reason: collision with root package name */
    private static AtomicReference<Field> f66440z0 = new AtomicReference<>();
    private static boolean A0 = false;
    private static AtomicReference<Field> B0 = new AtomicReference<>();
    private static boolean C0 = false;
    private static AtomicReference<Field> D0 = new AtomicReference<>();
    private static boolean E0 = false;
    private static AtomicReference<Field> F0 = new AtomicReference<>();
    private static boolean G0 = false;
    private static AtomicReference<Method> H0 = new AtomicReference<>();
    private static boolean I0 = false;

    public b(Object obj) {
        this.f66441a = obj;
    }

    public static boolean B() {
        if (F0.get() == null) {
            if (G0) {
                return false;
            }
            F0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "sForBoolean"));
            G0 = true;
            return F0.get() != null;
        }
        return true;
    }

    public static boolean G0(int i4) {
        if (a()) {
            try {
                f66399f.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static int Q() {
        if (a()) {
            try {
                return ((Integer) f66399f.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static boolean a() {
        if (f66399f.get() == null) {
            if (f66401g) {
                return false;
            }
            f66399f.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "PRIVATE_FLAG_PRIVILEGED"));
            f66401g = true;
            return f66399f.get() != null;
        }
        return true;
    }

    public static boolean h1(Object obj) {
        if (B()) {
            try {
                F0.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static Object r0() {
        if (B()) {
            try {
                return F0.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean A() {
        if (f66428t0.get() == null) {
            if (f66430u0) {
                return false;
            }
            f66428t0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "roundIconRes"));
            f66430u0 = true;
            return f66428t0.get() != null;
        }
        return true;
    }

    public SparseArray<int[]> A0() {
        if (K()) {
            try {
                return (SparseArray) L.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public int B0() {
        if (L()) {
            try {
                return ((Integer) f66404h0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean C() {
        if (f66407j.get() == null) {
            if (f66409k) {
                return false;
            }
            f66407j.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "scanPublicSourceDir"));
            f66409k = true;
            return f66407j.get() != null;
        }
        return true;
    }

    public int C0() {
        if (M()) {
            try {
                return ((Integer) f66431v.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean D() {
        if (f66403h.get() == null) {
            if (f66405i) {
                return false;
            }
            f66403h.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "scanSourceDir"));
            f66405i = true;
            return f66403h.get() != null;
        }
        return true;
    }

    public String D0() {
        if (N()) {
            try {
                return (String) J.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean E() {
        if (R.get() == null) {
            if (S) {
                return false;
            }
            R.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "seInfo"));
            S = true;
            return R.get() != null;
        }
        return true;
    }

    public String E0() {
        if (O()) {
            try {
                return (String) f66420p0.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean F() {
        if (T.get() == null) {
            if (U) {
                return false;
            }
            T.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "seInfoUser"));
            U = true;
            return T.get() != null;
        }
        return true;
    }

    public void F0(long j4) {
        if (P(j4)) {
            try {
                H0.get().invoke(this.f66441a, Long.valueOf(j4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean G() {
        if (f66427t.get() == null) {
            if (f66429u) {
                return false;
            }
            f66427t.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "secondaryCpuAbi"));
            f66429u = true;
            return f66427t.get() != null;
        }
        return true;
    }

    public boolean H() {
        if (f66419p.get() == null) {
            if (f66421q) {
                return false;
            }
            f66419p.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "secondaryNativeLibraryDir"));
            f66421q = true;
            return f66419p.get() != null;
        }
        return true;
    }

    public boolean H0(String str) {
        if (b()) {
            try {
                f66408j0.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean I() {
        if (F.get() == null) {
            if (G) {
                return false;
            }
            F.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "sharedLibraryInfos"));
            G = true;
            return F.get() != null;
        }
        return true;
    }

    public boolean I0(String str) {
        if (c()) {
            try {
                f66439z.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean J() {
        if (f66412l0.get() == null) {
            if (f66414m0) {
                return false;
            }
            f66412l0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "splitClassLoaderNames"));
            f66414m0 = true;
            return f66412l0.get() != null;
        }
        return true;
    }

    public boolean J0(String str) {
        if (d()) {
            try {
                D.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean K() {
        if (L.get() == null) {
            if (M) {
                return false;
            }
            L.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "splitDependencies"));
            M = true;
            return L.get() != null;
        }
        return true;
    }

    public boolean K0(boolean z4) {
        if (e()) {
            try {
                f66396d0.get().set(this.f66441a, Boolean.valueOf(z4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean L() {
        if (f66404h0.get() == null) {
            if (f66406i0) {
                return false;
            }
            f66404h0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "targetSandboxVersion"));
            f66406i0 = true;
            return f66404h0.get() != null;
        }
        return true;
    }

    public boolean L0(int i4) {
        if (f()) {
            try {
                f66392b0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean M() {
        if (f66431v.get() == null) {
            if (f66433w) {
                return false;
            }
            f66431v.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, TTDownloadField.TT_VERSION_CODE));
            f66433w = true;
            return f66431v.get() != null;
        }
        return true;
    }

    public boolean M0(String str) {
        if (g()) {
            try {
                f66435x.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean N() {
        if (J.get() == null) {
            if (K) {
                return false;
            }
            J.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "volumeUuid"));
            K = true;
            return J.get() != null;
        }
        return true;
    }

    public boolean N0(String str) {
        if (h()) {
            try {
                B.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean O() {
        if (f66420p0.get() == null) {
            if (f66422q0) {
                return false;
            }
            f66420p0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "zygotePreloadName"));
            f66422q0 = true;
            return f66420p0.get() != null;
        }
        return true;
    }

    public boolean O0(int i4) {
        if (i()) {
            try {
                V.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean P(long j4) {
        if (H0.get() == null) {
            if (I0) {
                return false;
            }
            H0.compareAndSet(null, com.xinzhu.haunted.d.g(f66393c, "setVersionCode", Long.TYPE));
            I0 = true;
            return H0.get() != null;
        }
        return true;
    }

    public boolean P0(int i4) {
        if (j()) {
            try {
                Z.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean Q0(int i4) {
        if (k()) {
            try {
                f66436x0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String R() {
        if (b()) {
            try {
                return (String) f66408j0.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean R0(boolean z4) {
        if (l()) {
            try {
                f66416n0.get().set(this.f66441a, Boolean.valueOf(z4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String S() {
        if (c()) {
            try {
                return (String) f66439z.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean S0(int i4) {
        if (m()) {
            try {
                f66424r0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String T() {
        if (d()) {
            try {
                return (String) D.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean T0(int i4) {
        if (n()) {
            try {
                X.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean U() {
        if (e()) {
            try {
                return ((Boolean) f66396d0.get().get(this.f66441a)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean U0(int i4) {
        if (o()) {
            try {
                f66432v0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int V() {
        if (f()) {
            try {
                return ((Integer) f66392b0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean V0(int i4) {
        if (p()) {
            try {
                f66440z0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String W() {
        if (g()) {
            try {
                return (String) f66435x.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean W0(int i4) {
        if (q()) {
            try {
                B0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String X() {
        if (h()) {
            try {
                return (String) B.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean X0(String str) {
        if (r()) {
            try {
                f66415n.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int Y() {
        if (i()) {
            try {
                return ((Integer) V.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean Y0(boolean z4) {
        if (s()) {
            try {
                f66411l.get().set(this.f66441a, Boolean.valueOf(z4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int Z() {
        if (j()) {
            try {
                return ((Integer) Z.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean Z0(int i4) {
        if (t()) {
            try {
                f66400f0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int a0() {
        if (k()) {
            try {
                return ((Integer) f66436x0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean a1(String[] strArr) {
        if (u()) {
            try {
                P.get().set(this.f66441a, strArr);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean b() {
        if (f66408j0.get() == null) {
            if (f66410k0) {
                return false;
            }
            f66408j0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "classLoaderName"));
            f66410k0 = true;
            return f66408j0.get() != null;
        }
        return true;
    }

    public boolean b0() {
        if (l()) {
            try {
                return ((Boolean) f66416n0.get().get(this.f66441a)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean b1(String str) {
        if (v()) {
            try {
                f66423r.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean c() {
        if (f66439z.get() == null) {
            if (A) {
                return false;
            }
            f66439z.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "credentialEncryptedDataDir"));
            A = true;
            return f66439z.get() != null;
        }
        return true;
    }

    public int c0() {
        if (m()) {
            try {
                return ((Integer) f66424r0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean c1(int i4) {
        if (w()) {
            try {
                f66395d.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean d() {
        if (D.get() == null) {
            if (E) {
                return false;
            }
            D.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "credentialProtectedDataDir"));
            E = true;
            return D.get() != null;
        }
        return true;
    }

    public int d0() {
        if (n()) {
            try {
                return ((Integer) X.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean d1(int i4) {
        if (x()) {
            try {
                H.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean e() {
        if (f66396d0.get() == null) {
            if (f66398e0) {
                return false;
            }
            f66396d0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "crossProfile"));
            f66398e0 = true;
            return f66396d0.get() != null;
        }
        return true;
    }

    public int e0() {
        if (o()) {
            try {
                return ((Integer) f66432v0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean e1(Boolean bool) {
        if (y()) {
            try {
                D0.get().set(this.f66441a, bool);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean f() {
        if (f66392b0.get() == null) {
            if (f66394c0) {
                return false;
            }
            f66392b0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "dataExtractionRulesRes"));
            f66394c0 = true;
            return f66392b0.get() != null;
        }
        return true;
    }

    public int f0() {
        if (p()) {
            try {
                return ((Integer) f66440z0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean f1(String[] strArr) {
        if (z()) {
            try {
                N.get().set(this.f66441a, strArr);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean g() {
        if (f66435x.get() == null) {
            if (f66437y) {
                return false;
            }
            f66435x.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "deviceEncryptedDataDir"));
            f66437y = true;
            return f66435x.get() != null;
        }
        return true;
    }

    public int g0() {
        if (q()) {
            try {
                return ((Integer) B0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean g1(int i4) {
        if (A()) {
            try {
                f66428t0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean h() {
        if (B.get() == null) {
            if (C) {
                return false;
            }
            B.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "deviceProtectedDataDir"));
            C = true;
            return B.get() != null;
        }
        return true;
    }

    public String h0() {
        if (r()) {
            try {
                return (String) f66415n.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean i() {
        if (V.get() == null) {
            if (W) {
                return false;
            }
            V.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "enabledSetting"));
            W = true;
            return V.get() != null;
        }
        return true;
    }

    public boolean i0() {
        if (s()) {
            try {
                return ((Boolean) f66411l.get().get(this.f66441a)).booleanValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean i1(String str) {
        if (C()) {
            try {
                f66407j.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean j() {
        if (Z.get() == null) {
            if (f66390a0) {
                return false;
            }
            Z.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "fullBackupContent"));
            f66390a0 = true;
            return Z.get() != null;
        }
        return true;
    }

    public int j0() {
        if (t()) {
            try {
                return ((Integer) f66400f0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean j1(String str) {
        if (D()) {
            try {
                f66403h.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean k() {
        if (f66436x0.get() == null) {
            if (f66438y0) {
                return false;
            }
            f66436x0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "gwpAsanMode"));
            f66438y0 = true;
            return f66436x0.get() != null;
        }
        return true;
    }

    public String[] k0() {
        if (u()) {
            try {
                return (String[]) P.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean k1(String str) {
        if (E()) {
            try {
                R.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean l() {
        if (f66416n0.get() == null) {
            if (f66418o0) {
                return false;
            }
            f66416n0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "hiddenUntilInstalled"));
            f66418o0 = true;
            return f66416n0.get() != null;
        }
        return true;
    }

    public String l0() {
        if (v()) {
            try {
                return (String) f66423r.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean l1(String str) {
        if (F()) {
            try {
                T.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean m() {
        if (f66424r0.get() == null) {
            if (f66426s0) {
                return false;
            }
            f66424r0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "iconRes"));
            f66426s0 = true;
            return f66424r0.get() != null;
        }
        return true;
    }

    public int m0() {
        if (w()) {
            try {
                return ((Integer) f66395d.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean m1(String str) {
        if (G()) {
            try {
                f66427t.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean n() {
        if (X.get() == null) {
            if (Y) {
                return false;
            }
            X.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "installLocation"));
            Y = true;
            return X.get() != null;
        }
        return true;
    }

    public int n0() {
        if (x()) {
            try {
                return ((Integer) H.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean n1(String str) {
        if (H()) {
            try {
                f66419p.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean o() {
        if (f66432v0.get() == null) {
            if (f66434w0) {
                return false;
            }
            f66432v0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "mHiddenApiPolicy"));
            f66434w0 = true;
            return f66432v0.get() != null;
        }
        return true;
    }

    public Boolean o0() {
        if (!y()) {
            return Boolean.FALSE;
        }
        try {
            return (Boolean) D0.get().get(this.f66441a);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return Boolean.FALSE;
        }
    }

    public boolean o1(List<SharedLibraryInfo> list) {
        if (I()) {
            try {
                F.get().set(this.f66441a, list);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean p() {
        if (f66440z0.get() == null) {
            if (A0) {
                return false;
            }
            f66440z0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "memtagMode"));
            A0 = true;
            return f66440z0.get() != null;
        }
        return true;
    }

    public String[] p0() {
        if (z()) {
            try {
                return (String[]) N.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean p1(String[] strArr) {
        if (J()) {
            try {
                f66412l0.get().set(this.f66441a, strArr);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean q() {
        if (B0.get() == null) {
            if (C0) {
                return false;
            }
            B0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "nativeHeapZeroInitialized"));
            C0 = true;
            return B0.get() != null;
        }
        return true;
    }

    public int q0() {
        if (A()) {
            try {
                return ((Integer) f66428t0.get().get(this.f66441a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean q1(SparseArray<int[]> sparseArray) {
        if (K()) {
            try {
                L.get().set(this.f66441a, sparseArray);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean r() {
        if (f66415n.get() == null) {
            if (f66417o) {
                return false;
            }
            f66415n.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "nativeLibraryRootDir"));
            f66417o = true;
            return f66415n.get() != null;
        }
        return true;
    }

    public boolean r1(int i4) {
        if (L()) {
            try {
                f66404h0.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean s() {
        if (f66411l.get() == null) {
            if (f66413m) {
                return false;
            }
            f66411l.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "nativeLibraryRootRequiresIsa"));
            f66413m = true;
            return f66411l.get() != null;
        }
        return true;
    }

    public String s0() {
        if (C()) {
            try {
                return (String) f66407j.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean s1(int i4) {
        if (M()) {
            try {
                f66431v.get().set(this.f66441a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean t() {
        if (f66400f0.get() == null) {
            if (f66402g0) {
                return false;
            }
            f66400f0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "networkSecurityConfigRes"));
            f66402g0 = true;
            return f66400f0.get() != null;
        }
        return true;
    }

    public String t0() {
        if (D()) {
            try {
                return (String) f66403h.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean t1(String str) {
        if (N()) {
            try {
                J.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean u() {
        if (P.get() == null) {
            if (Q) {
                return false;
            }
            P.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "overlayPaths"));
            Q = true;
            return P.get() != null;
        }
        return true;
    }

    public String u0() {
        if (E()) {
            try {
                return (String) R.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean u1(String str) {
        if (O()) {
            try {
                f66420p0.get().set(this.f66441a, str);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean v() {
        if (f66423r.get() == null) {
            if (f66425s) {
                return false;
            }
            f66423r.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "primaryCpuAbi"));
            f66425s = true;
            return f66423r.get() != null;
        }
        return true;
    }

    public String v0() {
        if (F()) {
            try {
                return (String) T.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean w() {
        if (f66395d.get() == null) {
            if (f66397e) {
                return false;
            }
            f66395d.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "privateFlags"));
            f66397e = true;
            return f66395d.get() != null;
        }
        return true;
    }

    public String w0() {
        if (G()) {
            try {
                return (String) f66427t.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean x() {
        if (H.get() == null) {
            if (I) {
                return false;
            }
            H.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "privateFlagsExt"));
            I = true;
            return H.get() != null;
        }
        return true;
    }

    public String x0() {
        if (H()) {
            try {
                return (String) f66419p.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean y() {
        if (D0.get() == null) {
            if (E0) {
                return false;
            }
            D0.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "requestRawExternalStorageAccess"));
            E0 = true;
            return D0.get() != null;
        }
        return true;
    }

    public List<SharedLibraryInfo> y0() {
        if (I()) {
            try {
                return (List) F.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean z() {
        if (N.get() == null) {
            if (O) {
                return false;
            }
            N.compareAndSet(null, com.xinzhu.haunted.d.f(f66393c, "resourceDirs"));
            O = true;
            return N.get() != null;
        }
        return true;
    }

    public String[] z0() {
        if (J()) {
            try {
                return (String[]) f66412l0.get().get(this.f66441a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private b() {
    }
}
