package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class c implements com.switfpass.pay.utils.f0 {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61554a;

    c(PaySDKCaptureActivity paySDKCaptureActivity) {
        this.f61554a = paySDKCaptureActivity;
    }

    @Override // com.switfpass.pay.utils.f0
    public final void a() {
        PaySDKCaptureActivity paySDKCaptureActivity = this.f61554a;
        PaySDKCaptureActivity.a(paySDKCaptureActivity, "交易进行中，确认是否中断交易？", paySDKCaptureActivity.U);
    }
}
