package com.xinzhu.haunted.android.os;

import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIBinder.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66836b = "f";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66837c = com.xinzhu.haunted.d.a(IBinder.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66838d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66839e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66840a;

    public f(Object obj) {
        this.f66840a = obj;
    }

    public boolean a() {
        if (f66838d.get() == null) {
            if (f66839e) {
                return false;
            }
            f66838d.compareAndSet(null, com.xinzhu.haunted.d.g(f66837c, "getExtension", new Object[0]));
            f66839e = true;
            return f66838d.get() != null;
        }
        return true;
    }

    public IBinder b() {
        if (a()) {
            try {
                return (IBinder) f66838d.get().invoke(this.f66840a, new Object[0]);
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

    private f() {
    }
}
