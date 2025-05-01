package com.switfpass.pay.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h1 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ l f61886b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f61887c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(l lVar, int i4) {
        this.f61886b = lVar;
        this.f61887c = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        i iVar;
        i iVar2;
        this.f61886b.dismiss();
        int i4 = this.f61887c;
        if (i4 == 6) {
            context = this.f61886b.f61903b;
            ((Activity) context).finish();
        } else if (i4 == 10) {
            iVar = this.f61886b.f61911j;
            iVar.cancel();
        } else if (i4 != 12) {
        } else {
            this.f61886b.dismiss();
            this.f61886b.cancel();
            iVar2 = this.f61886b.f61911j;
            iVar2.cancel();
        }
    }
}
