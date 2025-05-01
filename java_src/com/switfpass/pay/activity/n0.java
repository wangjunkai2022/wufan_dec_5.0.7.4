package com.switfpass.pay.activity;

import android.content.DialogInterface;
/* loaded from: classes5.dex */
final class n0 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ m0 f61578b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(m0 m0Var) {
        this.f61578b = m0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        PaySDKCaptureActivity paySDKCaptureActivity;
        PaySDKCaptureActivity paySDKCaptureActivity2;
        PaySDKCaptureActivity paySDKCaptureActivity3;
        PaySDKCaptureActivity paySDKCaptureActivity4;
        paySDKCaptureActivity = this.f61578b.f61577a;
        paySDKCaptureActivity2 = this.f61578b.f61577a;
        paySDKCaptureActivity.payReverse(PaySDKCaptureActivity.d(paySDKCaptureActivity2));
        paySDKCaptureActivity3 = this.f61578b.f61577a;
        if (paySDKCaptureActivity3.af != null) {
            paySDKCaptureActivity4 = this.f61578b.f61577a;
            paySDKCaptureActivity4.af.dismiss();
        }
    }
}
