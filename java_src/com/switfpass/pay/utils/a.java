package com.switfpass.pay.utils;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ d0 f61827b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ g0 f61828c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(d0 d0Var, g0 g0Var) {
        this.f61827b = d0Var;
        this.f61828c = g0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        this.f61827b.f61856s = false;
        g0 g0Var = this.f61828c;
        if (g0Var != null) {
            g0Var.dismiss();
        }
    }
}
