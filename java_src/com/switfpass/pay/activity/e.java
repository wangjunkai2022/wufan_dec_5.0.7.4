package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d f61560b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61561c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d dVar, Object obj) {
        this.f61560b = dVar;
        this.f61561c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PaySDKCaptureActivity paySDKCaptureActivity;
        PaySDKCaptureActivity paySDKCaptureActivity2;
        PaySDKCaptureActivity paySDKCaptureActivity3;
        paySDKCaptureActivity = this.f61560b.f61556a;
        paySDKCaptureActivity.U.dismiss();
        if (this.f61561c != null) {
            paySDKCaptureActivity3 = this.f61560b.f61556a;
            paySDKCaptureActivity3.showToastInfo(this.f61561c.toString());
        }
        com.switfpass.pay.handle.a.b(6, 8, "支付状态：未支付");
        paySDKCaptureActivity2 = this.f61560b.f61556a;
        paySDKCaptureActivity2.finish();
    }
}
