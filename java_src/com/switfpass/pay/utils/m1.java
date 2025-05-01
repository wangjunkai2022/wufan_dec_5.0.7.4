package com.switfpass.pay.utils;

import android.app.Activity;
import android.widget.Toast;
/* loaded from: classes5.dex */
final class m1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ l1 f61925b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61926c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(l1 l1Var, Object obj) {
        this.f61925b = l1Var;
        this.f61926c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0Var = this.f61925b.f61919a;
        activity = d0Var.f61839b;
        Toast.makeText(activity, this.f61926c.toString(), 1).show();
    }
}
