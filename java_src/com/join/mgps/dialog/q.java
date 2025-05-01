package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.pref.PrefDef_;
/* compiled from: BespeakTipDialog.java */
/* loaded from: classes4.dex */
public class q extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private View f49602b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49603c;

    /* renamed from: d  reason: collision with root package name */
    TextView f49604d;

    /* renamed from: e  reason: collision with root package name */
    PrefDef_ f49605e;

    /* renamed from: f  reason: collision with root package name */
    DomainInfoBean f49606f;

    public q(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(DomainInfoBean domainInfoBean, String str) {
        super.show();
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.flags = 2;
        attributes.dimAmount = 0.6f;
        window.setAttributes(attributes);
        this.f49606f = domainInfoBean;
        TextView textView = this.f49604d;
        if (textView != null) {
            textView.setText(str);
        }
        this.f49605e.lastShowBespeakTipTime().g(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            dismiss();
        } else if (id == R.id.tv_known) {
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_bespeak_tip);
        setCancelable(false);
        this.f49605e = new PrefDef_(getContext());
        this.f49602b = findViewById(R.id.iv_close);
        this.f49603c = (TextView) findViewById(R.id.tv_known);
        this.f49604d = (TextView) findViewById(R.id.tv_message);
        this.f49602b.setOnClickListener(this);
        this.f49603c.setOnClickListener(this);
    }
}
