package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.ModFeedbackBean;
/* compiled from: ModRewardDialog.java */
/* loaded from: classes4.dex */
public class p1 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private String f49587b;

    /* renamed from: c  reason: collision with root package name */
    private String f49588c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49589d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f49590e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f49591f;

    /* renamed from: g  reason: collision with root package name */
    private ModFeedbackBean f49592g;

    public p1(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    private void c(String str) {
        ((ClipboardManager) getContext().getSystemService("clipboard")).setText(str.trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        com.join.mgps.Util.b0.f0(getContext()).U(getContext(), this.f49588c, this.f49587b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        com.join.mgps.Util.b0.f0(getContext()).U(getContext(), this.f49588c, this.f49587b);
    }

    public void f(String str, String str2, ModFeedbackBean modFeedbackBean) {
        super.show();
        this.f49588c = str;
        this.f49587b = str2;
        this.f49592g = modFeedbackBean;
        if (modFeedbackBean != null) {
            this.f49589d.setText(modFeedbackBean.getTitle());
            this.f49590e.setText(modFeedbackBean.getContent());
            this.f49591f.setText(modFeedbackBean.getBtn_title());
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (isShowing()) {
            new Handler().postDelayed(new Runnable() { // from class: com.join.mgps.dialog.o1
                @Override // java.lang.Runnable
                public final void run() {
                    p1.this.d();
                }
            }, 200L);
        }
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ModFeedbackBean modFeedbackBean;
        int id = view.getId();
        if (id == R.id.close) {
            dismiss();
            new Handler().postDelayed(new Runnable() { // from class: com.join.mgps.dialog.n1
                @Override // java.lang.Runnable
                public final void run() {
                    p1.this.e();
                }
            }, 200L);
        } else if (id != R.id.launch || (modFeedbackBean = this.f49592g) == null) {
        } else {
            c(modFeedbackBean.getWx_num());
            com.join.mgps.Util.l2.a(getContext()).b("客服微信已复制");
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_mod_reward);
        setCanceledOnTouchOutside(false);
        this.f49589d = (TextView) findViewById(R.id.tv_title);
        this.f49590e = (TextView) findViewById(R.id.tv_content);
        this.f49591f = (TextView) findViewById(R.id.launch);
        findViewById(R.id.close).setOnClickListener(this);
        findViewById(R.id.launch).setOnClickListener(this);
    }
}
