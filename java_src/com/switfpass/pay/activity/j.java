package com.switfpass.pay.activity;

import android.content.DialogInterface;
/* loaded from: classes5.dex */
final class j implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ QrcodeActivity f61570b;

    j(QrcodeActivity qrcodeActivity) {
        this.f61570b = qrcodeActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        com.switfpass.pay.handle.a.b(0, 1, QrcodeActivity.e(this.f61570b));
        this.f61570b.finish();
    }
}
