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
/* compiled from: CloudNoticeVipDialog.java */
/* loaded from: classes4.dex */
public class y extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Context f49796b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49797c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49798d;

    /* renamed from: e  reason: collision with root package name */
    CheckBox f49799e;

    /* renamed from: f  reason: collision with root package name */
    TextView f49800f;

    /* renamed from: g  reason: collision with root package name */
    TextView f49801g;

    /* renamed from: h  reason: collision with root package name */
    TextView f49802h;

    /* renamed from: i  reason: collision with root package name */
    String f49803i;

    /* renamed from: j  reason: collision with root package name */
    String f49804j;

    /* renamed from: k  reason: collision with root package name */
    String f49805k;

    /* renamed from: l  reason: collision with root package name */
    String f49806l;

    /* renamed from: m  reason: collision with root package name */
    e f49807m;

    /* renamed from: n  reason: collision with root package name */
    e f49808n;

    /* renamed from: o  reason: collision with root package name */
    e f49809o;

    /* renamed from: p  reason: collision with root package name */
    CompoundButton.OnCheckedChangeListener f49810p;

    /* renamed from: q  reason: collision with root package name */
    boolean f49811q;

    /* compiled from: CloudNoticeVipDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y.this.dismiss();
        }
    }

    /* compiled from: CloudNoticeVipDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y yVar = y.this;
            yVar.f49807m.a(yVar);
        }
    }

    /* compiled from: CloudNoticeVipDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y yVar = y.this;
            yVar.f49808n.a(yVar);
        }
    }

    /* compiled from: CloudNoticeVipDialog.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y yVar = y.this;
            e eVar = yVar.f49809o;
            if (eVar != null) {
                eVar.a(yVar);
            }
        }
    }

    /* compiled from: CloudNoticeVipDialog.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a(y yVar);
    }

    public y(Context context) {
        super(context);
        this.f49811q = false;
        this.f49796b = context;
    }

    public y a(e eVar) {
        this.f49808n = eVar;
        return this;
    }

    public y b(String str) {
        this.f49806l = str;
        return this;
    }

    public y c(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f49810p = onCheckedChangeListener;
        return this;
    }

    public y d(String str) {
        this.f49805k = str;
        return this;
    }

    public y e(e eVar) {
        this.f49807m = eVar;
        return this;
    }

    public y f(String str) {
        this.f49803i = str;
        return this;
    }

    public y g(String str) {
        this.f49804j = str;
        return this;
    }

    public y h(boolean z4) {
        this.f49811q = z4;
        return this;
    }

    public y i(e eVar) {
        this.f49809o = eVar;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setContentView(LayoutInflater.from(this.f49796b).inflate(R.layout.dialog_cloud_notice_vip, (ViewGroup) null), new ViewGroup.LayoutParams(com.join.android.app.common.utils.n.n(this.f49796b).B((Activity) this.f49796b), com.join.android.app.common.utils.n.n(this.f49796b).k((Activity) this.f49796b)));
        this.f49800f = (TextView) findViewById(R.id.ok);
        this.f49798d = (TextView) findViewById(R.id.tv_vip);
        this.f49797c = (TextView) findViewById(R.id.cancle);
        this.f49801g = (TextView) findViewById(R.id.title);
        this.f49802h = (TextView) findViewById(R.id.content);
        this.f49799e = (CheckBox) findViewById(R.id.checkBox);
        ((ImageView) findViewById(R.id.close)).setOnClickListener(new a());
        this.f49801g.setText(this.f49804j);
        this.f49802h.setText(this.f49805k);
        this.f49800f.setText(this.f49803i);
        this.f49800f.setOnClickListener(new b());
        this.f49797c.setText(this.f49806l);
        this.f49797c.setOnClickListener(new c());
        this.f49798d.setOnClickListener(new d());
        if (this.f49811q) {
            this.f49798d.setVisibility(8);
        } else {
            this.f49798d.setVisibility(8);
        }
        this.f49799e.setOnCheckedChangeListener(this.f49810p);
    }

    protected y(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49811q = false;
        this.f49796b = context;
    }

    public y(Context context, int i4) {
        super(context, i4);
        this.f49811q = false;
        this.f49796b = context;
    }
}
