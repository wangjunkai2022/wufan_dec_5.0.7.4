package com.alipay.sdk.auth;

import android.content.DialogInterface;
/* loaded from: classes2.dex */
final class i implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f4777b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar) {
        this.f4777b = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        String str;
        this.f4777b.f4774b.cancel();
        AuthActivity.this.f4760f = false;
        StringBuilder sb = new StringBuilder();
        str = AuthActivity.this.f4757c;
        sb.append(str);
        sb.append("?resultCode=150");
        j.d(AuthActivity.this, sb.toString());
        AuthActivity.this.finish();
    }
}
