package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: PaiWeiRuleDialog.java */
/* loaded from: classes4.dex */
public class v1 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49712b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f49713c;

    /* renamed from: d  reason: collision with root package name */
    private b f49714d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49715e;

    /* compiled from: PaiWeiRuleDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (v1.this.f49714d != null) {
                v1.this.f49714d.a(v1.this);
            } else {
                v1.this.dismiss();
            }
        }
    }

    /* compiled from: PaiWeiRuleDialog.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(v1 v1Var);

        void b(v1 v1Var);
    }

    public v1(Context context) {
        super(context);
        this.f49715e = false;
    }

    public v1 b(boolean z4) {
        setCancelable(z4);
        return this;
    }

    public v1 c(b bVar) {
        this.f49714d = bVar;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(this.f49715e);
        setContentView(R.layout.paiwei_rule_dialog);
        this.f49712b = (TextView) findViewById(R.id.paiwei_rule_tv);
        ImageView imageView = (ImageView) findViewById(R.id.paiwei_cancel_iv);
        this.f49713c = imageView;
        imageView.setOnClickListener(new a());
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0 && this.f49715e) {
            dismiss();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public v1(Context context, int i4) {
        super(context, i4);
        this.f49715e = false;
    }

    protected v1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49715e = false;
    }
}
