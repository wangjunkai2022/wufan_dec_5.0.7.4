package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pref.PrefDef_;
/* compiled from: GprsChoiceDialog.java */
/* loaded from: classes4.dex */
public class y0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private Context f49816b;

    /* renamed from: c  reason: collision with root package name */
    private CheckBox f49817c;

    /* renamed from: d  reason: collision with root package name */
    private CheckBox f49818d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f49819e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f49820f;

    /* renamed from: g  reason: collision with root package name */
    private CheckBox f49821g;

    /* renamed from: h  reason: collision with root package name */
    private int f49822h;

    /* renamed from: i  reason: collision with root package name */
    private PrefDef_ f49823i;

    /* renamed from: j  reason: collision with root package name */
    private f f49824j;

    /* compiled from: GprsChoiceDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0.this.f49824j.b();
            y0.this.i();
            y0.this.f49817c.setChecked(true);
            y0.this.f49823i.gprsNoticeInfo().g(0);
            y0.this.dismiss();
        }
    }

    /* compiled from: GprsChoiceDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0.this.f49824j.d();
            y0.this.i();
            y0.this.f49818d.setChecked(true);
            y0.this.f49823i.gprsNoticeInfo().g(1);
            y0.this.dismiss();
        }
    }

    /* compiled from: GprsChoiceDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0.this.f49824j.c();
            y0.this.i();
            y0.this.f49819e.setChecked(true);
            y0.this.f49823i.gprsNoticeInfo().g(2);
            y0.this.dismiss();
        }
    }

    /* compiled from: GprsChoiceDialog.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0.this.f49824j.e();
            y0.this.i();
            y0.this.f49820f.setChecked(true);
            y0.this.f49823i.gprsNoticeInfo().g(3);
            y0.this.dismiss();
        }
    }

    /* compiled from: GprsChoiceDialog.java */
    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0.this.f49824j.a();
            y0.this.i();
            y0.this.f49821g.setChecked(true);
            y0.this.f49823i.gprsNoticeInfo().g(4);
            y0.this.dismiss();
        }
    }

    /* compiled from: GprsChoiceDialog.java */
    /* loaded from: classes4.dex */
    public interface f {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public y0(Context context) {
        super(context);
        this.f49816b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f49817c.setChecked(false);
        this.f49818d.setChecked(false);
        this.f49819e.setChecked(false);
        this.f49820f.setChecked(false);
        this.f49821g.setChecked(false);
    }

    public void j(f fVar) {
        this.f49824j = fVar;
    }

    public void k(PrefDef_ prefDef_) {
        this.f49823i = prefDef_;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gprs_choice_dialog_layout);
        this.f49817c = (CheckBox) findViewById(R.id.noticeallbox);
        this.f49818d = (CheckBox) findViewById(R.id.notice10box);
        this.f49819e = (CheckBox) findViewById(R.id.notice50box);
        this.f49820f = (CheckBox) findViewById(R.id.notice100box);
        this.f49821g = (CheckBox) findViewById(R.id.noticenobox);
        ((LinearLayout) findViewById(R.id.noticeall)).setOnClickListener(new a());
        ((LinearLayout) findViewById(R.id.notice10)).setOnClickListener(new b());
        ((LinearLayout) findViewById(R.id.notice50)).setOnClickListener(new c());
        ((LinearLayout) findViewById(R.id.notice100)).setOnClickListener(new d());
        ((LinearLayout) findViewById(R.id.noticeno)).setOnClickListener(new e());
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f49817c.setChecked(false);
        this.f49818d.setChecked(false);
        this.f49819e.setChecked(false);
        this.f49820f.setChecked(false);
        this.f49821g.setChecked(false);
        int intValue = this.f49823i.gprsNoticeInfo().d().intValue();
        this.f49822h = intValue;
        if (intValue == 0) {
            this.f49817c.setChecked(true);
        } else if (intValue == 1) {
            this.f49818d.setChecked(true);
        } else if (intValue == 2) {
            this.f49819e.setChecked(true);
        } else if (intValue == 3) {
            this.f49820f.setChecked(true);
        } else if (intValue != 4) {
        } else {
            this.f49821g.setChecked(true);
        }
    }

    public y0(Context context, int i4) {
        super(context, i4);
        this.f49816b = context;
    }

    protected y0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49816b = context;
    }
}
