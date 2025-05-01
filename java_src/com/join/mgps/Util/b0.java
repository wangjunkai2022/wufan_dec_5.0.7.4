package com.join.mgps.Util;

import android.content.Context;
/* compiled from: DialogUtil_.java */
/* loaded from: classes3.dex */
public final class b0 extends a0 {

    /* renamed from: m  reason: collision with root package name */
    private static b0 f27664m;

    /* renamed from: k  reason: collision with root package name */
    private Context f27665k;

    /* renamed from: l  reason: collision with root package name */
    private Object f27666l;

    private b0(Context context) {
        this.f27665k = context;
    }

    public static b0 f0(Context context) {
        if (f27664m == null) {
            a4.c c5 = a4.c.c(null);
            b0 b0Var = new b0(context.getApplicationContext());
            f27664m = b0Var;
            b0Var.g0();
            a4.c.c(c5);
        }
        return f27664m;
    }

    private void g0() {
    }

    private b0(Context context, Object obj) {
        this.f27665k = context;
        this.f27666l = obj;
    }
}
