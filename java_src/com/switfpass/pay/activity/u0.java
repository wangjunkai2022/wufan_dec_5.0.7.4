package com.switfpass.pay.activity;

import android.view.View;
import com.switfpass.pay.lib.Resourcemap;
/* loaded from: classes5.dex */
final class u0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61595b;

    u0(PaySDKCaptureActivity paySDKCaptureActivity) {
        this.f61595b = paySDKCaptureActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.switfpass.pay.utils.h.l(this.f61595b.getResources().getString(Resourcemap.getById_title_prompt()), this.f61595b.getResources().getString(Resourcemap.getById_pay_unFinished()), this.f61595b.getResources().getString(Resourcemap.getById_pay_str_btnCancel()), this.f61595b.getResources().getString(Resourcemap.getById_pay_str_btnOk()), this.f61595b, new v0(this), new w0()).show();
    }
}
