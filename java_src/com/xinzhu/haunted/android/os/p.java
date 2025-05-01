package com.xinzhu.haunted.android.os;

import android.os.Parcel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtParcel.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66904b = "p";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66905c = com.xinzhu.haunted.d.a(Parcel.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66906d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66907e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66908f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66909g = false;

    /* renamed from: h  reason: collision with root package name */
    private static AtomicReference<Method> f66910h = new AtomicReference<>();

    /* renamed from: i  reason: collision with root package name */
    private static boolean f66911i = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66912a;

    public p(Object obj) {
        this.f66912a = obj;
    }

    public boolean a() {
        if (f66908f.get() == null) {
            if (f66909g) {
                return false;
            }
            f66908f.compareAndSet(null, com.xinzhu.haunted.d.g(f66905c, "createString8Array", new Object[0]));
            f66909g = true;
            return f66908f.get() != null;
        }
        return true;
    }

    public boolean b() {
        if (f66906d.get() == null) {
            if (f66907e) {
                return false;
            }
            f66906d.compareAndSet(null, com.xinzhu.haunted.d.g(f66905c, "readString8", new Object[0]));
            f66907e = true;
            return f66906d.get() != null;
        }
        return true;
    }

    public boolean c(int i4, ClassLoader classLoader, Class cls, Class[] clsArr) {
        if (f66910h.get() == null) {
            if (f66911i) {
                return false;
            }
            f66910h.compareAndSet(null, com.xinzhu.haunted.d.g(f66905c, "readValue", Integer.TYPE, ClassLoader.class, Class.class, Class[].class));
            f66911i = true;
            return f66910h.get() != null;
        }
        return true;
    }

    public String[] d() {
        if (a()) {
            try {
                return (String[]) f66908f.get().invoke(this.f66912a, new Object[0]);
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

    public String e() {
        if (b()) {
            try {
                return (String) f66906d.get().invoke(this.f66912a, new Object[0]);
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

    public Object f(int i4, ClassLoader classLoader, Class cls, Class[] clsArr) {
        if (c(i4, classLoader, cls, clsArr)) {
            try {
                return f66910h.get().invoke(this.f66912a, Integer.valueOf(i4), classLoader, cls, clsArr);
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

    private p() {
    }
}
