package com.alipay.sdk.auth;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class h implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f4776b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.f4776b = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        AuthActivity.this.f4760f = true;
        this.f4776b.f4774b.proceed();
        dialogInterface.dismiss();
    }
}
