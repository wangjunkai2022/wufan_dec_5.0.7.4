package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.FightWifiInputDialogActivity_;
/* compiled from: WifiFightServerDisconnectDialog.java */
/* loaded from: classes4.dex */
public class t2 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49687b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f49688c;

    /* renamed from: d  reason: collision with root package name */
    Button f49689d;

    /* compiled from: WifiFightServerDisconnectDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t2.this.dismiss();
        }
    }

    /* compiled from: WifiFightServerDisconnectDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FightWifiInputDialogActivity_.i0(t2.this.f49687b).startForResult(9001);
            t2.this.dismiss();
        }
    }

    public t2(Context context, int i4) {
        super(context, i4);
        this.f49687b = context;
    }

    public void a(int i4) {
        this.f49688c.setVisibility(i4);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49687b).inflate(R.layout.dialog_fight_server_disconnect, (ViewGroup) null);
        this.f49688c = (ImageView) inflate.findViewById(R.id.cancel);
        this.f49689d = (Button) inflate.findViewById(R.id.reJoin);
        this.f49688c.setOnClickListener(new a());
        this.f49689d.setOnClickListener(new b());
        setContentView(inflate);
    }

    public t2(Context context) {
        super(context);
        this.f49687b = context;
    }
}
