package com.beizi.fusion.e.a;

import android.content.Context;
import java.lang.reflect.Method;
/* compiled from: XiaomiDeviceIDHelper.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private Context f6802a;

    /* renamed from: b  reason: collision with root package name */
    private Class f6803b;

    /* renamed from: c  reason: collision with root package name */
    private Object f6804c;

    /* renamed from: d  reason: collision with root package name */
    private Method f6805d;

    public k(Context context) {
        this.f6802a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.f6803b = cls;
            this.f6804c = cls.newInstance();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            this.f6805d = this.f6803b.getMethod("getOAID", Context.class);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private String a(Context context, Method method) {
        Object obj = this.f6804c;
        if (obj != null && method != null) {
            try {
                return (String) method.invoke(obj, context);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    public String a() {
        return a(this.f6802a, this.f6805d);
    }
}
