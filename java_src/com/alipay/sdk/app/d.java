package com.alipay.sdk.app;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class d implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f4709b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar) {
        this.f4709b = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        this.f4709b.f4708c.f4702b = true;
        this.f4709b.f4707b.proceed();
        dialogInterface.dismiss();
    }
}
