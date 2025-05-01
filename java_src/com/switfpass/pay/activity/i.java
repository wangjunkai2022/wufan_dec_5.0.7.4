package com.switfpass.pay.activity;
/* loaded from: classes5.dex */
final class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ QrcodeActivity f61569b;

    i(QrcodeActivity qrcodeActivity) {
        this.f61569b = qrcodeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (QrcodeActivity.a(this.f61569b) <= 0 || QrcodeActivity.b(this.f61569b) == null) {
            QrcodeActivity.c(this.f61569b).removeCallbacks(this);
            if (QrcodeActivity.b(this.f61569b) != null && QrcodeActivity.b(this.f61569b).isShowing()) {
                QrcodeActivity.b(this.f61569b).dismiss();
            }
            QrcodeActivity.b(this.f61569b).h("确定(关闭)");
            this.f61569b.finish();
            return;
        }
        com.switfpass.pay.utils.l b5 = QrcodeActivity.b(this.f61569b);
        b5.h("确定(" + QrcodeActivity.a(this.f61569b) + "秒后关闭)");
        QrcodeActivity qrcodeActivity = this.f61569b;
        QrcodeActivity.a(qrcodeActivity, QrcodeActivity.a(qrcodeActivity) - 1);
        QrcodeActivity.c(this.f61569b).postDelayed(this, 1000L);
    }
}
