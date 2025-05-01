package com.xinzhu.haunted.android.content;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIntent.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66317b = "m";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66318c = com.xinzhu.haunted.d.a(Intent.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66319d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66320e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66321f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66322g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66323a;

    public m(Object obj) {
        this.f66323a = obj;
    }

    public boolean a(String str) {
        if (f66321f.get() == null) {
            if (f66322g) {
                return false;
            }
            f66321f.compareAndSet(null, com.xinzhu.haunted.d.g(f66318c, "getIBinderExtra", String.class));
            f66322g = true;
            return f66321f.get() != null;
        }
        return true;
    }

    public boolean b(String str, IBinder iBinder) {
        if (f66319d.get() == null) {
            if (f66320e) {
                return false;
            }
            f66319d.compareAndSet(null, com.xinzhu.haunted.d.g(f66318c, "putExtra", String.class, IBinder.class));
            f66320e = true;
            return f66319d.get() != null;
        }
        return true;
    }

    public IBinder c(String str) {
        if (a(str)) {
            try {
                return (IBinder) f66321f.get().invoke(this.f66323a, str);
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

    public void d(String str, IBinder iBinder) {
        if (b(str, iBinder)) {
            try {
                f66319d.get().invoke(this.f66323a, str, iBinder);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    private m() {
    }
}
