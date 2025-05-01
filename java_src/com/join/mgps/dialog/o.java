package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: BackupFinishDialog.java */
/* loaded from: classes4.dex */
public class o extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    int f49557b;

    /* compiled from: BackupFinishDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.dismiss();
        }
    }

    public o(Context context) {
        super(context);
        this.f49557b = 0;
    }

    public void a(int i4) {
        this.f49557b = i4;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setContentView(R.layout.backups_notice_dialog);
        ((TextView) findViewById(R.id.tip_title)).setText("本地游戏恢复");
        ((TextView) findViewById(R.id.dialog_content)).setText("悟饭猴从本地恢复了" + this.f49557b + "款游戏到“我的>游戏”中!");
        ((Button) findViewById(R.id.dialog_button_ok)).setOnClickListener(new a());
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0) {
            dismiss();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public o(Context context, int i4, int i5) {
        super(context, i4);
        this.f49557b = 0;
        this.f49557b = i5;
    }

    protected o(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49557b = 0;
    }
}
