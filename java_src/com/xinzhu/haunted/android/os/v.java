package com.xinzhu.haunted.android.os;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtSystemProperties.java */
/* loaded from: classes6.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final String f66997a = "v";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f66998b = com.xinzhu.haunted.d.b("android.os.SystemProperties");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Method> f66999c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67000d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Method> f67001e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f67002f = false;

    /* renamed from: g  reason: collision with root package name */
    private static AtomicReference<Method> f67003g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private static boolean f67004h = false;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicReference<Method> f67005i = new AtomicReference<>();

    /* renamed from: j  reason: collision with root package name */
    private static boolean f67006j = false;

    /* renamed from: k  reason: collision with root package name */
    private static AtomicReference<Method> f67007k = new AtomicReference<>();

    /* renamed from: l  reason: collision with root package name */
    private static boolean f67008l = false;

    public static boolean a(String str) {
        if (f67001e.get() == null) {
            if (f67002f) {
                return false;
            }
            f67001e.compareAndSet(null, com.xinzhu.haunted.d.g(f66998b, "get", String.class));
            f67002f = true;
            return f67001e.get() != null;
        }
        return true;
    }

    public static boolean b(String str, String str2) {
        if (f66999c.get() == null) {
            if (f67000d) {
                return false;
            }
            f66999c.compareAndSet(null, com.xinzhu.haunted.d.g(f66998b, "get", String.class, String.class));
            f67000d = true;
            return f66999c.get() != null;
        }
        return true;
    }

    public static boolean c(String str, int i4) {
        if (f67003g.get() == null) {
            if (f67004h) {
                return false;
            }
            f67003g.compareAndSet(null, com.xinzhu.haunted.d.g(f66998b, "getInt", String.class, Integer.TYPE));
            f67004h = true;
            return f67003g.get() != null;
        }
        return true;
    }

    public static boolean d(String str, long j4) {
        if (f67005i.get() == null) {
            if (f67006j) {
                return false;
            }
            f67005i.compareAndSet(null, com.xinzhu.haunted.d.g(f66998b, "getLong", String.class, Long.TYPE));
            f67006j = true;
            return f67005i.get() != null;
        }
        return true;
    }

    public static boolean e(String str) {
        if (f67007k.get() == null) {
            if (f67008l) {
                return false;
            }
            f67007k.compareAndSet(null, com.xinzhu.haunted.d.g(f66998b, "isExist", String.class));
            f67008l = true;
            return f67007k.get() != null;
        }
        return true;
    }

    public static String f(String str) {
        if (a(str)) {
            try {
                return (String) f67001e.get().invoke(null, str);
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

    public static String g(String str, String str2) {
        if (b(str, str2)) {
            try {
                return (String) f66999c.get().invoke(null, str, str2);
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

    public static int h(String str, int i4) {
        if (c(str, i4)) {
            try {
                return ((Integer) f67003g.get().invoke(null, str, Integer.valueOf(i4))).intValue();
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

    public static long i(String str, long j4) {
        if (d(str, j4)) {
            try {
                return ((Long) f67005i.get().invoke(null, str, Long.valueOf(j4))).longValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0L;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public static boolean j(String str) {
        if (e(str)) {
            try {
                return ((Boolean) f67007k.get().invoke(null, str)).booleanValue();
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
}
