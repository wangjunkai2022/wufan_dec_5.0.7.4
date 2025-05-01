package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;
/* compiled from: ChangeNameDialog.java */
/* loaded from: classes4.dex */
public class r extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private c f49619b;

    /* renamed from: c  reason: collision with root package name */
    private Context f49620c;

    /* renamed from: d  reason: collision with root package name */
    private String f49621d;

    /* renamed from: e  reason: collision with root package name */
    private EditText f49622e;

    /* compiled from: ChangeNameDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String trim = r.this.f49622e.getText().toString().trim();
            int length = trim.length();
            if (!Pattern.matches("^[\\u4e00-\\u9fa5a-zA-Z0-9_]*$", trim)) {
                com.join.mgps.Util.l2.a(r.this.f49620c).b("用户名为中文/字母/数字/下划线,请检查后重新输入");
            } else if (length < 1 || length > 12) {
                com.join.mgps.Util.l2.a(r.this.f49620c).b("用户名为1~12个字符，请检查后重新输入");
            } else if (!com.join.mgps.Util.g2.j(trim) || trim.length() != 11) {
                r.this.f49619b.k(trim);
                r.this.dismiss();
            } else {
                com.join.mgps.Util.l2.a(r.this.f49620c).b("为保护你的信息安全，用户名不能类似手机号哦");
            }
        }
    }

    /* compiled from: ChangeNameDialog.java */
    /* loaded from: classes4.dex */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ((InputMethodManager) r.this.f49622e.getContext().getSystemService("input_method")).showSoftInput(r.this.f49622e, 0);
        }
    }

    /* compiled from: ChangeNameDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void k(String str);
    }

    public r(Context context) {
        super(context);
        this.f49622e = null;
        this.f49620c = context;
    }

    public void d(c cVar) {
        this.f49619b = cVar;
    }

    public void e(String str) {
        this.f49621d = str;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.change_name_dialog_layout);
        this.f49622e = (EditText) findViewById(R.id.name);
        TextView textView = (TextView) findViewById(R.id.changeNickNameNotice);
        this.f49622e.setText(this.f49621d);
        ((TextView) findViewById(R.id.savebutn)).setOnClickListener(new a());
        this.f49622e.setFocusableInTouchMode(true);
        this.f49622e.requestFocus();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        new Timer().schedule(new b(), 400L);
    }

    public r(Context context, int i4) {
        super(context, i4);
        this.f49622e = null;
        this.f49620c = context;
    }

    protected r(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49622e = null;
        this.f49620c = context;
    }
}
