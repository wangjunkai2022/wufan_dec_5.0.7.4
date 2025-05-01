package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.NewArenaMainActivty_;
/* compiled from: ArenaNoRecordDialog.java */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f49496a;

    /* renamed from: b  reason: collision with root package name */
    Activity f49497b;

    /* renamed from: c  reason: collision with root package name */
    View f49498c;

    /* renamed from: d  reason: collision with root package name */
    View f49499d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49500e;

    public m(Activity activity) {
        this.f49497b = activity;
        d(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        c();
        ((NewArenaMainActivty_.h) NewArenaMainActivty_.g1(view.getContext()).flags(TTAdConstant.KEY_CLICK_AREA)).start();
    }

    public void c() {
        this.f49496a.dismiss();
    }

    void d(Activity activity) {
        this.f49496a = new Dialog(activity, R.style.newtrans_floating_dialog);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_arena_no_record, (ViewGroup) null);
        inflate.findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.this.e(view);
            }
        });
        this.f49498c = inflate.findViewById(R.id.noRecord);
        this.f49500e = (TextView) inflate.findViewById(R.id.tv_top);
        View findViewById = inflate.findViewById(R.id.tv2);
        this.f49499d = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.dialog.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.this.f(view);
            }
        });
        this.f49496a.setContentView(inflate);
        Window window = this.f49496a.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setGravity(17);
    }

    public void g() {
        if (this.f49496a.isShowing()) {
            return;
        }
        this.f49496a.show();
    }
}
