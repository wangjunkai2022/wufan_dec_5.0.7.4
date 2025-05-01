package com.xinzhu.haunted.android.content;

import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtContentProviderHolder.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66242b = "f";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66243c = com.xinzhu.haunted.d.b("android.app.ContentProviderHolder");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66244d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66245e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66246a;

    public f(Object obj) {
        this.f66246a = obj;
    }

    public boolean a() {
        if (f66244d.get() == null) {
            if (f66245e) {
                return false;
            }
            f66244d.compareAndSet(null, com.xinzhu.haunted.d.f(f66243c, com.umeng.analytics.pro.f.M));
            f66245e = true;
            return f66244d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f66244d.get().get(this.f66246a);
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
                f66244d.get().set(this.f66246a, iInterface);
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private f() {
    }
}
