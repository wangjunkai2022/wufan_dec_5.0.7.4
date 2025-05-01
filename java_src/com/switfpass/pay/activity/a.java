package com.switfpass.pay.activity;

import android.content.DialogInterface;
/* loaded from: classes5.dex */
final class a implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61550b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.switfpass.pay.utils.g0 f61551c;

    a(PaySDKCaptureActivity paySDKCaptureActivity, com.switfpass.pay.utils.g0 g0Var) {
        this.f61550b = paySDKCaptureActivity;
        this.f61551c = g0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        PaySDKCaptureActivity.a(this.f61550b, false);
        com.switfpass.pay.utils.g0 g0Var = this.f61551c;
        if (g0Var != null) {
            g0Var.dismiss();
            this.f61550b.finish();
        }
    }
}
