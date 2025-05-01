package com.switfpass.pay.utils;

import android.view.View;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61833b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(d0 d0Var) {
        this.f61833b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestMsg requestMsg;
        d0 d0Var = this.f61833b;
        requestMsg = d0Var.f61850m;
        d0Var.q(requestMsg);
    }
}
