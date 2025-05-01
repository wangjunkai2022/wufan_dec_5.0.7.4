package com.switfpass.pay.utils;

import android.app.Activity;
import android.widget.Toast;
/* loaded from: classes5.dex */
final class z1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ y1 f61979b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61980c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(y1 y1Var, Object obj) {
        this.f61979b = y1Var;
        this.f61980c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0Var = this.f61979b.f61975a;
        activity = d0Var.f61839b;
        Toast.makeText(activity, this.f61980c.toString(), 1).show();
    }
}
