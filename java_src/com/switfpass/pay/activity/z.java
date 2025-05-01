package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class z implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ BasePayActivity f61601b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f61602c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(BasePayActivity basePayActivity, int i4) {
        this.f61601b = basePayActivity;
        this.f61602c = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.switfpass.pay.utils.e0 e0Var = new com.switfpass.pay.utils.e0();
        BasePayActivity basePayActivity = this.f61601b;
        e0Var.a(basePayActivity, basePayActivity.getString(this.f61602c));
    }
}
