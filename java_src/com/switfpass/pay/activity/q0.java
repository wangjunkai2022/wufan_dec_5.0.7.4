package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class q0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ p0 f61588b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f61589c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(p0 p0Var, Object obj) {
        this.f61588b = p0Var;
        this.f61589c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PaySDKCaptureActivity paySDKCaptureActivity;
        PaySDKCaptureActivity paySDKCaptureActivity2;
        if (this.f61589c != null) {
            paySDKCaptureActivity = this.f61588b.f61582a;
            paySDKCaptureActivity.showToastInfo(this.f61589c.toString());
            paySDKCaptureActivity2 = this.f61588b.f61582a;
            paySDKCaptureActivity2.finish();
        }
    }
}
