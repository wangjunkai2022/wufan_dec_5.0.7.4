package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: FightDisconnectDialog2.java */
/* loaded from: classes4.dex */
public class s0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49648b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49649c;

    /* renamed from: d  reason: collision with root package name */
    Button f49650d;

    /* renamed from: e  reason: collision with root package name */
    Button f49651e;

    public s0(Context context, int i4) {
        super(context, i4);
        this.f49648b = context;
    }

    public void a(View.OnClickListener onClickListener) {
        this.f49650d.setOnClickListener(onClickListener);
    }

    public void b(String str) {
        this.f49649c.setText(str);
    }

    public void c(View.OnClickListener onClickListener) {
        this.f49651e.setOnClickListener(onClickListener);
    }

    public void d(String str) {
        this.f49651e.setText(str);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49648b).inflate(R.layout.dialog_invite_fight_error, (ViewGroup) null);
        this.f49649c = (TextView) inflate.findViewById(R.id.info);
        this.f49650d = (Button) inflate.findViewById(R.id.cancel);
        this.f49651e = (Button) inflate.findViewById(R.id.rebuild);
        setContentView(inflate);
    }

    public s0(Context context) {
        super(context);
        this.f49648b = context;
    }
}
