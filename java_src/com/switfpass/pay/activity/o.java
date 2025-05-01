package com.switfpass.pay.activity;

import android.view.View;
/* loaded from: classes5.dex */
final class o implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ QrcodeActivity f61579b;

    o(QrcodeActivity qrcodeActivity) {
        this.f61579b = qrcodeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        QrcodeActivity qrcodeActivity = this.f61579b;
        QrcodeActivity.a(qrcodeActivity, QrcodeActivity.f(qrcodeActivity).a(QrcodeActivity.e(this.f61579b).r(), QrcodeActivity.g(this.f61579b).getWidth()));
        QrcodeActivity.h(this.f61579b).showAsDropDown(QrcodeActivity.g(this.f61579b));
    }
}
