package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: NameCheckDiaog.java */
/* loaded from: classes4.dex */
public class r1 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private Context f49634b;

    public r1(Context context) {
        super(context);
        this.f49634b = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.name_check);
    }

    protected r1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49634b = context;
    }

    public r1(Context context, int i4) {
        super(context, i4);
        this.f49634b = context;
    }
}
