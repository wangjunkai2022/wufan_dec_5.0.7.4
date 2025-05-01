package com.alipay.sdk.auth;
/* loaded from: classes2.dex */
final class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthActivity f4773b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(AuthActivity authActivity) {
        this.f4773b = authActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AuthActivity.p(this.f4773b);
    }
}
