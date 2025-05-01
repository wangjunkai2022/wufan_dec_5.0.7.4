package com.switfpass.pay.utils;

import android.app.Activity;
import com.switfpass.pay.lib.Resourcemap;
/* loaded from: classes5.dex */
final class n0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ l0 f61929b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61930c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(l0 l0Var, Object obj) {
        this.f61929b = l0Var;
        this.f61930c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        Activity activity;
        d0 d0Var2;
        Activity activity2;
        d0 d0Var3;
        Activity activity3;
        d0Var = this.f61929b.f61918a;
        activity = d0Var.f61839b;
        d0Var2 = this.f61929b.f61918a;
        activity2 = d0Var2.f61839b;
        String string = activity2.getResources().getString(Resourcemap.getById_title_prompt());
        l lVar = new l(activity, string, this.f61930c.toString(), "确定", 0, null);
        d0Var3 = this.f61929b.f61918a;
        activity3 = d0Var3.f61839b;
        h.e(activity3, lVar);
        lVar.show();
    }
}
