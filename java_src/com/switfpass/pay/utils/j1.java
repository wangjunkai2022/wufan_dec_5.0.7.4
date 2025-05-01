package com.switfpass.pay.utils;

import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes5.dex */
final class j1 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ PopupWindow f61892b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(PopupWindow popupWindow) {
        this.f61892b = popupWindow;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f61892b.dismiss();
    }
}
