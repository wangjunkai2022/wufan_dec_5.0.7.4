package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CloudNoticeDialog.java */
/* loaded from: classes4.dex */
public class w extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49717b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49718c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49719d;

    /* renamed from: e  reason: collision with root package name */
    CheckBox f49720e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49721f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49722g;

    /* renamed from: h  reason: collision with root package name */
    TextView f49723h;

    /* renamed from: i  reason: collision with root package name */
    String f49724i;

    /* renamed from: j  reason: collision with root package name */
    String f49725j;

    /* renamed from: k  reason: collision with root package name */
    String f49726k;

    /* renamed from: l  reason: collision with root package name */
    String f49727l;

    /* renamed from: m  reason: collision with root package name */
    e f49728m;

    /* renamed from: n  reason: collision with root package name */
    e f49729n;

    /* renamed from: o  reason: collision with root package name */
    e f49730o;

    /* renamed from: p  reason: collision with root package name */
    CompoundButton.OnCheckedChangeListener f49731p;

    /* renamed from: q  reason: collision with root package name */
    boolean f49732q;

    /* compiled from: CloudNoticeDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.dismiss();
        }
    }

    /* compiled from: CloudNoticeDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w wVar = w.this;
            wVar.f49728m.a(wVar);
        }
    }

    /* compiled from: CloudNoticeDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w wVar = w.this;
            wVar.f49729n.a(wVar);
        }
    }

    /* compiled from: CloudNoticeDialog.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w wVar = w.this;
            e eVar = wVar.f49730o;
            if (eVar != null) {
                eVar.a(wVar);
            }
        }
    }

    /* compiled from: CloudNoticeDialog.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a(w wVar);
    }

    public w(Context context) {
        super(context);
        this.f49732q = false;
        this.f49717b = context;
    }

    public w a(e eVar) {
        this.f49729n = eVar;
        return this;
    }

    public w b(String str) {
        this.f49727l = str;
        return this;
    }

    public w c(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f49731p = onCheckedChangeListener;
        return this;
    }

    public w d(String str) {
        this.f49726k = str;
        return this;
    }

    public w e(e eVar) {
        this.f49728m = eVar;
        return this;
    }

    public w f(String str) {
        this.f49724i = str;
        return this;
    }

    public w g(String str) {
        this.f49725j = str;
        return this;
    }

    public w h(boolean z4) {
        this.f49732q = z4;
        return this;
    }

    public w i(e eVar) {
        this.f49730o = eVar;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setContentView(LayoutInflater.from(this.f49717b).inflate(R.layout.dialog_cloud_notice, (ViewGroup) null), new ViewGroup.LayoutParams(com.join.android.app.common.utils.n.n(this.f49717b).B((Activity) this.f49717b), com.join.android.app.common.utils.n.n(this.f49717b).k((Activity) this.f49717b)));
        this.f49721f = (TextView) findViewById(R.id.ok);
        this.f49719d = (TextView) findViewById(R.id.tv_vip);
        this.f49718c = (TextView) findViewById(R.id.cancle);
        this.f49722g = (TextView) findViewById(R.id.title);
        this.f49723h = (TextView) findViewById(R.id.content);
        this.f49720e = (CheckBox) findViewById(R.id.checkBox);
        ((ImageView) findViewById(R.id.close)).setOnClickListener(new a());
        this.f49722g.setText(this.f49725j);
        this.f49723h.setText(this.f49726k);
        this.f49721f.setText(this.f49724i);
        this.f49721f.setOnClickListener(new b());
        this.f49718c.setText(this.f49727l);
        this.f49718c.setOnClickListener(new c());
        this.f49719d.setOnClickListener(new d());
        if (this.f49732q) {
            this.f49719d.setVisibility(8);
        } else {
            this.f49719d.setVisibility(8);
        }
        this.f49720e.setOnCheckedChangeListener(this.f49731p);
    }

    protected w(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49732q = false;
        this.f49717b = context;
    }

    public w(Context context, int i4) {
        super(context, i4);
        this.f49732q = false;
        this.f49717b = context;
    }
}
