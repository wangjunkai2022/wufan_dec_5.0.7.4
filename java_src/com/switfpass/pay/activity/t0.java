package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61593b;

    t0(PaySDKCaptureActivity paySDKCaptureActivity) {
        this.f61593b = paySDKCaptureActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (PaySDKCaptureActivity.a(this.f61593b) <= 0 || PaySDKCaptureActivity.b(this.f61593b) == null) {
            PaySDKCaptureActivity.c(this.f61593b).removeCallbacks(this);
            if (PaySDKCaptureActivity.b(this.f61593b) != null && PaySDKCaptureActivity.b(this.f61593b).isShowing()) {
                PaySDKCaptureActivity.b(this.f61593b).dismiss();
            }
            PaySDKCaptureActivity paySDKCaptureActivity = this.f61593b;
            PaySDKCaptureActivity.a(paySDKCaptureActivity, PaySDKCaptureActivity.d(paySDKCaptureActivity), "支付确认中，请稍候...", false);
            return;
        }
        com.switfpass.pay.utils.l b5 = PaySDKCaptureActivity.b(this.f61593b);
        StringBuilder sb = new StringBuilder("订单状态确认中，共3次;每隔5秒查询，(");
        sb.append(PaySDKCaptureActivity.a(this.f61593b));
        sb.append("秒后)开始(第");
        sb.append(this.f61593b.count - 1);
        sb.append("次查询)，请勿中断该操作，请耐心等待查询结果");
        b5.i(sb.toString());
        PaySDKCaptureActivity paySDKCaptureActivity2 = this.f61593b;
        PaySDKCaptureActivity.a(paySDKCaptureActivity2, PaySDKCaptureActivity.a(paySDKCaptureActivity2) - 1);
        PaySDKCaptureActivity.c(this.f61593b).postDelayed(this, 1000L);
    }
}
