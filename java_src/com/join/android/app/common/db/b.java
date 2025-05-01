package com.join.android.app.common.db;

import android.content.Context;
/* compiled from: DBUpdateUtils_.java */
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    private static b f14527c;

    /* renamed from: a  reason: collision with root package name */
    private Context f14528a;

    /* renamed from: b  reason: collision with root package name */
    private Object f14529b;

    private b(Context context) {
        this.f14528a = context;
    }

    public static b b(Context context) {
        if (f14527c == null) {
            a4.c c5 = a4.c.c(null);
            b bVar = new b(context.getApplicationContext());
            f14527c = bVar;
            bVar.c();
            a4.c.c(c5);
        }
        return f14527c;
    }

    private void c() {
    }

    private b(Context context, Object obj) {
        this.f14528a = context;
        this.f14529b = obj;
    }
}
