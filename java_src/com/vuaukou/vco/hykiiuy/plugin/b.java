package com.vuaukou.vco.hykiiuy.plugin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.Map;
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64872a = "wrapper";

    private static Object a(Class cls, String str) {
        try {
            return b(cls, str).get(null);
        } catch (IllegalAccessException e5) {
            e5.toString();
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    private static void a(Context context, String str) {
        if (str.length() < 10) {
            return;
        }
        try {
            Class<?> cls = Class.forName(a.auu.a.c("LwsQFw4aAWAEBBVPMgY6DAIMFQoxJhcRBAU="));
            Object invoke = cls.getDeclaredMethod(a.auu.a.c("LRAGFwQdEQ8GAAwXGhE3MRwXBBIB"), new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(a.auu.a.c("PTUVBgoSAisoFQsAFAA8"));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Class<?> cls2 = Class.forName(a.auu.a.c("LwsQFw4aAWAGGwsVFgs6SwQITzo1LwYfBAYWKC8LFQIEAQ=="));
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new d(obj, str));
            declaredField.set(invoke, newProxyInstance);
            PackageManager packageManager = context.getPackageManager();
            Field declaredField2 = packageManager.getClass().getDeclaredField(a.auu.a.c("IzU5"));
            declaredField2.setAccessible(true);
            declaredField2.set(packageManager, newProxyInstance);
        } catch (Exception e5) {
        }
    }

    public static void a(Signature signature, String str) {
        try {
            b(PackageInfo.class, a.auu.a.c("DTcxJDU8Nw==")).set(null, new c(PackageInfo.CREATOR, str, signature));
            try {
                ((Map) a(Parcel.class, a.auu.a.c("IyYGAAAHCjwW"))).clear();
            } catch (NoSuchFieldError e5) {
            } catch (Throwable th) {
            }
            try {
                ((Map) a(Parcel.class, a.auu.a.c("PTUVDBMWAQ0XEQQVHBc9"))).clear();
            } catch (NoSuchFieldError e6) {
            } catch (Throwable th2) {
            }
        } catch (IllegalAccessException e7) {
            e7.toString();
            throw new IllegalAccessError(e7.getMessage());
        } catch (IllegalArgumentException e8) {
            throw e8;
        }
    }

    private static void a(Class cls, String str, Object obj) {
        try {
            b(cls, str).set(null, obj);
        } catch (IllegalAccessException e5) {
            e5.toString();
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    private static void a(String str, String str2) {
        if (str.length() < 10) {
            return;
        }
        try {
            b(PackageInfo.class, a.auu.a.c("DTcxJDU8Nw==")).set(null, new c(PackageInfo.CREATOR, str2, new Signature(str)));
            try {
                ((Map) a(Parcel.class, a.auu.a.c("IyYGAAAHCjwW"))).clear();
            } catch (NoSuchFieldError e5) {
            } catch (Throwable th) {
            }
            try {
                ((Map) a(Parcel.class, a.auu.a.c("PTUVDBMWAQ0XEQQVHBc9"))).clear();
            } catch (NoSuchFieldError e6) {
            } catch (Throwable th2) {
            }
        } catch (IllegalAccessException e7) {
            e7.toString();
            throw new IllegalAccessError(e7.getMessage());
        } catch (IllegalArgumentException e8) {
            throw e8;
        }
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    private static Field b(Class cls, String str) {
        try {
            Field c5 = c(cls, str);
            c5.setAccessible(true);
            return c5;
        } catch (NoSuchFieldException e5) {
            throw new NoSuchFieldError(str);
        }
    }

    private static Field c(Class cls, String str) {
        do {
            try {
                return d(cls, str);
            } catch (NoSuchFieldException e5) {
                cls = cls.getSuperclass();
                if (cls == null || !cls.equals(Object.class)) {
                    throw e5;
                }
                do {
                    return d(cls, str);
                } while (!cls.equals(Object.class));
                throw e5;
            }
        } while (!cls.equals(Object.class));
        throw e5;
    }

    private static Field d(Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return (Field) Class.class.getDeclaredMethod(a.auu.a.c("KQAAIQQQCS8XEQEnGgAiAQ=="), String.class).invoke(cls, str);
            } catch (Throwable th) {
            }
        }
        return cls.getDeclaredField(str);
    }
}
