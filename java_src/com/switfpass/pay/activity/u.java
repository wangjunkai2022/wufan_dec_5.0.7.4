package com.switfpass.pay.activity;

import android.os.CountDownTimer;
/* loaded from: classes5.dex */
final class u extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ QrcodeActivity f61594a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(QrcodeActivity qrcodeActivity) {
        super(120000L, 2000L);
        this.f61594a = qrcodeActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f61594a.runOnUiThread(new v(this));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j4) {
        if (QrcodeActivity.e(this.f61594a) != null) {
            QrcodeActivity qrcodeActivity = this.f61594a;
            QrcodeActivity.a(qrcodeActivity, QrcodeActivity.e(qrcodeActivity).v(), QrcodeActivity.e(this.f61594a).e());
        }
    }
}
