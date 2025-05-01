package com.switfpass.pay.utils;

import android.view.View;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class v implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61961b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(d0 d0Var) {
        this.f61961b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestMsg requestMsg;
        d0 d0Var = this.f61961b;
        requestMsg = d0Var.f61850m;
        d0.h(d0Var, requestMsg);
    }
}
