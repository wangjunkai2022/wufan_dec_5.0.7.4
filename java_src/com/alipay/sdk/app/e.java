package com.alipay.sdk.app;

import android.app.Activity;
import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class e implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f4710b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(c cVar) {
        this.f4710b = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        Activity activity;
        this.f4710b.f4707b.cancel();
        this.f4710b.f4708c.f4702b = false;
        h.f4713a = h.a();
        activity = this.f4710b.f4708c.f4701a;
        activity.finish();
    }
}
