package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: FightADDialog.java */
/* loaded from: classes4.dex */
public class n0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private SimpleDraweeView f49545b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f49546c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f49547d;

    /* renamed from: e  reason: collision with root package name */
    private String f49548e;

    /* renamed from: f  reason: collision with root package name */
    private String f49549f;

    /* renamed from: g  reason: collision with root package name */
    private c f49550g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f49551h;

    /* compiled from: FightADDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (n0.this.f49550g != null) {
                n0.this.f49550g.a(n0.this);
            } else {
                n0.this.dismiss();
            }
        }
    }

    /* compiled from: FightADDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (n0.this.f49550g != null) {
                n0.this.f49550g.b(n0.this);
            } else {
                n0.this.dismiss();
            }
        }
    }

    /* compiled from: FightADDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a(n0 n0Var);

        void b(n0 n0Var);
    }

    public n0(Context context) {
        super(context);
        this.f49551h = false;
    }

    public n0 b(boolean z4) {
        setCancelable(z4);
        return this;
    }

    public n0 c(c cVar) {
        this.f49550g = cVar;
        return this;
    }

    public n0 d(String str) {
        this.f49548e = str;
        return this;
    }

    public n0 e(String str) {
        this.f49549f = str;
        return this;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(this.f49551h);
        setContentView(R.layout.fight_ad_dialog);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        this.f49545b = (SimpleDraweeView) findViewById(R.id.ad_iv_icon);
        this.f49546c = (TextView) findViewById(R.id.ad_title_tv);
        this.f49547d = (ImageView) findViewById(R.id.ad_cancel_iv);
        this.f49546c.setText(this.f49549f);
        MyImageLoader.d(this.f49545b, R.drawable.iv_default_newarena_item, this.f49548e);
        this.f49547d.setOnClickListener(new a());
        this.f49545b.setOnClickListener(new b());
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0 && this.f49551h) {
            dismiss();
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public n0(Context context, int i4) {
        super(context, i4);
        this.f49551h = false;
    }

    protected n0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49551h = false;
    }
}
