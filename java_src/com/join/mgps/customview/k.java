package com.join.mgps.customview;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: MessageDialog.java */
/* loaded from: classes4.dex */
public class k extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f48543b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f48544c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f48545d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48546e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f48547f;

    /* renamed from: g  reason: collision with root package name */
    private Button f48548g;

    /* renamed from: h  reason: collision with root package name */
    private Button f48549h;

    /* renamed from: i  reason: collision with root package name */
    private String f48550i;

    /* compiled from: MessageDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.dismiss();
        }
    }

    public k(@NonNull Context context) {
        super(context);
        this.f48550i = "";
    }

    public void a(View.OnClickListener onClickListener) {
        this.f48545d.setOnClickListener(onClickListener);
    }

    public void b(String str) {
        this.f48550i = str;
        TextView textView = this.f48544c;
        textView.setText("（1）创建热点，设置名称为\"" + str + "\"；");
        this.f48546e.setText("（2）设置密码为\"12345678\"；");
    }

    public void c(String str) {
        this.f48550i = str;
        this.f48545d.setVisibility(8);
        TextView textView = this.f48544c;
        textView.setText("（1）寻找名称以\"" + str + "\"开头的热点；");
        this.f48546e.setText("（2）加入密码为\"12345678\"；");
        this.f48547f.setText("（3）连接热点后，返回悟饭游戏厅（请确保本机热点处于关闭状态）。");
    }

    public void d(View.OnClickListener onClickListener) {
        e("", onClickListener);
    }

    public void e(String str, View.OnClickListener onClickListener) {
        this.f48548g.setOnClickListener(onClickListener);
        if (g2.h(str)) {
            return;
        }
        this.f48548g.setText(str);
    }

    public void f(String str) {
        this.f48543b.setText(str);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setLayout((int) getContext().getResources().getDimension(R.dimen.wdp915), (int) getContext().getResources().getDimension(R.dimen.wdp424));
        window.setGravity(17);
        setContentView(R.layout.dialog_message_view);
        this.f48543b = (TextView) findViewById(R.id.dialogMessageTitleTx);
        this.f48544c = (TextView) findViewById(R.id.dialogMessagOneTx);
        this.f48545d = (TextView) findViewById(R.id.dialogMessagCopyTx);
        this.f48546e = (TextView) findViewById(R.id.dialogMessagTwoTx);
        this.f48547f = (TextView) findViewById(R.id.dialogMessagThreeTx);
        this.f48548g = (Button) findViewById(R.id.dialogMessagBt);
        this.f48549h = (Button) findViewById(R.id.dialogMessagCloseBt);
        this.f48545d.getPaint().setFlags(8);
        this.f48549h.setOnClickListener(new a());
    }
}
