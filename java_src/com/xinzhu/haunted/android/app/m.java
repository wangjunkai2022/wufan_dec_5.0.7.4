package com.xinzhu.haunted.android.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIActivityManager.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66012b = "m";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66013c = com.xinzhu.haunted.d.b("android.app.IActivityManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66014d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66015e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66016f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66017g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66018h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66019i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66020j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66021k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66022l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66023m = false;

    /* renamed from: n  reason: collision with root package name */
    private static AtomicReference<Method> f66024n = new AtomicReference<>();

    /* renamed from: o  reason: collision with root package name */
    private static boolean f66025o = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66026a;

    /* compiled from: HtIActivityManager.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static Class<?> f66031a = com.xinzhu.haunted.d.b("android.app.IActivityManager$Stub");

        /* renamed from: b  reason: collision with root package name */
        private static AtomicReference<Method> f66032b = new AtomicReference<>();

        /* renamed from: c  reason: collision with root package name */
        private static boolean f66033c = false;

        public static IInterface a(IBinder iBinder) {
            if (b(iBinder)) {
                try {
                    return (IInterface) f66032b.get().invoke(null, iBinder);
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

        public static boolean b(IBinder iBinder) {
            if (f66032b.get() == null) {
                if (f66033c) {
                    return false;
                }
                f66032b.compareAndSet(null, com.xinzhu.haunted.d.g(f66031a, "asInterface", IBinder.class));
                f66033c = true;
                return f66032b.get() != null;
            }
            return true;
        }
    }

    public m(Object obj) {
        this.f66026a = obj;
    }

    public boolean a(IBinder iBinder, int i4, Intent intent, int i5) {
        if (f66014d.get() == null) {
            if (f66015e) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66014d;
            Class<?> cls = f66013c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "finishActivity", IBinder.class, cls2, Intent.class, cls2));
            f66015e = true;
            return f66014d.get() != null;
        }
        return true;
    }

    public boolean b(IBinder iBinder, int i4, Intent intent, boolean z4) {
        if (f66016f.get() == null) {
            if (f66017g) {
                return false;
            }
            f66016f.compareAndSet(null, com.xinzhu.haunted.d.g(f66013c, "finishActivity", IBinder.class, Integer.TYPE, Intent.class, Boolean.TYPE));
            f66017g = true;
            return f66016f.get() != null;
        }
        return true;
    }

    public boolean c(IBinder iBinder) {
        if (f66022l.get() == null) {
            if (f66023m) {
                return false;
            }
            f66022l.compareAndSet(null, com.xinzhu.haunted.d.g(f66013c, "getLaunchedFromPackage", IBinder.class));
            f66023m = true;
            return f66022l.get() != null;
        }
        return true;
    }

    public boolean d(IBinder iBinder) {
        if (f66020j.get() == null) {
            if (f66021k) {
                return false;
            }
            f66020j.compareAndSet(null, com.xinzhu.haunted.d.g(f66013c, "getLaunchedFromUid", IBinder.class));
            f66021k = true;
            return f66020j.get() != null;
        }
        return true;
    }

    public boolean e(IBinder iBinder, boolean z4) {
        if (f66018h.get() == null) {
            if (f66019i) {
                return false;
            }
            f66018h.compareAndSet(null, com.xinzhu.haunted.d.g(f66013c, "getTaskForActivity", IBinder.class, Boolean.TYPE));
            f66019i = true;
            return f66018h.get() != null;
        }
        return true;
    }

    public boolean f(Object obj, String str, Intent intent, String str2, IBinder iBinder, String str3, int i4, int i5, Object obj2, Bundle bundle) {
        if (f66024n.get() == null) {
            if (f66025o) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66024n;
            Class<?> cls = f66013c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "startActivity", "android.app.IApplicationThread", String.class, Intent.class, String.class, IBinder.class, String.class, cls2, cls2, "android.app.ProfilerInfo", Bundle.class));
            f66025o = true;
            return f66024n.get() != null;
        }
        return true;
    }

    public boolean g(IBinder iBinder, int i4, Intent intent, int i5) {
        if (a(iBinder, i4, intent, i5)) {
            try {
                return ((Boolean) f66014d.get().invoke(this.f66026a, iBinder, Integer.valueOf(i4), intent, Integer.valueOf(i5))).booleanValue();
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

    public boolean h(IBinder iBinder, int i4, Intent intent, boolean z4) {
        if (b(iBinder, i4, intent, z4)) {
            try {
                return ((Boolean) f66016f.get().invoke(this.f66026a, iBinder, Integer.valueOf(i4), intent, Boolean.valueOf(z4))).booleanValue();
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

    public String i(IBinder iBinder) {
        if (c(iBinder)) {
            try {
                return (String) f66022l.get().invoke(this.f66026a, iBinder);
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

    public int j(IBinder iBinder) {
        if (d(iBinder)) {
            try {
                return ((Integer) f66020j.get().invoke(this.f66026a, iBinder)).intValue();
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

    public int k(IBinder iBinder, boolean z4) {
        if (e(iBinder, z4)) {
            try {
                return ((Integer) f66018h.get().invoke(this.f66026a, iBinder, Boolean.valueOf(z4))).intValue();
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

    public int startActivity(Object obj, String str, Intent intent, String str2, IBinder iBinder, String str3, int i4, int i5, Object obj2, Bundle bundle) {
        if (f(obj, str, intent, str2, iBinder, str3, i4, i5, obj2, bundle)) {
            try {
                return ((Integer) f66024n.get().invoke(this.f66026a, obj, str, intent, str2, iBinder, str3, Integer.valueOf(i4), Integer.valueOf(i5), obj2, bundle)).intValue();
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

    /* compiled from: HtIActivityManager.java */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static Class<?> f66027b = com.xinzhu.haunted.d.b("android.app.IActivityManager$ContentProviderHolder");

        /* renamed from: c  reason: collision with root package name */
        private static AtomicReference<Field> f66028c = new AtomicReference<>();

        /* renamed from: d  reason: collision with root package name */
        private static boolean f66029d = false;

        /* renamed from: a  reason: collision with root package name */
        public Object f66030a;

        public a(Object obj) {
            this.f66030a = obj;
        }

        public boolean a() {
            if (f66028c.get() == null) {
                if (f66029d) {
                    return false;
                }
                f66028c.compareAndSet(null, com.xinzhu.haunted.d.f(f66027b, com.umeng.analytics.pro.f.M));
                f66029d = true;
                return f66028c.get() != null;
            }
            return true;
        }

        public IInterface b() {
            if (a()) {
                try {
                    return (IInterface) f66028c.get().get(this.f66030a);
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
                    f66028c.get().set(this.f66030a, iInterface);
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

    private m() {
    }
}
