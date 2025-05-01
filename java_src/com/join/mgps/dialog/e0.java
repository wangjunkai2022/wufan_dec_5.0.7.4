package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.pref.PrefDef_;
import com.papa91.arc.interfaces.DialogListenerWrap;
import java.util.ArrayList;
/* compiled from: CreateEndGameGuideDialog.java */
/* loaded from: classes4.dex */
public class e0 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private View f49334b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49335c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49336d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49337e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f49338f;

    /* renamed from: g  reason: collision with root package name */
    private DialogListenerWrap f49339g;

    /* renamed from: h  reason: collision with root package name */
    PrefDef_ f49340h;

    /* compiled from: CreateEndGameGuideDialog.java */
    /* loaded from: classes4.dex */
    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            e0.this.f49340h.showGuideCreateEndGame().g(Boolean.valueOf(!z4));
        }
    }

    public e0(@NonNull Context context) {
        super(context, R.style.Dialog);
        this.f49340h = new PrefDef_(context);
    }

    public void a(DialogListenerWrap dialogListenerWrap) {
        this.f49339g = dialogListenerWrap;
    }

    public void b(ArrayList<GameMainV4DataBean.CreateEndgameHintBean> arrayList) {
        GameMainV4DataBean.CreateEndgameHintBean createEndgameHintBean;
        GameMainV4DataBean.CreateEndgameHintBean createEndgameHintBean2;
        show();
        if (arrayList != null) {
            if (arrayList.size() > 0 && this.f49336d != null && (createEndgameHintBean2 = arrayList.get(0)) != null) {
                this.f49336d.setText(createEndgameHintBean2.getSubTitle());
            }
            if (arrayList.size() <= 1 || this.f49337e == null || (createEndgameHintBean = arrayList.get(1)) == null) {
                return;
            }
            this.f49337e.setText(createEndgameHintBean.getSubTitle());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.tv_know) {
            if (id == R.id.iv_close) {
                dismiss();
                return;
            }
            return;
        }
        DialogListenerWrap dialogListenerWrap = this.f49339g;
        if (dialogListenerWrap != null) {
            dialogListenerWrap.onConfirm();
        }
        dismiss();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_create_end_game_guide);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49334b = findViewById(R.id.iv_close);
        this.f49335c = (TextView) findViewById(R.id.tv_know);
        this.f49338f = (CheckBox) findViewById(R.id.checkBox);
        this.f49336d = (TextView) findViewById(R.id.tv_title);
        this.f49337e = (TextView) findViewById(R.id.tv_sub_title);
        this.f49338f.setOnCheckedChangeListener(new a());
        this.f49334b.setOnClickListener(this);
        this.f49335c.setOnClickListener(this);
    }
}
