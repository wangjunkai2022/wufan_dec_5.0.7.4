package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: ApkInstallGuideDialog.java */
/* loaded from: classes4.dex */
public class d extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49298b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49299c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49300d;

    /* renamed from: e  reason: collision with root package name */
    w1.c f49301e;

    public d(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public w1.c a() {
        return this.f49301e;
    }

    public void b(w1.c cVar) {
        this.f49301e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_opt_left) {
            w1.c cVar = this.f49301e;
            if (cVar != null) {
                cVar.onClickCancle();
            }
            dismiss();
        } else if (id == R.id.tv_opt_right) {
            w1.c cVar2 = this.f49301e;
            if (cVar2 != null) {
                cVar2.onClickOk();
            }
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_apk_install_guide);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49298b = (TextView) findViewById(R.id.tv_opt_left);
        this.f49299c = (TextView) findViewById(R.id.tv_opt_right);
        this.f49300d = (TextView) findViewById(R.id.tv_sub_title);
        this.f49298b.setOnClickListener(this);
        this.f49299c.setOnClickListener(this);
        if (MApplication.f1497x.getActivity() != null && MApplication.f1497x.getActivity().getRequestedOrientation() == 0) {
            this.f49300d.setText(Html.fromHtml(getContext().getResources().getString(R.string.str_install_apk_tip_h)));
        } else {
            this.f49300d.setText(Html.fromHtml(getContext().getResources().getString(R.string.str_install_apk_tip_v)));
        }
    }
}
