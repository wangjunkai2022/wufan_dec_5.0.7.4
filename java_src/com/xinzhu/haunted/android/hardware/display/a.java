package com.xinzhu.haunted.android.hardware.display;

import android.os.IInterface;
import com.xinzhu.haunted.d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtDisplayManagerGlobal.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66710b = "a";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66711c = d.b("android.hardware.display.DisplayManagerGlobal");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66712d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66713e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Method> f66714f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66715g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66716a;

    public a(Object obj) {
        this.f66716a = obj;
    }

    public static boolean b() {
        if (f66714f.get() == null) {
            if (f66715g) {
                return false;
            }
            f66714f.compareAndSet(null, d.g(f66711c, "getInstance", new Object[0]));
            f66715g = true;
            return f66714f.get() != null;
        }
        return true;
    }

    public static Object c() {
        if (b()) {
            try {
                return f66714f.get().invoke(null, new Object[0]);
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

    public boolean a() {
        if (f66712d.get() == null) {
            if (f66713e) {
                return false;
            }
            f66712d.compareAndSet(null, d.f(f66711c, "mDm"));
            f66713e = true;
            return f66712d.get() != null;
        }
        return true;
    }

    public IInterface d() {
        if (a()) {
            try {
                return (IInterface) f66712d.get().get(this.f66716a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean e(IInterface iInterface) {
        if (a()) {
            try {
                f66712d.get().set(this.f66716a, iInterface);
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
