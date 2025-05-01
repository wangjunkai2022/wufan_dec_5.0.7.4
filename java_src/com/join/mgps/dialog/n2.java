package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import java.util.List;
/* compiled from: UploadSlotTipDialog.java */
/* loaded from: classes4.dex */
public class n2 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f49555b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49556c;

    public n2(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(List<String> list) {
        show();
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(str);
            }
            this.f49556c.setText(sb);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.iv_close) {
            dismiss();
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_upload_slot_tip);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49555b = (ImageView) findViewById(R.id.iv_close);
        this.f49556c = (TextView) findViewById(R.id.tv_sub_title);
        this.f49555b.setOnClickListener(this);
    }
}
