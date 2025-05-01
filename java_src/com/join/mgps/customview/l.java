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
/* compiled from: MessageDialog1.java */
/* loaded from: classes4.dex */
public class l extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f48552b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f48553c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f48554d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48555e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f48556f;

    /* renamed from: g  reason: collision with root package name */
    private Button f48557g;

    /* renamed from: h  reason: collision with root package name */
    private Button f48558h;

    /* renamed from: i  reason: collision with root package name */
    private Button f48559i;

    /* renamed from: j  reason: collision with root package name */
    private String f48560j;

    /* compiled from: MessageDialog1.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
        }
    }

    /* compiled from: MessageDialog1.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.this.dismiss();
        }
    }

    public l(@NonNull Context context) {
        super(context, R.style.MyDialog);
        this.f48560j = "";
    }

    public void a(View.OnClickListener onClickListener) {
        this.f48554d.setOnClickListener(onClickListener);
    }

    public void b(String str) {
        this.f48560j = str;
        TextView textView = this.f48553c;
        textView.setText("（1）创建热点，设置名称为\"" + str + "\"；");
        this.f48555e.setText("（2）设置密码为\"12345678\"；");
    }

    public void c(String str) {
        this.f48560j = str;
        this.f48554d.setVisibility(8);
        TextView textView = this.f48553c;
        textView.setText("（1）寻找名称以\"" + str + "\"开头的热点；");
        this.f48555e.setText("（2）加入密码为\"12345678\"；");
        this.f48556f.setText("（3）连接热点后，返回悟饭游戏厅（请确保本机热点处于关闭状态）。");
    }

    public void d(View.OnClickListener onClickListener) {
        e("", onClickListener);
    }

    public void e(String str, View.OnClickListener onClickListener) {
        this.f48557g.setOnClickListener(onClickListener);
        if (g2.h(str)) {
            return;
        }
        this.f48557g.setText(str);
    }

    public void f(String str) {
        this.f48552b.setText(str);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_message_view1);
        this.f48552b = (TextView) findViewById(R.id.dialogMessageTitleTx);
        this.f48553c = (TextView) findViewById(R.id.dialogMessagOneTx);
        this.f48554d = (TextView) findViewById(R.id.dialogMessagCopyTx);
        this.f48555e = (TextView) findViewById(R.id.dialogMessagTwoTx);
        this.f48556f = (TextView) findViewById(R.id.dialogMessagThreeTx);
        this.f48557g = (Button) findViewById(R.id.dialogMessagBt);
        this.f48558h = (Button) findViewById(R.id.dialogMessagCloseBt);
        Button button = (Button) findViewById(R.id.dialog_button_cancle);
        this.f48559i = button;
        button.setOnClickListener(new a());
        this.f48554d.getPaint().setFlags(8);
        Button button2 = this.f48558h;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
    }
}
