package com.switfpass.pay.utils;

import android.app.Activity;
import android.view.View;
import com.switfpass.pay.activity.PaySDKCaptureActivity;
import com.switfpass.pay.bean.RequestMsg;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61940b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(d0 d0Var) {
        this.f61940b = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RequestMsg requestMsg;
        Activity activity;
        RequestMsg requestMsg2;
        Activity activity2;
        RequestMsg requestMsg3;
        e0 e0Var = new e0();
        requestMsg = this.f61940b.f61850m;
        if (requestMsg.s() != null) {
            requestMsg2 = this.f61940b.f61850m;
            if (!"".equals(requestMsg2.s())) {
                this.f61940b.cancel();
                activity2 = this.f61940b.f61839b;
                requestMsg3 = this.f61940b.f61850m;
                PaySDKCaptureActivity.startActivity(activity2, requestMsg3);
                return;
            }
        }
        activity = this.f61940b.f61839b;
        e0Var.a(activity, "tokenid不能为空");
    }
}
