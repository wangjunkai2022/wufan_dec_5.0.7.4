package com.join.mgps.Util;

import android.content.Context;
/* compiled from: ForumUtil_.java */
/* loaded from: classes3.dex */
public final class k0 extends j0 {

    /* renamed from: p  reason: collision with root package name */
    private static k0 f27902p;

    /* renamed from: n  reason: collision with root package name */
    private Context f27903n;

    /* renamed from: o  reason: collision with root package name */
    private Object f27904o;

    private k0(Context context) {
        this.f27903n = context;
    }

    public static k0 I1(Context context) {
        if (f27902p == null) {
            a4.c c5 = a4.c.c(null);
            k0 k0Var = new k0(context.getApplicationContext());
            f27902p = k0Var;
            k0Var.J1();
            a4.c.c(c5);
        }
        return f27902p;
    }

    private void J1() {
    }

    private k0(Context context, Object obj) {
        this.f27903n = context;
        this.f27904o = obj;
    }
}
