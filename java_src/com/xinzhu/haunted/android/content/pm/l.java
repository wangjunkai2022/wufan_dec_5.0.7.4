package com.xinzhu.haunted.android.content.pm;

import android.content.pm.ServiceInfo;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtServiceInfo.java */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66544b = "l";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66545c = com.xinzhu.haunted.d.a(ServiceInfo.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Field> f66546d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66547e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66548a;

    public l(Object obj) {
        this.f66548a = obj;
    }

    public boolean a() {
        if (f66546d.get() == null) {
            if (f66547e) {
                return false;
            }
            f66546d.compareAndSet(null, com.xinzhu.haunted.d.f(f66545c, "mForegroundServiceType"));
            f66547e = true;
            return f66546d.get() != null;
        }
        return true;
    }

    public int b() {
        if (a()) {
            try {
                return ((Integer) f66546d.get().get(this.f66548a)).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public boolean c(int i4) {
        if (a()) {
            try {
                f66546d.get().set(this.f66548a, Integer.valueOf(i4));
                return true;
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }
        return false;
    }

    private l() {
    }
}
