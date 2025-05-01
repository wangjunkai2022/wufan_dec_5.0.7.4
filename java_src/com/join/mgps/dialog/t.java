package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
/* compiled from: ChoiceDefautGBAPlugDialog.java */
/* loaded from: classes4.dex */
public class t extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private e f49661b;

    /* renamed from: c  reason: collision with root package name */
    private Context f49662c;

    /* renamed from: d  reason: collision with root package name */
    private CheckBox f49663d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f49664e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f49665f;

    /* compiled from: ChoiceDefautGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f49663d.setChecked(true);
            com.papa.sim.statistic.pref.b.k(t.this.f49662c).H(0);
            t.this.dismiss();
        }
    }

    /* compiled from: ChoiceDefautGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.pref.b.k(t.this.f49662c).H(1);
            t.this.f49664e.setChecked(true);
            t.this.dismiss();
        }
    }

    /* compiled from: ChoiceDefautGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.pref.b.k(t.this.f49662c).H(2);
            t.this.f49665f.setChecked(true);
            t.this.dismiss();
        }
    }

    /* compiled from: ChoiceDefautGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(8);
            intentDateBean.setLink_type_val("79707");
            IntentUtil.getInstance().intentActivity(t.this.f49662c, intentDateBean);
        }
    }

    /* compiled from: ChoiceDefautGBAPlugDialog.java */
    /* loaded from: classes4.dex */
    public interface e {
        void a(int i4);
    }

    public t(Context context) {
        super(context);
        this.f49662c = context;
    }

    public void e(e eVar) {
        this.f49661b = eVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gbaplug_choice_dialog_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.showdialog);
        ((TextView) findViewById(R.id.titleText)).setText("请选择默认启动插件");
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new a());
        ((LinearLayout) findViewById(R.id.newGBAOlug)).setOnClickListener(new b());
        ((LinearLayout) findViewById(R.id.oldGBAPlug)).setOnClickListener(new c());
        ((LinearLayout) findViewById(R.id.why)).setOnClickListener(new d());
        this.f49663d = (CheckBox) findViewById(R.id.showdialogPlug);
        this.f49664e = (CheckBox) findViewById(R.id.gbaNewPlug);
        this.f49665f = (CheckBox) findViewById(R.id.gbaOld);
        this.f49663d.setChecked(false);
        this.f49664e.setChecked(false);
        this.f49665f.setChecked(false);
        int n4 = com.papa.sim.statistic.pref.b.k(this.f49662c).n();
        if (n4 == 0) {
            this.f49663d.setChecked(true);
        } else if (n4 == 1) {
            this.f49664e.setChecked(true);
        } else if (n4 != 2) {
        } else {
            this.f49665f.setChecked(true);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f49663d.setChecked(false);
        this.f49664e.setChecked(false);
        this.f49665f.setChecked(false);
        int n4 = com.papa.sim.statistic.pref.b.k(this.f49662c).n();
        if (n4 == 0) {
            this.f49663d.setChecked(true);
        } else if (n4 == 1) {
            this.f49664e.setChecked(true);
        } else if (n4 != 2) {
        } else {
            this.f49665f.setChecked(true);
        }
    }

    public t(Context context, int i4) {
        super(context, i4);
        this.f49662c = context;
    }

    protected t(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49662c = context;
    }
}
