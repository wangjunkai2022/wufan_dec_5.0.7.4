package com.switfpass.pay.activity;

import android.view.View;
/* loaded from: classes5.dex */
final class f0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PayResultActivity f61565b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(PayResultActivity payResultActivity) {
        this.f61565b = payResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.switfpass.pay.handle.a.b(0, 0, 0);
        this.f61565b.finish();
    }
}
