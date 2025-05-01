package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class m0 implements com.switfpass.pay.utils.i {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ PaySDKCaptureActivity f61577a;

    m0(PaySDKCaptureActivity paySDKCaptureActivity) {
        this.f61577a = paySDKCaptureActivity;
    }

    @Override // com.switfpass.pay.utils.i
    public final void a(String str) {
        com.switfpass.pay.utils.h.h("温馨提示", "确定是否冲正？", com.join.android.app.mgsim.wufun.R.drawable.abc_ic_arrow_drop_right_black_24dp, com.join.android.app.mgsim.wufun.R.drawable.abc_ic_clear_material, this.f61577a, new n0(this)).show();
    }

    @Override // com.switfpass.pay.utils.i
    public final void cancel() {
        PaySDKCaptureActivity paySDKCaptureActivity = this.f61577a;
        PaySDKCaptureActivity.a(paySDKCaptureActivity, PaySDKCaptureActivity.d(paySDKCaptureActivity), "支付确认中，请稍候...", true);
    }
}
