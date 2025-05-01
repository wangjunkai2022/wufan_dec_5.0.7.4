package com.switfpass.pay.activity;

import android.view.View;
import com.switfpass.pay.lib.Resourcemap;
/* loaded from: classes5.dex */
final class l implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ QrcodeActivity f61573b;

    l(QrcodeActivity qrcodeActivity) {
        this.f61573b = qrcodeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.switfpass.pay.utils.h.l(this.f61573b.getResources().getString(Resourcemap.getById_title_prompt()), this.f61573b.getResources().getString(Resourcemap.getById_pay_unFinished()), this.f61573b.getResources().getString(Resourcemap.getById_pay_str_btnCancel()), this.f61573b.getResources().getString(Resourcemap.getById_pay_str_btnOk()), this.f61573b, new m(this), new n()).show();
    }
}
