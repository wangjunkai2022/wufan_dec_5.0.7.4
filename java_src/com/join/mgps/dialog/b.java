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
/* compiled from: AccountLoginDialog.java */
/* loaded from: classes4.dex */
public class b extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private TextView f49247b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49248c;

    /* renamed from: d  reason: collision with root package name */
    private Button f49249d;

    /* renamed from: e  reason: collision with root package name */
    private Button f49250e;

    /* renamed from: f  reason: collision with root package name */
    private View f49251f;

    /* renamed from: g  reason: collision with root package name */
    private CheckBox f49252g;

    /* renamed from: h  reason: collision with root package name */
    private String f49253h;

    /* renamed from: i  reason: collision with root package name */
    private String f49254i;

    /* renamed from: j  reason: collision with root package name */
    private String f49255j;

    /* renamed from: k  reason: collision with root package name */
    private String f49256k;

    /* renamed from: l  reason: collision with root package name */
    private c f49257l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f49258m;

    /* renamed from: n  reason: collision with root package name */
    private int f49259n;

    /* renamed from: o  reason: collision with root package name */
    private int f49260o;

    /* compiled from: AccountLoginDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f49257l != null) {
                b.this.f49257l.ClickCancleButn(b.this);
            } else {
                b.this.dismiss();
            }
        }
    }

    /* compiled from: AccountLoginDialog.java */
    /* renamed from: com.join.mgps.dialog.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class View$OnClickListenerC0364b implements View.OnClickListener {
        View$OnClickListenerC0364b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f49257l != null) {
                b.this.f49257l.ClickOKButn(b.this);
                return;
            }
            b.this.dismiss();
            IntentUtil.getInstance().goLogin(view.getContext());
        }
    }

    /* compiled from: AccountLoginDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void ClickCancleButn(b bVar);

        void ClickOKButn(b bVar);
    }

    public b(Context context) {
        super(context);
        this.f49253h = "提示";
        this.f49254i = "登陆后，开始悟饭游戏的精彩旅游";
        this.f49255j = "登陆";
        this.f49256k = "现在不";
        this.f49258m = false;
        this.f49260o = 8;
    }

    public int b() {
        return this.f49259n;
    }

    public boolean c() {
        return this.f49252g.isChecked();
    }

    public b d(String str) {
        this.f49256k = str;
        return this;
    }

    public b e(int i4) {
        this.f49259n = i4;
        return this;
    }

    public b f(int i4) {
        this.f49260o = i4;
        return this;
    }

    public b g(String str) {
        this.f49254i = str;
        return this;
    }

    public b h(boolean z4) {
        setCancelable(z4);
        return this;
    }

    public b i(c cVar) {
        this.f49257l = cVar;
        return this;
    }

    public b j(String str) {
        this.f49255j = str;
        return this;
    }

    public b k(String str) {
        this.f49253h = str;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(this.f49258m);
        setContentView(R.layout.accountlogin_notice_dialog);
        this.f49252g = (CheckBox) findViewById(R.id.dialogCb);
        this.f49247b = (TextView) findViewById(R.id.tip_title);
        this.f49248c = (TextView) findViewById(R.id.dialog_content);
        this.f49249d = (Button) findViewById(R.id.dialog_button_ok);
        this.f49250e = (Button) findViewById(R.id.dialog_button_cancle);
        this.f49251f = findViewById(R.id.middle);
        this.f49250e.setText(this.f49256k);
        this.f49248c.setText(this.f49254i);
        this.f49249d.setText(this.f49255j);
        this.f49252g.setVisibility(this.f49260o);
        this.f49247b.setText(this.f49253h);
        int i4 = this.f49259n;
        if (i4 != 0) {
            this.f49250e.setVisibility(i4);
            this.f49251f.setVisibility(this.f49259n);
            ViewGroup.LayoutParams layoutParams = this.f49249d.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wdp15);
                ((LinearLayout.LayoutParams) layoutParams).setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.f49249d.setLayoutParams(layoutParams);
            }
            this.f49249d.setMaxWidth(getContext().getResources().getDimensionPixelSize(R.dimen.wdp50));
        }
        this.f49250e.setOnClickListener(new a());
        this.f49249d.setOnClickListener(new View$OnClickListenerC0364b());
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0 && this.f49258m) {
            dismiss();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public b(Context context, int i4) {
        super(context, i4);
        this.f49253h = "提示";
        this.f49254i = "登陆后，开始悟饭游戏的精彩旅游";
        this.f49255j = "登陆";
        this.f49256k = "现在不";
        this.f49258m = false;
        this.f49260o = 8;
    }

    protected b(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49253h = "提示";
        this.f49254i = "登陆后，开始悟饭游戏的精彩旅游";
        this.f49255j = "登陆";
        this.f49256k = "现在不";
        this.f49258m = false;
        this.f49260o = 8;
    }
}
