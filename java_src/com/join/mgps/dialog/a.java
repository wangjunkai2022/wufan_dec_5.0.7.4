package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: APFightClientLoadingDialog.java */
/* loaded from: classes4.dex */
public class a extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49223b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49224c;

    public a(Context context, int i4) {
        super(context, i4);
        this.f49223b = context;
    }

    public void a(String str) {
        TextView textView = this.f49224c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49223b).inflate(R.layout.dialog_fight_connect_server, (ViewGroup) null);
        this.f49224c = (TextView) inflate.findViewById(R.id.hint);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(inflate);
    }

    public a(Context context) {
        super(context);
        this.f49223b = context;
    }
}
