package com.join.mgps.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: CopyDialog.java */
/* loaded from: classes4.dex */
public class c0 extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49289b;

    public c0(@NonNull Context context) {
        super(context);
    }

    public void a(View.OnClickListener onClickListener) {
        this.f49289b.setOnClickListener(onClickListener);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_copy_view);
        this.f49289b = (TextView) findViewById(R.id.copyTv);
    }

    public c0(Context context, int i4) {
        super(context, i4);
    }
}
