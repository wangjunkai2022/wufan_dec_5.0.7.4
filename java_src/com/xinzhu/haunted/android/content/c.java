package com.xinzhu.haunted.android.content;

import android.content.BroadcastReceiver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtBroadcastReceiver.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66222b = "c";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66223c = com.xinzhu.haunted.d.a(BroadcastReceiver.class);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66224d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66225e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66226a;

    public c(Object obj) {
        this.f66226a = obj;
    }

    public boolean a() {
        if (f66224d.get() == null) {
            if (f66225e) {
                return false;
            }
            f66224d.compareAndSet(null, com.xinzhu.haunted.d.g(f66223c, "getSendingUserId", new Object[0]));
            f66225e = true;
            return f66224d.get() != null;
        }
        return true;
    }

    public int b() {
        if (a()) {
            try {
                return ((Integer) f66224d.get().invoke(this.f66226a, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return 0;
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    private c() {
    }
}
