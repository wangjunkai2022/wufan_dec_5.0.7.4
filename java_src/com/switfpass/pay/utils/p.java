package com.switfpass.pay.utils;

import android.app.Activity;
import android.widget.Toast;
/* loaded from: classes5.dex */
final class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ o f61935b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61936c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(o oVar, Object obj) {
        this.f61935b = oVar;
        this.f61936c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0Var = this.f61935b.f61932a;
        activity = d0Var.f61839b;
        Toast.makeText(activity, this.f61936c.toString(), 1).show();
    }
}
