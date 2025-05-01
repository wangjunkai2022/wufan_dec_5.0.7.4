package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
/* compiled from: SimpleAlertDialog.java */
/* loaded from: classes4.dex */
public class z1 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49846b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49847c;

    /* renamed from: d  reason: collision with root package name */
    private Button f49848d;

    /* renamed from: e  reason: collision with root package name */
    private View f49849e;

    /* renamed from: f  reason: collision with root package name */
    private CheckBox f49850f;

    /* renamed from: g  reason: collision with root package name */
    private String f49851g;

    /* renamed from: h  reason: collision with root package name */
    private String f49852h;

    /* renamed from: i  reason: collision with root package name */
    private String f49853i;

    /* renamed from: j  reason: collision with root package name */
    private String f49854j;

    /* renamed from: k  reason: collision with root package name */
    private b f49855k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f49856l;

    /* renamed from: m  reason: collision with root package name */
    private int f49857m;

    /* renamed from: n  reason: collision with root package name */
    private int f49858n;

    /* compiled from: SimpleAlertDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (z1.this.f49855k != null) {
                z1.this.f49855k.b(z1.this);
                return;
            }
            z1.this.dismiss();
            IntentUtil.getInstance().goLogin(view.getContext());
        }
    }

    /* compiled from: SimpleAlertDialog.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(z1 z1Var);

        void b(z1 z1Var);
    }

    public z1(Context context) {
        super(context);
        this.f49851g = "提示";
        this.f49852h = "登陆后，开始悟饭游戏的精彩旅游";
        this.f49853i = "登陆";
        this.f49854j = "现在不";
        this.f49856l = false;
        this.f49858n = 8;
    }

    public int b() {
        return this.f49857m;
    }

    public boolean c() {
        return this.f49850f.isChecked();
    }

    public z1 d(String str) {
        this.f49854j = str;
        return this;
    }

    public z1 e(int i4) {
        this.f49857m = i4;
        return this;
    }

    public z1 f(int i4) {
        this.f49858n = i4;
        return this;
    }

    public z1 g(String str) {
        this.f49852h = str;
        return this;
    }

    public z1 h(boolean z4) {
        setCancelable(z4);
        return this;
    }

    public z1 i(b bVar) {
        this.f49855k = bVar;
        return this;
    }

    public z1 j(String str) {
        this.f49853i = str;
        return this;
    }

    public z1 k(String str) {
        this.f49851g = str;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(this.f49856l);
        setContentView(R.layout.layout_simple_alert_dialog);
        this.f49850f = (CheckBox) findViewById(R.id.dialogCb);
        this.f49846b = (TextView) findViewById(R.id.tip_title);
        this.f49847c = (TextView) findViewById(R.id.dialog_content);
        this.f49848d = (Button) findViewById(R.id.dialog_button_ok);
        this.f49849e = findViewById(R.id.middle);
        this.f49847c.setText(this.f49852h);
        this.f49848d.setText(this.f49853i);
        this.f49850f.setVisibility(this.f49858n);
        this.f49846b.setText(this.f49851g);
        int i4 = this.f49857m;
        if (i4 != 0) {
            this.f49849e.setVisibility(i4);
            ViewGroup.LayoutParams layoutParams = this.f49848d.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wdp15);
                ((LinearLayout.LayoutParams) layoutParams).setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.f49848d.setLayoutParams(layoutParams);
            }
            this.f49848d.setMaxWidth(getContext().getResources().getDimensionPixelSize(R.dimen.wdp50));
        }
        this.f49848d.setOnClickListener(new a());
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0 && this.f49856l) {
            dismiss();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public z1(Context context, int i4) {
        super(context, i4);
        this.f49851g = "提示";
        this.f49852h = "登陆后，开始悟饭游戏的精彩旅游";
        this.f49853i = "登陆";
        this.f49854j = "现在不";
        this.f49856l = false;
        this.f49858n = 8;
    }

    protected z1(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49851g = "提示";
        this.f49852h = "登陆后，开始悟饭游戏的精彩旅游";
        this.f49853i = "登陆";
        this.f49854j = "现在不";
        this.f49856l = false;
        this.f49858n = 8;
    }
}
