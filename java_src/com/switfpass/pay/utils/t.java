package com.switfpass.pay.utils;

import android.view.View;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class t implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61951b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(d0 d0Var) {
        this.f61951b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestMsg requestMsg;
        d0 d0Var = this.f61951b;
        requestMsg = d0Var.f61850m;
        d0Var.p(requestMsg);
    }
}
