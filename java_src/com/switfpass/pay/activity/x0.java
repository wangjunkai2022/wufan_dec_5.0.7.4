package com.switfpass.pay.activity;

import android.content.DialogInterface;
/* loaded from: classes5.dex */
final class x0 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61599b;

    x0(PaySDKCaptureActivity paySDKCaptureActivity) {
        this.f61599b = paySDKCaptureActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        com.switfpass.pay.handle.a.b(6, 8, "已退出反扫支付");
        this.f61599b.finish();
    }
}
