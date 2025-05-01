package com.umeng.commonsdk.internal;

import android.content.Context;
/* compiled from: UMInternalData.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f64256b;

    /* renamed from: a  reason: collision with root package name */
    private Context f64257a;

    /* renamed from: c  reason: collision with root package name */
    private c f64258c;

    private b(Context context) {
        this.f64257a = context;
        this.f64258c = new c(context);
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f64256b == null) {
                f64256b = new b(context.getApplicationContext());
            }
            bVar = f64256b;
        }
        return bVar;
    }

    public c a() {
        return this.f64258c;
    }
}
