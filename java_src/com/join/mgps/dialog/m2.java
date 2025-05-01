package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.papa91.arc.interfaces.DialogListenerWrap;
/* compiled from: UploadProgressDialog.java */
/* loaded from: classes4.dex */
public class m2 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49515b;

    /* renamed from: c  reason: collision with root package name */
    private DialogListenerWrap f49516c;

    /* renamed from: d  reason: collision with root package name */
    private String f49517d;

    public m2(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(DialogListenerWrap dialogListenerWrap) {
        this.f49516c = dialogListenerWrap;
    }

    public void b(String str) {
        show();
        this.f49517d = str;
        TextView textView = this.f49515b;
        textView.setText(str + "上传中(0%)\n请耐心等待");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            dismiss();
        } else if (id == R.id.tv_commit) {
            DialogListenerWrap dialogListenerWrap = this.f49516c;
            if (dialogListenerWrap != null) {
                dialogListenerWrap.onConfirm();
            }
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_upload_progress);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49515b = (TextView) findViewById(R.id.tv_progress_status);
    }

    public void update(int i4) {
        TextView textView = this.f49515b;
        textView.setText(this.f49517d + "上传中(" + i4 + "%)\n请耐心等待");
    }
}
