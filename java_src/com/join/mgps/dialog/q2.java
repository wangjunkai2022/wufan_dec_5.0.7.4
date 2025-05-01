package com.join.mgps.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
/* compiled from: WhiteBackDialogDialog.java */
/* loaded from: classes4.dex */
public class q2 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    Activity f49613b;

    /* renamed from: c  reason: collision with root package name */
    TextView f49614c;

    /* renamed from: d  reason: collision with root package name */
    c f49615d;

    /* renamed from: e  reason: collision with root package name */
    TextView f49616e;

    /* compiled from: WhiteBackDialogDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q2.this.dismiss();
        }
    }

    /* compiled from: WhiteBackDialogDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q2.this.f49615d.a();
            q2.this.dismiss();
        }
    }

    /* compiled from: WhiteBackDialogDialog.java */
    /* loaded from: classes4.dex */
    public interface c {
        void a();
    }

    public q2(Activity activity, c cVar) {
        super(activity, R.style.MyDialog);
        this.f49613b = activity;
        this.f49615d = cVar;
    }

    public void a(String str) {
        this.f49616e.setText(str);
    }

    public void b(String str) {
        this.f49614c.setText(str);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        requestWindowFeature(-1);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(this.f49613b).inflate(R.layout.white_back_dialog, (ViewGroup) null);
        inflate.setMinimumWidth(com.join.android.app.common.utils.n.n(this.f49613b).B(this.f49613b));
        TextView textView = (TextView) inflate.findViewById(R.id.tip_title);
        this.f49616e = (TextView) inflate.findViewById(R.id.content);
        ((TextView) inflate.findViewById(R.id.dialog_button_cancel)).setOnClickListener(new a());
        ((TextView) inflate.findViewById(R.id.dialog_button_ok)).setOnClickListener(new b());
        setContentView(inflate);
    }
}
