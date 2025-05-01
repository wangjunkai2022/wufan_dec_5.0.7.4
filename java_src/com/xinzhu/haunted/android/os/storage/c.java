package com.xinzhu.haunted.android.os.storage;

import android.os.IInterface;
import android.os.storage.StorageVolume;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtStorageManager.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66953b = "c";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66954c = com.xinzhu.haunted.d.b("android.os.storage.StorageManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66955d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66956e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66957f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66958g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66959h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66960i = false;

    /* renamed from: j  reason: collision with root package name */
    private static AtomicReference<Method> f66961j = new AtomicReference<>();

    /* renamed from: k  reason: collision with root package name */
    private static boolean f66962k = false;

    /* renamed from: l  reason: collision with root package name */
    private static AtomicReference<Method> f66963l = new AtomicReference<>();

    /* renamed from: m  reason: collision with root package name */
    private static boolean f66964m = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66965a;

    public c(Object obj) {
        this.f66965a = obj;
    }

    public static boolean b() {
        if (f66955d.get() == null) {
            if (f66956e) {
                return false;
            }
            f66955d.compareAndSet(null, com.xinzhu.haunted.d.f(f66954c, "sStorageManager"));
            f66956e = true;
            return f66955d.get() != null;
        }
        return true;
    }

    public static boolean c(String str) {
        if (f66961j.get() == null) {
            if (f66962k) {
                return false;
            }
            f66961j.compareAndSet(null, com.xinzhu.haunted.d.g(f66954c, "convert", String.class));
            f66962k = true;
            return f66961j.get() != null;
        }
        return true;
    }

    public static boolean d(UUID uuid) {
        if (f66963l.get() == null) {
            if (f66964m) {
                return false;
            }
            f66963l.compareAndSet(null, com.xinzhu.haunted.d.g(f66954c, "convert", UUID.class));
            f66964m = true;
            return f66963l.get() != null;
        }
        return true;
    }

    public static boolean e(int i4, int i5) {
        if (f66959h.get() == null) {
            if (f66960i) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66959h;
            Class<?> cls = f66954c;
            Class cls2 = Integer.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "getVolumeList", cls2, cls2));
            f66960i = true;
            return f66959h.get() != null;
        }
        return true;
    }

    public static String f(UUID uuid) {
        if (d(uuid)) {
            try {
                return (String) f66963l.get().invoke(null, uuid);
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

    public static UUID g(String str) {
        if (c(str)) {
            try {
                return (UUID) f66961j.get().invoke(null, str);
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

    public static StorageVolume[] h(int i4, int i5) {
        if (e(i4, i5)) {
            try {
                return (StorageVolume[]) f66959h.get().invoke(null, Integer.valueOf(i4), Integer.valueOf(i5));
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

    public static IInterface j() {
        if (b()) {
            try {
                return (IInterface) f66955d.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean l(IInterface iInterface) {
        if (b()) {
            try {
                f66955d.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        if (f66957f.get() == null) {
            if (f66958g) {
                return false;
            }
            f66957f.compareAndSet(null, com.xinzhu.haunted.d.f(f66954c, "mStorageManager"));
            f66958g = true;
            return f66957f.get() != null;
        }
        return true;
    }

    public IInterface i() {
        if (a()) {
            try {
                return (IInterface) f66957f.get().get(this.f66965a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean k(IInterface iInterface) {
        if (a()) {
            try {
                f66957f.get().set(this.f66965a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private c() {
    }
}
