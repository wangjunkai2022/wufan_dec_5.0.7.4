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
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: DownloadBottomDialog.java */
/* loaded from: classes4.dex */
public class g0 extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49406b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49407c;

    /* renamed from: d  reason: collision with root package name */
    private int f49408d;

    public g0(@NonNull Context context) {
        super(context);
        this.f49408d = 0;
    }

    public void a(View.OnClickListener onClickListener) {
        this.f49406b.setOnClickListener(onClickListener);
    }

    public void b(View.OnClickListener onClickListener) {
        this.f49407c.setOnClickListener(onClickListener);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Window window = getWindow();
        window.setWindowAnimations(R.style.PopupAnimation_100);
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(80);
        setContentView(R.layout.dialog_download_bottom_view);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f49406b = (TextView) findViewById(R.id.downloadDialogOneTv);
        this.f49407c = (TextView) findViewById(R.id.downloadDialogTwoTv);
    }
}
