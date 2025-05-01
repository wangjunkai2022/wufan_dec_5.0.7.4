package com.switfpass.pay.activity;

import android.content.DialogInterface;
/* loaded from: classes5.dex */
final class m implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ l f61576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(l lVar) {
        this.f61576b = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        QrcodeActivity qrcodeActivity;
        QrcodeActivity qrcodeActivity2;
        qrcodeActivity = this.f61576b.f61573b;
        com.switfpass.pay.handle.a.b(0, 1, QrcodeActivity.e(qrcodeActivity));
        qrcodeActivity2 = this.f61576b.f61573b;
        qrcodeActivity2.finish();
    }
}
