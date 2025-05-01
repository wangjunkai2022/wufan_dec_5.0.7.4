package com.xinzhu.haunted.android.os;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtRemoteCallback.java */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66917b = "r";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66918c = com.xinzhu.haunted.d.b("android.os.RemoteCallback");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66919d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66920e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66921a;

    public r(Object obj) {
        this.f66921a = obj;
    }

    public boolean a(Bundle bundle) {
        if (f66919d.get() == null) {
            if (f66920e) {
                return false;
            }
            f66919d.compareAndSet(null, com.xinzhu.haunted.d.g(f66918c, "sendResult", Bundle.class));
            f66920e = true;
            return f66919d.get() != null;
        }
        return true;
    }

    public void b(Bundle bundle) {
        if (a(bundle)) {
            try {
                f66919d.get().invoke(this.f66921a, bundle);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    private r() {
    }
}
