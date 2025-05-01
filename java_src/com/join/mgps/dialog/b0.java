package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: CompressProgressDialog.java */
/* loaded from: classes4.dex */
public class b0 extends AlertDialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    ProgressBar f49263b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49264c;

    /* renamed from: d  reason: collision with root package name */
    private String f49265d;

    public b0(@NonNull Context context) {
        super(context, R.style.Dialog);
    }

    public void a(String str) {
        super.show();
        this.f49265d = str;
        this.f49263b.setProgress(0);
        TextView textView = this.f49264c;
        textView.setText(str + "压缩中(0%),请耐心等待...");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_compress_progress);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        this.f49263b = (ProgressBar) findViewById(R.id.pb_loading);
        this.f49264c = (TextView) findViewById(R.id.tv_progress_status);
    }

    public void update(int i4) {
        this.f49263b.setProgress(i4);
        TextView textView = this.f49264c;
        textView.setText("压缩中(" + i4 + "%),请耐心等待...");
    }
}
