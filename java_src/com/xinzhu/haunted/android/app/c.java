package com.xinzhu.haunted.android.app;

import android.app.ActivityManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtActivityManager.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f65771a = "c";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f65772b = com.xinzhu.haunted.d.a(ActivityManager.class);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f65773c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f65774d = false;

    public static boolean a() {
        if (f65773c.get() == null) {
            if (f65774d) {
                return false;
            }
            f65773c.compareAndSet(null, com.xinzhu.haunted.d.f(f65772b, "START_INTENT_NOT_RESOLVED"));
            f65774d = true;
            return f65773c.get() != null;
        }
        return true;
    }

    public static int b() {
        if (a()) {
            try {
                return ((Integer) f65773c.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static boolean c(int i4) {
        if (a()) {
            try {
                f65773c.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* compiled from: HtActivityManager.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f65775b = com.xinzhu.haunted.d.b("android.app.ActivityManager$PendingIntentInfo");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f65776c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f65777d = false;

        /* renamed from: e  reason: collision with root package name */
        private static AtomicReference<Field> f65778e = new AtomicReference<>();

        /* renamed from: f  reason: collision with root package name */
        private static boolean f65779f = false;

        /* renamed from: g  reason: collision with root package name */
        private static AtomicReference<Field> f65780g = new AtomicReference<>();

        /* renamed from: h  reason: collision with root package name */
        private static boolean f65781h = false;

        /* renamed from: i  reason: collision with root package name */
        private static AtomicReference<Field> f65782i = new AtomicReference<>();

        /* renamed from: j  reason: collision with root package name */
        private static boolean f65783j = false;

        /* renamed from: k  reason: collision with root package name */
        private static AtomicReference<Constructor> f65784k = new AtomicReference<>();

        /* renamed from: l  reason: collision with root package name */
        private static boolean f65785l = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f65786a;

        public a(Object obj) {
            this.f65786a = obj;
        }

        public static boolean a(String str, int i4, boolean z4, int i5) {
            if (f65784k.get() == null) {
                if (f65785l) {
                    return false;
                }
                AtomicReference<Constructor> atomicReference = f65784k;
                Class<?> cls = f65775b;
                Class cls2 = Integer.TYPE;
                atomicReference.compareAndSet(null, com.xinzhu.haunted.d.d(cls, "HtPendingIntentInfo", String.class, cls2, Boolean.TYPE, cls2));
                f65785l = true;
                return f65784k.get() != null;
            }
            return true;
        }

        public static a f(String str, int i4, boolean z4, int i5) {
            if (a(str, i4, z4, i5)) {
                try {
                    a aVar = new a();
                    aVar.f65786a = f65784k.get().newInstance(str, Integer.valueOf(i4), Boolean.valueOf(z4), Integer.valueOf(i5));
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

        public boolean b() {
            if (f65776c.get() == null) {
                if (f65777d) {
                    return false;
                }
                f65776c.compareAndSet(null, com.xinzhu.haunted.d.f(f65775b, "mCreatorPackage"));
                f65777d = true;
                return f65776c.get() != null;
            }
            return true;
        }

        public boolean c() {
            if (f65778e.get() == null) {
                if (f65779f) {
                    return false;
                }
                f65778e.compareAndSet(null, com.xinzhu.haunted.d.f(f65775b, "mCreatorUid"));
                f65779f = true;
                return f65778e.get() != null;
            }
            return true;
        }

        public boolean d() {
            if (f65780g.get() == null) {
                if (f65781h) {
                    return false;
                }
                f65780g.compareAndSet(null, com.xinzhu.haunted.d.f(f65775b, "mImmutable"));
                f65781h = true;
                return f65780g.get() != null;
            }
            return true;
        }

        public boolean e() {
            if (f65782i.get() == null) {
                if (f65783j) {
                    return false;
                }
                f65782i.compareAndSet(null, com.xinzhu.haunted.d.f(f65775b, "mIntentSenderType"));
                f65783j = true;
                return f65782i.get() != null;
            }
            return true;
        }

        public String g() {
            if (b()) {
                try {
                    return (String) f65776c.get().get(this.f65786a);
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public int h() {
            if (c()) {
                try {
                    return ((Integer) f65778e.get().get(this.f65786a)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public boolean i() {
            if (d()) {
                try {
                    return ((Boolean) f65780g.get().get(this.f65786a)).booleanValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public int j() {
            if (e()) {
                try {
                    return ((Integer) f65782i.get().get(this.f65786a)).intValue();
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return 0;
                }
            }
            return 0;
        }

        public boolean k(String str) {
            if (b()) {
                try {
                    f65776c.get().set(this.f65786a, str);
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean l(int i4) {
            if (c()) {
                try {
                    f65778e.get().set(this.f65786a, Integer.valueOf(i4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean m(boolean z4) {
            if (d()) {
                try {
                    f65780g.get().set(this.f65786a, Boolean.valueOf(z4));
                    return true;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            return false;
        }

        public boolean n(int i4) {
            if (e()) {
                try {
                    f65782i.get().set(this.f65786a, Integer.valueOf(i4));
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
}
