package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: FightCreateServerDialog.java */
/* loaded from: classes4.dex */
public class q0 extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49607b;

    public q0(Context context, int i4) {
        super(context, i4);
        this.f49607b = context;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49607b).inflate(R.layout.dialog_fight_create_server, (ViewGroup) null);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(inflate);
    }

    public q0(Context context) {
        super(context);
        this.f49607b = context;
    }
}
