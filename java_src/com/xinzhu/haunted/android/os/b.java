package com.xinzhu.haunted.android.os;

import android.os.DropBoxManager;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtDropBoxManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66799b = "b";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66800c = com.xinzhu.haunted.d.a(DropBoxManager.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66801d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66802e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66803a;

    public b(Object obj) {
        this.f66803a = obj;
    }

    public boolean a() {
        if (f66801d.get() == null) {
            if (f66802e) {
                return false;
            }
            f66801d.compareAndSet(null, com.xinzhu.haunted.d.f(f66800c, "mService"));
            f66802e = true;
            return f66801d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f66801d.get().get(this.f66803a);
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
                f66801d.get().set(this.f66803a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private b() {
    }
}
