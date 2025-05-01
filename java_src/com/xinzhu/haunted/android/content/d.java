package com.xinzhu.haunted.android.content;

import android.content.ClipboardManager;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtClipboardManager.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66228b = "d";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66229c = com.xinzhu.haunted.d.a(ClipboardManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66230d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66231e = false;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicReference<Field> f66232f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private static boolean f66233g = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66234a;

    public d(Object obj) {
        this.f66234a = obj;
    }

    public static boolean b() {
        if (f66232f.get() == null) {
            if (f66233g) {
                return false;
            }
            f66232f.compareAndSet(null, com.xinzhu.haunted.d.f(f66229c, "sService"));
            f66233g = true;
            return f66232f.get() != null;
        }
        return true;
    }

    public static IInterface d() {
        if (b()) {
            try {
                return (IInterface) f66232f.get().get(null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public static boolean f(IInterface iInterface) {
        if (b()) {
            try {
                f66232f.get().set(null, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        if (f66230d.get() == null) {
            if (f66231e) {
                return false;
            }
            f66230d.compareAndSet(null, com.xinzhu.haunted.d.f(f66229c, "mService"));
            f66231e = true;
            return f66230d.get() != null;
        }
        return true;
    }

    public IInterface c() {
        if (a()) {
            try {
                return (IInterface) f66230d.get().get(this.f66234a);
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
                f66230d.get().set(this.f66234a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private d() {
    }
}
