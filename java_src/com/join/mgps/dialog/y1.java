package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.posting.PostingActivity;
/* compiled from: PrePostingHintDialog.java */
/* loaded from: classes4.dex */
public class y1 {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f49830a;

    /* renamed from: b  reason: collision with root package name */
    private PostingActivity.m f49831b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrePostingHintDialog.java */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f49832b;

        a(int i4) {
            this.f49832b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y1.this.f49831b.b(this.f49832b);
            y1.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrePostingHintDialog.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f49834b;

        b(int i4) {
            this.f49834b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y1.this.f49831b.e(this.f49834b);
            y1.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrePostingHintDialog.java */
    /* loaded from: classes4.dex */
    public class c implements DialogInterface.OnKeyListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                y1.this.f49831b.e(-1);
                y1.this.f49830a.dismiss();
                return false;
            }
            return false;
        }
    }

    public y1(Activity activity, PostingActivity.m mVar, int i4, String... strArr) {
        this.f49831b = mVar;
        d(activity, i4, strArr);
    }

    public void c() {
        this.f49830a.dismiss();
    }

    void d(Activity activity, int i4, String... strArr) {
        Dialog dialog = new Dialog(activity, R.style.newtrans_floating_dialog);
        this.f49830a = dialog;
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            this.f49830a.getWindow().setAttributes(attributes);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_pre_posting_hint, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) inflate.findViewById(R.id.dialog_button_ok);
        ((TextView) inflate.findViewById(R.id.tip_title)).setText(strArr[0]);
        ((TextView) inflate.findViewById(R.id.dialog_content)).setText(strArr[1]);
        if (strArr.length == 3) {
            button.setVisibility(8);
            button2.setText(strArr[2]);
        } else {
            button.setText(strArr[2]);
            button2.setText(strArr[3]);
        }
        button.setOnClickListener(new a(i4));
        button2.setOnClickListener(new b(i4));
        this.f49830a.setContentView(inflate);
        this.f49830a.setCancelable(false);
        this.f49830a.setOnKeyListener(new c());
        Window window = this.f49830a.getWindow();
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.width = -1;
        attributes2.height = -2;
        window.setGravity(17);
    }

    public void e() {
        if (this.f49830a.isShowing()) {
            return;
        }
        this.f49830a.show();
    }
}
