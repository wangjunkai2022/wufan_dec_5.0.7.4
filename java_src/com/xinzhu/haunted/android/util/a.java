package com.xinzhu.haunted.android.util;

import android.util.AtomicFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAtomicFile.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67078b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67079c = com.xinzhu.haunted.d.a(AtomicFile.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f67080d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67081e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Constructor> f67082f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f67083g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67084a;

    public a(Object obj) {
        this.f67084a = obj;
    }

    public static boolean a(File file, String str) {
        if (f67082f.get() == null) {
            if (f67083g) {
                return false;
            }
            f67082f.compareAndSet(null, com.xinzhu.haunted.d.d(f67079c, "HtAtomicFile", File.class, String.class));
            f67083g = true;
            return f67082f.get() != null;
        }
        return true;
    }

    public static a c(File file, String str) {
        if (a(file, str)) {
            try {
                a aVar = new a();
                aVar.f67084a = f67082f.get().newInstance(file, str);
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
        if (f67080d.get() == null) {
            if (f67081e) {
                return false;
            }
            f67080d.compareAndSet(null, com.xinzhu.haunted.d.g(f67079c, "exists", new Object[0]));
            f67081e = true;
            return f67080d.get() != null;
        }
        return true;
    }

    public boolean d() {
        if (b()) {
            try {
                return ((Boolean) f67080d.get().invoke(this.f67084a, new Object[0])).booleanValue();
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

    private a() {
    }
}
