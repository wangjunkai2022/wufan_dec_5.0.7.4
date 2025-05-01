package com.switfpass.pay.utils;

import android.app.Activity;
import android.widget.Toast;
/* loaded from: classes5.dex */
final class x0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ w0 f61968b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61969c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(w0 w0Var, Object obj) {
        this.f61968b = w0Var;
        this.f61969c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0Var = this.f61968b.f61965a;
        activity = d0Var.f61839b;
        Toast.makeText(activity, this.f61969c.toString(), 1).show();
    }
}
