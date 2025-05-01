package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: FightDisconnectDialog.java */
/* loaded from: classes4.dex */
public class r0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49625b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49626c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49627d;

    /* renamed from: e  reason: collision with root package name */
    Button f49628e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f49629f;

    /* renamed from: g  reason: collision with root package name */
    Button f49630g;

    /* renamed from: h  reason: collision with root package name */
    TextView f49631h;

    /* compiled from: FightDisconnectDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r0.this.dismiss();
        }
    }

    /* compiled from: FightDisconnectDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r0.this.dismiss();
        }
    }

    public r0(Context context, int i4) {
        super(context, i4);
        this.f49625b = context;
    }

    public void a(int i4) {
        this.f49629f.setVisibility(i4);
    }

    public void b(View.OnClickListener onClickListener) {
        this.f49629f.setOnClickListener(onClickListener);
    }

    public void c(int i4) {
        this.f49630g.setVisibility(i4);
    }

    public void d(View.OnClickListener onClickListener) {
        this.f49630g.setOnClickListener(onClickListener);
    }

    public void e(String str) {
        this.f49630g.setText(str);
    }

    public void f(String str) {
        this.f49627d.setText(str);
    }

    public void g(int i4) {
        this.f49628e.setVisibility(i4);
    }

    public void h(View.OnClickListener onClickListener) {
        this.f49628e.setOnClickListener(onClickListener);
    }

    public void i(String str) {
        this.f49631h.setText(str);
    }

    public void j(String str) {
        com.join.mgps.Util.v0.g("title--------" + this.f49626c);
        this.f49626c.setText(str);
    }

    public void k(int i4) {
        this.f49628e.setVisibility(i4);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49625b).inflate(R.layout.dialog_fight_disconnect, (ViewGroup) null);
        this.f49626c = (TextView) inflate.findViewById(R.id.title);
        this.f49627d = (TextView) inflate.findViewById(R.id.info);
        this.f49628e = (Button) inflate.findViewById(R.id.research);
        this.f49629f = (ImageView) inflate.findViewById(R.id.back);
        this.f49630g = (Button) inflate.findViewById(R.id.cancel);
        this.f49631h = (TextView) inflate.findViewById(R.id.research);
        inflate.findViewById(R.id.cancel).setOnClickListener(new a());
        inflate.findViewById(R.id.back).setOnClickListener(new b());
        setContentView(inflate);
    }

    public r0(Context context) {
        super(context);
        this.f49625b = context;
    }
}
