package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CloudShareDialog.java */
/* loaded from: classes4.dex */
public class a0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49225b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49226c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49227d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49228e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49229f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49230g;

    /* renamed from: h  reason: collision with root package name */
    String f49231h;

    /* renamed from: i  reason: collision with root package name */
    String f49232i;

    /* renamed from: j  reason: collision with root package name */
    String f49233j;

    /* renamed from: k  reason: collision with root package name */
    String f49234k;

    /* renamed from: l  reason: collision with root package name */
    String f49235l;

    /* renamed from: m  reason: collision with root package name */
    c f49236m;

    /* renamed from: n  reason: collision with root package name */
    c f49237n;

    /* renamed from: o  reason: collision with root package name */
    CompoundButton.OnCheckedChangeListener f49238o;

    /* compiled from: CloudShareDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a0 a0Var = a0.this;
            a0Var.f49236m.a(a0Var);
        }
    }

    /* compiled from: CloudShareDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a0 a0Var = a0.this;
            a0Var.f49237n.a(a0Var);
        }
    }

    /* compiled from: CloudShareDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(a0 a0Var);
    }

    public a0(Context context) {
        super(context);
        this.f49225b = context;
    }

    public String a() {
        return this.f49229f.getText().toString();
    }

    public a0 b(c cVar) {
        this.f49237n = cVar;
        return this;
    }

    public a0 c(String str) {
        this.f49234k = str;
        return this;
    }

    public a0 d(String str) {
        this.f49233j = str;
        return this;
    }

    public a0 e(String str) {
        this.f49235l = str;
        return this;
    }

    public a0 f(c cVar) {
        this.f49236m = cVar;
        return this;
    }

    public a0 g(String str) {
        this.f49231h = str;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f49225b).inflate(R.layout.dialog_cloud_share, (ViewGroup) null));
        this.f49228e = (TextView) findViewById(R.id.ok);
        setCancelable(false);
        this.f49226c = (TextView) findViewById(R.id.cancle);
        this.f49229f = (TextView) findViewById(R.id.name);
        this.f49230g = (TextView) findViewById(R.id.content);
        this.f49227d = (TextView) findViewById(R.id.number);
        this.f49229f.setText(this.f49232i);
        this.f49230g.setText(this.f49233j);
        this.f49227d.setText(this.f49235l);
        this.f49228e.setText(this.f49231h);
        this.f49228e.setOnClickListener(new a());
        this.f49226c.setText(this.f49234k);
        this.f49226c.setOnClickListener(new b());
    }

    protected a0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49225b = context;
    }

    public a0(Context context, int i4) {
        super(context, i4);
        this.f49225b = context;
    }
}
