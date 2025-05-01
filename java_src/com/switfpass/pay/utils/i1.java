package com.switfpass.pay.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i1 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ l f61889b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f61890c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i1(l lVar, int i4) {
        this.f61889b = lVar;
        this.f61890c = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar;
        Context context;
        i iVar2;
        i iVar3;
        i iVar4;
        EditText editText;
        i iVar5;
        int i4 = this.f61890c;
        if (i4 != 0) {
            if (i4 == 1) {
                this.f61889b.dismiss();
                Toast.makeText(this.f61889b.getContext(), "提交成功!", 0).show();
                return;
            } else if (i4 == 3) {
                this.f61889b.dismiss();
                this.f61889b.cancel();
                iVar = this.f61889b.f61911j;
                iVar.a(null);
                return;
            } else if (i4 == 6) {
                context = this.f61889b.f61903b;
                ((Activity) context).finish();
                return;
            } else if (i4 == 12) {
                this.f61889b.dismiss();
                this.f61889b.cancel();
                iVar2 = this.f61889b.f61911j;
                iVar2.a(null);
                iVar3 = this.f61889b.f61911j;
                iVar3.cancel();
                return;
            } else if (i4 == 9) {
                this.f61889b.dismiss();
                this.f61889b.cancel();
                iVar4 = this.f61889b.f61911j;
                editText = this.f61889b.f61914m;
                iVar4.a(editText.getText().toString());
                return;
            } else if (i4 != 10) {
                return;
            } else {
                iVar5 = this.f61889b.f61911j;
                iVar5.a(null);
            }
        }
        this.f61889b.dismiss();
        this.f61889b.cancel();
    }
}
