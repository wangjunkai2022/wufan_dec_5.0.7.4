package com.switfpass.pay.utils;

import android.app.Activity;
import com.switfpass.pay.lib.Resourcemap;
/* loaded from: classes5.dex */
final class x1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ w1 f61970b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61971c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(w1 w1Var, Object obj) {
        this.f61970b = w1Var;
        this.f61971c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0 d0Var2;
        Activity activity2;
        d0 d0Var3;
        Activity activity3;
        d0Var = this.f61970b.f61967a;
        activity = d0Var.f61839b;
        d0Var2 = this.f61970b.f61967a;
        activity2 = d0Var2.f61839b;
        String string = activity2.getResources().getString(Resourcemap.getById_title_prompt());
        l lVar = new l(activity, string, this.f61971c.toString(), "确定", 0, null);
        d0Var3 = this.f61970b.f61967a;
        activity3 = d0Var3.f61839b;
        h.e(activity3, lVar);
        lVar.show();
    }
}
