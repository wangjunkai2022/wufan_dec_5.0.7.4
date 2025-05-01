package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
/* compiled from: FightWifiErrorDialog.java */
/* loaded from: classes4.dex */
public class u0 extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49693b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49694c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49695d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f49696e;

    /* renamed from: f  reason: collision with root package name */
    Button f49697f;

    /* compiled from: FightWifiErrorDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            u0.this.dismiss();
        }
    }

    /* compiled from: FightWifiErrorDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UtilsMy.w3(u0.this.f49693b);
            u0.this.dismiss();
        }
    }

    public u0(Context context, int i4) {
        super(context, i4);
        this.f49693b = context;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this.f49693b).inflate(R.layout.dialog_fight_wifi_error, (ViewGroup) null);
        this.f49694c = (TextView) inflate.findViewById(R.id.title);
        this.f49695d = (TextView) inflate.findViewById(R.id.info);
        this.f49696e = (ImageView) inflate.findViewById(R.id.cancel);
        this.f49697f = (Button) inflate.findViewById(R.id.setting);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setContentView(inflate);
        this.f49696e.setOnClickListener(new a());
        this.f49697f.setOnClickListener(new b());
    }

    public u0(Context context) {
        super(context);
        this.f49693b = context;
    }
}
