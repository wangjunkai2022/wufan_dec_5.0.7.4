package com.xinzhu.haunted.android.content;

import android.content.ContentProviderClient;
import android.os.IInterface;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtContentProviderClient.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66236b = "e";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66237c = com.xinzhu.haunted.d.a(ContentProviderClient.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66238d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66239e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66240a;

    public e(Object obj) {
        this.f66240a = obj;
    }

    public boolean a() {
        if (f66238d.get() == null) {
            if (f66239e) {
                return false;
            }
            f66238d.compareAndSet(null, com.xinzhu.haunted.d.f(f66237c, "mContentProvider"));
            f66239e = true;
            return f66238d.get() != null;
        }
        return true;
    }

    public IInterface b() {
        if (a()) {
            try {
                return (IInterface) f66238d.get().get(this.f66240a);
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
                f66238d.get().set(this.f66240a, iInterface);
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
