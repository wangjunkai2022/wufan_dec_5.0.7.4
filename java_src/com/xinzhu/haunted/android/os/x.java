package com.xinzhu.haunted.android.os;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtUserManager.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67018b = "x";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f67019c = com.xinzhu.haunted.d.b("android.os.UserManager");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f67020d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f67021e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f67022a;

    public x(Object obj) {
        this.f67022a = obj;
    }

    public boolean a() {
        if (f67020d.get() == null) {
            if (f67021e) {
                return false;
            }
            f67020d.compareAndSet(null, com.xinzhu.haunted.d.f(f67019c, "mService"));
            f67021e = true;
            return f67020d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f67020d.get().get(this.f67022a);
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
                f67020d.get().set(this.f67022a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private x() {
    }
}
