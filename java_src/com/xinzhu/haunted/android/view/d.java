package com.xinzhu.haunted.android.view;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtWindowManagerGlobal.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67118a = "d";

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f67119b = com.xinzhu.haunted.d.b("android.view.WindowManagerGlobal");

    /* renamed from: c  reason: collision with root package name */
    private static AtomicReference<Field> f67120c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f67121d = false;

    /* renamed from: e  reason: collision with root package name */
    private static AtomicReference<Field> f67122e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f67123f = false;

    public static boolean a() {
        if (f67122e.get() == null) {
            if (f67123f) {
                return false;
            }
            f67122e.compareAndSet(null, com.xinzhu.haunted.d.f(f67119b, "ADD_PERMISSION_DENIED"));
            f67123f = true;
            return f67122e.get() != null;
        }
        return true;
    }

    public static boolean b() {
        if (f67120c.get() == null) {
            if (f67121d) {
                return false;
            }
            f67120c.compareAndSet(null, com.xinzhu.haunted.d.f(f67119b, "sWindowManagerService"));
            f67121d = true;
            return f67120c.get() != null;
        }
        return true;
    }

    public static int c() {
        if (a()) {
            try {
                return ((Integer) f67122e.get().get(null)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static IInterface d() {
        if (b()) {
            try {
                return (IInterface) f67120c.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean e(int i4) {
        if (a()) {
            try {
                f67122e.get().set(null, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean f(IInterface iInterface) {
        if (b()) {
            try {
                f67120c.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
