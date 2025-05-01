package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.papa91.arc.interfaces.DialogListenerWrap;
/* compiled from: SystemTipDialog.java */
/* loaded from: classes4.dex */
public class h2 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f49432b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49433c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f49434d;

    /* renamed from: e  reason: collision with root package name */
    private DialogListenerWrap f49435e;

    public h2(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(DialogListenerWrap dialogListenerWrap) {
        this.f49435e = dialogListenerWrap;
    }

    public void b(String str) {
        show();
        this.f49433c.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            DialogListenerWrap dialogListenerWrap = this.f49435e;
            if (dialogListenerWrap != null) {
                dialogListenerWrap.onClose();
            }
            dismiss();
        } else if (id == R.id.tv_known) {
            DialogListenerWrap dialogListenerWrap2 = this.f49435e;
            if (dialogListenerWrap2 != null) {
                dialogListenerWrap2.onConfirm();
            }
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_system_tip);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49432b = (ImageView) findViewById(R.id.iv_close);
        this.f49433c = (TextView) findViewById(R.id.tv_content);
        this.f49434d = (TextView) findViewById(R.id.tv_known);
        this.f49432b.setOnClickListener(this);
        this.f49434d.setOnClickListener(this);
    }
}
