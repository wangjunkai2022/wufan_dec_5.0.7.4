package com.switfpass.pay.activity;

import android.view.View;
/* loaded from: classes5.dex */
final class c0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ PayPlugin f61555b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(PayPlugin payPlugin) {
        this.f61555b = payPlugin;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new e0(this.f61555b).execute(new Void[0]);
    }
}
