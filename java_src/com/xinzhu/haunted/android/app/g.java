package com.xinzhu.haunted.android.app;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.util.ArrayMap;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.activity.PapayPayDetialActivity_;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityThread.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65853b = "g";

    /* renamed from: a  reason: collision with root package name */
    public Object f65890a;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65855c = com.xinzhu.haunted.d.b(InstrumentationProxy.f64868d);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65857d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65859e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f65861f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f65863g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Field> f65865h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f65867i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Field> f65869j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f65871k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Field> f65873l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f65875m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Field> f65877n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f65878o = false;

    /* renamed from: p  reason: collision with root package name */
    private static AtomicReference<Field> f65879p = new AtomicReference<>();

    /* renamed from: q  reason: collision with root package name */
    private static boolean f65880q = false;

    /* renamed from: r  reason: collision with root package name */
    private static AtomicReference<Field> f65881r = new AtomicReference<>();

    /* renamed from: s  reason: collision with root package name */
    private static boolean f65882s = false;

    /* renamed from: t  reason: collision with root package name */
    private static AtomicReference<Field> f65883t = new AtomicReference<>();

    /* renamed from: u  reason: collision with root package name */
    private static boolean f65884u = false;

    /* renamed from: v  reason: collision with root package name */
    private static AtomicReference<Field> f65885v = new AtomicReference<>();

    /* renamed from: w  reason: collision with root package name */
    private static boolean f65886w = false;

    /* renamed from: x  reason: collision with root package name */
    private static AtomicReference<Method> f65887x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    private static boolean f65888y = false;

    /* renamed from: z  reason: collision with root package name */
    private static AtomicReference<Method> f65889z = new AtomicReference<>();
    private static boolean A = false;
    private static AtomicReference<Method> B = new AtomicReference<>();
    private static boolean C = false;
    private static AtomicReference<Method> D = new AtomicReference<>();
    private static boolean E = false;
    private static AtomicReference<Method> F = new AtomicReference<>();
    private static boolean G = false;
    private static AtomicReference<Method> H = new AtomicReference<>();
    private static boolean I = false;
    private static AtomicReference<Method> J = new AtomicReference<>();
    private static boolean K = false;
    private static AtomicReference<Method> L = new AtomicReference<>();
    private static boolean M = false;
    private static AtomicReference<Method> N = new AtomicReference<>();
    private static boolean O = false;
    private static AtomicReference<Method> P = new AtomicReference<>();
    private static boolean Q = false;
    private static AtomicReference<Method> R = new AtomicReference<>();
    private static boolean S = false;
    private static AtomicReference<Method> T = new AtomicReference<>();
    private static boolean U = false;
    private static AtomicReference<Method> V = new AtomicReference<>();
    private static boolean W = false;
    private static AtomicReference<Method> X = new AtomicReference<>();
    private static boolean Y = false;
    private static AtomicReference<Method> Z = new AtomicReference<>();

    /* renamed from: a0  reason: collision with root package name */
    private static boolean f65852a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    private static AtomicReference<Method> f65854b0 = new AtomicReference<>();

    /* renamed from: c0  reason: collision with root package name */
    private static boolean f65856c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    private static AtomicReference<Method> f65858d0 = new AtomicReference<>();

    /* renamed from: e0  reason: collision with root package name */
    private static boolean f65860e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    private static AtomicReference<Method> f65862f0 = new AtomicReference<>();

    /* renamed from: g0  reason: collision with root package name */
    private static boolean f65864g0 = false;

    /* renamed from: h0  reason: collision with root package name */
    private static AtomicReference<Method> f65866h0 = new AtomicReference<>();

    /* renamed from: i0  reason: collision with root package name */
    private static boolean f65868i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    private static AtomicReference<Method> f65870j0 = new AtomicReference<>();

    /* renamed from: k0  reason: collision with root package name */
    private static boolean f65872k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    private static AtomicReference<Method> f65874l0 = new AtomicReference<>();

    /* renamed from: m0  reason: collision with root package name */
    private static boolean f65876m0 = false;

    /* compiled from: HtActivityThread.java */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f65917a = com.xinzhu.haunted.d.b("android.app.ActivityThread$ApplicationThread");
    }

    /* compiled from: HtActivityThread.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f65918a = com.xinzhu.haunted.d.b("android.app.ActivityThread$H");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Field> f65919b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f65920c = false;

        /* renamed from: d  reason: collision with root package name */
        private static AtomicReference<Field> f65921d = new AtomicReference<>();

        /* renamed from: e  reason: collision with root package name */
        private static boolean f65922e = false;

        /* renamed from: f  reason: collision with root package name */
        private static AtomicReference<Field> f65923f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private static boolean f65924g = false;

        public static boolean a() {
            if (f65921d.get() == null) {
                if (f65922e) {
                    return false;
                }
                f65921d.compareAndSet(null, com.xinzhu.haunted.d.f(f65918a, "EXECUTE_TRANSACTION"));
                f65922e = true;
                return f65921d.get() != null;
            }
            return true;
        }

        public static boolean b() {
            if (f65919b.get() == null) {
                if (f65920c) {
                    return false;
                }
                f65919b.compareAndSet(null, com.xinzhu.haunted.d.f(f65918a, "LAUNCH_ACTIVITY"));
                f65920c = true;
                return f65919b.get() != null;
            }
            return true;
        }

        public static boolean c() {
            if (f65923f.get() == null) {
                if (f65924g) {
                    return false;
                }
                f65923f.compareAndSet(null, com.xinzhu.haunted.d.f(f65918a, "SCHEDULE_CRASH"));
                f65924g = true;
                return f65923f.get() != null;
            }
            return true;
        }

        public static int d() {
            if (a()) {
                try {
                    return ((Integer) f65921d.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int e() {
            if (b()) {
                try {
                    return ((Integer) f65919b.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static int f() {
            if (c()) {
                try {
                    return ((Integer) f65923f.get().get(null)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public static boolean g(int i4) {
            if (a()) {
                try {
                    f65921d.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean h(int i4) {
            if (b()) {
                try {
                    f65919b.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public static boolean i(int i4) {
            if (c()) {
                try {
                    f65923f.get().set(null, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }
    }

    public g(Object obj) {
        this.f65890a = obj;
    }

    public static Object F() {
        if (k()) {
            try {
                return f65887x.get().invoke(null, new Object[0]);
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

    public static Application G() {
        if (l()) {
            try {
                return (Application) X.get().invoke(null, new Object[0]);
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

    public static String H() {
        if (m()) {
            try {
                return (String) f65854b0.get().invoke(null, new Object[0]);
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

    public static String I() {
        if (n()) {
            try {
                return (String) Z.get().invoke(null, new Object[0]);
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

    public static String J() {
        if (o()) {
            try {
                return (String) P.get().invoke(null, new Object[0]);
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

    public static IInterface P() {
        if (u()) {
            try {
                return (IInterface) N.get().invoke(null, new Object[0]);
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

    public static IInterface Q() {
        if (v()) {
            try {
                return (IInterface) f65858d0.get().invoke(null, new Object[0]);
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

    public static Object a0() {
        if (h()) {
            try {
                return f65865h.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static IInterface b0() {
        if (i()) {
            try {
                return (IInterface) f65869j.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static IInterface c0() {
        if (j()) {
            try {
                return (IInterface) f65881r.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean h() {
        if (f65865h.get() == null) {
            if (f65867i) {
                return false;
            }
            f65865h.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "sCurrentActivityThread"));
            f65867i = true;
            return f65865h.get() != null;
        }
        return true;
    }

    public static boolean i() {
        if (f65869j.get() == null) {
            if (f65871k) {
                return false;
            }
            f65869j.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "sPackageManager"));
            f65871k = true;
            return f65869j.get() != null;
        }
        return true;
    }

    public static boolean j() {
        if (f65881r.get() == null) {
            if (f65882s) {
                return false;
            }
            f65881r.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "sPermissionManager"));
            f65882s = true;
            return f65881r.get() != null;
        }
        return true;
    }

    public static boolean k() {
        if (f65887x.get() == null) {
            if (f65888y) {
                return false;
            }
            f65887x.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, InstrumentationProxy.f64869e, new Object[0]));
            f65888y = true;
            return f65887x.get() != null;
        }
        return true;
    }

    public static boolean l() {
        if (X.get() == null) {
            if (Y) {
                return false;
            }
            X.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "currentApplication", new Object[0]));
            Y = true;
            return X.get() != null;
        }
        return true;
    }

    public static boolean m() {
        if (f65854b0.get() == null) {
            if (f65856c0) {
                return false;
            }
            f65854b0.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "currentOpPackageName", new Object[0]));
            f65856c0 = true;
            return f65854b0.get() != null;
        }
        return true;
    }

    public static boolean n() {
        if (Z.get() == null) {
            if (f65852a0) {
                return false;
            }
            Z.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "currentPackageName", new Object[0]));
            f65852a0 = true;
            return Z.get() != null;
        }
        return true;
    }

    public static boolean o() {
        if (P.get() == null) {
            if (Q) {
                return false;
            }
            P.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "currentProcessName", new Object[0]));
            Q = true;
            return P.get() != null;
        }
        return true;
    }

    public static boolean r0(Object obj) {
        if (h()) {
            try {
                f65865h.get().set(null, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean s0(IInterface iInterface) {
        if (i()) {
            try {
                f65869j.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean t0(IInterface iInterface) {
        if (j()) {
            try {
                f65881r.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean u() {
        if (N.get() == null) {
            if (O) {
                return false;
            }
            N.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getPackageManager", new Object[0]));
            O = true;
            return N.get() != null;
        }
        return true;
    }

    public static boolean v() {
        if (f65858d0.get() == null) {
            if (f65860e0) {
                return false;
            }
            f65858d0.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getPermissionManager", new Object[0]));
            f65860e0 = true;
            return f65858d0.get() != null;
        }
        return true;
    }

    public boolean A(Context context, Object obj, ProviderInfo providerInfo, boolean z4, boolean z5, boolean z6) {
        if (V.get() == null) {
            if (W) {
                return false;
            }
            AtomicReference<Method> atomicReference = V;
            Class<?> cls = f65855c;
            Class cls2 = Boolean.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "installProvider", Context.class, "android.app.IActivityManager$ContentProviderHolder", ProviderInfo.class, cls2, cls2, cls2));
            W = true;
            return V.get() != null;
        }
        return true;
    }

    public boolean B(Context context, Object obj, ProviderInfo providerInfo, boolean z4, boolean z5, boolean z6) {
        if (T.get() == null) {
            if (U) {
                return false;
            }
            AtomicReference<Method> atomicReference = T;
            Class<?> cls = f65855c;
            Class cls2 = Boolean.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "installProvider", Context.class, "android.app.ContentProviderHolder", ProviderInfo.class, cls2, cls2, cls2));
            U = true;
            return T.get() != null;
        }
        return true;
    }

    public boolean C(IBinder iBinder, List list) {
        if (B.get() == null) {
            if (C) {
                return false;
            }
            B.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "performNewIntents", IBinder.class, List.class));
            C = true;
            return B.get() != null;
        }
        return true;
    }

    public boolean D(IBinder iBinder, List list, boolean z4) {
        if (D.get() == null) {
            if (E) {
                return false;
            }
            D.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "performNewIntents", IBinder.class, List.class, Boolean.TYPE));
            E = true;
            return D.get() != null;
        }
        return true;
    }

    public boolean E(IBinder iBinder, String str, int i4, int i5, Intent intent) {
        if (f65889z.get() == null) {
            if (A) {
                return false;
            }
            AtomicReference<Method> atomicReference = f65889z;
            Class<?> cls = f65855c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "sendActivityResult", IBinder.class, String.class, cls2, cls2, Intent.class));
            A = true;
            return f65889z.get() != null;
        }
        return true;
    }

    public IBinder K() {
        if (p()) {
            try {
                return (IBinder) R.get().invoke(this.f65890a, new Object[0]);
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

    public float L(String str, float f5) {
        if (q(str, f5)) {
            try {
                return ((Float) f65866h0.get().invoke(this.f65890a, str, Float.valueOf(f5))).floatValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0.0f;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public int M(String str, int i4) {
        if (r(str, i4)) {
            try {
                return ((Integer) f65862f0.get().invoke(this.f65890a, str, Integer.valueOf(i4))).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public Object N(IBinder iBinder) {
        if (s(iBinder)) {
            try {
                return f65870j0.get().invoke(this.f65890a, iBinder);
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

    public Object O(ApplicationInfo applicationInfo, Object obj) {
        if (t(applicationInfo, obj)) {
            try {
                return f65874l0.get().invoke(this.f65890a, applicationInfo, obj);
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

    public Object R() {
        if (w()) {
            try {
                return J.get().invoke(this.f65890a, new Object[0]);
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

    public Object S() {
        if (x()) {
            try {
                return L.get().invoke(this.f65890a, new Object[0]);
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

    public ArrayMap<IBinder, Object> T() {
        if (a()) {
            try {
                return (ArrayMap) f65877n.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Object U() {
        if (b()) {
            try {
                return f65861f.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Handler V() {
        if (c()) {
            try {
                return (Handler) f65879p.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Application W() {
        if (d()) {
            try {
                return (Application) f65883t.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Instrumentation X() {
        if (e()) {
            try {
                return (Instrumentation) f65885v.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Object Y() {
        if (f()) {
            try {
                return f65873l.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public Map Z() {
        if (g()) {
            try {
                return (Map) f65857d.get().get(this.f65890a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean a() {
        if (f65877n.get() == null) {
            if (f65878o) {
                return false;
            }
            f65877n.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "mActivities"));
            f65878o = true;
            return f65877n.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f65861f.get() == null) {
            if (f65863g) {
                return false;
            }
            f65861f.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "mBoundApplication"));
            f65863g = true;
            return f65861f.get() != null;
        }
        return true;
    }

    public boolean c() {
        if (f65879p.get() == null) {
            if (f65880q) {
                return false;
            }
            f65879p.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "mH"));
            f65880q = true;
            return f65879p.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (f65883t.get() == null) {
            if (f65884u) {
                return false;
            }
            f65883t.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "mInitialApplication"));
            f65884u = true;
            return f65883t.get() != null;
        }
        return true;
    }

    public void d0(IBinder iBinder, List list) {
        if (y(iBinder, list)) {
            try {
                F.get().invoke(this.f65890a, iBinder, list);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean e() {
        if (f65885v.get() == null) {
            if (f65886w) {
                return false;
            }
            f65885v.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, InstrumentationProxy.f64870f));
            f65886w = true;
            return f65885v.get() != null;
        }
        return true;
    }

    public void e0(Object obj, List list) {
        if (z(obj, list)) {
            try {
                H.get().invoke(this.f65890a, obj, list);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean f() {
        if (f65873l.get() == null) {
            if (f65875m) {
                return false;
            }
            f65873l.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "mPackages"));
            f65875m = true;
            return f65873l.get() != null;
        }
        return true;
    }

    public Object f0(Context context, Object obj, ProviderInfo providerInfo, boolean z4, boolean z5, boolean z6) {
        if (A(context, obj, providerInfo, z4, z5, z6)) {
            try {
                return V.get().invoke(this.f65890a, context, obj, providerInfo, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6));
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

    public boolean g() {
        if (f65857d.get() == null) {
            if (f65859e) {
                return false;
            }
            f65857d.compareAndSet(null, com.xinzhu.haunted.d.f(f65855c, "mProviderMap"));
            f65859e = true;
            return f65857d.get() != null;
        }
        return true;
    }

    public Object g0(Context context, Object obj, ProviderInfo providerInfo, boolean z4, boolean z5, boolean z6) {
        if (B(context, obj, providerInfo, z4, z5, z6)) {
            try {
                return T.get().invoke(this.f65890a, context, obj, providerInfo, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6));
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

    public void h0(IBinder iBinder, List list) {
        if (C(iBinder, list)) {
            try {
                B.get().invoke(this.f65890a, iBinder, list);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public void i0(IBinder iBinder, List list, boolean z4) {
        if (D(iBinder, list, z4)) {
            try {
                D.get().invoke(this.f65890a, iBinder, list, Boolean.valueOf(z4));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public void j0(IBinder iBinder, String str, int i4, int i5, Intent intent) {
        if (E(iBinder, str, i4, i5, intent)) {
            try {
                f65889z.get().invoke(this.f65890a, iBinder, str, Integer.valueOf(i4), Integer.valueOf(i5), intent);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public boolean k0(ArrayMap<IBinder, Object> arrayMap) {
        if (a()) {
            try {
                f65877n.get().set(this.f65890a, arrayMap);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean l0(Object obj) {
        if (b()) {
            try {
                f65861f.get().set(this.f65890a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean m0(Handler handler) {
        if (c()) {
            try {
                f65879p.get().set(this.f65890a, handler);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean n0(Application application) {
        if (d()) {
            try {
                f65883t.get().set(this.f65890a, application);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean o0(Instrumentation instrumentation) {
        if (e()) {
            try {
                f65885v.get().set(this.f65890a, instrumentation);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean p() {
        if (R.get() == null) {
            if (S) {
                return false;
            }
            R.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getApplicationThread", new Object[0]));
            S = true;
            return R.get() != null;
        }
        return true;
    }

    public boolean p0(Object obj) {
        if (f()) {
            try {
                f65873l.get().set(this.f65890a, obj);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean q(String str, float f5) {
        if (f65866h0.get() == null) {
            if (f65868i0) {
                return false;
            }
            f65866h0.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getFloatCoreSetting", String.class, Float.TYPE));
            f65868i0 = true;
            return f65866h0.get() != null;
        }
        return true;
    }

    public boolean q0(Map map) {
        if (g()) {
            try {
                f65857d.get().set(this.f65890a, map);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean r(String str, int i4) {
        if (f65862f0.get() == null) {
            if (f65864g0) {
                return false;
            }
            f65862f0.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getIntCoreSetting", String.class, Integer.TYPE));
            f65864g0 = true;
            return f65862f0.get() != null;
        }
        return true;
    }

    public boolean s(IBinder iBinder) {
        if (f65870j0.get() == null) {
            if (f65872k0) {
                return false;
            }
            f65870j0.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getLaunchingActivity", IBinder.class));
            f65872k0 = true;
            return f65870j0.get() != null;
        }
        return true;
    }

    public boolean t(ApplicationInfo applicationInfo, Object obj) {
        if (f65874l0.get() == null) {
            if (f65876m0) {
                return false;
            }
            f65874l0.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getPackageInfoNoCheck", ApplicationInfo.class, "android.content.res.CompatibilityInfo"));
            f65876m0 = true;
            return f65874l0.get() != null;
        }
        return true;
    }

    public boolean w() {
        if (J.get() == null) {
            if (K) {
                return false;
            }
            J.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getSystemContext", new Object[0]));
            K = true;
            return J.get() != null;
        }
        return true;
    }

    public boolean x() {
        if (L.get() == null) {
            if (M) {
                return false;
            }
            L.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "getSystemUiContext", new Object[0]));
            M = true;
            return L.get() != null;
        }
        return true;
    }

    public boolean y(IBinder iBinder, List list) {
        if (F.get() == null) {
            if (G) {
                return false;
            }
            F.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "handleNewIntent", IBinder.class, List.class));
            G = true;
            return F.get() != null;
        }
        return true;
    }

    public boolean z(Object obj, List list) {
        if (H.get() == null) {
            if (I) {
                return false;
            }
            H.compareAndSet(null, com.xinzhu.haunted.d.g(f65855c, "handleNewIntent", "android.app.ActivityThread$ActivityClientRecord", List.class));
            I = true;
            return H.get() != null;
        }
        return true;
    }

    /* compiled from: HtActivityThread.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65891b = com.xinzhu.haunted.d.b("android.app.ActivityThread$ActivityClientRecord");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f65892c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65893d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f65894e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f65895f = false;

        /* renamed from: g  reason: collision with root package name */
        private static AtomicReference<Field> f65896g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        private static boolean f65897h = false;

        /* renamed from: i  reason: collision with root package name */
        private static AtomicReference<Field> f65898i = new AtomicReference<>();

        /* renamed from: j  reason: collision with root package name */
        private static boolean f65899j = false;

        /* renamed from: k  reason: collision with root package name */
        private static AtomicReference<Field> f65900k = new AtomicReference<>();

        /* renamed from: l  reason: collision with root package name */
        private static boolean f65901l = false;

        /* renamed from: m  reason: collision with root package name */
        private static AtomicReference<Field> f65902m = new AtomicReference<>();

        /* renamed from: n  reason: collision with root package name */
        private static boolean f65903n = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65904a;

        public a(Object obj) {
            this.f65904a = obj;
        }

        public boolean a() {
            if (f65892c.get() == null) {
                if (f65893d) {
                    return false;
                }
                f65892c.compareAndSet(null, com.xinzhu.haunted.d.f(f65891b, TTDownloadField.TT_ACTIVITY));
                f65893d = true;
                return f65892c.get() != null;
            }
            return true;
        }

        public boolean b() {
            if (f65898i.get() == null) {
                if (f65899j) {
                    return false;
                }
                f65898i.compareAndSet(null, com.xinzhu.haunted.d.f(f65891b, "activityInfo"));
                f65899j = true;
                return f65898i.get() != null;
            }
            return true;
        }

        public boolean c() {
            if (f65900k.get() == null) {
                if (f65901l) {
                    return false;
                }
                f65900k.compareAndSet(null, com.xinzhu.haunted.d.f(f65891b, "compatInfo"));
                f65901l = true;
                return f65900k.get() != null;
            }
            return true;
        }

        public boolean d() {
            if (f65894e.get() == null) {
                if (f65895f) {
                    return false;
                }
                f65894e.compareAndSet(null, com.xinzhu.haunted.d.f(f65891b, "intent"));
                f65895f = true;
                return f65894e.get() != null;
            }
            return true;
        }

        public boolean e() {
            if (f65902m.get() == null) {
                if (f65903n) {
                    return false;
                }
                f65902m.compareAndSet(null, com.xinzhu.haunted.d.f(f65891b, "packageInfo"));
                f65903n = true;
                return f65902m.get() != null;
            }
            return true;
        }

        public boolean f() {
            if (f65896g.get() == null) {
                if (f65897h) {
                    return false;
                }
                f65896g.compareAndSet(null, com.xinzhu.haunted.d.f(f65891b, "token"));
                f65897h = true;
                return f65896g.get() != null;
            }
            return true;
        }

        public Activity g() {
            if (a()) {
                try {
                    return (Activity) f65892c.get().get(this.f65904a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public ActivityInfo h() {
            if (b()) {
                try {
                    return (ActivityInfo) f65898i.get().get(this.f65904a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public Object i() {
            if (c()) {
                try {
                    return f65900k.get().get(this.f65904a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public Intent j() {
            if (d()) {
                try {
                    return (Intent) f65894e.get().get(this.f65904a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public Object k() {
            if (e()) {
                try {
                    return f65902m.get().get(this.f65904a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public IBinder l() {
            if (f()) {
                try {
                    return (IBinder) f65896g.get().get(this.f65904a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean m(Activity activity) {
            if (a()) {
                try {
                    f65892c.get().set(this.f65904a, activity);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean n(ActivityInfo activityInfo) {
            if (b()) {
                try {
                    f65898i.get().set(this.f65904a, activityInfo);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean o(Object obj) {
            if (c()) {
                try {
                    f65900k.get().set(this.f65904a, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean p(Intent intent) {
            if (d()) {
                try {
                    f65894e.get().set(this.f65904a, intent);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean q(Object obj) {
            if (e()) {
                try {
                    f65902m.get().set(this.f65904a, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean r(IBinder iBinder) {
            if (f()) {
                try {
                    f65896g.get().set(this.f65904a, iBinder);
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

    /* compiled from: HtActivityThread.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65905b = com.xinzhu.haunted.d.b("android.app.ActivityThread$AppBindData");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f65906c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65907d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f65908e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f65909f = false;

        /* renamed from: g  reason: collision with root package name */
        private static AtomicReference<Field> f65910g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        private static boolean f65911h = false;

        /* renamed from: i  reason: collision with root package name */
        private static AtomicReference<Field> f65912i = new AtomicReference<>();

        /* renamed from: j  reason: collision with root package name */
        private static boolean f65913j = false;

        /* renamed from: k  reason: collision with root package name */
        private static AtomicReference<Field> f65914k = new AtomicReference<>();

        /* renamed from: l  reason: collision with root package name */
        private static boolean f65915l = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65916a;

        public b(Object obj) {
            this.f65916a = obj;
        }

        public boolean a() {
            if (f65908e.get() == null) {
                if (f65909f) {
                    return false;
                }
                f65908e.compareAndSet(null, com.xinzhu.haunted.d.f(f65905b, "appInfo"));
                f65909f = true;
                return f65908e.get() != null;
            }
            return true;
        }

        public boolean b() {
            if (f65910g.get() == null) {
                if (f65911h) {
                    return false;
                }
                f65910g.compareAndSet(null, com.xinzhu.haunted.d.f(f65905b, PapayPayDetialActivity_.f36841l));
                f65911h = true;
                return f65910g.get() != null;
            }
            return true;
        }

        public boolean c() {
            if (f65906c.get() == null) {
                if (f65907d) {
                    return false;
                }
                f65906c.compareAndSet(null, com.xinzhu.haunted.d.f(f65905b, "instrumentationName"));
                f65907d = true;
                return f65906c.get() != null;
            }
            return true;
        }

        public boolean d() {
            if (f65912i.get() == null) {
                if (f65913j) {
                    return false;
                }
                f65912i.compareAndSet(null, com.xinzhu.haunted.d.f(f65905b, "processName"));
                f65913j = true;
                return f65912i.get() != null;
            }
            return true;
        }

        public boolean e() {
            if (f65914k.get() == null) {
                if (f65915l) {
                    return false;
                }
                f65914k.compareAndSet(null, com.xinzhu.haunted.d.f(f65905b, "providers"));
                f65915l = true;
                return f65914k.get() != null;
            }
            return true;
        }

        public ApplicationInfo f() {
            if (a()) {
                try {
                    return (ApplicationInfo) f65908e.get().get(this.f65916a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public Object g() {
            if (b()) {
                try {
                    return f65910g.get().get(this.f65916a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public ComponentName h() {
            if (c()) {
                try {
                    return (ComponentName) f65906c.get().get(this.f65916a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public String i() {
            if (d()) {
                try {
                    return (String) f65912i.get().get(this.f65916a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public List<ProviderInfo> j() {
            if (e()) {
                try {
                    return (List) f65914k.get().get(this.f65916a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean k(ApplicationInfo applicationInfo) {
            if (a()) {
                try {
                    f65908e.get().set(this.f65916a, applicationInfo);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean l(Object obj) {
            if (b()) {
                try {
                    f65910g.get().set(this.f65916a, obj);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean m(ComponentName componentName) {
            if (c()) {
                try {
                    f65906c.get().set(this.f65916a, componentName);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean n(String str) {
            if (d()) {
                try {
                    f65912i.get().set(this.f65916a, str);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean o(List<ProviderInfo> list) {
            if (e()) {
                try {
                    f65914k.get().set(this.f65916a, list);
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

    /* compiled from: HtActivityThread.java */
    /* loaded from: classes6.dex */
    public static final class e {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65925b = com.xinzhu.haunted.d.b("android.app.ActivityThread$ProviderClientRecord");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f65926c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65927d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f65928e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f65929f = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65930a;

        public e(Object obj) {
            this.f65930a = obj;
        }

        public boolean a() {
            if (f65926c.get() == null) {
                if (f65927d) {
                    return false;
                }
                f65926c.compareAndSet(null, com.xinzhu.haunted.d.f(f65925b, "mNames"));
                f65927d = true;
                return f65926c.get() != null;
            }
            return true;
        }

        public boolean b() {
            if (f65928e.get() == null) {
                if (f65929f) {
                    return false;
                }
                f65928e.compareAndSet(null, com.xinzhu.haunted.d.f(f65925b, "mProvider"));
                f65929f = true;
                return f65928e.get() != null;
            }
            return true;
        }

        public String[] c() {
            if (a()) {
                try {
                    return (String[]) f65926c.get().get(this.f65930a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public IInterface d() {
            if (b()) {
                try {
                    return (IInterface) f65928e.get().get(this.f65930a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public boolean e(String[] strArr) {
            if (a()) {
                try {
                    f65926c.get().set(this.f65930a, strArr);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean f(IInterface iInterface) {
            if (b()) {
                try {
                    f65928e.get().set(this.f65930a, iInterface);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        private e() {
        }
    }

    private g() {
    }
}
