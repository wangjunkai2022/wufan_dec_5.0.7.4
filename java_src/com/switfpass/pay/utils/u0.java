package com.switfpass.pay.utils;

import android.app.Activity;
import android.widget.Toast;
/* loaded from: classes5.dex */
final class u0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ t0 f61957b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61958c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(t0 t0Var, Object obj) {
        this.f61957b = t0Var;
        this.f61958c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0Var = this.f61957b.f61952a;
        activity = d0Var.f61839b;
        Toast.makeText(activity, this.f61958c.toString(), 1).show();
    }
}
