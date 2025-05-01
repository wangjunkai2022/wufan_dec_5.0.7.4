package com.switfpass.pay.activity;

import android.content.DialogInterface;
/* loaded from: classes5.dex */
final class v0 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ u0 f61597b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(u0 u0Var) {
        this.f61597b = u0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        PaySDKCaptureActivity paySDKCaptureActivity;
        com.switfpass.pay.handle.a.b(6, 8, "已退出反扫支付");
        paySDKCaptureActivity = this.f61597b.f61595b;
        paySDKCaptureActivity.finish();
    }
}
