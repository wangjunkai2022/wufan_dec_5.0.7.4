package com.switfpass.pay.utils;

import android.app.Activity;
import android.widget.Toast;
/* loaded from: classes5.dex */
final class r1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ q1 f61946b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61947c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(q1 q1Var, Object obj) {
        this.f61946b = q1Var;
        this.f61947c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0Var = this.f61946b.f61942a;
        activity = d0Var.f61839b;
        Toast.makeText(activity, this.f61947c.toString(), 1).show();
    }
}
