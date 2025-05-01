package com.join.android.app.common.utils;

import android.content.Context;
/* compiled from: APKUtils_.java */
/* loaded from: classes3.dex */
public final class e extends APKUtils {

    /* renamed from: e  reason: collision with root package name */
    private static e f14870e;

    /* renamed from: c  reason: collision with root package name */
    private Context f14871c;

    /* renamed from: d  reason: collision with root package name */
    private Object f14872d;

    private e(Context context) {
        this.f14871c = context;
    }

    public static e l0(Context context) {
        if (f14870e == null) {
            a4.c c5 = a4.c.c(null);
            e eVar = new e(context.getApplicationContext());
            f14870e = eVar;
            eVar.m0();
            a4.c.c(c5);
        }
        return f14870e;
    }

    private void m0() {
    }

    private e(Context context, Object obj) {
        this.f14871c = context;
        this.f14872d = obj;
    }
}
