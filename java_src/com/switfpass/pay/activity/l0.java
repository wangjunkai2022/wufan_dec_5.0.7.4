package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class l0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ k0 f61574b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61575c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(k0 k0Var, Object obj) {
        this.f61574b = k0Var;
        this.f61575c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PaySDKCaptureActivity paySDKCaptureActivity;
        PaySDKCaptureActivity paySDKCaptureActivity2;
        if (this.f61575c != null) {
            paySDKCaptureActivity2 = this.f61574b.f61572a;
            paySDKCaptureActivity2.showToastInfo(this.f61575c.toString());
        }
        com.switfpass.pay.handle.a.b(6, 8, "支付状态：该笔订单未支付");
        paySDKCaptureActivity = this.f61574b.f61572a;
        paySDKCaptureActivity.finish();
    }
}
