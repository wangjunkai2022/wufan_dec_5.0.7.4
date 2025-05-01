package com.switfpass.pay.utils;

import android.view.View;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class z implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61977b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(d0 d0Var) {
        this.f61977b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestMsg requestMsg;
        String str;
        RequestMsg requestMsg2;
        requestMsg = this.f61977b.f61850m;
        str = d0.f61838w;
        requestMsg.P(str);
        d0 d0Var = this.f61977b;
        requestMsg2 = d0Var.f61850m;
        d0Var.F(requestMsg2);
    }
}
