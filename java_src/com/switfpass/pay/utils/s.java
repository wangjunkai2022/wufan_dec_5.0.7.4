package com.switfpass.pay.utils;

import android.view.View;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61948b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(d0 d0Var) {
        this.f61948b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestMsg requestMsg;
        d0 d0Var = this.f61948b;
        requestMsg = d0Var.f61850m;
        d0Var.B(requestMsg);
    }
}
