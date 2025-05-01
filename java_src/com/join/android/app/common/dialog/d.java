package com.join.android.app.common.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.papa.sim.statistic.p;
import com.umeng.analytics.MobclickAgent;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: AddShortcutResultDialog.java */
/* loaded from: classes3.dex */
public class d extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private ImageView f14566b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f14567c;

    /* renamed from: d  reason: collision with root package name */
    private Context f14568d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14569e;

    /* renamed from: f  reason: collision with root package name */
    private String f14570f;

    /* compiled from: AddShortcutResultDialog.java */
    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.dismiss();
        }
    }

    /* compiled from: AddShortcutResultDialog.java */
    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.dismiss();
            if (d.this.f14569e) {
                return;
            }
            d.this.f14569e = true;
            MApplication.Y = true;
            new com.join.android.app.common.utils.k(d.this.f14568d).n();
            p.l(d.this.f14568d).p("clickAuthButton", "0", AccountUtil_.getInstance_(d.this.f14568d).getUid());
            MobclickAgent.onEvent(d.this.f14568d, "clickAuthButton");
        }
    }

    public d(@NonNull Context context) {
        super(context);
        this.f14569e = false;
        this.f14570f = "0";
        this.f14568d = context;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_add_shortcut_result_view);
        this.f14566b = (ImageView) findViewById(R.id.shortcutCloseIv);
        this.f14567c = (TextView) findViewById(R.id.shortcutCreateTv);
        MobclickAgent.onEvent(this.f14568d, "showGuideAddIconModal");
        p.l(this.f14568d).p("showGuideAddIconModal", this.f14570f, AccountUtil_.getInstance_(this.f14568d).getUid());
        this.f14566b.setOnClickListener(new a());
        this.f14567c.setOnClickListener(new b());
    }

    public d(@NonNull Context context, String str) {
        super(context);
        this.f14569e = false;
        this.f14570f = "0";
        this.f14568d = context;
        this.f14570f = str;
    }
}
