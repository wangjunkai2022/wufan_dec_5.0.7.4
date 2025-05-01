package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class o0 implements com.switfpass.pay.utils.f0 {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61580a;

    o0(PaySDKCaptureActivity paySDKCaptureActivity) {
        this.f61580a = paySDKCaptureActivity;
    }

    @Override // com.switfpass.pay.utils.f0
    public final void a() {
        PaySDKCaptureActivity paySDKCaptureActivity = this.f61580a;
        PaySDKCaptureActivity.a(paySDKCaptureActivity, "交易进行中，确认是否中断交易？", paySDKCaptureActivity.V);
    }
}
