package com.vuaukou.vco.hykiiuy.plugin;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes8.dex */
public class InstrumentationProxy extends Instrumentation {

    /* renamed from: a  reason: collision with root package name */
    public static final String f64866a = "InstrumentationProxy";

    /* renamed from: b  reason: collision with root package name */
    public static final String f64867b = "execStartActivity";

    /* renamed from: d  reason: collision with root package name */
    public static final String f64868d = "android.app.ActivityThread";

    /* renamed from: e  reason: collision with root package name */
    public static final String f64869e = "currentActivityThread";

    /* renamed from: f  reason: collision with root package name */
    public static final String f64870f = "mInstrumentation";

    /* renamed from: c  reason: collision with root package name */
    public Instrumentation f64871c;

    public InstrumentationProxy(Instrumentation instrumentation) {
        this.f64871c = instrumentation;
    }

    public static void hook() {
        try {
            Class<?> cls = Class.forName(a.auu.a.c("LwsQFw4aAWAEBBVPMgY6DAIMFQoxJhcRBAU="));
            Method declaredMethod = cls.getDeclaredMethod(a.auu.a.c("LRAGFwQdEQ8GAAwXGhE3MRwXBBIB"), new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(a.auu.a.c("IywaFhUBECMAGhEABwwhCw=="));
            declaredField.setAccessible(true);
            declaredField.set(invoke, new InstrumentationProxy((Instrumentation) declaredField.get(invoke)));
        } catch (Exception e5) {
            e5.toString();
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        this.f64871c.callActivityOnCreate(activity, bundle);
        if (activity != null) {
            activity.getWindow().addFlags(8192);
        }
    }
}
