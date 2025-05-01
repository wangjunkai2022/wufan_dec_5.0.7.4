package com.join.android.app.common.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: LocalGameTwoDialog.java */
/* loaded from: classes3.dex */
public class k extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private Button f14593b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f14594c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14595d;

    public k(@NonNull Context context) {
        super(context);
        this.f14595d = false;
    }

    public boolean a() {
        return this.f14595d;
    }

    public void b() {
        this.f14595d = false;
        this.f14593b.setBackgroundResource(R.drawable.selector_blue_dialog_bg);
        this.f14593b.setText("关闭");
    }

    public void c() {
        this.f14595d = true;
        this.f14593b.setBackgroundResource(R.drawable.selector_blue_dialog_bg);
        this.f14593b.setText("智能识别");
    }

    public void d(String str) {
        this.f14594c.setText(str);
    }

    public void e(View.OnClickListener onClickListener) {
        this.f14593b.setOnClickListener(onClickListener);
    }

    public void f(String str, View.OnClickListener onClickListener) {
        this.f14593b.setOnClickListener(onClickListener);
        this.f14593b.setText(str);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_localgame_two_view);
        this.f14593b = (Button) findViewById(R.id.localGameTwoBt);
        this.f14594c = (TextView) findViewById(R.id.localGameTwoContentTv);
    }
}
