package com.xinzhu.haunted.android.content;

import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: HtIIntentReceiver.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final String f66299b = "k";

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f66300c = com.xinzhu.haunted.d.b("android.content.IIntentReceiver");

    /* renamed from: d  reason: collision with root package name */
    private static AtomicReference<Method> f66301d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f66302e = false;

    /* renamed from: a  reason: collision with root package name */
    public Object f66303a;

    public k(Object obj) {
        this.f66303a = obj;
    }

    public boolean a(Intent intent, int i4, String str, Bundle bundle, boolean z4, boolean z5, int i5) {
        if (f66301d.get() == null) {
            if (f66302e) {
                return false;
            }
            AtomicReference<Method> atomicReference = f66301d;
            Class<?> cls = f66300c;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            atomicReference.compareAndSet(null, com.xinzhu.haunted.d.g(cls, "performReceive", Intent.class, cls2, String.class, Bundle.class, cls3, cls3, cls2));
            f66302e = true;
            return f66301d.get() != null;
        }
        return true;
    }

    public void b(Intent intent, int i4, String str, Bundle bundle, boolean z4, boolean z5, int i5) {
        if (a(intent, i4, str, bundle, z4, z5, i5)) {
            try {
                f66301d.get().invoke(this.f66303a, intent, Integer.valueOf(i4), str, bundle, Boolean.valueOf(z4), Boolean.valueOf(z5), Integer.valueOf(i5));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    private k() {
    }
}
