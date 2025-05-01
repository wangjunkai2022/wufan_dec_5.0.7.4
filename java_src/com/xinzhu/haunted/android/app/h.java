package com.xinzhu.haunted.android.app;

import android.app.AppOpsManager;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtAppOpsManager.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    private static final String f65932b = "h";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f65933c = com.xinzhu.haunted.d.a(AppOpsManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f65934d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f65935e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f65936a;

    public h(Object obj) {
        this.f65936a = obj;
    }

    public boolean a() {
        if (f65934d.get() == null) {
            if (f65935e) {
                return false;
            }
            f65934d.compareAndSet(null, com.xinzhu.haunted.d.f(f65933c, "mService"));
            f65935e = true;
            return f65934d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f65934d.get().get(this.f65936a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(IInterface iInterface) {
        if (a()) {
            try {
                f65934d.get().set(this.f65936a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private h() {
    }
}
