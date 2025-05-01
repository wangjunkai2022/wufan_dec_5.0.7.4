package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: HideAppConfirmPwdDialog.java */
/* loaded from: classes4.dex */
public class a1 extends Dialog implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    String f49241b;

    /* renamed from: c  reason: collision with root package name */
    boolean f49242c;

    /* renamed from: d  reason: collision with root package name */
    private a f49243d;

    /* compiled from: HideAppConfirmPwdDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void reset();
    }

    public a1(@NonNull Context context, String str, boolean z4) {
        super(context);
        this.f49241b = str;
        this.f49242c = z4;
    }

    public void a(a aVar) {
        this.f49243d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        dismiss();
        if (view.getId() == R.id.tvReset) {
            a aVar2 = this.f49243d;
            if (aVar2 != null) {
                aVar2.reset();
            }
        } else if (view.getId() != R.id.tvConfirm || (aVar = this.f49243d) == null) {
        } else {
            aVar.a(this.f49241b);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_hide_app_confirm_pwd);
        TextView textView = (TextView) findViewById(R.id.tvTitle);
        if (this.f49242c) {
            textView.setText("温馨提示");
        }
        TextView textView2 = (TextView) findViewById(R.id.tvPwd);
        if (this.f49242c) {
            textView2.setText("确定解除伪装状态吗？");
            if (Build.VERSION.SDK_INT >= 21) {
                textView2.setLetterSpacing(0.1f);
            }
        } else {
            textView2.setText(this.f49241b);
        }
        TextView textView3 = (TextView) findViewById(R.id.tvReset);
        textView3.setOnClickListener(this);
        if (this.f49242c) {
            textView3.setText("再想想");
        }
        TextView textView4 = (TextView) findViewById(R.id.tvConfirm);
        textView4.setOnClickListener(this);
        if (this.f49242c) {
            textView4.setText("确定");
        }
    }
}
