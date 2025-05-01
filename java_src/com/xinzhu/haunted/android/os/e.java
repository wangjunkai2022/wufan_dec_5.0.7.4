package com.xinzhu.haunted.android.os;

import android.os.Handler;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtHandler.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66830b = "e";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66831c = com.xinzhu.haunted.d.a(Handler.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66832d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66833e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66834a;

    public e(Object obj) {
        this.f66834a = obj;
    }

    public boolean a() {
        if (f66832d.get() == null) {
            if (f66833e) {
                return false;
            }
            f66832d.compareAndSet(null, com.xinzhu.haunted.d.f(f66831c, "mCallback"));
            f66833e = true;
            return f66832d.get() != null;
        }
        return true;
    }

    public Handler.Callback b() {
        if (a()) {
            try {
                return (Handler.Callback) f66832d.get().get(this.f66834a);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public boolean c(Handler.Callback callback) {
        if (a()) {
            try {
                f66832d.get().set(this.f66834a, callback);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private e() {
    }
}
